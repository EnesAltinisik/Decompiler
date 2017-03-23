package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.zzi;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.Query.Builder;
import com.google.android.gms.drive.query.SearchableField;
import com.google.android.gms.drive.zzh;
import com.google.android.gms.drive.zzh.zza;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzqd;

public class zzy extends zzab implements DriveFolder {

    static abstract class d extends zzt<DriveFileResult> {
        d(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public DriveFileResult a(Status status) {
            return new c(status, null);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    static abstract class f extends zzt<DriveFolderResult> {
        f(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public DriveFolderResult a(Status status) {
            return new e(status, null);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    private static class a extends zzd {
        private final zzb<DriveFileResult> a;

        public a(zzb<DriveFileResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveFolder_DriveFileResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveFolder_DriveFileResult;
        }

        public void onError(Status status) throws RemoteException {
            this.a.setResult(new c(status, null));
        }

        public void zza(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.a.setResult(new c(Status.zzalw, new zzw(onDriveIdResponse.getDriveId())));
        }
    }

    private static class b extends zzd {
        private final zzb<DriveFolderResult> a;

        public b(zzb<DriveFolderResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveFolder_DriveFolderResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveFolder_DriveFolderResult;
        }

        public void onError(Status status) throws RemoteException {
            this.a.setResult(new e(status, null));
        }

        public void zza(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.a.setResult(new e(Status.zzalw, new zzy(onDriveIdResponse.getDriveId())));
        }
    }

    private static class c implements DriveFileResult {
        private final Status a;
        private final DriveFile b;

        public c(Status status, DriveFile driveFile) {
            this.a = status;
            this.b = driveFile;
        }

        public DriveFile getDriveFile() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static class e implements DriveFolderResult {
        private final Status a;
        private final DriveFolder b;

        public e(Status status, DriveFolder driveFolder) {
            this.a = status;
            this.b = driveFolder;
        }

        public DriveFolder getDriveFolder() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    public zzy(DriveId driveId) {
        super(driveId);
    }

    private int zza(DriveContents driveContents, zzi com_google_android_gms_drive_metadata_internal_zzi) {
        if (driveContents == null) {
            return (com_google_android_gms_drive_metadata_internal_zzi == null || !com_google_android_gms_drive_metadata_internal_zzi.zzwR()) ? 1 : 0;
        } else {
            int requestId = driveContents.zzvG().getRequestId();
            driveContents.zzvH();
            return requestId;
        }
    }

    private PendingResult<DriveFileResult> zza(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, int i, zzh com_google_android_gms_drive_zzh) {
        zzi zzdD = zzi.zzdD(metadataChangeSet.getMimeType());
        final int i2 = (zzdD == null || !zzdD.zzwR()) ? 0 : 1;
        final MetadataChangeSet metadataChangeSet2 = metadataChangeSet;
        final int i3 = i;
        final zzh com_google_android_gms_drive_zzh2 = com_google_android_gms_drive_zzh;
        return googleApiClient.zzd(new d(this, googleApiClient) {
            final /* synthetic */ zzy e;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                metadataChangeSet2.zzvU().setContext(com_google_android_gms_drive_internal_zzu.getContext());
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new CreateFileRequest(this.e.getDriveId(), metadataChangeSet2.zzvU(), i3, i2, com_google_android_gms_drive_zzh2), new a(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    private MetadataChangeSet zza(MetadataChangeSet metadataChangeSet, String str) {
        return metadataChangeSet.zza(zzqd.zzaAf, str);
    }

    private Query zza(Query query) {
        Builder addFilter = new Builder().addFilter(Filters.in(SearchableField.PARENTS, getDriveId()));
        if (query != null) {
            if (query.getFilter() != null) {
                addFilter.addFilter(query.getFilter());
            }
            addFilter.setPageToken(query.getPageToken());
            addFilter.setSortOrder(query.getSortOrder());
        }
        return addFilter.build();
    }

    private void zzb(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, DriveContents driveContents, zzh com_google_android_gms_drive_zzh) {
        if (metadataChangeSet == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        zzi zzdD = zzi.zzdD(metadataChangeSet.getMimeType());
        if (zzdD == null || !zzdD.isFolder()) {
            com_google_android_gms_drive_zzh.zzg(googleApiClient);
            if (driveContents != null) {
                if (!(driveContents instanceof zzv)) {
                    throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
                } else if (driveContents.getDriveId() != null) {
                    throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
                } else if (driveContents.zzvI()) {
                    throw new IllegalArgumentException("DriveContents are already closed.");
                } else {
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
    }

    private void zzb(MetadataChangeSet metadataChangeSet) {
        if (metadataChangeSet == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        zzi zzdD = zzi.zzdD(metadataChangeSet.getMimeType());
        if (zzdD != null && !zzdD.zzwQ()) {
            throw new IllegalArgumentException("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
        }
    }

    public PendingResult<DriveFileResult> createFile(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, DriveContents driveContents) {
        zzb(metadataChangeSet);
        return zza(googleApiClient, metadataChangeSet, driveContents, null);
    }

    public PendingResult<DriveFileResult> createFile(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, DriveContents driveContents, ExecutionOptions executionOptions) {
        zzb(metadataChangeSet);
        return zza(googleApiClient, metadataChangeSet, driveContents, zzh.zza(executionOptions));
    }

    public PendingResult<DriveFolderResult> createFolder(GoogleApiClient googleApiClient, final MetadataChangeSet metadataChangeSet) {
        if (metadataChangeSet == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        } else if (metadataChangeSet.getMimeType() == null || metadataChangeSet.getMimeType().equals(DriveFolder.MIME_TYPE)) {
            return googleApiClient.zzd(new f(this, googleApiClient) {
                final /* synthetic */ zzy b;

                protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                    metadataChangeSet.zzvU().setContext(com_google_android_gms_drive_internal_zzu.getContext());
                    com_google_android_gms_drive_internal_zzu.zzwn().zza(new CreateFolderRequest(this.b.getDriveId(), metadataChangeSet.zzvU()), new b(this));
                }

                protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zzu) com_google_android_gms_common_api_Api_zzb);
                }
            });
        } else {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        }
    }

    public PendingResult<MetadataBufferResult> listChildren(GoogleApiClient googleApiClient) {
        return queryChildren(googleApiClient, null);
    }

    public PendingResult<MetadataBufferResult> queryChildren(GoogleApiClient googleApiClient, Query query) {
        return new zzs().query(googleApiClient, zza(query));
    }

    public PendingResult<DriveFileResult> zza(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, DriveContents driveContents, zzh com_google_android_gms_drive_zzh) {
        zzh com_google_android_gms_drive_zzh2 = com_google_android_gms_drive_zzh == null ? (zzh) new zza().build() : com_google_android_gms_drive_zzh;
        zzb(googleApiClient, metadataChangeSet, driveContents, com_google_android_gms_drive_zzh2);
        int zza = zza(driveContents, zzi.zzdD(metadataChangeSet.getMimeType()));
        String zzvP = com_google_android_gms_drive_zzh2.zzvP();
        if (zzvP != null) {
            metadataChangeSet = zza(metadataChangeSet, zzvP);
        }
        return zza(googleApiClient, metadataChangeSet, zza, com_google_android_gms_drive_zzh2);
    }
}
