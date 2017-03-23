package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class zzwa extends zzvj {

    class a implements Comparator<zzabh<?>> {
        final /* synthetic */ zzabk a;
        final /* synthetic */ zzuw b;
        final /* synthetic */ zzwa c;

        a(zzwa com_google_android_gms_internal_zzwa, zzabk com_google_android_gms_internal_zzabk, zzuw com_google_android_gms_internal_zzuw) {
            this.c = com_google_android_gms_internal_zzwa;
            this.a = com_google_android_gms_internal_zzabk;
            this.b = com_google_android_gms_internal_zzuw;
        }

        public int a(zzabh<?> com_google_android_gms_internal_zzabh_, zzabh<?> com_google_android_gms_internal_zzabh_2) {
            if (com_google_android_gms_internal_zzabh_ == null) {
                return com_google_android_gms_internal_zzabh_2 != null ? 1 : 0;
            } else {
                if (com_google_android_gms_internal_zzabh_2 == null) {
                    return com_google_android_gms_internal_zzabh_ != null ? -1 : 0;
                } else {
                    zzabh zzb = ((zzvh) this.a.zzMk()).zzb(this.b, com_google_android_gms_internal_zzabh_, com_google_android_gms_internal_zzabh_2);
                    zzaa.zzai(zzb instanceof zzabj);
                    return (int) ((Double) ((zzabj) zzb).zzMk()).doubleValue();
                }
            }
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((zzabh) obj, (zzabh) obj2);
        }
    }

    private static class b implements zzvh {
        private b() {
        }

        public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
            return new zzabj(Double.valueOf((double) zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[0]).compareTo(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]))));
        }
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzabk com_google_android_gms_internal_zzabk;
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 1 || com_google_android_gms_internal_zzabh_Arr.length == 2;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        if (com_google_android_gms_internal_zzabh_Arr.length == 2) {
            zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[1] instanceof zzabk);
            com_google_android_gms_internal_zzabk = (zzabk) com_google_android_gms_internal_zzabh_Arr[1];
        } else {
            com_google_android_gms_internal_zzabk = new zzabk(new b());
        }
        Collections.sort((List) com_google_android_gms_internal_zzabm.zzMk(), new a(this, com_google_android_gms_internal_zzabk, com_google_android_gms_internal_zzuw));
        return com_google_android_gms_internal_zzabh_Arr[0];
    }
}
