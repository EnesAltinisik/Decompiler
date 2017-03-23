package com.pinarsu.siparis.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.pinarsu.siparis.interfaces.IClickListener;
import com.pinarsu.siparis.model.data.SORULAR;
import com.pinarsu.siparis.ui.fragment.SurveyViewPagerFragment;
import java.util.List;

public class SurveyViewPagerAdapter extends FragmentStatePagerAdapter {
    IClickListener delegate;
    List<SORULAR> list;

    public SurveyViewPagerAdapter(FragmentManager fragmentManager, List<SORULAR> list, IClickListener iClickListener) {
        super(fragmentManager);
        this.list = list;
        this.delegate = iClickListener;
    }

    public int getCount() {
        return this.list.size();
    }

    public Fragment getItem(int i) {
        return SurveyViewPagerFragment.newInstance(i, (SORULAR) this.list.get(i), this.delegate);
    }

    public CharSequence getPageTitle(int i) {
        return "Page " + i;
    }
}
