package at.grabner.circleprogress;

import android.animation.TimeInterpolator;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;

public class a extends Handler {
    private final WeakReference<CircleProgressView> a;
    private float b;
    private long c;
    private long d;
    private TimeInterpolator e = new DecelerateInterpolator();
    private TimeInterpolator f = new AccelerateDecelerateInterpolator();
    private double g;
    private long h = 0;

    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[b.a().length];

        static {
            b = new int[c.values().length];
            try {
                b[c.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[c.SPINNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[c.END_SPINNING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[c.END_SPINNING_START_ANIMATING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[c.ANIMATING.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[b.a - 1] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[b.b - 1] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                a[b.c - 1] = 3;
            } catch (NoSuchFieldError e8) {
            }
            try {
                a[b.d - 1] = 4;
            } catch (NoSuchFieldError e9) {
            }
            try {
                a[b.e - 1] = 5;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    a(CircleProgressView circleProgressView) {
        super(circleProgressView.getContext().getMainLooper());
        this.a = new WeakReference(circleProgressView);
    }

    private static void a(Message message, CircleProgressView circleProgressView) {
        circleProgressView.n = circleProgressView.m;
        float f = ((float[]) message.obj)[0];
        circleProgressView.m = f;
        circleProgressView.l = f;
        circleProgressView.A = c.IDLE;
        if (circleProgressView.B != null) {
            circleProgressView.B.a(circleProgressView.A);
        }
        circleProgressView.invalidate();
    }

    private void a(CircleProgressView circleProgressView) {
        this.g = (double) (((circleProgressView.r / circleProgressView.u) * ((float) circleProgressView.x)) * 2.0f);
        this.d = System.currentTimeMillis();
        this.b = circleProgressView.r;
    }

    private void a(CircleProgressView circleProgressView, Message message) {
        circleProgressView.A = c.END_SPINNING_START_ANIMATING;
        if (circleProgressView.B != null) {
            circleProgressView.B.a(circleProgressView.A);
        }
        circleProgressView.n = 0.0f;
        circleProgressView.m = ((float[]) message.obj)[1];
        this.d = System.currentTimeMillis();
        this.b = circleProgressView.r;
        sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
    }

    private void b(CircleProgressView circleProgressView) {
        circleProgressView.A = c.SPINNING;
        if (circleProgressView.B != null) {
            circleProgressView.B.a(circleProgressView.A);
        }
        circleProgressView.r = (360.0f / circleProgressView.o) * circleProgressView.l;
        circleProgressView.t = (360.0f / circleProgressView.o) * circleProgressView.l;
        this.d = System.currentTimeMillis();
        this.b = circleProgressView.r;
        this.g = (double) (((circleProgressView.s / circleProgressView.u) * ((float) circleProgressView.x)) * 2.0f);
        sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
    }

    private boolean c(CircleProgressView circleProgressView) {
        float currentTimeMillis = (float) (((double) (System.currentTimeMillis() - this.c)) / circleProgressView.w);
        if (currentTimeMillis > 1.0f) {
            currentTimeMillis = 1.0f;
        }
        circleProgressView.l = (this.f.getInterpolation(currentTimeMillis) * (circleProgressView.m - circleProgressView.n)) + circleProgressView.n;
        return currentTimeMillis >= 1.0f;
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.f = timeInterpolator;
    }

    public void b(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
    }

    public void handleMessage(Message message) {
        CircleProgressView circleProgressView = (CircleProgressView) this.a.get();
        if (circleProgressView != null) {
            int i = b.a()[message.what];
            if (i == b.e) {
                removeMessages(b.e - 1);
            }
            this.h = SystemClock.uptimeMillis();
            float currentTimeMillis;
            switch (circleProgressView.A) {
                case IDLE:
                    switch (AnonymousClass1.a[i - 1]) {
                        case 1:
                            b(circleProgressView);
                            return;
                        case 2:
                            return;
                        case 3:
                            a(message, circleProgressView);
                            return;
                        case 4:
                            circleProgressView.n = ((float[]) message.obj)[0];
                            circleProgressView.m = ((float[]) message.obj)[1];
                            this.c = System.currentTimeMillis();
                            circleProgressView.A = c.ANIMATING;
                            if (circleProgressView.B != null) {
                                circleProgressView.B.a(circleProgressView.A);
                            }
                            sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
                            return;
                        case 5:
                            removeMessages(b.e - 1);
                            return;
                        default:
                            return;
                    }
                case SPINNING:
                    switch (AnonymousClass1.a[i - 1]) {
                        case 1:
                            return;
                        case 2:
                            circleProgressView.A = c.END_SPINNING;
                            a(circleProgressView);
                            if (circleProgressView.B != null) {
                                circleProgressView.B.a(circleProgressView.A);
                            }
                            sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
                            return;
                        case 3:
                            a(message, circleProgressView);
                            return;
                        case 4:
                            a(circleProgressView, message);
                            return;
                        case 5:
                            float f = circleProgressView.r - circleProgressView.s;
                            currentTimeMillis = (float) (((double) (System.currentTimeMillis() - this.d)) / this.g);
                            if (currentTimeMillis > 1.0f) {
                                currentTimeMillis = 1.0f;
                            }
                            currentTimeMillis = this.e.getInterpolation(currentTimeMillis);
                            if (Math.abs(f) < 1.0f) {
                                circleProgressView.r = circleProgressView.s;
                            } else if (circleProgressView.r < circleProgressView.s) {
                                circleProgressView.r = (currentTimeMillis * (circleProgressView.s - this.b)) + this.b;
                            } else {
                                circleProgressView.r = this.b - (currentTimeMillis * (this.b - circleProgressView.s));
                            }
                            circleProgressView.t += circleProgressView.u;
                            if (circleProgressView.t > 360.0f) {
                                circleProgressView.t = 0.0f;
                            }
                            sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
                            circleProgressView.invalidate();
                            return;
                        default:
                            return;
                    }
                case END_SPINNING:
                    switch (AnonymousClass1.a[i - 1]) {
                        case 1:
                            circleProgressView.A = c.SPINNING;
                            if (circleProgressView.B != null) {
                                circleProgressView.B.a(circleProgressView.A);
                            }
                            sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
                            return;
                        case 2:
                            return;
                        case 3:
                            a(message, circleProgressView);
                            return;
                        case 4:
                            a(circleProgressView, message);
                            return;
                        case 5:
                            currentTimeMillis = (float) (((double) (System.currentTimeMillis() - this.d)) / this.g);
                            if (currentTimeMillis > 1.0f) {
                                currentTimeMillis = 1.0f;
                            }
                            circleProgressView.r = (1.0f - this.e.getInterpolation(currentTimeMillis)) * this.b;
                            circleProgressView.t += circleProgressView.u;
                            if (circleProgressView.r < 0.01f) {
                                circleProgressView.A = c.IDLE;
                                if (circleProgressView.B != null) {
                                    circleProgressView.B.a(circleProgressView.A);
                                }
                            }
                            sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
                            circleProgressView.invalidate();
                            return;
                        default:
                            return;
                    }
                case END_SPINNING_START_ANIMATING:
                    switch (AnonymousClass1.a[i - 1]) {
                        case 1:
                            circleProgressView.y = false;
                            b(circleProgressView);
                            return;
                        case 2:
                            return;
                        case 3:
                            circleProgressView.y = false;
                            a(message, circleProgressView);
                            return;
                        case 4:
                            circleProgressView.n = 0.0f;
                            circleProgressView.m = ((float[]) message.obj)[1];
                            sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
                            return;
                        case 5:
                            if (circleProgressView.r > circleProgressView.s && !circleProgressView.y) {
                                currentTimeMillis = (float) (((double) (System.currentTimeMillis() - this.d)) / this.g);
                                if (currentTimeMillis > 1.0f) {
                                    currentTimeMillis = 1.0f;
                                }
                                circleProgressView.r = (1.0f - this.e.getInterpolation(currentTimeMillis)) * this.b;
                            }
                            circleProgressView.t += circleProgressView.u;
                            if (circleProgressView.t > 360.0f && !circleProgressView.y) {
                                this.c = System.currentTimeMillis();
                                circleProgressView.y = true;
                                a(circleProgressView);
                                if (circleProgressView.B != null) {
                                    circleProgressView.B.a(c.START_ANIMATING_AFTER_SPINNING);
                                }
                            }
                            if (circleProgressView.y) {
                                circleProgressView.t = 360.0f;
                                circleProgressView.r -= circleProgressView.u;
                                c(circleProgressView);
                                currentTimeMillis = (float) (((double) (System.currentTimeMillis() - this.d)) / this.g);
                                if (currentTimeMillis > 1.0f) {
                                    currentTimeMillis = 1.0f;
                                }
                                circleProgressView.r = (1.0f - this.e.getInterpolation(currentTimeMillis)) * this.b;
                            }
                            if (((double) circleProgressView.r) < 0.1d) {
                                circleProgressView.A = c.ANIMATING;
                                if (circleProgressView.B != null) {
                                    circleProgressView.B.a(circleProgressView.A);
                                }
                                circleProgressView.invalidate();
                                circleProgressView.y = false;
                                circleProgressView.r = circleProgressView.s;
                            } else {
                                circleProgressView.invalidate();
                            }
                            sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
                            return;
                        default:
                            return;
                    }
                case ANIMATING:
                    switch (AnonymousClass1.a[i - 1]) {
                        case 1:
                            b(circleProgressView);
                            return;
                        case 2:
                            return;
                        case 3:
                            a(message, circleProgressView);
                            return;
                        case 4:
                            this.c = System.currentTimeMillis();
                            circleProgressView.n = circleProgressView.l;
                            circleProgressView.m = ((float[]) message.obj)[1];
                            return;
                        case 5:
                            if (c(circleProgressView)) {
                                circleProgressView.A = c.IDLE;
                                if (circleProgressView.B != null) {
                                    circleProgressView.B.a(circleProgressView.A);
                                }
                                circleProgressView.l = circleProgressView.m;
                            }
                            sendEmptyMessageDelayed(b.e - 1, ((long) circleProgressView.x) - (SystemClock.uptimeMillis() - this.h));
                            circleProgressView.invalidate();
                            return;
                        default:
                            return;
                    }
                default:
                    return;
            }
        }
    }
}
