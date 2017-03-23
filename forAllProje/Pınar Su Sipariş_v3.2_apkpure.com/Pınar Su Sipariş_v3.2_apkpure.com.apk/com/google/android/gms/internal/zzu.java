package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class zzu {
    protected static final Comparator<byte[]> zzav = new Comparator<byte[]>() {
        public int a(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((byte[]) obj, (byte[]) obj2);
        }
    };
    private List<byte[]> zzar = new LinkedList();
    private List<byte[]> zzas = new ArrayList(64);
    private int zzat = 0;
    private final int zzau;

    public zzu(int i) {
        this.zzau = i;
    }

    private synchronized void zzx() {
        while (this.zzat > this.zzau) {
            byte[] bArr = (byte[]) this.zzar.remove(0);
            this.zzas.remove(bArr);
            this.zzat -= bArr.length;
        }
    }

    public synchronized void zza(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.zzau) {
                this.zzar.add(bArr);
                int binarySearch = Collections.binarySearch(this.zzas, bArr, zzav);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.zzas.add(binarySearch, bArr);
                this.zzat += bArr.length;
                zzx();
            }
        }
    }

    public synchronized byte[] zzb(int i) {
        byte[] bArr;
        for (int i2 = 0; i2 < this.zzas.size(); i2++) {
            bArr = (byte[]) this.zzas.get(i2);
            if (bArr.length >= i) {
                this.zzat -= bArr.length;
                this.zzas.remove(i2);
                this.zzar.remove(bArr);
                break;
            }
        }
        bArr = new byte[i];
        return bArr;
    }
}
