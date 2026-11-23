# 第四轮 JNI 函数级索引与反汇编观察

## ELF 导出函数尺寸统计

尺寸来自 `nm -D -S --defined-only`；为符号函数体大小，不等同于源代码复杂度。

### ARM64: 108 JNI exported symbols

- `Java_com_didjdk_adbhelper_ConnectActivity_onCreate__Landroid_os_Bundle_2` — offset `0xb2f14`, size `26292` bytes (25.68 KiB)
- `Java_com_didjdk_adbhelper_MainActivity_onActivityResult__IILandroid_content_Intent_2` — offset `0x12139c`, size `22316` bytes (21.79 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_onCreate__Landroid_os_Bundle_2` — offset `0xf8230`, size `21432` bytes (20.93 KiB)
- `Java_c_c_a_f0_handleMessage__Landroid_os_Message_2` — offset `0x25d10`, size `19124` bytes (18.68 KiB)
- `Java_c_c_a_z1_run__` — offset `0x8dbcc`, size `17076` bytes (16.68 KiB)
- `Java_com_didjdk_adbhelper_MainActivity_onCreate__Landroid_os_Bundle_2` — offset `0x12e444`, size `16272` bytes (15.89 KiB)
- `Java_c_c_a_t3_d__` — offset `0x61228`, size `15560` bytes (15.20 KiB)
- `Java_c_c_a_i2_run__` — offset `0x30544`, size `15220` bytes (14.86 KiB)
- `Java_com_didjdk_adbhelper_RemoteActivity_onCreate__Landroid_os_Bundle_2` — offset `0x14b10c`, size `13956` bytes (13.63 KiB)
- `Java_com_didjdk_adbhelper_ConnectActivity_onOptionsItemSelected__Landroid_view_MenuItem_2` — offset `0xc8814`, size `11616` bytes (11.34 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` — offset `0xde344`, size `11348` bytes (11.08 KiB)
- `Java_c_c_a_r_handleMessage__Landroid_os_Message_2` — offset `0x52aa4`, size `11336` bytes (11.07 KiB)
- `Java_c_c_a_x3_g_a__Ljava_lang_String_2` — offset `0x87bb0`, size `9924` bytes (9.69 KiB)
- `Java_com_didjdk_adbhelper_ConnectActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` — offset `0xa55dc`, size `9800` bytes (9.57 KiB)
- `Java_com_didjdk_adbhelper_UnlockActivity_onCreate__Landroid_os_Bundle_2` — offset `0x156460`, size `8512` bytes (8.31 KiB)
- `Java_c_c_a_q3_a__` — offset `0x3a8f8`, size `7452` bytes (7.28 KiB)
- `Java_c_c_a_t3_e__` — offset `0x6a4cc`, size `7324` bytes (7.15 KiB)
- `Java_c_c_a_q3_b__` — offset `0x3f38c`, size `7176` bytes (7.01 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_00024e_handleMessage__Landroid_os_Message_2` — offset `0xe506c`, size `6872` bytes (6.71 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_onOptionsItemSelected__Landroid_view_MenuItem_2` — offset `0x109dbc`, size `6808` bytes (6.65 KiB)
- `Java_com_didjdk_adbhelper_MainActivity_onDestroy__` — offset `0x139fe0`, size `6100` bytes (5.96 KiB)
- `Java_c_c_a_t3_a__Lc_c_a_t3_2` — offset `0x59680`, size `5952` bytes (5.81 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_D__` — offset `0xf0728`, size `5944` bytes (5.80 KiB)
- `Java_com_didjdk_adbhelper_FilePickerActivity_onCreate__Landroid_os_Bundle_2` — offset `0x116f7c`, size `5936` bytes (5.80 KiB)
- `Java_com_didjdk_adbhelper_MainActivity_y__` — offset `0x142bd0`, size `5860` bytes (5.72 KiB)

### ARM32: 108 JNI exported symbols

- `Java_com_didjdk_adbhelper_ConnectActivity_onCreate__Landroid_os_Bundle_2` — offset `0x85435`, size `21972` bytes (21.46 KiB)
- `Java_com_didjdk_adbhelper_MainActivity_onActivityResult__IILandroid_content_Intent_2` — offset `0xd5469`, size `18296` bytes (17.87 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_onCreate__Landroid_os_Bundle_2` — offset `0xb7a65`, size `18036` bytes (17.61 KiB)
- `Java_c_c_a_f0_handleMessage__Landroid_os_Message_2` — offset `0x1c919`, size `16184` bytes (15.80 KiB)
- `Java_com_didjdk_adbhelper_MainActivity_onCreate__Landroid_os_Bundle_2` — offset `0xdf225`, size `13572` bytes (13.25 KiB)
- `Java_c_c_a_z1_run__` — offset `0x6a975`, size `13380` bytes (13.07 KiB)
- `Java_c_c_a_t3_d__` — offset `0x4a96d`, size `12456` bytes (12.16 KiB)
- `Java_c_c_a_i2_run__` — offset `0x254b9`, size `12316` bytes (12.03 KiB)
- `Java_com_didjdk_adbhelper_RemoteActivity_onCreate__Landroid_os_Bundle_2` — offset `0xf3a8d`, size `11804` bytes (11.53 KiB)
- `Java_com_didjdk_adbhelper_ConnectActivity_onOptionsItemSelected__Landroid_view_MenuItem_2` — offset `0x956e9`, size `10216` bytes (9.98 KiB)
- `Java_c_c_a_r_handleMessage__Landroid_os_Message_2` — offset `0x3f991`, size `9108` bytes (8.89 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` — offset `0xa4649`, size `8828` bytes (8.62 KiB)
- `Java_c_c_a_x3_g_a__Ljava_lang_String_2` — offset `0x6614d`, size `7732` bytes (7.55 KiB)
- `Java_com_didjdk_adbhelper_ConnectActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` — offset `0x7bd11`, size `7412` bytes (7.24 KiB)
- `Java_com_didjdk_adbhelper_UnlockActivity_onCreate__Landroid_os_Bundle_2` — offset `0xfc5ad`, size `7260` bytes (7.09 KiB)
- `Java_c_c_a_q3_a__` — offset `0x2d0d5`, size `6836` bytes (6.68 KiB)
- `Java_c_c_a_t3_e__` — offset `0x51df1`, size `6096` bytes (5.95 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_00024e_handleMessage__Landroid_os_Message_2` — offset `0xa95a9`, size `6036` bytes (5.89 KiB)
- `Java_c_c_a_q3_b__` — offset `0x31525`, size `5836` bytes (5.70 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_onOptionsItemSelected__Landroid_view_MenuItem_2` — offset `0xc5611`, size `5688` bytes (5.55 KiB)
- `Java_com_didjdk_adbhelper_MainActivity_onDestroy__` — offset `0xe80f1`, size `4964` bytes (4.85 KiB)
- `Java_com_didjdk_adbhelper_FastbootActivity_D__` — offset `0xb1f99`, size `4904` bytes (4.79 KiB)
- `Java_com_didjdk_adbhelper_FilePickerActivity_onCreate__Landroid_os_Bundle_2` — offset `0xce4d5`, size `4900` bytes (4.79 KiB)
- `Java_com_didjdk_adbhelper_MainActivity_y__` — offset `0xee77d`, size `4872` bytes (4.76 KiB)
- `Java_c_c_a_t3_a__Lc_c_a_t3_2` — offset `0x45285`, size `4824` bytes (4.71 KiB)

## Java native 声明清单（源码位置）

- `com/didjdk/adbhelper/AboutActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/AppPickerActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `getView(int i, View view, ViewGroup viewGroup)` → `View`
- `com/didjdk/adbhelper/ConnectActivity.java`: `getView(int i, View view, ViewGroup viewGroup)` → `View`
- `com/didjdk/adbhelper/ConnectActivity.java`: `m3010x(ConnectActivity connectActivity, UsbDevice usbDevice, UsbInterface usbInterface)` → `boolean`
- `com/didjdk/adbhelper/ConnectActivity.java`: `m3011A(UsbDevice usbDevice)` → `boolean`
- `com/didjdk/adbhelper/ConnectActivity.java`: `m3012B()` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `m3013C(String str)` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `m3014y(UsbDevice usbDevice)` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `m3015z()` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onActivityResult(int i, int i2, Intent intent)` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onBackPressed()` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onCreateOptionsMenu(Menu menu)` → `boolean`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onDestroy()` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onOptionsItemSelected(MenuItem menuItem)` → `boolean`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onReceive(Context context, Intent intent)` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onResume()` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `onStop()` → `void`
- `com/didjdk/adbhelper/ConnectActivity.java`: `run()` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `handleMessage(Message message)` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `m3016x(FastbootActivity fastbootActivity, UsbDevice usbDevice, UsbInterface usbInterface)` → `boolean`
- `com/didjdk/adbhelper/FastbootActivity.java`: `m3017A()` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `m3018B(UsbDevice usbDevice)` → `boolean`
- `com/didjdk/adbhelper/FastbootActivity.java`: `m3019C()` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `m3020D()` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `m3021E(byte[] bArr, int i)` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `m3022y(UsbDevice usbDevice)` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `m3023z(String str, int i)` → `SpannableString`
- `com/didjdk/adbhelper/FastbootActivity.java`: `onActivityResult(int i, int i2, Intent intent)` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `onCreateOptionsMenu(Menu menu)` → `boolean`
- `com/didjdk/adbhelper/FastbootActivity.java`: `onDestroy()` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `onOptionsItemSelected(MenuItem menuItem)` → `boolean`
- `com/didjdk/adbhelper/FastbootActivity.java`: `onReceive(Context context, Intent intent)` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `onRequestPermissionsResult(int i, String[] strArr, int[] iArr)` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `run()` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `run()` → `void`
- `com/didjdk/adbhelper/FastbootActivity.java`: `run()` → `void`
- `com/didjdk/adbhelper/FeedbackActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/FilePickerActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `m3029x()` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `m3030y()` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `m3031z(int i)` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `mo2186c()` → `int`
- `com/didjdk/adbhelper/MainActivity.java`: `onActivityResult(int i, int i2, Intent intent)` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `onBackPressed()` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `onClick(View view)` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `onConfigurationChanged(Configuration configuration)` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `onCreateOptionsMenu(Menu menu)` → `boolean`
- `com/didjdk/adbhelper/MainActivity.java`: `onDestroy()` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `onKeyDown(int i, KeyEvent keyEvent)` → `boolean`
- `com/didjdk/adbhelper/MainActivity.java`: `onReceive(Context context, Intent intent)` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `onSaveInstanceState(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/MainActivity.java`: `onStop()` → `void`
- `com/didjdk/adbhelper/RemoteActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/SettingsActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/UnlockActivity.java`: `checkClientTrusted(X509Certificate[] x509CertificateArr, String str)` → `void`
- `com/didjdk/adbhelper/UnlockActivity.java`: `checkServerTrusted(X509Certificate[] x509CertificateArr, String str)` → `void`
- `com/didjdk/adbhelper/UnlockActivity.java`: `getAcceptedIssuers()` → `X509Certificate[]`
- `com/didjdk/adbhelper/UnlockActivity.java`: `m3036x(String str)` → `String`
- `com/didjdk/adbhelper/UnlockActivity.java`: `m3037y(String str)` → `void`
- `com/didjdk/adbhelper/UnlockActivity.java`: `m3038z(HttpsURLConnection httpsURLConnection)` → `void`
- `com/didjdk/adbhelper/UnlockActivity.java`: `onCreate(Bundle bundle)` → `void`
- `com/didjdk/adbhelper/UnlockActivity.java`: `onOptionsItemSelected(MenuItem menuItem)` → `boolean`
- `p006b/p067s/C0535m.java`: `m1954J(Context context)` → `boolean`
- `p006b/p067s/C0535m.java`: `m1955K(String str, String str2)` → `boolean`
- `p006b/p067s/C0535m.java`: `m1956L(Context context)` → `String`
- `p006b/p067s/C0535m.java`: `m1957a(int i, byte[] bArr)` → `byte[]`
- `p006b/p067s/C0535m.java`: `m1964h(Context context, boolean z, int i, String str)` → `boolean`
- `p006b/p067s/C0535m.java`: `m1975s(String str)` → `void`
- `p006b/p067s/C0535m.java`: `m1980x(Context context)` → `String`
- `p080c/p081a/p082a/p083a/C0614a.java`: `m2193g(StringBuilder sb, String str, RunnableC0964q3 runnableC0964q3)` → `void`
- `p080c/p113c/p114a/C0906f0.java`: `handleMessage(Message message)` → `boolean`
- `p080c/p113c/p114a/C0965r.java`: `handleMessage(Message message)` → `boolean`
- `p080c/p113c/p114a/C0979t3.java`: `m2631a(C0979t3 c0979t3)` → `void`
- `p080c/p113c/p114a/C0979t3.java`: `m2632b(UsbEndpoint usbEndpoint, byte[] bArr, int i)` → `void`
- `p080c/p113c/p114a/C0979t3.java`: `m2633c()` → `void`
- `p080c/p113c/p114a/C0979t3.java`: `m2634d()` → `void`
- `p080c/p113c/p114a/C0979t3.java`: `m2635e()` → `void`
- `p080c/p113c/p114a/C0979t3.java`: `m2636f(String str)` → `void`
- `p080c/p113c/p114a/C0979t3.java`: `m2637g(String str, ByteBuffer byteBuffer)` → `void`
- `p080c/p113c/p114a/C0979t3.java`: `m2638h(byte[] bArr)` → `void`
- `p080c/p113c/p114a/C0979t3.java`: `m2639i(byte[] bArr)` → `void`
- `p080c/p113c/p114a/RunnableC0964q3.java`: `m2625a()` → `void`
- `p080c/p113c/p114a/RunnableC0964q3.java`: `m2626b()` → `void`
- `p080c/p113c/p114a/RunnableC0964q3.java`: `m2627c(String str)` → `void`
- `p080c/p113c/p114a/RunnableC0964q3.java`: `m2628d()` → `void`
- `p080c/p113c/p114a/RunnableC0964q3.java`: `m2629e()` → `void`
- `p080c/p113c/p114a/RunnableC0964q3.java`: `run()` → `void`
- `p080c/p113c/p114a/RunnableC0969r3.java`: `run()` → `void`
- `p080c/p113c/p114a/RunnableC0974s3.java`: `run()` → `void`
- `p080c/p113c/p114a/ViewOnClickListenerC0893c2.java`: `run()` → `void`
- `p080c/p113c/p114a/ViewOnClickListenerC0966r0.java`: `onClick(View view)` → `void`
- `p080c/p113c/p114a/ViewOnClickListenerC0967r1.java`: `onClick(View view)` → `void`
- `p080c/p113c/p114a/ViewOnClickListenerC1132x1.java`: `run()` → `void`
- `p080c/p113c/p114a/p116v3/AbstractC1002g0.java`: `m2646G0()` → `MainActivity`
- `p080c/p113c/p114a/p116v3/p117i0/C1022q.java`: `m2652c(RunnableC0964q3 runnableC0964q3)` → `void`
- `p080c/p113c/p114a/p116v3/p117i0/C1023r.java`: `m2659O0(boolean z)` → `void`
- `p080c/p113c/p114a/p116v3/p117i0/C1023r.java`: `mo2640a(int i)` → `void`
- `p080c/p113c/p114a/p116v3/p117i0/C1023r.java`: `mo282O(Menu menu, MenuInflater menuInflater)` → `void`
- `p080c/p113c/p114a/p124x3/C1134a.java`: `m2687a(String str)` → `String`
- `p080c/p113c/p114a/p124x3/C1134a.java`: `m2688b(Context context)` → `void`
- `p080c/p113c/p114a/p124x3/C1139f.java`: `m2694a(String str)` → `String`
- `p080c/p113c/p114a/p124x3/C1139f.java`: `m2695b()` → `String`
- `p080c/p113c/p114a/p124x3/C1139f.java`: `toString()` → `String`
- `p080c/p113c/p114a/p124x3/C1140g.java`: `m2696a(String str)` → `byte[]`

## 大型 JNI 函数初筛

### ARM64
- `Java_com_didjdk_adbhelper_ConnectActivity_onCreate__Landroid_os_Bundle_2` size=26292 bytes
- `Java_com_didjdk_adbhelper_MainActivity_onActivityResult__IILandroid_content_Intent_2` size=22316 bytes
- `Java_com_didjdk_adbhelper_FastbootActivity_onCreate__Landroid_os_Bundle_2` size=21432 bytes
- `Java_c_c_a_f0_handleMessage__Landroid_os_Message_2` size=19124 bytes
- `Java_c_c_a_z1_run__` size=17076 bytes
- `Java_com_didjdk_adbhelper_MainActivity_onCreate__Landroid_os_Bundle_2` size=16272 bytes
- `Java_c_c_a_t3_d__` size=15560 bytes
- `Java_c_c_a_i2_run__` size=15220 bytes
- `Java_com_didjdk_adbhelper_RemoteActivity_onCreate__Landroid_os_Bundle_2` size=13956 bytes
- `Java_com_didjdk_adbhelper_ConnectActivity_onOptionsItemSelected__Landroid_view_MenuItem_2` size=11616 bytes
- `Java_com_didjdk_adbhelper_FastbootActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` size=11348 bytes
- `Java_c_c_a_r_handleMessage__Landroid_os_Message_2` size=11336 bytes
- `Java_c_c_a_x3_g_a__Ljava_lang_String_2` size=9924 bytes
- `Java_com_didjdk_adbhelper_ConnectActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` size=9800 bytes
- `Java_com_didjdk_adbhelper_UnlockActivity_onCreate__Landroid_os_Bundle_2` size=8512 bytes

### ARM32
- `Java_com_didjdk_adbhelper_ConnectActivity_onCreate__Landroid_os_Bundle_2` size=21972 bytes
- `Java_com_didjdk_adbhelper_MainActivity_onActivityResult__IILandroid_content_Intent_2` size=18296 bytes
- `Java_com_didjdk_adbhelper_FastbootActivity_onCreate__Landroid_os_Bundle_2` size=18036 bytes
- `Java_c_c_a_f0_handleMessage__Landroid_os_Message_2` size=16184 bytes
- `Java_com_didjdk_adbhelper_MainActivity_onCreate__Landroid_os_Bundle_2` size=13572 bytes
- `Java_c_c_a_z1_run__` size=13380 bytes
- `Java_c_c_a_t3_d__` size=12456 bytes
- `Java_c_c_a_i2_run__` size=12316 bytes
- `Java_com_didjdk_adbhelper_RemoteActivity_onCreate__Landroid_os_Bundle_2` size=11804 bytes
- `Java_com_didjdk_adbhelper_ConnectActivity_onOptionsItemSelected__Landroid_view_MenuItem_2` size=10216 bytes
- `Java_c_c_a_r_handleMessage__Landroid_os_Message_2` size=9108 bytes
- `Java_com_didjdk_adbhelper_FastbootActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` size=8828 bytes
- `Java_c_c_a_x3_g_a__Ljava_lang_String_2` size=7732 bytes
- `Java_com_didjdk_adbhelper_ConnectActivity_00024d_onReceive__Landroid_content_Context_2Landroid_content_Intent_2` size=7412 bytes
- `Java_com_didjdk_adbhelper_UnlockActivity_onCreate__Landroid_os_Bundle_2` size=7260 bytes

## 反汇编观察（已验证）

- ARM64 库可以由 LLVM objdump 正常解析为 AArch64 指令。
- `FastbootActivity_A__` 入口处存在较长函数体，涉及 JNI 字段解析、虚函数/接口调用及分支检查；这类入口不能简单当作单一命令包装。
- 动态依赖只显示 `liblog.so`、`libc.so`、`libm.so`、`libstdc++.so`、`libdl.so`；未看到单独依赖的 adb/fastboot共享库。
- Native 字符串表未检出大量明文 ADB/Fastboot 指令，当前不能据字符串缺失推断业务功能缺失。
- 仍需以完整反汇编、调用图、JNI 字段/方法解析及运行时行为逐步重建；本轮未生成伪造 C/C++ 源码。

## 函数样本反汇编

### Java_com_didjdk_adbhelper_FastbootActivity_A__
```asm
<Java_com_didjdk_adbhelper_FastbootActivity_A__>:
   e9b9c:      	sub	sp, sp, #0x180
   e9ba0:      	stp	x28, x25, [sp, #0x130]
   e9ba4:      	stp	x24, x23, [sp, #0x140]
   e9ba8:      	stp	x22, x21, [sp, #0x150]
   e9bac:      	stp	x20, x19, [sp, #0x160]
   e9bb0:      	stp	x29, x30, [sp, #0x170]
   e9bb4:      	add	x29, sp, #0x170
   e9bb8:      	mrs	x8, TPIDR_EL0
   e9bbc:      	ldr	x8, [x8, #0x28]
   e9bc0:      	mov	x19, x0
   e9bc4:      	stur	x8, [x29, #-0x48]
   e9bc8:      	stp	xzr, xzr, [x29, #-0x70]
   e9bcc:      	stp	xzr, xzr, [x29, #-0x80]
   e9bd0:      	stp	xzr, xzr, [x29, #-0x90]
   e9bd4:      	stp	xzr, xzr, [x29, #-0xa0]
   e9bd8:      	stp	xzr, xzr, [x29, #-0xb0]
   e9bdc:      	stp	xzr, xzr, [sp, #0xb0]
   e9be0:      	stp	xzr, xzr, [sp, #0xa0]
   e9be4:      	stp	xzr, xzr, [sp, #0x90]
   e9be8:      	stp	xzr, xzr, [sp, #0x80]
   e9bec:      	stp	xzr, xzr, [sp, #0x70]
   e9bf0:      	stp	xzr, xzr, [sp, #0x60]
   e9bf4:      	stp	xzr, xzr, [sp, #0x50]
   e9bf8:      	stp	xzr, xzr, [sp, #0x40]
   e9bfc:      	stp	xzr, xzr, [sp, #0x30]
   e9c00:      	stp	xzr, xzr, [sp, #0x20]
   e9c04:      	stp	xzr, xzr, [sp, #0x10]
   e9c08:      	str	xzr, [sp, #0x8]
   e9c0c:      	ldr	x8, [x19]
   e9c10:      	ldr	x8, [x8, #0xc8]
   e9c14:      	blr	x8
   e9c18:      	mov	x20, x0
   e9c1c:      	cbz	x20, 0xea9a8 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe0c>
   e9c20:      	adrp	x4, 0x1be000
   e9c24:      	adrp	x5, 0x1be000
   e9c28:      	adrp	x6, 0x1be000
   e9c2c:      	add	x4, x4, #0xe70
   e9c30:      	add	x5, x5, #0xe98
   e9c34:      	add	x6, x6, #0xea0
   e9c38:      	sub	x1, x29, #0x68
   e9c3c:      	sub	x2, x29, #0xb0
   e9c40:      	mov	x0, x19
   e9c44:      	mov	w3, wzr
   e9c48:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   e9c4c:      	tbnz	w0, #0x0, 0xea9c0 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe24>
   e9c50:      	ldr	x8, [x19]
   e9c54:      	ldur	x2, [x29, #-0xb0]
   e9c58:      	mov	x0, x19
   e9c5c:      	mov	x1, x20
   e9c60:      	ldr	x8, [x8, #0x2f8]
   e9c64:      	blr	x8
   e9c68:      	ldr	x8, [x19]
   e9c6c:      	mov	x21, x0
   e9c70:      	mov	x0, x19
   e9c74:      	ldr	x8, [x8, #0x720]
   e9c78:      	blr	x8
   e9c7c:      	and	w8, w0, #0xff
   e9c80:      	cbnz	w8, 0xea9c0 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe24>
   e9c84:      	cbz	x21, 0xea9a8 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe0c>
   e9c88:      	ldr	x2, [sp, #0x90]
   e9c8c:      	cbnz	x2, 0xe9cc4 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0x128>
   e9c90:      	adrp	x4, 0x1be000
   e9c94:      	adrp	x5, 0x1be000
   e9c98:      	adrp	x6, 0x1be000
   e9c9c:      	add	x4, x4, #0xec0
   e9ca0:      	add	x5, x5, #0xed8
   e9ca4:      	add	x6, x6, #0xee0
   e9ca8:      	sub	x1, x29, #0x70
   e9cac:      	add	x2, sp, #0x90
   e9cb0:      	mov	x0, x19
   e9cb4:      	mov	w3, wzr
   e9cb8:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   e9cbc:      	tbnz	w0, #0x0, 0xea9c0 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe24>
   e9cc0:      	ldr	x2, [sp, #0x90]
   e9cc4:      	ldr	x8, [x19]
   e9cc8:      	sub	x3, x29, #0x60
   e9ccc:      	mov	x0, x19
   e9cd0:      	mov	x1, x21
   e9cd4:      	ldr	x8, [x8, #0x120]
   e9cd8:      	blr	x8
   e9cdc:      	ldr	x8, [x19]
   e9ce0:      	mov	x22, x0
   e9ce4:      	mov	x0, x19
   e9ce8:      	ldr	x8, [x8, #0x720]
   e9cec:      	blr	x8
   e9cf0:      	and	w8, w0, #0xff
   e9cf4:      	cbnz	w8, 0xea9c0 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe24>
   e9cf8:      	ldr	x8, [x19]
   e9cfc:      	mov	x0, x19
   e9d00:      	mov	x1, x21
   e9d04:      	ldr	x8, [x8, #0xb8]
   e9d08:      	blr	x8
   e9d0c:      	cbz	x22, 0xea9a8 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe0c>
   e9d10:      	ldr	x2, [sp, #0x88]
   e9d14:      	cbnz	x2, 0xe9d4c <Java_com_didjdk_adbhelper_FastbootActivity_A__+0x1b0>
   e9d18:      	adrp	x4, 0x1be000
   e9d1c:      	adrp	x5, 0x1be000
   e9d20:      	adrp	x6, 0x1be000
   e9d24:      	add	x4, x4, #0xf00
   e9d28:      	add	x5, x5, #0xf14
   e9d2c:      	add	x6, x6, #0xf20
   e9d30:      	sub	x1, x29, #0x78
   e9d34:      	add	x2, sp, #0x88
   e9d38:      	mov	x0, x19
   e9d3c:      	mov	w3, wzr
   e9d40:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   e9d44:      	tbnz	w0, #0x0, 0xea9c0 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe24>
   e9d48:      	ldr	x2, [sp, #0x88]
   e9d4c:      	ldr	x8, [x19]
   e9d50:      	sub	x3, x29, #0x60
   e9d54:      	mov	x0, x19
   e9d58:      	mov	x1, x22
   e9d5c:      	ldr	x8, [x8, #0x120]
   e9d60:      	blr	x8
   e9d64:      	ldr	x8, [x19]
   e9d68:      	mov	x21, x0
   e9d6c:      	mov	x0, x19
   e9d70:      	ldr	x8, [x8, #0x720]
   e9d74:      	blr	x8
   e9d78:      	and	w8, w0, #0xff
   e9d7c:      	cbnz	w8, 0xea9c0 <Java_com_didjdk_adbhelper_FastbootActivity_A__+0xe24>
   e9d80:      	ldr	x8, [x19]
   e9d84:   
```

### Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2
```asm
<Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2>:
   eda00:      	sub	sp, sp, #0xb0
   eda04:      	stp	x28, x27, [sp, #0x50]
   eda08:      	stp	x26, x25, [sp, #0x60]
   eda0c:      	stp	x24, x23, [sp, #0x70]
   eda10:      	stp	x22, x21, [sp, #0x80]
   eda14:      	stp	x20, x19, [sp, #0x90]
   eda18:      	stp	x29, x30, [sp, #0xa0]
   eda1c:      	add	x29, sp, #0xa0
   eda20:      	mrs	x8, TPIDR_EL0
   eda24:      	ldr	x8, [x8, #0x28]
   eda28:      	mov	x19, x0
   eda2c:      	mov	x20, x2
   eda30:      	str	x8, [sp, #0x48]
   eda34:      	stp	xzr, xzr, [sp, #0x30]
   eda38:      	stp	xzr, xzr, [sp, #0x20]
   eda3c:      	stp	xzr, xzr, [sp, #0x10]
   eda40:      	str	xzr, [sp, #0x8]
   eda44:      	ldr	x8, [x19]
   eda48:      	ldr	x8, [x8, #0xc8]
   eda4c:      	blr	x8
   eda50:      	ldr	x8, [x19]
   eda54:      	mov	x0, x19
   eda58:      	mov	x1, x20
   eda5c:      	ldr	x8, [x8, #0xc8]
   eda60:      	blr	x8
   eda64:      	mov	x20, x0
   eda68:      	cbz	x20, 0xede54 <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x454>
   eda6c:      	adrp	x4, 0x1bf000
   eda70:      	adrp	x5, 0x1bf000
   eda74:      	adrp	x6, 0x1bf000
   eda78:      	add	x4, x4, #0x260
   eda7c:      	add	x5, x5, #0x280
   eda80:      	add	x6, x6, #0x294
   eda84:      	add	x1, sp, #0x38
   eda88:      	add	x2, sp, #0x28
   eda8c:      	mov	x0, x19
   eda90:      	mov	w3, wzr
   eda94:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   eda98:      	mov	w8, w0
   eda9c:      	mov	w0, wzr
   edaa0:      	tbnz	w8, #0x0, 0xede58 <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x458>
   edaa4:      	ldr	x8, [x19]
   edaa8:      	ldr	x2, [sp, #0x28]
   edaac:      	add	x3, sp, #0x40
   edab0:      	mov	x0, x19
   edab4:      	ldr	x8, [x8, #0x198]
   edab8:      	mov	x1, x20
   edabc:      	blr	x8
   edac0:      	ldr	x8, [x19]
   edac4:      	mov	w21, w0
   edac8:      	mov	x0, x19
   edacc:      	ldr	x8, [x8, #0x720]
   edad0:      	blr	x8
   edad4:      	and	w8, w0, #0xff
   edad8:      	cmp	w21, #0x1
   edadc:      	ccmp	w8, #0x0, #0x0, ge
   edae0:      	mov	w0, wzr
   edae4:      	b.ne	0xede58 <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x458>
   edae8:      	orr	w8, wzr, #0x1
   edaec:      	cbz	w8, 0xede58 <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x458>
   edaf0:      	adrp	x25, 0x1bf000
   edaf4:      	adrp	x26, 0x1bf000
   edaf8:      	adrp	x27, 0x1bf000
   edafc:      	mov	w28, #0x11260000        // =287703040
   edb00:      	mov	w22, wzr
   edb04:      	mov	x23, xzr
   edb08:      	add	x25, x25, #0x2e0
   edb0c:      	add	x26, x26, #0x310
   edb10:      	add	x27, x27, #0x294
   edb14:      	movk	w28, #0x4de9
   edb18:      	ldr	x2, [sp, #0x20]
   edb1c:      	mov	x24, x23
   edb20:      	cbnz	x2, 0xedb58 <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x158>
   edb24:      	adrp	x4, 0x1bf000
   edb28:      	adrp	x5, 0x1bf000
   edb2c:      	adrp	x6, 0x1bf000
   edb30:      	add	x1, sp, #0x38
   edb34:      	add	x2, sp, #0x20
   edb38:      	mov	x0, x19
   edb3c:      	mov	w3, wzr
   edb40:      	add	x4, x4, #0x260
   edb44:      	add	x5, x5, #0x298
   edb48:      	add	x6, x6, #0x2b0
   edb4c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   edb50:      	tbnz	w0, #0x0, 0xede54 <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x454>
   edb54:      	ldr	x2, [sp, #0x20]
   edb58:      	str	w22, [sp, #0x40]
   edb5c:      	ldr	x8, [x19]
   edb60:      	add	x3, sp, #0x40
   edb64:      	mov	x0, x19
   edb68:      	mov	x1, x20
   edb6c:      	ldr	x8, [x8, #0x120]
   edb70:      	blr	x8
   edb74:      	ldr	x8, [x19]
   edb78:      	mov	x23, x0
   edb7c:      	mov	x0, x19
   edb80:      	ldr	x8, [x8, #0x720]
   edb84:      	blr	x8
   edb88:      	and	w8, w0, #0xff
   edb8c:      	cbnz	w8, 0xede54 <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x454>
   edb90:      	cbz	x24, 0xedba8 <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x1a8>
   edb94:      	ldr	x8, [x19]
   edb98:      	mov	x0, x19
   edb9c:      	mov	x1, x24
   edba0:      	ldr	x8, [x8, #0xb8]
   edba4:      	blr	x8
   edba8:      	cbz	x23, 0xede3c <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x43c>
   edbac:      	ldr	x2, [sp, #0x18]
   edbb0:      	cbnz	x2, 0xedbdc <Java_com_didjdk_adbhelper_FastbootActivity_B__Landroid_hardware_usb_UsbDevice_2+0x1dc>
   edbb4:      	add	x1, sp, #0x30
   edbb8:      	add	x2, sp, #0x18
   edbbc:      	mov	x0, x19
   edbc0:      	mov	w3, wzr
   edbc4:      	mov	x4, x25
   edbc8:      	mov	x5, x26
   edbcc:      	mov	x6, x27
   edbd0:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
 
```

### Java_com_didjdk_adbhelper_FastbootActivity_E___3BI
```asm
<Java_com_didjdk_adbhelper_FastbootActivity_E___3BI>:
   f4a50:      	sub	sp, sp, #0xe0
   f4a54:      	stp	x24, x23, [sp, #0xa0]
   f4a58:      	stp	x22, x21, [sp, #0xb0]
   f4a5c:      	stp	x20, x19, [sp, #0xc0]
   f4a60:      	stp	x29, x30, [sp, #0xd0]
   f4a64:      	add	x29, sp, #0xd0
   f4a68:      	mrs	x8, TPIDR_EL0
   f4a6c:      	ldr	x8, [x8, #0x28]
   f4a70:      	mov	x19, x0
   f4a74:      	mov	w22, w3
   f4a78:      	mov	x21, x2
   f4a7c:      	stur	x8, [x29, #-0x38]
   f4a80:      	stp	xzr, xzr, [x29, #-0x60]
   f4a84:      	stp	xzr, xzr, [sp, #0x60]
   f4a88:      	stp	xzr, xzr, [sp, #0x50]
   f4a8c:      	stp	xzr, xzr, [sp, #0x40]
   f4a90:      	stp	xzr, xzr, [sp, #0x30]
   f4a94:      	stp	xzr, xzr, [sp, #0x20]
   f4a98:      	stp	xzr, xzr, [sp, #0x10]
   f4a9c:      	str	xzr, [sp, #0x8]
   f4aa0:      	ldr	x8, [x19]
   f4aa4:      	ldr	x8, [x8, #0xc8]
   f4aa8:      	blr	x8
   f4aac:      	ldr	x8, [x19]
   f4ab0:      	mov	x20, x0
   f4ab4:      	mov	x0, x19
   f4ab8:      	mov	x1, x21
   f4abc:      	ldr	x8, [x8, #0xc8]
   f4ac0:      	blr	x8
   f4ac4:      	adrp	x2, 0x1bf000
   f4ac8:      	mov	x21, x0
   f4acc:      	add	x2, x2, #0x910
   f4ad0:      	sub	x1, x29, #0x58
   f4ad4:      	mov	x0, x19
   f4ad8:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
   f4adc:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4ae0:      	ldr	x8, [x19]
   f4ae4:      	ldur	x1, [x29, #-0x58]
   f4ae8:      	mov	x0, x19
   f4aec:      	ldr	x8, [x8, #0xd8]
   f4af0:      	blr	x8
   f4af4:      	ldr	x8, [x19]
   f4af8:      	mov	x23, x0
   f4afc:      	mov	x0, x19
   f4b00:      	ldr	x8, [x8, #0x720]
   f4b04:      	blr	x8
   f4b08:      	and	w8, w0, #0xff
   f4b0c:      	cbz	w8, 0xf4b3c <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xec>
   f4b10:      	mrs	x8, TPIDR_EL0
   f4b14:      	ldr	x8, [x8, #0x28]
   f4b18:      	ldur	x9, [x29, #-0x38]
   f4b1c:      	cmp	x8, x9
   f4b20:      	b.ne	0xf50e8 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x698>
   f4b24:      	ldp	x29, x30, [sp, #0xd0]
   f4b28:      	ldp	x20, x19, [sp, #0xc0]
   f4b2c:      	ldp	x22, x21, [sp, #0xb0]
   f4b30:      	ldp	x24, x23, [sp, #0xa0]
   f4b34:      	add	sp, sp, #0xe0
   f4b38:      	ret
   f4b3c:      	cbz	x23, 0xf50cc <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x67c>
   f4b40:      	ldr	x2, [sp, #0x40]
   f4b44:      	cbnz	x2, 0xf4b7c <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x12c>
   f4b48:      	adrp	x4, 0x1bf000
   f4b4c:      	adrp	x5, 0x1bf000
   f4b50:      	adrp	x6, 0x1bf000
   f4b54:      	add	x4, x4, #0x910
   f4b58:      	add	x5, x5, #0x968
   f4b5c:      	add	x6, x6, #0x970
   f4b60:      	sub	x1, x29, #0x58
   f4b64:      	add	x2, sp, #0x40
   f4b68:      	mov	x0, x19
   f4b6c:      	mov	w3, wzr
   f4b70:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4b74:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4b78:      	ldr	x2, [sp, #0x40]
   f4b7c:      	stur	x21, [x29, #-0x50]
   f4b80:      	stur	wzr, [x29, #-0x48]
   f4b84:      	stur	w22, [x29, #-0x40]
   f4b88:      	ldr	x8, [x19]
   f4b8c:      	sub	x3, x29, #0x50
   f4b90:      	mov	x0, x19
   f4b94:      	mov	x1, x23
   f4b98:      	ldr	x8, [x8, #0x1f8]
   f4b9c:      	blr	x8
   f4ba0:      	ldr	x8, [x19]
   f4ba4:      	mov	x0, x19
   f4ba8:      	ldr	x8, [x8, #0x720]
   f4bac:      	blr	x8
   f4bb0:      	and	w8, w0, #0xff
   f4bb4:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4bb8:      	ldr	x2, [sp, #0x38]
   f4bbc:      	cbnz	x2, 0xf4bf4 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x1a4>
   f4bc0:      	adrp	x4, 0x1bf000
   f4bc4:      	adrp	x5, 0x1bf000
   f4bc8:      	adrp	x6, 0x1bf000
   f4bcc:      	add	x4, x4, #0x980
   f4bd0:      	add	x5, x5, #0x994
   f4bd4:      	add	x6, x6, #0x9a0
   f4bd8:      	sub	x1, x29, #0x60
   f4bdc:      	add	x2, sp, #0x38
   f4be0:      	orr	w3, wzr, #0x1
   f4be4:      	mov	x0, x19
   f4be8:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4bec:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4bf0:      	ldr	x2, [sp, #0x38]
   f4bf4:      	mov	w8, #-0x5db50000        // =-1572143104
   f4bf8:      	movk	w8, #0xf275
   f4bfc:      	sub	w9, w22, w8
   f4c00:      	add	w9, w9, #0x8
   f4c04:      	add	w8, w9, w8
   f4c08:      	stur	w8, [x29, #-0x50]
   f4c0c:      	ldr	x8, [x19]
   f4c10:      	ldur	x1, [x29, #-0x60]
   f4c14:      	sub	x3, x29, #0x50
   f4c18:      	mov	x0, x19
   f4c1c:      	ldr	x8, [x8, #0x3a0]
   f4c20:      	blr	x8
   f4c24:      	ldr	x8, [x19]
   f4c28:      	mov	x24, x0
   f4c2c:      	mov	x0, x19
   f4c30:      	ldr	x8, [x8, #0x720]
   f4c34:      	blr	x8
   f4c38:      	and	w8, w0, #0xff
   f4c3c:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
  
```

### Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2
```asm
<Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2>:
   ab144:      	sub	sp, sp, #0xb0
   ab148:      	stp	x28, x27, [sp, #0x50]
   ab14c:      	stp	x26, x25, [sp, #0x60]
   ab150:      	stp	x24, x23, [sp, #0x70]
   ab154:      	stp	x22, x21, [sp, #0x80]
   ab158:      	stp	x20, x19, [sp, #0x90]
   ab15c:      	stp	x29, x30, [sp, #0xa0]
   ab160:      	add	x29, sp, #0xa0
   ab164:      	mrs	x8, TPIDR_EL0
   ab168:      	ldr	x8, [x8, #0x28]
   ab16c:      	mov	x19, x0
   ab170:      	mov	x20, x2
   ab174:      	str	x8, [sp, #0x48]
   ab178:      	stp	xzr, xzr, [sp, #0x30]
   ab17c:      	stp	xzr, xzr, [sp, #0x20]
   ab180:      	stp	xzr, xzr, [sp, #0x10]
   ab184:      	str	xzr, [sp, #0x8]
   ab188:      	ldr	x8, [x19]
   ab18c:      	ldr	x8, [x8, #0xc8]
   ab190:      	blr	x8
   ab194:      	ldr	x8, [x19]
   ab198:      	mov	x0, x19
   ab19c:      	mov	x1, x20
   ab1a0:      	ldr	x8, [x8, #0xc8]
   ab1a4:      	blr	x8
   ab1a8:      	mov	x20, x0
   ab1ac:      	cbz	x20, 0xab464 <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x320>
   ab1b0:      	adrp	x4, 0x1ba000
   ab1b4:      	adrp	x5, 0x1ba000
   ab1b8:      	adrp	x6, 0x1ba000
   ab1bc:      	add	x4, x4, #0x840
   ab1c0:      	add	x5, x5, #0x860
   ab1c4:      	add	x6, x6, #0x874
   ab1c8:      	add	x1, sp, #0x38
   ab1cc:      	add	x2, sp, #0x28
   ab1d0:      	mov	x0, x19
   ab1d4:      	mov	w3, wzr
   ab1d8:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   ab1dc:      	mov	w8, w0
   ab1e0:      	mov	w0, wzr
   ab1e4:      	tbnz	w8, #0x0, 0xab468 <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x324>
   ab1e8:      	ldr	x8, [x19]
   ab1ec:      	ldr	x2, [sp, #0x28]
   ab1f0:      	add	x3, sp, #0x40
   ab1f4:      	mov	x0, x19
   ab1f8:      	ldr	x8, [x8, #0x198]
   ab1fc:      	mov	x1, x20
   ab200:      	blr	x8
   ab204:      	ldr	x8, [x19]
   ab208:      	mov	w21, w0
   ab20c:      	mov	x0, x19
   ab210:      	ldr	x8, [x8, #0x720]
   ab214:      	blr	x8
   ab218:      	and	w8, w0, #0xff
   ab21c:      	cmp	w21, #0x1
   ab220:      	ccmp	w8, #0x0, #0x0, ge
   ab224:      	mov	w0, wzr
   ab228:      	b.ne	0xab468 <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x324>
   ab22c:      	orr	w8, wzr, #0x1
   ab230:      	cbz	w8, 0xab468 <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x324>
   ab234:      	adrp	x23, 0x1ba000
   ab238:      	adrp	x24, 0x1ba000
   ab23c:      	adrp	x25, 0x1ba000
   ab240:      	adrp	x27, 0x1ba000
   ab244:      	mov	w22, wzr
   ab248:      	mov	x28, xzr
   ab24c:      	add	x23, x23, #0x878
   ab250:      	add	x24, x24, #0x890
   ab254:      	add	x25, x25, #0x8c0
   ab258:      	add	x27, x27, #0x874
   ab25c:      	ldr	x2, [sp, #0x20]
   ab260:      	mov	x26, x28
   ab264:      	cbnz	x2, 0xab294 <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x150>
   ab268:      	adrp	x4, 0x1ba000
   ab26c:      	add	x1, sp, #0x38
   ab270:      	add	x2, sp, #0x20
   ab274:      	mov	x0, x19
   ab278:      	mov	w3, wzr
   ab27c:      	add	x4, x4, #0x840
   ab280:      	mov	x5, x23
   ab284:      	mov	x6, x24
   ab288:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   ab28c:      	tbnz	w0, #0x0, 0xab464 <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x320>
   ab290:      	ldr	x2, [sp, #0x20]
   ab294:      	str	w22, [sp, #0x40]
   ab298:      	ldr	x8, [x19]
   ab29c:      	add	x3, sp, #0x40
   ab2a0:      	mov	x0, x19
   ab2a4:      	mov	x1, x20
   ab2a8:      	ldr	x8, [x8, #0x120]
   ab2ac:      	blr	x8
   ab2b0:      	ldr	x8, [x19]
   ab2b4:      	mov	x28, x0
   ab2b8:      	mov	x0, x19
   ab2bc:      	ldr	x8, [x8, #0x720]
   ab2c0:      	blr	x8
   ab2c4:      	and	w8, w0, #0xff
   ab2c8:      	cbnz	w8, 0xab464 <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x320>
   ab2cc:      	cbz	x26, 0xab2e4 <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x1a0>
   ab2d0:      	ldr	x8, [x19]
   ab2d4:      	mov	x0, x19
   ab2d8:      	mov	x1, x26
   ab2dc:      	ldr	x8, [x8, #0xb8]
   ab2e0:      	blr	x8
   ab2e4:      	cbz	x28, 0xab44c <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x308>
   ab2e8:      	ldr	x2, [sp, #0x18]
   ab2ec:      	cbnz	x2, 0xab31c <Java_com_didjdk_adbhelper_ConnectActivity_A__Landroid_hardware_usb_UsbDevice_2+0x1d8>
   ab2f0:      	adrp	x5, 0x1ba000
   ab2f4:      	add	x1, sp, #0x30
   ab2f8:      	add	x2, sp, #0x18
   ab2fc:      	mov	x0, x19
   ab300:      	mov	w3, wzr
   ab304:      	mov	x4, x25
   ab308:      	add	x5, x5, #0x8f0
   ab30c:      	mov	x6, x27
   ab310:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   ab314:      	tbnz	w0, #0x0, 0xab464 <Java_com_didjdk_adbhelper_Connect
```

### Java_com_didjdk_adbhelper_ConnectActivity_B__
```asm
<Java_com_didjdk_adbhelper_ConnectActivity_B__>:
   ac29c:      	sub	sp, sp, #0x110
   ac2a0:      	stp	x28, x27, [sp, #0xb0]
   ac2a4:      	stp	x26, x25, [sp, #0xc0]
   ac2a8:      	stp	x24, x23, [sp, #0xd0]
   ac2ac:      	stp	x22, x21, [sp, #0xe0]
   ac2b0:      	stp	x20, x19, [sp, #0xf0]
   ac2b4:      	stp	x29, x30, [sp, #0x100]
   ac2b8:      	add	x29, sp, #0x100
   ac2bc:      	mrs	x8, TPIDR_EL0
   ac2c0:      	ldr	x8, [x8, #0x28]
   ac2c4:      	mov	x19, x0
   ac2c8:      	stur	x8, [x29, #-0x58]
   ac2cc:      	stp	xzr, xzr, [x29, #-0x78]
   ac2d0:      	stp	xzr, xzr, [sp, #0x78]
   ac2d4:      	stp	xzr, xzr, [sp, #0x68]
   ac2d8:      	stp	xzr, xzr, [sp, #0x58]
   ac2dc:      	stp	xzr, xzr, [sp, #0x48]
   ac2e0:      	stp	xzr, xzr, [sp, #0x38]
   ac2e4:      	stp	xzr, xzr, [sp, #0x28]
   ac2e8:      	stp	xzr, xzr, [sp, #0x18]
   ac2ec:      	stp	xzr, xzr, [sp, #0x8]
   ac2f0:      	ldr	x8, [x19]
   ac2f4:      	ldr	x8, [x8, #0xc8]
   ac2f8:      	blr	x8
   ac2fc:      	adrp	x2, 0x1ba000
   ac300:      	mov	x21, x0
   ac304:      	add	x2, x2, #0x950
   ac308:      	sub	x1, x29, #0x70
   ac30c:      	mov	x0, x19
   ac310:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
   ac314:      	tbnz	w0, #0x0, 0xaca40 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x7a4>
   ac318:      	ldr	x8, [x19]
   ac31c:      	ldur	x1, [x29, #-0x70]
   ac320:      	mov	x0, x19
   ac324:      	ldr	x8, [x8, #0xd8]
   ac328:      	blr	x8
   ac32c:      	ldr	x8, [x19]
   ac330:      	mov	x20, x0
   ac334:      	mov	x0, x19
   ac338:      	ldr	x8, [x8, #0x720]
   ac33c:      	blr	x8
   ac340:      	and	w8, w0, #0xff
   ac344:      	cbnz	w8, 0xaca40 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x7a4>
   ac348:      	cbz	x20, 0xaca28 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x78c>
   ac34c:      	ldr	x2, [sp, #0x48]
   ac350:      	cbnz	x2, 0xac388 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0xec>
   ac354:      	adrp	x4, 0x1ba000
   ac358:      	adrp	x5, 0x1ba000
   ac35c:      	adrp	x6, 0x1ba000
   ac360:      	add	x4, x4, #0x950
   ac364:      	add	x5, x5, #0x9a8
   ac368:      	add	x6, x6, #0x9b0
   ac36c:      	sub	x1, x29, #0x70
   ac370:      	add	x2, sp, #0x48
   ac374:      	mov	x0, x19
   ac378:      	mov	w3, wzr
   ac37c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   ac380:      	tbnz	w0, #0x0, 0xaca40 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x7a4>
   ac384:      	ldr	x2, [sp, #0x48]
   ac388:      	ldr	x8, [x19]
   ac38c:      	sub	x3, x29, #0x68
   ac390:      	mov	x0, x19
   ac394:      	mov	x1, x20
   ac398:      	ldr	x8, [x8, #0x1f8]
   ac39c:      	blr	x8
   ac3a0:      	ldr	x8, [x19]
   ac3a4:      	mov	x0, x19
   ac3a8:      	ldr	x8, [x8, #0x720]
   ac3ac:      	blr	x8
   ac3b0:      	and	w8, w0, #0xff
   ac3b4:      	cbnz	w8, 0xaca40 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x7a4>
   ac3b8:      	cbz	x21, 0xaca28 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x78c>
   ac3bc:      	ldr	x2, [sp, #0x58]
   ac3c0:      	cbnz	x2, 0xac3f8 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x15c>
   ac3c4:      	adrp	x4, 0x1ba000
   ac3c8:      	adrp	x5, 0x1ba000
   ac3cc:      	adrp	x6, 0x1ba000
   ac3d0:      	add	x4, x4, #0x9c0
   ac3d4:      	add	x5, x5, #0x9e8
   ac3d8:      	add	x6, x6, #0x9f0
   ac3dc:      	sub	x1, x29, #0x78
   ac3e0:      	add	x2, sp, #0x58
   ac3e4:      	mov	x0, x19
   ac3e8:      	mov	w3, wzr
   ac3ec:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   ac3f0:      	tbnz	w0, #0x0, 0xaca40 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x7a4>
   ac3f4:      	ldr	x2, [sp, #0x58]
   ac3f8:      	ldr	x8, [x19]
   ac3fc:      	mov	x0, x19
   ac400:      	mov	x1, x21
   ac404:      	ldr	x8, [x8, #0x2f8]
   ac408:      	blr	x8
   ac40c:      	ldr	x8, [x19]
   ac410:      	mov	x23, x0
   ac414:      	mov	x0, x19
   ac418:      	ldr	x8, [x8, #0x720]
   ac41c:      	blr	x8
   ac420:      	and	w8, w0, #0xff
   ac424:      	cbnz	w8, 0xaca40 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x7a4>
   ac428:      	cbz	x23, 0xaca28 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x78c>
   ac42c:      	ldr	x2, [sp, #0x40]
   ac430:      	cbnz	x2, 0xac468 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x1cc>
   ac434:      	adrp	x4, 0x1ba000
   ac438:      	adrp	x5, 0x1ba000
   ac43c:      	adrp	x6, 0x1ba000
   ac440:      	add	x4, x4, #0xa04
   ac444:      	add	x5, x5, #0xa14
   ac448:      	add	x6, x6, #0xa20
   ac44c:      	add	x1, sp, #0x80
   ac450:      	add	x2, sp, #0x40
   ac454:      	mov	x0, x19
   ac458:      	mov	w3, wzr
   ac45c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   ac460:      	tbnz	w0, #0x0, 0xaca40 <Java_com_didjdk_adbhelper_ConnectActivity_B__+0x7a4>
   ac464:      	ldr	x2, [sp, #0x40]
   ac468:      	ldr	x8, [x19]
   ac46c:      	sub	x3, x29, #0x68
   ac470:      	mov	x0, x19
   ac474:      	mov	x1, x23
   ac478:     
```

### Java_com_didjdk_adbhelper_MainActivity_x__
```asm
<Java_com_didjdk_adbhelper_MainActivity_x__>:
  140ee0:      	sub	sp, sp, #0xd0
  140ee4:      	stp	x24, x23, [sp, #0x90]
  140ee8:      	stp	x22, x21, [sp, #0xa0]
  140eec:      	stp	x20, x19, [sp, #0xb0]
  140ef0:      	stp	x29, x30, [sp, #0xc0]
  140ef4:      	add	x29, sp, #0xc0
  140ef8:      	mrs	x8, TPIDR_EL0
  140efc:      	ldr	x8, [x8, #0x28]
  140f00:      	mov	x19, x0
  140f04:      	stur	x8, [x29, #-0x38]
  140f08:      	stp	xzr, xzr, [x29, #-0x58]
  140f0c:      	stp	xzr, xzr, [sp, #0x58]
  140f10:      	stp	xzr, xzr, [sp, #0x48]
  140f14:      	stp	xzr, xzr, [sp, #0x38]
  140f18:      	stp	xzr, xzr, [sp, #0x28]
  140f1c:      	stp	xzr, xzr, [sp, #0x18]
  140f20:      	stp	xzr, xzr, [sp, #0x8]
  140f24:      	str	xzr, [sp]
  140f28:      	ldr	x8, [x19]
  140f2c:      	ldr	x8, [x8, #0xc8]
  140f30:      	blr	x8
  140f34:      	adrp	x2, 0x1c4000
  140f38:      	mov	x21, x0
  140f3c:      	add	x2, x2, #0x570
  140f40:      	sub	x1, x29, #0x50
  140f44:      	mov	x0, x19
  140f48:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
  140f4c:      	tbnz	w0, #0x0, 0x1415a4 <Java_com_didjdk_adbhelper_MainActivity_x__+0x6c4>
  140f50:      	ldr	x8, [x19]
  140f54:      	ldur	x1, [x29, #-0x50]
  140f58:      	mov	x0, x19
  140f5c:      	ldr	x8, [x8, #0xd8]
  140f60:      	blr	x8
  140f64:      	ldr	x8, [x19]
  140f68:      	mov	x20, x0
  140f6c:      	mov	x0, x19
  140f70:      	ldr	x8, [x8, #0x720]
  140f74:      	blr	x8
  140f78:      	and	w8, w0, #0xff
  140f7c:      	cbnz	w8, 0x1415a4 <Java_com_didjdk_adbhelper_MainActivity_x__+0x6c4>
  140f80:      	cbz	x20, 0x14158c <Java_com_didjdk_adbhelper_MainActivity_x__+0x6ac>
  140f84:      	ldr	x2, [sp, #0x38]
  140f88:      	cbnz	x2, 0x140fc0 <Java_com_didjdk_adbhelper_MainActivity_x__+0xe0>
  140f8c:      	adrp	x4, 0x1c4000
  140f90:      	adrp	x5, 0x1c4000
  140f94:      	adrp	x6, 0x1c4000
  140f98:      	add	x4, x4, #0x570
  140f9c:      	add	x5, x5, #0x5b8
  140fa0:      	add	x6, x6, #0x5c0
  140fa4:      	sub	x1, x29, #0x50
  140fa8:      	add	x2, sp, #0x38
  140fac:      	mov	x0, x19
  140fb0:      	mov	w3, wzr
  140fb4:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
  140fb8:      	tbnz	w0, #0x0, 0x1415a4 <Java_com_didjdk_adbhelper_MainActivity_x__+0x6c4>
  140fbc:      	ldr	x2, [sp, #0x38]
  140fc0:      	stur	x21, [x29, #-0x48]
  140fc4:      	ldr	x8, [x19]
  140fc8:      	sub	x3, x29, #0x48
  140fcc:      	mov	x0, x19
  140fd0:      	mov	x1, x20
  140fd4:      	ldr	x8, [x8, #0x1f8]
  140fd8:      	blr	x8
  140fdc:      	ldr	x8, [x19]
  140fe0:      	mov	x0, x19
  140fe4:      	ldr	x8, [x8, #0x720]
  140fe8:      	blr	x8
  140fec:      	and	w8, w0, #0xff
  140ff0:      	cbnz	w8, 0x1415a4 <Java_com_didjdk_adbhelper_MainActivity_x__+0x6c4>
  140ff4:      	cbz	x21, 0x14158c <Java_com_didjdk_adbhelper_MainActivity_x__+0x6ac>
  140ff8:      	ldr	x2, [sp, #0x30]
  140ffc:      	cbnz	x2, 0x141034 <Java_com_didjdk_adbhelper_MainActivity_x__+0x154>
  141000:      	adrp	x4, 0x1c4000
  141004:      	adrp	x5, 0x1c4000
  141008:      	adrp	x6, 0x1c4000
  14100c:      	add	x4, x4, #0x5e0
  141010:      	add	x5, x5, #0x5f8
  141014:      	add	x6, x6, #0x610
  141018:      	sub	x1, x29, #0x58
  14101c:      	add	x2, sp, #0x30
  141020:      	mov	x0, x19
  141024:      	mov	w3, wzr
  141028:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
  14102c:      	tbnz	w0, #0x0, 0x1415a4 <Java_com_didjdk_adbhelper_MainActivity_x__+0x6c4>
  141030:      	ldr	x2, [sp, #0x30]
  141034:      	mov	w24, #0x7f110000        // =2131820544
  141038:      	movk	w24, #0x35
  14103c:      	add	w8, w24, #0xef
  141040:      	stur	w8, [x29, #-0x48]
  141044:      	ldr	x8, [x19]
  141048:      	sub	x3, x29, #0x48
  14104c:      	mov	x0, x19
  141050:      	mov	x1, x21
  141054:      	ldr	x8, [x8, #0x120]
  141058:      	blr	x8
  14105c:      	ldr	x8, [x19]
  141060:      	mov	x23, x0
  141064:      	mov	x0, x19
  141068:      	ldr	x8, [x8, #0x720]
  14106c:      	blr	x8
  141070:      	and	w8, w0, #0xff
  141074:      	cbnz	w8, 0x1415a4 <Java_com_didjdk_adbhelper_MainActivity_x__+0x6c4>
  141078:      	ldr	x2, [sp, #0x28]
  14107c:      	cbnz	x2, 0x1410b4 <Java_com_didjdk_adbhelper_MainActivity_x__+0x1d4>
  141080:      	adrp	x4, 0x1c4000
  141084:      	adrp	x5, 0x1c4000
  141088:      	adrp	x6, 0x1c4000
  14108c:      	add	x4, x4, #0x570
  141090:      	add	x5, x5, #0x628
  141094:      	add	x6, x6, #0x630
  141098:      	sub	x1, x29, #0x50
  14109c:      	add	x2, sp, #0x28
  1410a0:      	mov	x0, x19
  1410a4:      	mov	w3, wzr
  1410a8:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
  1410ac:      	tbnz	w0, #0x0, 0x1415a4 <Java_com_didjdk_adbhelper_MainActivity_x__+0x6c4>
  1410b0:      	ldr	x2, [sp, #0x28]
  1410b4:      	stur	x23, [x29, #-0x48]
  1410b8:      	ldr	x8, [x19]
  1410bc:      	sub	x3, x29, #0x48
  1410c0:      	mov	x0, x19
  1410c4:    
```

### Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2
```asm
<Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2>:
  15d3ec:      	sub	sp, sp, #0x140
  15d3f0:      	stp	x28, x27, [sp, #0xe0]
  15d3f4:      	stp	x26, x25, [sp, #0xf0]
  15d3f8:      	stp	x24, x23, [sp, #0x100]
  15d3fc:      	stp	x22, x21, [sp, #0x110]
  15d400:      	stp	x20, x19, [sp, #0x120]
  15d404:      	stp	x29, x30, [sp, #0x130]
  15d408:      	add	x29, sp, #0x130
  15d40c:      	mrs	x8, TPIDR_EL0
  15d410:      	ldr	x8, [x8, #0x28]
  15d414:      	mov	x19, x0
  15d418:      	mov	x20, x2
  15d41c:      	stur	x8, [x29, #-0x58]
  15d420:      	stp	xzr, xzr, [x29, #-0x70]
  15d424:      	stp	xzr, xzr, [x29, #-0x80]
  15d428:      	stp	xzr, xzr, [x29, #-0x90]
  15d42c:      	stp	xzr, xzr, [sp, #0x90]
  15d430:      	stp	xzr, xzr, [sp, #0x80]
  15d434:      	stp	xzr, xzr, [sp, #0x70]
  15d438:      	stp	xzr, xzr, [sp, #0x60]
  15d43c:      	stp	xzr, xzr, [sp, #0x50]
  15d440:      	stp	xzr, xzr, [sp, #0x40]
  15d444:      	stp	xzr, xzr, [sp, #0x30]
  15d448:      	stp	xzr, xzr, [sp, #0x20]
  15d44c:      	stp	xzr, xzr, [sp, #0x10]
  15d450:      	str	xzr, [sp, #0x8]
  15d454:      	ldr	x8, [x19]
  15d458:      	ldr	x8, [x8, #0xc8]
  15d45c:      	blr	x8
  15d460:      	ldr	x8, [x19]
  15d464:      	mov	x21, x0
  15d468:      	mov	x0, x19
  15d46c:      	mov	x1, x20
  15d470:      	ldr	x8, [x8, #0xc8]
  15d474:      	blr	x8
  15d478:      	adrp	x2, 0x1c6000
  15d47c:      	mov	x22, x0
  15d480:      	add	x2, x2, #0x150
  15d484:      	sub	x1, x29, #0x68
  15d488:      	mov	x0, x19
  15d48c:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
  15d490:      	mov	x23, xzr
  15d494:      	tbnz	w0, #0x0, 0x15d4c8 <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0xdc>
  15d498:      	ldr	x8, [x19]
  15d49c:      	ldur	x1, [x29, #-0x68]
  15d4a0:      	mov	x0, x19
  15d4a4:      	ldr	x8, [x8, #0xd8]
  15d4a8:      	blr	x8
  15d4ac:      	ldr	x8, [x19]
  15d4b0:      	mov	x23, x0
  15d4b4:      	mov	x0, x19
  15d4b8:      	ldr	x8, [x8, #0x720]
  15d4bc:      	blr	x8
  15d4c0:      	and	w8, w0, #0xff
  15d4c4:      	cbz	w8, 0x15d7bc <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x3d0>
  15d4c8:      	ldr	x8, [x19]
  15d4cc:      	mov	x0, x19
  15d4d0:      	ldr	x8, [x8, #0x78]
  15d4d4:      	blr	x8
  15d4d8:      	ldr	x8, [x19]
  15d4dc:      	mov	x21, x0
  15d4e0:      	mov	x0, x19
  15d4e4:      	ldr	x8, [x8, #0x88]
  15d4e8:      	blr	x8
  15d4ec:      	adrp	x2, 0x1c6000
  15d4f0:      	add	x2, x2, #0x460
  15d4f4:      	mov	x0, x19
  15d4f8:      	mov	x1, x21
  15d4fc:      	bl	0xe0f0 <_Z18d2c_is_instance_ofP7_JNIEnvP8_jobjectPKc@plt>
  15d500:      	tbz	w0, #0x0, 0x15d724 <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x338>
  15d504:      	cbz	x23, 0x15d51c <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x130>
  15d508:      	ldr	x8, [x19]
  15d50c:      	mov	x0, x19
  15d510:      	mov	x1, x23
  15d514:      	ldr	x8, [x8, #0xb8]
  15d518:      	blr	x8
  15d51c:      	cbz	x22, 0x15d534 <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x148>
  15d520:      	ldr	x8, [x19]
  15d524:      	mov	x0, x19
  15d528:      	mov	x1, x22
  15d52c:      	ldr	x8, [x8, #0xb8]
  15d530:      	blr	x8
  15d534:      	ldr	x8, [x19]
  15d538:      	mov	x0, x19
  15d53c:      	mov	x1, xzr
  15d540:      	ldr	x8, [x8, #0xc8]
  15d544:      	blr	x8
  15d548:      	ldr	x8, [x19]
  15d54c:      	mov	x20, x0
  15d550:      	mov	x0, x19
  15d554:      	mov	x1, x20
  15d558:      	ldr	x8, [x8, #0xc8]
  15d55c:      	blr	x8
  15d560:      	mov	x22, x0
  15d564:      	cbz	x21, 0x15dd08 <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x91c>
  15d568:      	ldr	x2, [sp, #0x8]
  15d56c:      	cbnz	x2, 0x15d5a4 <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x1b8>
  15d570:      	adrp	x4, 0x1c6000
  15d574:      	adrp	x5, 0x1c6000
  15d578:      	adrp	x6, 0x1c6000
  15d57c:      	add	x4, x4, #0x460
  15d580:      	add	x5, x5, #0x440
  15d584:      	add	x6, x6, #0x398
  15d588:      	add	x1, sp, #0x90
  15d58c:      	add	x2, sp, #0x8
  15d590:      	mov	x0, x19
  15d594:      	mov	w3, wzr
  15d598:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
  15d59c:      	tbnz	w0, #0x0, 0x15dd20 <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x934>
  15d5a0:      	ldr	x2, [sp, #0x8]
  15d5a4:      	ldr	x8, [x19]
  15d5a8:      	sub	x3, x29, #0x60
  15d5ac:      	mov	x0, x19
  15d5b0:      	mov	x1, x21
  15d5b4:      	ldr	x8, [x8, #0x1f8]
  15d5b8:      	blr	x8
  15d5bc:      	ldr	x8, [x19]
  15d5c0:      	mov	x0, x19
  15d5c4:      	ldr	x8, [x8, #0x720]
  15d5c8:      	blr	x8
  15d5cc:      	and	w8, w0, #0xff
  15d5d0:      	cbnz	w8, 0x15dd20 <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x934>
  15d5d4:      	cbz	x22, 0x15d8fc <Java_com_didjdk_adbhelper_UnlockActivity_x__Ljava_lang_String_2+0x510>
  15d5d8:      	ldr	x2, [s
```
