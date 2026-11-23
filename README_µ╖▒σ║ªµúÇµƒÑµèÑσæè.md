# 甲壳虫 ADB 助手 1.3.1 — 深度检查报告

## 本次检查结果
- 工程目录已从上传 ZIP 解压读取。
- Java 文件：1,140
- XML 文件：746
- PNG 图片：271
- 其他文件：402
- 主业务包：`com.didjdk.adbhelper`
- Gradle 根工程与 `app` 模块配置已存在。
- 版本：1.3.1（versionCode 17）
- compileSdk：28；minSdk：19；targetSdk：28
- 两套原生库：`arm64-v8a/libadbhelper.so`、`armeabi-v7a/libadbhelper.so`

## 核心业务类已定位
- `MainActivity.java`
- `ConnectActivity.java`
- `FastbootActivity.java`
- `SettingsActivity.java`
- `RemoteActivity.java`
- `UnlockActivity.java`
- `AppPickerActivity.java`
- `FeedbackActivity.java`
- `AboutActivity.java`
- `FilePickerActivity.java`
- `MyApplication.java`

## 当前工程问题
1. `app/build.gradle` 的 dependencies 块为空，第三方依赖尚未恢复。
2. 多数反编译类名、字段名保留混淆形式（例如 `Cxxxx`、`p080c...`），可编译的反编译代码不等于可读原始源码。
3. 当前环境没有 Android SDK / Gradle 命令，因此本轮无法做真实 Gradle 构建验证。
4. 需进一步梳理 ADB/Fastboot 核心逻辑及 native library 接口，再恢复依赖、修复编译错误。

## 本轮状态
完成了上传工程读取、文件盘点、核心类定位、Gradle/Manifest 检查、native library 检查。
尚未完成：依赖修复、可读命名重构、编译修复与运行测试。

## 第二轮追加分析：JNI / Native 逻辑

- Java 中发现 108 个 native 方法声明。
- `MyApplication.java` 通过 `System.loadLibrary("adbhelper")` 加载原生库。
- 两个 ABI 库均保留：`arm64-v8a` 与 `armeabi-v7a`。
- 使用 ELF 符号表确认原生库仍导出 60+ Java JNI 函数入口；导出函数与业务 Activity/方法对应，包括 ConnectActivity、FastbootActivity、RemoteActivity、MainActivity 等。
- 这说明应用核心功能并非全部由可读 Java 实现；重要逻辑下沉到了被剥离符号的 native 库。完全恢复原始可读 C/C++ 源码需要进一步逆向分析 SO（当前未做机器码级反编译）。

## 第二轮当前完成
已实际完成：
- 重新解压用户上传 ZIP，检查目录结构。
- 统计 Java / XML / PNG 文件数量。
- 读取 Gradle、Manifest 与核心 Java 类。
- 识别空依赖配置。
- 检查原生库文件、架构和 JNI 导出符号。
- 将本次检查结果写入本 README。

仍未完成：
- Gradle 依赖恢复。
- Java 编译错误诊断与修复。
- Native 代码反编译与逻辑重建。
- Android SDK 环境下的编译、安装与运行测试。

## 第三轮补充：JNI 导出索引及依赖线索

- 使用 `nm -D` 实际检查两份 SO，ARM64 与 ARM32 各检出 108 个 `Java_` 导出符号。
- 通过 `strings -a` 扫描 ARM64 SO，字符串表总计约 13,294 行（包含符号和内部字符串）。
- JNI 导出名可见部分 Activity 与方法名，包括 `ConnectActivity`、`FastbootActivity`、`MainActivity`、`UnlockActivity` 等。
- JNI 导出索引单独保存于 `JNI_Export_索引.txt`。
- Native 字符串筛选保存于 `Native_Strings_筛选.txt`。筛选结果目前以 JNI 名称为主，未发现大量直观的 adb/fastboot 命令文本；可能使用动态拼接、编码或协议实现，不能据此判断功能不存在。
- Java imports 初步表明使用 AndroidX、Material Components、Glide、XML Pull Parser、JSON 等库。此为依赖候选，不是已确认的 Gradle 版本。

### 依赖候选（待核验版本）
- AndroidX AppCompat / Core / Fragment / Activity / RecyclerView / ConstraintLayout / CoordinatorLayout / Preference / SwipeRefreshLayout / CardView / DrawerLayout
- Google Material Components
- Glide
- XML Pull Parser
- JSON（org.json，Android 平台通常自带）

**注意：** 目前未恢复具体依赖版本，且没有 Gradle/Android SDK 环境，不能承诺当前源码工程能直接编译。

### imports 统计（按包前缀；用于定位依赖，不代表版本已确认）

- `androidx.recyclerview`：98 次 import
- `material`：64 次 import
- `androidx.appcompat`：61 次 import
- `androidx.fragment`：37 次 import
- `xmlpull`：27 次 import
- `glide`：24 次 import
- `androidx.preference`：21 次 import
- `androidx.coordinatorlayout`：16 次 import
- `androidx.core`：11 次 import
- `androidx.constraintlayout`：7 次 import
- `androidx.activity`：5 次 import
- `androidx.lifecycle`：5 次 import
- `json`：4 次 import
- `other`：4 次 import
- `androidx.swiperefreshlayout`：4 次 import
- `androidx.cardview`：3 次 import
- `androidx.drawerlayout`：3 次 import
- `androidx.savedstate`：2 次 import
- `androidx.versionedparcelable`：1 次 import
- `androidx.media`：1 次 import
- `androidx.annotation`：1 次 import

可能的 Gradle 依赖坐标（版本待核验）:
- `androidx.appcompat:appcompat`
- `androidx.recyclerview:recyclerview`
- `androidx.fragment:fragment`
- `androidx.constraintlayout:constraintlayout`
- `androidx.coordinatorlayout:coordinatorlayout`
- `androidx.preference:preference`
- `androidx.swiperefreshlayout:swiperefreshlayout`
- `androidx.cardview:cardview`
- `androidx.drawerlayout:drawerlayout`
- `androidx.core:core`
- `androidx.activity:activity` / `androidx.lifecycle:lifecycle`
- `com.google.android.material:material`
- `com.github.bumptech.glide:glide`（以及 annotation processor 如工程需要）
- XML Pull Parser / `org.json`：先确认是否 Android 平台内置或需要单独依赖

这些依赖仅根据 imports 推断；应进一步从原始 APK 的 DEX/资源元数据和版本特征恢复具体版本，不能直接视作最终构建配置。

## 第四轮：JNI 函数级初筛与机器码确认

- 使用 LLVM objdump 对 ARM64 `libadbhelper.so` 做机器码反汇编，确认工具链可读取 AArch64 指令。
- 通过 `nm -D -S --defined-only` 获取 JNI 导出函数的地址及符号大小，可按体积筛选大型 Native 入口。
- 初筛 `FastbootActivity`、`ConnectActivity`、`MainActivity`、`UnlockActivity` JNI 入口并保留汇编样本。
- SO 动态依赖为 `liblog.so`、`libc.so`、`libm.so`、`libstdc++.so`、`libdl.so`；未见独立 ADB/Fastboot 共享库依赖。
- 这轮是机器码级初步分析，不是完整 C/C++ 还原；函数名称/大小/汇编观察不等于业务语义已完全确认。
- 新文件：`第四轮_JNI函数尺寸与反汇编观察.md`、`第四轮_ABI尺寸对照.txt`。


## 第五轮补充：Fastboot / ADB 数据通路恢复

- 确认 APK assets 中包含 ARM32 静态 ELF `adb` 和 `fastboot`，另有 `scrcpy_server` APK。
- `RunnableC0911g0` 在本机 TCP 5007 上接收 Fastboot TCP 协议数据，按 8 字节长度字段拆分并发往 USB Bulk OUT；从 Bulk IN 读回响应后交给 Native `m3021E`。
- `RunnableC0974s3` 在本机 TCP 5008 上接受客户端，并通过 Native `C0979t3.m2631a` 循环处理 ADB USB 数据。
- `RemoteActivity` 使用端口 5005 的 `adb forward` 通道承载 scrcpy。当前已确认 5005/5007/5008 三条本机通道。
- 新增 `第五轮_Fastboot_ADB调用链分析.md` 与 `第五轮_JNI关键函数映射.csv`。
