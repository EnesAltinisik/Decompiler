package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

public interface zzam extends IInterface {

    public static abstract class zza extends Binder implements zzam {

        private static class a implements zzam {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public IntentSender zza(CreateFileIntentSenderRequest createFileIntentSenderRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        createFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    IntentSender intentSender = obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return intentSender;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IntentSender zza(OpenFileIntentSenderRequest openFileIntentSenderRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        openFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    IntentSender intentSender = obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return intentSender;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public DriveServiceResponse zza(OpenContentsRequest openContentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                DriveServiceResponse driveServiceResponse = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openContentsRequest != null) {
                        obtain.writeInt(1);
                        openContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        driveServiceResponse = (DriveServiceResponse) DriveServiceResponse.CREATOR.createFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return driveServiceResponse;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public DriveServiceResponse zza(StreamContentsRequest streamContentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                DriveServiceResponse driveServiceResponse = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (streamContentsRequest != null) {
                        obtain.writeInt(1);
                        streamContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        driveServiceResponse = (DriveServiceResponse) DriveServiceResponse.CREATOR.createFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return driveServiceResponse;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (realtimeDocumentSyncRequest != null) {
                        obtain.writeInt(1);
                        realtimeDocumentSyncRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(AddEventListenerRequest addEventListenerRequest, zzao com_google_android_gms_drive_internal_zzao, String str, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addEventListenerRequest != null) {
                        obtain.writeInt(1);
                        addEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzao != null ? com_google_android_gms_drive_internal_zzao.asBinder() : null);
                    obtain.writeString(str);
                    if (com_google_android_gms_drive_internal_zzan != null) {
                        iBinder = com_google_android_gms_drive_internal_zzan.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(AddPermissionRequest addPermissionRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addPermissionRequest != null) {
                        obtain.writeInt(1);
                        addPermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(AuthorizeAccessRequest authorizeAccessRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (authorizeAccessRequest != null) {
                        obtain.writeInt(1);
                        authorizeAccessRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(CancelPendingActionsRequest cancelPendingActionsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (cancelPendingActionsRequest != null) {
                        obtain.writeInt(1);
                        cancelPendingActionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(ChangeResourceParentsRequest changeResourceParentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (changeResourceParentsRequest != null) {
                        obtain.writeInt(1);
                        changeResourceParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(CheckResourceIdsExistRequest checkResourceIdsExistRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (checkResourceIdsExistRequest != null) {
                        obtain.writeInt(1);
                        checkResourceIdsExistRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsAndUpdateMetadataRequest != null) {
                        obtain.writeInt(1);
                        closeContentsAndUpdateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(CloseContentsRequest closeContentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsRequest != null) {
                        obtain.writeInt(1);
                        closeContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(ControlProgressRequest controlProgressRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (controlProgressRequest != null) {
                        obtain.writeInt(1);
                        controlProgressRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(CreateContentsRequest createContentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createContentsRequest != null) {
                        obtain.writeInt(1);
                        createContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(CreateFileRequest createFileRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileRequest != null) {
                        obtain.writeInt(1);
                        createFileRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(CreateFolderRequest createFolderRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFolderRequest != null) {
                        obtain.writeInt(1);
                        createFolderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(DeleteResourceRequest deleteResourceRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (deleteResourceRequest != null) {
                        obtain.writeInt(1);
                        deleteResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(DisconnectRequest disconnectRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (disconnectRequest != null) {
                        obtain.writeInt(1);
                        disconnectRequest.writeToParcel(obtain, 0);
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

            public void zza(FetchThumbnailRequest fetchThumbnailRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (fetchThumbnailRequest != null) {
                        obtain.writeInt(1);
                        fetchThumbnailRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetChangesRequest getChangesRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getChangesRequest != null) {
                        obtain.writeInt(1);
                        getChangesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getDriveIdFromUniqueIdentifierRequest != null) {
                        obtain.writeInt(1);
                        getDriveIdFromUniqueIdentifierRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetMetadataRequest getMetadataRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getMetadataRequest != null) {
                        obtain.writeInt(1);
                        getMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(GetPermissionsRequest getPermissionsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getPermissionsRequest != null) {
                        obtain.writeInt(1);
                        getPermissionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(ListParentsRequest listParentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (listParentsRequest != null) {
                        obtain.writeInt(1);
                        listParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(LoadRealtimeRequest loadRealtimeRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (loadRealtimeRequest != null) {
                        obtain.writeInt(1);
                        loadRealtimeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(QueryRequest queryRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(QueryRequest queryRequest, zzao com_google_android_gms_drive_internal_zzao, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzao != null ? com_google_android_gms_drive_internal_zzao.asBinder() : null);
                    if (com_google_android_gms_drive_internal_zzan != null) {
                        iBinder = com_google_android_gms_drive_internal_zzan.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(RemoveEventListenerRequest removeEventListenerRequest, zzao com_google_android_gms_drive_internal_zzao, String str, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removeEventListenerRequest != null) {
                        obtain.writeInt(1);
                        removeEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzao != null ? com_google_android_gms_drive_internal_zzao.asBinder() : null);
                    obtain.writeString(str);
                    if (com_google_android_gms_drive_internal_zzan != null) {
                        iBinder = com_google_android_gms_drive_internal_zzan.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(RemovePermissionRequest removePermissionRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removePermissionRequest != null) {
                        obtain.writeInt(1);
                        removePermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setFileUploadPreferencesRequest != null) {
                        obtain.writeInt(1);
                        setFileUploadPreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setPinnedDownloadPreferencesRequest != null) {
                        obtain.writeInt(1);
                        setPinnedDownloadPreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(SetResourceParentsRequest setResourceParentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setResourceParentsRequest != null) {
                        obtain.writeInt(1);
                        setResourceParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(TrashResourceRequest trashResourceRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (trashResourceRequest != null) {
                        obtain.writeInt(1);
                        trashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(UnsubscribeResourceRequest unsubscribeResourceRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (unsubscribeResourceRequest != null) {
                        obtain.writeInt(1);
                        unsubscribeResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(UntrashResourceRequest untrashResourceRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (untrashResourceRequest != null) {
                        obtain.writeInt(1);
                        untrashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(UpdateMetadataRequest updateMetadataRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updateMetadataRequest != null) {
                        obtain.writeInt(1);
                        updateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(UpdatePermissionRequest updatePermissionRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updatePermissionRequest != null) {
                        obtain.writeInt(1);
                        updatePermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzao com_google_android_gms_drive_internal_zzao, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzao != null ? com_google_android_gms_drive_internal_zzao.asBinder() : null);
                    if (com_google_android_gms_drive_internal_zzan != null) {
                        iBinder = com_google_android_gms_drive_internal_zzan.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(QueryRequest queryRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzd(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zze(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzf(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzg(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzh(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(com_google_android_gms_drive_internal_zzan != null ? com_google_android_gms_drive_internal_zzan.asBinder() : null);
                    this.a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzam zzbh(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzam)) ? new a(iBinder) : (zzam) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            StreamContentsRequest streamContentsRequest = null;
            QueryRequest queryRequest;
            DriveServiceResponse zza;
            IntentSender zza2;
            switch (i) {
                case 1:
                    GetMetadataRequest getMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getMetadataRequest = (GetMetadataRequest) GetMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(getMetadataRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(queryRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    UpdateMetadataRequest updateMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        updateMetadataRequest = (UpdateMetadataRequest) UpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(updateMetadataRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    CreateContentsRequest createContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createContentsRequest = (CreateContentsRequest) CreateContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(createContentsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    CreateFileRequest createFileRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFileRequest = (CreateFileRequest) CreateFileRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(createFileRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    CreateFolderRequest createFolderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFolderRequest = (CreateFolderRequest) CreateFolderRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(createFolderRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    OpenContentsRequest openContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        openContentsRequest = (OpenContentsRequest) OpenContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza = zza(openContentsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (zza != null) {
                        parcel2.writeInt(1);
                        zza.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    CloseContentsRequest closeContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        closeContentsRequest = (CloseContentsRequest) CloseContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(closeContentsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zza(com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    OpenFileIntentSenderRequest openFileIntentSenderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        openFileIntentSenderRequest = (OpenFileIntentSenderRequest) OpenFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza2 = zza(openFileIntentSenderRequest);
                    parcel2.writeNoException();
                    if (zza2 != null) {
                        parcel2.writeInt(1);
                        zza2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    CreateFileIntentSenderRequest createFileIntentSenderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFileIntentSenderRequest = (CreateFileIntentSenderRequest) CreateFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza2 = zza(createFileIntentSenderRequest);
                    parcel2.writeNoException();
                    if (zza2 != null) {
                        parcel2.writeInt(1);
                        zza2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    AuthorizeAccessRequest authorizeAccessRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        authorizeAccessRequest = (AuthorizeAccessRequest) AuthorizeAccessRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(authorizeAccessRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    ListParentsRequest listParentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        listParentsRequest = (ListParentsRequest) ListParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(listParentsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    AddEventListenerRequest addEventListenerRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        addEventListenerRequest = (AddEventListenerRequest) AddEventListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(addEventListenerRequest, com.google.android.gms.drive.internal.zzao.zza.zzbj(parcel.readStrongBinder()), parcel.readString(), com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    RemoveEventListenerRequest removeEventListenerRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        removeEventListenerRequest = (RemoveEventListenerRequest) RemoveEventListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(removeEventListenerRequest, com.google.android.gms.drive.internal.zzao.zza.zzbj(parcel.readStrongBinder()), parcel.readString(), com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    DisconnectRequest disconnectRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        disconnectRequest = (DisconnectRequest) DisconnectRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(disconnectRequest);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    TrashResourceRequest trashResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        trashResourceRequest = (TrashResourceRequest) TrashResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(trashResourceRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        closeContentsAndUpdateMetadataRequest = (CloseContentsAndUpdateMetadataRequest) CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(closeContentsAndUpdateMetadataRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    zzb(queryRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    DeleteResourceRequest deleteResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        deleteResourceRequest = (DeleteResourceRequest) DeleteResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(deleteResourceRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    LoadRealtimeRequest loadRealtimeRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        loadRealtimeRequest = (LoadRealtimeRequest) LoadRealtimeRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(loadRealtimeRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    SetResourceParentsRequest setResourceParentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setResourceParentsRequest = (SetResourceParentsRequest) SetResourceParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(setResourceParentsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getDriveIdFromUniqueIdentifierRequest = (GetDriveIdFromUniqueIdentifierRequest) GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(getDriveIdFromUniqueIdentifierRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    CheckResourceIdsExistRequest checkResourceIdsExistRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        checkResourceIdsExistRequest = (CheckResourceIdsExistRequest) CheckResourceIdsExistRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(checkResourceIdsExistRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zzb(com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zzc(com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setPinnedDownloadPreferencesRequest = (SetPinnedDownloadPreferencesRequest) SetPinnedDownloadPreferencesRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(setPinnedDownloadPreferencesRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    RealtimeDocumentSyncRequest realtimeDocumentSyncRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        realtimeDocumentSyncRequest = (RealtimeDocumentSyncRequest) RealtimeDocumentSyncRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(realtimeDocumentSyncRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zzd(com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    SetFileUploadPreferencesRequest setFileUploadPreferencesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setFileUploadPreferencesRequest = (SetFileUploadPreferencesRequest) SetFileUploadPreferencesRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(setFileUploadPreferencesRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    CancelPendingActionsRequest cancelPendingActionsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        cancelPendingActionsRequest = (CancelPendingActionsRequest) CancelPendingActionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(cancelPendingActionsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    UntrashResourceRequest untrashResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        untrashResourceRequest = (UntrashResourceRequest) UntrashResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(untrashResourceRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zze(com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    FetchThumbnailRequest fetchThumbnailRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        fetchThumbnailRequest = (FetchThumbnailRequest) FetchThumbnailRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(fetchThumbnailRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zzf(com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    GetChangesRequest getChangesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getChangesRequest = (GetChangesRequest) GetChangesRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(getChangesRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 46:
                    UnsubscribeResourceRequest unsubscribeResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        unsubscribeResourceRequest = (UnsubscribeResourceRequest) UnsubscribeResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(unsubscribeResourceRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 47:
                    GetPermissionsRequest getPermissionsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getPermissionsRequest = (GetPermissionsRequest) GetPermissionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(getPermissionsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 48:
                    AddPermissionRequest addPermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        addPermissionRequest = (AddPermissionRequest) AddPermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(addPermissionRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 49:
                    UpdatePermissionRequest updatePermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        updatePermissionRequest = (UpdatePermissionRequest) UpdatePermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(updatePermissionRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    RemovePermissionRequest removePermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        removePermissionRequest = (RemovePermissionRequest) RemovePermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(removePermissionRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(queryRequest, com.google.android.gms.drive.internal.zzao.zza.zzbj(parcel.readStrongBinder()), com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 52:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zza(com.google.android.gms.drive.internal.zzao.zza.zzbj(parcel.readStrongBinder()), com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    ControlProgressRequest controlProgressRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        controlProgressRequest = (ControlProgressRequest) ControlProgressRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(controlProgressRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 54:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zzg(com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 55:
                    ChangeResourceParentsRequest changeResourceParentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        changeResourceParentsRequest = (ChangeResourceParentsRequest) ChangeResourceParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(changeResourceParentsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 56:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        streamContentsRequest = (StreamContentsRequest) StreamContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza = zza(streamContentsRequest, com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (zza != null) {
                        parcel2.writeInt(1);
                        zza.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 57:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    zzh(com.google.android.gms.drive.internal.zzan.zza.zzbi(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.internal.IDriveService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IntentSender zza(CreateFileIntentSenderRequest createFileIntentSenderRequest) throws RemoteException;

    IntentSender zza(OpenFileIntentSenderRequest openFileIntentSenderRequest) throws RemoteException;

    DriveServiceResponse zza(OpenContentsRequest openContentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    DriveServiceResponse zza(StreamContentsRequest streamContentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(AddEventListenerRequest addEventListenerRequest, zzao com_google_android_gms_drive_internal_zzao, String str, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(AddPermissionRequest addPermissionRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(AuthorizeAccessRequest authorizeAccessRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(CancelPendingActionsRequest cancelPendingActionsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(ChangeResourceParentsRequest changeResourceParentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(CheckResourceIdsExistRequest checkResourceIdsExistRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(CloseContentsRequest closeContentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(ControlProgressRequest controlProgressRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(CreateContentsRequest createContentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(CreateFileRequest createFileRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(CreateFolderRequest createFolderRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(DeleteResourceRequest deleteResourceRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(DisconnectRequest disconnectRequest) throws RemoteException;

    void zza(FetchThumbnailRequest fetchThumbnailRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(GetChangesRequest getChangesRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(GetMetadataRequest getMetadataRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(GetPermissionsRequest getPermissionsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(ListParentsRequest listParentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(LoadRealtimeRequest loadRealtimeRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(QueryRequest queryRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(QueryRequest queryRequest, zzao com_google_android_gms_drive_internal_zzao, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(RemoveEventListenerRequest removeEventListenerRequest, zzao com_google_android_gms_drive_internal_zzao, String str, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(RemovePermissionRequest removePermissionRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(SetResourceParentsRequest setResourceParentsRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(TrashResourceRequest trashResourceRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(UnsubscribeResourceRequest unsubscribeResourceRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(UntrashResourceRequest untrashResourceRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(UpdateMetadataRequest updateMetadataRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(UpdatePermissionRequest updatePermissionRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zza(zzao com_google_android_gms_drive_internal_zzao, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zzb(QueryRequest queryRequest, zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zzb(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zzc(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zzd(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zze(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zzf(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zzg(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;

    void zzh(zzan com_google_android_gms_drive_internal_zzan) throws RemoteException;
}
