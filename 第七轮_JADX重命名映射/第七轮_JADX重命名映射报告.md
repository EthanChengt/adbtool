# 第七轮：JADX 重命名映射恢复与 JNI 兼容性审计

## 1. 本轮工作

扫描 `app/src/main/java` 下的 Java 源文件，读取 JADX 保留的 `JADX INFO: renamed from:` 注释，将原始名称与其后紧邻的源码声明关联。没有修改原反编译源码。

### 统计结果

| 类型 | 映射数量 |
|---|---:|
| Java 类型（class/interface/enum） | 1,943 |
| 字段 | 5,951 |
| 方法 | 5,337 |
| **合计** | **13,231** |
| 未解析注释 | 0 |

这是静态批量提取结果；“0 未解析”指提取脚本为所有注释找到可分类的后续声明，不等于每一行都已经人工审阅。

## 2. ADB 核心类：原始名称和 JADX 名称不一致

源码文件：`app/src/main/java/p080c/p113c/p114a/C0979t3.java`

JADX 注释显示它原始 DEX 类名为 `c.c.a.t3`，但反编译输出使用包名 `p080c.p113c.p114a` 和类名 `C0979t3`。

| 原始成员 | JADX 当前成员 | 类型/用途 |
|---|---|---|
| `a` | `f4905a` | `UsbDeviceConnection` |
| `b` | `f4906b` | USB Bulk OUT endpoint |
| `c` | `f4907c` | USB Bulk IN endpoint |
| `d` | `f4908d` | `UsbInterface` |
| `e` | `f4909e` | `ServerSocket` |
| `f` | `f4910f` | `InputStream` |
| `g` | `f4911g` | `OutputStream` |
| `h` | `f4912h` | `ConnectActivity` |
| `i` / `j` | `f4913i` / `f4914j` | IN / OUT packet size fields（以构造函数赋值为准） |
| `k` | `f4915k` | `Handler` |
| `l` / `m` / `n` | `f4916l` / `f4917m` / `f4918n` | boolean 状态字段 |
| `a(C0979t3)` | `m2631a(C0979t3)` | ADB Socket → USB 方向处理 |
| `b(UsbEndpoint,byte[],int)` | `m2632b(...)` | USB Bulk 传输辅助方法 |
| `c()` | `m2633c()` | USB / ServerSocket 资源清理 |
| `d()` | `m2634d()` | 扩展清理路径，涉及 Activity / receiver |
| `e()` | `m2635e()` | USB IN → Socket 方向处理 |
| `f(String)` | `m2636f(String)` | 日志/状态输出辅助方法 |
| `g(String,ByteBuffer)` | `m2637g(...)` | ADB 帧日志辅助方法 |
| `h(byte[])` | `m2638h(byte[])` | 从 InputStream 读取数据 |
| `i(byte[])` | `m2639i(byte[])` | 将数据送往 USB OUT 的辅助入口 |

原始字段和方法名由 Java 文件中的 JADX 注释确认；Native resolver 字符串也直接使用 `c/c/a/t3` 以及 `a` 至 `i` 这些成员名。

## 3. ADB Native 解析引用与数据路径

### `m2631a` / 原始 `a`

静态 resolver 记录确认该 Native 方法会解析/使用：

- `c/c/a/t3.h([B)V`：读取 Socket 输入数据到 byte array；
- `java/nio/ByteBuffer.allocate(I)`、`order(ByteOrder)`，并选择 `LITTLE_ENDIAN`；
- `ByteBuffer.getInt(I)`、`putInt(II)`、`array()`；
- `c/c/a/t3.g(String,ByteBuffer)` 与 `c/c/a/t3.f(String)`；
- `c/c/a/t3.i([B)V` 和 `c/c/a/t3.b(UsbEndpoint,[B,I)V`；
- 字段 `b`（UsbEndpoint）、`k`（Handler）、`l`、`m`（boolean）。

反汇编行为可确认：

1. 分配并读取 24 字节 ADB 消息头；
2. 按 Little Endian 方式访问头部整数；
3. 比较 command 值 `0x4e584e43`，其字节序对应 `CNXN`；
4. 当标志字段 `m` 为 true 且命令为 `CNXN` 时，在偏移 8 写入 `0x4000`；
5. 从偏移 12 读取后续数据长度，并将头部/负载交给 USB OUT 路径。

注意：以上是对机器码访问和 resolver 的描述。`0x4000` 在该包中的协议语义尚未由真机抓包验证，不在报告中直接把它解释为某个特定设备能力字段。

### `m2635e` / 原始 `e`

Native resolver 确认该方法读取 USB IN 端点数据，使用 Little Endian `ByteBuffer` 解析帧长度，并通过 `OutputStream.write()` / `flush()` 将数据写回本地 Socket。它与 `m2631a` 构成 ADB 双向传输的另一半。

### `r2.run()`

Native resolver 显示它读取 `r2.b` 中的 `t3` 对象，访问关闭标志 `t3.n`，调用 `t3.e()`（USB IN → Socket），异常/结束清理路径调用 `t3.d()`，并向 Activity 日志输出异常信息。

## 4. FastbootActivity 的 JNI 方法原名映射

`FastbootActivity` 类本身仍是 `com.didjdk.adbhelper.FastbootActivity`，但多个成员和内部类在 JADX 中被改名。

| 原始方法 | JADX 当前名称 | Native 语义（谨慎表述） |
|---|---|---|
| `x(FastbootActivity,UsbDevice,UsbInterface)` | `m3016x(...)` | USB 接口识别/筛选入口 |
| `A()` | `m3017A()` | 命令提交/处理入口 |
| `B(UsbDevice)` | `m3018B(...)` | USB 设备判断入口 |
| `C()` | `m3019C()` | 日志/控制台清理入口 |
| `D()` | `m3020D()` | 设置开关后的 Native 处理入口 |
| `E(byte[],int)` | `m3021E(...)` | USB 回复写回本地 Fastboot Socket |
| `y(UsbDevice)` | `m3022y(...)` | USB 设备处理入口 |
| `z(String,int)` | `m3023z(...)` | 返回 SpannableString 的文本格式化入口 |

内部类映射：

- `FastbootActivity$a` → `RunnableC1318a`
- `FastbootActivity$b` → `C1319b`
- `FastbootActivity$c` → `RunnableC1320c`
- `FastbootActivity$d` → `C1321d`
- `FastbootActivity$e` → `HandlerC1322e`

此外，Fastboot 的 `m3021E(byte[],int)` resolver 明确使用 `ByteOrder.BIG_ENDIAN`、`ByteBuffer.putLong()`、`OutputStream.write()` 与 `flush()`。与 Java 侧 5007 server 读取 8 字节长度字段的行为对应。

## 5. 为什么现在不能直接把所有短名称全局替换

1. 混淆原名大量重复，例如不同类都有 `a`、`b`、`c`；必须按类作用域和签名进行替换。
2. JNI 使用的是完整类描述符、字段名、方法名和签名；只改 Java 标识符但不同步包名/调用点会导致引用错误。
3. ADB 核心类原始 descriptor 为 `c.c.a.t3`，JADX 当前源码展示的是 `p080c.p113c.p114a.C0979t3`。需要恢复整个类型引用图，而非只重命名一个文件。
4. 内部类、匿名类、重载方法和泛型签名还需逐个核验；CSV 是映射依据，不是自动安全的源码重写补丁。

## 6. 文件说明

- `全量_JADX重命名映射.csv`：13,231 条类型/字段/方法映射，包含源码路径、行号和声明文本。
- `JNI关键类_JADX原始名称映射.csv`：C0979t3、C0978t2、FastbootActivity 和相关线程类的映射子集。
- `build_jadx_rename_map.py`：提取脚本，可在具有相同工程路径结构的环境中运行。
- `未解析映射检查.csv`：未解析记录检查；本轮为空数据表（只有表头）。

## 7. 当前恢复状态

本轮新增的是可审计的原始名称映射，不是自动改写后的源码。原始 Java 文件、assets 和 SO 均保持不变。依赖版本恢复、JADX 生成代码修复、JNI 名称回填、Gradle 构建和设备联调仍未完成。当前环境缺少 Android SDK / Gradle，故不能宣称项目已经编译或运行成功。
