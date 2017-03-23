package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzx;
import com.google.android.gms.measurement.internal.zzm.zza;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class zzy extends zza {
    private final zzx zzbbl;
    private final boolean zzbfb;

    public zzy(zzx com_google_android_gms_measurement_internal_zzx) {
        zzaa.zzz(com_google_android_gms_measurement_internal_zzx);
        this.zzbbl = com_google_android_gms_measurement_internal_zzx;
        this.zzbfb = false;
    }

    public zzy(zzx com_google_android_gms_measurement_internal_zzx, boolean z) {
        zzaa.zzz(com_google_android_gms_measurement_internal_zzx);
        this.zzbbl = com_google_android_gms_measurement_internal_zzx;
        this.zzbfb = z;
    }

    private void zzf(AppMetadata appMetadata) {
        zzaa.zzz(appMetadata);
        zzfC(appMetadata.packageName);
        this.zzbbl.zzFi().zzfN(appMetadata.zzbbK);
    }

    private void zzfC(String str) throws SecurityException {
        if (TextUtils.isEmpty(str)) {
            this.zzbbl.zzFm().zzFE().log("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        try {
            zzfD(str);
        } catch (SecurityException e) {
            this.zzbbl.zzFm().zzFE().zzj("Measurement Service called with invalid calling package", str);
            throw e;
        }
    }

    public List<UserAttributeParcel> zza(final AppMetadata appMetadata, boolean z) {
        Object e;
        zzf(appMetadata);
        try {
            List<e> list = (List) this.zzbbl.zzFl().zzd(new Callable<List<e>>(this) {
                final /* synthetic */ zzy b;

                public List<e> a() throws Exception {
                    this.b.zzbbl.zzGq();
                    return this.b.zzbbl.zzFh().a(appMetadata.packageName);
                }

                public /* synthetic */ Object call() throws Exception {
                    return a();
                }
            }).get();
            List<UserAttributeParcel> arrayList = new ArrayList(list.size());
            for (e eVar : list) {
                if (z || !zzal.zzfQ(eVar.b)) {
                    arrayList.add(new UserAttributeParcel(eVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.zzbbl.zzFm().zzFE().zzj("Failed to get user attributes", e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.zzbbl.zzFm().zzFE().zzj("Failed to get user attributes", e);
            return null;
        }
    }

    public void zza(final AppMetadata appMetadata) {
        zzf(appMetadata);
        this.zzbbl.zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzy b;

            public void run() {
                this.b.zzbbl.zzGq();
                this.b.zzfB(appMetadata.zzbbO);
                this.b.zzbbl.zzd(appMetadata);
            }
        });
    }

    public void zza(final EventParcel eventParcel, final AppMetadata appMetadata) {
        zzaa.zzz(eventParcel);
        zzf(appMetadata);
        this.zzbbl.zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzy c;

            public void run() {
                this.c.zzbbl.zzGq();
                this.c.zzfB(appMetadata.zzbbO);
                this.c.zzbbl.zzb(eventParcel, appMetadata);
            }
        });
    }

    public void zza(final EventParcel eventParcel, final String str, final String str2) {
        zzaa.zzz(eventParcel);
        zzaa.zzdl(str);
        zzfC(str);
        this.zzbbl.zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzy d;

            public void run() {
                this.d.zzbbl.zzGq();
                this.d.zzfB(str2);
                this.d.zzbbl.zzb(eventParcel, str);
            }
        });
    }

    public void zza(final UserAttributeParcel userAttributeParcel, final AppMetadata appMetadata) {
        zzaa.zzz(userAttributeParcel);
        zzf(appMetadata);
        if (userAttributeParcel.getValue() == null) {
            this.zzbbl.zzFl().zzg(new Runnable(this) {
                final /* synthetic */ zzy c;

                public void run() {
                    this.c.zzbbl.zzGq();
                    this.c.zzfB(appMetadata.zzbbO);
                    this.c.zzbbl.zzc(userAttributeParcel, appMetadata);
                }
            });
        } else {
            this.zzbbl.zzFl().zzg(new Runnable(this) {
                final /* synthetic */ zzy c;

                public void run() {
                    this.c.zzbbl.zzGq();
                    this.c.zzfB(appMetadata.zzbbO);
                    this.c.zzbbl.zzb(userAttributeParcel, appMetadata);
                }
            });
        }
    }

    public byte[] zza(final EventParcel eventParcel, final String str) {
        Object e;
        zzaa.zzdl(str);
        zzaa.zzz(eventParcel);
        zzfC(str);
        this.zzbbl.zzFm().zzFK().zzj("Log and bundle. event", eventParcel.name);
        long nanoTime = this.zzbbl.zzlQ().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zzbbl.zzFl().zze(new Callable<byte[]>(this) {
                final /* synthetic */ zzy c;

                public byte[] a() throws Exception {
                    this.c.zzbbl.zzGq();
                    return this.c.zzbbl.zza(eventParcel, str);
                }

                public /* synthetic */ Object call() throws Exception {
                    return a();
                }
            }).get();
            if (bArr == null) {
                this.zzbbl.zzFm().zzFE().log("Log and bundle returned null");
                bArr = new byte[0];
            }
            this.zzbbl.zzFm().zzFK().zzd("Log and bundle processed. event, size, time_ms", eventParcel.name, Integer.valueOf(bArr.length), Long.valueOf((this.zzbbl.zzlQ().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            this.zzbbl.zzFm().zzFE().zze("Failed to log and bundle. event, error", eventParcel.name, e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.zzbbl.zzFm().zzFE().zze("Failed to log and bundle. event, error", eventParcel.name, e);
            return null;
        }
    }

    public void zzb(final AppMetadata appMetadata) {
        zzf(appMetadata);
        this.zzbbl.zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzy b;

            public void run() {
                this.b.zzbbl.zzGq();
                this.b.zzfB(appMetadata.zzbbO);
                this.b.zzbbl.zzc(appMetadata);
            }
        });
    }

    void zzfB(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(":", 2);
            if (split.length == 2) {
                try {
                    long longValue = Long.valueOf(split[0]).longValue();
                    if (longValue > 0) {
                        this.zzbbl.zzFn().b.zzf(split[1], longValue);
                    } else {
                        this.zzbbl.zzFm().zzFG().zzj("Combining sample with a non-positive weight", Long.valueOf(longValue));
                    }
                } catch (NumberFormatException e) {
                    this.zzbbl.zzFm().zzFG().zzj("Combining sample with a non-number weight", split[0]);
                }
            }
        }
    }

    protected void zzfD(String str) throws SecurityException {
        int myUid = this.zzbfb ? Process.myUid() : Binder.getCallingUid();
        if (!zzx.zzd(this.zzbbl.getContext(), myUid, str)) {
            if (!zzx.zze(this.zzbbl.getContext(), myUid) || this.zzbbl.zzGh()) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
        }
    }
}
