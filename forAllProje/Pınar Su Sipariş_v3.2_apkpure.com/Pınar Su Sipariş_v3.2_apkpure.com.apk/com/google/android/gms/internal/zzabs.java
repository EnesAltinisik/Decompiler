package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;
import java.util.HashMap;
import java.util.Map;

public class zzabs {
    private final Context mContext;
    private String zzbot;
    Map<String, Object> zzbuP;
    private final Map<String, Object> zzbuQ;
    private final zzabu zzbwb;
    private final zze zzsd;

    public zzabs(Context context) {
        this(context, new HashMap(), new zzabu(context), zzh.zzuW());
    }

    zzabs(Context context, Map<String, Object> map, zzabu com_google_android_gms_internal_zzabu, zze com_google_android_gms_common_util_zze) {
        this.zzbot = null;
        this.zzbuP = new HashMap();
        this.mContext = context;
        this.zzsd = com_google_android_gms_common_util_zze;
        this.zzbwb = com_google_android_gms_internal_zzabu;
        this.zzbuQ = map;
    }

    public void zzhn(String str) {
        this.zzbot = str;
    }
}
