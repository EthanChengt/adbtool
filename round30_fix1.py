#!/usr/bin/env python3
"""Round 30 Fix1: repair the compiler failures verified in Actions run 45845192425.

Usage at repository root:
    python3 round30_fix1.py . --check-only
    python3 round30_fix1.py .

All files are transformed and validated in memory before any file is written.
Changed files receive a .round30.bak backup.
"""
from __future__ import annotations

import argparse
import re
import shutil
import sys
from pathlib import Path


class PatchError(RuntimeError):
    pass


def replace_n(s: str, old: str, new: str, label: str, n: int = 1) -> str:
    count = s.count(old)
    if count != n:
        raise PatchError(f"{label}: expected {n} occurrence(s), found {count}")
    return s.replace(old, new)


def replace_once_or_done(s: str, old: str, new: str, label: str) -> str:
    count = s.count(old)
    if count == 1:
        return s.replace(old, new, 1)
    if count == 0 and new in s:
        return s
    raise PatchError(f"{label}: expected one anchor, found {count}")


def add_static_import(s: str, method: str, label: str) -> str:
    line = f"import static c.a.a.a.a.{method};\n"
    if line in s:
        return s
    anchor = "import c.a.a.a.a;\n"
    if s.count(anchor) != 1:
        raise PatchError(f"{label}: helper import anchor count is {s.count(anchor)}")
    return s.replace(anchor, anchor + line, 1)


def patch_c0538a(s: str) -> str:
    s = replace_once_or_done(
        s, "        b bVarM1990h;\n", "        b bVarM1990h = null;\n",
        "C0538a pending update initialization"
    )
    old = """        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f3308c.size() - 1; size >= 0; size--) {"""
    new = """        int i3 = 0;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int size = this.f3308c.size() - 1; size >= 0; size--) {"""
    return replace_once_or_done(s, old, new, "C0538a position-remap register defaults")


def patch_c0291w(s: str) -> str:
    marker = "    public class d extends C0268k0 implements f {"
    if s.count(marker) != 1:
        raise PatchError("C0291w: popup implementation class anchor mismatch")
    head, tail = s.split(marker, 1)
    anchor = "        @Override // p006b.p008b.p018i.C0291w.f\n        /* JADX INFO: renamed from: d */\n        public void mo1141d(int i, int i2) {"
    method = """        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: c */
        public int mo1140c() {
            return this.f2041H;
        }

""" + anchor
    tail = replace_once_or_done(tail, anchor, method, "C0291w popup horizontal-offset getter")
    return head + marker + tail


def patch_c0449a(s: str) -> str:
    # Round29 introduced method-scoped exception slots. Rename inner catch
    # variables where Java forbids shadowing those slots.
    s = replace_once_or_done(
        s,
        """                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    }
                                    return str;""",
        """                                    } catch (IOException closeException) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", closeException);
                                    }
                                    return str;""",
        "C0449a attribute-value close exception shadow",
    )
    s = replace_once_or_done(
        s,
        """                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;""",
        """                } catch (Throwable innerFailure) {
                    th = innerFailure;
                    inputStream2 = inputStream;""",
        "C0449a byte-stream cleanup exception shadow",
    )
    s = replace_once_or_done(
        s,
        """                                } catch (Throwable th) {
                                    th = th;
                                    bVar3 = bVar4;""",
        """                                } catch (Throwable innerFailure) {
                                    th = innerFailure;
                                    bVar3 = bVar4;""",
        "C0449a format-probe cleanup exception shadow",
    )
    return s


def patch_c0518b(s: str) -> str:
    s = add_static_import(s, "m2201o", "C0518b")
    s = replace_once_or_done(
        s,
        "return new b();",
        "return (T) new b();",
        "C0518b typed ViewModel factory result",
    )
    s = replace_once_or_done(
        s,
        "String strM2201o = a.m2201o(",
        "String strM2201o = m2201o(",
        "C0518b outer helper call",
    )
    s = replace_once_or_done(
        s,
        "public C0321i<a> f3202b = new C0321i<>(10);",
        "public C0321i<C0518b.a<?>> f3202b = new C0321i<>(10);",
        "C0518b LoaderInfo storage type",
    )
    s = replace_once_or_done(
        s,
        "C0321i<a> c0321i = this.f3202b;",
        "C0321i<C0518b.a<?>> c0321i = this.f3202b;",
        "C0518b LoaderInfo cleanup type",
    )
    s = replace_once_or_done(
        s,
        "a aVarM1286j = bVar.f3202b.m1286j(0);",
        "C0518b.a<?> aVarM1286j = bVar.f3202b.m1286j(0);",
        "C0518b outer LoaderInfo type in dump",
    )
    return s


def patch_c0496a(s: str) -> str:
    s = add_static_import(s, "m2191e", "C0496a")
    return replace_once_or_done(s, "a.m2191e(", "m2191e(", "C0496a shadowed helper")


def patch_c0505j(s: str) -> str:
    pattern = re.compile(
        r"    public static int m1906c\(Class<\?> cls\) \{.*?\n    \}\n\}",
        re.S,
    )
    replacement = '''    @SuppressWarnings({"unchecked", "deprecation"})
    public static int m1906c(Class<?> cls) {
        Integer cached = f3195a.get(cls);
        if (cached != null) {
            return cached.intValue();
        }

        int type = 1;
        if (cls.getCanonicalName() != null) {
            List<Constructor<? extends InterfaceC0498c>> constructors = null;
            Constructor<? extends InterfaceC0498c> generatedConstructor = null;
            try {
                Package pkg = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String packageName = pkg != null ? pkg.getName() : "";
                if (!packageName.isEmpty()) {
                    canonicalName = canonicalName.substring(packageName.length() + 1);
                }
                String generatedName = m1905b(canonicalName);
                if (!packageName.isEmpty()) {
                    generatedName = packageName + "." + generatedName;
                }
                Class<?> generatedClass = Class.forName(generatedName);
                generatedConstructor = (Constructor<? extends InterfaceC0498c>)
                        generatedClass.getDeclaredConstructor(cls);
                if (!generatedConstructor.isAccessible()) {
                    generatedConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException ignored) {
                generatedConstructor = null;
            } catch (NoSuchMethodException exception) {
                throw new RuntimeException(exception);
            }

            if (generatedConstructor != null) {
                constructors = Collections.singletonList(generatedConstructor);
            } else {
                C0496a callbackCache = C0496a.f3173c;
                Boolean hasReflectiveMethods = callbackCache.f3175b.get(cls);
                if (hasReflectiveMethods == null) {
                    callbackCache.m1884b(cls);
                    hasReflectiveMethods = callbackCache.f3175b.get(cls);
                }

                if (!Boolean.TRUE.equals(hasReflectiveMethods)) {
                    Class<?> superclass = cls.getSuperclass();
                    if (superclass != null
                            && InterfaceC0501f.class.isAssignableFrom(superclass)
                            && m1906c(superclass) == 2) {
                        List<Constructor<? extends InterfaceC0498c>> inherited = f3196b.get(superclass);
                        if (inherited != null) {
                            constructors = new ArrayList<>(inherited);
                        }
                    }

                    for (Class<?> iface : cls.getInterfaces()) {
                        if (InterfaceC0501f.class.isAssignableFrom(iface)
                                && m1906c(iface) == 2) {
                            List<Constructor<? extends InterfaceC0498c>> inherited = f3196b.get(iface);
                            if (inherited != null) {
                                if (constructors == null) {
                                    constructors = new ArrayList<>();
                                }
                                constructors.addAll(inherited);
                            }
                        }
                    }
                }
            }

            if (constructors != null) {
                f3196b.put(cls, constructors);
                type = 2;
            }
        }

        f3195a.put(cls, Integer.valueOf(type));
        return type;
    }
}'''
    out, count = pattern.subn(replacement, s, count=1)
    if count != 1:
        raise PatchError(f"C0505j lifecycle adapter classifier: expected one method, found {count}")
    return out


def patch_dialog_fragment(s: str) -> str:
    s = add_static_import(s, "m2191e", "DialogInterfaceOnCancelListenerC0455c")
    s = add_static_import(s, "m2198l", "DialogInterfaceOnCancelListenerC0455c")
    s = s.replace("a.m2191e(", "m2191e(")
    s = s.replace("a.m2198l(", "m2198l(")
    if "a.m2191e(" in s or "a.m2198l(" in s:
        raise PatchError("DialogFragment helper shadowing remains")
    return s


def patch_c0529g(s: str) -> str:
    s = replace_once_or_done(
        s,
        "public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i)",
        "public void mo537e(C0534l abstractC0129d0, int i)",
        "C0529g typed ViewHolder bind parameter",
    )
    return replace_once_or_done(
        s,
        "public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i)",
        "public C0534l mo538f(ViewGroup viewGroup, int i)",
        "C0529g typed ViewHolder factory result",
    )


def patch_edit_text_preference(s: str) -> str:
    s = replace_once_or_done(
        s,
        "public CharSequence mo363a(Preference preference) {\n            EditTextPreference editTextPreference = (EditTextPreference) preference;",
        "public CharSequence mo363a(EditTextPreference editTextPreference) {",
        "EditTextPreference generic summary provider parameter",
    )
    s = replace_once_or_done(
        s,
        """        int iM1474a = C0369g.m1474a(context, R.attr.g9, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iM1474a, 0);""",
        """        super(context, attributeSet,
                C0369g.m1474a(context, R.attr.g9, android.R.attr.editTextPreferenceStyle), 0);
        int iM1474a = C0369g.m1474a(context, R.attr.g9, android.R.attr.editTextPreferenceStyle);""",
        "EditTextPreference super-constructor ordering",
    )
    return s


def patch_c0304a(s: str) -> str:
    s = replace_once_or_done(s, "r7 = obj;", "r7 = (C0332d) obj;", "C0304a chain-widget type")
    anchor = "            C0331c c0331c24 = c0331c22.f2276d;\n"
    s = replace_once_or_done(
        s, anchor,
        anchor + "            C0328g c0328g22 = null;\n",
        "C0304a baseline target anchor declaration",
    )
    s = replace_once_or_done(s, "r5 = 0;", "c0328g22 = null;", "C0304a null baseline target")
    s = replace_n(s, "r5 = c0328g5;", "c0328g22 = c0328g5;", "C0304a baseline target assignments", 2)
    s = replace_once_or_done(s, "r5 = obj;", "c0328g22 = (C0328g) obj;", "C0304a linked target assignment")
    s = replace_once_or_done(s, "r5 == 0", "c0328g22 == null", "C0304a missing baseline target guard")
    s = replace_once_or_done(s, ", r5, c0331c22.f2281i,", ", c0328g22, c0331c22.f2281i,", "C0304a baseline constraint target")
    return s


def patch_cardview(s: str) -> str:
    anchor = "        public C0064a() {\n        }\n"
    getter = """        public C0064a() {
        }

        public CardView m133a() {
            return CardView.this;
        }
"""
    return replace_once_or_done(s, anchor, getter, "CardView backend host accessor")


def patch_cardview_modern(s: str) -> str:
    s = s.replace("CardView.this", "((CardView.C0064a) interfaceC0309d).m133a()")
    if "CardView.this" in s:
        raise PatchError("C0307b: stale CardView outer-instance reference")
    return s


def patch_cardview_legacy(s: str) -> str:
    s = replace_once_or_done(
        s,
        "public class C0308c implements InterfaceC0310e {",
        """public class C0308c implements InterfaceC0310e {

    @Override
    public void mo1202n() {
    }
""",
        "C0308c backend initialization hook",
    )
    s = s.replace("CardView.this", "((CardView.C0064a) interfaceC0309d).m133a()")
    s = s.replace("super/*android.widget.FrameLayout*/.setMinimumWidth(iCeil);", "cardView.setMinimumWidth(iCeil);")
    s = s.replace("super/*android.widget.FrameLayout*/.setMinimumHeight(iCeil2);", "cardView.setMinimumHeight(iCeil2);")
    if "CardView.this" in s or "super/*android.widget.FrameLayout*/" in s:
        raise PatchError("C0308c: invalid decompiler outer/super references remain")
    return s


def patch_c0348f(s: str) -> str:
    if "import android.content.Context;" not in s:
        s = s.replace("import android.graphics.Canvas;\n", "import android.content.Context;\nimport android.util.AttributeSet;\nimport android.graphics.Canvas;\n", 1)
    anchor = "public class C0348f extends View {\n"
    constructors = """public class C0348f extends View {

    public C0348f(Context context) {
        super(context);
    }

    public C0348f(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public C0348f(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
"""
    return replace_once_or_done(s, anchor, constructors, "ConstraintLayout placeholder View constructors")


def patch_c0379j(s: str) -> str:
    s = replace_once_or_done(
        s,
        """        } catch (IOException unused5) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */""",
        """        } catch (IOException unused5) {
            return null;
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    /* JADX INFO: renamed from: c */""",
        "C0379j provider-open failure return/rethrow",
    )
    return s


def patch_c0373d(s: str) -> str:
    s = replace_once_or_done(
        s,
        "public static boolean m1495g(Object obj, String str, int i, boolean z) throws NoSuchMethodException {\n        m1496i();",
        "public static boolean m1495g(Object obj, String str, int i, boolean z) {\n        m1496j();",
        "C0373d reflection helper checked exception",
    )
    s = replace_once_or_done(
        s,
        """        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: i */""",
        """        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static void m1496j() {
        try {
            m1496i();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: i */""",
        "C0373d unchecked reflection initializer",
    )
    s = replace_once_or_done(
        s,
        "public Typeface mo1497a(Context context, C0365c c0365c, Resources resources, int i) throws NoSuchMethodException {\n        m1496i();",
        "public Typeface mo1497a(Context context, C0365c c0365c, Resources resources, int i) {\n        m1496j();",
        "C0373d override checked exception and initializer",
    )
    return s


def patch_c0375f(s: str) -> str:
    s = add_static_import(s, "m2191e", "C0375f")
    return replace_once_or_done(s, "a.m2191e(", "m2191e(", "C0375f shadowed helper")


def patch_c0393e(s: str) -> str:
    s = add_static_import(s, "m2201o", "C0393e")
    return replace_once_or_done(s, "a.m2201o(", "m2201o(", "C0393e shadowed helper")


def patch_c0360f(s: str) -> str:
    s = replace_once_or_done(
        s,
        "return drawable instanceof InterfaceC0381b ? (T) ((InterfaceC0381b) drawable).mo1517a() : drawable;",
        "return (T) (drawable instanceof InterfaceC0381b ? ((InterfaceC0381b) drawable).mo1517a() : drawable);",
        "C0360f generic Drawable wrapper return",
    )
    s = replace_once_or_done(
        s,
        """        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: l */""",
        """        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */""",
        "C0360f raw-resource cleanup rethrow",
    )
    s = replace_once_or_done(
        s,
        """            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: m */""",
        """            } catch (IOException e2) {
                Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e2.getMessage());
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */""",
        "C0360f copy-stream exception handoff",
    )
    return s


def patch_c0548k(s: str) -> str:
    s = add_static_import(s, "m2191e", "C0548k")
    return replace_once_or_done(s, "a.m2191e(", "m2191e(", "C0548k helper shadow")


def patch_runnable_c0540c(s: str) -> str:
    return replace_once_or_done(
        s,
        "for (C0548k.b bVar : this.f3321b)",
        "for (C0548k.b bVar : (ArrayList<C0548k.b>) this.f3321b)",
        "RunnableC0540c typed pending-list iteration",
    )


def patch_runnable_c0542e(s: str) -> str:
    return replace_once_or_done(
        s,
        "for (RecyclerView.AbstractC0129d0 abstractC0129d0 : this.f3325b)",
        "for (RecyclerView.AbstractC0129d0 abstractC0129d0 : (ArrayList<RecyclerView.AbstractC0129d0>) this.f3325b)",
        "RunnableC0542e typed holder-list iteration",
    )


def patch_runnable_c0541d(s: str) -> str:
    return replace_once_or_done(
        s,
        "for (C0548k.a aVar : this.f3323b)",
        "for (C0548k.a aVar : (ArrayList<C0548k.a>) this.f3323b)",
        "RunnableC0541d typed change-list iteration",
    )


def patch_c0608g(s: str) -> str:
    s = s.replace("super(null);", "super();")
    s = replace_once_or_done(
        s,
        """        public d(d dVar, C0313a<String, Object> c0313a) {
            f bVar;
            super();""",
        """        public d(d dVar, C0313a<String, Object> c0313a) {
            super();
            f bVar;""",
        "C0608g path group constructor ordering",
    )
    if "super(null);" in s:
        raise PatchError("C0608g: super(null) constructor call remains")
    return s


def patch_c0604c(s: str) -> str:
    s = add_static_import(s, "m2191e", "C0604c")
    return replace_once_or_done(s, "a.m2191e(", "m2191e(", "C0604c helper shadow")


def patch_c0603b(s: str) -> str:
    s = replace_once_or_done(
        s,
        "        XmlResourceParser animation;\n        Animator animatorM2148a;",
        "        XmlResourceParser animation = null;\n        Animator animatorM2148a;",
        "C0603b animation parser initialization",
    )

    # Replace JADX's nested catch/rethrow merge with one parser lifecycle.
    # XmlResourceParser.close() is called in finally, including parse failures.
    old_branch = '''                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorM2148a = C0604c.m2148a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                        animation.close();
                                    } catch (IOException e2) {
                                        e = e2;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e3) {
                                        e = e3;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (animation != null) {
                                            animation.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    animation = null;
                                }
                            } catch (IOException e4) {
                                e = e4;
                            } catch (XmlPullParserException e5) {
                                e = e5;
                            }'''
    new_branch = '''                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            XmlResourceParser parser = null;
                            try {
                                parser = resources2.getAnimation(resourceId2);
                                animatorM2148a = C0604c.m2148a(context, resources2, theme2, parser, Xml.asAttributeSet(parser), null, 0, 1.0f);
                            } catch (IOException | XmlPullParserException parseException) {
                                Resources.NotFoundException failure = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                failure.initCause(parseException);
                                throw failure;
                            } finally {
                                if (parser != null) {
                                    parser.close();
                                }
                            }'''
    s = replace_once_or_done(
        s, old_branch, new_branch,
        "C0603b animator parser lifecycle block",
    )
    s = replace_once_or_done(
        s,
        "} catch (IOException | XmlPullParserException e) {\n                                Log.e(\"VectorDrawableCompat\", \"parser error\", e);",
        "} catch (IOException | XmlPullParserException parseException) {\n                                Log.e(\"VectorDrawableCompat\", \"parser error\", parseException);",
        "C0603b nested vector parse exception name",
    )
    return s


def patch_c0253d1(s: str) -> str:
    return replace_once_or_done(
        s,
        """            if (declaredMethod.isAccessible()) {
                return;
            }
            f1815a.setAccessible(true);""",
        """            if (!declaredMethod.isAccessible()) {
                f1815a.setAccessible(true);
            }""",
        "C0253d1 static initializer early exit",
    )


def patch_c0277p(s: str) -> str:
    return replace_once_or_done(
        s,
        """    public C0277p(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        super(context, attributeSet, i, i2);""",
        """    public C0277p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int resourceId;""",
        "C0277p PopupWindow constructor ordering",
    )


def patch_view_click_c0282r0(s: str) -> str:
    s = add_static_import(s, "m2199m", "ViewOnClickListenerC0282r0")
    s = s.replace("a.m2199m(", "m2199m(")
    s = replace_once_or_done(
        s,
        "public final Drawable m1127f(String str) throws FileNotFoundException {",
        "public final Drawable m1127f(String str) {",
        "SuggestionsAdapter icon loader handled FileNotFoundException",
    )
    s = replace_once_or_done(
        s,
        "public void mo1122a(View view, Context context, Cursor cursor) throws FileNotFoundException {",
        "public void mo1122a(View view, Context context, Cursor cursor) {",
        "SuggestionsAdapter override checked exception removal",
    )
    return s


def patch_c0210b(s: str) -> str:
    return replace_once_or_done(
        s,
        """            } else {
                z = cVar.f1470w;
            }
            break;
        }
        if (!z) {""",
        """            } else {
                z = cVar.f1470w;
            }
        }
        if (!z) {""",
        "C0210b invalid break after synchronized block",
    )


def patch_c0209a(s: str) -> str:
    s = add_static_import(s, "m2190d", "C0209a")
    s = s.replace("a.m2190d(", "m2190d(")
    s = replace_once_or_done(
        s,
        """        public c(c cVar, C0209a c0209a, Resources resources) {
            C0321i<Integer> c0321i;
            super(cVar, c0209a, resources);""",
        """        public c(c cVar, C0209a c0209a, Resources resources) {
            super(cVar, c0209a, resources);
            C0321i<Integer> c0321i;""",
        "C0209a DrawableContainer constant-state constructor ordering",
    )
    return s


def patch_window_callback(s: str) -> str:
    anchor = "    @Override // android.view.Window.Callback\n    public boolean onCreatePanelMenu(int i, Menu menu) {"
    method = """    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return this.f1550b.onPreparePanel(featureId, view, menu);
    }

""" + anchor
    return replace_once_or_done(s, anchor, method, "Window.Callback onPreparePanel delegate")



def patch_layout_inflater_factory(s: str) -> str:
    s = replace_once_or_done(
        s,
        """        if (!z2 || f1254c0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f1254c0 = true;""",
        """        if (z2 && !f1254c0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
            f1254c0 = true;
        }""",
        "AppCompat uncaught-exception static initializer guard",
    )
    static_line = "import static c.a.a.a.a.m2191e;\n"
    if static_line not in s:
        package_end = s.find("\n")
        if package_end < 0:
            raise PatchError("AppCompat helper import: package declaration missing")
        s = s[:package_end + 1] + "\n" + static_line + s[package_end + 1:]
    s = replace_once_or_done(
        s,
        "c.a.a.a.c.a.a.a.a.m2191e(",
        "m2191e(",
        "AppCompat helper call corrupted by inner-class shadowing",
    )
    s = replace_once_or_done(
        s,
        """        } catch (IllegalAccessException e2) {
            e = e2;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);""",
        """        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);""",
        "AppCompat makeOptionalFitsSystemWindows IllegalAccessException",
    )
    s = replace_once_or_done(
        s,
        """        } catch (InvocationTargetException e3) {
            e = e3;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);""",
        """        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);""",
        "AppCompat makeOptionalFitsSystemWindows InvocationTargetException",
    )
    s = replace_once_or_done(
        s,
        "public void mo807k(Configuration configuration) throws IllegalAccessException {",
        "public void mo807k(Configuration configuration) {",
        "AppCompatDelegate configuration callback checked exception",
    )
    return replace_once_or_done(
        s,
        "public void mo808l(Bundle bundle) throws IllegalAccessException {",
        "public void mo808l(Bundle bundle) {",
        "AppCompatDelegate restore callback checked exception",
    )


def patch_resource_ids(s: str) -> str:
    required = [
        '    <item name="nb" type="id" />',
        '    <item name="o0" type="id" />',
    ]
    missing = [line for line in required if line not in s]
    if not missing:
        return s
    anchor = "</resources>"
    if s.count(anchor) != 1:
        raise PatchError("values/ids.xml: resources closing tag mismatch")
    return s.replace(anchor, "\n".join(missing) + "\n" + anchor, 1)


def patch_c0449a_extra(s: str) -> str:
    # The format-probe catch and outer catch use separate names after the
    # method-scoped Throwable handoff introduced in the earlier round.
    return s


def patch_c0418m(s: str) -> str:
    # The tag resource belongs to the generated app R class, but the erroneous
    # short field does not exist in this repository's generated R. The support
    # compat key-listeners tag is assigned a stable library ID in ids.xml.
    # Do not guess a replacement numeric resource here; leave this compiler
    # diagnostic for a resource-ID-specific follow-up patch.
    return s


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    root = Path(args.root).resolve()
    if not root.is_dir():
        raise SystemExit(f"repository root does not exist: {root}")

    patches = {
        "app/src/main/java/p006b/p068t/p069b/C0538a.java": patch_c0538a,
        "app/src/main/java/p006b/p008b/p018i/C0291w.java": patch_c0291w,
        "app/src/main/java/p006b/p054l/p055a/C0449a.java": patch_c0449a,
        "app/src/main/java/p006b/p062p/p063a/C0518b.java": patch_c0518b,
        "app/src/main/java/p006b/p061o/C0496a.java": patch_c0496a,
        "app/src/main/java/p006b/p061o/C0505j.java": patch_c0505j,
        "app/src/main/java/p006b/p056m/p057b/DialogInterfaceOnCancelListenerC0455c.java": patch_dialog_fragment,
        "app/src/main/java/p006b/p067s/C0529g.java": patch_c0529g,
        "app/src/main/java/androidx/preference/EditTextPreference.java": patch_edit_text_preference,
        "app/src/main/java/p006b/p023d/C0304a.java": patch_c0304a,
        "app/src/main/java/androidx/cardview/widget/CardView.java": patch_cardview,
        "app/src/main/java/p006b/p023d/p024c/C0307b.java": patch_cardview_modern,
        "app/src/main/java/p006b/p023d/p024c/C0308c.java": patch_cardview_legacy,
        "app/src/main/java/p006b/p026f/p029b/C0348f.java": patch_c0348f,
        "app/src/main/java/p006b/p032h/p036d/C0379j.java": patch_c0379j,
        "app/src/main/java/p006b/p032h/p036d/C0373d.java": patch_c0373d,
        "app/src/main/java/p006b/p032h/p036d/C0375f.java": patch_c0375f,
        "app/src/main/java/p006b/p032h/p041g/C0393e.java": patch_c0393e,
        "app/src/main/java/p006b/p032h/p033b/C0360f.java": patch_c0360f,
        "app/src/main/java/p006b/p068t/p069b/C0548k.java": patch_c0548k,
        "app/src/main/java/p006b/p068t/p069b/RunnableC0540c.java": patch_runnable_c0540c,
        "app/src/main/java/p006b/p068t/p069b/RunnableC0542e.java": patch_runnable_c0542e,
        "app/src/main/java/p006b/p068t/p069b/RunnableC0541d.java": patch_runnable_c0541d,
        "app/src/main/java/p006b/p074x/p075a/p076a/C0608g.java": patch_c0608g,
        "app/src/main/java/p006b/p074x/p075a/p076a/C0604c.java": patch_c0604c,
        "app/src/main/java/p006b/p074x/p075a/p076a/C0603b.java": patch_c0603b,
        "app/src/main/java/p006b/p008b/p018i/C0253d1.java": patch_c0253d1,
        "app/src/main/java/p006b/p008b/p018i/C0277p.java": patch_c0277p,
        "app/src/main/java/p006b/p008b/p018i/ViewOnClickListenerC0282r0.java": patch_view_click_c0282r0,
        "app/src/main/java/p006b/p008b/p012e/p013a/C0210b.java": patch_c0210b,
        "app/src/main/java/p006b/p008b/p012e/p013a/C0209a.java": patch_c0209a,
        "app/src/main/java/p006b/p008b/p016h/WindowCallbackC0222h.java": patch_window_callback,
        "app/src/main/java/p006b/p008b/p009c/LayoutInflaterFactory2C0197m.java": patch_layout_inflater_factory,
        "app/src/main/res/values/ids.xml": patch_resource_ids,
    }

    updates: dict[str, str] = {}
    for rel, transform in patches.items():
        path = root / rel
        if not path.is_file():
            raise PatchError(f"missing source file: {rel}")
        original = path.read_text(encoding="utf-8")
        updated = transform(original)
        if updated == original:
            raise PatchError(f"{rel}: patch produced no change")
        updates[rel] = updated

    if args.check_only:
        print(f"Round30 Fix1 validation passed: {len(updates)} files; no files changed")
        return 0

    for rel, updated in updates.items():
        path = root / rel
        backup = path.with_suffix(path.suffix + ".round30.bak")
        if not backup.exists():
            shutil.copy2(path, backup)
        path.write_text(updated, encoding="utf-8")

    print(f"Round30 Fix1 applied to {len(updates)} files")
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except PatchError as exc:
        print(f"Round30 Fix1 validation failed; no files were written:\n- {exc}", file=sys.stderr)
        raise SystemExit(2)
