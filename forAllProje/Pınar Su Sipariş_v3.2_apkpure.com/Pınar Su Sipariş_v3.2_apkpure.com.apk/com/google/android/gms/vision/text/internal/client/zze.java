package com.google.android.gms.vision.text.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.zzqi;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.text.internal.client.zzc.zza;

public class zze {
    private final Context mContext;
    private boolean zzbxG = false;
    private zzb zzbyG = null;
    private final TextRecognizerOptions zzbyu;
    private final Object zzpp = new Object();

    public zze(Context context, TextRecognizerOptions textRecognizerOptions) {
        this.mContext = context;
        this.zzbyu = textRecognizerOptions;
        zzNd();
    }

    private zzb zzNd() {
        zzb com_google_android_gms_vision_text_internal_client_zzb;
        Throwable e;
        synchronized (this.zzpp) {
            if (this.zzbyG != null) {
                com_google_android_gms_vision_text_internal_client_zzb = this.zzbyG;
            } else {
                try {
                    this.zzbyG = zza.zzer(zzqi.zza(this.mContext, zzqi.zzaCr, "com.google.android.gms.vision.dynamite").zzdM("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zza(com.google.android.gms.dynamic.zze.zzD(this.mContext), this.zzbyu);
                } catch (zzqi.zza e2) {
                    e = e2;
                    Log.e("NativeTextRecognizerHandle", "Error creating remote native text detector", e);
                    if (!!this.zzbxG) {
                    }
                    Log.w("NativeTextRecognizerHandle", "Native text detector is now available.");
                    com_google_android_gms_vision_text_internal_client_zzb = this.zzbyG;
                    return com_google_android_gms_vision_text_internal_client_zzb;
                } catch (RemoteException e3) {
                    e = e3;
                    Log.e("NativeTextRecognizerHandle", "Error creating remote native text detector", e);
                    if (!this.zzbxG) {
                    }
                    Log.w("NativeTextRecognizerHandle", "Native text detector is now available.");
                    com_google_android_gms_vision_text_internal_client_zzb = this.zzbyG;
                    return com_google_android_gms_vision_text_internal_client_zzb;
                }
                if (!this.zzbxG && this.zzbyG == null) {
                    Log.w("NativeTextRecognizerHandle", "Native text detector not yet available.  Reverting to no-op detection.");
                    this.zzbxG = true;
                } else if (this.zzbxG && this.zzbyG != null) {
                    Log.w("NativeTextRecognizerHandle", "Native text detector is now available.");
                }
                com_google_android_gms_vision_text_internal_client_zzb = this.zzbyG;
            }
        }
        return com_google_android_gms_vision_text_internal_client_zzb;
    }

    public boolean isOperational() {
        return zzNd() != null;
    }

    public void zzNc() {
        synchronized (this.zzpp) {
            if (this.zzbyG == null) {
                return;
            }
            try {
                this.zzbyG.zzNc();
            } catch (Throwable e) {
                Log.e("NativeTextRecognizerHandle", "Could not finalize native recognizer", e);
            }
        }
    }

    public LineBoxParcel[] zzc(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel) {
        if (!isOperational()) {
            return new LineBoxParcel[0];
        }
        try {
            return zzNd().zzd(com.google.android.gms.dynamic.zze.zzD(bitmap), frameMetadataParcel);
        } catch (Throwable e) {
            Log.e("NativeTextRecognizerHandle", "Error calling native text recognizer", e);
            return new LineBoxParcel[0];
        }
    }
}
