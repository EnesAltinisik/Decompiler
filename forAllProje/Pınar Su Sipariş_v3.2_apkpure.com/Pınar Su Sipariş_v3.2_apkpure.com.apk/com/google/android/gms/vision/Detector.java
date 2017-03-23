package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Frame.Metadata;

public abstract class Detector<T> {
    private Object zzbxg = new Object();
    private Processor<T> zzbxh;

    public static class Detections<T> {
        private SparseArray<T> zzbxi;
        private Metadata zzbxj;
        private boolean zzbxk;

        public Detections(SparseArray<T> sparseArray, Metadata metadata, boolean z) {
            this.zzbxi = sparseArray;
            this.zzbxj = metadata;
            this.zzbxk = z;
        }

        public boolean detectorIsOperational() {
            return this.zzbxk;
        }

        public SparseArray<T> getDetectedItems() {
            return this.zzbxi;
        }

        public Metadata getFrameMetadata() {
            return this.zzbxj;
        }
    }

    public interface Processor<T> {
        void receiveDetections(Detections<T> detections);

        void release();
    }

    public abstract SparseArray<T> detect(Frame frame);

    public boolean isOperational() {
        return true;
    }

    public void receiveFrame(Frame frame) {
        synchronized (this.zzbxg) {
            if (this.zzbxh == null) {
                throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
            Metadata metadata = new Metadata(frame.getMetadata());
            metadata.zzMV();
            this.zzbxh.receiveDetections(new Detections(detect(frame), metadata, isOperational()));
        }
    }

    public void release() {
        synchronized (this.zzbxg) {
            if (this.zzbxh != null) {
                this.zzbxh.release();
                this.zzbxh = null;
            }
        }
    }

    public boolean setFocus(int i) {
        return true;
    }

    public void setProcessor(Processor<T> processor) {
        this.zzbxh = processor;
    }
}
