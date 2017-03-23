package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.Detector.Detections;
import com.google.android.gms.vision.Detector.Processor;

public abstract class FocusingProcessor<T> implements Processor<T> {
    private Detector<T> zzbwV;
    private Tracker<T> zzbxl;
    private int zzbxm = 3;
    private boolean zzbxn = false;
    private int zzbxo;
    private int zzbxp = 0;

    public FocusingProcessor(Detector<T> detector, Tracker<T> tracker) {
        this.zzbwV = detector;
        this.zzbxl = tracker;
    }

    public void receiveDetections(Detections<T> detections) {
        SparseArray detectedItems = detections.getDetectedItems();
        if (detectedItems.size() == 0) {
            if (this.zzbxp == this.zzbxm) {
                this.zzbxl.onDone();
                this.zzbxn = false;
            } else {
                this.zzbxl.onMissing(detections);
            }
            this.zzbxp++;
            return;
        }
        this.zzbxp = 0;
        if (this.zzbxn) {
            Object obj = detectedItems.get(this.zzbxo);
            if (obj != null) {
                this.zzbxl.onUpdate(detections, obj);
                return;
            } else {
                this.zzbxl.onDone();
                this.zzbxn = false;
            }
        }
        int selectFocus = selectFocus(detections);
        Object obj2 = detectedItems.get(selectFocus);
        if (obj2 == null) {
            Log.w("FocusingProcessor", "Invalid focus selected: " + selectFocus);
            return;
        }
        this.zzbxn = true;
        this.zzbxo = selectFocus;
        this.zzbwV.setFocus(this.zzbxo);
        this.zzbxl.onNewItem(this.zzbxo, obj2);
        this.zzbxl.onUpdate(detections, obj2);
    }

    public void release() {
        this.zzbxl.onDone();
    }

    public abstract int selectFocus(Detections<T> detections);

    protected void zzle(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid max gap: " + i);
        }
        this.zzbxm = i;
    }
}
