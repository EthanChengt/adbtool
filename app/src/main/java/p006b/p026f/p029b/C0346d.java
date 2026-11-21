package p006b.p026f.p029b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;

/* JADX INFO: renamed from: b.f.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C0346d extends ViewGroup {

    /* JADX INFO: renamed from: b */
    public C0345c f2505b;

    /* JADX INFO: renamed from: b.f.b.d$a */
    public static class a extends ConstraintLayout.C0065a {

        /* JADX INFO: renamed from: l0 */
        public float f2506l0;

        /* JADX INFO: renamed from: m0 */
        public boolean f2507m0;

        /* JADX INFO: renamed from: n0 */
        public float f2508n0;

        /* JADX INFO: renamed from: o0 */
        public float f2509o0;

        /* JADX INFO: renamed from: p0 */
        public float f2510p0;

        /* JADX INFO: renamed from: q0 */
        public float f2511q0;

        /* JADX INFO: renamed from: r0 */
        public float f2512r0;

        /* JADX INFO: renamed from: s0 */
        public float f2513s0;

        /* JADX INFO: renamed from: t0 */
        public float f2514t0;

        /* JADX INFO: renamed from: u0 */
        public float f2515u0;

        /* JADX INFO: renamed from: v0 */
        public float f2516v0;

        /* JADX INFO: renamed from: w0 */
        public float f2517w0;

        public a(int i, int i2) {
            super(i, i2);
            this.f2506l0 = 1.0f;
            this.f2507m0 = false;
            this.f2508n0 = 0.0f;
            this.f2509o0 = 0.0f;
            this.f2510p0 = 0.0f;
            this.f2511q0 = 0.0f;
            this.f2512r0 = 1.0f;
            this.f2513s0 = 1.0f;
            this.f2514t0 = 0.0f;
            this.f2515u0 = 0.0f;
            this.f2516v0 = 0.0f;
            this.f2517w0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            float f;
            super(context, attributeSet);
            this.f2506l0 = 1.0f;
            this.f2507m0 = false;
            this.f2508n0 = 0.0f;
            this.f2509o0 = 0.0f;
            this.f2510p0 = 0.0f;
            this.f2511q0 = 0.0f;
            this.f2512r0 = 1.0f;
            this.f2513s0 = 1.0f;
            this.f2514t0 = 0.0f;
            this.f2515u0 = 0.0f;
            this.f2516v0 = 0.0f;
            this.f2517w0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0350h.f2522b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 13) {
                    this.f2506l0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2506l0);
                } else if (index == 26) {
                    this.f2508n0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2508n0);
                    this.f2507m0 = true;
                } else if (index == 21) {
                    this.f2510p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2510p0);
                } else if (index == 22) {
                    this.f2511q0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2511q0);
                } else if (index == 20) {
                    this.f2509o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2509o0);
                } else if (index == 18) {
                    this.f2512r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2512r0);
                } else if (index == 19) {
                    this.f2513s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2513s0);
                } else if (index == 14) {
                    this.f2514t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2514t0);
                } else if (index == 15) {
                    this.f2515u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2515u0);
                } else {
                    if (index == 16) {
                        f = this.f2516v0;
                    } else if (index == 17) {
                        this.f2517w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2517w0);
                    } else if (index == 25) {
                        f = 0.0f;
                    }
                    this.f2516v0 = typedArrayObtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0065a(layoutParams);
    }

    public C0345c getConstraintSet() {
        if (this.f2505b == null) {
            this.f2505b = new C0345c();
        }
        C0345c c0345c = this.f2505b;
        Objects.requireNonNull(c0345c);
        int childCount = getChildCount();
        c0345c.f2430a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!c0345c.f2430a.containsKey(Integer.valueOf(id))) {
                c0345c.f2430a.put(Integer.valueOf(id), new C0345c.a());
            }
            C0345c.a aVar2 = c0345c.f2430a.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC0344b) {
                AbstractC0344b abstractC0344b = (AbstractC0344b) childAt;
                aVar2.m1401b(id, aVar);
                if (abstractC0344b instanceof C0343a) {
                    aVar2.f2496t0 = 1;
                    C0343a c0343a = (C0343a) abstractC0344b;
                    aVar2.f2494s0 = c0343a.getType();
                    aVar2.f2498u0 = c0343a.getReferencedIds();
                }
            }
            aVar2.m1401b(id, aVar);
        }
        return this.f2505b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
