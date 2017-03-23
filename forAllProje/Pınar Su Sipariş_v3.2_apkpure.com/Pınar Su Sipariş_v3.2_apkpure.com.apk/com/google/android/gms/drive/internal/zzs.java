package com.google.android.gms.drive.internal;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.internal.zzt.zza;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.internal.zznt.zzb;
import java.util.List;

public class zzs implements DriveApi {

    static abstract class h extends zzt<MetadataBufferResult> {
        h(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public MetadataBufferResult a(Status status) {
            return new g(status, null, false);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    static abstract class c extends zzt<DriveContentsResult> {
        c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public DriveContentsResult a(Status status) {
            return new b(status, null);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    static abstract class f extends zzt<DriveIdResult> {
        f(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public DriveIdResult a(Status status) {
            return new e(status, null);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    private static class a extends zzd {
        private final zzb<DriveContentsResult> a;

        public a(zzb<DriveContentsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_DriveContentsResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_DriveContentsResult;
        }

        public void onError(Status status) throws RemoteException {
            this.a.setResult(new b(status, null));
        }

        public void zza(OnContentsResponse onContentsResponse) throws RemoteException {
            this.a.setResult(new b(Status.zzalw, new zzv(onContentsResponse.zzwt())));
        }
    }

    static class b implements Releasable, DriveContentsResult {
        private final Status a;
        private final DriveContents b;

        public b(Status status, DriveContents driveContents) {
            this.a = status;
            this.b = driveContents;
        }

        public DriveContents getDriveContents() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }

        public void release() {
            if (this.b != null) {
                this.b.zzvH();
            }
        }
    }

    static class d extends zzd {
        private final zzb<DriveIdResult> a;

        public d(zzb<DriveIdResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_DriveIdResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_DriveIdResult;
        }

        public void onError(Status status) throws RemoteException {
            this.a.setResult(new e(status, null));
        }

        public void zza(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.a.setResult(new e(Status.zzalw, onDriveIdResponse.getDriveId()));
        }

        public void zza(OnMetadataResponse onMetadataResponse) throws RemoteException {
            this.a.setResult(new e(Status.zzalw, new zzp(onMetadataResponse.zzwC()).getDriveId()));
        }
    }

    private static class e implements DriveIdResult {
        private final Status a;
        private final DriveId b;

        public e(Status status, DriveId driveId) {
            this.a = status;
            this.b = driveId;
        }

        public DriveId getDriveId() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    static class g implements MetadataBufferResult {
        private final Status a;
        private final MetadataBuffer b;
        private final boolean c;

        public g(Status status, MetadataBuffer metadataBuffer, boolean z) {
            this.a = status;
            this.b = metadataBuffer;
            this.c = z;
        }

        public MetadataBuffer getMetadataBuffer() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }

        public void release() {
            if (this.b != null) {
                this.b.release();
            }
        }
    }

    private static class i extends zzd {
        private final zzb<MetadataBufferResult> a;

        public i(zzb<MetadataBufferResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_MetadataBufferResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_MetadataBufferResult;
        }

        public void onError(Status status) throws RemoteException {
            this.a.setResult(new g(status, null, false));
        }

        public void zza(OnListEntriesResponse onListEntriesResponse) throws RemoteException {
            this.a.setResult(new g(Status.zzalw, new MetadataBuffer(onListEntriesResponse.zzwz()), onListEntriesResponse.zzwA()));
        }
    }

    @SuppressLint({"MissingRemoteException"})
    static class j extends zza {
        j(GoogleApiClient googleApiClient, Status status) {
            super(googleApiClient);
            zzb(status);
        }

        protected void a(zzu com_google_android_gms_drive_internal_zzu) {
        }

        protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzu) com_google_android_gms_common_api_Api_zzb);
        }
    }

    public PendingResult<Status> cancelPendingActions(GoogleApiClient googleApiClient, List<String> list) {
        return ((zzu) googleApiClient.zza(Drive.zzaaz)).cancelPendingActions(googleApiClient, list);
    }

    public PendingResult<DriveIdResult> fetchDriveId(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzc(new f(this, googleApiClient) {
            final /* synthetic */ zzs b;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new GetMetadataRequest(DriveId.zzdw(str), false), new d(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public DriveFolder getAppFolder(GoogleApiClient googleApiClient) {
        zzu com_google_android_gms_drive_internal_zzu = (zzu) googleApiClient.zza(Drive.zzaaz);
        if (com_google_android_gms_drive_internal_zzu.zzwq()) {
            DriveId zzwp = com_google_android_gms_drive_internal_zzu.zzwp();
            return zzwp != null ? new zzy(zzwp) : null;
        } else {
            throw new IllegalStateException("Client is not yet connected");
        }
    }

    public DriveFile getFile(GoogleApiClient googleApiClient, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (googleApiClient.isConnected()) {
            return new zzw(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFolder getFolder(GoogleApiClient googleApiClient, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (googleApiClient.isConnected()) {
            return new zzy(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFolder getRootFolder(GoogleApiClient googleApiClient) {
        zzu com_google_android_gms_drive_internal_zzu = (zzu) googleApiClient.zza(Drive.zzaaz);
        if (com_google_android_gms_drive_internal_zzu.zzwq()) {
            DriveId zzwo = com_google_android_gms_drive_internal_zzu.zzwo();
            return zzwo != null ? new zzy(zzwo) : null;
        } else {
            throw new IllegalStateException("Client is not yet connected");
        }
    }

    public PendingResult<BooleanResult> isAutobackupEnabled(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new zzt<BooleanResult>(this, googleApiClient) {
            final /* synthetic */ zzs a;

            protected BooleanResult a(Status status) {
                return new BooleanResult(status, false);
            }

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zze(new zzd(this) {
                    final /* synthetic */ AnonymousClass5 b;

                    public void zzam(boolean z) {
                        this.zzb(new BooleanResult(Status.zzalw, z));
                    }
                });
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public CreateFileActivityBuilder newCreateFileActivityBuilder() {
        return new CreateFileActivityBuilder();
    }

    public PendingResult<DriveContentsResult> newDriveContents(GoogleApiClient googleApiClient) {
        return zza(googleApiClient, DriveFile.MODE_WRITE_ONLY);
    }

    public OpenFileActivityBuilder newOpenFileActivityBuilder() {
        return new OpenFileActivityBuilder();
    }

    public PendingResult<MetadataBufferResult> query(GoogleApiClient googleApiClient, final Query query) {
        if (query != null) {
            return googleApiClient.zzc(new h(this, googleApiClient) {
                final /* synthetic */ zzs b;

                protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                    com_google_android_gms_drive_internal_zzu.zzwn().zza(new QueryRequest(query), new i(this));
                }

                protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zzu) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
        throw new IllegalArgumentException("Query must be provided.");
    }

    public PendingResult<Status> requestSync(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzs a;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new zzbr(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<DriveContentsResult> zza(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.zzc(new c(this, googleApiClient) {
            final /* synthetic */ zzs b;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new CreateContentsRequest(i), new a(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
