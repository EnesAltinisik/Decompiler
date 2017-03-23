package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.EditText;
import com.pinarsu.siparis.view.TextView;

public class SendVerificationLastStepActivity$$ViewInjector<T extends SendVerificationLastStepActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.btnOk, "field 'btnOk' and method 'clickOk'");
        t.btnOk = (Button) finder.castView(view, R.id.btnOk, "field 'btnOk'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickOk();
            }
        });
        t.edVerificationCode = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edVerificationCode, "field 'edVerificationCode'"), R.id.edVerificationCode, "field 'edVerificationCode'");
        t.timerProgressbar = (ProgressBar) finder.castView((View) finder.findRequiredView(obj, R.id.timerProgressbar, "field 'timerProgressbar'"), R.id.timerProgressbar, "field 'timerProgressbar'");
        t.linearTimer = (LinearLayout) finder.castView((View) finder.findRequiredView(obj, R.id.linearTimer, "field 'linearTimer'"), R.id.linearTimer, "field 'linearTimer'");
        t.tvTimer = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTimer, "field 'tvTimer'"), R.id.tvTimer, "field 'tvTimer'");
        ((View) finder.findRequiredView(obj, R.id.imBack, "method 'clickBack'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickBack();
            }
        });
    }

    public void reset(T t) {
        t.btnOk = null;
        t.edVerificationCode = null;
        t.timerProgressbar = null;
        t.linearTimer = null;
        t.tvTimer = null;
    }
}
