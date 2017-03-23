package com.arlib.floatingsearchview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ah;
import android.support.v4.view.bd;
import android.support.v4.view.be;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.arlib.floatingsearchview.util.view.MenuView;
import com.arlib.floatingsearchview.util.view.SearchInputView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class FloatingSearchView extends FrameLayout {
    private String A;
    private boolean B;
    private int C;
    private int D;
    private View E;
    private String F;
    private f G;
    private ImageView H;
    private d I;
    private c J;
    private ProgressBar K;
    private android.support.v7.b.a.b L;
    private Drawable M;
    private Drawable N;
    private int O;
    private String P;
    private boolean Q;
    private boolean R;
    private MenuView S;
    private int T;
    private int U;
    private int V;
    private e W;
    int a;
    private ImageView aa;
    private int ab;
    private Drawable ac;
    private int ad;
    private boolean ae;
    private boolean af;
    private View ag;
    private int ah;
    private RelativeLayout ai;
    private View aj;
    private RecyclerView ak;
    private int al;
    private int am;
    private com.arlib.floatingsearchview.a.a an;
    private com.arlib.floatingsearchview.a.a.b ao;
    private int ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private i at;
    private long au;
    private h av;
    private android.support.v4.widget.DrawerLayout.f aw;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int l;
    private final boolean m;
    private final Interpolator n;
    private final int o;
    private Activity p;
    private View q;
    private Drawable r;
    private boolean s;
    private boolean t;
    private boolean u;
    private b v;
    private CardView w;
    private g x;
    private SearchInputView y;
    private boolean z;

    private interface h {
        void a();
    }

    private class a implements android.support.v4.widget.DrawerLayout.f {
        final /* synthetic */ FloatingSearchView a;

        private a(FloatingSearchView floatingSearchView) {
            this.a = floatingSearchView;
        }

        public void a(int i) {
        }

        public void a(View view) {
        }

        public void a(View view, float f) {
            this.a.setMenuIconProgress(f);
        }

        public void b(View view) {
        }
    }

    public interface b {
        void a();

        void b();
    }

    public interface c {
        void a();
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void a(MenuItem menuItem);
    }

    public interface f {
        void a(String str, String str2);
    }

    public interface g {
        void a(com.arlib.floatingsearchview.a.a.a aVar);

        void a(String str);
    }

    public interface i {
        void a(float f);
    }

    static class j extends BaseSavedState {
        public static final Creator<j> CREATOR = new Creator<j>() {
            public j a(Parcel parcel) {
                return new j(parcel);
            }

            public j[] a(int i) {
                return new j[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }
        };
        private List<? extends com.arlib.floatingsearchview.a.a.a> a;
        private boolean b;
        private String c;
        private int d;
        private String e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private boolean v;
        private long w;
        private boolean x;

        private j(Parcel parcel) {
            boolean z = true;
            super(parcel);
            this.a = new ArrayList();
            parcel.readList(this.a, getClass().getClassLoader());
            this.b = parcel.readInt() != 0;
            this.c = parcel.readString();
            this.d = parcel.readInt();
            this.e = parcel.readString();
            this.f = parcel.readInt() != 0;
            this.g = parcel.readInt() != 0;
            this.h = parcel.readInt() != 0;
            this.i = parcel.readInt() != 0;
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readInt();
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt();
            this.v = parcel.readInt() != 0;
            this.w = parcel.readLong();
            if (parcel.readInt() == 0) {
                z = false;
            }
            this.x = z;
        }

        j(Parcelable parcelable) {
            super(parcelable);
            this.a = new ArrayList();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 1;
            super.writeToParcel(parcel, i);
            parcel.writeList(this.a);
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
            parcel.writeString(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeInt(this.q);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeLong(this.w);
            if (!this.x) {
                i2 = 0;
            }
            parcel.writeInt(i2);
        }
    }

    public FloatingSearchView(Context context) {
        this(context, null);
    }

    public FloatingSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 150;
        this.c = 0;
        this.d = SQLiteDatabase.MAX_SQL_CACHE_SIZE;
        this.e = SQLiteDatabase.MAX_SQL_CACHE_SIZE;
        this.f = 0;
        this.g = 4;
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = 18;
        this.m = true;
        this.n = new LinearInterpolator();
        this.o = SQLiteDatabase.MAX_SQL_CACHE_SIZE;
        this.t = true;
        this.C = -1;
        this.D = -1;
        this.F = "";
        this.a = -1;
        this.R = false;
        this.T = -1;
        this.al = -1;
        this.aq = true;
        this.as = false;
        this.aw = new a();
        a(attributeSet);
    }

    private int a(List<? extends com.arlib.floatingsearchview.a.a.a> list, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size() && i2 < this.ak.getChildCount()) {
            i3 += this.ak.getChildAt(i2).getHeight();
            if (i3 > i) {
                return i;
            }
            i2++;
        }
        return i3;
    }

    private void a(final android.support.v7.b.a.b bVar, boolean z) {
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
                final /* synthetic */ FloatingSearchView b;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bVar.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat.setDuration(250);
            ofFloat.start();
            return;
        }
        bVar.c(1.0f);
    }

    private void a(AttributeSet attributeSet) {
        this.p = getHostActivity();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        this.q = inflate(getContext(), R.layout.floating_search_layout, this);
        this.r = new ColorDrawable(-16777216);
        this.w = (CardView) findViewById(R.id.search_query_section);
        this.aa = (ImageView) findViewById(R.id.clear_btn);
        this.y = (SearchInputView) findViewById(R.id.search_bar_text);
        this.E = findViewById(R.id.search_input_parent);
        this.H = (ImageView) findViewById(R.id.left_action);
        this.K = (ProgressBar) findViewById(R.id.search_bar_search_progress);
        e();
        this.aa.setImageDrawable(this.ac);
        this.S = (MenuView) findViewById(R.id.menu_view);
        this.ag = findViewById(R.id.divider);
        this.ai = (RelativeLayout) findViewById(R.id.search_suggestions_section);
        this.aj = findViewById(R.id.suggestions_list_container);
        this.ak = (RecyclerView) findViewById(R.id.suggestions_list);
        setupViews(attributeSet);
    }

    private void a(ImageView imageView, Drawable drawable, boolean z) {
        imageView.setImageDrawable(drawable);
        if (z) {
            ObjectAnimator.ofFloat(imageView, "alpha", new float[]{0.0f, 1.0f}).start();
        } else {
            imageView.setAlpha(1.0f);
        }
    }

    private void a(final List<? extends com.arlib.floatingsearchview.a.a.a> list, final boolean z) {
        this.ak.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            final /* synthetic */ FloatingSearchView c;

            public void onGlobalLayout() {
                com.arlib.floatingsearchview.util.b.a(this.c.ak, (OnGlobalLayoutListener) this);
                this.c.b(list, z);
            }
        });
        this.an.a((List) list);
        this.ag.setVisibility(!list.isEmpty() ? 0 : 8);
    }

    private void b(int i) {
        if (i == 0) {
            this.aa.setTranslationX((float) (-com.arlib.floatingsearchview.util.b.a(4)));
            int a = com.arlib.floatingsearchview.util.b.a(4);
            this.y.setPadding(0, 0, this.u ? a + com.arlib.floatingsearchview.util.b.a(48) : a + com.arlib.floatingsearchview.util.b.a(14), 0);
            return;
        }
        this.aa.setTranslationX((float) (-i));
        if (this.u) {
            i += com.arlib.floatingsearchview.util.b.a(48);
        }
        this.y.setPadding(0, 0, i, 0);
    }

    private void b(final android.support.v7.b.a.b bVar, boolean z) {
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
                final /* synthetic */ FloatingSearchView b;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bVar.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat.setDuration(250);
            ofFloat.start();
            return;
        }
        bVar.c(0.0f);
    }

    private void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.FloatingSearchView);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingSearchView_floatingSearch_searchBarWidth, -1);
            this.w.getLayoutParams().width = dimensionPixelSize;
            this.ag.getLayoutParams().width = dimensionPixelSize;
            this.aj.getLayoutParams().width = dimensionPixelSize;
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingSearchView_floatingSearch_searchBarMarginLeft, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingSearchView_floatingSearch_searchBarMarginTop, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingSearchView_floatingSearch_searchBarMarginRight, 0);
            LayoutParams layoutParams = (LayoutParams) this.w.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.ag.getLayoutParams();
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.ai.getLayoutParams();
            int a = com.arlib.floatingsearchview.util.b.a(3);
            layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, 0);
            layoutParams2.setMargins(dimensionPixelSize2 + a, 0, a + dimensionPixelSize4, ((MarginLayoutParams) this.ag.getLayoutParams()).bottomMargin);
            layoutParams3.setMargins(dimensionPixelSize2, 0, dimensionPixelSize4, 0);
            this.w.setLayoutParams(layoutParams);
            this.ag.setLayoutParams(layoutParams2);
            this.ai.setLayoutParams(layoutParams3);
            setSearchHint(obtainStyledAttributes.getString(R.styleable.FloatingSearchView_floatingSearch_searchHint));
            setShowSearchKey(obtainStyledAttributes.getBoolean(R.styleable.FloatingSearchView_floatingSearch_showSearchKey, true));
            setCloseSearchOnKeyboardDismiss(obtainStyledAttributes.getBoolean(R.styleable.FloatingSearchView_floatingSearch_close_search_on_keyboard_dismiss, false));
            setDismissOnOutsideClick(obtainStyledAttributes.getBoolean(R.styleable.FloatingSearchView_floatingSearch_dismissOnOutsideTouch, true));
            setSuggestionItemTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingSearchView_floatingSearch_searchSuggestionTextSize, com.arlib.floatingsearchview.util.b.b(18)));
            this.a = obtainStyledAttributes.getInt(R.styleable.FloatingSearchView_floatingSearch_leftActionMode, 4);
            if (obtainStyledAttributes.hasValue(R.styleable.FloatingSearchView_floatingSearch_menu)) {
                this.T = obtainStyledAttributes.getResourceId(R.styleable.FloatingSearchView_floatingSearch_menu, -1);
            }
            setDimBackground(obtainStyledAttributes.getBoolean(R.styleable.FloatingSearchView_floatingSearch_dimBackground, true));
            setShowMoveUpSuggestion(obtainStyledAttributes.getBoolean(R.styleable.FloatingSearchView_floatingSearch_showMoveSuggestionUp, false));
            this.au = (long) obtainStyledAttributes.getInt(R.styleable.FloatingSearchView_floatingSearch_suggestionsListAnimDuration, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            setBackgroundColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_backgroundColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.background)));
            setLeftActionIconColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_leftActionColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.left_action_icon)));
            setActionMenuOverflowColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_actionMenuOverflowColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.overflow_icon_color)));
            setMenuItemIconColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_menuItemIconColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.menu_icon_color)));
            setDividerColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_dividerColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.divider)));
            setClearBtnColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_clearBtnColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.clear_btn_color)));
            setViewTextColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_viewTextColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.dark_gray)));
            setHintTextColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_hintTextColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.hint_color)));
            setSuggestionRightIconColor(obtainStyledAttributes.getColor(R.styleable.FloatingSearchView_floatingSearch_suggestionRightIconColor, com.arlib.floatingsearchview.util.b.b(getContext(), R.color.gray_active_icon)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void b(List<? extends com.arlib.floatingsearchview.a.a.a> list, boolean z) {
        boolean z2 = false;
        int a = com.arlib.floatingsearchview.util.b.a(5);
        int a2 = com.arlib.floatingsearchview.util.b.a(3);
        int a3 = a((List) list, this.aj.getHeight());
        int height = this.aj.getHeight() - a3;
        a = height <= a ? -(a - height) : height < this.aj.getHeight() - a ? a2 : 0;
        final float f = (float) (a + (a3 + (-this.aj.getHeight())));
        if (f >= this.aj.getTranslationY()) {
            z2 = true;
        }
        final float f2 = (float) (a2 + (-this.aj.getHeight()));
        ah.s(this.aj).b();
        if (z) {
            ah.s(this.aj).a(this.n).a(this.au).c(f).a(new be(this) {
                final /* synthetic */ FloatingSearchView b;

                public void a(View view) {
                    if (this.b.at != null) {
                        this.b.at.a(Math.abs(view.getTranslationY() - f2));
                    }
                }
            }).a(new bd(this) {
                final /* synthetic */ FloatingSearchView c;

                public void a(View view) {
                    if (!z2) {
                        this.c.ak.b(0);
                    }
                }

                public void b(View view) {
                    if (z2) {
                        int a = this.c.ak.getAdapter().a() - 1;
                        if (a > -1) {
                            this.c.ak.b(a);
                        }
                    }
                }

                public void c(View view) {
                    this.c.aj.setTranslationY(f);
                }
            }).c();
            return;
        }
        this.aj.setTranslationY(f);
        if (this.at != null) {
            this.at.a(Math.abs(this.aj.getTranslationY() - f2));
        }
    }

    private void c(boolean z) {
        if (this.K.getVisibility() != 0) {
            this.H.setVisibility(0);
        } else {
            this.H.setVisibility(4);
        }
        ObjectAnimator a;
        ObjectAnimator a2;
        switch (this.a) {
            case 1:
                a(this.L, z);
                if (!this.R) {
                    return;
                }
                return;
            case 2:
                this.H.setImageDrawable(this.M);
                if (z) {
                    this.H.setRotation(45.0f);
                    this.H.setAlpha(0.0f);
                    a = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).f(0.0f).a();
                    a2 = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).e(1.0f).a();
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(500);
                    animatorSet.playTogether(new Animator[]{a, a2});
                    animatorSet.start();
                    return;
                }
                return;
            case 4:
                this.H.setImageDrawable(this.M);
                if (z) {
                    a = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.E).c(0.0f).a();
                    this.H.setScaleX(0.5f);
                    this.H.setScaleY(0.5f);
                    this.H.setAlpha(0.0f);
                    this.H.setTranslationX((float) com.arlib.floatingsearchview.util.b.a(8));
                    a2 = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).c(1.0f).a();
                    ObjectAnimator a3 = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).a(1.0f).a();
                    ObjectAnimator a4 = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).b(1.0f).a();
                    ObjectAnimator a5 = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).e(1.0f).a();
                    a2.setStartDelay(150);
                    a3.setStartDelay(150);
                    a4.setStartDelay(150);
                    a5.setStartDelay(150);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(500);
                    animatorSet2.playTogether(new Animator[]{a, a2, a3, a4, a5});
                    animatorSet2.start();
                    return;
                }
                this.E.setTranslationX(0.0f);
                return;
            default:
                return;
        }
    }

    private void d(boolean z) {
        switch (this.a) {
            case 1:
                b(this.L, z);
                return;
            case 2:
                a(this.H, this.N, z);
                return;
            case 4:
                this.H.setImageDrawable(this.M);
                if (z) {
                    ObjectAnimator a = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.E).c((float) (-com.arlib.floatingsearchview.util.b.a(52))).a();
                    ObjectAnimator a2 = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).a(0.5f).a();
                    ObjectAnimator a3 = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).b(0.5f).a();
                    ObjectAnimator a4 = com.bartoszlipinski.viewpropertyobjectanimator.f.a(this.H).e(0.5f).a();
                    a2.setDuration(300);
                    a3.setDuration(300);
                    a4.setDuration(300);
                    a2.addListener(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ FloatingSearchView a;

                        {
                            this.a = r1;
                        }

                        public void onAnimationEnd(Animator animator) {
                            this.a.H.setScaleX(1.0f);
                            this.a.H.setScaleY(1.0f);
                            this.a.H.setAlpha(1.0f);
                            this.a.H.setVisibility(4);
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(350);
                    animatorSet.playTogether(new Animator[]{a2, a3, a4, a});
                    animatorSet.start();
                    return;
                }
                this.H.setVisibility(4);
                return;
            default:
                return;
        }
    }

    private void e() {
        this.L = new android.support.v7.b.a.b(getContext());
        this.ac = com.arlib.floatingsearchview.util.b.a(getContext(), R.drawable.ic_clear_black_24dp);
        this.M = com.arlib.floatingsearchview.util.b.a(getContext(), R.drawable.ic_arrow_back_black_24dp);
        this.N = com.arlib.floatingsearchview.util.b.a(getContext(), R.drawable.ic_search_black_24dp);
    }

    private void f() {
        this.y.setTextColor(this.C);
        this.y.setHintTextColor(this.D);
        if (!(isInEditMode() || this.p == null)) {
            this.p.getWindow().setSoftInputMode(32);
        }
        this.w.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void onGlobalLayout() {
                com.arlib.floatingsearchview.util.b.a(this.a.w, (OnGlobalLayoutListener) this);
                this.a.a(this.a.T);
            }
        });
        this.S.setMenuCallback(new android.support.v7.view.menu.h.a(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void a(android.support.v7.view.menu.h hVar) {
            }

            public boolean a(android.support.v7.view.menu.h hVar, MenuItem menuItem) {
                if (this.a.W != null) {
                    this.a.W.a(menuItem);
                }
                return false;
            }
        });
        this.S.setOnVisibleWidthChanged(new com.arlib.floatingsearchview.util.view.MenuView.b(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void a(int i) {
                this.a.b(i);
            }
        });
        this.S.setActionIconColor(this.U);
        this.S.setOverflowColor(this.V);
        this.aa.setVisibility(4);
        this.aa.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.y.setText("");
            }
        });
        this.y.addTextChangedListener(new com.arlib.floatingsearchview.util.a.c(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (this.a.af || !this.a.u) {
                    this.a.af = false;
                } else {
                    if (this.a.y.getText().toString().length() != 0 && this.a.aa.getVisibility() == 4) {
                        this.a.aa.setAlpha(0.0f);
                        this.a.aa.setVisibility(0);
                        ah.s(this.a.aa).a(1.0f).a(500).c();
                    } else if (this.a.y.getText().toString().length() == 0) {
                        this.a.aa.setVisibility(4);
                    }
                    if (!(this.a.G == null || !this.a.u || this.a.F.equals(this.a.y.getText().toString()))) {
                        this.a.G.a(this.a.F, this.a.y.getText().toString());
                    }
                }
                this.a.F = this.a.y.getText().toString();
            }
        });
        this.y.setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (this.a.ae) {
                    this.a.ae = false;
                } else if (z != this.a.u) {
                    this.a.setSearchFocusedInternal(z);
                }
            }
        });
        this.y.setOnKeyboardDismissedListener(new com.arlib.floatingsearchview.util.view.SearchInputView.a(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void a() {
                if (this.a.z) {
                    this.a.setSearchFocusedInternal(false);
                }
            }
        });
        this.y.setOnSearchKeyListener(new com.arlib.floatingsearchview.util.view.SearchInputView.b(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void a() {
                if (this.a.x != null) {
                    this.a.x.a(this.a.getQuery());
                }
                this.a.af = true;
                this.a.af = true;
                if (this.a.B) {
                    this.a.setSearchBarTitle(this.a.getQuery());
                } else {
                    this.a.setSearchText(this.a.getQuery());
                }
                this.a.setSearchFocusedInternal(false);
            }
        });
        this.H.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.d()) {
                    this.a.setSearchFocusedInternal(false);
                    return;
                }
                switch (this.a.a) {
                    case 1:
                        this.a.i();
                        return;
                    case 2:
                        this.a.setSearchFocusedInternal(true);
                        return;
                    case 3:
                        if (this.a.J != null) {
                            this.a.J.a();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        });
        h();
    }

    private int g() {
        return isInEditMode() ? this.w.getMeasuredWidth() / 2 : this.w.getWidth() / 2;
    }

    private Activity getHostActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private void h() {
        int i = 0;
        int a = com.arlib.floatingsearchview.util.b.a(52);
        this.H.setVisibility(0);
        switch (this.a) {
            case 1:
                this.H.setImageDrawable(this.L);
                break;
            case 2:
                this.H.setImageDrawable(this.N);
                break;
            case 3:
                this.H.setImageDrawable(this.L);
                this.L.c(1.0f);
                break;
            case 4:
                this.H.setVisibility(4);
                i = -a;
                break;
        }
        this.E.setTranslationX((float) i);
    }

    private void i() {
        if (this.R) {
            b(true);
        } else {
            a(true);
        }
    }

    private void j() {
        if (this.s && this.u) {
            this.r.setAlpha(150);
        } else {
            this.r.setAlpha(0);
        }
    }

    private void k() {
        if (this.an != null) {
            this.an.a(this.as);
        }
    }

    private void l() {
        this.ak.setLayoutManager(new LinearLayoutManager(getContext(), 1, true));
        this.ak.setItemAnimator(null);
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new com.arlib.floatingsearchview.util.a.a(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.a.p != null) {
                    com.arlib.floatingsearchview.util.b.a(this.a.p);
                }
                return false;
            }
        });
        this.ak.a(new com.arlib.floatingsearchview.util.a.b(this) {
            final /* synthetic */ FloatingSearchView b;

            public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            }
        });
        this.an = new com.arlib.floatingsearchview.a.a(getContext(), this.ap, new com.arlib.floatingsearchview.a.a.a(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void a(com.arlib.floatingsearchview.a.a.a aVar) {
                this.a.u = false;
                if (this.a.x != null) {
                    this.a.x.a(aVar);
                }
                this.a.af = true;
                if (this.a.B) {
                    this.a.setSearchBarTitle(aVar.a());
                } else {
                    this.a.setSearchText(aVar.a());
                }
                this.a.setSearchFocusedInternal(false);
            }

            public void b(com.arlib.floatingsearchview.a.a.a aVar) {
                this.a.y.setText(aVar.a());
                this.a.y.setSelection(this.a.y.getText().length());
            }
        });
        k();
        this.an.d(this.al);
        this.an.e(this.am);
        this.ak.setAdapter(this.an);
        this.ai.setTranslationY((float) (-com.arlib.floatingsearchview.util.b.a(5)));
    }

    private void m() {
        this.aj.setTranslationY((float) (-this.aj.getHeight()));
    }

    private void n() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{150, 0});
        ofInt.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.r.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration(250);
        ofInt.start();
    }

    private void o() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 150});
        ofInt.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.r.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration(250);
        ofInt.start();
    }

    private void setSearchFocusedInternal(boolean z) {
        int i = 0;
        this.u = z;
        if (z) {
            this.y.requestFocus();
            m();
            this.ai.setVisibility(0);
            if (this.s) {
                o();
            }
            b(0);
            this.S.a(true);
            c(true);
            com.arlib.floatingsearchview.util.b.a(getContext(), this.y);
            if (this.R) {
                b(false);
            }
            if (this.B) {
                this.af = true;
                this.y.setText("");
            }
            ImageView imageView = this.aa;
            if (this.y.getText().toString().length() == 0) {
                i = 4;
            }
            imageView.setVisibility(i);
            if (this.v != null) {
                this.v.a();
            }
        } else {
            this.q.requestFocus();
            c();
            if (this.s) {
                n();
            }
            b(0);
            this.S.b(true);
            d(true);
            this.aa.setVisibility(8);
            if (this.p != null) {
                com.arlib.floatingsearchview.util.b.a(this.p);
            }
            if (this.B) {
                this.af = true;
                this.y.setText(this.A);
            }
            if (this.v != null) {
                this.v.b();
            }
        }
        this.ai.setEnabled(z);
    }

    private void setSuggestionItemTextSize(int i) {
        this.ap = i;
    }

    private void setupViews(AttributeSet attributeSet) {
        this.ai.setEnabled(false);
        if (attributeSet != null) {
            b(attributeSet);
        }
        if (VERSION.SDK_INT >= 16) {
            setBackground(this.r);
        } else {
            setBackgroundDrawable(this.r);
        }
        f();
        if (!isInEditMode()) {
            l();
        }
    }

    public void a() {
        this.H.setVisibility(8);
        this.K.setAlpha(0.0f);
        this.K.setVisibility(0);
        ObjectAnimator.ofFloat(this.K, "alpha", new float[]{0.0f, 1.0f}).start();
    }

    public void a(int i) {
        this.T = i;
        this.S.a(i, g());
        if (this.u) {
            this.S.a(false);
        }
    }

    public void a(List<? extends com.arlib.floatingsearchview.a.a.a> list) {
        Collections.reverse(list);
        a((List) list, true);
    }

    public void a(boolean z) {
        this.R = true;
        a(this.L, z);
        if (this.I != null) {
            this.I.a();
        }
    }

    public void b() {
        this.K.setVisibility(8);
        this.H.setAlpha(0.0f);
        this.H.setVisibility(0);
        ObjectAnimator.ofFloat(this.H, "alpha", new float[]{0.0f, 1.0f}).start();
    }

    public void b(boolean z) {
        this.R = false;
        b(this.L, z);
        if (this.I != null) {
            this.I.b();
        }
    }

    public void c() {
        a(new ArrayList());
    }

    public boolean d() {
        return this.u;
    }

    public String getQuery() {
        return this.F;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ah.s(this.aj).b();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.aq) {
            final int a = (com.arlib.floatingsearchview.util.b.a(5) * 3) + this.ai.getHeight();
            this.ai.getLayoutParams().height = a;
            this.ai.requestLayout();
            this.aj.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                final /* synthetic */ FloatingSearchView b;

                public void onGlobalLayout() {
                    if (this.b.ai.getHeight() == a) {
                        com.arlib.floatingsearchview.util.b.a(this.b.aj, (OnGlobalLayoutListener) this);
                        this.b.ar = true;
                        this.b.m();
                        if (this.b.av != null) {
                            this.b.av.a();
                            this.b.av = null;
                        }
                    }
                }
            });
            this.aq = false;
            j();
            if (isInEditMode()) {
                a(this.T);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        final j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.u = jVar.b;
        this.B = jVar.i;
        this.T = jVar.t;
        this.au = jVar.w;
        setSuggestionItemTextSize(jVar.d);
        setDismissOnOutsideClick(jVar.f);
        setShowMoveUpSuggestion(jVar.g);
        setShowSearchKey(jVar.h);
        setSearchHint(jVar.e);
        setBackgroundColor(jVar.j);
        setSuggestionsTextColor(jVar.k);
        setQueryTextColor(jVar.l);
        setHintTextColor(jVar.m);
        setActionMenuOverflowColor(jVar.n);
        setMenuItemIconColor(jVar.o);
        setLeftActionIconColor(jVar.p);
        setClearBtnColor(jVar.q);
        setSuggestionRightIconColor(jVar.r);
        setDividerColor(jVar.s);
        setLeftActionMode(jVar.u);
        setDimBackground(jVar.v);
        setCloseSearchOnKeyboardDismiss(jVar.x);
        this.ai.setEnabled(this.u);
        if (this.u) {
            this.r.setAlpha(150);
            this.af = true;
            this.ae = true;
            this.ai.setVisibility(0);
            this.av = new h(this) {
                final /* synthetic */ FloatingSearchView b;

                public void a() {
                    this.b.a(jVar.a, false);
                    this.b.av = null;
                    this.b.c(false);
                }
            };
            this.aa.setVisibility(jVar.c.length() == 0 ? 4 : 0);
            this.H.setVisibility(0);
            com.arlib.floatingsearchview.util.b.a(getContext(), this.y);
        }
    }

    public Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.a = this.an.b();
        jVar.b = this.u;
        jVar.c = getQuery();
        jVar.d = this.ap;
        jVar.e = this.P;
        jVar.f = this.t;
        jVar.g = this.as;
        jVar.h = this.Q;
        jVar.i = this.B;
        jVar.j = this.ad;
        jVar.k = this.al;
        jVar.l = this.C;
        jVar.m = this.D;
        jVar.n = this.V;
        jVar.o = this.U;
        jVar.p = this.O;
        jVar.q = this.ab;
        jVar.r = this.al;
        jVar.s = this.ah;
        jVar.t = this.T;
        jVar.u = this.a;
        jVar.v = this.s;
        jVar.x = this.t;
        return jVar;
    }

    public void setActionMenuOverflowColor(int i) {
        this.V = i;
        if (this.S != null) {
            this.S.setOverflowColor(this.V);
        }
    }

    public void setBackgroundColor(int i) {
        this.ad = i;
        if (this.w != null && this.ak != null) {
            this.w.setCardBackgroundColor(i);
            this.ak.setBackgroundColor(i);
        }
    }

    public void setClearBtnColor(int i) {
        this.ab = i;
        android.support.v4.d.a.a.a(this.ac, this.ab);
    }

    public void setCloseSearchOnKeyboardDismiss(boolean z) {
        this.z = z;
    }

    public void setDimBackground(boolean z) {
        this.s = z;
        j();
    }

    public void setDismissOnOutsideClick(boolean z) {
        this.t = z;
        this.ai.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ FloatingSearchView a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (this.a.t && this.a.u) {
                    this.a.setSearchFocusedInternal(false);
                }
                return true;
            }
        });
    }

    public void setDividerColor(int i) {
        this.ah = i;
        if (this.ag != null) {
            this.ag.setBackgroundColor(this.ah);
        }
    }

    public void setHintTextColor(int i) {
        this.D = i;
        if (this.y != null) {
            this.y.setHintTextColor(i);
        }
    }

    public void setLeftActionIconColor(int i) {
        this.O = i;
        this.L.a(i);
        android.support.v4.d.a.a.a(this.M, i);
        android.support.v4.d.a.a.a(this.N, i);
    }

    public void setLeftActionMode(int i) {
        this.a = i;
        h();
    }

    public void setLeftMenuOpen(boolean z) {
        this.R = z;
        this.L.c(z ? 1.0f : 0.0f);
    }

    public void setMenuIconProgress(float f) {
        this.L.c(f);
        if (f == 0.0f) {
            b(false);
        } else if (((double) f) == 1.0d) {
            a(false);
        }
    }

    public void setMenuItemIconColor(int i) {
        this.U = i;
        if (this.S != null) {
            this.S.setActionIconColor(this.U);
        }
    }

    public void setOnBindSuggestionCallback(com.arlib.floatingsearchview.a.a.b bVar) {
        this.ao = bVar;
        if (this.an != null) {
            this.an.a(this.ao);
        }
    }

    public void setOnFocusChangeListener(b bVar) {
        this.v = bVar;
    }

    public void setOnHomeActionClickListener(c cVar) {
        this.J = cVar;
    }

    public void setOnLeftMenuClickListener(d dVar) {
        this.I = dVar;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.W = eVar;
    }

    public void setOnQueryChangeListener(f fVar) {
        this.G = fVar;
    }

    public void setOnSearchListener(g gVar) {
        this.x = gVar;
    }

    public void setOnSuggestionsListHeightChanged(i iVar) {
        this.at = iVar;
    }

    public void setQueryTextColor(int i) {
        this.C = i;
        if (this.y != null) {
            this.y.setTextColor(this.C);
        }
    }

    public void setSearchBarTitle(CharSequence charSequence) {
        this.A = charSequence.toString();
        this.B = true;
        this.y.setText(charSequence);
    }

    public void setSearchFocusable(boolean z) {
        this.y.setFocusable(z);
    }

    public void setSearchHint(String str) {
        if (str == null) {
            str = getResources().getString(R.string.abc_search_hint);
        }
        this.P = str;
        this.y.setHint(this.P);
    }

    public void setSearchText(CharSequence charSequence) {
        this.B = false;
        this.y.setText(charSequence);
    }

    public void setShowMoveUpSuggestion(boolean z) {
        this.as = z;
        k();
    }

    public void setShowSearchKey(boolean z) {
        this.Q = z;
        if (z) {
            this.y.setImeOptions(3);
        } else {
            this.y.setImeOptions(1);
        }
    }

    public void setSuggestionRightIconColor(int i) {
        this.am = i;
        if (this.an != null) {
            this.an.e(this.am);
        }
    }

    public void setSuggestionsAnimDuration(long j) {
        this.au = j;
    }

    public void setSuggestionsTextColor(int i) {
        this.al = i;
        if (this.an != null) {
            this.an.d(this.al);
        }
    }

    public void setViewTextColor(int i) {
        setSuggestionsTextColor(i);
        setQueryTextColor(i);
    }
}
