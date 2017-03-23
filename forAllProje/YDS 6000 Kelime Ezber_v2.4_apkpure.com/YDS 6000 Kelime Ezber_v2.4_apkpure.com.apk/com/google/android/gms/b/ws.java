package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@vz
public class ws extends zd {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    static boolean b = false;
    private static final Object c = new Object();
    private static sv d = null;
    private static rr e = null;
    private static rw f = null;
    private static rq g = null;
    private final com.google.android.gms.b.wa.a h;
    private final com.google.android.gms.b.wf.a i;
    private final Object j = new Object();
    private final Context k;
    private com.google.android.gms.b.sv.c l;

    public static class a implements zn<sr> {
        public void a(sr srVar) {
            ws.b(srVar);
        }

        public /* synthetic */ void a(Object obj) {
            a((sr) obj);
        }
    }

    public static class b implements zn<sr> {
        public void a(sr srVar) {
            ws.a(srVar);
        }

        public /* synthetic */ void a(Object obj) {
            a((sr) obj);
        }
    }

    public static class c implements rq {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            String str = (String) map.get("request_id");
            String str2 = "Invalid request: ";
            String valueOf = String.valueOf((String) map.get("errors"));
            zy.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            ws.f.b(str);
        }
    }

    public ws(Context context, com.google.android.gms.b.wf.a aVar, com.google.android.gms.b.wa.a aVar2) {
        super(true);
        this.h = aVar2;
        this.k = context;
        this.i = aVar;
        synchronized (c) {
            if (!b) {
                f = new rw();
                e = new rr(context.getApplicationContext(), aVar.j);
                g = new c();
                d = new sv(this.k.getApplicationContext(), this.i.j, (String) pr.b.c(), new b(), new a());
                b = true;
            }
        }
    }

    private wi a(wf wfVar) {
        final String c = v.e().c();
        final JSONObject a = a(wfVar, c);
        if (a == null) {
            return new wi(0);
        }
        long b = v.k().b();
        Future a2 = f.a(c);
        zx.a.post(new Runnable(this) {
            final /* synthetic */ ws c;

            public void run() {
                this.c.l = ws.d.a();
                this.c.l.a(new com.google.android.gms.b.aaj.c<sw>(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void a(sw swVar) {
                        try {
                            swVar.a("AFMA_getAdapterLessMediationAd", a);
                        } catch (Throwable e) {
                            zy.b("Error requesting an ad url", e);
                            ws.f.b(c);
                        }
                    }

                    public /* synthetic */ void a(Object obj) {
                        a((sw) obj);
                    }
                }, new com.google.android.gms.b.aaj.a(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void a() {
                        ws.f.b(c);
                    }
                });
            }
        });
        try {
            JSONObject jSONObject = (JSONObject) a2.get(a - (v.k().b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new wi(-1);
            }
            wi a3 = wz.a(this.k, wfVar, jSONObject.toString());
            return (a3.e == -3 || !TextUtils.isEmpty(a3.c)) ? a3 : new wi(3);
        } catch (CancellationException e) {
            return new wi(-1);
        } catch (InterruptedException e2) {
            return new wi(-1);
        } catch (TimeoutException e3) {
            return new wi(2);
        } catch (ExecutionException e4) {
            return new wi(0);
        }
    }

    private JSONObject a(wf wfVar, String str) {
        com.google.android.gms.ads.c.a.a b;
        Throwable e;
        Object obj;
        Map hashMap;
        JSONObject jSONObject = null;
        Bundle bundle = wfVar.c.c.getBundle("sdk_less_server_data");
        if (bundle != null) {
            JSONObject a = wz.a(this.k, new wv().a(wfVar).a(v.n().a(this.k)));
            if (a != null) {
                try {
                    b = com.google.android.gms.ads.c.a.b(this.k);
                } catch (IOException e2) {
                    e = e2;
                    zy.c("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (b != null) {
                        hashMap.put("adid", b.a());
                        hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                    }
                    jSONObject = v.e().a(hashMap);
                    return jSONObject;
                } catch (IllegalStateException e3) {
                    e = e3;
                    zy.c("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (b != null) {
                        hashMap.put("adid", b.a());
                        if (b.b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                    }
                    jSONObject = v.e().a(hashMap);
                    return jSONObject;
                } catch (d e4) {
                    e = e4;
                    zy.c("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (b != null) {
                        hashMap.put("adid", b.a());
                        if (b.b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                    }
                    jSONObject = v.e().a(hashMap);
                    return jSONObject;
                } catch (e e5) {
                    e = e5;
                    zy.c("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (b != null) {
                        hashMap.put("adid", b.a());
                        if (b.b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                    }
                    jSONObject = v.e().a(hashMap);
                    return jSONObject;
                }
                hashMap = new HashMap();
                hashMap.put("request_id", str);
                hashMap.put("request_param", a);
                hashMap.put("data", bundle);
                if (b != null) {
                    hashMap.put("adid", b.a());
                    if (b.b()) {
                    }
                    hashMap.put("lat", Integer.valueOf(b.b() ? 0 : 1));
                }
                try {
                    jSONObject = v.e().a(hashMap);
                } catch (JSONException e6) {
                }
            }
        }
        return jSONObject;
    }

    protected static void a(sr srVar) {
        srVar.a("/loadAd", f);
        srVar.a("/fetchHttpRequest", e);
        srVar.a("/invalidRequest", g);
    }

    protected static void b(sr srVar) {
        srVar.b("/loadAd", f);
        srVar.b("/fetchHttpRequest", e);
        srVar.b("/invalidRequest", g);
    }

    public void a() {
        zy.b("SdkLessAdLoaderBackgroundTask started.");
        wf wfVar = new wf(this.i, null, -1);
        wi a = a(wfVar);
        nx nxVar = null;
        final com.google.android.gms.b.yu.a aVar = new com.google.android.gms.b.yu.a(wfVar, a, null, nxVar, a.e, v.k().b(), a.n, null);
        zx.a.post(new Runnable(this) {
            final /* synthetic */ ws b;

            public void run() {
                this.b.h.a(aVar);
                if (this.b.l != null) {
                    this.b.l.g_();
                    this.b.l = null;
                }
            }
        });
    }

    public void b() {
        synchronized (this.j) {
            zx.a.post(new Runnable(this) {
                final /* synthetic */ ws a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.l != null) {
                        this.a.l.g_();
                        this.a.l = null;
                    }
                }
            });
        }
    }
}
