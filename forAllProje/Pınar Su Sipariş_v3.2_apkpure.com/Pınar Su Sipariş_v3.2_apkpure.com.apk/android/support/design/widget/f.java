package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ah;
import com.google.android.gms.cast.TextTrackStyle;

/* compiled from: FloatingActionButtonIcs */
class f extends e {
    private boolean m;

    f(y yVar, m mVar) {
        super(yVar, mVar);
    }

    boolean d() {
        return true;
    }

    void e() {
        c(this.k.getRotation());
    }

    void a(final a aVar, final boolean z) {
        if (this.m || this.k.getVisibility() != 0) {
            if (aVar != null) {
                aVar.b();
            }
        } else if (!ah.C(this.k) || this.k.isInEditMode()) {
            this.k.a(8, z);
            if (aVar != null) {
                aVar.b();
            }
        } else {
            this.k.animate().cancel();
            this.k.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(a.c).setListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ f c;
                private boolean d;

                public void onAnimationStart(Animator animator) {
                    this.c.m = true;
                    this.d = false;
                    this.c.k.a(0, z);
                }

                public void onAnimationCancel(Animator animator) {
                    this.c.m = false;
                    this.d = true;
                }

                public void onAnimationEnd(Animator animator) {
                    this.c.m = false;
                    if (!this.d) {
                        this.c.k.a(8, z);
                        if (aVar != null) {
                            aVar.b();
                        }
                    }
                }
            });
        }
    }

    void b(final a aVar, final boolean z) {
        if (!this.m && this.k.getVisibility() == 0) {
            return;
        }
        if (!ah.C(this.k) || this.k.isInEditMode()) {
            this.k.a(0, z);
            this.k.setAlpha(TextTrackStyle.DEFAULT_FONT_SCALE);
            this.k.setScaleY(TextTrackStyle.DEFAULT_FONT_SCALE);
            this.k.setScaleX(TextTrackStyle.DEFAULT_FONT_SCALE);
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        this.k.animate().cancel();
        if (this.k.getVisibility() != 0) {
            this.k.setAlpha(0.0f);
            this.k.setScaleY(0.0f);
            this.k.setScaleX(0.0f);
        }
        this.k.animate().scaleX(TextTrackStyle.DEFAULT_FONT_SCALE).scaleY(TextTrackStyle.DEFAULT_FONT_SCALE).alpha(TextTrackStyle.DEFAULT_FONT_SCALE).setDuration(200).setInterpolator(a.d).setListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ f c;

            public void onAnimationStart(Animator animator) {
                this.c.k.a(0, z);
            }

            public void onAnimationEnd(Animator animator) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    private void c(float f) {
        if (this.a != null) {
            this.a.a(-f);
        }
        if (this.d != null) {
            this.d.a(-f);
        }
    }
}
