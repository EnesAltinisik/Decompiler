package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final zzi CREATOR = new zzi();
    final int mVersionCode;
    public final String name;
    public final int weight;
    public final String zzZW;
    public final boolean zzZX;
    public final boolean zzZY;
    public final String zzZZ;
    public final Feature[] zzaaa;
    final int[] zzaab;
    public final String zzaac;

    public static final class zza {
        private final String mName;
        private String zzaad;
        private boolean zzaae;
        private int zzaaf = 1;
        private boolean zzaag;
        private final List<Feature> zzaah = new ArrayList();
        private BitSet zzaai;
        private String zzaaj;

        public zza(String str) {
            this.mName = str;
        }

        public zza zzU(boolean z) {
            this.zzaae = z;
            return this;
        }

        public zza zzV(boolean z) {
            this.zzaag = z;
            return this;
        }

        public zza zzaD(int i) {
            if (this.zzaai == null) {
                this.zzaai = new BitSet();
            }
            this.zzaai.set(i);
            return this;
        }

        public zza zzcf(String str) {
            this.zzaad = str;
            return this;
        }

        public zza zzcg(String str) {
            this.zzaaj = str;
            return this;
        }

        public RegisterSectionInfo zzoK() {
            int[] iArr;
            int i = 0;
            if (this.zzaai != null) {
                iArr = new int[this.zzaai.cardinality()];
                int nextSetBit = this.zzaai.nextSetBit(0);
                while (nextSetBit >= 0) {
                    int i2 = i + 1;
                    iArr[i] = nextSetBit;
                    nextSetBit = this.zzaai.nextSetBit(nextSetBit + 1);
                    i = i2;
                }
            } else {
                iArr = null;
            }
            return new RegisterSectionInfo(this.mName, this.zzaad, this.zzaae, this.zzaaf, this.zzaag, null, (Feature[]) this.zzaah.toArray(new Feature[this.zzaah.size()]), iArr, this.zzaaj);
        }
    }

    RegisterSectionInfo(int i, String str, String str2, boolean z, int i2, boolean z2, String str3, Feature[] featureArr, int[] iArr, String str4) {
        this.mVersionCode = i;
        this.name = str;
        this.zzZW = str2;
        this.zzZX = z;
        this.weight = i2;
        this.zzZY = z2;
        this.zzZZ = str3;
        this.zzaaa = featureArr;
        this.zzaab = iArr;
        this.zzaac = str4;
    }

    RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, int[] iArr, String str4) {
        this(2, str, str2, z, i, z2, str3, featureArr, iArr, str4);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi com_google_android_gms_appdatasearch_zzi = CREATOR;
        zzi.zza(this, parcel, i);
    }
}
