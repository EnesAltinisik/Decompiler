package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.Spinner;
import butterknife.ButterKnife.Finder;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.EditText;
import com.pinarsu.siparis.view.TextView;

public class CreateAddressActivity$$ViewInjector<T extends CreateAddressActivity> extends BaseActivity$$ViewInjector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        super.inject(finder, (BaseActivity) t, obj);
        t.spinCity = (Spinner) finder.castView((View) finder.findRequiredView(obj, R.id.spinCity, "field 'spinCity'"), R.id.spinCity, "field 'spinCity'");
        t.spinTown = (Spinner) finder.castView((View) finder.findRequiredView(obj, R.id.spinTown, "field 'spinTown'"), R.id.spinTown, "field 'spinTown'");
        t.spinDistrict = (Spinner) finder.castView((View) finder.findRequiredView(obj, R.id.spinDistrict, "field 'spinDistrict'"), R.id.spinDistrict, "field 'spinDistrict'");
        t.spinStreet = (Spinner) finder.castView((View) finder.findRequiredView(obj, R.id.spinStreet, "field 'spinStreet'"), R.id.spinStreet, "field 'spinStreet'");
        t.edAddressLabel = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edAddressLabel, "field 'edAddressLabel'"), R.id.edAddressLabel, "field 'edAddressLabel'");
        t.edAddressDepiction = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edAddressDepiction, "field 'edAddressDepiction'"), R.id.edAddressDepiction, "field 'edAddressDepiction'");
        t.edDoorNumber = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edDoorNumber, "field 'edDoorNumber'"), R.id.edDoorNumber, "field 'edDoorNumber'");
        t.edBuildingNumber = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edBuildingNumber, "field 'edBuildingNumber'"), R.id.edBuildingNumber, "field 'edBuildingNumber'");
        t.edBuildingName = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edBuildingName, "field 'edBuildingName'"), R.id.edBuildingName, "field 'edBuildingName'");
        t.tvCityStar = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvCityStar, "field 'tvCityStar'"), R.id.tvCityStar, "field 'tvCityStar'");
        t.tvTownStar = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTownStar, "field 'tvTownStar'"), R.id.tvTownStar, "field 'tvTownStar'");
        t.tvDistrictStar = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvDistrictStar, "field 'tvDistrictStar'"), R.id.tvDistrictStar, "field 'tvDistrictStar'");
        t.tvStreetStar = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvStreetStar, "field 'tvStreetStar'"), R.id.tvStreetStar, "field 'tvStreetStar'");
        t.tvBuildingNameStar = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvBuildingNameStar, "field 'tvBuildingNameStar'"), R.id.tvBuildingNameStar, "field 'tvBuildingNameStar'");
        t.tvAddressDepictionStar = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAddressDepictionStar, "field 'tvAddressDepictionStar'"), R.id.tvAddressDepictionStar, "field 'tvAddressDepictionStar'");
        t.tvInfo = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvInfo, "field 'tvInfo'"), R.id.tvInfo, "field 'tvInfo'");
        ((View) finder.findRequiredView(obj, R.id.tvCreateAddress, "method 'clickFrameAddCurrentAddress'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickFrameAddCurrentAddress();
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
        t.edAddressDepiction = null;
        t.edDoorNumber = null;
        t.edBuildingNumber = null;
        t.edBuildingName = null;
        t.tvCityStar = null;
        t.tvTownStar = null;
        t.tvDistrictStar = null;
        t.tvStreetStar = null;
        t.tvBuildingNameStar = null;
        t.tvAddressDepictionStar = null;
        t.tvInfo = null;
    }
}
