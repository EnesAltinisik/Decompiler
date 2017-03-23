package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;

@zzig
public class zzcd {
    private final Object zzpp = new Object();
    private final int zztW;
    private final int zztX;
    private final int zztY;
    private final zzci zztZ;
    private ArrayList<String> zzua = new ArrayList();
    private ArrayList<String> zzub = new ArrayList();
    private int zzuc = 0;
    private int zzud = 0;
    private int zzue = 0;
    private int zzuf;
    private String zzug = "";
    private String zzuh = "";

    public zzcd(int i, int i2, int i3, int i4) {
        this.zztW = i;
        this.zztX = i2;
        this.zztY = i3;
        this.zztZ = new zzci(i4);
    }

    private String zza(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(' ');
            if (stringBuffer.length() > i) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= i ? stringBuffer2.substring(0, i) : stringBuffer2;
    }

    private void zzf(String str, boolean z) {
        if (str != null && str.length() >= this.zztY) {
            synchronized (this.zzpp) {
                this.zzua.add(str);
                this.zzuc += str.length();
                if (z) {
                    this.zzub.add(str);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzcd)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzcd com_google_android_gms_internal_zzcd = (zzcd) obj;
        return com_google_android_gms_internal_zzcd.zzdl() != null && com_google_android_gms_internal_zzcd.zzdl().equals(zzdl());
    }

    public int getScore() {
        return this.zzuf;
    }

    public int hashCode() {
        return zzdl().hashCode();
    }

    public String toString() {
        int i = this.zzud;
        int i2 = this.zzuf;
        int i3 = this.zzuc;
        String valueOf = String.valueOf(zza(this.zzua, 100));
        String valueOf2 = String.valueOf(zza(this.zzub, 100));
        String str = this.zzug;
        String str2 = this.zzuh;
        return new StringBuilder((((String.valueOf(valueOf).length() + 133) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("ActivityContent fetchId: ").append(i).append(" score:").append(i2).append(" total_length:").append(i3).append("\n text: ").append(valueOf).append("\n viewableText").append(valueOf2).append("\n signture: ").append(str).append("\n viewableSignture: ").append(str2).toString();
    }

    int zza(int i, int i2) {
        return (this.zztW * i) + (this.zztX * i2);
    }

    public void zzd(String str, boolean z) {
        zzf(str, z);
        synchronized (this.zzpp) {
            if (this.zzue < 0) {
                zzb.zzaU("ActivityContent: negative number of WebViews.");
            }
            zzdq();
        }
    }

    public boolean zzdk() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzue == 0;
        }
        return z;
    }

    public String zzdl() {
        return this.zzug;
    }

    public String zzdm() {
        return this.zzuh;
    }

    public void zzdn() {
        synchronized (this.zzpp) {
            this.zzuf -= 100;
        }
    }

    public void zzdo() {
        synchronized (this.zzpp) {
            this.zzue--;
        }
    }

    public void zzdp() {
        synchronized (this.zzpp) {
            this.zzue++;
        }
    }

    public void zzdq() {
        synchronized (this.zzpp) {
            int zza = zza(this.zzuc, this.zzud);
            if (zza > this.zzuf) {
                this.zzuf = zza;
                this.zzug = this.zztZ.zza(this.zzua);
                this.zzuh = this.zztZ.zza(this.zzub);
            }
        }
    }

    int zzdr() {
        return this.zzuc;
    }

    public void zze(String str, boolean z) {
        zzf(str, z);
    }

    public void zzj(int i) {
        this.zzud = i;
    }
}
