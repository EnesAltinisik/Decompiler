package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager.BadTokenException;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class f extends c implements OnClickListener, b {
    RecyclerView b;
    View c;
    FrameLayout d;
    ProgressBar e;
    TextView f;
    TextView g;
    TextView h;
    CheckBox i;
    MDButton j;
    MDButton k;
    MDButton l;
    i m;
    List<Integer> n;
    protected final a o;
    protected ImageView p;
    protected TextView q;
    protected TextView r;
    protected EditText s;
    private final Handler t = new Handler();

    public static class a {
        protected j A;
        protected e B;
        protected h C;
        protected g D;
        protected f E;
        protected boolean F = false;
        protected boolean G = false;
        protected h H = h.LIGHT;
        protected boolean I = true;
        protected boolean J = true;
        protected float K = 1.2f;
        protected int L = -1;
        protected Integer[] M = null;
        protected Integer[] N = null;
        protected boolean O = true;
        protected Typeface P;
        protected Typeface Q;
        protected Drawable R;
        protected boolean S;
        protected int T = -1;
        protected android.support.v7.widget.RecyclerView.a<?> U;
        protected android.support.v7.widget.RecyclerView.h V;
        protected OnDismissListener W;
        protected OnCancelListener X;
        protected OnKeyListener Y;
        protected OnShowListener Z;
        protected final Context a;
        protected boolean aA = false;
        protected boolean aB = false;
        protected boolean aC = false;
        protected boolean aD = false;
        protected boolean aE = false;
        protected boolean aF = false;
        protected boolean aG = false;
        protected int aH;
        protected int aI;
        protected int aJ;
        protected int aK;
        protected int aL;
        protected g aa;
        protected boolean ab;
        protected int ac;
        protected int ad;
        protected int ae;
        protected boolean af;
        protected boolean ag;
        protected int ah = -2;
        protected int ai = 0;
        protected CharSequence aj;
        protected CharSequence ak;
        protected d al;
        protected boolean am;
        protected int an = -1;
        protected boolean ao;
        protected int ap = -1;
        protected int aq = -1;
        protected int ar = 0;
        protected int[] as;
        protected CharSequence at;
        protected boolean au;
        protected OnCheckedChangeListener av;
        protected String aw;
        protected NumberFormat ax;
        protected boolean ay;
        protected boolean az = false;
        protected CharSequence b;
        protected e c = e.START;
        protected e d = e.START;
        protected e e = e.END;
        protected e f = e.START;
        protected e g = e.START;
        protected int h = 0;
        protected int i = -1;
        protected int j = -1;
        protected CharSequence k;
        protected ArrayList<CharSequence> l;
        protected CharSequence m;
        protected CharSequence n;
        protected CharSequence o;
        protected View p;
        protected int q;
        protected ColorStateList r;
        protected ColorStateList s;
        protected ColorStateList t;
        protected ColorStateList u;
        protected ColorStateList v;
        protected b w;
        protected j x;
        protected j y;
        protected j z;

        public a(Context context) {
            int i = 0;
            this.a = context;
            this.q = com.afollestad.materialdialogs.a.a.a(context, R.attr.colorAccent, com.afollestad.materialdialogs.a.a.b(context, R.color.md_material_blue_600));
            if (VERSION.SDK_INT >= 21) {
                this.q = com.afollestad.materialdialogs.a.a.a(context, 16843829, this.q);
            }
            this.s = com.afollestad.materialdialogs.a.a.g(context, this.q);
            this.t = com.afollestad.materialdialogs.a.a.g(context, this.q);
            this.u = com.afollestad.materialdialogs.a.a.g(context, this.q);
            this.v = com.afollestad.materialdialogs.a.a.g(context, com.afollestad.materialdialogs.a.a.a(context, R.attr.md_link_color, this.q));
            if (VERSION.SDK_INT >= 21) {
                i = com.afollestad.materialdialogs.a.a.a(context, 16843820);
            }
            this.h = com.afollestad.materialdialogs.a.a.a(context, R.attr.md_btn_ripple_color, com.afollestad.materialdialogs.a.a.a(context, R.attr.colorControlHighlight, i));
            this.ax = NumberFormat.getPercentInstance();
            this.aw = "%1d/%2d";
            this.H = com.afollestad.materialdialogs.a.a.a(com.afollestad.materialdialogs.a.a.a(context, 16842806)) ? h.LIGHT : h.DARK;
            d();
            this.c = com.afollestad.materialdialogs.a.a.a(context, R.attr.md_title_gravity, this.c);
            this.d = com.afollestad.materialdialogs.a.a.a(context, R.attr.md_content_gravity, this.d);
            this.e = com.afollestad.materialdialogs.a.a.a(context, R.attr.md_btnstacked_gravity, this.e);
            this.f = com.afollestad.materialdialogs.a.a.a(context, R.attr.md_items_gravity, this.f);
            this.g = com.afollestad.materialdialogs.a.a.a(context, R.attr.md_buttons_gravity, this.g);
            a(com.afollestad.materialdialogs.a.a.c(context, R.attr.md_medium_font), com.afollestad.materialdialogs.a.a.c(context, R.attr.md_regular_font));
            if (this.Q == null) {
                try {
                    if (VERSION.SDK_INT >= 21) {
                        this.Q = Typeface.create("sans-serif-medium", 0);
                    } else {
                        this.Q = Typeface.create("sans-serif", 1);
                    }
                } catch (Exception e) {
                }
            }
            if (this.P == null) {
                try {
                    this.P = Typeface.create("sans-serif", 0);
                } catch (Exception e2) {
                }
            }
        }

        private void d() {
            if (com.afollestad.materialdialogs.internal.c.a(false) != null) {
                com.afollestad.materialdialogs.internal.c a = com.afollestad.materialdialogs.internal.c.a();
                if (a.a) {
                    this.H = h.DARK;
                }
                if (a.b != 0) {
                    this.i = a.b;
                }
                if (a.c != 0) {
                    this.j = a.c;
                }
                if (a.d != null) {
                    this.s = a.d;
                }
                if (a.e != null) {
                    this.u = a.e;
                }
                if (a.f != null) {
                    this.t = a.f;
                }
                if (a.h != 0) {
                    this.ae = a.h;
                }
                if (a.i != null) {
                    this.R = a.i;
                }
                if (a.j != 0) {
                    this.ad = a.j;
                }
                if (a.k != 0) {
                    this.ac = a.k;
                }
                if (a.n != 0) {
                    this.aI = a.n;
                }
                if (a.m != 0) {
                    this.aH = a.m;
                }
                if (a.o != 0) {
                    this.aJ = a.o;
                }
                if (a.p != 0) {
                    this.aK = a.p;
                }
                if (a.q != 0) {
                    this.aL = a.q;
                }
                if (a.g != 0) {
                    this.q = a.g;
                }
                if (a.l != null) {
                    this.v = a.l;
                }
                this.c = a.r;
                this.d = a.s;
                this.e = a.t;
                this.f = a.u;
                this.g = a.v;
            }
        }

        public final Context a() {
            return this.a;
        }

        public a a(int i) {
            a(this.a.getText(i));
            return this;
        }

        public a a(j jVar) {
            this.x = jVar;
            return this;
        }

        public a a(h hVar) {
            this.H = hVar;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public a a(String str, String str2) {
            if (str != null) {
                this.Q = com.afollestad.materialdialogs.a.c.a(this.a, str);
                if (this.Q == null) {
                    throw new IllegalArgumentException("No font asset found for " + str);
                }
            }
            if (str2 != null) {
                this.P = com.afollestad.materialdialogs.a.c.a(this.a, str2);
                if (this.P == null) {
                    throw new IllegalArgumentException("No font asset found for " + str2);
                }
            }
            return this;
        }

        public a a(boolean z) {
            this.ay = z;
            return this;
        }

        public a a(boolean z, int i) {
            if (this.p != null) {
                throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
            }
            if (z) {
                this.af = true;
                this.ah = -2;
            } else {
                this.ay = false;
                this.af = false;
                this.ah = -1;
                this.ai = i;
            }
            return this;
        }

        public a a(CharSequence... charSequenceArr) {
            if (this.p != null) {
                throw new IllegalStateException("You cannot set items() when you're using a custom view.");
            }
            this.l = new ArrayList();
            Collections.addAll(this.l, charSequenceArr);
            return this;
        }

        public a a(Integer[] numArr, f fVar) {
            this.M = numArr;
            this.B = null;
            this.D = null;
            this.E = fVar;
            return this;
        }

        public a b(int i) {
            this.R = android.support.v4.c.a.d.a(this.a.getResources(), i, null);
            return this;
        }

        public a b(j jVar) {
            this.y = jVar;
            return this;
        }

        public a b(CharSequence charSequence) {
            if (this.p != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.k = charSequence;
            return this;
        }

        public a b(boolean z) {
            this.I = z;
            this.J = z;
            return this;
        }

        public f b() {
            return new f(this);
        }

        public a c(int i) {
            b(Html.fromHtml(this.a.getString(i).replace("\n", "<br/>")));
            return this;
        }

        public a c(CharSequence charSequence) {
            this.m = charSequence;
            return this;
        }

        public f c() {
            f b = b();
            b.show();
            return b;
        }

        public a d(int i) {
            this.j = i;
            this.aA = true;
            return this;
        }

        public a d(CharSequence charSequence) {
            this.o = charSequence;
            return this;
        }

        public a e(int i) {
            a(this.a.getResources().getTextArray(i));
            return this;
        }

        public a f(int i) {
            if (i != 0) {
                c(this.a.getText(i));
            }
            return this;
        }

        public a g(int i) {
            return i == 0 ? this : d(this.a.getText(i));
        }

        public a h(int i) {
            this.ac = i;
            this.aG = true;
            return this;
        }

        public a i(int i) {
            return h(com.afollestad.materialdialogs.a.a.b(this.a, i));
        }
    }

    @Deprecated
    public static abstract class b {
        @Deprecated
        public void a(f fVar) {
        }

        @Deprecated
        public void b(f fVar) {
        }

        @Deprecated
        public void c(f fVar) {
        }

        protected final Object clone() {
            return super.clone();
        }

        @Deprecated
        public void d(f fVar) {
        }

        public final boolean equals(Object obj) {
            return super.equals(obj);
        }

        protected final void finalize() {
            super.finalize();
        }

        public final int hashCode() {
            return super.hashCode();
        }

        public final String toString() {
            return super.toString();
        }
    }

    private static class c extends BadTokenException {
        c(String str) {
            super(str);
        }
    }

    public interface d {
        void a(f fVar, CharSequence charSequence);
    }

    public interface e {
        void a(f fVar, View view, int i, CharSequence charSequence);
    }

    public interface f {
        boolean a(f fVar, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    public interface g {
        boolean a(f fVar, View view, int i, CharSequence charSequence);
    }

    public interface h {
        boolean a(f fVar, View view, int i, CharSequence charSequence);
    }

    enum i {
        REGULAR,
        SINGLE,
        MULTI;

        public static int a(i iVar) {
            switch (iVar) {
                case REGULAR:
                    return R.layout.md_listitem;
                case SINGLE:
                    return R.layout.md_listitem_singlechoice;
                case MULTI:
                    return R.layout.md_listitem_multichoice;
                default:
                    throw new IllegalArgumentException("Not a valid list type");
            }
        }
    }

    public interface j {
        void a(f fVar, b bVar);
    }

    @SuppressLint({"InflateParams"})
    protected f(a aVar) {
        super(aVar.a, d.a(aVar));
        this.o = aVar;
        this.a = (MDRootLayout) LayoutInflater.from(aVar.a).inflate(d.b(aVar), null);
        d.a(this);
    }

    private boolean b(View view) {
        if (this.o.D == null) {
            return false;
        }
        CharSequence charSequence = null;
        if (this.o.L >= 0 && this.o.L < this.o.l.size()) {
            charSequence = (CharSequence) this.o.l.get(this.o.L);
        }
        return this.o.D.a(this, view, this.o.L, charSequence);
    }

    private boolean i() {
        if (this.o.E == null) {
            return false;
        }
        Collections.sort(this.n);
        List arrayList = new ArrayList();
        for (Integer num : this.n) {
            if (num.intValue() >= 0 && num.intValue() <= this.o.l.size() - 1) {
                arrayList.add(this.o.l.get(num.intValue()));
            }
        }
        return this.o.E.a(this, (Integer[]) this.n.toArray(new Integer[this.n.size()]), (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
    }

    Drawable a(b bVar, boolean z) {
        Drawable d;
        if (!z) {
            switch (bVar) {
                case NEUTRAL:
                    if (this.o.aK != 0) {
                        return android.support.v4.c.a.d.a(this.o.a.getResources(), this.o.aK, null);
                    }
                    d = com.afollestad.materialdialogs.a.a.d(this.o.a, R.attr.md_btn_neutral_selector);
                    if (d != null) {
                        return d;
                    }
                    d = com.afollestad.materialdialogs.a.a.d(getContext(), R.attr.md_btn_neutral_selector);
                    if (VERSION.SDK_INT < 21) {
                        return d;
                    }
                    com.afollestad.materialdialogs.a.b.a(d, this.o.h);
                    return d;
                case NEGATIVE:
                    if (this.o.aL != 0) {
                        return android.support.v4.c.a.d.a(this.o.a.getResources(), this.o.aL, null);
                    }
                    d = com.afollestad.materialdialogs.a.a.d(this.o.a, R.attr.md_btn_negative_selector);
                    if (d != null) {
                        return d;
                    }
                    d = com.afollestad.materialdialogs.a.a.d(getContext(), R.attr.md_btn_negative_selector);
                    if (VERSION.SDK_INT < 21) {
                        return d;
                    }
                    com.afollestad.materialdialogs.a.b.a(d, this.o.h);
                    return d;
                default:
                    if (this.o.aJ != 0) {
                        return android.support.v4.c.a.d.a(this.o.a.getResources(), this.o.aJ, null);
                    }
                    d = com.afollestad.materialdialogs.a.a.d(this.o.a, R.attr.md_btn_positive_selector);
                    if (d != null) {
                        return d;
                    }
                    d = com.afollestad.materialdialogs.a.a.d(getContext(), R.attr.md_btn_positive_selector);
                    if (VERSION.SDK_INT < 21) {
                        return d;
                    }
                    com.afollestad.materialdialogs.a.b.a(d, this.o.h);
                    return d;
            }
        } else if (this.o.aI != 0) {
            return android.support.v4.c.a.d.a(this.o.a.getResources(), this.o.aI, null);
        } else {
            d = com.afollestad.materialdialogs.a.a.d(this.o.a, R.attr.md_btn_stacked_selector);
            return d == null ? com.afollestad.materialdialogs.a.a.d(getContext(), R.attr.md_btn_stacked_selector) : d;
        }
    }

    public final MDButton a(b bVar) {
        switch (bVar) {
            case NEUTRAL:
                return this.k;
            case NEGATIVE:
                return this.l;
            default:
                return this.j;
        }
    }

    protected void a(int i, boolean z) {
        if (this.h != null) {
            if (this.o.aq > 0) {
                this.h.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.o.aq)}));
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
            }
            int i2 = (!(z && i == 0) && ((this.o.aq <= 0 || i <= this.o.aq) && i >= this.o.ap)) ? 0 : 1;
            int i3 = i2 != 0 ? this.o.ar : this.o.j;
            int i4 = i2 != 0 ? this.o.ar : this.o.q;
            if (this.o.aq > 0) {
                this.h.setTextColor(i3);
            }
            com.afollestad.materialdialogs.internal.b.a(this.s, i4);
            a(b.POSITIVE).setEnabled(i2 == 0);
        }
    }

    public final void a(TextView textView, Typeface typeface) {
        if (typeface != null) {
            textView.setPaintFlags(textView.getPaintFlags() | 128);
            textView.setTypeface(typeface);
        }
    }

    public boolean a(f fVar, View view, int i, CharSequence charSequence, boolean z) {
        boolean z2 = false;
        if (!view.isEnabled()) {
            return false;
        }
        if (this.m == null || this.m == i.REGULAR) {
            if (this.o.O) {
                dismiss();
            }
            if (!(z || this.o.B == null)) {
                this.o.B.a(this, view, i, (CharSequence) this.o.l.get(i));
            }
            if (z && this.o.C != null) {
                return this.o.C.a(this, view, i, (CharSequence) this.o.l.get(i));
            }
        } else if (this.m == i.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (!this.n.contains(Integer.valueOf(i))) {
                this.n.add(Integer.valueOf(i));
                if (!this.o.F) {
                    checkBox.setChecked(true);
                } else if (i()) {
                    checkBox.setChecked(true);
                } else {
                    this.n.remove(Integer.valueOf(i));
                }
            } else {
                this.n.remove(Integer.valueOf(i));
                if (!this.o.F) {
                    checkBox.setChecked(false);
                } else if (i()) {
                    checkBox.setChecked(false);
                } else {
                    this.n.add(Integer.valueOf(i));
                }
            }
        } else if (this.m == i.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            int i2 = this.o.L;
            if (this.o.O && this.o.m == null) {
                dismiss();
                this.o.L = i;
                b(view);
            } else if (this.o.G) {
                this.o.L = i;
                z2 = b(view);
                this.o.L = i2;
            } else {
                z2 = true;
            }
            if (z2) {
                this.o.L = i;
                radioButton.setChecked(true);
                this.o.U.c(i2);
                this.o.U.c(i);
            }
        }
        return true;
    }

    public final a b() {
        return this.o;
    }

    final void c() {
        if (this.b != null) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void onGlobalLayout() {
                    if (VERSION.SDK_INT < 16) {
                        this.a.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else {
                        this.a.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    if (this.a.m == i.SINGLE || this.a.m == i.MULTI) {
                        int i;
                        if (this.a.m == i.SINGLE) {
                            if (this.a.o.L >= 0) {
                                i = this.a.o.L;
                            } else {
                                return;
                            }
                        } else if (this.a.n != null && this.a.n.size() != 0) {
                            Collections.sort(this.a.n);
                            i = ((Integer) this.a.n.get(0)).intValue();
                        } else {
                            return;
                        }
                        this.a.b.post(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 b;

                            public void run() {
                                this.b.a.b.requestFocus();
                                this.b.a.o.V.e(i);
                            }
                        });
                    }
                }
            });
        }
    }

    final void d() {
        if (this.b != null) {
            if ((this.o.l != null && this.o.l.size() != 0) || this.o.U != null) {
                if (this.o.V == null) {
                    this.o.V = new LinearLayoutManager(getContext());
                }
                this.b.setLayoutManager(this.o.V);
                this.b.setAdapter(this.o.U);
                if (this.m != null) {
                    ((a) this.o.U).a((b) this);
                }
            }
        }
    }

    public void dismiss() {
        if (this.s != null) {
            com.afollestad.materialdialogs.a.a.b((DialogInterface) this, this.o);
        }
        super.dismiss();
    }

    protected final Drawable e() {
        if (this.o.aH != 0) {
            return android.support.v4.c.a.d.a(this.o.a.getResources(), this.o.aH, null);
        }
        Drawable d = com.afollestad.materialdialogs.a.a.d(this.o.a, R.attr.md_list_selector);
        return d == null ? com.afollestad.materialdialogs.a.a.d(getContext(), R.attr.md_list_selector) : d;
    }

    public final View f() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ View findViewById(int i) {
        return super.findViewById(i);
    }

    public final EditText g() {
        return this.s;
    }

    protected void h() {
        if (this.s != null) {
            this.s.addTextChangedListener(new TextWatcher(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void afterTextChanged(Editable editable) {
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    boolean z;
                    boolean z2 = true;
                    int length = charSequence.toString().length();
                    if (this.a.o.am) {
                        z = false;
                    } else {
                        z = length == 0;
                        View a = this.a.a(b.POSITIVE);
                        if (z) {
                            z2 = false;
                        }
                        a.setEnabled(z2);
                    }
                    this.a.a(length, z);
                    if (this.a.o.ao) {
                        this.a.o.al.a(this.a, charSequence);
                    }
                }
            });
        }
    }

    public final void onClick(View view) {
        b bVar = (b) view.getTag();
        switch (bVar) {
            case NEUTRAL:
                if (this.o.w != null) {
                    this.o.w.a(this);
                    this.o.w.d(this);
                }
                if (this.o.z != null) {
                    this.o.z.a(this, bVar);
                }
                if (this.o.O) {
                    dismiss();
                    break;
                }
                break;
            case NEGATIVE:
                if (this.o.w != null) {
                    this.o.w.a(this);
                    this.o.w.c(this);
                }
                if (this.o.y != null) {
                    this.o.y.a(this, bVar);
                }
                if (this.o.O) {
                    cancel();
                    break;
                }
                break;
            case POSITIVE:
                if (this.o.w != null) {
                    this.o.w.a(this);
                    this.o.w.b(this);
                }
                if (this.o.x != null) {
                    this.o.x.a(this, bVar);
                }
                if (!this.o.G) {
                    b(view);
                }
                if (!this.o.F) {
                    i();
                }
                if (!(this.o.al == null || this.s == null || this.o.ao)) {
                    this.o.al.a(this, this.s.getText());
                }
                if (this.o.O) {
                    dismiss();
                    break;
                }
                break;
        }
        if (this.o.A != null) {
            this.o.A.a(this, bVar);
        }
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.s != null) {
            com.afollestad.materialdialogs.a.a.a((DialogInterface) this, this.o);
            if (this.s.getText().length() > 0) {
                this.s.setSelection(this.s.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    public final void setTitle(int i) {
        setTitle(this.o.a.getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        this.q.setText(charSequence);
    }

    public void show() {
        try {
            super.show();
        } catch (BadTokenException e) {
            throw new c("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }
}
