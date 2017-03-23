package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.EditText;

public class Order3Fragment$$ViewInjector<T extends Order3Fragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.imNow = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imNow, "field 'imNow'"), R.id.imNow, "field 'imNow'");
        t.imSelectCalendar = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imSelectCalendar, "field 'imSelectCalendar'"), R.id.imSelectCalendar, "field 'imSelectCalendar'");
        t.tvSelectedDate = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvSelectedDate, "field 'tvSelectedDate'"), R.id.tvSelectedDate, "field 'tvSelectedDate'");
        t.tvToday = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvToday, "field 'tvToday'"), R.id.tvToday, "field 'tvToday'");
        t.tvAmount = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAmount, "field 'tvAmount'"), R.id.tvAmount, "field 'tvAmount'");
        t.edOrderNote = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edOrderNote, "field 'edOrderNote'"), R.id.edOrderNote, "field 'edOrderNote'");
        t.tvCampaignInfo = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvCampaignInfo, "field 'tvCampaignInfo'"), R.id.tvCampaignInfo, "field 'tvCampaignInfo'");
        t.tvWarning = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvWarning, "field 'tvWarning'"), R.id.tvWarning, "field 'tvWarning'");
        t.linearCampaigns = (LinearLayout) finder.castView((View) finder.findRequiredView(obj, R.id.linearCampaigns, "field 'linearCampaigns'"), R.id.linearCampaigns, "field 'linearCampaigns'");
        ((View) finder.findRequiredView(obj, R.id.linearNow, "method 'clickNow'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickNow();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.linearSelectCalendar, "method 'clickSelectCalendar'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickSelectCalendar();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.tvGiveOrder, "method 'clickGiveOrder'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickGiveOrder();
            }
        });
    }

    public void reset(T t) {
        t.imNow = null;
        t.imSelectCalendar = null;
        t.tvSelectedDate = null;
        t.tvToday = null;
        t.tvAmount = null;
        t.edOrderNote = null;
        t.tvCampaignInfo = null;
        t.tvWarning = null;
        t.linearCampaigns = null;
    }
}
