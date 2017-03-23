package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class zzq extends zzk<UserMetadata> {
    public zzq(String str, int i) {
        super(str, zzdG(str), Collections.emptyList(), i);
    }

    private static String zzH(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(".").append(str2).toString();
    }

    private String zzdF(String str) {
        return zzH(getName(), str);
    }

    private static Collection<String> zzdG(String str) {
        return Arrays.asList(new String[]{zzH(str, "permissionId"), zzH(str, "displayName"), zzH(str, "picture"), zzH(str, "isAuthenticatedUser"), zzH(str, "emailAddress")});
    }

    protected boolean zzb(DataHolder dataHolder, int i, int i2) {
        return dataHolder.zzcY(zzdF("permissionId")) && !dataHolder.zzi(zzdF("permissionId"), i, i2);
    }

    protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        return zzj(dataHolder, i, i2);
    }

    protected UserMetadata zzj(DataHolder dataHolder, int i, int i2) {
        String zzd = dataHolder.zzd(zzdF("permissionId"), i, i2);
        if (zzd == null) {
            return null;
        }
        String zzd2 = dataHolder.zzd(zzdF("displayName"), i, i2);
        String zzd3 = dataHolder.zzd(zzdF("picture"), i, i2);
        Boolean valueOf = Boolean.valueOf(dataHolder.zze(zzdF("isAuthenticatedUser"), i, i2));
        return new UserMetadata(zzd, zzd2, zzd3, valueOf.booleanValue(), dataHolder.zzd(zzdF("emailAddress"), i, i2));
    }
}
