package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzu;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@zzig
public final class zzcu {
    public static final zzcq<String> zzwY = zzcq.zza(0, "gads:sdk_core_experiment_id");
    public static final zzcq<String> zzwZ = zzcq.zza(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final zzcq<Boolean> zzxA = zzcq.zza(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzxB = zzcq.zza(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
    public static final zzcq<String> zzxC = zzcq.zza(0, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final zzcq<String> zzxD = zzcq.zza(0, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final zzcq<String> zzxE = zzcq.zza(0, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final zzcq<Boolean> zzxF = zzcq.zza(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final zzcq<String> zzxG = zzcq.zza(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final zzcq<Boolean> zzxH = zzcq.zza(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzxI = zzcq.zza(0, "gads:enable_content_fetching", Boolean.valueOf(true));
    public static final zzcq<Integer> zzxJ = zzcq.zza(0, "gads:content_length_weight", 1);
    public static final zzcq<Integer> zzxK = zzcq.zza(0, "gads:content_age_weight", 1);
    public static final zzcq<Integer> zzxL = zzcq.zza(0, "gads:min_content_len", 11);
    public static final zzcq<Integer> zzxM = zzcq.zza(0, "gads:fingerprint_number", 10);
    public static final zzcq<Integer> zzxN = zzcq.zza(0, "gads:sleep_sec", 10);
    public static final zzcq<Boolean> zzxO = zzcq.zza(0, "gad:app_index_enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzxP = zzcq.zza(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
    public static final zzcq<Long> zzxQ = zzcq.zza(0, "gads:app_index:timeout_ms", 1000);
    public static final zzcq<String> zzxR = zzcq.zza(0, "gads:app_index:experiment_id");
    public static final zzcq<String> zzxS = zzcq.zza(0, "gads:kitkat_interstitial_workaround:experiment_id");
    public static final zzcq<Boolean> zzxT = zzcq.zza(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzxU = zzcq.zza(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzxV = zzcq.zza(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final zzcq<String> zzxW = zzcq.zza(0, "gads:interstitial_follow_url:experiment_id");
    public static final zzcq<Boolean> zzxX = zzcq.zza(0, "gads:analytics_enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzxY = zzcq.zza(0, "gads:ad_key_enabled", Boolean.valueOf(false));
    public static final zzcq<Integer> zzxZ = zzcq.zza(0, "gads:webview_cache_version", 0);
    public static final zzcq<Boolean> zzxa = zzcq.zza(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final zzcq<String> zzxb = zzcq.zza(0, "gads:request_builder:singleton_webview_experiment_id");
    public static final zzcq<Boolean> zzxc = zzcq.zza(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));
    public static final zzcq<String> zzxd = zzcq.zza(0, "gads:sdk_use_dynamic_module_experiment_id");
    public static final zzcq<Boolean> zzxe = zzcq.zza(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzxf = zzcq.zza(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final zzcq<String> zzxg = zzcq.zza(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    public static final zzcq<Boolean> zzxh = zzcq.zza(0, "gads:block_autoclicks", Boolean.valueOf(false));
    public static final zzcq<String> zzxi = zzcq.zza(0, "gads:block_autoclicks_experiment_id");
    public static final zzcq<String> zzxj = zzcq.zzb(0, "gads:prefetch:experiment_id");
    public static final zzcq<String> zzxk = zzcq.zza(0, "gads:spam_app_context:experiment_id");
    public static final zzcq<Boolean> zzxl = zzcq.zza(0, "gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final zzcq<String> zzxm = zzcq.zza(0, "gads:video_stream_cache:experiment_id");
    public static final zzcq<Integer> zzxn = zzcq.zza(0, "gads:video_stream_cache:limit_count", 5);
    public static final zzcq<Integer> zzxo = zzcq.zza(0, "gads:video_stream_cache:limit_space", 8388608);
    public static final zzcq<Integer> zzxp = zzcq.zza(0, "gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final zzcq<Long> zzxq = zzcq.zza(0, "gads:video_stream_cache:limit_time_sec", 300);
    public static final zzcq<Long> zzxr = zzcq.zza(0, "gads:video_stream_cache:notify_interval_millis", 1000);
    public static final zzcq<Integer> zzxs = zzcq.zza(0, "gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final zzcq<Boolean> zzxt = zzcq.zza(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final zzcq<String> zzxu = zzcq.zza(0, "gads:video:metric_frame_hash_times", "");
    public static final zzcq<Long> zzxv = zzcq.zza(0, "gads:video:metric_frame_hash_time_leniency", 500);
    public static final zzcq<String> zzxw = zzcq.zzb(0, "gads:spam_ad_id_decorator:experiment_id");
    public static final zzcq<Boolean> zzxx = zzcq.zza(0, "gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final zzcq<String> zzxy = zzcq.zzb(0, "gads:looper_for_gms_client:experiment_id");
    public static final zzcq<Boolean> zzxz = zzcq.zza(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzyA = zzcq.zza(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzyB = zzcq.zza(0, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyC = zzcq.zza(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));
    public static final zzcq<String> zzyD = zzcq.zza(0, "gads:gmsg:video_meta:experiment_id");
    public static final zzcq<Long> zzyE = zzcq.zza(0, "gads:network:cache_prediction_duration_s", 300);
    public static final zzcq<Boolean> zzyF = zzcq.zza(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzyG = zzcq.zza(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
    public static final zzcq<Long> zzyH = zzcq.zza(0, "gads:ad_loader:timeout_ms", 60000);
    public static final zzcq<Long> zzyI = zzcq.zza(0, "gads:rendering:timeout_ms", 60000);
    public static final zzcq<Boolean> zzyJ = zzcq.zza(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    public static final zzcq<Long> zzyK = zzcq.zza(1, "gads:gestures:task_timeout", 2000);
    public static final zzcq<String> zzyL = zzcq.zza(1, "gads:gestures:encrypt_size_limit:experiment_id");
    public static final zzcq<Boolean> zzyM = zzcq.zza(1, "gads:gestures:encrypt_size_limit:enabled", Boolean.valueOf(true));
    public static final zzcq<String> zzyN = zzcq.zza(1, "gads:gestures:cpu:experiment_id");
    public static final zzcq<Boolean> zzyO = zzcq.zza(1, "gads:gestures:cpu_query:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyP = zzcq.zza(1, "gads:gestures:cpu_click:enabled", Boolean.valueOf(false));
    public static final zzcq<String> zzyQ = zzcq.zza(1, "gads:gestures:jbk:experiment_id");
    public static final zzcq<Boolean> zzyR = zzcq.zza(1, "gads:gestures:jbk_query:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyS = zzcq.zza(1, "gads:gestures:jbk_click:enabled", Boolean.valueOf(false));
    public static final zzcq<String> zzyT = zzcq.zza(1, "gads:gestures:stk:experiment_id");
    public static final zzcq<Boolean> zzyU = zzcq.zza(1, "gads:gestures:stk:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyV = zzcq.zza(0, "gass:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyW = zzcq.zza(0, "gass:enable_int_signal", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzyX = zzcq.zza(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzyY = zzcq.zza(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzyZ = zzcq.zza(0, "gads:support_screen_shot", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzya = zzcq.zza(1, "gads:webview_recycle:enabled", Boolean.valueOf(false));
    public static final zzcq<String> zzyb = zzcq.zza(1, "gads:webview_recycle:experiment_id");
    public static final zzcq<String> zzyc = zzcq.zzb(0, "gads:pan:experiment_id");
    public static final zzcq<String> zzyd = zzcq.zza(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final zzcq<Boolean> zzye = zzcq.zza(0, "gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzyf = zzcq.zza(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyg = zzcq.zza(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));
    public static final zzcq<String> zzyh = zzcq.zza(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final zzcq<String> zzyi = zzcq.zza(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    public static final zzcq<Integer> zzyj = zzcq.zza(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final zzcq<Integer> zzyk = zzcq.zza(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final zzcq<Integer> zzyl = zzcq.zza(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final zzcq<String> zzym = zzcq.zza(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    public static final zzcq<String> zzyn = zzcq.zza(1, "gads:spherical_video:vertex_shader", "");
    public static final zzcq<String> zzyo = zzcq.zza(1, "gads:spherical_video:fragment_shader", "");
    public static final zzcq<String> zzyp = zzcq.zza(1, "gads:spherical_video:experiment_id");
    public static final zzcq<Boolean> zzyq = zzcq.zza(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyr = zzcq.zza(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));
    public static final zzcq<String> zzys = zzcq.zza(1, "gads:include_local_global_rectangles:experiment_id");
    public static final zzcq<Boolean> zzyt = zzcq.zza(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final zzcq<Long> zzyu = zzcq.zza(0, "gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final zzcq<Boolean> zzyv = zzcq.zza(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyw = zzcq.zza(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyx = zzcq.zza(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyy = zzcq.zza(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzyz = zzcq.zza(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
    public static final zzcq<Long> zzzA = zzcq.zza(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);
    public static final zzcq<Boolean> zzzB = zzcq.zza(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzzC = zzcq.zza(0, "gads:safe_browsing:reporting:malicious:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzzD = zzcq.zza(0, "gads:safe_browsing:reporting:full:enabled", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzzE = zzcq.zza(0, "gads:safe_browsing:screenshot:enabled", Boolean.valueOf(false));
    public static final zzcq<String> zzzF = zzcq.zza(0, "gads:safe_browsing:reporting:url", "https://sb-ssl.google.com/safebrowsing/clientreport/malware");
    public static final zzcq<String> zzzG = zzcq.zza(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
    public static final zzcq<Long> zzzH = zzcq.zza(0, "gads:safe_browsing:safety_net:delay_ms", 2000);
    public static final zzcq<String> zzzI = zzcq.zza(0, "gads:safe_browsing:experiment_id");
    public static final zzcq<Boolean> zzzJ = zzcq.zza(0, "gads:safe_browsing:debug", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzzK = zzcq.zza(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));
    public static final zzcq<Boolean> zzza = zzcq.zza(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));
    public static final zzcq<String> zzzb = zzcq.zza(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
    public static final zzcq<Long> zzzc = zzcq.zza(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
    public static final zzcq<Boolean> zzzd = zzcq.zza(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    public static final zzcq<Boolean> zzze = zzcq.zza(1, "gads:singleton_webview_native", Boolean.valueOf(false));
    public static final zzcq<String> zzzf = zzcq.zza(1, "gads:singleton_webview_native:experiment_id");
    public static final zzcq<Boolean> zzzg = zzcq.zza(0, "gads:method_tracing:enabled", Boolean.valueOf(false));
    public static final zzcq<Long> zzzh = zzcq.zza(0, "gads:method_tracing:duration_ms", 30000);
    public static final zzcq<Integer> zzzi = zzcq.zza(0, "gads:method_tracing:count", 5);
    public static final zzcq<Integer> zzzj = zzcq.zza(0, "gads:method_tracing:filesize", 134217728);
    public static final zzcq<Boolean> zzzk = zzcq.zza(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));
    public static final zzcq<String> zzzl = zzcq.zzb(1, "gads:auto_location_for_coarse_permission:experiment_id");
    public static final zzcq<Long> zzzm = zzcq.zza(1, "gads:auto_location_timeout", 2000);
    public static final zzcq<String> zzzn = zzcq.zzb(1, "gads:auto_location_timeout:experiment_id");
    public static final zzcq<Long> zzzo = zzcq.zza(1, "gads:auto_location_interval", -1);
    public static final zzcq<String> zzzp = zzcq.zzb(1, "gads:auto_location_interval:experiment_id");
    public static final zzcq<Boolean> zzzq = zzcq.zza(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));
    public static final zzcq<String> zzzr = zzcq.zza(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
    public static final zzcq<Long> zzzs = zzcq.zza(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final zzcq<String> zzzt = zzcq.zza(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms:experiment_id");
    public static final zzcq<String> zzzu = zzcq.zza(0, "gads:afs:csa:experiment_id");
    public static final zzcq<String> zzzv = zzcq.zza(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    public static final zzcq<String> zzzw = zzcq.zza(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    public static final zzcq<String> zzzx = zzcq.zza(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    public static final zzcq<String> zzzy = zzcq.zza(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    public static final zzcq<String> zzzz = zzcq.zza(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");

    class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public Void a() {
            zzu.zzct().initialize(this.a);
            return null;
        }

        public /* synthetic */ Object call() throws Exception {
            return a();
        }
    }

    public static void initialize(Context context) {
        zzkm.zzb(new AnonymousClass1(context));
    }

    public static List<String> zzer() {
        return zzu.zzcs().zzer();
    }

    public static List<String> zzes() {
        return zzu.zzcs().zzes();
    }
}
