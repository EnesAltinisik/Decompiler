package com.google.android.gms.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzaa;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zznr extends zznu {
    private final SparseArray<a> zzalH = new SparseArray();

    private class a implements OnConnectionFailedListener {
        public final int a;
        public final GoogleApiClient b;
        public final OnConnectionFailedListener c;
        final /* synthetic */ zznr d;

        public a(zznr com_google_android_gms_internal_zznr, int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
            this.d = com_google_android_gms_internal_zznr;
            this.a = i;
            this.b = googleApiClient;
            this.c = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        public void a() {
            this.b.unregisterConnectionFailedListener(this);
            this.b.disconnect();
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.append(str).append("GoogleApiClient #").print(this.a);
            printWriter.println(":");
            this.b.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf).toString());
            this.d.zzb(connectionResult, this.a);
        }
    }

    private zznr(zzor com_google_android_gms_internal_zzor) {
        super(com_google_android_gms_internal_zzor);
        this.zzaop.zza("AutoManageHelper", (zzoq) this);
    }

    public static zznr zza(zzop com_google_android_gms_internal_zzop) {
        zzor zzc = zzoq.zzc(com_google_android_gms_internal_zzop);
        zznr com_google_android_gms_internal_zznr = (zznr) zzc.zza("AutoManageHelper", zznr.class);
        return com_google_android_gms_internal_zznr != null ? com_google_android_gms_internal_zznr : new zznr(zzc);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zzalH.size(); i++) {
            ((a) this.zzalH.valueAt(i)).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onStart() {
        super.onStart();
        boolean z = this.mStarted;
        String valueOf = String.valueOf(this.zzalH);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf).toString());
        if (!this.zzalQ) {
            for (int i = 0; i < this.zzalH.size(); i++) {
                ((a) this.zzalH.valueAt(i)).b.connect();
            }
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.zzalH.size(); i++) {
            ((a) this.zzalH.valueAt(i)).b.disconnect();
        }
    }

    public void zza(int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
        zzaa.zzb((Object) googleApiClient, (Object) "GoogleApiClient instance cannot be null");
        zzaa.zza(this.zzalH.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        Log.d("AutoManageHelper", "starting AutoManage for client " + i + " " + this.mStarted + " " + this.zzalQ);
        this.zzalH.put(i, new a(this, i, googleApiClient, onConnectionFailedListener));
        if (this.mStarted && !this.zzalQ) {
            String valueOf = String.valueOf(googleApiClient);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 11).append("connecting ").append(valueOf).toString());
            googleApiClient.connect();
        }
    }

    protected void zza(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar = (a) this.zzalH.get(i);
        if (aVar != null) {
            zzbG(i);
            OnConnectionFailedListener onConnectionFailedListener = aVar.c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    public void zzbG(int i) {
        a aVar = (a) this.zzalH.get(i);
        this.zzalH.remove(i);
        if (aVar != null) {
            aVar.a();
        }
    }

    protected void zzrA() {
        for (int i = 0; i < this.zzalH.size(); i++) {
            ((a) this.zzalH.valueAt(i)).b.connect();
        }
    }
}
