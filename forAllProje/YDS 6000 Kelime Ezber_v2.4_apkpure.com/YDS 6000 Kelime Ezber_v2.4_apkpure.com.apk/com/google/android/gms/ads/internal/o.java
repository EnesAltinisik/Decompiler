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
import com.google.android.gms.a.b;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.aar.a;
import com.google.android.gms.b.qk;
import com.google.android.gms.b.ql;
import com.google.android.gms.b.qu;
import com.google.android.gms.b.rq;
import com.google.android.gms.b.ti;
import com.google.android.gms.b.tr;
import com.google.android.gms.b.ts;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.yu;
import com.google.android.gms.b.zy;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

@vz
public class o {

    class AnonymousClass1 implements a {
        final /* synthetic */ qk a;
        final /* synthetic */ String b;
        final /* synthetic */ aaq c;

        AnonymousClass1(qk qkVar, String str, aaq com_google_android_gms_b_aaq) {
            this.a = qkVar;
            this.b = str;
            this.c = com_google_android_gms_b_aaq;
        }

        public void a(aaq com_google_android_gms_b_aaq, boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("headline", this.a.a());
                jSONObject.put("body", this.a.c());
                jSONObject.put("call_to_action", this.a.e());
                jSONObject.put("price", this.a.h());
                jSONObject.put("star_rating", String.valueOf(this.a.f()));
                jSONObject.put("store", this.a.g());
                jSONObject.put("icon", o.a(this.a.d()));
                JSONArray jSONArray = new JSONArray();
                List<Object> b = this.a.b();
                if (b != null) {
                    for (Object a : b) {
                        jSONArray.put(o.a(o.b(a)));
                    }
                }
                jSONObject.put("images", jSONArray);
                jSONObject.put("extras", o.b(this.a.n(), this.b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("assets", jSONObject);
                jSONObject2.put("template_id", "2");
                this.c.a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
            } catch (Throwable e) {
                zy.c("Exception occurred when loading assets", e);
            }
        }
    }

    class AnonymousClass2 implements a {
        final /* synthetic */ ql a;
        final /* synthetic */ String b;
        final /* synthetic */ aaq c;

        AnonymousClass2(ql qlVar, String str, aaq com_google_android_gms_b_aaq) {
            this.a = qlVar;
            this.b = str;
            this.c = com_google_android_gms_b_aaq;
        }

        public void a(aaq com_google_android_gms_b_aaq, boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("headline", this.a.a());
                jSONObject.put("body", this.a.c());
                jSONObject.put("call_to_action", this.a.e());
                jSONObject.put("advertiser", this.a.f());
                jSONObject.put("logo", o.a(this.a.d()));
                JSONArray jSONArray = new JSONArray();
                List<Object> b = this.a.b();
                if (b != null) {
                    for (Object a : b) {
                        jSONArray.put(o.a(o.b(a)));
                    }
                }
                jSONObject.put("images", jSONArray);
                jSONObject.put("extras", o.b(this.a.h(), this.b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("assets", jSONObject);
                jSONObject2.put("template_id", "1");
                this.c.a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
            } catch (Throwable e) {
                zy.c("Exception occurred when loading assets", e);
            }
        }
    }

    class AnonymousClass3 implements rq {
        final /* synthetic */ CountDownLatch a;

        AnonymousClass3(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            this.a.countDown();
            com_google_android_gms_b_aaq.b().setVisibility(0);
        }
    }

    class AnonymousClass4 implements rq {
        final /* synthetic */ CountDownLatch a;

        AnonymousClass4(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            zy.e("Adapter returned an ad, but assets substitution failed");
            this.a.countDown();
            com_google_android_gms_b_aaq.destroy();
        }
    }

    class AnonymousClass5 implements rq {
        final /* synthetic */ tr a;
        final /* synthetic */ f.a b;
        final /* synthetic */ ts c;

        AnonymousClass5(tr trVar, f.a aVar, ts tsVar) {
            this.a = trVar;
            this.b = aVar;
            this.c = tsVar;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            Object b = com_google_android_gms_b_aaq.b();
            if (b != null) {
                try {
                    if (this.a != null) {
                        if (this.a.k()) {
                            o.b(com_google_android_gms_b_aaq);
                            return;
                        }
                        this.a.a(b.a(b));
                        this.b.a();
                    } else if (this.c == null) {
                    } else {
                        if (this.c.i()) {
                            o.b(com_google_android_gms_b_aaq);
                            return;
                        }
                        this.c.a(b.a(b));
                        this.b.a();
                    }
                } catch (Throwable e) {
                    zy.c("Unable to call handleClick on mapper", e);
                }
            }
        }
    }

    public static View a(yu yuVar) {
        if (yuVar == null) {
            zy.c("AdState is null");
            return null;
        } else if (b(yuVar) && yuVar.b != null) {
            return yuVar.b.b();
        } else {
            try {
                com.google.android.gms.a.a a = yuVar.p != null ? yuVar.p.a() : null;
                if (a != null) {
                    return (View) b.a(a);
                }
                zy.e("View in mediation adapter is null.");
                return null;
            } catch (Throwable e) {
                zy.c("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    private static qk a(tr trVar) {
        return new qk(trVar.a(), trVar.b(), trVar.c(), trVar.d(), trVar.e(), trVar.f(), trVar.g(), trVar.h(), null, trVar.l(), null, null);
    }

    private static ql a(ts tsVar) {
        return new ql(tsVar.a(), tsVar.b(), tsVar.c(), tsVar.d(), tsVar.e(), tsVar.f(), null, tsVar.j());
    }

    static rq a(tr trVar, ts tsVar, f.a aVar) {
        return new AnonymousClass5(trVar, aVar, tsVar);
    }

    static rq a(CountDownLatch countDownLatch) {
        return new AnonymousClass3(countDownLatch);
    }

    private static String a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            zy.e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        encodeToString = String.valueOf(encodeToString);
        return encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
    }

    static String a(qu quVar) {
        if (quVar == null) {
            zy.e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = quVar.b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException e) {
            zy.e("Unable to get image uri. Trying data uri next");
        }
        return b(quVar);
    }

    private static void a(aaq com_google_android_gms_b_aaq, qk qkVar, String str) {
        com_google_android_gms_b_aaq.l().a(new AnonymousClass1(qkVar, str, com_google_android_gms_b_aaq));
    }

    private static void a(aaq com_google_android_gms_b_aaq, ql qlVar, String str) {
        com_google_android_gms_b_aaq.l().a(new AnonymousClass2(qlVar, str, com_google_android_gms_b_aaq));
    }

    private static void a(aaq com_google_android_gms_b_aaq, CountDownLatch countDownLatch) {
        com_google_android_gms_b_aaq.l().a("/nativeExpressAssetsLoaded", a(countDownLatch));
        com_google_android_gms_b_aaq.l().a("/nativeExpressAssetsLoadingFailed", b(countDownLatch));
    }

    public static void a(yu yuVar, f.a aVar) {
        ts tsVar = null;
        if (yuVar != null && b(yuVar)) {
            aaq com_google_android_gms_b_aaq = yuVar.b;
            Object b = com_google_android_gms_b_aaq != null ? com_google_android_gms_b_aaq.b() : null;
            if (b == null) {
                zy.e("AdWebView is null");
                return;
            }
            try {
                List list = yuVar.o != null ? yuVar.o.o : null;
                if (list == null || list.isEmpty()) {
                    zy.e("No template ids present in mediation response");
                    return;
                }
                tr h = yuVar.p != null ? yuVar.p.h() : null;
                if (yuVar.p != null) {
                    tsVar = yuVar.p.i();
                }
                if (list.contains("2") && h != null) {
                    h.b(b.a(b));
                    if (!h.j()) {
                        h.i();
                    }
                    com_google_android_gms_b_aaq.l().a("/nativeExpressViewClicked", a(h, null, aVar));
                } else if (!list.contains("1") || tsVar == null) {
                    zy.e("No matching template id and mapper");
                } else {
                    tsVar.b(b.a(b));
                    if (!tsVar.h()) {
                        tsVar.g();
                    }
                    com_google_android_gms_b_aaq.l().a("/nativeExpressViewClicked", a(null, tsVar, aVar));
                }
            } catch (Throwable e) {
                zy.c("Error occurred while recording impression and registering for clicks", e);
            }
        }
    }

    public static boolean a(aaq com_google_android_gms_b_aaq, ti tiVar, CountDownLatch countDownLatch) {
        boolean z = false;
        try {
            z = b(com_google_android_gms_b_aaq, tiVar, countDownLatch);
        } catch (Throwable e) {
            zy.c("Unable to invoke load assets", e);
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    private static qu b(Object obj) {
        return obj instanceof IBinder ? qu.a.a((IBinder) obj) : null;
    }

    static rq b(CountDownLatch countDownLatch) {
        return new AnonymousClass4(countDownLatch);
    }

    private static String b(qu quVar) {
        try {
            com.google.android.gms.a.a a = quVar.a();
            if (a == null) {
                zy.e("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) b.a(a);
            if (drawable instanceof BitmapDrawable) {
                return a(((BitmapDrawable) drawable).getBitmap());
            }
            zy.e("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException e) {
            zy.e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    private static JSONObject b(Bundle bundle, String str) {
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
                        jSONObject.put(str2, a((Bitmap) obj));
                    } else {
                        zy.e("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    zy.e("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
        }
        return jSONObject;
    }

    private static void b(aaq com_google_android_gms_b_aaq) {
        OnClickListener D = com_google_android_gms_b_aaq.D();
        if (D != null) {
            D.onClick(com_google_android_gms_b_aaq.b());
        }
    }

    private static boolean b(aaq com_google_android_gms_b_aaq, ti tiVar, CountDownLatch countDownLatch) {
        View b = com_google_android_gms_b_aaq.b();
        if (b == null) {
            zy.e("AdWebView is null");
            return false;
        }
        b.setVisibility(4);
        List list = tiVar.b.o;
        if (list == null || list.isEmpty()) {
            zy.e("No template ids present in mediation response");
            return false;
        }
        a(com_google_android_gms_b_aaq, countDownLatch);
        tr h = tiVar.c.h();
        ts i = tiVar.c.i();
        if (list.contains("2") && h != null) {
            a(com_google_android_gms_b_aaq, a(h), tiVar.b.n);
        } else if (!list.contains("1") || i == null) {
            zy.e("No matching template id and mapper");
            return false;
        } else {
            a(com_google_android_gms_b_aaq, a(i), tiVar.b.n);
        }
        String str = tiVar.b.l;
        String str2 = tiVar.b.m;
        if (str2 != null) {
            com_google_android_gms_b_aaq.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        } else {
            com_google_android_gms_b_aaq.loadData(str, "text/html", "UTF-8");
        }
        return true;
    }

    public static boolean b(yu yuVar) {
        return (yuVar == null || !yuVar.n || yuVar.o == null || yuVar.o.l == null) ? false : true;
    }
}
