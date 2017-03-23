package com.google.android.gms.b;

import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class abk implements abm {
    protected final HttpClient a;

    public static final class a extends HttpEntityEnclosingRequestBase {
        public a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public abk(HttpClient httpClient) {
        this.a = httpClient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, tv<?> tvVar) {
        byte[] k = tvVar.k();
        if (k != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(k));
        }
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    static HttpUriRequest b(tv<?> tvVar, Map<String, String> map) {
        HttpEntityEnclosingRequestBase httpPost;
        switch (tvVar.a()) {
            case -1:
                byte[] h = tvVar.h();
                if (h == null) {
                    return new HttpGet(tvVar.c());
                }
                HttpUriRequest httpPost2 = new HttpPost(tvVar.c());
                httpPost2.addHeader("Content-Type", tvVar.g());
                httpPost2.setEntity(new ByteArrayEntity(h));
                return httpPost2;
            case 0:
                return new HttpGet(tvVar.c());
            case 1:
                httpPost = new HttpPost(tvVar.c());
                httpPost.addHeader("Content-Type", tvVar.j());
                a(httpPost, (tv) tvVar);
                return httpPost;
            case 2:
                httpPost = new HttpPut(tvVar.c());
                httpPost.addHeader("Content-Type", tvVar.j());
                a(httpPost, (tv) tvVar);
                return httpPost;
            case 3:
                return new HttpDelete(tvVar.c());
            case 4:
                return new HttpHead(tvVar.c());
            case 5:
                return new HttpOptions(tvVar.c());
            case 6:
                return new HttpTrace(tvVar.c());
            case 7:
                httpPost = new a(tvVar.c());
                httpPost.addHeader("Content-Type", tvVar.j());
                a(httpPost, (tv) tvVar);
                return httpPost;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    public HttpResponse a(tv<?> tvVar, Map<String, String> map) {
        HttpUriRequest b = b(tvVar, map);
        a(b, (Map) map);
        a(b, tvVar.f());
        HttpParams params = b.getParams();
        int n = tvVar.n();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, n);
        return this.a.execute(b);
    }
}
