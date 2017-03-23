package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IServicePush;
import com.pinarsu.siparis.model.PushServiceChangeStatusItem;
import com.pinarsu.siparis.model.PushServiceResponseItem;
import com.pinarsu.siparis.tools.ToastHelper;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.activity.AllAddressActivity;
import com.pinarsu.siparis.ui.activity.MainActivity;
import com.pinarsu.siparis.ui.activity.SSSActivity;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

@SuppressLint({"ParcelCreator"})
public class ProfileFragment extends BaseFragment {
    @InjectView(2131558681)
    LinearLayout linearMyRegisteredAddress;
    private ProgressDialogFragment progressDialogFragment;
    private IServicePush service;
    @InjectView(2131558683)
    ToggleButton toggleButton;
    @InjectView(2131558680)
    TextView tvFirstLastName;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.service = Tools.getServicePush();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.activity.setTitle(R.string.profile);
        return layoutInflater.inflate(R.layout.fragment_profile, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        CharSequence charSequence = "";
        if (Preferences.ADDRESS.AD != null) {
            charSequence = Preferences.ADDRESS.AD;
        }
        if (Preferences.ADDRESS.SOYADI != null) {
            charSequence = charSequence + " " + Preferences.ADDRESS.SOYADI;
        }
        this.tvFirstLastName.setText(charSequence);
        this.toggleButton.setChecked(Preferences.isPUSH);
        Log.d("MNTTAG", "Preferences.isPUSH : " + Preferences.isPUSH);
        this.toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ProfileFragment.this.changeStatus(z);
            }
        });
    }

    private void changeStatus(final boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        this.progressDialogFragment = ProgressDialogFragment.newInstance();
        this.progressDialogFragment.show(this.activity);
        this.service.getChangeStatus(new PushServiceChangeStatusItem(Preferences.PUSH_TOKEN, i), new Callback<PushServiceResponseItem>() {
            public void success(PushServiceResponseItem pushServiceResponseItem, Response response) {
                ProfileFragment.this.progressDialogFragment.dismiss();
                if (pushServiceResponseItem.getSucceed().intValue() == 1) {
                    new ToastHelper(ProfileFragment.this.activity, "Bildirim izni kaydedildi.").show();
                    Preferences.isPUSH = z;
                    MyApplication.getInstance().getPreferences().save();
                    return;
                }
                new ToastHelper(ProfileFragment.this.activity, "Bildirim izni kaydedilemedi!").show();
                ProfileFragment.this.toggleButton.setChecked(Preferences.isPUSH);
            }

            public void failure(RetrofitError retrofitError) {
                ProfileFragment.this.progressDialogFragment.dismiss();
                Log.d("MNTTAG", "RetrofitError error : " + retrofitError.getMessage());
                new ToastHelper(ProfileFragment.this.activity, "Bildirim izni kaydedilemedi!").show();
                ProfileFragment.this.toggleButton.setChecked(Preferences.isPUSH);
            }
        });
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    public int getLayoutResource() {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    @OnClick({2131558681})
    void clickMyRegisteredAddress() {
        this.activity.startActivityForResult(new Intent(this.activity, AllAddressActivity.class).putExtra("isFromHome", false), MainActivity.REQUEST_TYPE);
    }

    @OnClick({2131558684})
    void clickSSS() {
        this.activity.startActivity(new Intent(this.activity, SSSActivity.class));
    }
}
