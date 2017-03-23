package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.util.zzh;
import com.google.android.gms.internal.zzamo.zzd;
import com.google.android.gms.internal.zznl;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

public final class zzb {
    public static final Api<NoOptions> API = new Api("ClearcutLogger.API", zzaaA, zzaaz);
    public static final com.google.android.gms.common.api.Api.zza<zznm, NoOptions> zzaaA = new com.google.android.gms.common.api.Api.zza<zznm, NoOptions>() {
        public zznm a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zznm(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    public static final zzf<zznm> zzaaz = new zzf();
    public static final zzc zzajv = new zznl();
    private final Context mContext;
    private final String zzZC;
    private String zzajA;
    private final boolean zzajB;
    private int zzajC;
    private final zzc zzajD;
    private final zza zzajE;
    private zzc zzajF;
    private final int zzajw;
    private String zzajx;
    private int zzajy;
    private String zzajz;
    private final com.google.android.gms.common.util.zze zzsd;

    public class zza {
        private String zzajA;
        private int zzajC;
        private final zzb zzajG;
        private ArrayList<Integer> zzajH;
        private final zzd zzajI;
        private boolean zzajJ;
        final /* synthetic */ zzb zzajK;
        private String zzajx;
        private int zzajy;
        private String zzajz;

        private zza(zzb com_google_android_gms_clearcut_zzb, byte[] bArr) {
            this(com_google_android_gms_clearcut_zzb, bArr, null);
        }

        private zza(zzb com_google_android_gms_clearcut_zzb, byte[] bArr, zzb com_google_android_gms_clearcut_zzb_zzb) {
            this.zzajK = com_google_android_gms_clearcut_zzb;
            this.zzajy = this.zzajK.zzajy;
            this.zzajx = this.zzajK.zzajx;
            this.zzajz = this.zzajK.zzajz;
            this.zzajA = this.zzajK.zzajA;
            this.zzajC = 0;
            this.zzajH = null;
            this.zzajI = new zzd();
            this.zzajJ = false;
            this.zzajz = com_google_android_gms_clearcut_zzb.zzajz;
            this.zzajA = com_google_android_gms_clearcut_zzb.zzajA;
            this.zzajI.zzcaG = com_google_android_gms_clearcut_zzb.zzsd.currentTimeMillis();
            this.zzajI.zzcaH = com_google_android_gms_clearcut_zzb.zzsd.elapsedRealtime();
            this.zzajI.zzcaW = (long) com_google_android_gms_clearcut_zzb.zzajE.zzac(com_google_android_gms_clearcut_zzb.mContext);
            this.zzajI.zzcaR = com_google_android_gms_clearcut_zzb.zzajF.zzE(this.zzajI.zzcaG);
            if (bArr != null) {
                this.zzajI.zzcaM = bArr;
            }
            this.zzajG = com_google_android_gms_clearcut_zzb_zzb;
        }

        public zza zzbx(int i) {
            this.zzajI.zzcaJ = i;
            return this;
        }

        public zza zzby(int i) {
            this.zzajI.zzoZ = i;
            return this;
        }

        public PendingResult<Status> zzd(GoogleApiClient googleApiClient) {
            if (this.zzajJ) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.zzajJ = true;
            return this.zzajK.zzajD.zza(googleApiClient, zzqO());
        }

        public LogEventParcelable zzqO() {
            return new LogEventParcelable(new PlayLoggerContext(this.zzajK.zzZC, this.zzajK.zzajw, this.zzajy, this.zzajx, this.zzajz, this.zzajA, this.zzajK.zzajB, this.zzajC), this.zzajI, this.zzajG, null, zzb.zzb(null));
        }
    }

    public interface zzb {
        byte[] zzqP();
    }

    public static class zzc {
        public long zzE(long j) {
            return (long) (TimeZone.getDefault().getOffset(j) / 1000);
        }
    }

    public zzb(Context context, int i, String str, String str2, String str3, boolean z, zzc com_google_android_gms_clearcut_zzc, com.google.android.gms.common.util.zze com_google_android_gms_common_util_zze, zzc com_google_android_gms_clearcut_zzb_zzc, zza com_google_android_gms_clearcut_zza) {
        this.zzajy = -1;
        this.zzajC = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.mContext = applicationContext;
        this.zzZC = context.getPackageName();
        this.zzajw = zzad(context);
        this.zzajy = i;
        this.zzajx = str;
        this.zzajz = str2;
        this.zzajA = str3;
        this.zzajB = z;
        this.zzajD = com_google_android_gms_clearcut_zzc;
        this.zzsd = com_google_android_gms_common_util_zze;
        if (com_google_android_gms_clearcut_zzb_zzc == null) {
            com_google_android_gms_clearcut_zzb_zzc = new zzc();
        }
        this.zzajF = com_google_android_gms_clearcut_zzb_zzc;
        this.zzajE = com_google_android_gms_clearcut_zza;
        this.zzajC = 0;
        if (this.zzajB) {
            zzaa.zzb(this.zzajz == null, (Object) "can't be anonymous with an upload account");
        }
    }

    public zzb(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, zzajv, zzh.zzuW(), null, zza.zzaju);
    }

    private int zzad(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }

    private static int[] zzb(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        return iArr;
    }

    public zza zzj(byte[] bArr) {
        return new zza(bArr);
    }
}
