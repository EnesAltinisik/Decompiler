package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public abstract class zzk<T> implements Comparable<zzk<T>> {
    private final a zzC;
    private final int zzD;
    private final String zzE;
    private final int zzF;
    private final com.google.android.gms.internal.zzm.zza zzG;
    private Integer zzH;
    private zzl zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private long zzM;
    private zzo zzN;
    private com.google.android.gms.internal.zzb.zza zzO;

    public enum zza {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public zzk(int i, String str, com.google.android.gms.internal.zzm.zza com_google_android_gms_internal_zzm_zza) {
        this.zzC = a.a ? new a() : null;
        this.zzJ = true;
        this.zzK = false;
        this.zzL = false;
        this.zzM = 0;
        this.zzO = null;
        this.zzD = i;
        this.zzE = str;
        this.zzG = com_google_android_gms_internal_zzm_zza;
        zza(new zzd());
        this.zzF = zzb(str);
    }

    private byte[] zza(Map<String, String> map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : map.entrySet()) {
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append('&');
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Encoding not supported: ";
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    private static int zzb(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    return host.hashCode();
                }
            }
        }
        return 0;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzc((zzk) obj);
    }

    public Map<String, String> getHeaders() throws zza {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.zzD;
    }

    public String getUrl() {
        return this.zzE;
    }

    public boolean isCanceled() {
        return false;
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(zzf()));
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        str = "[ ] ";
        String valueOf2 = String.valueOf(getUrl());
        String valueOf3 = String.valueOf(zzr());
        String valueOf4 = String.valueOf(this.zzH);
        return new StringBuilder(((((String.valueOf(str).length() + 3) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(str).append(valueOf2).append(" ").append(valueOf).append(" ").append(valueOf3).append(" ").append(valueOf4).toString();
    }

    public final zzk<?> zza(int i) {
        this.zzH = Integer.valueOf(i);
        return this;
    }

    public zzk<?> zza(com.google.android.gms.internal.zzb.zza com_google_android_gms_internal_zzb_zza) {
        this.zzO = com_google_android_gms_internal_zzb_zza;
        return this;
    }

    public zzk<?> zza(zzl com_google_android_gms_internal_zzl) {
        this.zzI = com_google_android_gms_internal_zzl;
        return this;
    }

    public zzk<?> zza(zzo com_google_android_gms_internal_zzo) {
        this.zzN = com_google_android_gms_internal_zzo;
        return this;
    }

    protected abstract zzm<T> zza(zzi com_google_android_gms_internal_zzi);

    protected abstract void zza(T t);

    protected zzr zzb(zzr com_google_android_gms_internal_zzr) {
        return com_google_android_gms_internal_zzr;
    }

    public int zzc(zzk<T> com_google_android_gms_internal_zzk_T) {
        zza zzr = zzr();
        zza zzr2 = com_google_android_gms_internal_zzk_T.zzr();
        return zzr == zzr2 ? this.zzH.intValue() - com_google_android_gms_internal_zzk_T.zzH.intValue() : zzr2.ordinal() - zzr.ordinal();
    }

    public void zzc(zzr com_google_android_gms_internal_zzr) {
        if (this.zzG != null) {
            this.zzG.zze(com_google_android_gms_internal_zzr);
        }
    }

    public void zzc(String str) {
        if (a.a) {
            this.zzC.a(str, Thread.currentThread().getId());
        } else if (this.zzM == 0) {
            this.zzM = SystemClock.elapsedRealtime();
        }
    }

    void zzd(final String str) {
        if (this.zzI != null) {
            this.zzI.zzf(this);
        }
        if (a.a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    final /* synthetic */ zzk c;

                    public void run() {
                        this.c.zzC.a(str, id);
                        this.c.zzC.a(toString());
                    }
                });
                return;
            }
            this.zzC.a(str, id);
            this.zzC.a(toString());
            return;
        }
        if (SystemClock.elapsedRealtime() - this.zzM >= 3000) {
            zzs.zzb("%d ms: %s", Long.valueOf(SystemClock.elapsedRealtime() - this.zzM), toString());
        }
    }

    public int zzf() {
        return this.zzF;
    }

    public String zzg() {
        return getUrl();
    }

    public com.google.android.gms.internal.zzb.zza zzh() {
        return this.zzO;
    }

    @Deprecated
    protected Map<String, String> zzi() throws zza {
        return zzm();
    }

    @Deprecated
    protected String zzj() {
        return zzn();
    }

    @Deprecated
    public String zzk() {
        return zzo();
    }

    @Deprecated
    public byte[] zzl() throws zza {
        Map zzi = zzi();
        return (zzi == null || zzi.size() <= 0) ? null : zza(zzi, zzj());
    }

    protected Map<String, String> zzm() throws zza {
        return null;
    }

    protected String zzn() {
        return Constants.ENCODING;
    }

    public String zzo() {
        String str = "application/x-www-form-urlencoded; charset=";
        String valueOf = String.valueOf(zzn());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public byte[] zzp() throws zza {
        Map zzm = zzm();
        return (zzm == null || zzm.size() <= 0) ? null : zza(zzm, zzn());
    }

    public final boolean zzq() {
        return this.zzJ;
    }

    public zza zzr() {
        return zza.NORMAL;
    }

    public final int zzs() {
        return this.zzN.zzc();
    }

    public zzo zzt() {
        return this.zzN;
    }

    public void zzu() {
        this.zzL = true;
    }

    public boolean zzv() {
        return this.zzL;
    }
}
