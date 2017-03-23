package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzaa;

public class zzmv implements ProxyApi {
    public PendingResult<ProxyResult> performProxyRequest(GoogleApiClient googleApiClient, final ProxyRequest proxyRequest) {
        zzaa.zzz(googleApiClient);
        zzaa.zzz(proxyRequest);
        return googleApiClient.zzd(new ad(this, googleApiClient) {
            final /* synthetic */ zzmv b;

            protected void a(Context context, zzmt com_google_android_gms_internal_zzmt) throws RemoteException {
                com_google_android_gms_internal_zzmt.zza(new zzmq(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void zza(ProxyResponse proxyResponse) {
                        this.a.zzb(new ae(proxyResponse));
                    }
                }, proxyRequest);
            }
        });
    }
}
