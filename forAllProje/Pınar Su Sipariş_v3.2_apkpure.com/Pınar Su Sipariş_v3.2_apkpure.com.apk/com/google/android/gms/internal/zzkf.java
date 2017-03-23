package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzz;
import java.util.ArrayList;
import java.util.List;

@zzig
public class zzkf {
    private final String[] zzQJ;
    private final double[] zzQK;
    private final double[] zzQL;
    private final int[] zzQM;
    private int zzQN;

    public static class zza {
        public final int count;
        public final String name;
        public final double zzQO;
        public final double zzQP;
        public final double zzQQ;

        public zza(String str, double d, double d2, double d3, int i) {
            this.name = str;
            this.zzQP = d;
            this.zzQO = d2;
            this.zzQQ = d3;
            this.count = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzkf_zza = (zza) obj;
            return zzz.equal(this.name, com_google_android_gms_internal_zzkf_zza.name) && this.zzQO == com_google_android_gms_internal_zzkf_zza.zzQO && this.zzQP == com_google_android_gms_internal_zzkf_zza.zzQP && this.count == com_google_android_gms_internal_zzkf_zza.count && Double.compare(this.zzQQ, com_google_android_gms_internal_zzkf_zza.zzQQ) == 0;
        }

        public int hashCode() {
            return zzz.hashCode(this.name, Double.valueOf(this.zzQO), Double.valueOf(this.zzQP), Double.valueOf(this.zzQQ), Integer.valueOf(this.count));
        }

        public String toString() {
            return zzz.zzy(this).zzg("name", this.name).zzg("minBound", Double.valueOf(this.zzQP)).zzg("maxBound", Double.valueOf(this.zzQO)).zzg("percent", Double.valueOf(this.zzQQ)).zzg("count", Integer.valueOf(this.count)).toString();
        }
    }

    public static class zzb {
        private final List<String> zzQR = new ArrayList();
        private final List<Double> zzQS = new ArrayList();
        private final List<Double> zzQT = new ArrayList();

        public zzb zza(String str, double d, double d2) {
            int i = 0;
            while (i < this.zzQR.size()) {
                double doubleValue = ((Double) this.zzQT.get(i)).doubleValue();
                double doubleValue2 = ((Double) this.zzQS.get(i)).doubleValue();
                if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                    break;
                }
                i++;
            }
            this.zzQR.add(i, str);
            this.zzQT.add(i, Double.valueOf(d));
            this.zzQS.add(i, Double.valueOf(d2));
            return this;
        }

        public zzkf zzjj() {
            return new zzkf();
        }
    }

    private zzkf(zzb com_google_android_gms_internal_zzkf_zzb) {
        int size = com_google_android_gms_internal_zzkf_zzb.zzQS.size();
        this.zzQJ = (String[]) com_google_android_gms_internal_zzkf_zzb.zzQR.toArray(new String[size]);
        this.zzQK = zzm(com_google_android_gms_internal_zzkf_zzb.zzQS);
        this.zzQL = zzm(com_google_android_gms_internal_zzkf_zzb.zzQT);
        this.zzQM = new int[size];
        this.zzQN = 0;
    }

    private double[] zzm(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public List<zza> getBuckets() {
        List<zza> arrayList = new ArrayList(this.zzQJ.length);
        for (int i = 0; i < this.zzQJ.length; i++) {
            arrayList.add(new zza(this.zzQJ[i], this.zzQL[i], this.zzQK[i], ((double) this.zzQM[i]) / ((double) this.zzQN), this.zzQM[i]));
        }
        return arrayList;
    }

    public void zza(double d) {
        this.zzQN++;
        int i = 0;
        while (i < this.zzQL.length) {
            if (this.zzQL[i] <= d && d < this.zzQK[i]) {
                int[] iArr = this.zzQM;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.zzQL[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}
