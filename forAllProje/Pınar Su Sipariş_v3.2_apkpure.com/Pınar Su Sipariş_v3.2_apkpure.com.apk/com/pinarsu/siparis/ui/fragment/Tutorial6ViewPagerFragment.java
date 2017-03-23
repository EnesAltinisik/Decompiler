package com.pinarsu.siparis.ui.fragment;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.ui.activity.LoginActivity;
import com.pinarsu.siparis.ui.activity.TutorialActivity;
import com.pinarsu.siparis.view.TextView;

public class Tutorial6ViewPagerFragment extends Fragment {
    TutorialActivity activity;
    @InjectView(2131558575)
    LinearLayout linearParent;
    private Rect rect;
    @InjectView(2131558686)
    TextView tvLogin;
    @InjectView(2131558685)
    TextView tvTryApp;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.activity = (TutorialActivity) getActivity();
        return layoutInflater.inflate(R.layout.fragment_toturial_view_pager_item6, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        if (!(Preferences.PHONE_NUMBER == null || Preferences.PHONE_NUMBER.isEmpty())) {
            this.tvLogin.setVisibility(8);
        }
        this.tvTryApp.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        Tutorial6ViewPagerFragment.this.rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        break;
                    case 1:
                        if (Tutorial6ViewPagerFragment.this.rect.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()))) {
                            Tutorial6ViewPagerFragment.this.activity.clickSkip();
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        this.tvLogin.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        Tutorial6ViewPagerFragment.this.rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        break;
                    case 1:
                        if (Tutorial6ViewPagerFragment.this.rect.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()))) {
                            Preferences.isFIRST_OPEN_APP = false;
                            MyApplication.getInstance().getPreferences().save();
                            Tutorial6ViewPagerFragment.this.activity.startActivity(new Intent(Tutorial6ViewPagerFragment.this.activity, LoginActivity.class));
                            Tutorial6ViewPagerFragment.this.activity.finish();
                            break;
                        }
                        break;
                }
                return false;
            }
        });
    }
}
