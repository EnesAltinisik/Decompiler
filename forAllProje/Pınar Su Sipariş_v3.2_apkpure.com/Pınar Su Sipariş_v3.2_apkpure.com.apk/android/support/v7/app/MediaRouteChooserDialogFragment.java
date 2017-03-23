package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.c.f;

public class MediaRouteChooserDialogFragment extends DialogFragment {
    private final String ARGUMENT_SELECTOR = "selector";
    private f mSelector;

    public MediaRouteChooserDialogFragment() {
        setCancelable(true);
    }

    public f getRouteSelector() {
        ensureRouteSelector();
        return this.mSelector;
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
            MediaRouteChooserDialog mediaRouteChooserDialog = (MediaRouteChooserDialog) getDialog();
            if (mediaRouteChooserDialog != null) {
                mediaRouteChooserDialog.setRouteSelector(fVar);
            }
        }
    }

    public MediaRouteChooserDialog onCreateChooserDialog(Context context, Bundle bundle) {
        return new MediaRouteChooserDialog(context);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateChooserDialog = onCreateChooserDialog(getActivity(), bundle);
        onCreateChooserDialog.setRouteSelector(getRouteSelector());
        return onCreateChooserDialog;
    }
}
