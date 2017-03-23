package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzdj;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzlb.zza;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public class zzn {

    class AnonymousClass1 implements zza {
        final /* synthetic */ zzd a;
        final /* synthetic */ String b;
        final /* synthetic */ zzla c;

        AnonymousClass1(zzd com_google_android_gms_ads_internal_formats_zzd, String str, zzla com_google_android_gms_internal_zzla) {
            this.a = com_google_android_gms_ads_internal_formats_zzd;
            this.b = str;
            this.c = com_google_android_gms_internal_zzla;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("headline", this.a.getHeadline());
                jSONObject.put("body", this.a.getBody());
                jSONObject.put("call_to_action", this.a.getCallToAction());
                jSONObject.put(Param.PRICE, this.a.getPrice());
                jSONObject.put("star_rating", String.valueOf(this.a.getStarRating()));
                jSONObject.put("store", this.a.getStore());
                jSONObject.put("icon", zzn.zza(this.a.zzeN()));
                JSONArray jSONArray = new JSONArray();
                List<Object> images = this.a.getImages();
                if (images != null) {
                    for (Object zze : images) {
                        jSONArray.put(zzn.zza(zzn.zzd(zze)));
                    }
                }
                jSONObject.put("images", jSONArray);
                jSONObject.put("extras", zzn.zza(this.a.getExtras(), this.b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("assets", jSONObject);
                jSONObject2.put("template_id", "2");
                this.c.zza("google.afma.nativeExpressAds.loadAssets", jSONObject2);
            } catch (Throwable e) {
                zzb.zzd("Exception occurred when loading assets", e);
            }
        }
    }

    class AnonymousClass2 implements zza {
        final /* synthetic */ zze a;
        final /* synthetic */ String b;
        final /* synthetic */ zzla c;

        AnonymousClass2(zze com_google_android_gms_ads_internal_formats_zze, String str, zzla com_google_android_gms_internal_zzla) {
            this.a = com_google_android_gms_ads_internal_formats_zze;
            this.b = str;
            this.c = com_google_android_gms_internal_zzla;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("headline", this.a.getHeadline());
                jSONObject.put("body", this.a.getBody());
                jSONObject.put("call_to_action", this.a.getCallToAction());
                jSONObject.put("advertiser", this.a.getAdvertiser());
                jSONObject.put("logo", zzn.zza(this.a.zzeR()));
                JSONArray jSONArray = new JSONArray();
                List<Object> images = this.a.getImages();
                if (images != null) {
                    for (Object zze : images) {
                        jSONArray.put(zzn.zza(zzn.zzd(zze)));
                    }
                }
                jSONObject.put("images", jSONArray);
                jSONObject.put("extras", zzn.zza(this.a.getExtras(), this.b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("assets", jSONObject);
                jSONObject2.put("template_id", "1");
                this.c.zza("google.afma.nativeExpressAds.loadAssets", jSONObject2);
            } catch (Throwable e) {
                zzb.zzd("Exception occurred when loading assets", e);
            }
        }
    }

    class AnonymousClass3 implements zzeh {
        final /* synthetic */ CountDownLatch a;

        AnonymousClass3(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            this.a.countDown();
            View view = com_google_android_gms_internal_zzla.getView();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    class AnonymousClass4 implements zzeh {
        final /* synthetic */ CountDownLatch a;

        AnonymousClass4(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            zzb.zzaW("Adapter returned an ad, but assets substitution failed");
            this.a.countDown();
            com_google_android_gms_internal_zzla.destroy();
        }
    }

    class AnonymousClass5 implements zzeh {
        final /* synthetic */ zzge a;
        final /* synthetic */ zzf.zza b;
        final /* synthetic */ zzgf c;

        AnonymousClass5(zzge com_google_android_gms_internal_zzge, zzf.zza com_google_android_gms_ads_internal_zzf_zza, zzgf com_google_android_gms_internal_zzgf) {
            this.a = com_google_android_gms_internal_zzge;
            this.b = com_google_android_gms_ads_internal_zzf_zza;
            this.c = com_google_android_gms_internal_zzgf;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            View view = com_google_android_gms_internal_zzla.getView();
            if (view != null) {
                try {
                    if (this.a != null) {
                        if (this.a.getOverrideClickHandling()) {
                            zzn.zza(com_google_android_gms_internal_zzla);
                            return;
                        }
                        this.a.zzk(com.google.android.gms.dynamic.zze.zzD(view));
                        this.b.onClick();
                    } else if (this.c == null) {
                    } else {
                        if (this.c.getOverrideClickHandling()) {
                            zzn.zza(com_google_android_gms_internal_zzla);
                            return;
                        }
                        this.c.zzk(com.google.android.gms.dynamic.zze.zzD(view));
                        this.b.onClick();
                    }
                } catch (Throwable e) {
                    zzb.zzd("Unable to call handleClick on mapper", e);
                }
            }
        }
    }

    private static zzd zza(zzge com_google_android_gms_internal_zzge) throws RemoteException {
        return new zzd(com_google_android_gms_internal_zzge.getHeadline(), com_google_android_gms_internal_zzge.getImages(), com_google_android_gms_internal_zzge.getBody(), com_google_android_gms_internal_zzge.zzeN(), com_google_android_gms_internal_zzge.getCallToAction(), com_google_android_gms_internal_zzge.getStarRating(), com_google_android_gms_internal_zzge.getStore(), com_google_android_gms_internal_zzge.getPrice(), null, com_google_android_gms_internal_zzge.getExtras());
    }

    private static zze zza(zzgf com_google_android_gms_internal_zzgf) throws RemoteException {
        return new zze(com_google_android_gms_internal_zzgf.getHeadline(), com_google_android_gms_internal_zzgf.getImages(), com_google_android_gms_internal_zzgf.getBody(), com_google_android_gms_internal_zzgf.zzeR(), com_google_android_gms_internal_zzgf.getCallToAction(), com_google_android_gms_internal_zzgf.getAdvertiser(), null, com_google_android_gms_internal_zzgf.getExtras());
    }

    static zzeh zza(zzge com_google_android_gms_internal_zzge, zzgf com_google_android_gms_internal_zzgf, zzf.zza com_google_android_gms_ads_internal_zzf_zza) {
        return new AnonymousClass5(com_google_android_gms_internal_zzge, com_google_android_gms_ads_internal_zzf_zza, com_google_android_gms_internal_zzgf);
    }

    static zzeh zza(CountDownLatch countDownLatch) {
        return new AnonymousClass3(countDownLatch);
    }

    private static String zza(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            zzb.zzaW("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        encodeToString = String.valueOf(encodeToString);
        return encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
    }

    static String zza(zzdj com_google_android_gms_internal_zzdj) {
        if (com_google_android_gms_internal_zzdj == null) {
            zzb.zzaW("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri uri = com_google_android_gms_internal_zzdj.getUri();
            if (uri != null) {
                return uri.toString();
            }
        } catch (RemoteException e) {
            zzb.zzaW("Unable to get image uri. Trying data uri next");
        }
        return zzb(com_google_android_gms_internal_zzdj);
    }

    private static JSONObject zza(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                if ("image".equals(jSONObject2.getString(str2))) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(str2, zza((Bitmap) obj));
                    } else {
                        zzb.zzaW("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    zzb.zzaW("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
        }
        return jSONObject;
    }

    public static void zza(zzjn com_google_android_gms_internal_zzjn, zzf.zza com_google_android_gms_ads_internal_zzf_zza) {
        zzgf com_google_android_gms_internal_zzgf = null;
        if (com_google_android_gms_internal_zzjn != null && zzg(com_google_android_gms_internal_zzjn)) {
            zzla com_google_android_gms_internal_zzla = com_google_android_gms_internal_zzjn.zzHF;
            Object view = com_google_android_gms_internal_zzla != null ? com_google_android_gms_internal_zzla.getView() : null;
            if (view == null) {
                zzb.zzaW("AdWebView is null");
                return;
            }
            try {
                List list = com_google_android_gms_internal_zzjn.zzFg != null ? com_google_android_gms_internal_zzjn.zzFg.zzEB : null;
                if (list == null || list.isEmpty()) {
                    zzb.zzaW("No template ids present in mediation response");
                    return;
                }
                zzge zzfI = com_google_android_gms_internal_zzjn.zzFh != null ? com_google_android_gms_internal_zzjn.zzFh.zzfI() : null;
                if (com_google_android_gms_internal_zzjn.zzFh != null) {
                    com_google_android_gms_internal_zzgf = com_google_android_gms_internal_zzjn.zzFh.zzfJ();
                }
                if (list.contains("2") && zzfI != null) {
                    zzfI.zzl(com.google.android.gms.dynamic.zze.zzD(view));
                    if (!zzfI.getOverrideImpressionRecording()) {
                        zzfI.recordImpression();
                    }
                    com_google_android_gms_internal_zzla.zzjD().zza("/nativeExpressViewClicked", zza(zzfI, null, com_google_android_gms_ads_internal_zzf_zza));
                } else if (!list.contains("1") || com_google_android_gms_internal_zzgf == null) {
                    zzb.zzaW("No matching template id and mapper");
                } else {
                    com_google_android_gms_internal_zzgf.zzl(com.google.android.gms.dynamic.zze.zzD(view));
                    if (!com_google_android_gms_internal_zzgf.getOverrideImpressionRecording()) {
                        com_google_android_gms_internal_zzgf.recordImpression();
                    }
                    com_google_android_gms_internal_zzla.zzjD().zza("/nativeExpressViewClicked", zza(null, com_google_android_gms_internal_zzgf, com_google_android_gms_ads_internal_zzf_zza));
                }
            } catch (Throwable e) {
                zzb.zzd("Error occurred while recording impression and registering for clicks", e);
            }
        }
    }

    private static void zza(zzla com_google_android_gms_internal_zzla) {
        OnClickListener zzjQ = com_google_android_gms_internal_zzla.zzjQ();
        if (zzjQ != null) {
            zzjQ.onClick(com_google_android_gms_internal_zzla.getView());
        }
    }

    private static void zza(zzla com_google_android_gms_internal_zzla, zzd com_google_android_gms_ads_internal_formats_zzd, String str) {
        com_google_android_gms_internal_zzla.zzjD().zza(new AnonymousClass1(com_google_android_gms_ads_internal_formats_zzd, str, com_google_android_gms_internal_zzla));
    }

    private static void zza(zzla com_google_android_gms_internal_zzla, zze com_google_android_gms_ads_internal_formats_zze, String str) {
        com_google_android_gms_internal_zzla.zzjD().zza(new AnonymousClass2(com_google_android_gms_ads_internal_formats_zze, str, com_google_android_gms_internal_zzla));
    }

    private static void zza(zzla com_google_android_gms_internal_zzla, CountDownLatch countDownLatch) {
        com_google_android_gms_internal_zzla.zzjD().zza("/nativeExpressAssetsLoaded", zza(countDownLatch));
        com_google_android_gms_internal_zzla.zzjD().zza("/nativeExpressAssetsLoadingFailed", zzb(countDownLatch));
    }

    public static boolean zza(zzla com_google_android_gms_internal_zzla, zzfv com_google_android_gms_internal_zzfv, CountDownLatch countDownLatch) {
        boolean z = false;
        try {
            z = zzb(com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzfv, countDownLatch);
        } catch (Throwable e) {
            zzb.zzd("Unable to invoke load assets", e);
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    static zzeh zzb(CountDownLatch countDownLatch) {
        return new AnonymousClass4(countDownLatch);
    }

    private static String zzb(zzdj com_google_android_gms_internal_zzdj) {
        try {
            com.google.android.gms.dynamic.zzd zzeM = com_google_android_gms_internal_zzdj.zzeM();
            if (zzeM == null) {
                zzb.zzaW("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) com.google.android.gms.dynamic.zze.zzx(zzeM);
            if (drawable instanceof BitmapDrawable) {
                return zza(((BitmapDrawable) drawable).getBitmap());
            }
            zzb.zzaW("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException e) {
            zzb.zzaW("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    private static boolean zzb(zzla com_google_android_gms_internal_zzla, zzfv com_google_android_gms_internal_zzfv, CountDownLatch countDownLatch) throws RemoteException {
        View view = com_google_android_gms_internal_zzla.getView();
        if (view == null) {
            zzb.zzaW("AdWebView is null");
            return false;
        }
        view.setVisibility(4);
        List list = com_google_android_gms_internal_zzfv.zzFg.zzEB;
        if (list == null || list.isEmpty()) {
            zzb.zzaW("No template ids present in mediation response");
            return false;
        }
        zza(com_google_android_gms_internal_zzla, countDownLatch);
        zzge zzfI = com_google_android_gms_internal_zzfv.zzFh.zzfI();
        zzgf zzfJ = com_google_android_gms_internal_zzfv.zzFh.zzfJ();
        if (list.contains("2") && zzfI != null) {
            zza(com_google_android_gms_internal_zzla, zza(zzfI), com_google_android_gms_internal_zzfv.zzFg.zzEA);
        } else if (!list.contains("1") || zzfJ == null) {
            zzb.zzaW("No matching template id and mapper");
            return false;
        } else {
            zza(com_google_android_gms_internal_zzla, zza(zzfJ), com_google_android_gms_internal_zzfv.zzFg.zzEA);
        }
        String str = com_google_android_gms_internal_zzfv.zzFg.zzEy;
        String str2 = com_google_android_gms_internal_zzfv.zzFg.zzEz;
        if (str2 != null) {
            com_google_android_gms_internal_zzla.loadDataWithBaseURL(str2, str, "text/html", Constants.ENCODING, null);
        } else {
            com_google_android_gms_internal_zzla.loadData(str, "text/html", Constants.ENCODING);
        }
        return true;
    }

    private static zzdj zzd(Object obj) {
        return obj instanceof IBinder ? zzdj.zza.zzy((IBinder) obj) : null;
    }

    public static View zzf(zzjn com_google_android_gms_internal_zzjn) {
        if (com_google_android_gms_internal_zzjn == null) {
            zzb.e("AdState is null");
            return null;
        } else if (zzg(com_google_android_gms_internal_zzjn) && com_google_android_gms_internal_zzjn.zzHF != null) {
            return com_google_android_gms_internal_zzjn.zzHF.getView();
        } else {
            try {
                com.google.android.gms.dynamic.zzd view = com_google_android_gms_internal_zzjn.zzFh != null ? com_google_android_gms_internal_zzjn.zzFh.getView() : null;
                if (view != null) {
                    return (View) com.google.android.gms.dynamic.zze.zzx(view);
                }
                zzb.zzaW("View in mediation adapter is null.");
                return null;
            } catch (Throwable e) {
                zzb.zzd("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    public static boolean zzg(zzjn com_google_android_gms_internal_zzjn) {
        return (com_google_android_gms_internal_zzjn == null || !com_google_android_gms_internal_zzjn.zzLP || com_google_android_gms_internal_zzjn.zzFg == null || com_google_android_gms_internal_zzjn.zzFg.zzEy == null) ? false : true;
    }
}
