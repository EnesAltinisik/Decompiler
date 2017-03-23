package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.v;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@vz
public final class pr {
    public static final pn<Long> A = pn.a(1, "gads:video:metric_frame_hash_time_leniency", 500);
    public static final pn<Boolean> B = pn.a(1, "gads:video:force_watermark", Boolean.valueOf(false));
    public static final pn<Long> C = pn.a(1, "gads:video:surface_update_min_spacing_ms", 1000);
    public static final pn<Boolean> D = pn.a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));
    public static final pn<Integer> E = pn.a(1, "gads:video:spinner:scale", 4);
    public static final pn<Long> F = pn.a(1, "gads:video:spinner:jank_threshold_ms", 50);
    public static final pn<Boolean> G = pn.a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));
    public static final pn<Boolean> H = pn.a(1, "gads:memory_bundle:runtime_info", Boolean.valueOf(true));
    public static final pn<String> I = pn.b(0, "gads:spam_ad_id_decorator:experiment_id");
    public static final pn<Boolean> J = pn.a(0, "gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> K = pn.a(0, "gads:ad_id_app_context:enabled", Boolean.valueOf(false));
    public static final pn<Float> L = pn.a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
    public static final pn<String> M = pn.a(0, "gads:ad_id_app_context:experiment_id");
    public static final pn<String> N = pn.b(0, "gads:looper_for_gms_client:experiment_id");
    public static final pn<Boolean> O = pn.a(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> P = pn.a(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> Q = pn.a(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
    public static final pn<String> R = pn.a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final pn<String> S = pn.a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final pn<String> T = pn.a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final pn<Boolean> U = pn.a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final pn<String> V = pn.a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final pn<Boolean> W = pn.a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final pn<Boolean> X = pn.a(1, "gads:use_adx_javascript_adapter", Boolean.valueOf(false));
    public static final pn<Boolean> Y = pn.a(0, "gads:enable_content_fetching", Boolean.valueOf(true));
    public static final pn<Integer> Z = pn.a(0, "gads:content_length_weight", 1);
    public static final pn<String> a = pn.a(0, "gads:sdk_core_experiment_id");
    public static final pn<String> aA = pn.b(0, "gads:pan:experiment_id");
    public static final pn<String> aB = pn.a(1, "gads:rewarded:experiment_id");
    public static final pn<Long> aC = pn.a(1, "gads:rewarded:adapter_timeout_ms", 20000);
    public static final pn<Boolean> aD = pn.a(1, "gads:app_activity_tracker:enabled", Boolean.valueOf(true));
    public static final pn<Long> aE = pn.a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);
    public static final pn<Long> aF = pn.a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final pn<Boolean> aG = pn.a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));
    public static final pn<String> aH = pn.a(1, "gads:ad_manager_enforce_arp_invariant:experiment_id");
    public static final pn<Boolean> aI = pn.a(1, "gads:ad_manager_enforce_arp_invariant:enabled", Boolean.valueOf(false));
    public static final pn<Long> aJ = pn.a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final pn<Boolean> aK = pn.a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> aL = pn.a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));
    public static final pn<String> aM = pn.a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final pn<String> aN = pn.a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    public static final pn<Integer> aO = pn.a(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final pn<Integer> aP = pn.a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final pn<Integer> aQ = pn.a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final pn<String> aR = pn.a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    public static final pn<String> aS = pn.a(1, "gads:spherical_video:vertex_shader", "");
    public static final pn<String> aT = pn.a(1, "gads:spherical_video:fragment_shader", "");
    public static final pn<String> aU = pn.a(1, "gads:spherical_video:experiment_id");
    public static final pn<Boolean> aV = pn.a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final pn<Boolean> aW = pn.a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));
    public static final pn<String> aX = pn.a(1, "gads:include_local_global_rectangles:experiment_id");
    public static final pn<Long> aY = pn.a(1, "gads:position_watcher:throttle_ms", 200);
    public static final pn<Boolean> aZ = pn.a(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final pn<Integer> aa = pn.a(0, "gads:content_age_weight", 1);
    public static final pn<Integer> ab = pn.a(0, "gads:min_content_len", 11);
    public static final pn<Integer> ac = pn.a(0, "gads:fingerprint_number", 10);
    public static final pn<Integer> ad = pn.a(0, "gads:sleep_sec", 10);
    public static final pn<Boolean> ae = pn.a(1, "gads:enable_content_url_hash", Boolean.valueOf(true));
    public static final pn<Integer> af = pn.a(1, "gads:content_vertical_fingerprint_number", 100);
    public static final pn<Boolean> ag = pn.a(1, "gads:enable_content_vertical_hash", Boolean.valueOf(true));
    public static final pn<Integer> ah = pn.a(1, "gads:content_vertical_fingerprint_bits", 23);
    public static final pn<Integer> ai = pn.a(1, "gads:content_vertical_fingerprint_ngram", 3);
    public static final pn<String> aj = pn.a(1, "gads:content_fetch_view_tag_id", "googlebot");
    public static final pn<String> ak = pn.a(1, "gads:content_fetch_exclude_view_tag", "none");
    public static final pn<Boolean> al = pn.a(0, "gad:app_index_enabled", Boolean.valueOf(true));
    public static final pn<Boolean> am = pn.a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
    public static final pn<Long> an = pn.a(0, "gads:app_index:timeout_ms", 1000);
    public static final pn<String> ao = pn.a(0, "gads:app_index:experiment_id");
    public static final pn<String> ap = pn.a(0, "gads:kitkat_interstitial_workaround:experiment_id");
    public static final pn<Boolean> aq = pn.a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> ar = pn.a(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final pn<Boolean> as = pn.a(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final pn<String> at = pn.a(0, "gads:interstitial_follow_url:experiment_id");
    public static final pn<Boolean> au = pn.a(0, "gads:analytics_enabled", Boolean.valueOf(true));
    public static final pn<Boolean> av = pn.a(0, "gads:ad_key_enabled", Boolean.valueOf(false));
    public static final pn<Integer> aw = pn.a(0, "gads:webview_cache_version", 0);
    public static final pn<Boolean> ax = pn.a(1, "gads:webview_recycle:enabled", Boolean.valueOf(false));
    public static final pn<String> ay = pn.a(1, "gads:webview_recycle:experiment_id");
    public static final pn<Boolean> az = pn.a(1, "gads:webview:ignore_over_scroll", Boolean.valueOf(true));
    public static final pn<String> b = pn.a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final pn<Boolean> bA = pn.a(1, "gads:gestures:touchinfo:enabled", Boolean.valueOf(false));
    public static final pn<String> bB = pn.a(1, "gads:gestures:touchinfo:experiment_id");
    public static final pn<Boolean> bC = pn.a(1, "gads:gestures:clock_query:enabled", Boolean.valueOf(false));
    public static final pn<String> bD = pn.a(1, "gads:gestures:clock_query:experiment_id");
    public static final pn<Boolean> bE = pn.a(1, "gads:gestures:clock_click:enabled", Boolean.valueOf(false));
    public static final pn<String> bF = pn.a(1, "gads:gestures:clock_click:experiment_id");
    public static pn<Boolean> bG = pn.a(1, "gads:gestures:btl_click:enabled", Boolean.valueOf(false));
    public static pn<String> bH = pn.a(1, "gads:gestures:btl_click:experiment_id");
    public static final pn<String> bI = pn.a(1, "gads:gestures:click_stk:experiment_id");
    public static final pn<Boolean> bJ = pn.a(1, "gads:gestures:click_stk:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> bK = pn.a(1, "gads:gestures:visibility:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> bL = pn.a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> bM = pn.a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> bN = pn.a(0, "gass:client:enabled", Boolean.valueOf(true));
    public static final pn<String> bO = pn.a(0, "gass:client:experiment_id");
    public static final pn<Boolean> bP = pn.a(0, "gass:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> bQ = pn.a(0, "gass:enable_int_signal", Boolean.valueOf(true));
    public static final pn<Boolean> bR = pn.a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> bS = pn.a(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> bT = pn.a(0, "gads:support_screen_shot", Boolean.valueOf(true));
    public static final pn<Boolean> bU = pn.a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));
    public static final pn<String> bV = pn.a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
    public static final pn<String> bW = pn.a(1, "gads:sdk_core_constants:experiment_id");
    public static final pn<String> bX = pn.a(1, "gads:sdk_core_constants:caps", "");
    public static final pn<Long> bY = pn.a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
    public static final pn<Boolean> bZ = pn.a(0, "gads:js_flags:mf", Boolean.valueOf(false));
    public static final pn<Long> ba = pn.a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final pn<Boolean> bb = pn.a(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> bc = pn.a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final pn<Boolean> bd = pn.a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> be = pn.a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> bf = pn.a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> bg = pn.a(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> bh = pn.a(1, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> bi = pn.a(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));
    public static final pn<String> bj = pn.a(0, "gads:gmsg:video_meta:experiment_id");
    public static final pn<Long> bk = pn.a(0, "gads:network:cache_prediction_duration_s", 300);
    public static final pn<Boolean> bl = pn.a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
    public static final pn<Boolean> bm = pn.a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
    public static final pn<Long> bn = pn.a(0, "gads:ad_loader:timeout_ms", 60000);
    public static final pn<Long> bo = pn.a(0, "gads:rendering:timeout_ms", 60000);
    public static final pn<Boolean> bp = pn.a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    public static final pn<Long> bq = pn.a(1, "gads:gestures:task_timeout", 2000);
    public static final pn<String> br = pn.a(1, "gads:gestures:encrypt_size_limit:experiment_id");
    public static final pn<Boolean> bs = pn.a(1, "gads:gestures:encrypt_size_limit:enabled", Boolean.valueOf(false));
    public static final pn<String> bt = pn.a(1, "gads:gestures:appid:experiment_id");
    public static final pn<Boolean> bu = pn.a(1, "gads:gestures:appid:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> bv = pn.a(0, "gads:gestures:v6:enabled", Boolean.valueOf(false));
    public static final pn<String> bw = pn.a(1, "gads:gestures:usb_query:experiment_id");
    public static final pn<Boolean> bx = pn.a(1, "gads:gestures:usb_query:enabled", Boolean.valueOf(false));
    public static final pn<String> by = pn.a(1, "gads:gestures:usb_click:experiment_id");
    public static final pn<Boolean> bz = pn.a(1, "gads:gestures:usb_click:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> c = pn.a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final pn<String> cA = pn.a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
    public static final pn<Long> cB = pn.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final pn<String> cC = pn.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms:experiment_id");
    public static final pn<String> cD = pn.a(0, "gads:afs:csa:experiment_id");
    public static final pn<String> cE = pn.a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    public static final pn<String> cF = pn.a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    public static final pn<String> cG = pn.a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    public static final pn<String> cH = pn.a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    public static final pn<String> cI = pn.a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
    public static final pn<Long> cJ = pn.a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);
    public static final pn<Boolean> cK = pn.a(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));
    public static final pn<Boolean> cL = pn.a(1, "gads:parental_controls:send_from_client", Boolean.valueOf(true));
    public static final pn<Boolean> cM = pn.a(1, "gads:parental_controls:cache_results", Boolean.valueOf(true));
    public static final pn<Long> cN = pn.a(1, "gads:parental_controls:timeout", 2000);
    public static final pn<String> cO = pn.a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
    public static final pn<Long> cP = pn.a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);
    public static final pn<Boolean> cQ = pn.a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));
    public static final pn<Boolean> cR = pn.a(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));
    public static final pn<Integer> cS = pn.a(1, "gads:cache:max_concurrent_downloads", 10);
    public static final pn<Long> cT = pn.a(1, "gads:cache:javascript_timeout_millis", 5000);
    public static final pn<Boolean> cU = pn.a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));
    public static final pn<Boolean> cV = pn.a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));
    public static final pn<Boolean> cW = pn.a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));
    public static final pn<Long> cX = pn.a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final pn<Boolean> cY = pn.a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));
    public static final pn<Boolean> cZ = pn.a(1, "gads:chrome_custom_tabs:enabled", Boolean.valueOf(true));
    public static final pn<Boolean> ca = pn.a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    public static final pn<String> cb = pn.a(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final pn<String> cc = pn.a(1, "gads:native:video_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_video_ads.html");
    public static final pn<Boolean> cd = pn.a(1, "gads:singleton_webview_native", Boolean.valueOf(false));
    public static final pn<String> ce = pn.a(1, "gads:singleton_webview_native:experiment_id");
    public static final pn<Boolean> cf = pn.a(1, "gads:enable_untrack_view_native", Boolean.valueOf(true));
    public static final pn<Boolean> cg = pn.a(1, "gads:ignore_untrack_view_google_native", Boolean.valueOf(true));
    public static final pn<Boolean> ch = pn.a(1, "gads:reset_listeners_preparead_native", Boolean.valueOf(true));
    public static final pn<Integer> ci = pn.a(1, "gads:native_video_load_timeout", 10);
    public static final pn<String> cj = pn.a(1, "gads:native_video_load_timeout:experiment_id");
    public static final pn<String> ck = pn.a(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    public static final pn<Boolean> cl = pn.a(1, "gads:clamp_native_video_player_dimensions", Boolean.valueOf(true));
    public static final pn<Boolean> cm = pn.a(1, "gads:enable_tracking_for_native_ad_views", Boolean.valueOf(true));
    public static final pn<Boolean> cn = pn.a(1, "gads:use_new_json_for_native_view_tracking", Boolean.valueOf(true));
    public static final pn<Boolean> co = pn.a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));
    public static final pn<Boolean> cp = pn.a(0, "gads:method_tracing:enabled", Boolean.valueOf(false));
    public static final pn<Long> cq = pn.a(0, "gads:method_tracing:duration_ms", 30000);
    public static final pn<Integer> cr = pn.a(0, "gads:method_tracing:count", 5);
    public static final pn<Integer> cs = pn.a(0, "gads:method_tracing:filesize", 134217728);
    public static final pn<Boolean> ct = pn.a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));
    public static final pn<String> cu = pn.b(1, "gads:auto_location_for_coarse_permission:experiment_id");
    public static final pn<Long> cv = pn.a(1, "gads:auto_location_timeout", 2000);
    public static final pn<String> cw = pn.b(1, "gads:auto_location_timeout:experiment_id");
    public static final pn<Long> cx = pn.a(1, "gads:auto_location_interval", -1);
    public static final pn<String> cy = pn.b(1, "gads:auto_location_interval:experiment_id");
    public static final pn<Boolean> cz = pn.a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));
    public static final pn<String> d = pn.a(0, "gads:request_builder:singleton_webview_experiment_id");
    public static final pn<Boolean> da = pn.a(1, "gads:drx_in_app_preview:enabled", Boolean.valueOf(false));
    public static final pn<Boolean> db = pn.a(1, "gads:drx_debug_signals:enabled", Boolean.valueOf(false));
    public static final pn<String> dc = pn.a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final pn<String> dd = pn.a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final pn<String> de = pn.a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final pn<String> df = pn.a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final pn<Integer> dg = pn.a(1, "gads:drx_debug:timeout_ms", 5000);
    public static final pn<Integer> dh = pn.a(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final pn<Boolean> di = pn.a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));
    public static final pn<Boolean> dj = pn.a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));
    public static final pn<Boolean> e = pn.a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));
    public static final pn<String> f = pn.a(0, "gads:sdk_use_dynamic_module_experiment_id");
    public static final pn<Boolean> g = pn.a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final pn<Boolean> h = pn.a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final pn<String> i = pn.a(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    public static final pn<Boolean> j = pn.a(0, "gads:block_autoclicks", Boolean.valueOf(false));
    public static final pn<String> k = pn.a(0, "gads:block_autoclicks_experiment_id");
    public static final pn<String> l = pn.b(0, "gads:prefetch:experiment_id");
    public static final pn<String> m = pn.a(0, "gads:spam_app_context:experiment_id");
    public static final pn<Boolean> n = pn.a(1, "gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final pn<Integer> o = pn.a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
    public static final pn<String> p = pn.a(1, "gads:video_exo_player:version", "1");
    public static final pn<String> q = pn.a(0, "gads:video_stream_cache:experiment_id");
    public static final pn<Integer> r = pn.a(1, "gads:video_stream_cache:limit_count", 5);
    public static final pn<Integer> s = pn.a(1, "gads:video_stream_cache:limit_space", 8388608);
    public static final pn<Integer> t = pn.a(1, "gads:video_stream_exo_allocator:segment_size", 65536);
    public static final pn<Integer> u = pn.a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final pn<Long> v = pn.a(1, "gads:video_stream_cache:limit_time_sec", 300);
    public static final pn<Long> w = pn.a(1, "gads:video_stream_cache:notify_interval_millis", 1000);
    public static final pn<Integer> x = pn.a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final pn<Boolean> y = pn.a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final pn<String> z = pn.a(1, "gads:video:metric_frame_hash_times", "");

    class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public Void a() {
            v.q().a(this.a);
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    public static List<String> a() {
        return v.p().a();
    }

    public static void a(Context context) {
        zv.a(new AnonymousClass1(context));
    }

    public static List<String> b() {
        return v.p().b();
    }
}
