package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.qp.a;
import com.google.android.gms.common.internal.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@vz
public class qq implements qp {
    boolean a;
    private final Object b = new Object();
    private final r c;
    private final Context d;
    private final JSONObject e;
    private final vq f;
    private final a g;
    private final dp h;
    private final aab i;
    private aaq j;
    private String k;
    private String l;
    private WeakReference<View> m = null;

    public qq(Context context, r rVar, vq vqVar, dp dpVar, JSONObject jSONObject, a aVar, aab com_google_android_gms_b_aab, String str) {
        this.d = context;
        this.c = rVar;
        this.f = vqVar;
        this.h = dpVar;
        this.e = jSONObject;
        this.g = aVar;
        this.i = com_google_android_gms_b_aab;
        this.l = str;
    }

    private JSONObject a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", a(rect.left));
        jSONObject.put("y", a(rect.top));
        jSONObject.put("width", a(rect.right - rect.left));
        jSONObject.put("height", a(rect.bottom - rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private JSONObject a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || view == null) {
            return jSONObject;
        }
        try {
            int[] b = b(view);
            for (Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] b2 = b(view2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("width", a(c(view2)));
                    jSONObject2.put("height", a(d(view2)));
                    jSONObject2.put("x", a(b2[0] - b[0]));
                    jSONObject2.put("y", a(b2[1] - b[1]));
                    jSONObject.put((String) entry.getKey(), jSONObject2);
                }
            }
        } catch (JSONException e) {
            zy.e("Unable to get all view rectangles");
        }
        return jSONObject;
    }

    private JSONObject b(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || view == null) {
            return jSONObject;
        }
        int[] b = b(view);
        for (Entry entry : map.entrySet()) {
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null) {
                int[] b2 = b(view2);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    Object a;
                    jSONObject3.put("width", a(c(view2)));
                    jSONObject3.put("height", a(d(view2)));
                    jSONObject3.put("x", a(b2[0] - b[0]));
                    jSONObject3.put("y", a(b2[1] - b[1]));
                    jSONObject3.put("relative_to", "ad_view");
                    jSONObject2.put("frame", jSONObject3);
                    Rect rect = new Rect();
                    if (view2.getLocalVisibleRect(rect)) {
                        a = a(rect);
                    } else {
                        a = new JSONObject();
                        a.put("x", a(b2[0] - b[0]));
                        a.put("y", a(b2[1] - b[1]));
                        a.put("width", 0);
                        a.put("height", 0);
                        a.put("relative_to", "ad_view");
                    }
                    jSONObject2.put("visible_bounds", a);
                    if (view2 instanceof TextView) {
                        TextView textView = (TextView) view2;
                        jSONObject2.put("text_color", textView.getCurrentTextColor());
                        jSONObject2.put("font_size", (double) textView.getTextSize());
                        jSONObject2.put("text", textView.getText());
                    }
                    jSONObject.put((String) entry.getKey(), jSONObject2);
                } catch (JSONException e) {
                    zy.e("Unable to get asset views information");
                }
            }
        }
        return jSONObject;
    }

    private JSONObject e(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                jSONObject.put("width", a(c(view)));
                jSONObject.put("height", a(d(view)));
            } catch (Exception e) {
                zy.e("Unable to get native ad view bounding box");
            }
        }
        return jSONObject;
    }

    private JSONObject f(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                Object a;
                int[] b = b(view);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", a(c(view)));
                jSONObject2.put("height", a(d(view)));
                jSONObject2.put("x", a(b[0]));
                jSONObject2.put("y", a(b[1]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    a = a(rect);
                } else {
                    a = new JSONObject();
                    a.put("x", a(b[0]));
                    a.put("y", a(b[1]));
                    a.put("width", 0);
                    a.put("height", 0);
                    a.put("relative_to", "window");
                }
                jSONObject.put("visible_bounds", a);
            } catch (Exception e) {
                zy.e("Unable to get native ad view bounding box");
            }
        }
        return jSONObject;
    }

    int a(int i) {
        return oc.a().b(this.d, i);
    }

    public qi a(OnClickListener onClickListener) {
        qh m = this.g.m();
        if (m == null) {
            return null;
        }
        qi qiVar = new qi(this.d, m);
        qiVar.setLayoutParams(new LayoutParams(-1, -1));
        qiVar.a().setOnClickListener(onClickListener);
        qiVar.a().setContentDescription((CharSequence) pr.ck.c());
        return qiVar;
    }

    qu a(Object obj) {
        return obj instanceof IBinder ? qu.a.a((IBinder) obj) : null;
    }

    public void a(MotionEvent motionEvent) {
        this.h.a(motionEvent);
    }

    public void a(View view) {
        this.m = new WeakReference(view);
    }

    public void a(View view, qn qnVar) {
        if (this.g instanceof qk) {
            qk qkVar = (qk) this.g;
            ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -1);
            if (qkVar.o() != null) {
                ((FrameLayout) view).addView(qkVar.o(), layoutParams);
                this.c.a(qnVar);
            } else if (qkVar.b() != null && qkVar.b().size() > 0) {
                qu a = a(qkVar.b().get(0));
                if (a != null) {
                    try {
                        com.google.android.gms.a.a a2 = a.a();
                        if (a2 != null) {
                            Drawable drawable = (Drawable) b.a(a2);
                            View h = h();
                            h.setImageDrawable(drawable);
                            h.setScaleType(ScaleType.CENTER_INSIDE);
                            ((FrameLayout) view).addView(h, layoutParams);
                        }
                    } catch (RemoteException e) {
                        zy.e("Could not get drawable from image");
                    }
                }
            }
        }
    }

    public void a(View view, String str, JSONObject jSONObject, Map<String, WeakReference<View>> map, View view2) {
        c.b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("asset", str);
            jSONObject2.put("template", this.g.k());
            final JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ad", this.e);
            jSONObject3.put("click", jSONObject2);
            jSONObject3.put("has_custom_click_handler", this.c.c(this.g.l()) != null);
            if (((Boolean) pr.cm.c()).booleanValue()) {
                if (((Boolean) pr.cn.c()).booleanValue()) {
                    jSONObject3.put("asset_view_signal", b((Map) map, view2));
                    jSONObject3.put("ad_view_signal", f(view2));
                } else {
                    jSONObject3.put("view_rectangles", a((Map) map, view2));
                    jSONObject3.put("native_view_rectangle", e(view2));
                }
            }
            if (jSONObject != null) {
                jSONObject3.put("click_point", jSONObject);
            }
            try {
                JSONObject optJSONObject = this.e.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject2.put("click_signals", this.h.a().a(this.d, optJSONObject.optString("click_string"), view));
            } catch (Throwable e) {
                zy.b("Exception obtaining click signals", e);
            }
            jSONObject3.put("ads_id", this.l);
            this.f.a(new vq.a(this) {
                public void a(sw swVar) {
                    swVar.a("google.afma.nativeAds.handleClickGmsg", jSONObject3);
                }
            });
        } catch (Throwable e2) {
            zy.b("Unable to create click JSON.", e2);
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map) {
        c.b("recordImpression must be called on the main UI thread.");
        a(true);
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.e);
            jSONObject.put("ads_id", this.l);
            if (((Boolean) pr.cm.c()).booleanValue()) {
                if (((Boolean) pr.cn.c()).booleanValue()) {
                    jSONObject.put("asset_view_signal", b((Map) map, view));
                    jSONObject.put("ad_view_signal", f(view));
                } else {
                    jSONObject.put("view_rectangles", a((Map) map, view));
                    jSONObject.put("native_view_rectangle", e(view));
                }
            }
            this.f.a(new vq.a(this) {
                public void a(sw swVar) {
                    swVar.a("google.afma.nativeAds.handleImpressionPing", jSONObject);
                }
            });
        } catch (Throwable e) {
            zy.b("Unable to create impression JSON.", e);
        }
        this.c.a((qp) this);
    }

    public void a(View view, Map<String, WeakReference<View>> map, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) pr.ch.c()).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, View view2) {
        c.b("performClick must be called on the main UI thread.");
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    a(view, (String) entry.getKey(), jSONObject, map, view2);
                    return;
                }
            }
        }
        if ("2".equals(this.g.k())) {
            a(view, "2099", jSONObject, map, view2);
        } else if ("1".equals(this.g.k())) {
            a(view, "1099", jSONObject, map, view2);
        }
    }

    protected void a(boolean z) {
        this.a = z;
    }

    public void b(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) pr.cg.c()).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(null);
                        view2.setClickable(false);
                        view2.setOnClickListener(null);
                    }
                }
            }
        }
    }

    int[] b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    int c(View view) {
        return view.getMeasuredWidth();
    }

    public aaq c() {
        this.j = g();
        this.j.b().setVisibility(8);
        this.f.a(new vq.a(this) {
            final /* synthetic */ qq a;

            {
                this.a = r1;
            }

            public void a(final sw swVar) {
                swVar.a("/loadHtml", new rq(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public void a(aaq com_google_android_gms_b_aaq, final Map<String, String> map) {
                        this.b.a.j.l().a(new aar.a(this) {
                            final /* synthetic */ AnonymousClass1 b;

                            public void a(aaq com_google_android_gms_b_aaq, boolean z) {
                                this.b.b.a.k = (String) map.get("id");
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("messageType", "htmlLoaded");
                                    jSONObject.put("id", this.b.b.a.k);
                                    swVar.b("sendMessageToNativeJs", jSONObject);
                                } catch (Throwable e) {
                                    zy.b("Unable to dispatch sendMessageToNativeJs event", e);
                                }
                            }
                        });
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            this.b.a.j.loadData(str, "text/html", "UTF-8");
                        } else {
                            this.b.a.j.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        }
                    }
                });
                swVar.a("/showOverlay", new rq(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                        this.a.a.j.b().setVisibility(0);
                    }
                });
                swVar.a("/hideOverlay", new rq(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                        this.a.a.j.b().setVisibility(8);
                    }
                });
                this.a.j.l().a("/hideOverlay", new rq(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                        this.a.a.j.b().setVisibility(8);
                    }
                });
                this.a.j.l().a("/sendMessageToSdk", new rq(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            for (String str : map.keySet()) {
                                jSONObject.put(str, map.get(str));
                            }
                            jSONObject.put("id", this.b.a.k);
                            swVar.b("sendMessageToNativeJs", jSONObject);
                        } catch (Throwable e) {
                            zy.b("Unable to dispatch sendMessageToNativeJs event", e);
                        }
                    }
                });
            }
        });
        return this.j;
    }

    public void c(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.b) {
            if (this.a) {
            } else if (!view.isShown()) {
            } else if (view.getGlobalVisibleRect(new Rect(), null)) {
                a(view, (Map) map);
            }
        }
    }

    int d(View view) {
        return view.getMeasuredHeight();
    }

    public View d() {
        return this.m != null ? (View) this.m.get() : null;
    }

    public Context e() {
        return this.d;
    }

    public void f() {
        if (this.g instanceof qk) {
            this.c.L();
        }
    }

    aaq g() {
        return v.f().a(this.d, nx.a(this.d), false, false, this.h, this.i);
    }

    ImageView h() {
        return new ImageView(this.d);
    }
}
