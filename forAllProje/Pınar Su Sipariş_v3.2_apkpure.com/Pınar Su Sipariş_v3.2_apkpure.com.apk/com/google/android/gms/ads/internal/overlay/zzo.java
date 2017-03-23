package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.internal.zzig;

@zzig
public class zzo extends FrameLayout implements OnClickListener {
    private final ImageButton zzHZ;
    private final zzu zzIa;

    public zzo(Context context, int i, zzu com_google_android_gms_ads_internal_overlay_zzu) {
        super(context);
        this.zzIa = com_google_android_gms_ads_internal_overlay_zzu;
        setOnClickListener(this);
        this.zzHZ = new ImageButton(context);
        this.zzHZ.setImageResource(17301527);
        this.zzHZ.setBackgroundColor(0);
        this.zzHZ.setOnClickListener(this);
        this.zzHZ.setPadding(0, 0, 0, 0);
        this.zzHZ.setContentDescription("Interstitial close button");
        int zza = zzm.zzdQ().zza(context, i);
        addView(this.zzHZ, new LayoutParams(zza, zza, 17));
    }

    public void onClick(View view) {
        if (this.zzIa != null) {
            this.zzIa.zzgp();
        }
    }

    public void zza(boolean z, boolean z2) {
        if (!z2) {
            this.zzHZ.setVisibility(0);
        } else if (z) {
            this.zzHZ.setVisibility(4);
        } else {
            this.zzHZ.setVisibility(8);
        }
    }
}
