package com.afollestad.materialdialogs;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.afollestad.materialdialogs.f.a;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.internal.b;
import java.util.ArrayList;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateProgressDrawable;

class d {
    static int a(a aVar) {
        boolean a = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_dark_theme, aVar.H == h.DARK);
        aVar.H = a ? h.DARK : h.LIGHT;
        return a ? R.style.MD_Dark : R.style.MD_Light;
    }

    private static void a(ProgressBar progressBar) {
        if (VERSION.SDK_INT >= 11 && VERSION.SDK_INT < 18 && progressBar.isHardwareAccelerated() && progressBar.getLayerType() != 1) {
            progressBar.setLayerType(1, null);
        }
    }

    public static void a(f fVar) {
        boolean a;
        a aVar = fVar.o;
        fVar.setCancelable(aVar.I);
        fVar.setCanceledOnTouchOutside(aVar.J);
        if (aVar.ad == 0) {
            aVar.ad = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_background_color, com.afollestad.materialdialogs.a.a.a(fVar.getContext(), R.attr.colorBackgroundFloating));
        }
        if (aVar.ad != 0) {
            Drawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(aVar.a.getResources().getDimension(R.dimen.md_bg_corner_radius));
            gradientDrawable.setColor(aVar.ad);
            fVar.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!aVar.aC) {
            aVar.s = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_positive_color, aVar.s);
        }
        if (!aVar.aD) {
            aVar.u = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_neutral_color, aVar.u);
        }
        if (!aVar.aE) {
            aVar.t = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_negative_color, aVar.t);
        }
        if (!aVar.aF) {
            aVar.q = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_widget_color, aVar.q);
        }
        if (!aVar.az) {
            aVar.i = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_title_color, com.afollestad.materialdialogs.a.a.a(fVar.getContext(), 16842806));
        }
        if (!aVar.aA) {
            aVar.j = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_content_color, com.afollestad.materialdialogs.a.a.a(fVar.getContext(), 16842808));
        }
        if (!aVar.aB) {
            aVar.ae = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_item_color, aVar.j);
        }
        fVar.q = (TextView) fVar.a.findViewById(R.id.md_title);
        fVar.p = (ImageView) fVar.a.findViewById(R.id.md_icon);
        fVar.c = fVar.a.findViewById(R.id.md_titleFrame);
        fVar.r = (TextView) fVar.a.findViewById(R.id.md_content);
        fVar.b = (RecyclerView) fVar.a.findViewById(R.id.md_contentRecyclerView);
        fVar.i = (CheckBox) fVar.a.findViewById(R.id.md_promptCheckbox);
        fVar.j = (MDButton) fVar.a.findViewById(R.id.md_buttonDefaultPositive);
        fVar.k = (MDButton) fVar.a.findViewById(R.id.md_buttonDefaultNeutral);
        fVar.l = (MDButton) fVar.a.findViewById(R.id.md_buttonDefaultNegative);
        if (aVar.al != null && aVar.m == null) {
            aVar.m = aVar.a.getText(17039370);
        }
        fVar.j.setVisibility(aVar.m != null ? 0 : 8);
        fVar.k.setVisibility(aVar.n != null ? 0 : 8);
        fVar.l.setVisibility(aVar.o != null ? 0 : 8);
        if (aVar.R != null) {
            fVar.p.setVisibility(0);
            fVar.p.setImageDrawable(aVar.R);
        } else {
            gradientDrawable = com.afollestad.materialdialogs.a.a.d(aVar.a, R.attr.md_icon);
            if (gradientDrawable != null) {
                fVar.p.setVisibility(0);
                fVar.p.setImageDrawable(gradientDrawable);
            } else {
                fVar.p.setVisibility(8);
            }
        }
        int i = aVar.T;
        if (i == -1) {
            i = com.afollestad.materialdialogs.a.a.e(aVar.a, R.attr.md_icon_max_size);
        }
        if (aVar.S || com.afollestad.materialdialogs.a.a.f(aVar.a, R.attr.md_icon_limit_icon_to_default_size)) {
            i = aVar.a.getResources().getDimensionPixelSize(R.dimen.md_icon_max_size);
        }
        if (i > -1) {
            fVar.p.setAdjustViewBounds(true);
            fVar.p.setMaxHeight(i);
            fVar.p.setMaxWidth(i);
            fVar.p.requestLayout();
        }
        if (!aVar.aG) {
            aVar.ac = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.md_divider_color, com.afollestad.materialdialogs.a.a.a(fVar.getContext(), R.attr.md_divider));
        }
        fVar.a.setDividerColor(aVar.ac);
        if (fVar.q != null) {
            fVar.a(fVar.q, aVar.Q);
            fVar.q.setTextColor(aVar.i);
            fVar.q.setGravity(aVar.c.a());
            if (VERSION.SDK_INT >= 17) {
                fVar.q.setTextAlignment(aVar.c.b());
            }
            if (aVar.b == null) {
                fVar.c.setVisibility(8);
            } else {
                fVar.q.setText(aVar.b);
                fVar.c.setVisibility(0);
            }
        }
        if (fVar.r != null) {
            fVar.r.setMovementMethod(new LinkMovementMethod());
            fVar.a(fVar.r, aVar.P);
            fVar.r.setLineSpacing(0.0f, aVar.K);
            if (aVar.v == null) {
                fVar.r.setLinkTextColor(com.afollestad.materialdialogs.a.a.a(fVar.getContext(), 16842806));
            } else {
                fVar.r.setLinkTextColor(aVar.v);
            }
            fVar.r.setTextColor(aVar.j);
            fVar.r.setGravity(aVar.d.a());
            if (VERSION.SDK_INT >= 17) {
                fVar.r.setTextAlignment(aVar.d.b());
            }
            if (aVar.k != null) {
                fVar.r.setText(aVar.k);
                fVar.r.setVisibility(0);
            } else {
                fVar.r.setVisibility(8);
            }
        }
        if (fVar.i != null) {
            fVar.i.setText(aVar.at);
            fVar.i.setChecked(aVar.au);
            fVar.i.setOnCheckedChangeListener(aVar.av);
            fVar.a(fVar.i, aVar.P);
            fVar.i.setTextColor(aVar.j);
            b.a(fVar.i, aVar.q);
        }
        fVar.a.setButtonGravity(aVar.g);
        fVar.a.setButtonStackedGravity(aVar.e);
        fVar.a.setStackingBehavior(aVar.aa);
        if (VERSION.SDK_INT >= 14) {
            a = com.afollestad.materialdialogs.a.a.a(aVar.a, 16843660, true);
            if (a) {
                a = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.textAllCaps, true);
            }
        } else {
            a = com.afollestad.materialdialogs.a.a.a(aVar.a, R.attr.textAllCaps, true);
        }
        TextView textView = fVar.j;
        fVar.a(textView, aVar.Q);
        textView.setAllCapsCompat(a);
        textView.setText(aVar.m);
        textView.setTextColor(aVar.s);
        fVar.j.setStackedSelector(fVar.a(b.POSITIVE, true));
        fVar.j.setDefaultSelector(fVar.a(b.POSITIVE, false));
        fVar.j.setTag(b.POSITIVE);
        fVar.j.setOnClickListener(fVar);
        fVar.j.setVisibility(0);
        textView = fVar.l;
        fVar.a(textView, aVar.Q);
        textView.setAllCapsCompat(a);
        textView.setText(aVar.o);
        textView.setTextColor(aVar.t);
        fVar.l.setStackedSelector(fVar.a(b.NEGATIVE, true));
        fVar.l.setDefaultSelector(fVar.a(b.NEGATIVE, false));
        fVar.l.setTag(b.NEGATIVE);
        fVar.l.setOnClickListener(fVar);
        fVar.l.setVisibility(0);
        textView = fVar.k;
        fVar.a(textView, aVar.Q);
        textView.setAllCapsCompat(a);
        textView.setText(aVar.n);
        textView.setTextColor(aVar.u);
        fVar.k.setStackedSelector(fVar.a(b.NEUTRAL, true));
        fVar.k.setDefaultSelector(fVar.a(b.NEUTRAL, false));
        fVar.k.setTag(b.NEUTRAL);
        fVar.k.setOnClickListener(fVar);
        fVar.k.setVisibility(0);
        if (aVar.E != null) {
            fVar.n = new ArrayList();
        }
        if (fVar.b != null) {
            if (aVar.U == null) {
                if (aVar.D != null) {
                    fVar.m = i.SINGLE;
                } else if (aVar.E != null) {
                    fVar.m = i.MULTI;
                    if (aVar.M != null) {
                        fVar.n = new ArrayList(Arrays.asList(aVar.M));
                        aVar.M = null;
                    }
                } else {
                    fVar.m = i.REGULAR;
                }
                aVar.U = new a(fVar, i.a(fVar.m));
            } else if (aVar.U instanceof com.afollestad.materialdialogs.internal.a) {
                ((com.afollestad.materialdialogs.internal.a) aVar.U).a(fVar);
            }
        }
        b(fVar);
        c(fVar);
        if (aVar.p != null) {
            View scrollView;
            ((MDRootLayout) fVar.a.findViewById(R.id.md_root)).a();
            FrameLayout frameLayout = (FrameLayout) fVar.a.findViewById(R.id.md_customViewFrame);
            fVar.d = frameLayout;
            View view = aVar.p;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (aVar.ab) {
                Resources resources = fVar.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
                scrollView = new ScrollView(fVar.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.md_content_padding_bottom);
                scrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    scrollView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                } else {
                    scrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                scrollView.addView(view, new LayoutParams(-1, -2));
            } else {
                scrollView = view;
            }
            frameLayout.addView(scrollView, new ViewGroup.LayoutParams(-1, -2));
        }
        if (aVar.Z != null) {
            fVar.setOnShowListener(aVar.Z);
        }
        if (aVar.X != null) {
            fVar.setOnCancelListener(aVar.X);
        }
        if (aVar.W != null) {
            fVar.setOnDismissListener(aVar.W);
        }
        if (aVar.Y != null) {
            fVar.setOnKeyListener(aVar.Y);
        }
        fVar.a();
        fVar.d();
        fVar.a(fVar.a);
        fVar.c();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(fVar.getWindow().getAttributes());
        layoutParams.width = aVar.a.getResources().getDimensionPixelSize(R.dimen.md_dialog_max_width);
        fVar.getWindow().setAttributes(layoutParams);
        i = (int) TypedValue.applyDimension(1, 56.0f, aVar.a.getResources().getDisplayMetrics());
        Display defaultDisplay = fVar.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        fVar.a.setMaxHeight(point.y - (i * 2));
    }

    static int b(a aVar) {
        return aVar.p != null ? R.layout.md_dialog_custom : ((aVar.l == null || aVar.l.size() <= 0) && aVar.U == null) ? aVar.ah > -2 ? R.layout.md_dialog_progress : aVar.af ? aVar.ay ? R.layout.md_dialog_progress_indeterminate_horizontal : R.layout.md_dialog_progress_indeterminate : aVar.al != null ? aVar.at != null ? R.layout.md_dialog_input_check : R.layout.md_dialog_input : aVar.at != null ? R.layout.md_dialog_basic_check : R.layout.md_dialog_basic : aVar.at != null ? R.layout.md_dialog_list_check : R.layout.md_dialog_list;
    }

    private static void b(f fVar) {
        a aVar = fVar.o;
        if (aVar.af || aVar.ah > -2) {
            fVar.e = (ProgressBar) fVar.a.findViewById(16908301);
            if (fVar.e != null) {
                if (VERSION.SDK_INT < 14) {
                    b.a(fVar.e, aVar.q);
                } else if (!aVar.af) {
                    r0 = new HorizontalProgressDrawable(aVar.a());
                    r0.setTint(aVar.q);
                    fVar.e.setProgressDrawable(r0);
                    fVar.e.setIndeterminateDrawable(r0);
                } else if (aVar.ay) {
                    r0 = new IndeterminateHorizontalProgressDrawable(aVar.a());
                    r0.setTint(aVar.q);
                    fVar.e.setProgressDrawable(r0);
                    fVar.e.setIndeterminateDrawable(r0);
                } else {
                    r0 = new IndeterminateProgressDrawable(aVar.a());
                    r0.setTint(aVar.q);
                    fVar.e.setProgressDrawable(r0);
                    fVar.e.setIndeterminateDrawable(r0);
                }
                if (!aVar.af || aVar.ay) {
                    ProgressBar progressBar = fVar.e;
                    boolean z = aVar.af && aVar.ay;
                    progressBar.setIndeterminate(z);
                    fVar.e.setProgress(0);
                    fVar.e.setMax(aVar.ai);
                    fVar.f = (TextView) fVar.a.findViewById(R.id.md_label);
                    if (fVar.f != null) {
                        fVar.f.setTextColor(aVar.j);
                        fVar.a(fVar.f, aVar.Q);
                        fVar.f.setText(aVar.ax.format(0));
                    }
                    fVar.g = (TextView) fVar.a.findViewById(R.id.md_minMax);
                    if (fVar.g != null) {
                        fVar.g.setTextColor(aVar.j);
                        fVar.a(fVar.g, aVar.P);
                        if (aVar.ag) {
                            fVar.g.setVisibility(0);
                            fVar.g.setText(String.format(aVar.aw, new Object[]{Integer.valueOf(0), Integer.valueOf(aVar.ai)}));
                            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) fVar.e.getLayoutParams();
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = 0;
                        } else {
                            fVar.g.setVisibility(8);
                        }
                    } else {
                        aVar.ag = false;
                    }
                }
            } else {
                return;
            }
        }
        if (fVar.e != null) {
            a(fVar.e);
        }
    }

    private static void c(f fVar) {
        a aVar = fVar.o;
        fVar.s = (EditText) fVar.a.findViewById(16908297);
        if (fVar.s != null) {
            fVar.a(fVar.s, aVar.P);
            if (aVar.aj != null) {
                fVar.s.setText(aVar.aj);
            }
            fVar.h();
            fVar.s.setHint(aVar.ak);
            fVar.s.setSingleLine();
            fVar.s.setTextColor(aVar.j);
            fVar.s.setHintTextColor(com.afollestad.materialdialogs.a.a.a(aVar.j, 0.3f));
            b.a(fVar.s, fVar.o.q);
            if (aVar.an != -1) {
                fVar.s.setInputType(aVar.an);
                if (aVar.an != 144 && (aVar.an & 128) == 128) {
                    fVar.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            fVar.h = (TextView) fVar.a.findViewById(R.id.md_minMax);
            if (aVar.ap > 0 || aVar.aq > -1) {
                fVar.a(fVar.s.getText().toString().length(), !aVar.am);
                return;
            }
            fVar.h.setVisibility(8);
            fVar.h = null;
        }
    }
}
