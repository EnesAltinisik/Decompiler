package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzafo {
    private final List<String> zzbNV = new ArrayList();
    private int zzbNW = 0;

    private zzafo(zzafa com_google_android_gms_internal_zzafa) throws DatabaseException {
        int i = 0;
        Iterator it = com_google_android_gms_internal_zzafa.iterator();
        while (it.hasNext()) {
            this.zzbNV.add(((zzahi) it.next()).asString());
        }
        this.zzbNW = Math.max(1, this.zzbNV.size());
        while (i < this.zzbNV.size()) {
            this.zzbNW = zzc((CharSequence) this.zzbNV.get(i)) + this.zzbNW;
            i++;
        }
        zzNC();
    }

    private void zzNC() throws DatabaseException {
        if (this.zzbNW > 768) {
            String valueOf = String.valueOf("Data has a key path longer than 768 bytes (");
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append(this.zzbNW).append(").").toString());
        } else if (this.zzbNV.size() > 32) {
            String valueOf2 = String.valueOf("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            String valueOf3 = String.valueOf(zzRS());
            throw new DatabaseException(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
        }
    }

    private String zzRR() {
        String str = (String) this.zzbNV.remove(this.zzbNV.size() - 1);
        this.zzbNW -= zzc(str);
        if (this.zzbNV.size() > 0) {
            this.zzbNW--;
        }
        return str;
    }

    private String zzRS() {
        if (this.zzbNV.size() == 0) {
            return "";
        }
        String valueOf = String.valueOf(zzd("/", this.zzbNV));
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("in path '").append(valueOf).append("'").toString();
    }

    public static void zza(zzafa com_google_android_gms_internal_zzafa, Object obj) throws DatabaseException {
        new zzafo(com_google_android_gms_internal_zzafa).zzao(obj);
    }

    private void zzao(Object obj) throws DatabaseException {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    zzif(str);
                    zzao(map.get(str));
                    zzRR();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                zzif(Integer.toString(i));
                zzao(list.get(i));
                zzRR();
            }
        }
    }

    private static int zzc(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt <= '') {
                i2++;
            } else if (charAt <= '߿') {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    private static String zzd(String str, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                stringBuilder.append(str);
            }
            stringBuilder.append((String) list.get(i));
        }
        return stringBuilder.toString();
    }

    private void zzif(String str) throws DatabaseException {
        if (this.zzbNV.size() > 0) {
            this.zzbNW++;
        }
        this.zzbNV.add(str);
        this.zzbNW += zzc(str);
        zzNC();
    }
}
