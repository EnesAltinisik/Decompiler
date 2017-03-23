package com.google.android.gms.internal;

import java.util.List;
import java.util.Map;

public interface zzaej {

    public interface zza {
        void onDisconnect();

        void zzQb();

        void zza(List<String> list, Object obj, boolean z, Long l);

        void zza(List<String> list, List<zzael> list2, Long l);

        void zzaO(boolean z);

        void zzat(Map<String, Object> map);
    }

    void initialize();

    void interrupt(String str);

    boolean isInterrupted(String str);

    void purgeOutstandingWrites();

    void refreshAuthToken();

    void resume(String str);

    void shutdown();

    void zza(List<String> list, zzaem com_google_android_gms_internal_zzaem);

    void zza(List<String> list, Object obj, zzaem com_google_android_gms_internal_zzaem);

    void zza(List<String> list, Object obj, String str, zzaem com_google_android_gms_internal_zzaem);

    void zza(List<String> list, Map<String, Object> map);

    void zza(List<String> list, Map<String, Object> map, zzaei com_google_android_gms_internal_zzaei, Long l, zzaem com_google_android_gms_internal_zzaem);

    void zza(List<String> list, Map<String, Object> map, zzaem com_google_android_gms_internal_zzaem);

    void zzb(List<String> list, Object obj, zzaem com_google_android_gms_internal_zzaem);

    void zzb(List<String> list, Map<String, Object> map, zzaem com_google_android_gms_internal_zzaem);
}
