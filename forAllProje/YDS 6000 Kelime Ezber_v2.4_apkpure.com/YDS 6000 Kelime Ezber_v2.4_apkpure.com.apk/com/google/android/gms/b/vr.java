package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.k;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@vz
public class vr implements Callable<yu> {
    static long a = TimeUnit.SECONDS.toMillis(60);
    private final Context b;
    private final zp c;
    private final r d;
    private final dp e;
    private final vq f;
    private final Object g = new Object();
    private final com.google.android.gms.b.yu.a h;
    private final qa i;
    private boolean j;
    private int k;
    private List<String> l;
    private JSONObject m;

    public interface a<T extends com.google.android.gms.b.qp.a> {
        T a(vr vrVar, JSONObject jSONObject);
    }

    class b {
        public rq a;

        b(vr vrVar) {
        }
    }

    public vr(Context context, r rVar, zp zpVar, dp dpVar, com.google.android.gms.b.yu.a aVar, qa qaVar) {
        this.b = context;
        this.d = rVar;
        this.c = zpVar;
        this.h = aVar;
        this.e = dpVar;
        this.i = qaVar;
        this.f = a(context, aVar, rVar, dpVar);
        this.f.a();
        this.j = false;
        this.k = -2;
        this.l = null;
    }

    private aag<qj> a(JSONObject jSONObject, boolean z, boolean z2) {
        final String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(string)) {
            a(0, z);
            return new aae(null);
        } else if (z2) {
            return new aae(new qj(null, Uri.parse(string), optDouble));
        } else {
            final boolean z3 = z;
            return this.c.a(string, new com.google.android.gms.b.zp.a<qj>(this) {
                final /* synthetic */ vr e;

                public qj a() {
                    this.e.a(2, z3);
                    return null;
                }

                @TargetApi(19)
                public qj a(InputStream inputStream) {
                    Bitmap decodeStream;
                    Options options = new Options();
                    options.inDensity = (int) (160.0d * optDouble);
                    if (!optBoolean) {
                        options.inPreferredConfig = Config.RGB_565;
                    }
                    try {
                        decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    } catch (Throwable e) {
                        zy.b("Error grabbing image.", e);
                        decodeStream = null;
                    }
                    if (decodeStream == null) {
                        this.e.a(2, z3);
                        return null;
                    }
                    if (k.g()) {
                        int width = decodeStream.getWidth();
                        int height = decodeStream.getHeight();
                        ze.a("Decoded image w: " + width + " h:" + height + " bytes: " + decodeStream.getAllocationByteCount());
                    }
                    return new qj(new BitmapDrawable(Resources.getSystem(), decodeStream), Uri.parse(string), optDouble);
                }

                public /* synthetic */ Object b() {
                    return a();
                }

                @TargetApi(19)
                public /* synthetic */ Object b(InputStream inputStream) {
                    return a(inputStream);
                }
            });
        }
    }

    private com.google.android.gms.b.qp.a a(a aVar, JSONObject jSONObject, String str) {
        if (b() || aVar == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
        String[] c = c(jSONObject2, "impression_tracking_urls");
        this.l = c == null ? null : Arrays.asList(c);
        this.m = jSONObject2.optJSONObject("active_view");
        com.google.android.gms.b.qp.a a = aVar.a(this, jSONObject);
        if (a == null) {
            zy.c("Failed to retrieve ad assets.");
            return null;
        }
        a.a(new qq(this.b, this.d, this.f, this.e, jSONObject, a, this.h.a.k, str));
        return a;
    }

    private JSONObject a(final String str) {
        if (b()) {
            return null;
        }
        final aad com_google_android_gms_b_aad = new aad();
        final b bVar = new b(this);
        this.f.a(new com.google.android.gms.b.vq.a(this) {
            final /* synthetic */ vr d;

            public void a() {
                com_google_android_gms_b_aad.b(null);
            }

            public void a(final sw swVar) {
                rq anonymousClass1 = new rq(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                        try {
                            String str = (String) map.get("success");
                            if (!TextUtils.isEmpty(str)) {
                                if (str.equals(new JSONObject(str).optString("ads_id", ""))) {
                                    swVar.b("/nativeAdPreProcess", bVar.a);
                                    com_google_android_gms_b_aad.b(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
                                }
                            }
                        } catch (Throwable e) {
                            zy.b("Malformed native JSON response.", e);
                            this.b.d.a(0);
                            c.a(this.b.d.b(), (Object) "Unable to set the ad state error!");
                            com_google_android_gms_b_aad.b(null);
                        }
                    }
                };
                bVar.a = anonymousClass1;
                swVar.a("/nativeAdPreProcess", anonymousClass1);
                try {
                    JSONObject jSONObject = new JSONObject(this.d.h.b.c);
                    jSONObject.put("ads_id", str);
                    swVar.a("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
                } catch (Throwable e) {
                    zy.c("Exception occurred while invoking javascript", e);
                    com_google_android_gms_b_aad.b(null);
                }
            }
        });
        return (JSONObject) com_google_android_gms_b_aad.get(a, TimeUnit.MILLISECONDS);
    }

    private void a(com.google.android.gms.b.qp.a aVar) {
        if (aVar instanceof qm) {
            final qm qmVar = (qm) aVar;
            b bVar = new b(this);
            final rq anonymousClass3 = new rq(this) {
                final /* synthetic */ vr b;

                public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                    this.b.a(qmVar, (String) map.get("asset"));
                }
            };
            bVar.a = anonymousClass3;
            this.f.a(new com.google.android.gms.b.vq.a(this) {
                public void a(sw swVar) {
                    swVar.a("/nativeAdCustomClick", anonymousClass3);
                }
            });
        }
    }

    private void a(rd rdVar, String str) {
        try {
            rg c = this.d.c(rdVar.l());
            if (c != null) {
                c.a(rdVar, str);
            }
        } catch (Throwable e) {
            zy.c(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e);
        }
    }

    private yu b(com.google.android.gms.b.qp.a aVar) {
        int i;
        synchronized (this.g) {
            i = this.k;
            if (aVar == null && this.k == -2) {
                i = 0;
            }
        }
        return new yu(this.h.a.c, null, this.h.b.d, i, this.h.b.f, this.l, this.h.b.l, this.h.b.k, this.h.a.i, false, null, null, null, null, null, 0, this.h.d, this.h.b.g, this.h.f, this.h.g, this.h.b.o, this.m, i != -2 ? null : aVar, null, null, null, this.h.b.F, this.h.b.G, null, this.h.b.J, this.h.b.N);
    }

    private Integer b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    private static List<Drawable> b(List<qj> list) {
        List<Drawable> arrayList = new ArrayList();
        for (qj a : list) {
            arrayList.add((Drawable) com.google.android.gms.a.b.a(a.a()));
        }
        return arrayList;
    }

    private String[] c(JSONObject jSONObject, String str) {
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

    public aag<aaq> a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return new aae(null);
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            return a(this.b, this.e, this.h, this.i, this.d).a(optJSONObject);
        }
        zy.e("Required field 'vast_xml' is missing");
        return new aae(null);
    }

    public aag<qj> a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, z, z2);
    }

    vq a(Context context, com.google.android.gms.b.yu.a aVar, r rVar, dp dpVar) {
        return new vq(context, aVar, rVar, dpVar);
    }

    protected a a(JSONObject jSONObject) {
        if (b() || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        boolean z = this.h.a.z != null ? this.h.a.z.b : false;
        boolean z2 = this.h.a.z != null ? this.h.a.z.d : false;
        if ("2".equals(string)) {
            return new vt(z, z2);
        }
        if ("1".equals(string)) {
            return new vu(z, z2);
        }
        if ("3".equals(string)) {
            final String string2 = jSONObject.getString("custom_template_id");
            final aad com_google_android_gms_b_aad = new aad();
            zi.a.post(new Runnable(this) {
                final /* synthetic */ vr c;

                public void run() {
                    com_google_android_gms_b_aad.b((rh) this.c.d.K().get(string2));
                }
            });
            if (com_google_android_gms_b_aad.get(a, TimeUnit.MILLISECONDS) != null) {
                return new vv(z);
            }
            string2 = "No handler for custom template: ";
            String valueOf = String.valueOf(jSONObject.getString("custom_template_id"));
            zy.c(valueOf.length() != 0 ? string2.concat(valueOf) : new String(string2));
        } else {
            a(0);
        }
        return null;
    }

    vs a(Context context, dp dpVar, com.google.android.gms.b.yu.a aVar, qa qaVar, r rVar) {
        return new vs(context, dpVar, aVar, qaVar, rVar);
    }

    public yu a() {
        try {
            this.f.b();
            String c = c();
            JSONObject a = a(c);
            com.google.android.gms.b.qp.a a2 = a(a(a), a, c);
            a(a2);
            return b(a2);
        } catch (CancellationException e) {
            if (!this.j) {
                a(0);
            }
            return b(null);
        } catch (ExecutionException e2) {
            if (this.j) {
                a(0);
            }
            return b(null);
        } catch (InterruptedException e3) {
            if (this.j) {
                a(0);
            }
            return b(null);
        } catch (Throwable e4) {
            zy.c("Malformed native JSON response.", e4);
            if (this.j) {
                a(0);
            }
            return b(null);
        } catch (Throwable e42) {
            zy.c("Timeout when loading native ad.", e42);
            if (this.j) {
                a(0);
            }
            return b(null);
        }
    }

    public List<aag<qj>> a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray jSONArray = z ? jSONObject.getJSONArray(str) : jSONObject.optJSONArray(str);
        List<aag<qj>> arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            a(0, z);
            return arrayList;
        }
        int length = z3 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(a(jSONObject2, z, z2));
        }
        return arrayList;
    }

    public Future<qj> a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, optBoolean, z);
    }

    public void a(int i) {
        synchronized (this.g) {
            this.j = true;
            this.k = i;
        }
    }

    public void a(int i, boolean z) {
        if (z) {
            a(i);
        }
    }

    public aag<qh> b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return new aae(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = b(optJSONObject, "text_color");
        Integer b2 = b(optJSONObject, "bg_color");
        final int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        final int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        final int i = (this.h.a.z == null || this.h.a.z.a < 2) ? 1 : this.h.a.z.e;
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(a(optJSONObject, "image", false, false));
        }
        final String str = optString;
        final Integer num = b2;
        final Integer num2 = b;
        final int i2 = optInt;
        return aaf.a(aaf.a(arrayList), new com.google.android.gms.b.aaf.a<List<qj>, qh>(this) {
            public qh a(List<qj> list) {
                qh qhVar;
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            qhVar = new qh(str, vr.b((List) list), num, num2, i2 > 0 ? Integer.valueOf(i2) : null, optInt3 + optInt2, i);
                            return qhVar;
                        }
                    } catch (Throwable e) {
                        zy.b("Could not get attribution icon", e);
                        return null;
                    }
                }
                qhVar = null;
                return qhVar;
            }

            public /* synthetic */ Object a(Object obj) {
                return a((List) obj);
            }
        });
    }

    public boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.j;
        }
        return z;
    }

    String c() {
        return UUID.randomUUID().toString();
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
