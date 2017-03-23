package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.view.d.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
/* compiled from: MenuItemWrapperJB */
class j extends i {

    /* compiled from: MenuItemWrapperJB */
    class a extends a implements VisibilityListener {
        b c;
        final /* synthetic */ j d;

        public a(j jVar, Context context, ActionProvider actionProvider) {
            this.d = jVar;
            super(jVar, context, actionProvider);
        }

        public View onCreateActionView(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        public boolean overridesItemVisibility() {
            return this.a.overridesItemVisibility();
        }

        public boolean isVisible() {
            return this.a.isVisible();
        }

        public void refreshVisibility() {
            this.a.refreshVisibility();
        }

        public void setVisibilityListener(b bVar) {
            VisibilityListener visibilityListener;
            this.c = bVar;
            ActionProvider actionProvider = this.a;
            if (bVar == null) {
                visibilityListener = null;
            }
            actionProvider.setVisibilityListener(visibilityListener);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.c != null) {
                this.c.a(z);
            }
        }
    }

    j(Context context, android.support.v4.e.a.b bVar) {
        super(context, bVar);
    }

    a a(ActionProvider actionProvider) {
        return new a(this, this.a, actionProvider);
    }
}
