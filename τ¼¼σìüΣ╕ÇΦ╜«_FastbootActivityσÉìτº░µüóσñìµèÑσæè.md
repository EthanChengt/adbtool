# 第十一轮：FastbootActivity 名称恢复

基于第七轮全量 JADX 名称映射 CSV，仅对 `FastbootActivity` 中有映射证据的字段/方法标识符做全工程 token 替换，因这些标识符按映射表来源为该类专属。

恢复映射项：49（字段/方法；内部类名保持原第十轮命名，避免非法 Java 标识符）。

|类型|反编译名|恢复名|全工程替换次数|
|---|---|---|---:|
|field|`f6380e0`|`e0`|1|
|field|`f6407a0`|`a0`|4|
|field|`f6408b0`|`b0`|2|
|field|`f6409c0`|`c0`|4|
|field|`f6410d0`|`d0`|3|
|field|`f6381A`|`A`|1|
|field|`f6382B`|`B`|1|
|field|`f6383C`|`C`|1|
|field|`f6384D`|`D`|1|
|field|`f6385E`|`E`|4|
|field|`f6386F`|`F`|7|
|field|`f6387G`|`G`|1|
|field|`f6388H`|`H`|1|
|field|`f6389I`|`I`|1|
|field|`f6390J`|`J`|5|
|field|`f6391K`|`K`|3|
|field|`f6392L`|`L`|2|
|field|`f6393M`|`M`|5|
|field|`f6394N`|`N`|5|
|field|`f6395O`|`O`|1|
|field|`f6396P`|`P`|2|
|field|`f6397Q`|`Q`|2|
|field|`f6398R`|`R`|5|
|field|`f6399S`|`S`|1|
|field|`f6400T`|`T`|9|
|field|`f6401U`|`U`|3|
|field|`f6402V`|`V`|1|
|field|`f6403W`|`W`|1|
|field|`f6404X`|`X`|1|
|field|`f6405Y`|`Y`|5|
|field|`f6406Z`|`Z`|5|
|method|`m2196j`|`q`|61|
|method|`m2196j`|`r`|0|
|field|`f6413s`|`s`|3|
|field|`f6414t`|`t`|2|
|field|`f6415u`|`u`|4|
|field|`f6416v`|`v`|2|
|field|`f6417w`|`w`|4|
|field|`f6418x`|`x`|1|
|field|`f6419y`|`y`|1|
|field|`f6420z`|`z`|1|
|method|`m3016x`|`x`|1|
|method|`m3017A`|`A`|3|
|method|`m3018B`|`B`|1|
|method|`m3019C`|`C`|2|
|method|`m3020D`|`D`|2|
|method|`m3021E`|`E`|3|
|method|`m3022y`|`y`|1|
|method|`m3023z`|`z`|6|

**验证限制：** 本轮名称恢复并不等同于 JNI 已运行验证；Android Gradle 构建环境未配置，尚未完成 APK 编译/设备测试。
