package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzfj.zzc;
import com.google.android.gms.internal.zzkt.zza;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public class zzcb extends zzbv {
    private zzc zztR;
    private boolean zztS;

    public zzcb(Context context, AdSizeParcel adSizeParcel, zzjn com_google_android_gms_internal_zzjn, VersionInfoParcel versionInfoParcel, zzcc com_google_android_gms_internal_zzcc, zzfj com_google_android_gms_internal_zzfj) {
        super(context, adSizeParcel, com_google_android_gms_internal_zzjn, versionInfoParcel, com_google_android_gms_internal_zzcc);
        this.zztR = com_google_android_gms_internal_zzfj.zzfu();
        try {
            final JSONObject zzd = zzd(com_google_android_gms_internal_zzcc.zzdd().zzdb());
            this.zztR.zza(new zzkt.zzc<zzfk>(this) {
                final /* synthetic */ zzcb b;

                public void a(zzfk com_google_android_gms_internal_zzfk) {
                    this.b.zza(zzd);
                }

                public /* synthetic */ void zzc(Object obj) {
                    a((zzfk) obj);
                }
            }, new zza(this) {
                final /* synthetic */ zzcb a;

                {
                    this.a = r1;
                }

                public void run() {
                }
            });
        } catch (JSONException e) {
        } catch (Throwable e2) {
            zzb.zzb("Failure while processing active view data.", e2);
        }
        this.zztR.zza(new zzkt.zzc<zzfk>(this) {
            final /* synthetic */ zzcb a;

            {
                this.a = r1;
            }

            public void a(zzfk com_google_android_gms_internal_zzfk) {
                this.a.zztS = true;
                this.a.zzc(com_google_android_gms_internal_zzfk);
                this.a.zzcQ();
                this.a.zzi(3);
            }

            public /* synthetic */ void zzc(Object obj) {
                a((zzfk) obj);
            }
        }, new zza(this) {
            final /* synthetic */ zzcb a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.destroy();
            }
        });
        String str = "Tracking ad unit: ";
        String valueOf = String.valueOf(this.zztl.zzdh());
        zzb.zzaU(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected void destroy() {
        synchronized (this.zzpp) {
            super.destroy();
            this.zztR.zza(new zzkt.zzc<zzfk>(this) {
                final /* synthetic */ zzcb a;

                {
                    this.a = r1;
                }

                public void a(zzfk com_google_android_gms_internal_zzfk) {
                    this.a.zzd(com_google_android_gms_internal_zzfk);
                }

                public /* synthetic */ void zzc(Object obj) {
                    a((zzfk) obj);
                }
            }, new zzkt.zzb());
            this.zztR.release();
        }
    }

    protected void zzb(final JSONObject jSONObject) {
        this.zztR.zza(new zzkt.zzc<zzfk>(this) {
            final /* synthetic */ zzcb b;

            public void a(zzfk com_google_android_gms_internal_zzfk) {
                com_google_android_gms_internal_zzfk.zza("AFMA_updateActiveView", jSONObject);
            }

            public /* synthetic */ void zzc(Object obj) {
                a((zzfk) obj);
            }
        }, new zzkt.zzb());
    }

    protected boolean zzcY() {
        return this.zztS;
    }
}
