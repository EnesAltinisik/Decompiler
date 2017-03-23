package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzo;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.zzt.zza;
import com.google.android.gms.drive.zzi;
import java.io.InputStream;
import java.io.OutputStream;

public class zzv implements DriveContents {
    private boolean mClosed = false;
    private final Contents zzaxB;
    private boolean zzaxC = false;
    private boolean zzaxD = false;

    public zzv(Contents contents) {
        this.zzaxB = (Contents) zzaa.zzz(contents);
    }

    public PendingResult<Status> commit(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet) {
        return zza(googleApiClient, metadataChangeSet, null);
    }

    public PendingResult<Status> commit(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, ExecutionOptions executionOptions) {
        return zza(googleApiClient, metadataChangeSet, executionOptions == null ? null : zzi.zzb(executionOptions));
    }

    public void discard(GoogleApiClient googleApiClient) {
        if (zzvI()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        zzvH();
        ((AnonymousClass4) googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzv a;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new CloseContentsRequest(this.a.zzaxB.getRequestId(), false), new zzbr(this));
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        })).setResultCallback(new ResultCallback<Status>(this) {
            final /* synthetic */ zzv a;

            {
                this.a = r1;
            }

            public void a(Status status) {
                if (status.isSuccess()) {
                    zzz.zzC("DriveContentsImpl", "Contents discarded");
                } else {
                    zzz.zzE("DriveContentsImpl", "Error discarding contents");
                }
            }

            public /* synthetic */ void onResult(Result result) {
                a((Status) result);
            }
        });
    }

    public DriveId getDriveId() {
        return this.zzaxB.getDriveId();
    }

    public InputStream getInputStream() {
        if (zzvI()) {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        } else if (this.zzaxB.getMode() != DriveFile.MODE_READ_ONLY) {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        } else if (this.zzaxC) {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else {
            this.zzaxC = true;
            return this.zzaxB.getInputStream();
        }
    }

    public int getMode() {
        return this.zzaxB.getMode();
    }

    public OutputStream getOutputStream() {
        if (zzvI()) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else if (this.zzaxB.getMode() != DriveFile.MODE_WRITE_ONLY) {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        } else if (this.zzaxD) {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else {
            this.zzaxD = true;
            return this.zzaxB.getOutputStream();
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        if (!zzvI()) {
            return this.zzaxB.getParcelFileDescriptor();
        }
        throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
    }

    public PendingResult<DriveContentsResult> reopenForWrite(GoogleApiClient googleApiClient) {
        if (zzvI()) {
            throw new IllegalStateException("DriveContents already closed.");
        } else if (this.zzaxB.getMode() != DriveFile.MODE_READ_ONLY) {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        } else {
            zzvH();
            return googleApiClient.zzc(new c(this, googleApiClient) {
                final /* synthetic */ zzv a;

                protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                    com_google_android_gms_drive_internal_zzu.zzwn().zza(new OpenContentsRequest(this.a.getDriveId(), DriveFile.MODE_WRITE_ONLY, this.a.zzaxB.getRequestId()), new a(this, null));
                }

                protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zzu) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
    }

    public PendingResult<Status> zza(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, zzi com_google_android_gms_drive_zzi) {
        final zzi com_google_android_gms_drive_zzi2 = com_google_android_gms_drive_zzi == null ? (zzi) new zzi.zza().build() : com_google_android_gms_drive_zzi;
        if (this.zzaxB.getMode() == DriveFile.MODE_READ_ONLY) {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        } else if (!ExecutionOptions.zzcL(com_google_android_gms_drive_zzi2.zzvM()) || this.zzaxB.zzvE()) {
            com_google_android_gms_drive_zzi2.zzg(googleApiClient);
            if (zzvI()) {
                throw new IllegalStateException("DriveContents already closed.");
            } else if (getDriveId() == null) {
                throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
            } else {
                if (metadataChangeSet == null) {
                    metadataChangeSet = MetadataChangeSet.zzavD;
                }
                zzvH();
                return googleApiClient.zzd(new zza(this, googleApiClient) {
                    final /* synthetic */ zzv c;

                    protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                        metadataChangeSet.zzvU().setContext(com_google_android_gms_drive_internal_zzu.getContext());
                        com_google_android_gms_drive_internal_zzu.zzwn().zza(new CloseContentsAndUpdateMetadataRequest(this.c.zzaxB.getDriveId(), metadataChangeSet.zzvU(), this.c.zzaxB.getRequestId(), this.c.zzaxB.zzvE(), com_google_android_gms_drive_zzi2), new zzbr(this));
                    }

                    protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                        a((zzu) com_google_android_gms_common_api_Api_zzb);
                    }
                });
            }
        } else {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
    }

    public Contents zzvG() {
        return this.zzaxB;
    }

    public void zzvH() {
        zzo.zza(this.zzaxB.getParcelFileDescriptor());
        this.mClosed = true;
    }

    public boolean zzvI() {
        return this.mClosed;
    }
}
