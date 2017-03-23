package com.google.android.gms.b;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.f;
import com.google.ads.mediation.h;
import com.google.ads.mediation.i;
import com.google.android.gms.a.b;
import com.google.android.gms.b.to.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@vz
public final class ua<NETWORK_EXTRAS extends i, SERVER_PARAMETERS extends h> extends a {
    private final c<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
    private final NETWORK_EXTRAS b;

    public ua(c<NETWORK_EXTRAS, SERVER_PARAMETERS> cVar, NETWORK_EXTRAS network_extras) {
        this.a = cVar;
        this.b = network_extras;
    }

    private SERVER_PARAMETERS a(String str, int i, String str2) {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap.put(str3, jSONObject.getString(str3));
                }
            } catch (Throwable th) {
                zy.c("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class c = this.a.c();
        if (c == null) {
            return null;
        }
        h hVar = (h) c.newInstance();
        hVar.a(hashMap);
        return hVar;
    }

    public com.google.android.gms.a.a a() {
        if (this.a instanceof d) {
            try {
                return b.a(((d) this.a).d());
            } catch (Throwable th) {
                zy.c("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void a(com.google.android.gms.a.a aVar) {
    }

    public void a(com.google.android.gms.a.a aVar, ns nsVar, String str, tp tpVar) {
        a(aVar, nsVar, str, null, tpVar);
    }

    public void a(com.google.android.gms.a.a aVar, ns nsVar, String str, yh yhVar, String str2) {
    }

    public void a(com.google.android.gms.a.a aVar, ns nsVar, String str, String str2, tp tpVar) {
        if (this.a instanceof f) {
            zy.b("Requesting interstitial ad from adapter.");
            try {
                ((f) this.a).a(new ub(tpVar), (Activity) b.a(aVar), a(str, nsVar.g, str2), uc.a(nsVar), this.b);
            } catch (Throwable th) {
                zy.c("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(com.google.android.gms.a.a aVar, ns nsVar, String str, String str2, tp tpVar, qr qrVar, List<String> list) {
    }

    public void a(com.google.android.gms.a.a aVar, nx nxVar, ns nsVar, String str, tp tpVar) {
        a(aVar, nxVar, nsVar, str, null, tpVar);
    }

    public void a(com.google.android.gms.a.a aVar, nx nxVar, ns nsVar, String str, String str2, tp tpVar) {
        if (this.a instanceof d) {
            zy.b("Requesting banner ad from adapter.");
            try {
                ((d) this.a).a(new ub(tpVar), (Activity) b.a(aVar), a(str, nsVar.g, str2), uc.a(nxVar), uc.a(nsVar), this.b);
            } catch (Throwable th) {
                zy.c("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(ns nsVar, String str) {
    }

    public void a(ns nsVar, String str, String str2) {
    }

    public void b() {
        if (this.a instanceof f) {
            zy.b("Showing interstitial from adapter.");
            try {
                ((f) this.a).e();
            } catch (Throwable th) {
                zy.c("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void c() {
        try {
            this.a.a();
        } catch (Throwable th) {
            zy.c("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void d() {
        throw new RemoteException();
    }

    public void e() {
        throw new RemoteException();
    }

    public void f() {
    }

    public boolean g() {
        return true;
    }

    public tr h() {
        return null;
    }

    public ts i() {
        return null;
    }

    public Bundle j() {
        return new Bundle();
    }

    public Bundle k() {
        return new Bundle();
    }

    public Bundle l() {
        return new Bundle();
    }
}
