package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzqi;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.android.gms.vision.face.internal.client.zzd.zza;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

public class zzf {
    private final Context mContext;
    private boolean zzbxG = false;
    private final FaceSettingsParcel zzbyi;
    private zzc zzbyj = null;
    private final Object zzpp = new Object();

    public zzf(Context context, FaceSettingsParcel faceSettingsParcel) {
        this.mContext = context;
        this.zzbyi = faceSettingsParcel;
        zzMY();
    }

    private zzc zzMY() {
        zzc com_google_android_gms_vision_face_internal_client_zzc;
        Throwable e;
        synchronized (this.zzpp) {
            if (this.zzbyj != null) {
                com_google_android_gms_vision_face_internal_client_zzc = this.zzbyj;
            } else {
                try {
                    this.zzbyj = zza.zzep(zzqi.zza(this.mContext, zzqi.zzaCr, "com.google.android.gms.vision.dynamite").zzdM("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator")).zza(zze.zzD(this.mContext), this.zzbyi);
                } catch (zzqi.zza e2) {
                    e = e2;
                    Log.e("FaceDetectorHandle", "Error creating remote native face detector", e);
                    if (!!this.zzbxG) {
                    }
                    Log.w("FaceDetectorHandle", "Native face detector is now available.");
                    com_google_android_gms_vision_face_internal_client_zzc = this.zzbyj;
                    return com_google_android_gms_vision_face_internal_client_zzc;
                } catch (RemoteException e3) {
                    e = e3;
                    Log.e("FaceDetectorHandle", "Error creating remote native face detector", e);
                    if (!this.zzbxG) {
                    }
                    Log.w("FaceDetectorHandle", "Native face detector is now available.");
                    com_google_android_gms_vision_face_internal_client_zzc = this.zzbyj;
                    return com_google_android_gms_vision_face_internal_client_zzc;
                }
                if (!this.zzbxG && this.zzbyj == null) {
                    Log.w("FaceDetectorHandle", "Native face detector not yet available.  Reverting to no-op detection.");
                    this.zzbxG = true;
                } else if (this.zzbxG && this.zzbyj != null) {
                    Log.w("FaceDetectorHandle", "Native face detector is now available.");
                }
                com_google_android_gms_vision_face_internal_client_zzc = this.zzbyj;
            }
        }
        return com_google_android_gms_vision_face_internal_client_zzc;
    }

    private Face zza(FaceParcel faceParcel) {
        return new Face(faceParcel.id, new PointF(faceParcel.centerX, faceParcel.centerY), faceParcel.width, faceParcel.height, faceParcel.zzbxX, faceParcel.zzbxY, zzb(faceParcel), faceParcel.zzbya, faceParcel.zzbyb, faceParcel.zzbyc);
    }

    private Landmark zza(LandmarkParcel landmarkParcel) {
        return new Landmark(new PointF(landmarkParcel.x, landmarkParcel.y), landmarkParcel.type);
    }

    private Landmark[] zzb(FaceParcel faceParcel) {
        int i = 0;
        LandmarkParcel[] landmarkParcelArr = faceParcel.zzbxZ;
        if (landmarkParcelArr == null) {
            return new Landmark[0];
        }
        Landmark[] landmarkArr = new Landmark[landmarkParcelArr.length];
        while (i < landmarkParcelArr.length) {
            landmarkArr[i] = zza(landmarkParcelArr[i]);
            i++;
        }
        return landmarkArr;
    }

    public boolean isOperational() {
        return zzMY() != null;
    }

    public void zzMW() {
        synchronized (this.zzpp) {
            if (this.zzbyj == null) {
                return;
            }
            try {
                this.zzbyj.zzMW();
            } catch (Throwable e) {
                Log.e("FaceDetectorHandle", "Could not finalize native face detector", e);
            }
        }
    }

    public Face[] zzb(ByteBuffer byteBuffer, FrameMetadataParcel frameMetadataParcel) {
        int i = 0;
        if (!isOperational()) {
            return new Face[0];
        }
        try {
            FaceParcel[] zzc = zzMY().zzc(zze.zzD(byteBuffer), frameMetadataParcel);
            Face[] faceArr = new Face[zzc.length];
            while (i < zzc.length) {
                faceArr[i] = zza(zzc[i]);
                i++;
            }
            return faceArr;
        } catch (Throwable e) {
            Log.e("FaceDetectorHandle", "Could not call native face detector", e);
            return new Face[0];
        }
    }

    public boolean zzlx(int i) {
        boolean z = false;
        if (isOperational()) {
            try {
                z = zzMY().zzlx(i);
            } catch (Throwable e) {
                Log.e("FaceDetectorHandle", "Could not call native face detector", e);
            }
        }
        return z;
    }
}
