package com.fodlam.yds.e;

import android.os.Bundle;
import android.support.v4.b.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fodlam.yds.R;
import com.fodlam.yds.a.b;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

public class a extends l {
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_horizontal, viewGroup, false);
    }

    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ((HorizontalInfiniteCycleViewPager) view.findViewById(R.id.hicvp)).setAdapter(new b(h()));
    }
}
