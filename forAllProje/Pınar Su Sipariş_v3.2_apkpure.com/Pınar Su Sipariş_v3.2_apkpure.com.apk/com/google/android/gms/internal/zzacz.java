package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.io.IOException;
import java.util.List;

public class zzacz extends zzakr<ProviderUserInfoList> {
    private zzajz zzbFd;

    public void zza(zzajz com_google_android_gms_internal_zzajz) {
        this.zzbFd = (zzajz) zzaa.zzz(com_google_android_gms_internal_zzajz);
    }

    public void zza(zzaly com_google_android_gms_internal_zzaly, ProviderUserInfoList providerUserInfoList) throws IOException {
        int i = 0;
        if (providerUserInfoList == null) {
            com_google_android_gms_internal_zzaly.zzWk();
            return;
        }
        zzakr zzk = this.zzbFd.zzk(ProviderUserInfo.class);
        com_google_android_gms_internal_zzaly.zzWg();
        List zzOD = providerUserInfoList.zzOD();
        int size = zzOD != null ? zzOD.size() : 0;
        while (i < size) {
            zzk.zza(com_google_android_gms_internal_zzaly, (ProviderUserInfo) zzOD.get(i));
            i++;
        }
        com_google_android_gms_internal_zzaly.zzWh();
    }

    public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        return zzc(com_google_android_gms_internal_zzalw);
    }

    public ProviderUserInfoList zzc(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }
        ProviderUserInfoList providerUserInfoList = new ProviderUserInfoList();
        zzakr zzk = this.zzbFd.zzk(ProviderUserInfo.class);
        com_google_android_gms_internal_zzalw.beginArray();
        while (com_google_android_gms_internal_zzalw.hasNext()) {
            providerUserInfoList.zzOD().add((ProviderUserInfo) zzk.zzb(com_google_android_gms_internal_zzalw));
        }
        com_google_android_gms_internal_zzalw.endArray();
        return providerUserInfoList;
    }
}
