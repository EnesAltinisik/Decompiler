package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;

@zzig
public class zzhs implements Runnable {
    protected final zzla zzBb;
    private final Handler zzJP;
    private final long zzJQ;
    private long zzJR;
    private com.google.android.gms.internal.zzlb.zza zzJS;
    protected boolean zzJT;
    protected boolean zzJU;
    private final int zzpi;
    private final int zzpj;

    protected final class zza extends AsyncTask<Void, Void, Boolean> {
        private final WebView zzJV;
        private Bitmap zzJW;
        final /* synthetic */ zzhs zzJX;

        public zza(zzhs com_google_android_gms_internal_zzhs, WebView webView) {
            this.zzJX = com_google_android_gms_internal_zzhs;
            this.zzJV = webView;
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return zzb((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            zza((Boolean) obj);
        }

        protected synchronized void onPreExecute() {
            this.zzJW = Bitmap.createBitmap(this.zzJX.zzpi, this.zzJX.zzpj, Config.ARGB_8888);
            this.zzJV.setVisibility(0);
            this.zzJV.measure(MeasureSpec.makeMeasureSpec(this.zzJX.zzpi, 0), MeasureSpec.makeMeasureSpec(this.zzJX.zzpj, 0));
            this.zzJV.layout(0, 0, this.zzJX.zzpi, this.zzJX.zzpj);
            this.zzJV.draw(new Canvas(this.zzJW));
            this.zzJV.invalidate();
        }

        protected void zza(Boolean bool) {
            zzhs.zzc(this.zzJX);
            if (bool.booleanValue() || this.zzJX.zzhv() || this.zzJX.zzJR <= 0) {
                this.zzJX.zzJU = bool.booleanValue();
                this.zzJX.zzJS.zza(this.zzJX.zzBb, true);
            } else if (this.zzJX.zzJR > 0) {
                if (zzb.zzX(2)) {
                    zzb.zzaU("Ad not detected, scheduling another run.");
                }
                this.zzJX.zzJP.postDelayed(this.zzJX, this.zzJX.zzJQ);
            }
        }

        protected synchronized Boolean zzb(Void... voidArr) {
            Boolean valueOf;
            int width = this.zzJW.getWidth();
            int height = this.zzJW.getHeight();
            if (width == 0 || height == 0) {
                valueOf = Boolean.valueOf(false);
            } else {
                int i = 0;
                for (int i2 = 0; i2 < width; i2 += 10) {
                    for (int i3 = 0; i3 < height; i3 += 10) {
                        if (this.zzJW.getPixel(i2, i3) != 0) {
                            i++;
                        }
                    }
                }
                valueOf = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
            }
            return valueOf;
        }
    }

    public zzhs(com.google.android.gms.internal.zzlb.zza com_google_android_gms_internal_zzlb_zza, zzla com_google_android_gms_internal_zzla, int i, int i2) {
        this(com_google_android_gms_internal_zzlb_zza, com_google_android_gms_internal_zzla, i, i2, 200, 50);
    }

    public zzhs(com.google.android.gms.internal.zzlb.zza com_google_android_gms_internal_zzlb_zza, zzla com_google_android_gms_internal_zzla, int i, int i2, long j, long j2) {
        this.zzJQ = j;
        this.zzJR = j2;
        this.zzJP = new Handler(Looper.getMainLooper());
        this.zzBb = com_google_android_gms_internal_zzla;
        this.zzJS = com_google_android_gms_internal_zzlb_zza;
        this.zzJT = false;
        this.zzJU = false;
        this.zzpj = i2;
        this.zzpi = i;
    }

    static /* synthetic */ long zzc(zzhs com_google_android_gms_internal_zzhs) {
        long j = com_google_android_gms_internal_zzhs.zzJR - 1;
        com_google_android_gms_internal_zzhs.zzJR = j;
        return j;
    }

    public void run() {
        if (this.zzBb == null || zzhv()) {
            this.zzJS.zza(this.zzBb, true);
        } else {
            new zza(this, this.zzBb.getWebView()).execute(new Void[0]);
        }
    }

    public void zza(AdResponseParcel adResponseParcel) {
        zza(adResponseParcel, new zzlk(this, this.zzBb, adResponseParcel.zzLW));
    }

    public void zza(AdResponseParcel adResponseParcel, zzlk com_google_android_gms_internal_zzlk) {
        this.zzBb.setWebViewClient(com_google_android_gms_internal_zzlk);
        this.zzBb.loadDataWithBaseURL(TextUtils.isEmpty(adResponseParcel.zzHH) ? null : zzu.zzck().zzaN(adResponseParcel.zzHH), adResponseParcel.body, "text/html", Constants.ENCODING, null);
    }

    public void zzht() {
        this.zzJP.postDelayed(this, this.zzJQ);
    }

    public synchronized void zzhu() {
        this.zzJT = true;
    }

    public synchronized boolean zzhv() {
        return this.zzJT;
    }

    public boolean zzhw() {
        return this.zzJU;
    }
}
