package p080c.p084b.p085a.p088m.p095v;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.m.v.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0732j implements InterfaceC0730h {

    /* JADX INFO: renamed from: b */
    public final Map<String, List<InterfaceC0731i>> f4311b;

    /* JADX INFO: renamed from: c */
    public volatile Map<String, String> f4312c;

    /* JADX INFO: renamed from: c.b.a.m.v.j$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final String f4313b;

        /* JADX INFO: renamed from: c */
        public static final Map<String, List<InterfaceC0731i>> f4314c;

        /* JADX INFO: renamed from: a */
        public Map<String, List<InterfaceC0731i>> f4315a = f4314c;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                        cCharAt = '?';
                    }
                    sb.append(cCharAt);
                }
                property = sb.toString();
            }
            f4313b = property;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f4314c = Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.j$b */
    public static final class b implements InterfaceC0731i {

        /* JADX INFO: renamed from: a */
        public final String f4316a;

        public b(String str) {
            this.f4316a = str;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0731i
        /* JADX INFO: renamed from: a */
        public String mo2439a() {
            return this.f4316a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f4316a.equals(((b) obj).f4316a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4316a.hashCode();
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("StringHeaderFactory{value='");
            sbM2191e.append(this.f4316a);
            sbM2191e.append('\'');
            sbM2191e.append('}');
            return sbM2191e.toString();
        }
    }

    public C0732j(Map<String, List<InterfaceC0731i>> map) {
        this.f4311b = Collections.unmodifiableMap(map);
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0730h
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo2438a() {
        if (this.f4312c == null) {
            synchronized (this) {
                if (this.f4312c == null) {
                    this.f4312c = Collections.unmodifiableMap(m2440b());
                }
            }
        }
        return this.f4312c;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m2440b() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<InterfaceC0731i>> entry : this.f4311b.entrySet()) {
            List<InterfaceC0731i> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String strMo2439a = value.get(i).mo2439a();
                if (!TextUtils.isEmpty(strMo2439a)) {
                    sb.append(strMo2439a);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0732j) {
            return this.f4311b.equals(((C0732j) obj).f4311b);
        }
        return false;
    }

    public int hashCode() {
        return this.f4311b.hashCode();
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("LazyHeaders{headers=");
        sbM2191e.append(this.f4311b);
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
