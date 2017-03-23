package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IBackPressed;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.activity.MainActivity.FRAGMENT_TYPE;
import com.pinarsu.siparis.ui.activity.OrderActivity;

@SuppressLint({"ParcelCreator"})
public class Order1Fragment extends Fragment implements Parcelable, IBackPressed, IDelegateOneObjectLister {
    private OrderActivity activity;
    private Resources resources;
    @InjectView(2131558669)
    TextView tvAddressDetail;
    @InjectView(2131558668)
    TextView tvAddressLabel;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity = (OrderActivity) getActivity();
        this.resources = this.activity.getResources();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_order1, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        ADRES adres = Preferences.ADDRESS;
        CharSequence address = adres.getAddress();
        if (adres.ADRES_ETIKETI == null || adres.ADRES_ETIKETI.isEmpty()) {
            this.tvAddressLabel.setVisibility(8);
        } else {
            Tools.setTextViewUnderLine(this.tvAddressLabel, adres.ADRES_ETIKETI);
        }
        this.tvAddressDetail.setText(address);
    }

    public void onResume() {
        super.onResume();
        this.activity.setDelegateIBackPressed(this);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    @OnClick({2131558646})
    void clickContinue() {
        this.activity.displayView(FRAGMENT_TYPE.ORDER2, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public void onBackPressed() {
        YesOrNoFragment.show(this.activity, this, "Çıkmak istediğinizden emin misiniz?", "Sipariş kaydedilmeyecektir.");
    }

    public void onObject(Object obj, int i) {
        if (obj == null) {
            this.activity.setDelegateIBackPressed(this);
        } else if (((Boolean) obj).booleanValue()) {
            this.activity.finish();
        } else {
            this.activity.setDelegateIBackPressed(this);
        }
    }
}
