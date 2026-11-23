# 甲壳虫 ADB 助手 1.3.1 — 第二十二轮编译修复补丁

本补丁面向 GitHub 仓库 `EthanChengt/adbtool` 的 `main` 分支基线提交：

`24170f8a33cb622caf23f12a208d8672552f87f7`

共包含 **34 个源码文件**的定点修复。补丁不包含 APK，也没有声称已经完成 Gradle 构建。

## 应用顺序

如尚未应用第二十一轮，请先单独解压并应用第二十一轮补丁，再应用本轮：

```bash
python round21_patch/apply_round21.py .
python round22_patch/apply_round22.py --check-only .
python round22_patch/apply_round22.py .
```

如果第二十一轮已经应用过，直接执行本轮的检查和应用命令即可。第二十一轮与本轮修改的源文件不重叠。

## 本轮处理范围

- RecyclerView 子视图索引、Adapter 泛型返回类型及参数类型。
- CoordinatorLayout 反射构造器类型、构造器 `super()` 顺序和 Parcelable Creator 返回类型。
- AppCompat / Material 反编译残留：外部类限定引用、菜单回调、Parcelable 和迭代器泛型、无效 `break`、内部类构造器。
- 缺失的 `InterfaceC0424s` / `InterfaceC0502g` 实现方法，以及 `NestedScrollView`、`AbstractC0407b` 的静态辅助方法引用。
- `FloatingActionButton` 行为类泛型、背景 Drawable 桥接、阴影 padding 回调及属性动画参数。
- `ConnectActivity` 字符串解码器静态导入、`C0243a0` API 29 横向滚动分支、菜单状态保存泛型，以及缺失的 `R.id.b2` / `R.id.nz` 资源 ID。

## 安全检查

应用脚本会逐个校验 34 个目标文件的 Git blob SHA。只有所有文件版本都与上述基线一致、且所有补丁锚点均唯一匹配时，才会写入任何文件；否则整轮停止且不修改源码。

原文件备份至项目根目录 `.round22-backup/`，应用记录写入 `round22-apply-report.json`。脚本仅支持对未修改的基线源码应用一次；重复应用时 SHA 校验会主动阻止覆盖。

## 构建验证

本补丁的 Python 脚本语法已检查；修复锚点已逐项对照当前仓库源文件核验。但此轮尚未在 GitHub Actions 或本地 Android SDK 环境完成 `:app:assembleDebug`，所以不能视为已生成可安装 APK。

应用后执行：

```bash
./gradlew :app:assembleDebug
```

并以新的 CI 编译日志作为下一轮修复依据。
