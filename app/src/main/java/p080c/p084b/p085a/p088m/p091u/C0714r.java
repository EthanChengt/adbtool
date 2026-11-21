package p080c.p084b.p085a.p088m.p091u;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;

/* JADX INFO: renamed from: c.b.a.m.u.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0714r extends Exception {

    /* JADX INFO: renamed from: g */
    public static final StackTraceElement[] f4246g = new StackTraceElement[0];

    /* JADX INFO: renamed from: b */
    public final List<Throwable> f4247b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0645m f4248c;

    /* JADX INFO: renamed from: d */
    public EnumC0633a f4249d;

    /* JADX INFO: renamed from: e */
    public Class<?> f4250e;

    /* JADX INFO: renamed from: f */
    public String f4251f;

    /* JADX INFO: renamed from: c.b.a.m.u.r$a */
    public static final class a implements Appendable {

        /* JADX INFO: renamed from: b */
        public final Appendable f4252b;

        /* JADX INFO: renamed from: c */
        public boolean f4253c = true;

        public a(Appendable appendable) {
            this.f4252b = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f4253c) {
                this.f4253c = false;
                this.f4252b.append("  ");
            }
            this.f4253c = c2 == '\n';
            this.f4252b.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f4253c) {
                this.f4253c = false;
                this.f4252b.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f4253c = z;
            this.f4252b.append(charSequence, i, i2);
            return this;
        }
    }

    public C0714r(String str) {
        List<Throwable> listEmptyList = Collections.emptyList();
        this.f4251f = str;
        setStackTrace(f4246g);
        this.f4247b = listEmptyList;
    }

    public C0714r(String str, List<Throwable> list) {
        this.f4251f = str;
        setStackTrace(f4246g);
        this.f4247b = list;
    }

    /* JADX INFO: renamed from: b */
    public static void m2414b(List<Throwable> list, Appendable appendable) {
        try {
            m2415c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2415c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof C0714r) {
                ((C0714r) th).m2419f(appendable);
            } else {
                m2416d(th, appendable);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2416d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2417a(Throwable th, List<Throwable> list) {
        if (!(th instanceof C0714r)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((C0714r) th).f4247b.iterator();
        while (it.hasNext()) {
            m2417a(it.next(), list);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2418e(String str) {
        ArrayList arrayList = new ArrayList();
        m2417a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sbM2191e = a.m2191e("Root cause (");
            int i2 = i + 1;
            sbM2191e.append(i2);
            sbM2191e.append(" of ");
            sbM2191e.append(size);
            sbM2191e.append(")");
            Log.i(str, sbM2191e.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2419f(Appendable appendable) {
        m2416d(this, appendable);
        m2414b(this.f4247b, new a(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String string;
        String string2;
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f4251f);
        String string3 = "";
        if (this.f4250e != null) {
            StringBuilder sbM2191e = a.m2191e(", ");
            sbM2191e.append(this.f4250e);
            string = sbM2191e.toString();
        } else {
            string = "";
        }
        sb.append(string);
        if (this.f4249d != null) {
            StringBuilder sbM2191e2 = a.m2191e(", ");
            sbM2191e2.append(this.f4249d);
            string2 = sbM2191e2.toString();
        } else {
            string2 = "";
        }
        sb.append(string2);
        if (this.f4248c != null) {
            StringBuilder sbM2191e3 = a.m2191e(", ");
            sbM2191e3.append(this.f4248c);
            string3 = sbM2191e3.toString();
        }
        sb.append(string3);
        ArrayList<Throwable> arrayList = new ArrayList();
        m2417a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str = " root causes:";
        }
        sb.append(str);
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        m2419f(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m2419f(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m2419f(printWriter);
    }

    public C0714r(String str, Throwable th) {
        List<Throwable> listSingletonList = Collections.singletonList(th);
        this.f4251f = str;
        setStackTrace(f4246g);
        this.f4247b = listSingletonList;
    }
}
