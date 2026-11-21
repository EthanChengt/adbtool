package p080c.p084b.p085a.p088m.p091u.p092c0;

import java.util.ArrayDeque;
import java.util.Queue;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0686l;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.u.c0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0677c<T extends InterfaceC0686l> {

    /* JADX INFO: renamed from: a */
    public final Queue<T> f4004a;

    public AbstractC0677c() {
        char[] cArr = C0875j.f4742a;
        this.f4004a = new ArrayDeque(20);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo2325a();

    /* JADX INFO: renamed from: b */
    public T m2326b() {
        T tPoll = this.f4004a.poll();
        return tPoll == null ? (T) mo2325a() : tPoll;
    }

    /* JADX INFO: renamed from: c */
    public void m2327c(T t) {
        if (this.f4004a.size() < 20) {
            this.f4004a.offer(t);
        }
    }
}
