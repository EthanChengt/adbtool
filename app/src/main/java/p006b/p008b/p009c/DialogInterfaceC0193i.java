package p006b.p008b.p009c;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p018i.C0264i0;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.b.c.i */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC0193i extends DialogC0203s implements DialogInterface {

    /* JADX INFO: renamed from: d */
    public final AlertController f1244d;

    /* JADX INFO: renamed from: b.b.c.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AlertController.C0020b f1245a;

        /* JADX INFO: renamed from: b */
        public final int f1246b;

        public a(Context context) {
            int iM778c = DialogInterfaceC0193i.m778c(context, 0);
            this.f1245a = new AlertController.C0020b(new ContextThemeWrapper(context, DialogInterfaceC0193i.m778c(context, iM778c)));
            this.f1246b = iM778c;
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
        /* JADX WARN: Instruction removed from duplicated block: B:52:0x00c5, please report this as an issue */
        /* JADX INFO: renamed from: a */
        public DialogInterfaceC0193i m779a() {
            ListAdapter c0022d;
            AdapterView.OnItemClickListener c0192h;
            int i;
            DialogInterfaceC0193i dialogInterfaceC0193i = new b.b.c.i(this.f1245a.f112a, this.f1246b);
            AlertController.C0020b c0020b = this.f1245a;
            AlertController alertController = dialogInterfaceC0193i.f1244d;
            View view = c0020b.f116e;
            if (view != null) {
                alertController.f71G = view;
            } else {
                CharSequence charSequence = c0020b.f115d;
                if (charSequence != null) {
                    alertController.f87e = charSequence;
                    TextView textView = alertController.f69E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = c0020b.f114c;
                if (drawable != null) {
                    alertController.f67C = drawable;
                    alertController.f66B = 0;
                    ImageView imageView = alertController.f68D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f68D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = c0020b.f117f;
            if (charSequence2 != null) {
                alertController.f88f = charSequence2;
                TextView textView2 = alertController.f70F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = c0020b.f118g;
            if (charSequence3 != null) {
                alertController.m14e(-1, charSequence3, c0020b.f119h, null, null);
            }
            CharSequence charSequence4 = c0020b.f120i;
            if (charSequence4 != null) {
                alertController.m14e(-2, charSequence4, c0020b.f121j, null, null);
            }
            if (c0020b.f123l != null || c0020b.f124m != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0020b.f113b.inflate(alertController.f76L, (ViewGroup) null);
                if (c0020b.f128q) {
                    c0022d = new C0190f(c0020b, c0020b.f112a, alertController.f77M, R.id.text1, c0020b.f123l, recycleListView);
                } else {
                    int i2 = c0020b.f129r ? alertController.f78N : alertController.f79O;
                    c0022d = c0020b.f124m;
                    if (c0022d == null) {
                        c0022d = new AlertController.C0022d(c0020b.f112a, i2, R.id.text1, c0020b.f123l);
                    }
                }
                alertController.f72H = c0022d;
                alertController.f73I = c0020b.f130s;
                if (c0020b.f125n != null) {
                    c0192h = new C0191g(c0020b, alertController);
                } else {
                    if (c0020b.f131t != null) {
                        c0192h = new C0192h(c0020b, recycleListView, alertController);
                    }
                    if (c0020b.f129r) {
                        i = c0020b.f128q ? 2 : 1;
                        alertController.f89g = recycleListView;
                    }
                    recycleListView.setChoiceMode(i);
                    alertController.f89g = recycleListView;
                }
                recycleListView.setOnItemClickListener(c0192h);
                if (c0020b.f129r) {
                    if (c0020b.f128q) {
                    }
                    alertController.f89g = recycleListView;
                }
                recycleListView.setChoiceMode(i);
                alertController.f89g = recycleListView;
            }
            View view2 = c0020b.f126o;
            if (view2 != null) {
                alertController.f90h = view2;
                alertController.f91i = 0;
                alertController.f96n = false;
            }
            Objects.requireNonNull(this.f1245a);
            dialogInterfaceC0193i.setCancelable(true);
            Objects.requireNonNull(this.f1245a);
            dialogInterfaceC0193i.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.f1245a);
            dialogInterfaceC0193i.setOnCancelListener(null);
            Objects.requireNonNull(this.f1245a);
            dialogInterfaceC0193i.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.f1245a.f122k;
            if (onKeyListener != null) {
                dialogInterfaceC0193i.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0193i;
        }

        /* JADX INFO: renamed from: b */
        public a m780b(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0020b c0020b = this.f1245a;
            c0020b.f120i = c0020b.f112a.getText(i);
            this.f1245a.f121j = null;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m781c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0020b c0020b = this.f1245a;
            c0020b.f120i = charSequence;
            c0020b.f121j = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m782d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0020b c0020b = this.f1245a;
            c0020b.f118g = charSequence;
            c0020b.f119h = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m783e(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0020b c0020b = this.f1245a;
            c0020b.f123l = charSequenceArr;
            c0020b.f125n = onClickListener;
            c0020b.f130s = i;
            c0020b.f129r = true;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m784f(int i) {
            AlertController.C0020b c0020b = this.f1245a;
            c0020b.f115d = c0020b.f112a.getText(i);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m785g(View view) {
            this.f1245a.f126o = view;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public DialogInterfaceC0193i m786h() {
            DialogInterfaceC0193i dialogInterfaceC0193iM779a = m779a();
            dialogInterfaceC0193iM779a.show();
            return dialogInterfaceC0193iM779a;
        }
    }

    public DialogInterfaceC0193i(Context context, int i) {
        super(context, m778c(context, i));
        this.f1244d = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: c */
    public static int m778c(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.didjdk.adbhelper.R.attr.ac, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02f0 A[PHI: r3
      0x02f0: PHI (r3v7 android.view.View) = (r3v6 android.view.View), (r3v22 android.view.View) binds: [B:128:0x02ee, B:125:0x02e4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p006b.p008b.p009c.DialogC0203s, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View view;
        View viewFindViewById;
        ListAdapter listAdapter;
        View view2;
        View viewFindViewById2;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.f1244d;
        int i2 = alertController.f75K;
        alertController.f84b.setContentView(alertController.f74J);
        View viewFindViewById3 = alertController.f85c.findViewById(com.didjdk.adbhelper.R.id.l1);
        View viewFindViewById4 = viewFindViewById3.findViewById(com.didjdk.adbhelper.R.id.pg);
        View viewFindViewById5 = viewFindViewById3.findViewById(com.didjdk.adbhelper.R.id.d8);
        View viewFindViewById6 = viewFindViewById3.findViewById(com.didjdk.adbhelper.R.id.c5);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(com.didjdk.adbhelper.R.id.db);
        View viewInflate = alertController.f90h;
        if (viewInflate == null) {
            viewInflate = alertController.f91i != 0 ? LayoutInflater.from(alertController.f83a).inflate(alertController.f91i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.m10a(viewInflate)) {
            alertController.f85c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f85c.findViewById(com.didjdk.adbhelper.R.id.da);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f96n) {
                frameLayout.setPadding(alertController.f92j, alertController.f93k, alertController.f94l, alertController.f95m);
            }
            if (alertController.f89g != null) {
                ((C0264i0.a) viewGroup.getLayoutParams()).f1880a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById7 = viewGroup.findViewById(com.didjdk.adbhelper.R.id.pg);
        View viewFindViewById8 = viewGroup.findViewById(com.didjdk.adbhelper.R.id.d8);
        View viewFindViewById9 = viewGroup.findViewById(com.didjdk.adbhelper.R.id.c5);
        ViewGroup viewGroupM13d = alertController.m13d(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM13d2 = alertController.m13d(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM13d3 = alertController.m13d(viewFindViewById9, viewFindViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f85c.findViewById(com.didjdk.adbhelper.R.id.mb);
        alertController.f65A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f65A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM13d2.findViewById(R.id.message);
        alertController.f70F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f88f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f65A.removeView(alertController.f70F);
                if (alertController.f89g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f65A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.f65A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f89g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM13d2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupM13d3.findViewById(R.id.button1);
        alertController.f97o = button2;
        button2.setOnClickListener(alertController.f82R);
        if (TextUtils.isEmpty(alertController.f98p) && alertController.f100r == null) {
            alertController.f97o.setVisibility(8);
            i = 0;
        } else {
            alertController.f97o.setText(alertController.f98p);
            Drawable drawable = alertController.f100r;
            if (drawable != null) {
                int i3 = alertController.f86d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.f97o.setCompoundDrawables(alertController.f100r, null, null, null);
            }
            alertController.f97o.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM13d3.findViewById(R.id.button2);
        alertController.f101s = button3;
        button3.setOnClickListener(alertController.f82R);
        if (TextUtils.isEmpty(alertController.f102t) && alertController.f104v == null) {
            alertController.f101s.setVisibility(8);
        } else {
            alertController.f101s.setText(alertController.f102t);
            Drawable drawable2 = alertController.f104v;
            if (drawable2 != null) {
                int i4 = alertController.f86d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.f101s.setCompoundDrawables(alertController.f104v, null, null, null);
            }
            alertController.f101s.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) viewGroupM13d3.findViewById(R.id.button3);
        alertController.f105w = button4;
        button4.setOnClickListener(alertController.f82R);
        if (TextUtils.isEmpty(alertController.f106x) && alertController.f108z == null) {
            alertController.f105w.setVisibility(8);
            view = null;
        } else {
            alertController.f105w.setText(alertController.f106x);
            Drawable drawable3 = alertController.f100r;
            if (drawable3 != null) {
                int i5 = alertController.f86d;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.f97o.setCompoundDrawables(alertController.f100r, null, null, null);
            } else {
                view = null;
            }
            alertController.f105w.setVisibility(0);
            i |= 4;
        }
        Context context = alertController.f83a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.didjdk.adbhelper.R.attr.aa, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                button = alertController.f97o;
            } else if (i == 2) {
                button = alertController.f101s;
            } else if (i == 4) {
                button = alertController.f105w;
            }
            alertController.m12b(button);
        }
        if (!(i != 0)) {
            viewGroupM13d3.setVisibility(8);
        }
        if (alertController.f71G != null) {
            viewGroupM13d.addView(alertController.f71G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f85c.findViewById(com.didjdk.adbhelper.R.id.pa).setVisibility(8);
        } else {
            alertController.f68D = (ImageView) alertController.f85c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f87e)) && alertController.f80P) {
                TextView textView2 = (TextView) alertController.f85c.findViewById(com.didjdk.adbhelper.R.id.be);
                alertController.f69E = textView2;
                textView2.setText(alertController.f87e);
                int i6 = alertController.f66B;
                if (i6 != 0) {
                    alertController.f68D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.f67C;
                    if (drawable4 != null) {
                        alertController.f68D.setImageDrawable(drawable4);
                    } else {
                        alertController.f69E.setPadding(alertController.f68D.getPaddingLeft(), alertController.f68D.getPaddingTop(), alertController.f68D.getPaddingRight(), alertController.f68D.getPaddingBottom());
                        alertController.f68D.setVisibility(8);
                    }
                }
            } else {
                alertController.f85c.findViewById(com.didjdk.adbhelper.R.id.pa).setVisibility(8);
                alertController.f68D.setVisibility(8);
                viewGroupM13d.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i7 = (viewGroupM13d == null || viewGroupM13d.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM13d3.getVisibility() != 8;
        if (!z3 && (viewFindViewById2 = viewGroupM13d2.findViewById(com.didjdk.adbhelper.R.id.oa)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f65A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            viewFindViewById = (alertController.f88f == null && alertController.f89g == null) ? view : viewGroupM13d.findViewById(com.didjdk.adbhelper.R.id.p_);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else {
            viewFindViewById = viewGroupM13d2.findViewById(com.didjdk.adbhelper.R.id.ob);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        }
        ListView listView = alertController.f89g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z3 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f109b, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.f110c);
            }
        }
        if (!z2) {
            View view3 = alertController.f89g;
            if (view3 == null) {
                view3 = alertController.f65A;
            }
            if (view3 != null) {
                int i8 = i7 | (z3 ? 2 : 0);
                View viewFindViewById10 = alertController.f85c.findViewById(com.didjdk.adbhelper.R.id.ma);
                View viewFindViewById11 = alertController.f85c.findViewById(com.didjdk.adbhelper.R.id.m_);
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 23) {
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    if (i9 >= 23) {
                        view3.setScrollIndicators(i8, 3);
                    }
                    if (viewFindViewById10 != null) {
                        viewGroupM13d2.removeView(viewFindViewById10);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupM13d2.removeView(viewFindViewById11);
                    }
                } else {
                    if (viewFindViewById10 != null && (i8 & 1) == 0) {
                        viewGroupM13d2.removeView(viewFindViewById10);
                        viewFindViewById10 = view;
                    }
                    if (viewFindViewById11 == null || (i8 & 2) != 0) {
                        view2 = viewFindViewById11;
                    } else {
                        viewGroupM13d2.removeView(viewFindViewById11);
                        view2 = view;
                    }
                    if (viewFindViewById10 != null || view2 != null) {
                        if (alertController.f88f != null) {
                            alertController.f65A.setOnScrollChangeListener(new C0186b(alertController, viewFindViewById10, view2));
                            alertController.f65A.post(new RunnableC0187c(alertController, viewFindViewById10, view2));
                        } else {
                            ListView listView2 = alertController.f89g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new C0188d(alertController, viewFindViewById10, view2));
                                alertController.f89g.post(new RunnableC0189e(alertController, viewFindViewById10, view2));
                            } else {
                                if (viewFindViewById10 != null) {
                                    viewGroupM13d2.removeView(viewFindViewById10);
                                }
                                if (view2 != null) {
                                    viewFindViewById11 = view2;
                                    viewGroupM13d2.removeView(viewFindViewById11);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f89g;
        if (listView3 == null || (listAdapter = alertController.f72H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i10 = alertController.f73I;
        if (i10 > -1) {
            listView3.setItemChecked(i10, true);
            listView3.setSelection(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1244d.f65A;
        if (nestedScrollView != null && nestedScrollView.m211l(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1244d.f65A;
        if (nestedScrollView != null && nestedScrollView.m211l(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p006b.p008b.p009c.DialogC0203s, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f1244d;
        alertController.f87e = charSequence;
        TextView textView = alertController.f69E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
