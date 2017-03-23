package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class EditTextDialogFragment$$ViewInjector<T extends EditTextDialogFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.btnOk, "field 'btnOk' and method 'clickOk'");
        t.btnOk = (Button) finder.castView(view, R.id.btnOk, "field 'btnOk'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickOk();
            }
        });
        t.edPhoneNumber = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edPhoneNumber, "field 'edPhoneNumber'"), R.id.edPhoneNumber, "field 'edPhoneNumber'");
    }

    public void reset(T t) {
        t.btnOk = null;
        t.edPhoneNumber = null;
    }
}
