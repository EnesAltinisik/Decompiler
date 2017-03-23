package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.LayoutInflater;

@TargetApi(21)
class m {
    static void a(LayoutInflater layoutInflater, n nVar) {
        layoutInflater.setFactory2(nVar != null ? new a(nVar) : null);
    }
}
