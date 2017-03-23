package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzamb;
import com.google.android.gms.internal.zzamc;
import com.google.android.gms.internal.zzamd;
import com.google.android.gms.internal.zzamh;
import com.google.android.gms.internal.zzami;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.internal.zzamm;
import java.io.IOException;

public interface Google3NanoAfmaSignals {

    public static final class AFMASignals extends zzamd<AFMASignals> {
        private static volatile AFMASignals[] zzaL;
        public Long actSignal;
        public Long acxSignal;
        public Long acySignal;
        public Long aczSignal;
        public AdAttestationSignal adAttestationSignal;
        public String afmaVersion;
        public Long attSignal;
        public Long atvSignal;
        public Long btlSignal;
        public Long btsSignal;
        public String cerSignal;
        public Long cpuSignal;
        public Boolean didOptOut;
        public String didSignal;
        public String didSignalAndroidAdId;
        public Integer didSignalType;
        public Long evtTime;
        public String intSignal;
        public Long jbkSignal;
        public Long netSignal;
        public Long ornSignal;
        public String osVersion;
        public TouchInfo[] previousTouches;
        public Long psnSignal;
        public RawAdAttestationSignal rawAdAttestationSignal;
        public Long reqType;
        public Long stkDepthSignal;
        public String stkSignal;
        public Long swzSignal;
        public Long tccSignal;
        public Long tcdSignal;
        public Long tcdnSignal;
        public Long tcmSignal;
        public Long tcpSignal;
        public Long tctSignal;
        public Long tcuSignal;
        public Long tcxSignal;
        public Long tcySignal;
        public Long uhSignal;
        public Long uptSignal;
        public Long usgSignal;
        public Long utzSignal;
        public Long uwSignal;
        public Long vcdSignal;
        public Long visSignal;
        public String vnmSignal;

        public interface DeviceIdType {
            public static final int DEVICE_IDENTIFIER_ADVERTISER_ID = 3;
            public static final int DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED = 4;
            public static final int DEVICE_IDENTIFIER_ANDROID_AD_ID = 5;
            public static final int DEVICE_IDENTIFIER_APP_SPECIFIC_ID = 1;
            public static final int DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID = 6;
            public static final int DEVICE_IDENTIFIER_GLOBAL_ID = 2;
            public static final int DEVICE_IDENTIFIER_NO_ID = 0;
        }

        public interface PoisonBits {
            public static final int ERROR_ENCODE_SIZE_FAIL = 1;
            public static final int ERROR_ENCRYPTION = 7;
            public static final int ERROR_NO_SIGNALS = 5;
            public static final int ERROR_UNKNOWN = 3;
            public static final int PSN_BITSLICER_FAIL = 256;
            public static final int PSN_BLANK_VALUE = 8192;
            public static final int PSN_DECODE_FAIL = 64;
            public static final int PSN_DECRYPT_SIZE_FAIL = 4;
            public static final int PSN_ENCODE_SIZE_FAIL = 4096;
            public static final int PSN_INVALID_ERROR_CODE = 1024;
            public static final int PSN_MD5_CHECK_FAIL = 8;
            public static final int PSN_MD5_FAIL = 32;
            public static final int PSN_MD5_SIZE_FAIL = 16;
            public static final int PSN_REQUEST_TYPE_FAIL = 512;
            public static final int PSN_SALT_FAIL = 128;
            public static final int PSN_TIMESTAMP_EXPIRED = 2048;
            public static final int PSN_WEB64_FAIL = 2;
        }

        public static final class TouchInfo extends zzamd<TouchInfo> {
            private static volatile TouchInfo[] zzaM;
            public Long tcxSignal;
            public Long tcySignal;

            public TouchInfo() {
                this.tcxSignal = null;
                this.tcySignal = null;
                this.zzcaa = null;
                this.zzcaj = -1;
            }

            public static TouchInfo[] emptyArray() {
                if (zzaM == null) {
                    synchronized (zzamh.zzcai) {
                        if (zzaM == null) {
                            zzaM = new TouchInfo[0];
                        }
                    }
                }
                return zzaM;
            }

            public static TouchInfo parseFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
                return (TouchInfo) new TouchInfo().mergeFrom(com_google_android_gms_internal_zzamb);
            }

            public static TouchInfo parseFrom(byte[] bArr) throws zzami {
                return (TouchInfo) zzamj.mergeFrom(new TouchInfo(), bArr);
            }

            public TouchInfo mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
                while (true) {
                    int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                    switch (zzWC) {
                        case 0:
                            break;
                        case 8:
                            this.tcxSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                            continue;
                        case 16:
                            this.tcySignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
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
                if (this.tcxSignal != null) {
                    com_google_android_gms_internal_zzamc.zzb(1, this.tcxSignal.longValue());
                }
                if (this.tcySignal != null) {
                    com_google_android_gms_internal_zzamc.zzb(2, this.tcySignal.longValue());
                }
                super.writeTo(com_google_android_gms_internal_zzamc);
            }

            protected int zzy() {
                int zzy = super.zzy();
                if (this.tcxSignal != null) {
                    zzy += zzamc.zze(1, this.tcxSignal.longValue());
                }
                return this.tcySignal != null ? zzy + zzamc.zze(2, this.tcySignal.longValue()) : zzy;
            }
        }

        public AFMASignals() {
            this.osVersion = null;
            this.afmaVersion = null;
            this.atvSignal = null;
            this.attSignal = null;
            this.btsSignal = null;
            this.btlSignal = null;
            this.acxSignal = null;
            this.acySignal = null;
            this.aczSignal = null;
            this.actSignal = null;
            this.netSignal = null;
            this.ornSignal = null;
            this.stkSignal = null;
            this.tcxSignal = null;
            this.tcySignal = null;
            this.tctSignal = null;
            this.uptSignal = null;
            this.visSignal = null;
            this.swzSignal = null;
            this.psnSignal = null;
            this.jbkSignal = null;
            this.usgSignal = null;
            this.intSignal = null;
            this.cerSignal = null;
            this.uwSignal = null;
            this.uhSignal = null;
            this.utzSignal = null;
            this.vnmSignal = null;
            this.vcdSignal = null;
            this.tcpSignal = null;
            this.tcdSignal = null;
            this.adAttestationSignal = null;
            this.tcuSignal = null;
            this.tcmSignal = null;
            this.tcdnSignal = null;
            this.tccSignal = null;
            this.cpuSignal = null;
            this.stkDepthSignal = null;
            this.previousTouches = TouchInfo.emptyArray();
            this.reqType = null;
            this.didSignal = null;
            this.didSignalType = null;
            this.didOptOut = null;
            this.didSignalAndroidAdId = null;
            this.evtTime = null;
            this.rawAdAttestationSignal = null;
            this.zzcaa = null;
            this.zzcaj = -1;
        }

        public static AFMASignals[] emptyArray() {
            if (zzaL == null) {
                synchronized (zzamh.zzcai) {
                    if (zzaL == null) {
                        zzaL = new AFMASignals[0];
                    }
                }
            }
            return zzaL;
        }

        public static AFMASignals parseFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return (AFMASignals) new AFMASignals().mergeFrom(com_google_android_gms_internal_zzamb);
        }

        public static AFMASignals parseFrom(byte[] bArr) throws zzami {
            return (AFMASignals) zzamj.mergeFrom(new AFMASignals(), bArr);
        }

        public AFMASignals mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.osVersion = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        this.afmaVersion = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 24:
                        this.atvSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 32:
                        this.attSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 40:
                        this.btsSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 48:
                        this.btlSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 56:
                        this.acxSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 64:
                        this.acySignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 72:
                        this.aczSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 80:
                        this.actSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 88:
                        this.netSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 96:
                        this.ornSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 106:
                        this.stkSignal = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 112:
                        this.tcxSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 120:
                        this.tcySignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 128:
                        this.tctSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 136:
                        this.uptSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 144:
                        this.visSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 152:
                        this.swzSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 160:
                        this.psnSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 168:
                        this.reqType = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 176:
                        this.jbkSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 184:
                        this.usgSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 194:
                        this.didSignal = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 200:
                        this.evtTime = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 208:
                        zzWC = com_google_android_gms_internal_zzamb.zzWG();
                        switch (zzWC) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.didSignalType = Integer.valueOf(zzWC);
                                break;
                            default:
                                continue;
                        }
                    case 218:
                        this.intSignal = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 224:
                        this.didOptOut = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 234:
                        this.cerSignal = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 242:
                        this.didSignalAndroidAdId = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 248:
                        this.uwSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 256:
                        this.uhSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 264:
                        this.utzSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 274:
                        this.vnmSignal = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 280:
                        this.vcdSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 288:
                        this.tcpSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 296:
                        this.tcdSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 306:
                        if (this.adAttestationSignal == null) {
                            this.adAttestationSignal = new AdAttestationSignal();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.adAttestationSignal);
                        continue;
                    case 312:
                        this.tcuSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 320:
                        this.tcmSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 328:
                        this.tcdnSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 336:
                        this.tccSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 346:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 346);
                        zzWC = this.previousTouches == null ? 0 : this.previousTouches.length;
                        Object obj = new TouchInfo[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.previousTouches, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new TouchInfo();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new TouchInfo();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.previousTouches = obj;
                        continue;
                    case 352:
                        this.cpuSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 360:
                        this.stkDepthSignal = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 1610:
                        if (this.rawAdAttestationSignal == null) {
                            this.rawAdAttestationSignal = new RawAdAttestationSignal();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.rawAdAttestationSignal);
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
            if (this.osVersion != null) {
                com_google_android_gms_internal_zzamc.zzq(1, this.osVersion);
            }
            if (this.afmaVersion != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.afmaVersion);
            }
            if (this.atvSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(3, this.atvSignal.longValue());
            }
            if (this.attSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(4, this.attSignal.longValue());
            }
            if (this.btsSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(5, this.btsSignal.longValue());
            }
            if (this.btlSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(6, this.btlSignal.longValue());
            }
            if (this.acxSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(7, this.acxSignal.longValue());
            }
            if (this.acySignal != null) {
                com_google_android_gms_internal_zzamc.zzb(8, this.acySignal.longValue());
            }
            if (this.aczSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(9, this.aczSignal.longValue());
            }
            if (this.actSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(10, this.actSignal.longValue());
            }
            if (this.netSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(11, this.netSignal.longValue());
            }
            if (this.ornSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(12, this.ornSignal.longValue());
            }
            if (this.stkSignal != null) {
                com_google_android_gms_internal_zzamc.zzq(13, this.stkSignal);
            }
            if (this.tcxSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(14, this.tcxSignal.longValue());
            }
            if (this.tcySignal != null) {
                com_google_android_gms_internal_zzamc.zzb(15, this.tcySignal.longValue());
            }
            if (this.tctSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(16, this.tctSignal.longValue());
            }
            if (this.uptSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(17, this.uptSignal.longValue());
            }
            if (this.visSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(18, this.visSignal.longValue());
            }
            if (this.swzSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(19, this.swzSignal.longValue());
            }
            if (this.psnSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(20, this.psnSignal.longValue());
            }
            if (this.reqType != null) {
                com_google_android_gms_internal_zzamc.zzb(21, this.reqType.longValue());
            }
            if (this.jbkSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(22, this.jbkSignal.longValue());
            }
            if (this.usgSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(23, this.usgSignal.longValue());
            }
            if (this.didSignal != null) {
                com_google_android_gms_internal_zzamc.zzq(24, this.didSignal);
            }
            if (this.evtTime != null) {
                com_google_android_gms_internal_zzamc.zzb(25, this.evtTime.longValue());
            }
            if (this.didSignalType != null) {
                com_google_android_gms_internal_zzamc.zzE(26, this.didSignalType.intValue());
            }
            if (this.intSignal != null) {
                com_google_android_gms_internal_zzamc.zzq(27, this.intSignal);
            }
            if (this.didOptOut != null) {
                com_google_android_gms_internal_zzamc.zzj(28, this.didOptOut.booleanValue());
            }
            if (this.cerSignal != null) {
                com_google_android_gms_internal_zzamc.zzq(29, this.cerSignal);
            }
            if (this.didSignalAndroidAdId != null) {
                com_google_android_gms_internal_zzamc.zzq(30, this.didSignalAndroidAdId);
            }
            if (this.uwSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(31, this.uwSignal.longValue());
            }
            if (this.uhSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(32, this.uhSignal.longValue());
            }
            if (this.utzSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(33, this.utzSignal.longValue());
            }
            if (this.vnmSignal != null) {
                com_google_android_gms_internal_zzamc.zzq(34, this.vnmSignal);
            }
            if (this.vcdSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(35, this.vcdSignal.longValue());
            }
            if (this.tcpSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(36, this.tcpSignal.longValue());
            }
            if (this.tcdSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(37, this.tcdSignal.longValue());
            }
            if (this.adAttestationSignal != null) {
                com_google_android_gms_internal_zzamc.zza(38, this.adAttestationSignal);
            }
            if (this.tcuSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(39, this.tcuSignal.longValue());
            }
            if (this.tcmSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(40, this.tcmSignal.longValue());
            }
            if (this.tcdnSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(41, this.tcdnSignal.longValue());
            }
            if (this.tccSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(42, this.tccSignal.longValue());
            }
            if (this.previousTouches != null && this.previousTouches.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.previousTouches) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(43, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.cpuSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(44, this.cpuSignal.longValue());
            }
            if (this.stkDepthSignal != null) {
                com_google_android_gms_internal_zzamc.zzb(45, this.stkDepthSignal.longValue());
            }
            if (this.rawAdAttestationSignal != null) {
                com_google_android_gms_internal_zzamc.zza(201, this.rawAdAttestationSignal);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.osVersion != null) {
                zzy += zzamc.zzr(1, this.osVersion);
            }
            if (this.afmaVersion != null) {
                zzy += zzamc.zzr(2, this.afmaVersion);
            }
            if (this.atvSignal != null) {
                zzy += zzamc.zze(3, this.atvSignal.longValue());
            }
            if (this.attSignal != null) {
                zzy += zzamc.zze(4, this.attSignal.longValue());
            }
            if (this.btsSignal != null) {
                zzy += zzamc.zze(5, this.btsSignal.longValue());
            }
            if (this.btlSignal != null) {
                zzy += zzamc.zze(6, this.btlSignal.longValue());
            }
            if (this.acxSignal != null) {
                zzy += zzamc.zze(7, this.acxSignal.longValue());
            }
            if (this.acySignal != null) {
                zzy += zzamc.zze(8, this.acySignal.longValue());
            }
            if (this.aczSignal != null) {
                zzy += zzamc.zze(9, this.aczSignal.longValue());
            }
            if (this.actSignal != null) {
                zzy += zzamc.zze(10, this.actSignal.longValue());
            }
            if (this.netSignal != null) {
                zzy += zzamc.zze(11, this.netSignal.longValue());
            }
            if (this.ornSignal != null) {
                zzy += zzamc.zze(12, this.ornSignal.longValue());
            }
            if (this.stkSignal != null) {
                zzy += zzamc.zzr(13, this.stkSignal);
            }
            if (this.tcxSignal != null) {
                zzy += zzamc.zze(14, this.tcxSignal.longValue());
            }
            if (this.tcySignal != null) {
                zzy += zzamc.zze(15, this.tcySignal.longValue());
            }
            if (this.tctSignal != null) {
                zzy += zzamc.zze(16, this.tctSignal.longValue());
            }
            if (this.uptSignal != null) {
                zzy += zzamc.zze(17, this.uptSignal.longValue());
            }
            if (this.visSignal != null) {
                zzy += zzamc.zze(18, this.visSignal.longValue());
            }
            if (this.swzSignal != null) {
                zzy += zzamc.zze(19, this.swzSignal.longValue());
            }
            if (this.psnSignal != null) {
                zzy += zzamc.zze(20, this.psnSignal.longValue());
            }
            if (this.reqType != null) {
                zzy += zzamc.zze(21, this.reqType.longValue());
            }
            if (this.jbkSignal != null) {
                zzy += zzamc.zze(22, this.jbkSignal.longValue());
            }
            if (this.usgSignal != null) {
                zzy += zzamc.zze(23, this.usgSignal.longValue());
            }
            if (this.didSignal != null) {
                zzy += zzamc.zzr(24, this.didSignal);
            }
            if (this.evtTime != null) {
                zzy += zzamc.zze(25, this.evtTime.longValue());
            }
            if (this.didSignalType != null) {
                zzy += zzamc.zzG(26, this.didSignalType.intValue());
            }
            if (this.intSignal != null) {
                zzy += zzamc.zzr(27, this.intSignal);
            }
            if (this.didOptOut != null) {
                zzy += zzamc.zzk(28, this.didOptOut.booleanValue());
            }
            if (this.cerSignal != null) {
                zzy += zzamc.zzr(29, this.cerSignal);
            }
            if (this.didSignalAndroidAdId != null) {
                zzy += zzamc.zzr(30, this.didSignalAndroidAdId);
            }
            if (this.uwSignal != null) {
                zzy += zzamc.zze(31, this.uwSignal.longValue());
            }
            if (this.uhSignal != null) {
                zzy += zzamc.zze(32, this.uhSignal.longValue());
            }
            if (this.utzSignal != null) {
                zzy += zzamc.zze(33, this.utzSignal.longValue());
            }
            if (this.vnmSignal != null) {
                zzy += zzamc.zzr(34, this.vnmSignal);
            }
            if (this.vcdSignal != null) {
                zzy += zzamc.zze(35, this.vcdSignal.longValue());
            }
            if (this.tcpSignal != null) {
                zzy += zzamc.zze(36, this.tcpSignal.longValue());
            }
            if (this.tcdSignal != null) {
                zzy += zzamc.zze(37, this.tcdSignal.longValue());
            }
            if (this.adAttestationSignal != null) {
                zzy += zzamc.zzc(38, this.adAttestationSignal);
            }
            if (this.tcuSignal != null) {
                zzy += zzamc.zze(39, this.tcuSignal.longValue());
            }
            if (this.tcmSignal != null) {
                zzy += zzamc.zze(40, this.tcmSignal.longValue());
            }
            if (this.tcdnSignal != null) {
                zzy += zzamc.zze(41, this.tcdnSignal.longValue());
            }
            if (this.tccSignal != null) {
                zzy += zzamc.zze(42, this.tccSignal.longValue());
            }
            if (this.previousTouches != null && this.previousTouches.length > 0) {
                int i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj : this.previousTouches) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i += zzamc.zzc(43, com_google_android_gms_internal_zzamj);
                    }
                }
                zzy = i;
            }
            if (this.cpuSignal != null) {
                zzy += zzamc.zze(44, this.cpuSignal.longValue());
            }
            if (this.stkDepthSignal != null) {
                zzy += zzamc.zze(45, this.stkDepthSignal.longValue());
            }
            return this.rawAdAttestationSignal != null ? zzy + zzamc.zzc(201, this.rawAdAttestationSignal) : zzy;
        }
    }

    public static final class AdAttestationSignal extends zzamd<AdAttestationSignal> {
        private static volatile AdAttestationSignal[] zzaN;
        public int[] reasons;
        public Integer responseType;
        public Boolean suspicious;
        public Long timestampMs;

        public AdAttestationSignal() {
            this.timestampMs = null;
            this.responseType = null;
            this.suspicious = null;
            this.reasons = zzamm.zzcal;
            this.zzcaa = null;
            this.zzcaj = -1;
        }

        public static AdAttestationSignal[] emptyArray() {
            if (zzaN == null) {
                synchronized (zzamh.zzcai) {
                    if (zzaN == null) {
                        zzaN = new AdAttestationSignal[0];
                    }
                }
            }
            return zzaN;
        }

        public static AdAttestationSignal parseFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return (AdAttestationSignal) new AdAttestationSignal().mergeFrom(com_google_android_gms_internal_zzamb);
        }

        public static AdAttestationSignal parseFrom(byte[] bArr) throws zzami {
            return (AdAttestationSignal) zzamj.mergeFrom(new AdAttestationSignal(), bArr);
        }

        public AdAttestationSignal mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.timestampMs = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 16:
                        this.responseType = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 24:
                        this.suspicious = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 32:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 32);
                        zzWC = this.reasons == null ? 0 : this.reasons.length;
                        Object obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.reasons, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.reasons = obj;
                        continue;
                    case 34:
                        int zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.reasons == null ? 0 : this.reasons.length;
                        Object obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.reasons, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.reasons = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
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
            if (this.timestampMs != null) {
                com_google_android_gms_internal_zzamc.zzb(1, this.timestampMs.longValue());
            }
            if (this.responseType != null) {
                com_google_android_gms_internal_zzamc.zzE(2, this.responseType.intValue());
            }
            if (this.suspicious != null) {
                com_google_android_gms_internal_zzamc.zzj(3, this.suspicious.booleanValue());
            }
            if (this.reasons != null && this.reasons.length > 0) {
                for (int zzE : this.reasons) {
                    com_google_android_gms_internal_zzamc.zzE(4, zzE);
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        protected int zzy() {
            int i = 0;
            int zzy = super.zzy();
            if (this.timestampMs != null) {
                zzy += zzamc.zze(1, this.timestampMs.longValue());
            }
            if (this.responseType != null) {
                zzy += zzamc.zzG(2, this.responseType.intValue());
            }
            if (this.suspicious != null) {
                zzy += zzamc.zzk(3, this.suspicious.booleanValue());
            }
            if (this.reasons == null || this.reasons.length <= 0) {
                return zzy;
            }
            int i2 = 0;
            while (i < this.reasons.length) {
                i2 += zzamc.zzoc(this.reasons[i]);
                i++;
            }
            return (zzy + i2) + (this.reasons.length * 1);
        }
    }

    public static final class AdSignalsContainer extends zzamd<AdSignalsContainer> {
        private static volatile AdSignalsContainer[] zzaO;
        public byte[] encryptedDidSignal;
        public byte[] encryptedSpamSignals;

        public AdSignalsContainer() {
            this.encryptedSpamSignals = null;
            this.encryptedDidSignal = null;
            this.zzcaa = null;
            this.zzcaj = -1;
        }

        public static AdSignalsContainer[] emptyArray() {
            if (zzaO == null) {
                synchronized (zzamh.zzcai) {
                    if (zzaO == null) {
                        zzaO = new AdSignalsContainer[0];
                    }
                }
            }
            return zzaO;
        }

        public static AdSignalsContainer parseFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return (AdSignalsContainer) new AdSignalsContainer().mergeFrom(com_google_android_gms_internal_zzamb);
        }

        public static AdSignalsContainer parseFrom(byte[] bArr) throws zzami {
            return (AdSignalsContainer) zzamj.mergeFrom(new AdSignalsContainer(), bArr);
        }

        public AdSignalsContainer mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.encryptedSpamSignals = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 18:
                        this.encryptedDidSignal = com_google_android_gms_internal_zzamb.readBytes();
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
            if (this.encryptedSpamSignals != null) {
                com_google_android_gms_internal_zzamc.zza(1, this.encryptedSpamSignals);
            }
            if (this.encryptedDidSignal != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.encryptedDidSignal);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.encryptedSpamSignals != null) {
                zzy += zzamc.zzb(1, this.encryptedSpamSignals);
            }
            return this.encryptedDidSignal != null ? zzy + zzamc.zzb(2, this.encryptedDidSignal) : zzy;
        }
    }

    public static final class Cache extends zzamd<Cache> {
        private static volatile Cache[] zzaP;
        public byte[] data;
        public byte[] hash;
        public byte[] osVersion;
        public byte[] timestamp;

        public Cache() {
            this.data = null;
            this.hash = null;
            this.timestamp = null;
            this.osVersion = null;
            this.zzcaa = null;
            this.zzcaj = -1;
        }

        public static Cache[] emptyArray() {
            if (zzaP == null) {
                synchronized (zzamh.zzcai) {
                    if (zzaP == null) {
                        zzaP = new Cache[0];
                    }
                }
            }
            return zzaP;
        }

        public static Cache parseFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return (Cache) new Cache().mergeFrom(com_google_android_gms_internal_zzamb);
        }

        public static Cache parseFrom(byte[] bArr) throws zzami {
            return (Cache) zzamj.mergeFrom(new Cache(), bArr);
        }

        public Cache mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.data = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 18:
                        this.hash = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 26:
                        this.timestamp = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 34:
                        this.osVersion = com_google_android_gms_internal_zzamb.readBytes();
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
            if (this.data != null) {
                com_google_android_gms_internal_zzamc.zza(1, this.data);
            }
            if (this.hash != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.hash);
            }
            if (this.timestamp != null) {
                com_google_android_gms_internal_zzamc.zza(3, this.timestamp);
            }
            if (this.osVersion != null) {
                com_google_android_gms_internal_zzamc.zza(4, this.osVersion);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.data != null) {
                zzy += zzamc.zzb(1, this.data);
            }
            if (this.hash != null) {
                zzy += zzamc.zzb(2, this.hash);
            }
            if (this.timestamp != null) {
                zzy += zzamc.zzb(3, this.timestamp);
            }
            return this.osVersion != null ? zzy + zzamc.zzb(4, this.osVersion) : zzy;
        }
    }

    public interface DroidGuardResponseType {
        public static final int RESPONSE_TYPE_FALLBACK = 1;
        public static final int RESPONSE_TYPE_NORMAL = 0;
        public static final int RESPONSE_TYPE_OTHER = 3;
        public static final int RESPONSE_TYPE_PLAIN_TEXT = 2;
    }

    public interface DroidGuardSuspiciousReason {
        public static final int REASON_ANDROID_ID_MISMATCH = 26;
        public static final int REASON_BAD_SIGNAL_EVALUATION_ORDER = 24;
        public static final int REASON_BLACKLISTED_IMEI_HASH = 29;
        public static final int REASON_BLACKLISTED_IMSI_HASH = 30;
        public static final int REASON_BLACKLISTED_MAC_ADDRESS_HASH = 28;
        public static final int REASON_CONTENT_BINDING_FAILED = 7;
        public static final int REASON_CONTEXT_VERIFICATION_FAILED = 27;
        public static final int REASON_CORRUPTED_RESPONSE = 3;
        public static final int REASON_CTS_PROFILE_LOOKUP_FAILURE = 10;
        public static final int REASON_CTS_PROFILE_MISMATCH = 11;
        public static final int REASON_DEVICE_SIDE_ERROR = 8;
        public static final int REASON_DEVICE_SIDE_PARSE_ERROR = 14;
        public static final int REASON_DROIDGUASSO_VALIDATION_FAILED = 16;
        public static final int REASON_EMPTY_RESPONSE = 1;
        public static final int REASON_EMULATOR = 15;
        public static final int REASON_GMS_CORE_SIGNATURE_MISMATCH = 22;
        public static final int REASON_GOLDFISH = 12;
        public static final int REASON_INVALID_GMS_CORE_VERSION = 25;
        public static final int REASON_INVALID_TAG = 2;
        public static final int REASON_MISSING_ARM_CPU_CACHE = 9;
        public static final int REASON_MISSING_PROGRESS_REPORT = 6;
        public static final int REASON_MISSING_RUNTIME_API = 20;
        public static final int REASON_MISSING_SESSION_DATA = 17;
        public static final int REASON_REPLAY_PROTECTION = 4;
        public static final int REASON_ROOTED = 21;
        public static final int REASON_VIRTUALBOX = 13;
        public static final int REASON_VM_BINDING_FAILED = 18;
        public static final int REASON_VM_EXCEPTION = 5;
        public static final int REASON_WIDEVINE_LEVEL_MISMATCH = 23;
        public static final int REASON_WIDEVINE_VALIDATION_FAILED = 19;
        public static final int REASON_XPOSED_INSTALLED = 31;
    }

    public interface EncryptionMethod {
        public static final int BITSLICER = 1;
        public static final int UNKNOWN_ENCRYPTION_METHOD = 0;
    }

    public interface ProtoName {
        public static final int AFMA_SIGNALS = 1;
        public static final int UNKNOWN_PROTO = 0;
    }

    public static final class RawAdAttestationSignal extends zzamd<RawAdAttestationSignal> {
        private static volatile RawAdAttestationSignal[] zzaQ;
        public byte[] encryptedAdAttestationStatemement;
        public String keyIdentifier;
        public Long timestampMs;

        public RawAdAttestationSignal() {
            this.timestampMs = null;
            this.keyIdentifier = null;
            this.encryptedAdAttestationStatemement = null;
            this.zzcaa = null;
            this.zzcaj = -1;
        }

        public static RawAdAttestationSignal[] emptyArray() {
            if (zzaQ == null) {
                synchronized (zzamh.zzcai) {
                    if (zzaQ == null) {
                        zzaQ = new RawAdAttestationSignal[0];
                    }
                }
            }
            return zzaQ;
        }

        public static RawAdAttestationSignal parseFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return (RawAdAttestationSignal) new RawAdAttestationSignal().mergeFrom(com_google_android_gms_internal_zzamb);
        }

        public static RawAdAttestationSignal parseFrom(byte[] bArr) throws zzami {
            return (RawAdAttestationSignal) zzamj.mergeFrom(new RawAdAttestationSignal(), bArr);
        }

        public RawAdAttestationSignal mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.timestampMs = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 26:
                        this.keyIdentifier = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 34:
                        this.encryptedAdAttestationStatemement = com_google_android_gms_internal_zzamb.readBytes();
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
            if (this.timestampMs != null) {
                com_google_android_gms_internal_zzamc.zzb(1, this.timestampMs.longValue());
            }
            if (this.keyIdentifier != null) {
                com_google_android_gms_internal_zzamc.zzq(3, this.keyIdentifier);
            }
            if (this.encryptedAdAttestationStatemement != null) {
                com_google_android_gms_internal_zzamc.zza(4, this.encryptedAdAttestationStatemement);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.timestampMs != null) {
                zzy += zzamc.zze(1, this.timestampMs.longValue());
            }
            if (this.keyIdentifier != null) {
                zzy += zzamc.zzr(3, this.keyIdentifier);
            }
            return this.encryptedAdAttestationStatemement != null ? zzy + zzamc.zzb(4, this.encryptedAdAttestationStatemement) : zzy;
        }
    }

    public static final class SignalVault extends zzamd<SignalVault> {
        private static volatile SignalVault[] zzaR;
        public byte[][] encryptedBlobs;
        public Integer encryptionMethod;
        public byte[] hash;
        public Integer protoName;

        public SignalVault() {
            this.encryptedBlobs = zzamm.zzcar;
            this.hash = null;
            this.protoName = null;
            this.encryptionMethod = null;
            this.zzcaa = null;
            this.zzcaj = -1;
        }

        public static SignalVault[] emptyArray() {
            if (zzaR == null) {
                synchronized (zzamh.zzcai) {
                    if (zzaR == null) {
                        zzaR = new SignalVault[0];
                    }
                }
            }
            return zzaR;
        }

        public static SignalVault parseFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return (SignalVault) new SignalVault().mergeFrom(com_google_android_gms_internal_zzamb);
        }

        public static SignalVault parseFrom(byte[] bArr) throws zzami {
            return (SignalVault) zzamj.mergeFrom(new SignalVault(), bArr);
        }

        public SignalVault mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.encryptedBlobs == null ? 0 : this.encryptedBlobs.length;
                        Object obj = new byte[(zzc + zzWC)][];
                        if (zzWC != 0) {
                            System.arraycopy(this.encryptedBlobs, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.readBytes();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readBytes();
                        this.encryptedBlobs = obj;
                        continue;
                    case 18:
                        this.hash = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 24:
                        zzWC = com_google_android_gms_internal_zzamb.zzWG();
                        switch (zzWC) {
                            case 0:
                            case 1:
                                this.protoName = Integer.valueOf(zzWC);
                                break;
                            default:
                                continue;
                        }
                    case 32:
                        zzWC = com_google_android_gms_internal_zzamb.zzWG();
                        switch (zzWC) {
                            case 0:
                            case 1:
                                this.encryptionMethod = Integer.valueOf(zzWC);
                                break;
                            default:
                                continue;
                        }
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
            if (this.encryptedBlobs != null && this.encryptedBlobs.length > 0) {
                for (byte[] bArr : this.encryptedBlobs) {
                    if (bArr != null) {
                        com_google_android_gms_internal_zzamc.zza(1, bArr);
                    }
                }
            }
            if (this.hash != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.hash);
            }
            if (this.protoName != null) {
                com_google_android_gms_internal_zzamc.zzE(3, this.protoName.intValue());
            }
            if (this.encryptionMethod != null) {
                com_google_android_gms_internal_zzamc.zzE(4, this.encryptionMethod.intValue());
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        protected int zzy() {
            int i = 0;
            int zzy = super.zzy();
            if (this.encryptedBlobs == null || this.encryptedBlobs.length <= 0) {
                i = zzy;
            } else {
                int i2 = 0;
                int i3 = 0;
                while (i < this.encryptedBlobs.length) {
                    byte[] bArr = this.encryptedBlobs[i];
                    if (bArr != null) {
                        i3++;
                        i2 += zzamc.zzQ(bArr);
                    }
                    i++;
                }
                i = (zzy + i2) + (i3 * 1);
            }
            if (this.hash != null) {
                i += zzamc.zzb(2, this.hash);
            }
            if (this.protoName != null) {
                i += zzamc.zzG(3, this.protoName.intValue());
            }
            return this.encryptionMethod != null ? i + zzamc.zzG(4, this.encryptionMethod.intValue()) : i;
        }
    }
}
