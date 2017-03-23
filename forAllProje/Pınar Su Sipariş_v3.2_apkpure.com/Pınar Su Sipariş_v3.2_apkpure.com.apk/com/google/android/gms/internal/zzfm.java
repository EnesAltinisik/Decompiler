package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@zzig
public class zzfm implements zzfl {
    private final zzfk zzEl;
    private final HashSet<SimpleEntry<String, zzeh>> zzEm = new HashSet();

    public zzfm(zzfk com_google_android_gms_internal_zzfk) {
        this.zzEl = com_google_android_gms_internal_zzfk;
    }

    public void zza(String str, zzeh com_google_android_gms_internal_zzeh) {
        this.zzEl.zza(str, com_google_android_gms_internal_zzeh);
        this.zzEm.add(new SimpleEntry(str, com_google_android_gms_internal_zzeh));
    }

    public void zza(String str, JSONObject jSONObject) {
        this.zzEl.zza(str, jSONObject);
    }

    public void zzb(String str, zzeh com_google_android_gms_internal_zzeh) {
        this.zzEl.zzb(str, com_google_android_gms_internal_zzeh);
        this.zzEm.remove(new SimpleEntry(str, com_google_android_gms_internal_zzeh));
    }

    public void zzb(String str, JSONObject jSONObject) {
        this.zzEl.zzb(str, jSONObject);
    }

    public void zzfz() {
        Iterator it = this.zzEm.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((zzeh) simpleEntry.getValue()).toString());
            zzjw.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.zzEl.zzb((String) simpleEntry.getKey(), (zzeh) simpleEntry.getValue());
        }
        this.zzEm.clear();
    }

    public void zzh(String str, String str2) {
        this.zzEl.zzh(str, str2);
    }
}
