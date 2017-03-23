package android.support.v7.app;

import android.content.Context;
import android.support.v4.view.d;
import android.support.v7.c.f;
import android.support.v7.c.g;
import android.support.v7.c.g.a;
import android.support.v7.c.g.e;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends d {
    private static final String TAG = "MediaRouteActionProvider";
    private MediaRouteButton mButton;
    private final MediaRouterCallback mCallback;
    private MediaRouteDialogFactory mDialogFactory = MediaRouteDialogFactory.getDefault();
    private final g mRouter;
    private f mSelector = f.a;

    private static final class MediaRouterCallback extends a {
        private final WeakReference<MediaRouteActionProvider> mProviderWeak;

        public MediaRouterCallback(MediaRouteActionProvider mediaRouteActionProvider) {
            this.mProviderWeak = new WeakReference(mediaRouteActionProvider);
        }

        public void onRouteAdded(g gVar, g.f fVar) {
            refreshRoute(gVar);
        }

        public void onRouteRemoved(g gVar, g.f fVar) {
            refreshRoute(gVar);
        }

        public void onRouteChanged(g gVar, g.f fVar) {
            refreshRoute(gVar);
        }

        public void onProviderAdded(g gVar, e eVar) {
            refreshRoute(gVar);
        }

        public void onProviderRemoved(g gVar, e eVar) {
            refreshRoute(gVar);
        }

        public void onProviderChanged(g gVar, e eVar) {
            refreshRoute(gVar);
        }

        private void refreshRoute(g gVar) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) this.mProviderWeak.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.refreshRoute();
            } else {
                gVar.a((a) this);
            }
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.mRouter = g.a(context);
        this.mCallback = new MediaRouterCallback(this);
    }

    public f getRouteSelector() {
        return this.mSelector;
    }

    public void setRouteSelector(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.mSelector.equals(fVar)) {
            if (!this.mSelector.b()) {
                this.mRouter.a(this.mCallback);
            }
            if (!fVar.b()) {
                this.mRouter.a(fVar, this.mCallback);
            }
            this.mSelector = fVar;
            refreshRoute();
            if (this.mButton != null) {
                this.mButton.setRouteSelector(fVar);
            }
        }
    }

    public MediaRouteDialogFactory getDialogFactory() {
        return this.mDialogFactory;
    }

    public void setDialogFactory(MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        } else if (this.mDialogFactory != mediaRouteDialogFactory) {
            this.mDialogFactory = mediaRouteDialogFactory;
            if (this.mButton != null) {
                this.mButton.setDialogFactory(mediaRouteDialogFactory);
            }
        }
    }

    public MediaRouteButton getMediaRouteButton() {
        return this.mButton;
    }

    public MediaRouteButton onCreateMediaRouteButton() {
        return new MediaRouteButton(getContext());
    }

    public View onCreateActionView() {
        if (this.mButton != null) {
            Log.e(TAG, "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        this.mButton = onCreateMediaRouteButton();
        this.mButton.setCheatSheetEnabled(true);
        this.mButton.setRouteSelector(this.mSelector);
        this.mButton.setDialogFactory(this.mDialogFactory);
        this.mButton.setLayoutParams(new LayoutParams(-2, -1));
        return this.mButton;
    }

    public boolean onPerformDefaultAction() {
        if (this.mButton != null) {
            return this.mButton.showDialog();
        }
        return false;
    }

    public boolean overridesItemVisibility() {
        return true;
    }

    public boolean isVisible() {
        return this.mRouter.a(this.mSelector, 1);
    }

    private void refreshRoute() {
        refreshVisibility();
    }
}
