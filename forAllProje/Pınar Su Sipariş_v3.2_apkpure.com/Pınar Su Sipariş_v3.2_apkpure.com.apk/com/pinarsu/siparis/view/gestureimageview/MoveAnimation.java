package com.pinarsu.siparis.view.gestureimageview;

public class MoveAnimation implements Animation {
    private long animationTimeMS = 100;
    private boolean firstFrame = true;
    private MoveAnimationListener moveAnimationListener;
    private float startX;
    private float startY;
    private float targetX;
    private float targetY;
    private long totalTime = 0;

    public boolean update(GestureImageView gestureImageView, long j) {
        this.totalTime += j;
        if (this.firstFrame) {
            this.firstFrame = false;
            this.startX = gestureImageView.getImageX();
            this.startY = gestureImageView.getImageY();
        }
        if (this.totalTime < this.animationTimeMS) {
            float f = ((float) this.totalTime) / ((float) this.animationTimeMS);
            float f2 = ((this.targetX - this.startX) * f) + this.startX;
            f = (f * (this.targetY - this.startY)) + this.startY;
            if (this.moveAnimationListener != null) {
                this.moveAnimationListener.onMove(f2, f);
            }
            return true;
        } else if (this.moveAnimationListener == null) {
            return false;
        } else {
            this.moveAnimationListener.onMove(this.targetX, this.targetY);
            return false;
        }
    }

    public void reset() {
        this.firstFrame = true;
        this.totalTime = 0;
    }

    public float getTargetX() {
        return this.targetX;
    }

    public void setTargetX(float f) {
        this.targetX = f;
    }

    public float getTargetY() {
        return this.targetY;
    }

    public void setTargetY(float f) {
        this.targetY = f;
    }

    public long getAnimationTimeMS() {
        return this.animationTimeMS;
    }

    public void setAnimationTimeMS(long j) {
        this.animationTimeMS = j;
    }

    public void setMoveAnimationListener(MoveAnimationListener moveAnimationListener) {
        this.moveAnimationListener = moveAnimationListener;
    }
}
