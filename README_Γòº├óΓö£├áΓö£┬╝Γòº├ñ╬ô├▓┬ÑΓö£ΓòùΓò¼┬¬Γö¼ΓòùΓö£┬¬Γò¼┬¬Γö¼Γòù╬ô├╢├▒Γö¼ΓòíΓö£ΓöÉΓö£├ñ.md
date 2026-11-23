# 甲壳虫ADB助手 1.3.1 反编译工程

本工程由原始 APK 使用 JADX 1.5.6 反编译生成，供代码阅读、分析和后续修复使用。

## 内容
- `app/src/main/java/`：反编译得到的 Java 源码（包含应用代码及部分依赖库代码）
- `app/src/main/res/`：解码后的 Android 资源与 XML
- `app/src/main/assets/`：APK 内 assets
- `app/src/main/lib/`：原 APK 中的 ARM64、ARMv7 原生库
- `app/src/main/AndroidManifest.xml`：应用清单
- Gradle 项目基础文件：`settings.gradle`、`build.gradle`、`app/build.gradle`

## 重要限制
1. 这是反编译结果，不是开发者原始工程。原始注释、局部变量名、部分泛型/控制流信息无法保证恢复。
2. APK 中部分包名、类名及变量名经过混淆。JADX 已启用自动反混淆，但自动命名不等于恢复原始名称。
3. `app/build.gradle` 的依赖区可能不完整；JADX 无法可靠恢复原始 Gradle 依赖声明、仓库配置、签名配置及构建脚本。需要结合源码引用和原 APK 继续补齐。
4. 原生 `.so` 文件已保留，但其内部实现不是 Java 源码，无法由 JADX 还原成 C/C++ 工程。
5. 当前仅完成反编译与资源导出，尚未验证 Android Studio 构建成功，也未进行设备功能回归测试。因此不能保证重编译 APK 与原版行为完全一致。

## 打开方式
使用 Android Studio 选择本目录打开。若提示 Gradle 插件或 SDK 缺失，按 IDE 提示安装对应版本；之后需要补齐依赖并修复 JADX 产生的编译问题。

## 核心应用类
`com.didjdk.adbhelper` 包含 MainActivity、ConnectActivity、FastbootActivity、SettingsActivity、RemoteActivity、UnlockActivity 等应用入口和功能页面。
