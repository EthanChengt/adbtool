package p006b.p008b.p018i;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p006b.p032h.p034c.C0362a;
import p006b.p047i.p048a.AbstractC0441c;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.b.i.r0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class ViewOnClickListenerC0282r0 extends AbstractC0441c implements View.OnClickListener {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f1978z = 0;

    /* JADX INFO: renamed from: m */
    public final SearchView f1979m;

    /* JADX INFO: renamed from: n */
    public final SearchableInfo f1980n;

    /* JADX INFO: renamed from: o */
    public final Context f1981o;

    /* JADX INFO: renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f1982p;

    /* JADX INFO: renamed from: q */
    public final int f1983q;

    /* JADX INFO: renamed from: r */
    public int f1984r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f1985s;

    /* JADX INFO: renamed from: t */
    public int f1986t;

    /* JADX INFO: renamed from: u */
    public int f1987u;

    /* JADX INFO: renamed from: v */
    public int f1988v;

    /* JADX INFO: renamed from: w */
    public int f1989w;

    /* JADX INFO: renamed from: x */
    public int f1990x;

    /* JADX INFO: renamed from: y */
    public int f1991y;

    /* JADX INFO: renamed from: b.b.i.r0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TextView f1992a;

        /* JADX INFO: renamed from: b */
        public final TextView f1993b;

        /* JADX INFO: renamed from: c */
        public final ImageView f1994c;

        /* JADX INFO: renamed from: d */
        public final ImageView f1995d;

        /* JADX INFO: renamed from: e */
        public final ImageView f1996e;

        public a(View view) {
            this.f1992a = (TextView) view.findViewById(R.id.text1);
            this.f1993b = (TextView) view.findViewById(R.id.text2);
            this.f1994c = (ImageView) view.findViewById(R.id.icon1);
            this.f1995d = (ImageView) view.findViewById(R.id.icon2);
            this.f1996e = (ImageView) view.findViewById(com.didjdk.adbhelper.R.id.ea);
        }
    }

    public ViewOnClickListenerC0282r0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1984r = 1;
        this.f1986t = -1;
        this.f1987u = -1;
        this.f1988v = -1;
        this.f1989w = -1;
        this.f1990x = -1;
        this.f1991y = -1;
        this.f1979m = searchView;
        this.f1980n = searchableInfo;
        this.f1983q = searchView.getSuggestionCommitIconResId();
        this.f1981o = context;
        this.f1982p = weakHashMap;
    }

    /* JADX INFO: renamed from: h */
    public static String m1121h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // p006b.p047i.p048a.AbstractC0439a
    /* JADX INFO: renamed from: a */
    public void mo1122a(View view, Context context, Cursor cursor) throws FileNotFoundException {
        Drawable drawableM1127f;
        String string;
        Drawable drawable;
        CharSequence charSequenceM1121h;
        a aVar = (a) view.getTag();
        int i = this.f1991y;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1992a != null) {
            String strM1121h = m1121h(cursor, this.f1986t);
            TextView textView = aVar.f1992a;
            textView.setText(strM1121h);
            textView.setVisibility(TextUtils.isEmpty(strM1121h) ? 8 : 0);
        }
        if (aVar.f1993b != null) {
            String strM1121h2 = m1121h(cursor, this.f1988v);
            if (strM1121h2 != null) {
                if (this.f1985s == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f2800e.getTheme().resolveAttribute(com.didjdk.adbhelper.R.attr.rf, typedValue, true);
                    this.f1985s = this.f2800e.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strM1121h2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1985s, null), 0, strM1121h2.length(), 33);
                charSequenceM1121h = spannableString;
            } else {
                charSequenceM1121h = m1121h(cursor, this.f1987u);
            }
            if (TextUtils.isEmpty(charSequenceM1121h)) {
                TextView textView2 = aVar.f1992a;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    aVar.f1992a.setMaxLines(2);
                }
            } else {
                TextView textView3 = aVar.f1992a;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    aVar.f1992a.setMaxLines(1);
                }
            }
            TextView textView4 = aVar.f1993b;
            textView4.setText(charSequenceM1121h);
            textView4.setVisibility(TextUtils.isEmpty(charSequenceM1121h) ? 8 : 0);
        }
        ImageView imageView = aVar.f1994c;
        if (imageView != null) {
            int i3 = this.f1989w;
            if (i3 == -1) {
                drawableM1127f = null;
            } else {
                drawableM1127f = m1127f(cursor.getString(i3));
                if (drawableM1127f == null) {
                    ComponentName searchActivity = this.f1980n.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    if (this.f1982p.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = this.f1982p.get(strFlattenToShortString);
                        drawableM1127f = constantState == null ? null : constantState.newDrawable(this.f1981o.getResources());
                    } else {
                        PackageManager packageManager = this.f2800e.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    string = "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString();
                                    Log.w("SuggestionsAdapter", string);
                                    drawable = null;
                                }
                            } else {
                                drawable = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            string = e.toString();
                        }
                        this.f1982p.put(strFlattenToShortString, drawable == null ? null : drawable.getConstantState());
                        drawableM1127f = drawable;
                    }
                    if (drawableM1127f == null) {
                        drawableM1127f = this.f2800e.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableM1127f);
            if (drawableM1127f == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableM1127f.setVisible(false, false);
                drawableM1127f.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.f1995d;
        if (imageView2 != null) {
            int i4 = this.f1990x;
            Drawable drawableM1127f2 = i4 != -1 ? m1127f(cursor.getString(i4)) : null;
            imageView2.setImageDrawable(drawableM1127f2);
            if (drawableM1127f2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawableM1127f2.setVisible(false, false);
                drawableM1127f2.setVisible(true, false);
            }
        }
        int i5 = this.f1984r;
        if (i5 != 2 && (i5 != 1 || (i2 & 1) == 0)) {
            aVar.f1996e.setVisibility(8);
            return;
        }
        aVar.f1996e.setVisibility(0);
        aVar.f1996e.setTag(aVar.f1992a.getText());
        aVar.f1996e.setOnClickListener(this);
    }

    @Override // p006b.p047i.p048a.AbstractC0439a
    /* JADX INFO: renamed from: b */
    public void mo1123b(Cursor cursor) {
        try {
            super.mo1123b(cursor);
            if (cursor != null) {
                this.f1986t = cursor.getColumnIndex("suggest_text_1");
                this.f1987u = cursor.getColumnIndex("suggest_text_2");
                this.f1988v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1989w = cursor.getColumnIndex("suggest_icon_1");
                this.f1990x = cursor.getColumnIndex("suggest_icon_2");
                this.f1991y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p006b.p047i.p048a.AbstractC0439a
    /* JADX INFO: renamed from: c */
    public CharSequence mo1124c(Cursor cursor) {
        String strM1121h;
        String strM1121h2;
        if (cursor == null) {
            return null;
        }
        String strM1121h3 = m1121h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM1121h3 != null) {
            return strM1121h3;
        }
        if (this.f1980n.shouldRewriteQueryFromData() && (strM1121h2 = m1121h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM1121h2;
        }
        if (!this.f1980n.shouldRewriteQueryFromText() || (strM1121h = m1121h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM1121h;
    }

    @Override // p006b.p047i.p048a.AbstractC0441c, p006b.p047i.p048a.AbstractC0439a
    /* JADX INFO: renamed from: d */
    public View mo1125d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewInflate = this.f2810l.inflate(this.f2808j, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(com.didjdk.adbhelper.R.id.ea)).setImageResource(this.f1983q);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m1126e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(a.m2199m("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f2800e.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(a.m2199m("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(a.m2199m("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(a.m2199m("More than two path segments: ", uri));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(a.m2199m("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(a.m2199m("No package found for authority: ", uri));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX INFO: renamed from: f */
    public final Drawable m1127f(String str) throws FileNotFoundException {
        Drawable drawableM1126e = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f1981o.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = this.f1982p.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawableM1469c = C0362a.m1469c(this.f1981o, i);
                if (drawableM1469c != null) {
                    this.f1982p.put(str2, drawableM1469c.getConstantState());
                }
                return drawableM1469c;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = this.f1982p.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableM1126e = m1126e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = this.f1981o.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                            }
                            drawableM1126e = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                    if (drawableM1126e != null) {
                        this.f1982p.put(str, drawableM1126e.getConstantState());
                    }
                    return drawableM1126e;
                }
                if (drawableM1126e != null) {
                    this.f1982p.put(str, drawableM1126e.getConstantState());
                }
            }
        }
        return drawableM1126e;
    }

    /* JADX INFO: renamed from: g */
    public Cursor m1128g(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f2800e.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p006b.p047i.p048a.AbstractC0439a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f2810l.inflate(this.f2809k, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).f1992a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // p006b.p047i.p048a.AbstractC0439a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewMo1125d = mo1125d(this.f2800e, this.f2799d, viewGroup);
            ((a) viewMo1125d.getTag()).f1992a.setText(e.toString());
            return viewMo1125d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m1129i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1129i(this.f2799d);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1129i(this.f2799d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1979m.m85x((CharSequence) tag);
        }
    }
}
