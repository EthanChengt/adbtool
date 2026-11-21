package com.didjdk.adbhelper.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class DragView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public double f10113b;

    /* JADX INFO: renamed from: c */
    public double f10114c;

    public DragView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getStatusBarHeight() {
        return getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getAction() == 0) {
            this.f10113b = rawX;
            this.f10114c = rawY;
            return false;
        }
        if (motionEvent.getAction() != 2) {
            return false;
        }
        double d = this.f10113b;
        double d2 = rawX;
        Double.isNaN(d2);
        if (Math.abs(d - d2) > 10.0d) {
            return true;
        }
        double d3 = this.f10114c;
        double d4 = rawY;
        Double.isNaN(d4);
        return Math.abs(d3 - d4) > 10.0d;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        int i3 = getResources().getDisplayMetrics().widthPixels;
        getStatusBarHeight();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        double rawX = motionEvent.getRawX();
        double rawY = motionEvent.getRawY();
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() != 2) {
                return true;
            }
            double d = this.f10113b;
            Double.isNaN(rawX);
            double d2 = this.f10114c;
            Double.isNaN(rawY);
            double translationX = getTranslationX();
            Double.isNaN(translationX);
            Double.isNaN(translationX);
            setTranslationX((float) (translationX + (rawX - d)));
            double translationY = getTranslationY();
            Double.isNaN(translationY);
            Double.isNaN(translationY);
            setTranslationY((float) (translationY + (rawY - d2)));
        }
        this.f10113b = rawX;
        this.f10114c = rawY;
        return true;
    }
}
