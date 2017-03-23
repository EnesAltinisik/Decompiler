package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class zzame<M extends zzamd<M>, T> {
    public final int tag;
    protected final int type;
    protected final Class<T> zzbSs;
    protected final boolean zzcab;

    private zzame(int i, Class<T> cls, int i2, boolean z) {
        this.type = i;
        this.zzbSs = cls;
        this.tag = i2;
        this.zzcab = z;
    }

    private T zzW(List<q> list) {
        int i;
        int i2 = 0;
        List arrayList = new ArrayList();
        for (i = 0; i < list.size(); i++) {
            q qVar = (q) list.get(i);
            if (qVar.b.length != 0) {
                zza(qVar, arrayList);
            }
        }
        i = arrayList.size();
        if (i == 0) {
            return null;
        }
        T cast = this.zzbSs.cast(Array.newInstance(this.zzbSs.getComponentType(), i));
        while (i2 < i) {
            Array.set(cast, i2, arrayList.get(i2));
            i2++;
        }
        return cast;
    }

    private T zzX(List<q> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.zzbSs.cast(zzV(zzamb.zzN(((q) list.get(list.size() - 1)).b)));
    }

    public static <M extends zzamd<M>, T extends zzamj> zzame<M, T> zza(int i, Class<T> cls, long j) {
        return new zzame(i, cls, (int) j, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzame)) {
            return false;
        }
        zzame com_google_android_gms_internal_zzame = (zzame) obj;
        return this.type == com_google_android_gms_internal_zzame.type && this.zzbSs == com_google_android_gms_internal_zzame.zzbSs && this.tag == com_google_android_gms_internal_zzame.tag && this.zzcab == com_google_android_gms_internal_zzame.zzcab;
    }

    public int hashCode() {
        return (this.zzcab ? 1 : 0) + ((((((this.type + 1147) * 31) + this.zzbSs.hashCode()) * 31) + this.tag) * 31);
    }

    protected Object zzV(zzamb com_google_android_gms_internal_zzamb) {
        String valueOf;
        Class componentType = this.zzcab ? this.zzbSs.getComponentType() : this.zzbSs;
        try {
            zzamj com_google_android_gms_internal_zzamj;
            switch (this.type) {
                case 10:
                    com_google_android_gms_internal_zzamj = (zzamj) componentType.newInstance();
                    com_google_android_gms_internal_zzamb.zza(com_google_android_gms_internal_zzamj, zzamm.zzoo(this.tag));
                    return com_google_android_gms_internal_zzamj;
                case 11:
                    com_google_android_gms_internal_zzamj = (zzamj) componentType.newInstance();
                    com_google_android_gms_internal_zzamb.zza(com_google_android_gms_internal_zzamj);
                    return com_google_android_gms_internal_zzamj;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (Throwable e) {
            valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e);
        } catch (Throwable e2) {
            valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e2);
        } catch (Throwable e22) {
            throw new IllegalArgumentException("Error reading extension field", e22);
        }
    }

    final T zzV(List<q> list) {
        return list == null ? null : this.zzcab ? zzW(list) : zzX(list);
    }

    protected void zza(q qVar, List<Object> list) {
        list.add(zzV(zzamb.zzN(qVar.b)));
    }

    void zza(Object obj, zzamc com_google_android_gms_internal_zzamc) throws IOException {
        if (this.zzcab) {
            zzc(obj, com_google_android_gms_internal_zzamc);
        } else {
            zzb(obj, com_google_android_gms_internal_zzamc);
        }
    }

    int zzaP(Object obj) {
        return this.zzcab ? zzaQ(obj) : zzaR(obj);
    }

    protected int zzaQ(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += zzaR(Array.get(obj, i2));
            }
        }
        return i;
    }

    protected int zzaR(Object obj) {
        int zzoo = zzamm.zzoo(this.tag);
        switch (this.type) {
            case 10:
                return zzamc.zzb(zzoo, (zzamj) obj);
            case 11:
                return zzamc.zzc(zzoo, (zzamj) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.type);
        }
    }

    protected void zzb(Object obj, zzamc com_google_android_gms_internal_zzamc) {
        try {
            com_google_android_gms_internal_zzamc.zzog(this.tag);
            switch (this.type) {
                case 10:
                    zzamj com_google_android_gms_internal_zzamj = (zzamj) obj;
                    int zzoo = zzamm.zzoo(this.tag);
                    com_google_android_gms_internal_zzamc.zzb(com_google_android_gms_internal_zzamj);
                    com_google_android_gms_internal_zzamc.zzI(zzoo, 4);
                    return;
                case 11:
                    com_google_android_gms_internal_zzamc.zzc((zzamj) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    protected void zzc(Object obj, zzamc com_google_android_gms_internal_zzamc) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                zzb(obj2, com_google_android_gms_internal_zzamc);
            }
        }
    }
}
