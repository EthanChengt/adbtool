# 第十三轮：全量 JNI 恢复与静态验收报告

## 交付结论

本轮把可由原始 JADX 映射表、JNI 导出表及 native resolver 字符串交叉确认的源码恢复项集中收尾。Java 源码、资源 XML、JNI 导出符号和工程目录结构均完成静态验收。

**当前结论是“源码静态验收通过”，不是“Android APK 已编译或真机运行通过”。** 当前环境缺少 Gradle 和 Android SDK，无法执行 Gradle、AAPT2、D8、APK 安装或设备 JNI 测试。

## 本轮完成内容

1. 根据 JADX 原始名称映射，恢复 JNI 相关包名、类名、Activity 内部类名和 native 方法名，覆盖 ADB/Fastboot 通信类及 `v3/i0`、`x3`、`y3` 等子包。
2. native 方法重命名严格限定在对应声明类内部；对旧混淆方法名保留非 native 转发方法，避免对其他类中的同名方法做全局替换，并保持既有调用点兼容。
3. 重新构建 4 个被 JADX 错误内联的 JNI owner：`c.c.a.i2`、`c.c.a.z1`、`c.c.a.r2`、`c.c.a.v3.i0.o`。
4. 按 native resolver 中的 JVM 字段描述符恢复 capture 字段：`i2.b/c/d`、`z1.b`、`r2.b`、`o.a/b`。
5. 新增 `b.b.c.i` 作为既有 Dialog 实现的兼容子类，并使对应 Dialog builder 创建该子类，以匹配 native 字段描述符 `Lb/b/c/i;`，保留原有 Dialog 行为实现。
6. 修复短类名恢复带来的两个明确 import 冲突，全部使用限定类名消除歧义。
7. 统一 Java 源文件目录与 `package` 声明；未发现路径碰撞。

## 静态验收结果

| 检查项 | 结果 |
|---|---:|
| Java 源文件 | 1,145 个 |
| Java 语法解析 | 1,145 / 1,145 通过 |
| Java 语法错误 | 0 |
| XML 文件（含 Manifest） | 746 个 |
| XML 格式错误 | 0 |
| ARM64 JNI 导出 | 108 个 |
| ARM32 JNI 导出 | 108 个 |
| 两种 ABI 导出集合 | 完全一致 |
| Java native 声明 | 108 个 |
| Java native 声明与导出符号匹配 | 108 / 108 |
| 导出符号缺少 Java 声明 | 0 |
| Java 声明无对应导出 | 0 |
| Java package 与目录不一致 | 0 |
| public 顶层类型与文件名不一致 | 0 |
| 重复 public 顶层类型 | 0 |
| 重复显式 import 冲突 | 0 |
| 第九轮 R 字段引用检查 | 1,267 处，缺失 0 |

逐项 JNI 符号核对表见 `第十三轮_JNI导出符号逐项核对.csv`；机器可读验收数据见 `第十三轮_静态验收数据.json`；Java 解析结果见 `第十三轮_Java语法解析结果.txt`。

## Native 库保留情况

| ABI | 文件 | 大小 | SHA-256 |
|---|---|---:|---|
| arm64-v8a | `app/src/main/lib/arm64-v8a/libadbhelper.so` | 1,799,592 bytes | `9b2df1ebbc16625ae71db1d960eaf2531cb5f890c681c3bc4449b07efbcee5fb` |
| armeabi-v7a | `app/src/main/lib/armeabi-v7a/libadbhelper.so` | 1,295,768 bytes | `90af385954cd113c89ec54c3bdb3ab33accb4abc8723a2856b17da97493ee9ba` |

两个原始 `.so` 均保留，没有重新编译或修改二进制内容。

## 尚未完成、不能宣称通过的项目

- **Android Gradle 编译未执行**：环境中没有 `gradle` 命令；项目仅含 `gradle-wrapper.properties`，缺少 `gradle-wrapper.jar` 和 `gradlew` / `gradlew.bat`。
- **Android SDK 未安装/不可见**：`ANDROID_HOME`、`ANDROID_SDK_ROOT` 均未设置，无法运行 AAPT2 资源链接、D8 dex 转换或 APK 打包。
- **依赖解析尚未验证**：`app/build.gradle` 的 `dependencies` 目前为空。源码树中包含大量反编译的 AndroidX、Support、Material 等代码，但首次在 Android Studio 同步/构建时仍需按实际报错核对外部依赖。
- **设备运行未验证**：没有在 Android 设备上测试 USB 授权、ADB/Fastboot 通信、JNI 调用和解锁流程。108/108 的结果是 Java 声明与现有 `.so` 导出符号的静态对齐，不等同于 JNI 运行成功。
- **签名与发布包未生成**：原 APK 的签名材料已隔离保存；新 APK 需要重新构建并使用新的签名密钥签名。

## 建议的外部构建环境

使用 JDK 17 或更高版本、Gradle 8.11.1、Android Gradle Plugin 8.10.1，并安装 Android SDK Platform 28。项目根目录已有 `gradle-wrapper.properties`，但须在具备 Gradle 的机器上生成 Wrapper JAR/脚本或使用 Android Studio 的本地 Gradle。随后执行 `gradle :app:assembleDebug`，根据真实构建错误继续补齐依赖或资源/类型问题。

## 可追溯性

本工程以第十二轮源码为基础创建独立交付副本。此前轮次目录和原始 APK 反编译材料未被本轮覆盖。完整映射表、JNI 导出索引、调用链分析和修复报告均随包保留。
