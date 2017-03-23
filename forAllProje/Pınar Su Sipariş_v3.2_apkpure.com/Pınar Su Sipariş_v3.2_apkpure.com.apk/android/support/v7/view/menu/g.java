package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.v7.a.a.h;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.view.menu.l.a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.location.places.Place;

/* compiled from: MenuDialogHelper */
class g implements OnClickListener, OnDismissListener, OnKeyListener, a {
    e a;
    private f b;
    private AlertDialog c;
    private a d;

    public g(f fVar) {
        this.b = fVar;
    }

    public void a(IBinder iBinder) {
        f fVar = this.b;
        Builder builder = new Builder(fVar.e());
        this.a = new e(builder.getContext(), h.abc_list_menu_item_layout);
        this.a.a((a) this);
        this.b.a(this.a);
        builder.setAdapter(this.a.a(), this);
        View o = fVar.o();
        if (o != null) {
            builder.setCustomTitle(o);
        } else {
            builder.setIcon(fVar.n()).setTitle(fVar.m());
        }
        builder.setOnKeyListener(this);
        this.c = builder.create();
        this.c.setOnDismissListener(this);
        LayoutParams attributes = this.c.getWindow().getAttributes();
        attributes.type = Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= MetadataChangeSet.INDEXABLE_TEXT_SIZE_LIMIT_BYTES;
        this.c.show();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                window = this.c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.b.a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.b.performShortcut(i, keyEvent, 0);
    }

    public void a() {
        if (this.c != null) {
            this.c.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.a.a(this.b, true);
    }

    public void onCloseMenu(f fVar, boolean z) {
        if (z || fVar == this.b) {
            a();
        }
        if (this.d != null) {
            this.d.onCloseMenu(fVar, z);
        }
    }

    public boolean onOpenSubMenu(f fVar) {
        if (this.d != null) {
            return this.d.onOpenSubMenu(fVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a((h) this.a.a().getItem(i), 0);
    }
}
