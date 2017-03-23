package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@vz
public class rr implements rq {
    private final Context a;
    private final aab b;

    @vz
    static class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    @vz
    static class b {
        private final String a;
        private final URL b;
        private final ArrayList<a> c;
        private final String d;

        public b(String str, URL url, ArrayList<a> arrayList, String str2) {
            this.a = str;
            this.b = url;
            if (arrayList == null) {
                this.c = new ArrayList();
            } else {
                this.c = arrayList;
            }
            this.d = str2;
        }

        public String a() {
            return this.a;
        }

        public URL b() {
            return this.b;
        }

        public ArrayList<a> c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }
    }

    @vz
    class c {
        private final d a;
        private final boolean b;
        private final String c;

        public c(rr rrVar, boolean z, d dVar, String str) {
            this.b = z;
            this.a = dVar;
            this.c = str;
        }

        public String a() {
            return this.c;
        }

        public d b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }
    }

    @vz
    static class d {
        private final String a;
        private final int b;
        private final List<a> c;
        private final String d;

        public d(String str, int i, List<a> list, String str2) {
            this.a = str;
            this.b = i;
            if (list == null) {
                this.c = new ArrayList();
            } else {
                this.c = list;
            }
            this.d = str2;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public Iterable<a> c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }
    }

    public rr(Context context, aab com_google_android_gms_b_aab) {
        this.a = context;
        this.b = com_google_android_gms_b_aab;
    }

    protected b a(JSONObject jSONObject) {
        URL url;
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (Throwable e) {
            zy.b("Error constructing http request.", e);
            url = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new b(optString, url, arrayList, optString3);
    }

    protected c a(b bVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.b().openConnection();
            v.e().a(this.a, this.b.b, false, httpURLConnection);
            Iterator it = bVar.c().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                httpURLConnection.addRequestProperty(aVar.a(), aVar.b());
            }
            if (!TextUtils.isEmpty(bVar.d())) {
                httpURLConnection.setDoOutput(true);
                byte[] bytes = bVar.d().getBytes();
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
            }
            List arrayList = new ArrayList();
            if (httpURLConnection.getHeaderFields() != null) {
                for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                    for (String aVar2 : (List) entry.getValue()) {
                        arrayList.add(new a((String) entry.getKey(), aVar2));
                    }
                }
            }
            return new c(this, true, new d(bVar.a(), httpURLConnection.getResponseCode(), arrayList, v.e().a(new InputStreamReader(httpURLConnection.getInputStream()))), null);
        } catch (Exception e) {
            return new c(this, false, null, e.toString());
        }
    }

    protected JSONObject a(d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.a());
            if (dVar.d() != null) {
                jSONObject.put("body", dVar.d());
            }
            JSONArray jSONArray = new JSONArray();
            for (a aVar : dVar.c()) {
                jSONArray.put(new JSONObject().put("key", aVar.a()).put("value", aVar.b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.b());
        } catch (Throwable e) {
            zy.b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    public JSONObject a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            Object obj = "";
            try {
                obj = jSONObject.optString("http_request_id");
                c a = a(a(jSONObject));
                if (a.c()) {
                    jSONObject2.put("response", a(a.b()));
                    jSONObject2.put("success", true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", a.a());
                return jSONObject2;
            } catch (Exception e) {
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (JSONException e2) {
                    return jSONObject2;
                }
            }
        } catch (JSONException e3) {
            zy.c("The request is not a valid JSON.");
            try {
                return new JSONObject().put("success", false);
            } catch (JSONException e4) {
                return new JSONObject();
            }
        }
    }

    public void a(final aaq com_google_android_gms_b_aaq, final Map<String, String> map) {
        zh.a(new Runnable(this) {
            final /* synthetic */ rr c;

            public void run() {
                zy.b("Received Http request.");
                final JSONObject a = this.c.a((String) map.get("http_request"));
                if (a == null) {
                    zy.c("Response should not be null.");
                } else {
                    zi.a.post(new Runnable(this) {
                        final /* synthetic */ AnonymousClass1 b;

                        public void run() {
                            com_google_android_gms_b_aaq.b("fetchHttpRequestCompleted", a);
                            zy.b("Dispatched http response.");
                        }
                    });
                }
            }
        });
    }
}
