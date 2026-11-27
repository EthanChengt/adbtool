#!/usr/bin/env python3
"""Round 32 Java compile repairs for EthanChengt/adbtool.

Run from the repository root:
    python3 round32_java_compile_fix1.py . --check-only
    python3 round32_java_compile_fix1.py .

The script validates every applicable edit before writing anything, is idempotent,
and stores backups outside Android resource/source folders.
"""
from __future__ import annotations

import argparse
import re
import shutil
import sys
from pathlib import Path
from typing import Callable

BACKUP_DIR = ".round32-backup"

class PatchError(Exception):
    pass


def balanced_end(text: str, open_pos: int, left: str = "(", right: str = ")") -> int:
    depth = 0
    i = open_pos
    quote = None
    escaped = False
    line_comment = False
    block_comment = False
    while i < len(text):
        ch = text[i]
        nxt = text[i + 1] if i + 1 < len(text) else ""
        if line_comment:
            if ch == "\n":
                line_comment = False
        elif block_comment:
            if ch == "*" and nxt == "/":
                block_comment = False
                i += 1
        elif quote:
            if escaped:
                escaped = False
            elif ch == "\\":
                escaped = True
            elif ch == quote:
                quote = None
        elif ch == "/" and nxt == "/":
            line_comment = True
            i += 1
        elif ch == "/" and nxt == "*":
            block_comment = True
            i += 1
        elif ch in ('"', "'"):
            quote = ch
        elif ch == left:
            depth += 1
        elif ch == right:
            depth -= 1
            if depth == 0:
                return i
        i += 1
    raise PatchError(f"unbalanced {left}{right} starting at offset {open_pos}")


def split_args(arg_text: str) -> list[str]:
    parts: list[str] = []
    start = 0
    stack: list[str] = []
    quote = None
    escaped = False
    line_comment = False
    block_comment = False
    i = 0
    pairs = {")": "(", "]": "[", "}": "{"}
    while i < len(arg_text):
        ch = arg_text[i]
        nxt = arg_text[i + 1] if i + 1 < len(arg_text) else ""
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
        elif ch in "([{" : stack.append(ch)
        elif ch in ")]}":
            if stack and stack[-1] == pairs[ch]: stack.pop()
        elif ch == "," and not stack:
            parts.append(arg_text[start:i].strip())
            start = i + 1
        i += 1
    tail = arg_text[start:].strip()
    if tail or parts:
        parts.append(tail)
    return parts


def replace_shadowed_helpers(text: str) -> tuple[str, int]:
    """Replace decompiler string helper invocations shadowed by nested types."""
    total = 0
    pattern = re.compile(r"(?<![\w.])(?:c\.a\.a\.a\.a|a)\.(m2191e|m2201o|m2198l|m2199m)\s*\(")
    while True:
        match = pattern.search(text)
        if not match:
            break
        open_pos = text.find("(", match.start(), match.end())
        end_pos = balanced_end(text, open_pos)
        args = split_args(text[open_pos + 1:end_pos])
        method = match.group(1)
        if method == "m2191e" and len(args) == 1:
            replacement = f"new StringBuilder({args[0]})"
        elif method in ("m2201o", "m2198l", "m2199m") and len(args) == 2:
            replacement = f"(String.valueOf({args[0]}) + String.valueOf({args[1]}))"
        else:
            raise PatchError(f"unsupported helper call {method} with {len(args)} args")
        text = text[:match.start()] + replacement + text[end_pos + 1:]
        total += 1
    return text, total


def replace_method(text: str, signature: str, new_method: str) -> tuple[str, bool]:
    start = text.find(signature)
    if start < 0:
        if new_method.strip() in text:
            return text, False
        raise PatchError(f"method anchor not found: {signature}")
    open_pos = text.find("{", start)
    if open_pos < 0:
        raise PatchError(f"method opening brace not found: {signature}")
    end_pos = balanced_end(text, open_pos, "{", "}")
    return text[:start] + new_method + text[end_pos + 1:], True


def replace_one(text: str, old: str, new: str, label: str, optional_marker: str | None = None) -> tuple[str, bool]:
    count = text.count(old)
    if count == 1:
        return text.replace(old, new, 1), True
    if count == 0 and optional_marker and optional_marker in text:
        return text, False
    if count == 0:
        raise PatchError(f"anchor not found: {label}")
    raise PatchError(f"expected one occurrence for {label}, found {count}")


def import_after_package(text: str, imports: str) -> str:
    if imports.strip() in text:
        return text
    m = re.search(r"\A(package [^;]+;\s*)", text)
    if not m:
        raise PatchError("package declaration not found while adding imports")
    return text[:m.end()] + imports + text[m.end():]


def apply_edits(root: Path, check_only: bool) -> int:
    updates: dict[Path, str] = {}
    changed_count = 0
    helper_files = [
        "app/src/main/java/p006b/p008b/p009c/C0207w.java",
        "app/src/main/java/p006b/p073w/AbstractC0584i.java",
        "app/src/main/java/p006b/p073w/C0590o.java",
        "app/src/main/java/androidx/recyclerview/widget/LinearLayoutManager.java",
        "app/src/main/java/androidx/recyclerview/widget/GridLayoutManager.java",
        "app/src/main/java/androidx/recyclerview/widget/StaggeredGridLayoutManager.java",
        "app/src/main/java/p080c/p084b/p085a/p086k/C0625a.java",
        "app/src/main/java/p080c/p084b/p085a/p107q/C0848h.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p089t/C0661j.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p089t/C0660i.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p089t/C0652a.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p089t/C0665n.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0720x.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p091u/p092c0/C0687m.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p091u/p092c0/C0683i.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p091u/p092c0/C0684j.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0732j.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0733k.java",
    ]

    def load(rel: str) -> str:
        p = root / rel
        if not p.is_file():
            raise PatchError(f"file not found: {rel}")
        return updates.get(p, p.read_text(encoding="utf-8"))

    def save(rel: str, content: str) -> None:
        nonlocal changed_count
        p = root / rel
        if content != load(rel):
            changed_count += 1
            updates[p] = content

    # Fix nested-type shadowing of the generated c.a.a.a.a string helpers.
    for rel in helper_files:
        content = load(rel)
        content2, n = replace_shadowed_helpers(content)
        if n:
            save(rel, content2)

    # C1296g: initialize current state colors before querying state lists.
    rel = "app/src/main/java/p080c/p126d/p127a/p128a/p154x/C1296g.java"
    content = load(rel)
    new_method = '''    public final boolean m2982w(int[] iArr) {
        boolean changed = false;
        int currentFill = this.f6223n.getColor();
        int currentStroke = this.f6224o.getColor();
        if (this.f6211b.f6236d != null) {
            int nextFill = this.f6211b.f6236d.getColorForState(iArr, currentFill);
            if (currentFill != nextFill) {
                this.f6223n.setColor(nextFill);
                changed = true;
            }
        }
        if (this.f6211b.f6237e != null) {
            int nextStroke = this.f6211b.f6237e.getColorForState(iArr, currentStroke);
            if (currentStroke != nextStroke) {
                this.f6224o.setColor(nextStroke);
                changed = true;
            }
        }
        return changed;
    }'''
    content2, did = replace_method(content, "public final boolean m2982w(int[] iArr)", new_method)
    if did: save(rel, content2)

    # Lifecycle collection in Glide manager: provide element type for enhanced for.
    rel = "app/src/main/java/p080c/p084b/p085a/ComponentCallbacks2C0623i.java"
    content = load(rel)
    content2, _ = replace_one(
        content,
        "for (InterfaceC0843c interfaceC0843c : (ArrayList) C0875j.m2613e(c0826r.f4587a))",
        "for (InterfaceC0843c interfaceC0843c : (ArrayList<InterfaceC0843c>) (ArrayList<?>) C0875j.m2613e(c0826r.f4587a))",
        "typed lifecycle collection loop",
        "(ArrayList<InterfaceC0843c>) (ArrayList<?>) C0875j.m2613e(c0826r.f4587a)")
    save(rel, content2)

    # AppCompat Spinner: the inherited ListPopupWindow exposes m1089a as horizontal offset.
    rel = "app/src/main/java/p006b/p008b/p018i/C0291w.java"
    content = load(rel)
    if "public class d extends C0268k0 implements f" in content and "public void mo1138a(int i)" not in content[content.find("public class d extends C0268k0 implements f"):content.find("public static class e")]:
        pos = content.find("        public void mo1141d(int i, int i2) {", content.find("public class d extends C0268k0 implements f"))
        if pos < 0: raise PatchError("C0291w.d mo1141d insertion anchor not found")
        content2 = content[:pos] + '''        @Override // p006b.p008b.p018i.C0291w.f
        public void mo1138a(int i) {
            m1089a(i);
        }

'''+content[pos:]
        save(rel, content2)

    # RecyclerView LayoutManager owns its measured view through f959b.
    for rel in [
        "app/src/main/java/androidx/recyclerview/widget/GridLayoutManager.java",
        "app/src/main/java/androidx/recyclerview/widget/StaggeredGridLayoutManager.java",
    ]:
        content = load(rel)
        content2, n = re.subn(r"(?m)^(\s*)setMeasuredDimension\(iM562h, iM562h2\);", r"\1this.f959b.setMeasuredDimension(iM562h, iM562h2);", content, count=1)
        if n == 0 and "this.f959b.setMeasuredDimension(iM562h, iM562h2);" not in content:
            raise PatchError(f"measured-dimension anchor not found: {rel}")
        save(rel, content2)

    # Material Components reveal views need standard XML constructors.
    rel = "app/src/main/java/p080c/p126d/p127a/p128a/p132c0/C1196e.java"
    content = load(rel)
    content = import_after_package(content, "\nimport android.content.Context;\nimport android.util.AttributeSet;\n")
    if "public C1196e(Context context)" not in content:
        at = content.find("public class C1196e extends C1220b {")
        if at < 0: raise PatchError("C1196e class anchor not found")
        at = content.find("\n", at) + 1
        ctor = ("\n    public C1196e(Context context) {\n"
                "        super(context);\n    }\n\n"
                "    public C1196e(Context context, AttributeSet attrs) {\n"
                "        super(context, attrs);\n    }\n")
        content = content[:at] + ctor + content[at:]
    save(rel, content)

    rel = "app/src/main/java/p080c/p126d/p127a/p128a/p141l/p142e/C1223a.java"
    content = load(rel)
    content = import_after_package(content, "\nimport android.content.Context;\nimport android.util.AttributeSet;\n")
    if "public C1223a(Context context)" not in content:
        at = content.find("public class C1223a extends C1215a implements InterfaceC1222d {")
        if at < 0: raise PatchError("C1223a class anchor not found")
        at = content.find("\n", at) + 1
        content = content[:at] + '''
    public C1223a(Context context) {
        super(context);
    }

    public C1223a(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
'''+content[at:]
    save(rel, content)

    rel = "app/src/main/java/p080c/p126d/p127a/p128a/p141l/C1220b.java"
    content = load(rel)
    content = import_after_package(content, "\nimport android.content.Context;\nimport android.util.AttributeSet;\n")
    if "public C1220b(Context context)" not in content:
        at = content.find("public class C1220b extends FrameLayout implements InterfaceC1222d {")
        if at < 0: raise PatchError("C1220b class anchor not found")
        at = content.find("\n", at) + 1
        content = content[:at] + '''
    public C1220b(Context context) {
        super(context);
    }

    public C1220b(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
'''+content[at:]
    save(rel, content)

    # Strongly type ObjectAnimator's property, evaluator and varargs.
    rel = "app/src/main/java/p080c/p126d/p127a/p128a/C1161a.java"
    content = load(rel)
    pattern = re.compile(r"ObjectAnimator objectAnimatorOfObject = ObjectAnimator\.ofObject\(interfaceC1222d,\s*(?:\(Property<[^>]+>\)\s*)?InterfaceC1222d\.c\.f5848a,\s*(?:\(TypeEvaluator(?:<[^>]+>)?\)\s*)?InterfaceC1222d\.b\.f5846b,\s*(?:\(Object\[\]\)\s*)?new InterfaceC1222d\.e\[\]\s*\{\s*new InterfaceC1222d\.e\(f,\s*f2,\s*f3\)\s*\}\s*\);", re.S)
    replacement = "ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC1222d, InterfaceC1222d.c.f5848a, InterfaceC1222d.b.f5846b, new InterfaceC1222d.e(f, f2, f3));"
    content2, n = pattern.subn(replacement, content, count=1)
    if n == 0 and replacement not in content: raise PatchError("C1161a ObjectAnimator.ofObject anchor not found")
    save(rel, content2)

    # Request callback signature, resource cleanup lock, exception scope and result type.
    rel = "app/src/main/java/p080c/p084b/p085a/p107q/C0848h.java"
    content = load(rel)
    content = content.replace("public void mo2574b(int r25, int r26) throws java.lang.Throwable {", "public void mo2574b(int r25, int r26) {")
    content = content.replace("public void mo2574b(int r25,int r26) throws java.lang.Throwable {", "public void mo2574b(int r25,int r26) {")
    content = content.replace("public void mo2574b(int r25, int r26) throws Throwable {", "public void mo2574b(int r25, int r26) {")
    content = re.sub(r"synchronized\s*\(C0708l\.this\)\s*\{\s*dVar\.f4194a\.m2406h\(dVar\.f4195b\);\s*\}", "dVar.f4194a.m2406h(dVar.f4195b);", content, count=1)
    content = content.replace("} catch (Throwable th2) {\n                    th = th2;\n                }", "} catch (Throwable th2) {\n                    throw th2;\n                }")
    content = content.replace("public final void m2584q(InterfaceC0719w interfaceC0719w, Object obj, EnumC0633a enumC0633a)", "public final void m2584q(InterfaceC0719w interfaceC0719w, R obj, EnumC0633a enumC0633a)")
    content = content.replace("m2584q(interfaceC0719w, objMo2409b, enumC0633a);", "m2584q(interfaceC0719w, (R) objMo2409b, enumC0633a);")
    if "synchronized (C0708l.this)" in content: raise PatchError("C0848h invalid C0708l.this reference remains")
    if "public final void m2584q(InterfaceC0719w interfaceC0719w, Object obj," in content: raise PatchError("C0848h result parameter still Object")
    save(rel, content)

    # Interface declarations must allow their actual checked-IO implementations.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p089t/AbstractC0663l.java"
    content = load(rel)
    content2 = content.replace("public abstract void mo2292d(T t);", "public abstract void mo2292d(T t) throws IOException;")
    content2 = content2.replace("public abstract T mo2293f(Uri uri, ContentResolver contentResolver);", "public abstract T mo2293f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;")
    if content2 == content and ("mo2292d(T t) throws IOException" not in content or "mo2293f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException" not in content):
        raise PatchError("AbstractC0663l abstract method anchors not found")
    save(rel, content2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p089t/AbstractC0653b.java"
    content = load(rel)
    content2 = content.replace("public abstract void mo2296d(T t);", "public abstract void mo2296d(T t) throws IOException;")
    if content2 == content and "mo2296d(T t) throws IOException" not in content: raise PatchError("AbstractC0653b abstract method anchor not found")
    save(rel, content2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/InterfaceC0644l.java"
    content = load(rel)
    content2 = content.replace("ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser);", "ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser) throws java.io.IOException;")
    if content2 == content and "mo2280a(ImageHeaderParser imageHeaderParser) throws java.io.IOException" not in content: raise PatchError("InterfaceC0644l method anchor not found")
    save(rel, content2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/InterfaceC0643k.java"
    content = load(rel)
    content2 = content.replace("int mo2281a(ImageHeaderParser imageHeaderParser);", "int mo2281a(ImageHeaderParser imageHeaderParser) throws java.io.IOException;")
    if content2 == content and "mo2281a(ImageHeaderParser imageHeaderParser) throws java.io.IOException" not in content: raise PatchError("InterfaceC0643k method anchor not found")
    save(rel, content2)

    # Rewrite malformed parcel-file-descriptor parser cleanup with IOException semantics.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/C0640h.java"
    content = load(rel)
    new_method = '''    @Override // p080c.p084b.p085a.p088m.InterfaceC0644l
    public ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser) throws IOException {
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
    content2, did = replace_method(content, "public ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser)", new_method)
    if did: save(rel, content2)

    # Non-static executors were incorrectly created in a static initializer.
    rel = "app/src/main/java/p080c/p084b/p085a/p111s/C0870e.java"
    content = load(rel)
    content2 = content.replace("public class a implements Executor", "public static class a implements Executor")
    content2 = content2.replace("public class b implements Executor", "public static class b implements Executor")
    if content2 == content and ("public static class a implements Executor" not in content or "public static class b implements Executor" not in content):
        raise PatchError("C0870e executor class anchors not found")
    save(rel, content2)

    # Rewrite malformed ByteBuffer file I/O and exception-variable scopes.
    rel = "app/src/main/java/p080c/p084b/p085a/p111s/C0866a.java"
    content = load(rel)
    method_a = '''    public static ByteBuffer m2599a(File file) throws IOException {
        long length = file.length();
        if (length > 2147483647L) {
            throw new IOException("File too large to map into memory");
        }
        if (length == 0) {
            throw new IOException("File unsuitable for memory mapping");
        }
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
             FileChannel channel = randomAccessFile.getChannel()) {
            return channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
        }
    }'''
    method_b = '''    public static void m2600b(ByteBuffer byteBuffer, File file) throws IOException {
        byteBuffer.position(0);
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
             FileChannel channel = randomAccessFile.getChannel()) {
            channel.write(byteBuffer);
            channel.force(false);
        }
    }'''
    c2, d1 = replace_method(content, "public static ByteBuffer m2599a(File file)", method_a)
    c3, d2 = replace_method(c2, "public static void m2600b(ByteBuffer byteBuffer, File file)", method_b)
    if d1 or d2: save(rel, c3)

    # Java protected-member rule: access FilterInputStream.in through this.in.
    for rel in [
        "app/src/main/java/p080c/p084b/p085a/p111s/C0868c.java",
        "app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0779w.java",
    ]:
        content = load(rel)
        content2 = content.replace("((FilterInputStream) this).in", "this.in")
        if content2 == content and "FilterInputStream) this).in" in content:
            raise PatchError(f"FilterInputStream protected field replacement failed: {rel}")
        save(rel, content2)

    # Pool factory interface method signatures are parameterized by List<T>.
    rel = "app/src/main/java/p080c/p084b/p085a/p111s/p112k/C0877b.java"
    content = load(rel)
    content2 = content.replace("public Object mo2363a() {\n        return new ArrayList();", "public List<T> mo2363a() {\n        return new ArrayList<>();")
    if content2 == content and "public List<T> mo2363a()" not in content: raise PatchError("C0877b factory signature anchor not found")
    save(rel, content2)

    rel = "app/src/main/java/p080c/p084b/p085a/p111s/p112k/C0878c.java"
    content = load(rel)
    content2 = content.replace("public void mo2620a(Object obj) {\n        ((List) obj).clear();", "public void mo2620a(List<T> list) {\n        list.clear();")
    if content2 == content and "public void mo2620a(List<T> list)" not in content: raise PatchError("C0878c pool release signature anchor not found")
    save(rel, content2)

    # Checked generic erasure problems in Glide source/fetcher classes.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0671a0.java"
    content = load(rel)
    content2 = content.replace("InterfaceC0655d<Data> interfaceC0655d", "InterfaceC0655d interfaceC0655d")
    if content2 == content and "InterfaceC0655d<Data>" in content: raise PatchError("C0671a0 Data generic replacement failed")
    save(rel, content2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0673b0.java"
    content = load(rel)
    content2 = content.replace("InterfaceC0636d<X> interfaceC0636dM2371e", "InterfaceC0636d interfaceC0636dM2371e")
    if content2 == content and "InterfaceC0636d<X>" in content: raise PatchError("C0673b0 X generic replacement failed")
    save(rel, content2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/p093d0/C0693e.java"
    content = load(rel)
    content2 = content.replace("C0625a.m2240a(C0625a.this, cVarM2247e, true);", "C0625a.m2240a(c0625aM2358c, cVarM2247e, true);")
    if content2 == content and "C0625a.this" in content: raise PatchError("C0693e enclosing C0625a reference not replaced")
    save(rel, content2)

    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0720x.java"
    content = load(rel)
    content2 = content.replace("for (Class cls4 : (ArrayList) c0621g.f3798c.m2540b((Class) it.next(), cls2))", "for (Class<?> cls4 : (ArrayList<Class<?>>) (ArrayList<?>) c0621g.f3798c.m2540b((Class) it.next(), cls2))")
    content2 = content2.replace("InterfaceC0651s<Z> interfaceC0651sM2372f", "InterfaceC0651s interfaceC0651sM2372f")
    if content2 == content and ("for (Class cls4 : (ArrayList)" in content or "InterfaceC0651s<Z>" in content): raise PatchError("C0720x generic class loop/type replacement failed")
    save(rel, content2)

    # Pool key factories must return the concrete pooled key type.
    for rel, old_sig, new_sig, marker in [
        ("app/src/main/java/p080c/p084b/p085a/p088m/p091u/p092c0/C0687m.java", "public InterfaceC0686l mo2325a()", "public b mo2325a()", "public b mo2325a()"),
        ("app/src/main/java/p080c/p084b/p085a/p088m/p091u/p092c0/C0683i.java", "public InterfaceC0686l mo2325a()", "public a mo2325a()", "public a mo2325a()"),
    ]:
        content = load(rel)
        content2 = content.replace(old_sig, new_sig)
        if content2 == content and marker not in content: raise PatchError(f"concrete key factory return type anchor not found: {rel}")
        save(rel, content2)

    # Array-pool generic bridge casts for byte[] and int[] implementations.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/p092c0/C0683i.java"
    content = load(rel)
    content2 = content.replace("InterfaceC0675a<T> interfaceC0675aM2339h = m2339h(cls);", "InterfaceC0675a<T> interfaceC0675aM2339h = (InterfaceC0675a<T>) (InterfaceC0675a<?>) m2339h((Class<T>) cls);")
    content2 = content2.replace("InterfaceC0675a<T> c0680f = (InterfaceC0675a) this.f4014d.get(cls);", "InterfaceC0675a<T> c0680f = (InterfaceC0675a<T>) this.f4014d.get(cls);")
    content2 = content2.replace("c0680f = new C0682h();", "c0680f = (InterfaceC0675a<T>) (InterfaceC0675a<?>) new C0682h();")
    content2 = content2.replace("c0680f = new C0680f();", "c0680f = (InterfaceC0675a<T>) (InterfaceC0675a<?>) new C0680f();")
    if content2 == content and "m2339h((Class<T>) cls)" not in content: raise PatchError("C0683i array pool type inference anchors not found")
    save(rel, content2)

    # LRU cache key generic method must match C0872g<b<A>, B>.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0735m.java"
    content = load(rel)
    content2, _n = re.subn(r"public void mo2360c\(Object obj, Object obj2\)\s*\{\s*b<\?> bVar = \(b\) obj;", "public void mo2360c(b<A> obj, B obj2) {\n            b<?> bVar = obj;", content, count=1)
    if content2 == content and "public void mo2360c(b<A> obj, B obj2)" not in content: raise PatchError("C0735m LRU eviction override anchor not found")
    save(rel, content2)

    # C0727e fetcher data-factory interface was confused with callback interface.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p095v/C0727e.java"
    content = load(rel)
    content2 = content.replace("public final a<Data> f4295c;", "public final C0727e.a<Data> f4295c;")
    content2 = content2.replace("public b(String str, a<Data> aVar)", "public b(String str, C0727e.a<Data> aVar)")
    content2 = content2.replace("Data m2432a(String str);", "Data m2432a(String str);")
    if content2 == content and "public final C0727e.a<Data> f4295c;" not in content: raise PatchError("C0727e data factory type anchor not found")
    save(rel, content2)

    # Glide request helper and abstract target must not leak Throwable in overrides.
    rel = "app/src/main/java/p080c/p084b/p085a/p107q/p108j/AbstractC0852c.java"
    content = load(rel)
    content2 = content.replace("public final void mo2591h(InterfaceC0856g interfaceC0856g) throws Throwable {", "public final void mo2591h(InterfaceC0856g interfaceC0856g) {")
    if content2 == content and "mo2591h(InterfaceC0856g interfaceC0856g) throws Throwable" in content: raise PatchError("AbstractC0852c Throwable override anchor not found")
    save(rel, content2)

    # MediaStore thumbnail fetcher: exception variables from decompiler had invalid scope.
    rel = "app/src/main/java/p080c/p084b/p085a/p088m/p089t/p090o/C0667b.java"
    content = load(rel)
    content2 = content.replace("public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super InputStream> aVar) throws Throwable {", "public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super InputStream> aVar) {")
    # Add a final catch for the private method's broader Throwable contract.
    old_tail = '''            aVar.mo2299d(e);
        }
    }

    /* JADX WARN: Code duplicated'''
    new_tail = '''            aVar.mo2299d(e);
        } catch (Throwable t) {
            if (t instanceof Error) {
                throw (Error) t;
            }
            aVar.mo2299d(t instanceof Exception ? (Exception) t : new RuntimeException(t));
        }
    }

    /* JADX WARN: Code duplicated'''
    if old_tail in content2:
        content2 = content2.replace(old_tail, new_tail, 1)
    elif "aVar.mo2299d(t instanceof Exception ? (Exception) t : new RuntimeException(t));" not in content2:
        raise PatchError("C0667b callback catch insertion anchor not found")
    # Two malformed decompiler catch/finally paths: rethrow the actual catch variable.
    old1 = '''            } catch (Throwable th2) {
                th = th2;
                if (cursorMo2310a != null) {
                    cursorMo2310a.close();
                }
                throw th;
            }'''
    new1 = '''            } catch (Throwable th2) {
                if (cursorMo2310a != null) {
                    cursorMo2310a.close();
                }
                throw th2;
            }'''
    content2 = content2.replace(old1, new1)
    old2 = '''        } catch (Throwable th3) {
            th = th3;
            if (cursorMo2310a != null) {
                cursorMo2310a.close();
            }
            throw th;
        }'''
    new2 = '''        } catch (Throwable th3) {
            if (cursorMo2310a != null) {
                cursorMo2310a.close();
            }
            throw th3;
        }'''
    content2 = content2.replace(old2, new2)
    if "th = th2;" in content2 or "th = th3;" in content2:
        raise PatchError("C0667b malformed exception assignment remains")
    save(rel, content2)

    # C0866a's two methods are replaced above; checked IOException is narrower and correct.

    # Save only after every transformation has been prevalidated.
    if not updates:
        print("Round32: no source edits required (all anchors already patched).")
        return 0
    print(f"Round32: validated {len(updates)} target file(s) with changes staged.")
    for p in sorted(updates, key=lambda x: str(x)):
        print(f"  {'CHECK' if check_only else 'PATCH'} {p.relative_to(root)}")
    if check_only:
        print("Round32 --check-only: all applicable anchors validated; no files written.")
        return 0

    backup_root = root / BACKUP_DIR
    for p, new_content in updates.items():
        rel = p.relative_to(root)
        backup = backup_root / rel
        backup.parent.mkdir(parents=True, exist_ok=True)
        if not backup.exists():
            shutil.copy2(p, backup)
    for p, new_content in updates.items():
        p.write_text(new_content, encoding="utf-8", newline="")
    print(f"Round32: wrote {len(updates)} file(s); backups: {BACKUP_DIR}/")
    return 0


def main() -> int:
    parser = argparse.ArgumentParser(description="Round32 Java compile repairs")
    parser.add_argument("root", nargs="?", default=".", help="repository root (default: current directory)")
    parser.add_argument("--check-only", action="store_true", help="validate anchors without writing files")
    args = parser.parse_args()
    root = Path(args.root).resolve()
    if not (root / "app/src/main/java").is_dir():
        print(f"ERROR: Android source tree not found under {root}", file=sys.stderr)
        return 2
    try:
        return apply_edits(root, args.check_only)
    except (PatchError, OSError, UnicodeError) as exc:
        print(f"Round32 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

if __name__ == "__main__":
    raise SystemExit(main())
