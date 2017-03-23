package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.EditText;

public class CreateCustomerActivity$$ViewInjector<T extends CreateCustomerActivity> extends BaseActivity$$ViewInjector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        super.inject(finder, (BaseActivity) t, obj);
        t.spinCity = (Spinner) finder.castView((View) finder.findRequiredView(obj, R.id.spinCity, "field 'spinCity'"), R.id.spinCity, "field 'spinCity'");
        t.spinTown = (Spinner) finder.castView((View) finder.findRequiredView(obj, R.id.spinTown, "field 'spinTown'"), R.id.spinTown, "field 'spinTown'");
        t.spinDistrict = (Spinner) finder.castView((View) finder.findRequiredView(obj, R.id.spinDistrict, "field 'spinDistrict'"), R.id.spinDistrict, "field 'spinDistrict'");
        t.spinStreet = (Spinner) finder.castView((View) finder.findRequiredView(obj, R.id.spinStreet, "field 'spinStreet'"), R.id.spinStreet, "field 'spinStreet'");
        t.edAddressLabel = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edAddressLabel, "field 'edAddressLabel'"), R.id.edAddressLabel, "field 'edAddressLabel'");
        t.edFirstName = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edFirstName, "field 'edFirstName'"), R.id.edFirstName, "field 'edFirstName'");
        t.edLastName = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edLastName, "field 'edLastName'"), R.id.edLastName, "field 'edLastName'");
        t.edAddressDepiction = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edAddressDepiction, "field 'edAddressDepiction'"), R.id.edAddressDepiction, "field 'edAddressDepiction'");
        t.edDoorNumber = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edDoorNumber, "field 'edDoorNumber'"), R.id.edDoorNumber, "field 'edDoorNumber'");
        t.edBuildingNumber = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edBuildingNumber, "field 'edBuildingNumber'"), R.id.edBuildingNumber, "field 'edBuildingNumber'");
        t.edBuildingName = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edBuildingName, "field 'edBuildingName'"), R.id.edBuildingName, "field 'edBuildingName'");
        t.progressBar = (ProgressBar) finder.castView((View) finder.findRequiredView(obj, R.id.progressBar, "field 'progressBar'"), R.id.progressBar, "field 'progressBar'");
        View view = (View) finder.findRequiredView(obj, R.id.frameAddCurrentAddress, "field 'frameAddCurrentAddress' and method 'clickFrameAddCurrentAddress'");
        t.frameAddCurrentAddress = (FrameLayout) finder.castView(view, R.id.frameAddCurrentAddress, "field 'frameAddCurrentAddress'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickFrameAddCurrentAddress();
            }
        });
        t.cBoxPrivacyAgreement = (CheckBox) finder.castView((View) finder.findRequiredView(obj, R.id.cBoxPrivacyAgreement, "field 'cBoxPrivacyAgreement'"), R.id.cBoxPrivacyAgreement, "field 'cBoxPrivacyAgreement'");
        t.tvAdd = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAdd, "field 'tvAdd'"), R.id.tvAdd, "field 'tvAdd'");
        ((View) finder.findRequiredView(obj, R.id.linearPrivacyAgreement, "method 'clickLinearPrivacyAgreement'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickLinearPrivacyAgreement();
            }
        });
    }

    public void reset(T t) {
        super.reset((BaseActivity) t);
        t.spinCity = null;
        t.spinTown = null;
        t.spinDistrict = null;
        t.spinStreet = null;
        t.edAddressLabel = null;
        t.edFirstName = null;
        t.edLastName = null;
        t.edAddressDepiction = null;
        t.edDoorNumber = null;
        t.edBuildingNumber = null;
        t.edBuildingName = null;
        t.progressBar = null;
        t.frameAddCurrentAddress = null;
        t.cBoxPrivacyAgreement = null;
        t.tvAdd = null;
    }
}
