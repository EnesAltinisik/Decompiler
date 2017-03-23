package com.pinarsu.siparis.view.gestureimageview;

import android.graphics.PointF;
import android.view.MotionEvent;

public class VectorF {
    public float angle;
    public final PointF end = new PointF();
    public float length;
    public final PointF start = new PointF();

    public void calculateEndPoint() {
        this.end.x = (((float) Math.cos((double) this.angle)) * this.length) + this.start.x;
        this.end.y = (((float) Math.sin((double) this.angle)) * this.length) + this.start.y;
    }

    public void setStart(PointF pointF) {
        this.start.x = pointF.x;
        this.start.y = pointF.y;
    }

    public void setEnd(PointF pointF) {
        this.end.x = pointF.x;
        this.end.y = pointF.y;
    }

    public void set(MotionEvent motionEvent) {
        this.start.x = motionEvent.getX(0);
        this.start.y = motionEvent.getY(0);
        this.end.x = motionEvent.getX(1);
        this.end.y = motionEvent.getY(1);
    }

    public float calculateLength() {
        this.length = MathUtils.distance(this.start, this.end);
        return this.length;
    }

    public float calculateAngle() {
        this.angle = MathUtils.angle(this.start, this.end);
        return this.angle;
    }
}
