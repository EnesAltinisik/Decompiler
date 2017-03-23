package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.b.to.a;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@vz
public final class tu extends a {
    private final b a;
    private tw b;

    public tu(b bVar) {
        this.a = bVar;
    }

    private Bundle a(String str, int i, String str2) {
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        zy.e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    valueOf = (String) keys.next();
                    bundle2.putString(valueOf, jSONObject.getString(valueOf));
                }
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            zy.c("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public com.google.android.gms.a.a a() {
        if (this.a instanceof c) {
            try {
                return com.google.android.gms.a.b.a(((c) this.a).getBannerView());
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
        try {
            ((m) this.a).a((Context) com.google.android.gms.a.b.a(aVar));
        } catch (Throwable th) {
            zy.a("Could not inform adapter of changed context", th);
        }
    }

    public void a(com.google.android.gms.a.a aVar, ns nsVar, String str, tp tpVar) {
        a(aVar, nsVar, str, null, tpVar);
    }

    public void a(com.google.android.gms.a.a aVar, ns nsVar, String str, yh yhVar, String str2) {
        if (this.a instanceof com.google.android.gms.ads.d.a.a) {
            zy.b("Initialize rewarded video adapter.");
            try {
                com.google.android.gms.ads.d.a.a aVar2 = (com.google.android.gms.ads.d.a.a) this.a;
                aVar2.initialize((Context) com.google.android.gms.a.b.a(aVar), new tt(nsVar.b == -1 ? null : new Date(nsVar.b), nsVar.d, nsVar.e != null ? new HashSet(nsVar.e) : null, nsVar.k, nsVar.f, nsVar.g, nsVar.r), str, new yi(yhVar), a(str2, nsVar.g, null), nsVar.m != null ? nsVar.m.getBundle(aVar2.getClass().getName()) : null);
            } catch (Throwable th) {
                zy.c("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(com.google.android.gms.a.a aVar, ns nsVar, String str, String str2, tp tpVar) {
        if (this.a instanceof e) {
            zy.b("Requesting interstitial ad from adapter.");
            try {
                e eVar = (e) this.a;
                eVar.requestInterstitialAd((Context) com.google.android.gms.a.b.a(aVar), new tw(tpVar), a(str, nsVar.g, str2), new tt(nsVar.b == -1 ? null : new Date(nsVar.b), nsVar.d, nsVar.e != null ? new HashSet(nsVar.e) : null, nsVar.k, nsVar.f, nsVar.g, nsVar.r), nsVar.m != null ? nsVar.m.getBundle(eVar.getClass().getName()) : null);
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
        if (this.a instanceof g) {
            try {
                g gVar = (g) this.a;
                tz tzVar = new tz(nsVar.b == -1 ? null : new Date(nsVar.b), nsVar.d, nsVar.e != null ? new HashSet(nsVar.e) : null, nsVar.k, nsVar.f, nsVar.g, qrVar, list, nsVar.r);
                Bundle bundle = nsVar.m != null ? nsVar.m.getBundle(gVar.getClass().getName()) : null;
                this.b = new tw(tpVar);
                gVar.requestNativeAd((Context) com.google.android.gms.a.b.a(aVar), this.b, a(str, nsVar.g, str2), tzVar, bundle);
            } catch (Throwable th) {
                zy.c("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void a(com.google.android.gms.a.a aVar, nx nxVar, ns nsVar, String str, tp tpVar) {
        a(aVar, nxVar, nsVar, str, null, tpVar);
    }

    public void a(com.google.android.gms.a.a aVar, nx nxVar, ns nsVar, String str, String str2, tp tpVar) {
        if (this.a instanceof c) {
            zy.b("Requesting banner ad from adapter.");
            try {
                c cVar = (c) this.a;
                cVar.requestBannerAd((Context) com.google.android.gms.a.b.a(aVar), new tw(tpVar), a(str, nsVar.g, str2), l.a(nxVar.f, nxVar.c, nxVar.b), new tt(nsVar.b == -1 ? null : new Date(nsVar.b), nsVar.d, nsVar.e != null ? new HashSet(nsVar.e) : null, nsVar.k, nsVar.f, nsVar.g, nsVar.r), nsVar.m != null ? nsVar.m.getBundle(cVar.getClass().getName()) : null);
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
        a(nsVar, str, null);
    }

    public void a(ns nsVar, String str, String str2) {
        if (this.a instanceof com.google.android.gms.ads.d.a.a) {
            zy.b("Requesting rewarded video ad from adapter.");
            try {
                com.google.android.gms.ads.d.a.a aVar = (com.google.android.gms.ads.d.a.a) this.a;
                aVar.loadAd(new tt(nsVar.b == -1 ? null : new Date(nsVar.b), nsVar.d, nsVar.e != null ? new HashSet(nsVar.e) : null, nsVar.k, nsVar.f, nsVar.g, nsVar.r), a(str, nsVar.g, str2), nsVar.m != null ? nsVar.m.getBundle(aVar.getClass().getName()) : null);
            } catch (Throwable th) {
                zy.c("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void b() {
        if (this.a instanceof e) {
            zy.b("Showing interstitial from adapter.");
            try {
                ((e) this.a).showInterstitial();
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
            this.a.onDestroy();
        } catch (Throwable th) {
            zy.c("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void d() {
        try {
            this.a.onPause();
        } catch (Throwable th) {
            zy.c("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void e() {
        try {
            this.a.onResume();
        } catch (Throwable th) {
            zy.c("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void f() {
        if (this.a instanceof com.google.android.gms.ads.d.a.a) {
            zy.b("Show rewarded video ad from adapter.");
            try {
                ((com.google.android.gms.ads.d.a.a) this.a).showVideo();
            } catch (Throwable th) {
                zy.c("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public boolean g() {
        if (this.a instanceof com.google.android.gms.ads.d.a.a) {
            zy.b("Check if adapter is initialized.");
            try {
                return ((com.google.android.gms.ads.d.a.a) this.a).isInitialized();
            } catch (Throwable th) {
                zy.c("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public tr h() {
        i a = this.b.a();
        return a instanceof j ? new tx((j) a) : null;
    }

    public ts i() {
        i a = this.b.a();
        return a instanceof k ? new ty((k) a) : null;
    }

    public Bundle j() {
        if (this.a instanceof abe) {
            return ((abe) this.a).a();
        }
        String str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
        zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public Bundle k() {
        if (this.a instanceof abf) {
            return ((abf) this.a).getInterstitialAdapterInfo();
        }
        String str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
        zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public Bundle l() {
        return new Bundle();
    }
}
