# GitHub Actions 构建修复说明（第二次资源修复）

## 本次日志对应的故障

本次上传的 `gradle-build.log` 报错位置为：

```text
> Task :app:mergeDebugResources FAILED
app/src/main/res/drawable-hdpi/gg.9.png: AAPT: error: file failed to compile.
```

这与前一次 `fs.9.png` 是同一类根因，但不是同一张图片。

## 根因

对构建修复包中的全部九宫格资源做了检查：共发现 **106 张 `.9.png`**，每一张都带有从 APK 提取的 Android 编译态 PNG 私有数据块 `npTc`，其中部分还包含 `npOl` 和 `npLb`。这些是 APK 中的已编译九宫格元数据，不是 AAPT2 期望的源 `.9.png` 边框格式。仅修复 `fs.9.png` 无法解决剩余文件，构建会继续在下一张九宫格图片处失败。

## 本次统一修复

- 按 `npTc` 元数据恢复 1 像素透明边框。
- 将原有 x/y 拉伸区还原为黑色标记线。
- 将原有内容 padding 还原为底边/右边黑色标记线。
- 将 `npLb` 中保存的 layout bounds 还原为红色标记线。
- 删除仅适用于 APK 编译产物的 `npTc`、`npOl`、`npLb` 私有块。
- 保留原图片内容、资源文件名和资源目录限定符；Java/XML 的 `R.drawable` 名称不变。

处理数量：106 张，覆盖 mdpi、hdpi、xhdpi、xxhdpi、xxxhdpi 和 ldrtl 变体。

## 验证

- 106/106 九宫格 PNG 通过新增的纯 Python 标准库预检。
- 271/271 PNG 图片均可完整解码。
- 未发现普通 `.png` 文件携带九宫格编译态私有数据块。
- PNG 内容图像区保留，处理只在外围添加九宫格标记边框。
- GitHub Actions 现会在 Gradle 构建前验证全部九宫格；若预检或 Gradle 构建失败，均会上传构建环境信息、预检日志和 Gradle 诊断日志。

## 重新构建

将 ZIP 解压后的工程根目录内容覆盖到 GitHub 仓库，提交并推送，或在 Actions 页面手动运行 `Android CI`。

成功后下载 `adb-helper-debug-apk`。失败时下载 `adb-helper-build-error-logs`，其中会包含失败阶段可用的日志。

## 尚未声称完成的验证

本地当前没有 Android SDK/Gradle 构建环境，因此本次只完成了资源恢复、PNG 解码、九宫格边框预检、源码静态检查及 ZIP 完整性检查；最终 AAPT2/Gradle 构建仍需在 GitHub Actions 上执行确认。
