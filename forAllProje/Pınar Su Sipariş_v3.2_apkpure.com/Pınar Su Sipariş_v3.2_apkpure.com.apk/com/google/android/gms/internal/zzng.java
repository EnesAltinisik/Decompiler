package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult;
import com.google.android.gms.cast.CastRemoteDisplayApi;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznk.zza;

public class zzng implements CastRemoteDisplayApi {
    private static final zzl zzaeJ = new zzl("CastRemoteDisplayApiImpl");
    private zzf<zznh> zzajk;
    private VirtualDisplay zzajl;
    private final zznk zzajm = new zza(this) {
        final /* synthetic */ zzng a;

        {
            this.a = r1;
        }

        public void zzbw(int i) {
            zzng.zzaeJ.zzb("onRemoteDisplayEnded", new Object[0]);
            this.a.zzqL();
        }
    };

    abstract class zzb extends com.google.android.gms.internal.zznt.zza<CastRemoteDisplaySessionResult, zznh> {
        final /* synthetic */ zzng c;

        @TargetApi(19)
        protected final class zza extends a {
            private final zznh zzajo;
            final /* synthetic */ zzb zzajp;

            public zza(zzb com_google_android_gms_internal_zzng_zzb, zznh com_google_android_gms_internal_zznh) {
                this.zzajp = com_google_android_gms_internal_zzng_zzb;
                super(com_google_android_gms_internal_zzng_zzb.c);
                this.zzajo = com_google_android_gms_internal_zznh;
            }

            private int zzl(int i, int i2) {
                if (i >= i2) {
                    i = i2;
                }
                return (i * 320) / 1080;
            }

            public void onError(int i) throws RemoteException {
                zzng.zzaeJ.zzb("onError: %d", Integer.valueOf(i));
                this.zzajp.c.zzqL();
                this.zzajp.zzb(new b(Status.zzaly));
            }

            public void zza(int i, int i2, Surface surface) {
                zzng.zzaeJ.zzb("onConnected", new Object[0]);
                DisplayManager displayManager = (DisplayManager) this.zzajo.getContext().getSystemService("display");
                if (displayManager == null) {
                    zzng.zzaeJ.zzc("Unable to get the display manager", new Object[0]);
                    this.zzajp.zzb(new b(Status.zzaly));
                    return;
                }
                this.zzajp.c.zzqL();
                this.zzajp.c.zzajl = displayManager.createVirtualDisplay("private_display", i, i2, zzl(i, i2), surface, 2);
                if (this.zzajp.c.zzajl == null) {
                    zzng.zzaeJ.zzc("Unable to create virtual display", new Object[0]);
                    this.zzajp.zzb(new b(Status.zzaly));
                } else if (this.zzajp.c.zzajl.getDisplay() == null) {
                    zzng.zzaeJ.zzc("Virtual display does not have a display", new Object[0]);
                    this.zzajp.zzb(new b(Status.zzaly));
                } else {
                    try {
                        this.zzajo.zza(this, this.zzajp.c.zzajl.getDisplay().getDisplayId());
                    } catch (RemoteException e) {
                        zzng.zzaeJ.zzc("Unable to provision the route's new virtual Display", new Object[0]);
                        this.zzajp.zzb(new b(Status.zzaly));
                    } catch (IllegalStateException e2) {
                        zzng.zzaeJ.zzc("Unable to provision the route's new virtual Display", new Object[0]);
                        this.zzajp.zzb(new b(Status.zzaly));
                    }
                }
            }

            public void zzqN() {
                zzng.zzaeJ.zzb("onConnectedWithDisplay", new Object[0]);
                if (this.zzajp.c.zzajl == null) {
                    zzng.zzaeJ.zzc("There is no virtual display", new Object[0]);
                    this.zzajp.zzb(new b(Status.zzaly));
                    return;
                }
                Display display = this.zzajp.c.zzajl.getDisplay();
                if (display != null) {
                    this.zzajp.zzb(new b(display));
                    return;
                }
                zzng.zzaeJ.zzc("Virtual display no longer has a display", new Object[0]);
                this.zzajp.zzb(new b(Status.zzaly));
            }
        }

        protected final class zzb extends a {
            final /* synthetic */ zzb zzajp;

            protected zzb(zzb com_google_android_gms_internal_zzng_zzb) {
                this.zzajp = com_google_android_gms_internal_zzng_zzb;
                super(com_google_android_gms_internal_zzng_zzb.c);
            }

            public void onDisconnected() throws RemoteException {
                zzng.zzaeJ.zzb("onDisconnected", new Object[0]);
                this.zzajp.c.zzqL();
                this.zzajp.zzb(new b(Status.zzalw));
            }

            public void onError(int i) throws RemoteException {
                zzng.zzaeJ.zzb("onError: %d", Integer.valueOf(i));
                this.zzajp.c.zzqL();
                this.zzajp.zzb(new b(Status.zzaly));
            }
        }

        public zzb(zzng com_google_android_gms_internal_zzng, GoogleApiClient googleApiClient) {
            this.c = com_google_android_gms_internal_zzng;
            super(com_google_android_gms_internal_zzng.zzajk, googleApiClient);
        }

        protected CastRemoteDisplaySessionResult a(Status status) {
            return new b(status);
        }

        public void a(zznh com_google_android_gms_internal_zznh) throws RemoteException {
        }

        public /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zznh) com_google_android_gms_common_api_Api_zzb);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    abstract class a extends zzni.zza {
        final /* synthetic */ zzng zzajn;

        a(zzng com_google_android_gms_internal_zzng) {
            this.zzajn = com_google_android_gms_internal_zzng;
        }

        public void onDisconnected() throws RemoteException {
            throw new UnsupportedOperationException();
        }

        public void onError(int i) throws RemoteException {
            throw new UnsupportedOperationException();
        }

        public void zza(int i, int i2, Surface surface) throws RemoteException {
            throw new UnsupportedOperationException();
        }

        public void zzqN() throws RemoteException {
            throw new UnsupportedOperationException();
        }
    }

    private static final class b implements CastRemoteDisplaySessionResult {
        private final Status a;
        private final Display b;

        public b(Display display) {
            this.a = Status.zzalw;
            this.b = display;
        }

        public b(Status status) {
            this.a = status;
            this.b = null;
        }

        public Display getPresentationDisplay() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    public zzng(zzf<zznh> com_google_android_gms_common_api_Api_zzf_com_google_android_gms_internal_zznh) {
        this.zzajk = com_google_android_gms_common_api_Api_zzf_com_google_android_gms_internal_zznh;
    }

    @TargetApi(19)
    private void zzqL() {
        if (this.zzajl != null) {
            if (this.zzajl.getDisplay() != null) {
                zzaeJ.zzb("releasing virtual display: " + this.zzajl.getDisplay().getDisplayId(), new Object[0]);
            }
            this.zzajl.release();
            this.zzajl = null;
        }
    }

    public PendingResult<CastRemoteDisplaySessionResult> startRemoteDisplay(GoogleApiClient googleApiClient, final String str) {
        zzaeJ.zzb("startRemoteDisplay", new Object[0]);
        return googleApiClient.zzd(new zzb(this, googleApiClient) {
            final /* synthetic */ zzng b;

            public void a(zznh com_google_android_gms_internal_zznh) throws RemoteException {
                com_google_android_gms_internal_zznh.zza(new zza(this, com_google_android_gms_internal_zznh), this.b.zzajm, str);
            }

            public /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zznh) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<CastRemoteDisplaySessionResult> stopRemoteDisplay(GoogleApiClient googleApiClient) {
        zzaeJ.zzb("stopRemoteDisplay", new Object[0]);
        return googleApiClient.zzd(new zzb(this, googleApiClient) {
            final /* synthetic */ zzng a;

            public void a(zznh com_google_android_gms_internal_zznh) throws RemoteException {
                com_google_android_gms_internal_zznh.zza(new zzb(this));
            }

            public /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zznh) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
