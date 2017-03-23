package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ChannelImpl extends AbstractSafeParcelable implements Channel {
    public static final Creator<ChannelImpl> CREATOR = new zzo();
    private final String mPath;
    final int mVersionCode;
    private final String zzabf;
    private final String zzbBH;

    class AnonymousClass7 implements a<ChannelListener> {
        final /* synthetic */ String a;
        final /* synthetic */ IntentFilter[] b;

        AnonymousClass7(String str, IntentFilter[] intentFilterArr) {
            this.a = str;
            this.b = intentFilterArr;
        }

        public void a(zzbp com_google_android_gms_wearable_internal_zzbp, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, ChannelListener channelListener, zzou<ChannelListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbp.zza((zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, channelListener, (zzou) com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener, this.a, this.b);
        }
    }

    static final class a implements GetInputStreamResult {
        private final Status a;
        private final InputStream b;

        a(Status status, InputStream inputStream) {
            this.a = (Status) zzaa.zzz(status);
            this.b = inputStream;
        }

        public InputStream getInputStream() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }

        public void release() {
            if (this.b != null) {
                try {
                    this.b.close();
                } catch (IOException e) {
                }
            }
        }
    }

    static final class b implements GetOutputStreamResult {
        private final Status a;
        private final OutputStream b;

        b(Status status, OutputStream outputStream) {
            this.a = (Status) zzaa.zzz(status);
            this.b = outputStream;
        }

        public OutputStream getOutputStream() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }

        public void release() {
            if (this.b != null) {
                try {
                    this.b.close();
                } catch (IOException e) {
                }
            }
        }
    }

    ChannelImpl(int i, String str, String str2, String str3) {
        this.mVersionCode = i;
        this.zzabf = (String) zzaa.zzz(str);
        this.zzbBH = (String) zzaa.zzz(str2);
        this.mPath = (String) zzaa.zzz(str3);
    }

    private static a<ChannelListener> zza(String str, IntentFilter[] intentFilterArr) {
        return new AnonymousClass7(str, intentFilterArr);
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelListener channelListener) {
        return b.a(googleApiClient, zza(this.zzabf, new IntentFilter[]{zzbn.zzhE(ChannelApi.ACTION_CHANNEL_EVENT)}), channelListener);
    }

    public PendingResult<Status> close(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new e<Status>(this, googleApiClient) {
            final /* synthetic */ ChannelImpl a;

            protected Status a(Status status) {
                return status;
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzx(this, this.a.zzabf);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> close(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.zzc(new e<Status>(this, googleApiClient) {
            final /* synthetic */ ChannelImpl b;

            protected Status a(Status status) {
                return status;
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzi(this, this.b.zzabf, i);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.zzabf.equals(channelImpl.zzabf) && zzz.equal(channelImpl.zzbBH, this.zzbBH) && zzz.equal(channelImpl.mPath, this.mPath) && channelImpl.mVersionCode == this.mVersionCode;
    }

    public PendingResult<GetInputStreamResult> getInputStream(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new e<GetInputStreamResult>(this, googleApiClient) {
            final /* synthetic */ ChannelImpl a;

            public GetInputStreamResult a(Status status) {
                return new a(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzy(this, this.a.zzabf);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public String getNodeId() {
        return this.zzbBH;
    }

    public PendingResult<GetOutputStreamResult> getOutputStream(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new e<GetOutputStreamResult>(this, googleApiClient) {
            final /* synthetic */ ChannelImpl a;

            public GetOutputStreamResult a(Status status) {
                return new b(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzz(this, this.a.zzabf);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public String getPath() {
        return this.mPath;
    }

    public String getToken() {
        return this.zzabf;
    }

    public int hashCode() {
        return this.zzabf.hashCode();
    }

    public PendingResult<Status> receiveFile(GoogleApiClient googleApiClient, final Uri uri, final boolean z) {
        zzaa.zzb((Object) googleApiClient, (Object) "client is null");
        zzaa.zzb((Object) uri, (Object) "uri is null");
        return googleApiClient.zzc(new e<Status>(this, googleApiClient) {
            final /* synthetic */ ChannelImpl c;

            public Status a(Status status) {
                return status;
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((zzb) this, this.c.zzabf, uri, z);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelListener channelListener) {
        zzaa.zzb((Object) googleApiClient, (Object) "client is null");
        zzaa.zzb((Object) channelListener, (Object) "listener is null");
        return googleApiClient.zzc(new b(googleApiClient, channelListener, this.zzabf));
    }

    public PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri) {
        return sendFile(googleApiClient, uri, 0, -1);
    }

    public PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri, long j, long j2) {
        zzaa.zzb((Object) googleApiClient, (Object) "client is null");
        zzaa.zzb(this.zzabf, (Object) "token is null");
        zzaa.zzb((Object) uri, (Object) "uri is null");
        zzaa.zzb(j >= 0, "startOffset is negative: %s", Long.valueOf(j));
        boolean z = j2 >= 0 || j2 == -1;
        zzaa.zzb(z, "invalid length: %s", Long.valueOf(j2));
        final Uri uri2 = uri;
        final long j3 = j;
        final long j4 = j2;
        return googleApiClient.zzc(new e<Status>(this, googleApiClient) {
            final /* synthetic */ ChannelImpl d;

            public Status a(Status status) {
                return status;
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((zzb) this, this.d.zzabf, uri2, j3, j4);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public String toString() {
        int i = this.mVersionCode;
        String str = this.zzabf;
        String str2 = this.zzbBH;
        String str3 = this.mPath;
        return new StringBuilder(((String.valueOf(str).length() + 66) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("ChannelImpl{versionCode=").append(i).append(", token='").append(str).append("'").append(", nodeId='").append(str2).append("'").append(", path='").append(str3).append("'").append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }
}
