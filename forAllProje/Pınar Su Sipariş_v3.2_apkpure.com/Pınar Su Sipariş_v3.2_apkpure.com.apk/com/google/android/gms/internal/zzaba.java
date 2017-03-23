package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzo;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class zzaba implements Runnable {
    private final Context mContext;
    private final zzaat zzbuM;
    private final zzaap zzbvl;
    private final zzaaz zzbvm;
    private final zzaaw zzbvn;

    public zzaba(Context context, zzaat com_google_android_gms_internal_zzaat, zzaap com_google_android_gms_internal_zzaap) {
        this(context, com_google_android_gms_internal_zzaat, com_google_android_gms_internal_zzaap, new zzaaz(), new zzaaw());
    }

    zzaba(Context context, zzaat com_google_android_gms_internal_zzaat, zzaap com_google_android_gms_internal_zzaap, zzaaz com_google_android_gms_internal_zzaaz, zzaaw com_google_android_gms_internal_zzaaw) {
        zzaa.zzz(context);
        zzaa.zzz(com_google_android_gms_internal_zzaap);
        this.mContext = context;
        this.zzbuM = com_google_android_gms_internal_zzaat;
        this.zzbvl = com_google_android_gms_internal_zzaap;
        this.zzbvm = com_google_android_gms_internal_zzaaz;
        this.zzbvn = com_google_android_gms_internal_zzaaw;
    }

    public zzaba(Context context, zzaat com_google_android_gms_internal_zzaat, zzaap com_google_android_gms_internal_zzaap, String str) {
        this(context, com_google_android_gms_internal_zzaat, com_google_android_gms_internal_zzaap, new zzaaz(), new zzaaw());
        this.zzbvn.zzhn(str);
    }

    public void run() {
        zzfp();
    }

    boolean zzLV() {
        if (!zzbN("android.permission.INTERNET")) {
            zzun.e("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        } else if (zzbN("android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            zzun.zzaW("No network connectivity - Offline");
            return false;
        } else {
            zzun.e("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        }
    }

    boolean zzbN(String str) {
        return this.mContext.getPackageManager().checkPermission(str, this.mContext.getPackageName()) == 0;
    }

    void zzfp() {
        String zzb;
        String str;
        if (zzLV()) {
            zzun.v("Starting to load resource from Network.");
            zzaay zzLU = this.zzbvm.zzLU();
            String valueOf;
            try {
                zzb = this.zzbvn.zzb(this.zzbuM.zzLN());
                str = "Loading resource from ";
                valueOf = String.valueOf(zzb);
                zzun.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                InputStream zzho = zzLU.zzho(zzb);
                try {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    zzo.zza(zzho, byteArrayOutputStream);
                    this.zzbvl.zzA(byteArrayOutputStream.toByteArray());
                } catch (Throwable e) {
                    str = String.valueOf(e.getMessage());
                    zzun.zzb(new StringBuilder((String.valueOf(zzb).length() + 66) + String.valueOf(str).length()).append("NetworkLoader: Error when parsing downloaded resources from url: ").append(zzb).append(" ").append(str).toString(), e);
                    this.zzbvl.onFailure(2);
                    zzLU.close();
                }
            } catch (FileNotFoundException e2) {
                str = "NetworkLoader: No data was retrieved from the given url: ";
                valueOf = String.valueOf(zzb);
                zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.zzbvl.onFailure(2);
            } catch (Throwable e3) {
                str = String.valueOf(e3.getMessage());
                zzun.zzb(new StringBuilder((String.valueOf(zzb).length() + 54) + String.valueOf(str).length()).append("NetworkLoader: Error when loading resource from url: ").append(zzb).append(" ").append(str).toString(), e3);
                this.zzbvl.onFailure(1);
            } finally {
                zzLU.close();
            }
        } else {
            this.zzbvl.onFailure(0);
        }
    }
}
