# 第五轮：Fastboot / ADB 调用链与 JNI 映射

本报告基于当前目录内 JADX Java 反编译源码、两套 SO 导出表、ARM64 机器码反汇编，以及 APK assets 二进制元数据。将“源码直接可见”与“推断”分开记录。

## 1. 核心结论

- APK 包含 ARM32 静态链接的 `assets/adb` 和 `assets/fastboot` 可执行程序，以及 `assets/scrcpy_server` APK。它们不是 `libadbhelper.so` 的动态依赖。
- Fastboot 数据桥在 Java 层有可读实现：`RunnableC0911g0` 创建本地 TCP `ServerSocket(5007)`，并把数据转交 USB Bulk OUT / IN 端点。
- ADB USB 桥采用另一条本地 TCP 端口 `5008`：`RunnableC0974s3` 接受本地 socket，再由 Native `C0979t3.m2631a` 循环处理数据。
- Remote/scrcpy 图像流使用端口 `5005`，`RemoteActivity` 通过 `adb forward tcp:5005 localabstract:scrcpy` 建立转发。
- 所以工程至少有三条本机 TCP 通道：5005 scrcpy、5007 fastboot USB transport、5008 ADB USB transport。
- 目前可恢复的关键协议胶水主要在 Java 源码；被剥离符号的 Native 库仍需逐函数还原，不能声称已经恢复了完整 C/C++ 源码。

## 2. Fastboot TCP ↔ USB 数据路径（源码直接可见）

### 2.1 本地 TCP 服务

`p080c/p113c/p114a/RunnableC0911g0.java` 的 `run()`：

1. 创建 `ServerSocket(5007)`，在 `FastbootActivity.f6410d0` 为 true 时接受本地客户端连接。
2. 从客户端读取 4 字节握手数据；完整读到 4 字节时，原样写回并 flush。
3. 后续读取 8 字节长度字段，使用 Java `ByteBuffer.wrap(...).getLong()` 解析长度（ByteBuffer 默认字节序为 BIG_ENDIAN）。
4. 按 USB OUT 端点最大包尺寸分块读取 payload；若未建立 `C0979t3` 对象则默认分块大小 512。
5. 每块通过 `C0979t3.m2632b(f4906b, payload, length)` 发送到 Bulk OUT 端点。
6. 命令首块以 `download:` 开头时，发送 Handler 消息并启用下载进度 UI。
7. 从 Bulk IN 端点读取设备回复（每次最多 64 字节，`bulkTransfer` 超时 1000ms），并调用 `FastbootActivity.m3021E(bytes,count)` 把回复交给 Native 层。

其中 `C0979t3` 构造函数按 USB endpoint 类型 2（bulk）枚举接口端点：direction=0 作为 OUT，非 0 作为 IN，并记录两个端点的 `getMaxPacketSize()`。

### 2.2 与内置 fastboot 程序对应

`assets/fastboot` 的字符串表包含以下可确认信息：
- `-s tcp|udp:HOST[:PORT]`：支持网络设备作为目标；
- `flash PARTITION [FILENAME]`、`getvar NAME`、`reboot [bootloader]`；
- `flashing lock|unlock`、`erase PARTITION` 等命令帮助文本；
- `No initialization message received` / `Unknown TCP protocol version` 等 Fastboot TCP 协议错误信息。

UI Java 代码还直接构造了这些 shell 命令：
- `fastboot flash <partition> "<image-file>"`（`ViewOnClickListenerC1157z`）；
- `fastboot getvar all;fastboot oem device-info`（`ViewOnClickListenerC0931k0`）；
- `fastboot reboot`（`ViewOnClickListenerC0946n0`）；
- `fastboot getvar serialno`（`RunnableC0919h3`）。

结合本地 5007 TCP listener 与 fastboot 客户端本身的 TCP transport 支持，可以高度确定 Fastboot 命令行客户端是通过本机 TCP 通道对接 USB Bulk 传输桥；但当前反编译文件里没有直接看到 Native 初始化时具体拼出的 `fastboot -s tcp:127.0.0.1:5007` 命令，故此字符串不作为源码已证实事实。

## 3. ADB USB ↔ 本地 TCP 数据路径（源码直接可见）

`RunnableC0889b3` 在 USB 设备连接准备完成后：
- 建立 `C0979t3(UsbDeviceConnection, UsbInterface)`；
- 将 `ConnectActivity` 保存到 `C0979t3.f4912h`；
- 记录 VID/PID、设备名、制造商、产品名、序列号，以及 Bulk OUT/IN 最大包大小；
- 对 VID=8921、PID=10089 设置 `f4917m=true`；
- 启动 `RunnableC0974s3` 线程，并把传输对象保存到 `MyApplication.f6475b`。

`RunnableC0974s3`：
1. 创建 `ServerSocket(5008)`；
2. 启动 Native `RunnableC0969r3.run()` 线程；
3. 接受本地 socket 客户端并保存 InputStream / OutputStream；
4. 循环调用 `C0979t3.m2631a(c0979t3)`，直到 `f4918n` 为 true；
5. 异常时调用 `m2634d()` 做清理，并写入错误日志。

因此 `C0979t3` 是 ADB USB 与 Fastboot USB 两条路径共享的底层 USB 传输对象；不同业务通过不同本地端口和 Native 方法组合使用它。

## 4. scrcpy 单独通道

`RemoteActivity` 可见命令：`forward tcp:5005 localabstract:scrcpy`。`RunnableC0954o3` 连接 `127.0.0.1:5005`，读取 4 字节分辨率数据，随后交给 scrcpy 解码/渲染组件。此通道与 5007、5008 的 USB 命令桥不同。

## 5. JNI 函数映射与尺寸

地址/大小取自 `nm -D -S --defined-only` 对 ARM64 和 ARM32 SO 的导出表。函数大小是机器码长度，不代表源码行数或业务复杂度。

### 5.1 FastbootActivity：19 个导出函数

| Java 声明 | JNI 导出符号后缀 | ARM64 字节 | ARM32 字节 | 目前能确认的语义 |
|---|---|---:|---:|---|
| `FastbootActivity$RunnableC1318a.run()` | `FastbootActivity_00024a_run__` | 996 | 740 | 内部 Runnable，确切业务仍待还原 |
| `FastbootActivity$C1319b.run()` | `FastbootActivity_00024b_run__` | 3420 | 2752 | 持有 UsbDevice 的线程；很可能参与 USB 设备打开流程 |
| `FastbootActivity$RunnableC1320c.run()` | `FastbootActivity_00024c_run__` | 1380 | 1080 | 内部 Runnable，确切业务仍待还原 |
| `FastbootActivity$C1321d.onReceive(Context,Intent)` | `FastbootActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` | 11348 | 8828 | USB 广播接收器；精确事件分支仍待还原 |
| `FastbootActivity$HandlerC1322e.handleMessage(Message)` | `FastbootActivity_00024e_handleMessage__Landroid_os_Message_2` | 6872 | 6036 | UI Handler；消息语义需结合 native 代码继续确认 |
| `FastbootActivity.m3017A()` | `FastbootActivity_A__` | 4168 | 3500 | 被点击监听器及回车键监听器调用，属于命令提交入口 |
| `FastbootActivity.m3018B(UsbDevice)` | `FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2` | 1176 | 940 | native 布尔设备处理/判断函数；具体条件待确认 |
| `FastbootActivity.m3019C()` | `FastbootActivity_C__` | 1628 | 1308 | 清空日志按钮调用，关联日志/控制台清理 |
| `FastbootActivity.m3020D()` | `FastbootActivity_D__` | 5944 | 4904 | 设置开关保存后调用；精确行为待确认 |
| `FastbootActivity.m3021E(byte[],int)` | `FastbootActivity_E___3BI` | 1692 | 1344 | USB IN 数据回调；由 5007 转发线程收到设备响应后调用 |
| `FastbootActivity.onActivityResult(int,int,Intent)` | `FastbootActivity_onActivityResult__IILandroid_content_Intent_2` | 716 | 576 | Activity 回调 |
| `FastbootActivity.onCreateOptionsMenu(Menu)` | `FastbootActivity_onCreateOptionsMenu__Landroid_view_Menu_2` | 916 | 708 | 菜单初始化 |
| `FastbootActivity.onCreate(Bundle)` | `FastbootActivity_onCreate__Landroid_os_Bundle_2` | 21432 | 18036 | Activity 初始化；体积最大之一 |
| `FastbootActivity.onDestroy()` | `FastbootActivity_onDestroy__` | 1132 | 876 | Activity 清理 |
| `FastbootActivity.onOptionsItemSelected(MenuItem)` | `FastbootActivity_onOptionsItemSelected__Landroid_view_MenuItem_2` | 6808 | 5688 | 菜单事件 |
| `FastbootActivity.onRequestPermissionsResult(int,String[],int[])` | `FastbootActivity_onRequestPermissionsResult__I_3Ljava_lang_String_2_3I` | 580 | 436 | 运行时权限结果 |
| `FastbootActivity.m3016x(FastbootActivity,UsbDevice,UsbInterface)` | `FastbootActivity_x__Lcom_didjdk_adbhelper_FastbootActivity_2Landroid_hardware_usb_UsbDevice_2Landroid_hardware_usb_UsbInterface_2` | 3180 | 2560 | 静态 USB 接口识别/筛选入口（根据参数与用途推断） |
| `FastbootActivity.m3022y(UsbDevice)` | `FastbootActivity_y__Landroid_hardware_usb_UsbDevice_2` | 580 | 476 | USB 设备处理入口；具体行为待确认 |
| `FastbootActivity.m3023z(String,int)` | `FastbootActivity_z__Ljava_lang_String_2I` | 1088 | 812 | 生成 SpannableString；界面命令/文本着色 |

### 5.2 C0979t3：9 个导出函数

| Java 声明 | JNI 导出符号后缀 | ARM64 字节 | ARM32 字节 | 目前能确认的语义 |
|---|---|---:|---:|---|
| `C0979t3.m2631a(C0979t3)` | `c_c_a_t3_a__Lc_c_a_t3_2` | 5952 | 4824 | 5008 服务循环里被重复调用；ADB USB 双向传输处理核心 |
| `C0979t3.m2632b(UsbEndpoint,byte[],int)` | `c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI` | 1548 | 1216 | 5007 Fastboot 转发线程调用；向 Bulk OUT 端点写数据 |
| `C0979t3.m2633c()` | `c_c_a_t3_c__` | 1332 | 1040 | 在 Java 侧未找到直接调用；待确认 |
| `C0979t3.m2634d()` | `c_c_a_t3_d__` | 15560 | 12456 | 5008 socket 线程异常时调用，属于连接清理路径 |
| `C0979t3.m2635e()` | `c_c_a_t3_e__` | 7324 | 6096 | 在 Java 侧未找到直接调用；待确认 |
| `C0979t3.m2636f(String)` | `c_c_a_t3_f__Ljava_lang_String_2` | 688 | 476 | USB 连接初始化时写入设备信息和端点信息，属于日志输出 |
| `C0979t3.m2637g(String,ByteBuffer)` | `c_c_a_t3_g__Ljava_lang_String_2Ljava_nio_ByteBuffer_2` | 1660 | 1212 | 在 Java 侧未找到直接调用；待确认 |
| `C0979t3.m2638h(byte[])` | `c_c_a_t3_h___3B` | 1060 | 784 | 在 Java 侧未找到直接调用；待确认 |
| `C0979t3.m2639i(byte[])` | `c_c_a_t3_i___3B` | 432 | 320 | 在 Java 侧未找到直接调用；待确认 |

### 5.3 C0535m：7 个导出函数

| Java 声明 | JNI 导出符号 | ARM64 字节 | ARM32 字节 | 目前能确认的语义 |
|---|---|---:|---:|---|
| `C0535m.m1954J(Context)` | `Java_b_s_m_J__Landroid_content_Context_2` | 2888 | 2228 | 多个界面按“已解锁/未解锁”及功能数量限制调用；会员/Pro 解锁状态 |
| `C0535m.m1955K(String,String)` | `Java_b_s_m_K__Ljava_lang_String_2Ljava_lang_String_2` | 1976 | 1464 | 无直接 Java 调用命中；用途待确认 |
| `C0535m.m1956L(Context)` | `Java_b_s_m_L__Landroid_content_Context_2` | 2928 | 2328 | 无直接 Java 调用命中；用途待确认 |
| `C0535m.m1957a(int,byte[])` | `Java_b_s_m_a__I_3B` | 1104 | 836 | 被 Base64 包装的字符串编码/解码路径调用；底层变换算法待分析 |
| `C0535m.m1964h(Context,boolean,int,String)` | `Java_b_s_m_h__Landroid_content_Context_2ZILjava_lang_String_2` | 2396 | 1852 | Native 文件/应用环境处理入口；具体语义尚未确认 |
| `C0535m.m1975s(String)` | `Java_b_s_m_s__Ljava_lang_String_2` | 3044 | 2396 | 无直接 Java 调用命中；用途待确认 |
| `C0535m.m1980x(Context)` | `Java_b_s_m_x__Landroid_content_Context_2` | 4120 | 3436 | 在一个 UI 标签中显示 Native 返回值；具体内容待确认 |

## 6. assets 可执行文件元数据

| 文件 | ELF 类型 | 架构 | 动态依赖 | Android ELF note | 文件大小 |
|---|---|---|---|---:|---:|
| `adb` | ELF32 EXEC | ARM | 静态（未见 dynamic section） | 30 | 2,546,616 |
| `fastboot` | ELF32 EXEC | ARM | 静态（未见 dynamic section） | 30 | 640,448 |

- 两个 assets 二进制均为 ARM 32 位、静态链接 ELF；Android ELF note 数值为 30。
- `libadbhelper.so` 则同时包含 `arm64-v8a` 和 `armeabi-v7a` 两种 ABI。
- assets 目录未发现独立的 ARM64 `adb` 或 `fastboot` 文件。因此在不支持 32 位应用/可执行文件的 ARM64 系统上存在运行兼容性风险；最终影响需在目标设备验证。
- Android ELF note=30 是构建时 API 标记，不应直接等同于已验证的设备最低 Android 版本。

## 7. Native 还原边界

- `libadbhelper.so` 两个 ABI 各导出 108 个 JNI 函数；FastbootActivity 19 个、C0979t3 9 个、C0535m 7 个，其他导出覆盖 Main/Connect/Remote/Unlock 等模块。
- Native 代码中存在 `d2c_resolve_class`、`d2c_resolve_field`、`d2c_resolve_method` 等 helper；多个 JNI 入口通过这些 helper 在运行时解析 Java 类、字段与方法。
- 部分 .data 字符串表现为编码/混淆数据；静态 `strings` 输出不能直接还原其明文。
- 已对 Fastboot 关键入口确认函数地址、函数大小并读取 AArch64 指令；但尚未得到可靠的完整 C/C++ 伪代码。
- 不可把 Native 方法声明改为空方法或随意删掉 `System.loadLibrary("adbhelper")`，否则会破坏 ADB/Fastboot 关键链路。

## 8. 还待完成

1. 继续还原 `FastbootActivity.onCreate`、USB 广播接收器和设备打开线程的 Native 分支；重点恢复 fastboot 二进制落盘路径、启动参数和进程重启/清理逻辑。
2. 进一步分析 `C0979t3.m2631a` 与 `RunnableC0969r3.run()`，还原 ADB USB packet bridge。
3. 继续解码 `C1139f` 字符串生成器和 C0535m 加密/许可相关 Native 方法。
4. 恢复第三方依赖及版本；目前 `app/build.gradle` 的 dependencies 仍为空。
5. 当前环境没有 Gradle / Android SDK，也没有 `gradlew` wrapper，仍不能进行真正 Gradle 构建和设备运行验证。

## 9. 本轮新增文件

- `第五轮_Fastboot_ADB调用链分析.md`（本报告）
- `第五轮_JNI关键函数映射.csv`（核心 Native 方法与导出符号映射）
