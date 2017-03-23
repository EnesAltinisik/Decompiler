package com.google.android.gms.vision;

import android.util.SparseArray;

public class zza {
    private static int zzbxt = 0;
    private static final Object zzrs = new Object();
    private SparseArray<Integer> zzbxu = new SparseArray();
    private SparseArray<Integer> zzbxv = new SparseArray();

    public int zzlf(int i) {
        int intValue;
        synchronized (zzrs) {
            Integer num = (Integer) this.zzbxu.get(i);
            if (num != null) {
                intValue = num.intValue();
            } else {
                intValue = zzbxt;
                zzbxt++;
                this.zzbxu.append(i, Integer.valueOf(intValue));
                this.zzbxv.append(intValue, Integer.valueOf(i));
            }
        }
        return intValue;
    }

    public int zzlg(int i) {
        int intValue;
        synchronized (zzrs) {
            intValue = ((Integer) this.zzbxv.get(i)).intValue();
        }
        return intValue;
    }
}
