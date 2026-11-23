package p006b.p068t.p069b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p006b.p032h.p043i.C0404d;
import p006b.p032h.p043i.InterfaceC0403c;

/* JADX INFO: renamed from: b.t.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0538a implements C0554q.a {

    /* JADX INFO: renamed from: d */
    public final a f3309d;

    /* JADX INFO: renamed from: a */
    public InterfaceC0403c<b> f3306a = new C0404d(30);

    /* JADX INFO: renamed from: b */
    public final ArrayList<b> f3307b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<b> f3308c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public int f3311f = 0;

    /* JADX INFO: renamed from: e */
    public final C0554q f3310e = new C0554q(this);

    /* JADX INFO: renamed from: b.t.b.a$a */
    public interface a {
    }

    /* JADX INFO: renamed from: b.t.b.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f3312a;

        /* JADX INFO: renamed from: b */
        public int f3313b;

        /* JADX INFO: renamed from: c */
        public Object f3314c;

        /* JADX INFO: renamed from: d */
        public int f3315d;

        public b(int i, int i2, int i3, Object obj) {
            this.f3312a = i;
            this.f3313b = i2;
            this.f3315d = i3;
            this.f3314c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f3312a;
            if (i != bVar.f3312a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3315d - this.f3313b) == 1 && this.f3315d == bVar.f3313b && this.f3313b == bVar.f3315d) {
                return true;
            }
            if (this.f3315d != bVar.f3315d || this.f3313b != bVar.f3313b) {
                return false;
            }
            Object obj2 = this.f3314c;
            Object obj3 = bVar.f3314c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3312a * 31) + this.f3313b) * 31) + this.f3315d;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f3312a;
            if (i == 1) {
                str = "add";
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f3313b);
            sb.append("c:");
            sb.append(this.f3315d);
            sb.append(",p:");
            sb.append(this.f3314c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C0538a(a aVar) {
        this.f3309d = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1983a(int i) {
        int size = this.f3308c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f3308c.get(i2);
            int i3 = bVar.f3312a;
            if (i3 == 8) {
                if (m1988f(bVar.f3315d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3313b;
                int i5 = bVar.f3315d + i4;
                while (i4 < i5) {
                    if (m1988f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m1984b() {
        int size = this.f3308c.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.C0131f) this.f3309d).m530a(this.f3308c.get(i));
        }
        m1994l(this.f3308c);
        this.f3311f = 0;
    }

    /* JADX INFO: renamed from: c */
    public void m1985c() {
        m1984b();
        int size = this.f3307b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f3307b.get(i);
            int i2 = bVar.f3312a;
            if (i2 == 1) {
                ((RecyclerView.C0131f) this.f3309d).m530a(bVar);
                RecyclerView.C0131f c0131f = (RecyclerView.C0131f) this.f3309d;
                c0131f.offsetPositionRecordsForInsert(bVar.f3313b, bVar.f3315d);
            } else if (i2 == 2) {
                ((RecyclerView.C0131f) this.f3309d).m530a(bVar);
                a aVar = this.f3309d;
                int i3 = bVar.f3313b;
                int i4 = bVar.f3315d;
                RecyclerView.C0131f c0131f2 = (RecyclerView.C0131f) aVar;
                c0131f2.offsetPositionRecordsForRemove(i3, i4);
            } else if (i2 == 4) {
                ((RecyclerView.C0131f) this.f3309d).m530a(bVar);
                ((RecyclerView.C0131f) this.f3309d).m532c(bVar.f3313b, bVar.f3315d, bVar.f3314c);
            } else if (i2 == 8) {
                ((RecyclerView.C0131f) this.f3309d).m530a(bVar);
                RecyclerView.C0131f c0131f3 = (RecyclerView.C0131f) this.f3309d;
                c0131f3.offsetPositionRecordsForMove(bVar.f3313b, bVar.f3315d);
            }
        }
        m1994l(this.f3307b);
        this.f3311f = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m1986d(b bVar) {
        int i;
        int i2 = bVar.f3312a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM1995m = m1995m(bVar.f3313b, i2);
        int i3 = bVar.f3313b;
        int i4 = bVar.f3312a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3315d; i6++) {
            int iM1995m2 = m1995m((i * i6) + bVar.f3313b, bVar.f3312a);
            int i7 = bVar.f3312a;
            if (i7 == 2 ? iM1995m2 == iM1995m : i7 == 4 && iM1995m2 == iM1995m + 1) {
                i5++;
            } else {
                b bVarM1990h = m1990h(i7, iM1995m, i5, bVar.f3314c);
                m1987e(bVarM1990h, i3);
                m1993k(bVarM1990h);
                if (bVar.f3312a == 4) {
                    i3 += i5;
                }
                iM1995m = iM1995m2;
                i5 = 1;
            }
        }
        Object obj = bVar.f3314c;
        m1993k(bVar);
        if (i5 > 0) {
            b bVarM1990h2 = m1990h(bVar.f3312a, iM1995m, i5, obj);
            m1987e(bVarM1990h2, i3);
            m1993k(bVarM1990h2);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1987e(b bVar, int i) {
        ((RecyclerView.C0131f) this.f3309d).m530a(bVar);
        int i2 = bVar.f3312a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            RecyclerView.C0131f c0131f = (RecyclerView.C0131f) this.f3309d;
            c0131f.viewRangeUpdateForHelper(i, bVar.f3315d, bVar.f3314c);
            return;
        }
        a aVar = this.f3309d;
        int i3 = bVar.f3315d;
        RecyclerView.C0131f c0131f2 = (RecyclerView.C0131f) aVar;
        c0131f2.offsetPositionRecordsForRemove(i, i3);
    }

    /* JADX INFO: renamed from: f */
    public int m1988f(int i, int i2) {
        int size = this.f3308c.size();
        while (i2 < size) {
            b bVar = this.f3308c.get(i2);
            int i3 = bVar.f3312a;
            if (i3 == 8) {
                int i4 = bVar.f3313b;
                if (i4 == i) {
                    i = bVar.f3315d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3315d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3313b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3315d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3315d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1989g() {
        return this.f3307b.size() > 0;
    }

    /* JADX INFO: renamed from: h */
    public b m1990h(int i, int i2, int i3, Object obj) {
        b bVarMo1537b = this.f3306a.mo1537b();
        if (bVarMo1537b == null) {
            return new b(i, i2, i3, obj);
        }
        bVarMo1537b.f3312a = i;
        bVarMo1537b.f3313b = i2;
        bVarMo1537b.f3315d = i3;
        bVarMo1537b.f3314c = obj;
        return bVarMo1537b;
    }

    /* JADX INFO: renamed from: i */
    public final void m1991i(b bVar) {
        this.f3308c.add(bVar);
        int i = bVar.f3312a;
        if (i == 1) {
            RecyclerView.C0131f c0131f = (RecyclerView.C0131f) this.f3309d;
            c0131f.offsetPositionRecordsForInsert(bVar.f3313b, bVar.f3315d);
            return;
        }
        if (i == 2) {
            RecyclerView.C0131f c0131f2 = (RecyclerView.C0131f) this.f3309d;
            c0131f2.offsetPositionRecordsForRemoveWithoutUpdate(bVar.f3313b, bVar.f3315d);
            return;
        }
        if (i == 4) {
            ((RecyclerView.C0131f) this.f3309d).m532c(bVar.f3313b, bVar.f3315d, bVar.f3314c);
        } else {
            if (i != 8) {
                throw new IllegalArgumentException("Unknown update op type for " + bVar);
            }
            RecyclerView.C0131f c0131f3 = (RecyclerView.C0131f) this.f3309d;
            c0131f3.offsetPositionRecordsForMove(bVar.f3313b, bVar.f3315d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0178 A[PHI: r4
      0x0178: PHI (r4v15 int) = (r4v9 int), (r4v19 int) binds: [B:95:0x0176, B:82:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: j */
    public void m1992j() {
        boolean z;
        byte b2;
        b bVarM1990h;
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        C0554q c0554q = this.f3310e;
        ArrayList<b> arrayList = this.f3307b;
        Objects.requireNonNull(c0554q);
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f3312a == 8) {
                    if (z5) {
                        break;
                    }
                } else {
                    z5 = true;
                }
                size--;
            }
            b bVarM1990h2 = null;
            if (size == -1) {
                break;
            }
            int i5 = size + 1;
            b bVar = arrayList.get(size);
            b bVar2 = arrayList.get(i5);
            int i6 = bVar2.f3312a;
            if (i6 == 1) {
                int i7 = bVar.f3315d;
                int i8 = bVar2.f3313b;
                int i9 = i7 < i8 ? -1 : 0;
                int i10 = bVar.f3313b;
                if (i10 < i8) {
                    i9++;
                }
                if (i8 <= i10) {
                    bVar.f3313b = i10 + bVar2.f3315d;
                }
                int i11 = bVar2.f3313b;
                if (i11 <= i7) {
                    bVar.f3315d = i7 + bVar2.f3315d;
                }
                bVar2.f3313b = i11 + i9;
                arrayList.set(size, bVar2);
                arrayList.set(i5, bVar);
            } else if (i6 == 2) {
                int i12 = bVar.f3313b;
                int i13 = bVar.f3315d;
                int i14 = bVar2.f3313b;
                if (i12 < i13) {
                    if (i14 == i12 && bVar2.f3315d == i13 - i12) {
                        z4 = false;
                        z3 = z4;
                        z2 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i14 == i13 + 1 && bVar2.f3315d == i12 - i13) {
                    z4 = true;
                    z3 = z4;
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (i13 < i14) {
                    bVar2.f3313b = i14 - 1;
                } else {
                    int i15 = bVar2.f3315d;
                    if (i13 < i14 + i15) {
                        bVar2.f3315d = i15 - 1;
                        bVar.f3312a = 2;
                        bVar.f3315d = 1;
                        if (bVar2.f3315d == 0) {
                            arrayList.remove(i5);
                            ((C0538a) c0554q.f3442a).m1993k(bVar2);
                        }
                    }
                }
                int i16 = bVar.f3313b;
                int i17 = bVar2.f3313b;
                if (i16 <= i17) {
                    bVar2.f3313b = i17 + 1;
                } else {
                    int i18 = i17 + bVar2.f3315d;
                    if (i16 < i18) {
                        bVarM1990h2 = ((C0538a) c0554q.f3442a).m1990h(2, i16 + 1, i18 - i16, null);
                        bVar2.f3315d = bVar.f3313b - bVar2.f3313b;
                    }
                }
                if (z2) {
                    arrayList.set(size, bVar2);
                    arrayList.remove(i5);
                    ((C0538a) c0554q.f3442a).m1993k(bVar);
                } else {
                    if (z3) {
                        if (bVarM1990h2 != null) {
                            int i19 = bVar.f3313b;
                            if (i19 > bVarM1990h2.f3313b) {
                                bVar.f3313b = i19 - bVarM1990h2.f3315d;
                            }
                            int i20 = bVar.f3315d;
                            if (i20 > bVarM1990h2.f3313b) {
                                bVar.f3315d = i20 - bVarM1990h2.f3315d;
                            }
                        }
                        int i21 = bVar.f3313b;
                        if (i21 > bVar2.f3313b) {
                            bVar.f3313b = i21 - bVar2.f3315d;
                        }
                        i4 = bVar.f3315d;
                        if (i4 > bVar2.f3313b) {
                            bVar.f3315d = i4 - bVar2.f3315d;
                        }
                    } else {
                        if (bVarM1990h2 != null) {
                            int i22 = bVar.f3313b;
                            if (i22 >= bVarM1990h2.f3313b) {
                                bVar.f3313b = i22 - bVarM1990h2.f3315d;
                            }
                            int i23 = bVar.f3315d;
                            if (i23 >= bVarM1990h2.f3313b) {
                                bVar.f3315d = i23 - bVarM1990h2.f3315d;
                            }
                        }
                        int i24 = bVar.f3313b;
                        if (i24 >= bVar2.f3313b) {
                            bVar.f3313b = i24 - bVar2.f3315d;
                        }
                        i4 = bVar.f3315d;
                        if (i4 >= bVar2.f3313b) {
                            bVar.f3315d = i4 - bVar2.f3315d;
                        }
                    }
                    arrayList.set(size, bVar2);
                    if (bVar.f3313b != bVar.f3315d) {
                        arrayList.set(i5, bVar);
                    } else {
                        arrayList.remove(i5);
                    }
                    if (bVarM1990h2 != null) {
                        arrayList.add(size, bVarM1990h2);
                    }
                }
            } else if (i6 == 4) {
                int i25 = bVar.f3315d;
                int i26 = bVar2.f3313b;
                if (i25 < i26) {
                    bVar2.f3313b = i26 - 1;
                } else {
                    int i27 = bVar2.f3315d;
                    if (i25 < i26 + i27) {
                        bVar2.f3315d = i27 - 1;
                        bVarM1990h = ((C0538a) c0554q.f3442a).m1990h(4, bVar.f3313b, 1, bVar2.f3314c);
                    }
                    i = bVar.f3313b;
                    i2 = bVar2.f3313b;
                    if (i <= i2) {
                        bVar2.f3313b = i2 + 1;
                    } else {
                        i3 = i2 + bVar2.f3315d;
                        if (i < i3) {
                            int i28 = i3 - i;
                            bVarM1990h2 = ((C0538a) c0554q.f3442a).m1990h(4, i + 1, i28, bVar2.f3314c);
                            bVar2.f3315d -= i28;
                        }
                    }
                    arrayList.set(i5, bVar);
                    if (bVar2.f3315d > 0) {
                        arrayList.set(size, bVar2);
                    } else {
                        arrayList.remove(size);
                        ((C0538a) c0554q.f3442a).m1993k(bVar2);
                    }
                    if (bVarM1990h != null) {
                        arrayList.add(size, bVarM1990h);
                    }
                    if (bVarM1990h2 != null) {
                        arrayList.add(size, bVarM1990h2);
                    }
                }
                bVarM1990h = null;
                i = bVar.f3313b;
                i2 = bVar2.f3313b;
                if (i <= i2) {
                    bVar2.f3313b = i2 + 1;
                } else {
                    i3 = i2 + bVar2.f3315d;
                    if (i < i3) {
                        int i29 = i3 - i;
                        bVarM1990h2 = ((C0538a) c0554q.f3442a).m1990h(4, i + 1, i29, bVar2.f3314c);
                        bVar2.f3315d -= i29;
                    }
                }
                arrayList.set(i5, bVar);
                if (bVar2.f3315d > 0) {
                    arrayList.set(size, bVar2);
                } else {
                    arrayList.remove(size);
                    ((C0538a) c0554q.f3442a).m1993k(bVar2);
                }
                if (bVarM1990h != null) {
                    arrayList.add(size, bVarM1990h);
                }
                if (bVarM1990h2 != null) {
                    arrayList.add(size, bVarM1990h2);
                }
            }
        }
        int size2 = this.f3307b.size();
        for (int i30 = 0; i30 < size2; i30++) {
            b bVarM1990h3 = this.f3307b.get(i30);
            int i31 = bVarM1990h3.f3312a;
            if (i31 == 1) {
                m1991i(bVarM1990h3);
            } else if (i31 == 2) {
                int i32 = bVarM1990h3.f3313b;
                int i33 = bVarM1990h3.f3315d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b3 = -1;
                while (i34 < i33) {
                    if (((RecyclerView.C0131f) this.f3309d).m531b(i34) != null || m1983a(i34)) {
                        if (b3 == 0) {
                            m1986d(m1990h(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b2 = 1;
                    } else {
                        if (b3 == 1) {
                            m1991i(m1990h(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b2 = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b3 = b2;
                }
                if (i35 != bVarM1990h3.f3315d) {
                    m1993k(bVarM1990h3);
                    bVarM1990h3 = m1990h(2, i32, i35, null);
                }
                if (b3 == 0) {
                    m1986d(bVarM1990h3);
                } else {
                    m1991i(bVarM1990h3);
                }
            } else if (i31 == 4) {
                int i36 = bVarM1990h3.f3313b;
                int i37 = bVarM1990h3.f3315d + i36;
                int i38 = i36;
                int i39 = 0;
                byte b4 = -1;
                while (i36 < i37) {
                    if (((RecyclerView.C0131f) this.f3309d).m531b(i36) != null || m1983a(i36)) {
                        if (b4 == 0) {
                            m1986d(m1990h(4, i38, i39, bVarM1990h3.f3314c));
                            i38 = i36;
                            i39 = 0;
                        }
                        b4 = 1;
                    } else {
                        if (b4 == 1) {
                            m1991i(m1990h(4, i38, i39, bVarM1990h3.f3314c));
                            i38 = i36;
                            i39 = 0;
                        }
                        b4 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != bVarM1990h3.f3315d) {
                    Object obj = bVarM1990h3.f3314c;
                    m1993k(bVarM1990h3);
                    bVarM1990h3 = m1990h(4, i38, i39, obj);
                }
                if (b4 == 0) {
                    m1986d(bVarM1990h3);
                } else {
                    m1991i(bVarM1990h3);
                }
            } else if (i31 == 8) {
                m1991i(bVarM1990h3);
            }
        }
        this.f3307b.clear();
    }

    /* JADX INFO: renamed from: k */
    public void m1993k(b bVar) {
        bVar.f3314c = null;
        this.f3306a.mo1536a(bVar);
    }

    /* JADX INFO: renamed from: l */
    public void m1994l(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m1993k(list.get(i));
        }
        list.clear();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX INFO: renamed from: m */
    public final int m1995m(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f3308c.size() - 1; size >= 0; size--) {
            b bVar = this.f3308c.get(size);
            int i9 = bVar.f3312a;
            if (i9 == 8) {
                int i10 = bVar.f3313b;
                int i11 = bVar.f3315d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f3313b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f3313b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f3315d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f3315d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f3313b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f3313b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f3313b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f3315d;
                } else if (i9 == 2) {
                    i += bVar.f3315d;
                }
            }
        }
        for (int size2 = this.f3308c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3308c.get(size2);
            if (bVar2.f3312a == 8) {
                int i13 = bVar2.f3315d;
                if (i13 == bVar2.f3313b || i13 < 0) {
                    this.f3308c.remove(size2);
                    m1993k(bVar2);
                }
            } else if (bVar2.f3315d <= 0) {
                this.f3308c.remove(size2);
                m1993k(bVar2);
            }
        }
        return i;
    }
}
