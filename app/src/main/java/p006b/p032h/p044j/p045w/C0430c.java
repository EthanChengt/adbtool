package p006b.p032h.p044j.p045w;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: b.h.j.w.c */
/* JADX INFO: loaded from: classes.dex */
public class C0430c {

    /* JADX INFO: renamed from: a */
    public final Object f2758a;

    /* JADX INFO: renamed from: b.h.j.w.c$a */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final C0430c f2759a;

        public a(C0430c c0430c) {
            this.f2759a = c0430c;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0429b c0429bMo1623a = this.f2759a.mo1623a(i);
            if (c0429bMo1623a == null) {
                return null;
            }
            return c0429bMo1623a.f2743a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            Objects.requireNonNull(this.f2759a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f2759a.mo1625c(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: b.h.j.w.c$b */
    public static class b extends a {
        public b(C0430c c0430c) {
            super(c0430c);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C0429b c0429bMo1624b = this.f2759a.mo1624b(i);
            if (c0429bMo1624b == null) {
                return null;
            }
            return c0429bMo1624b.f2743a;
        }
    }

    public C0430c() {
        this.f2758a = new b(this);
    }

    public C0430c(Object obj) {
        this.f2758a = obj;
    }

    /* JADX INFO: renamed from: a */
    public C0429b mo1623a(int i) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C0429b mo1624b(int i) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo1625c(int i, int i2, Bundle bundle) {
        return false;
    }
}
