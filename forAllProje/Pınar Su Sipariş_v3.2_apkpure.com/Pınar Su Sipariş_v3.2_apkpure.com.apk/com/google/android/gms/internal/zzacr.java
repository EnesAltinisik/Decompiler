package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetAccountInfoUserList;
import java.io.IOException;
import java.util.List;

public class zzacr extends zzakr<GetAccountInfoUserList> {
    private zzajz zzbFd;

    public GetAccountInfoUserList zza(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }
        GetAccountInfoUserList getAccountInfoUserList = new GetAccountInfoUserList();
        zzakr zzk = this.zzbFd.zzk(GetAccountInfoUser.class);
        com_google_android_gms_internal_zzalw.beginArray();
        while (com_google_android_gms_internal_zzalw.hasNext()) {
            getAccountInfoUserList.zzOF().add((GetAccountInfoUser) zzk.zzb(com_google_android_gms_internal_zzalw));
        }
        com_google_android_gms_internal_zzalw.endArray();
        return getAccountInfoUserList;
    }

    public void zza(zzajz com_google_android_gms_internal_zzajz) {
        this.zzbFd = (zzajz) zzaa.zzz(com_google_android_gms_internal_zzajz);
    }

    public void zza(zzaly com_google_android_gms_internal_zzaly, GetAccountInfoUserList getAccountInfoUserList) throws IOException {
        int i = 0;
        if (getAccountInfoUserList == null) {
            com_google_android_gms_internal_zzaly.zzWk();
            return;
        }
        zzakr zzk = this.zzbFd.zzk(GetAccountInfoUser.class);
        com_google_android_gms_internal_zzaly.zzWg();
        List zzOF = getAccountInfoUserList.zzOF();
        int size = zzOF != null ? zzOF.size() : 0;
        while (i < size) {
            zzk.zza(com_google_android_gms_internal_zzaly, (GetAccountInfoUser) zzOF.get(i));
            i++;
        }
        com_google_android_gms_internal_zzaly.zzWh();
    }

    public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        return zza(com_google_android_gms_internal_zzalw);
    }
}
