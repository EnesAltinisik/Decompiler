package com.google.android.gms.vision.face;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.zza;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public final class FaceDetector extends Detector<Face> {
    public static final int ACCURATE_MODE = 1;
    public static final int ALL_CLASSIFICATIONS = 1;
    public static final int ALL_LANDMARKS = 1;
    public static final int FAST_MODE = 0;
    public static final int NO_CLASSIFICATIONS = 0;
    public static final int NO_LANDMARKS = 0;
    private final zza zzbxO;
    private final zzf zzbxP;
    private boolean zzbxQ;
    private final Object zzpp;

    public static class Builder {
        private final Context mContext;
        private int zzauY = 0;
        private int zzbxR = 0;
        private boolean zzbxS = false;
        private int zzbxT = 0;
        private boolean zzbxU = true;
        private float zzbxV = -1.0f;

        public Builder(Context context) {
            this.mContext = context;
        }

        public FaceDetector build() {
            FaceSettingsParcel faceSettingsParcel = new FaceSettingsParcel();
            faceSettingsParcel.mode = this.zzauY;
            faceSettingsParcel.zzbyd = this.zzbxR;
            faceSettingsParcel.zzbye = this.zzbxT;
            faceSettingsParcel.zzbyf = this.zzbxS;
            faceSettingsParcel.zzbyg = this.zzbxU;
            faceSettingsParcel.zzbyh = this.zzbxV;
            return new FaceDetector(new zzf(this.mContext, faceSettingsParcel));
        }

        public Builder setClassificationType(int i) {
            if (i == 0 || i == 1) {
                this.zzbxT = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid classification type: " + i);
        }

        public Builder setLandmarkType(int i) {
            if (i == 0 || i == 1) {
                this.zzbxR = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid landmark type: " + i);
        }

        public Builder setMinFaceSize(float f) {
            if (f < 0.0f || f > TextTrackStyle.DEFAULT_FONT_SCALE) {
                throw new IllegalArgumentException("Invalid proportional face size: " + f);
            }
            this.zzbxV = f;
            return this;
        }

        public Builder setMode(int i) {
            switch (i) {
                case 0:
                case 1:
                    this.zzauY = i;
                    return this;
                default:
                    throw new IllegalArgumentException("Invalid mode: " + i);
            }
        }

        public Builder setProminentFaceOnly(boolean z) {
            this.zzbxS = z;
            return this;
        }

        public Builder setTrackingEnabled(boolean z) {
            this.zzbxU = z;
            return this;
        }
    }

    private FaceDetector() {
        this.zzbxO = new zza();
        this.zzpp = new Object();
        this.zzbxQ = true;
        throw new IllegalStateException("Default constructor called");
    }

    private FaceDetector(zzf com_google_android_gms_vision_face_internal_client_zzf) {
        this.zzbxO = new zza();
        this.zzpp = new Object();
        this.zzbxQ = true;
        this.zzbxP = com_google_android_gms_vision_face_internal_client_zzf;
    }

    public SparseArray<Face> detect(Frame frame) {
        if (frame == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        Face[] zzb;
        ByteBuffer grayscaleImageData = frame.getGrayscaleImageData();
        synchronized (this.zzpp) {
            if (this.zzbxQ) {
                zzb = this.zzbxP.zzb(grayscaleImageData, FrameMetadataParcel.zzc(frame));
            } else {
                throw new RuntimeException("Cannot use detector after release()");
            }
        }
        Set hashSet = new HashSet();
        SparseArray<Face> sparseArray = new SparseArray(zzb.length);
        int i = 0;
        for (Face face : zzb) {
            int id = face.getId();
            i = Math.max(i, id);
            if (hashSet.contains(Integer.valueOf(id))) {
                id = i + 1;
                i = id;
            }
            hashSet.add(Integer.valueOf(id));
            sparseArray.append(this.zzbxO.zzlf(id), face);
        }
        return sparseArray;
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this.zzpp) {
                if (this.zzbxQ) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    release();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isOperational() {
        return this.zzbxP.isOperational();
    }

    public void release() {
        super.release();
        synchronized (this.zzpp) {
            if (this.zzbxQ) {
                this.zzbxP.zzMW();
                this.zzbxQ = false;
                return;
            }
        }
    }

    public boolean setFocus(int i) {
        boolean zzlx;
        int zzlg = this.zzbxO.zzlg(i);
        synchronized (this.zzpp) {
            if (this.zzbxQ) {
                zzlx = this.zzbxP.zzlx(zzlg);
            } else {
                throw new RuntimeException("Cannot use detector after release()");
            }
        }
        return zzlx;
    }
}
