package p080c.p126d.p127a.p128a.p131c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: c.d.a.a.c.h */
/* JADX INFO: loaded from: classes.dex */
public class C1189h {

    /* JADX INFO: renamed from: a */
    public long f5677a;

    /* JADX INFO: renamed from: b */
    public long f5678b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f5679c;

    /* JADX INFO: renamed from: d */
    public int f5680d;

    /* JADX INFO: renamed from: e */
    public int f5681e;

    public C1189h(long j, long j2) {
        this.f5677a = 0L;
        this.f5678b = 300L;
        this.f5679c = null;
        this.f5680d = 0;
        this.f5681e = 1;
        this.f5677a = j;
        this.f5678b = j2;
    }

    public C1189h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f5677a = 0L;
        this.f5678b = 300L;
        this.f5679c = null;
        this.f5680d = 0;
        this.f5681e = 1;
        this.f5677a = j;
        this.f5678b = j2;
        this.f5679c = timeInterpolator;
    }

    /* JADX INFO: renamed from: a */
    public void m2768a(Animator animator) {
        animator.setStartDelay(this.f5677a);
        animator.setDuration(this.f5678b);
        animator.setInterpolator(m2769b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f5680d);
            valueAnimator.setRepeatMode(this.f5681e);
        }
    }

    /* JADX INFO: renamed from: b */
    public TimeInterpolator m2769b() {
        TimeInterpolator timeInterpolator = this.f5679c;
        return timeInterpolator != null ? timeInterpolator : C1182a.f5663b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1189h)) {
            return false;
        }
        C1189h c1189h = (C1189h) obj;
        if (this.f5677a == c1189h.f5677a && this.f5678b == c1189h.f5678b && this.f5680d == c1189h.f5680d && this.f5681e == c1189h.f5681e) {
            return m2769b().getClass().equals(c1189h.m2769b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5677a;
        long j2 = this.f5678b;
        return ((((m2769b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.f5680d) * 31) + this.f5681e;
    }

    public String toString() {
        return '\n' + C1189h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f5677a + " duration: " + this.f5678b + " interpolator: " + m2769b().getClass() + " repeatCount: " + this.f5680d + " repeatMode: " + this.f5681e + "}\n";
    }
}
