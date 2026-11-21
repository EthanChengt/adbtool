package p006b.p008b.p016h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.MenuItemC0232j;
import p006b.p008b.p018i.C0255e0;
import p006b.p008b.p018i.C0294x0;
import p006b.p032h.p038e.p039a.InterfaceMenuC0385a;
import p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b;
import p006b.p032h.p044j.AbstractC0407b;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.b.h.f */
/* JADX INFO: loaded from: classes.dex */
public class C0220f extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class<?>[] f1500e;

    /* JADX INFO: renamed from: f */
    public static final Class<?>[] f1501f;

    /* JADX INFO: renamed from: a */
    public final Object[] f1502a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1503b;

    /* JADX INFO: renamed from: c */
    public Context f1504c;

    /* JADX INFO: renamed from: d */
    public Object f1505d;

    /* JADX INFO: renamed from: b.b.h.f$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: d */
        public static final Class<?>[] f1506d = {MenuItem.class};

        /* JADX INFO: renamed from: b */
        public Object f1507b;

        /* JADX INFO: renamed from: c */
        public Method f1508c;

        public a(Object obj, String str) {
            this.f1507b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1508c = cls.getMethod(str, f1506d);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1508c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1508c.invoke(this.f1507b, menuItem)).booleanValue();
                }
                this.f1508c.invoke(this.f1507b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: b.b.h.f$b */
    public class b {

        /* JADX INFO: renamed from: A */
        public AbstractC0407b f1509A;

        /* JADX INFO: renamed from: B */
        public CharSequence f1510B;

        /* JADX INFO: renamed from: C */
        public CharSequence f1511C;

        /* JADX INFO: renamed from: a */
        public Menu f1515a;

        /* JADX INFO: renamed from: h */
        public boolean f1522h;

        /* JADX INFO: renamed from: i */
        public int f1523i;

        /* JADX INFO: renamed from: j */
        public int f1524j;

        /* JADX INFO: renamed from: k */
        public CharSequence f1525k;

        /* JADX INFO: renamed from: l */
        public CharSequence f1526l;

        /* JADX INFO: renamed from: m */
        public int f1527m;

        /* JADX INFO: renamed from: n */
        public char f1528n;

        /* JADX INFO: renamed from: o */
        public int f1529o;

        /* JADX INFO: renamed from: p */
        public char f1530p;

        /* JADX INFO: renamed from: q */
        public int f1531q;

        /* JADX INFO: renamed from: r */
        public int f1532r;

        /* JADX INFO: renamed from: s */
        public boolean f1533s;

        /* JADX INFO: renamed from: t */
        public boolean f1534t;

        /* JADX INFO: renamed from: u */
        public boolean f1535u;

        /* JADX INFO: renamed from: v */
        public int f1536v;

        /* JADX INFO: renamed from: w */
        public int f1537w;

        /* JADX INFO: renamed from: x */
        public String f1538x;

        /* JADX INFO: renamed from: y */
        public String f1539y;

        /* JADX INFO: renamed from: z */
        public String f1540z;

        /* JADX INFO: renamed from: D */
        public ColorStateList f1512D = null;

        /* JADX INFO: renamed from: E */
        public PorterDuff.Mode f1513E = null;

        /* JADX INFO: renamed from: b */
        public int f1516b = 0;

        /* JADX INFO: renamed from: c */
        public int f1517c = 0;

        /* JADX INFO: renamed from: d */
        public int f1518d = 0;

        /* JADX INFO: renamed from: e */
        public int f1519e = 0;

        /* JADX INFO: renamed from: f */
        public boolean f1520f = true;

        /* JADX INFO: renamed from: g */
        public boolean f1521g = true;

        public b(Menu menu) {
            this.f1515a = menu;
        }

        /* JADX INFO: renamed from: a */
        public SubMenu m910a() {
            this.f1522h = true;
            SubMenu subMenuAddSubMenu = this.f1515a.addSubMenu(this.f1516b, this.f1523i, this.f1524j, this.f1525k);
            m912c(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: b */
        public final <T> T m911b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0220f.this.f1504c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m912c(MenuItem menuItem) {
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            menuItem.setChecked(this.f1533s).setVisible(this.f1534t).setEnabled(this.f1535u).setCheckable(this.f1532r >= 1).setTitleCondensed(this.f1526l).setIcon(this.f1527m);
            int i2 = this.f1536v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f1540z != null) {
                if (C0220f.this.f1504c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                C0220f c0220f = C0220f.this;
                if (c0220f.f1505d == null) {
                    c0220f.f1505d = c0220f.m908a(c0220f.f1504c);
                }
                menuItem.setOnMenuItemClickListener(new a(c0220f.f1505d, this.f1540z));
            }
            boolean z2 = menuItem instanceof C0231i;
            if (z2) {
            }
            if (this.f1532r >= 2) {
                if (z2) {
                    ((C0231i) menuItem).m975k(true);
                } else if (menuItem instanceof MenuItemC0232j) {
                    MenuItemC0232j menuItemC0232j = (MenuItemC0232j) menuItem;
                    try {
                        if (menuItemC0232j.f1689e == null) {
                            menuItemC0232j.f1689e = menuItemC0232j.f1688d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC0232j.f1689e.invoke(menuItemC0232j.f1688d, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str = this.f1538x;
            if (str != null) {
                menuItem.setActionView((View) m911b(str, C0220f.f1500e, C0220f.this.f1502a));
                z = true;
            }
            int i3 = this.f1537w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            AbstractC0407b abstractC0407b = this.f1509A;
            if (abstractC0407b != null) {
                if (menuItem instanceof InterfaceMenuItemC0386b) {
                    ((InterfaceMenuItemC0386b) menuItem).mo915a(abstractC0407b);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f1510B;
            boolean z3 = menuItem instanceof InterfaceMenuItemC0386b;
            if (z3) {
                ((InterfaceMenuItemC0386b) menuItem).setContentDescription(charSequence);
            } else if (i >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f1511C;
            if (z3) {
                ((InterfaceMenuItemC0386b) menuItem).setTooltipText(charSequence2);
            } else if (i >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f1528n;
            int i4 = this.f1529o;
            if (z3) {
                ((InterfaceMenuItemC0386b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (i >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.f1530p;
            int i5 = this.f1531q;
            if (z3) {
                ((InterfaceMenuItemC0386b) menuItem).setNumericShortcut(c3, i5);
            } else if (i >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.f1513E;
            if (mode != null) {
                if (z3) {
                    ((InterfaceMenuItemC0386b) menuItem).setIconTintMode(mode);
                } else if (i >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f1512D;
            if (colorStateList != null) {
                if (z3) {
                    ((InterfaceMenuItemC0386b) menuItem).setIconTintList(colorStateList);
                } else if (i >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f1500e = clsArr;
        f1501f = clsArr;
    }

    public C0220f(Context context) {
        super(context);
        this.f1504c = context;
        Object[] objArr = {context};
        this.f1502a = objArr;
        this.f1503b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final Object m908a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m908a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m909b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        AbstractC0407b abstractC0407b;
        ColorStateList colorStateListM1155c;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(a.m2201o("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.f1516b = 0;
                        bVar.f1517c = 0;
                        bVar.f1518d = 0;
                        bVar.f1519e = 0;
                        bVar.f1520f = true;
                        bVar.f1521g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar.f1522h) {
                            AbstractC0407b abstractC0407b2 = bVar.f1509A;
                            if (abstractC0407b2 == null || !abstractC0407b2.mo979a()) {
                                bVar.f1522h = true;
                                bVar.m912c(bVar.f1515a.add(bVar.f1516b, bVar.f1523i, bVar.f1524j, bVar.f1525k));
                            } else {
                                bVar.m910a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray typedArrayObtainStyledAttributes = C0220f.this.f1504c.obtainStyledAttributes(attributeSet, C0184b.f1215p);
                    bVar.f1516b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    bVar.f1517c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    bVar.f1518d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    bVar.f1519e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    bVar.f1520f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    bVar.f1521g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    C0294x0 c0294x0M1151p = C0294x0.m1151p(C0220f.this.f1504c, attributeSet, C0184b.f1216q);
                    bVar.f1523i = c0294x0M1151p.m1164l(2, 0);
                    bVar.f1524j = (c0294x0M1151p.m1162j(5, bVar.f1517c) & (-65536)) | (c0294x0M1151p.m1162j(6, bVar.f1518d) & 65535);
                    bVar.f1525k = c0294x0M1151p.m1166n(7);
                    bVar.f1526l = c0294x0M1151p.m1166n(8);
                    bVar.f1527m = c0294x0M1151p.m1164l(0, 0);
                    String strM1165m = c0294x0M1151p.m1165m(9);
                    bVar.f1528n = strM1165m == null ? (char) 0 : strM1165m.charAt(0);
                    bVar.f1529o = c0294x0M1151p.m1162j(16, 4096);
                    String strM1165m2 = c0294x0M1151p.m1165m(10);
                    bVar.f1530p = strM1165m2 == null ? (char) 0 : strM1165m2.charAt(0);
                    bVar.f1531q = c0294x0M1151p.m1162j(20, 4096);
                    bVar.f1532r = c0294x0M1151p.m1167o(11) ? c0294x0M1151p.m1153a(11, false) : bVar.f1519e;
                    bVar.f1533s = c0294x0M1151p.m1153a(3, false);
                    bVar.f1534t = c0294x0M1151p.m1153a(4, bVar.f1520f);
                    bVar.f1535u = c0294x0M1151p.m1153a(1, bVar.f1521g);
                    bVar.f1536v = c0294x0M1151p.m1162j(21, -1);
                    bVar.f1540z = c0294x0M1151p.m1165m(12);
                    bVar.f1537w = c0294x0M1151p.m1164l(13, 0);
                    bVar.f1538x = c0294x0M1151p.m1165m(15);
                    String strM1165m3 = c0294x0M1151p.m1165m(14);
                    bVar.f1539y = strM1165m3;
                    boolean z3 = strM1165m3 != null;
                    if (z3 && bVar.f1537w == 0 && bVar.f1538x == null) {
                        abstractC0407b = (AbstractC0407b) bVar.m911b(strM1165m3, f1501f, C0220f.this.f1503b);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        abstractC0407b = null;
                    }
                    bVar.f1509A = abstractC0407b;
                    bVar.f1510B = c0294x0M1151p.m1166n(17);
                    bVar.f1511C = c0294x0M1151p.m1166n(22);
                    if (c0294x0M1151p.m1167o(19)) {
                        bVar.f1513E = C0255e0.m1063d(c0294x0M1151p.m1162j(19, -1), bVar.f1513E);
                        colorStateListM1155c = null;
                    } else {
                        colorStateListM1155c = null;
                        bVar.f1513E = null;
                    }
                    if (c0294x0M1151p.m1167o(18)) {
                        colorStateListM1155c = c0294x0M1151p.m1155c(18);
                    }
                    bVar.f1512D = colorStateListM1155c;
                    c0294x0M1151p.f2052b.recycle();
                    bVar.f1522h = false;
                } else if (name3.equals("menu")) {
                    m909b(xmlPullParser, attributeSet, bVar.m910a());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0385a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f1504c.getResources().getLayout(i);
                    m909b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
