# GitHub Actions 构建说明

## 工作流

工作流文件：`.github/workflows/android-build.yml`

- 触发条件：Push、Pull Request、Actions 手动触发。
- 环境：Ubuntu latest、Temurin JDK 17、Android SDK platform 28、Build Tools 35.0.0、Gradle 8.11.1。
- 构建任务：`gradle --no-daemon --stacktrace --info :app:assembleDebug`。
- 成功产物：Actions Artifact `adb-helper-debug-apk`。
- 失败产物：Actions Artifact `adb-helper-build-error-logs`，包含构建环境信息、九宫格资源预检日志、Gradle 完整日志及可用的 Gradle 诊断文件。

## 九宫格资源预检

构建前运行 `python3 tools/check_ninepatches.py`。本项目原有的 APK 提取资源中有 106 张带编译态 `npTc` 数据块的 `.9.png`，已恢复为 AAPT2 所需的源码九宫格格式。预检会阻止含编译态 `npTc/npOl/npLb`、PNG CRC 错误或边框标记非法的资源进入 Gradle 构建。

详细记录参见 `第十四轮_九宫格资源批量恢复报告.md`。

## 使用方法

1. 将 ZIP 内工程根目录的内容上传到 GitHub 仓库根目录（确保 `settings.gradle` 在仓库根目录）。
2. 推送提交，或进入仓库的 Actions 页面手动运行 `Android CI`。
3. 构建成功时下载 `adb-helper-debug-apk`。
4. 构建失败时下载 `adb-helper-build-error-logs`，将其中最新的 `gradle-build.log` 和预检日志提供出来即可继续排错。

注意：本地执行环境没有 Android SDK/Gradle，当前交付经过了资源和源码静态检查，但最终 AAPT2/Gradle `assembleDebug` 必须以 GitHub Actions 实际运行结果确认为准。
