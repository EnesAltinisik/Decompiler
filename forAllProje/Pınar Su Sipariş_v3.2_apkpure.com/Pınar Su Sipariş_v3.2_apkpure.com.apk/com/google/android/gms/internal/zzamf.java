package com.google.android.gms.internal;

public final class zzamf implements Cloneable {
    private static final p zzcac = new p();
    private int mSize;
    private boolean zzcad;
    private int[] zzcae;
    private p[] zzcaf;

    zzamf() {
        this(10);
    }

    zzamf(int i) {
        this.zzcad = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.zzcae = new int[idealIntArraySize];
        this.zzcaf = new p[idealIntArraySize];
        this.mSize = 0;
    }

    private void gc() {
        int i = this.mSize;
        int[] iArr = this.zzcae;
        p[] pVarArr = this.zzcaf;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            p pVar = pVarArr[i3];
            if (pVar != zzcac) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    pVarArr[i2] = pVar;
                    pVarArr[i3] = null;
                }
                i2++;
            }
        }
        this.zzcad = false;
        this.mSize = i2;
    }

    private int idealByteArraySize(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    private int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    private boolean zza(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean zza(p[] pVarArr, p[] pVarArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!pVarArr[i2].equals(pVarArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private int zzom(int i) {
        int i2 = 0;
        int i3 = this.mSize - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.zzcae[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return zzWV();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzamf)) {
            return false;
        }
        zzamf com_google_android_gms_internal_zzamf = (zzamf) obj;
        return size() != com_google_android_gms_internal_zzamf.size() ? false : zza(this.zzcae, com_google_android_gms_internal_zzamf.zzcae, this.mSize) && zza(this.zzcaf, com_google_android_gms_internal_zzamf.zzcaf, this.mSize);
    }

    public int hashCode() {
        if (this.zzcad) {
            gc();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzcae[i2]) * 31) + this.zzcaf[i2].hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    void remove(int i) {
        int zzom = zzom(i);
        if (zzom >= 0 && this.zzcaf[zzom] != zzcac) {
            this.zzcaf[zzom] = zzcac;
            this.zzcad = true;
        }
    }

    int size() {
        if (this.zzcad) {
            gc();
        }
        return this.mSize;
    }

    public final zzamf zzWV() {
        int size = size();
        zzamf com_google_android_gms_internal_zzamf = new zzamf(size);
        System.arraycopy(this.zzcae, 0, com_google_android_gms_internal_zzamf.zzcae, 0, size);
        for (int i = 0; i < size; i++) {
            if (this.zzcaf[i] != null) {
                com_google_android_gms_internal_zzamf.zzcaf[i] = (p) this.zzcaf[i].clone();
            }
        }
        com_google_android_gms_internal_zzamf.mSize = size;
        return com_google_android_gms_internal_zzamf;
    }

    void zza(int i, p pVar) {
        int zzom = zzom(i);
        if (zzom >= 0) {
            this.zzcaf[zzom] = pVar;
            return;
        }
        zzom ^= -1;
        if (zzom >= this.mSize || this.zzcaf[zzom] != zzcac) {
            if (this.zzcad && this.mSize >= this.zzcae.length) {
                gc();
                zzom = zzom(i) ^ -1;
            }
            if (this.mSize >= this.zzcae.length) {
                int idealIntArraySize = idealIntArraySize(this.mSize + 1);
                Object obj = new int[idealIntArraySize];
                Object obj2 = new p[idealIntArraySize];
                System.arraycopy(this.zzcae, 0, obj, 0, this.zzcae.length);
                System.arraycopy(this.zzcaf, 0, obj2, 0, this.zzcaf.length);
                this.zzcae = obj;
                this.zzcaf = obj2;
            }
            if (this.mSize - zzom != 0) {
                System.arraycopy(this.zzcae, zzom, this.zzcae, zzom + 1, this.mSize - zzom);
                System.arraycopy(this.zzcaf, zzom, this.zzcaf, zzom + 1, this.mSize - zzom);
            }
            this.zzcae[zzom] = i;
            this.zzcaf[zzom] = pVar;
            this.mSize++;
            return;
        }
        this.zzcae[zzom] = i;
        this.zzcaf[zzom] = pVar;
    }

    p zzok(int i) {
        int zzom = zzom(i);
        return (zzom < 0 || this.zzcaf[zzom] == zzcac) ? null : this.zzcaf[zzom];
    }

    p zzol(int i) {
        if (this.zzcad) {
            gc();
        }
        return this.zzcaf[i];
    }
}
