package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.api.model.StringList;
import java.io.IOException;
import java.util.List;

public class zzada extends zzakr<StringList> {
    private zzajz zzbFd;

    public void zza(zzajz com_google_android_gms_internal_zzajz) {
        this.zzbFd = (zzajz) zzaa.zzz(com_google_android_gms_internal_zzajz);
    }

    public void zza(zzaly com_google_android_gms_internal_zzaly, StringList stringList) throws IOException {
        int i = 0;
        if (stringList == null) {
            com_google_android_gms_internal_zzaly.zzWk();
            return;
        }
        zzakr zzk = this.zzbFd.zzk(String.class);
        com_google_android_gms_internal_zzaly.zzWg();
        List zzOM = stringList.zzOM();
        int size = zzOM != null ? zzOM.size() : 0;
        while (i < size) {
            zzk.zza(com_google_android_gms_internal_zzaly, (String) zzOM.get(i));
            i++;
        }
        com_google_android_gms_internal_zzaly.zzWh();
    }

    public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        return zzd(com_google_android_gms_internal_zzalw);
    }

    public StringList zzd(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }
        StringList stringList = new StringList();
        zzakr zzk = this.zzbFd.zzk(String.class);
        com_google_android_gms_internal_zzalw.beginArray();
        while (com_google_android_gms_internal_zzalw.hasNext()) {
            stringList.zzOM().add((String) zzk.zzb(com_google_android_gms_internal_zzalw));
        }
        com_google_android_gms_internal_zzalw.endArray();
        return stringList;
    }
}
