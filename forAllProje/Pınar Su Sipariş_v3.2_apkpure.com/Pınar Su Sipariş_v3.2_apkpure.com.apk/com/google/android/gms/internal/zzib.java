package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzo;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.plus.PlusShare;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public class zzib implements Callable<zzjn> {
    private static final long zzKl = TimeUnit.SECONDS.toMillis(60);
    private final Context mContext;
    private final zzia zzAX;
    private final zzaq zzAZ;
    private final com.google.android.gms.internal.zzjn.zza zzJJ;
    private int zzKa;
    private final zzkg zzKu;
    private final zzq zzKv;
    private boolean zzKw;
    private List<String> zzKx;
    private JSONObject zzKy;
    private final Object zzpp = new Object();

    class a {
        public zzeh a;
        final /* synthetic */ zzib b;

        a(zzib com_google_android_gms_internal_zzib) {
            this.b = com_google_android_gms_internal_zzib;
        }
    }

    public interface zza<T extends com.google.android.gms.ads.internal.formats.zzh.zza> {
        T zza(zzib com_google_android_gms_internal_zzib, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException;
    }

    public zzib(Context context, zzq com_google_android_gms_ads_internal_zzq, zzkg com_google_android_gms_internal_zzkg, zzaq com_google_android_gms_internal_zzaq, com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza) {
        this.mContext = context;
        this.zzKv = com_google_android_gms_ads_internal_zzq;
        this.zzKu = com_google_android_gms_internal_zzkg;
        this.zzJJ = com_google_android_gms_internal_zzjn_zza;
        this.zzAZ = com_google_android_gms_internal_zzaq;
        this.zzAX = zza(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_ads_internal_zzq, com_google_android_gms_internal_zzaq);
        this.zzAX.zzhA();
        this.zzKw = false;
        this.zzKa = -2;
        this.zzKx = null;
    }

    private com.google.android.gms.ads.internal.formats.zzh.zza zza(zza com_google_android_gms_internal_zzib_zza, JSONObject jSONObject, String str) throws ExecutionException, InterruptedException, JSONException {
        if (zzhM()) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
        String[] zzc = zzc(jSONObject2, "impression_tracking_urls");
        this.zzKx = zzc == null ? null : Arrays.asList(zzc);
        this.zzKy = jSONObject2.optJSONObject("active_view");
        com.google.android.gms.ads.internal.formats.zzh.zza zza = com_google_android_gms_internal_zzib_zza.zza(this, jSONObject);
        if (zza == null) {
            zzb.e("Failed to retrieve ad assets.");
            return null;
        }
        zza.zzb(new zzi(this.mContext, this.zzKv, this.zzAX, this.zzAZ, jSONObject, zza, this.zzJJ.zzPh.zzsx, str));
        return zza;
    }

    private zzkr<zzc> zza(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        final String string = z ? jSONObject.getString(PlusShare.KEY_CALL_TO_ACTION_URL) : jSONObject.optString(PlusShare.KEY_CALL_TO_ACTION_URL);
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        if (TextUtils.isEmpty(string)) {
            zza(0, z);
            return new zzkp(null);
        } else if (z2) {
            return new zzkp(new zzc(null, Uri.parse(string), optDouble));
        } else {
            final boolean z3 = z;
            return this.zzKu.zza(string, new com.google.android.gms.internal.zzkg.zza<zzc>(this) {
                final /* synthetic */ zzib d;

                public zzc a() {
                    this.d.zza(2, z3);
                    return null;
                }

                public zzc a(InputStream inputStream) {
                    byte[] zzk;
                    try {
                        zzk = zzo.zzk(inputStream);
                    } catch (IOException e) {
                        zzk = null;
                    }
                    if (zzk == null) {
                        this.d.zza(2, z3);
                        return null;
                    }
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzk, 0, zzk.length);
                    if (decodeByteArray == null) {
                        this.d.zza(2, z3);
                        return null;
                    }
                    decodeByteArray.setDensity((int) (160.0d * optDouble));
                    return new zzc(new BitmapDrawable(Resources.getSystem(), decodeByteArray), Uri.parse(string), optDouble);
                }

                public /* synthetic */ Object zzh(InputStream inputStream) {
                    return a(inputStream);
                }

                public /* synthetic */ Object zzhO() {
                    return a();
                }
            });
        }
    }

    private void zza(com.google.android.gms.ads.internal.formats.zzh.zza com_google_android_gms_ads_internal_formats_zzh_zza) {
        if (com_google_android_gms_ads_internal_formats_zzh_zza instanceof zzf) {
            final zzf com_google_android_gms_ads_internal_formats_zzf = (zzf) com_google_android_gms_ads_internal_formats_zzh_zza;
            a aVar = new a(this);
            final zzeh anonymousClass3 = new zzeh(this) {
                final /* synthetic */ zzib b;

                public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
                    this.b.zzb(com_google_android_gms_ads_internal_formats_zzf, (String) map.get("asset"));
                }
            };
            aVar.a = anonymousClass3;
            this.zzAX.zza(new com.google.android.gms.internal.zzia.zza(this) {
                final /* synthetic */ zzib b;

                public void zze(zzfk com_google_android_gms_internal_zzfk) {
                    com_google_android_gms_internal_zzfk.zza("/nativeAdCustomClick", anonymousClass3);
                }
            });
        }
    }

    private JSONObject zzaA(final String str) throws TimeoutException, JSONException {
        if (zzhM()) {
            return null;
        }
        final zzko com_google_android_gms_internal_zzko = new zzko();
        final a aVar = new a(this);
        this.zzAX.zza(new com.google.android.gms.internal.zzia.zza(this) {
            final /* synthetic */ zzib d;

            public void zze(final zzfk com_google_android_gms_internal_zzfk) {
                zzeh anonymousClass1 = new zzeh(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
                        com_google_android_gms_internal_zzfk.zzb("/nativeAdPreProcess", aVar.a);
                        try {
                            String str = (String) map.get("success");
                            if (!TextUtils.isEmpty(str)) {
                                com_google_android_gms_internal_zzko.zzh(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
                                return;
                            }
                        } catch (Throwable e) {
                            zzb.zzb("Malformed native JSON response.", e);
                        }
                        this.b.d.zzL(0);
                        zzaa.zza(this.b.d.zzhM(), (Object) "Unable to set the ad state error!");
                        com_google_android_gms_internal_zzko.zzh(null);
                    }
                };
                aVar.a = anonymousClass1;
                com_google_android_gms_internal_zzfk.zza("/nativeAdPreProcess", anonymousClass1);
                try {
                    JSONObject jSONObject = new JSONObject(this.d.zzJJ.zzPi.body);
                    jSONObject.put("ads_id", str);
                    com_google_android_gms_internal_zzfk.zza("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
                } catch (Throwable e) {
                    zzb.zzd("Exception occurred while invoking javascript", e);
                    com_google_android_gms_internal_zzko.zzh(null);
                }
            }

            public void zzhK() {
                com_google_android_gms_internal_zzko.zzh(null);
            }
        });
        return (JSONObject) com_google_android_gms_internal_zzko.get(zzKl, TimeUnit.MILLISECONDS);
    }

    private zzjn zzb(com.google.android.gms.ads.internal.formats.zzh.zza com_google_android_gms_ads_internal_formats_zzh_zza) {
        int i;
        synchronized (this.zzpp) {
            i = this.zzKa;
            if (com_google_android_gms_ads_internal_formats_zzh_zza == null && this.zzKa == -2) {
                i = 0;
            }
        }
        return new zzjn(this.zzJJ.zzPh.zzLi, null, this.zzJJ.zzPi.zzEF, i, this.zzJJ.zzPi.zzEG, this.zzKx, this.zzJJ.zzPi.orientation, this.zzJJ.zzPi.zzEL, this.zzJJ.zzPh.zzLl, false, null, null, null, null, null, 0, this.zzJJ.zzsB, this.zzJJ.zzPi.zzLO, this.zzJJ.zzPc, this.zzJJ.zzPd, this.zzJJ.zzPi.zzLU, this.zzKy, i != -2 ? null : com_google_android_gms_ads_internal_formats_zzh_zza, null, null, null, this.zzJJ.zzPi.zzMi, this.zzJJ.zzPi.zzMj, null, this.zzJJ.zzPi.zzEI);
    }

    private Integer zzb(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    private void zzb(zzdr com_google_android_gms_internal_zzdr, String str) {
        try {
            zzdv zzv = this.zzKv.zzv(com_google_android_gms_internal_zzdr.getCustomTemplateId());
            if (zzv != null) {
                zzv.zza(com_google_android_gms_internal_zzdr, str);
            }
        } catch (Throwable e) {
            zzb.zzd(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e);
        }
    }

    private String[] zzc(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    private static List<Drawable> zzh(List<zzc> list) throws RemoteException {
        List<Drawable> arrayList = new ArrayList();
        for (zzc zzeM : list) {
            arrayList.add((Drawable) zze.zzx(zzeM.zzeM()));
        }
        return arrayList;
    }

    public /* synthetic */ Object call() throws Exception {
        return zzhL();
    }

    public void zzL(int i) {
        synchronized (this.zzpp) {
            this.zzKw = true;
            this.zzKa = i;
        }
    }

    zzia zza(Context context, com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza, zzq com_google_android_gms_ads_internal_zzq, zzaq com_google_android_gms_internal_zzaq) {
        return new zzia(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_ads_internal_zzq, com_google_android_gms_internal_zzaq);
    }

    public zzkr<zzc> zza(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, z, z2);
    }

    public List<zzkr<zzc>> zza(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray jSONArray = z ? jSONObject.getJSONArray(str) : jSONObject.optJSONArray(str);
        List<zzkr<zzc>> arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            zza(0, z);
            return arrayList;
        }
        int length = z3 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(zza(jSONObject2, z, z2));
        }
        return arrayList;
    }

    public Future<zzc> zza(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, optBoolean, z);
    }

    public void zza(int i, boolean z) {
        if (z) {
            zzL(i);
        }
    }

    protected zza zze(JSONObject jSONObject) throws JSONException, TimeoutException {
        if (zzhM()) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        boolean z = this.zzJJ.zzPh.zzsP != null ? this.zzJJ.zzPh.zzsP.zzBl : false;
        boolean z2 = this.zzJJ.zzPh.zzsP != null ? this.zzJJ.zzPh.zzsP.zzBn : false;
        if ("2".equals(string)) {
            return new zzic(z, z2);
        }
        if ("1".equals(string)) {
            return new zzid(z, z2);
        }
        if ("3".equals(string)) {
            final String string2 = jSONObject.getString("custom_template_id");
            final zzko com_google_android_gms_internal_zzko = new zzko();
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzib c;

                public void run() {
                    com_google_android_gms_internal_zzko.zzh((zzdw) this.c.zzKv.zzbV().get(string2));
                }
            });
            if (com_google_android_gms_internal_zzko.get(zzKl, TimeUnit.MILLISECONDS) != null) {
                return new zzie(z);
            }
            string2 = "No handler for custom template: ";
            String valueOf = String.valueOf(jSONObject.getString("custom_template_id"));
            zzb.e(valueOf.length() != 0 ? string2.concat(valueOf) : new String(string2));
        } else {
            zzL(0);
        }
        return null;
    }

    public zzkr<com.google.android.gms.ads.internal.formats.zza> zzf(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return new zzkp(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer zzb = zzb(optJSONObject, "text_color");
        Integer zzb2 = zzb(optJSONObject, "bg_color");
        final int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        final int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = zza(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(zza(optJSONObject, "image", false, false));
        }
        final String str = optString;
        final Integer num = zzb2;
        final Integer num2 = zzb;
        final int i = optInt;
        return zzkq.zza(zzkq.zzn(arrayList), new com.google.android.gms.internal.zzkq.zza<List<zzc>, com.google.android.gms.ads.internal.formats.zza>(this) {
            final /* synthetic */ zzib g;

            public com.google.android.gms.ads.internal.formats.zza a(List<zzc> list) {
                com.google.android.gms.ads.internal.formats.zza com_google_android_gms_ads_internal_formats_zza;
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            com_google_android_gms_ads_internal_formats_zza = new com.google.android.gms.ads.internal.formats.zza(str, zzib.zzh(list), num, num2, i > 0 ? Integer.valueOf(i) : null, optInt3 + optInt2);
                            return com_google_android_gms_ads_internal_formats_zza;
                        }
                    } catch (Throwable e) {
                        zzb.zzb("Could not get attribution icon", e);
                        return null;
                    }
                }
                com_google_android_gms_ads_internal_formats_zza = null;
                return com_google_android_gms_ads_internal_formats_zza;
            }

            public /* synthetic */ Object zzg(Object obj) {
                return a((List) obj);
            }
        });
    }

    public zzjn zzhL() {
        try {
            this.zzAX.zzhB();
            String uuid = UUID.randomUUID().toString();
            JSONObject zzaA = zzaA(uuid);
            com.google.android.gms.ads.internal.formats.zzh.zza zza = zza(zze(zzaA), zzaA, uuid);
            zza(zza);
            return zzb(zza);
        } catch (CancellationException e) {
            if (!this.zzKw) {
                zzL(0);
            }
            return zzb(null);
        } catch (ExecutionException e2) {
            if (this.zzKw) {
                zzL(0);
            }
            return zzb(null);
        } catch (InterruptedException e3) {
            if (this.zzKw) {
                zzL(0);
            }
            return zzb(null);
        } catch (Throwable e4) {
            zzb.zzd("Malformed native JSON response.", e4);
            if (this.zzKw) {
                zzL(0);
            }
            return zzb(null);
        } catch (Throwable e42) {
            zzb.zzd("Timeout when loading native ad.", e42);
            if (this.zzKw) {
                zzL(0);
            }
            return zzb(null);
        }
    }

    public boolean zzhM() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzKw;
        }
        return z;
    }
}
