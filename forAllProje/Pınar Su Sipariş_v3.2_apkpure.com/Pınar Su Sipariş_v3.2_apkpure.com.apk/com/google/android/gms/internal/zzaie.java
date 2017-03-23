package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import java.lang.Thread.State;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class zzaie {
    private static ThreadFactory zzbRH = Executors.defaultThreadFactory();
    private static zzaid zzbRI = new zzaid() {
        public void zza(Thread thread, String str) {
            thread.setName(str);
        }
    };
    private static final AtomicInteger zzbRx = new AtomicInteger(0);
    private static final Charset zzbRy = Charset.forName(Constants.ENCODING);
    private final int zzalI = zzbRx.incrementAndGet();
    private volatile Socket zzbRA = null;
    private zzaif zzbRB = null;
    private final URI zzbRC;
    private final k zzbRD;
    private final l zzbRE;
    private final j zzbRF;
    private final Thread zzbRG = getThreadFactory().newThread(new Runnable(this) {
        final /* synthetic */ zzaie a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.zzTX();
        }
    });
    private volatile a zzbRz = a.NONE;

    private enum a {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public zzaie(URI uri, String str, Map<String, String> map) {
        this.zzbRC = uri;
        this.zzbRF = new j(uri, str, map);
        this.zzbRD = new k(this);
        this.zzbRE = new l(this, "TubeSock", this.zzalI);
    }

    private Socket createSocket() {
        Throwable th;
        String str;
        String scheme = this.zzbRC.getScheme();
        String host = this.zzbRC.getHost();
        int port = this.zzbRC.getPort();
        String valueOf;
        if (scheme != null && scheme.equals("ws")) {
            try {
                return new Socket(host, port == -1 ? 80 : port);
            } catch (Throwable e) {
                th = e;
                str = "unknown host: ";
                valueOf = String.valueOf(host);
                throw new zzaig(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            } catch (Throwable e2) {
                host = String.valueOf(this.zzbRC);
                throw new zzaig(new StringBuilder(String.valueOf(host).length() + 31).append("error while creating socket to ").append(host).toString(), e2);
            }
        } else if (scheme == null || !scheme.equals("wss")) {
            String str2 = "unsupported protocol: ";
            valueOf = String.valueOf(scheme);
            throw new zzaig(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            if (port == -1) {
                port = 443;
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                scheme = String.valueOf(this.zzbRC);
                throw new zzaig(new StringBuilder(String.valueOf(scheme).length() + 39).append("Error while verifying secure socket to ").append(scheme).toString());
            } catch (Throwable e22) {
                th = e22;
                str = "unknown host: ";
                valueOf = String.valueOf(host);
                throw new zzaig(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            } catch (Throwable e222) {
                host = String.valueOf(this.zzbRC);
                throw new zzaig(new StringBuilder(String.valueOf(host).length() + 38).append("error while creating secure socket to ").append(host).toString(), e222);
            }
        }
    }

    static ThreadFactory getThreadFactory() {
        return zzbRH;
    }

    static zzaid zzTR() {
        return zzbRI;
    }

    private synchronized void zzTU() {
        if (this.zzbRz != a.DISCONNECTED) {
            this.zzbRD.b();
            this.zzbRE.a();
            if (this.zzbRA != null) {
                try {
                    this.zzbRA.close();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            this.zzbRz = a.DISCONNECTED;
            this.zzbRB.onClose();
        }
    }

    private void zzTV() {
        try {
            this.zzbRz = a.DISCONNECTING;
            this.zzbRE.a();
            this.zzbRE.a((byte) 8, true, new byte[0]);
        } catch (Throwable e) {
            this.zzbRB.zza(new zzaig("Failed to send close frame", e));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zzTX() {
        /*
        r11 = this;
        r4 = 1;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = 0;
        r0 = r11.createSocket();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        monitor-enter(r11);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r11.zzbRA = r0;	 Catch:{ all -> 0x0025 }
        r2 = r11.zzbRz;	 Catch:{ all -> 0x0025 }
        r3 = com.google.android.gms.internal.zzaie.a.DISCONNECTED;	 Catch:{ all -> 0x0025 }
        if (r2 != r3) goto L_0x0032;
    L_0x0011:
        r0 = r11.zzbRA;	 Catch:{ IOException -> 0x001e }
        r0.close();	 Catch:{ IOException -> 0x001e }
        r0 = 0;
        r11.zzbRA = r0;	 Catch:{ all -> 0x0025 }
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        r11.close();
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0025 }
        r1.<init>(r0);	 Catch:{ all -> 0x0025 }
        throw r1;	 Catch:{ all -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        throw r0;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
    L_0x0028:
        r0 = move-exception;
        r1 = r11.zzbRB;	 Catch:{ all -> 0x00e1 }
        r1.zza(r0);	 Catch:{ all -> 0x00e1 }
        r11.close();
        goto L_0x001d;
    L_0x0032:
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        r5 = new java.io.DataInputStream;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r2 = r0.getInputStream();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r5.<init>(r2);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r6 = r0.getOutputStream();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzbRF;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r0.a();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r6.write(r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = new byte[r0];	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r7 = new java.util.ArrayList;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r7.<init>();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r1;
        r3 = r1;
    L_0x0054:
        if (r3 != 0) goto L_0x00ec;
    L_0x0056:
        r8 = r5.read();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r9 = -1;
        if (r8 != r9) goto L_0x0088;
    L_0x005d:
        r0 = new com.google.android.gms.internal.zzaig;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r1 = "Connection closed before handshake was complete";
        r0.<init>(r1);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        throw r0;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        r2 = r11.zzbRB;	 Catch:{ all -> 0x00e1 }
        r3 = new com.google.android.gms.internal.zzaig;	 Catch:{ all -> 0x00e1 }
        r4 = "error while connecting: ";
        r1 = r0.getMessage();	 Catch:{ all -> 0x00e1 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00e1 }
        r5 = r1.length();	 Catch:{ all -> 0x00e1 }
        if (r5 == 0) goto L_0x014d;
    L_0x007a:
        r1 = r4.concat(r1);	 Catch:{ all -> 0x00e1 }
    L_0x007e:
        r3.<init>(r1, r0);	 Catch:{ all -> 0x00e1 }
        r2.zza(r3);	 Catch:{ all -> 0x00e1 }
        r11.close();
        goto L_0x001d;
    L_0x0088:
        r8 = (byte) r8;
        r2[r0] = r8;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r0 + 1;
        r8 = r0 + -1;
        r8 = r2[r8];	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r9 = 10;
        if (r8 != r9) goto L_0x00c2;
    L_0x0095:
        r8 = r0 + -2;
        r8 = r2[r8];	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r9 = 13;
        if (r8 != r9) goto L_0x00c2;
    L_0x009d:
        r0 = new java.lang.String;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r8 = zzbRy;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2, r8);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r2 = r0.trim();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r8 = "";
        r2 = r2.equals(r8);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        if (r2 == 0) goto L_0x00b9;
    L_0x00b0:
        r2 = r4;
    L_0x00b1:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = new byte[r0];	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r3 = r2;
        r2 = r0;
        r0 = r1;
        goto L_0x0054;
    L_0x00b9:
        r0 = r0.trim();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r7.add(r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r2 = r3;
        goto L_0x00b1;
    L_0x00c2:
        if (r0 != r10) goto L_0x0054;
    L_0x00c4:
        r0 = new java.lang.String;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r1 = zzbRy;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2, r1);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r1 = new com.google.android.gms.internal.zzaig;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r2 = "Unexpected long line in handshake: ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r3 = r0.length();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        if (r3 == 0) goto L_0x00e6;
    L_0x00d9:
        r0 = r2.concat(r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
    L_0x00dd:
        r1.<init>(r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        throw r1;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
    L_0x00e1:
        r0 = move-exception;
        r11.close();
        throw r0;
    L_0x00e6:
        r0 = new java.lang.String;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        goto L_0x00dd;
    L_0x00ec:
        r1 = r11.zzbRF;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = 0;
        r0 = r7.get(r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = (java.lang.String) r0;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r1.a(r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = 0;
        r7.remove(r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r1 = new java.util.HashMap;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r1.<init>();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r2 = r7.iterator();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
    L_0x0105:
        r0 = r2.hasNext();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        if (r0 == 0) goto L_0x0122;
    L_0x010b:
        r0 = r2.next();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = (java.lang.String) r0;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r3 = ": ";
        r4 = 2;
        r0 = r0.split(r3, r4);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r3 = 0;
        r3 = r0[r3];	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r4 = 1;
        r0 = r0[r4];	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r1.put(r3, r0);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        goto L_0x0105;
    L_0x0122:
        r0 = r11.zzbRF;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.a(r1);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzbRE;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.a(r6);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzbRD;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.a(r5);	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = com.google.android.gms.internal.zzaie.a.CONNECTED;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r11.zzbRz = r0;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzbRE;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r0.b();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.start();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzbRB;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.zzQC();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzbRD;	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r0.a();	 Catch:{ zzaig -> 0x0028, IOException -> 0x0065 }
        r11.close();
        goto L_0x001d;
    L_0x014d:
        r1 = new java.lang.String;	 Catch:{ all -> 0x00e1 }
        r1.<init>(r4);	 Catch:{ all -> 0x00e1 }
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaie.zzTX():void");
    }

    private synchronized void zza(byte b, byte[] bArr) {
        if (this.zzbRz != a.CONNECTED) {
            this.zzbRB.zza(new zzaig("error while sending data: not connected"));
        } else {
            try {
                this.zzbRE.a(b, true, bArr);
            } catch (Throwable e) {
                this.zzbRB.zza(new zzaig("Failed to send frame", e));
                close();
            }
        }
    }

    public static void zza(ThreadFactory threadFactory, zzaid com_google_android_gms_internal_zzaid) {
        zzbRH = threadFactory;
        zzbRI = com_google_android_gms_internal_zzaid;
    }

    public synchronized void close() {
        switch (this.zzbRz) {
            case NONE:
                this.zzbRz = a.DISCONNECTED;
                break;
            case CONNECTING:
                zzTU();
                break;
            case CONNECTED:
                zzTV();
                break;
        }
    }

    public synchronized void connect() {
        if (this.zzbRz != a.NONE) {
            this.zzbRB.zza(new zzaig("connect() already called"));
            close();
        } else {
            zzaid zzTR = zzTR();
            Thread zzTY = zzTY();
            String valueOf = String.valueOf("TubeSockReader-");
            zzTR.zza(zzTY, new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.zzalI).toString());
            this.zzbRz = a.CONNECTING;
            zzTY().start();
        }
    }

    synchronized void zzK(byte[] bArr) {
        zza((byte) 10, bArr);
    }

    zzaif zzTS() {
        return this.zzbRB;
    }

    void zzTT() {
        zzTU();
    }

    public void zzTW() throws InterruptedException {
        if (this.zzbRE.b().getState() != State.NEW) {
            this.zzbRE.b().join();
        }
        zzTY().join();
    }

    Thread zzTY() {
        return this.zzbRG;
    }

    public void zza(zzaif com_google_android_gms_internal_zzaif) {
        this.zzbRB = com_google_android_gms_internal_zzaif;
    }

    void zzb(zzaig com_google_android_gms_internal_zzaig) {
        this.zzbRB.zza(com_google_android_gms_internal_zzaig);
        if (this.zzbRz == a.CONNECTED) {
            close();
        }
        zzTU();
    }

    public synchronized void zzhZ(String str) {
        zza((byte) 1, str.getBytes(zzbRy));
    }
}
