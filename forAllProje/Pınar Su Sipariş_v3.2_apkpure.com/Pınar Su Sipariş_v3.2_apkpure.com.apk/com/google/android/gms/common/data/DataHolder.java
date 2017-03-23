package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Creator<DataHolder> CREATOR = new zze();
    private static final zza zzapm = new AnonymousClass1(new String[0], null);
    boolean mClosed;
    private final int mVersionCode;
    private final int zzahG;
    private final String[] zzape;
    Bundle zzapf;
    private final CursorWindow[] zzapg;
    private final Bundle zzaph;
    int[] zzapi;
    int zzapj;
    private Object zzapk;
    private boolean zzapl;

    public static class zza {
        private final String[] zzape;
        private final ArrayList<HashMap<String, Object>> zzapn;
        private final String zzapo;
        private final HashMap<Object, Integer> zzapp;
        private boolean zzapq;
        private String zzapr;

        private zza(String[] strArr, String str) {
            this.zzape = (String[]) zzaa.zzz(strArr);
            this.zzapn = new ArrayList();
            this.zzapo = str;
            this.zzapp = new HashMap();
            this.zzapq = false;
            this.zzapr = null;
        }

        private int zzb(HashMap<String, Object> hashMap) {
            if (this.zzapo == null) {
                return -1;
            }
            Object obj = hashMap.get(this.zzapo);
            if (obj == null) {
                return -1;
            }
            Integer num = (Integer) this.zzapp.get(obj);
            if (num != null) {
                return num.intValue();
            }
            this.zzapp.put(obj, Integer.valueOf(this.zzapn.size()));
            return -1;
        }

        public zza zza(ContentValues contentValues) {
            com.google.android.gms.common.internal.zzb.zzv(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Entry entry : contentValues.valueSet()) {
                hashMap.put((String) entry.getKey(), entry.getValue());
            }
            return zza(hashMap);
        }

        public zza zza(HashMap<String, Object> hashMap) {
            com.google.android.gms.common.internal.zzb.zzv(hashMap);
            int zzb = zzb((HashMap) hashMap);
            if (zzb == -1) {
                this.zzapn.add(hashMap);
            } else {
                this.zzapn.remove(zzb);
                this.zzapn.add(zzb, hashMap);
            }
            this.zzapq = false;
            return this;
        }

        public DataHolder zzbR(int i) {
            return new DataHolder(this, i, null);
        }
    }

    class AnonymousClass1 extends zza {
        AnonymousClass1(String[] strArr, String str) {
            super(strArr, str);
        }

        public zza zza(ContentValues contentValues) {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }

        public zza zza(HashMap<String, Object> hashMap) {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }
    }

    public static class zzb extends RuntimeException {
        public zzb(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.zzapl = true;
        this.mVersionCode = i;
        this.zzape = strArr;
        this.zzapg = cursorWindowArr;
        this.zzahG = i2;
        this.zzaph = bundle;
    }

    private DataHolder(zza com_google_android_gms_common_data_DataHolder_zza, int i, Bundle bundle) {
        this(com_google_android_gms_common_data_DataHolder_zza.zzape, zza(com_google_android_gms_common_data_DataHolder_zza, -1), i, bundle);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.mClosed = false;
        this.zzapl = true;
        this.mVersionCode = 1;
        this.zzape = (String[]) zzaa.zzz(strArr);
        this.zzapg = (CursorWindow[]) zzaa.zzz(cursorWindowArr);
        this.zzahG = i;
        this.zzaph = bundle;
        zzsT();
    }

    public static DataHolder zza(int i, Bundle bundle) {
        return new DataHolder(zzapm, i, bundle);
    }

    private static CursorWindow[] zza(zza com_google_android_gms_common_data_DataHolder_zza, int i) {
        int i2 = 0;
        if (com_google_android_gms_common_data_DataHolder_zza.zzape.length == 0) {
            return new CursorWindow[0];
        }
        List zzb = (i < 0 || i >= com_google_android_gms_common_data_DataHolder_zza.zzapn.size()) ? com_google_android_gms_common_data_DataHolder_zza.zzapn : com_google_android_gms_common_data_DataHolder_zza.zzapn.subList(0, i);
        int size = zzb.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(com_google_android_gms_common_data_DataHolder_zza.zzape.length);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            try {
                int i5;
                int i6;
                CursorWindow cursorWindow2;
                if (!cursorWindow.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i3 + ")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i3);
                    cursorWindow.setNumColumns(com_google_android_gms_common_data_DataHolder_zza.zzape.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) zzb.get(i3);
                boolean z = true;
                for (int i7 = 0; i7 < com_google_android_gms_common_data_DataHolder_zza.zzape.length && z; i7++) {
                    String str = com_google_android_gms_common_data_DataHolder_zza.zzape[i7];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z = cursorWindow.putNull(i3, i7);
                    } else if (obj instanceof String) {
                        z = cursorWindow.putString((String) obj, i3, i7);
                    } else if (obj instanceof Long) {
                        z = cursorWindow.putLong(((Long) obj).longValue(), i3, i7);
                    } else if (obj instanceof Integer) {
                        z = cursorWindow.putLong((long) ((Integer) obj).intValue(), i3, i7);
                    } else if (obj instanceof Boolean) {
                        z = cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i3, i7);
                    } else if (obj instanceof byte[]) {
                        z = cursorWindow.putBlob((byte[]) obj, i3, i7);
                    } else if (obj instanceof Double) {
                        z = cursorWindow.putDouble(((Double) obj).doubleValue(), i3, i7);
                    } else if (obj instanceof Float) {
                        z = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i3, i7);
                    } else {
                        String valueOf = String.valueOf(obj);
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Unsupported object for column ").append(str).append(": ").append(valueOf).toString());
                    }
                }
                if (z) {
                    i5 = i3;
                    i6 = 0;
                    cursorWindow2 = cursorWindow;
                } else if (i4 != 0) {
                    throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                } else {
                    Log.d("DataHolder", "Couldn't populate window data for row " + i3 + " - allocating new window.");
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow3 = new CursorWindow(false);
                    cursorWindow3.setStartPosition(i3);
                    cursorWindow3.setNumColumns(com_google_android_gms_common_data_DataHolder_zza.zzape.length);
                    arrayList.add(cursorWindow3);
                    i5 = i3 - 1;
                    cursorWindow2 = cursorWindow3;
                    i6 = 1;
                }
                i4 = i6;
                cursorWindow = cursorWindow2;
                i3 = i5 + 1;
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                int size2 = arrayList.size();
                while (i2 < size2) {
                    ((CursorWindow) arrayList.get(i2)).close();
                    i2++;
                }
                throw runtimeException;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    public static zza zzb(String[] strArr) {
        return new zza(strArr, null);
    }

    public static DataHolder zzbQ(int i) {
        return zza(i, null);
    }

    private void zzg(String str, int i) {
        if (this.zzapf == null || !this.zzapf.containsKey(str)) {
            String str2 = "No such column: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.zzapj) {
            throw new CursorIndexOutOfBoundsException(i, this.zzapj);
        }
    }

    public void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                for (CursorWindow close : this.zzapg) {
                    close.close();
                }
            }
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.zzapl && this.zzapg.length > 0 && !isClosed()) {
                String valueOf;
                if (this.zzapk == null) {
                    String str = "internal object: ";
                    valueOf = String.valueOf(toString());
                    valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                } else {
                    valueOf = this.zzapk.toString();
                }
                Log.e("DataBuffer", new StringBuilder(String.valueOf(valueOf).length() + 161).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (").append(valueOf).append(")").toString());
                close();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public int getCount() {
        return this.zzapj;
    }

    public int getStatusCode() {
        return this.zzahG;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public void zza(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zzg(str, i);
        this.zzapg[i2].copyStringToBuffer(i, this.zzapf.getInt(str), charArrayBuffer);
    }

    public long zzb(String str, int i, int i2) {
        zzg(str, i);
        return this.zzapg[i2].getLong(i, this.zzapf.getInt(str));
    }

    public int zzbP(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.zzapj;
        zzaa.zzai(z);
        while (i2 < this.zzapi.length) {
            if (i < this.zzapi[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.zzapi.length ? i2 - 1 : i2;
    }

    public int zzc(String str, int i, int i2) {
        zzg(str, i);
        return this.zzapg[i2].getInt(i, this.zzapf.getInt(str));
    }

    public boolean zzcY(String str) {
        return this.zzapf.containsKey(str);
    }

    public String zzd(String str, int i, int i2) {
        zzg(str, i);
        return this.zzapg[i2].getString(i, this.zzapf.getInt(str));
    }

    public boolean zze(String str, int i, int i2) {
        zzg(str, i);
        return Long.valueOf(this.zzapg[i2].getLong(i, this.zzapf.getInt(str))).longValue() == 1;
    }

    public float zzf(String str, int i, int i2) {
        zzg(str, i);
        return this.zzapg[i2].getFloat(i, this.zzapf.getInt(str));
    }

    public byte[] zzg(String str, int i, int i2) {
        zzg(str, i);
        return this.zzapg[i2].getBlob(i, this.zzapf.getInt(str));
    }

    public Uri zzh(String str, int i, int i2) {
        String zzd = zzd(str, i, i2);
        return zzd == null ? null : Uri.parse(zzd);
    }

    public boolean zzi(String str, int i, int i2) {
        zzg(str, i);
        return this.zzapg[i2].isNull(i, this.zzapf.getInt(str));
    }

    public Bundle zzsO() {
        return this.zzaph;
    }

    public void zzsT() {
        int i;
        int i2 = 0;
        this.zzapf = new Bundle();
        for (i = 0; i < this.zzape.length; i++) {
            this.zzapf.putInt(this.zzape[i], i);
        }
        this.zzapi = new int[this.zzapg.length];
        i = 0;
        while (i2 < this.zzapg.length) {
            this.zzapi[i2] = i;
            i += this.zzapg[i2].getNumRows() - (i - this.zzapg[i2].getStartPosition());
            i2++;
        }
        this.zzapj = i;
    }

    String[] zzsU() {
        return this.zzape;
    }

    CursorWindow[] zzsV() {
        return this.zzapg;
    }

    public void zzu(Object obj) {
        this.zzapk = obj;
    }
}
