package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0410e;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0422q;
import p006b.p032h.p044j.InterfaceC0409d;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p049j.p050a.AbstractC0442a;
import p006b.p068t.C0537a;
import p006b.p068t.p069b.AbstractC0559v;
import p006b.p068t.p069b.AbstractC0560w;
import p006b.p068t.p069b.C0538a;
import p006b.p068t.p069b.C0539b;
import p006b.p068t.p069b.C0543f;
import p006b.p068t.p069b.C0548k;
import p006b.p068t.p069b.C0549l;
import p006b.p068t.p069b.C0552o;
import p006b.p068t.p069b.C0553p;
import p006b.p068t.p069b.C0558u;
import p006b.p068t.p069b.C0561x;
import p006b.p068t.p069b.C0562y;
import p006b.p068t.p069b.C0563z;
import p006b.p068t.p069b.RunnableC0540c;
import p006b.p068t.p069b.RunnableC0541d;
import p006b.p068t.p069b.RunnableC0542e;
import p006b.p068t.p069b.RunnableC0550m;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0409d {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator;
    public C0558u mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public AbstractC0132g mAdapter;
    public C0538a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC0135j mChildDrawingOrderCallback;
    public C0539b mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0136k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public RunnableC0550m mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC0144s mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public AbstractC0137l mItemAnimator;
    private AbstractC0137l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<AbstractC0139n> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    public AbstractC0140o mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0149x mObserver;
    private List<InterfaceC0142q> mOnChildAttachStateListeners;
    private AbstractC0143r mOnFlingListener;
    private final ArrayList<InterfaceC0144s> mOnItemTouchListeners;
    public final List<AbstractC0129d0> mPendingAccessibilityImportanceChange;
    private C0150y mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public RunnableC0550m.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final C0147v mRecycler;
    public InterfaceC0148w mRecyclerListener;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC0145t mScrollListener;
    private List<AbstractC0145t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0410e mScrollingChildHelper;
    public final C0123a0 mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final RunnableC0127c0 mViewFlinger;
    private final C0563z.b mViewInfoProcessCallback;
    public final C0563z mViewInfoStore;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC0122a implements Runnable {
        public RunnableC0122a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0123a0 {

        /* JADX INFO: renamed from: a */
        public int f903a = -1;

        /* JADX INFO: renamed from: b */
        public int f904b = 0;

        /* JADX INFO: renamed from: c */
        public int f905c = 0;

        /* JADX INFO: renamed from: d */
        public int f906d = 1;

        /* JADX INFO: renamed from: e */
        public int f907e = 0;

        /* JADX INFO: renamed from: f */
        public boolean f908f = false;

        /* JADX INFO: renamed from: g */
        public boolean f909g = false;

        /* JADX INFO: renamed from: h */
        public boolean f910h = false;

        /* JADX INFO: renamed from: i */
        public boolean f911i = false;

        /* JADX INFO: renamed from: j */
        public boolean f912j = false;

        /* JADX INFO: renamed from: k */
        public boolean f913k = false;

        /* JADX INFO: renamed from: l */
        public int f914l;

        /* JADX INFO: renamed from: m */
        public long f915m;

        /* JADX INFO: renamed from: n */
        public int f916n;

        /* JADX INFO: renamed from: a */
        public void m500a(int i) {
            if ((this.f906d & i) != 0) {
                return;
            }
            StringBuilder sbM2191e = a.m2191e("Layout state should be one of ");
            sbM2191e.append(Integer.toBinaryString(i));
            sbM2191e.append(" but it is ");
            sbM2191e.append(Integer.toBinaryString(this.f906d));
            throw new IllegalStateException(sbM2191e.toString());
        }

        /* JADX INFO: renamed from: b */
        public int m501b() {
            return this.f909g ? this.f904b - this.f905c : this.f907e;
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("State{mTargetPosition=");
            sbM2191e.append(this.f903a);
            sbM2191e.append(", mData=");
            sbM2191e.append((Object) null);
            sbM2191e.append(", mItemCount=");
            sbM2191e.append(this.f907e);
            sbM2191e.append(", mIsMeasuring=");
            sbM2191e.append(this.f911i);
            sbM2191e.append(", mPreviousLayoutItemCount=");
            sbM2191e.append(this.f904b);
            sbM2191e.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sbM2191e.append(this.f905c);
            sbM2191e.append(", mStructureChanged=");
            sbM2191e.append(this.f908f);
            sbM2191e.append(", mInPreLayout=");
            sbM2191e.append(this.f909g);
            sbM2191e.append(", mRunSimpleAnimations=");
            sbM2191e.append(this.f912j);
            sbM2191e.append(", mRunPredictiveAnimations=");
            sbM2191e.append(this.f913k);
            sbM2191e.append('}');
            return sbM2191e.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class RunnableC0124b implements Runnable {
        public RunnableC0124b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0137l abstractC0137l = RecyclerView.this.mItemAnimator;
            if (abstractC0137l != null) {
                C0548k c0548k = (C0548k) abstractC0137l;
                boolean z = !c0548k.f3350h.isEmpty();
                boolean z2 = !c0548k.f3352j.isEmpty();
                boolean z3 = !c0548k.f3353k.isEmpty();
                boolean z4 = !c0548k.f3351i.isEmpty();
                if (z || z2 || z4 || z3) {
                    for (AbstractC0129d0 abstractC0129d0 : c0548k.f3350h) {
                        View view = abstractC0129d0.f927a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0548k.f3359q.add(abstractC0129d0);
                        viewPropertyAnimatorAnimate.setDuration(c0548k.f952d).alpha(0.0f).setListener(new C0543f(c0548k, abstractC0129d0, viewPropertyAnimatorAnimate, view)).start();
                    }
                    c0548k.f3350h.clear();
                    if (z2) {
                        ArrayList<C0548k.b> arrayList = new ArrayList<>();
                        arrayList.addAll(c0548k.f3352j);
                        c0548k.f3355m.add(arrayList);
                        c0548k.f3352j.clear();
                        RunnableC0540c runnableC0540c = new RunnableC0540c(c0548k, arrayList);
                        if (z) {
                            View view2 = arrayList.get(0).f3367a.f927a;
                            long j = c0548k.f952d;
                            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                            view2.postOnAnimationDelayed(runnableC0540c, j);
                        } else {
                            runnableC0540c.run();
                        }
                    }
                    if (z3) {
                        ArrayList<C0548k.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(c0548k.f3353k);
                        c0548k.f3356n.add(arrayList2);
                        c0548k.f3353k.clear();
                        RunnableC0541d runnableC0541d = new RunnableC0541d(c0548k, arrayList2);
                        if (z) {
                            View view3 = arrayList2.get(0).f3361a.f927a;
                            long j2 = c0548k.f952d;
                            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                            view3.postOnAnimationDelayed(runnableC0541d, j2);
                        } else {
                            runnableC0541d.run();
                        }
                    }
                    if (z4) {
                        ArrayList<AbstractC0129d0> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(c0548k.f3351i);
                        c0548k.f3354l.add(arrayList3);
                        c0548k.f3351i.clear();
                        RunnableC0542e runnableC0542e = new RunnableC0542e(c0548k, arrayList3);
                        if (z || z2 || z3) {
                            long jMax = Math.max(z2 ? c0548k.f953e : 0L, z3 ? c0548k.f954f : 0L) + (z ? c0548k.f952d : 0L);
                            View view4 = arrayList3.get(0).f927a;
                            WeakHashMap<View, String> weakHashMap3 = C0418m.f2718a;
                            view4.postOnAnimationDelayed(runnableC0542e, jMax);
                        } else {
                            runnableC0542e.run();
                        }
                    }
                }
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class AbstractC0125b0 {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public static class InterpolatorC0126c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public class RunnableC0127c0 implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f918b;

        /* JADX INFO: renamed from: c */
        public int f919c;

        /* JADX INFO: renamed from: d */
        public OverScroller f920d;

        /* JADX INFO: renamed from: e */
        public Interpolator f921e;

        /* JADX INFO: renamed from: f */
        public boolean f922f;

        /* JADX INFO: renamed from: g */
        public boolean f923g;

        public RunnableC0127c0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f921e = interpolator;
            this.f922f = false;
            this.f923g = false;
            this.f920d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* JADX INFO: renamed from: a */
        public void m502a() {
            if (this.f922f) {
                this.f923g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            recyclerView.postOnAnimation(this);
        }

        /* JADX INFO: renamed from: b */
        public void m503b(int i, int i2, int i3, Interpolator interpolator) {
            int iRound;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int iSqrt = (int) Math.sqrt(0);
                int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i4 = width / 2;
                float f = width;
                float f2 = i4;
                float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                if (iSqrt > 0) {
                    iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        iAbs = iAbs2;
                    }
                    iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
                }
                i3 = Math.min(iRound, RecyclerView.MAX_SCROLL_DURATION);
            }
            int i5 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f921e != interpolator) {
                this.f921e = interpolator;
                this.f920d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f919c = 0;
            this.f918b = 0;
            RecyclerView.this.setScrollState(2);
            this.f920d.startScroll(0, 0, i, i2, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f920d.computeScrollOffset();
            }
            m502a();
        }

        /* JADX INFO: renamed from: c */
        public void m504c() {
            RecyclerView.this.removeCallbacks(this);
            this.f920d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m504c();
                return;
            }
            this.f923g = false;
            this.f922f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f920d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f918b;
                int i5 = currY - this.f919c;
                this.f918b = currX;
                this.f919c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    AbstractC0151z abstractC0151z = recyclerView4.mLayout.f964g;
                    if (abstractC0151z != null && !abstractC0151z.f1004d && abstractC0151z.f1005e) {
                        int iM501b = recyclerView4.mState.m501b();
                        if (iM501b == 0) {
                            abstractC0151z.m656d();
                        } else {
                            if (abstractC0151z.f1001a >= iM501b) {
                                abstractC0151z.f1001a = iM501b - 1;
                            }
                            abstractC0151z.m654b(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                AbstractC0151z abstractC0151z2 = recyclerView7.mLayout.f964g;
                if ((abstractC0151z2 != null && abstractC0151z2.f1004d) || !z) {
                    m502a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    RunnableC0550m runnableC0550m = recyclerView8.mGapWorker;
                    if (runnableC0550m != null) {
                        runnableC0550m.m2028a(recyclerView8, i2, i);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i6 > 0 ? currVelocity : 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RunnableC0550m.b bVar = RecyclerView.this.mPrefetchRegistry;
                        int[] iArr7 = bVar.f3416c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f3417d = 0;
                    }
                }
            }
            AbstractC0151z abstractC0151z3 = RecyclerView.this.mLayout.f964g;
            if (abstractC0151z3 != null && abstractC0151z3.f1004d) {
                abstractC0151z3.m654b(0, 0);
            }
            this.f922f = false;
            if (!this.f923g) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            } else {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView9 = RecyclerView.this;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                recyclerView9.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C0128d implements C0563z.b {
        public C0128d() {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class AbstractC0129d0 {

        /* JADX INFO: renamed from: s */
        public static final List<Object> f926s = Collections.emptyList();

        /* JADX INFO: renamed from: a */
        public final View f927a;

        /* JADX INFO: renamed from: b */
        public WeakReference<RecyclerView> f928b;

        /* JADX INFO: renamed from: j */
        public int f936j;

        /* JADX INFO: renamed from: r */
        public RecyclerView f944r;

        /* JADX INFO: renamed from: c */
        public int f929c = -1;

        /* JADX INFO: renamed from: d */
        public int f930d = -1;

        /* JADX INFO: renamed from: e */
        public long f931e = -1;

        /* JADX INFO: renamed from: f */
        public int f932f = -1;

        /* JADX INFO: renamed from: g */
        public int f933g = -1;

        /* JADX INFO: renamed from: h */
        public AbstractC0129d0 f934h = null;

        /* JADX INFO: renamed from: i */
        public AbstractC0129d0 f935i = null;

        /* JADX INFO: renamed from: k */
        public List<Object> f937k = null;

        /* JADX INFO: renamed from: l */
        public List<Object> f938l = null;

        /* JADX INFO: renamed from: m */
        public int f939m = 0;

        /* JADX INFO: renamed from: n */
        public C0147v f940n = null;

        /* JADX INFO: renamed from: o */
        public boolean f941o = false;

        /* JADX INFO: renamed from: p */
        public int f942p = 0;

        /* JADX INFO: renamed from: q */
        public int f943q = -1;

        public AbstractC0129d0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f927a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m505a(Object obj) {
            if (obj == null) {
                m506b(1024);
                return;
            }
            if ((1024 & this.f936j) == 0) {
                if (this.f937k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f937k = arrayList;
                    this.f938l = Collections.unmodifiableList(arrayList);
                }
                this.f937k.add(obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m506b(int i) {
            this.f936j = i | this.f936j;
        }

        /* JADX INFO: renamed from: c */
        public void m507c() {
            this.f930d = -1;
            this.f933g = -1;
        }

        /* JADX INFO: renamed from: d */
        public void m508d() {
            this.f936j &= -33;
        }

        /* JADX INFO: renamed from: e */
        public final int m509e() {
            RecyclerView recyclerView = this.f944r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        /* JADX INFO: renamed from: f */
        public final int m510f() {
            int i = this.f933g;
            return i == -1 ? this.f929c : i;
        }

        /* JADX INFO: renamed from: g */
        public List<Object> m511g() {
            if ((this.f936j & 1024) != 0) {
                return f926s;
            }
            List<Object> list = this.f937k;
            return (list == null || list.size() == 0) ? f926s : this.f938l;
        }

        /* JADX INFO: renamed from: h */
        public boolean m512h(int i) {
            return (i & this.f936j) != 0;
        }

        /* JADX INFO: renamed from: i */
        public boolean m513i() {
            return (this.f927a.getParent() == null || this.f927a.getParent() == this.f944r) ? false : true;
        }

        /* JADX INFO: renamed from: j */
        public boolean m514j() {
            return (this.f936j & 1) != 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m515k() {
            return (this.f936j & 4) != 0;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m516l() {
            if ((this.f936j & 16) == 0) {
                View view = this.f927a;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: m */
        public boolean m517m() {
            return (this.f936j & 8) != 0;
        }

        /* JADX INFO: renamed from: n */
        public boolean m518n() {
            return this.f940n != null;
        }

        /* JADX INFO: renamed from: o */
        public boolean m519o() {
            return (this.f936j & 256) != 0;
        }

        /* JADX INFO: renamed from: p */
        public boolean m520p() {
            return (this.f936j & 2) != 0;
        }

        /* JADX INFO: renamed from: q */
        public void m521q(int i, boolean z) {
            if (this.f930d == -1) {
                this.f930d = this.f929c;
            }
            if (this.f933g == -1) {
                this.f933g = this.f929c;
            }
            if (z) {
                this.f933g += i;
            }
            this.f929c += i;
            if (this.f927a.getLayoutParams() != null) {
                ((C0141p) this.f927a.getLayoutParams()).f983c = true;
            }
        }

        /* JADX INFO: renamed from: r */
        public void m522r() {
            this.f936j = 0;
            this.f929c = -1;
            this.f930d = -1;
            this.f931e = -1L;
            this.f933g = -1;
            this.f939m = 0;
            this.f934h = null;
            this.f935i = null;
            List<Object> list = this.f937k;
            if (list != null) {
                list.clear();
            }
            this.f936j &= -1025;
            this.f942p = 0;
            this.f943q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* JADX INFO: renamed from: s */
        public void m523s(int i, int i2) {
            this.f936j = (i & i2) | (this.f936j & (i2 ^ (-1)));
        }

        /* JADX INFO: renamed from: t */
        public final void m524t(boolean z) {
            int i;
            int i2 = this.f939m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f939m = i3;
            if (i3 < 0) {
                this.f939m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f936j | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.f936j & (-17);
            }
            this.f936j = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f929c + " id=" + this.f931e + ", oldPos=" + this.f930d + ", pLpos:" + this.f933g);
            if (m518n()) {
                sb.append(" scrap ");
                sb.append(this.f941o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m515k()) {
                sb.append(" invalid");
            }
            if (!m514j()) {
                sb.append(" unbound");
            }
            if ((this.f936j & 2) != 0) {
                sb.append(" update");
            }
            if (m517m()) {
                sb.append(" removed");
            }
            if (m525u()) {
                sb.append(" ignored");
            }
            if (m519o()) {
                sb.append(" tmpDetached");
            }
            if (!m516l()) {
                StringBuilder sbM2191e = a.m2191e(" not recyclable(");
                sbM2191e.append(this.f939m);
                sbM2191e.append(")");
                sb.append(sbM2191e.toString());
            }
            if ((this.f936j & 512) != 0 || m515k()) {
                sb.append(" undefined adapter position");
            }
            if (this.f927a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* JADX INFO: renamed from: u */
        public boolean m525u() {
            return (this.f936j & 128) != 0;
        }

        /* JADX INFO: renamed from: v */
        public boolean m526v() {
            return (this.f936j & 32) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C0130e implements C0539b.b {
        public C0130e() {
        }

        /* JADX INFO: renamed from: a */
        public View m527a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* JADX INFO: renamed from: b */
        public int m528b() {
            return RecyclerView.this.getChildCount();
        }

        /* JADX INFO: renamed from: c */
        public void m529c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C0131f implements C0538a.a {
        public C0131f() {
        }

        /* JADX INFO: renamed from: a */
        public void m530a(C0538a.b bVar) {
            int i = bVar.f3312a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo430m0(recyclerView, bVar.f3313b, bVar.f3315d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo436p0(recyclerView2, bVar.f3313b, bVar.f3315d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo437r0(recyclerView3, bVar.f3313b, bVar.f3315d, bVar.f3314c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo434o0(recyclerView4, bVar.f3313b, bVar.f3315d, 1);
            }
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0129d0 m531b(int i) {
            AbstractC0129d0 abstractC0129d0FindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (abstractC0129d0FindViewHolderForPosition == null || RecyclerView.this.mChildHelper.m2006k(abstractC0129d0FindViewHolderForPosition.f927a)) {
                return null;
            }
            return abstractC0129d0FindViewHolderForPosition;
        }

        /* JADX INFO: renamed from: c */
        public void m532c(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class AbstractC0132g<VH extends AbstractC0129d0> {

        /* JADX INFO: renamed from: a */
        public final C0133h f947a = new C0133h();

        /* JADX INFO: renamed from: b */
        public boolean f948b = false;

        /* JADX INFO: renamed from: a */
        public abstract int mo533a();

        /* JADX INFO: renamed from: b */
        public long mo534b(int i) {
            return -1L;
        }

        /* JADX INFO: renamed from: c */
        public int mo535c(int i) {
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public final void m536d(int i) {
            this.f947a.m543c(i, 1, null);
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo537e(VH vh, int i);

        /* JADX INFO: renamed from: f */
        public abstract VH mo538f(ViewGroup viewGroup, int i);

        /* JADX INFO: renamed from: g */
        public void mo539g(VH vh) {
        }

        /* JADX INFO: renamed from: h */
        public void m540h(boolean z) {
            if (this.f947a.m541a()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f948b = z;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C0133h extends Observable<AbstractC0134i> {
        /* JADX INFO: renamed from: a */
        public boolean m541a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public void m542b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0134i) ((Observable) this).mObservers.get(size)).mo544a();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m543c(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0134i) ((Observable) this).mObservers.get(size)).mo545b(i, i2, obj);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class AbstractC0134i {
        /* JADX INFO: renamed from: a */
        public void mo544a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo545b(int i, int i2, Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface InterfaceC0135j {
        /* JADX INFO: renamed from: a */
        int m546a(int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0136k {
        /* JADX INFO: renamed from: a */
        public EdgeEffect m547a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC0137l {

        /* JADX INFO: renamed from: a */
        public b f949a = null;

        /* JADX INFO: renamed from: b */
        public ArrayList<a> f950b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public long f951c = 120;

        /* JADX INFO: renamed from: d */
        public long f952d = 120;

        /* JADX INFO: renamed from: e */
        public long f953e = 250;

        /* JADX INFO: renamed from: f */
        public long f954f = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m556a();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface b {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public int f955a;

            /* JADX INFO: renamed from: b */
            public int f956b;
        }

        /* JADX INFO: renamed from: b */
        public static int m548b(AbstractC0129d0 abstractC0129d0) {
            int i = abstractC0129d0.f936j & 14;
            if (abstractC0129d0.m515k()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = abstractC0129d0.f930d;
            int iM509e = abstractC0129d0.m509e();
            return (i2 == -1 || iM509e == -1 || i2 == iM509e) ? i : i | 2048;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo549a(AbstractC0129d0 abstractC0129d0, AbstractC0129d0 abstractC0129d1, c cVar, c cVar2);

        /* JADX INFO: renamed from: c */
        public final void m550c(AbstractC0129d0 abstractC0129d0) {
            b bVar = this.f949a;
            if (bVar != null) {
                C0138m c0138m = (C0138m) bVar;
                Objects.requireNonNull(c0138m);
                abstractC0129d0.m524t(true);
                if (abstractC0129d0.f934h != null && abstractC0129d0.f935i == null) {
                    abstractC0129d0.f934h = null;
                }
                abstractC0129d0.f935i = null;
                if (((abstractC0129d0.f936j & 16) != 0) || RecyclerView.this.removeAnimatingView(abstractC0129d0.f927a) || !abstractC0129d0.m519o()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(abstractC0129d0.f927a, false);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m551d() {
            int size = this.f950b.size();
            for (int i = 0; i < size; i++) {
                this.f950b.get(i).m556a();
            }
            this.f950b.clear();
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo552e(AbstractC0129d0 abstractC0129d0);

        /* JADX INFO: renamed from: f */
        public abstract void mo553f();

        /* JADX INFO: renamed from: g */
        public abstract boolean mo554g();

        /* JADX INFO: renamed from: h */
        public c m555h(AbstractC0129d0 abstractC0129d0) {
            c cVar = new c();
            View view = abstractC0129d0.f927a;
            cVar.f955a = view.getLeft();
            cVar.f956b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public class C0138m implements AbstractC0137l.b {
        public C0138m() {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC0139n {
        /* JADX INFO: renamed from: d */
        public void mo557d(Rect rect, View view, RecyclerView recyclerView, C0123a0 c0123a0) {
            ((C0141p) view.getLayoutParams()).m626a();
            rect.set(0, 0, 0, 0);
        }

        /* JADX INFO: renamed from: e */
        public void mo558e(Canvas canvas, RecyclerView recyclerView, C0123a0 c0123a0) {
        }

        /* JADX INFO: renamed from: f */
        public void mo559f(Canvas canvas, RecyclerView recyclerView, C0123a0 c0123a0) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC0140o {

        /* JADX INFO: renamed from: a */
        public C0539b f958a;

        /* JADX INFO: renamed from: b */
        public RecyclerView f959b;

        /* JADX INFO: renamed from: c */
        public final C0562y.b f960c;

        /* JADX INFO: renamed from: d */
        public final C0562y.b f961d;

        /* JADX INFO: renamed from: e */
        public C0562y f962e;

        /* JADX INFO: renamed from: f */
        public C0562y f963f;

        /* JADX INFO: renamed from: g */
        public AbstractC0151z f964g;

        /* JADX INFO: renamed from: h */
        public boolean f965h;

        /* JADX INFO: renamed from: i */
        public boolean f966i;

        /* JADX INFO: renamed from: j */
        public boolean f967j;

        /* JADX INFO: renamed from: k */
        public boolean f968k;

        /* JADX INFO: renamed from: l */
        public int f969l;

        /* JADX INFO: renamed from: m */
        public boolean f970m;

        /* JADX INFO: renamed from: n */
        public int f971n;

        /* JADX INFO: renamed from: o */
        public int f972o;

        /* JADX INFO: renamed from: p */
        public int f973p;

        /* JADX INFO: renamed from: q */
        public int f974q;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        public class a implements C0562y.b {
            public a() {
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: a */
            public View mo621a(int i) {
                return AbstractC0140o.this.m618x(i);
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: b */
            public int mo622b() {
                AbstractC0140o abstractC0140o = AbstractC0140o.this;
                return abstractC0140o.f973p - abstractC0140o.m586N();
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: c */
            public int mo623c() {
                return AbstractC0140o.this.m584M();
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: d */
            public int mo624d(View view) {
                return AbstractC0140o.this.m573F(view) + ((ViewGroup.MarginLayoutParams) ((C0141p) view.getLayoutParams())).rightMargin;
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: e */
            public int mo625e(View view) {
                return AbstractC0140o.this.m567C(view) - ((ViewGroup.MarginLayoutParams) ((C0141p) view.getLayoutParams())).leftMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        public class b implements C0562y.b {
            public b() {
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: a */
            public View mo621a(int i) {
                return AbstractC0140o.this.m618x(i);
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: b */
            public int mo622b() {
                AbstractC0140o abstractC0140o = AbstractC0140o.this;
                return abstractC0140o.f974q - abstractC0140o.m583L();
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: c */
            public int mo623c() {
                return AbstractC0140o.this.m588O();
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: d */
            public int mo624d(View view) {
                return AbstractC0140o.this.m565B(view) + ((ViewGroup.MarginLayoutParams) ((C0141p) view.getLayoutParams())).bottomMargin;
            }

            @Override // p006b.p068t.p069b.C0562y.b
            /* JADX INFO: renamed from: e */
            public int mo625e(View view) {
                return AbstractC0140o.this.m575G(view) - ((ViewGroup.MarginLayoutParams) ((C0141p) view.getLayoutParams())).topMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface c {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class d {

            /* JADX INFO: renamed from: a */
            public int f977a;

            /* JADX INFO: renamed from: b */
            public int f978b;

            /* JADX INFO: renamed from: c */
            public boolean f979c;

            /* JADX INFO: renamed from: d */
            public boolean f980d;
        }

        public AbstractC0140o() {
            a aVar = new a();
            this.f960c = aVar;
            b bVar = new b();
            this.f961d = bVar;
            this.f962e = new C0562y(aVar);
            this.f963f = new C0562y(bVar);
            this.f965h = false;
            this.f966i = false;
            this.f967j = true;
            this.f968k = true;
        }

        /* JADX INFO: renamed from: Q */
        public static d m560Q(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0537a.f3305a, i, i2);
            dVar.f977a = typedArrayObtainStyledAttributes.getInt(0, 1);
            dVar.f978b = typedArrayObtainStyledAttributes.getInt(10, 1);
            dVar.f979c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            dVar.f980d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        /* JADX INFO: renamed from: W */
        public static boolean m561W(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX INFO: renamed from: h */
        public static int m562h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:21:0x002f  */
        /* JADX INFO: renamed from: z */
        public static int m563z(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else {
                if (i4 != -1) {
                    if (i4 == -2) {
                        i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? RecyclerView.UNDEFINED_DURATION : 0;
                    } else {
                        i2 = 0;
                        i4 = 0;
                    }
                }
                i4 = iMax;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        /* JADX INFO: renamed from: A */
        public int mo407A(C0147v c0147v, C0123a0 c0123a0) {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo462e()) {
                return 1;
            }
            return this.f959b.mAdapter.mo533a();
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006a A[PHI: r0
          0x006a: PHI (r0v6 int) = (r0v2 int), (r0v10 int) binds: [B:22:0x0059, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: A0 */
        public boolean m564A0(int i) {
            int iM588O;
            int iM584M;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f959b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                iM588O = recyclerView.canScrollVertically(1) ? (this.f974q - m588O()) - m583L() : 0;
                if (this.f959b.canScrollHorizontally(1)) {
                    iM584M = (this.f973p - m584M()) - m586N();
                    i3 = iM584M;
                    i2 = iM588O;
                } else {
                    i2 = iM588O;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                iM588O = recyclerView.canScrollVertically(-1) ? -((this.f974q - m588O()) - m583L()) : 0;
                if (this.f959b.canScrollHorizontally(-1)) {
                    iM584M = -((this.f973p - m584M()) - m586N());
                    i3 = iM584M;
                    i2 = iM588O;
                } else {
                    i2 = iM588O;
                    i3 = 0;
                }
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f959b.smoothScrollBy(i3, i2, null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        /* JADX INFO: renamed from: B */
        public int m565B(View view) {
            return view.getBottom() + ((C0141p) view.getLayoutParams()).f982b.bottom;
        }

        /* JADX INFO: renamed from: B0 */
        public boolean m566B0() {
            return false;
        }

        /* JADX INFO: renamed from: C */
        public int m567C(View view) {
            return view.getLeft() - ((C0141p) view.getLayoutParams()).f982b.left;
        }

        /* JADX INFO: renamed from: C0 */
        public void m568C0(C0147v c0147v) {
            for (int iM619y = m619y() - 1; iM619y >= 0; iM619y--) {
                if (!RecyclerView.getChildViewHolderInt(m618x(iM619y)).m525u()) {
                    m574F0(iM619y, c0147v);
                }
            }
        }

        /* JADX INFO: renamed from: D */
        public int m569D(View view) {
            Rect rect = ((C0141p) view.getLayoutParams()).f982b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* JADX INFO: renamed from: D0 */
        public void m570D0(C0147v c0147v) {
            int size = c0147v.f991a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = c0147v.f991a.get(i).f927a;
                AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.m525u()) {
                    childViewHolderInt.m524t(false);
                    if (childViewHolderInt.m519o()) {
                        this.f959b.removeDetachedView(view, false);
                    }
                    AbstractC0137l abstractC0137l = this.f959b.mItemAnimator;
                    if (abstractC0137l != null) {
                        abstractC0137l.mo552e(childViewHolderInt);
                    }
                    childViewHolderInt.m524t(true);
                    AbstractC0129d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.f940n = null;
                    childViewHolderInt2.f941o = false;
                    childViewHolderInt2.m508d();
                    c0147v.m646i(childViewHolderInt2);
                }
            }
            c0147v.f991a.clear();
            ArrayList<AbstractC0129d0> arrayList = c0147v.f992b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f959b.invalidate();
            }
        }

        /* JADX INFO: renamed from: E */
        public int m571E(View view) {
            Rect rect = ((C0141p) view.getLayoutParams()).f982b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* JADX INFO: renamed from: E0 */
        public void m572E0(View view, C0147v c0147v) {
            C0539b c0539b = this.f958a;
            int iIndexOfChild = RecyclerView.this.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (c0539b.f3317b.m2013f(iIndexOfChild)) {
                    c0539b.m2007l(view);
                }
                ((C0130e) c0539b.f3316a).m529c(iIndexOfChild);
            }
            c0147v.m645h(view);
        }

        /* JADX INFO: renamed from: F */
        public int m573F(View view) {
            return view.getRight() + ((C0141p) view.getLayoutParams()).f982b.right;
        }

        /* JADX INFO: renamed from: F0 */
        public void m574F0(int i, C0147v c0147v) {
            View viewM618x = m618x(i);
            m576G0(i);
            c0147v.m645h(viewM618x);
        }

        /* JADX INFO: renamed from: G */
        public int m575G(View view) {
            return view.getTop() - ((C0141p) view.getLayoutParams()).f982b.top;
        }

        /* JADX INFO: renamed from: G0 */
        public void m576G0(int i) {
            C0539b c0539b;
            int iM2001f;
            View viewM527a;
            if (m618x(i) == null || (viewM527a = ((C0130e) c0539b.f3316a).m527a((iM2001f = (c0539b = this.f958a).m2001f(i)))) == null) {
                return;
            }
            if (c0539b.f3317b.m2013f(iM2001f)) {
                c0539b.m2007l(viewM527a);
            }
            ((C0130e) c0539b.f3316a).m529c(iM2001f);
        }

        /* JADX INFO: renamed from: H */
        public View m577H() {
            View focusedChild;
            RecyclerView recyclerView = this.f959b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f958a.f3318c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x007e  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
        /* JADX INFO: renamed from: H0 */
        public boolean m578H0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            boolean z3;
            int[] iArr = new int[2];
            int iM584M = m584M();
            int iM588O = m588O();
            int iM586N = this.f973p - m586N();
            int iM583L = this.f974q - m583L();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iM584M;
            int iMin = Math.min(0, i);
            int i2 = top - iM588O;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iM586N;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iM583L);
            if (m579I() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild == null) {
                    z3 = false;
                } else {
                    int iM584M2 = m584M();
                    int iM588O2 = m588O();
                    int iM586N2 = this.f973p - m586N();
                    int iM583L2 = this.f974q - m583L();
                    Rect rect2 = this.f959b.mTempRect;
                    RecyclerView.getDecoratedBoundsWithMarginsInt(focusedChild, rect2);
                    if (rect2.left - i4 >= iM586N2 || rect2.right - i4 <= iM584M2 || rect2.top - i5 >= iM583L2 || rect2.bottom - i5 <= iM588O2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                if (z3) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                    } else {
                        recyclerView.smoothScrollBy(i4, i5);
                    }
                    return true;
                }
            } else if (i4 == 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                } else {
                    recyclerView.smoothScrollBy(i4, i5);
                }
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: I */
        public int m579I() {
            RecyclerView recyclerView = this.f959b;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            return recyclerView.getLayoutDirection();
        }

        /* JADX INFO: renamed from: I0 */
        public void m580I0() {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* JADX INFO: renamed from: J */
        public int m581J() {
            RecyclerView recyclerView = this.f959b;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            return recyclerView.getMinimumHeight();
        }

        /* JADX INFO: renamed from: J0 */
        public int mo413J0(int i, C0147v c0147v, C0123a0 c0123a0) {
            return 0;
        }

        /* JADX INFO: renamed from: K */
        public int m582K() {
            RecyclerView recyclerView = this.f959b;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            return recyclerView.getMinimumWidth();
        }

        /* JADX INFO: renamed from: K0 */
        public void mo450K0(int i) {
        }

        /* JADX INFO: renamed from: L */
        public int m583L() {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* JADX INFO: renamed from: L0 */
        public int mo416L0(int i, C0147v c0147v, C0123a0 c0123a0) {
            return 0;
        }

        /* JADX INFO: renamed from: M */
        public int m584M() {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* JADX INFO: renamed from: M0 */
        public void m585M0(RecyclerView recyclerView) {
            m587N0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* JADX INFO: renamed from: N */
        public int m586N() {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* JADX INFO: renamed from: N0 */
        public void m587N0(int i, int i2) {
            this.f973p = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f971n = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f973p = 0;
            }
            this.f974q = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f972o = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.f974q = 0;
        }

        /* JADX INFO: renamed from: O */
        public int m588O() {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: renamed from: O0 */
        public void mo420O0(Rect rect, int i, int i2) {
            int iM586N = m586N() + m584M() + rect.width();
            int iM583L = m583L() + m588O() + rect.height();
            this.f959b.setMeasuredDimension(m562h(i, iM586N, m582K()), m562h(i2, iM583L, m581J()));
        }

        /* JADX INFO: renamed from: P */
        public int m589P(View view) {
            return ((C0141p) view.getLayoutParams()).m626a();
        }

        /* JADX INFO: renamed from: P0 */
        public void m590P0(int i, int i2) {
            int iM619y = m619y();
            if (iM619y == 0) {
                this.f959b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i6 = RecyclerView.UNDEFINED_DURATION;
            for (int i7 = 0; i7 < iM619y; i7++) {
                View viewM618x = m618x(i7);
                Rect rect = this.f959b.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(viewM618x, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f959b.mTempRect.set(i3, i4, i5, i6);
            mo420O0(this.f959b.mTempRect, i, i2);
        }

        /* JADX INFO: renamed from: Q0 */
        public void m591Q0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f959b = null;
                this.f958a = null;
                height = 0;
                this.f973p = 0;
            } else {
                this.f959b = recyclerView;
                this.f958a = recyclerView.mChildHelper;
                this.f973p = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f974q = height;
            this.f971n = 1073741824;
            this.f972o = 1073741824;
        }

        /* JADX INFO: renamed from: R */
        public int mo422R(C0147v c0147v, C0123a0 c0123a0) {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo464f()) {
                return 1;
            }
            return this.f959b.mAdapter.mo533a();
        }

        /* JADX INFO: renamed from: R0 */
        public boolean m592R0(View view, int i, int i2, C0141p c0141p) {
            return (!view.isLayoutRequested() && this.f967j && m561W(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0141p).width) && m561W(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0141p).height)) ? false : true;
        }

        /* JADX INFO: renamed from: S */
        public int m593S() {
            return 0;
        }

        /* JADX INFO: renamed from: S0 */
        public boolean mo451S0() {
            return false;
        }

        /* JADX INFO: renamed from: T */
        public void m594T(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0141p) view.getLayoutParams()).f982b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f959b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f959b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX INFO: renamed from: T0 */
        public boolean m595T0(View view, int i, int i2, C0141p c0141p) {
            return (this.f967j && m561W(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0141p).width) && m561W(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0141p).height)) ? false : true;
        }

        /* JADX INFO: renamed from: U */
        public boolean mo452U() {
            return false;
        }

        /* JADX INFO: renamed from: U0 */
        public void mo453U0(RecyclerView recyclerView, C0123a0 c0123a0, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* JADX INFO: renamed from: V */
        public boolean m596V() {
            return false;
        }

        /* JADX INFO: renamed from: V0 */
        public void m597V0(AbstractC0151z abstractC0151z) {
            AbstractC0151z abstractC0151z2 = this.f964g;
            if (abstractC0151z2 != null && abstractC0151z != abstractC0151z2 && abstractC0151z2.f1005e) {
                abstractC0151z2.m656d();
            }
            this.f964g = abstractC0151z;
            RecyclerView recyclerView = this.f959b;
            Objects.requireNonNull(abstractC0151z);
            recyclerView.mViewFlinger.m504c();
            if (abstractC0151z.f1008h) {
                StringBuilder sbM2191e = a.m2191e("An instance of ");
                sbM2191e.append(abstractC0151z.getClass().getSimpleName());
                sbM2191e.append(" was started more than once. Each instance of");
                sbM2191e.append(abstractC0151z.getClass().getSimpleName());
                sbM2191e.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w(RecyclerView.TAG, sbM2191e.toString());
            }
            abstractC0151z.f1002b = recyclerView;
            abstractC0151z.f1003c = this;
            int i = abstractC0151z.f1001a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f903a = i;
            abstractC0151z.f1005e = true;
            abstractC0151z.f1004d = true;
            abstractC0151z.f1006f = recyclerView.mLayout.mo484t(i);
            abstractC0151z.f1002b.mViewFlinger.m502a();
            abstractC0151z.f1008h = true;
        }

        /* JADX INFO: renamed from: W0 */
        public boolean mo423W0() {
            return false;
        }

        /* JADX INFO: renamed from: X */
        public boolean m598X(View view, boolean z) {
            boolean z2 = this.f962e.m2063b(view, 24579) && this.f963f.m2063b(view, 24579);
            return z ? z2 : !z2;
        }

        /* JADX INFO: renamed from: Y */
        public void m599Y(View view, int i, int i2, int i3, int i4) {
            C0141p c0141p = (C0141p) view.getLayoutParams();
            Rect rect = c0141p.f982b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0141p).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0141p).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0141p).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0141p).bottomMargin);
        }

        /* JADX INFO: renamed from: Z */
        public void mo600Z(int i) {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* JADX INFO: renamed from: a0 */
        public void mo601a0(int i) {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m602b(View view) {
            m604c(view, -1, false);
        }

        /* JADX INFO: renamed from: b0 */
        public void m603b0() {
        }

        /* JADX INFO: renamed from: c */
        public final void m604c(View view, int i, boolean z) {
            AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.m517m()) {
                this.f959b.mViewInfoStore.m2066a(childViewHolderInt);
            } else {
                this.f959b.mViewInfoStore.m2071f(childViewHolderInt);
            }
            C0141p c0141p = (C0141p) view.getLayoutParams();
            if (childViewHolderInt.m526v() || childViewHolderInt.m518n()) {
                if (childViewHolderInt.m518n()) {
                    childViewHolderInt.f940n.m649l(childViewHolderInt);
                } else {
                    childViewHolderInt.m508d();
                }
                this.f958a.m1997b(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f959b) {
                int iM2005j = this.f958a.m2005j(view);
                if (i == -1) {
                    i = this.f958a.m2000e();
                }
                if (iM2005j == -1) {
                    StringBuilder sbM2191e = a.m2191e("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sbM2191e.append(this.f959b.indexOfChild(view));
                    throw new IllegalStateException(a.m2197k(this.f959b, sbM2191e));
                }
                if (iM2005j != i) {
                    AbstractC0140o abstractC0140o = this.f959b.mLayout;
                    View viewM618x = abstractC0140o.m618x(iM2005j);
                    if (viewM618x == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM2005j + abstractC0140o.f959b.toString());
                    }
                    abstractC0140o.m618x(iM2005j);
                    abstractC0140o.m613r(iM2005j);
                    C0141p c0141p2 = (C0141p) viewM618x.getLayoutParams();
                    AbstractC0129d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(viewM618x);
                    if (childViewHolderInt2.m517m()) {
                        abstractC0140o.f959b.mViewInfoStore.m2066a(childViewHolderInt2);
                    } else {
                        abstractC0140o.f959b.mViewInfoStore.m2071f(childViewHolderInt2);
                    }
                    abstractC0140o.f958a.m1997b(viewM618x, i, c0141p2, childViewHolderInt2.m517m());
                }
            } else {
                this.f958a.m1996a(view, i, false);
                c0141p.f983c = true;
                AbstractC0151z abstractC0151z = this.f964g;
                if (abstractC0151z != null && abstractC0151z.f1005e && abstractC0151z.f1002b.getChildLayoutPosition(view) == abstractC0151z.f1001a) {
                    abstractC0151z.f1006f = view;
                }
            }
            if (c0141p.f984d) {
                childViewHolderInt.f927a.invalidate();
                c0141p.f984d = false;
            }
        }

        /* JADX INFO: renamed from: c0 */
        public boolean m605c0() {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void mo460d(String str) {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* JADX INFO: renamed from: d0 */
        public void m606d0() {
        }

        /* JADX INFO: renamed from: e */
        public boolean mo462e() {
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: e0 */
        public void m607e0() {
        }

        /* JADX INFO: renamed from: f */
        public boolean mo464f() {
            return false;
        }

        /* JADX INFO: renamed from: f0 */
        public void mo465f0(RecyclerView recyclerView, C0147v c0147v) {
            m607e0();
        }

        /* JADX INFO: renamed from: g */
        public boolean mo425g(C0141p c0141p) {
            return c0141p != null;
        }

        /* JADX INFO: renamed from: g0 */
        public View mo426g0(View view, int i, C0147v c0147v, C0123a0 c0123a0) {
            return null;
        }

        /* JADX INFO: renamed from: h0 */
        public void mo468h0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f959b;
            C0147v c0147v = recyclerView.mRecycler;
            C0123a0 c0123a0 = recyclerView.mState;
            m608i0(accessibilityEvent);
        }

        /* JADX INFO: renamed from: i */
        public void mo470i(int i, int i2, C0123a0 c0123a0, c cVar) {
        }

        /* JADX INFO: renamed from: i0 */
        public void m608i0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f959b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f959b.canScrollVertically(-1) && !this.f959b.canScrollHorizontally(-1) && !this.f959b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0132g abstractC0132g = this.f959b.mAdapter;
            if (abstractC0132g != null) {
                accessibilityEvent.setItemCount(abstractC0132g.mo533a());
            }
        }

        /* JADX INFO: renamed from: j */
        public void mo472j(int i, c cVar) {
        }

        /* JADX INFO: renamed from: j0 */
        public void m609j0(View view, C0429b c0429b) {
            AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.m517m() || this.f958a.m2006k(childViewHolderInt.f927a)) {
                return;
            }
            RecyclerView recyclerView = this.f959b;
            mo427k0(recyclerView.mRecycler, recyclerView.mState, view, c0429b);
        }

        /* JADX INFO: renamed from: k */
        public int mo474k(C0123a0 c0123a0) {
            return 0;
        }

        /* JADX INFO: renamed from: k0 */
        public void mo427k0(C0147v c0147v, C0123a0 c0123a0, View view, C0429b c0429b) {
            c0429b.m1618m(C0429b.c.m1622a(mo464f() ? m589P(view) : 0, 1, mo462e() ? m589P(view) : 0, 1, false, false));
        }

        /* JADX INFO: renamed from: l */
        public int mo428l(C0123a0 c0123a0) {
            return 0;
        }

        /* JADX INFO: renamed from: l0 */
        public View m610l0() {
            return null;
        }

        /* JADX INFO: renamed from: m */
        public int mo429m(C0123a0 c0123a0) {
            return 0;
        }

        /* JADX INFO: renamed from: m0 */
        public void mo430m0(RecyclerView recyclerView, int i, int i2) {
        }

        /* JADX INFO: renamed from: n */
        public int mo478n(C0123a0 c0123a0) {
            return 0;
        }

        /* JADX INFO: renamed from: n0 */
        public void mo431n0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: o */
        public int mo433o(C0123a0 c0123a0) {
            return 0;
        }

        /* JADX INFO: renamed from: o0 */
        public void mo434o0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* JADX INFO: renamed from: p */
        public int mo435p(C0123a0 c0123a0) {
            return 0;
        }

        /* JADX INFO: renamed from: p0 */
        public void mo436p0(RecyclerView recyclerView, int i, int i2) {
        }

        /* JADX INFO: renamed from: q */
        public void m611q(C0147v c0147v) {
            int iM619y = m619y();
            while (true) {
                iM619y--;
                if (iM619y < 0) {
                    return;
                }
                View viewM618x = m618x(iM619y);
                AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM618x);
                if (!childViewHolderInt.m525u()) {
                    if (!childViewHolderInt.m515k() || childViewHolderInt.m517m() || this.f959b.mAdapter.f948b) {
                        m618x(iM619y);
                        m613r(iM619y);
                        c0147v.m647j(viewM618x);
                        this.f959b.mViewInfoStore.m2071f(childViewHolderInt);
                    } else {
                        m576G0(iM619y);
                        c0147v.m646i(childViewHolderInt);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: q0 */
        public void m612q0() {
        }

        /* JADX INFO: renamed from: r */
        public final void m613r(int i) {
            this.f958a.m1998c(i);
        }

        /* JADX INFO: renamed from: r0 */
        public void mo437r0(RecyclerView recyclerView, int i, int i2, Object obj) {
            m612q0();
        }

        /* JADX INFO: renamed from: s */
        public View m614s(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.f959b;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f958a.f3318c.contains(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        /* JADX INFO: renamed from: s0 */
        public void mo438s0(C0147v c0147v, C0123a0 c0123a0) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* JADX INFO: renamed from: t */
        public View mo484t(int i) {
            int iM619y = m619y();
            for (int i2 = 0; i2 < iM619y; i2++) {
                View viewM618x = m618x(i2);
                AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM618x);
                if (childViewHolderInt != null && childViewHolderInt.m510f() == i && !childViewHolderInt.m525u() && (this.f959b.mState.f909g || !childViewHolderInt.m517m())) {
                    return viewM618x;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: t0 */
        public void mo439t0(C0123a0 c0123a0) {
        }

        /* JADX INFO: renamed from: u */
        public abstract C0141p mo441u();

        /* JADX INFO: renamed from: u0 */
        public void m615u0(int i, int i2) {
            this.f959b.defaultOnMeasure(i, i2);
        }

        /* JADX INFO: renamed from: v */
        public C0141p mo443v(Context context, AttributeSet attributeSet) {
            return new C0141p(context, attributeSet);
        }

        @Deprecated
        /* JADX INFO: renamed from: v0 */
        public boolean m616v0(RecyclerView recyclerView) {
            AbstractC0151z abstractC0151z = this.f964g;
            return (abstractC0151z != null && abstractC0151z.f1005e) || recyclerView.isComputingLayout();
        }

        /* JADX INFO: renamed from: w */
        public C0141p mo444w(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C0141p) {
                return new C0141p((C0141p) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0141p((ViewGroup.MarginLayoutParams) layoutParams) : new C0141p(layoutParams);
        }

        /* JADX INFO: renamed from: w0 */
        public boolean m617w0(RecyclerView recyclerView, View view, View view2) {
            return m616v0(recyclerView);
        }

        /* JADX INFO: renamed from: x */
        public View m618x(int i) {
            C0539b c0539b = this.f958a;
            if (c0539b == null) {
                return null;
            }
            return ((C0130e) c0539b.f3316a).m527a(c0539b.m2001f(i));
        }

        /* JADX INFO: renamed from: x0 */
        public void mo487x0(Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: y */
        public int m619y() {
            C0539b c0539b = this.f958a;
            if (c0539b != null) {
                return c0539b.m2000e();
            }
            return 0;
        }

        /* JADX INFO: renamed from: y0 */
        public Parcelable mo489y0() {
            return null;
        }

        /* JADX INFO: renamed from: z0 */
        public void mo620z0(int i) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0141p extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC0129d0 f981a;

        /* JADX INFO: renamed from: b */
        public final Rect f982b;

        /* JADX INFO: renamed from: c */
        public boolean f983c;

        /* JADX INFO: renamed from: d */
        public boolean f984d;

        public C0141p(int i, int i2) {
            super(i, i2);
            this.f982b = new Rect();
            this.f983c = true;
            this.f984d = false;
        }

        public C0141p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f982b = new Rect();
            this.f983c = true;
            this.f984d = false;
        }

        public C0141p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f982b = new Rect();
            this.f983c = true;
            this.f984d = false;
        }

        public C0141p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f982b = new Rect();
            this.f983c = true;
            this.f984d = false;
        }

        public C0141p(C0141p c0141p) {
            super((ViewGroup.LayoutParams) c0141p);
            this.f982b = new Rect();
            this.f983c = true;
            this.f984d = false;
        }

        /* JADX INFO: renamed from: a */
        public int m626a() {
            return this.f981a.m510f();
        }

        /* JADX INFO: renamed from: b */
        public boolean m627b() {
            return this.f981a.m520p();
        }

        /* JADX INFO: renamed from: c */
        public boolean m628c() {
            return this.f981a.m517m();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface InterfaceC0142q {
        /* JADX INFO: renamed from: a */
        void m629a(View view);

        /* JADX INFO: renamed from: b */
        void m630b(View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC0143r {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface InterfaceC0144s {
        /* JADX INFO: renamed from: a */
        boolean mo631a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: b */
        void mo632b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        void mo633c(boolean z);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC0145t {
        /* JADX INFO: renamed from: a */
        public void mo634a(RecyclerView recyclerView, int i) {
        }

        /* JADX INFO: renamed from: b */
        public void mo635b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0146u {

        /* JADX INFO: renamed from: a */
        public SparseArray<a> f985a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f986b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ArrayList<AbstractC0129d0> f987a = new ArrayList<>();

            /* JADX INFO: renamed from: b */
            public int f988b = 5;

            /* JADX INFO: renamed from: c */
            public long f989c = 0;

            /* JADX INFO: renamed from: d */
            public long f990d = 0;
        }

        /* JADX INFO: renamed from: a */
        public final a m636a(int i) {
            a aVar = this.f985a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f985a.put(i, aVar2);
            return aVar2;
        }

        /* JADX INFO: renamed from: b */
        public long m637b(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0147v {

        /* JADX INFO: renamed from: a */
        public final ArrayList<AbstractC0129d0> f991a;

        /* JADX INFO: renamed from: b */
        public ArrayList<AbstractC0129d0> f992b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<AbstractC0129d0> f993c;

        /* JADX INFO: renamed from: d */
        public final List<AbstractC0129d0> f994d;

        /* JADX INFO: renamed from: e */
        public int f995e;

        /* JADX INFO: renamed from: f */
        public int f996f;

        /* JADX INFO: renamed from: g */
        public C0146u f997g;

        public C0147v() {
            ArrayList<AbstractC0129d0> arrayList = new ArrayList<>();
            this.f991a = arrayList;
            this.f992b = null;
            this.f993c = new ArrayList<>();
            this.f994d = Collections.unmodifiableList(arrayList);
            this.f995e = 2;
            this.f996f = 2;
        }

        /* JADX INFO: renamed from: a */
        public void m638a(AbstractC0129d0 abstractC0129d0, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC0129d0);
            View view = abstractC0129d0.f927a;
            C0558u c0558u = RecyclerView.this.mAccessibilityDelegate;
            if (c0558u != null) {
                C0406a c0406aMo1943j = c0558u.mo1943j();
                C0418m.m1577t(view, c0406aMo1943j instanceof C0558u.a ? ((C0558u.a) c0406aMo1943j).f3449e.remove(view) : null);
            }
            if (z) {
                InterfaceC0148w interfaceC0148w = RecyclerView.this.mRecyclerListener;
                if (interfaceC0148w != null) {
                    interfaceC0148w.m651a(abstractC0129d0);
                }
                AbstractC0132g abstractC0132g = RecyclerView.this.mAdapter;
                if (abstractC0132g != null) {
                    abstractC0132g.mo539g(abstractC0129d0);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.m2072g(abstractC0129d0);
                }
            }
            abstractC0129d0.f944r = null;
            C0146u c0146uM641d = m641d();
            Objects.requireNonNull(c0146uM641d);
            int i = abstractC0129d0.f932f;
            ArrayList<AbstractC0129d0> arrayList = c0146uM641d.m636a(i).f987a;
            if (c0146uM641d.f985a.get(i).f988b <= arrayList.size()) {
                return;
            }
            abstractC0129d0.m522r();
            arrayList.add(abstractC0129d0);
        }

        /* JADX INFO: renamed from: b */
        public void m639b() {
            this.f991a.clear();
            m643f();
        }

        /* JADX INFO: renamed from: c */
        public int m640c(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.m501b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.mState.f909g ? i : recyclerView.mAdapterHelper.m1988f(i, 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.mState.m501b());
            throw new IndexOutOfBoundsException(a.m2197k(RecyclerView.this, sb));
        }

        /* JADX INFO: renamed from: d */
        public C0146u m641d() {
            if (this.f997g == null) {
                this.f997g = new C0146u();
            }
            return this.f997g;
        }

        /* JADX INFO: renamed from: e */
        public final void m642e(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m642e((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m643f() {
            for (int size = this.f993c.size() - 1; size >= 0; size--) {
                m644g(size);
            }
            this.f993c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RunnableC0550m.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f3416c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f3417d = 0;
            }
        }

        /* JADX INFO: renamed from: g */
        public void m644g(int i) {
            m638a(this.f993c.get(i), true);
            this.f993c.remove(i);
        }

        /* JADX INFO: renamed from: h */
        public void m645h(View view) {
            AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.m519o()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.m518n()) {
                childViewHolderInt.f940n.m649l(childViewHolderInt);
            } else if (childViewHolderInt.m526v()) {
                childViewHolderInt.m508d();
            }
            m646i(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.m516l()) {
                return;
            }
            RecyclerView.this.mItemAnimator.mo552e(childViewHolderInt);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0030  */
        /* JADX WARN: Code duplicated, block: B:45:0x0098 A[PHI: r1
          0x0098: PHI (r1v5 boolean) = (r1v0 boolean), (r1v8 boolean) binds: [B:22:0x0040, B:43:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: i */
        public void m646i(AbstractC0129d0 abstractC0129d0) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (abstractC0129d0.m518n() || abstractC0129d0.f927a.getParent() != null) {
                StringBuilder sbM2191e = a.m2191e("Scrapped or attached views may not be recycled. isScrap:");
                sbM2191e.append(abstractC0129d0.m518n());
                sbM2191e.append(" isAttached:");
                sbM2191e.append(abstractC0129d0.f927a.getParent() != null);
                throw new IllegalArgumentException(a.m2197k(RecyclerView.this, sbM2191e));
            }
            if (abstractC0129d0.m519o()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(abstractC0129d0);
                throw new IllegalArgumentException(a.m2197k(RecyclerView.this, sb));
            }
            if (abstractC0129d0.m525u()) {
                throw new IllegalArgumentException(a.m2197k(RecyclerView.this, a.m2191e("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            if ((abstractC0129d0.f936j & 16) == 0) {
                View view = abstractC0129d0.f927a;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (view.hasTransientState()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            AbstractC0132g abstractC0132g = RecyclerView.this.mAdapter;
            if (abstractC0132g != null && z) {
                Objects.requireNonNull(abstractC0132g);
            }
            if (abstractC0129d0.m516l()) {
                if (this.f996f <= 0 || abstractC0129d0.m512h(526)) {
                    z2 = false;
                } else {
                    int size = this.f993c.size();
                    if (size >= this.f996f && size > 0) {
                        m644g(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m2033c(abstractC0129d0.f929c)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (RecyclerView.this.mPrefetchRegistry.m2033c(this.f993c.get(size).f929c));
                        size++;
                    }
                    this.f993c.add(size, abstractC0129d0);
                    z2 = true;
                }
                if (z2) {
                    z3 = false;
                } else {
                    m638a(abstractC0129d0, true);
                }
            } else {
                z3 = false;
            }
            RecyclerView.this.mViewInfoStore.m2072g(abstractC0129d0);
            if (z2 || z3 || !z) {
                return;
            }
            abstractC0129d0.f944r = null;
        }

        /* JADX INFO: renamed from: j */
        public void m647j(View view) {
            ArrayList<AbstractC0129d0> arrayList;
            AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.m512h(12) && childViewHolderInt.m520p() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f992b == null) {
                    this.f992b = new ArrayList<>();
                }
                childViewHolderInt.f940n = this;
                childViewHolderInt.f941o = true;
                arrayList = this.f992b;
            } else {
                if (childViewHolderInt.m515k() && !childViewHolderInt.m517m() && !RecyclerView.this.mAdapter.f948b) {
                    throw new IllegalArgumentException(a.m2197k(RecyclerView.this, a.m2191e("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
                }
                childViewHolderInt.f940n = this;
                childViewHolderInt.f941o = false;
                arrayList = this.f991a;
            }
            arrayList.add(childViewHolderInt);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:113:0x0201  */
        /* JADX WARN: Code duplicated, block: B:116:0x0206 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:117:0x0208  */
        /* JADX WARN: Code duplicated, block: B:119:0x0212  */
        /* JADX WARN: Code duplicated, block: B:120:0x021f  */
        /* JADX WARN: Code duplicated, block: B:122:0x0225  */
        /* JADX WARN: Code duplicated, block: B:125:0x022d  */
        /* JADX WARN: Code duplicated, block: B:130:0x024b  */
        /* JADX WARN: Code duplicated, block: B:224:0x041f  */
        /* JADX WARN: Code duplicated, block: B:230:0x0443  */
        /* JADX WARN: Code duplicated, block: B:232:0x0449  */
        /* JADX WARN: Code duplicated, block: B:234:0x044e  */
        /* JADX WARN: Code duplicated, block: B:235:0x0450  */
        /* JADX WARN: Code duplicated, block: B:237:0x0453  */
        /* JADX WARN: Code duplicated, block: B:239:0x0459  */
        /* JADX WARN: Code duplicated, block: B:241:0x0474  */
        /* JADX WARN: Code duplicated, block: B:243:0x0482  */
        /* JADX WARN: Code duplicated, block: B:247:0x048a  */
        /* JADX WARN: Code duplicated, block: B:249:0x048d  */
        /* JADX WARN: Code duplicated, block: B:252:0x049d  */
        /* JADX WARN: Code duplicated, block: B:255:0x04b8  */
        /* JADX WARN: Code duplicated, block: B:258:0x04cb  */
        /* JADX WARN: Code duplicated, block: B:261:0x04f2  */
        /* JADX WARN: Code duplicated, block: B:263:0x04fd  */
        /* JADX WARN: Code duplicated, block: B:267:0x0507  */
        /* JADX WARN: Code duplicated, block: B:269:0x050f  */
        /* JADX WARN: Code duplicated, block: B:271:0x051b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:276:0x052d  */
        /* JADX WARN: Code duplicated, block: B:280:0x0538  */
        /* JADX WARN: Code duplicated, block: B:281:0x053f  */
        /* JADX WARN: Code duplicated, block: B:283:0x0547  */
        /* JADX WARN: Code duplicated, block: B:285:0x0555  */
        /* JADX WARN: Code duplicated, block: B:288:0x055b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:302:0x00c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:308:0x0101 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:312:0x01b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:314:0x01b6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0086 A[EDGE_INSN: B:35:0x0086->B:36:0x0087 BREAK  A[LOOP:0: B:14:0x0028->B:20:0x0042]] */
        /* JADX WARN: Code duplicated, block: B:42:0x0090  */
        /* JADX WARN: Code duplicated, block: B:44:0x0099  */
        /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:69:0x0104  */
        /* JADX WARN: Code duplicated, block: B:71:0x0118  */
        /* JADX WARN: Code duplicated, block: B:73:0x0120  */
        /* JADX WARN: Code duplicated, block: B:75:0x0132 A[EDGE_INSN: B:75:0x0132->B:95:0x01ba BREAK  A[LOOP:1: B:43:0x0097->B:55:0x00c6]] */
        /* JADX WARN: Code duplicated, block: B:76:0x0143  */
        /* JADX WARN: Code duplicated, block: B:78:0x015c  */
        /* JADX WARN: Code duplicated, block: B:80:0x0173  */
        /* JADX WARN: Code duplicated, block: B:82:0x018a  */
        /* JADX WARN: Code duplicated, block: B:84:0x0193  */
        /* JADX WARN: Code duplicated, block: B:86:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:96:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:98:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:99:0x01c9  */
        /* JADX WARN: Instruction removed from duplicated block: B:78:0x015c, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:80:0x0173, please report this as an issue */
        /* JADX INFO: renamed from: k */
        public AbstractC0129d0 m648k(int i, boolean z, long j) {
            AbstractC0129d0 childViewHolderInt;
            boolean z2;
            int iM1988f;
            int i2;
            AbstractC0132g abstractC0132g;
            List<Object> list;
            ViewGroup.LayoutParams layoutParams;
            View view;
            C0558u c0558u;
            C0406a c0406aMo1943j;
            C0558u.a aVar;
            C0406a c0406aM1563f;
            long j2;
            boolean z3;
            boolean z4;
            boolean z5;
            ViewGroup.LayoutParams layoutParams2;
            C0141p c0141p;
            ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
            int iM1988f2;
            RecyclerView recyclerViewFindNestedRecyclerView;
            AbstractC0129d0 abstractC0129d0Remove;
            int size;
            int i3;
            int size2;
            int i4;
            AbstractC0129d0 abstractC0129d0;
            C0539b c0539b;
            int size3;
            int i5;
            View view2;
            C0539b c0539b2;
            int iIndexOfChild;
            int iM2005j;
            AbstractC0129d0 childViewHolderInt2;
            int i6;
            boolean z6;
            int size4;
            int iM1988f3;
            if (i < 0 || i >= RecyclerView.this.mState.m501b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid item position ");
                sb.append(i);
                sb.append("(");
                sb.append(i);
                sb.append("). Item count:");
                sb.append(RecyclerView.this.mState.m501b());
                throw new IndexOutOfBoundsException(a.m2197k(RecyclerView.this, sb));
            }
            boolean z7 = false;
            if (RecyclerView.this.mState.f909g) {
                ArrayList<AbstractC0129d0> arrayList = this.f992b;
                if (arrayList != null && (size4 = arrayList.size()) != 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            RecyclerView recyclerView = RecyclerView.this;
                            if (recyclerView.mAdapter.f948b && (iM1988f3 = recyclerView.mAdapterHelper.m1988f(i, 0)) > 0 && iM1988f3 < RecyclerView.this.mAdapter.mo533a()) {
                                long jMo534b = RecyclerView.this.mAdapter.mo534b(iM1988f3);
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size4) {
                                        childViewHolderInt = null;
                                        break;
                                    }
                                    AbstractC0129d0 abstractC0129d1 = this.f992b.get(i8);
                                    if (!abstractC0129d1.m526v() && abstractC0129d1.f931e == jMo534b) {
                                        abstractC0129d1.m506b(32);
                                        childViewHolderInt = abstractC0129d1;
                                        break;
                                    }
                                    i8++;
                                }
                            } else {
                                childViewHolderInt = null;
                                break;
                            }
                        } else {
                            childViewHolderInt = this.f992b.get(i7);
                            if (!childViewHolderInt.m526v() && childViewHolderInt.m510f() == i) {
                                childViewHolderInt.m506b(32);
                                break;
                            }
                            i7++;
                        }
                    }
                } else {
                    childViewHolderInt = null;
                    break;
                }
                z2 = childViewHolderInt != null;
                if (childViewHolderInt == null) {
                    size = this.f991a.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            if (z) {
                                c0539b = RecyclerView.this.mChildHelper;
                                size3 = c0539b.f3318c.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size3) {
                                        view2 = null;
                                        break;
                                    }
                                    view2 = c0539b.f3318c.get(i5);
                                    Objects.requireNonNull((C0130e) c0539b.f3316a);
                                    childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                                    if (childViewHolderInt2.m510f() != i && !childViewHolderInt2.m515k() && !childViewHolderInt2.m517m()) {
                                        break;
                                    }
                                    i5++;
                                }
                                if (view2 != null) {
                                    size2 = this.f993c.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size2) {
                                            childViewHolderInt = null;
                                            break;
                                        }
                                        abstractC0129d0 = this.f993c.get(i4);
                                        if (!abstractC0129d0.m515k() || abstractC0129d0.m510f() != i || abstractC0129d0.m513i()) {
                                            i4++;
                                        } else if (!z) {
                                            this.f993c.remove(i4);
                                        }
                                    }
                                } else {
                                    childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                                    c0539b2 = RecyclerView.this.mChildHelper;
                                    iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                                    if (iIndexOfChild >= 0) {
                                        throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                    }
                                    if (c0539b2.f3317b.m2011d(iIndexOfChild)) {
                                        throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                    }
                                    c0539b2.f3317b.m2008a(iIndexOfChild);
                                    c0539b2.m2007l(view2);
                                    iM2005j = RecyclerView.this.mChildHelper.m2005j(view2);
                                    if (iM2005j != -1) {
                                        RecyclerView.this.mChildHelper.m1998c(iM2005j);
                                        m647j(view2);
                                        childViewHolderInt.m506b(8224);
                                        break;
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("layout index should not be -1 after unhiding a view:");
                                    sb2.append(childViewHolderInt);
                                    throw new IllegalStateException(a.m2197k(RecyclerView.this, sb2));
                                }
                            } else {
                                size2 = this.f993c.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        childViewHolderInt = null;
                                        break;
                                    }
                                    abstractC0129d0 = this.f993c.get(i4);
                                    if (!abstractC0129d0.m515k()) {
                                    }
                                    i4++;
                                }
                            }
                        } else {
                            abstractC0129d0 = this.f991a.get(i3);
                            if (!abstractC0129d0.m526v() || abstractC0129d0.m510f() != i || abstractC0129d0.m515k() || (!RecyclerView.this.mState.f909g && abstractC0129d0.m517m())) {
                                i3++;
                            } else {
                                abstractC0129d0.m506b(32);
                            }
                        }
                        childViewHolderInt = abstractC0129d0;
                        break;
                    }
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.m517m()) {
                            z6 = RecyclerView.this.mState.f909g;
                        } else {
                            i6 = childViewHolderInt.f929c;
                            if (i6 >= 0 || i6 >= RecyclerView.this.mAdapter.mo533a()) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Inconsistency detected. Invalid view holder adapter position");
                                sb3.append(childViewHolderInt);
                                throw new IndexOutOfBoundsException(a.m2197k(RecyclerView.this, sb3));
                            }
                            RecyclerView recyclerView2 = RecyclerView.this;
                            if (recyclerView2.mState.f909g || recyclerView2.mAdapter.mo535c(childViewHolderInt.f929c) == childViewHolderInt.f932f) {
                                AbstractC0132g abstractC0132g2 = RecyclerView.this.mAdapter;
                                if (!abstractC0132g2.f948b || childViewHolderInt.f931e == abstractC0132g2.mo534b(childViewHolderInt.f929c)) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                z6 = false;
                            }
                        }
                        if (z6) {
                            z2 = true;
                        } else {
                            if (!z) {
                                childViewHolderInt.m506b(4);
                                if (childViewHolderInt.m518n()) {
                                    RecyclerView.this.removeDetachedView(childViewHolderInt.f927a, false);
                                    childViewHolderInt.f940n.m649l(childViewHolderInt);
                                } else if (childViewHolderInt.m526v()) {
                                    childViewHolderInt.m508d();
                                }
                                m646i(childViewHolderInt);
                            }
                            childViewHolderInt = null;
                        }
                    }
                }
                if (childViewHolderInt == null) {
                    iM1988f2 = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                    if (iM1988f2 >= 0 || iM1988f2 >= RecyclerView.this.mAdapter.mo533a()) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Inconsistency detected. Invalid item position ");
                        sb4.append(i);
                        sb4.append("(offset:");
                        sb4.append(iM1988f2);
                        sb4.append(").state:");
                        sb4.append(RecyclerView.this.mState.m501b());
                        throw new IndexOutOfBoundsException(a.m2197k(RecyclerView.this, sb4));
                    }
                    int iMo535c = RecyclerView.this.mAdapter.mo535c(iM1988f2);
                    AbstractC0132g abstractC0132g3 = RecyclerView.this.mAdapter;
                    if (abstractC0132g3.f948b) {
                        long jMo534b2 = abstractC0132g3.mo534b(iM1988f2);
                        int size5 = this.f991a.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = this.f993c.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        childViewHolderInt = this.f993c.get(size6);
                                        if (childViewHolderInt.f931e == jMo534b2 && !childViewHolderInt.m513i()) {
                                            if (iMo535c == childViewHolderInt.f932f) {
                                                if (!z) {
                                                    this.f993c.remove(size6);
                                                    break;
                                                }
                                                break;
                                            }
                                            if (!z) {
                                                m644g(size6);
                                            }
                                        }
                                        size6--;
                                    }
                                    childViewHolderInt = null;
                                    break;
                                }
                            }
                            AbstractC0129d0 abstractC0129d2 = this.f991a.get(size5);
                            if (abstractC0129d2.f931e == jMo534b2 && !abstractC0129d2.m526v()) {
                                if (iMo535c == abstractC0129d2.f932f) {
                                    abstractC0129d2.m506b(32);
                                    if (abstractC0129d2.m517m() && !RecyclerView.this.mState.f909g) {
                                        abstractC0129d2.m523s(2, 14);
                                    }
                                    childViewHolderInt = abstractC0129d2;
                                    break;
                                }
                                if (!z) {
                                    this.f991a.remove(size5);
                                    RecyclerView.this.removeDetachedView(abstractC0129d2.f927a, false);
                                    AbstractC0129d0 childViewHolderInt3 = RecyclerView.getChildViewHolderInt(abstractC0129d2.f927a);
                                    childViewHolderInt3.f940n = null;
                                    childViewHolderInt3.f941o = false;
                                    childViewHolderInt3.m508d();
                                    m646i(childViewHolderInt3);
                                }
                            }
                            size5--;
                        }
                        if (childViewHolderInt != null) {
                            childViewHolderInt.f929c = iM1988f2;
                            z2 = true;
                        }
                    }
                    if (childViewHolderInt == null) {
                        C0146u.a aVar2 = m641d().f985a.get(iMo535c);
                        if (aVar2 != null && !aVar2.f987a.isEmpty()) {
                            ArrayList<AbstractC0129d0> arrayList2 = aVar2.f987a;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    abstractC0129d0Remove = null;
                                    break;
                                }
                                if (!arrayList2.get(size7).m513i()) {
                                    abstractC0129d0Remove = arrayList2.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            abstractC0129d0Remove = null;
                            break;
                        }
                        if (abstractC0129d0Remove != null) {
                            abstractC0129d0Remove.m522r();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view3 = abstractC0129d0Remove.f927a;
                                if (view3 instanceof ViewGroup) {
                                    m642e((ViewGroup) view3, false);
                                }
                            }
                        }
                        childViewHolderInt = abstractC0129d0Remove;
                    }
                    if (childViewHolderInt == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j != RecyclerView.FOREVER_NS) {
                            long j3 = this.f997g.m636a(iMo535c).f989c;
                            if (!(j3 == 0 || j3 + nanoTime < j)) {
                                return null;
                            }
                        }
                        RecyclerView recyclerView3 = RecyclerView.this;
                        AbstractC0132g abstractC0132g4 = recyclerView3.mAdapter;
                        Objects.requireNonNull(abstractC0132g4);
                        try {
                            Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                            AbstractC0129d0 abstractC0129d0Mo538f = abstractC0132g4.mo538f(recyclerView3, iMo535c);
                            if (abstractC0129d0Mo538f.f927a.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            abstractC0129d0Mo538f.f932f = iMo535c;
                            Trace.endSection();
                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(abstractC0129d0Mo538f.f927a)) != null) {
                                abstractC0129d0Mo538f.f928b = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                            }
                            long nanoTime2 = RecyclerView.this.getNanoTime();
                            C0146u c0146u = this.f997g;
                            long j4 = nanoTime2 - nanoTime;
                            C0146u.a aVarM636a = c0146u.m636a(iMo535c);
                            aVarM636a.f989c = c0146u.m637b(aVarM636a.f989c, j4);
                            childViewHolderInt = abstractC0129d0Mo538f;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
                if (z2 && !RecyclerView.this.mState.f909g && childViewHolderInt.m512h(8192)) {
                    childViewHolderInt.m523s(0, 8192);
                    if (RecyclerView.this.mState.f912j) {
                        AbstractC0137l.m548b(childViewHolderInt);
                        AbstractC0137l abstractC0137l = RecyclerView.this.mItemAnimator;
                        childViewHolderInt.m511g();
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, abstractC0137l.m555h(childViewHolderInt));
                    }
                }
                if (RecyclerView.this.mState.f909g || !childViewHolderInt.m514j()) {
                    if (childViewHolderInt.m514j()) {
                        if ((childViewHolderInt.f936j & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 || childViewHolderInt.m515k()) {
                            iM1988f = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                            RecyclerView recyclerView4 = RecyclerView.this;
                            childViewHolderInt.f944r = recyclerView4;
                            i2 = childViewHolderInt.f932f;
                            long nanoTime3 = recyclerView4.getNanoTime();
                            if (j != RecyclerView.FOREVER_NS) {
                                j2 = this.f997g.m636a(i2).f990d;
                                if (j2 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                }
                            }
                            abstractC0132g = RecyclerView.this.mAdapter;
                            Objects.requireNonNull(abstractC0132g);
                            childViewHolderInt.f929c = iM1988f;
                            if (abstractC0132g.f948b) {
                                childViewHolderInt.f931e = abstractC0132g.mo534b(iM1988f);
                            }
                            childViewHolderInt.m523s(1, 519);
                            Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                            childViewHolderInt.m511g();
                            abstractC0132g.mo537e(childViewHolderInt, iM1988f);
                            list = childViewHolderInt.f937k;
                            if (list != null) {
                                list.clear();
                            }
                            childViewHolderInt.f936j &= -1025;
                            layoutParams = childViewHolderInt.f927a.getLayoutParams();
                            if (layoutParams instanceof C0141p) {
                                ((C0141p) layoutParams).f983c = true;
                            }
                            Trace.endSection();
                            long nanoTime4 = RecyclerView.this.getNanoTime();
                            C0146u c0146u2 = this.f997g;
                            long j5 = nanoTime4 - nanoTime3;
                            C0146u.a aVarM636a2 = c0146u2.m636a(childViewHolderInt.f932f);
                            aVarM636a2.f990d = c0146u2.m637b(aVarM636a2.f990d, j5);
                            if (RecyclerView.this.isAccessibilityEnabled()) {
                                view = childViewHolderInt.f927a;
                                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                                if (view.getImportantForAccessibility() == 0) {
                                    view.setImportantForAccessibility(1);
                                }
                                c0558u = RecyclerView.this.mAccessibilityDelegate;
                                if (c0558u != null) {
                                    c0406aMo1943j = c0558u.mo1943j();
                                    if (c0406aMo1943j instanceof C0558u.a) {
                                        aVar = (C0558u.a) c0406aMo1943j;
                                        Objects.requireNonNull(aVar);
                                        c0406aM1563f = C0418m.m1563f(view);
                                        if (c0406aM1563f != null) {
                                            aVar.f3449e.put(view, c0406aM1563f);
                                        }
                                    }
                                    C0418m.m1577t(view, c0406aMo1943j);
                                }
                            }
                            if (RecyclerView.this.mState.f909g) {
                                childViewHolderInt.f933g = i;
                            }
                        }
                    } else {
                        iM1988f = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                        RecyclerView recyclerView5 = RecyclerView.this;
                        childViewHolderInt.f944r = recyclerView5;
                        i2 = childViewHolderInt.f932f;
                        long nanoTime5 = recyclerView5.getNanoTime();
                        if (j != RecyclerView.FOREVER_NS) {
                            j2 = this.f997g.m636a(i2).f990d;
                            if (j2 != 0 || j2 + nanoTime5 < j) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                            }
                        }
                        abstractC0132g = RecyclerView.this.mAdapter;
                        Objects.requireNonNull(abstractC0132g);
                        childViewHolderInt.f929c = iM1988f;
                        if (abstractC0132g.f948b) {
                            childViewHolderInt.f931e = abstractC0132g.mo534b(iM1988f);
                        }
                        childViewHolderInt.m523s(1, 519);
                        Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                        childViewHolderInt.m511g();
                        abstractC0132g.mo537e(childViewHolderInt, iM1988f);
                        list = childViewHolderInt.f937k;
                        if (list != null) {
                            list.clear();
                        }
                        childViewHolderInt.f936j &= -1025;
                        layoutParams = childViewHolderInt.f927a.getLayoutParams();
                        if (layoutParams instanceof C0141p) {
                            ((C0141p) layoutParams).f983c = true;
                        }
                        Trace.endSection();
                        long nanoTime6 = RecyclerView.this.getNanoTime();
                        C0146u c0146u3 = this.f997g;
                        long j6 = nanoTime6 - nanoTime5;
                        C0146u.a aVarM636a3 = c0146u3.m636a(childViewHolderInt.f932f);
                        aVarM636a3.f990d = c0146u3.m637b(aVarM636a3.f990d, j6);
                        if (RecyclerView.this.isAccessibilityEnabled()) {
                            view = childViewHolderInt.f927a;
                            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            c0558u = RecyclerView.this.mAccessibilityDelegate;
                            if (c0558u != null) {
                                c0406aMo1943j = c0558u.mo1943j();
                                if (c0406aMo1943j instanceof C0558u.a) {
                                    aVar = (C0558u.a) c0406aMo1943j;
                                    Objects.requireNonNull(aVar);
                                    c0406aM1563f = C0418m.m1563f(view);
                                    if (c0406aM1563f != null && c0406aM1563f != aVar) {
                                        aVar.f3449e.put(view, c0406aM1563f);
                                    }
                                }
                                C0418m.m1577t(view, c0406aMo1943j);
                            }
                        }
                        if (RecyclerView.this.mState.f909g) {
                            childViewHolderInt.f933g = i;
                        }
                    }
                    layoutParams2 = childViewHolderInt.f927a.getLayoutParams();
                    if (layoutParams2 != null) {
                        if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                            c0141p = (C0141p) layoutParams2;
                        } else {
                            layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams2);
                        }
                        c0141p.f981a = childViewHolderInt;
                        if (z2 && z5) {
                            z7 = true;
                        }
                        c0141p.f984d = z7;
                        return childViewHolderInt;
                    }
                    layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                    c0141p = (C0141p) layoutParamsGenerateLayoutParams;
                    childViewHolderInt.f927a.setLayoutParams(c0141p);
                    c0141p.f981a = childViewHolderInt;
                    if (z2) {
                        z7 = true;
                    }
                    c0141p.f984d = z7;
                    return childViewHolderInt;
                }
                childViewHolderInt.f933g = i;
                layoutParams2 = childViewHolderInt.f927a.getLayoutParams();
                if (layoutParams2 != null) {
                    if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                        layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams2);
                    } else {
                        c0141p = (C0141p) layoutParams2;
                    }
                    c0141p.f981a = childViewHolderInt;
                    if (z2) {
                        z7 = true;
                    }
                    c0141p.f984d = z7;
                    return childViewHolderInt;
                }
                layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                c0141p = (C0141p) layoutParamsGenerateLayoutParams;
                childViewHolderInt.f927a.setLayoutParams(c0141p);
                c0141p.f981a = childViewHolderInt;
                if (z2) {
                    z7 = true;
                }
                c0141p.f984d = z7;
                return childViewHolderInt;
            }
            childViewHolderInt = null;
            if (childViewHolderInt == null) {
                size = this.f991a.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        abstractC0129d0 = this.f991a.get(i3);
                        if (abstractC0129d0.m526v()) {
                        }
                        i3++;
                    } else {
                        if (z) {
                            size2 = this.f993c.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    childViewHolderInt = null;
                                    break;
                                }
                                abstractC0129d0 = this.f993c.get(i4);
                                if (!abstractC0129d0.m515k()) {
                                }
                                i4++;
                            }
                        } else {
                            c0539b = RecyclerView.this.mChildHelper;
                            size3 = c0539b.f3318c.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size3) {
                                    view2 = null;
                                    break;
                                }
                                view2 = c0539b.f3318c.get(i5);
                                Objects.requireNonNull((C0130e) c0539b.f3316a);
                                childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                                if (childViewHolderInt2.m510f() != i) {
                                }
                                i5++;
                            }
                            if (view2 != null) {
                                size2 = this.f993c.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        childViewHolderInt = null;
                                        break;
                                    }
                                    abstractC0129d0 = this.f993c.get(i4);
                                    if (!abstractC0129d0.m515k()) {
                                    }
                                    i4++;
                                }
                            } else {
                                childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                                c0539b2 = RecyclerView.this.mChildHelper;
                                iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                                if (iIndexOfChild >= 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                }
                                if (c0539b2.f3317b.m2011d(iIndexOfChild)) {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                }
                                c0539b2.f3317b.m2008a(iIndexOfChild);
                                c0539b2.m2007l(view2);
                                iM2005j = RecyclerView.this.mChildHelper.m2005j(view2);
                                if (iM2005j != -1) {
                                    RecyclerView.this.mChildHelper.m1998c(iM2005j);
                                    m647j(view2);
                                    childViewHolderInt.m506b(8224);
                                    break;
                                }
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("layout index should not be -1 after unhiding a view:");
                                sb5.append(childViewHolderInt);
                                throw new IllegalStateException(a.m2197k(RecyclerView.this, sb5));
                            }
                        }
                        if (childViewHolderInt != null) {
                            if (childViewHolderInt.m517m()) {
                                i6 = childViewHolderInt.f929c;
                                if (i6 >= 0) {
                                }
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Inconsistency detected. Invalid view holder adapter position");
                                sb6.append(childViewHolderInt);
                                throw new IndexOutOfBoundsException(a.m2197k(RecyclerView.this, sb6));
                            }
                            z6 = RecyclerView.this.mState.f909g;
                            if (z6) {
                                if (!z) {
                                    childViewHolderInt.m506b(4);
                                    if (childViewHolderInt.m518n()) {
                                        RecyclerView.this.removeDetachedView(childViewHolderInt.f927a, false);
                                        childViewHolderInt.f940n.m649l(childViewHolderInt);
                                    } else if (childViewHolderInt.m526v()) {
                                        childViewHolderInt.m508d();
                                    }
                                    m646i(childViewHolderInt);
                                }
                                childViewHolderInt = null;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    childViewHolderInt = abstractC0129d0;
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.m517m()) {
                            i6 = childViewHolderInt.f929c;
                            if (i6 >= 0) {
                            }
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Inconsistency detected. Invalid view holder adapter position");
                            sb7.append(childViewHolderInt);
                            throw new IndexOutOfBoundsException(a.m2197k(RecyclerView.this, sb7));
                        }
                        z6 = RecyclerView.this.mState.f909g;
                        if (z6) {
                            if (!z) {
                                childViewHolderInt.m506b(4);
                                if (childViewHolderInt.m518n()) {
                                    RecyclerView.this.removeDetachedView(childViewHolderInt.f927a, false);
                                    childViewHolderInt.f940n.m649l(childViewHolderInt);
                                } else if (childViewHolderInt.m526v()) {
                                    childViewHolderInt.m508d();
                                }
                                m646i(childViewHolderInt);
                            }
                            childViewHolderInt = null;
                        } else {
                            z2 = true;
                        }
                    }
                }
            }
            if (childViewHolderInt == null) {
                iM1988f2 = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                if (iM1988f2 >= 0) {
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Inconsistency detected. Invalid item position ");
                sb8.append(i);
                sb8.append("(offset:");
                sb8.append(iM1988f2);
                sb8.append(").state:");
                sb8.append(RecyclerView.this.mState.m501b());
                throw new IndexOutOfBoundsException(a.m2197k(RecyclerView.this, sb8));
            }
            if (z2) {
                childViewHolderInt.m523s(0, 8192);
                if (RecyclerView.this.mState.f912j) {
                    AbstractC0137l.m548b(childViewHolderInt);
                    AbstractC0137l abstractC0137l2 = RecyclerView.this.mItemAnimator;
                    childViewHolderInt.m511g();
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, abstractC0137l2.m555h(childViewHolderInt));
                }
            }
            if (RecyclerView.this.mState.f909g) {
                if (childViewHolderInt.m514j()) {
                    iM1988f = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                    RecyclerView recyclerView6 = RecyclerView.this;
                    childViewHolderInt.f944r = recyclerView6;
                    i2 = childViewHolderInt.f932f;
                    long nanoTime7 = recyclerView6.getNanoTime();
                    if (j != RecyclerView.FOREVER_NS) {
                        j2 = this.f997g.m636a(i2).f990d;
                        if (j2 != 0) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        z5 = z3;
                    }
                    abstractC0132g = RecyclerView.this.mAdapter;
                    Objects.requireNonNull(abstractC0132g);
                    childViewHolderInt.f929c = iM1988f;
                    if (abstractC0132g.f948b) {
                        childViewHolderInt.f931e = abstractC0132g.mo534b(iM1988f);
                    }
                    childViewHolderInt.m523s(1, 519);
                    Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                    childViewHolderInt.m511g();
                    abstractC0132g.mo537e(childViewHolderInt, iM1988f);
                    list = childViewHolderInt.f937k;
                    if (list != null) {
                        list.clear();
                    }
                    childViewHolderInt.f936j &= -1025;
                    layoutParams = childViewHolderInt.f927a.getLayoutParams();
                    if (layoutParams instanceof C0141p) {
                        ((C0141p) layoutParams).f983c = true;
                    }
                    Trace.endSection();
                    long nanoTime8 = RecyclerView.this.getNanoTime();
                    C0146u c0146u4 = this.f997g;
                    long j7 = nanoTime8 - nanoTime7;
                    C0146u.a aVarM636a4 = c0146u4.m636a(childViewHolderInt.f932f);
                    aVarM636a4.f990d = c0146u4.m637b(aVarM636a4.f990d, j7);
                    if (RecyclerView.this.isAccessibilityEnabled()) {
                        view = childViewHolderInt.f927a;
                        WeakHashMap<View, String> weakHashMap3 = C0418m.f2718a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        c0558u = RecyclerView.this.mAccessibilityDelegate;
                        if (c0558u != null) {
                            c0406aMo1943j = c0558u.mo1943j();
                            if (c0406aMo1943j instanceof C0558u.a) {
                                aVar = (C0558u.a) c0406aMo1943j;
                                Objects.requireNonNull(aVar);
                                c0406aM1563f = C0418m.m1563f(view);
                                if (c0406aM1563f != null) {
                                    aVar.f3449e.put(view, c0406aM1563f);
                                }
                            }
                            C0418m.m1577t(view, c0406aMo1943j);
                        }
                    }
                    if (RecyclerView.this.mState.f909g) {
                        childViewHolderInt.f933g = i;
                    }
                } else {
                    if ((childViewHolderInt.f936j & 2) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        iM1988f = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                        RecyclerView recyclerView7 = RecyclerView.this;
                        childViewHolderInt.f944r = recyclerView7;
                        i2 = childViewHolderInt.f932f;
                        long nanoTime9 = recyclerView7.getNanoTime();
                        if (j != RecyclerView.FOREVER_NS) {
                            j2 = this.f997g.m636a(i2).f990d;
                            if (j2 != 0) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                            }
                        }
                        abstractC0132g = RecyclerView.this.mAdapter;
                        Objects.requireNonNull(abstractC0132g);
                        childViewHolderInt.f929c = iM1988f;
                        if (abstractC0132g.f948b) {
                            childViewHolderInt.f931e = abstractC0132g.mo534b(iM1988f);
                        }
                        childViewHolderInt.m523s(1, 519);
                        Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                        childViewHolderInt.m511g();
                        abstractC0132g.mo537e(childViewHolderInt, iM1988f);
                        list = childViewHolderInt.f937k;
                        if (list != null) {
                            list.clear();
                        }
                        childViewHolderInt.f936j &= -1025;
                        layoutParams = childViewHolderInt.f927a.getLayoutParams();
                        if (layoutParams instanceof C0141p) {
                            ((C0141p) layoutParams).f983c = true;
                        }
                        Trace.endSection();
                        long nanoTime10 = RecyclerView.this.getNanoTime();
                        C0146u c0146u5 = this.f997g;
                        long j8 = nanoTime10 - nanoTime9;
                        C0146u.a aVarM636a5 = c0146u5.m636a(childViewHolderInt.f932f);
                        aVarM636a5.f990d = c0146u5.m637b(aVarM636a5.f990d, j8);
                        if (RecyclerView.this.isAccessibilityEnabled()) {
                            view = childViewHolderInt.f927a;
                            WeakHashMap<View, String> weakHashMap4 = C0418m.f2718a;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            c0558u = RecyclerView.this.mAccessibilityDelegate;
                            if (c0558u != null) {
                                c0406aMo1943j = c0558u.mo1943j();
                                if (c0406aMo1943j instanceof C0558u.a) {
                                    aVar = (C0558u.a) c0406aMo1943j;
                                    Objects.requireNonNull(aVar);
                                    c0406aM1563f = C0418m.m1563f(view);
                                    if (c0406aM1563f != null) {
                                        aVar.f3449e.put(view, c0406aM1563f);
                                    }
                                }
                                C0418m.m1577t(view, c0406aMo1943j);
                            }
                        }
                        if (RecyclerView.this.mState.f909g) {
                            childViewHolderInt.f933g = i;
                        }
                    } else {
                        iM1988f = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                        RecyclerView recyclerView8 = RecyclerView.this;
                        childViewHolderInt.f944r = recyclerView8;
                        i2 = childViewHolderInt.f932f;
                        long nanoTime11 = recyclerView8.getNanoTime();
                        if (j != RecyclerView.FOREVER_NS) {
                            j2 = this.f997g.m636a(i2).f990d;
                            if (j2 != 0) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                            }
                        }
                        abstractC0132g = RecyclerView.this.mAdapter;
                        Objects.requireNonNull(abstractC0132g);
                        childViewHolderInt.f929c = iM1988f;
                        if (abstractC0132g.f948b) {
                            childViewHolderInt.f931e = abstractC0132g.mo534b(iM1988f);
                        }
                        childViewHolderInt.m523s(1, 519);
                        Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                        childViewHolderInt.m511g();
                        abstractC0132g.mo537e(childViewHolderInt, iM1988f);
                        list = childViewHolderInt.f937k;
                        if (list != null) {
                            list.clear();
                        }
                        childViewHolderInt.f936j &= -1025;
                        layoutParams = childViewHolderInt.f927a.getLayoutParams();
                        if (layoutParams instanceof C0141p) {
                            ((C0141p) layoutParams).f983c = true;
                        }
                        Trace.endSection();
                        long nanoTime12 = RecyclerView.this.getNanoTime();
                        C0146u c0146u6 = this.f997g;
                        long j9 = nanoTime12 - nanoTime11;
                        C0146u.a aVarM636a6 = c0146u6.m636a(childViewHolderInt.f932f);
                        aVarM636a6.f990d = c0146u6.m637b(aVarM636a6.f990d, j9);
                        if (RecyclerView.this.isAccessibilityEnabled()) {
                            view = childViewHolderInt.f927a;
                            WeakHashMap<View, String> weakHashMap5 = C0418m.f2718a;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            c0558u = RecyclerView.this.mAccessibilityDelegate;
                            if (c0558u != null) {
                                c0406aMo1943j = c0558u.mo1943j();
                                if (c0406aMo1943j instanceof C0558u.a) {
                                    aVar = (C0558u.a) c0406aMo1943j;
                                    Objects.requireNonNull(aVar);
                                    c0406aM1563f = C0418m.m1563f(view);
                                    if (c0406aM1563f != null) {
                                        aVar.f3449e.put(view, c0406aM1563f);
                                    }
                                }
                                C0418m.m1577t(view, c0406aMo1943j);
                            }
                        }
                        if (RecyclerView.this.mState.f909g) {
                            childViewHolderInt.f933g = i;
                        }
                    }
                }
            } else if (childViewHolderInt.m514j()) {
                iM1988f = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                RecyclerView recyclerView9 = RecyclerView.this;
                childViewHolderInt.f944r = recyclerView9;
                i2 = childViewHolderInt.f932f;
                long nanoTime13 = recyclerView9.getNanoTime();
                if (j != RecyclerView.FOREVER_NS) {
                    j2 = this.f997g.m636a(i2).f990d;
                    if (j2 != 0) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                    }
                }
                abstractC0132g = RecyclerView.this.mAdapter;
                Objects.requireNonNull(abstractC0132g);
                childViewHolderInt.f929c = iM1988f;
                if (abstractC0132g.f948b) {
                    childViewHolderInt.f931e = abstractC0132g.mo534b(iM1988f);
                }
                childViewHolderInt.m523s(1, 519);
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                childViewHolderInt.m511g();
                abstractC0132g.mo537e(childViewHolderInt, iM1988f);
                list = childViewHolderInt.f937k;
                if (list != null) {
                    list.clear();
                }
                childViewHolderInt.f936j &= -1025;
                layoutParams = childViewHolderInt.f927a.getLayoutParams();
                if (layoutParams instanceof C0141p) {
                    ((C0141p) layoutParams).f983c = true;
                }
                Trace.endSection();
                long nanoTime14 = RecyclerView.this.getNanoTime();
                C0146u c0146u7 = this.f997g;
                long j10 = nanoTime14 - nanoTime13;
                C0146u.a aVarM636a7 = c0146u7.m636a(childViewHolderInt.f932f);
                aVarM636a7.f990d = c0146u7.m637b(aVarM636a7.f990d, j10);
                if (RecyclerView.this.isAccessibilityEnabled()) {
                    view = childViewHolderInt.f927a;
                    WeakHashMap<View, String> weakHashMap6 = C0418m.f2718a;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c0558u = RecyclerView.this.mAccessibilityDelegate;
                    if (c0558u != null) {
                        c0406aMo1943j = c0558u.mo1943j();
                        if (c0406aMo1943j instanceof C0558u.a) {
                            aVar = (C0558u.a) c0406aMo1943j;
                            Objects.requireNonNull(aVar);
                            c0406aM1563f = C0418m.m1563f(view);
                            if (c0406aM1563f != null) {
                                aVar.f3449e.put(view, c0406aM1563f);
                            }
                        }
                        C0418m.m1577t(view, c0406aMo1943j);
                    }
                }
                if (RecyclerView.this.mState.f909g) {
                    childViewHolderInt.f933g = i;
                }
            } else {
                if ((childViewHolderInt.f936j & 2) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    iM1988f = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                    RecyclerView recyclerView10 = RecyclerView.this;
                    childViewHolderInt.f944r = recyclerView10;
                    i2 = childViewHolderInt.f932f;
                    long nanoTime15 = recyclerView10.getNanoTime();
                    if (j != RecyclerView.FOREVER_NS) {
                        j2 = this.f997g.m636a(i2).f990d;
                        if (j2 != 0) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                        }
                    }
                    abstractC0132g = RecyclerView.this.mAdapter;
                    Objects.requireNonNull(abstractC0132g);
                    childViewHolderInt.f929c = iM1988f;
                    if (abstractC0132g.f948b) {
                        childViewHolderInt.f931e = abstractC0132g.mo534b(iM1988f);
                    }
                    childViewHolderInt.m523s(1, 519);
                    Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                    childViewHolderInt.m511g();
                    abstractC0132g.mo537e(childViewHolderInt, iM1988f);
                    list = childViewHolderInt.f937k;
                    if (list != null) {
                        list.clear();
                    }
                    childViewHolderInt.f936j &= -1025;
                    layoutParams = childViewHolderInt.f927a.getLayoutParams();
                    if (layoutParams instanceof C0141p) {
                        ((C0141p) layoutParams).f983c = true;
                    }
                    Trace.endSection();
                    long nanoTime16 = RecyclerView.this.getNanoTime();
                    C0146u c0146u8 = this.f997g;
                    long j11 = nanoTime16 - nanoTime15;
                    C0146u.a aVarM636a8 = c0146u8.m636a(childViewHolderInt.f932f);
                    aVarM636a8.f990d = c0146u8.m637b(aVarM636a8.f990d, j11);
                    if (RecyclerView.this.isAccessibilityEnabled()) {
                        view = childViewHolderInt.f927a;
                        WeakHashMap<View, String> weakHashMap7 = C0418m.f2718a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        c0558u = RecyclerView.this.mAccessibilityDelegate;
                        if (c0558u != null) {
                            c0406aMo1943j = c0558u.mo1943j();
                            if (c0406aMo1943j instanceof C0558u.a) {
                                aVar = (C0558u.a) c0406aMo1943j;
                                Objects.requireNonNull(aVar);
                                c0406aM1563f = C0418m.m1563f(view);
                                if (c0406aM1563f != null) {
                                    aVar.f3449e.put(view, c0406aM1563f);
                                }
                            }
                            C0418m.m1577t(view, c0406aMo1943j);
                        }
                    }
                    if (RecyclerView.this.mState.f909g) {
                        childViewHolderInt.f933g = i;
                    }
                } else {
                    iM1988f = RecyclerView.this.mAdapterHelper.m1988f(i, 0);
                    RecyclerView recyclerView11 = RecyclerView.this;
                    childViewHolderInt.f944r = recyclerView11;
                    i2 = childViewHolderInt.f932f;
                    long nanoTime17 = recyclerView11.getNanoTime();
                    if (j != RecyclerView.FOREVER_NS) {
                        j2 = this.f997g.m636a(i2).f990d;
                        if (j2 != 0) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                        }
                    }
                    abstractC0132g = RecyclerView.this.mAdapter;
                    Objects.requireNonNull(abstractC0132g);
                    childViewHolderInt.f929c = iM1988f;
                    if (abstractC0132g.f948b) {
                        childViewHolderInt.f931e = abstractC0132g.mo534b(iM1988f);
                    }
                    childViewHolderInt.m523s(1, 519);
                    Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
                    childViewHolderInt.m511g();
                    abstractC0132g.mo537e(childViewHolderInt, iM1988f);
                    list = childViewHolderInt.f937k;
                    if (list != null) {
                        list.clear();
                    }
                    childViewHolderInt.f936j &= -1025;
                    layoutParams = childViewHolderInt.f927a.getLayoutParams();
                    if (layoutParams instanceof C0141p) {
                        ((C0141p) layoutParams).f983c = true;
                    }
                    Trace.endSection();
                    long nanoTime18 = RecyclerView.this.getNanoTime();
                    C0146u c0146u9 = this.f997g;
                    long j12 = nanoTime18 - nanoTime17;
                    C0146u.a aVarM636a9 = c0146u9.m636a(childViewHolderInt.f932f);
                    aVarM636a9.f990d = c0146u9.m637b(aVarM636a9.f990d, j12);
                    if (RecyclerView.this.isAccessibilityEnabled()) {
                        view = childViewHolderInt.f927a;
                        WeakHashMap<View, String> weakHashMap8 = C0418m.f2718a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        c0558u = RecyclerView.this.mAccessibilityDelegate;
                        if (c0558u != null) {
                            c0406aMo1943j = c0558u.mo1943j();
                            if (c0406aMo1943j instanceof C0558u.a) {
                                aVar = (C0558u.a) c0406aMo1943j;
                                Objects.requireNonNull(aVar);
                                c0406aM1563f = C0418m.m1563f(view);
                                if (c0406aM1563f != null) {
                                    aVar.f3449e.put(view, c0406aM1563f);
                                }
                            }
                            C0418m.m1577t(view, c0406aMo1943j);
                        }
                    }
                    if (RecyclerView.this.mState.f909g) {
                        childViewHolderInt.f933g = i;
                    }
                }
            }
            layoutParams2 = childViewHolderInt.f927a.getLayoutParams();
            if (layoutParams2 != null) {
                if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                    layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams2);
                } else {
                    c0141p = (C0141p) layoutParams2;
                }
                c0141p.f981a = childViewHolderInt;
                if (z2) {
                    z7 = true;
                }
                c0141p.f984d = z7;
                return childViewHolderInt;
            }
            layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
            c0141p = (C0141p) layoutParamsGenerateLayoutParams;
            childViewHolderInt.f927a.setLayoutParams(c0141p);
            c0141p.f981a = childViewHolderInt;
            if (z2) {
                z7 = true;
            }
            c0141p.f984d = z7;
            return childViewHolderInt;
        }

        /* JADX INFO: renamed from: l */
        public void m649l(AbstractC0129d0 abstractC0129d0) {
            (abstractC0129d0.f941o ? this.f992b : this.f991a).remove(abstractC0129d0);
            abstractC0129d0.f940n = null;
            abstractC0129d0.f941o = false;
            abstractC0129d0.m508d();
        }

        /* JADX INFO: renamed from: m */
        public void m650m() {
            AbstractC0140o abstractC0140o = RecyclerView.this.mLayout;
            this.f996f = this.f995e + (abstractC0140o != null ? abstractC0140o.f969l : 0);
            for (int size = this.f993c.size() - 1; size >= 0 && this.f993c.size() > this.f996f; size--) {
                m644g(size);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface InterfaceC0148w {
        /* JADX INFO: renamed from: a */
        void m651a(AbstractC0129d0 abstractC0129d0);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public class C0149x extends AbstractC0134i {
        public C0149x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0134i
        /* JADX INFO: renamed from: a */
        public void mo544a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f908f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.m1989g()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0134i
        /* JADX INFO: renamed from: b */
        public void mo545b(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            C0538a c0538a = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(c0538a);
            boolean z = false;
            if (i2 >= 1) {
                c0538a.f3307b.add(c0538a.m1990h(4, i, i2, obj));
                c0538a.f3311f |= 4;
                if (c0538a.f3307b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m652c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m652c() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    recyclerView.postOnAnimation(runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0150y extends AbstractC0442a {
        public static final Parcelable.Creator<C0150y> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public Parcelable f1000d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0150y> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0150y(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0150y[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0150y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0150y(parcel, classLoader);
            }
        }

        public C0150y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1000d = parcel.readParcelable(classLoader == null ? AbstractC0140o.class.getClassLoader() : classLoader);
        }

        public C0150y(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeParcelable(this.f1000d, 0);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class AbstractC0151z {

        /* JADX INFO: renamed from: b */
        public RecyclerView f1002b;

        /* JADX INFO: renamed from: c */
        public AbstractC0140o f1003c;

        /* JADX INFO: renamed from: d */
        public boolean f1004d;

        /* JADX INFO: renamed from: e */
        public boolean f1005e;

        /* JADX INFO: renamed from: f */
        public View f1006f;

        /* JADX INFO: renamed from: h */
        public boolean f1008h;

        /* JADX INFO: renamed from: a */
        public int f1001a = -1;

        /* JADX INFO: renamed from: g */
        public final a f1007g = new a(0, 0);

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f1009a;

            /* JADX INFO: renamed from: b */
            public int f1010b;

            /* JADX INFO: renamed from: d */
            public int f1012d = -1;

            /* JADX INFO: renamed from: f */
            public boolean f1014f = false;

            /* JADX INFO: renamed from: g */
            public int f1015g = 0;

            /* JADX INFO: renamed from: c */
            public int f1011c = RecyclerView.UNDEFINED_DURATION;

            /* JADX INFO: renamed from: e */
            public Interpolator f1013e = null;

            public a(int i, int i2) {
                this.f1009a = i;
                this.f1010b = i2;
            }

            /* JADX INFO: renamed from: a */
            public void m657a(RecyclerView recyclerView) {
                int i = this.f1012d;
                if (i >= 0) {
                    this.f1012d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f1014f = false;
                    return;
                }
                if (!this.f1014f) {
                    this.f1015g = 0;
                    return;
                }
                Interpolator interpolator = this.f1013e;
                if (interpolator != null && this.f1011c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.f1011c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.m503b(this.f1009a, this.f1010b, i2, interpolator);
                int i3 = this.f1015g + 1;
                this.f1015g = i3;
                if (i3 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f1014f = false;
            }

            /* JADX INFO: renamed from: b */
            public void m658b(int i, int i2, int i3, Interpolator interpolator) {
                this.f1009a = i;
                this.f1010b = i2;
                this.f1011c = i3;
                this.f1013e = interpolator;
                this.f1014f = true;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            PointF mo456a(int i);
        }

        /* JADX INFO: renamed from: a */
        public PointF m653a(int i) {
            Object obj = this.f1003c;
            if (obj instanceof b) {
                return ((b) obj).mo456a(i);
            }
            StringBuilder sbM2191e = a.m2191e("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sbM2191e.append(b.class.getCanonicalName());
            Log.w(RecyclerView.TAG, sbM2191e.toString());
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
        /* JADX INFO: renamed from: b */
        public void m654b(int i, int i2) {
            PointF pointFM653a;
            RecyclerView recyclerView = this.f1002b;
            if (this.f1001a == -1 || recyclerView == null) {
                m656d();
            }
            if (this.f1004d && this.f1006f == null && this.f1003c != null && (pointFM653a = m653a(this.f1001a)) != null) {
                float f = pointFM653a.x;
                if (f != 0.0f || pointFM653a.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFM653a.y), null);
                }
            }
            this.f1004d = false;
            View view = this.f1006f;
            if (view != null) {
                if (this.f1002b.getChildLayoutPosition(view) == this.f1001a) {
                    mo655c(this.f1006f, recyclerView.mState, this.f1007g);
                    this.f1007g.m657a(recyclerView);
                    m656d();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f1006f = null;
                }
            }
            if (this.f1005e) {
                C0123a0 c0123a0 = recyclerView.mState;
                a aVar = this.f1007g;
                C0552o c0552o = (C0552o) this;
                if (c0552o.f1002b.mLayout.m619y() == 0) {
                    c0552o.m656d();
                } else {
                    int i3 = c0552o.f3438o;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    c0552o.f3438o = i4;
                    int i5 = c0552o.f3439p;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    c0552o.f3439p = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF pointFM653a2 = c0552o.m653a(c0552o.f1001a);
                        if (pointFM653a2 != null) {
                            float f2 = pointFM653a2.x;
                            if (f2 == 0.0f && pointFM653a2.y == 0.0f) {
                                aVar.f1012d = c0552o.f1001a;
                                c0552o.m656d();
                            } else {
                                float f3 = pointFM653a2.y;
                                float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                                float f4 = pointFM653a2.x / fSqrt;
                                pointFM653a2.x = f4;
                                float f5 = pointFM653a2.y / fSqrt;
                                pointFM653a2.y = f5;
                                c0552o.f3434k = pointFM653a2;
                                c0552o.f3438o = (int) (f4 * 10000.0f);
                                c0552o.f3439p = (int) (f5 * 10000.0f);
                                aVar.m658b((int) (c0552o.f3438o * 1.2f), (int) (c0552o.f3439p * 1.2f), (int) (c0552o.m2036g(10000) * 1.2f), c0552o.f3432i);
                            }
                        } else {
                            aVar.f1012d = c0552o.f1001a;
                            c0552o.m656d();
                        }
                    }
                }
                a aVar2 = this.f1007g;
                boolean z = aVar2.f1012d >= 0;
                aVar2.m657a(recyclerView);
                if (z && this.f1005e) {
                    this.f1004d = true;
                    recyclerView.mViewFlinger.m502a();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo655c(View view, C0123a0 c0123a0, a aVar);

        /* JADX INFO: renamed from: d */
        public final void m656d() {
            if (this.f1005e) {
                this.f1005e = false;
                C0552o c0552o = (C0552o) this;
                c0552o.f3439p = 0;
                c0552o.f3438o = 0;
                c0552o.f3434k = null;
                this.f1002b.mState.f903a = -1;
                this.f1006f = null;
                this.f1001a = -1;
                this.f1004d = false;
                AbstractC0140o abstractC0140o = this.f1003c;
                if (abstractC0140o.f964g == this) {
                    abstractC0140o.f964g = null;
                }
                this.f1003c = null;
                this.f1002b = null;
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i == 19 || i == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i >= 23;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = i >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC0126c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.didjdk.adbhelper.R.attr.o2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C0149x();
        this.mRecycler = new C0147v();
        this.mViewInfoStore = new C0563z();
        this.mUpdateChildViewsRunnable = new RunnableC0122a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0136k();
        this.mItemAnimator = new C0548k();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC0127c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC0550m.b() : null;
        this.mState = new C0123a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0138m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0124b();
        this.mViewInfoProcessCallback = new C0128d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        Method method = C0422q.f2731a;
        int i2 = Build.VERSION.SDK_INT;
        this.mScaledHorizontalScrollFactor = i2 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : C0422q.m1590a(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = i2 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : C0422q.m1590a(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f949a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0558u(this));
        int[] iArr = C0537a.f3305a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (i2 >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
            if (i2 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
            }
            z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
            typedArrayObtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    private void addAnimatingView(AbstractC0129d0 abstractC0129d0) {
        View view = abstractC0129d0.f927a;
        boolean z = view.getParent() == this;
        this.mRecycler.m649l(getChildViewHolder(view));
        if (abstractC0129d0.m519o()) {
            this.mChildHelper.m1997b(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0539b c0539b = this.mChildHelper;
        if (!z) {
            c0539b.m1996a(view, -1, true);
            return;
        }
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c0539b.f3317b.m2015h(iIndexOfChild);
            c0539b.m2004i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(AbstractC0129d0 abstractC0129d0, AbstractC0129d0 abstractC0129d1, AbstractC0137l.c cVar, AbstractC0137l.c cVar2, boolean z, boolean z2) {
        abstractC0129d0.m524t(false);
        if (z) {
            addAnimatingView(abstractC0129d0);
        }
        if (abstractC0129d0 != abstractC0129d1) {
            if (z2) {
                addAnimatingView(abstractC0129d1);
            }
            abstractC0129d0.f934h = abstractC0129d1;
            addAnimatingView(abstractC0129d0);
            this.mRecycler.m649l(abstractC0129d0);
            abstractC0129d1.m524t(false);
            abstractC0129d1.f935i = abstractC0129d0;
        }
        if (this.mItemAnimator.mo549a(abstractC0129d0, abstractC0129d1, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(AbstractC0129d0 abstractC0129d0) {
        WeakReference<RecyclerView> weakReference = abstractC0129d0.f928b;
        if (weakReference == null) {
            return;
        }
        Object parent = weakReference.get();
        while (true) {
            View view = (View) parent;
            while (true) {
                if (view == null) {
                    abstractC0129d0.f928b = null;
                    return;
                } else {
                    if (view == abstractC0129d0.f927a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    } else {
                        view = null;
                    }
                }
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0140o.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0140o) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.m500a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f911i = false;
        startInterceptRequestLayout();
        C0563z c0563z = this.mViewInfoStore;
        c0563z.f3464a.clear();
        c0563z.f3465b.m1250b();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0123a0 c0123a0 = this.mState;
        c0123a0.f910h = c0123a0.f912j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c0123a0.f909g = c0123a0.f913k;
        c0123a0.f907e = this.mAdapter.mo533a();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f912j) {
            int iM2000e = this.mChildHelper.m2000e();
            for (int i = 0; i < iM2000e; i++) {
                AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m1999d(i));
                if (!childViewHolderInt.m525u() && (!childViewHolderInt.m515k() || this.mAdapter.f948b)) {
                    AbstractC0137l abstractC0137l = this.mItemAnimator;
                    AbstractC0137l.m548b(childViewHolderInt);
                    childViewHolderInt.m511g();
                    this.mViewInfoStore.m2068c(childViewHolderInt, abstractC0137l.m555h(childViewHolderInt));
                    if (this.mState.f910h && childViewHolderInt.m520p() && !childViewHolderInt.m517m() && !childViewHolderInt.m525u() && !childViewHolderInt.m515k()) {
                        this.mViewInfoStore.f3465b.m1255g(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f913k) {
            saveOldPositions();
            C0123a0 c0123a1 = this.mState;
            boolean z = c0123a1.f908f;
            c0123a1.f908f = false;
            this.mLayout.mo438s0(this.mRecycler, c0123a1);
            this.mState.f908f = z;
            for (int i2 = 0; i2 < this.mChildHelper.m2000e(); i2++) {
                AbstractC0129d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m1999d(i2));
                if (!childViewHolderInt2.m525u()) {
                    C0563z.a orDefault = this.mViewInfoStore.f3464a.getOrDefault(childViewHolderInt2, null);
                    if (!((orDefault == null || (orDefault.f3467a & 4) == 0) ? false : true)) {
                        AbstractC0137l.m548b(childViewHolderInt2);
                        boolean zM512h = childViewHolderInt2.m512h(8192);
                        AbstractC0137l abstractC0137l2 = this.mItemAnimator;
                        childViewHolderInt2.m511g();
                        AbstractC0137l.c cVarM555h = abstractC0137l2.m555h(childViewHolderInt2);
                        if (zM512h) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVarM555h);
                        } else {
                            C0563z c0563z2 = this.mViewInfoStore;
                            C0563z.a orDefault2 = c0563z2.f3464a.getOrDefault(childViewHolderInt2, null);
                            if (orDefault2 == null) {
                                orDefault2 = C0563z.a.m2073a();
                                c0563z2.f3464a.put(childViewHolderInt2, orDefault2);
                            }
                            orDefault2.f3467a |= 2;
                            orDefault2.f3468b = cVarM555h;
                        }
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f906d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m500a(6);
        this.mAdapterHelper.m1985c();
        this.mState.f907e = this.mAdapter.mo533a();
        C0123a0 c0123a0 = this.mState;
        c0123a0.f905c = 0;
        c0123a0.f909g = false;
        this.mLayout.mo438s0(this.mRecycler, c0123a0);
        C0123a0 c0123a1 = this.mState;
        c0123a1.f908f = false;
        this.mPendingSavedState = null;
        c0123a1.f912j = c0123a1.f912j && this.mItemAnimator != null;
        c0123a1.f906d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x0155  */
    private void dispatchLayoutStep3() {
        AbstractC0137l.c cVar;
        AbstractC0137l.c cVar2;
        boolean zMo2016i;
        this.mState.m500a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0123a0 c0123a0 = this.mState;
        c0123a0.f906d = 1;
        if (c0123a0.f912j) {
            for (int iM2000e = this.mChildHelper.m2000e() - 1; iM2000e >= 0; iM2000e--) {
                AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m1999d(iM2000e));
                if (!childViewHolderInt.m525u()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    Objects.requireNonNull(this.mItemAnimator);
                    AbstractC0137l.c cVar3 = new AbstractC0137l.c();
                    View view = childViewHolderInt.f927a;
                    cVar3.f955a = view.getLeft();
                    cVar3.f956b = view.getTop();
                    view.getRight();
                    view.getBottom();
                    AbstractC0129d0 abstractC0129d0M1254f = this.mViewInfoStore.f3465b.m1254f(changedHolderKey, null);
                    if (abstractC0129d0M1254f == null || abstractC0129d0M1254f.m525u()) {
                        this.mViewInfoStore.m2067b(childViewHolderInt, cVar3);
                    } else {
                        boolean zM2069d = this.mViewInfoStore.m2069d(abstractC0129d0M1254f);
                        boolean zM2069d2 = this.mViewInfoStore.m2069d(childViewHolderInt);
                        if (zM2069d && abstractC0129d0M1254f == childViewHolderInt) {
                            this.mViewInfoStore.m2067b(childViewHolderInt, cVar3);
                        } else {
                            AbstractC0137l.c cVarM2070e = this.mViewInfoStore.m2070e(abstractC0129d0M1254f, 4);
                            this.mViewInfoStore.m2067b(childViewHolderInt, cVar3);
                            AbstractC0137l.c cVarM2070e2 = this.mViewInfoStore.m2070e(childViewHolderInt, 8);
                            if (cVarM2070e == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, abstractC0129d0M1254f);
                            } else {
                                animateChange(abstractC0129d0M1254f, childViewHolderInt, cVarM2070e, cVarM2070e2, zM2069d, zM2069d2);
                            }
                        }
                    }
                }
            }
            C0563z c0563z = this.mViewInfoStore;
            C0563z.b bVar = this.mViewInfoProcessCallback;
            for (int i = c0563z.f3464a.f2197d - 1; i >= 0; i--) {
                AbstractC0129d0 abstractC0129d0M1272h = c0563z.f3464a.m1272h(i);
                C0563z.a aVarMo1274j = c0563z.f3464a.mo1274j(i);
                int i2 = aVarMo1274j.f3467a;
                if ((i2 & 3) != 3) {
                    if ((i2 & 1) != 0) {
                        cVar = aVarMo1274j.f3468b;
                        if (cVar == null) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.mLayout.m572E0(abstractC0129d0M1272h.f927a, recyclerView.mRecycler);
                        } else {
                            cVar2 = aVarMo1274j.f3469c;
                        }
                    } else if ((i2 & 14) == 14) {
                        RecyclerView.this.animateAppearance(abstractC0129d0M1272h, aVarMo1274j.f3468b, aVarMo1274j.f3469c);
                    } else if ((i2 & 12) == 12) {
                        AbstractC0137l.c cVar4 = aVarMo1274j.f3468b;
                        AbstractC0137l.c cVar5 = aVarMo1274j.f3469c;
                        C0128d c0128d = (C0128d) bVar;
                        Objects.requireNonNull(c0128d);
                        abstractC0129d0M1272h.m524t(false);
                        RecyclerView recyclerView2 = RecyclerView.this;
                        boolean z = recyclerView2.mDataSetHasChangedAfterLayout;
                        AbstractC0137l abstractC0137l = recyclerView2.mItemAnimator;
                        if (!z) {
                            AbstractC0559v abstractC0559v = (AbstractC0559v) abstractC0137l;
                            Objects.requireNonNull(abstractC0559v);
                            int i3 = cVar4.f955a;
                            int i4 = cVar5.f955a;
                            if (i3 == i4 && cVar4.f956b == cVar5.f956b) {
                                abstractC0559v.m550c(abstractC0129d0M1272h);
                                zMo2016i = false;
                            } else {
                                zMo2016i = abstractC0559v.mo2016i(abstractC0129d0M1272h, i3, cVar4.f956b, i4, cVar5.f956b);
                            }
                            if (zMo2016i) {
                                RecyclerView.this.postAnimationRunner();
                            }
                        } else if (abstractC0137l.mo549a(abstractC0129d0M1272h, abstractC0129d0M1272h, cVar4, cVar5)) {
                            RecyclerView.this.postAnimationRunner();
                        }
                    } else if ((i2 & 4) != 0) {
                        cVar = aVarMo1274j.f3468b;
                        cVar2 = null;
                    } else if ((i2 & 8) != 0) {
                        RecyclerView.this.animateAppearance(abstractC0129d0M1272h, aVarMo1274j.f3468b, aVarMo1274j.f3469c);
                    }
                    C0128d c0128d2 = (C0128d) bVar;
                    RecyclerView.this.mRecycler.m649l(abstractC0129d0M1272h);
                    RecyclerView.this.animateDisappearance(abstractC0129d0M1272h, cVar, cVar2);
                } else {
                    RecyclerView recyclerView3 = RecyclerView.this;
                    recyclerView3.mLayout.m572E0(abstractC0129d0M1272h.f927a, recyclerView3.mRecycler);
                }
                C0563z.a.m2074b(aVarMo1274j);
            }
        }
        this.mLayout.m570D0(this.mRecycler);
        C0123a0 c0123a1 = this.mState;
        c0123a1.f904b = c0123a1.f907e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c0123a1.f912j = false;
        c0123a1.f913k = false;
        this.mLayout.f965h = false;
        ArrayList<AbstractC0129d0> arrayList = this.mRecycler.f992b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o.f970m) {
            abstractC0140o.f969l = 0;
            abstractC0140o.f970m = false;
            this.mRecycler.m650m();
        }
        this.mLayout.mo439t0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C0563z c0563z2 = this.mViewInfoStore;
        c0563z2.f3464a.clear();
        c0563z2.f3465b.m1250b();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC0144s interfaceC0144s = this.mInterceptingOnItemTouchListener;
        if (interfaceC0144s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC0144s.mo632b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0144s interfaceC0144s = this.mOnItemTouchListeners.get(i);
            if (interfaceC0144s.mo631a(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC0144s;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iM2000e = this.mChildHelper.m2000e();
        if (iM2000e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < iM2000e; i3++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m1999d(i3));
            if (!childViewHolderInt.m525u()) {
                int iM510f = childViewHolderInt.m510f();
                if (iM510f < i) {
                    i = iM510f;
                }
                if (iM510f > i2) {
                    i2 = iM510f;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        AbstractC0129d0 abstractC0129d0FindViewHolderForAdapterPosition;
        C0123a0 c0123a0 = this.mState;
        int i = c0123a0.f914l;
        if (i == -1) {
            i = 0;
        }
        int iM501b = c0123a0.m501b();
        for (int i2 = i; i2 < iM501b; i2++) {
            AbstractC0129d0 abstractC0129d0FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (abstractC0129d0FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC0129d0FindViewHolderForAdapterPosition2.f927a.hasFocusable()) {
                return abstractC0129d0FindViewHolderForAdapterPosition2.f927a;
            }
        }
        int iMin = Math.min(iM501b, i);
        do {
            iMin--;
            if (iMin < 0 || (abstractC0129d0FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC0129d0FindViewHolderForAdapterPosition.f927a.hasFocusable());
        return abstractC0129d0FindViewHolderForAdapterPosition.f927a;
    }

    public static AbstractC0129d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0141p) view.getLayoutParams()).f981a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0141p c0141p = (C0141p) view.getLayoutParams();
        Rect rect2 = c0141p.f982b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0141p).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0141p).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0141p).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0141p).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
            break loop0;
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C0410e getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0410e(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, AbstractC0129d0 abstractC0129d0, AbstractC0129d0 abstractC0129d1) {
        int iM2000e = this.mChildHelper.m2000e();
        for (int i = 0; i < iM2000e; i++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m1999d(i));
            if (childViewHolderInt != abstractC0129d0 && getChangedHolderKey(childViewHolderInt) == j) {
                AbstractC0132g abstractC0132g = this.mAdapter;
                if (abstractC0132g == null || !abstractC0132g.f948b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(abstractC0129d0);
                    throw new IllegalStateException(a.m2197k(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(abstractC0129d0);
                throw new IllegalStateException(a.m2197k(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0129d1 + " cannot be found but it is necessary for " + abstractC0129d0 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iM2000e = this.mChildHelper.m2000e();
        for (int i = 0; i < iM2000e; i++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m1999d(i));
            if (childViewHolderInt != null && !childViewHolderInt.m525u() && childViewHolderInt.m520p()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int i = Build.VERSION.SDK_INT;
        if ((i >= 26 ? getImportantForAutofill() : 0) != 0 || i < 26) {
            return;
        }
        setImportantForAutofill(8);
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0539b(new C0130e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b2 = -1;
        int i3 = this.mLayout.m579I() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b2 = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b2 = 0;
            }
        }
        if (i == 1) {
            return b2 < 0 || (b2 == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return b2 > 0 || (b2 == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b2 < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b2 > 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid direction: ");
        sb.append(i);
        throw new IllegalArgumentException(a.m2197k(this, sb));
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo423W0();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C0538a c0538a = this.mAdapterHelper;
            c0538a.m1994l(c0538a.f3307b);
            c0538a.m1994l(c0538a.f3308c);
            c0538a.f3311f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo431n0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m1992j();
        } else {
            this.mAdapterHelper.m1985c();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        C0123a0 c0123a0 = this.mState;
        boolean z4 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.f965h) && (!z || this.mAdapter.f948b);
        c0123a0.f912j = z4;
        if (z4 && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        c0123a0.f913k = z2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        EdgeEffect edgeEffect;
        float width;
        float height;
        boolean z2 = true;
        if (f2 >= 0.0f) {
            if (f2 > 0.0f) {
                ensureRightGlow();
                edgeEffect = this.mRightGlow;
                width = f2 / getWidth();
                height = f3 / getHeight();
            } else {
                z = false;
            }
            if (f4 < 0.0f) {
                ensureTopGlow();
                C0360f.m1418J(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                ensureBottomGlow();
                C0360f.m1418J(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        edgeEffect = this.mLeftGlow;
        width = (-f2) / getWidth();
        height = 1.0f - (f3 / getHeight());
        C0360f.m1418J(edgeEffect, width, height);
        z = true;
        if (f4 < 0.0f) {
            ensureTopGlow();
            C0360f.m1418J(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            C0360f.m1418J(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
        postInvalidateOnAnimation();
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.m2006k(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m2000e() == 0) {
                requestFocus();
                return;
            }
        }
        long j = this.mState.f915m;
        View viewFindNextViewToFocus = null;
        AbstractC0129d0 abstractC0129d0FindViewHolderForItemId = (j == -1 || !this.mAdapter.f948b) ? null : findViewHolderForItemId(j);
        if (abstractC0129d0FindViewHolderForItemId != null && !this.mChildHelper.m2006k(abstractC0129d0FindViewHolderForItemId.f927a) && abstractC0129d0FindViewHolderForItemId.f927a.hasFocusable()) {
            viewFindNextViewToFocus = abstractC0129d0FindViewHolderForItemId.f927a;
        } else if (this.mChildHelper.m2000e() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i = this.mState.f916n;
            if (i != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0141p) {
            C0141p c0141p = (C0141p) layoutParams;
            if (!c0141p.f983c) {
                Rect rect = c0141p.f982b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.m578H0(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0123a0 c0123a0 = this.mState;
        c0123a0.f915m = -1L;
        c0123a0.f914l = -1;
        c0123a0.f916n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int iM509e;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC0129d0 abstractC0129d0FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC0129d0FindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        C0123a0 c0123a0 = this.mState;
        c0123a0.f915m = this.mAdapter.f948b ? abstractC0129d0FindContainingViewHolder.f931e : -1L;
        if (this.mDataSetHasChangedAfterLayout) {
            iM509e = -1;
        } else {
            iM509e = abstractC0129d0FindContainingViewHolder.m517m() ? abstractC0129d0FindContainingViewHolder.f930d : abstractC0129d0FindContainingViewHolder.m509e();
        }
        c0123a0.f914l = iM509e;
        this.mState.f916n = getDeepestFocusedViewWithId(abstractC0129d0FindContainingViewHolder.f927a);
    }

    private void setAdapterInternal(AbstractC0132g abstractC0132g, boolean z, boolean z2) {
        AbstractC0132g abstractC0132g2 = this.mAdapter;
        if (abstractC0132g2 != null) {
            abstractC0132g2.f947a.unregisterObserver(this.mObserver);
            Objects.requireNonNull(this.mAdapter);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        C0538a c0538a = this.mAdapterHelper;
        c0538a.m1994l(c0538a.f3307b);
        c0538a.m1994l(c0538a.f3308c);
        c0538a.f3311f = 0;
        AbstractC0132g abstractC0132g3 = this.mAdapter;
        this.mAdapter = abstractC0132g;
        if (abstractC0132g != null) {
            abstractC0132g.f947a.registerObserver(this.mObserver);
        }
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            abstractC0140o.m603b0();
        }
        C0147v c0147v = this.mRecycler;
        AbstractC0132g abstractC0132g4 = this.mAdapter;
        c0147v.m639b();
        C0146u c0146uM641d = c0147v.m641d();
        Objects.requireNonNull(c0146uM641d);
        if (abstractC0132g3 != null) {
            c0146uM641d.f986b--;
        }
        if (!z && c0146uM641d.f986b == 0) {
            for (int i = 0; i < c0146uM641d.f985a.size(); i++) {
                c0146uM641d.f985a.valueAt(i).f987a.clear();
            }
        }
        if (abstractC0132g4 != null) {
            c0146uM641d.f986b++;
        }
        this.mState.f908f = true;
    }

    private void stopScrollersInternal() {
        AbstractC0151z abstractC0151z;
        this.mViewFlinger.m504c();
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null || (abstractC0151z = abstractC0140o.f964g) == null) {
            return;
        }
        abstractC0151z.m656d();
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null || !abstractC0140o.m605c0()) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(AbstractC0139n abstractC0139n) {
        addItemDecoration(abstractC0139n, -1);
    }

    public void addItemDecoration(AbstractC0139n abstractC0139n, int i) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            abstractC0140o.mo460d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC0139n);
        } else {
            this.mItemDecorations.add(i, abstractC0139n);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC0142q interfaceC0142q) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC0142q);
    }

    public void addOnItemTouchListener(InterfaceC0144s interfaceC0144s) {
        this.mOnItemTouchListeners.add(interfaceC0144s);
    }

    public void addOnScrollListener(AbstractC0145t abstractC0145t) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC0145t);
    }

    public void animateAppearance(AbstractC0129d0 abstractC0129d0, AbstractC0137l.c cVar, AbstractC0137l.c cVar2) {
        boolean zMo2016i;
        int i;
        int i2;
        abstractC0129d0.m524t(false);
        AbstractC0559v abstractC0559v = (AbstractC0559v) this.mItemAnimator;
        Objects.requireNonNull(abstractC0559v);
        if (cVar == null || ((i = cVar.f955a) == (i2 = cVar2.f955a) && cVar.f956b == cVar2.f956b)) {
            C0548k c0548k = (C0548k) abstractC0559v;
            c0548k.m2021n(abstractC0129d0);
            abstractC0129d0.f927a.setAlpha(0.0f);
            c0548k.f3351i.add(abstractC0129d0);
            zMo2016i = true;
        } else {
            zMo2016i = abstractC0559v.mo2016i(abstractC0129d0, i, cVar.f956b, i2, cVar2.f956b);
        }
        if (zMo2016i) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(AbstractC0129d0 abstractC0129d0, AbstractC0137l.c cVar, AbstractC0137l.c cVar2) {
        boolean zMo2016i;
        addAnimatingView(abstractC0129d0);
        abstractC0129d0.m524t(false);
        AbstractC0559v abstractC0559v = (AbstractC0559v) this.mItemAnimator;
        Objects.requireNonNull(abstractC0559v);
        int i = cVar.f955a;
        int i2 = cVar.f956b;
        View view = abstractC0129d0.f927a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f955a;
        int top = cVar2 == null ? view.getTop() : cVar2.f956b;
        if (abstractC0129d0.m517m() || (i == left && i2 == top)) {
            C0548k c0548k = (C0548k) abstractC0559v;
            c0548k.m2021n(abstractC0129d0);
            c0548k.f3350h.add(abstractC0129d0);
            zMo2016i = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zMo2016i = abstractC0559v.mo2016i(abstractC0129d0, i, i2, left, top);
        }
        if (zMo2016i) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(a.m2197k(this, a.m2191e(str)));
        }
        throw new IllegalStateException(a.m2197k(this, a.m2191e("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(a.m2197k(this, a.m2191e("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a.m2197k(this, a.m2191e(""))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    public boolean canReuseUpdatedViewHolder(AbstractC0129d0 abstractC0129d0) {
        boolean z;
        AbstractC0137l abstractC0137l = this.mItemAnimator;
        if (abstractC0137l != null) {
            List<Object> listM511g = abstractC0129d0.m511g();
            C0548k c0548k = (C0548k) abstractC0137l;
            Objects.requireNonNull(c0548k);
            if (listM511g.isEmpty()) {
                if (!c0548k.f3450g || abstractC0129d0.m515k()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0141p) && this.mLayout.mo425g((C0141p) layoutParams);
    }

    public void clearOldPositions() {
        int iM2003h = this.mChildHelper.m2003h();
        for (int i = 0; i < iM2003h; i++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i));
            if (!childViewHolderInt.m525u()) {
                childViewHolderInt.m507c();
            }
        }
        C0147v c0147v = this.mRecycler;
        int size = c0147v.f993c.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0147v.f993c.get(i2).m507c();
        }
        int size2 = c0147v.f991a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c0147v.f991a.get(i3).m507c();
        }
        ArrayList<AbstractC0129d0> arrayList = c0147v.f992b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c0147v.f992b.get(i4).m507c();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC0142q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC0145t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null && abstractC0140o.mo462e()) {
            return this.mLayout.mo474k(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null && abstractC0140o.mo462e()) {
            return this.mLayout.mo428l(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null && abstractC0140o.mo462e()) {
            return this.mLayout.mo429m(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null && abstractC0140o.mo464f()) {
            return this.mLayout.mo478n(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null && abstractC0140o.mo464f()) {
            return this.mLayout.mo433o(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null && abstractC0140o.mo464f()) {
            return this.mLayout.mo435p(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.m1989g()) {
            C0538a c0538a = this.mAdapterHelper;
            int i = c0538a.f3311f;
            if ((i & 4) != 0) {
                if (!((i & 11) != 0)) {
                    Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.m1992j();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.m1984b();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                } else {
                    if (c0538a.m1989g()) {
                        return;
                    }
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                }
            } else {
                if (c0538a.m1989g()) {
                    return;
                }
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
            }
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setMeasuredDimension(AbstractC0140o.m562h(i, paddingRight, getMinimumWidth()), AbstractC0140o.m562h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC0132g abstractC0132g = this.mAdapter;
        if (abstractC0132g != null && childViewHolderInt != null) {
            Objects.requireNonNull(abstractC0132g);
        }
        List<InterfaceC0142q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m629a(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC0132g abstractC0132g = this.mAdapter;
        if (abstractC0132g != null && childViewHolderInt != null) {
            Objects.requireNonNull(abstractC0132g);
        }
        List<InterfaceC0142q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m630b(view);
            }
        }
    }

    public void dispatchLayout() {
        String str;
        if (this.mAdapter == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.mLayout != null) {
                C0123a0 c0123a0 = this.mState;
                boolean z = false;
                c0123a0.f911i = false;
                if (c0123a0.f906d != 1) {
                    C0538a c0538a = this.mAdapterHelper;
                    if (!c0538a.f3308c.isEmpty() && !c0538a.f3307b.isEmpty()) {
                        z = true;
                    }
                    if (!z && this.mLayout.f973p == getWidth() && this.mLayout.f974q == getHeight()) {
                        this.mLayout.m585M0(this);
                    }
                    dispatchLayoutStep3();
                    return;
                }
                dispatchLayoutStep1();
                this.mLayout.m585M0(this);
                dispatchLayoutStep2();
                dispatchLayoutStep3();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e(TAG, str);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m1544a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m1545b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1546c(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m1546c(i, i2, iArr, iArr2, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m1548e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m1547d(i, i2, i3, i4, iArr);
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            abstractC0140o.mo620z0(i);
        }
        onScrollStateChanged(i);
        AbstractC0145t abstractC0145t = this.mScrollListener;
        if (abstractC0145t != null) {
            abstractC0145t.mo634a(this, i);
        }
        List<AbstractC0145t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo634a(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC0145t abstractC0145t = this.mScrollListener;
        if (abstractC0145t != null) {
            abstractC0145t.mo635b(this, i, i2);
        }
        List<AbstractC0145t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo635b(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC0129d0 abstractC0129d0 = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC0129d0.f927a.getParent() == this && !abstractC0129d0.m525u() && (i = abstractC0129d0.f943q) != -1) {
                View view = abstractC0129d0.f927a;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                view.setImportantForAccessibility(i);
                abstractC0129d0.f943q = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float paddingRight;
        float paddingBottom;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo559f(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                paddingRight = getPaddingRight() + (-getWidth());
                paddingBottom = getPaddingBottom() + (-getHeight());
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo554g()) ? z : true) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM547a = this.mEdgeEffectFactory.m547a(this);
        this.mBottomGlow = edgeEffectM547a;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectM547a.setSize(measuredWidth, measuredHeight);
    }

    public void ensureLeftGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM547a = this.mEdgeEffectFactory.m547a(this);
        this.mLeftGlow = edgeEffectM547a;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectM547a.setSize(measuredHeight, measuredWidth);
    }

    public void ensureRightGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM547a = this.mEdgeEffectFactory.m547a(this);
        this.mRightGlow = edgeEffectM547a;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectM547a.setSize(measuredHeight, measuredWidth);
    }

    public void ensureTopGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM547a = this.mEdgeEffectFactory.m547a(this);
        this.mTopGlow = edgeEffectM547a;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectM547a.setSize(measuredWidth, measuredHeight);
    }

    public String exceptionLabel() {
        StringBuilder sbM2191e = a.m2191e(" ");
        sbM2191e.append(super.toString());
        sbM2191e.append(", adapter:");
        sbM2191e.append(this.mAdapter);
        sbM2191e.append(", layout:");
        sbM2191e.append(this.mLayout);
        sbM2191e.append(", context:");
        sbM2191e.append(getContext());
        return sbM2191e.toString();
    }

    public final void fillRemainingScrollValues(C0123a0 c0123a0) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(c0123a0);
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f920d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(c0123a0);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f, float f2) {
        for (int iM2000e = this.mChildHelper.m2000e() - 1; iM2000e >= 0; iM2000e--) {
            View viewM1999d = this.mChildHelper.m1999d(iM2000e);
            float translationX = viewM1999d.getTranslationX();
            float translationY = viewM1999d.getTranslationY();
            if (f >= viewM1999d.getLeft() + translationX && f <= viewM1999d.getRight() + translationX && f2 >= viewM1999d.getTop() + translationY && f2 <= viewM1999d.getBottom() + translationY) {
                return viewM1999d;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public AbstractC0129d0 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public AbstractC0129d0 findViewHolderForAdapterPosition(int i) {
        AbstractC0129d0 abstractC0129d0 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM2003h = this.mChildHelper.m2003h();
        for (int i2 = 0; i2 < iM2003h; i2++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.m517m() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.m2006k(childViewHolderInt.f927a)) {
                    return childViewHolderInt;
                }
                abstractC0129d0 = childViewHolderInt;
            }
        }
        return abstractC0129d0;
    }

    public AbstractC0129d0 findViewHolderForItemId(long j) {
        AbstractC0132g abstractC0132g = this.mAdapter;
        AbstractC0129d0 abstractC0129d0 = null;
        if (abstractC0132g != null && abstractC0132g.f948b) {
            int iM2003h = this.mChildHelper.m2003h();
            for (int i = 0; i < iM2003h; i++) {
                AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i));
                if (childViewHolderInt != null && !childViewHolderInt.m517m() && childViewHolderInt.f931e == j) {
                    if (!this.mChildHelper.m2006k(childViewHolderInt.f927a)) {
                        return childViewHolderInt;
                    }
                    abstractC0129d0 = childViewHolderInt;
                }
            }
        }
        return abstractC0129d0;
    }

    public AbstractC0129d0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public AbstractC0129d0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    public AbstractC0129d0 findViewHolderForPosition(int i, boolean z) {
        int iM2003h = this.mChildHelper.m2003h();
        AbstractC0129d0 abstractC0129d0 = null;
        for (int i2 = 0; i2 < iM2003h; i2++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.m517m()) {
                if (z) {
                    if (childViewHolderInt.f929c != i) {
                        continue;
                    } else {
                        if (this.mChildHelper.m2006k(childViewHolderInt.f927a)) {
                            return childViewHolderInt;
                        }
                        abstractC0129d0 = childViewHolderInt;
                    }
                } else if (childViewHolderInt.m510f() != i) {
                    continue;
                } else {
                    if (this.mChildHelper.m2006k(childViewHolderInt.f927a)) {
                        return childViewHolderInt;
                    }
                    abstractC0129d0 = childViewHolderInt;
                }
            }
        }
        return abstractC0129d0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean fling(int i, int i2) {
        boolean z;
        int minFlingVelocity;
        boolean z2;
        int i3;
        int i4;
        View viewMo2038b;
        int iM589P;
        PointF pointFMo456a;
        int iM2040e;
        int iM2040e2;
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        boolean zMo462e = abstractC0140o.mo462e();
        boolean zMo464f = this.mLayout.mo464f();
        int i5 = (!zMo462e || Math.abs(i) < this.mMinFlingVelocity) ? 0 : i;
        int i6 = (!zMo464f || Math.abs(i2) < this.mMinFlingVelocity) ? 0 : i2;
        if (i5 == 0 && i6 == 0) {
            return false;
        }
        float f = i5;
        float f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z3 = zMo462e || zMo464f;
            dispatchNestedFling(f, f2, z3);
            AbstractC0143r abstractC0143r = this.mOnFlingListener;
            if (abstractC0143r != null) {
                AbstractC0560w abstractC0560w = (AbstractC0560w) abstractC0143r;
                AbstractC0140o layoutManager = abstractC0560w.f3451a.getLayoutManager();
                if (layoutManager == 0 || abstractC0560w.f3451a.getAdapter() == null || (Math.abs(i6) <= (minFlingVelocity = abstractC0560w.f3451a.getMinFlingVelocity()) && Math.abs(i5) <= minFlingVelocity)) {
                    z = false;
                } else {
                    boolean z4 = layoutManager instanceof AbstractC0151z.b;
                    if (z4) {
                        C0561x c0561x = !z4 ? null : new C0561x(abstractC0560w, abstractC0560w.f3451a.getContext());
                        if (c0561x == null) {
                            z2 = false;
                        } else {
                            C0553p c0553p = (C0553p) abstractC0560w;
                            if (z4) {
                                RecyclerView recyclerView = layoutManager.f959b;
                                AbstractC0132g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
                                int iMo533a = adapter != null ? adapter.mo533a() : 0;
                                if (iMo533a == 0 || (viewMo2038b = c0553p.mo2038b(layoutManager)) == null || (iM589P = layoutManager.m589P(viewMo2038b)) == -1 || (pointFMo456a = ((AbstractC0151z.b) layoutManager).mo456a((i4 = iMo533a - 1))) == null) {
                                    i3 = -1;
                                    i4 = -1;
                                } else {
                                    if (layoutManager.mo462e()) {
                                        iM2040e = c0553p.m2040e(layoutManager, c0553p.m2042g(layoutManager), i5, 0);
                                        if (pointFMo456a.x < 0.0f) {
                                            iM2040e = -iM2040e;
                                        }
                                    } else {
                                        iM2040e = 0;
                                    }
                                    if (layoutManager.mo464f()) {
                                        iM2040e2 = c0553p.m2040e(layoutManager, c0553p.m2043h(layoutManager), 0, i6);
                                        if (pointFMo456a.y < 0.0f) {
                                            iM2040e2 = -iM2040e2;
                                        }
                                    } else {
                                        iM2040e2 = 0;
                                    }
                                    if (layoutManager.mo464f()) {
                                        iM2040e = iM2040e2;
                                    }
                                    if (iM2040e == 0) {
                                        i3 = -1;
                                        i4 = -1;
                                    } else {
                                        int i7 = iM589P + iM2040e;
                                        if (i7 < 0) {
                                            i7 = 0;
                                        }
                                        if (i7 < iMo533a) {
                                            i4 = i7;
                                        }
                                        i3 = -1;
                                    }
                                }
                            } else {
                                i3 = -1;
                                i4 = -1;
                            }
                            if (i4 == i3) {
                                z2 = false;
                            } else {
                                c0561x.f1001a = i4;
                                layoutManager.m597V0(c0561x);
                                z2 = true;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    return true;
                }
            }
            int i8 = zMo462e;
            if (z3) {
                if (zMo464f) {
                    i8 = (zMo462e ? 1 : 0) | 2;
                }
                startNestedScroll(i8, 1);
                int i9 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i9, Math.min(i5, i9));
                int i10 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i10, Math.min(i6, i10));
                RunnableC0127c0 runnableC0127c0 = this.mViewFlinger;
                RecyclerView.this.setScrollState(2);
                runnableC0127c0.f919c = 0;
                runnableC0127c0.f918b = 0;
                Interpolator interpolator = runnableC0127c0.f921e;
                Interpolator interpolator2 = sQuinticInterpolator;
                if (interpolator != interpolator2) {
                    runnableC0127c0.f921e = interpolator2;
                    runnableC0127c0.f920d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                }
                runnableC0127c0.f920d.fling(0, 0, iMax, iMax2, UNDEFINED_DURATION, Integer.MAX_VALUE, UNDEFINED_DURATION, Integer.MAX_VALUE);
                runnableC0127c0.m502a();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewMo426g0;
        boolean z;
        View viewM610l0 = this.mLayout.m610l0();
        if (viewM610l0 != null) {
            return viewM610l0;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.mo464f()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo462e()) {
                int i3 = (this.mLayout.m579I() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo426g0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewMo426g0 = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewMo426g0 = this.mLayout.mo426g0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewMo426g0 = viewFindNextFocus;
            }
        }
        if (viewMo426g0 == null || viewMo426g0.hasFocusable()) {
            return isPreferredNextFocus(view, viewMo426g0, i) ? viewMo426g0 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(viewMo426g0, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            return abstractC0140o.mo441u();
        }
        throw new IllegalStateException(a.m2197k(this, a.m2191e("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            return abstractC0140o.mo443v(getContext(), attributeSet);
        }
        throw new IllegalStateException(a.m2197k(this, a.m2191e("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            return abstractC0140o.mo444w(layoutParams);
        }
        throw new IllegalStateException(a.m2197k(this, a.m2191e("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0132g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(AbstractC0129d0 abstractC0129d0) {
        if (abstractC0129d0.m512h(524) || !abstractC0129d0.m514j()) {
            return -1;
        }
        C0538a c0538a = this.mAdapterHelper;
        int i = abstractC0129d0.f929c;
        int size = c0538a.f3307b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0538a.b bVar = c0538a.f3307b.get(i2);
            int i3 = bVar.f3312a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3313b;
                    if (i4 <= i) {
                        int i5 = bVar.f3315d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3313b;
                    if (i6 == i) {
                        i = bVar.f3315d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3315d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3313b <= i) {
                i += bVar.f3315d;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(abstractC0140o);
        return -1;
    }

    public long getChangedHolderKey(AbstractC0129d0 abstractC0129d0) {
        return this.mAdapter.f948b ? abstractC0129d0.f931e : abstractC0129d0.f929c;
    }

    public int getChildAdapterPosition(View view) {
        AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.m509e();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC0135j interfaceC0135j = this.mChildDrawingOrderCallback;
        return interfaceC0135j == null ? super.getChildDrawingOrder(i, i2) : interfaceC0135j.m546a(i, i2);
    }

    public long getChildItemId(View view) {
        AbstractC0129d0 childViewHolderInt;
        AbstractC0132g abstractC0132g = this.mAdapter;
        if (abstractC0132g == null || !abstractC0132g.f948b || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.f931e;
    }

    public int getChildLayoutPosition(View view) {
        AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.m510f();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC0129d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C0558u getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C0136k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC0137l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C0141p c0141p = (C0141p) view.getLayoutParams();
        if (!c0141p.f983c) {
            return c0141p.f982b;
        }
        if (this.mState.f909g && (c0141p.m627b() || c0141p.f981a.m515k())) {
            return c0141p.f982b;
        }
        Rect rect = c0141p.f982b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).mo557d(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0141p.f983c = false;
        return rect;
    }

    public AbstractC0139n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public AbstractC0140o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0143r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C0146u getRecycledViewPool() {
        return this.mRecycler.m641d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m1550g(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m1989g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C0538a(new C0131f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(a.m2197k(this, a.m2191e("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C0549l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.didjdk.adbhelper.R.dimen.d5), resources.getDimensionPixelSize(com.didjdk.adbhelper.R.dimen.d7), resources.getDimensionPixelOffset(com.didjdk.adbhelper.R.dimen.d6));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            abstractC0140o.mo460d("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC0137l abstractC0137l = this.mItemAnimator;
        return abstractC0137l != null && abstractC0137l.mo554g();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, p006b.p032h.p044j.InterfaceC0409d
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2711d;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.mo450K0(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iM2003h = this.mChildHelper.m2003h();
        for (int i = 0; i < iM2003h; i++) {
            ((C0141p) this.mChildHelper.m2002g(i).getLayoutParams()).f983c = true;
        }
        C0147v c0147v = this.mRecycler;
        int size = c0147v.f993c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0141p c0141p = (C0141p) c0147v.f993c.get(i2).f927a.getLayoutParams();
            if (c0141p != null) {
                c0141p.f983c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iM2003h = this.mChildHelper.m2003h();
        for (int i = 0; i < iM2003h; i++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i));
            if (childViewHolderInt != null && !childViewHolderInt.m525u()) {
                childViewHolderInt.m506b(6);
            }
        }
        markItemDecorInsetsDirty();
        C0147v c0147v = this.mRecycler;
        int size = c0147v.f993c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0129d0 abstractC0129d0 = c0147v.f993c.get(i2);
            if (abstractC0129d0 != null) {
                abstractC0129d0.m506b(6);
                abstractC0129d0.m505a(null);
            }
        }
        AbstractC0132g abstractC0132g = RecyclerView.this.mAdapter;
        if (abstractC0132g == null || !abstractC0132g.f948b) {
            c0147v.m643f();
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int iM2000e = this.mChildHelper.m2000e();
        for (int i2 = 0; i2 < iM2000e; i2++) {
            this.mChildHelper.m1999d(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int iM2000e = this.mChildHelper.m2000e();
        for (int i2 = 0; i2 < iM2000e; i2++) {
            this.mChildHelper.m1999d(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iM2003h = this.mChildHelper.m2003h();
        for (int i3 = 0; i3 < iM2003h; i3++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.m525u() && childViewHolderInt.f929c >= i) {
                childViewHolderInt.m521q(i2, false);
                this.mState.f908f = true;
            }
        }
        C0147v c0147v = this.mRecycler;
        int size = c0147v.f993c.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0129d0 abstractC0129d0 = c0147v.f993c.get(i4);
            if (abstractC0129d0 != null && abstractC0129d0.f929c >= i) {
                abstractC0129d0.m521q(i2, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM2003h = this.mChildHelper.m2003h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM2003h; i11++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.f929c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    childViewHolderInt.m521q(i2 - i, false);
                } else {
                    childViewHolderInt.m521q(i5, false);
                }
                this.mState.f908f = true;
            }
        }
        C0147v c0147v = this.mRecycler;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = c0147v.f993c.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC0129d0 abstractC0129d0 = c0147v.f993c.get(i12);
            if (abstractC0129d0 != null && (i8 = abstractC0129d0.f929c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0129d0.m521q(i2 - i, false);
                } else {
                    abstractC0129d0.m521q(i10, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM2003h = this.mChildHelper.m2003h();
        for (int i4 = 0; i4 < iM2003h; i4++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.m525u()) {
                int i5 = childViewHolderInt.f929c;
                if (i5 >= i3) {
                    childViewHolderInt.m521q(-i2, z);
                } else if (i5 >= i) {
                    childViewHolderInt.m506b(8);
                    childViewHolderInt.m521q(-i2, z);
                    childViewHolderInt.f929c = i - 1;
                }
                this.mState.f908f = true;
            }
        }
        C0147v c0147v = this.mRecycler;
        int size = c0147v.f993c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            AbstractC0129d0 abstractC0129d0 = c0147v.f993c.get(size);
            if (abstractC0129d0 != null) {
                int i6 = abstractC0129d0.f929c;
                if (i6 >= i3) {
                    abstractC0129d0.m521q(-i2, z);
                } else if (i6 >= i) {
                    abstractC0129d0.m506b(8);
                    c0147v.m644g(size);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            abstractC0140o.f966i = true;
            abstractC0140o.m606d0();
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<RunnableC0550m> threadLocal = RunnableC0550m.f3408f;
            RunnableC0550m runnableC0550m = threadLocal.get();
            this.mGapWorker = runnableC0550m;
            if (runnableC0550m == null) {
                this.mGapWorker = new RunnableC0550m();
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC0550m runnableC0550m2 = this.mGapWorker;
                runnableC0550m2.f3412d = (long) (1.0E9f / f);
                threadLocal.set(runnableC0550m2);
            }
            this.mGapWorker.f3410b.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC0550m runnableC0550m;
        super.onDetachedFromWindow();
        AbstractC0137l abstractC0137l = this.mItemAnimator;
        if (abstractC0137l != null) {
            abstractC0137l.mo553f();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            C0147v c0147v = this.mRecycler;
            abstractC0140o.f966i = false;
            abstractC0140o.mo465f0(this, c0147v);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        Objects.requireNonNull(this.mViewInfoStore);
        while (C0563z.a.f3466d.mo1537b() != null) {
        }
        if (!ALLOW_THREAD_GAP_WORK || (runnableC0550m = this.mGapWorker) == null) {
            return;
        }
        runnableC0550m.f3410b.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo558e(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.mo464f() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.mo462e() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.mo464f()) {
                    f = -axisValue2;
                } else if (this.mLayout.mo462e()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                scrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            return false;
        }
        boolean zMo462e = abstractC0140o.mo462e();
        boolean zMo464f = this.mLayout.mo464f();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zMo462e;
            if (zMo464f) {
                i = (zMo462e ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                StringBuilder sbM2191e = a.m2191e("Error processing scroll; pointer index for id ");
                sbM2191e.append(this.mScrollPointerId);
                sbM2191e.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, sbM2191e.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zMo462e || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zMo464f && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC0140o.mo452U()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.m615u0(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f906d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.m587N0(i, i2);
            this.mState.f911i = true;
            dispatchLayoutStep2();
            this.mLayout.m590P0(i, i2);
            if (this.mLayout.mo451S0()) {
                this.mLayout.m587N0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f911i = true;
                dispatchLayoutStep2();
                this.mLayout.m590P0(i, i2);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.m615u0(i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            C0123a0 c0123a0 = this.mState;
            if (c0123a0.f913k) {
                c0123a0.f909g = true;
            } else {
                this.mAdapterHelper.m1985c();
                this.mState.f909g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f913k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0132g abstractC0132g = this.mAdapter;
        if (abstractC0132g != null) {
            this.mState.f907e = abstractC0132g.mo533a();
        } else {
            this.mState.f907e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.m615u0(i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f909g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0150y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0150y c0150y = (C0150y) parcelable;
        this.mPendingSavedState = c0150y;
        super.onRestoreInstanceState(c0150y.f2812b);
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null || (parcelable2 = this.mPendingSavedState.f1000d) == null) {
            return;
        }
        abstractC0140o.mo487x0(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0150y c0150y = new C0150y(super.onSaveInstanceState());
        C0150y c0150y2 = this.mPendingSavedState;
        if (c0150y2 != null) {
            c0150y.f1000d = c0150y2.f1000d;
        } else {
            AbstractC0140o abstractC0140o = this.mLayout;
            c0150y.f1000d = abstractC0140o != null ? abstractC0140o.mo489y0() : null;
        }
        return c0150y;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[PHI: r0
      0x00d9: PHI (r0v38 int) = (r0v26 int), (r0v42 int) binds: [B:41:0x00c4, B:46:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        boolean z2 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            return false;
        }
        boolean zMo462e = abstractC0140o.mo462e();
        boolean zMo464f = this.mLayout.mo464f();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (zMo464f) {
                i = zMo462e;
                i = (zMo462e ? 1 : 0) | 2;
            }
            i = zMo462e;
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.addMovement(motionEventObtain);
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
            float f = zMo462e ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f2 = zMo464f ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                setScrollState(0);
            }
            resetScroll();
            z2 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                StringBuilder sbM2191e = a.m2191e("Error processing scroll; pointer index for id ");
                sbM2191e.append(this.mScrollPointerId);
                sbM2191e.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, sbM2191e.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int iMax = this.mLastTouchX - x2;
            int iMax2 = this.mLastTouchY - y2;
            if (this.mScrollState != 1) {
                if (zMo462e) {
                    int i2 = this.mTouchSlop;
                    iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                    if (iMax != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (zMo464f) {
                    int i3 = this.mTouchSlop;
                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                    if (iMax2 != 0) {
                        z = true;
                    }
                }
                if (z) {
                    setScrollState(1);
                }
            }
            int i4 = iMax;
            int i5 = iMax2;
            if (this.mScrollState == 1) {
                int[] iArr3 = this.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (dispatchNestedPreScroll(zMo462e ? i4 : 0, zMo464f ? i5 : 0, iArr3, this.mScrollOffset, 0)) {
                    int[] iArr4 = this.mReusableIntPair;
                    i4 -= iArr4[0];
                    i5 -= iArr4[1];
                    int[] iArr5 = this.mNestedOffsets;
                    int i6 = iArr5[0];
                    int[] iArr6 = this.mScrollOffset;
                    iArr5[0] = i6 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i7 = i5;
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x2 - iArr7[0];
                this.mLastTouchY = y2 - iArr7[1];
                if (scrollByInternal(zMo462e ? i4 : 0, zMo464f ? i7 : 0, motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                RunnableC0550m runnableC0550m = this.mGapWorker;
                if (runnableC0550m != null && (i4 != 0 || i7 != 0)) {
                    runnableC0550m.m2028a(this, i4, i7);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z2) {
            this.mVelocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC0129d0 abstractC0129d0, AbstractC0137l.c cVar) {
        abstractC0129d0.m523s(0, 8192);
        if (this.mState.f910h && abstractC0129d0.m520p() && !abstractC0129d0.m517m() && !abstractC0129d0.m525u()) {
            this.mViewInfoStore.f3465b.m1255g(getChangedHolderKey(abstractC0129d0), abstractC0129d0);
        }
        this.mViewInfoStore.m2068c(abstractC0129d0, cVar);
    }

    public void removeAndRecycleViews() {
        AbstractC0137l abstractC0137l = this.mItemAnimator;
        if (abstractC0137l != null) {
            abstractC0137l.mo553f();
        }
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            abstractC0140o.m568C0(this.mRecycler);
            this.mLayout.m570D0(this.mRecycler);
        }
        this.mRecycler.m639b();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C0539b c0539b = this.mChildHelper;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        boolean z = true;
        if (iIndexOfChild == -1) {
            c0539b.m2007l(view);
        } else if (c0539b.f3317b.m2011d(iIndexOfChild)) {
            c0539b.f3317b.m2013f(iIndexOfChild);
            c0539b.m2007l(view);
            ((C0130e) c0539b.f3316a).m529c(iIndexOfChild);
        } else {
            z = false;
        }
        if (z) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m649l(childViewHolderInt);
            this.mRecycler.m646i(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.m519o()) {
                childViewHolderInt.f936j &= -257;
            } else if (!childViewHolderInt.m525u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(a.m2197k(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(AbstractC0139n abstractC0139n) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o != null) {
            abstractC0140o.mo460d("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC0139n);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC0142q interfaceC0142q) {
        List<InterfaceC0142q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0142q);
    }

    public void removeOnItemTouchListener(InterfaceC0144s interfaceC0144s) {
        this.mOnItemTouchListeners.remove(interfaceC0144s);
        if (this.mInterceptingOnItemTouchListener == interfaceC0144s) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC0145t abstractC0145t) {
        List<AbstractC0145t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC0145t);
        }
    }

    public void repositionShadowingViews() {
        AbstractC0129d0 abstractC0129d0;
        int iM2000e = this.mChildHelper.m2000e();
        for (int i = 0; i < iM2000e; i++) {
            View viewM1999d = this.mChildHelper.m1999d(i);
            AbstractC0129d0 childViewHolder = getChildViewHolder(viewM1999d);
            if (childViewHolder != null && (abstractC0129d0 = childViewHolder.f935i) != null) {
                View view = abstractC0129d0.f927a;
                int left = viewM1999d.getLeft();
                int top = viewM1999d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.m617w0(this, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.m578H0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo633c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iM2003h = this.mChildHelper.m2003h();
        for (int i = 0; i < iM2003h; i++) {
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2002g(i));
            if (!childViewHolderInt.m525u() && childViewHolderInt.f930d == -1) {
                childViewHolderInt.f930d = childViewHolderInt.f929c;
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zMo462e = abstractC0140o.mo462e();
        boolean zMo464f = this.mLayout.mo464f();
        if (zMo462e || zMo464f) {
            if (!zMo462e) {
                i = 0;
            }
            if (!zMo464f) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i3 = i8;
            i4 = i7;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i3, i5, i6, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i9 = i5 - iArr4[0];
        int i10 = i6 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i11 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i11 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    pullGlows(motionEvent.getX(), i9, motionEvent.getY(), i10);
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i4 != 0 || i3 != 0) {
            dispatchOnScrolled(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i3 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iMo413J0 = i != 0 ? this.mLayout.mo413J0(i, this.mRecycler, this.mState) : 0;
        int iMo416L0 = i2 != 0 ? this.mLayout.mo416L0(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iMo413J0;
            iArr[1] = iMo416L0;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0140o.mo450K0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0558u c0558u) {
        this.mAccessibilityDelegate = c0558u;
        C0418m.m1577t(this, c0558u);
    }

    public void setAdapter(AbstractC0132g abstractC0132g) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0132g, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0135j interfaceC0135j) {
        if (interfaceC0135j == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC0135j;
        setChildrenDrawingOrderEnabled(interfaceC0135j != null);
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC0129d0 abstractC0129d0, int i) {
        if (isComputingLayout()) {
            abstractC0129d0.f943q = i;
            this.mPendingAccessibilityImportanceChange.add(abstractC0129d0);
            return false;
        }
        View view = abstractC0129d0.f927a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        view.setImportantForAccessibility(i);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0136k c0136k) {
        Objects.requireNonNull(c0136k);
        this.mEdgeEffectFactory = c0136k;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(AbstractC0137l abstractC0137l) {
        AbstractC0137l abstractC0137l2 = this.mItemAnimator;
        if (abstractC0137l2 != null) {
            abstractC0137l2.mo553f();
            this.mItemAnimator.f949a = null;
        }
        this.mItemAnimator = abstractC0137l;
        if (abstractC0137l != null) {
            abstractC0137l.f949a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0147v c0147v = this.mRecycler;
        c0147v.f995e = i;
        c0147v.m650m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0140o abstractC0140o) {
        if (abstractC0140o == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC0137l abstractC0137l = this.mItemAnimator;
            if (abstractC0137l != null) {
                abstractC0137l.mo553f();
            }
            this.mLayout.m568C0(this.mRecycler);
            this.mLayout.m570D0(this.mRecycler);
            this.mRecycler.m639b();
            if (this.mIsAttached) {
                AbstractC0140o abstractC0140o2 = this.mLayout;
                C0147v c0147v = this.mRecycler;
                abstractC0140o2.f966i = false;
                abstractC0140o2.mo465f0(this, c0147v);
            }
            this.mLayout.m591Q0(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m639b();
        }
        C0539b c0539b = this.mChildHelper;
        C0539b.a aVar = c0539b.f3317b;
        aVar.f3319a = 0L;
        C0539b.a aVar2 = aVar.f3320b;
        if (aVar2 != null) {
            aVar2.m2014g();
        }
        int size = c0539b.f3318c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0539b.b bVar = c0539b.f3316a;
            View view = c0539b.f3318c.get(size);
            C0130e c0130e = (C0130e) bVar;
            Objects.requireNonNull(c0130e);
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                RecyclerView.this.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.f942p);
                childViewHolderInt.f942p = 0;
            }
            c0539b.f3318c.remove(size);
        }
        C0130e c0130e2 = (C0130e) c0539b.f3316a;
        int iM528b = c0130e2.m528b();
        for (int i = 0; i < iM528b; i++) {
            View viewM527a = c0130e2.m527a(i);
            RecyclerView.this.dispatchChildDetached(viewM527a);
            viewM527a.clearAnimation();
        }
        RecyclerView.this.removeAllViews();
        this.mLayout = abstractC0140o;
        if (abstractC0140o != null) {
            if (abstractC0140o.f959b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(abstractC0140o);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a.m2197k(abstractC0140o.f959b, sb));
            }
            abstractC0140o.m591Q0(this);
            if (this.mIsAttached) {
                AbstractC0140o abstractC0140o3 = this.mLayout;
                abstractC0140o3.f966i = true;
                abstractC0140o3.m606d0();
            }
        }
        this.mRecycler.m650m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m1551h(z);
    }

    public void setOnFlingListener(AbstractC0143r abstractC0143r) {
        this.mOnFlingListener = abstractC0143r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0145t abstractC0145t) {
        this.mScrollListener = abstractC0145t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C0146u c0146u) {
        C0147v c0147v = this.mRecycler;
        C0146u c0146u2 = c0147v.f997g;
        if (c0146u2 != null) {
            c0146u2.f986b--;
        }
        c0147v.f997g = c0146u;
        if (c0146u == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        c0147v.f997g.f986b++;
    }

    public void setRecyclerListener(InterfaceC0148w interfaceC0148w) {
        this.mRecyclerListener = interfaceC0148w;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i != 1) {
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.mTouchSlop = scaledTouchSlop;
    }

    public void setViewCacheExtension(AbstractC0125b0 abstractC0125b0) {
        Objects.requireNonNull(this.mRecycler);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC0140o.mo462e()) {
            i = 0;
        }
        if (!this.mLayout.mo464f()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.m503b(i, i2, i3, interpolator);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC0140o abstractC0140o = this.mLayout;
        if (abstractC0140o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0140o.mo453U0(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m1552i(i, 0);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m1552i(i, i2);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, p006b.p032h.p044j.InterfaceC0409d
    public void stopNestedScroll() {
        getScrollingChildHelper().m1553j(0);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m1553j(i);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(AbstractC0132g abstractC0132g, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0132g, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int iM2003h = this.mChildHelper.m2003h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM2003h; i6++) {
            View viewM2002g = this.mChildHelper.m2002g(i6);
            AbstractC0129d0 childViewHolderInt = getChildViewHolderInt(viewM2002g);
            if (childViewHolderInt != null && !childViewHolderInt.m525u() && (i4 = childViewHolderInt.f929c) >= i && i4 < i5) {
                childViewHolderInt.m506b(2);
                childViewHolderInt.m505a(obj);
                ((C0141p) viewM2002g.getLayoutParams()).f983c = true;
            }
        }
        C0147v c0147v = this.mRecycler;
        int size = c0147v.f993c.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            AbstractC0129d0 abstractC0129d0 = c0147v.f993c.get(size);
            if (abstractC0129d0 != null && (i3 = abstractC0129d0.f929c) >= i && i3 < i5) {
                abstractC0129d0.m506b(2);
                c0147v.m644g(size);
            }
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m1548e(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m1549f(i) != null;
    }
}
