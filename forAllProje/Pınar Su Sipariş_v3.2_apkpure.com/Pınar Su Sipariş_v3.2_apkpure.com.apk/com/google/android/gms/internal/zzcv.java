package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzu;
import java.util.LinkedHashMap;
import java.util.Map;

@zzig
public class zzcv {
    private Context mContext = null;
    private String zztK = null;
    private boolean zzzL;
    private String zzzM;
    private Map<String, String> zzzN;

    public zzcv(Context context, String str) {
        this.mContext = context;
        this.zztK = str;
        this.zzzL = ((Boolean) zzcu.zzxF.get()).booleanValue();
        this.zzzM = (String) zzcu.zzxG.get();
        this.zzzN = new LinkedHashMap();
        this.zzzN.put("s", "gmob_sdk");
        this.zzzN.put("v", "3");
        this.zzzN.put("os", VERSION.RELEASE);
        this.zzzN.put("sdk", VERSION.SDK);
        this.zzzN.put("device", zzu.zzck().zzjb());
        this.zzzN.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        this.zzzN.put("is_lite_sdk", zzu.zzck().zzM(context) ? "1" : "0");
        zzio zzx = zzu.zzcq().zzx(this.mContext);
        this.zzzN.put("network_coarse", Integer.toString(zzx.zzOh));
        this.zzzN.put("network_fine", Integer.toString(zzx.zzOi));
    }

    Context getContext() {
        return this.mContext;
    }

    String zzdf() {
        return this.zztK;
    }

    boolean zzet() {
        return this.zzzL;
    }

    String zzeu() {
        return this.zzzM;
    }

    Map<String, String> zzev() {
        return this.zzzN;
    }
}
