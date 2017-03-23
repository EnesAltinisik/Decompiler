package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.TutorialViewPagerAdapter;
import com.pinarsu.siparis.interfaces.IIndicatorPageSelectionListener;
import com.pinarsu.siparis.view.ViewPagerIndicator;

public class TutorialActivity extends AppCompatActivity implements IIndicatorPageSelectionListener {
    public static int REQUEST_TYPE = 999;
    @InjectView(2131558647)
    ImageView imSkip;
    @InjectView(2131558644)
    ViewPagerIndicator indicator;
    @InjectView(2131558643)
    ViewPager viewPager;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_tutorial);
        ButterKnife.inject((Activity) this);
        this.viewPager.setAdapter(new TutorialViewPagerAdapter(getSupportFragmentManager(), null));
        this.indicator.setViewPager(this.viewPager);
        this.indicator.setDelegatePageSelectionListener(this);
    }

    public void onPageSelected(int i) {
        if (i == 5) {
            this.imSkip.setVisibility(8);
        } else {
            this.imSkip.setVisibility(0);
        }
        Log.d("MNTTAG", "onPageSelected   : " + i);
    }

    @OnClick({2131558647})
    public void clickSkip() {
        Preferences.isFIRST_OPEN_APP = false;
        MyApplication.getInstance().getPreferences().save();
        if (!TutorialViewPagerAdapter.isFromMain) {
            startActivity(new Intent(this, MainActivity.class));
        }
        finish();
    }
}
