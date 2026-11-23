package p006b.p032h.p044j.p045w;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: b.h.j.w.b */
/* JADX INFO: loaded from: classes.dex */
public class C0429b {

    /* JADX INFO: renamed from: d */
    public static int f2742d;

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f2743a;

    /* JADX INFO: renamed from: b */
    public int f2744b = -1;

    /* JADX INFO: renamed from: c */
    public int f2745c = -1;

    /* JADX INFO: renamed from: b.h.j.w.b$a */
    public static class a {

        /* JADX INFO: renamed from: e */
        public static final a f2746e;

        /* JADX INFO: renamed from: f */
        public static final a f2747f;

        /* JADX INFO: renamed from: g */
        public static final a f2748g;

        /* JADX INFO: renamed from: h */
        public static final a f2749h;

        /* JADX INFO: renamed from: i */
        public static final a f2750i;

        /* JADX INFO: renamed from: j */
        public static final a f2751j;

        /* JADX INFO: renamed from: a */
        public final Object f2752a;

        /* JADX INFO: renamed from: b */
        public final int f2753b;

        /* JADX INFO: renamed from: c */
        public final Class<? extends InterfaceC0431d.a> f2754c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC0431d f2755d;

        static {
            int i = Build.VERSION.SDK_INT;
            f2746e = new a(1, null);
            f2747f = new a(2, null);
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(4, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(8, null);
            }
            f2748g = new a(16, null);
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(32, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(64, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(128, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(256, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(512, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(1024, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2048, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(4096, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(8192, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(16384, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(32768, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(65536, null);
            }
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(131072, null);
            }
            f2749h = new a(262144, null);
            f2750i = new a(524288, null);
            f2751j = new a(1048576, null);
            if (i >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null;
            if (i >= 21 && accessibilityAction == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowOnScreen, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null;
            if (i >= 21 && accessibilityAction2 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollToPosition, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null;
            if (i >= 21 && accessibilityAction3 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollUp, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null;
            if (i >= 21 && accessibilityAction4 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollLeft, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null;
            if (i >= 21 && accessibilityAction5 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollDown, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null;
            if (i >= 21 && accessibilityAction6 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollRight, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null;
            if (i >= 21 && accessibilityAction7 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionContextClick, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8 = i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null;
            if (i >= 21 && accessibilityAction8 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionSetProgress, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9 = i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null;
            if (i >= 21 && accessibilityAction9 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionMoveWindow, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null;
            if (i >= 21 && accessibilityAction10 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowTooltip, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11 = i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null;
            if (i >= 21 && accessibilityAction11 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionHideTooltip, null);
            }
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, null, null, null);
        }

        public a(Object obj, int i, CharSequence charSequence, InterfaceC0431d interfaceC0431d, Class<? extends InterfaceC0431d.a> cls) {
            this.f2753b = i;
            this.f2755d = interfaceC0431d;
            this.f2752a = Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : null;
            this.f2754c = cls;
        }

        /* JADX INFO: renamed from: a */
        public int m1621a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2752a).getId();
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: b.h.j.w.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Object f2756a;

        public b(Object obj) {
            this.f2756a = obj;
        }
    }

    /* JADX INFO: renamed from: b.h.j.w.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final Object f2757a;

        public c(Object obj) {
            this.f2757a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static c m1622a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return Build.VERSION.SDK_INT >= 21 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }
    }

    public C0429b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2743a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: d */
    public static ClickableSpan[] m1606d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final List<Integer> m1607a(String str) {
        ArrayList<Integer> integerArrayList = this.f2743a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2743a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public int m1608b() {
        return this.f2743a.getActions();
    }

    /* JADX INFO: renamed from: c */
    public CharSequence m1609c() {
        return this.f2743a.getClassName();
    }

    /* JADX INFO: renamed from: e */
    public CharSequence m1610e() {
        return this.f2743a.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0429b.class != obj.getClass()) {
            return false;
        }
        C0429b c0429b = (C0429b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        if (accessibilityNodeInfo == null) {
            if (c0429b.f2743a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c0429b.f2743a)) {
            return false;
        }
        return this.f2745c == c0429b.f2745c && this.f2744b == c0429b.f2744b;
    }

    /* JADX INFO: renamed from: f */
    public Bundle m1611f() {
        return this.f2743a.getExtras();
    }

    /* JADX INFO: renamed from: g */
    public CharSequence m1612g() {
        if (!(!m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f2743a.getText();
        }
        List<Integer> listM1607a = m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listM1607a2 = m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listM1607a3 = m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listM1607a4 = m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2743a.getText(), 0, this.f2743a.getText().length()));
        for (int i = 0; i < listM1607a.size(); i++) {
            spannableString.setSpan(new C0428a(listM1607a4.get(i).intValue(), this, m1611f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listM1607a.get(i).intValue(), listM1607a2.get(i).intValue(), listM1607a3.get(i).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1613h() {
        return this.f2743a.isEnabled();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m1614i() {
        return this.f2743a.isFocusable();
    }

    /* JADX INFO: renamed from: j */
    public boolean m1615j(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2743a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2752a);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m1616k(int i, boolean z) {
        Bundle bundleM1611f = m1611f();
        if (bundleM1611f != null) {
            int i2 = bundleM1611f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            bundleM1611f.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1617l(Object obj) {
        this.f2743a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2756a);
    }

    /* JADX INFO: renamed from: m */
    public void m1618m(Object obj) {
        this.f2743a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f2757a);
    }

    /* JADX INFO: renamed from: n */
    public void m1619n(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2743a.setHintText(charSequence);
        } else {
            this.f2743a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1620o(View view) {
        this.f2744b = -1;
        this.f2743a.setParent(view);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f2743a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f2743a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f2743a.getPackageName());
        sb.append("; className: ");
        sb.append(m1609c());
        sb.append("; text: ");
        sb.append(m1612g());
        sb.append("; contentDescription: ");
        sb.append(m1610e());
        sb.append("; viewId: ");
        sb.append(this.f2743a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f2743a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f2743a.isChecked());
        sb.append("; focusable: ");
        sb.append(m1614i());
        sb.append("; focused: ");
        sb.append(this.f2743a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f2743a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f2743a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f2743a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(m1613h());
        sb.append("; password: ");
        sb.append(this.f2743a.isPassword());
        sb.append("; scrollable: " + this.f2743a.isScrollable());
        sb.append("; [");
        int iM1608b = m1608b();
        while (iM1608b != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iM1608b);
            iM1608b &= iNumberOfTrailingZeros ^ (-1);
            if (iNumberOfTrailingZeros == 1) {
                str = "ACTION_FOCUS";
            } else if (iNumberOfTrailingZeros != 2) {
                switch (iNumberOfTrailingZeros) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    default:
                        str = "ACTION_UNKNOWN";
                        break;
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            sb.append(str);
            if (iM1608b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
