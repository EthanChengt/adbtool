# 甲壳虫 ADB 助手 1.3.1 — 第二十一轮编译修复补丁

基于 GitHub `EthanChengt/adbtool` 的 `main` 分支提交 `24170f8a33cb622caf23f12a208d8672552f87f7`。

## 本轮处理

1. `C1187f.java`：实现 `TypeEvaluator<Matrix>.evaluate()`，读取起止矩阵的 9 个值并逐项线性插值，再写回复用的 `Matrix`。对应第20轮 CI 的明确错误：`C1187f is not abstract and does not override abstract method evaluate(float, Matrix, Matrix)`。
2. `InterfaceC0001a.java`：为 `onTransact()` 补上 `throws RemoteException`，保留原有 Binder transaction 逻辑。对应第20轮 CI 的明确错误：调用 `super.onTransact(...)` 时未处理 `RemoteException`。

## 应用方法

把本目录放到项目根目录下，然后在项目根目录执行：

```bash
python round21_patch/apply_round21.py .
```

脚本会先校验两个原文件的 Git blob SHA；只要任一文件与补丁对应的基线不符，就会整体停止，不会覆盖文件。应用前会把原文件备份到 `.round21-backups/`。

也可以人工查看并应用 `round21.patch`。

## 验证边界

这是一份**局部源码补丁**，不是完整项目源码包或 APK。补丁针对日志中确认的两项编译错误；第20轮 CI 仍报告其他 AndroidX/Material 反编译泛型、内部类引用、构造器顺序及资源相关 Java 错误。本轮没有声称这些其余问题已解决，也没有完成完整 APK 构建。应用补丁后仍需重新运行 `:app:assembleDebug`，按新日志继续处理。
