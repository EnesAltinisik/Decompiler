package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.CampaignBaseAdapter;
import com.pinarsu.siparis.model.data.KAMPANYALAR;
import com.pinarsu.siparis.view.TextView;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public class CampaignsFragment extends BaseFragment {
    List<KAMPANYALAR> campaignList;
    @InjectView(2131558581)
    ListView lv;
    @InjectView(2131558660)
    TextView tvNoRecord;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.activity.setTitle(R.string.campaigns);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject((Object) this, view);
        this.campaignList = (List) getArguments().getSerializable("campaignList");
        if (this.campaignList == null || this.campaignList.size() <= 0) {
            this.tvNoRecord.setVisibility(0);
            return;
        }
        this.lv.setAdapter(new CampaignBaseAdapter(this.activity, this.campaignList));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    public int getLayoutResource() {
        return R.layout.fragment_campaigns;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
