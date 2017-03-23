package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzou.zzb;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.internal.zzaw.zza;
import java.util.List;

public class zzbq<T> extends zza {
    private zzou<Object> zzbDV;
    private zzou<Object> zzbDW;
    private zzou<DataListener> zzbDX;
    private zzou<NodeListener> zzbDY;
    private zzou<Object> zzbDZ;
    private final IntentFilter[] zzbDz;
    private zzou<ChannelListener> zzbEa;
    private zzou<CapabilityListener> zzbEb;
    private final String zzbEc;
    private zzou<MessageListener> zzbif;

    class AnonymousClass1 implements zzb<DataListener> {
        final /* synthetic */ DataHolder a;

        AnonymousClass1(DataHolder dataHolder) {
            this.a = dataHolder;
        }

        public void a(DataListener dataListener) {
            try {
                dataListener.onDataChanged(new DataEventBuffer(this.a));
            } finally {
                this.a.close();
            }
        }

        public void zzrV() {
            this.a.close();
        }

        public /* synthetic */ void zzt(Object obj) {
            a((DataListener) obj);
        }
    }

    class AnonymousClass2 implements zzb<MessageListener> {
        final /* synthetic */ MessageEventParcelable a;

        AnonymousClass2(MessageEventParcelable messageEventParcelable) {
            this.a = messageEventParcelable;
        }

        public void a(MessageListener messageListener) {
            messageListener.onMessageReceived(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((MessageListener) obj);
        }
    }

    class AnonymousClass3 implements zzb<NodeListener> {
        final /* synthetic */ NodeParcelable a;

        AnonymousClass3(NodeParcelable nodeParcelable) {
            this.a = nodeParcelable;
        }

        public void a(NodeListener nodeListener) {
            nodeListener.onPeerConnected(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((NodeListener) obj);
        }
    }

    class AnonymousClass4 implements zzb<NodeListener> {
        final /* synthetic */ NodeParcelable a;

        AnonymousClass4(NodeParcelable nodeParcelable) {
            this.a = nodeParcelable;
        }

        public void a(NodeListener nodeListener) {
            nodeListener.onPeerDisconnected(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((NodeListener) obj);
        }
    }

    class AnonymousClass5 implements zzb<ChannelListener> {
        final /* synthetic */ ChannelEventParcelable a;

        AnonymousClass5(ChannelEventParcelable channelEventParcelable) {
            this.a = channelEventParcelable;
        }

        public void a(ChannelListener channelListener) {
            this.a.zza(channelListener);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((ChannelListener) obj);
        }
    }

    class AnonymousClass6 implements zzb<CapabilityListener> {
        final /* synthetic */ CapabilityInfoParcelable a;

        AnonymousClass6(CapabilityInfoParcelable capabilityInfoParcelable) {
            this.a = capabilityInfoParcelable;
        }

        public void a(CapabilityListener capabilityListener) {
            capabilityListener.onCapabilityChanged(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((CapabilityListener) obj);
        }
    }

    private zzbq(IntentFilter[] intentFilterArr, String str) {
        this.zzbDz = (IntentFilter[]) zzaa.zzz(intentFilterArr);
        this.zzbEc = str;
    }

    public static zzbq<ChannelListener> zza(zzou<ChannelListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener, String str, IntentFilter[] intentFilterArr) {
        zzbq<ChannelListener> com_google_android_gms_wearable_internal_zzbq = new zzbq(intentFilterArr, (String) zzaa.zzz(str));
        com_google_android_gms_wearable_internal_zzbq.zzbEa = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener);
        return com_google_android_gms_wearable_internal_zzbq;
    }

    public static zzbq<DataListener> zza(zzou<DataListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_DataApi_DataListener, IntentFilter[] intentFilterArr) {
        zzbq<DataListener> com_google_android_gms_wearable_internal_zzbq = new zzbq(intentFilterArr, null);
        com_google_android_gms_wearable_internal_zzbq.zzbDX = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_DataApi_DataListener);
        return com_google_android_gms_wearable_internal_zzbq;
    }

    private static zzb<DataListener> zzas(DataHolder dataHolder) {
        return new AnonymousClass1(dataHolder);
    }

    private static zzb<CapabilityListener> zzb(CapabilityInfoParcelable capabilityInfoParcelable) {
        return new AnonymousClass6(capabilityInfoParcelable);
    }

    private static zzb<ChannelListener> zzb(ChannelEventParcelable channelEventParcelable) {
        return new AnonymousClass5(channelEventParcelable);
    }

    private static zzb<MessageListener> zzb(MessageEventParcelable messageEventParcelable) {
        return new AnonymousClass2(messageEventParcelable);
    }

    public static zzbq<MessageListener> zzb(zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_MessageApi_MessageListener, IntentFilter[] intentFilterArr) {
        zzbq<MessageListener> com_google_android_gms_wearable_internal_zzbq = new zzbq(intentFilterArr, null);
        com_google_android_gms_wearable_internal_zzbq.zzbif = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_MessageApi_MessageListener);
        return com_google_android_gms_wearable_internal_zzbq;
    }

    private static zzb<NodeListener> zzc(NodeParcelable nodeParcelable) {
        return new AnonymousClass3(nodeParcelable);
    }

    public static zzbq<NodeListener> zzc(zzou<NodeListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_NodeApi_NodeListener, IntentFilter[] intentFilterArr) {
        zzbq<NodeListener> com_google_android_gms_wearable_internal_zzbq = new zzbq(intentFilterArr, null);
        com_google_android_gms_wearable_internal_zzbq.zzbDY = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_NodeApi_NodeListener);
        return com_google_android_gms_wearable_internal_zzbq;
    }

    private static zzb<NodeListener> zzd(NodeParcelable nodeParcelable) {
        return new AnonymousClass4(nodeParcelable);
    }

    public static zzbq<ChannelListener> zzd(zzou<ChannelListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener, IntentFilter[] intentFilterArr) {
        zzbq<ChannelListener> com_google_android_gms_wearable_internal_zzbq = new zzbq(intentFilterArr, null);
        com_google_android_gms_wearable_internal_zzbq.zzbEa = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener);
        return com_google_android_gms_wearable_internal_zzbq;
    }

    public static zzbq<CapabilityListener> zze(zzou<CapabilityListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_CapabilityApi_CapabilityListener, IntentFilter[] intentFilterArr) {
        zzbq<CapabilityListener> com_google_android_gms_wearable_internal_zzbq = new zzbq(intentFilterArr, null);
        com_google_android_gms_wearable_internal_zzbq.zzbEb = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_CapabilityApi_CapabilityListener);
        return com_google_android_gms_wearable_internal_zzbq;
    }

    private static void zzi(zzou<?> com_google_android_gms_internal_zzou_) {
        if (com_google_android_gms_internal_zzou_ != null) {
            com_google_android_gms_internal_zzou_.clear();
        }
    }

    public void clear() {
        zzi(null);
        this.zzbDV = null;
        zzi(null);
        this.zzbDW = null;
        zzi(this.zzbDX);
        this.zzbDX = null;
        zzi(this.zzbif);
        this.zzbif = null;
        zzi(this.zzbDY);
        this.zzbDY = null;
        zzi(null);
        this.zzbDZ = null;
        zzi(this.zzbEa);
        this.zzbEa = null;
        zzi(this.zzbEb);
        this.zzbEb = null;
    }

    public void onConnectedNodes(List<NodeParcelable> list) {
    }

    public IntentFilter[] zzNJ() {
        return this.zzbDz;
    }

    public String zzNK() {
        return this.zzbEc;
    }

    public void zza(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
    }

    public void zza(AncsNotificationParcelable ancsNotificationParcelable) {
    }

    public void zza(CapabilityInfoParcelable capabilityInfoParcelable) {
        if (this.zzbEb != null) {
            this.zzbEb.zza(zzb(capabilityInfoParcelable));
        }
    }

    public void zza(ChannelEventParcelable channelEventParcelable) {
        if (this.zzbEa != null) {
            this.zzbEa.zza(zzb(channelEventParcelable));
        }
    }

    public void zza(MessageEventParcelable messageEventParcelable) {
        if (this.zzbif != null) {
            this.zzbif.zza(zzb(messageEventParcelable));
        }
    }

    public void zza(NodeParcelable nodeParcelable) {
        if (this.zzbDY != null) {
            this.zzbDY.zza(zzc(nodeParcelable));
        }
    }

    public void zzaq(DataHolder dataHolder) {
        if (this.zzbDX != null) {
            this.zzbDX.zza(zzas(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    public void zzb(NodeParcelable nodeParcelable) {
        if (this.zzbDY != null) {
            this.zzbDY.zza(zzd(nodeParcelable));
        }
    }
}
