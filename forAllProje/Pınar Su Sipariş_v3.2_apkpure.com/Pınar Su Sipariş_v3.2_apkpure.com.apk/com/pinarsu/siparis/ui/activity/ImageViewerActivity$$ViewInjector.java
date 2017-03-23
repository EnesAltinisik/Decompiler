package com.pinarsu.siparis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.gestureimageview.GestureImageView;

public class ImageViewerActivity$$ViewInjector<T extends ImageViewerActivity> implements Injector<T> {
    public void inject(Finder finder, T t, Object obj) {
        t.im = (GestureImageView) finder.castView((View) finder.findRequiredView(obj, R.id.im, "field 'im'"), R.id.im, "field 'im'");
    }

    public void reset(T t) {
        t.im = null;
    }
}
