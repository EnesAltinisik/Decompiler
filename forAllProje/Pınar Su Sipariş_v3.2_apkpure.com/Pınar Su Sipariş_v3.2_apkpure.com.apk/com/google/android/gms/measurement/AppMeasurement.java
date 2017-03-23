package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzf;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import com.google.android.gms.measurement.internal.zzx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    private final zzx zzbbl;

    public static final class zza {
        public static final Map<String, String> zzbbm = zzf.zzb(new String[]{"app_clear_data", "app_exception", "app_uninstall", "app_update", "firebase_campaign", "error", "first_open", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement"}, new String[]{"_cd", "_ae", "_ui", "_au", "_cmp", "_err", "_f", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e"});
    }

    public interface zzb {
        void zzb(String str, String str2, Bundle bundle, long j);
    }

    public interface zzc {
        void zzc(String str, String str2, Bundle bundle, long j);
    }

    public static final class zzd {
        public static final Map<String, String> zzbbn = zzf.zzb(new String[]{"firebase_conversion", "engagement_time_msec", "firebase_error", "error_value", "firebase_event_origin", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic"}, new String[]{"_c", "_et", "_err", "_ev", "_o", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt"});
    }

    public static final class zze {
        public static final Map<String, String> zzbbo = zzf.zzb(new String[]{"firebase_last_notification", "first_open_time", "last_deep_link_referrer", "user_id"}, new String[]{"_ln", "_fot", "_ldl", "_id"});
    }

    public AppMeasurement(zzx com_google_android_gms_measurement_internal_zzx) {
        zzaa.zzz(com_google_android_gms_measurement_internal_zzx);
        this.zzbbl = com_google_android_gms_measurement_internal_zzx;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return zzx.zzbd(context).zzGa();
    }

    private void zzb(String str, String str2, Object obj) {
        this.zzbbl.zzFd().zzc(str, str2, obj);
    }

    @Deprecated
    public void logEvent(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (this.zzbbl.zzFo().zzmW() || !"_iap".equals(str)) {
            int zzfH = this.zzbbl.zzFi().zzfH(str);
            if (zzfH != 0) {
                this.zzbbl.zzFi().zze(zzfH, "_ev", this.zzbbl.zzFi().zza(str, this.zzbbl.zzFo().zzEw(), true));
                return;
            }
        }
        this.zzbbl.zzFd().zza("app", str, bundle, true);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        this.zzbbl.zzFd().setMeasurementEnabled(z);
    }

    @Deprecated
    public void setMinimumSessionDuration(long j) {
        this.zzbbl.zzFd().setMinimumSessionDuration(j);
    }

    @Deprecated
    public void setSessionTimeoutDuration(long j) {
        this.zzbbl.zzFd().setSessionTimeoutDuration(j);
    }

    @Deprecated
    public void setUserId(String str) {
        zza("app", "_id", str);
    }

    @Deprecated
    public void setUserProperty(String str, String str2) {
        int zzfJ = this.zzbbl.zzFi().zzfJ(str);
        if (zzfJ != 0) {
            this.zzbbl.zzFi().zze(zzfJ, "_ev", this.zzbbl.zzFi().zza(str, this.zzbbl.zzFo().zzEx(), true));
            return;
        }
        zza("app", str, str2);
    }

    public void zza(zzb com_google_android_gms_measurement_AppMeasurement_zzb) {
        this.zzbbl.zzFd().zza(com_google_android_gms_measurement_AppMeasurement_zzb);
    }

    public void zza(zzc com_google_android_gms_measurement_AppMeasurement_zzc) {
        this.zzbbl.zzFd().zza(com_google_android_gms_measurement_AppMeasurement_zzc);
    }

    public void zza(String str, String str2, Bundle bundle, long j) {
        this.zzbbl.zzFd().zzd(str, str2, bundle == null ? new Bundle() : bundle, j);
    }

    public void zza(String str, String str2, Object obj) {
        zzb(str, str2, obj);
    }

    public Map<String, Object> zzav(boolean z) {
        List<UserAttributeParcel> zzaz = this.zzbbl.zzFd().zzaz(z);
        Map<String, Object> hashMap = new HashMap(zzaz.size());
        for (UserAttributeParcel userAttributeParcel : zzaz) {
            hashMap.put(userAttributeParcel.name, userAttributeParcel.getValue());
        }
        return hashMap;
    }

    public void zzd(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzbbl.zzFd().zze(str, str2, bundle);
    }
}
