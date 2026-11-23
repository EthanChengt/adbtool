# 第十五轮：Android 资源枚举/标志位修复

## 本轮依据

根据用户上传的 `gradle-build.log`，Gradle 已通过 `mergeDebugResources`，在 `:app:processDebugResources` 的 AAPT2 resource linking 阶段失败。日志包含 20 条错误，主要表现为：

- `expected flags but got (raw string) 0x0`
- `expected flags but got (raw string) 0x1`
- `expected flags but got (raw string) 0x20`
- `expected flags but got (raw string) 0x10`
- `expected enum but got (raw string) 4`
- `expected enum but got (raw string) 5`

这不是九宫格资源错误；上一轮九宫格资源已通过 `mergeDebugResources`。

## 修复内容

修复 `app/src/main/res/values*/*.xml` 中 Android framework 样式项的反编译裸数值，改回 AAPT2 可识别的枚举/标志位名称：

- `android:textStyle`: `0x0` / `0x1` → `normal` / `bold`
- `android:windowSoftInputMode`: `0x20` → `adjustPan`
- `android:gravity`、`android:layout_gravity`: 裸位掩码 → `center_vertical`、`center_horizontal`、`center`、`start|center_vertical`
- `android:scrollbars`: `0x200` → `vertical`
- `android:ellipsize`: `3` / `4` → `end` / `marquee`
- `android:scaleType`: `3` / `5` → `fitCenter` / `center`
- 另外恢复 `orientation`、`textAlignment`、`datePickerMode`、`visibility`、`breakStrategy`、`hyphenationFrequency` 的标准枚举名称。

本次在 4 个 values 资源文件中完成 76 处值转换；不改变布局、样式语义或 Java 逻辑。

## 防回归

新增 `tools/check_resource_style_values.py`，并加入 GitHub Actions，在 Gradle 编译前检查 13 类 Android framework enum/flag 属性是否仍包含裸数字。失败时对应日志也会进入 `adb-helper-build-error-logs` Artifact。

## 静态验证

运行 `python3 tools/check_resource_style_values.py`，结果：144 个 values XML 文件通过检查，13 类属性没有残留裸数值。

本轮在当前容器中没有 Android SDK、Gradle 和 AAPT2，因此尚未执行 `:app:assembleDebug`。最终是否完全通过 Android 资源链接，需要在 GitHub Actions 重新运行确认。
