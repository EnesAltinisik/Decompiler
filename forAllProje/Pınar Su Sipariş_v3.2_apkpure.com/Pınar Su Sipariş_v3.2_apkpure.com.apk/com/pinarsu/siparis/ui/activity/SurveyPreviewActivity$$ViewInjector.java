package com.pinarsu.siparis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class SurveyPreviewActivity$$ViewInjector<T extends SurveyPreviewActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        ((View) finder.findRequiredView(obj, R.id.tvContinue, "method 'tvClose'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.tvClose();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.btnFillSurvey, "method 'fillSurvey'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.fillSurvey();
            }
        });
    }

    public void reset(T t) {
    }
}
