package com.pinarsu.siparis.view.gestureimageview;

import android.graphics.PointF;
import com.google.android.gms.cast.TextTrackStyle;

public class ZoomAnimation implements Animation {
    private long animationLengthMS = 200;
    private boolean firstFrame = true;
    private float scaleDiff;
    private float startScale;
    private float startX;
    private float startY;
    private long totalTime = 0;
    private float touchX;
    private float touchY;
    private float xDiff;
    private float yDiff;
    private float zoom;
    private ZoomAnimationListener zoomAnimationListener;

    public boolean update(GestureImageView gestureImageView, long j) {
        if (this.firstFrame) {
            this.firstFrame = false;
            this.startX = gestureImageView.getImageX();
            this.startY = gestureImageView.getImageY();
            this.startScale = gestureImageView.getScale();
            this.scaleDiff = (this.zoom * this.startScale) - this.startScale;
            if (this.scaleDiff > 0.0f) {
                VectorF vectorF = new VectorF();
                vectorF.setStart(new PointF(this.touchX, this.touchY));
                vectorF.setEnd(new PointF(this.startX, this.startY));
                vectorF.calculateAngle();
                vectorF.length = vectorF.calculateLength() * this.zoom;
                vectorF.calculateEndPoint();
                this.xDiff = vectorF.end.x - this.startX;
                this.yDiff = vectorF.end.y - this.startY;
            } else {
                this.xDiff = gestureImageView.getCenterX() - this.startX;
                this.yDiff = gestureImageView.getCenterY() - this.startY;
            }
        }
        this.totalTime += j;
        float f = ((float) this.totalTime) / ((float) this.animationLengthMS);
        float f2;
        if (f < TextTrackStyle.DEFAULT_FONT_SCALE) {
            if (f > 0.0f) {
                float f3 = (this.scaleDiff * f) + this.startScale;
                f2 = (this.xDiff * f) + this.startX;
                f = (f * this.yDiff) + this.startY;
                if (this.zoomAnimationListener != null) {
                    this.zoomAnimationListener.onZoom(f3, f2, f);
                }
            }
            return true;
        }
        f = this.scaleDiff + this.startScale;
        f2 = this.xDiff + this.startX;
        float f4 = this.yDiff + this.startY;
        if (this.zoomAnimationListener == null) {
            return false;
        }
        this.zoomAnimationListener.onZoom(f, f2, f4);
        this.zoomAnimationListener.onComplete();
        return false;
    }

    public void reset() {
        this.firstFrame = true;
        this.totalTime = 0;
    }

    public float getZoom() {
        return this.zoom;
    }

    public void setZoom(float f) {
        this.zoom = f;
    }

    public float getTouchX() {
        return this.touchX;
    }

    public void setTouchX(float f) {
        this.touchX = f;
    }

    public float getTouchY() {
        return this.touchY;
    }

    public void setTouchY(float f) {
        this.touchY = f;
    }

    public long getAnimationLengthMS() {
        return this.animationLengthMS;
    }

    public void setAnimationLengthMS(long j) {
        this.animationLengthMS = j;
    }

    public ZoomAnimationListener getZoomAnimationListener() {
        return this.zoomAnimationListener;
    }

    public void setZoomAnimationListener(ZoomAnimationListener zoomAnimationListener) {
        this.zoomAnimationListener = zoomAnimationListener;
    }
}
