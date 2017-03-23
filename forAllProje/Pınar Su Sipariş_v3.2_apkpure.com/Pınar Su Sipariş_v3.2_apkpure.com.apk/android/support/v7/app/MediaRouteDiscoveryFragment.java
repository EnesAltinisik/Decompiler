package android.support.v7.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.c.f;
import android.support.v7.c.g;
import android.support.v7.c.g.a;

public class MediaRouteDiscoveryFragment extends Fragment {
    private final String ARGUMENT_SELECTOR = "selector";
    private a mCallback;
    private g mRouter;
    private f mSelector;

    public g getMediaRouter() {
        ensureRouter();
        return this.mRouter;
    }

    private void ensureRouter() {
        if (this.mRouter == null) {
            this.mRouter = g.a(getActivity());
        }
    }

    public f getRouteSelector() {
        ensureRouteSelector();
        return this.mSelector;
    }

    public void setRouteSelector(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        ensureRouteSelector();
        if (!this.mSelector.equals(fVar)) {
            this.mSelector = fVar;
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBundle("selector", fVar.d());
            setArguments(arguments);
            if (this.mCallback != null) {
                this.mRouter.a(this.mCallback);
                this.mRouter.a(this.mSelector, this.mCallback, onPrepareCallbackFlags());
            }
        }
    }

    private void ensureRouteSelector() {
        if (this.mSelector == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mSelector = f.a(arguments.getBundle("selector"));
            }
            if (this.mSelector == null) {
                this.mSelector = f.a;
            }
        }
    }

    public a onCreateCallback() {
        return new a() {
        };
    }

    public int onPrepareCallbackFlags() {
        return 4;
    }

    public void onStart() {
        super.onStart();
        ensureRouteSelector();
        ensureRouter();
        this.mCallback = onCreateCallback();
        if (this.mCallback != null) {
            this.mRouter.a(this.mSelector, this.mCallback, onPrepareCallbackFlags());
        }
    }

    public void onStop() {
        if (this.mCallback != null) {
            this.mRouter.a(this.mCallback);
            this.mCallback = null;
        }
        super.onStop();
    }
}
