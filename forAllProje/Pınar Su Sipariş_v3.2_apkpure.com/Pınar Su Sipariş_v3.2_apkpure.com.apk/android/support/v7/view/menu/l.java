package android.support.v7.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* compiled from: MenuPresenter */
public interface l {

    /* compiled from: MenuPresenter */
    public interface a {
        void onCloseMenu(f fVar, boolean z);

        boolean onOpenSubMenu(f fVar);
    }

    void a(Context context, f fVar);

    void a(Parcelable parcelable);

    void a(f fVar, boolean z);

    boolean a(f fVar, h hVar);

    boolean a(p pVar);

    void b(boolean z);

    boolean b();

    boolean b(f fVar, h hVar);

    int c();

    Parcelable d();
}
