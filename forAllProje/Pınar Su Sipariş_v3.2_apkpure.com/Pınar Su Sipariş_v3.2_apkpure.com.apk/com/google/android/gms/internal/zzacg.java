package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzacb.zza;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public class zzacg extends zzg<zzacb> {
    private static zzacg zzbBi;

    protected zzacg() {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    private static zzacg zzNl() {
        if (zzbBi == null) {
            zzbBi = new zzacg();
        }
        return zzbBi;
    }

    public static zzaby zza(Activity activity, zzc com_google_android_gms_dynamic_zzc, WalletFragmentOptions walletFragmentOptions, zzabz com_google_android_gms_internal_zzabz) throws GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if (isGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        try {
            return ((zzacb) zzNl().zzaI(activity)).zza(zze.zzD(activity), com_google_android_gms_dynamic_zzc, walletFragmentOptions, com_google_android_gms_internal_zzabz);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    protected /* synthetic */ Object zzc(IBinder iBinder) {
        return zzez(iBinder);
    }

    protected zzacb zzez(IBinder iBinder) {
        return zza.zzev(iBinder);
    }
}
