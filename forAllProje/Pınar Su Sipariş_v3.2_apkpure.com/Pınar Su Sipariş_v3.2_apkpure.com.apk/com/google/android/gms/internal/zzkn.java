package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzu;

@zzig
public final class zzkn {
    private final View mView;
    private Activity zzRn;
    private boolean zzRo;
    private boolean zzRp;
    private boolean zzRq;
    private OnGlobalLayoutListener zzRr;
    private OnScrollChangedListener zzRs;

    public zzkn(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.zzRn = activity;
        this.mView = view;
        this.zzRr = onGlobalLayoutListener;
        this.zzRs = onScrollChangedListener;
    }

    private void zzjp() {
        if (!this.zzRo) {
            if (this.zzRr != null) {
                if (this.zzRn != null) {
                    zzu.zzck().zza(this.zzRn, this.zzRr);
                }
                zzu.zzcE().zza(this.mView, this.zzRr);
            }
            if (this.zzRs != null) {
                if (this.zzRn != null) {
                    zzu.zzck().zza(this.zzRn, this.zzRs);
                }
                zzu.zzcE().zza(this.mView, this.zzRs);
            }
            this.zzRo = true;
        }
    }

    private void zzjq() {
        if (this.zzRn != null && this.zzRo) {
            if (!(this.zzRr == null || this.zzRn == null)) {
                zzu.zzcm().zzb(this.zzRn, this.zzRr);
            }
            if (!(this.zzRs == null || this.zzRn == null)) {
                zzu.zzck().zzb(this.zzRn, this.zzRs);
            }
            this.zzRo = false;
        }
    }

    public void onAttachedToWindow() {
        this.zzRp = true;
        if (this.zzRq) {
            zzjp();
        }
    }

    public void onDetachedFromWindow() {
        this.zzRp = false;
        zzjq();
    }

    public void zzjn() {
        this.zzRq = true;
        if (this.zzRp) {
            zzjp();
        }
    }

    public void zzjo() {
        this.zzRq = false;
        zzjq();
    }

    public void zzl(Activity activity) {
        this.zzRn = activity;
    }
}
