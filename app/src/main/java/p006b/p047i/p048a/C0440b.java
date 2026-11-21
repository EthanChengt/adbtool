package p006b.p047i.p048a;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import java.util.Objects;
import p006b.p008b.p018i.ViewOnClickListenerC0282r0;

/* JADX INFO: renamed from: b.i.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0440b extends Filter {

    /* JADX INFO: renamed from: a */
    public a f2807a;

    /* JADX INFO: renamed from: b.i.a.b$a */
    public interface a {
    }

    public C0440b(a aVar) {
        this.f2807a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC0282r0) this.f2807a).mo1124c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorM1128g;
        ViewOnClickListenerC0282r0 viewOnClickListenerC0282r0 = (ViewOnClickListenerC0282r0) this.f2807a;
        Objects.requireNonNull(viewOnClickListenerC0282r0);
        String string = charSequence == null ? "" : charSequence.toString();
        if (viewOnClickListenerC0282r0.f1979m.getVisibility() == 0 && viewOnClickListenerC0282r0.f1979m.getWindowVisibility() == 0) {
            try {
                cursorM1128g = viewOnClickListenerC0282r0.m1128g(viewOnClickListenerC0282r0.f1980n, string, 50);
                if (cursorM1128g != null) {
                    cursorM1128g.getCount();
                } else {
                    cursorM1128g = null;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        } else {
            cursorM1128g = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorM1128g != null) {
            filterResults.count = cursorM1128g.getCount();
            filterResults.values = cursorM1128g;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f2807a;
        Cursor cursor = ((AbstractC0439a) aVar).f2799d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC0282r0) aVar).mo1123b((Cursor) obj);
    }
}
