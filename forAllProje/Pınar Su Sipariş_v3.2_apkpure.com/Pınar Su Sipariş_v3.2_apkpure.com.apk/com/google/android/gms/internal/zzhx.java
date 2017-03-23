package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzjn.zza;

@TargetApi(19)
@zzig
public class zzhx extends zzhw {
    private Object zzKb = new Object();
    private PopupWindow zzKc;
    private boolean zzKd = false;

    zzhx(Context context, zza com_google_android_gms_internal_zzjn_zza, zzla com_google_android_gms_internal_zzla, zzhv.zza com_google_android_gms_internal_zzhv_zza) {
        super(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzhv_zza);
    }

    private void zzhy() {
        synchronized (this.zzKb) {
            this.zzKd = true;
            if ((this.mContext instanceof Activity) && ((Activity) this.mContext).isDestroyed()) {
                this.zzKc = null;
            }
            if (this.zzKc != null) {
                if (this.zzKc.isShowing()) {
                    this.zzKc.dismiss();
                }
                this.zzKc = null;
            }
        }
    }

    public void cancel() {
        zzhy();
        super.cancel();
    }

    protected void zzH(int i) {
        zzhy();
        super.zzH(i);
    }

    protected void zzhx() {
        Window window = this.mContext instanceof Activity ? ((Activity) this.mContext).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) this.mContext).isDestroyed()) {
            View frameLayout = new FrameLayout(this.mContext);
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            frameLayout.addView(this.zzBb.getView(), -1, -1);
            synchronized (this.zzKb) {
                if (this.zzKd) {
                    return;
                }
                this.zzKc = new PopupWindow(frameLayout, 1, 1, false);
                this.zzKc.setOutsideTouchable(true);
                this.zzKc.setClippingEnabled(false);
                zzb.zzaU("Displaying the 1x1 popup off the screen.");
                try {
                    this.zzKc.showAtLocation(window.getDecorView(), 0, -1, -1);
                } catch (Exception e) {
                    this.zzKc = null;
                }
            }
        }
    }
}
