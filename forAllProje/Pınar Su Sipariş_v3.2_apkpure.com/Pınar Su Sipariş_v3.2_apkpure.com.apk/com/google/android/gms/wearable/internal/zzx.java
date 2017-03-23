package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.io.InputStream;

public final class zzx implements DataApi {

    class AnonymousClass8 implements a<DataListener> {
        final /* synthetic */ IntentFilter[] a;

        AnonymousClass8(IntentFilter[] intentFilterArr) {
            this.a = intentFilterArr;
        }

        public void a(zzbp com_google_android_gms_wearable_internal_zzbp, com.google.android.gms.internal.zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, DataListener dataListener, zzou<DataListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_DataApi_DataListener) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, dataListener, (zzou) com_google_android_gms_internal_zzou_com_google_android_gms_wearable_DataApi_DataListener, this.a);
        }
    }

    public static class zza implements DataItemResult {
        private final Status zzaaO;
        private final DataItem zzbDc;

        public zza(Status status, DataItem dataItem) {
            this.zzaaO = status;
            this.zzbDc = dataItem;
        }

        public DataItem getDataItem() {
            return this.zzbDc;
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    public static class zzb implements DeleteDataItemsResult {
        private final Status zzaaO;
        private final int zzbDd;

        public zzb(Status status, int i) {
            this.zzaaO = status;
            this.zzbDd = i;
        }

        public int getNumDeleted() {
            return this.zzbDd;
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    public static class zzc implements GetFdForAssetResult {
        private volatile boolean mClosed = false;
        private final Status zzaaO;
        private volatile InputStream zzbCO;
        private volatile ParcelFileDescriptor zzbDe;

        public zzc(Status status, ParcelFileDescriptor parcelFileDescriptor) {
            this.zzaaO = status;
            this.zzbDe = parcelFileDescriptor;
        }

        public ParcelFileDescriptor getFd() {
            if (!this.mClosed) {
                return this.zzbDe;
            }
            throw new IllegalStateException("Cannot access the file descriptor after release().");
        }

        public InputStream getInputStream() {
            if (this.mClosed) {
                throw new IllegalStateException("Cannot access the input stream after release().");
            } else if (this.zzbDe == null) {
                return null;
            } else {
                if (this.zzbCO == null) {
                    this.zzbCO = new AutoCloseInputStream(this.zzbDe);
                }
                return this.zzbCO;
            }
        }

        public Status getStatus() {
            return this.zzaaO;
        }

        public void release() {
            if (this.zzbDe != null) {
                if (this.mClosed) {
                    throw new IllegalStateException("releasing an already released result.");
                }
                try {
                    if (this.zzbCO != null) {
                        this.zzbCO.close();
                    } else {
                        this.zzbDe.close();
                    }
                    this.mClosed = true;
                    this.zzbDe = null;
                    this.zzbCO = null;
                } catch (IOException e) {
                }
            }
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, DataListener dataListener, IntentFilter[] intentFilterArr) {
        return b.a(googleApiClient, zza(intentFilterArr), dataListener);
    }

    private static a<DataListener> zza(IntentFilter[] intentFilterArr) {
        return new AnonymousClass8(intentFilterArr);
    }

    private void zza(Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("asset is null");
        } else if (asset.getDigest() == null) {
            throw new IllegalArgumentException("invalid asset");
        } else if (asset.getData() != null) {
            throw new IllegalArgumentException("invalid asset");
        }
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, DataListener dataListener) {
        return zza(googleApiClient, dataListener, new IntentFilter[]{zzbn.zzhE(DataApi.ACTION_DATA_CHANGED)});
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, DataListener dataListener, Uri uri, int i) {
        zzaa.zzb(uri != null, (Object) "uri must not be null");
        boolean z = i == 0 || i == 1;
        zzaa.zzb(z, (Object) "invalid filter type");
        return zza(googleApiClient, dataListener, new IntentFilter[]{zzbn.zza(DataApi.ACTION_DATA_CHANGED, uri, i)});
    }

    public PendingResult<DeleteDataItemsResult> deleteDataItems(GoogleApiClient googleApiClient, Uri uri) {
        return deleteDataItems(googleApiClient, uri, 0);
    }

    public PendingResult<DeleteDataItemsResult> deleteDataItems(GoogleApiClient googleApiClient, final Uri uri, final int i) {
        boolean z = false;
        zzaa.zzb(uri != null, (Object) "uri must not be null");
        if (i == 0 || i == 1) {
            z = true;
        }
        zzaa.zzb(z, (Object) "invalid filter type");
        return googleApiClient.zzc(new e<DeleteDataItemsResult>(this, googleApiClient) {
            final /* synthetic */ zzx c;

            protected DeleteDataItemsResult a(Status status) {
                return new zzb(status, 0);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzb(this, uri, i);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<DataItemResult> getDataItem(GoogleApiClient googleApiClient, final Uri uri) {
        return googleApiClient.zzc(new e<DataItemResult>(this, googleApiClient) {
            final /* synthetic */ zzx b;

            protected DataItemResult a(Status status) {
                return new zza(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, uri);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new e<DataItemBuffer>(this, googleApiClient) {
            final /* synthetic */ zzx a;

            protected DataItemBuffer a(Status status) {
                return new DataItemBuffer(DataHolder.zzbQ(status.getStatusCode()));
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzv(this);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient, Uri uri) {
        return getDataItems(googleApiClient, uri, 0);
    }

    public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient, final Uri uri, final int i) {
        boolean z = false;
        zzaa.zzb(uri != null, (Object) "uri must not be null");
        if (i == 0 || i == 1) {
            z = true;
        }
        zzaa.zzb(z, (Object) "invalid filter type");
        return googleApiClient.zzc(new e<DataItemBuffer>(this, googleApiClient) {
            final /* synthetic */ zzx c;

            protected DataItemBuffer a(Status status) {
                return new DataItemBuffer(DataHolder.zzbQ(status.getStatusCode()));
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, uri, i);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<GetFdForAssetResult> getFdForAsset(GoogleApiClient googleApiClient, final Asset asset) {
        zza(asset);
        return googleApiClient.zzc(new e<GetFdForAssetResult>(this, googleApiClient) {
            final /* synthetic */ zzx b;

            protected GetFdForAssetResult a(Status status) {
                return new zzc(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, asset);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<GetFdForAssetResult> getFdForAsset(GoogleApiClient googleApiClient, final DataItemAsset dataItemAsset) {
        return googleApiClient.zzc(new e<GetFdForAssetResult>(this, googleApiClient) {
            final /* synthetic */ zzx b;

            protected GetFdForAssetResult a(Status status) {
                return new zzc(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, dataItemAsset);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<DataItemResult> putDataItem(GoogleApiClient googleApiClient, final PutDataRequest putDataRequest) {
        return googleApiClient.zzc(new e<DataItemResult>(this, googleApiClient) {
            final /* synthetic */ zzx b;

            public DataItemResult a(Status status) {
                return new zza(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, putDataRequest);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, final DataListener dataListener) {
        return googleApiClient.zzc(new e<Status>(this, googleApiClient) {
            final /* synthetic */ zzx b;

            public Status a(Status status) {
                return status;
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, dataListener);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }
}
