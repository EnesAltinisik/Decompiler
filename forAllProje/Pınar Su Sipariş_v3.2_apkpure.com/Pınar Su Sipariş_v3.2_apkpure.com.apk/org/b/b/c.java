package org.b.b;

import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import org.b.a;

/* compiled from: HttpsServiceConnectionSE */
public class c implements e {
    private HttpsURLConnection a;

    public c(Proxy proxy, String str, int i, String str2, int i2) throws IOException {
        if (proxy == null) {
            this.a = (HttpsURLConnection) new URL(Constants.SCHEME, str, i, str2).openConnection();
        } else {
            this.a = (HttpsURLConnection) new URL(Constants.SCHEME, str, i, str2).openConnection(proxy);
        }
        this.a = (HttpsURLConnection) new URL(Constants.SCHEME, str, i, str2).openConnection();
        b(i2);
    }

    private void b(int i) {
        this.a.setConnectTimeout(i);
        this.a.setReadTimeout(i);
        this.a.setUseCaches(false);
        this.a.setDoOutput(true);
        this.a.setDoInput(true);
    }

    public void a() {
        this.a.disconnect();
    }

    public List b() {
        Map headerFields = this.a.getHeaderFields();
        Set<String> keySet = headerFields.keySet();
        List linkedList = new LinkedList();
        for (String str : keySet) {
            List list = (List) headerFields.get(str);
            for (int i = 0; i < list.size(); i++) {
                linkedList.add(new a(str, (String) list.get(i)));
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
