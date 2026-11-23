# GitHub Actions 第十九轮 Java 编译修复

本版基于第十八轮源码与新上传的 Actions 编译日志。日志表明资源阶段预检/合并已通过，失败点为 Java 编译。

**重点变化**：修复多个 JADX 生成的重复方法、内部类遮蔽和错误泛型；compileSdk 调整到 35（targetSdk 仍为 28）；新增源码清单预检以防 GitHub 仓库没有完整上传 Java 依赖源码。

请将本 ZIP 中项目根目录的所有内容覆盖到仓库根目录，确认 `.github/workflows/android-build.yml` 与 `settings.gradle` 在仓库根目录，然后提交运行 Actions。

本地未执行完整 Android 构建，因此该包属于源码修复候选版，构建成功仍以 GitHub Actions 实际结果为准。
