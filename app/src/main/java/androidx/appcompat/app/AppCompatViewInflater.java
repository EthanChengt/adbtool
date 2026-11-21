package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.C0217c;
import p006b.p008b.p018i.C0246b0;
import p006b.p008b.p018i.C0251d;
import p006b.p008b.p018i.C0257f;
import p006b.p008b.p018i.C0259g;
import p006b.p008b.p018i.C0261h;
import p006b.p008b.p018i.C0267k;
import p006b.p008b.p018i.C0269l;
import p006b.p008b.p018i.C0273n;
import p006b.p008b.p018i.C0275o;
import p006b.p008b.p018i.C0281r;
import p006b.p008b.p018i.C0283s;
import p006b.p008b.p018i.C0285t;
import p006b.p008b.p018i.C0288u0;
import p006b.p008b.p018i.C0291w;
import p006b.p008b.p018i.C0297z;
import p006b.p025e.C0313a;
import p006b.p032h.p044j.C0418m;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new C0313a();

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    public static class ViewOnClickListenerC0023a implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final View f133b;

        /* JADX INFO: renamed from: c */
        public final String f134c;

        /* JADX INFO: renamed from: d */
        public Method f135d;

        /* JADX INFO: renamed from: e */
        public Context f136e;

        public ViewOnClickListenerC0023a(View view, String str) {
            this.f133b = view;
            this.f134c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string;
            Method method;
            if (this.f135d != null) {
                break;
            }
            Context context = this.f133b.getContext();
            while (true) {
                if (context == null) {
                    int id = this.f133b.getId();
                    if (id == -1) {
                        string = "";
                    } else {
                        StringBuilder sbM2191e = a.m2191e(" with id '");
                        sbM2191e.append(this.f133b.getContext().getResources().getResourceEntryName(id));
                        sbM2191e.append("'");
                        string = sbM2191e.toString();
                    }
                    StringBuilder sbM2191e2 = a.m2191e("Could not find method ");
                    sbM2191e2.append(this.f134c);
                    sbM2191e2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbM2191e2.append(this.f133b.getClass());
                    sbM2191e2.append(string);
                    throw new IllegalStateException(sbM2191e2.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f134c, View.class)) != null) {
                        this.f135d = method;
                        this.f136e = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.f135d.invoke(this.f136e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (view.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new ViewOnClickListenerC0023a(view, string));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Map<String, Constructor<? extends View>> map = sConstructorMap;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            map.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                View viewCreateViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                if (viewCreateViewByPrefix != null) {
                    return viewCreateViewByPrefix;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1225z, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return ((context instanceof C0217c) && ((C0217c) context).f1484a == resourceId) ? context : new C0217c(context, resourceId);
        }
        return context;
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public C0251d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0251d(context, attributeSet);
    }

    public C0257f createButton(Context context, AttributeSet attributeSet) {
        return new C0257f(context, attributeSet);
    }

    public C0259g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C0259g(context, attributeSet);
    }

    public C0261h createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C0261h(context, attributeSet);
    }

    public C0267k createEditText(Context context, AttributeSet attributeSet) {
        return new C0267k(context, attributeSet);
    }

    public C0269l createImageButton(Context context, AttributeSet attributeSet) {
        return new C0269l(context, attributeSet);
    }

    public C0273n createImageView(Context context, AttributeSet attributeSet) {
        return new C0273n(context, attributeSet, 0);
    }

    public C0275o createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0275o(context, attributeSet);
    }

    public C0281r createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0281r(context, attributeSet, com.didjdk.adbhelper.R.attr.nx);
    }

    public C0283s createRatingBar(Context context, AttributeSet attributeSet) {
        return new C0283s(context, attributeSet);
    }

    public C0285t createSeekBar(Context context, AttributeSet attributeSet) {
        return new C0285t(context, attributeSet);
    }

    public C0291w createSpinner(Context context, AttributeSet attributeSet) {
        return new C0291w(context, attributeSet, com.didjdk.adbhelper.R.attr.p2);
    }

    public C0297z createTextView(Context context, AttributeSet attributeSet) {
        return new C0297z(context, attributeSet);
    }

    public C0246b0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C0246b0(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View viewCreateRatingBar;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0288u0.m1135a(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "CheckedTextView":
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "MultiAutoCompleteTextView":
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "TextView":
                viewCreateRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "ImageButton":
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "SeekBar":
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "Spinner":
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "RadioButton":
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "ToggleButton":
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "ImageView":
                viewCreateRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "AutoCompleteTextView":
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "CheckBox":
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "EditText":
                viewCreateRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "Button":
                viewCreateRatingBar = createButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            viewCreateRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (viewCreateRatingBar != null) {
            checkOnClickListener(viewCreateRatingBar, attributeSet);
        }
        return viewCreateRatingBar;
    }
}
