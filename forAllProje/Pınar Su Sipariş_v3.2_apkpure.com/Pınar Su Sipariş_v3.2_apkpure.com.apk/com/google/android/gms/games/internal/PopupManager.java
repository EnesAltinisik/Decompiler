package com.google.android.gms.games.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.common.util.zzs;
import java.lang.ref.WeakReference;

public class PopupManager {
    protected GamesClientImpl zzaMH;
    protected PopupLocationInfo zzaMI;

    public static final class PopupLocationInfo {
        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;
        public IBinder zzaMJ;
        public int zzaMK;

        private PopupLocationInfo(int i, IBinder iBinder) {
            this.zzaMK = -1;
            this.left = 0;
            this.top = 0;
            this.right = 0;
            this.bottom = 0;
            this.gravity = i;
            this.zzaMJ = iBinder;
        }

        public Bundle zzAA() {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", this.gravity);
            bundle.putInt("popupLocationInfo.displayId", this.zzaMK);
            bundle.putInt("popupLocationInfo.left", this.left);
            bundle.putInt("popupLocationInfo.top", this.top);
            bundle.putInt("popupLocationInfo.right", this.right);
            bundle.putInt("popupLocationInfo.bottom", this.bottom);
            return bundle;
        }
    }

    @TargetApi(12)
    private static final class a extends PopupManager implements OnAttachStateChangeListener, OnGlobalLayoutListener {
        private WeakReference<View> a;
        private boolean b = false;

        protected a(GamesClientImpl gamesClientImpl, int i) {
            super(gamesClientImpl, i);
        }

        @TargetApi(17)
        private void a(View view) {
            int i = -1;
            if (zzs.zzvc()) {
                Display display = view.getDisplay();
                if (display != null) {
                    i = display.getDisplayId();
                }
            }
            IBinder windowToken = view.getWindowToken();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            this.zzaMI.zzaMK = i;
            this.zzaMI.zzaMJ = windowToken;
            this.zzaMI.left = iArr[0];
            this.zzaMI.top = iArr[1];
            this.zzaMI.right = iArr[0] + width;
            this.zzaMI.bottom = iArr[1] + height;
            if (this.b) {
                zzAB();
                this.b = false;
            }
        }

        public void onGlobalLayout() {
            if (this.a != null) {
                View view = (View) this.a.get();
                if (view != null) {
                    a(view);
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            a(view);
        }

        public void onViewDetachedFromWindow(View view) {
            this.zzaMH.zzAm();
            view.removeOnAttachStateChangeListener(this);
        }

        public void zzAB() {
            if (this.zzaMI.zzaMJ != null) {
                super.zzAB();
            } else {
                this.b = this.a != null;
            }
        }

        protected void zzgR(int i) {
            this.zzaMI = new PopupLocationInfo(i, null);
        }

        @TargetApi(16)
        public void zzs(View view) {
            View view2;
            Context context;
            this.zzaMH.zzAm();
            if (this.a != null) {
                view2 = (View) this.a.get();
                context = this.zzaMH.getContext();
                if (view2 == null && (context instanceof Activity)) {
                    view2 = ((Activity) context).getWindow().getDecorView();
                }
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (zzs.zzvb()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            this.a = null;
            context = this.zzaMH.getContext();
            if (view == null && (context instanceof Activity)) {
                view2 = ((Activity) context).findViewById(16908290);
                if (view2 == null) {
                    view2 = ((Activity) context).getWindow().getDecorView();
                }
                GamesLog.zzD("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                view = view2;
            }
            if (view != null) {
                a(view);
                this.a = new WeakReference(view);
                view.addOnAttachStateChangeListener(this);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            GamesLog.zzE("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }
    }

    private PopupManager(GamesClientImpl gamesClientImpl, int i) {
        this.zzaMH = gamesClientImpl;
        zzgR(i);
    }

    public static PopupManager zza(GamesClientImpl gamesClientImpl, int i) {
        return zzs.zzuY() ? new a(gamesClientImpl, i) : new PopupManager(gamesClientImpl, i);
    }

    public void setGravity(int i) {
        this.zzaMI.gravity = i;
    }

    public void zzAB() {
        this.zzaMH.zza(this.zzaMI.zzaMJ, this.zzaMI.zzAA());
    }

    public Bundle zzAC() {
        return this.zzaMI.zzAA();
    }

    public IBinder zzAD() {
        return this.zzaMI.zzaMJ;
    }

    public PopupLocationInfo zzAE() {
        return this.zzaMI;
    }

    protected void zzgR(int i) {
        this.zzaMI = new PopupLocationInfo(i, new Binder());
    }

    public void zzs(View view) {
    }
}
