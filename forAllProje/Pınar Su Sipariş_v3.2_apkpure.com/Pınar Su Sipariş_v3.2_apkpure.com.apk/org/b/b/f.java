package org.b.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.b.a;

/* compiled from: ServiceConnectionSE */
public class f implements e {
    private HttpURLConnection a;

    public f(Proxy proxy, String str, int i) throws IOException {
        this.a = proxy == null ? (HttpURLConnection) new URL(str).openConnection() : (HttpURLConnection) new URL(str).openConnection(proxy);
        this.a.setUseCaches(false);
        this.a.setDoOutput(true);
        this.a.setDoInput(true);
        this.a.setConnectTimeout(i);
        this.a.setReadTimeout(i);
    }

    public void a() {
        this.a.disconnect();
    }

    public List b() throws IOException {
        List linkedList = new LinkedList();
        Map headerFields = this.a.getHeaderFields();
        if (headerFields != null) {
            for (String str : headerFields.keySet()) {
                List list = (List) headerFields.get(str);
                for (int i = 0; i < list.size(); i++) {
                    linkedList.add(new a(str, (String) list.get(i)));
                }
            }
        }
        return linkedList;
    }

    public int c() throws IOException {
        return this.a.getResponseCode();
    }

    public void a(String str, String str2) {
        this.a.setRequestProperty(str, str2);
    }

    public void a(String str) throws IOException {
        this.a.setRequestMethod(str);
    }

    public void a(int i) {
        this.a.setFixedLengthStreamingMode(i);
    }

    public OutputStream d() throws IOException {
        return this.a.getOutputStream();
    }

    public InputStream e() throws IOException {
        return this.a.getInputStream();
    }

    public InputStream f() {
        return this.a.getErrorStream();
    }
}
