package com.google.android.gms.vision.face;

import android.graphics.PointF;
import com.google.android.gms.cast.TextTrackStyle;
import java.util.Arrays;
import java.util.List;

public class Face {
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;
    private int mId;
    private float zzbaC;
    private float zzbaD;
    private PointF zzbxH;
    private float zzbxI;
    private float zzbxJ;
    private List<Landmark> zzbxK;
    private float zzbxL;
    private float zzbxM;
    private float zzbxN;

    public Face(int i, PointF pointF, float f, float f2, float f3, float f4, Landmark[] landmarkArr, float f5, float f6, float f7) {
        this.mId = i;
        this.zzbxH = pointF;
        this.zzbaC = f;
        this.zzbaD = f2;
        this.zzbxI = f3;
        this.zzbxJ = f4;
        this.zzbxK = Arrays.asList(landmarkArr);
        if (f5 < 0.0f || f5 > TextTrackStyle.DEFAULT_FONT_SCALE) {
            this.zzbxL = -1.0f;
        } else {
            this.zzbxL = f5;
        }
        if (f6 < 0.0f || f6 > TextTrackStyle.DEFAULT_FONT_SCALE) {
            this.zzbxM = -1.0f;
        } else {
            this.zzbxM = f6;
        }
        if (this.zzbxN < 0.0f || this.zzbxN > TextTrackStyle.DEFAULT_FONT_SCALE) {
            this.zzbxN = -1.0f;
        } else {
            this.zzbxN = f7;
        }
    }

    public float getEulerY() {
        return this.zzbxI;
    }

    public float getEulerZ() {
        return this.zzbxJ;
    }

    public float getHeight() {
        return this.zzbaD;
    }

    public int getId() {
        return this.mId;
    }

    public float getIsLeftEyeOpenProbability() {
        return this.zzbxL;
    }

    public float getIsRightEyeOpenProbability() {
        return this.zzbxM;
    }

    public float getIsSmilingProbability() {
        return this.zzbxN;
    }

    public List<Landmark> getLandmarks() {
        return this.zzbxK;
    }

    public PointF getPosition() {
        return new PointF(this.zzbxH.x - (this.zzbaC / 2.0f), this.zzbxH.y - (this.zzbaD / 2.0f));
    }

    public float getWidth() {
        return this.zzbaC;
    }
}
