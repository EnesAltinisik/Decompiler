package com.pinarsu.siparis.api;

import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.R;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class TrustManagerManipulator implements X509TrustManager {
    private static final X509Certificate[] acceptedIssuers = new X509Certificate[0];
    private static TrustManagerFactory factory;

    public boolean isClientTrusted(X509Certificate[] x509CertificateArr) {
        return true;
    }

    public boolean isServerTrusted(X509Certificate[] x509CertificateArr) {
        return true;
    }

    public static void allowAllSSL() {
        SSLContext instance;
        NoSuchAlgorithmException e;
        KeyManagementException e2;
        try {
            Certificate loadCertificate = loadCertificate();
            if (checkValidity(loadCertificate)) {
                createTrustManager(createKeyStore(loadCertificate));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            instance = SSLContext.getInstance("TLS");
            try {
                instance.init(null, factory.getTrustManagers(), new SecureRandom());
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                e.printStackTrace();
                HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
            } catch (KeyManagementException e5) {
                e2 = e5;
                e2.printStackTrace();
                HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
            }
        } catch (NoSuchAlgorithmException e6) {
            NoSuchAlgorithmException noSuchAlgorithmException = e6;
            instance = null;
            e = noSuchAlgorithmException;
            e.printStackTrace();
            HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
        } catch (KeyManagementException e7) {
            KeyManagementException keyManagementException = e7;
            instance = null;
            e2 = keyManagementException;
            e2.printStackTrace();
            HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
        }
        HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return acceptedIssuers;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.Certificate loadCertificate() {
        /*
        r2 = 0;
        r1 = "X.509";
        r1 = java.security.cert.CertificateFactory.getInstance(r1);	 Catch:{ CertificateException -> 0x003e }
    L_0x0007:
        r3 = com.pinarsu.siparis.MyApplication.getInstance();
        r3 = r3.getResources();
        r4 = 2131034113; // 0x7f050001 float:1.7678734E38 double:1.0528707453E-314;
        r3 = r3.openRawResource(r4);
        r2 = r1.generateCertificate(r3);	 Catch:{ CertificateException -> 0x0049 }
        r4 = java.lang.System.out;	 Catch:{ CertificateException -> 0x0049 }
        r1 = new java.lang.StringBuilder;	 Catch:{ CertificateException -> 0x0049 }
        r1.<init>();	 Catch:{ CertificateException -> 0x0049 }
        r5 = "ca=";
        r5 = r1.append(r5);	 Catch:{ CertificateException -> 0x0049 }
        r0 = r2;
        r0 = (java.security.cert.X509Certificate) r0;	 Catch:{ CertificateException -> 0x0049 }
        r1 = r0;
        r1 = r1.getSubjectDN();	 Catch:{ CertificateException -> 0x0049 }
        r1 = r5.append(r1);	 Catch:{ CertificateException -> 0x0049 }
        r1 = r1.toString();	 Catch:{ CertificateException -> 0x0049 }
        r4.println(r1);	 Catch:{ CertificateException -> 0x0049 }
        r3.close();	 Catch:{ IOException -> 0x0044 }
    L_0x003d:
        return r2;
    L_0x003e:
        r1 = move-exception;
        r1.printStackTrace();
        r1 = r2;
        goto L_0x0007;
    L_0x0044:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x003d;
    L_0x0049:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ all -> 0x0056 }
        r3.close();	 Catch:{ IOException -> 0x0051 }
        goto L_0x003d;
    L_0x0051:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x003d;
    L_0x0056:
        r1 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x005b }
    L_0x005a:
        throw r1;
    L_0x005b:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinarsu.siparis.api.TrustManagerManipulator.loadCertificate():java.security.cert.Certificate");
    }

    public static boolean checkValidity(Certificate certificate) {
        Date date = new Date();
        if (((X509Certificate) certificate).getNotBefore().getTime() > date.getTime()) {
            return false;
        }
        if (!((X509Certificate) certificate).getSubjectDN().getName().equals(MyApplication.getInstance().getString(R.string.certificate_subject))) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(5, 15);
        return ((X509Certificate) certificate).getNotAfter().getTime() >= instance.getTime().getTime();
    }

    public static KeyStore createKeyStore(Certificate certificate) {
        KeyStore instance;
        Exception e;
        try {
            instance = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                instance.load(null, null);
                instance.setCertificateEntry("ca", certificate);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return instance;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            instance = null;
            e = exception;
            e.printStackTrace();
            return instance;
        }
        return instance;
    }

    public static void createTrustManager(KeyStore keyStore) {
        TrustManagerFactory instance;
        Exception e;
        try {
            instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            try {
                instance.init(keyStore);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                factory = instance;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            instance = null;
            e = exception;
            e.printStackTrace();
            factory = instance;
        }
        factory = instance;
    }
}
