package p006b.p074x.p075a.p076a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p025e.C0313a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0369g;

/* JADX INFO: renamed from: b.x.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0603b extends AbstractC0607f implements Animatable {

    /* JADX INFO: renamed from: c */
    public b f3653c;

    /* JADX INFO: renamed from: d */
    public Context f3654d;

    /* JADX INFO: renamed from: e */
    public ArgbEvaluator f3655e;

    /* JADX INFO: renamed from: f */
    public final Drawable.Callback f3656f;

    /* JADX INFO: renamed from: b.x.a.a.b$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0603b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0603b.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0603b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.b$b */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f3658a;

        /* JADX INFO: renamed from: b */
        public C0608g f3659b;

        /* JADX INFO: renamed from: c */
        public AnimatorSet f3660c;

        /* JADX INFO: renamed from: d */
        public ArrayList<Animator> f3661d;

        /* JADX INFO: renamed from: e */
        public C0313a<Animator, String> f3662e;

        public b(b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f3658a = bVar.f3658a;
                C0608g c0608g = bVar.f3659b;
                if (c0608g != null) {
                    Drawable.ConstantState constantState = c0608g.getConstantState();
                    C0608g c0608g2 = (C0608g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f3659b = c0608g2;
                    c0608g2.mutate();
                    this.f3659b = c0608g2;
                    c0608g2.setCallback(callback);
                    this.f3659b.setBounds(bVar.f3659b.getBounds());
                    this.f3659b.f3674g = false;
                }
                ArrayList<Animator> arrayList = bVar.f3661d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3661d = new ArrayList<>(size);
                    this.f3662e = new C0313a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f3661d.get(i);
                        Animator animatorClone = animator.clone();
                        String orDefault = bVar.f3662e.getOrDefault(animator, null);
                        animatorClone.setTarget(this.f3659b.f3670c.f3725b.f3723p.getOrDefault(orDefault, null));
                        this.f3661d.add(animatorClone);
                        this.f3662e.put(animatorClone, orDefault);
                    }
                    if (this.f3660c == null) {
                        this.f3660c = new AnimatorSet();
                    }
                    this.f3660c.playTogether(this.f3661d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3658a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C0603b() {
        this(null, null, null);
    }

    public C0603b(Context context, b bVar, Resources resources) {
        this.f3655e = null;
        a aVar = new a();
        this.f3656f = aVar;
        this.f3654d = context;
        this.f3653c = new b(null, aVar, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2147a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m2147a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3655e == null) {
                    this.f3655e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3655e);
            }
        }
    }

    @Override // p006b.p074x.p075a.p076a.AbstractC0607f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3668b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        drawable.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3668b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return drawable.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3653c.f3659b.draw(canvas);
        if (this.f3653c.f3660c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getAlpha() : this.f3653c.f3659b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3653c.f3658a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3668b;
        if (drawable == null) {
            return this.f3653c.f3659b.getColorFilter();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3668b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f3668b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3653c.f3659b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3653c.f3659b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getOpacity() : this.f3653c.f3659b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator animatorM2148a;
        C0608g c0608gM2154a;
        int next;
        int i = Build.VERSION.SDK_INT;
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            if (i >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM1484k = C0369g.m1484k(resources, theme, attributeSet, C0602a.f3645e);
                    int resourceId = typedArrayM1484k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C0608g.f3669k;
                        if (i >= 24) {
                            c0608gM2154a = new C0608g();
                            c0608gM2154a.f3668b = C0369g.m1476c(resources, resourceId, theme);
                            new C0608g.i(c0608gM2154a.f3668b.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                c0608gM2154a = C0608g.m2154a(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException | XmlPullParserException e) {
                                Log.e("VectorDrawableCompat", "parser error", e);
                                c0608gM2154a = null;
                            }
                        }
                        c0608gM2154a.f3674g = false;
                        c0608gM2154a.setCallback(this.f3656f);
                        C0608g c0608g = this.f3653c.f3659b;
                        if (c0608g != null) {
                            c0608g.setCallback(null);
                        }
                        this.f3653c.f3659b = c0608gM2154a;
                    }
                    typedArrayM1484k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C0602a.f3646f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3654d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (i >= 24) {
                            animatorM2148a = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorM2148a = C0604c.m2148a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                        animation.close();
                                    } catch (IOException e2) {
                                        e = e2;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e3) {
                                        e = e3;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (animation != null) {
                                            animation.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    animation = null;
                                }
                            } catch (IOException e4) {
                                e = e4;
                            } catch (XmlPullParserException e5) {
                                e = e5;
                            }
                        }
                        animatorM2148a.setTarget(this.f3653c.f3659b.f3670c.f3725b.f3723p.getOrDefault(string, null));
                        if (i < 21) {
                            m2147a(animatorM2148a);
                        }
                        b bVar = this.f3653c;
                        if (bVar.f3661d == null) {
                            bVar.f3661d = new ArrayList<>();
                            this.f3653c.f3662e = new C0313a<>();
                        }
                        this.f3653c.f3661d.add(animatorM2148a);
                        this.f3653c.f3662e.put(animatorM2148a, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        b bVar2 = this.f3653c;
        if (bVar2.f3660c == null) {
            bVar2.f3660c = new AnimatorSet();
        }
        bVar2.f3660c.playTogether(bVar2.f3661d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.isAutoMirrored() : this.f3653c.f3659b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f3668b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3653c.f3660c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.isStateful() : this.f3653c.f3659b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3653c.f3659b.setBounds(rect);
        }
    }

    @Override // p006b.p074x.p075a.p076a.AbstractC0607f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.setLevel(i) : this.f3653c.f3659b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.setState(iArr) : this.f3653c.f3659b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3653c.f3659b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        C0608g c0608g = this.f3653c.f3659b;
        Drawable drawable2 = c0608g.f3668b;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            c0608g.f3670c.f3728e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        C0608g c0608g = this.f3653c.f3659b;
        Drawable drawable2 = c0608g.f3668b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        } else {
            c0608g.f3672e = colorFilter;
            c0608g.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTint(int i) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            C0360f.m1432X(drawable, i);
        } else {
            this.f3653c.f3659b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            C0360f.m1433Y(drawable, colorStateList);
        } else {
            this.f3653c.f3659b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            C0360f.m1434Z(drawable, mode);
        } else {
            this.f3653c.f3659b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3653c.f3659b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f3653c.f3660c.isStarted()) {
                return;
            }
            this.f3653c.f3660c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3653c.f3660c.end();
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.b$c */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f3663a;

        public c(Drawable.ConstantState constantState) {
            this.f3663a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3663a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3663a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0603b c0603b = new C0603b(null, null, null);
            Drawable drawableNewDrawable = this.f3663a.newDrawable();
            c0603b.f3668b = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0603b.f3656f);
            return c0603b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0603b c0603b = new C0603b(null, null, null);
            Drawable drawableNewDrawable = this.f3663a.newDrawable(resources);
            c0603b.f3668b = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0603b.f3656f);
            return c0603b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0603b c0603b = new C0603b(null, null, null);
            Drawable drawableNewDrawable = this.f3663a.newDrawable(resources, theme);
            c0603b.f3668b = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0603b.f3656f);
            return c0603b;
        }
    }
}
