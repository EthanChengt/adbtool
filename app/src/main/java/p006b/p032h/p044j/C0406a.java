package p006b.p032h.p044j;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.didjdk.adbhelper.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p032h.p044j.p045w.C0430c;
import p006b.p032h.p044j.p045w.InterfaceC0431d;

/* JADX INFO: renamed from: b.h.j.a */
/* JADX INFO: loaded from: classes.dex */
public class C0406a {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f2699c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f2700a;

    /* JADX INFO: renamed from: b */
    public final View.AccessibilityDelegate f2701b;

    /* JADX INFO: renamed from: b.h.j.a$a */
    public static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        public final C0406a f2702a;

        public a(C0406a c0406a) {
            this.f2702a = c0406a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2702a.mo243a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0430c c0430cMo1538b = this.f2702a.mo1538b(view);
            if (c0430cMo1538b != null) {
                return (AccessibilityNodeProvider) c0430cMo1538b.f2758a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2702a.mo222c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int iKeyAt;
            int i = Build.VERSION.SDK_INT;
            C0429b c0429b = new C0429b(accessibilityNodeInfo);
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            Boolean boolM1584c = new C0419n(R.id.nx, Boolean.class, 28).m1584c(view);
            boolean zBooleanValue = boolM1584c == null ? false : boolM1584c.booleanValue();
            if (i >= 28) {
                c0429b.f2743a.setScreenReaderFocusable(zBooleanValue);
            } else {
                c0429b.m1616k(1, zBooleanValue);
            }
            Boolean boolM1584c2 = new C0421p(R.id.nv, Boolean.class, 28).m1584c(view);
            boolean zBooleanValue2 = boolM1584c2 == null ? false : boolM1584c2.booleanValue();
            if (i >= 28) {
                c0429b.f2743a.setHeading(zBooleanValue2);
            } else {
                c0429b.m1616k(2, zBooleanValue2);
            }
            CharSequence charSequenceM1584c = new C0420o(R.id.nw, CharSequence.class, 8, 28).m1584c(view);
            AccessibilityNodeInfo accessibilityNodeInfo2 = c0429b.f2743a;
            if (i >= 28) {
                accessibilityNodeInfo2.setPaneTitle(charSequenceM1584c);
            } else {
                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM1584c);
            }
            this.f2702a.mo223d(view, c0429b);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i < 26) {
                c0429b.f2743a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                c0429b.f2743a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                c0429b.f2743a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                c0429b.f2743a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.nu);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        if (((WeakReference) sparseArray.valueAt(i2)).get() == null) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        sparseArray.remove(((Integer) arrayList.get(i3)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArrM1606d = C0429b.m1606d(text);
                if (clickableSpanArrM1606d != null && clickableSpanArrM1606d.length > 0) {
                    c0429b.m1611f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.s);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.nu);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.nu, sparseArray2);
                    }
                    for (int i4 = 0; i4 < clickableSpanArrM1606d.length; i4++) {
                        ClickableSpan clickableSpan = clickableSpanArrM1606d[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                iKeyAt = C0429b.f2742d;
                                C0429b.f2742d = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i5)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i5);
                                    break;
                                }
                                i5++;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArrM1606d[i4]));
                        ClickableSpan clickableSpan2 = clickableSpanArrM1606d[i4];
                        Spanned spanned = (Spanned) text;
                        c0429b.m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        c0429b.m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        c0429b.m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        c0429b.m1607a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    }
                }
            }
            List listEmptyList = (List) view.getTag(R.id.nt);
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            for (int i6 = 0; i6 < listEmptyList.size(); i6++) {
                C0429b.a aVar = (C0429b.a) listEmptyList.get(i6);
                if (i >= 21) {
                    c0429b.f2743a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2752a);
                }
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2702a.mo1539e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2702a.mo244f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2702a.mo224g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f2702a.mo1540h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2702a.mo1541i(view, accessibilityEvent);
        }
    }

    public C0406a() {
        this.f2700a = f2699c;
        this.f2701b = new a(this);
    }

    public C0406a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2700a = accessibilityDelegate;
        this.f2701b = new a(this);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo243a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2700a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0430c mo1538b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2700a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0430c(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo222c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2700a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo223d(View view, C0429b c0429b) {
        this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
    }

    /* JADX INFO: renamed from: e */
    public void mo1539e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2700a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo244f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2700a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo224g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        boolean z;
        List listEmptyList = (List) view.getTag(R.id.nt);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < listEmptyList.size()) {
                C0429b.a aVar = (C0429b.a) listEmptyList.get(i2);
                if (aVar.m1621a() != i) {
                    i2++;
                } else if (aVar.f2755d != null) {
                    Class<? extends InterfaceC0431d.a> cls = aVar.f2754c;
                    if (cls != null) {
                        try {
                            Objects.requireNonNull(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        } catch (Exception e) {
                            Class<? extends InterfaceC0431d.a> cls2 = aVar.f2754c;
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        }
                    }
                    BottomSheetBehavior.C1344c c1344c = (BottomSheetBehavior.C1344c) aVar.f2755d;
                    c1344c.performAction();
                    zPerformAccessibilityAction = true;
                    break;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f2700a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.s) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.nu);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan == null) {
                return z2;
            }
            ClickableSpan[] clickableSpanArrM1606d = C0429b.m1606d(view.createAccessibilityNodeInfo().getText());
            int i4 = 0;
            while (true) {
                if (clickableSpanArrM1606d == null || i4 >= clickableSpanArrM1606d.length) {
                    z = false;
                    break;
                }
                if (clickableSpan.equals(clickableSpanArrM1606d[i4])) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (z) {
                clickableSpan.onClick(view);
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: h */
    public void mo1540h(View view, int i) {
        this.f2700a.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: i */
    public void mo1541i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2700a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
