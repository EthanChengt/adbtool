package p006b.p032h.p044j;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import p006b.p032h.p033b.C0360f;

/* JADX INFO: renamed from: b.h.j.e */
/* JADX INFO: loaded from: classes.dex */
public class C0410e {

    /* JADX INFO: renamed from: a */
    public ViewParent f2708a;

    /* JADX INFO: renamed from: b */
    public ViewParent f2709b;

    /* JADX INFO: renamed from: c */
    public final View f2710c;

    /* JADX INFO: renamed from: d */
    public boolean f2711d;

    /* JADX INFO: renamed from: e */
    public int[] f2712e;

    public C0410e(View view) {
        this.f2710c = view;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1544a(float f, float f2, boolean z) {
        ViewParent viewParentM1549f;
        if (!this.f2711d || (viewParentM1549f = m1549f(0)) == null) {
            return false;
        }
        return C0360f.m1414F(viewParentM1549f, this.f2710c, f, f2, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m1545b(float f, float f2) {
        ViewParent viewParentM1549f;
        if (!this.f2711d || (viewParentM1549f = m1549f(0)) == null) {
            return false;
        }
        return C0360f.m1415G(viewParentM1549f, this.f2710c, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public boolean m1546c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM1549f;
        int i4;
        int i5;
        if (!this.f2711d || (viewParentM1549f = m1549f(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f2710c.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.f2712e == null) {
                    this.f2712e = new int[2];
                }
                iArr = this.f2712e;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0360f.m1416H(viewParentM1549f, this.f2710c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f2710c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] != 0 || iArr[1] != 0) {
                return true;
            }
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1547d(int i, int i2, int i3, int i4, int[] iArr) {
        return m1548e(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1548e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM1549f;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f2711d || (viewParentM1549f = m1549f(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2710c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f2712e == null) {
                this.f2712e = new int[2];
            }
            int[] iArr4 = this.f2712e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        C0360f.m1417I(viewParentM1549f, this.f2710c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f2710c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final ViewParent m1549f(int i) {
        if (i == 0) {
            return this.f2708a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2709b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1550g(int i) {
        return m1549f(i) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public void m1551h(boolean z) {
        if (this.f2711d) {
            View view = this.f2710c;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof InterfaceC0409d) {
                ((InterfaceC0409d) view).stopNestedScroll();
            }
        }
        this.f2711d = z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX INFO: renamed from: i */
    public boolean m1552i(int i, int i2) {
        boolean zOnStartNestedScroll;
        int i3 = Build.VERSION.SDK_INT;
        if (m1549f(i2) != null) {
            return true;
        }
        if (this.f2711d) {
            View view = this.f2710c;
            for (ViewParent parent = this.f2710c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f2710c;
                boolean z = parent instanceof InterfaceC0411f;
                if (z) {
                    zOnStartNestedScroll = ((InterfaceC0411f) parent).mo47o(view, view2, i, i2);
                } else if (i2 != 0) {
                    zOnStartNestedScroll = false;
                } else if (i3 >= 21) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view, view2, i);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        zOnStartNestedScroll = false;
                    }
                } else if (parent instanceof InterfaceC0413h) {
                    zOnStartNestedScroll = ((InterfaceC0413h) parent).onStartNestedScroll(view, view2, i);
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i2 == 0) {
                        this.f2708a = parent;
                    } else if (i2 == 1) {
                        this.f2709b = parent;
                    }
                    View view3 = this.f2710c;
                    if (z) {
                        ((InterfaceC0411f) parent).mo40h(view, view3, i, i2);
                    } else if (i2 == 0) {
                        if (i3 >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view3, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        } else if (parent instanceof InterfaceC0413h) {
                            ((InterfaceC0413h) parent).onNestedScrollAccepted(view, view3, i);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m1553j(int i) {
        ViewParent viewParentM1549f = m1549f(i);
        if (viewParentM1549f != null) {
            View view = this.f2710c;
            if (viewParentM1549f instanceof InterfaceC0411f) {
                ((InterfaceC0411f) viewParentM1549f).mo41i(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        viewParentM1549f.onStopNestedScroll(view);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + viewParentM1549f + " does not implement interface method onStopNestedScroll", e);
                    }
                } else if (viewParentM1549f instanceof InterfaceC0413h) {
                    ((InterfaceC0413h) viewParentM1549f).onStopNestedScroll(view);
                }
            }
            if (i == 0) {
                this.f2708a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2709b = null;
            }
        }
    }
}
