package com.pinarsu.siparis.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.ui.activity.TutorialActivity;
import com.squareup.picasso.Picasso;

public class TutorialViewPagerFragment extends Fragment {
    private TutorialActivity activity;
    private int[] drawableIds = new int[]{R.drawable.tutorial1_540, R.drawable.tutorial2_540, R.drawable.tutorial3_540, R.drawable.tutorial4_540};
    @InjectView(2131558612)
    ImageView im;
    private int position;

    public static TutorialViewPagerFragment newInstance(int i) {
        TutorialViewPagerFragment tutorialViewPagerFragment = new TutorialViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        tutorialViewPagerFragment.setArguments(bundle);
        return tutorialViewPagerFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity = (TutorialActivity) getActivity();
        this.position = getArguments().getInt("position", 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_tutorial_view_pager_item, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
    }

    public void onResume() {
        super.onResume();
        Picasso.with(this.activity).load(this.drawableIds[this.position]).into(this.im);
    }
}
