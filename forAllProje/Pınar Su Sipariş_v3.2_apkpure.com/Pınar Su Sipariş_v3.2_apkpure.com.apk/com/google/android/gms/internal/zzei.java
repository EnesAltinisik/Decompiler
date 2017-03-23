package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.plus.PlusShare;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
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

@zzig
public class zzei implements zzeh {
    private final Context mContext;
    private final VersionInfoParcel zzqP;

    @zzig
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

    @zzig
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

    @zzig
    class c {
        final /* synthetic */ zzei a;
        private final d b;
        private final boolean c;
        private final String d;

        public c(zzei com_google_android_gms_internal_zzei, boolean z, d dVar, String str) {
            this.a = com_google_android_gms_internal_zzei;
            this.c = z;
            this.b = dVar;
            this.d = str;
        }

        public String a() {
            return this.d;
        }

        public d b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }

    @zzig
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

    public zzei(Context context, VersionInfoParcel versionInfoParcel) {
        this.mContext = context;
        this.zzqP = versionInfoParcel;
    }

    public JSONObject zzV(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            Object obj = "";
            try {
                obj = jSONObject.optString("http_request_id");
                c zza = zza(zzc(jSONObject));
                if (zza.c()) {
                    jSONObject2.put("response", zza(zza.b()));
                    jSONObject2.put("success", true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", zza.a());
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
            zzb.e("The request is not a valid JSON.");
            try {
                return new JSONObject().put("success", false);
            } catch (JSONException e4) {
                return new JSONObject();
            }
        }
    }

    protected c zza(b bVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.b().openConnection();
            zzu.zzck().zza(this.mContext, this.zzqP.afmaVersion, false, httpURLConnection);
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
            return new c(this, true, new d(bVar.a(), httpURLConnection.getResponseCode(), arrayList, zzu.zzck().zza(new InputStreamReader(httpURLConnection.getInputStream()))), null);
        } catch (Exception e) {
            return new c(this, false, null, e.toString());
        }
    }

    protected JSONObject zza(d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.a());
            if (dVar.d() != null) {
                jSONObject.put("body", dVar.d());
            }
            JSONArray jSONArray = new JSONArray();
            for (a aVar : dVar.c()) {
                jSONArray.put(new JSONObject().put("key", aVar.a()).put(Param.VALUE, aVar.b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.b());
        } catch (Throwable e) {
            zzb.zzb("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    public void zza(final zzla com_google_android_gms_internal_zzla, final Map<String, String> map) {
        zzjz.zza(new Runnable(this) {
            final /* synthetic */ zzei c;

            public void run() {
                zzb.zzaU("Received Http request.");
                final JSONObject zzV = this.c.zzV((String) map.get("http_request"));
                if (zzV == null) {
                    zzb.e("Response should not be null.");
                } else {
                    zzka.zzQu.post(new Runnable(this) {
                        final /* synthetic */ AnonymousClass1 b;

                        public void run() {
                            com_google_android_gms_internal_zzla.zzb("fetchHttpRequestCompleted", zzV);
                            zzb.zzaU("Dispatched http response.");
                        }
                    });
                }
            }
        });
    }

    protected b zzc(JSONObject jSONObject) {
        URL url;
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString(PlusShare.KEY_CALL_TO_ACTION_URL);
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (Throwable e) {
            zzb.zzb("Error constructing http request.", e);
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
                arrayList.add(new a(optJSONObject.optString("key"), optJSONObject.optString(Param.VALUE)));
            }
        }
        return new b(optString, url, arrayList, optString3);
    }
}
