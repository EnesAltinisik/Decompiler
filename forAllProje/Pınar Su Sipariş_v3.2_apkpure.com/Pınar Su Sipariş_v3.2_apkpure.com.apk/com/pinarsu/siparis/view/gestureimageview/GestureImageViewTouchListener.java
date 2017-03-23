package com.pinarsu.siparis.view.gestureimageview;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.cast.TextTrackStyle;

public class GestureImageViewTouchListener implements OnTouchListener {
    private float boundaryBottom = 0.0f;
    private float boundaryLeft = 0.0f;
    private float boundaryRight = 0.0f;
    private float boundaryTop = 0.0f;
    private boolean canDragX = false;
    private boolean canDragY = false;
    private int canvasHeight = 0;
    private int canvasWidth = 0;
    private float centerX = 0.0f;
    private float centerY = 0.0f;
    private final PointF current = new PointF();
    private float currentScale = TextTrackStyle.DEFAULT_FONT_SCALE;
    private int displayHeight;
    private int displayWidth;
    private float fitScaleHorizontal = TextTrackStyle.DEFAULT_FONT_SCALE;
    private float fitScaleVertical = TextTrackStyle.DEFAULT_FONT_SCALE;
    private FlingAnimation flingAnimation;
    private GestureDetector flingDetector;
    private FlingListener flingListener;
    private GestureImageView image;
    private int imageHeight;
    private GestureImageViewListener imageListener;
    private int imageWidth;
    private boolean inZoom = false;
    private float initialDistance;
    private final PointF last = new PointF();
    private float lastScale = TextTrackStyle.DEFAULT_FONT_SCALE;
    private float maxScale = 5.0f;
    private final PointF midpoint = new PointF();
    private float minScale = 0.25f;
    private MoveAnimation moveAnimation;
    private boolean multiTouch = false;
    private final PointF next = new PointF();
    private OnClickListener onClickListener;
    private final VectorF pinchVector = new VectorF();
    private final VectorF scaleVector = new VectorF();
    private float startingScale = 0.0f;
    private GestureDetector tapDetector;
    private boolean touched = false;
    private ZoomAnimation zoomAnimation;

    public GestureImageViewTouchListener(final GestureImageView gestureImageView, int i, int i2) {
        this.image = gestureImageView;
        this.displayWidth = i;
        this.displayHeight = i2;
        this.centerX = ((float) i) / 2.0f;
        this.centerY = ((float) i2) / 2.0f;
        this.imageWidth = gestureImageView.getImageWidth();
        this.imageHeight = gestureImageView.getImageHeight();
        this.startingScale = gestureImageView.getScale();
        this.currentScale = this.startingScale;
        this.lastScale = this.startingScale;
        this.boundaryRight = (float) i;
        this.boundaryBottom = (float) i2;
        this.boundaryLeft = 0.0f;
        this.boundaryTop = 0.0f;
        this.next.x = gestureImageView.getImageX();
        this.next.y = gestureImageView.getImageY();
        this.flingListener = new FlingListener();
        this.flingAnimation = new FlingAnimation();
        this.zoomAnimation = new ZoomAnimation();
        this.moveAnimation = new MoveAnimation();
        this.flingAnimation.setListener(new FlingAnimationListener() {
            public void onMove(float f, float f2) {
                GestureImageViewTouchListener.this.handleDrag(GestureImageViewTouchListener.this.current.x + f, GestureImageViewTouchListener.this.current.y + f2);
            }

            public void onComplete() {
            }
        });
        this.zoomAnimation.setZoom(2.0f);
        this.zoomAnimation.setZoomAnimationListener(new ZoomAnimationListener() {
            public void onZoom(float f, float f2, float f3) {
                if (f <= GestureImageViewTouchListener.this.maxScale && f >= GestureImageViewTouchListener.this.minScale) {
                    GestureImageViewTouchListener.this.handleScale(f, f2, f3);
                }
            }

            public void onComplete() {
                GestureImageViewTouchListener.this.inZoom = false;
                GestureImageViewTouchListener.this.handleUp();
            }
        });
        this.moveAnimation.setMoveAnimationListener(new MoveAnimationListener() {
            public void onMove(float f, float f2) {
                gestureImageView.setPosition(f, f2);
                gestureImageView.redraw();
            }
        });
        this.tapDetector = new GestureDetector(gestureImageView.getContext(), new SimpleOnGestureListener() {
            public boolean onDoubleTap(MotionEvent motionEvent) {
                GestureImageViewTouchListener.this.startZoom(motionEvent);
                return true;
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (GestureImageViewTouchListener.this.inZoom || GestureImageViewTouchListener.this.onClickListener == null) {
                    return false;
                }
                GestureImageViewTouchListener.this.onClickListener.onClick(gestureImageView);
                return true;
            }
        });
        this.flingDetector = new GestureDetector(gestureImageView.getContext(), this.flingListener);
        this.imageListener = gestureImageView.getGestureImageViewListener();
        calculateBoundaries();
    }

    private void startFling() {
        this.flingAnimation.setVelocityX(this.flingListener.getVelocityX());
        this.flingAnimation.setVelocityY(this.flingListener.getVelocityY());
        this.image.animationStart(this.flingAnimation);
    }

    private void startZoom(MotionEvent motionEvent) {
        float f;
        this.inZoom = true;
        this.zoomAnimation.reset();
        int scaledWidth;
        if (this.image.isLandscape()) {
            if (this.image.getDeviceOrientation() != 1) {
                scaledWidth = this.image.getScaledWidth();
                if (scaledWidth == this.canvasWidth) {
                    f = this.currentScale * 4.0f;
                    this.zoomAnimation.setTouchX(motionEvent.getX());
                    this.zoomAnimation.setTouchY(motionEvent.getY());
                } else if (scaledWidth < this.canvasWidth) {
                    f = this.fitScaleHorizontal / this.currentScale;
                    this.zoomAnimation.setTouchX(this.image.getCenterX());
                    this.zoomAnimation.setTouchY(motionEvent.getY());
                } else {
                    f = this.fitScaleHorizontal / this.currentScale;
                    this.zoomAnimation.setTouchX(this.image.getCenterX());
                    this.zoomAnimation.setTouchY(this.image.getCenterY());
                }
            } else if (this.image.getScaledHeight() < this.canvasHeight) {
                f = this.fitScaleVertical / this.currentScale;
                this.zoomAnimation.setTouchX(motionEvent.getX());
                this.zoomAnimation.setTouchY(this.image.getCenterY());
            } else {
                f = this.fitScaleHorizontal / this.currentScale;
                this.zoomAnimation.setTouchX(this.image.getCenterX());
                this.zoomAnimation.setTouchY(this.image.getCenterY());
            }
        } else if (this.image.getDeviceOrientation() == 1) {
            scaledWidth = this.image.getScaledHeight();
            if (scaledWidth == this.canvasHeight) {
                f = this.currentScale * 4.0f;
                this.zoomAnimation.setTouchX(motionEvent.getX());
                this.zoomAnimation.setTouchY(motionEvent.getY());
            } else if (scaledWidth < this.canvasHeight) {
                f = this.fitScaleVertical / this.currentScale;
                this.zoomAnimation.setTouchX(motionEvent.getX());
                this.zoomAnimation.setTouchY(this.image.getCenterY());
            } else {
                f = this.fitScaleVertical / this.currentScale;
                this.zoomAnimation.setTouchX(this.image.getCenterX());
                this.zoomAnimation.setTouchY(this.image.getCenterY());
            }
        } else if (this.image.getScaledWidth() < this.canvasWidth) {
            f = this.fitScaleHorizontal / this.currentScale;
            this.zoomAnimation.setTouchX(this.image.getCenterX());
            this.zoomAnimation.setTouchY(motionEvent.getY());
        } else {
            f = this.fitScaleVertical / this.currentScale;
            this.zoomAnimation.setTouchX(this.image.getCenterX());
            this.zoomAnimation.setTouchY(this.image.getCenterY());
        }
        this.zoomAnimation.setZoom(f);
        this.image.animationStart(this.zoomAnimation);
    }

    private void stopAnimations() {
        this.image.animationStop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!(this.inZoom || this.tapDetector.onTouchEvent(motionEvent))) {
            if (motionEvent.getPointerCount() == 1 && this.flingDetector.onTouchEvent(motionEvent)) {
                startFling();
            }
            if (motionEvent.getAction() == 1) {
                handleUp();
            } else if (motionEvent.getAction() == 0) {
                stopAnimations();
                this.last.x = motionEvent.getX();
                this.last.y = motionEvent.getY();
                if (this.imageListener != null) {
                    this.imageListener.onTouch(this.last.x, this.last.y);
                }
                this.touched = true;
            } else if (motionEvent.getAction() == 2) {
                if (motionEvent.getPointerCount() > 1) {
                    this.multiTouch = true;
                    if (this.initialDistance > 0.0f) {
                        this.pinchVector.set(motionEvent);
                        this.pinchVector.calculateLength();
                        float f = this.pinchVector.length;
                        if (this.initialDistance != f) {
                            f = (f / this.initialDistance) * this.lastScale;
                            if (f <= this.maxScale) {
                                VectorF vectorF = this.scaleVector;
                                vectorF.length *= f;
                                this.scaleVector.calculateEndPoint();
                                vectorF = this.scaleVector;
                                vectorF.length /= f;
                                handleScale(f, this.scaleVector.end.x, this.scaleVector.end.y);
                            }
                        }
                    } else {
                        this.initialDistance = MathUtils.distance(motionEvent);
                        MathUtils.midpoint(motionEvent, this.midpoint);
                        this.scaleVector.setStart(this.midpoint);
                        this.scaleVector.setEnd(this.next);
                        this.scaleVector.calculateLength();
                        this.scaleVector.calculateAngle();
                        VectorF vectorF2 = this.scaleVector;
                        vectorF2.length /= this.lastScale;
                    }
                } else if (!this.touched) {
                    this.touched = true;
                    this.last.x = motionEvent.getX();
                    this.last.y = motionEvent.getY();
                    this.next.x = this.image.getImageX();
                    this.next.y = this.image.getImageY();
                } else if (!this.multiTouch && handleDrag(motionEvent.getX(), motionEvent.getY())) {
                    this.image.redraw();
                }
            }
        }
        return true;
    }

    protected void handleUp() {
        this.multiTouch = false;
        this.initialDistance = 0.0f;
        this.lastScale = this.currentScale;
        if (!this.canDragX) {
            this.next.x = this.centerX;
        }
        if (!this.canDragY) {
            this.next.y = this.centerY;
        }
        boundCoordinates();
        if (!(this.canDragX || this.canDragY)) {
            if (this.image.isLandscape()) {
                this.currentScale = this.fitScaleHorizontal;
                this.lastScale = this.fitScaleHorizontal;
            } else {
                this.currentScale = this.fitScaleVertical;
                this.lastScale = this.fitScaleVertical;
            }
        }
        this.image.setScale(this.currentScale);
        this.image.setPosition(this.next.x, this.next.y);
        if (this.imageListener != null) {
            this.imageListener.onScale(this.currentScale);
            this.imageListener.onPosition(this.next.x, this.next.y);
        }
        this.image.redraw();
    }

    protected void handleScale(float f, float f2, float f3) {
        this.currentScale = f;
        if (this.currentScale > this.maxScale) {
            this.currentScale = this.maxScale;
        } else if (this.currentScale < this.minScale) {
            this.currentScale = this.minScale;
        } else {
            this.next.x = f2;
            this.next.y = f3;
        }
        calculateBoundaries();
        this.image.setScale(this.currentScale);
        this.image.setPosition(this.next.x, this.next.y);
        if (this.imageListener != null) {
            this.imageListener.onScale(this.currentScale);
            this.imageListener.onPosition(this.next.x, this.next.y);
        }
        this.image.redraw();
    }

    protected boolean handleDrag(float f, float f2) {
        this.current.x = f;
        this.current.y = f2;
        float f3 = this.current.x - this.last.x;
        float f4 = this.current.y - this.last.y;
        if (!(f3 == 0.0f && f4 == 0.0f)) {
            if (this.canDragX) {
                PointF pointF = this.next;
                pointF.x = f3 + pointF.x;
            }
            if (this.canDragY) {
                PointF pointF2 = this.next;
                pointF2.y = f4 + pointF2.y;
            }
            boundCoordinates();
            this.last.x = this.current.x;
            this.last.y = this.current.y;
            if (this.canDragX || this.canDragY) {
                this.image.setPosition(this.next.x, this.next.y);
                if (this.imageListener != null) {
                    this.imageListener.onPosition(this.next.x, this.next.y);
                }
                return true;
            }
        }
        return false;
    }

    public void reset() {
        this.currentScale = this.startingScale;
        this.next.x = this.centerX;
        this.next.y = this.centerY;
        calculateBoundaries();
        this.image.setScale(this.currentScale);
        this.image.setPosition(this.next.x, this.next.y);
        this.image.redraw();
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public void setMaxScale(float f) {
        this.maxScale = f;
    }

    public float getMinScale() {
        return this.minScale;
    }

    public void setMinScale(float f) {
        this.minScale = f;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    protected void setCanvasWidth(int i) {
        this.canvasWidth = i;
    }

    protected void setCanvasHeight(int i) {
        this.canvasHeight = i;
    }

    protected void setFitScaleHorizontal(float f) {
        this.fitScaleHorizontal = f;
    }

    protected void setFitScaleVertical(float f) {
        this.fitScaleVertical = f;
    }

    protected void boundCoordinates() {
        if (this.next.x < this.boundaryLeft) {
            this.next.x = this.boundaryLeft;
        } else if (this.next.x > this.boundaryRight) {
            this.next.x = this.boundaryRight;
        }
        if (this.next.y < this.boundaryTop) {
            this.next.y = this.boundaryTop;
        } else if (this.next.y > this.boundaryBottom) {
            this.next.y = this.boundaryBottom;
        }
    }

    protected void calculateBoundaries() {
        boolean z = true;
        int round = Math.round(((float) this.imageWidth) * this.currentScale);
        int round2 = Math.round(((float) this.imageHeight) * this.currentScale);
        this.canDragX = round > this.displayWidth;
        if (round2 <= this.displayHeight) {
            z = false;
        }
        this.canDragY = z;
        if (this.canDragX) {
            float f = ((float) (round - this.displayWidth)) / 2.0f;
            this.boundaryLeft = this.centerX - f;
            this.boundaryRight = f + this.centerX;
        }
        if (this.canDragY) {
            f = ((float) (round2 - this.displayHeight)) / 2.0f;
            this.boundaryTop = this.centerY - f;
            this.boundaryBottom = f + this.centerY;
        }
    }
}
