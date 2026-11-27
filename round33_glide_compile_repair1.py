#!/usr/bin/env python3
"""Round 33 compile repairs for the adbtool decompiled Android project.

Run from repository root:
  python3 round33_glide_compile_repair1.py . --check-only
  python3 round33_glide_compile_repair1.py .

All edits are planned and validated in memory before any file is written.
Backups are written to .round33-backup/ (outside Android source/resource trees).
"""
from __future__ import annotations
import argparse
import re
import shutil
import sys
from pathlib import Path

BACKUP_DIR = ".round33-backup"

class PatchError(RuntimeError):
    pass


def balanced_end(text: str, start: int, left: str = "{", right: str = "}") -> int:
    depth = 0
    quote = None
    escaped = False
    line_comment = False
    block_comment = False
    i = start
    while i < len(text):
        ch = text[i]
        nxt = text[i + 1] if i + 1 < len(text) else ""
        if line_comment:
            if ch == "\n": line_comment = False
        elif block_comment:
            if ch == "*" and nxt == "/": block_comment = False; i += 1
        elif quote:
            if escaped: escaped = False
            elif ch == "\\": escaped = True
            elif ch == quote: quote = None
        elif ch == "/" and nxt == "/": line_comment = True; i += 1
        elif ch == "/" and nxt == "*": block_comment = True; i += 1
        elif ch in ('"', "'"): quote = ch
        elif ch == left: depth += 1
        elif ch == right:
            depth -= 1
            if depth == 0: return i
        i += 1
    raise PatchError(f"unbalanced {left}{right} at offset {start}")


def replace_method(text: str, signature: str, replacement: str) -> tuple[str, bool]:
    pos = text.find(signature)
    if pos < 0:
        # Idempotency: an already applied replacement starts with its new method signature.
        new_sig = replacement.strip().splitlines()[0].strip()
        if new_sig and new_sig in text:
            return text, False
        raise PatchError(f"method anchor not found: {signature}")
    brace = text.find("{", pos)
    if brace < 0: raise PatchError(f"opening brace not found: {signature}")
    end = balanced_end(text, brace)
    return text[:pos] + replacement + text[end + 1:], True


def replace_once(text: str, old: str, new: str, label: str) -> tuple[str, bool]:
    n = text.count(old)
    if n == 1: return text.replace(old, new, 1), True
    if n == 0 and new in text: return text, False
    raise PatchError(f"{label}: expected one anchor, found {n}")


def add_import(text: str, imp: str) -> str:
    if imp in text: return text
    m = re.search(r"\A(package\s+[^;]+;\s*)", text)
    if not m: raise PatchError("package declaration missing while adding import")
    return text[:m.end()] + "\n" + imp + text[m.end():]


def apply(root: Path, check_only: bool) -> int:
    planned: dict[Path, str] = {}
    changed = 0

    def load(rel: str) -> str:
        p = root / rel
        if p in planned: return planned[p]
        if not p.is_file(): raise PatchError(f"file not found: {rel}")
        return p.read_text(encoding="utf-8")

    def save(rel: str, old: str, new: str) -> None:
        nonlocal changed
        if new != old:
            planned[root / rel] = new
            changed += 1

    # --- Base Glide contracts: checked I/O is part of the real API contract. ---
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/InterfaceC0636d.java"
    s = load(rel)
    s2 = s.replace("boolean mo2279a(T t, File file, C0647o c0647o);", "boolean mo2279a(T t, File file, C0647o c0647o) throws java.io.IOException;")
    if s2 == s and "mo2279a(T t, File file, C0647o c0647o) throws java.io.IOException" not in s:
        raise PatchError("InterfaceC0636d method contract anchor not found")
    save(rel, s, s2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/InterfaceC0649q.java"
    s = load(rel)
    s2 = s.replace("InterfaceC0719w<Z> mo2287a(T t, int i, int i2, C0647o c0647o);", "InterfaceC0719w<Z> mo2287a(T t, int i, int i2, C0647o c0647o) throws java.io.IOException;")
    if s2 == s and "mo2287a(T t, int i, int i2, C0647o c0647o) throws java.io.IOException" not in s:
        raise PatchError("InterfaceC0649q method contract anchor not found")
    save(rel, s, s2)

    for rel, old, new, label in [
        ("app/src/main/java/p080c/p084b/p085a/p088m/InterfaceC0643k.java",
         "int mo2281a(ImageHeaderParser imageHeaderParser);",
         "int mo2281a(ImageHeaderParser imageHeaderParser) throws java.io.IOException;", "InterfaceC0643k"),
        ("app/src/main/java/p080c/p084b/p085a/p088m/InterfaceC0644l.java",
         "ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser);",
         "ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser) throws java.io.IOException;", "InterfaceC0644l"),
    ]:
        s = load(rel); s2 = s.replace(old, new)
        if s2 == s and new not in s: raise PatchError(f"{label} contract anchor not found")
        save(rel, s, s2)

    # Round32 added an override annotation inside the original annotation block.
    rel = "app/src/main/java/p006b/p008b/p018i/C0291w.java"
    s = load(rel)
    if "public void mo1138a(int i)" not in s:
        raise PatchError("C0291w Round32 spinner callback was not inserted")
    if "public void mo1138a(int i)" in s:
        pat = re.compile(r"(?m)(?:^[ \t]*@Override[^\n]*\n|^[ \t]*/\* JADX INFO: renamed d \*/[^\n]*\n|^[ \t]*\n)+(?=[ \t]*public void mo1138a\(int i\))")
        s2, n = pat.subn("        @Override // p006b.p008b.p018i.C0291w.f\n", s, count=1)
        if n == 0:
            # The already-normalized form is acceptable only if exactly one annotation precedes this method.
            m = re.search(r"(?s)(.{0,180})public void mo1138a\(int i\)", s)
            if not m or len(re.findall(r"@Override", m.group(1))) != 1:
                raise PatchError("C0291w duplicate-Override anchor not found")
            s2 = s
        block = re.compile(r"(?m)((?:^[ \t]*@Override[^\n]*\n|^[ \t]*/\* JADX INFO: renamed d \*/[^\n]*\n|^[ \t]*\n)+)(?=[ \t]*public void mo1138a\(int i\))")
        m = block.search(s2)
        if not m or len(re.findall(r"@Override", m.group(1))) != 1:
            raise PatchError("C0291w spinner callback still has duplicate/missing @Override")
        save(rel, s, s2)

    # Correct Round32's accidental View-protected call: measurement is a LayoutManager method.
    for rel in [
        "app/src/main/java/androidx/recyclerview/widget/GridLayoutManager.java",
        "app/src/main/java/androidx/recyclerview/widget/StaggeredGridLayoutManager.java",
    ]:
        s = load(rel)
        s2, n = re.subn(r"this\.f959b\.setMeasuredDimension\(iM562h, iM562h2\);", "setMeasuredDimension(iM562h, iM562h2);", s, count=1)
        if n == 0 and "setMeasuredDimension(iM562h, iM562h2);" not in s:
            raise PatchError(f"LayoutManager measured-dimension anchor not found: {rel}")
        save(rel, s, s2)

    # Context-aware constructors: this subclass also needs to forward XML constructors.
    rel = "app/src/main/java/p080c/p126d/p127a/p128a/p132c0/C1195d.java"
    s = load(rel)
    s2 = add_import(s, "import android.content.Context;")
    s2 = add_import(s2, "import android.util.AttributeSet;")
    if "public C1195d(Context context)" not in s2:
        marker = "public class C1195d extends C1223a {"
        if marker not in s2: raise PatchError("C1195d class anchor not found")
        s2 = s2.replace(marker, marker + "\n    public C1195d(Context context) {\n        super(context);\n    }\n\n    public C1195d(Context context, AttributeSet attrs) {\n        super(context, attrs);\n    }\n", 1)
    save(rel, s, s2)

    # Request target's resource callback is parameterized by R, not Object.
    rel = "app/src/main/java/p080c/p084b/p085a/p107q/C0848h.java"
    s = load(rel)
    s2 = add_import(s, "import p080c.p084b.p085a.p107q.p109k.InterfaceC0860b;")
    s2, _ = replace_once(s2, "this.f4671n.mo2510c(obj, C0859a.f4709a);",
                         "this.f4671n.mo2510c((R) obj, (InterfaceC0860b<? super R>) (InterfaceC0860b<?>) C0859a.f4709a);", "C0848h typed callback")
    save(rel, s, s2)

    # Round32 confused the data-factory interface with InterfaceC0655d's callback alias.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0727e.java"
    s = load(rel)
    s2, _ = replace_once(s, "a<Data> aVar = this.f4295c;",
                         "C0727e.a<Data> aVar = this.f4295c;", "C0727e local factory type")
    save(rel, s, s2)

    # Stream encoder: restore normal IOException cleanup and eliminate invalid exception scopes.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0742t.java"
    s = load(rel)
    method = '''public boolean mo2279a(InputStream inputStream, File file, C0647o c0647o) {
        byte[] buffer = (byte[]) this.f4358a.mo2324e(65536, byte[].class);
        boolean success = false;
        try (FileOutputStream output = new FileOutputStream(file)) {
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                output.write(buffer, 0, read);
            }
            success = true;
        } catch (IOException e) {
            if (Log.isLoggable("StreamEncoder", 3)) {
                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
            }
        } finally {
            this.f4358a.mo2323d(buffer);
        }
        return success;
    }'''
    s2, _ = replace_method(s, "public boolean mo2279a(InputStream inputStream, File file, C0647o c0647o)", method)
    save(rel, s, s2)

    # ByteBuffer encoder catches IOException itself; it must not advertise Throwable.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0725c.java"
    s = load(rel)
    s2 = s.replace("public boolean mo2279a(ByteBuffer byteBuffer, File file, C0647o c0647o) throws Throwable {",
                   "public boolean mo2279a(ByteBuffer byteBuffer, File file, C0647o c0647o) {")
    if s2 == s and "public boolean mo2279a(ByteBuffer byteBuffer, File file, C0647o c0647o) {" not in s:
        raise PatchError("C0725c method signature anchor not found")
    save(rel, s, s2)

    # File loader: the adapter types are static, and its close callback really can throw IOException.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0728f.java"
    s = load(rel)
    s2 = s.replace("public class a implements d<ParcelFileDescriptor>", "public static class a implements d<ParcelFileDescriptor>")
    s2 = s2.replace("public class a implements d<InputStream>", "public static class a implements d<InputStream>")
    s2 = s2.replace("Data mo2434b(File file);", "Data mo2434b(File file) throws FileNotFoundException;")
    s2 = s2.replace("public ParcelFileDescriptor mo2434b(File file) {", "public ParcelFileDescriptor mo2434b(File file) throws FileNotFoundException {")
    s2 = s2.replace("public InputStream mo2434b(File file) {", "public InputStream mo2434b(File file) throws FileNotFoundException {")
    s2 = s2.replace("void mo2435c(Data data);", "void mo2435c(Data data) throws IOException;")
    if "public static class a implements d<ParcelFileDescriptor>" not in s2 or "public static class a implements d<InputStream>" not in s2:
        raise PatchError("C0728f static adapter anchor not found")
    if "Data mo2434b(File file) throws FileNotFoundException;" not in s2:
        raise PatchError("C0728f file-open callback contract anchor not found")
    if "public ParcelFileDescriptor mo2434b(File file) throws FileNotFoundException" not in s2:
        raise PatchError("C0728f ParcelFileDescriptor opener signature patch incomplete")
    if "public InputStream mo2434b(File file) throws FileNotFoundException" not in s2:
        raise PatchError("C0728f InputStream opener signature patch incomplete")
    if "void mo2435c(Data data) throws IOException;" not in s2:
        raise PatchError("C0728f close callback contract anchor not found")
    save(rel, s, s2)

    # Identity loader singleton requires a checked generic cast from its wildcard singleton.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0744v.java"
    s = load(rel)
    s2 = s.replace("return C0744v.f4360a;", "return (C0744v<Model>) (C0744v<?>) C0744v.f4360a;")
    if s2 == s and "return (C0744v<Model>) (C0744v<?>) C0744v.f4360a;" not in s:
        raise PatchError("C0744v singleton return anchor not found")
    save(rel, s, s2)

    # MediaStore loader: make checked exception handling explicit and keep Cursor cleanup structured.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p095v/p096y/C0750d.java"
    s = load(rel)
    method_d = '''public final InterfaceC0655d<DataT> m2449d() throws FileNotFoundException {
            InterfaceC0736n.a<DataT> loadData;
            if (Environment.isExternalStorageLegacy()) {
                Cursor cursor = this.f4384b.getContentResolver().query(this.f4387e, f4383l, null, null, null);
                if (cursor == null) {
                    throw new FileNotFoundException("Failed to query media store entry for: " + this.f4387e);
                }
                try {
                    if (!cursor.moveToFirst()) {
                        throw new FileNotFoundException("Failed to media store entry for: " + this.f4387e);
                    }
                    String path = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                    if (TextUtils.isEmpty(path)) {
                        throw new FileNotFoundException("File path was empty in media store for: " + this.f4387e);
                    }
                    loadData = this.f4385c.mo2426a(new File(path), this.f4388f, this.f4389g, this.f4390h);
                } finally {
                    cursor.close();
                }
            } else {
                Uri uri = this.f4384b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0
                        ? MediaStore.setRequireOriginal(this.f4387e) : this.f4387e;
                loadData = this.f4386d.mo2426a(uri, this.f4388f, this.f4389g, this.f4390h);
            }
            return loadData == null ? null : loadData.f4329c;
        }'''
    s2, _ = replace_method(s, "public final InterfaceC0655d<DataT> m2449d()", method_d)
    method_e = '''public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super DataT> aVar) {
            try {
                InterfaceC0655d<DataT> fetcher = m2449d();
                if (fetcher == null) {
                    aVar.mo2299d(new IllegalArgumentException("Failed to build fetcher for: " + this.f4387e));
                    return;
                }
                this.f4393k = fetcher;
                if (this.f4392j) {
                    cancel();
                } else {
                    fetcher.mo2297e(enumC0620f, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo2299d(e);
            }
        }'''
    s2, _ = replace_method(s2, "public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super DataT> aVar)", method_e)
    save(rel, s, s2)

    # Drawable/file encoders must use InterfaceC0719w<T>, not Object; preserve the resource wrapper.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p102g/C0795d.java"
    s = load(rel)
    method = '''public boolean mo2279a(InterfaceC0719w<C0794c> resource, File file, C0647o c0647o) {
        try {
            C0794c drawable = resource.mo2409b();
            C0866a.m2600b(drawable.f4513b.f4523a.f4525a.mo2268g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }'''
    s2, _ = replace_method(s, "public boolean mo2279a(Object obj, File file, C0647o c0647o)", method)
    save(rel, s, s2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0758c.java"
    s = load(rel)
    s2 = s.replace('new C0646n<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C0646n.f3938e)',
                   'new C0646n<Bitmap.CompressFormat>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C0646n.f3938e)')
    method = '''public boolean mo2279a(InterfaceC0719w<Bitmap> resource, File file, C0647o c0647o) {
        Bitmap bitmap = resource.mo2409b();
        Bitmap.CompressFormat format = (Bitmap.CompressFormat) c0647o.m2285c(f4418c);
        if (format == null) {
            format = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        int quality = ((Integer) c0647o.m2285c(f4417b)).intValue();
        long start = SystemClock.elapsedRealtimeNanos();
        boolean success = false;
        try (OutputStream fileOutput = new FileOutputStream(file);
             OutputStream output = this.f4419a != null ? new C0654c(fileOutput, this.f4419a) : fileOutput) {
            success = bitmap.compress(format, quality, output);
        } catch (IOException e) {
            if (Log.isLoggable("BitmapEncoder", 3)) {
                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
            }
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + format + " of size " + C0875j.m2612d(bitmap)
                    + " in " + C0871f.m2603a(start) + ", options format: " + c0647o.m2285c(f4418c)
                    + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return success;
    }'''
    s2, _ = replace_method(s2, "public boolean mo2279a(Object obj, File file, C0647o c0647o)", method)
    save(rel, s, s2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0756b.java"
    s = load(rel)
    s2 = add_import(s, "import java.io.IOException;")
    method = '''public boolean mo2279a(InterfaceC0719w<BitmapDrawable> resource, File file, C0647o c0647o) throws IOException {
        Bitmap bitmap = resource.mo2409b().getBitmap();
        InterfaceC0719w<Bitmap> bitmapResource = C0761e.m2453f(bitmap, this.f4407a);
        return this.f4408b.mo2279a(bitmapResource, file, c0647o);
    }'''
    s2, _ = replace_method(s2, "public boolean mo2279a(Object obj, File file, C0647o c0647o)", method)
    save(rel, s, s2)

    # Request target callback is strongly typed.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p102g/C0798g.java"
    s = load(rel)
    s2 = s.replace("public void mo2510c(Object obj, InterfaceC0860b interfaceC0860b) {",
                   "public void mo2510c(Bitmap bitmap, InterfaceC0860b<? super Bitmap> interfaceC0860b) {")
    s2 = s2.replace("this.f4545h = (Bitmap) obj;", "this.f4545h = bitmap;")
    if s2 == s and "public void mo2510c(Bitmap bitmap, InterfaceC0860b<? super Bitmap> interfaceC0860b)" not in s:
        raise PatchError("C0798g callback signature anchor not found")
    save(rel, s, s2)

    # InterfaceC0719w is covariant at the value level; implement its declared T return type.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p100e/AbstractC0786b.java"
    s = load(rel)
    method = '''public T mo2409b() {
        Drawable.ConstantState constantState = this.f4500b.getConstantState();
        if (constantState == null) {
            return this.f4500b;
        }
        @SuppressWarnings("unchecked")
        T drawable = (T) constantState.newDrawable();
        return drawable;
    }'''
    s2, _ = replace_method(s, "public Object mo2409b()", method)
    save(rel, s, s2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p100e/C0787c.java"
    s = load(rel)
    s2 = s.replace("return this.f4500b.getClass();", "return (Class<Drawable>) (Class<?>) this.f4500b.getClass();")
    if s2 == s and "return (Class<Drawable>) (Class<?>) this.f4500b.getClass();" not in s:
        raise PatchError("C0787c drawable class cast anchor not found")
    save(rel, s, s2)

    # The Drawable converter needs a typed GIF resource wrapper, not Resource<Drawable>.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p103h/C0804c.java"
    s = load(rel)
    s2 = add_import(s, "import p080c.p084b.p085a.p088m.p097w.p102g.C0796e;")
    s2 = s2.replace("return this.f4558c.mo2512a(interfaceC0719w, c0647o);",
                    "return this.f4558c.mo2512a(new C0796e((C0794c) drawableMo2409b), c0647o);")
    if s2 == s and "new C0796e((C0794c) drawableMo2409b)" not in s:
        raise PatchError("C0804c GIF resource wrapper anchor not found")
    save(rel, s, s2)

    # BitmapDrawable transformation returns a resource whose concrete type is BitmapDrawable.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0771o.java"
    s = load(rel)
    s2 = s.replace("return C0777u.m2489f(context.getResources(), interfaceC0719wMo2290b);",
                   "return (InterfaceC0719w<Drawable>) (InterfaceC0719w<?>) C0777u.m2489f(context.getResources(), interfaceC0719wMo2290b);")
    if s2 == s and "(InterfaceC0719w<Drawable>) (InterfaceC0719w<?>) C0777u.m2489f" not in s:
        raise PatchError("C0771o resource covariance anchor not found")
    save(rel, s, s2)

    # ImageDecoder abstract decoder: helper calls are shadowed by nested class 'a'; return type is Bitmap.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/AbstractC0752a.java"
    s = load(rel)
    s2 = re.sub(r"(?<![\w.])a\.m2191e\(", "new StringBuilder(", s)
    s2 = s2.replace("return new C0761e(bitmapDecodeBitmap, c0760d.f4421b);",
                    "return (InterfaceC0719w<T>) (InterfaceC0719w<?>) new C0761e(bitmapDecodeBitmap, c0760d.f4421b);")
    if s2 == s and "return (InterfaceC0719w<T>) (InterfaceC0719w<?>) new C0761e" not in s:
        raise PatchError("AbstractC0752a Bitmap resource return anchor not found")
    save(rel, s, s2)

    # Data decoder interface permits IO; its parser callback contract must too.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0769m.java"
    s = load(rel)
    s2 = s.replace("public class a implements b {", "public static class a implements b {")
    s2 = s2.replace("void mo2480a(InterfaceC0678d interfaceC0678d, Bitmap bitmap);",
                    "void mo2480a(InterfaceC0678d interfaceC0678d, Bitmap bitmap) throws IOException;")
    s2 = s2.replace(
        "public final InterfaceC0719w<Bitmap> m2477a(InterfaceC0775s interfaceC0775s, int i, int i2, C0647o c0647o, b bVar) {",
        "public final InterfaceC0719w<Bitmap> m2477a(InterfaceC0775s interfaceC0775s, int i, int i2, C0647o c0647o, b bVar) throws IOException {"
    )
    s2 = s2.replace(
        "public InterfaceC0719w<Bitmap> m2478b(InputStream inputStream, int i, int i2, C0647o c0647o, b bVar) {",
        "public InterfaceC0719w<Bitmap> m2478b(InputStream inputStream, int i, int i2, C0647o c0647o, b bVar) throws IOException {"
    )
    s2 = s2.replace(
        "public final android.graphics.Bitmap m2479c(p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s r33, android.graphics.BitmapFactory.Options r34, p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l r35, p080c.p084b.p085a.p088m.EnumC0634b r36, p080c.p084b.p085a.p088m.EnumC0648p r37, boolean r38, int r39, int r40, boolean r41, p080c.p084b.p085a.p088m.p097w.p098c.C0769m.b r42) {",
        "public final android.graphics.Bitmap m2479c(p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s r33, android.graphics.BitmapFactory.Options r34, p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l r35, p080c.p084b.p085a.p088m.EnumC0634b r36, p080c.p084b.p085a.p088m.EnumC0648p r37, boolean r38, int r39, int r40, boolean r41, p080c.p084b.p085a.p088m.p097w.p098c.C0769m.b r42) throws IOException {"
    )
    s2 = re.sub(r"(?<![\w.])a\.m2191e\(", "new StringBuilder(", s2)
    if "m2477a(InterfaceC0775s interfaceC0775s, int i, int i2, C0647o c0647o, b bVar) throws IOException" not in s2:
        raise PatchError("C0769m checked-I/O decoder path patch incomplete")
    if "m2478b(InputStream inputStream, int i, int i2, C0647o c0647o, b bVar) throws IOException" not in s2:
        raise PatchError("C0769m stream decoder signature patch incomplete")
    if "public static class a implements b" not in s2:
        raise PatchError("C0769m static bitmap callback anchor not found")
    if "void mo2480a(InterfaceC0678d interfaceC0678d, Bitmap bitmap) throws IOException;" not in s2:
        raise PatchError("C0769m callback IOException contract anchor not found")
    save(rel, s, s2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0781y.java"
    s = load(rel)
    s2 = s.replace("public InterfaceC0719w<Bitmap> mo2287a(InputStream inputStream, int i, int i2, C0647o c0647o) {",
                   "public InterfaceC0719w<Bitmap> mo2287a(InputStream inputStream, int i, int i2, C0647o c0647o) throws IOException {")
    if s2 == s and "mo2287a(InputStream inputStream, int i, int i2, C0647o c0647o) throws IOException" not in s:
        raise PatchError("C0781y decode signature anchor not found")
    save(rel, s, s2)

    # EXIF parser's internal Reader methods can report I/O; keep byte-buffer parsing safe.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0767k.java"
    s = load(rel)
    s2 = s.replace("int mo2461a();", "int mo2461a() throws IOException;")
    s2 = s2.replace("long mo2462b(long j);", "long mo2462b(long j) throws IOException;")
    s2 = s2.replace("int mo2463c(byte[] bArr, int i);", "int mo2463c(byte[] bArr, int i) throws IOException;")
    s2 = s2.replace("short mo2464d();", "short mo2464d() throws IOException;")
    s2 = s2.replace("public int mo2461a() {\n            return (mo2464d() << 8) | mo2464d();\n        }",
                    "public int mo2461a() throws IOException {\n            return (mo2464d() << 8) | mo2464d();\n        }")
    s2 = s2.replace("public int mo2461a() {\n            return (mo2464d() << 8) | mo2464d();\n        }",
                    "public int mo2461a() throws IOException {\n            return (mo2464d() << 8) | mo2464d();\n        }")
    s2 = s2.replace("public int mo2462b(long j) {", "public int mo2462b(long j) throws IOException {") if False else s2
    s2 = s2.replace("public long mo2462b(long j) {", "public long mo2462b(long j) throws IOException {")
    s2 = s2.replace("public int mo2463c(byte[] bArr, int i) throws c.a {", "public int mo2463c(byte[] bArr, int i) throws IOException {")
    s2 = s2.replace("public short mo2464d() throws c.a {", "public short mo2464d() throws c.a {")
    s2 = s2.replace("public short mo2464d() throws IOException {", "public short mo2464d() throws IOException {")
    # The ByteBuffer parser cannot surface checked I/O; malformed input is an UNKNOWN type.
    s2 = s2.replace("return m2458d(new a(byteBuffer));",
                    "try {\n            return m2458d(new a(byteBuffer));\n        } catch (IOException ignored) {\n            return ImageHeaderParser.ImageType.UNKNOWN;\n        }")
    s2 = s2.replace("public int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b) {",
                    "public int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b) throws IOException {")
    s2 = s2.replace("public ImageHeaderParser.ImageType mo2457c(InputStream inputStream) {",
                    "public ImageHeaderParser.ImageType mo2457c(InputStream inputStream) throws IOException {")
    s2 = s2.replace("public final ImageHeaderParser.ImageType m2458d(c cVar) {",
                    "public final ImageHeaderParser.ImageType m2458d(c cVar) throws IOException {")
    s2 = s2.replace("public final int m2459e(c cVar) {", "public final int m2459e(c cVar) throws IOException {")
    s2 = s2.replace('a.m2198l("Illegal number of bytes for TI tag data tagType=", sM2465a3)',
                    '("Illegal number of bytes for TI tag data tagType=" + sM2465a3)')
    if "int mo2461a() throws IOException;" not in s2 or "short mo2464d() throws IOException;" not in s2:
        raise PatchError("C0767k Reader checked-I/O contract patch incomplete")
    if "mo2457c(InputStream inputStream) throws IOException" not in s2:
        raise PatchError("C0767k InputStream image-type signature patch incomplete")
    for required in (
        "public int mo2461a() throws IOException {",
        "public long mo2462b(long j) throws IOException {",
        "public int mo2463c(byte[] bArr, int i) throws IOException {",
        "public short mo2464d() throws IOException {",
        "public final ImageHeaderParser.ImageType m2458d(c cVar) throws IOException {",
        "public final int m2459e(c cVar) throws IOException {",
    ):
        if required not in s2:
            raise PatchError(f"C0767k checked-I/O implementation anchor missing: {required}")
    save(rel, s, s2)

    # The parser method from the ImageHeaderParser API may throw IOException, never Throwable.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0772p.java"
    s = load(rel)
    s2 = add_import(s, "import java.io.IOException;")
    s2 = s2.replace("public int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b) throws Throwable {",
                    "public int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b) throws IOException {")
    if s2 == s and "mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b) throws IOException" not in s:
        raise PatchError("C0772p method exception anchor not found")
    save(rel, s, s2)

    # Rewind helpers should close the stream and reset the descriptor in a single finally path.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/C0640h.java"
    s = load(rel)
    pat = re.compile(r"(?m)(?:^[ \t]*@Override[^\n]*\n|^[ \t]*/\* JADX INFO: renamed a \*/[^\n]*\n|^[ \t]*\n)+(?=[ \t]*public ImageHeaderParser\.ImageType mo2280a\()")
    s, _ = pat.subn("    @Override // p080c.p084b.p085a.p088m.InterfaceC0644l\n", s, count=1)
    block = re.compile(r"(?m)((?:^[ \t]*@Override[^\n]*\n|^[ \t]*/\* JADX INFO: renamed a \*/[^\n]*\n|^[ \t]*\n)+)(?=[ \t]*public ImageHeaderParser\.ImageType mo2280a\()")
    m = block.search(s)
    if not m or len(re.findall(r"@Override", m.group(1))) != 1:
        raise PatchError("C0640h mo2280a annotation block is not normalized")
    method = '''public ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser) throws IOException {
        C0779w buffered = new C0779w(new FileInputStream(this.f3931a.mo2301a().getFileDescriptor()), this.f3932b);
        try {
            return imageHeaderParser.mo2457c(buffered);
        } finally {
            try {
                buffered.close();
            } finally {
                this.f3931a.mo2301a();
            }
        }
    }'''
    s2, _ = replace_method(s, "public ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser)", method)
    save(rel, s, s2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/C0642j.java"
    s = load(rel)
    method = '''public int mo2281a(ImageHeaderParser imageHeaderParser) throws IOException {
        C0779w buffered = new C0779w(new FileInputStream(this.f3935a.mo2301a().getFileDescriptor()), this.f3936b);
        try {
            return imageHeaderParser.mo2456b(buffered, this.f3936b);
        } finally {
            try {
                buffered.close();
            } finally {
                this.f3935a.mo2301a();
            }
        }
    }'''
    s2, _ = replace_method(s, "public int mo2281a(ImageHeaderParser imageHeaderParser)", method)
    save(rel, s, s2)

    # Remove helper calls shadowed by local/nested class a.
    for rel in [
        "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0739q.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p097w/AbstractC0752a.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0769m.java",
    ]:
        s = load(rel)
        s2 = re.sub(r"(?<![\w.])a\.m2191e\(", "new StringBuilder(", s)
        save(rel, s, s2)

    # Drawable resource generic bridge.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p100e/AbstractC0786b.java"
    s = load(rel)
    if "public Object mo2409b()" in s:
        method = '''public T mo2409b() {
        Drawable.ConstantState constantState = this.f4500b.getConstantState();
        if (constantState == null) return this.f4500b;
        @SuppressWarnings("unchecked")
        T drawable = (T) constantState.newDrawable();
        return drawable;
    }'''
        s2, _ = replace_method(s, "public Object mo2409b()", method)
        save(rel, s, s2)

    # Fix static initialization of stateless callbacks.
    for rel, old, new, label in [
        ("app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0770n.java",
         "public class a extends C0679e", "public static class a extends C0679e", "C0770n static callback"),
        ("app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0769m.java",
         "public class a implements b", "public static class a implements b", "C0769m static callback"),
    ]:
        s = load(rel)
        s2 = s.replace(old, new)
        if s2 == s and new not in s: raise PatchError(f"{label} anchor not found")
        save(rel, s, s2)

    # Hardware-config model blacklist constructor had a stray break outside its loop.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0774r.java"
    s = load(rel)
    ctor = '''public C0774r() {
        int sdk = Build.VERSION.SDK_INT;
        this.f4469e = true;
        this.f4470f = new AtomicBoolean(false);
        boolean excludedModel = false;
        if (sdk == 26) {
            for (String prefix : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
                if (Build.MODEL.startsWith(prefix)) {
                    excludedModel = true;
                    break;
                }
            }
        } else if (sdk == 27) {
            excludedModel = Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
        }
        this.f4465a = !excludedModel;
        if (sdk >= 28) {
            this.f4466b = 20000;
            this.f4467c = 0;
        } else {
            this.f4466b = 700;
            this.f4467c = 128;
        }
    }'''
    s2, _ = replace_method(s, "public C0774r()", ctor)
    save(rel, s, s2)

    # A nested class named `a` shadows the imported c.a.a.a.a string helper in
    # several decompiled Glide classes. The helper m2191e is a StringBuilder
    # factory, so replacing its call with the equivalent constructor is safe.
    source_root = root / "app/src/main/java"
    for java_path in source_root.rglob("*.java"):
        rel = java_path.relative_to(root).as_posix()
        s = load(rel)
        s2 = re.sub(r"(?<![\w.])a\.m2191e\(", "new StringBuilder(", s)
        save(rel, s, s2)

    if check_only:
        print(f"Round33 check-only passed: {len(planned)} file(s), {changed} change(s) validated; no files written.")
        return 0

    # No writes occur until every anchor above has passed validation.
    backup_root = root / BACKUP_DIR
    for path, content in planned.items():
        rel = path.relative_to(root)
        backup = backup_root / rel
        backup.parent.mkdir(parents=True, exist_ok=True)
        if path.exists() and not backup.exists():
            backup.write_bytes(path.read_bytes())
    for path, content in planned.items():
        path.parent.mkdir(parents=True, exist_ok=True)
        path.write_text(content, encoding="utf-8")
    print(f"Round33 applied: {len(planned)} file(s) updated; backups: {BACKUP_DIR}/")
    return 0


def main() -> int:
    ap = argparse.ArgumentParser(description="Round33 Glide/compiler repairs")
    ap.add_argument("root", nargs="?", default=".", help="repository root")
    ap.add_argument("--check-only", action="store_true", help="validate all patches without writing")
    args = ap.parse_args()
    root = Path(args.root).resolve()
    if not (root / "app/src/main/java").is_dir():
        print(f"ERROR: Android source tree not found under {root}", file=sys.stderr)
        return 2
    try:
        return apply(root, args.check_only)
    except (PatchError, OSError, UnicodeError) as exc:
        print(f"Round33 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

if __name__ == "__main__":
    raise SystemExit(main())
