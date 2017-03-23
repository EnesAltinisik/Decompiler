package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageException;
import java.io.InputStream;
import java.net.SocketException;
import org.json.JSONObject;

public class zzajt {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzajt.class.desiredAssertionStatus());
    private zzajq zzbVK;
    private int zzbVL;
    private Exception zzbVM;
    private Exception zzbwC;

    public zzajt(zzajq com_google_android_gms_internal_zzajq) {
        this.zzbVK = com_google_android_gms_internal_zzajq;
    }

    private boolean zzbG(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.zzbVL = -2;
        this.zzbVM = new SocketException("Network subsystem is unavailable");
        return false;
    }

    public Exception getException() {
        try {
            return this.zzbVM != null ? this.zzbVM : this.zzbwC != null ? this.zzbwC : (Exception) zze.zzx(this.zzbVK.zzVs());
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "getException failed with a RemoteException:", e);
            return null;
        }
    }

    public int getResultCode() {
        try {
            return this.zzbVL != 0 ? this.zzbVL : this.zzbVK.getResultCode();
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "getResultCode failed with a RemoteException:", e);
            return 0;
        }
    }

    public InputStream getStream() {
        try {
            return (InputStream) zze.zzx(this.zzbVK.zzVo());
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "getStream failed with a RemoteException:", e);
            return null;
        }
    }

    public void reset() {
        try {
            this.zzbVL = 0;
            this.zzbVM = null;
            this.zzbVK.reset();
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "reset failed with a RemoteException:", e);
        }
    }

    public void zzVn() {
        try {
            this.zzbVK.zzVn();
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "performRequestEnd failed with a RemoteException:", e);
        }
    }

    public String zzVq() {
        try {
            this.zzbVK.zzVq();
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "getRawResult failed with a RemoteException:", e);
        }
        return null;
    }

    public boolean zzVt() {
        boolean z = false;
        try {
            if (this.zzbVL != -2 && this.zzbVM == null) {
                z = this.zzbVK.zzVt();
            }
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "isResultSuccess failed with a RemoteException:", e);
        }
        return z;
    }

    public int zzVu() {
        try {
            return this.zzbVK.zzVu();
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "getResultingContentLength failed with a RemoteException:", e);
            return 0;
        }
    }

    public JSONObject zzVw() throws RemoteException {
        return (JSONObject) zze.zzx(this.zzbVK.zzVp());
    }

    public <TResult> void zza(TaskCompletionSource<TResult> taskCompletionSource, TResult tResult) {
        Throwable exception = getException();
        if (zzVt() && exception == null) {
            taskCompletionSource.setResult(tResult);
            return;
        }
        Exception fromExceptionAndHttpCode = StorageException.fromExceptionAndHttpCode(exception, getResultCode());
        if ($assertionsDisabled || fromExceptionAndHttpCode != null) {
            taskCompletionSource.setException(fromExceptionAndHttpCode);
            return;
        }
        throw new AssertionError();
    }

    public void zza(String str, Context context) {
        try {
            if (zzbG(context)) {
                this.zzbVK.zziL(str);
            }
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "performRequest failed with a RemoteException:", e);
        }
    }

    public void zziM(String str) {
        try {
            this.zzbVK.zziM(str);
        } catch (Throwable e) {
            this.zzbwC = e;
            Log.e("NetworkRequestProxy", "performRequestStart failed with a RemoteException:", e);
        }
    }

    public String zziN(String str) {
        try {
            return this.zzbVK.zziN(str);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "NetworkRequestProxy";
            String str3 = "getResultString failed with a RemoteException:";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            return null;
        }
    }
}
