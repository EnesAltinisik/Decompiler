package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

public class Frame {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    private Bitmap mBitmap;
    private Metadata zzbxq;
    private ByteBuffer zzbxr;

    public static class Builder {
        private Frame zzbxs = new Frame();

        public Frame build() {
            if (this.zzbxs.zzbxr != null || this.zzbxs.mBitmap != null) {
                return this.zzbxs;
            }
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        public Builder setBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.zzbxs.mBitmap = bitmap;
            Metadata metadata = this.zzbxs.getMetadata();
            metadata.zzpi = width;
            metadata.zzpj = height;
            return this;
        }

        public Builder setId(int i) {
            this.zzbxs.getMetadata().mId = i;
            return this;
        }

        public Builder setImageData(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else {
                switch (i3) {
                    case 16:
                    case 17:
                    case 842094169:
                        this.zzbxs.zzbxr = byteBuffer;
                        Metadata metadata = this.zzbxs.getMetadata();
                        metadata.zzpi = i;
                        metadata.zzpj = i2;
                        metadata.format = i3;
                        return this;
                    default:
                        throw new IllegalArgumentException("Unsupported image format: " + i3);
                }
            }
        }

        public Builder setRotation(int i) {
            this.zzbxs.getMetadata().zzGA = i;
            return this;
        }

        public Builder setTimestampMillis(long j) {
            this.zzbxs.getMetadata().zzaQl = j;
            return this;
        }
    }

    public static class Metadata {
        private int format = -1;
        private int mId;
        private int zzGA;
        private long zzaQl;
        private int zzpi;
        private int zzpj;

        public Metadata(Metadata metadata) {
            this.zzpi = metadata.getWidth();
            this.zzpj = metadata.getHeight();
            this.mId = metadata.getId();
            this.zzaQl = metadata.getTimestampMillis();
            this.zzGA = metadata.getRotation();
        }

        public int getFormat() {
            return this.format;
        }

        public int getHeight() {
            return this.zzpj;
        }

        public int getId() {
            return this.mId;
        }

        public int getRotation() {
            return this.zzGA;
        }

        public long getTimestampMillis() {
            return this.zzaQl;
        }

        public int getWidth() {
            return this.zzpi;
        }

        public void zzMV() {
            if (this.zzGA % 2 != 0) {
                int i = this.zzpi;
                this.zzpi = this.zzpj;
                this.zzpj = i;
            }
            this.zzGA = 0;
        }
    }

    private Frame() {
        this.zzbxq = new Metadata();
        this.zzbxr = null;
        this.mBitmap = null;
    }

    private ByteBuffer zzMU() {
        int i = 0;
        int width = this.mBitmap.getWidth();
        int height = this.mBitmap.getHeight();
        int[] iArr = new int[(width * height)];
        this.mBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[(width * height)];
        while (i < iArr.length) {
            bArr[i] = (byte) ((int) (((((float) Color.red(iArr[i])) * 0.299f) + (((float) Color.green(iArr[i])) * 0.587f)) + (((float) Color.blue(iArr[i])) * 0.114f)));
            i++;
        }
        return ByteBuffer.wrap(bArr);
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public ByteBuffer getGrayscaleImageData() {
        return this.mBitmap != null ? zzMU() : this.zzbxr;
    }

    public Metadata getMetadata() {
        return this.zzbxq;
    }
}
