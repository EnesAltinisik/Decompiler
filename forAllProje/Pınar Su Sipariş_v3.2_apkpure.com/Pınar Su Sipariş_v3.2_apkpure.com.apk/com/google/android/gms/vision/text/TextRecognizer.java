package com.google.android.gms.vision.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;
import com.google.android.gms.vision.text.internal.client.zze;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class TextRecognizer extends Detector<TextBlock> {
    private final zze zzbyt;

    public static class Builder {
        private Context mContext;
        private TextRecognizerOptions zzbyu = new TextRecognizerOptions();

        public Builder(Context context) {
            this.mContext = context;
        }

        public TextRecognizer build() {
            return new TextRecognizer(new zze(this.mContext, this.zzbyu));
        }
    }

    private TextRecognizer() {
        throw new IllegalStateException("Default constructor called");
    }

    private TextRecognizer(zze com_google_android_gms_vision_text_internal_client_zze) {
        this.zzbyt = com_google_android_gms_vision_text_internal_client_zze;
    }

    private Bitmap zza(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] array;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            array = byteBuffer.array();
        } else {
            array = new byte[byteBuffer.capacity()];
            byteBuffer.get(array);
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new YuvImage(array, i, i2, i3, null).compressToJpeg(new Rect(0, 0, i2, i3), 100, byteArrayOutputStream);
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length);
    }

    private SparseArray<TextBlock> zza(LineBoxParcel[] lineBoxParcelArr) {
        int i = 0;
        SparseArray sparseArray = new SparseArray();
        for (LineBoxParcel lineBoxParcel : lineBoxParcelArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(lineBoxParcel.zzbyE);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(lineBoxParcel.zzbyE, sparseArray2);
            }
            sparseArray2.append(lineBoxParcel.zzbyF, lineBoxParcel);
        }
        SparseArray<TextBlock> sparseArray3 = new SparseArray(sparseArray.size());
        while (i < sparseArray.size()) {
            sparseArray3.append(sparseArray.keyAt(i), new TextBlock((SparseArray) sparseArray.valueAt(i)));
            i++;
        }
        return sparseArray3;
    }

    private Bitmap zzb(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (frameMetadataParcel.rotation != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) zzlA(frameMetadataParcel.rotation));
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        if (frameMetadataParcel.rotation == 1 || frameMetadataParcel.rotation == 3) {
            frameMetadataParcel.width = height;
            frameMetadataParcel.height = width;
        }
        return bitmap;
    }

    private int zzlA(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return 180;
            case 3:
                return 270;
            default:
                throw new IllegalArgumentException("Unsupported rotation degree.");
        }
    }

    public SparseArray<TextBlock> detect(Frame frame) {
        if (frame == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        Bitmap bitmap;
        FrameMetadataParcel zzc = FrameMetadataParcel.zzc(frame);
        if (frame.getBitmap() != null) {
            bitmap = frame.getBitmap();
        } else {
            bitmap = zza(frame.getGrayscaleImageData(), frame.getMetadata().getFormat(), zzc.width, zzc.height);
        }
        bitmap = zzb(bitmap, zzc);
        zzc.rotation = 0;
        return zza(this.zzbyt.zzc(bitmap, zzc));
    }

    public boolean isOperational() {
        return this.zzbyt.isOperational();
    }

    public void release() {
        super.release();
        this.zzbyt.zzNc();
    }
}
