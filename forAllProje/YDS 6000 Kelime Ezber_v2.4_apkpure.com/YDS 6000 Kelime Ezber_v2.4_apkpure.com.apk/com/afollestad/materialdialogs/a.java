package com.afollestad.materialdialogs;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

class a extends android.support.v7.widget.RecyclerView.a<a> {
    private final f a;
    private final int b;
    private final e c;
    private b d;

    static class a extends w implements OnClickListener, OnLongClickListener {
        final CompoundButton n;
        final TextView o;
        final a p;

        a(View view, a aVar) {
            super(view);
            this.n = (CompoundButton) view.findViewById(R.id.md_control);
            this.o = (TextView) view.findViewById(R.id.md_title);
            this.p = aVar;
            view.setOnClickListener(this);
            if (aVar.a.o.C != null) {
                view.setOnLongClickListener(this);
            }
        }

        public void onClick(View view) {
            if (this.p.d != null) {
                CharSequence charSequence = null;
                if (this.p.a.o.l != null && e() < this.p.a.o.l.size()) {
                    charSequence = (CharSequence) this.p.a.o.l.get(e());
                }
                this.p.d.a(this.p.a, view, e(), charSequence, false);
            }
        }

        public boolean onLongClick(View view) {
            if (this.p.d == null) {
                return false;
            }
            CharSequence charSequence = null;
            if (this.p.a.o.l != null && e() < this.p.a.o.l.size()) {
                charSequence = (CharSequence) this.p.a.o.l.get(e());
            }
            return this.p.d.a(this.p.a, view, e(), charSequence, true);
        }
    }

    interface b {
        boolean a(f fVar, View view, int i, CharSequence charSequence, boolean z);
    }

    a(f fVar, int i) {
        this.a = fVar;
        this.b = i;
        this.c = fVar.o.f;
    }

    @TargetApi(17)
    private void a(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.c.a() | 16);
        if (viewGroup.getChildCount() != 2) {
            return;
        }
        CompoundButton compoundButton;
        TextView textView;
        if (this.c == e.END && !b() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
            compoundButton = (CompoundButton) viewGroup.getChildAt(0);
            viewGroup.removeView(compoundButton);
            textView = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView);
            textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
            viewGroup.addView(textView);
            viewGroup.addView(compoundButton);
        } else if (this.c == e.START && b() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
            compoundButton = (CompoundButton) viewGroup.getChildAt(1);
            viewGroup.removeView(compoundButton);
            textView = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView);
            textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
            viewGroup.addView(compoundButton);
            viewGroup.addView(textView);
        }
    }

    @TargetApi(17)
    private boolean b() {
        boolean z = true;
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (this.a.b().a().getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        return z;
    }

    public int a() {
        return this.a.o.l != null ? this.a.o.l.size() : 0;
    }

    public a a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.b, viewGroup, false);
        com.afollestad.materialdialogs.a.a.a(inflate, this.a.e());
        return new a(inflate, this);
    }

    public void a(a aVar, int i) {
        View view = aVar.a;
        boolean a = com.afollestad.materialdialogs.a.a.a(Integer.valueOf(i), this.a.o.N);
        boolean z;
        switch (this.a.m) {
            case SINGLE:
                RadioButton radioButton = (RadioButton) aVar.n;
                z = this.a.o.L == i;
                if (this.a.o.r != null) {
                    com.afollestad.materialdialogs.internal.b.a(radioButton, this.a.o.r);
                } else {
                    com.afollestad.materialdialogs.internal.b.a(radioButton, this.a.o.q);
                }
                radioButton.setChecked(z);
                radioButton.setEnabled(!a);
                break;
            case MULTI:
                CheckBox checkBox = (CheckBox) aVar.n;
                z = this.a.n.contains(Integer.valueOf(i));
                if (this.a.o.r != null) {
                    com.afollestad.materialdialogs.internal.b.a(checkBox, this.a.o.r);
                } else {
                    com.afollestad.materialdialogs.internal.b.a(checkBox, this.a.o.q);
                }
                checkBox.setChecked(z);
                checkBox.setEnabled(!a);
                break;
        }
        aVar.o.setText((CharSequence) this.a.o.l.get(i));
        aVar.o.setTextColor(this.a.o.ae);
        this.a.a(aVar.o, this.a.o.P);
        a((ViewGroup) view);
        if (this.a.o.as != null) {
            if (i < this.a.o.as.length) {
                view.setId(this.a.o.as[i]);
            } else {
                view.setId(-1);
            }
        }
        if (VERSION.SDK_INT >= 21) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() != 2) {
                return;
            }
            if (viewGroup.getChildAt(0) instanceof CompoundButton) {
                viewGroup.getChildAt(0).setBackground(null);
            } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
                viewGroup.getChildAt(1).setBackground(null);
            }
        }
    }

    void a(b bVar) {
        this.d = bVar;
    }

    public /* synthetic */ w b(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }
}
