package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.io.IOException;

public abstract class zzd {
    protected final zzl zzahW;
    private final String zzahX;
    private zzn zzahY;

    protected zzd(String str, String str2, String str3) {
        zzf.zzcE(str);
        this.zzahX = str;
        this.zzahW = new zzl(str2);
        setSessionLabel(str3);
    }

    public String getNamespace() {
        return this.zzahX;
    }

    public void setSessionLabel(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.zzahW.zzcK(str);
        }
    }

    public final void zza(zzn com_google_android_gms_cast_internal_zzn) {
        this.zzahY = com_google_android_gms_cast_internal_zzn;
        if (this.zzahY == null) {
            zzqo();
        }
    }

    protected final void zza(String str, long j, String str2) throws IOException {
        this.zzahW.zza("Sending text message: %s to: %s", str, str2);
        this.zzahY.zza(this.zzahX, str, j, str2);
    }

    public void zzb(long j, int i) {
    }

    public void zzcC(String str) {
    }

    public void zzqo() {
    }

    protected final long zzqp() {
        return this.zzahY.zzpZ();
    }
}
