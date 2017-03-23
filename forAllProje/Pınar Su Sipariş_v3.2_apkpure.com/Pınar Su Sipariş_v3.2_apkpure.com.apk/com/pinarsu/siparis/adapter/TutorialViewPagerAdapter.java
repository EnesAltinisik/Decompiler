package com.pinarsu.siparis.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.pinarsu.siparis.interfaces.IClickListener;
import com.pinarsu.siparis.ui.fragment.Tutorial6ViewPagerFragment;
import com.pinarsu.siparis.ui.fragment.TutorialViewPagerFragment;

public class TutorialViewPagerAdapter extends FragmentStatePagerAdapter {
    public static boolean isFromMain = false;
    IClickListener delegate;

    public TutorialViewPagerAdapter(FragmentManager fragmentManager, IClickListener iClickListener) {
        super(fragmentManager);
        this.delegate = iClickListener;
    }

    public int getCount() {
        if (isFromMain) {
            return 4;
        }
        return 5;
    }

    public Fragment getItem(int i) {
        if (i < 4) {
            return TutorialViewPagerFragment.newInstance(i);
        }
        return new Tutorial6ViewPagerFragment();
    }

    public CharSequence getPageTitle(int i) {
        return "Page " + i;
    }
}
