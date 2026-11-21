package p080c.p084b.p085a.p107q.p108j;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import c.a.a.a.a;
import p080c.p084b.p085a.p107q.C0848h;
import p080c.p084b.p085a.p107q.InterfaceC0843c;

/* JADX INFO: renamed from: c.b.a.q.j.i */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC0858i<T extends View, Z> extends AbstractC0850a<Z> {

    /* JADX INFO: renamed from: b */
    public final T f4702b;

    /* JADX INFO: renamed from: c */
    public final a f4703c;

    /* JADX INFO: renamed from: c.b.a.q.j.i$a */
    public static final class a {

        /* JADX INFO: renamed from: d */
        public static Integer f4704d;

        /* JADX INFO: renamed from: a */
        public final View f4705a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC0856g> f4706b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public ViewTreeObserverOnPreDrawListenerC1400a f4707c;

        /* JADX INFO: renamed from: c.b.a.q.j.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC1400a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b */
            public final WeakReference<a> f4708b;

            public ViewTreeObserverOnPreDrawListenerC1400a(a aVar) {
                this.f4708b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f4708b.get();
                if (aVar == null || aVar.f4706b.isEmpty()) {
                    return true;
                }
                int iM2597d = aVar.m2597d();
                int iM2596c = aVar.m2596c();
                if (!aVar.m2598e(iM2597d, iM2596c)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f4706b).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0856g) it.next()).mo2574b(iM2597d, iM2596c);
                }
                aVar.m2594a();
                return true;
            }
        }

        public a(View view) {
            this.f4705a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m2594a() {
            ViewTreeObserver viewTreeObserver = this.f4705a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4707c);
            }
            this.f4707c = null;
            this.f4706b.clear();
        }

        /* JADX INFO: renamed from: b */
        public final int m2595b(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f4705a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f4705a.getContext();
            if (f4704d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f4704d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f4704d.intValue();
        }

        /* JADX INFO: renamed from: c */
        public final int m2596c() {
            int paddingBottom = this.f4705a.getPaddingBottom() + this.f4705a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f4705a.getLayoutParams();
            return m2595b(this.f4705a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* JADX INFO: renamed from: d */
        public final int m2597d() {
            int paddingRight = this.f4705a.getPaddingRight() + this.f4705a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f4705a.getLayoutParams();
            return m2595b(this.f4705a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m2598e(int i, int i2) {
            if (i > 0 || i == Integer.MIN_VALUE) {
                if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }
    }

    public AbstractC0858i(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f4702b = t;
        this.f4703c = new a(t);
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: a */
    public void mo2587a(InterfaceC0856g interfaceC0856g) {
        this.f4703c.f4706b.remove(interfaceC0856g);
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: f */
    public InterfaceC0843c mo2590f() {
        Object tag = this.f4702b.getTag(R.id.fk);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC0843c) {
            return (InterfaceC0843c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: h */
    public void mo2591h(InterfaceC0856g interfaceC0856g) throws Throwable {
        a aVar = this.f4703c;
        int iM2597d = aVar.m2597d();
        int iM2596c = aVar.m2596c();
        if (aVar.m2598e(iM2597d, iM2596c)) {
            ((C0848h) interfaceC0856g).mo2574b(iM2597d, iM2596c);
            return;
        }
        if (!aVar.f4706b.contains(interfaceC0856g)) {
            aVar.f4706b.add(interfaceC0856g);
        }
        if (aVar.f4707c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f4705a.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC1400a viewTreeObserverOnPreDrawListenerC1400a = new a.ViewTreeObserverOnPreDrawListenerC1400a(aVar);
            aVar.f4707c = viewTreeObserverOnPreDrawListenerC1400a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1400a);
        }
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: j */
    public void mo2592j(InterfaceC0843c interfaceC0843c) {
        this.f4702b.setTag(R.id.fk, interfaceC0843c);
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("Target for: ");
        sbM2191e.append(this.f4702b);
        return sbM2191e.toString();
    }
}
