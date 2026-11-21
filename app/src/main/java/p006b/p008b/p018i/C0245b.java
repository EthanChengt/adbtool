package p006b.p008b.p018i;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: b.b.i.b */
/* JADX INFO: loaded from: classes.dex */
public class C0245b extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f1775a;

    public C0245b(ActionBarContainer actionBarContainer) {
        this.f1775a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1775a;
        if (actionBarContainer.f175i) {
            Drawable drawable = actionBarContainer.f174h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f172f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1775a;
        Drawable drawable3 = actionBarContainer2.f173g;
        if (drawable3 == null || !actionBarContainer2.f176j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1775a;
        if (actionBarContainer.f175i) {
            drawable = actionBarContainer.f174h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f172f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
