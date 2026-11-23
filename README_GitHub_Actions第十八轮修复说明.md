# GitHub Actions 构建修复版（第十八轮）

本轮依据新上传的 `adb-helper-build-error-logs.zip` 修复 AAPT2 资源链接失败。

## 本轮错误

` :app:processDebugResources ` 失败，日志中 AAPT2 报告布局 XML 的自定义属性 `k0`、`k6`、`ko`、`kr` 使用了裸数字 `0`，但 `attrs.xml` 中这些属性声明为 `reference|enum`，枚举项名称为 `l0`、数值为 `0`。这类值应使用枚举名称而不是数字文本。全量扫描还发现同样情况的 `ka="2"`，其枚举名称为 `l5`。

## 修复

- 将 537 处带有已声明 enum/flag 项的数字型 `app:` 自定义属性值替换为对应符号名称。
- 修改涉及 32 个布局 XML 文件。
- 本轮涉及的属性及变更数量：`k0` 118 处、`k6` 143 处、`ko` 152 处、`kr` 123 处、`ka` 1 处。
- 新增 `tools/check_custom_attr_enum_values.py`，扫描全部资源 XML，阻止具有 enum/flag 声明的自定义属性继续使用对应裸数字。
- 将该检查加入 `.github/workflows/android-build.yml`，并把预检日志纳入失败诊断 Artifact。
- 保留之前的九宫格、framework enum/flag、layout dimension、AndroidX/Material 属性预检和 Gradle 日志上传步骤。

## 当前静态检查

- 九宫格 PNG：106 张通过。
- framework enum/flag 与布局尺寸预检：144 份 values XML 通过。
- 应用属性声明：864 个声明、71 种 app XML 属性、382 个 Java `R.attr` 引用通过。
- 自定义属性 enum/flag 检查：745 个资源 XML 文件通过。
- XML 解析：745/745 通过。
- PNG 解码：271/271 通过。
- GitHub Actions YAML：解析通过。
- ZIP 完整性：打包后另行检查。

## 构建状态

本轮修复针对日志中全部 `k0/k6/ko/kr` 资源类型错误，并扩展扫描相同模式的自定义枚举属性。当前环境没有配置 Android SDK / Gradle，因此没有在本地运行 `:app:assembleDebug`。必须以 GitHub Actions 下一次实际构建结果确认是否还存在其他层级的编译错误；本报告不代表 APK 已成功生成。
