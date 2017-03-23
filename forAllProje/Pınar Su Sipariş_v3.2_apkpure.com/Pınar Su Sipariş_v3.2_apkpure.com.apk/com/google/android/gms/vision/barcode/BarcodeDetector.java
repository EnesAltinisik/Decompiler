package com.google.android.gms.vision.barcode;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.android.gms.vision.barcode.internal.client.zzd;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;

public final class BarcodeDetector extends Detector<Barcode> {
    private final zzd zzbxC;

    public static class Builder {
        private Context mContext;
        private BarcodeDetectorOptions zzbxD = new BarcodeDetectorOptions();

        public Builder(Context context) {
            this.mContext = context;
        }

        public BarcodeDetector build() {
            return new BarcodeDetector(new zzd(this.mContext, this.zzbxD));
        }

        public Builder setBarcodeFormats(int i) {
            this.zzbxD.zzbxE = i;
            return this;
        }
    }

    private BarcodeDetector() {
        throw new IllegalStateException("Default constructor called");
    }

    private BarcodeDetector(zzd com_google_android_gms_vision_barcode_internal_client_zzd) {
        this.zzbxC = com_google_android_gms_vision_barcode_internal_client_zzd;
    }

    public SparseArray<Barcode> detect(Frame frame) {
        if (frame == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        Barcode[] zza;
        FrameMetadataParcel zzc = FrameMetadataParcel.zzc(frame);
        if (frame.getBitmap() != null) {
            zza = this.zzbxC.zza(frame.getBitmap(), zzc);
        } else {
            zza = this.zzbxC.zza(frame.getGrayscaleImageData(), zzc);
        }
        SparseArray<Barcode> sparseArray = new SparseArray(zza.length);
        for (Barcode barcode : zza) {
            sparseArray.append(barcode.rawValue.hashCode(), barcode);
        }
        return sparseArray;
    }

    public boolean isOperational() {
        return this.zzbxC.isOperational();
    }

    public void release() {
        super.release();
        this.zzbxC.zzMW();
    }
}
