package com.pinarsu.siparis.view.gestureimageview;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.cast.TextTrackStyle;
import java.io.InputStream;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class GestureImageView extends ImageView {
    public static final String GLOBAL_NS = "http://schemas.android.com/apk/res/android";
    public static final String LOCAL_NS = "http://schemas.polites.com/android";
    private int alpha;
    private Animator animator;
    private float centerX;
    private float centerY;
    private ColorFilter colorFilter;
    private OnTouchListener customOnTouchListener;
    private int deviceOrientation;
    private int displayHeight;
    private int displayWidth;
    private final Semaphore drawLock;
    private Drawable drawable;
    private float fitScaleHorizontal;
    private float fitScaleVertical;
    private GestureImageViewListener gestureImageViewListener;
    private GestureImageViewTouchListener gestureImageViewTouchListener;
    private int hHeight;
    private int hWidth;
    private int imageOrientation;
    private boolean layout;
    private float maxScale;
    private float minScale;
    private OnClickListener onClickListener;
    private boolean recycle;
    private int resId;
    private float rotation;
    private float scale;
    private float scaleAdjust;
    private Float startX;
    private Float startY;
    private float startingScale;
    private boolean strict;
    private float x;
    private float y;

    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = new int[ScaleType.values().length];

        static {
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public GestureImageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    public GestureImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.drawLock = new Semaphore(0);
        this.x = 0.0f;
        this.y = 0.0f;
        this.layout = false;
        this.scaleAdjust = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.startingScale = -1.0f;
        this.scale = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.maxScale = 5.0f;
        this.minScale = 0.75f;
        this.fitScaleHorizontal = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.fitScaleVertical = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.rotation = 0.0f;
        this.resId = -1;
        this.recycle = false;
        this.strict = false;
        this.alpha = 255;
        this.deviceOrientation = -1;
        String attributeValue = attributeSet.getAttributeValue(GLOBAL_NS, "scaleType");
        if (attributeValue == null || attributeValue.trim().length() == 0) {
            setScaleType(ScaleType.CENTER_INSIDE);
        }
        attributeValue = attributeSet.getAttributeValue(LOCAL_NS, "start-x");
        String attributeValue2 = attributeSet.getAttributeValue(LOCAL_NS, "start-y");
        if (attributeValue != null && attributeValue.trim().length() > 0) {
            this.startX = Float.valueOf(Float.parseFloat(attributeValue));
        }
        if (attributeValue2 != null && attributeValue2.trim().length() > 0) {
            this.startY = Float.valueOf(Float.parseFloat(attributeValue2));
        }
        setStartingScale(attributeSet.getAttributeFloatValue(LOCAL_NS, "start-scale", this.startingScale));
        setMinScale(attributeSet.getAttributeFloatValue(LOCAL_NS, "min-scale", this.minScale));
        setMaxScale(attributeSet.getAttributeFloatValue(LOCAL_NS, "max-scale", this.maxScale));
        setStrict(attributeSet.getAttributeBooleanValue(LOCAL_NS, "strict", this.strict));
        setRecycle(attributeSet.getAttributeBooleanValue(LOCAL_NS, "recycle", this.recycle));
        initImage();
    }

    public GestureImageView(Context context) {
        super(context);
        this.drawLock = new Semaphore(0);
        this.x = 0.0f;
        this.y = 0.0f;
        this.layout = false;
        this.scaleAdjust = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.startingScale = -1.0f;
        this.scale = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.maxScale = 5.0f;
        this.minScale = 0.75f;
        this.fitScaleHorizontal = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.fitScaleVertical = TextTrackStyle.DEFAULT_FONT_SCALE;
        this.rotation = 0.0f;
        this.resId = -1;
        this.recycle = false;
        this.strict = false;
        this.alpha = 255;
        this.deviceOrientation = -1;
        setScaleType(ScaleType.CENTER_INSIDE);
        initImage();
    }

    protected void onMeasure(int i, int i2) {
        if (this.drawable == null) {
            this.displayHeight = MeasureSpec.getSize(i2);
            this.displayWidth = MeasureSpec.getSize(i);
        } else if (getResources().getConfiguration().orientation == 2) {
            this.displayHeight = MeasureSpec.getSize(i2);
            if (getLayoutParams().width == -2) {
                this.displayWidth = Math.round((((float) getImageWidth()) / ((float) getImageHeight())) * ((float) this.displayHeight));
            } else {
                this.displayWidth = MeasureSpec.getSize(i);
            }
        } else {
            this.displayWidth = MeasureSpec.getSize(i);
            if (getLayoutParams().height == -2) {
                this.displayHeight = Math.round((((float) getImageHeight()) / ((float) getImageWidth())) * ((float) this.displayWidth));
            } else {
                this.displayHeight = MeasureSpec.getSize(i2);
            }
        }
        setMeasuredDimension(this.displayWidth, this.displayHeight);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || !this.layout) {
            setupCanvas(this.displayWidth, this.displayHeight, getResources().getConfiguration().orientation);
        }
    }

    protected void setupCanvas(int i, int i2, int i3) {
        if (this.deviceOrientation != i3) {
            this.layout = false;
            this.deviceOrientation = i3;
        }
        if (this.drawable != null && !this.layout) {
            int imageWidth = getImageWidth();
            int imageHeight = getImageHeight();
            this.hWidth = Math.round(((float) imageWidth) / 2.0f);
            this.hHeight = Math.round(((float) imageHeight) / 2.0f);
            int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
            computeCropScale(imageWidth, imageHeight, paddingLeft, paddingTop);
            if (this.startingScale <= 0.0f) {
                computeStartingScale(imageWidth, imageHeight, paddingLeft, paddingTop);
            }
            this.scaleAdjust = this.startingScale;
            this.centerX = ((float) paddingLeft) / 2.0f;
            this.centerY = ((float) paddingTop) / 2.0f;
            if (this.startX == null) {
                this.x = this.centerX;
            } else {
                this.x = this.startX.floatValue();
            }
            if (this.startY == null) {
                this.y = this.centerY;
            } else {
                this.y = this.startY.floatValue();
            }
            this.gestureImageViewTouchListener = new GestureImageViewTouchListener(this, paddingLeft, paddingTop);
            if (isLandscape()) {
                this.gestureImageViewTouchListener.setMinScale(this.minScale * this.fitScaleHorizontal);
            } else {
                this.gestureImageViewTouchListener.setMinScale(this.minScale * this.fitScaleVertical);
            }
            this.gestureImageViewTouchListener.setMaxScale(this.maxScale * this.startingScale);
            this.gestureImageViewTouchListener.setFitScaleHorizontal(this.fitScaleHorizontal);
            this.gestureImageViewTouchListener.setFitScaleVertical(this.fitScaleVertical);
            this.gestureImageViewTouchListener.setCanvasWidth(paddingLeft);
            this.gestureImageViewTouchListener.setCanvasHeight(paddingTop);
            this.gestureImageViewTouchListener.setOnClickListener(this.onClickListener);
            this.drawable.setBounds(-this.hWidth, -this.hHeight, this.hWidth, this.hHeight);
            super.setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (GestureImageView.this.customOnTouchListener != null) {
                        GestureImageView.this.customOnTouchListener.onTouch(view, motionEvent);
                    }
                    return GestureImageView.this.gestureImageViewTouchListener.onTouch(view, motionEvent);
                }
            });
            this.layout = true;
        }
    }

    protected void computeCropScale(int i, int i2, int i3, int i4) {
        this.fitScaleHorizontal = ((float) i3) / ((float) i);
        this.fitScaleVertical = ((float) i4) / ((float) i2);
    }

    protected void computeStartingScale(int i, int i2, int i3, int i4) {
        switch (AnonymousClass2.$SwitchMap$android$widget$ImageView$ScaleType[getScaleType().ordinal()]) {
            case 1:
                this.startingScale = TextTrackStyle.DEFAULT_FONT_SCALE;
                return;
            case 2:
                this.startingScale = Math.max(((float) i4) / ((float) i2), ((float) i3) / ((float) i));
                return;
            case 3:
                if (((float) i) / ((float) i3) > ((float) i2) / ((float) i4)) {
                    this.startingScale = this.fitScaleHorizontal;
                    return;
                } else {
                    this.startingScale = this.fitScaleVertical;
                    return;
                }
            default:
                return;
        }
    }

    protected boolean isRecycled() {
        if (this.drawable != null && (this.drawable instanceof BitmapDrawable)) {
            Bitmap bitmap = ((BitmapDrawable) this.drawable).getBitmap();
            if (bitmap != null) {
                return bitmap.isRecycled();
            }
        }
        return false;
    }

    protected void recycle() {
        if (this.recycle && this.drawable != null && (this.drawable instanceof BitmapDrawable)) {
            Bitmap bitmap = ((BitmapDrawable) this.drawable).getBitmap();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        if (this.layout) {
            if (!(this.drawable == null || isRecycled())) {
                canvas.save();
                float f = this.scale * this.scaleAdjust;
                canvas.translate(this.x, this.y);
                if (this.rotation != 0.0f) {
                    canvas.rotate(this.rotation);
                }
                if (f != TextTrackStyle.DEFAULT_FONT_SCALE) {
                    canvas.scale(f, f);
                }
                this.drawable.draw(canvas);
                canvas.restore();
            }
            if (this.drawLock.availablePermits() <= 0) {
                this.drawLock.release();
            }
        }
    }

    public boolean waitForDraw(long j) throws InterruptedException {
        return this.drawLock.tryAcquire(j, TimeUnit.MILLISECONDS);
    }

    protected void onAttachedToWindow() {
        this.animator = new Animator(this, "GestureImageViewAnimator");
        this.animator.start();
        if (this.resId >= 0 && this.drawable == null) {
            setImageResource(this.resId);
        }
        super.onAttachedToWindow();
    }

    public void animationStart(Animation animation) {
        if (this.animator != null) {
            this.animator.play(animation);
        }
    }

    public void animationStop() {
        if (this.animator != null) {
            this.animator.cancel();
        }
    }

    protected void onDetachedFromWindow() {
        if (this.animator != null) {
            this.animator.finish();
        }
        if (!(!this.recycle || this.drawable == null || isRecycled())) {
            recycle();
            this.drawable = null;
        }
        super.onDetachedFromWindow();
    }

    protected void initImage() {
        if (this.drawable != null) {
            this.drawable.setAlpha(this.alpha);
            this.drawable.setFilterBitmap(true);
            if (this.colorFilter != null) {
                this.drawable.setColorFilter(this.colorFilter);
            }
        }
        if (!this.layout) {
            requestLayout();
            redraw();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.drawable = new BitmapDrawable(getResources(), bitmap);
        initImage();
    }

    public void setImageDrawable(Drawable drawable) {
        this.drawable = drawable;
        initImage();
    }

    public void setImageResource(int i) {
        if (this.drawable != null) {
            recycle();
        }
        if (i >= 0) {
            this.resId = i;
            setImageDrawable(getContext().getResources().getDrawable(i));
        }
    }

    public int getScaledWidth() {
        return Math.round(((float) getImageWidth()) * getScale());
    }

    public int getScaledHeight() {
        return Math.round(((float) getImageHeight()) * getScale());
    }

    public int getImageWidth() {
        if (this.drawable != null) {
            return this.drawable.getIntrinsicWidth();
        }
        return 0;
    }

    public int getImageHeight() {
        if (this.drawable != null) {
            return this.drawable.getIntrinsicHeight();
        }
        return 0;
    }

    public void moveBy(float f, float f2) {
        this.x += f;
        this.y += f2;
    }

    public void setPosition(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public void redraw() {
        postInvalidate();
    }

    public void setMinScale(float f) {
        this.minScale = f;
        if (this.gestureImageViewTouchListener != null) {
            this.gestureImageViewTouchListener.setMinScale(this.fitScaleHorizontal * f);
        }
    }

    public void setMaxScale(float f) {
        this.maxScale = f;
        if (this.gestureImageViewTouchListener != null) {
            this.gestureImageViewTouchListener.setMaxScale(this.startingScale * f);
        }
    }

    public void setScale(float f) {
        this.scaleAdjust = f;
    }

    public float getScale() {
        return this.scaleAdjust;
    }

    public float getImageX() {
        return this.x;
    }

    public float getImageY() {
        return this.y;
    }

    public boolean isStrict() {
        return this.strict;
    }

    public void setStrict(boolean z) {
        this.strict = z;
    }

    public boolean isRecycle() {
        return this.recycle;
    }

    public void setRecycle(boolean z) {
        this.recycle = z;
    }

    public void reset() {
        this.x = this.centerX;
        this.y = this.centerY;
        this.scaleAdjust = this.startingScale;
        if (this.gestureImageViewTouchListener != null) {
            this.gestureImageViewTouchListener.reset();
        }
        redraw();
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setGestureImageViewListener(GestureImageViewListener gestureImageViewListener) {
        this.gestureImageViewListener = gestureImageViewListener;
    }

    public GestureImageViewListener getGestureImageViewListener() {
        return this.gestureImageViewListener;
    }

    public Drawable getDrawable() {
        return this.drawable;
    }

    public void setAlpha(int i) {
        this.alpha = i;
        if (this.drawable != null) {
            this.drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        if (this.drawable != null) {
            this.drawable.setColorFilter(colorFilter);
        }
    }

    public void setImageURI(Uri uri) {
        Throwable th;
        InputStream inputStream;
        if ("content".equals(uri.getScheme())) {
            try {
                String[] strArr = new String[]{"orientation"};
                Cursor query = getContext().getContentResolver().query(uri, strArr, null, null, null);
                if (query != null && query.moveToFirst()) {
                    this.imageOrientation = query.getInt(query.getColumnIndex(strArr[0]));
                }
                try {
                    InputStream openInputStream = getContext().getContentResolver().openInputStream(uri);
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                        if (this.imageOrientation != 0) {
                            Matrix matrix = new Matrix();
                            matrix.postRotate((float) this.imageOrientation);
                            Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                            decodeStream.recycle();
                            setImageDrawable(new BitmapDrawable(getResources(), createBitmap));
                        } else {
                            setImageDrawable(new BitmapDrawable(getResources(), decodeStream));
                        }
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                        if (query != null) {
                            query.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = openInputStream;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                Log.w("GestureImageView", "Unable to open content: " + uri, th4);
            }
        } else {
            setImageDrawable(Drawable.createFromPath(uri.toString()));
        }
        if (this.drawable == null) {
            Log.e("GestureImageView", "resolveUri failed on bad bitmap uri: " + uri);
        }
    }

    public Matrix getImageMatrix() {
        if (!this.strict) {
            return super.getImageMatrix();
        }
        throw new UnsupportedOperationException("Not supported");
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType == ScaleType.CENTER || scaleType == ScaleType.CENTER_CROP || scaleType == ScaleType.CENTER_INSIDE) {
            super.setScaleType(scaleType);
        } else if (this.strict) {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.strict) {
            throw new UnsupportedOperationException("Not supported");
        }
        super.invalidateDrawable(drawable);
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.strict) {
            return super.onCreateDrawableState(i);
        }
        throw new UnsupportedOperationException("Not supported");
    }

    public void setAdjustViewBounds(boolean z) {
        if (this.strict) {
            throw new UnsupportedOperationException("Not supported");
        }
        super.setAdjustViewBounds(z);
    }

    public void setImageLevel(int i) {
        if (this.strict) {
            throw new UnsupportedOperationException("Not supported");
        }
        super.setImageLevel(i);
    }

    public void setImageMatrix(Matrix matrix) {
        if (this.strict) {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public void setImageState(int[] iArr, boolean z) {
        if (this.strict) {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public void setSelected(boolean z) {
        if (this.strict) {
            throw new UnsupportedOperationException("Not supported");
        }
        super.setSelected(z);
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.customOnTouchListener = onTouchListener;
    }

    public float getCenterX() {
        return this.centerX;
    }

    public float getCenterY() {
        return this.centerY;
    }

    public boolean isLandscape() {
        return getImageWidth() >= getImageHeight();
    }

    public boolean isPortrait() {
        return getImageWidth() <= getImageHeight();
    }

    public void setStartingScale(float f) {
        this.startingScale = f;
    }

    public void setStartingPosition(float f, float f2) {
        this.startX = Float.valueOf(f);
        this.startY = Float.valueOf(f2);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        if (this.gestureImageViewTouchListener != null) {
            this.gestureImageViewTouchListener.setOnClickListener(onClickListener);
        }
    }

    public boolean isOrientationAligned() {
        if (this.deviceOrientation == 2) {
            return isLandscape();
        }
        if (this.deviceOrientation == 1) {
            return isPortrait();
        }
        return true;
    }

    public int getDeviceOrientation() {
        return this.deviceOrientation;
    }
}
