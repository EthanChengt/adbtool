package p006b.p067s;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: b.s.i */
/* JADX INFO: loaded from: classes.dex */
public class C0531i {

    /* JADX INFO: renamed from: e */
    public static final Class<?>[] f3269e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f */
    public static final HashMap<String, Constructor> f3270f = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final Context f3271a;

    /* JADX INFO: renamed from: c */
    public C0532j f3273c;

    /* JADX INFO: renamed from: b */
    public final Object[] f3272b = new Object[2];

    /* JADX INFO: renamed from: d */
    public String[] f3274d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public C0531i(Context context, C0532j c0532j) {
        this.f3271a = context;
        this.f3273c = c0532j;
    }

    /* JADX INFO: renamed from: a */
    public final Preference m1936a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = f3270f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f3271a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e != null) {
                                throw e;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f3269e);
                    constructor.setAccessible(true);
                    f3270f.put(str, constructor);
                } catch (ClassNotFoundException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        Object[] objArr = this.f3272b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* JADX INFO: renamed from: b */
    public final Preference m1937b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? m1936a(str, this.f3274d, attributeSet) : m1936a(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX INFO: renamed from: c */
    public Preference m1938c(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f3272b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f3272b[0] = this.f3271a;
            do {
                try {
                    try {
                        try {
                            next = xmlPullParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (XmlPullParserException e) {
                            InflateException inflateException = new InflateException(e.getMessage());
                            inflateException.initCause(e);
                            throw inflateException;
                        }
                    } catch (InflateException e2) {
                        throw e2;
                    }
                } catch (IOException e3) {
                    InflateException inflateException2 = new InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) m1937b(xmlPullParser.getName(), attributeSetAsAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.m386o(this.f3273c);
                preferenceGroup = preferenceGroup2;
            }
            m1939d(xmlPullParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX INFO: renamed from: d */
    public final void m1939d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jLongValue;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f794m = Intent.parseIntent(this.f3271a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f3271a.getResources();
                    if (preference.f796o == null) {
                        preference.f796o = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f796o);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceM1937b = m1937b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.f811O.contains(preferenceM1937b)) {
                        if (preferenceM1937b.f793l != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.f778I;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = preferenceM1937b.f793l;
                            if (preferenceGroup2.m393H(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        if (preferenceM1937b.f788g == Integer.MAX_VALUE) {
                            if (preferenceGroup.f812P) {
                                int i = preferenceGroup.f813Q;
                                preferenceGroup.f813Q = i + 1;
                                preferenceM1937b.m372D(i);
                            }
                            if (preferenceM1937b instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceM1937b).f812P = preferenceGroup.f812P;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.f811O, preferenceM1937b);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        preferenceM1937b.m390v(preferenceGroup.mo357F());
                        synchronized (preferenceGroup) {
                            preferenceGroup.f811O.add(iBinarySearch, preferenceM1937b);
                        }
                        C0532j c0532j = preferenceGroup.f784c;
                        String str2 = preferenceM1937b.f793l;
                        if (str2 == null) {
                            synchronized (c0532j) {
                                jLongValue = c0532j.f3276b;
                                c0532j.f3276b = 1 + jLongValue;
                            }
                        } else {
                            if (preferenceGroup.f810N.m1269e(str2) >= 0) {
                                jLongValue = preferenceGroup.f810N.getOrDefault(str2, null).longValue();
                                preferenceGroup.f810N.remove(str2);
                            } else {
                                synchronized (c0532j) {
                                    jLongValue = c0532j.f3276b;
                                    c0532j.f3276b = 1 + jLongValue;
                                }
                            }
                        }
                        preferenceM1937b.f785d = jLongValue;
                        preferenceM1937b.f786e = true;
                        try {
                            preferenceM1937b.m386o(c0532j);
                            preferenceM1937b.f786e = false;
                            if (preferenceM1937b.f778I != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceM1937b.f778I = preferenceGroup;
                            if (preferenceGroup.f814R) {
                                preferenceM1937b.mo385n();
                            }
                            Preference.InterfaceC0104c interfaceC0104c = preferenceGroup.f776G;
                            if (interfaceC0104c != null) {
                                C0529g c0529g = (C0529g) interfaceC0104c;
                                c0529g.f3261g.removeCallbacks(c0529g.f3262h);
                                c0529g.f3261g.post(c0529g.f3262h);
                            }
                        } catch (Throwable th) {
                            preferenceM1937b.f786e = false;
                            throw th;
                        }
                    }
                    m1939d(xmlPullParser, preferenceM1937b, attributeSet);
                }
            }
        }
    }
}
