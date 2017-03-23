package com.google.android.gms.internal;

import java.io.IOException;

public final class zzacl extends zzamd<zzacl> {
    public int[] zzbEA;
    public byte[][] zzbEB;
    public String[] zzbEz;

    public zzacl() {
        zzNR();
    }

    public static zzacl zzG(byte[] bArr) throws zzami {
        return (zzacl) zzamj.mergeFrom(new zzacl(), bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacl)) {
            return false;
        }
        zzacl com_google_android_gms_internal_zzacl = (zzacl) obj;
        return (zzamh.equals(this.zzbEz, com_google_android_gms_internal_zzacl.zzbEz) && zzamh.equals(this.zzbEA, com_google_android_gms_internal_zzacl.zzbEA) && zzamh.zza(this.zzbEB, com_google_android_gms_internal_zzacl.zzbEB)) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzacl.zzcaa == null || com_google_android_gms_internal_zzacl.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzacl.zzcaa) : false;
    }

    public int hashCode() {
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzbEz)) * 31) + zzamh.hashCode(this.zzbEA)) * 31) + zzamh.zza(this.zzbEB)) * 31;
        int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
        return hashCode2 + hashCode;
    }

    public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        return zzO(com_google_android_gms_internal_zzamb);
    }

    public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
        int i = 0;
        if (this.zzbEz != null && this.zzbEz.length > 0) {
            for (String str : this.zzbEz) {
                if (str != null) {
                    com_google_android_gms_internal_zzamc.zzq(1, str);
                }
            }
        }
        if (this.zzbEA != null && this.zzbEA.length > 0) {
            for (int zzE : this.zzbEA) {
                com_google_android_gms_internal_zzamc.zzE(2, zzE);
            }
        }
        if (this.zzbEB != null && this.zzbEB.length > 0) {
            while (i < this.zzbEB.length) {
                byte[] bArr = this.zzbEB[i];
                if (bArr != null) {
                    com_google_android_gms_internal_zzamc.zza(3, bArr);
                }
                i++;
            }
        }
        super.writeTo(com_google_android_gms_internal_zzamc);
    }

    public zzacl zzNR() {
        this.zzbEz = zzamm.zzcaq;
        this.zzbEA = zzamm.zzcal;
        this.zzbEB = zzamm.zzcar;
        this.zzcaa = null;
        this.zzcaj = -1;
        return this;
    }

    public zzacl zzO(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        while (true) {
            int zzWC = com_google_android_gms_internal_zzamb.zzWC();
            int zzc;
            Object obj;
            switch (zzWC) {
                case 0:
                    break;
                case 10:
                    zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                    zzWC = this.zzbEz == null ? 0 : this.zzbEz.length;
                    obj = new String[(zzc + zzWC)];
                    if (zzWC != 0) {
                        System.arraycopy(this.zzbEz, 0, obj, 0, zzWC);
                    }
                    while (zzWC < obj.length - 1) {
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                        com_google_android_gms_internal_zzamb.zzWC();
                        zzWC++;
                    }
                    obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                    this.zzbEz = obj;
                    continue;
                case 16:
                    zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 16);
                    zzWC = this.zzbEA == null ? 0 : this.zzbEA.length;
                    obj = new int[(zzc + zzWC)];
                    if (zzWC != 0) {
                        System.arraycopy(this.zzbEA, 0, obj, 0, zzWC);
                    }
                    while (zzWC < obj.length - 1) {
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        com_google_android_gms_internal_zzamb.zzWC();
                        zzWC++;
                    }
                    obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                    this.zzbEA = obj;
                    continue;
                case 18:
                    int zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                    zzc = com_google_android_gms_internal_zzamb.getPosition();
                    zzWC = 0;
                    while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                        com_google_android_gms_internal_zzamb.zzWG();
                        zzWC++;
                    }
                    com_google_android_gms_internal_zzamb.zznY(zzc);
                    zzc = this.zzbEA == null ? 0 : this.zzbEA.length;
                    Object obj2 = new int[(zzWC + zzc)];
                    if (zzc != 0) {
                        System.arraycopy(this.zzbEA, 0, obj2, 0, zzc);
                    }
                    while (zzc < obj2.length) {
                        obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                        zzc++;
                    }
                    this.zzbEA = obj2;
                    com_google_android_gms_internal_zzamb.zznX(zznW);
                    continue;
                case 26:
                    zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 26);
                    zzWC = this.zzbEB == null ? 0 : this.zzbEB.length;
                    obj = new byte[(zzc + zzWC)][];
                    if (zzWC != 0) {
                        System.arraycopy(this.zzbEB, 0, obj, 0, zzWC);
                    }
                    while (zzWC < obj.length - 1) {
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readBytes();
                        com_google_android_gms_internal_zzamb.zzWC();
                        zzWC++;
                    }
                    obj[zzWC] = com_google_android_gms_internal_zzamb.readBytes();
                    this.zzbEB = obj;
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

    protected int zzy() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int zzy = super.zzy();
        if (this.zzbEz == null || this.zzbEz.length <= 0) {
            i = zzy;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.zzbEz) {
                if (str != null) {
                    i3++;
                    i2 += zzamc.zziZ(str);
                }
            }
            i = (zzy + i2) + (i3 * 1);
        }
        if (this.zzbEA != null && this.zzbEA.length > 0) {
            i3 = 0;
            for (int zzy2 : this.zzbEA) {
                i3 += zzamc.zzoc(zzy2);
            }
            i = (i + i3) + (this.zzbEA.length * 1);
        }
        if (this.zzbEB == null || this.zzbEB.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.zzbEB.length) {
            byte[] bArr = this.zzbEB[i4];
            if (bArr != null) {
                i3++;
                i2 += zzamc.zzQ(bArr);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }
}
