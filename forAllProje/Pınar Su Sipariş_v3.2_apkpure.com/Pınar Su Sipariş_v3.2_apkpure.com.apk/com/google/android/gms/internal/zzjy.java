package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.concurrent.Future;

@zzig
public final class zzjy {

    public interface zzb {
        void zzg(Bundle bundle);
    }

    private static abstract class a extends zzjv {
        private a() {
        }

        public void onStop() {
        }
    }

    class AnonymousClass10 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ zzb b;

        AnonymousClass10(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
            this.a = context;
            this.b = com_google_android_gms_internal_zzjy_zzb;
            super();
        }

        public void zzbQ() {
            SharedPreferences zzn = zzjy.zzn(this.a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", zzn.getBoolean("content_url_opted_out", true));
            if (this.b != null) {
                this.b.zzg(bundle);
            }
        }
    }

    class AnonymousClass11 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        AnonymousClass11(Context context, String str) {
            this.a = context;
            this.b = str;
            super();
        }

        public void zzbQ() {
            Editor edit = zzjy.zzn(this.a).edit();
            edit.putString("content_url_hashes", this.b);
            edit.apply();
        }
    }

    class AnonymousClass1 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ boolean b;

        AnonymousClass1(Context context, boolean z) {
            this.a = context;
            this.b = z;
            super();
        }

        public void zzbQ() {
            Editor edit = zzjy.zzn(this.a).edit();
            edit.putBoolean("use_https", this.b);
            edit.apply();
        }
    }

    class AnonymousClass2 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ zzb b;

        AnonymousClass2(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
            this.a = context;
            this.b = com_google_android_gms_internal_zzjy_zzb;
            super();
        }

        public void zzbQ() {
            SharedPreferences zzn = zzjy.zzn(this.a);
            Bundle bundle = new Bundle();
            bundle.putString("content_url_hashes", zzn.getString("content_url_hashes", ""));
            if (this.b != null) {
                this.b.zzg(bundle);
            }
        }
    }

    class AnonymousClass3 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ boolean b;

        AnonymousClass3(Context context, boolean z) {
            this.a = context;
            this.b = z;
            super();
        }

        public void zzbQ() {
            Editor edit = zzjy.zzn(this.a).edit();
            edit.putBoolean("auto_collect_location", this.b);
            edit.apply();
        }
    }

    class AnonymousClass4 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ zzb b;

        AnonymousClass4(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
            this.a = context;
            this.b = com_google_android_gms_internal_zzjy_zzb;
            super();
        }

        public void zzbQ() {
            SharedPreferences zzn = zzjy.zzn(this.a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", zzn.getBoolean("auto_collect_location", false));
            if (this.b != null) {
                this.b.zzg(bundle);
            }
        }
    }

    class AnonymousClass5 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        AnonymousClass5(Context context, String str, long j) {
            this.a = context;
            this.b = str;
            this.c = j;
            super();
        }

        public void zzbQ() {
            Editor edit = zzjy.zzn(this.a).edit();
            edit.putString("app_settings_json", this.b);
            edit.putLong("app_settings_last_update_ms", this.c);
            edit.apply();
        }
    }

    class AnonymousClass6 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ zzb b;

        AnonymousClass6(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
            this.a = context;
            this.b = com_google_android_gms_internal_zzjy_zzb;
            super();
        }

        public void zzbQ() {
            SharedPreferences zzn = zzjy.zzn(this.a);
            Bundle bundle = new Bundle();
            bundle.putString("app_settings_json", zzn.getString("app_settings_json", ""));
            bundle.putLong("app_settings_last_update_ms", zzn.getLong("app_settings_last_update_ms", 0));
            if (this.b != null) {
                this.b.zzg(bundle);
            }
        }
    }

    class AnonymousClass7 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ zzb b;

        AnonymousClass7(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
            this.a = context;
            this.b = com_google_android_gms_internal_zzjy_zzb;
            super();
        }

        public void zzbQ() {
            SharedPreferences zzn = zzjy.zzn(this.a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("use_https", zzn.getBoolean("use_https", true));
            if (this.b != null) {
                this.b.zzg(bundle);
            }
        }
    }

    class AnonymousClass8 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ zzb b;

        AnonymousClass8(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
            this.a = context;
            this.b = com_google_android_gms_internal_zzjy_zzb;
            super();
        }

        public void zzbQ() {
            SharedPreferences zzn = zzjy.zzn(this.a);
            Bundle bundle = new Bundle();
            bundle.putInt("webview_cache_version", zzn.getInt("webview_cache_version", 0));
            if (this.b != null) {
                this.b.zzg(bundle);
            }
        }
    }

    class AnonymousClass9 extends a {
        final /* synthetic */ Context a;
        final /* synthetic */ boolean b;

        AnonymousClass9(Context context, boolean z) {
            this.a = context;
            this.b = z;
            super();
        }

        public void zzbQ() {
            Editor edit = zzjy.zzn(this.a).edit();
            edit.putBoolean("content_url_opted_out", this.b);
            edit.apply();
        }
    }

    public static Future zza(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
        return (Future) new AnonymousClass7(context, com_google_android_gms_internal_zzjy_zzb).zzhs();
    }

    public static Future zza(Context context, String str, long j) {
        return (Future) new AnonymousClass5(context, str, j).zzhs();
    }

    public static Future zzb(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
        return (Future) new AnonymousClass8(context, com_google_android_gms_internal_zzjy_zzb).zzhs();
    }

    public static Future zzc(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
        return (Future) new AnonymousClass10(context, com_google_android_gms_internal_zzjy_zzb).zzhs();
    }

    public static Future zzc(Context context, boolean z) {
        return (Future) new AnonymousClass1(context, z).zzhs();
    }

    public static Future zzd(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
        return (Future) new AnonymousClass2(context, com_google_android_gms_internal_zzjy_zzb).zzhs();
    }

    public static Future zze(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
        return (Future) new AnonymousClass4(context, com_google_android_gms_internal_zzjy_zzb).zzhs();
    }

    public static Future zze(Context context, boolean z) {
        return (Future) new AnonymousClass9(context, z).zzhs();
    }

    public static Future zzf(Context context, zzb com_google_android_gms_internal_zzjy_zzb) {
        return (Future) new AnonymousClass6(context, com_google_android_gms_internal_zzjy_zzb).zzhs();
    }

    public static Future zzf(Context context, String str) {
        return (Future) new AnonymousClass11(context, str).zzhs();
    }

    public static Future zzf(Context context, boolean z) {
        return (Future) new AnonymousClass3(context, z).zzhs();
    }

    public static SharedPreferences zzn(Context context) {
        return context.getSharedPreferences("admob", 0);
    }
}
