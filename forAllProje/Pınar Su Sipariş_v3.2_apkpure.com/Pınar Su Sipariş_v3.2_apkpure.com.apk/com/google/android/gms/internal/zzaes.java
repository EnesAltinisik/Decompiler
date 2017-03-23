package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagi.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzaes implements Iterable<Entry<zzafa, zzahu>> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzaes.class.desiredAssertionStatus());
    private static final zzaes zzbLf = new zzaes(new zzagi(null));
    private final zzagi<zzahu> zzbLg;

    private zzaes(zzagi<zzahu> com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzahu) {
        this.zzbLg = com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzahu;
    }

    public static zzaes zzQN() {
        return zzbLf;
    }

    private zzahu zza(zzafa com_google_android_gms_internal_zzafa, zzagi<zzahu> com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzahu, zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzahu.getValue() != null) {
            return com_google_android_gms_internal_zzahu.zzl(com_google_android_gms_internal_zzafa, (zzahu) com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzahu.getValue());
        }
        zzahu com_google_android_gms_internal_zzahu2 = null;
        Iterator it = com_google_android_gms_internal_zzagi_com_google_android_gms_internal_zzahu.zzSp().iterator();
        zzahu com_google_android_gms_internal_zzahu3 = com_google_android_gms_internal_zzahu;
        while (it.hasNext()) {
            zzahu zza;
            zzahu com_google_android_gms_internal_zzahu4;
            Entry entry = (Entry) it.next();
            zzagi com_google_android_gms_internal_zzagi = (zzagi) entry.getValue();
            zzahi com_google_android_gms_internal_zzahi = (zzahi) entry.getKey();
            if (!com_google_android_gms_internal_zzahi.zzTl()) {
                zza = zza(com_google_android_gms_internal_zzafa.zza(com_google_android_gms_internal_zzahi), com_google_android_gms_internal_zzagi, com_google_android_gms_internal_zzahu3);
                com_google_android_gms_internal_zzahu4 = com_google_android_gms_internal_zzahu2;
            } else if ($assertionsDisabled || com_google_android_gms_internal_zzagi.getValue() != null) {
                com_google_android_gms_internal_zzahu4 = (zzahu) com_google_android_gms_internal_zzagi.getValue();
                zza = com_google_android_gms_internal_zzahu3;
            } else {
                throw new AssertionError("Priority writes must always be leaf nodes");
            }
            com_google_android_gms_internal_zzahu2 = com_google_android_gms_internal_zzahu4;
            com_google_android_gms_internal_zzahu3 = zza;
        }
        return (com_google_android_gms_internal_zzahu3.zzO(com_google_android_gms_internal_zzafa).isEmpty() || com_google_android_gms_internal_zzahu2 == null) ? com_google_android_gms_internal_zzahu3 : com_google_android_gms_internal_zzahu3.zzl(com_google_android_gms_internal_zzafa.zza(zzahi.zzTj()), com_google_android_gms_internal_zzahu2);
    }

    public static zzaes zzax(Map<String, Object> map) {
        zzagi zzSo = zzagi.zzSo();
        zzagi com_google_android_gms_internal_zzagi = zzSo;
        for (Entry entry : map.entrySet()) {
            com_google_android_gms_internal_zzagi = com_google_android_gms_internal_zzagi.zza(new zzafa((String) entry.getKey()), new zzagi(zzahv.zzaq(entry.getValue())));
        }
        return new zzaes(com_google_android_gms_internal_zzagi);
    }

    public static zzaes zzay(Map<zzafa, zzahu> map) {
        zzagi zzSo = zzagi.zzSo();
        zzagi com_google_android_gms_internal_zzagi = zzSo;
        for (Entry entry : map.entrySet()) {
            com_google_android_gms_internal_zzagi = com_google_android_gms_internal_zzagi.zza((zzafa) entry.getKey(), new zzagi((zzahu) entry.getValue()));
        }
        return new zzaes(com_google_android_gms_internal_zzagi);
    }

    public boolean equals(Object obj) {
        return obj == this ? true : (obj == null || obj.getClass() != getClass()) ? false : ((zzaes) obj).zzaQ(true).equals(zzaQ(true));
    }

    public int hashCode() {
        return zzaQ(true).hashCode();
    }

    public boolean isEmpty() {
        return this.zzbLg.isEmpty();
    }

    public Iterator<Entry<zzafa, zzahu>> iterator() {
        return this.zzbLg.iterator();
    }

    public String toString() {
        String valueOf = String.valueOf(zzaQ(true).toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("CompoundWrite{").append(valueOf).append("}").toString();
    }

    public zzahu zzQO() {
        return (zzahu) this.zzbLg.getValue();
    }

    public List<zzaht> zzQP() {
        List<zzaht> arrayList = new ArrayList();
        if (this.zzbLg.getValue() != null) {
            for (zzaht com_google_android_gms_internal_zzaht : (zzahu) this.zzbLg.getValue()) {
                arrayList.add(new zzaht(com_google_android_gms_internal_zzaht.zzTK(), com_google_android_gms_internal_zzaht.zzPj()));
            }
        } else {
            Iterator it = this.zzbLg.zzSp().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                zzagi com_google_android_gms_internal_zzagi = (zzagi) entry.getValue();
                if (com_google_android_gms_internal_zzagi.getValue() != null) {
                    arrayList.add(new zzaht((zzahi) entry.getKey(), (zzahu) com_google_android_gms_internal_zzagi.getValue()));
                }
            }
        }
        return arrayList;
    }

    public Map<zzahi, zzaes> zzQQ() {
        Map<zzahi, zzaes> hashMap = new HashMap();
        Iterator it = this.zzbLg.zzSp().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            hashMap.put((zzahi) entry.getKey(), new zzaes((zzagi) entry.getValue()));
        }
        return hashMap;
    }

    public zzaes zza(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        return zze(new zzafa(com_google_android_gms_internal_zzahi), com_google_android_gms_internal_zzahu);
    }

    public Map<String, Object> zzaQ(final boolean z) {
        final Map<String, Object> hashMap = new HashMap();
        this.zzbLg.zza(new zza<zzahu, Void>(this) {
            final /* synthetic */ zzaes c;

            public Void a(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, Void voidR) {
                hashMap.put(com_google_android_gms_internal_zzafa.zzRr(), com_google_android_gms_internal_zzahu.getValue(z));
                return null;
            }

            public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                return a(com_google_android_gms_internal_zzafa, (zzahu) obj, (Void) obj2);
            }
        });
        return hashMap;
    }

    public zzaes zzb(final zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes) {
        return (zzaes) com_google_android_gms_internal_zzaes.zzbLg.zzb((Object) this, new zza<zzahu, zzaes>(this) {
            final /* synthetic */ zzaes b;

            public zzaes a(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, zzaes com_google_android_gms_internal_zzaes) {
                return com_google_android_gms_internal_zzaes.zze(com_google_android_gms_internal_zzafa.zzh(com_google_android_gms_internal_zzafa), com_google_android_gms_internal_zzahu);
            }

            public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                return a(com_google_android_gms_internal_zzafa, (zzahu) obj, (zzaes) obj2);
            }
        });
    }

    public zzahu zzb(zzahu com_google_android_gms_internal_zzahu) {
        return zza(zzafa.zzRq(), this.zzbLg, com_google_android_gms_internal_zzahu);
    }

    public zzaes zzd(zzafa com_google_android_gms_internal_zzafa) {
        return com_google_android_gms_internal_zzafa.isEmpty() ? zzbLf : new zzaes(this.zzbLg.zza(com_google_android_gms_internal_zzafa, zzagi.zzSo()));
    }

    public zzaes zze(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return new zzaes(new zzagi(com_google_android_gms_internal_zzahu));
        }
        zzafa zzG = this.zzbLg.zzG(com_google_android_gms_internal_zzafa);
        if (zzG != null) {
            zzafa zza = zzafa.zza(zzG, com_google_android_gms_internal_zzafa);
            zzahu com_google_android_gms_internal_zzahu2 = (zzahu) this.zzbLg.zzK(zzG);
            zzahi zzRw = zza.zzRw();
            if (zzRw != null && zzRw.zzTl() && com_google_android_gms_internal_zzahu2.zzO(zza.zzRv()).isEmpty()) {
                return this;
            }
            return new zzaes(this.zzbLg.zzb(zzG, com_google_android_gms_internal_zzahu2.zzl(zza, com_google_android_gms_internal_zzahu)));
        }
        return new zzaes(this.zzbLg.zza(com_google_android_gms_internal_zzafa, new zzagi(com_google_android_gms_internal_zzahu)));
    }

    public boolean zze(zzafa com_google_android_gms_internal_zzafa) {
        return zzf(com_google_android_gms_internal_zzafa) != null;
    }

    public zzahu zzf(zzafa com_google_android_gms_internal_zzafa) {
        zzafa zzG = this.zzbLg.zzG(com_google_android_gms_internal_zzafa);
        return zzG != null ? ((zzahu) this.zzbLg.zzK(zzG)).zzO(zzafa.zza(zzG, com_google_android_gms_internal_zzafa)) : null;
    }

    public zzaes zzg(zzafa com_google_android_gms_internal_zzafa) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return this;
        }
        zzahu zzf = zzf(com_google_android_gms_internal_zzafa);
        return zzf != null ? new zzaes(new zzagi(zzf)) : new zzaes(this.zzbLg.zzI(com_google_android_gms_internal_zzafa));
    }
}
