package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzafa implements Comparable<zzafa>, Iterable<zzahi> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzafa.class.desiredAssertionStatus());
    private static final zzafa zzbLL = new zzafa("");
    private final int end;
    private final int start;
    private final zzahi[] zzbLK;

    public zzafa(String str) {
        String[] split = str.split("/");
        int i = 0;
        for (String length : split) {
            if (length.length() > 0) {
                i++;
            }
        }
        this.zzbLK = new zzahi[i];
        int length2 = split.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            String str2 = split[i2];
            if (str2.length() > 0) {
                i = i3 + 1;
                this.zzbLK[i3] = zzahi.zzig(str2);
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        this.start = 0;
        this.end = this.zzbLK.length;
    }

    public zzafa(List<String> list) {
        this.zzbLK = new zzahi[list.size()];
        int i = 0;
        for (String zzig : list) {
            int i2 = i + 1;
            this.zzbLK[i] = zzahi.zzig(zzig);
            i = i2;
        }
        this.start = 0;
        this.end = list.size();
    }

    public zzafa(zzahi... com_google_android_gms_internal_zzahiArr) {
        this.zzbLK = (zzahi[]) Arrays.copyOf(com_google_android_gms_internal_zzahiArr, com_google_android_gms_internal_zzahiArr.length);
        this.start = 0;
        this.end = com_google_android_gms_internal_zzahiArr.length;
        int length = com_google_android_gms_internal_zzahiArr.length;
        int i = 0;
        while (i < length) {
            zzahi com_google_android_gms_internal_zzahi = com_google_android_gms_internal_zzahiArr[i];
            if ($assertionsDisabled || com_google_android_gms_internal_zzahi != null) {
                i++;
            } else {
                throw new AssertionError("Can't construct a path with a null value!");
            }
        }
    }

    private zzafa(zzahi[] com_google_android_gms_internal_zzahiArr, int i, int i2) {
        this.zzbLK = com_google_android_gms_internal_zzahiArr;
        this.start = i;
        this.end = i2;
    }

    public static zzafa zzRq() {
        return zzbLL;
    }

    public static zzafa zza(zzafa com_google_android_gms_internal_zzafa, zzafa com_google_android_gms_internal_zzafa2) {
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        zzahi zzRt2 = com_google_android_gms_internal_zzafa2.zzRt();
        if (zzRt == null) {
            return com_google_android_gms_internal_zzafa2;
        }
        if (zzRt.equals(zzRt2)) {
            return zza(com_google_android_gms_internal_zzafa.zzRu(), com_google_android_gms_internal_zzafa2.zzRu());
        }
        String valueOf = String.valueOf(com_google_android_gms_internal_zzafa2);
        String valueOf2 = String.valueOf(com_google_android_gms_internal_zzafa);
        throw new DatabaseException(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("INTERNAL ERROR: ").append(valueOf).append(" is not contained in ").append(valueOf2).toString());
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzj((zzafa) obj);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzafa)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzafa com_google_android_gms_internal_zzafa = (zzafa) obj;
        if (size() != com_google_android_gms_internal_zzafa.size()) {
            return false;
        }
        int i = this.start;
        int i2 = com_google_android_gms_internal_zzafa.start;
        while (i < this.end && i2 < com_google_android_gms_internal_zzafa.end) {
            if (!this.zzbLK[i].equals(com_google_android_gms_internal_zzafa.zzbLK[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 37) + this.zzbLK[i2].hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.start >= this.end;
    }

    public Iterator<zzahi> iterator() {
        return new Iterator<zzahi>(this) {
            int a = this.b.start;
            final /* synthetic */ zzafa b;

            {
                this.b = r2;
            }

            public zzahi a() {
                if (hasNext()) {
                    zzahi com_google_android_gms_internal_zzahi = this.b.zzbLK[this.a];
                    this.a++;
                    return com_google_android_gms_internal_zzahi;
                }
                throw new NoSuchElementException("No more elements.");
            }

            public boolean hasNext() {
                return this.a < this.b.end;
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
            }
        };
    }

    public int size() {
        return this.end - this.start;
    }

    public String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.start; i < this.end; i++) {
            stringBuilder.append("/");
            stringBuilder.append(this.zzbLK[i].asString());
        }
        return stringBuilder.toString();
    }

    public String zzRr() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.start; i < this.end; i++) {
            if (i > this.start) {
                stringBuilder.append("/");
            }
            stringBuilder.append(this.zzbLK[i].asString());
        }
        return stringBuilder.toString();
    }

    public List<String> zzRs() {
        List<String> arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((zzahi) it.next()).asString());
        }
        return arrayList;
    }

    public zzahi zzRt() {
        return isEmpty() ? null : this.zzbLK[this.start];
    }

    public zzafa zzRu() {
        int i = this.start;
        if (!isEmpty()) {
            i++;
        }
        return new zzafa(this.zzbLK, i, this.end);
    }

    public zzafa zzRv() {
        return isEmpty() ? null : new zzafa(this.zzbLK, this.start, this.end - 1);
    }

    public zzahi zzRw() {
        return !isEmpty() ? this.zzbLK[this.end - 1] : null;
    }

    public zzafa zza(zzahi com_google_android_gms_internal_zzahi) {
        int size = size();
        Object obj = new zzahi[(size + 1)];
        System.arraycopy(this.zzbLK, this.start, obj, 0, size);
        obj[size] = com_google_android_gms_internal_zzahi;
        return new zzafa(obj, 0, size + 1);
    }

    public zzafa zzh(zzafa com_google_android_gms_internal_zzafa) {
        int size = size() + com_google_android_gms_internal_zzafa.size();
        Object obj = new zzahi[size];
        System.arraycopy(this.zzbLK, this.start, obj, 0, size());
        System.arraycopy(com_google_android_gms_internal_zzafa.zzbLK, com_google_android_gms_internal_zzafa.start, obj, size(), com_google_android_gms_internal_zzafa.size());
        return new zzafa(obj, 0, size);
    }

    public boolean zzi(zzafa com_google_android_gms_internal_zzafa) {
        if (size() > com_google_android_gms_internal_zzafa.size()) {
            return false;
        }
        int i = this.start;
        int i2 = com_google_android_gms_internal_zzafa.start;
        while (i < this.end) {
            if (!this.zzbLK[i].equals(com_google_android_gms_internal_zzafa.zzbLK[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public int zzj(zzafa com_google_android_gms_internal_zzafa) {
        int i = this.start;
        int i2 = com_google_android_gms_internal_zzafa.start;
        while (i < this.end && i2 < com_google_android_gms_internal_zzafa.end) {
            int zzi = this.zzbLK[i].zzi(com_google_android_gms_internal_zzafa.zzbLK[i2]);
            if (zzi != 0) {
                return zzi;
            }
            i++;
            i2++;
        }
        return (i == this.end && i2 == com_google_android_gms_internal_zzafa.end) ? 0 : i == this.end ? -1 : 1;
    }
}
