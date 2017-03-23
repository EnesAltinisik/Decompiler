package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface zzpy {

    public interface zzb extends Result {
        Status getStatus();

        long getThrottleEndTimeMillis();

        byte[] zza(String str, byte[] bArr, String str2);

        Map<String, Set<String>> zzvt();
    }

    public static class zza {
        private final long zzauB;
        private final Map<String, String> zzauC;

        public static class zza {
            private long zzauB = 43200;
            private Map<String, String> zzauC;

            public zza zzF(long j) {
                this.zzauB = j;
                return this;
            }

            public zza zzF(String str, String str2) {
                if (this.zzauC == null) {
                    this.zzauC = new HashMap();
                }
                this.zzauC.put(str, str2);
                return this;
            }

            public zza zzvs() {
                return new zza();
            }
        }

        private zza(zza com_google_android_gms_internal_zzpy_zza_zza) {
            this.zzauB = com_google_android_gms_internal_zzpy_zza_zza.zzauB;
            this.zzauC = com_google_android_gms_internal_zzpy_zza_zza.zzauC;
        }

        public long zzvq() {
            return this.zzauB;
        }

        public Map<String, String> zzvr() {
            return this.zzauC == null ? Collections.emptyMap() : this.zzauC;
        }
    }

    PendingResult<zzb> zza(GoogleApiClient googleApiClient, zza com_google_android_gms_internal_zzpy_zza);
}
