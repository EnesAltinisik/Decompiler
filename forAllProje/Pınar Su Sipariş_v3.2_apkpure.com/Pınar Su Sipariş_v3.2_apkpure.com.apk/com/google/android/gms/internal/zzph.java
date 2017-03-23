package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.common.util.zzs;

public final class zzph extends Drawable implements Callback {
    private int mFrom;
    private long zzXy;
    private boolean zzapO;
    private int zzapU;
    private int zzapV;
    private int zzapW;
    private int zzapX;
    private int zzapY;
    private boolean zzapZ;
    private b zzaqa;
    private Drawable zzaqb;
    private Drawable zzaqc;
    private boolean zzaqd;
    private boolean zzaqe;
    private boolean zzaqf;
    private int zzaqg;

    private static final class a extends Drawable {
        private static final a a = new a();
        private static final a b = new a();

        private static final class a extends ConstantState {
            private a() {
            }

            public int getChangingConfigurations() {
                return 0;
            }

            public Drawable newDrawable() {
                return a.a;
            }
        }

        private a() {
        }

        public void draw(Canvas canvas) {
        }

        public ConstantState getConstantState() {
            return b;
        }

        public int getOpacity() {
            return -2;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    static final class b extends ConstantState {
        int a;
        int b;

        b(b bVar) {
            if (bVar != null) {
                this.a = bVar.a;
                this.b = bVar.b;
            }
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            return new zzph(this);
        }
    }

    public zzph(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = a.a;
        }
        this.zzaqb = drawable;
        drawable.setCallback(this);
        b bVar = this.zzaqa;
        bVar.b |= drawable.getChangingConfigurations();
        if (drawable2 == null) {
            drawable2 = a.a;
        }
        this.zzaqc = drawable2;
        drawable2.setCallback(this);
        bVar = this.zzaqa;
        bVar.b |= drawable2.getChangingConfigurations();
    }

    zzph(b bVar) {
        this.zzapU = 0;
        this.zzapW = 255;
        this.zzapY = 0;
        this.zzapO = true;
        this.zzaqa = new b(bVar);
    }

    public boolean canConstantState() {
        if (!this.zzaqd) {
            boolean z = (this.zzaqb.getConstantState() == null || this.zzaqc.getConstantState() == null) ? false : true;
            this.zzaqe = z;
            this.zzaqd = true;
        }
        return this.zzaqe;
    }

    public void draw(Canvas canvas) {
        int i = 1;
        int i2 = 0;
        switch (this.zzapU) {
            case 1:
                this.zzXy = SystemClock.uptimeMillis();
                this.zzapU = 2;
                break;
            case 2:
                if (this.zzXy >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.zzXy)) / ((float) this.zzapX);
                    if (uptimeMillis < TextTrackStyle.DEFAULT_FONT_SCALE) {
                        i = 0;
                    }
                    if (i != 0) {
                        this.zzapU = 0;
                    }
                    this.zzapY = (int) ((Math.min(uptimeMillis, TextTrackStyle.DEFAULT_FONT_SCALE) * ((float) (this.zzapV + 0))) + 0.0f);
                    break;
                }
                break;
        }
        i2 = i;
        i = this.zzapY;
        boolean z = this.zzapO;
        Drawable drawable = this.zzaqb;
        Drawable drawable2 = this.zzaqc;
        if (i2 != 0) {
            if (!z || i == 0) {
                drawable.draw(canvas);
            }
            if (i == this.zzapW) {
                drawable2.setAlpha(this.zzapW);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z) {
            drawable.setAlpha(this.zzapW - i);
        }
        drawable.draw(canvas);
        if (z) {
            drawable.setAlpha(this.zzapW);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.zzapW);
        }
        invalidateSelf();
    }

    public int getChangingConfigurations() {
        return (super.getChangingConfigurations() | this.zzaqa.a) | this.zzaqa.b;
    }

    public ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.zzaqa.a = getChangingConfigurations();
        return this.zzaqa;
    }

    public int getIntrinsicHeight() {
        return Math.max(this.zzaqb.getIntrinsicHeight(), this.zzaqc.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.zzaqb.getIntrinsicWidth(), this.zzaqc.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.zzaqf) {
            this.zzaqg = Drawable.resolveOpacity(this.zzaqb.getOpacity(), this.zzaqc.getOpacity());
            this.zzaqf = true;
        }
        return this.zzaqg;
    }

    @TargetApi(11)
    public void invalidateDrawable(Drawable drawable) {
        if (zzs.zzuX()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public Drawable mutate() {
        if (!this.zzapZ && super.mutate() == this) {
            if (canConstantState()) {
                this.zzaqb.mutate();
                this.zzaqc.mutate();
                this.zzapZ = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        this.zzaqb.setBounds(rect);
        this.zzaqc.setBounds(rect);
    }

    @TargetApi(11)
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (zzs.zzuX()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.scheduleDrawable(this, runnable, j);
            }
        }
    }

    public void setAlpha(int i) {
        if (this.zzapY == this.zzapW) {
            this.zzapY = i;
        }
        this.zzapW = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.zzaqb.setColorFilter(colorFilter);
        this.zzaqc.setColorFilter(colorFilter);
    }

    public void startTransition(int i) {
        this.mFrom = 0;
        this.zzapV = this.zzapW;
        this.zzapY = 0;
        this.zzapX = i;
        this.zzapU = 1;
        invalidateSelf();
    }

    @TargetApi(11)
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (zzs.zzuX()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.unscheduleDrawable(this, runnable);
            }
        }
    }

    public Drawable zztc() {
        return this.zzaqc;
    }
}
