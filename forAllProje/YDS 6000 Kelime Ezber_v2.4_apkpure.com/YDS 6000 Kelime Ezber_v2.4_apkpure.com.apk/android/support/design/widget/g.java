package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.support.v4.view.ah;

@TargetApi(14)
class g extends f {
    private float q = this.n.getRotation();

    g(ab abVar, n nVar, d dVar) {
        super(abVar, nVar, dVar);
    }

    private boolean o() {
        return ah.E(this.n) && !this.n.isInEditMode();
    }

    private void p() {
        if (VERSION.SDK_INT == 19) {
            if (this.q % 90.0f != 0.0f) {
                if (this.n.getLayerType() != 1) {
                    this.n.setLayerType(1, null);
                }
            } else if (this.n.getLayerType() != 0) {
                this.n.setLayerType(0, null);
            }
        }
        if (this.a != null) {
            this.a.a(-this.q);
        }
        if (this.f != null) {
            this.f.b(-this.q);
        }
    }

    void a(final a aVar, final boolean z) {
        if (!n()) {
            this.n.animate().cancel();
            if (o()) {
                this.c = 1;
                this.n.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(a.c).setListener(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ g c;
                    private boolean d;

                    public void onAnimationCancel(Animator animator) {
                        this.d = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.c.c = 0;
                        if (!this.d) {
                            this.c.n.a(z ? 8 : 4, z);
                            if (aVar != null) {
                                aVar.b();
                            }
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        this.c.n.a(0, z);
                        this.d = false;
                    }
                });
                return;
            }
            this.n.a(z ? 8 : 4, z);
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    void b(final a aVar, final boolean z) {
        if (!m()) {
            this.n.animate().cancel();
            if (o()) {
                this.c = 2;
                if (this.n.getVisibility() != 0) {
                    this.n.setAlpha(0.0f);
                    this.n.setScaleY(0.0f);
                    this.n.setScaleX(0.0f);
                }
                this.n.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(a.d).setListener(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ g c;

                    public void onAnimationEnd(Animator animator) {
                        this.c.c = 0;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        this.c.n.a(0, z);
                    }
                });
                return;
            }
            this.n.a(0, z);
            this.n.setAlpha(1.0f);
            this.n.setScaleY(1.0f);
            this.n.setScaleX(1.0f);
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    boolean d() {
        return true;
    }

    void e() {
        float rotation = this.n.getRotation();
        if (this.q != rotation) {
            this.q = rotation;
            p();
        }
    }
}
