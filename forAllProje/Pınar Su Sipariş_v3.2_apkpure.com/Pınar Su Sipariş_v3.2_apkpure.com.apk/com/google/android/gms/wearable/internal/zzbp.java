package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.zzax.zza;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class zzbp extends zzk<zzax> {
    private final a<Object> zzbDK;
    private final a<Object> zzbDL;
    private final a<ChannelListener> zzbDM;
    private final a<DataListener> zzbDN;
    private final a<MessageListener> zzbDO;
    private final a<NodeListener> zzbDP;
    private final a<Object> zzbDQ;
    private final a<CapabilityListener> zzbDR;
    private final ExecutorService zzbqx;

    public zzbp(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzg com_google_android_gms_common_internal_zzg) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg, Executors.newCachedThreadPool());
    }

    zzbp(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzg com_google_android_gms_common_internal_zzg, ExecutorService executorService) {
        super(context, looper, 14, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzbDK = new a();
        this.zzbDL = new a();
        this.zzbDM = new a();
        this.zzbDN = new a();
        this.zzbDO = new a();
        this.zzbDP = new a();
        this.zzbDQ = new a();
        this.zzbDR = new a();
        this.zzbqx = (ExecutorService) zzaa.zzz(executorService);
    }

    private FutureTask<Boolean> zza(final ParcelFileDescriptor parcelFileDescriptor, final byte[] bArr) {
        return new FutureTask(new Callable<Boolean>(this) {
            final /* synthetic */ zzbp c;

            public java.lang.Boolean a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0105 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r6 = this;
                r1 = 3;
                r0 = "WearableClient";
                r0 = android.util.Log.isLoggable(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x0009:
                r0 = "WearableClient";
                r1 = r3;
                r1 = java.lang.String.valueOf(r1);
                r2 = new java.lang.StringBuilder;
                r3 = java.lang.String.valueOf(r1);
                r3 = r3.length();
                r3 = r3 + 36;
                r2.<init>(r3);
                r3 = "processAssets: writing data to FD : ";
                r2 = r2.append(r3);
                r1 = r2.append(r1);
                r1 = r1.toString();
                android.util.Log.d(r0, r1);
            L_0x0031:
                r1 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream;
                r0 = r3;
                r1.<init>(r0);
                r0 = r4;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r1.write(r0);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r1.flush();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = 3;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r0 = android.util.Log.isLoggable(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                if (r0 == 0) goto L_0x0071;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
            L_0x0049:
                r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r3;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = r4.length();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = r4 + 27;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3.<init>(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = "processAssets: wrote data: ";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3 = r3.append(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r3.append(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r2.toString();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                android.util.Log.d(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
            L_0x0071:
                r0 = 1;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = "WearableClient";	 Catch:{ IOException -> 0x0148 }
                r3 = 3;	 Catch:{ IOException -> 0x0148 }
                r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x0148 }
                if (r2 == 0) goto L_0x00a7;	 Catch:{ IOException -> 0x0148 }
            L_0x007f:
                r2 = "WearableClient";	 Catch:{ IOException -> 0x0148 }
                r3 = r3;	 Catch:{ IOException -> 0x0148 }
                r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0148 }
                r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0148 }
                r5 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0148 }
                r5 = r5.length();	 Catch:{ IOException -> 0x0148 }
                r5 = r5 + 24;	 Catch:{ IOException -> 0x0148 }
                r4.<init>(r5);	 Catch:{ IOException -> 0x0148 }
                r5 = "processAssets: closing: ";	 Catch:{ IOException -> 0x0148 }
                r4 = r4.append(r5);	 Catch:{ IOException -> 0x0148 }
                r3 = r4.append(r3);	 Catch:{ IOException -> 0x0148 }
                r3 = r3.toString();	 Catch:{ IOException -> 0x0148 }
                android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x0148 }
            L_0x00a7:
                r1.close();	 Catch:{ IOException -> 0x0148 }
            L_0x00aa:
                return r0;
            L_0x00ab:
                r0 = move-exception;
                r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r3;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = r4.length();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = r4 + 36;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3.<init>(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r4 = "processAssets: writing data failed: ";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r3 = r3.append(r4);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r3.append(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r2 = r2.toString();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                android.util.Log.w(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
                r0 = "WearableClient";
                r2 = 3;
                r0 = android.util.Log.isLoggable(r0, r2);
                if (r0 == 0) goto L_0x0105;
            L_0x00dd:
                r0 = "WearableClient";
                r2 = r3;
                r2 = java.lang.String.valueOf(r2);
                r3 = new java.lang.StringBuilder;
                r4 = java.lang.String.valueOf(r2);
                r4 = r4.length();
                r4 = r4 + 24;
                r3.<init>(r4);
                r4 = "processAssets: closing: ";
                r3 = r3.append(r4);
                r2 = r3.append(r2);
                r2 = r2.toString();
                android.util.Log.d(r0, r2);
            L_0x0105:
                r1.close();
            L_0x0108:
                r0 = 0;
                r0 = java.lang.Boolean.valueOf(r0);
                goto L_0x00aa;
            L_0x010e:
                r0 = move-exception;
                r2 = "WearableClient";	 Catch:{ IOException -> 0x0144 }
                r3 = 3;	 Catch:{ IOException -> 0x0144 }
                r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x0144 }
                if (r2 == 0) goto L_0x0140;	 Catch:{ IOException -> 0x0144 }
            L_0x0118:
                r2 = "WearableClient";	 Catch:{ IOException -> 0x0144 }
                r3 = r3;	 Catch:{ IOException -> 0x0144 }
                r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0144 }
                r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0144 }
                r5 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0144 }
                r5 = r5.length();	 Catch:{ IOException -> 0x0144 }
                r5 = r5 + 24;	 Catch:{ IOException -> 0x0144 }
                r4.<init>(r5);	 Catch:{ IOException -> 0x0144 }
                r5 = "processAssets: closing: ";	 Catch:{ IOException -> 0x0144 }
                r4 = r4.append(r5);	 Catch:{ IOException -> 0x0144 }
                r3 = r4.append(r3);	 Catch:{ IOException -> 0x0144 }
                r3 = r3.toString();	 Catch:{ IOException -> 0x0144 }
                android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x0144 }
            L_0x0140:
                r1.close();	 Catch:{ IOException -> 0x0144 }
            L_0x0143:
                throw r0;
            L_0x0144:
                r1 = move-exception;
                goto L_0x0143;
            L_0x0146:
                r0 = move-exception;
                goto L_0x0108;
            L_0x0148:
                r1 = move-exception;
                goto L_0x00aa;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzbp.1.a():java.lang.Boolean");
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    private Runnable zzb(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, Uri uri, long j, long j2) {
        zzaa.zzz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        zzaa.zzz(str);
        zzaa.zzz(uri);
        zzaa.zzb(j >= 0, "startOffset is negative: %s", Long.valueOf(j));
        zzaa.zzb(j2 >= -1, "invalid length: %s", Long.valueOf(j2));
        final Uri uri2 = uri;
        final zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status2 = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        final String str2 = str;
        final long j3 = j;
        final long j4 = j2;
        return new Runnable(this) {
            final /* synthetic */ zzbp f;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r8 = this;
                r0 = "WearableClient";
                r1 = 2;
                r0 = android.util.Log.isLoggable(r0, r1);
                if (r0 == 0) goto L_0x0010;
            L_0x0009:
                r0 = "WearableClient";
                r1 = "Executing sendFileToChannelTask";
                android.util.Log.v(r0, r1);
            L_0x0010:
                r0 = "file";
                r1 = r3;
                r1 = r1.getScheme();
                r0 = r0.equals(r1);
                if (r0 != 0) goto L_0x0034;
            L_0x001e:
                r0 = "WearableClient";
                r1 = "Channel.sendFile used with non-file URI";
                android.util.Log.w(r0, r1);
                r0 = r4;
                r1 = new com.google.android.gms.common.api.Status;
                r2 = 10;
                r3 = "Channel.sendFile used with non-file URI";
                r1.<init>(r2, r3);
                r0.zzx(r1);
            L_0x0033:
                return;
            L_0x0034:
                r0 = new java.io.File;
                r1 = r3;
                r1 = r1.getPath();
                r0.<init>(r1);
                r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
                r3 = android.os.ParcelFileDescriptor.open(r0, r1);	 Catch:{ FileNotFoundException -> 0x006a }
                r0 = r8.f;	 Catch:{ RemoteException -> 0x009e }
                r0 = r0.zztm();	 Catch:{ RemoteException -> 0x009e }
                r0 = (com.google.android.gms.wearable.internal.zzax) r0;	 Catch:{ RemoteException -> 0x009e }
                r1 = new com.google.android.gms.wearable.internal.d$r;	 Catch:{ RemoteException -> 0x009e }
                r2 = r4;	 Catch:{ RemoteException -> 0x009e }
                r1.<init>(r2);	 Catch:{ RemoteException -> 0x009e }
                r2 = r5;	 Catch:{ RemoteException -> 0x009e }
                r4 = r6;	 Catch:{ RemoteException -> 0x009e }
                r6 = r8;	 Catch:{ RemoteException -> 0x009e }
                r0.zza(r1, r2, r3, r4, r6);	 Catch:{ RemoteException -> 0x009e }
                r3.close();	 Catch:{ IOException -> 0x0061 }
                goto L_0x0033;
            L_0x0061:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Failed to close sourceFd";
                android.util.Log.w(r1, r2, r0);
                goto L_0x0033;
            L_0x006a:
                r1 = move-exception;
                r1 = "WearableClient";
                r0 = java.lang.String.valueOf(r0);
                r2 = new java.lang.StringBuilder;
                r3 = java.lang.String.valueOf(r0);
                r3 = r3.length();
                r3 = r3 + 46;
                r2.<init>(r3);
                r3 = "File couldn't be opened for Channel.sendFile: ";
                r2 = r2.append(r3);
                r0 = r2.append(r0);
                r0 = r0.toString();
                android.util.Log.w(r1, r0);
                r0 = r4;
                r1 = new com.google.android.gms.common.api.Status;
                r2 = 13;
                r1.<init>(r2);
                r0.zzx(r1);
                goto L_0x0033;
            L_0x009e:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Channel.sendFile failed.";
                android.util.Log.w(r1, r2, r0);	 Catch:{ all -> 0x00c1 }
                r0 = r4;	 Catch:{ all -> 0x00c1 }
                r1 = new com.google.android.gms.common.api.Status;	 Catch:{ all -> 0x00c1 }
                r2 = 8;
                r1.<init>(r2);	 Catch:{ all -> 0x00c1 }
                r0.zzx(r1);	 Catch:{ all -> 0x00c1 }
                r3.close();	 Catch:{ IOException -> 0x00b7 }
                goto L_0x0033;
            L_0x00b7:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Failed to close sourceFd";
                android.util.Log.w(r1, r2, r0);
                goto L_0x0033;
            L_0x00c1:
                r0 = move-exception;
                r3.close();	 Catch:{ IOException -> 0x00c6 }
            L_0x00c5:
                throw r0;
            L_0x00c6:
                r1 = move-exception;
                r2 = "WearableClient";
                r3 = "Failed to close sourceFd";
                android.util.Log.w(r2, r3, r1);
                goto L_0x00c5;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzbp.3.run():void");
            }
        };
    }

    private Runnable zzb(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, Uri uri, boolean z) {
        zzaa.zzz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        zzaa.zzz(str);
        zzaa.zzz(uri);
        final Uri uri2 = uri;
        final zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status2 = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        final boolean z2 = z;
        final String str2 = str;
        return new Runnable(this) {
            final /* synthetic */ zzbp e;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r4 = this;
                r0 = "WearableClient";
                r1 = 2;
                r0 = android.util.Log.isLoggable(r0, r1);
                if (r0 == 0) goto L_0x0010;
            L_0x0009:
                r0 = "WearableClient";
                r1 = "Executing receiveFileFromChannelTask";
                android.util.Log.v(r0, r1);
            L_0x0010:
                r0 = "file";
                r1 = r2;
                r1 = r1.getScheme();
                r0 = r0.equals(r1);
                if (r0 != 0) goto L_0x0034;
            L_0x001e:
                r0 = "WearableClient";
                r1 = "Channel.receiveFile used with non-file URI";
                android.util.Log.w(r0, r1);
                r0 = r3;
                r1 = new com.google.android.gms.common.api.Status;
                r2 = 10;
                r3 = "Channel.receiveFile used with non-file URI";
                r1.<init>(r2, r3);
                r0.zzx(r1);
            L_0x0033:
                return;
            L_0x0034:
                r1 = new java.io.File;
                r0 = r2;
                r0 = r0.getPath();
                r1.<init>(r0);
                r2 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
                r0 = r4;
                if (r0 == 0) goto L_0x006d;
            L_0x0045:
                r0 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
            L_0x0047:
                r0 = r0 | r2;
                r1 = android.os.ParcelFileDescriptor.open(r1, r0);	 Catch:{ FileNotFoundException -> 0x006f }
                r0 = r4.e;	 Catch:{ RemoteException -> 0x00a3 }
                r0 = r0.zztm();	 Catch:{ RemoteException -> 0x00a3 }
                r0 = (com.google.android.gms.wearable.internal.zzax) r0;	 Catch:{ RemoteException -> 0x00a3 }
                r2 = new com.google.android.gms.wearable.internal.d$u;	 Catch:{ RemoteException -> 0x00a3 }
                r3 = r3;	 Catch:{ RemoteException -> 0x00a3 }
                r2.<init>(r3);	 Catch:{ RemoteException -> 0x00a3 }
                r3 = r5;	 Catch:{ RemoteException -> 0x00a3 }
                r0.zza(r2, r3, r1);	 Catch:{ RemoteException -> 0x00a3 }
                r1.close();	 Catch:{ IOException -> 0x0064 }
                goto L_0x0033;
            L_0x0064:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Failed to close targetFd";
                android.util.Log.w(r1, r2, r0);
                goto L_0x0033;
            L_0x006d:
                r0 = 0;
                goto L_0x0047;
            L_0x006f:
                r0 = move-exception;
                r0 = "WearableClient";
                r1 = java.lang.String.valueOf(r1);
                r2 = new java.lang.StringBuilder;
                r3 = java.lang.String.valueOf(r1);
                r3 = r3.length();
                r3 = r3 + 49;
                r2.<init>(r3);
                r3 = "File couldn't be opened for Channel.receiveFile: ";
                r2 = r2.append(r3);
                r1 = r2.append(r1);
                r1 = r1.toString();
                android.util.Log.w(r0, r1);
                r0 = r3;
                r1 = new com.google.android.gms.common.api.Status;
                r2 = 13;
                r1.<init>(r2);
                r0.zzx(r1);
                goto L_0x0033;
            L_0x00a3:
                r0 = move-exception;
                r2 = "WearableClient";
                r3 = "Channel.receiveFile failed.";
                android.util.Log.w(r2, r3, r0);	 Catch:{ all -> 0x00c6 }
                r0 = r3;	 Catch:{ all -> 0x00c6 }
                r2 = new com.google.android.gms.common.api.Status;	 Catch:{ all -> 0x00c6 }
                r3 = 8;
                r2.<init>(r3);	 Catch:{ all -> 0x00c6 }
                r0.zzx(r2);	 Catch:{ all -> 0x00c6 }
                r1.close();	 Catch:{ IOException -> 0x00bc }
                goto L_0x0033;
            L_0x00bc:
                r0 = move-exception;
                r1 = "WearableClient";
                r2 = "Failed to close targetFd";
                android.util.Log.w(r1, r2, r0);
                goto L_0x0033;
            L_0x00c6:
                r0 = move-exception;
                r1.close();	 Catch:{ IOException -> 0x00cb }
            L_0x00ca:
                throw r0;
            L_0x00cb:
                r1 = move-exception;
                r2 = "WearableClient";
                r3 = "Failed to close targetFd";
                android.util.Log.w(r2, r3, r1);
                goto L_0x00ca;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzbp.2.run():void");
            }
        };
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.d("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.zzbDK.a(iBinder);
            this.zzbDL.a(iBinder);
            this.zzbDM.a(iBinder);
            this.zzbDN.a(iBinder);
            this.zzbDO.a(iBinder);
            this.zzbDP.a(iBinder);
            this.zzbDQ.a(iBinder);
            this.zzbDR.a(iBinder);
        }
        super.zza(i, iBinder, bundle, i2);
    }

    public void zza(zzb<DataItemResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult, Uri uri) throws RemoteException {
        ((zzax) zztm()).zza(new k(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult), uri);
    }

    public void zza(zzb<DataItemBuffer> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataItemBuffer, Uri uri, int i) throws RemoteException {
        ((zzax) zztm()).zza(new l(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataItemBuffer), uri, i);
    }

    public void zza(zzb<GetFdForAssetResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_GetFdForAssetResult, Asset asset) throws RemoteException {
        ((zzax) zztm()).zza(new m(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_GetFdForAssetResult), asset);
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, CapabilityListener capabilityListener) throws RemoteException {
        this.zzbDR.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, capabilityListener);
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, CapabilityListener capabilityListener, zzou<CapabilityListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_CapabilityApi_CapabilityListener, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzbDR.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, capabilityListener, zzbq.zze(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_CapabilityApi_CapabilityListener, intentFilterArr));
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, ChannelListener channelListener, zzou<ChannelListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener, String str, IntentFilter[] intentFilterArr) throws RemoteException {
        if (str == null) {
            this.zzbDM.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, channelListener, zzbq.zzd(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener, intentFilterArr));
            return;
        }
        this.zzbDM.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, new c(str, channelListener), zzbq.zza(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener, str, intentFilterArr));
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, ChannelListener channelListener, String str) throws RemoteException {
        if (str == null) {
            this.zzbDM.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, channelListener);
            return;
        }
        this.zzbDM.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, new c(str, channelListener));
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, DataListener dataListener) throws RemoteException {
        this.zzbDN.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, dataListener);
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, DataListener dataListener, zzou<DataListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_DataApi_DataListener, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzbDN.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, dataListener, zzbq.zza(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_DataApi_DataListener, intentFilterArr));
    }

    public void zza(zzb<GetFdForAssetResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_GetFdForAssetResult, DataItemAsset dataItemAsset) throws RemoteException {
        zza((zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_GetFdForAssetResult, Asset.createFromRef(dataItemAsset.getId()));
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, MessageListener messageListener) throws RemoteException {
        this.zzbDO.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, messageListener);
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, MessageListener messageListener, zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_MessageApi_MessageListener, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzbDO.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, messageListener, zzbq.zzb(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_MessageApi_MessageListener, intentFilterArr));
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, NodeListener nodeListener) throws RemoteException {
        this.zzbDP.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, nodeListener);
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, NodeListener nodeListener, zzou<NodeListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_NodeApi_NodeListener, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzbDP.a(this, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, nodeListener, zzbq.zzc(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_NodeApi_NodeListener, intentFilterArr));
    }

    public void zza(zzb<DataItemResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult, PutDataRequest putDataRequest) throws RemoteException {
        for (Entry value : putDataRequest.getAssets().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.getData() == null && asset.getDigest() == null && asset.getFd() == null && asset.getUri() == null) {
                String valueOf = String.valueOf(putDataRequest.getUri());
                String valueOf2 = String.valueOf(asset);
                throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("Put for ").append(valueOf).append(" contains invalid asset: ").append(valueOf2).toString());
            }
        }
        PutDataRequest zzu = PutDataRequest.zzu(putDataRequest.getUri());
        zzu.setData(putDataRequest.getData());
        if (putDataRequest.isUrgent()) {
            zzu.setUrgent();
        }
        List arrayList = new ArrayList();
        for (Entry value2 : putDataRequest.getAssets().entrySet()) {
            Asset asset2 = (Asset) value2.getValue();
            if (asset2.getData() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        Log.d("WearableClient", new StringBuilder(((String.valueOf(valueOf3).length() + 61) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("processAssets: replacing data with FD in asset: ").append(valueOf3).append(" read:").append(valueOf4).append(" write:").append(valueOf5).toString());
                    }
                    zzu.putAsset((String) value2.getKey(), Asset.createFromFd(createPipe[0]));
                    Runnable zza = zza(createPipe[1], asset2.getData());
                    arrayList.add(zza);
                    this.zzbqx.submit(zza);
                } catch (Throwable e) {
                    valueOf = String.valueOf(putDataRequest);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 60).append("Unable to create ParcelFileDescriptor for asset in request: ").append(valueOf).toString(), e);
                }
            } else if (asset2.getUri() != null) {
                try {
                    zzu.putAsset((String) value2.getKey(), Asset.createFromFd(getContext().getContentResolver().openFileDescriptor(asset2.getUri(), "r")));
                } catch (FileNotFoundException e2) {
                    new q(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult, arrayList).zza(new PutDataResponse(4005, null));
                    String valueOf6 = String.valueOf(asset2.getUri());
                    Log.w("WearableClient", new StringBuilder(String.valueOf(valueOf6).length() + 28).append("Couldn't resolve asset URI: ").append(valueOf6).toString());
                    return;
                }
            } else {
                zzu.putAsset((String) value2.getKey(), asset2);
            }
        }
        ((zzax) zztm()).zza(new q(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DataItemResult, arrayList), zzu);
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, Uri uri, long j, long j2) {
        try {
            this.zzbqx.execute(zzb(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, str, uri, j, j2));
        } catch (RuntimeException e) {
            com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status.zzx(new Status(8));
            throw e;
        }
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, Uri uri, boolean z) {
        try {
            this.zzbqx.execute(zzb(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, str, uri, z));
        } catch (RuntimeException e) {
            com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status.zzx(new Status(8));
            throw e;
        }
    }

    public void zza(zzb<SendMessageResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_MessageApi_SendMessageResult, String str, String str2, byte[] bArr) throws RemoteException {
        ((zzax) zztm()).zza(new t(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_MessageApi_SendMessageResult), str, str2, bArr);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzeF(iBinder);
    }

    public void zzb(zzb<DeleteDataItemsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DeleteDataItemsResult, Uri uri, int i) throws RemoteException {
        ((zzax) zztm()).zzb(new e(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataApi_DeleteDataItemsResult), uri, i);
    }

    public void zzd(zzb<GetAllCapabilitiesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_GetAllCapabilitiesResult, int i) throws RemoteException {
        ((zzax) zztm()).zza(new f(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_GetAllCapabilitiesResult), i);
    }

    public void zze(zzb<OpenChannelResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_ChannelApi_OpenChannelResult, String str, String str2) throws RemoteException {
        ((zzax) zztm()).zza(new p(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_ChannelApi_OpenChannelResult), str, str2);
    }

    protected zzax zzeF(IBinder iBinder) {
        return zza.zzeD(iBinder);
    }

    public void zzh(zzb<GetCapabilityResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_GetCapabilityResult, String str, int i) throws RemoteException {
        ((zzax) zztm()).zza(new g(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_GetCapabilityResult), str, i);
    }

    protected String zzhT() {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String zzhU() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public void zzi(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, int i) throws RemoteException {
        ((zzax) zztm()).zzb(new d(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), str, i);
    }

    public void zzv(zzb<DataItemBuffer> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataItemBuffer) throws RemoteException {
        ((zzax) zztm()).zzb(new l(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_DataItemBuffer));
    }

    public void zzv(zzb<AddLocalCapabilityResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_AddLocalCapabilityResult, String str) throws RemoteException {
        ((zzax) zztm()).zzd(new a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_AddLocalCapabilityResult), str);
    }

    public void zzw(zzb<GetLocalNodeResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_NodeApi_GetLocalNodeResult) throws RemoteException {
        ((zzax) zztm()).zzc(new n(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_NodeApi_GetLocalNodeResult));
    }

    public void zzw(zzb<RemoveLocalCapabilityResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_RemoveLocalCapabilityResult, String str) throws RemoteException {
        ((zzax) zztm()).zze(new s(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_CapabilityApi_RemoveLocalCapabilityResult), str);
    }

    public void zzx(zzb<GetConnectedNodesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_NodeApi_GetConnectedNodesResult) throws RemoteException {
        ((zzax) zztm()).zzd(new j(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_NodeApi_GetConnectedNodesResult));
    }

    public void zzx(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str) throws RemoteException {
        ((zzax) zztm()).zzf(new c(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), str);
    }

    public void zzy(zzb<GetInputStreamResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_Channel_GetInputStreamResult, String str) throws RemoteException {
        zzau com_google_android_gms_wearable_internal_zzt = new zzt();
        ((zzax) zztm()).zza(new h(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_Channel_GetInputStreamResult, com_google_android_gms_wearable_internal_zzt), com_google_android_gms_wearable_internal_zzt, str);
    }

    public void zzz(zzb<GetOutputStreamResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_Channel_GetOutputStreamResult, String str) throws RemoteException {
        zzau com_google_android_gms_wearable_internal_zzt = new zzt();
        ((zzax) zztm()).zzb(new i(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_wearable_Channel_GetOutputStreamResult, com_google_android_gms_wearable_internal_zzt), com_google_android_gms_wearable_internal_zzt, str);
    }
}
