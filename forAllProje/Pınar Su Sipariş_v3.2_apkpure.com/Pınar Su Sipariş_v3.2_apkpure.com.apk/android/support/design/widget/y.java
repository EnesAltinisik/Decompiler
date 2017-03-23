package android.support.design.widget;

import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton */
class y extends ImageButton {
    private int a;

    public void setVisibility(int i) {
        a(i, true);
    }

    final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.a = i;
        }
    }

    final int getUserSetVisibility() {
        return this.a;
    }
}
