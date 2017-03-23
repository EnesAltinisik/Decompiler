package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector.Detections;
import com.google.android.gms.vision.Detector.Processor;
import java.util.HashSet;
import java.util.Set;

public class MultiProcessor<T> implements Processor<T> {
    private int zzbxm;
    private Factory<T> zzbxy;
    private SparseArray<a> zzbxz;

    public static class Builder<T> {
        private MultiProcessor<T> zzbxA = new MultiProcessor();

        public Builder(Factory<T> factory) {
            if (factory == null) {
                throw new IllegalArgumentException("No factory supplied.");
            }
            this.zzbxA.zzbxy = factory;
        }

        public MultiProcessor<T> build() {
            return this.zzbxA;
        }

        public Builder<T> setMaxGapFrames(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Invalid max gap: " + i);
            }
            this.zzbxA.zzbxm = i;
            return this;
        }
    }

    public interface Factory<T> {
        Tracker<T> create(T t);
    }

    private class a {
        final /* synthetic */ MultiProcessor a;
        private Tracker<T> b;
        private int c;

        private a(MultiProcessor multiProcessor) {
            this.a = multiProcessor;
            this.c = 0;
        }
    }

    private MultiProcessor() {
        this.zzbxz = new SparseArray();
        this.zzbxm = 3;
    }

    private void zza(Detections<T> detections) {
        SparseArray detectedItems = detections.getDetectedItems();
        for (int i = 0; i < detectedItems.size(); i++) {
            int keyAt = detectedItems.keyAt(i);
            Object valueAt = detectedItems.valueAt(i);
            if (this.zzbxz.get(keyAt) == null) {
                a aVar = new a();
                aVar.b = this.zzbxy.create(valueAt);
                aVar.b.onNewItem(keyAt, valueAt);
                this.zzbxz.append(keyAt, aVar);
            }
        }
    }

    private void zzb(Detections<T> detections) {
        SparseArray detectedItems = detections.getDetectedItems();
        Set<Integer> hashSet = new HashSet();
        for (int i = 0; i < this.zzbxz.size(); i++) {
            int keyAt = this.zzbxz.keyAt(i);
            if (detectedItems.get(keyAt) == null) {
                a aVar = (a) this.zzbxz.valueAt(i);
                aVar.c = aVar.c + 1;
                if (aVar.c >= this.zzbxm) {
                    aVar.b.onDone();
                    hashSet.add(Integer.valueOf(keyAt));
                } else {
                    aVar.b.onMissing(detections);
                }
            }
        }
        for (Integer intValue : hashSet) {
            this.zzbxz.delete(intValue.intValue());
        }
    }

    private void zzc(Detections<T> detections) {
        SparseArray detectedItems = detections.getDetectedItems();
        for (int i = 0; i < detectedItems.size(); i++) {
            int keyAt = detectedItems.keyAt(i);
            Object valueAt = detectedItems.valueAt(i);
            a aVar = (a) this.zzbxz.get(keyAt);
            aVar.c = 0;
            aVar.b.onUpdate(detections, valueAt);
        }
    }

    public void receiveDetections(Detections<T> detections) {
        zza(detections);
        zzb(detections);
        zzc(detections);
    }

    public void release() {
        for (int i = 0; i < this.zzbxz.size(); i++) {
            ((a) this.zzbxz.valueAt(i)).b.onDone();
        }
        this.zzbxz.clear();
    }
}
