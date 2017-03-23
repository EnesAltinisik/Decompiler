package com.pinarsu.siparis.view.gestureimageview;

public class FlingAnimation implements Animation {
    private float factor = 0.95f;
    private FlingAnimationListener listener;
    private float threshold = 10.0f;
    private float velocityX;
    private float velocityY;

    public boolean update(GestureImageView gestureImageView, long j) {
        float f = ((float) j) / 1000.0f;
        float f2 = this.velocityX * f;
        float f3 = this.velocityY * f;
        this.velocityX *= this.factor;
        this.velocityY *= this.factor;
        boolean z = Math.abs(this.velocityX) > this.threshold && Math.abs(this.velocityY) > this.threshold;
        if (this.listener != null) {
            this.listener.onMove(f2, f3);
            if (!z) {
                this.listener.onComplete();
            }
        }
        return z;
    }

    public void setVelocityX(float f) {
        this.velocityX = f;
    }

    public void setVelocityY(float f) {
        this.velocityY = f;
    }

    public void setFactor(float f) {
        this.factor = f;
    }

    public void setListener(FlingAnimationListener flingAnimationListener) {
        this.listener = flingAnimationListener;
    }
}
