package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.aaj.b;
import com.google.android.gms.b.aaj.c;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.rq;
import com.google.android.gms.b.sv;
import com.google.android.gms.b.sw;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.yw;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import java.util.Map;
import org.json.JSONObject;

@vz
public class g {
    public final rq a = new rq(this) {
        final /* synthetic */ g a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            com_google_android_gms_b_aaq.b("/appSettingsFetched", (rq) this);
            synchronized (this.a.b) {
                if (map != null) {
                    if ("true".equalsIgnoreCase((String) map.get("isSuccessful"))) {
                        v.i().a(this.a.c, (String) map.get("appSettingsJson"));
                    }
                }
            }
        }
    };
    private final Object b = new Object();
    private Context c;

    private static boolean a(yw ywVar) {
        if (ywVar == null) {
            return true;
        }
        boolean z = (((v.k().a() - ywVar.a()) > ((Long) pr.cB.c()).longValue() ? 1 : ((v.k().a() - ywVar.a()) == ((Long) pr.cB.c()).longValue() ? 0 : -1)) > 0) || !ywVar.b();
        return z;
    }

    public void a(Context context, aab com_google_android_gms_b_aab, boolean z, yw ywVar, String str, String str2) {
        if (!a(ywVar)) {
            return;
        }
        if (context == null) {
            zy.e("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zy.e("App settings could not be fetched. Required parameters missing");
        } else {
            this.c = context;
            final sv a = v.e().a(context, com_google_android_gms_b_aab);
            final String str3 = str;
            final String str4 = str2;
            final boolean z2 = z;
            final Context context2 = context;
            zi.a.post(new Runnable(this) {
                final /* synthetic */ g f;

                public void run() {
                    a.a().a(new c<sw>(this) {
                        final /* synthetic */ AnonymousClass2 a;

                        {
                            this.a = r1;
                        }

                        public void a(sw swVar) {
                            swVar.a("/appSettingsFetched", this.a.f.a);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (!TextUtils.isEmpty(str3)) {
                                    jSONObject.put("app_id", str3);
                                } else if (!TextUtils.isEmpty(str4)) {
                                    jSONObject.put("ad_unit_id", str4);
                                }
                                jSONObject.put("is_init", z2);
                                jSONObject.put("pn", context2.getPackageName());
                                swVar.a("AFMA_fetchAppSettings", jSONObject);
                            } catch (Throwable e) {
                                swVar.b("/appSettingsFetched", this.a.f.a);
                                zy.b("Error requesting application settings", e);
                            }
                        }

                        public /* synthetic */ void a(Object obj) {
                            a((sw) obj);
                        }
                    }, new b());
                }
            });
        }
    }
}
