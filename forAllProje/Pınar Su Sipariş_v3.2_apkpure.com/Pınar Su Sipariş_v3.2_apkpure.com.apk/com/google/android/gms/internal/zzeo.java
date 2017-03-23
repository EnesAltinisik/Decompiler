package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.drive.DriveFile;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzig
public final class zzeo implements zzeh {
    private final zze zzCn;
    private final zzgr zzCo;
    private final zzej zzCq;

    public static class zza {
        private final zzla zzBb;

        public zza(zzla com_google_android_gms_internal_zzla) {
            this.zzBb = com_google_android_gms_internal_zzla;
        }

        public Intent zza(Context context, Map<String, String> map) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            String str = (String) map.get("u");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (this.zzBb != null) {
                str = zzu.zzck().zza(this.zzBb, str);
            }
            Uri parse = Uri.parse(str);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            Uri build = "http".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme(Constants.SCHEME).build() : Constants.SCHEME.equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("http").build() : null;
            ArrayList arrayList = new ArrayList();
            Intent zze = zze(parse);
            Intent zze2 = zze(build);
            ResolveInfo zza = zza(context, zze, arrayList);
            if (zza != null) {
                return zza(zze, zza);
            }
            if (zze2 != null) {
                ResolveInfo zza2 = zza(context, zze2);
                if (zza2 != null) {
                    Intent zza3 = zza(zze, zza2);
                    if (zza(context, zza3) != null) {
                        return zza3;
                    }
                }
            }
            if (arrayList.size() == 0) {
                return zze;
            }
            if (parseBoolean2 && activityManager != null) {
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ResolveInfo resolveInfo = (ResolveInfo) it.next();
                        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                                return zza(zze, resolveInfo);
                            }
                        }
                    }
                }
            }
            return parseBoolean ? zza(zze, (ResolveInfo) arrayList.get(0)) : zze;
        }

        public Intent zza(Intent intent, ResolveInfo resolveInfo) {
            Intent intent2 = new Intent(intent);
            intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            return intent2;
        }

        public ResolveInfo zza(Context context, Intent intent) {
            return zza(context, intent, new ArrayList());
        }

        public ResolveInfo zza(Context context, Intent intent, ArrayList<ResolveInfo> arrayList) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ResolveInfo resolveInfo;
            Collection queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (!(queryIntentActivities == null || resolveActivity == null)) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    resolveInfo = (ResolveInfo) queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                }
            }
            resolveInfo = null;
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        }

        public Intent zze(Uri uri) {
            if (uri == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(DriveFile.MODE_READ_ONLY);
            intent.setData(uri);
            intent.setAction("android.intent.action.VIEW");
            return intent;
        }
    }

    public zzeo(zzej com_google_android_gms_internal_zzej, zze com_google_android_gms_ads_internal_zze, zzgr com_google_android_gms_internal_zzgr) {
        this.zzCq = com_google_android_gms_internal_zzej;
        this.zzCn = com_google_android_gms_ads_internal_zze;
        this.zzCo = com_google_android_gms_internal_zzgr;
    }

    private static boolean zzc(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzd(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return zzu.zzcm().zzjf();
            }
            if ("l".equalsIgnoreCase(str)) {
                return zzu.zzcm().zzje();
            }
            if ("c".equalsIgnoreCase(str)) {
                return zzu.zzcm().zzjg();
            }
        }
        return -1;
    }

    private static void zze(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        Context context = com_google_android_gms_internal_zzla.getContext();
        if (TextUtils.isEmpty((String) map.get("u"))) {
            zzb.zzaW("Destination url cannot be empty.");
            return;
        }
        try {
            com_google_android_gms_internal_zzla.zzjD().zza(new AdLauncherIntentInfoParcel(new zza(com_google_android_gms_internal_zzla).zza(context, (Map) map)));
        } catch (ActivityNotFoundException e) {
            zzb.zzaW(e.getMessage());
        }
    }

    private void zzq(boolean z) {
        if (this.zzCo != null) {
            this.zzCo.zzr(z);
        }
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        String str = (String) map.get("a");
        if (str == null) {
            zzb.zzaW("Action missing from an open GMSG.");
        } else if (this.zzCn == null || this.zzCn.zzbG()) {
            zzlb zzjD = com_google_android_gms_internal_zzla.zzjD();
            if ("expand".equalsIgnoreCase(str)) {
                if (com_google_android_gms_internal_zzla.zzjH()) {
                    zzb.zzaW("Cannot expand WebView that is already expanded.");
                    return;
                }
                zzq(false);
                zzjD.zza(zzc(map), zzd(map));
            } else if ("webapp".equalsIgnoreCase(str)) {
                str = (String) map.get("u");
                zzq(false);
                if (str != null) {
                    zzjD.zza(zzc(map), zzd(map), str);
                } else {
                    zzjD.zza(zzc(map), zzd(map), (String) map.get("html"), (String) map.get("baseurl"));
                }
            } else if ("in_app_purchase".equalsIgnoreCase(str)) {
                str = (String) map.get(Param.PRODUCT_ID);
                String str2 = (String) map.get("report_urls");
                if (this.zzCq == null) {
                    return;
                }
                if (str2 == null || str2.isEmpty()) {
                    this.zzCq.zza(str, new ArrayList());
                } else {
                    this.zzCq.zza(str, new ArrayList(Arrays.asList(str2.split(" "))));
                }
            } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                zzq(true);
                zze(com_google_android_gms_internal_zzla, map);
            } else {
                zzq(true);
                str = (String) map.get("u");
                zzjD.zza(new AdLauncherIntentInfoParcel((String) map.get("i"), !TextUtils.isEmpty(str) ? zzu.zzck().zza(com_google_android_gms_internal_zzla, str) : str, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
            }
        } else {
            this.zzCn.zzt((String) map.get("u"));
        }
    }
}
