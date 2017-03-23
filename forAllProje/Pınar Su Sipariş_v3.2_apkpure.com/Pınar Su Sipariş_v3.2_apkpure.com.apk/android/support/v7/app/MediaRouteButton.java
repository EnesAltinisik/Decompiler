package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.c.f;
import android.support.v7.c.g;
import android.support.v7.c.g.a;
import android.support.v7.c.g.e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Toast;
import com.google.android.gms.internal.zzamj;

public class MediaRouteButton extends View {
    private static final int[] CHECKABLE_STATE_SET = new int[]{16842911};
    private static final int[] CHECKED_STATE_SET = new int[]{16842912};
    private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
    private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
    private static final String TAG = "MediaRouteButton";
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private boolean mCheatSheetEnabled;
    private MediaRouteDialogFactory mDialogFactory;
    private boolean mIsConnecting;
    private int mMinHeight;
    private int mMinWidth;
    private boolean mRemoteActive;
    private Drawable mRemoteIndicator;
    private final g mRouter;
    private f mSelector;

    private final class MediaRouterCallback extends a {
        private MediaRouterCallback() {
        }

        public void onRouteAdded(g gVar, g.f fVar) {
            MediaRouteButton.this.refreshRoute();
        }

        public void onRouteRemoved(g gVar, g.f fVar) {
            MediaRouteButton.this.refreshRoute();
        }

        public void onRouteChanged(g gVar, g.f fVar) {
            MediaRouteButton.this.refreshRoute();
        }

        public void onRouteSelected(g gVar, g.f fVar) {
            MediaRouteButton.this.refreshRoute();
        }

        public void onRouteUnselected(g gVar, g.f fVar) {
            MediaRouteButton.this.refreshRoute();
        }

        public void onProviderAdded(g gVar, e eVar) {
            MediaRouteButton.this.refreshRoute();
        }

        public void onProviderRemoved(g gVar, e eVar) {
            MediaRouteButton.this.refreshRoute();
        }

        public void onProviderChanged(g gVar, e eVar) {
            MediaRouteButton.this.refreshRoute();
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.d.a.a.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context), attributeSet, i);
        this.mSelector = f.a;
        this.mDialogFactory = MediaRouteDialogFactory.getDefault();
        Context context2 = getContext();
        this.mRouter = g.a(context2);
        this.mCallback = new MediaRouterCallback();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, android.support.v7.d.a.f.MediaRouteButton, i, 0);
        setRemoteIndicatorDrawable(obtainStyledAttributes.getDrawable(android.support.v7.d.a.f.MediaRouteButton_externalRouteEnabledDrawable));
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(android.support.v7.d.a.f.MediaRouteButton_android_minWidth, 0);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(android.support.v7.d.a.f.MediaRouteButton_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        setClickable(true);
        setLongClickable(true);
    }

    public f getRouteSelector() {
        return this.mSelector;
    }

    public void setRouteSelector(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.mSelector.equals(fVar)) {
            if (this.mAttachedToWindow) {
                if (!this.mSelector.b()) {
                    this.mRouter.a(this.mCallback);
                }
                if (!fVar.b()) {
                    this.mRouter.a(fVar, this.mCallback);
                }
            }
            this.mSelector = fVar;
            refreshRoute();
        }
    }

    public MediaRouteDialogFactory getDialogFactory() {
        return this.mDialogFactory;
    }

    public void setDialogFactory(MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.mDialogFactory = mediaRouteDialogFactory;
    }

    public boolean showDialog() {
        if (!this.mAttachedToWindow) {
            return false;
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        g.f c = this.mRouter.c();
        if (c.f() || !c.a(this.mSelector)) {
            if (fragmentManager.findFragmentByTag(CHOOSER_FRAGMENT_TAG) != null) {
                Log.w(TAG, "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            MediaRouteChooserDialogFragment onCreateChooserDialogFragment = this.mDialogFactory.onCreateChooserDialogFragment();
            onCreateChooserDialogFragment.setRouteSelector(this.mSelector);
            onCreateChooserDialogFragment.show(fragmentManager, CHOOSER_FRAGMENT_TAG);
        } else if (fragmentManager.findFragmentByTag(CONTROLLER_FRAGMENT_TAG) != null) {
            Log.w(TAG, "showDialog(): Route controller dialog already showing!");
            return false;
        } else {
            this.mDialogFactory.onCreateControllerDialogFragment().show(fragmentManager, CONTROLLER_FRAGMENT_TAG);
        }
        return true;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager();
        }
        return null;
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    void setCheatSheetEnabled(boolean z) {
        this.mCheatSheetEnabled = z;
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        if (showDialog() || performClick) {
            return true;
        }
        return false;
    }

    public boolean performLongClick() {
        if (super.performLongClick()) {
            return true;
        }
        if (!this.mCheatSheetEnabled) {
            return false;
        }
        CharSequence contentDescription = getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        Toast makeText = Toast.makeText(context, contentDescription, 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, (i2 - iArr[0]) - (width / 2), height);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        performHapticFeedback(0);
        return true;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.mIsConnecting) {
            mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        } else if (this.mRemoteActive) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setState(getDrawableState());
            invalidate();
        }
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setCallback(null);
            unscheduleDrawable(this.mRemoteIndicator);
        }
        this.mRemoteIndicator = drawable;
        if (drawable != null) {
            boolean z;
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
        refreshDrawableState();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mRemoteIndicator;
    }

    public void jumpDrawablesToCurrentState() {
        if (getBackground() != null) {
            android.support.v4.c.a.a.a(getBackground());
        }
        if (this.mRemoteIndicator != null) {
            android.support.v4.c.a.a.a(this.mRemoteIndicator);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.mRemoteIndicator != null) {
            boolean z;
            Drawable drawable = this.mRemoteIndicator;
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        if (!this.mSelector.b()) {
            this.mRouter.a(this.mSelector, this.mCallback);
        }
        refreshRoute();
    }

    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        if (!this.mSelector.b()) {
            this.mRouter.a(this.mCallback);
        }
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int max = Math.max(this.mMinWidth, this.mRemoteIndicator != null ? this.mRemoteIndicator.getIntrinsicWidth() : 0);
        int i4 = this.mMinHeight;
        if (this.mRemoteIndicator != null) {
            i3 = this.mRemoteIndicator.getIntrinsicHeight();
        }
        i4 = Math.max(i4, i3);
        switch (mode) {
            case zzamj.UNSET_ENUM_VALUE /*-2147483648*/:
                i3 = Math.min(size, (max + getPaddingLeft()) + getPaddingRight());
                break;
            case 1073741824:
                i3 = size;
                break;
            default:
                i3 = (max + getPaddingLeft()) + getPaddingRight();
                break;
        }
        switch (mode2) {
            case zzamj.UNSET_ENUM_VALUE /*-2147483648*/:
                max = Math.min(size2, (getPaddingTop() + i4) + getPaddingBottom());
                break;
            case 1073741824:
                max = size2;
                break;
            default:
                max = (getPaddingTop() + i4) + getPaddingBottom();
                break;
        }
        setMeasuredDimension(i3, max);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mRemoteIndicator != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.mRemoteIndicator.getIntrinsicWidth();
            int intrinsicHeight = this.mRemoteIndicator.getIntrinsicHeight();
            paddingLeft += ((width - paddingLeft) - intrinsicWidth) / 2;
            width = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.mRemoteIndicator.setBounds(paddingLeft, width, paddingLeft + intrinsicWidth, width + intrinsicHeight);
            this.mRemoteIndicator.draw(canvas);
        }
    }

    private void refreshRoute() {
        int i = 0;
        if (this.mAttachedToWindow) {
            boolean z;
            g.f c = this.mRouter.c();
            boolean z2 = !c.f() && c.a(this.mSelector);
            if (z2 && c.d()) {
                z = true;
            } else {
                z = false;
            }
            if (this.mRemoteActive != z2) {
                this.mRemoteActive = z2;
                i = 1;
            }
            if (this.mIsConnecting != z) {
                this.mIsConnecting = z;
                i = 1;
            }
            if (i != 0) {
                refreshDrawableState();
                if (this.mIsConnecting && (this.mRemoteIndicator.getCurrent() instanceof AnimationDrawable)) {
                    AnimationDrawable animationDrawable = (AnimationDrawable) this.mRemoteIndicator.getCurrent();
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                }
            }
            setEnabled(this.mRouter.a(this.mSelector, 1));
        }
    }
}
