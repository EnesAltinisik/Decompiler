package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.b.lr.c;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public class abq extends a {
    public static final Creator<abq> CREATOR = new abr();
    public final int a;
    public dr b;
    public byte[] c;
    public int[] d;
    public String[] e;
    public int[] f;
    public byte[][] g;
    public boolean h;
    public final c i;
    public final abo.c j;
    public final abo.c k;

    abq(int i, dr drVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z) {
        this.a = i;
        this.b = drVar;
        this.c = bArr;
        this.d = iArr;
        this.e = strArr;
        this.i = null;
        this.j = null;
        this.k = null;
        this.f = iArr2;
        this.g = bArr2;
        this.h = z;
    }

    public abq(dr drVar, c cVar, abo.c cVar2, abo.c cVar3, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, boolean z) {
        this.a = 1;
        this.b = drVar;
        this.i = cVar;
        this.j = cVar2;
        this.k = cVar3;
        this.d = iArr;
        this.e = strArr;
        this.f = iArr2;
        this.g = bArr;
        this.h = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abq)) {
            return false;
        }
        abq com_google_android_gms_b_abq = (abq) obj;
        return this.a == com_google_android_gms_b_abq.a && b.a(this.b, com_google_android_gms_b_abq.b) && Arrays.equals(this.c, com_google_android_gms_b_abq.c) && Arrays.equals(this.d, com_google_android_gms_b_abq.d) && Arrays.equals(this.e, com_google_android_gms_b_abq.e) && b.a(this.i, com_google_android_gms_b_abq.i) && b.a(this.j, com_google_android_gms_b_abq.j) && b.a(this.k, com_google_android_gms_b_abq.k) && Arrays.equals(this.f, com_google_android_gms_b_abq.f) && Arrays.deepEquals(this.g, com_google_android_gms_b_abq.g) && this.h == com_google_android_gms_b_abq.h;
    }

    public int hashCode() {
        return b.a(Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.i, this.j, this.k, this.f, this.g, Boolean.valueOf(this.h));
    }

    public String toString() {
        return "LogEventParcelable[" + this.a + ", " + this.b + ", " + "LogEventBytes: " + (this.c == null ? null : new String(this.c)) + ", " + "TestCodes: " + Arrays.toString(this.d) + ", " + "MendelPackages: " + Arrays.toString(this.e) + ", " + "LogEvent: " + this.i + ", " + "ExtensionProducer: " + this.j + ", " + "VeProducer: " + this.k + ", " + "ExperimentIDs: " + Arrays.toString(this.f) + ", " + "ExperimentTokens: " + Arrays.toString(this.g) + ", " + "AddPhenotypeExperimentTokens: " + this.h + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        abr.a(this, parcel, i);
    }
}
