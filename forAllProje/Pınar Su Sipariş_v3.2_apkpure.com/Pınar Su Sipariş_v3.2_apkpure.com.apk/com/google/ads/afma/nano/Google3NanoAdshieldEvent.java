package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzamb;
import com.google.android.gms.internal.zzamc;
import com.google.android.gms.internal.zzamd;
import com.google.android.gms.internal.zzamh;
import com.google.android.gms.internal.zzami;
import com.google.android.gms.internal.zzamj;
import java.io.IOException;

public interface Google3NanoAdshieldEvent {

    public static final class AdShieldEvent extends zzamd<AdShieldEvent> {
        private static volatile AdShieldEvent[] zzaK;
        public String afmaVersion;
        public String appId;
        public Long appVersionCode;
        public String appVersionName;
        public String debugInfo;
        public String exceptionName;
        public Long gmscoreClientVersion;
        public Long gmscoreSdkVersion;
        public Long runtimeMs;
        public String stackTrace;

        public AdShieldEvent() {
            this.appId = null;
            this.runtimeMs = null;
            this.stackTrace = null;
            this.exceptionName = null;
            this.debugInfo = null;
            this.gmscoreSdkVersion = null;
            this.gmscoreClientVersion = null;
            this.appVersionName = null;
            this.appVersionCode = null;
            this.afmaVersion = null;
            this.zzcaa = null;
            this.zzcaj = -1;
        }

        public static AdShieldEvent[] emptyArray() {
            if (zzaK == null) {
                synchronized (zzamh.zzcai) {
                    if (zzaK == null) {
                        zzaK = new AdShieldEvent[0];
                    }
                }
            }
            return zzaK;
        }

        public static AdShieldEvent parseFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return (AdShieldEvent) new AdShieldEvent().mergeFrom(com_google_android_gms_internal_zzamb);
        }

        public static AdShieldEvent parseFrom(byte[] bArr) throws zzami {
            return (AdShieldEvent) zzamj.mergeFrom(new AdShieldEvent(), bArr);
        }

        public AdShieldEvent mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.appId = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 16:
                        this.runtimeMs = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 26:
                        this.stackTrace = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 34:
                        this.exceptionName = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 42:
                        this.debugInfo = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 48:
                        this.gmscoreSdkVersion = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 56:
                        this.gmscoreClientVersion = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 66:
                        this.appVersionName = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 72:
                        this.appVersionCode = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 82:
                        this.afmaVersion = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzamb, zzWC)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.appId != null) {
                com_google_android_gms_internal_zzamc.zzq(1, this.appId);
            }
            if (this.runtimeMs != null) {
                com_google_android_gms_internal_zzamc.zzb(2, this.runtimeMs.longValue());
            }
            if (this.stackTrace != null) {
                com_google_android_gms_internal_zzamc.zzq(3, this.stackTrace);
            }
            if (this.exceptionName != null) {
                com_google_android_gms_internal_zzamc.zzq(4, this.exceptionName);
            }
            if (this.debugInfo != null) {
                com_google_android_gms_internal_zzamc.zzq(5, this.debugInfo);
            }
            if (this.gmscoreSdkVersion != null) {
                com_google_android_gms_internal_zzamc.zzb(6, this.gmscoreSdkVersion.longValue());
            }
            if (this.gmscoreClientVersion != null) {
                com_google_android_gms_internal_zzamc.zzb(7, this.gmscoreClientVersion.longValue());
            }
            if (this.appVersionName != null) {
                com_google_android_gms_internal_zzamc.zzq(8, this.appVersionName);
            }
            if (this.appVersionCode != null) {
                com_google_android_gms_internal_zzamc.zzb(9, this.appVersionCode.longValue());
            }
            if (this.afmaVersion != null) {
                com_google_android_gms_internal_zzamc.zzq(10, this.afmaVersion);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.appId != null) {
                zzy += zzamc.zzr(1, this.appId);
            }
            if (this.runtimeMs != null) {
                zzy += zzamc.zze(2, this.runtimeMs.longValue());
            }
            if (this.stackTrace != null) {
                zzy += zzamc.zzr(3, this.stackTrace);
            }
            if (this.exceptionName != null) {
                zzy += zzamc.zzr(4, this.exceptionName);
            }
            if (this.debugInfo != null) {
                zzy += zzamc.zzr(5, this.debugInfo);
            }
            if (this.gmscoreSdkVersion != null) {
                zzy += zzamc.zze(6, this.gmscoreSdkVersion.longValue());
            }
            if (this.gmscoreClientVersion != null) {
                zzy += zzamc.zze(7, this.gmscoreClientVersion.longValue());
            }
            if (this.appVersionName != null) {
                zzy += zzamc.zzr(8, this.appVersionName);
            }
            if (this.appVersionCode != null) {
                zzy += zzamc.zze(9, this.appVersionCode.longValue());
            }
            return this.afmaVersion != null ? zzy + zzamc.zzr(10, this.afmaVersion) : zzy;
        }
    }
}
