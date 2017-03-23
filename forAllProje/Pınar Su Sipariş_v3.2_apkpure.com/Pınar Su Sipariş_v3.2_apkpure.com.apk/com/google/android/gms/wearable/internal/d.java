package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.internal.zzj.zza;
import com.google.android.gms.wearable.internal.zzj.zzc;
import com.google.android.gms.wearable.internal.zzj.zzd;
import com.google.android.gms.wearable.internal.zzj.zze;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

final class d {

    static abstract class b<T> extends zza {
        private zzb<T> a;

        public b(zzb<T> com_google_android_gms_internal_zznt_zzb_T) {
            this.a = com_google_android_gms_internal_zznt_zzb_T;
        }

        public void a(T t) {
            zzb com_google_android_gms_internal_zznt_zzb = this.a;
            if (com_google_android_gms_internal_zznt_zzb != null) {
                com_google_android_gms_internal_zznt_zzb.setResult(t);
                this.a = null;
            }
        }
    }

    static final class a extends b<AddLocalCapabilityResult> {
        public a(zzb<AddLocalCapabilityResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_AddLocalCapabilityResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_AddLocalCapabilityResult);
        }

        public void zza(AddLocalCapabilityResponse addLocalCapabilityResponse) {
            a(new zza(zzbk.zzgs(addLocalCapabilityResponse.statusCode)));
        }
    }

    static final class c extends b<Status> {
        public c(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        }

        public void zza(CloseChannelResponse closeChannelResponse) {
            a(new Status(closeChannelResponse.statusCode));
        }
    }

    static final class d extends b<Status> {
        public d(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        }

        public void zzb(CloseChannelResponse closeChannelResponse) {
            a(new Status(closeChannelResponse.statusCode));
        }
    }

    static final class e extends b<DeleteDataItemsResult> {
        public e(zzb<DeleteDataItemsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DeleteDataItemsResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DeleteDataItemsResult);
        }

        public void zza(DeleteDataItemsResponse deleteDataItemsResponse) {
            a(new zzx.zzb(zzbk.zzgs(deleteDataItemsResponse.statusCode), deleteDataItemsResponse.zzbDg));
        }
    }

    static final class f extends b<GetAllCapabilitiesResult> {
        public f(zzb<GetAllCapabilitiesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_GetAllCapabilitiesResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_GetAllCapabilitiesResult);
        }

        public void zza(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
            a(new zzd(zzbk.zzgs(getAllCapabilitiesResponse.statusCode), d.b(getAllCapabilitiesResponse.zzbDh)));
        }
    }

    static final class g extends b<GetCapabilityResult> {
        public g(zzb<GetCapabilityResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_GetCapabilityResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_GetCapabilityResult);
        }

        public void zza(GetCapabilityResponse getCapabilityResponse) {
            a(new zze(zzbk.zzgs(getCapabilityResponse.statusCode), new zzc(getCapabilityResponse.zzbDi)));
        }
    }

    static final class h extends b<GetInputStreamResult> {
        private final zzt a;

        public h(zzb<GetInputStreamResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_Channel_GetInputStreamResult, zzt com_google_android_gms_wearable_internal_zzt) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_Channel_GetInputStreamResult);
            this.a = (zzt) zzaa.zzz(com_google_android_gms_wearable_internal_zzt);
        }

        public void zza(GetChannelInputStreamResponse getChannelInputStreamResponse) {
            InputStream inputStream = null;
            if (getChannelInputStreamResponse.zzbDj != null) {
                inputStream = new zzp(new AutoCloseInputStream(getChannelInputStreamResponse.zzbDj));
                this.a.zza(inputStream.zzNE());
            }
            a(new a(new Status(getChannelInputStreamResponse.statusCode), inputStream));
        }
    }

    static final class i extends b<GetOutputStreamResult> {
        private final zzt a;

        public i(zzb<GetOutputStreamResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_Channel_GetOutputStreamResult, zzt com_google_android_gms_wearable_internal_zzt) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_Channel_GetOutputStreamResult);
            this.a = (zzt) zzaa.zzz(com_google_android_gms_wearable_internal_zzt);
        }

        public void zza(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
            OutputStream outputStream = null;
            if (getChannelOutputStreamResponse.zzbDj != null) {
                outputStream = new zzq(new AutoCloseOutputStream(getChannelOutputStreamResponse.zzbDj));
                this.a.zza(outputStream.zzNE());
            }
            a(new b(new Status(getChannelOutputStreamResponse.statusCode), outputStream));
        }
    }

    static final class j extends b<GetConnectedNodesResult> {
        public j(zzb<GetConnectedNodesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_NodeApi_GetConnectedNodesResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_NodeApi_GetConnectedNodesResult);
        }

        public void zza(GetConnectedNodesResponse getConnectedNodesResponse) {
            List arrayList = new ArrayList();
            arrayList.addAll(getConnectedNodesResponse.zzbDp);
            a(new zzbb.zza(zzbk.zzgs(getConnectedNodesResponse.statusCode), arrayList));
        }
    }

    static final class k extends b<DataItemResult> {
        public k(zzb<DataItemResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult);
        }

        public void zza(GetDataItemResponse getDataItemResponse) {
            a(new zzx.zza(zzbk.zzgs(getDataItemResponse.statusCode), getDataItemResponse.zzbDq));
        }
    }

    static final class l extends b<DataItemBuffer> {
        public l(zzb<DataItemBuffer> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataItemBuffer) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataItemBuffer);
        }

        public void zzar(DataHolder dataHolder) {
            a(new DataItemBuffer(dataHolder));
        }
    }

    static final class m extends b<GetFdForAssetResult> {
        public m(zzb<GetFdForAssetResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_GetFdForAssetResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_GetFdForAssetResult);
        }

        public void zza(GetFdForAssetResponse getFdForAssetResponse) {
            a(new zzx.zzc(zzbk.zzgs(getFdForAssetResponse.statusCode), getFdForAssetResponse.zzbDr));
        }
    }

    static final class n extends b<GetLocalNodeResult> {
        public n(zzb<GetLocalNodeResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_NodeApi_GetLocalNodeResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_NodeApi_GetLocalNodeResult);
        }

        public void zza(GetLocalNodeResponse getLocalNodeResponse) {
            a(new zzbb.zzb(zzbk.zzgs(getLocalNodeResponse.statusCode), getLocalNodeResponse.zzbDs));
        }
    }

    static final class o extends zza {
        o() {
        }

        public void zza(Status status) {
        }
    }

    static final class p extends b<OpenChannelResult> {
        public p(zzb<OpenChannelResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_ChannelApi_OpenChannelResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_ChannelApi_OpenChannelResult);
        }

        public void zza(OpenChannelResponse openChannelResponse) {
            a(new a(zzbk.zzgs(openChannelResponse.statusCode), openChannelResponse.zzbCJ));
        }
    }

    static final class q extends b<DataItemResult> {
        private final List<FutureTask<Boolean>> a;

        q(zzb<DataItemResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult, List<FutureTask<Boolean>> list) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult);
            this.a = list;
        }

        public void zza(PutDataResponse putDataResponse) {
            a(new zzx.zza(zzbk.zzgs(putDataResponse.statusCode), putDataResponse.zzbDq));
            if (putDataResponse.statusCode != 0) {
                for (FutureTask cancel : this.a) {
                    cancel.cancel(true);
                }
            }
        }
    }

    static final class r extends b<Status> {
        public r(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        }

        public void zza(ChannelSendFileResponse channelSendFileResponse) {
            a(new Status(channelSendFileResponse.statusCode));
        }
    }

    static final class s extends b<RemoveLocalCapabilityResult> {
        public s(zzb<RemoveLocalCapabilityResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_RemoveLocalCapabilityResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_RemoveLocalCapabilityResult);
        }

        public void zza(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
            a(new zza(zzbk.zzgs(removeLocalCapabilityResponse.statusCode)));
        }
    }

    static final class t extends b<SendMessageResult> {
        public t(zzb<SendMessageResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_MessageApi_SendMessageResult) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_MessageApi_SendMessageResult);
        }

        public void zza(SendMessageResponse sendMessageResponse) {
            a(new zzaz.zzb(zzbk.zzgs(sendMessageResponse.statusCode), sendMessageResponse.zzaUt));
        }
    }

    static final class u extends b<Status> {
        public u(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        }

        public void zza(ChannelReceiveFileResponse channelReceiveFileResponse) {
            a(new Status(channelReceiveFileResponse.statusCode));
        }
    }

    private static Map<String, CapabilityInfo> b(List<CapabilityInfoParcelable> list) {
        Map hashMap = new HashMap(list.size() * 2);
        for (CapabilityInfoParcelable capabilityInfoParcelable : list) {
            hashMap.put(capabilityInfoParcelable.getName(), new zzc(capabilityInfoParcelable));
        }
        return hashMap;
    }
}
