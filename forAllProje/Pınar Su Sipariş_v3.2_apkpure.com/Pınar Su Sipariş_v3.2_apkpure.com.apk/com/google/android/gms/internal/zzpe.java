package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.zzaa;
import java.lang.ref.WeakReference;

public class zzpe<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    private final Object zzalY = new Object();
    private final WeakReference<GoogleApiClient> zzama;
    private ResultTransform<? super R, ? extends Result> zzaoA = null;
    private zzpe<? extends Result> zzaoB = null;
    private volatile ResultCallbacks<? super R> zzaoC = null;
    private PendingResult<R> zzaoD = null;
    private Status zzaoE = null;
    private final a zzaoF;
    private boolean zzaoG = false;

    private final class a extends Handler {
        final /* synthetic */ zzpe a;

        public a(zzpe com_google_android_gms_internal_zzpe, Looper looper) {
            this.a = com_google_android_gms_internal_zzpe;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    PendingResult pendingResult = (PendingResult) message.obj;
                    synchronized (this.a.zzalY) {
                        if (pendingResult == null) {
                            this.a.zzaoB.zzA(new Status(13, "Transform returned null"));
                        } else if (pendingResult instanceof zzoz) {
                            this.a.zzaoB.zzA(((zzoz) pendingResult).getStatus());
                        } else {
                            this.a.zzaoB.zza(pendingResult);
                        }
                    }
                    return;
                case 1:
                    RuntimeException runtimeException = (RuntimeException) message.obj;
                    String str = "TransformedResultImpl";
                    String str2 = "Runtime exception on the transformation worker thread: ";
                    String valueOf = String.valueOf(runtimeException.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    throw runtimeException;
                default:
                    Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + message.what);
                    return;
            }
        }
    }

    public zzpe(WeakReference<GoogleApiClient> weakReference) {
        zzaa.zzb((Object) weakReference, (Object) "GoogleApiClient reference must not be null");
        this.zzama = weakReference;
        GoogleApiClient googleApiClient = (GoogleApiClient) this.zzama.get();
        this.zzaoF = new a(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
    }

    private void zzA(Status status) {
        synchronized (this.zzalY) {
            this.zzaoE = status;
            zzB(this.zzaoE);
        }
    }

    private void zzB(Status status) {
        synchronized (this.zzalY) {
            if (this.zzaoA != null) {
                Object onFailure = this.zzaoA.onFailure(status);
                zzaa.zzb(onFailure, (Object) "onFailure must not return null");
                this.zzaoB.zzA(onFailure);
            } else if (zzsK()) {
                this.zzaoC.onFailure(status);
            }
        }
    }

    private void zzd(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (Throwable e) {
                String valueOf = String.valueOf(result);
                Log.w("TransformedResultImpl", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    private void zzsI() {
        if (this.zzaoA != null || this.zzaoC != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zzama.get();
            if (!(this.zzaoG || this.zzaoA == null || googleApiClient == null)) {
                googleApiClient.zza(this);
                this.zzaoG = true;
            }
            if (this.zzaoE != null) {
                zzB(this.zzaoE);
            } else if (this.zzaoD != null) {
                this.zzaoD.setResultCallback(this);
            }
        }
    }

    private boolean zzsK() {
        return (this.zzaoC == null || ((GoogleApiClient) this.zzama.get()) == null) ? false : true;
    }

    public void andFinally(ResultCallbacks<? super R> resultCallbacks) {
        boolean z = true;
        synchronized (this.zzalY) {
            zzaa.zza(this.zzaoC == null, (Object) "Cannot call andFinally() twice.");
            if (this.zzaoA != null) {
                z = false;
            }
            zzaa.zza(z, (Object) "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zzaoC = resultCallbacks;
            zzsI();
        }
    }

    public void onResult(final R r) {
        synchronized (this.zzalY) {
            if (!r.getStatus().isSuccess()) {
                zzA(r.getStatus());
                zzd((Result) r);
            } else if (this.zzaoA != null) {
                zzoy.zzsp().submit(new Runnable(this) {
                    final /* synthetic */ zzpe b;

                    public void run() {
                        GoogleApiClient googleApiClient;
                        try {
                            zznv.zzalX.set(Boolean.valueOf(true));
                            this.b.zzaoF.sendMessage(this.b.zzaoF.obtainMessage(0, this.b.zzaoA.onSuccess(r)));
                            zznv.zzalX.set(Boolean.valueOf(false));
                            this.b.zzd(r);
                            googleApiClient = (GoogleApiClient) this.b.zzama.get();
                            if (googleApiClient != null) {
                                googleApiClient.zzb(this.b);
                            }
                        } catch (RuntimeException e) {
                            this.b.zzaoF.sendMessage(this.b.zzaoF.obtainMessage(1, e));
                            zznv.zzalX.set(Boolean.valueOf(false));
                            this.b.zzd(r);
                            googleApiClient = (GoogleApiClient) this.b.zzama.get();
                            if (googleApiClient != null) {
                                googleApiClient.zzb(this.b);
                            }
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            zznv.zzalX.set(Boolean.valueOf(false));
                            this.b.zzd(r);
                            googleApiClient = (GoogleApiClient) this.b.zzama.get();
                            if (googleApiClient != null) {
                                googleApiClient.zzb(this.b);
                            }
                        }
                    }
                });
            } else if (zzsK()) {
                this.zzaoC.onSuccess(r);
            }
        }
    }

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult com_google_android_gms_internal_zzpe;
        boolean z = true;
        synchronized (this.zzalY) {
            zzaa.zza(this.zzaoA == null, (Object) "Cannot call then() twice.");
            if (this.zzaoC != null) {
                z = false;
            }
            zzaa.zza(z, (Object) "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zzaoA = resultTransform;
            com_google_android_gms_internal_zzpe = new zzpe(this.zzama);
            this.zzaoB = com_google_android_gms_internal_zzpe;
            zzsI();
        }
        return com_google_android_gms_internal_zzpe;
    }

    public void zza(PendingResult<?> pendingResult) {
        synchronized (this.zzalY) {
            this.zzaoD = pendingResult;
            zzsI();
        }
    }

    void zzsJ() {
        this.zzaoC = null;
    }
}
