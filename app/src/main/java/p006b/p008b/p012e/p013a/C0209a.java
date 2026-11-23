package p006b.p008b.p012e.p013a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p008b.p014f.C0213a;
import p006b.p008b.p018i.C0274n0;
import p006b.p025e.C0317e;
import p006b.p025e.C0321i;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p032h.p036d.p037k.InterfaceC0380a;
import p006b.p074x.p075a.p076a.C0603b;
import p006b.p074x.p075a.p076a.C0608g;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.b.e.a.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class C0209a extends C0212d implements InterfaceC0380a {

    /* JADX INFO: renamed from: q */
    public c f1410q;

    /* JADX INFO: renamed from: r */
    public g f1411r;

    /* JADX INFO: renamed from: s */
    public int f1412s;

    /* JADX INFO: renamed from: t */
    public int f1413t;

    /* JADX INFO: renamed from: u */
    public boolean f1414u;

    /* JADX INFO: renamed from: b.b.e.a.a$b */
    public static class b extends g {

        /* JADX INFO: renamed from: a */
        public final Animatable f1415a;

        public b(Animatable animatable) {
            super(null);
            this.f1415a = animatable;
        }

        @Override // p006b.p008b.p012e.p013a.C0209a.g
        /* JADX INFO: renamed from: c */
        public void mo889c() {
            this.f1415a.start();
        }

        @Override // p006b.p008b.p012e.p013a.C0209a.g
        /* JADX INFO: renamed from: d */
        public void mo890d() {
            this.f1415a.stop();
        }
    }

    /* JADX INFO: renamed from: b.b.e.a.a$c */
    public static class c extends C0212d.a {

        /* JADX INFO: renamed from: K */
        public C0317e<Long> f1416K;

        /* JADX INFO: renamed from: L */
        public C0321i<Integer> f1417L;

        public c(c cVar, C0209a c0209a, Resources resources) {
            C0321i<Integer> c0321i;
            super(cVar, c0209a, resources);
            if (cVar != null) {
                this.f1416K = cVar.f1416K;
                c0321i = cVar.f1417L;
            } else {
                this.f1416K = new C0317e<>();
                c0321i = new C0321i<>(10);
            }
            this.f1417L = c0321i;
        }

        /* JADX INFO: renamed from: h */
        public static long m891h(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        @Override // p006b.p008b.p012e.p013a.C0212d.a, p006b.p008b.p012e.p013a.C0210b.c
        /* JADX INFO: renamed from: e */
        public void mo892e() {
            this.f1416K = this.f1416K.clone();
            this.f1417L = this.f1417L.clone();
        }

        /* JADX INFO: renamed from: i */
        public int m893i(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f1417L.m1281e(i, 0).intValue();
        }

        @Override // p006b.p008b.p012e.p013a.C0212d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0209a(this, null);
        }

        @Override // p006b.p008b.p012e.p013a.C0212d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0209a(this, resources);
        }
    }

    /* JADX INFO: renamed from: b.b.e.a.a$d */
    public static class d extends g {

        /* JADX INFO: renamed from: a */
        public final C0603b f1418a;

        public d(C0603b c0603b) {
            super(null);
            this.f1418a = c0603b;
        }

        @Override // p006b.p008b.p012e.p013a.C0209a.g
        /* JADX INFO: renamed from: c */
        public void mo889c() {
            this.f1418a.start();
        }

        @Override // p006b.p008b.p012e.p013a.C0209a.g
        /* JADX INFO: renamed from: d */
        public void mo890d() {
            this.f1418a.stop();
        }
    }

    /* JADX INFO: renamed from: b.b.e.a.a$e */
    public static class e extends g {

        /* JADX INFO: renamed from: a */
        public final ObjectAnimator f1419a;

        /* JADX INFO: renamed from: b */
        public final boolean f1420b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.f1423c);
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f1420b = z2;
            this.f1419a = objectAnimatorOfInt;
        }

        @Override // p006b.p008b.p012e.p013a.C0209a.g
        /* JADX INFO: renamed from: a */
        public boolean mo894a() {
            return this.f1420b;
        }

        @Override // p006b.p008b.p012e.p013a.C0209a.g
        /* JADX INFO: renamed from: b */
        public void mo895b() {
            this.f1419a.reverse();
        }

        @Override // p006b.p008b.p012e.p013a.C0209a.g
        /* JADX INFO: renamed from: c */
        public void mo889c() {
            this.f1419a.start();
        }

        @Override // p006b.p008b.p012e.p013a.C0209a.g
        /* JADX INFO: renamed from: d */
        public void mo890d() {
            this.f1419a.cancel();
        }
    }

    /* JADX INFO: renamed from: b.b.e.a.a$f */
    public static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a */
        public int[] f1421a;

        /* JADX INFO: renamed from: b */
        public int f1422b;

        /* JADX INFO: renamed from: c */
        public int f1423c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1422b = numberOfFrames;
            int[] iArr = this.f1421a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f1421a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f1421a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f1423c = i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f1423c) + 0.5f);
            int i2 = this.f1422b;
            int[] iArr = this.f1421a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f1423c : 0.0f);
        }
    }

    /* JADX INFO: renamed from: b.b.e.a.a$g */
    public static abstract class g {
        public g(a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo894a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void mo895b() {
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo889c();

        /* JADX INFO: renamed from: d */
        public abstract void mo890d();
    }

    public C0209a() {
        this(null, null);
    }

    public C0209a(c cVar, Resources resources) {
        super(null);
        this.f1412s = -1;
        this.f1413t = -1;
        c cVar2 = new c(cVar, this, resources);
        super.mo887e(cVar2);
        this.f1410q = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public static C0209a m885g(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int i;
        int next;
        int next2;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C0209a c0209a = new C0209a(null, null);
        TypedArray typedArrayM1484k = C0369g.m1484k(resources, theme2, attributeSet2, C0213a.f1478a);
        int i2 = 1;
        c0209a.setVisible(typedArrayM1484k.getBoolean(1, true), true);
        c cVar = c0209a.f1410q;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            cVar.f1451d |= typedArrayM1484k.getChangingConfigurations();
        }
        int i4 = 2;
        cVar.f1456i = typedArrayM1484k.getBoolean(2, cVar.f1456i);
        int i5 = 3;
        cVar.f1459l = typedArrayM1484k.getBoolean(3, cVar.f1459l);
        int i6 = 4;
        cVar.f1439A = typedArrayM1484k.getInt(4, cVar.f1439A);
        cVar.f1440B = typedArrayM1484k.getInt(5, cVar.f1440B);
        boolean z = false;
        c0209a.setDither(typedArrayM1484k.getBoolean(0, cVar.f1471x));
        c0209a.f1425b.m903f(resources);
        typedArrayM1484k.recycle();
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next3 = xmlPullParser.next();
            if (next3 == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next3 == i5)) {
                break;
            }
            if (next3 == i4 && depth <= depth2) {
                if (xmlPullParser.getName().equals("item")) {
                    TypedArray typedArrayM1484k2 = C0369g.m1484k(resources, theme2, attributeSet2, C0213a.f1479b);
                    int resourceId = typedArrayM1484k2.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId2 = typedArrayM1484k2.getResourceId(i2, -1);
                    Drawable drawableM1111f = resourceId2 > 0 ? C0274n0.m1105d().m1111f(context2, resourceId2) : null;
                    typedArrayM1484k2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        i = depth2;
                        if (i8 >= attributeCount) {
                            break;
                        }
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i8);
                        int i9 = attributeCount;
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i10 = i7 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i8, z)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i7] = attributeNameResource;
                            i7 = i10;
                        }
                        i8++;
                        depth2 = i;
                        attributeCount = i9;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i7);
                    if (drawableM1111f == null) {
                        do {
                            next2 = xmlPullParser.next();
                        } while (next2 == i6);
                        if (next2 != 2) {
                            throw new XmlPullParserException(a.m2190d(xmlPullParser, new StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                        }
                        if (xmlPullParser.getName().equals("vector")) {
                            drawableM1111f = C0608g.m2154a(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawableM1111f = i3 >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    if (drawableM1111f == null) {
                        throw new XmlPullParserException(a.m2190d(xmlPullParser, new StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                    }
                    c cVar2 = c0209a.f1410q;
                    int iM899a = cVar2.m899a(drawableM1111f);
                    cVar2.f1477J[iM899a] = iArrTrimStateSet;
                    cVar2.f1417L.m1283g(iM899a, Integer.valueOf(resourceId));
                    i2 = 1;
                    i4 = 2;
                    i5 = 3;
                } else {
                    i = depth2;
                    if (xmlPullParser.getName().equals("transition")) {
                        TypedArray typedArrayM1484k3 = C0369g.m1484k(resources, theme2, attributeSet2, C0213a.f1480c);
                        int resourceId3 = typedArrayM1484k3.getResourceId(2, -1);
                        int resourceId4 = typedArrayM1484k3.getResourceId(1, -1);
                        int resourceId5 = typedArrayM1484k3.getResourceId(z ? 1 : 0, -1);
                        Drawable drawableM1111f2 = resourceId5 > 0 ? C0274n0.m1105d().m1111f(context2, resourceId5) : null;
                        boolean z2 = typedArrayM1484k3.getBoolean(3, z);
                        typedArrayM1484k3.recycle();
                        if (drawableM1111f2 == null) {
                            do {
                                next = xmlPullParser.next();
                            } while (next == i6);
                            if (next != 2) {
                                throw new XmlPullParserException(a.m2190d(xmlPullParser, new StringBuilder(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                            }
                            if (xmlPullParser.getName().equals("animated-vector")) {
                                drawableM1111f2 = new C0603b(context2, null, null);
                                drawableM1111f2.inflate(resources, xmlPullParser, attributeSet2, theme2);
                            } else {
                                drawableM1111f2 = i3 >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                            }
                        }
                        if (drawableM1111f2 == null) {
                            throw new XmlPullParserException(a.m2190d(xmlPullParser, new StringBuilder(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(a.m2190d(xmlPullParser, new StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
                        }
                        c cVar3 = c0209a.f1410q;
                        int iM899a2 = cVar3.m899a(drawableM1111f2);
                        long jM891h = c.m891h(resourceId3, resourceId4);
                        long j = z2 ? 8589934592L : 0L;
                        long j2 = iM899a2;
                        cVar3.f1416K.m1249a(jM891h, Long.valueOf(j2 | j));
                        if (z2) {
                            cVar3.f1416K.m1249a(c.m891h(resourceId4, resourceId3), Long.valueOf(j2 | 4294967296L | j));
                        }
                    }
                    i2 = 1;
                    z = false;
                    i4 = 2;
                    i5 = 3;
                    i6 = 4;
                    context2 = context;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                }
                depth2 = i;
            }
        }
        c0209a.onStateChange(c0209a.getState());
        return c0209a;
    }

    @Override // p006b.p008b.p012e.p013a.C0212d, p006b.p008b.p012e.p013a.C0210b
    /* JADX INFO: renamed from: b */
    @Override // p006b.p008b.p012e.p013a.C0212d, p006b.p008b.p012e.p013a.C0210b
    /* JADX INFO: renamed from: e */
    public void mo887e(C0210b.c cVar) {
        super.mo887e(cVar);
        if (cVar instanceof c) {
            this.f1410q = (c) cVar;
        }
    }

    @Override // p006b.p008b.p012e.p013a.C0212d
    /* JADX INFO: renamed from: f */
    public C0212d.a mo886b() {
        return new c(this.f1410q, this, null);
    }

    @Override // p006b.p008b.p012e.p013a.C0212d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p006b.p008b.p012e.p013a.C0210b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f1411r;
        if (gVar != null) {
            gVar.mo890d();
            this.f1411r = null;
            m898d(this.f1412s);
            this.f1412s = -1;
            this.f1413t = -1;
        }
    }

    @Override // p006b.p008b.p012e.p013a.C0212d, p006b.p008b.p012e.p013a.C0210b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1414u) {
            super.mutate();
            if (this == this) {
                this.f1410q.mo892e();
                this.f1414u = true;
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    @Override // p006b.p008b.p012e.p013a.C0212d, p006b.p008b.p012e.p013a.C0210b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        c cVar;
        int iM893i;
        int iM893i2;
        boolean z;
        int iLongValue;
        boolean z2;
        Object obj;
        g bVar;
        boolean z3;
        c cVar2 = this.f1410q;
        int iM904g = cVar2.m904g(iArr);
        if (iM904g < 0) {
            iM904g = cVar2.m904g(StateSet.WILD_CARD);
        }
        int i = this.f1431h;
        boolean z4 = false;
        if (iM904g != i) {
            g gVar = this.f1411r;
            if (gVar == null) {
                this.f1411r = null;
                this.f1413t = -1;
                this.f1412s = -1;
                cVar = this.f1410q;
                iM893i = cVar.m893i(i);
                iM893i2 = cVar.m893i(iM904g);
                if (iM893i2 != 0 && iM893i != 0) {
                    iLongValue = (int) cVar.f1416K.m1254f(c.m891h(iM893i, iM893i2), -1L).longValue();
                    if (iLongValue >= 0) {
                        if ((cVar.f1416K.m1254f(c.m891h(iM893i, iM893i2), -1L).longValue() & 8589934592L) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        m898d(iLongValue);
                        obj = this.f1427d;
                        if (obj instanceof AnimationDrawable) {
                            if ((cVar.f1416K.m1254f(c.m891h(iM893i, iM893i2), -1L).longValue() & 4294967296L) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bVar = new e((AnimationDrawable) obj, z3, z2);
                        } else if (obj instanceof C0603b) {
                            bVar = new d((C0603b) obj);
                        } else if (obj instanceof Animatable) {
                            bVar = new b((Animatable) obj);
                        }
                        bVar.mo889c();
                        this.f1411r = bVar;
                        this.f1413t = i;
                        this.f1412s = iM904g;
                        z = true;
                    }
                }
                z = false;
            } else {
                if (iM904g != this.f1412s) {
                    if (iM904g == this.f1413t && gVar.mo894a()) {
                        gVar.mo895b();
                        this.f1412s = this.f1413t;
                        this.f1413t = iM904g;
                    } else {
                        i = this.f1412s;
                        gVar.mo890d();
                        this.f1411r = null;
                        this.f1413t = -1;
                        this.f1412s = -1;
                        cVar = this.f1410q;
                        iM893i = cVar.m893i(i);
                        iM893i2 = cVar.m893i(iM904g);
                        if (iM893i2 != 0) {
                            iLongValue = (int) cVar.f1416K.m1254f(c.m891h(iM893i, iM893i2), -1L).longValue();
                            if (iLongValue >= 0) {
                                if ((cVar.f1416K.m1254f(c.m891h(iM893i, iM893i2), -1L).longValue() & 8589934592L) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                m898d(iLongValue);
                                obj = this.f1427d;
                                if (obj instanceof AnimationDrawable) {
                                    if ((cVar.f1416K.m1254f(c.m891h(iM893i, iM893i2), -1L).longValue() & 4294967296L) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    bVar = new e((AnimationDrawable) obj, z3, z2);
                                } else if (obj instanceof C0603b) {
                                    bVar = new d((C0603b) obj);
                                } else if (obj instanceof Animatable) {
                                    bVar = new b((Animatable) obj);
                                }
                                bVar.mo889c();
                                this.f1411r = bVar;
                                this.f1413t = i;
                                this.f1412s = iM904g;
                            }
                        }
                        z = false;
                    }
                }
                z = true;
            }
            if (z || m898d(iM904g)) {
                z4 = true;
            }
        }
        Drawable drawable = this.f1427d;
        return drawable != null ? z4 | drawable.setState(iArr) : z4;
    }

    @Override // p006b.p008b.p012e.p013a.C0210b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.f1411r;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo889c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
