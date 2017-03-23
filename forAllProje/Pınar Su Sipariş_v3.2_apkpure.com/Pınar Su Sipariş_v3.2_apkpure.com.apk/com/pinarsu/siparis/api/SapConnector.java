package com.pinarsu.siparis.api;

import android.util.Log;
import com.google.android.gms.appinvite.PreviewActivity;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.api.service.ServiceErrorItem;
import com.pinarsu.siparis.interfaces.ISapResponseListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import org.b.a;
import org.b.a.h;
import org.b.a.j;
import org.b.b;
import org.b.c;
import org.xmlpull.v1.XmlPullParserException;

public class SapConnector {
    static final boolean isTest = false;
    private final String NO_INTERNET_CONNECTION = "Bağlantı yapılamadı. Lütfen internet bağlantınızı kontrol ediniz.";
    private final String SERVICE_ERROR = "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz.";
    private String USERNAME;
    private String USERPASS;
    private String file;
    private String host;
    private int port;

    public void connect(h hVar, ISapResponseListener iSapResponseListener) throws Exception {
        AuthTransportSE authTransportSE;
        Throwable th;
        Throwable th2;
        this.USERNAME = MyApplication.getInstance().getServiceLiveUserName();
        this.USERPASS = MyApplication.getInstance().getServiceLiveUserPass();
        this.host = MyApplication.getInstance().getServiceLiveURLHost();
        this.port = Integer.parseInt(MyApplication.getInstance().getServiceLiveURLPort());
        this.file = MyApplication.getInstance().getServiceLiveURLFile();
        AuthTransportSE authTransportSE2 = null;
        try {
            b jVar = new j(110);
            jVar.p = false;
            jVar.e = "http://schemas.xmlsoap.org/soap/envelope/";
            jVar.b = hVar;
            jVar.o = true;
            List arrayList = new ArrayList();
            arrayList.add(new a("Connection", PreviewActivity.ON_CLICK_LISTENER_CLOSE));
            arrayList.add(new a("Authorization", "Basic " + org.a.a.a.a((this.USERNAME + ":" + this.USERPASS).getBytes())));
            jVar.a(hVar);
            TrustManagerManipulator.allowAllSSL();
            authTransportSE = new AuthTransportSE(this.host, this.port, this.file, 120000);
            try {
                authTransportSE.debug = true;
                authTransportSE.setXmlVersionTag("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
                authTransportSE.call("", jVar, arrayList);
                Log.d("MNTTAG", "aht.requestDump : " + authTransportSE.requestDump);
                if (jVar.a instanceof h) {
                    iSapResponseListener.onSuccessfullResult((h) jVar.a);
                } else {
                    iSapResponseListener.onUnsuccessfullResult(getSoapErrorMessage((c) jVar.a));
                }
                authTransportSE.reset();
            } catch (c e) {
                authTransportSE2 = authTransportSE;
                try {
                    iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz."));
                    authTransportSE2.reset();
                } catch (Throwable th3) {
                    th = th3;
                    authTransportSE = authTransportSE2;
                    th2 = th;
                    authTransportSE.reset();
                    throw th2;
                }
            } catch (XmlPullParserException e2) {
                authTransportSE2 = authTransportSE;
                iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz."));
                authTransportSE2.reset();
            } catch (UnknownHostException e3) {
                authTransportSE2 = authTransportSE;
                iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Bağlantı yapılamadı. Lütfen internet bağlantınızı kontrol ediniz."));
                authTransportSE2.reset();
            } catch (IOException e4) {
                authTransportSE2 = authTransportSE;
                iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz."));
                authTransportSE2.reset();
            } catch (Exception e5) {
                authTransportSE2 = authTransportSE;
                iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz."));
                authTransportSE2.reset();
            } catch (Throwable th4) {
                th2 = th4;
                authTransportSE.reset();
                throw th2;
            }
        } catch (c e6) {
            iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz."));
            authTransportSE2.reset();
        } catch (XmlPullParserException e7) {
            iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz."));
            authTransportSE2.reset();
        } catch (UnknownHostException e8) {
            iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Bağlantı yapılamadı. Lütfen internet bağlantınızı kontrol ediniz."));
            authTransportSE2.reset();
        } catch (IOException e9) {
            iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz."));
            authTransportSE2.reset();
        } catch (Exception e10) {
            iSapResponseListener.onUnsuccessfullResult(new ServiceErrorItem("", "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz."));
            authTransportSE2.reset();
        } catch (Throwable th32) {
            th = th32;
            authTransportSE = null;
            th2 = th;
            authTransportSE.reset();
            throw th2;
        }
    }

    private ServiceErrorItem getSoapErrorMessage(c cVar) {
        ServiceErrorItem serviceErrorItem = new ServiceErrorItem();
        try {
            org.c.b.a aVar = (org.c.b.a) ((org.c.b.a) cVar.d.f(0)).f(0);
            org.c.b.a aVar2 = (org.c.b.a) aVar.f(0);
            serviceErrorItem.title = aVar2.h(0);
            Log.d("MNTTAG", "textTitleElement : " + aVar2.h(0));
            serviceErrorItem.detail = ((org.c.b.a) aVar.f(1)).h(0);
            serviceErrorItem.isCrashed = false;
        } catch (Exception e) {
            serviceErrorItem.detail = cVar.b;
        }
        return serviceErrorItem;
    }
}
