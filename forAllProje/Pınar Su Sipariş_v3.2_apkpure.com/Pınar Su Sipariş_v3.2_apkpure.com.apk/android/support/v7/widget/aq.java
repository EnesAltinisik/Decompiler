package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.r;
import android.view.View;

/* compiled from: ScrollbarHelper */
class aq {
    static int a(r rVar, am amVar, View view, View view2, h hVar, boolean z, boolean z2) {
        if (hVar.t() == 0 || rVar.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (rVar.e() - Math.max(hVar.d(view), hVar.d(view2))) - 1) : Math.max(0, Math.min(hVar.d(view), hVar.d(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(amVar.b(view2) - amVar.a(view))) / ((float) (Math.abs(hVar.d(view) - hVar.d(view2)) + 1)))) + ((float) (amVar.c() - amVar.a(view))));
    }

    static int a(r rVar, am amVar, View view, View view2, h hVar, boolean z) {
        if (hVar.t() == 0 || rVar.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(hVar.d(view) - hVar.d(view2)) + 1;
        }
        return Math.min(amVar.f(), amVar.b(view2) - amVar.a(view));
    }

    static int b(r rVar, am amVar, View view, View view2, h hVar, boolean z) {
        if (hVar.t() == 0 || rVar.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return rVar.e();
        }
        return (int) ((((float) (amVar.b(view2) - amVar.a(view))) / ((float) (Math.abs(hVar.d(view) - hVar.d(view2)) + 1))) * ((float) rVar.e()));
    }
}
