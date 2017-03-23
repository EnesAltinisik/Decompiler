package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class AddReminderActivity$$ViewInjector<T extends AddReminderActivity> extends BaseActivity$$ViewInjector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        super.inject(finder, (BaseActivity) t, obj);
        t.tvTime = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTime, "field 'tvTime'"), R.id.tvTime, "field 'tvTime'");
        t.tvSelectedDate = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvSelectedDate, "field 'tvSelectedDate'"), R.id.tvSelectedDate, "field 'tvSelectedDate'");
        t.edDesc = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edDesc, "field 'edDesc'"), R.id.edDesc, "field 'edDesc'");
        View view = (View) finder.findRequiredView(obj, R.id.tvAddReminder, "field 'tvAddReminder' and method 'clickAddReminder'");
        t.tvAddReminder = (TextView) finder.castView(view, R.id.tvAddReminder, "field 'tvAddReminder'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickAddReminder();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.linearSelectCalendar, "method 'clickLinearSelectCalendar'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickLinearSelectCalendar();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.linearTime, "method 'clickLinearTime'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickLinearTime();
            }
        });
    }

    public void reset(T t) {
        super.reset((BaseActivity) t);
        t.tvTime = null;
        t.tvSelectedDate = null;
        t.edDesc = null;
        t.tvAddReminder = null;
    }
}
