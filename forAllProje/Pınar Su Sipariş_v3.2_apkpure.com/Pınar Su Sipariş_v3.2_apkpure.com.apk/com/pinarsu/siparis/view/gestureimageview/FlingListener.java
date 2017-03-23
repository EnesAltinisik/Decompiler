package com.pinarsu.siparis.view.gestureimageview;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

public class FlingListener extends SimpleOnGestureListener {
    private float velocityX;
    private float velocityY;

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.velocityX = f;
        this.velocityY = f2;
        return true;
    }

    public float getVelocityX() {
        return this.velocityX;
    }

    public float getVelocityY() {
        return this.velocityY;
    }
}
