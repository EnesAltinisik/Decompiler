package com.pinarsu.siparis.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.pinarsu.siparis.interfaces.IClickListener;
import com.pinarsu.siparis.model.ViewPagerItem;
import com.pinarsu.siparis.ui.fragment.ViewPagerFragment;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    IClickListener delegate;
    List<ViewPagerItem> list;

    public ViewPagerAdapter(FragmentManager fragmentManager, List<ViewPagerItem> list, IClickListener iClickListener) {
        super(fragmentManager);
        this.list = list;
        this.delegate = iClickListener;
    }

    public int getCount() {
        return this.list.size();
    }

    public Fragment getItem(int i) throws OutOfMemoryError {
        return ViewPagerFragment.newInstance(i, (ViewPagerItem) this.list.get(i), this.delegate);
    }

    public CharSequence getPageTitle(int i) {
        return "Page " + i;
    }
}
