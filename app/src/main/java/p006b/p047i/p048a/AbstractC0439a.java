package p006b.p047i.p048a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.i.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0439a extends BaseAdapter implements Filterable, C0440b.a {

    /* JADX INFO: renamed from: b */
    public boolean f2797b;

    /* JADX INFO: renamed from: c */
    public boolean f2798c;

    /* JADX INFO: renamed from: d */
    public Cursor f2799d;

    /* JADX INFO: renamed from: e */
    public Context f2800e;

    /* JADX INFO: renamed from: f */
    public int f2801f;

    /* JADX INFO: renamed from: g */
    public a f2802g;

    /* JADX INFO: renamed from: h */
    public DataSetObserver f2803h;

    /* JADX INFO: renamed from: i */
    public C0440b f2804i;

    /* JADX INFO: renamed from: b.i.a.a$a */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            AbstractC0439a abstractC0439a = AbstractC0439a.this;
            if (!abstractC0439a.f2798c || (cursor = abstractC0439a.f2799d) == null || cursor.isClosed()) {
                return;
            }
            abstractC0439a.f2797b = abstractC0439a.f2799d.requery();
        }
    }

    /* JADX INFO: renamed from: b.i.a.a$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0439a abstractC0439a = AbstractC0439a.this;
            abstractC0439a.f2797b = true;
            abstractC0439a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0439a abstractC0439a = AbstractC0439a.this;
            abstractC0439a.f2797b = false;
            abstractC0439a.notifyDataSetInvalidated();
        }
    }

    public AbstractC0439a(Context context, Cursor cursor, boolean z) {
        b bVar;
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.f2798c = true;
        } else {
            this.f2798c = false;
        }
        boolean z2 = cursor != null;
        this.f2799d = cursor;
        this.f2797b = z2;
        this.f2800e = context;
        this.f2801f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f2802g = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2802g = null;
        }
        this.f2803h = bVar;
        if (z2) {
            a aVar = this.f2802g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2803h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1122a(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: b */
    public void mo1123b(Cursor cursor) {
        Cursor cursor2 = this.f2799d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f2802g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f2803h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f2799d = cursor;
            if (cursor != null) {
                a aVar2 = this.f2802g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f2803h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f2801f = cursor.getColumnIndexOrThrow("_id");
                this.f2797b = true;
                notifyDataSetChanged();
            } else {
                this.f2801f = -1;
                this.f2797b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract CharSequence mo1124c(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract View mo1125d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2797b || (cursor = this.f2799d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2797b) {
            return null;
        }
        this.f2799d.moveToPosition(i);
        if (view == null) {
            AbstractC0441c abstractC0441c = (AbstractC0441c) this;
            view = abstractC0441c.f2810l.inflate(abstractC0441c.f2809k, viewGroup, false);
        }
        mo1122a(view, this.f2800e, this.f2799d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2804i == null) {
            this.f2804i = new C0440b(this);
        }
        return this.f2804i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f2797b || (cursor = this.f2799d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f2799d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f2797b && (cursor = this.f2799d) != null && cursor.moveToPosition(i)) {
            return this.f2799d.getLong(this.f2801f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2797b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f2799d.moveToPosition(i)) {
            throw new IllegalStateException(a.m2198l("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = mo1125d(this.f2800e, this.f2799d, viewGroup);
        }
        mo1122a(view, this.f2800e, this.f2799d);
        return view;
    }
}
