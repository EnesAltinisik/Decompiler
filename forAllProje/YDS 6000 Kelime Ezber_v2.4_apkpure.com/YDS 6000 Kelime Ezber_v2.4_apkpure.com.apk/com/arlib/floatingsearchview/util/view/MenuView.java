package com.arlib.floatingsearchview.util.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.arlib.floatingsearchview.R;
import com.bartoszlipinski.viewpropertyobjectanimator.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MenuView extends LinearLayout {
    private final int a;
    private final int b;
    private final float c;
    private int d;
    private h e;
    private g f;
    private com.arlib.floatingsearchview.util.a g;
    private android.support.v7.view.menu.h.a h;
    private int i;
    private int j;
    private List<j> k;
    private List<j> l;
    private List<j> m;
    private boolean n;
    private b o;
    private int p;
    private List<ObjectAnimator> q;

    public interface b {
        void a(int i);
    }

    private interface a {
        boolean a(j jVar);
    }

    public MenuView(Context context) {
        this(context, null);
    }

    public MenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 400;
        this.b = 450;
        this.d = -1;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = false;
        this.q = new ArrayList();
        this.c = context.getResources().getDimension(R.dimen.square_button_size);
        a();
    }

    private List<j> a(List<j> list, a aVar) {
        List<j> arrayList = new ArrayList();
        for (j jVar : list) {
            if (aVar.a(jVar)) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    private void a() {
        this.e = new h(getContext());
        this.g = new com.arlib.floatingsearchview.util.a(getContext(), this.e, this);
        this.i = com.arlib.floatingsearchview.util.b.b(getContext(), R.color.gray_active_icon);
        this.j = com.arlib.floatingsearchview.util.b.b(getContext(), R.color.gray_active_icon);
    }

    private void b() {
        int i = 0;
        while (i < getChildCount()) {
            com.arlib.floatingsearchview.util.b.a((ImageView) getChildAt(i), this.i);
            if (this.n && i == getChildCount() - 1) {
                com.arlib.floatingsearchview.util.b.a((ImageView) getChildAt(i), this.j);
            }
            i++;
        }
    }

    private ImageView c() {
        return (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.action_item_layout, this, false);
    }

    private void d() {
        for (ObjectAnimator cancel : this.q) {
            cancel.cancel();
        }
        this.q.clear();
    }

    private MenuInflater getMenuInflater() {
        if (this.f == null) {
            this.f = new g(getContext());
        }
        return this.f;
    }

    private ImageView getOverflowActionView() {
        return (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.overflow_action_item_layout, this, false);
    }

    public void a(int i, int i2) {
        int i3 = 0;
        this.d = i;
        if (this.d != -1) {
            int i4;
            boolean z;
            this.m = new ArrayList();
            this.l = new ArrayList();
            this.k = new ArrayList();
            this.e = new h(getContext());
            this.g = new com.arlib.floatingsearchview.util.a(getContext(), this.e, this);
            removeAllViews();
            getMenuInflater().inflate(this.d, this.e);
            this.k = this.e.k();
            this.k.addAll(this.e.l());
            Collections.sort(this.k, new Comparator<j>(this) {
                final /* synthetic */ MenuView a;

                {
                    this.a = r1;
                }

                public int a(j jVar, j jVar2) {
                    return Integer.valueOf(jVar.getOrder()).compareTo(Integer.valueOf(jVar2.getOrder()));
                }

                public /* synthetic */ int compare(Object obj, Object obj2) {
                    return a((j) obj, (j) obj2);
                }
            });
            List a = a(this.k, new a(this) {
                final /* synthetic */ MenuView a;

                {
                    this.a = r1;
                }

                public boolean a(j jVar) {
                    return jVar.getIcon() != null && (jVar.l() || jVar.k());
                }
            });
            int i5 = i2 / ((int) this.c);
            if (a.size() < this.k.size() || i5 < a.size()) {
                i4 = i5 - 1;
                z = true;
            } else {
                i4 = i5;
                z = false;
            }
            ArrayList arrayList = new ArrayList();
            if (i4 > 0) {
                int i6 = i4;
                for (int i7 = 0; i7 < a.size(); i7++) {
                    final j jVar = (j) a.get(i7);
                    if (jVar.getIcon() != null) {
                        ImageView c = c();
                        c.setImageDrawable(jVar.getIcon());
                        com.arlib.floatingsearchview.util.b.a(c, this.i);
                        addView(c);
                        this.l.add(jVar);
                        arrayList.add(Integer.valueOf(jVar.getItemId()));
                        c.setOnClickListener(new OnClickListener(this) {
                            final /* synthetic */ MenuView b;

                            public void onClick(View view) {
                                if (this.b.h != null) {
                                    this.b.h.a(this.b.e, jVar);
                                }
                            }
                        });
                        i6--;
                        if (i6 == 0) {
                            break;
                        }
                    }
                }
            }
            this.n = z;
            if (z) {
                ImageView overflowActionView = getOverflowActionView();
                overflowActionView.setImageResource(R.drawable.ic_more_vert_black_24dp);
                com.arlib.floatingsearchview.util.b.a(overflowActionView, this.j);
                addView(overflowActionView);
                overflowActionView.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ MenuView a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.g.d();
                    }
                });
                this.e.a(this.h);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.e.removeItem(((Integer) it.next()).intValue());
            }
            if (this.o != null) {
                i4 = ((int) this.c) * getChildCount();
                if (this.n) {
                    i3 = com.arlib.floatingsearchview.util.b.a(8);
                }
                this.p = i4 - i3;
                this.o.a(this.p);
            }
        }
    }

    public void a(boolean z) {
        if (this.d != -1) {
            int i;
            final View childAt;
            this.m.clear();
            d();
            List a = a(this.k, new a(this) {
                final /* synthetic */ MenuView a;

                {
                    this.a = r1;
                }

                public boolean a(j jVar) {
                    return jVar.getIcon() != null && jVar.l();
                }
            });
            int i2 = 0;
            while (i2 < this.l.size() && i2 < a.size()) {
                final j jVar = (j) a.get(i2);
                if (((j) this.l.get(i2)).getItemId() != jVar.getItemId()) {
                    ImageView imageView = (ImageView) getChildAt(i2);
                    imageView.setImageDrawable(jVar.getIcon());
                    com.arlib.floatingsearchview.util.b.a(imageView, this.j);
                    imageView.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ MenuView b;

                        public void onClick(View view) {
                            if (this.b.h != null) {
                                this.b.h.a(this.b.e, jVar);
                            }
                        }
                    });
                }
                this.m.add(jVar);
                i2++;
            }
            int size = (this.l.size() - i2) + (this.n ? 1 : 0);
            this.q = new ArrayList();
            for (i = 0; i < i2; i++) {
                childAt = getChildAt(i);
                final float a2 = (((float) size) * this.c) - ((float) (this.n ? com.arlib.floatingsearchview.util.b.a(8) : 0));
                this.q.add(f.a(childAt).a(z ? 400 : 0).a(new AccelerateInterpolator()).a(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ MenuView c;

                    public void onAnimationEnd(Animator animator) {
                        childAt.setTranslationX(a2);
                    }
                }).d(a2).a());
            }
            for (i = i2; i < size + i2; i++) {
                childAt = getChildAt(i);
                childAt.setClickable(false);
                if (i != getChildCount() - 1) {
                    this.q.add(f.a(childAt).a(z ? 400 : 0).a(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ MenuView b;

                        public void onAnimationEnd(Animator animator) {
                            childAt.setTranslationX(this.b.c);
                        }
                    }).d(this.c).a());
                }
                this.q.add(f.a(childAt).a(z ? 400 : 0).a(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ MenuView b;

                    public void onAnimationEnd(Animator animator) {
                        childAt.setScaleX(0.5f);
                    }
                }).a(0.5f).a());
                this.q.add(f.a(childAt).a(z ? 400 : 0).a(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ MenuView b;

                    public void onAnimationEnd(Animator animator) {
                        childAt.setScaleY(0.5f);
                    }
                }).b(0.5f).a());
                this.q.add(f.a(childAt).a(z ? 400 : 0).a(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ MenuView b;

                    public void onAnimationEnd(Animator animator) {
                        childAt.setAlpha(0.0f);
                    }
                }).e(0.0f).a());
            }
            if (!this.q.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (!z) {
                    animatorSet.setDuration(0);
                }
                animatorSet.playTogether((Animator[]) this.q.toArray(new ObjectAnimator[this.q.size()]));
                animatorSet.addListener(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ MenuView b;

                    public void onAnimationEnd(Animator animator) {
                        if (this.b.o != null) {
                            this.b.p = ((int) this.b.c) * i2;
                            this.b.o.a(this.b.p);
                        }
                    }
                });
                animatorSet.start();
            }
        }
    }

    public void b(boolean z) {
        if (this.d != -1) {
            d();
            if (!this.k.isEmpty()) {
                this.q = new ArrayList();
                for (int i = 0; i < getChildCount(); i++) {
                    final View childAt = getChildAt(i);
                    if (i < this.l.size()) {
                        ImageView imageView = (ImageView) childAt;
                        final MenuItem menuItem = (MenuItem) this.l.get(i);
                        imageView.setImageDrawable(menuItem.getIcon());
                        com.arlib.floatingsearchview.util.b.a(imageView, this.i);
                        imageView.setOnClickListener(new OnClickListener(this) {
                            final /* synthetic */ MenuView b;

                            public void onClick(View view) {
                                if (this.b.h != null) {
                                    this.b.h.a(this.b.e, menuItem);
                                }
                            }
                        });
                    }
                    Interpolator decelerateInterpolator = new DecelerateInterpolator();
                    if (i > this.m.size() - 1) {
                        decelerateInterpolator = new LinearInterpolator();
                    }
                    childAt.setClickable(true);
                    this.q.add(f.a(childAt).a(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ MenuView b;

                        public void onAnimationEnd(Animator animator) {
                            childAt.setTranslationX(0.0f);
                        }
                    }).a(decelerateInterpolator).c(0.0f).a());
                    this.q.add(f.a(childAt).a(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ MenuView b;

                        public void onAnimationEnd(Animator animator) {
                            childAt.setScaleX(1.0f);
                        }
                    }).a(decelerateInterpolator).a(1.0f).a());
                    this.q.add(f.a(childAt).a(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ MenuView b;

                        public void onAnimationEnd(Animator animator) {
                            childAt.setScaleY(1.0f);
                        }
                    }).a(decelerateInterpolator).b(1.0f).a());
                    this.q.add(f.a(childAt).a(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ MenuView b;

                        public void onAnimationEnd(Animator animator) {
                            childAt.setAlpha(1.0f);
                        }
                    }).a(decelerateInterpolator).e(1.0f).a());
                }
                if (!this.q.isEmpty()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (!z) {
                        animatorSet.setDuration(0);
                    }
                    animatorSet.playTogether((Animator[]) this.q.toArray(new ObjectAnimator[this.q.size()]));
                    animatorSet.addListener(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ MenuView a;

                        {
                            this.a = r1;
                        }

                        public void onAnimationEnd(Animator animator) {
                            if (this.a.o != null) {
                                this.a.p = (((int) this.a.c) * this.a.getChildCount()) - (this.a.n ? com.arlib.floatingsearchview.util.b.a(8) : 0);
                                this.a.o.a(this.a.p);
                            }
                        }
                    });
                    animatorSet.start();
                }
            }
        }
    }

    public int getVisibleWidth() {
        return this.p;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    public void setActionIconColor(int i) {
        this.i = i;
        b();
    }

    public void setMenuCallback(android.support.v7.view.menu.h.a aVar) {
        this.h = aVar;
    }

    public void setOnVisibleWidthChanged(b bVar) {
        this.o = bVar;
    }

    public void setOverflowColor(int i) {
        this.j = i;
        b();
    }
}
