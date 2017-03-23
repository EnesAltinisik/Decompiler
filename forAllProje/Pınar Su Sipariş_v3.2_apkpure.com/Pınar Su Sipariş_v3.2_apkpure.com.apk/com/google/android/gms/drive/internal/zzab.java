package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.internal.zzt.zza;
import com.google.android.gms.internal.zznt.zzb;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class zzab implements DriveResource {
    protected final DriveId zzauZ;

    private abstract class d extends zzt<MetadataResult> {
        final /* synthetic */ zzab c;

        private d(zzab com_google_android_gms_drive_internal_zzab, GoogleApiClient googleApiClient) {
            this.c = com_google_android_gms_drive_internal_zzab;
            super(googleApiClient);
        }

        public MetadataResult a(Status status) {
            return new c(status, null);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    private static class a extends zzd {
        private final zzb<MetadataBufferResult> a;

        public a(zzb<MetadataBufferResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_MetadataBufferResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_MetadataBufferResult;
        }

        public void onError(Status status) throws RemoteException {
            this.a.setResult(new g(status, null, false));
        }

        public void zza(OnListParentsResponse onListParentsResponse) throws RemoteException {
            this.a.setResult(new g(Status.zzalw, new MetadataBuffer(onListParentsResponse.zzwB()), false));
        }
    }

    private static class b extends zzd {
        private final zzb<MetadataResult> a;

        public b(zzb<MetadataResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveResource_MetadataResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveResource_MetadataResult;
        }

        public void onError(Status status) throws RemoteException {
            this.a.setResult(new c(status, null));
        }

        public void zza(OnMetadataResponse onMetadataResponse) throws RemoteException {
            this.a.setResult(new c(Status.zzalw, new zzp(onMetadataResponse.zzwC())));
        }
    }

    private static class c implements MetadataResult {
        private final Status a;
        private final Metadata b;

        public c(Status status, Metadata metadata) {
            this.a = status;
            this.b = metadata;
        }

        public Metadata getMetadata() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    public zzab(DriveId driveId) {
        this.zzauZ = driveId;
    }

    private PendingResult<MetadataResult> zza(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.zzc(new d(this, googleApiClient) {
            final /* synthetic */ zzab b;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new GetMetadataRequest(this.b.zzauZ, z), new b(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> addChangeListener(GoogleApiClient googleApiClient, ChangeListener changeListener) {
        return ((zzu) googleApiClient.zza(Drive.zzaaz)).zza(googleApiClient, this.zzauZ, changeListener);
    }

    public PendingResult<Status> addChangeSubscription(GoogleApiClient googleApiClient) {
        return ((zzu) googleApiClient.zza(Drive.zzaaz)).zza(googleApiClient, this.zzauZ);
    }

    public PendingResult<Status> delete(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzab a;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new DeleteResourceRequest(this.a.zzauZ), new zzbr(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public DriveId getDriveId() {
        return this.zzauZ;
    }

    public PendingResult<MetadataResult> getMetadata(GoogleApiClient googleApiClient) {
        return zza(googleApiClient, false);
    }

    public PendingResult<MetadataBufferResult> listParents(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new h(this, googleApiClient) {
            final /* synthetic */ zzab a;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new ListParentsRequest(this.a.zzauZ), new a(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> removeChangeListener(GoogleApiClient googleApiClient, ChangeListener changeListener) {
        return ((zzu) googleApiClient.zza(Drive.zzaaz)).zzb(googleApiClient, this.zzauZ, changeListener);
    }

    public PendingResult<Status> removeChangeSubscription(GoogleApiClient googleApiClient) {
        return ((zzu) googleApiClient.zza(Drive.zzaaz)).zzb(googleApiClient, this.zzauZ);
    }

    public PendingResult<Status> setParents(GoogleApiClient googleApiClient, Set<DriveId> set) {
        if (set == null) {
            throw new IllegalArgumentException("ParentIds must be provided.");
        }
        final List arrayList = new ArrayList(set);
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzab b;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new SetResourceParentsRequest(this.b.zzauZ, arrayList), new zzbr(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> trash(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzab a;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new TrashResourceRequest(this.a.zzauZ), new zzbr(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> untrash(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzab a;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new UntrashResourceRequest(this.a.zzauZ), new zzbr(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MetadataResult> updateMetadata(GoogleApiClient googleApiClient, final MetadataChangeSet metadataChangeSet) {
        if (metadataChangeSet != null) {
            return googleApiClient.zzd(new d(this, googleApiClient) {
                final /* synthetic */ zzab b;

                protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                    metadataChangeSet.zzvU().setContext(com_google_android_gms_drive_internal_zzu.getContext());
                    com_google_android_gms_drive_internal_zzu.zzwn().zza(new UpdateMetadataRequest(this.b.zzauZ, metadataChangeSet.zzvU()), new b(this));
                }

                protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zzu) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
        throw new IllegalArgumentException("ChangeSet must be provided.");
    }
}
