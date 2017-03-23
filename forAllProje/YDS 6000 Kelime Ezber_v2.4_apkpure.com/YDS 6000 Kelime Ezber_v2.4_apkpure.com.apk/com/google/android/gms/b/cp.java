package com.google.android.gms.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class cp extends cy {

    interface a {
        void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map);
    }

    private static class b implements Runnable {
        private final a a;
        private final int b;
        private final Throwable c;
        private final byte[] d;
        private final String e;
        private final Map<String, List<String>> f;

        private b(String str, a aVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
            com.google.android.gms.common.internal.c.a((Object) aVar);
            this.a = aVar;
            this.b = i;
            this.c = th;
            this.d = bArr;
            this.e = str;
            this.f = map;
        }

        public void run() {
            this.a.a(this.e, this.b, this.c, this.d, this.f);
        }
    }

    private class c implements Runnable {
        final /* synthetic */ cp a;
        private final URL b;
        private final byte[] c;
        private final a d;
        private final String e;
        private final Map<String, String> f;

        public c(cp cpVar, String str, URL url, byte[] bArr, Map<String, String> map, a aVar) {
            this.a = cpVar;
            com.google.android.gms.common.internal.c.a(str);
            com.google.android.gms.common.internal.c.a((Object) url);
            com.google.android.gms.common.internal.c.a((Object) aVar);
            this.b = url;
            this.c = bArr;
            this.d = aVar;
            this.e = str;
            this.f = map;
        }

        public void run() {
            HttpURLConnection a;
            OutputStream outputStream;
            Throwable e;
            Map map;
            int i;
            HttpURLConnection httpURLConnection;
            Throwable th;
            Map map2;
            this.a.d();
            int i2 = 0;
            try {
                a = this.a.a(this.b);
                try {
                    if (this.f != null) {
                        for (Entry entry : this.f.entrySet()) {
                            a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    if (this.c != null) {
                        byte[] a2 = this.a.q().a(this.c);
                        this.a.u().D().a("Uploading data. size", Integer.valueOf(a2.length));
                        a.setDoOutput(true);
                        a.addRequestProperty("Content-Encoding", "gzip");
                        a.setFixedLengthStreamingMode(a2.length);
                        a.connect();
                        outputStream = a.getOutputStream();
                        try {
                            outputStream.write(a2);
                            outputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            map = null;
                            i = 0;
                            httpURLConnection = a;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    this.a.u().x().a("Error closing HTTP compressed POST connection output stream. appId", co.a(this.e), e3);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.a.t().a(new b(this.e, this.d, i, e, null, map));
                        } catch (Throwable th2) {
                            th = th2;
                            map2 = null;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e32) {
                                    this.a.u().x().a("Error closing HTTP compressed POST connection output stream. appId", co.a(this.e), e32);
                                }
                            }
                            if (a != null) {
                                a.disconnect();
                            }
                            this.a.t().a(new b(this.e, this.d, i2, null, null, map2));
                            throw th;
                        }
                    }
                    i2 = a.getResponseCode();
                    map2 = a.getHeaderFields();
                } catch (IOException e4) {
                    e = e4;
                    map = null;
                    i = i2;
                    outputStream = null;
                    httpURLConnection = a;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.a.t().a(new b(this.e, this.d, i, e, null, map));
                } catch (Throwable th3) {
                    th = th3;
                    map2 = null;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    this.a.t().a(new b(this.e, this.d, i2, null, null, map2));
                    throw th;
                }
                try {
                    byte[] a3 = this.a.a(a);
                    if (a != null) {
                        a.disconnect();
                    }
                    this.a.t().a(new b(this.e, this.d, i2, null, a3, map2));
                } catch (IOException e5) {
                    e = e5;
                    map = map2;
                    i = i2;
                    outputStream = null;
                    httpURLConnection = a;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.a.t().a(new b(this.e, this.d, i, e, null, map));
                } catch (Throwable th32) {
                    th = th32;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    this.a.t().a(new b(this.e, this.d, i2, null, null, map2));
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                map = null;
                i = 0;
                outputStream = null;
                httpURLConnection = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.a.t().a(new b(this.e, this.d, i, e, null, map));
            } catch (Throwable th322) {
                th = th322;
                map2 = null;
                a = null;
                outputStream = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                this.a.t().a(new b(this.e, this.d, i2, null, null, map2));
                throw th;
            }
        }
    }

    public cp(cv cvVar) {
        super(cvVar);
    }

    private byte[] a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            return toByteArray;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    protected HttpURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            w().L();
            httpURLConnection.setConnectTimeout(60000);
            w().M();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    protected void a() {
    }

    public void a(String str, URL url, Map<String, String> map, a aVar) {
        e();
        Q();
        com.google.android.gms.common.internal.c.a((Object) url);
        com.google.android.gms.common.internal.c.a((Object) aVar);
        t().b(new c(this, str, url, null, map, aVar));
    }

    public void a(String str, URL url, byte[] bArr, Map<String, String> map, a aVar) {
        e();
        Q();
        com.google.android.gms.common.internal.c.a((Object) url);
        com.google.android.gms.common.internal.c.a((Object) bArr);
        com.google.android.gms.common.internal.c.a((Object) aVar);
        t().b(new c(this, str, url, bArr, map, aVar));
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ cb j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ dc k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.c m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ Context n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ cm o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ bz p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ dl q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ ct r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ de s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ cu t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ co u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ cr v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ by w() {
        return super.w();
    }

    public boolean x() {
        NetworkInfo activeNetworkInfo;
        Q();
        try {
            activeNetworkInfo = ((ConnectivityManager) n().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
