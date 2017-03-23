package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface zzav extends IInterface {

    public static abstract class zza extends Binder implements zzav {

        private static class a implements zzav {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void zza(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(AddLocalCapabilityResponse addLocalCapabilityResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (addLocalCapabilityResponse != null) {
                        obtain.writeInt(1);
                        addLocalCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(ChannelReceiveFileResponse channelReceiveFileResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (channelReceiveFileResponse != null) {
                        obtain.writeInt(1);
                        channelReceiveFileResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(ChannelSendFileResponse channelSendFileResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (channelSendFileResponse != null) {
                        obtain.writeInt(1);
                        channelSendFileResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(CloseChannelResponse closeChannelResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (closeChannelResponse != null) {
                        obtain.writeInt(1);
                        closeChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(DeleteDataItemsResponse deleteDataItemsResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (deleteDataItemsResponse != null) {
                        obtain.writeInt(1);
                        deleteDataItemsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetAllCapabilitiesResponse getAllCapabilitiesResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getAllCapabilitiesResponse != null) {
                        obtain.writeInt(1);
                        getAllCapabilitiesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetCapabilityResponse getCapabilityResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCapabilityResponse != null) {
                        obtain.writeInt(1);
                        getCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetChannelInputStreamResponse getChannelInputStreamResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getChannelInputStreamResponse != null) {
                        obtain.writeInt(1);
                        getChannelInputStreamResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetChannelOutputStreamResponse getChannelOutputStreamResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getChannelOutputStreamResponse != null) {
                        obtain.writeInt(1);
                        getChannelOutputStreamResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCloudSyncOptInOutDoneResponse != null) {
                        obtain.writeInt(1);
                        getCloudSyncOptInOutDoneResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCloudSyncOptInStatusResponse != null) {
                        obtain.writeInt(1);
                        getCloudSyncOptInStatusResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetCloudSyncSettingResponse getCloudSyncSettingResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCloudSyncSettingResponse != null) {
                        obtain.writeInt(1);
                        getCloudSyncSettingResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetConfigResponse getConfigResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConfigResponse != null) {
                        obtain.writeInt(1);
                        getConfigResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetConfigsResponse getConfigsResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConfigsResponse != null) {
                        obtain.writeInt(1);
                        getConfigsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetConnectedNodesResponse getConnectedNodesResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConnectedNodesResponse != null) {
                        obtain.writeInt(1);
                        getConnectedNodesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetDataItemResponse getDataItemResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getDataItemResponse != null) {
                        obtain.writeInt(1);
                        getDataItemResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetFdForAssetResponse getFdForAssetResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getFdForAssetResponse != null) {
                        obtain.writeInt(1);
                        getFdForAssetResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetLocalNodeResponse getLocalNodeResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getLocalNodeResponse != null) {
                        obtain.writeInt(1);
                        getLocalNodeResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(OpenChannelResponse openChannelResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (openChannelResponse != null) {
                        obtain.writeInt(1);
                        openChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(PutDataResponse putDataResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (putDataResponse != null) {
                        obtain.writeInt(1);
                        putDataResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (removeLocalCapabilityResponse != null) {
                        obtain.writeInt(1);
                        removeLocalCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(SendMessageResponse sendMessageResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (sendMessageResponse != null) {
                        obtain.writeInt(1);
                        sendMessageResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(StorageInfoResponse storageInfoResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (storageInfoResponse != null) {
                        obtain.writeInt(1);
                        storageInfoResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzar(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(CloseChannelResponse closeChannelResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (closeChannelResponse != null) {
                        obtain.writeInt(1);
                        closeChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        public static zzav zzeB(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzav)) ? new a(iBinder) : (zzav) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            RemoveLocalCapabilityResponse removeLocalCapabilityResponse = null;
            CloseChannelResponse closeChannelResponse;
            switch (i) {
                case 2:
                    GetConfigResponse getConfigResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getConfigResponse = (GetConfigResponse) GetConfigResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getConfigResponse);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    PutDataResponse putDataResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        putDataResponse = (PutDataResponse) PutDataResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(putDataResponse);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    GetDataItemResponse getDataItemResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getDataItemResponse = (GetDataItemResponse) GetDataItemResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getDataItemResponse);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    DataHolder dataHolder;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        dataHolder = (DataHolder) DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    zzar(dataHolder);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    DeleteDataItemsResponse deleteDataItemsResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        deleteDataItemsResponse = (DeleteDataItemsResponse) DeleteDataItemsResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(deleteDataItemsResponse);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    SendMessageResponse sendMessageResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        sendMessageResponse = (SendMessageResponse) SendMessageResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(sendMessageResponse);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    GetFdForAssetResponse getFdForAssetResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getFdForAssetResponse = (GetFdForAssetResponse) GetFdForAssetResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getFdForAssetResponse);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    GetLocalNodeResponse getLocalNodeResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getLocalNodeResponse = (GetLocalNodeResponse) GetLocalNodeResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getLocalNodeResponse);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    GetConnectedNodesResponse getConnectedNodesResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getConnectedNodesResponse = (GetConnectedNodesResponse) GetConnectedNodesResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getConnectedNodesResponse);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    Status status;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        status = (Status) Status.CREATOR.createFromParcel(parcel);
                    }
                    zza(status);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    StorageInfoResponse storageInfoResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        storageInfoResponse = (StorageInfoResponse) StorageInfoResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(storageInfoResponse);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    GetConfigsResponse getConfigsResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getConfigsResponse = (GetConfigsResponse) GetConfigsResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getConfigsResponse);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    OpenChannelResponse openChannelResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        openChannelResponse = (OpenChannelResponse) OpenChannelResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(openChannelResponse);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        closeChannelResponse = (CloseChannelResponse) CloseChannelResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(closeChannelResponse);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        closeChannelResponse = (CloseChannelResponse) CloseChannelResponse.CREATOR.createFromParcel(parcel);
                    }
                    zzb(closeChannelResponse);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    GetChannelInputStreamResponse getChannelInputStreamResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getChannelInputStreamResponse = (GetChannelInputStreamResponse) GetChannelInputStreamResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getChannelInputStreamResponse);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    GetChannelOutputStreamResponse getChannelOutputStreamResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getChannelOutputStreamResponse = (GetChannelOutputStreamResponse) GetChannelOutputStreamResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getChannelOutputStreamResponse);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    ChannelReceiveFileResponse channelReceiveFileResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        channelReceiveFileResponse = (ChannelReceiveFileResponse) ChannelReceiveFileResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(channelReceiveFileResponse);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    ChannelSendFileResponse channelSendFileResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        channelSendFileResponse = (ChannelSendFileResponse) ChannelSendFileResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(channelSendFileResponse);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    GetCapabilityResponse getCapabilityResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getCapabilityResponse = (GetCapabilityResponse) GetCapabilityResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getCapabilityResponse);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    GetAllCapabilitiesResponse getAllCapabilitiesResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getAllCapabilitiesResponse = (GetAllCapabilitiesResponse) GetAllCapabilitiesResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getAllCapabilitiesResponse);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    AddLocalCapabilityResponse addLocalCapabilityResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        addLocalCapabilityResponse = (AddLocalCapabilityResponse) AddLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(addLocalCapabilityResponse);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        removeLocalCapabilityResponse = (RemoveLocalCapabilityResponse) RemoveLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(removeLocalCapabilityResponse);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getCloudSyncOptInOutDoneResponse = (GetCloudSyncOptInOutDoneResponse) GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getCloudSyncOptInOutDoneResponse);
                    parcel2.writeNoException();
                    return true;
                case 29:
                    GetCloudSyncSettingResponse getCloudSyncSettingResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getCloudSyncSettingResponse = (GetCloudSyncSettingResponse) GetCloudSyncSettingResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getCloudSyncSettingResponse);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getCloudSyncOptInStatusResponse = (GetCloudSyncOptInStatusResponse) GetCloudSyncOptInStatusResponse.CREATOR.createFromParcel(parcel);
                    }
                    zza(getCloudSyncOptInStatusResponse);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(Status status) throws RemoteException;

    void zza(AddLocalCapabilityResponse addLocalCapabilityResponse) throws RemoteException;

    void zza(ChannelReceiveFileResponse channelReceiveFileResponse) throws RemoteException;

    void zza(ChannelSendFileResponse channelSendFileResponse) throws RemoteException;

    void zza(CloseChannelResponse closeChannelResponse) throws RemoteException;

    void zza(DeleteDataItemsResponse deleteDataItemsResponse) throws RemoteException;

    void zza(GetAllCapabilitiesResponse getAllCapabilitiesResponse) throws RemoteException;

    void zza(GetCapabilityResponse getCapabilityResponse) throws RemoteException;

    void zza(GetChannelInputStreamResponse getChannelInputStreamResponse) throws RemoteException;

    void zza(GetChannelOutputStreamResponse getChannelOutputStreamResponse) throws RemoteException;

    void zza(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) throws RemoteException;

    void zza(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) throws RemoteException;

    void zza(GetCloudSyncSettingResponse getCloudSyncSettingResponse) throws RemoteException;

    void zza(GetConfigResponse getConfigResponse) throws RemoteException;

    void zza(GetConfigsResponse getConfigsResponse) throws RemoteException;

    void zza(GetConnectedNodesResponse getConnectedNodesResponse) throws RemoteException;

    void zza(GetDataItemResponse getDataItemResponse) throws RemoteException;

    void zza(GetFdForAssetResponse getFdForAssetResponse) throws RemoteException;

    void zza(GetLocalNodeResponse getLocalNodeResponse) throws RemoteException;

    void zza(OpenChannelResponse openChannelResponse) throws RemoteException;

    void zza(PutDataResponse putDataResponse) throws RemoteException;

    void zza(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) throws RemoteException;

    void zza(SendMessageResponse sendMessageResponse) throws RemoteException;

    void zza(StorageInfoResponse storageInfoResponse) throws RemoteException;

    void zzar(DataHolder dataHolder) throws RemoteException;

    void zzb(CloseChannelResponse closeChannelResponse) throws RemoteException;
}
