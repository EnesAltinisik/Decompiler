package com.google.android.gms.internal;

import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class zzob extends GoogleApiClient {
    private final UnsupportedOperationException zzamA;

    public zzob(String str) {
        this.zzamA = new UnsupportedOperationException(str);
    }

    public ConnectionResult blockingConnect() {
        throw this.zzamA;
    }

    public ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        throw this.zzamA;
    }

    public PendingResult<Status> clearDefaultAccountAndReconnect() {
        throw this.zzamA;
    }

    public void connect() {
        throw this.zzamA;
    }

    public void disconnect() {
        throw this.zzamA;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw this.zzamA;
    }

    public ConnectionResult getConnectionResult(Api<?> api) {
        throw this.zzamA;
    }

    public boolean hasConnectedApi(Api<?> api) {
        throw this.zzamA;
    }

    public boolean isConnected() {
        throw this.zzamA;
    }

    public boolean isConnecting() {
        throw this.zzamA;
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks) {
        throw this.zzamA;
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener) {
        throw this.zzamA;
    }

    public void reconnect() {
        throw this.zzamA;
    }

    public void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        throw this.zzamA;
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        throw this.zzamA;
    }

    public void stopAutoManage(FragmentActivity fragmentActivity) {
        throw this.zzamA;
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        throw this.zzamA;
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        throw this.zzamA;
    }
}
