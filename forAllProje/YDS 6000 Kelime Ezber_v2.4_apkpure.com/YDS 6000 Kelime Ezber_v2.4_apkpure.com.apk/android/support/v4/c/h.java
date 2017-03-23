package android.support.v4.c;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;

@TargetApi(11)
class h {
    public static Intent a(ComponentName componentName) {
        return Intent.makeMainActivity(componentName);
    }
}
