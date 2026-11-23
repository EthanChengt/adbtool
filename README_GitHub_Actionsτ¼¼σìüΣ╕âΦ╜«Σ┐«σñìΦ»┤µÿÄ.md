# GitHub Actions 构建修复版（第十七轮）

本轮根据最新 Actions 诊断包修复 AndroidX / Material / ConstraintLayout 资源链接错误。

## 更新
- 恢复 XML 中可映射到现有 `R.attr` 的属性 ID。
- 补齐仍有实际 XML / Java 引用依据的自定义属性声明。
- 新增应用属性预检脚本，并接入 `.github/workflows/android-build.yml`。
- 保留九宫格和 framework enum / layout dimension 预检及失败日志上传。

## 构建
推送到 GitHub 后，打开 Actions 运行 `Android CI`。成功时下载 `adb-helper-debug-apk` Artifact；失败时下载 `adb-helper-build-error-logs` 继续定位。

## 注意
此包已通过 XML、PNG、属性预检、YAML 和 ZIP 静态验收，但尚未在本地 Android SDK 环境实际执行 `assembleDebug`。不能将静态预检等同于 APK 构建成功。
