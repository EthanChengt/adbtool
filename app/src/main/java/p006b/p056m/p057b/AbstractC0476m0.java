package p006b.p056m.p057b;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p006b.p032h.p040f.C0388a;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.m.b.m0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class AbstractC0476m0 {
    /* JADX INFO: renamed from: d */
    public static void m1777d(List<View> list, View view) {
        int size = list.size();
        if (m1778h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m1778h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1778h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1779k(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1759a(Object obj, View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo1760b(Object obj, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: c */
    public abstract void mo1761c(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1762e(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.ArrayList<android.view.View>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, android.view.ViewGroup] */
    /* JADX INFO: renamed from: f */
    public void m1780f(ArrayList<View> arrayList, View view) {
        boolean zIsTransitionGroup;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup) view;
                if (Build.VERSION.SDK_INT >= 21) {
                    zIsTransitionGroup = view.isTransitionGroup();
                } else {
                    Boolean bool = (Boolean) view.getTag(R.id.ny);
                    zIsTransitionGroup = ((bool == null || !bool.booleanValue()) && view.getBackground() == null && C0418m.m1568k(view) == null) ? false : true;
                }
                if (!zIsTransitionGroup) {
                    int childCount = view.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m1780f(arrayList, view.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo1763g(Object obj);

    /* JADX INFO: renamed from: i */
    public void m1781i(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strM1568k = C0418m.m1568k(view);
            if (strM1568k != null) {
                map.put(strM1568k, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1781i(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m1782j(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo1764l(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: m */
    public abstract void mo1765m(Object obj, View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo1766n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: o */
    public abstract void mo1767o(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: p */
    public abstract void mo1768p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* JADX INFO: renamed from: q */
    public abstract void mo1769q(Object obj, Rect rect);

    /* JADX INFO: renamed from: r */
    public abstract void mo1770r(Object obj, View view);

    /* JADX INFO: renamed from: s */
    public void mo1771s(Fragment fragment, Object obj, C0388a c0388a, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo1772t(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: u */
    public abstract void mo1773u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: v */
    public abstract Object mo1774v(Object obj);
}
