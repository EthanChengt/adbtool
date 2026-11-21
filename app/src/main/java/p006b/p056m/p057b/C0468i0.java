package p006b.p056m.p057b;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p006b.p032h.p040f.C0388a;

/* JADX INFO: renamed from: b.m.b.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C0468i0 extends AbstractC0476m0 {

    /* JADX INFO: renamed from: b.m.b.i0$a */
    public class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f3053a;

        public a(C0468i0 c0468i0, Rect rect) {
            this.f3053a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3053a;
        }
    }

    /* JADX INFO: renamed from: b.m.b.i0$b */
    public class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f3054a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f3055b;

        public b(C0468i0 c0468i0, View view, ArrayList arrayList) {
            this.f3054a = view;
            this.f3055b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3054a.setVisibility(8);
            int size = this.f3055b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3055b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX INFO: renamed from: b.m.b.i0$c */
    public class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f3056a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f3057b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f3058c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f3059d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f3060e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f3061f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3056a = obj;
            this.f3057b = arrayList;
            this.f3058c = obj2;
            this.f3059d = arrayList2;
            this.f3060e = obj3;
            this.f3061f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3056a;
            if (obj != null) {
                C0468i0.this.mo1766n(obj, this.f3057b, null);
            }
            Object obj2 = this.f3058c;
            if (obj2 != null) {
                C0468i0.this.mo1766n(obj2, this.f3059d, null);
            }
            Object obj3 = this.f3060e;
            if (obj3 != null) {
                C0468i0.this.mo1766n(obj3, this.f3061f, null);
            }
        }
    }

    /* JADX INFO: renamed from: b.m.b.i0$d */
    public class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f3063a;

        public d(C0468i0 c0468i0, Runnable runnable) {
            this.f3063a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3063a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: b.m.b.i0$e */
    public class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f3064a;

        public e(C0468i0 c0468i0, Rect rect) {
            this.f3064a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3064a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3064a;
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m1758w(Transition transition) {
        return (AbstractC0476m0.m1779k(transition.getTargetIds()) && AbstractC0476m0.m1779k(transition.getTargetNames()) && AbstractC0476m0.m1779k(transition.getTargetTypes())) ? false : true;
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: a */
    public void mo1759a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: b */
    public void mo1760b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1760b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m1758w(transition) || !AbstractC0476m0.m1779k(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: c */
    public void mo1761c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: e */
    public boolean mo1762e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: g */
    public Object mo1763g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: l */
    public Object mo1764l(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: m */
    public void mo1765m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: n */
    public void mo1766n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1766n(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m1758w(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: o */
    public void mo1767o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: p */
    public void mo1768p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: q */
    public void mo1769q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(this, rect));
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: r */
    public void mo1770r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1782j(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: s */
    public void mo1771s(Fragment fragment, Object obj, C0388a c0388a, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: t */
    public void mo1772t(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0476m0.m1777d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1760b(transitionSet, arrayList);
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: u */
    public void mo1773u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo1766n(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: v */
    public Object mo1774v(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
