package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzaq;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzia;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzlb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

@zzig
public class zzi implements zzh {
    private final Context mContext;
    private final zzq zzAT;
    private final JSONObject zzAW;
    private final zzia zzAX;
    private final zza zzAY;
    private final zzaq zzAZ;
    private boolean zzBa;
    private zzla zzBb;
    private String zzBc;
    private String zzBd;
    private WeakReference<View> zzBe = null;
    private final Object zzpp = new Object();
    private final VersionInfoParcel zzqP;

    public zzi(Context context, zzq com_google_android_gms_ads_internal_zzq, zzia com_google_android_gms_internal_zzia, zzaq com_google_android_gms_internal_zzaq, JSONObject jSONObject, zza com_google_android_gms_ads_internal_formats_zzh_zza, VersionInfoParcel versionInfoParcel, String str) {
        this.mContext = context;
        this.zzAT = com_google_android_gms_ads_internal_zzq;
        this.zzAX = com_google_android_gms_internal_zzia;
        this.zzAZ = com_google_android_gms_internal_zzaq;
        this.zzAW = jSONObject;
        this.zzAY = com_google_android_gms_ads_internal_formats_zzh_zza;
        this.zzqP = versionInfoParcel;
        this.zzBd = str;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void recordImpression() {
        zzaa.zzdc("recordImpression must be called on the main UI thread.");
        zzp(true);
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzAW);
            jSONObject.put("ads_id", this.zzBd);
            this.zzAX.zza(new zzia.zza(this) {
                final /* synthetic */ zzi b;

                public void zze(zzfk com_google_android_gms_internal_zzfk) {
                    com_google_android_gms_internal_zzfk.zza("google.afma.nativeAds.handleImpressionPing", jSONObject);
                }
            });
        } catch (Throwable e) {
            zzb.zzb("Unable to create impression JSON.", e);
        }
        this.zzAT.zza((zzh) this);
    }

    public a zza(OnClickListener onClickListener) {
        zza zzeQ = this.zzAY.zzeQ();
        if (zzeQ == null) {
            return null;
        }
        a aVar = new a(this.mContext, zzeQ);
        aVar.setLayoutParams(new LayoutParams(-1, -1));
        aVar.a().setOnClickListener(onClickListener);
        aVar.a().setContentDescription("Ad attribution icon");
        return aVar;
    }

    public void zza(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzaa.zzdc("performClick must be called on the main UI thread.");
        for (Entry entry : map.entrySet()) {
            if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                zza((String) entry.getKey(), jSONObject, jSONObject2, jSONObject3);
                return;
            }
        }
        if ("2".equals(this.zzAY.zzeP())) {
            zza("2099", jSONObject, jSONObject2, jSONObject3);
        } else if ("1".equals(this.zzAY.zzeP())) {
            zza("1099", jSONObject, jSONObject2, jSONObject3);
        }
    }

    public void zza(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzaa.zzdc("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("asset", str);
            jSONObject4.put("template", this.zzAY.zzeP());
            final JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("ad", this.zzAW);
            jSONObject5.put("click", jSONObject4);
            jSONObject5.put("has_custom_click_handler", this.zzAT.zzv(this.zzAY.getCustomTemplateId()) != null);
            if (jSONObject != null) {
                jSONObject5.put("view_rectangles", jSONObject);
            }
            if (jSONObject2 != null) {
                jSONObject5.put("click_point", jSONObject2);
            }
            if (jSONObject3 != null) {
                jSONObject5.put("native_view_rectangle", jSONObject3);
            }
            jSONObject5.put("ads_id", this.zzBd);
            this.zzAX.zza(new zzia.zza(this) {
                final /* synthetic */ zzi b;

                public void zze(zzfk com_google_android_gms_internal_zzfk) {
                    com_google_android_gms_internal_zzfk.zza("google.afma.nativeAds.handleClickGmsg", jSONObject5);
                }
            });
        } catch (Throwable e) {
            zzb.zzb("Unable to create click JSON.", e);
        }
    }

    public void zzb(MotionEvent motionEvent) {
        this.zzAZ.zza(motionEvent);
    }

    public zzla zzeU() {
        this.zzBb = zzeW();
        this.zzBb.getView().setVisibility(8);
        this.zzAX.zza(new zzia.zza(this) {
            final /* synthetic */ zzi a;

            {
                this.a = r1;
            }

            public void zze(final zzfk com_google_android_gms_internal_zzfk) {
                com_google_android_gms_internal_zzfk.zza("/loadHtml", new zzeh(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public void zza(zzla com_google_android_gms_internal_zzla, final Map<String, String> map) {
                        this.b.a.zzBb.zzjD().zza(new zzlb.zza(this) {
                            final /* synthetic */ AnonymousClass1 b;

                            public void zza(zzla com_google_android_gms_internal_zzla, boolean z) {
                                this.b.b.a.zzBc = (String) map.get("id");
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("messageType", "htmlLoaded");
                                    jSONObject.put("id", this.b.b.a.zzBc);
                                    com_google_android_gms_internal_zzfk.zzb("sendMessageToNativeJs", jSONObject);
                                } catch (Throwable e) {
                                    zzb.zzb("Unable to dispatch sendMessageToNativeJs event", e);
                                }
                            }
                        });
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            this.b.a.zzBb.loadData(str, "text/html", Constants.ENCODING);
                        } else {
                            this.b.a.zzBb.loadDataWithBaseURL(str2, str, "text/html", Constants.ENCODING, null);
                        }
                    }
                });
                com_google_android_gms_internal_zzfk.zza("/showOverlay", new zzeh(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
                        this.a.a.zzBb.getView().setVisibility(0);
                    }
                });
                com_google_android_gms_internal_zzfk.zza("/hideOverlay", new zzeh(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
                        this.a.a.zzBb.getView().setVisibility(8);
                    }
                });
                this.a.zzBb.zzjD().zza("/hideOverlay", new zzeh(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
                        this.a.a.zzBb.getView().setVisibility(8);
                    }
                });
                this.a.zzBb.zzjD().zza("/sendMessageToSdk", new zzeh(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            for (String str : map.keySet()) {
                                jSONObject.put(str, map.get(str));
                            }
                            jSONObject.put("id", this.b.a.zzBc);
                            com_google_android_gms_internal_zzfk.zzb("sendMessageToNativeJs", jSONObject);
                        } catch (Throwable e) {
                            zzb.zzb("Unable to dispatch sendMessageToNativeJs event", e);
                        }
                    }
                });
            }
        });
        return this.zzBb;
    }

    public View zzeV() {
        return this.zzBe != null ? (View) this.zzBe.get() : null;
    }

    zzla zzeW() {
        return zzu.zzcl().zza(this.mContext, AdSizeParcel.zzk(this.mContext), false, false, this.zzAZ, this.zzqP);
    }

    public void zzg(View view) {
    }

    public void zzh(View view) {
        synchronized (this.zzpp) {
            if (this.zzBa) {
            } else if (!view.isShown()) {
            } else if (view.getGlobalVisibleRect(new Rect(), null)) {
                recordImpression();
            }
        }
    }

    public void zzi(View view) {
        this.zzBe = new WeakReference(view);
    }

    protected void zzp(boolean z) {
        this.zzBa = z;
    }
}
