package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import p006b.p008b.C0184b;
import p006b.p008b.p009c.DialogC0203s;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A */
    public NestedScrollView f65A;

    /* JADX INFO: renamed from: C */
    public Drawable f67C;

    /* JADX INFO: renamed from: D */
    public ImageView f68D;

    /* JADX INFO: renamed from: E */
    public TextView f69E;

    /* JADX INFO: renamed from: F */
    public TextView f70F;

    /* JADX INFO: renamed from: G */
    public View f71G;

    /* JADX INFO: renamed from: H */
    public ListAdapter f72H;

    /* JADX INFO: renamed from: J */
    public int f74J;

    /* JADX INFO: renamed from: K */
    public int f75K;

    /* JADX INFO: renamed from: L */
    public int f76L;

    /* JADX INFO: renamed from: M */
    public int f77M;

    /* JADX INFO: renamed from: N */
    public int f78N;

    /* JADX INFO: renamed from: O */
    public int f79O;

    /* JADX INFO: renamed from: P */
    public boolean f80P;

    /* JADX INFO: renamed from: Q */
    public Handler f81Q;

    /* JADX INFO: renamed from: a */
    public final Context f83a;

    /* JADX INFO: renamed from: b */
    public final DialogC0203s f84b;

    /* JADX INFO: renamed from: c */
    public final Window f85c;

    /* JADX INFO: renamed from: d */
    public final int f86d;

    /* JADX INFO: renamed from: e */
    public CharSequence f87e;

    /* JADX INFO: renamed from: f */
    public CharSequence f88f;

    /* JADX INFO: renamed from: g */
    public ListView f89g;

    /* JADX INFO: renamed from: h */
    public View f90h;

    /* JADX INFO: renamed from: i */
    public int f91i;

    /* JADX INFO: renamed from: j */
    public int f92j;

    /* JADX INFO: renamed from: k */
    public int f93k;

    /* JADX INFO: renamed from: l */
    public int f94l;

    /* JADX INFO: renamed from: m */
    public int f95m;

    /* JADX INFO: renamed from: o */
    public Button f97o;

    /* JADX INFO: renamed from: p */
    public CharSequence f98p;

    /* JADX INFO: renamed from: q */
    public Message f99q;

    /* JADX INFO: renamed from: r */
    public Drawable f100r;

    /* JADX INFO: renamed from: s */
    public Button f101s;

    /* JADX INFO: renamed from: t */
    public CharSequence f102t;

    /* JADX INFO: renamed from: u */
    public Message f103u;

    /* JADX INFO: renamed from: v */
    public Drawable f104v;

    /* JADX INFO: renamed from: w */
    public Button f105w;

    /* JADX INFO: renamed from: x */
    public CharSequence f106x;

    /* JADX INFO: renamed from: y */
    public Message f107y;

    /* JADX INFO: renamed from: z */
    public Drawable f108z;

    /* JADX INFO: renamed from: n */
    public boolean f96n = false;

    /* JADX INFO: renamed from: B */
    public int f66B = 0;

    /* JADX INFO: renamed from: I */
    public int f73I = -1;

    /* JADX INFO: renamed from: R */
    public final View.OnClickListener f82R = new ViewOnClickListenerC0019a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: b */
        public final int f109b;

        /* JADX INFO: renamed from: c */
        public final int f110c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1219t);
            this.f110c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f109b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0019a implements View.OnClickListener {
        public ViewOnClickListenerC0019a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            if ((view != alertController.f97o || (message2 = alertController.f99q) == null) && (view != alertController.f101s || (message2 = alertController.f103u) == null)) {
                messageObtain = (view != alertController.f105w || (message = alertController.f107y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f81Q.obtainMessage(1, alertController2.f84b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0020b {

        /* JADX INFO: renamed from: a */
        public final Context f112a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f113b;

        /* JADX INFO: renamed from: c */
        public Drawable f114c;

        /* JADX INFO: renamed from: d */
        public CharSequence f115d;

        /* JADX INFO: renamed from: e */
        public View f116e;

        /* JADX INFO: renamed from: f */
        public CharSequence f117f;

        /* JADX INFO: renamed from: g */
        public CharSequence f118g;

        /* JADX INFO: renamed from: h */
        public DialogInterface.OnClickListener f119h;

        /* JADX INFO: renamed from: i */
        public CharSequence f120i;

        /* JADX INFO: renamed from: j */
        public DialogInterface.OnClickListener f121j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnKeyListener f122k;

        /* JADX INFO: renamed from: l */
        public CharSequence[] f123l;

        /* JADX INFO: renamed from: m */
        public ListAdapter f124m;

        /* JADX INFO: renamed from: n */
        public DialogInterface.OnClickListener f125n;

        /* JADX INFO: renamed from: o */
        public View f126o;

        /* JADX INFO: renamed from: p */
        public boolean[] f127p;

        /* JADX INFO: renamed from: q */
        public boolean f128q;

        /* JADX INFO: renamed from: r */
        public boolean f129r;

        /* JADX INFO: renamed from: s */
        public int f130s = -1;

        /* JADX INFO: renamed from: t */
        public DialogInterface.OnMultiChoiceClickListener f131t;

        public C0020b(Context context) {
            this.f112a = context;
            this.f113b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0021c extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<DialogInterface> f132a;

        public HandlerC0021c(DialogInterface dialogInterface) {
            this.f132a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f132a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0022d extends ArrayAdapter<CharSequence> {
        public C0022d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0203s dialogC0203s, Window window) {
        this.f83a = context;
        this.f84b = dialogC0203s;
        this.f85c = window;
        this.f81Q = new HandlerC0021c(dialogC0203s);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0184b.f1204e, R.attr.ab, 0);
        this.f74J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f75K = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f76L = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f77M = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f78N = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f79O = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f80P = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f86d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0203s.m858a().mo815t(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m10a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m11c(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final ViewGroup m13d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: e */
    public void m14e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f81Q.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f106x = charSequence;
            this.f107y = messageObtainMessage;
            this.f108z = null;
        } else if (i == -2) {
            this.f102t = charSequence;
            this.f103u = messageObtainMessage;
            this.f104v = null;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f98p = charSequence;
            this.f99q = messageObtainMessage;
            this.f100r = null;
        }
    }
}
