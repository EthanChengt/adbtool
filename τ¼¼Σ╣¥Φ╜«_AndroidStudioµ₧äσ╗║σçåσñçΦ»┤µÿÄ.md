# 第九轮构建准备说明

1. 使用 Android Studio 打开本目录（根目录包含 `settings.gradle`）。
2. Gradle 配置要求与 AGP 8.10.1 匹配：Gradle 8.11.1 或更高兼容版本，JDK 17 或更高。建议使用 Android Studio 配置的 JDK 17+。
3. 安装 Android SDK Platform 28；AGP 8.10.1 的默认 Build Tools 版本为 35.0.0。
4. 由于本包只包含 `gradle-wrapper.properties`，未包含 Wrapper JAR 和 `gradlew`/`gradlew.bat`，首次构建前请在安装了 Gradle 8.11.1 的环境执行 `gradle wrapper --gradle-version 8.11.1`，或在 Android Studio 中选择兼容的本地 Gradle。
5. 本工程 Native 库保留在 `app/src/main/lib`，Gradle 已配置从该目录打包。
6. 原 APK 的 `META-INF` 签名文件已移至 `forensics/`，不参与新 APK 打包。
7. 当前版本完成 Java 语法解析清理，但没有真实 Gradle/AAPT2/D8 构建验证；首次同步后的错误才是下一步修复依据。
