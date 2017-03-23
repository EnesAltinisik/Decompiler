package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzabt;
import com.google.android.gms.internal.zzabt.zzc;
import com.google.android.gms.internal.zzabt.zzg;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzag;
import com.google.android.gms.tagmanager.zzt.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Container {
    private final Context mContext;
    private final String zzbnR;
    private final DataLayer zzbnS;
    private bk zzbnT;
    private Map<String, FunctionCallMacroCallback> zzbnU = new HashMap();
    private Map<String, FunctionCallTagCallback> zzbnV = new HashMap();
    private volatile long zzbnW;
    private volatile String zzbnX = "";

    public interface FunctionCallMacroCallback {
        Object getValue(String str, Map<String, Object> map);
    }

    public interface FunctionCallTagCallback {
        void execute(String str, Map<String, Object> map);
    }

    private class a implements zza {
        final /* synthetic */ Container a;

        private a(Container container) {
            this.a = container;
        }

        public Object zzd(String str, Map<String, Object> map) {
            FunctionCallMacroCallback zzgj = this.a.zzgj(str);
            return zzgj == null ? null : zzgj.getValue(str, map);
        }
    }

    private class b implements zza {
        final /* synthetic */ Container a;

        private b(Container container) {
            this.a = container;
        }

        public Object zzd(String str, Map<String, Object> map) {
            FunctionCallTagCallback zzgk = this.a.zzgk(str);
            if (zzgk != null) {
                zzgk.execute(str, map);
            }
            return zzdl.zzKS();
        }
    }

    Container(Context context, DataLayer dataLayer, String str, long j, zzc com_google_android_gms_internal_zzabt_zzc) {
        this.mContext = context;
        this.zzbnS = dataLayer;
        this.zzbnR = str;
        this.zzbnW = j;
        zza(com_google_android_gms_internal_zzabt_zzc);
    }

    Container(Context context, DataLayer dataLayer, String str, long j, zzj com_google_android_gms_internal_zzaf_zzj) {
        this.mContext = context;
        this.zzbnS = dataLayer;
        this.zzbnR = str;
        this.zzbnW = j;
        zza(com_google_android_gms_internal_zzaf_zzj.zzjG);
        if (com_google_android_gms_internal_zzaf_zzj.zzjF != null) {
            zza(com_google_android_gms_internal_zzaf_zzj.zzjF);
        }
    }

    private synchronized bk zzJl() {
        return this.zzbnT;
    }

    private void zza(zzc com_google_android_gms_internal_zzabt_zzc) {
        this.zzbnX = com_google_android_gms_internal_zzabt_zzc.getVersion();
        zzc com_google_android_gms_internal_zzabt_zzc2 = com_google_android_gms_internal_zzabt_zzc;
        zza(new bk(this.mContext, com_google_android_gms_internal_zzabt_zzc2, this.zzbnS, new a(), new b(), zzgm(this.zzbnX)));
        if (getBoolean("_gtm.loadEventEnabled")) {
            this.zzbnS.pushEvent("gtm.load", DataLayer.mapOf("gtm.id", this.zzbnR));
        }
    }

    private void zza(zzf com_google_android_gms_internal_zzaf_zzf) {
        if (com_google_android_gms_internal_zzaf_zzf == null) {
            throw new NullPointerException();
        }
        try {
            zza(zzabt.zzb(com_google_android_gms_internal_zzaf_zzf));
        } catch (zzg e) {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzaf_zzf);
            String valueOf2 = String.valueOf(e.toString());
            zzbn.e(new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("Not loading resource: ").append(valueOf).append(" because it is invalid: ").append(valueOf2).toString());
        }
    }

    private synchronized void zza(bk bkVar) {
        this.zzbnT = bkVar;
    }

    private void zza(zzi[] com_google_android_gms_internal_zzaf_zziArr) {
        List arrayList = new ArrayList();
        for (Object add : com_google_android_gms_internal_zzaf_zziArr) {
            arrayList.add(add);
        }
        zzJl().a(arrayList);
    }

    public boolean getBoolean(String str) {
        bk zzJl = zzJl();
        if (zzJl == null) {
            zzbn.e("getBoolean called for closed container.");
            return zzdl.zzKQ().booleanValue();
        }
        try {
            return zzdl.zzk((zzag.zza) zzJl.b(str).a()).booleanValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbn.e(new StringBuilder(String.valueOf(valueOf).length() + 66).append("Calling getBoolean() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return zzdl.zzKQ().booleanValue();
        }
    }

    public String getContainerId() {
        return this.zzbnR;
    }

    public double getDouble(String str) {
        bk zzJl = zzJl();
        if (zzJl == null) {
            zzbn.e("getDouble called for closed container.");
            return zzdl.zzKP().doubleValue();
        }
        try {
            return zzdl.zzj((zzag.zza) zzJl.b(str).a()).doubleValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbn.e(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Calling getDouble() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return zzdl.zzKP().doubleValue();
        }
    }

    public long getLastRefreshTime() {
        return this.zzbnW;
    }

    public long getLong(String str) {
        bk zzJl = zzJl();
        if (zzJl == null) {
            zzbn.e("getLong called for closed container.");
            return zzdl.zzKO().longValue();
        }
        try {
            return zzdl.zzi((zzag.zza) zzJl.b(str).a()).longValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbn.e(new StringBuilder(String.valueOf(valueOf).length() + 63).append("Calling getLong() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return zzdl.zzKO().longValue();
        }
    }

    public String getString(String str) {
        bk zzJl = zzJl();
        if (zzJl == null) {
            zzbn.e("getString called for closed container.");
            return zzdl.zzKS();
        }
        try {
            return zzdl.zzg((zzag.zza) zzJl.b(str).a());
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbn.e(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Calling getString() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return zzdl.zzKS();
        }
    }

    public boolean isDefault() {
        return getLastRefreshTime() == 0;
    }

    public void registerFunctionCallMacroCallback(String str, FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback == null) {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (this.zzbnU) {
            this.zzbnU.put(str, functionCallMacroCallback);
        }
    }

    public void registerFunctionCallTagCallback(String str, FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback == null) {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized (this.zzbnV) {
            this.zzbnV.put(str, functionCallTagCallback);
        }
    }

    void release() {
        this.zzbnT = null;
    }

    public void unregisterFunctionCallMacroCallback(String str) {
        synchronized (this.zzbnU) {
            this.zzbnU.remove(str);
        }
    }

    public void unregisterFunctionCallTagCallback(String str) {
        synchronized (this.zzbnV) {
            this.zzbnV.remove(str);
        }
    }

    public String zzJk() {
        return this.zzbnX;
    }

    FunctionCallMacroCallback zzgj(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.zzbnU) {
            functionCallMacroCallback = (FunctionCallMacroCallback) this.zzbnU.get(str);
        }
        return functionCallMacroCallback;
    }

    public FunctionCallTagCallback zzgk(String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.zzbnV) {
            functionCallTagCallback = (FunctionCallTagCallback) this.zzbnV.get(str);
        }
        return functionCallTagCallback;
    }

    public void zzgl(String str) {
        zzJl().a(str);
    }

    h zzgm(String str) {
        if (aw.a().b().equals(a.CONTAINER_DEBUG)) {
        }
        return new ak();
    }
}
