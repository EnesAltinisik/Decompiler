package android.support.design.widget;

import android.support.v4.view.ah;
import android.support.v4.view.t;
import android.support.v4.widget.ad;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.cast.TextTrackStyle;

public class SwipeDismissBehavior<V extends View> extends android.support.design.widget.CoordinatorLayout.b<V> {
    private ad a;
    private a b;
    private boolean c;
    private float d = 0.0f;
    private boolean e;
    private int f = 2;
    private float g = 0.5f;
    private float h = 0.0f;
    private float i = 0.5f;
    private final android.support.v4.widget.ad.a j = new android.support.v4.widget.ad.a(this) {
        final /* synthetic */ SwipeDismissBehavior a;
        private int b;
        private int c = -1;

        {
            this.a = r2;
        }

        public boolean a(View view, int i) {
            return this.c == -1 && this.a.a(view);
        }

        public void b(View view, int i) {
            this.c = i;
            this.b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void a(int i) {
            if (this.a.b != null) {
                this.a.b.a(i);
            }
        }

        public void a(View view, float f, float f2) {
            this.c = -1;
            int width = view.getWidth();
            boolean z = false;
            if (a(view, f)) {
                width = view.getLeft() < this.b ? this.b - width : this.b + width;
                z = true;
            } else {
                width = this.b;
            }
            if (this.a.a.a(width, view.getTop())) {
                ah.a(view, new b(this.a, view, z));
            } else if (z && this.a.b != null) {
                this.a.b.a(view);
            }
        }

        private boolean a(View view, float f) {
            if (f != 0.0f) {
                boolean z = ah.h(view) == 1;
                if (this.a.f == 2) {
                    return true;
                }
                if (this.a.f == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                        return true;
                    } else if (f <= 0.0f) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (this.a.f != 1) {
                    return false;
                } else {
                    if (z) {
                        if (f <= 0.0f) {
                            return false;
                        }
                        return true;
                    } else if (f >= 0.0f) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
            if (Math.abs(view.getLeft() - this.b) < Math.round(((float) view.getWidth()) * this.a.g)) {
                return false;
            }
            return true;
        }

        public int b(View view) {
            return view.getWidth();
        }

        public int b(View view, int i, int i2) {
            int width;
            int i3;
            Object obj = ah.h(view) == 1 ? 1 : null;
            if (this.a.f == 0) {
                if (obj != null) {
                    width = this.b - view.getWidth();
                    i3 = this.b;
                } else {
                    width = this.b;
                    i3 = this.b + view.getWidth();
                }
            } else if (this.a.f != 1) {
                width = this.b - view.getWidth();
                i3 = this.b + view.getWidth();
            } else if (obj != null) {
                width = this.b;
                i3 = this.b + view.getWidth();
            } else {
                width = this.b - view.getWidth();
                i3 = this.b;
            }
            return SwipeDismissBehavior.b(width, i, i3);
        }

        public int a(View view, int i, int i2) {
            return view.getTop();
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.b) + (((float) view.getWidth()) * this.a.h);
            float width2 = ((float) this.b) + (((float) view.getWidth()) * this.a.i);
            if (((float) i) <= width) {
                ah.c(view, (float) TextTrackStyle.DEFAULT_FONT_SCALE);
            } else if (((float) i) >= width2) {
                ah.c(view, 0.0f);
            } else {
                ah.c(view, SwipeDismissBehavior.c(0.0f, TextTrackStyle.DEFAULT_FONT_SCALE - SwipeDismissBehavior.a(width, width2, (float) i), TextTrackStyle.DEFAULT_FONT_SCALE));
            }
        }
    };

    public interface a {
        void a(int i);

        void a(View view);
    }

    private class b implements Runnable {
        final /* synthetic */ SwipeDismissBehavior a;
        private final View b;
        private final boolean c;

        b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
            this.a = swipeDismissBehavior;
            this.b = view;
            this.c = z;
        }

        public void run() {
            if (this.a.a != null && this.a.a.a(true)) {
                ah.a(this.b, (Runnable) this);
            } else if (this.c && this.a.b != null) {
                this.a.b.a(this.b);
            }
        }
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(float f) {
        this.h = c(0.0f, f, TextTrackStyle.DEFAULT_FONT_SCALE);
    }

    public void b(float f) {
        this.i = c(0.0f, f, TextTrackStyle.DEFAULT_FONT_SCALE);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        switch (t.a(motionEvent)) {
            case 1:
            case 3:
                if (this.c) {
                    this.c = false;
                    return false;
                }
                break;
            default:
                boolean z;
                if (coordinatorLayout.a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    z = false;
                } else {
                    z = true;
                }
                this.c = z;
                break;
        }
        if (this.c) {
            return false;
        }
        a((ViewGroup) coordinatorLayout);
        return this.a.a(motionEvent);
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        this.a.b(motionEvent);
        return true;
    }

    public boolean a(View view) {
        return true;
    }

    private void a(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.e ? ad.a(viewGroup, this.d, this.j) : ad.a(viewGroup, this.j);
        }
    }

    private static float c(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    private static int b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    static float a(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }
}
