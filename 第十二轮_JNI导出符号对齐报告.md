# 第十二轮：JNI 导出符号对齐修复

## 修复范围
- 依据第七轮 JADX 映射 CSV 与 JNI_Export_索引.txt（ARM64、ARM32 各 108 个导出符号），恢复三个 Activity 与一个 JNI 工具类的 owner/method 名称。
- `p006b.p067s.C0535m` 恢复为 `b.s.m`，源文件移动至 `app/src/main/java/b/s/m.java`；同步更新全工程 191 处类名引用，其中 48 处为显式 imports。
- 恢复 `ConnectActivity`、`MainActivity`、`UnlockActivity` 的 12 个 JNI native 方法名。
- 恢复 `b.s.m` 中 7 个 native 方法名。

## JNI 方法名称映射
| 类 | 反编译名称 | JNI 导出名称 | 全工程替换次数 |
|---|---|---|---:|
| `ConnectActivity` | `m3010x` | `x` | 1 |
| `ConnectActivity` | `m3011A` | `A` | 1 |
| `ConnectActivity` | `m3012B` | `B` | 1 |
| `ConnectActivity` | `m3013C` | `C` | 2 |
| `ConnectActivity` | `m3014y` | `y` | 1 |
| `ConnectActivity` | `m3015z` | `z` | 7 |
| `MainActivity` | `m3029x` | `x` | 4 |
| `MainActivity` | `m3030y` | `y` | 1 |
| `MainActivity` | `m3031z` | `z` | 8 |
| `UnlockActivity` | `m3036x` | `x` | 3 |
| `UnlockActivity` | `m3037y` | `y` | 1 |
| `UnlockActivity` | `m3038z` | `z` | 1 |
| `b.s.m` | `m1954J` | `J` | 11 |
| `b.s.m` | `m1955K` | `K` | 1 |
| `b.s.m` | `m1956L` | `L` | 1 |
| `b.s.m` | `m1957a` | `a` | 3 |
| `b.s.m` | `m1964h` | `h` | 1 |
| `b.s.m` | `m1975s` | `s` | 1 |
| `b.s.m` | `m1980x` | `x` | 2 |

## 校验
- 19 个预期 JNI 导出符号均在 ARM64 与 ARM32 两份导出清单中找到。
- 4 个目标类的 19 个 native 声明与 JNI 导出方法名、参数描述符逐项对照。
- 1,140 个 Java 文件中未残留本轮已替换的旧 native 方法标识符或 `C0535m` 类名；所有相关 import 均已更新。
- 本报告不代表 APK 已成功编译或 JNI 已在设备上运行；当前环境仍缺少 Android SDK/Gradle 构建链，后续需 Android Studio 构建和真机验证。

## 限制与后续
- 本轮只恢复有映射和导出符号双重证据的 JNI owner/method，不对其他混淆类批量重命名。
- Activity 的内部类符号及其他剩余 JNI 类尚未全部恢复。
