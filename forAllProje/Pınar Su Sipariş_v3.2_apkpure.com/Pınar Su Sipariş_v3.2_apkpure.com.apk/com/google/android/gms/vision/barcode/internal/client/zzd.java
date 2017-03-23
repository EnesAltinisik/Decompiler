package com.google.android.gms.vision.barcode.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzqi;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.internal.client.zzc.zza;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

public class zzd {
    private final Context mContext;
    private final BarcodeDetectorOptions zzbxD;
    private zzb zzbxF = null;
    private boolean zzbxG = false;
    private final Object zzpp = new Object();

    public zzd(Context context, BarcodeDetectorOptions barcodeDetectorOptions) {
        this.mContext = context;
        this.zzbxD = barcodeDetectorOptions;
        zzMX();
    }

    private zzb zzMX() {
        zzb com_google_android_gms_vision_barcode_internal_client_zzb;
        Throwable e;
        synchronized (this.zzpp) {
            if (this.zzbxF != null) {
                com_google_android_gms_vision_barcode_internal_client_zzb = this.zzbxF;
            } else {
                try {
                    this.zzbxF = zza.zzen(zzqi.zza(this.mContext, zzqi.zzaCr, "com.google.android.gms.vision.dynamite").zzdM("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zza(zze.zzD(this.mContext), this.zzbxD);
                } catch (zzqi.zza e2) {
                    e = e2;
                    Log.e("NativeBarcodeDetectorHandle", "Error creating remote native barcode detector", e);
                    if (!!this.zzbxG) {
                    }
                    Log.w("NativeBarcodeDetectorHandle", "Native barcode detector is now available.");
                    com_google_android_gms_vision_barcode_internal_client_zzb = this.zzbxF;
                    return com_google_android_gms_vision_barcode_internal_client_zzb;
                } catch (RemoteException e3) {
                    e = e3;
                    Log.e("NativeBarcodeDetectorHandle", "Error creating remote native barcode detector", e);
                    if (!this.zzbxG) {
                    }
                    Log.w("NativeBarcodeDetectorHandle", "Native barcode detector is now available.");
                    com_google_android_gms_vision_barcode_internal_client_zzb = this.zzbxF;
                    return com_google_android_gms_vision_barcode_internal_client_zzb;
                }
                if (!this.zzbxG && this.zzbxF == null) {
                    Log.w("NativeBarcodeDetectorHandle", "Native barcode detector not yet available.  Reverting to no-op detection.");
                    this.zzbxG = true;
                } else if (this.zzbxG && this.zzbxF != null) {
                    Log.w("NativeBarcodeDetectorHandle", "Native barcode detector is now available.");
                }
                com_google_android_gms_vision_barcode_internal_client_zzb = this.zzbxF;
            }
        }
        return com_google_android_gms_vision_barcode_internal_client_zzb;
    }

    public boolean isOperational() {
        return zzMX() != null;
    }

    public void zzMW() {
        synchronized (this.zzpp) {
            if (this.zzbxF == null) {
                return;
            }
            try {
                this.zzbxF.zzMW();
            } catch (Throwable e) {
                Log.e("NativeBarcodeDetectorHandle", "Could not finalize native barcode detector", e);
            }
        }
    }

    public Barcode[] zza(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel) {
        if (!isOperational()) {
            return new Barcode[0];
        }
        try {
            return zzMX().zzb(zze.zzD(bitmap), frameMetadataParcel);
        } catch (Throwable e) {
            Log.e("NativeBarcodeDetectorHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }

    public Barcode[] zza(ByteBuffer byteBuffer, FrameMetadataParcel frameMetadataParcel) {
        if (!isOperational()) {
            return new Barcode[0];
        }
        try {
            return zzMX().zza(zze.zzD(byteBuffer), frameMetadataParcel);
        } catch (Throwable e) {
            Log.e("NativeBarcodeDetectorHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }
}
