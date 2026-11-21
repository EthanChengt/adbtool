package p080c.p126d.p127a.p128a.p133d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: c.d.a.a.d.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1200d<V extends View> extends C1202f<V> {

    /* JADX INFO: renamed from: c */
    public Runnable f5691c;

    /* JADX INFO: renamed from: d */
    public OverScroller f5692d;

    /* JADX INFO: renamed from: e */
    public boolean f5693e;

    /* JADX INFO: renamed from: f */
    public int f5694f;

    /* JADX INFO: renamed from: g */
    public int f5695g;

    /* JADX INFO: renamed from: h */
    public int f5696h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f5697i;

    /* JADX WARN: Field signature parse error: c
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:161)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:37)
     */
    /* JADX INFO: renamed from: c.d.a.a.d.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final CoordinatorLayout f5698b;

        /* JADX INFO: renamed from: c */
        public final View f5699c;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.f5698b = coordinatorLayout;
            this.f5699c = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f5699c == null || (overScroller = AbstractC1200d.this.f5692d) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                AbstractC1200d abstractC1200d = AbstractC1200d.this;
                abstractC1200d.m2775H(this.f5698b, this.f5699c, abstractC1200d.f5692d.getCurrY());
                View view = this.f5699c;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                view.postOnAnimation(this);
                return;
            }
            AbstractC1200d abstractC1200d2 = AbstractC1200d.this;
            CoordinatorLayout coordinatorLayout = this.f5698b;
            View view2 = this.f5699c;
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) abstractC1200d2;
            Objects.requireNonNull(baseBehavior);
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            baseBehavior.m3054P(coordinatorLayout, appBarLayout);
            if (appBarLayout.f10124k) {
                appBarLayout.m3044c(appBarLayout.m3045d(baseBehavior.m3050L(coordinatorLayout)));
            }
        }
    }

    public AbstractC1200d() {
        this.f5694f = -1;
        this.f5696h = -1;
    }

    public AbstractC1200d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5694f = -1;
        this.f5696h = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: A */
    public boolean mo163A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f5696h < 0) {
            this.f5696h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5697i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.f5697i.computeCurrentVelocity(1000);
                    float yVelocity = this.f5697i.getYVelocity(this.f5694f);
                    AppBarLayout appBarLayout = (AppBarLayout) v;
                    int i = -appBarLayout.getTotalScrollRange();
                    Runnable runnable = this.f5691c;
                    if (runnable != null) {
                        v.removeCallbacks(runnable);
                        this.f5691c = null;
                    }
                    if (this.f5692d == null) {
                        this.f5692d = new OverScroller(v.getContext());
                    }
                    this.f5692d.fling(0, m2779B(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (this.f5692d.computeScrollOffset()) {
                        a aVar = new a(coordinatorLayout, v);
                        this.f5691c = aVar;
                        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                        v.postOnAnimation(aVar);
                    } else {
                        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
                        baseBehavior.m3054P(coordinatorLayout, appBarLayout);
                        if (appBarLayout.f10124k) {
                            appBarLayout.m3044c(appBarLayout.m3045d(baseBehavior.m3050L(coordinatorLayout)));
                        }
                    }
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f5694f);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i2 = this.f5695g - y;
                if (!this.f5693e) {
                    int iAbs = Math.abs(i2);
                    int i3 = this.f5696h;
                    if (iAbs > i3) {
                        this.f5693e = true;
                        i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                    }
                }
                if (this.f5693e) {
                    this.f5695g = y;
                    m2774G(coordinatorLayout, v, i2, -((AppBarLayout) v).getDownNestedScrollRange(), 0);
                }
            } else if (actionMasked == 3) {
            }
            this.f5693e = false;
            this.f5694f = -1;
            VelocityTracker velocityTracker2 = this.f5697i;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f5697i = null;
            }
        } else {
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!coordinatorLayout.m152q(v, x, y2) || !mo2772E(v)) {
                return false;
            }
            this.f5695g = y2;
            this.f5694f = motionEvent.getPointerId(0);
            if (this.f5697i == null) {
                this.f5697i = VelocityTracker.obtain();
            }
        }
        VelocityTracker velocityTracker3 = this.f5697i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public abstract boolean mo2772E(V v);

    /* JADX INFO: renamed from: F */
    public abstract int mo2773F();

    /* JADX INFO: renamed from: G */
    public final int m2774G(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo2776I(coordinatorLayout, v, mo2773F() - i, i2, i3);
    }

    /* JADX INFO: renamed from: H */
    public int m2775H(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo2776I(coordinatorLayout, v, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: I */
    public abstract int mo2776I(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: j */
    public boolean mo173j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.f5696h < 0) {
            this.f5696h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f5693e) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5693e = false;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (mo2772E(v) && coordinatorLayout.m152q(v, x, y)) {
                this.f5695g = y;
                this.f5694f = motionEvent.getPointerId(0);
                if (this.f5697i == null) {
                    this.f5697i = VelocityTracker.obtain();
                }
            }
        } else if (actionMasked == 1) {
            this.f5693e = false;
            this.f5694f = -1;
            velocityTracker = this.f5697i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5697i = null;
            }
        } else if (actionMasked == 2) {
            int i = this.f5694f;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f5695g) > this.f5696h) {
                    this.f5693e = true;
                    this.f5695g = y2;
                }
            }
        } else if (actionMasked == 3) {
            this.f5693e = false;
            this.f5694f = -1;
            velocityTracker = this.f5697i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5697i = null;
            }
        }
        VelocityTracker velocityTracker2 = this.f5697i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.f5693e;
    }
}
