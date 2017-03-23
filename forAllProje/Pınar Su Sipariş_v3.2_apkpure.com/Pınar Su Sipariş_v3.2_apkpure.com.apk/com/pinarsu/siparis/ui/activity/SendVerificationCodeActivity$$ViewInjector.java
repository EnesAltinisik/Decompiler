package com.pinarsu.siparis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.EditText;

public class SendVerificationCodeActivity$$ViewInjector<T extends SendVerificationCodeActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.edPhoneNumber = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edPhoneNumber, "field 'edPhoneNumber'"), R.id.edPhoneNumber, "field 'edPhoneNumber'");
        ((View) finder.findRequiredView(obj, R.id.imBack, "method 'clickBack'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickBack();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.btnSendCode, "method 'clickBtnSendCode'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickBtnSendCode();
            }
        });
    }

    public void reset(T t) {
        t.edPhoneNumber = null;
    }
}
