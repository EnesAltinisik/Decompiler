package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import butterknife.ButterKnife.Finder;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class ProductListActivity$$ViewInjector<T extends ProductListActivity> extends BaseActivity$$ViewInjector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        super.inject(finder, (BaseActivity) t, obj);
        View view = (View) finder.findRequiredView(obj, R.id.lv, "field 'lv' and method 'onItemClick'");
        t.lv = (ListView) finder.castView(view, R.id.lv, "field 'lv'");
        ((AdapterView) view).setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                t.onItemClick(i);
            }
        });
        t.tvAddedAll = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAddedAll, "field 'tvAddedAll'"), R.id.tvAddedAll, "field 'tvAddedAll'");
    }

    public void reset(T t) {
        super.reset((BaseActivity) t);
        t.lv = null;
        t.tvAddedAll = null;
    }
}
