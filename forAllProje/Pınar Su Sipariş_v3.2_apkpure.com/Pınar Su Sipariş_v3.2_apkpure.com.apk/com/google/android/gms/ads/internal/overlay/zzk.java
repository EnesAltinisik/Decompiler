package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzda;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzla;
import java.util.HashMap;
import java.util.Map;

@zzig
public class zzk extends FrameLayout implements zzh {
    private final zzla zzBb;
    private String zzCv;
    private final FrameLayout zzHP;
    private final b zzHQ;
    private zzi zzHR;
    private boolean zzHS;
    private boolean zzHT;
    private TextView zzHU;
    private long zzHV;
    private long zzHW;
    private String zzHX;

    public zzk(Context context, zzla com_google_android_gms_internal_zzla, int i, boolean z, zzdc com_google_android_gms_internal_zzdc, zzda com_google_android_gms_internal_zzda) {
        super(context);
        this.zzBb = com_google_android_gms_internal_zzla;
        this.zzHP = new FrameLayout(context);
        addView(this.zzHP, new LayoutParams(-1, -1));
        zzb.zzv(com_google_android_gms_internal_zzla.zzjA());
        this.zzHR = com_google_android_gms_internal_zzla.zzjA().zzqn.zza(context, com_google_android_gms_internal_zzla, i, z, com_google_android_gms_internal_zzdc, com_google_android_gms_internal_zzda);
        if (this.zzHR != null) {
            this.zzHP.addView(this.zzHR, new LayoutParams(-1, -1, 17));
        }
        this.zzHU = new TextView(context);
        this.zzHU.setBackgroundColor(-16777216);
        zzgJ();
        this.zzHQ = new b(this);
        this.zzHQ.b();
        if (this.zzHR != null) {
            this.zzHR.zza((zzh) this);
        }
        if (this.zzHR == null) {
            zzj("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private void zza(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put("event", str);
        int length = strArr.length;
        int i = 0;
        Object obj = null;
        while (i < length) {
            Object obj2 = strArr[i];
            if (obj != null) {
                hashMap.put(obj, obj2);
                obj2 = null;
            }
            i++;
            obj = obj2;
        }
        this.zzBb.zza("onVideoEvent", hashMap);
    }

    private void zzgJ() {
        if (!zzgL()) {
            this.zzHP.addView(this.zzHU, new LayoutParams(-1, -1));
            this.zzHP.bringChildToFront(this.zzHU);
        }
    }

    private void zzgK() {
        if (zzgL()) {
            this.zzHP.removeView(this.zzHU);
        }
    }

    private boolean zzgL() {
        return this.zzHU.getParent() != null;
    }

    private void zzgM() {
        if (this.zzBb.zzjy() != null && !this.zzHS) {
            this.zzHT = (this.zzBb.zzjy().getWindow().getAttributes().flags & 128) != 0;
            if (!this.zzHT) {
                this.zzBb.zzjy().getWindow().addFlags(128);
                this.zzHS = true;
            }
        }
    }

    private void zzgN() {
        if (this.zzBb.zzjy() != null && this.zzHS && !this.zzHT) {
            this.zzBb.zzjy().getWindow().clearFlags(128);
            this.zzHS = false;
        }
    }

    public static void zzh(zzla com_google_android_gms_internal_zzla) {
        Map hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        com_google_android_gms_internal_zzla.zza("onVideoEvent", hashMap);
    }

    public void destroy() {
        this.zzHQ.a();
        if (this.zzHR != null) {
            this.zzHR.stop();
        }
        zzgN();
    }

    public void onPaused() {
        zza("pause", new String[0]);
        zzgN();
    }

    public void pause() {
        if (this.zzHR != null) {
            this.zzHR.pause();
        }
    }

    public void play() {
        if (this.zzHR != null) {
            this.zzHR.play();
        }
    }

    public void seekTo(int i) {
        if (this.zzHR != null) {
            this.zzHR.seekTo(i);
        }
    }

    public void setMimeType(String str) {
        this.zzHX = str;
    }

    public void zza(float f) {
        if (this.zzHR != null) {
            this.zzHR.zza(f);
        }
    }

    public void zza(float f, float f2) {
        if (this.zzHR != null) {
            this.zzHR.zza(f, f2);
        }
    }

    public void zzav(String str) {
        this.zzCv = str;
    }

    public void zzd(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(i3 + 2, i4 + 2);
            layoutParams.setMargins(i - 1, i2 - 1, 0, 0);
            this.zzHP.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public void zzd(MotionEvent motionEvent) {
        if (this.zzHR != null) {
            this.zzHR.dispatchTouchEvent(motionEvent);
        }
    }

    public void zzfp() {
        if (this.zzHR != null) {
            if (TextUtils.isEmpty(this.zzCv)) {
                zza("no_src", new String[0]);
                return;
            }
            this.zzHR.setMimeType(this.zzHX);
            this.zzHR.setVideoPath(this.zzCv);
        }
    }

    public void zzgC() {
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzk a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zza("surfaceCreated", new String[0]);
            }
        });
    }

    public void zzgD() {
        if (this.zzHR != null && this.zzHW == 0) {
            float duration = ((float) this.zzHR.getDuration()) / 1000.0f;
            int videoWidth = this.zzHR.getVideoWidth();
            int videoHeight = this.zzHR.getVideoHeight();
            zza("canplaythrough", "duration", String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    public void zzgE() {
        zzgM();
    }

    public void zzgF() {
        zza("ended", new String[0]);
        zzgN();
    }

    public void zzgG() {
        zzgJ();
        this.zzHW = this.zzHV;
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzk a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zza("surfaceDestroyed", new String[0]);
            }
        });
    }

    public void zzgH() {
        if (this.zzHR != null) {
            View textView = new TextView(this.zzHR.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.zzHR.zzgc());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.zzHP.addView(textView, new LayoutParams(-2, -2, 17));
            this.zzHP.bringChildToFront(textView);
        }
    }

    void zzgI() {
        if (this.zzHR != null) {
            long currentPosition = (long) this.zzHR.getCurrentPosition();
            if (this.zzHV != currentPosition && currentPosition > 0) {
                zzgK();
                float f = ((float) currentPosition) / 1000.0f;
                zza("timeupdate", "time", String.valueOf(f));
                this.zzHV = currentPosition;
            }
        }
    }

    public void zzgi() {
        if (this.zzHR != null) {
            this.zzHR.zzgi();
        }
    }

    public void zzgj() {
        if (this.zzHR != null) {
            this.zzHR.zzgj();
        }
    }

    public void zzj(String str, String str2) {
        zza("error", "what", str, "extra", str2);
    }
}
