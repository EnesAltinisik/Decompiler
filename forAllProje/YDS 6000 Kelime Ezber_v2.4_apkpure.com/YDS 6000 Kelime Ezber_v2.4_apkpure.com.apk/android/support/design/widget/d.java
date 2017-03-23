package android.support.design.widget;

import android.annotation.TargetApi;
import android.graphics.Outline;

@TargetApi(21)
class d extends c {
    d() {
    }

    public void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
