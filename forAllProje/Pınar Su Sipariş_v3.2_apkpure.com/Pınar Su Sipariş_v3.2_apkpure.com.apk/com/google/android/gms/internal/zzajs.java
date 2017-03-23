package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzajr.zza;
import com.google.firebase.FirebaseApp;
import org.json.JSONObject;

public class zzajs {
    private static final Object zzbVH = new Object();
    private static volatile zzajs zzbVI;
    private Context mContext;
    private zzajr zzbVJ;

    private zzajs(Context context) throws RemoteException {
        this.mContext = context;
        try {
            this.zzbVJ = zza.zzeS(zzqi.zza(context, zzqi.zzaCo, "com.google.android.gms.firebasestorage").zzdM("com.google.firebase.storage.network.NetworkRequestFactoryImpl"));
            if (this.zzbVJ == null) {
                Log.e("NetworkRqFactoryProxy", "Unable to load Firebase Storage Network layer.");
                throw new RemoteException();
            }
        } catch (Throwable e) {
            Log.e("NetworkRqFactoryProxy", "NetworkRequestFactoryProxy failed with a RemoteException:", e);
            throw new RemoteException();
        }
    }

    public static zzajs zzi(FirebaseApp firebaseApp) throws RemoteException {
        if (zzbVI == null) {
            synchronized (zzbVH) {
                if (zzbVI == null) {
                    zzbVI = new zzajs(firebaseApp.getApplicationContext());
                }
            }
        }
        return zzbVI;
    }

    public String zzVv() {
        try {
            return this.zzbVJ.zzVv();
        } catch (Throwable e) {
            Log.e("NetworkRqFactoryProxy", "getBackendAuthority failed with a RemoteException:", e);
            return null;
        }
    }

    public zzajt zza(Uri uri, long j) throws RemoteException {
        return new zzajt(this.zzbVJ.zza(uri, zze.zzD(this.mContext), j));
    }

    public zzajt zza(Uri uri, String str) throws RemoteException {
        return new zzajt(this.zzbVJ.zzb(uri, zze.zzD(this.mContext), str));
    }

    public zzajt zza(Uri uri, String str, byte[] bArr, long j, int i, boolean z) throws RemoteException {
        return new zzajt(this.zzbVJ.zza(uri, zze.zzD(this.mContext), str, zze.zzD(bArr), j, i, z));
    }

    public zzajt zza(Uri uri, JSONObject jSONObject) throws RemoteException {
        return new zzajt(this.zzbVJ.zza(uri, zze.zzD(this.mContext), zze.zzD(jSONObject)));
    }

    public zzajt zza(Uri uri, JSONObject jSONObject, String str) throws RemoteException {
        return new zzajt(this.zzbVJ.zza(uri, zze.zzD(this.mContext), zze.zzD(jSONObject), str));
    }

    public zzajt zzb(Uri uri, String str) throws RemoteException {
        return new zzajt(this.zzbVJ.zzc(uri, zze.zzD(this.mContext), str));
    }

    public String zzw(Uri uri) {
        try {
            return this.zzbVJ.zzw(uri);
        } catch (Throwable e) {
            Log.e("NetworkRqFactoryProxy", "getDefaultURL failed with a RemoteException:", e);
            return null;
        }
    }

    public zzajt zzy(Uri uri) throws RemoteException {
        return new zzajt(this.zzbVJ.zza(uri, zze.zzD(this.mContext)));
    }

    public zzajt zzz(Uri uri) throws RemoteException {
        return new zzajt(this.zzbVJ.zzb(uri, zze.zzD(this.mContext)));
    }
}
