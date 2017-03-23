package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzm;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class Value extends AbstractSafeParcelable {
    public static final Creator<Value> CREATOR = new zzu();
    private final int mVersionCode;
    private final int zzaDN;
    private float zzaDS;
    private boolean zzaEd;
    private String zzaEe;
    private Map<String, MapValue> zzaEf;
    private int[] zzaEg;
    private float[] zzaEh;
    private byte[] zzaEi;

    public Value(int i) {
        this(3, i, false, 0.0f, null, null, null, null, null);
    }

    Value(int i, int i2, boolean z, float f, String str, Bundle bundle, int[] iArr, float[] fArr, byte[] bArr) {
        this.mVersionCode = i;
        this.zzaDN = i2;
        this.zzaEd = z;
        this.zzaDS = f;
        this.zzaEe = str;
        this.zzaEf = zzx(bundle);
        this.zzaEg = iArr;
        this.zzaEh = fArr;
        this.zzaEi = bArr;
    }

    private boolean zza(Value value) {
        if (this.zzaDN != value.zzaDN || this.zzaEd != value.zzaEd) {
            return false;
        }
        switch (this.zzaDN) {
            case 1:
                return asInt() == value.asInt();
            case 2:
                return this.zzaDS == value.zzaDS;
            case 3:
                return zzz.equal(this.zzaEe, value.zzaEe);
            case 4:
                return zzz.equal(this.zzaEf, value.zzaEf);
            case 5:
                return Arrays.equals(this.zzaEg, value.zzaEg);
            case 6:
                return Arrays.equals(this.zzaEh, value.zzaEh);
            case 7:
                return Arrays.equals(this.zzaEi, value.zzaEi);
            default:
                return this.zzaDS == value.zzaDS;
        }
    }

    private static Map<String, MapValue> zzx(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(MapValue.class.getClassLoader());
        Map<String, MapValue> aVar = new a(bundle.size());
        for (String str : bundle.keySet()) {
            aVar.put(str, (MapValue) bundle.getParcelable(str));
        }
        return aVar;
    }

    public String asActivity() {
        return FitnessActivities.getName(asInt());
    }

    public float asFloat() {
        zzaa.zza(this.zzaDN == 2, (Object) "Value is not in float format");
        return this.zzaDS;
    }

    public int asInt() {
        boolean z = true;
        if (this.zzaDN != 1) {
            z = false;
        }
        zzaa.zza(z, (Object) "Value is not in int format");
        return Float.floatToRawIntBits(this.zzaDS);
    }

    public String asString() {
        zzaa.zza(this.zzaDN == 3, (Object) "Value is not in string format");
        return this.zzaEe;
    }

    public void clearKey(String str) {
        zzaa.zza(this.zzaDN == 4, (Object) "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        if (this.zzaEf != null) {
            this.zzaEf.remove(str);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Value) && zza((Value) obj));
    }

    public int getFormat() {
        return this.zzaDN;
    }

    public Float getKeyValue(String str) {
        zzaa.zza(this.zzaDN == 4, (Object) "Value is not in float map format");
        return (this.zzaEf == null || !this.zzaEf.containsKey(str)) ? null : Float.valueOf(((MapValue) this.zzaEf.get(str)).asFloat());
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Float.valueOf(this.zzaDS), this.zzaEe, this.zzaEf, this.zzaEg, this.zzaEh, this.zzaEi);
    }

    public boolean isSet() {
        return this.zzaEd;
    }

    public void setActivity(String str) {
        setInt(FitnessActivities.zzdN(str));
    }

    public void setFloat(float f) {
        zzaa.zza(this.zzaDN == 2, (Object) "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.zzaEd = true;
        this.zzaDS = f;
    }

    public void setInt(int i) {
        zzaa.zza(this.zzaDN == 1, (Object) "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.zzaEd = true;
        this.zzaDS = Float.intBitsToFloat(i);
    }

    public void setKeyValue(String str, float f) {
        zzaa.zza(this.zzaDN == 4, (Object) "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.zzaEd = true;
        if (this.zzaEf == null) {
            this.zzaEf = new HashMap();
        }
        this.zzaEf.put(str, MapValue.zzc(f));
    }

    public void setString(String str) {
        zzaa.zza(this.zzaDN == 3, (Object) "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        this.zzaEd = true;
        this.zzaEe = str;
    }

    public String toString() {
        if (!this.zzaEd) {
            return "unset";
        }
        switch (this.zzaDN) {
            case 1:
                return Integer.toString(asInt());
            case 2:
                return Float.toString(this.zzaDS);
            case 3:
                return this.zzaEe;
            case 4:
                return new TreeMap(this.zzaEf).toString();
            case 5:
                return Arrays.toString(this.zzaEg);
            case 6:
                return Arrays.toString(this.zzaEh);
            case 7:
                return zzm.zza(this.zzaEi, 0, this.zzaEi.length, false);
            default:
                return FitnessActivities.UNKNOWN;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzu.zza(this, parcel, i);
    }

    float zzxF() {
        return this.zzaDS;
    }

    String zzxK() {
        return this.zzaEe;
    }

    Bundle zzxL() {
        if (this.zzaEf == null) {
            return null;
        }
        Bundle bundle = new Bundle(this.zzaEf.size());
        for (Entry entry : this.zzaEf.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
        }
        return bundle;
    }

    int[] zzxM() {
        return this.zzaEg;
    }

    float[] zzxN() {
        return this.zzaEh;
    }

    byte[] zzxO() {
        return this.zzaEi;
    }
}
