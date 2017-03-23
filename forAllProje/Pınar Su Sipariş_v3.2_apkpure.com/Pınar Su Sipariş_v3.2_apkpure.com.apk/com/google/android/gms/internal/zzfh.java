package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzfg.zza;
import java.util.concurrent.Future;

@zzig
public class zzfh {

    private static class a<JavascriptEngine> extends zzko<JavascriptEngine> {
        JavascriptEngine a;

        private a() {
        }
    }

    private zzfg zza(Context context, VersionInfoParcel versionInfoParcel, final a<zzfg> aVar, zzaq com_google_android_gms_internal_zzaq) {
        zzfg com_google_android_gms_internal_zzfi = new zzfi(context, versionInfoParcel, com_google_android_gms_internal_zzaq);
        aVar.a = com_google_android_gms_internal_zzfi;
        com_google_android_gms_internal_zzfi.zza(new zza(this) {
            final /* synthetic */ zzfh b;

            public void zzft() {
                aVar.zzh((zzfg) aVar.a);
            }
        });
        return com_google_android_gms_internal_zzfi;
    }

    public Future<zzfg> zza(Context context, VersionInfoParcel versionInfoParcel, String str, zzaq com_google_android_gms_internal_zzaq) {
        final Future aVar = new a();
        final Context context2 = context;
        final VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
        final zzaq com_google_android_gms_internal_zzaq2 = com_google_android_gms_internal_zzaq;
        final String str2 = str;
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzfh f;

            public void run() {
                this.f.zza(context2, versionInfoParcel2, aVar, com_google_android_gms_internal_zzaq2).zzag(str2);
            }
        });
        return aVar;
    }
}
