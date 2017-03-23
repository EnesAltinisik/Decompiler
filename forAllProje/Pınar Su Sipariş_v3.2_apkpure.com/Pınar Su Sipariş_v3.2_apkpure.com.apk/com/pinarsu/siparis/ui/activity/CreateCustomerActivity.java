package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.j;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IBackPressed;
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.ILCELER;
import com.pinarsu.siparis.model.data.ILCELER_PARENT;
import com.pinarsu.siparis.model.data.ILLER;
import com.pinarsu.siparis.model.data.ILLER_PARENT;
import com.pinarsu.siparis.model.data.MAHALLELER;
import com.pinarsu.siparis.model.data.MAHALLELER_PARENT;
import com.pinarsu.siparis.model.data.SOKAKLAR;
import com.pinarsu.siparis.model.data.SOKAKLAR_PARENT;
import com.pinarsu.siparis.tools.CustomComparator;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.view.EditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateCustomerActivity extends BaseActivity implements IBackPressed, IDismissListener, IServiceResponse {
    @InjectView(2131558605)
    CheckBox cBoxPrivacyAgreement;
    List<ILLER> cityList;
    List<MAHALLELER> districtList;
    @InjectView(2131558600)
    EditText edAddressDepiction;
    @InjectView(2131558584)
    EditText edAddressLabel;
    @InjectView(2131558594)
    EditText edBuildingName;
    @InjectView(2131558598)
    EditText edBuildingNumber;
    @InjectView(2131558596)
    EditText edDoorNumber;
    @InjectView(2131558603)
    EditText edFirstName;
    @InjectView(2131558604)
    EditText edLastName;
    @InjectView(2131558607)
    FrameLayout frameAddCurrentAddress;
    OnItemSelectedListener onItemSelectedListener = new OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ServiceItem serviceItem;
            ServiceBase serviceBase;
            switch (adapterView.getId()) {
                case R.id.spinCity:
                    CreateCustomerActivity.this.spinTown.setAdapter(null);
                    CreateCustomerActivity.this.spinDistrict.setAdapter(null);
                    CreateCustomerActivity.this.spinStreet.setAdapter(null);
                    serviceItem = new ServiceItem(REQUEST_TYPE.TOWN_LIST);
                    serviceItem.parameterList.add(new ServiceItemRequestParameter("ILKODU", ((ILLER) CreateCustomerActivity.this.cityList.get(i)).ILKODU));
                    serviceBase = CreateCustomerActivity.this.serviceBase;
                    serviceBase.getClass();
                    new Retrieve2(serviceItem, CreateCustomerActivity.this).execute(new Void[0]);
                    return;
                case R.id.spinTown:
                    CreateCustomerActivity.this.spinDistrict.setAdapter(null);
                    CreateCustomerActivity.this.spinStreet.setAdapter(null);
                    if (i != 0) {
                        serviceItem = new ServiceItem(REQUEST_TYPE.DISTRICT_LIST);
                        serviceItem.parameterList.add(new ServiceItemRequestParameter("ILCEKODU", ((ILCELER) CreateCustomerActivity.this.townList.get(i)).ILCE_KODU));
                        serviceBase = CreateCustomerActivity.this.serviceBase;
                        serviceBase.getClass();
                        new Retrieve2(serviceItem, CreateCustomerActivity.this).execute(new Void[0]);
                        return;
                    }
                    return;
                case R.id.spinDistrict:
                    CreateCustomerActivity.this.spinStreet.setAdapter(null);
                    if (i != 0) {
                        serviceItem = new ServiceItem(REQUEST_TYPE.STREET_LIST);
                        serviceItem.parameterList.add(new ServiceItemRequestParameter("MAHALLE_KODU", ((MAHALLELER) CreateCustomerActivity.this.districtList.get(i)).MAHALLE_KODU));
                        serviceBase = CreateCustomerActivity.this.serviceBase;
                        serviceBase.getClass();
                        new Retrieve2(serviceItem, CreateCustomerActivity.this).execute(new Void[0]);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    };
    String phoneNumber;
    @InjectView(2131558609)
    ProgressBar progressBar;
    ServiceBase serviceBase;
    @InjectView(2131558586)
    Spinner spinCity;
    @InjectView(2131558590)
    Spinner spinDistrict;
    int spinResource = R.layout.item_spinner_active;
    @InjectView(2131558592)
    Spinner spinStreet;
    @InjectView(2131558588)
    Spinner spinTown;
    List<SOKAKLAR> streetList;
    List<ILCELER> townList;
    @InjectView(2131558608)
    TextView tvAdd;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity.setTitle((int) R.string.record);
        Adjust.appWillOpenUrl(null);
        ButterKnife.inject((Activity) this);
        this.serviceBase = new ServiceBase(this);
        Tools.keyboardClose(this.activity, this.edAddressLabel);
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("phoneNumber")) {
            this.phoneNumber = Preferences.PHONE_NUMBER;
        } else {
            this.phoneNumber = extras.getString("phoneNumber");
        }
        this.spinCity.setOnItemSelectedListener(this.onItemSelectedListener);
        this.spinTown.setOnItemSelectedListener(this.onItemSelectedListener);
        this.spinDistrict.setOnItemSelectedListener(this.onItemSelectedListener);
        this.spinCity.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (CreateCustomerActivity.this.cityList == null) {
                    CreateCustomerActivity.this.getCityList();
                }
                return false;
            }
        });
        getCityList();
    }

    private void getCityList() {
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.CITY_LIST);
        ServiceBase serviceBase = this.serviceBase;
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (LoginActivity.isCreateUser) {
            startActivity(new Intent(this, LoginActivity.class).putExtra("phoneNumber", this.phoneNumber));
        }
    }

    public int getLayoutResource() {
        return R.layout.activity_create_customer;
    }

    @OnClick({2131558607})
    void clickFrameAddCurrentAddress() {
        String str;
        String trim = this.edAddressLabel.getText().toString().trim();
        String trim2 = this.edFirstName.getText().toString().trim();
        String trim3 = this.edLastName.getText().toString().trim();
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        if (this.spinCity.getAdapter() != null) {
            str = ((ILLER) this.spinCity.getSelectedItem()).ILKODU;
        } else {
            str = str2;
        }
        if (this.spinTown.getAdapter() != null) {
            str3 = ((ILCELER) this.spinTown.getSelectedItem()).ILCE_KODU;
        }
        if (this.spinDistrict.getAdapter() != null) {
            str4 = ((MAHALLELER) this.spinDistrict.getSelectedItem()).MAHALLE_KODU;
        }
        if (this.spinStreet.getAdapter() != null) {
            str2 = ((SOKAKLAR) this.spinStreet.getSelectedItem()).SOKAK_KODU;
        } else {
            str2 = str5;
        }
        String trim4 = this.edBuildingNumber.getText().toString().trim();
        String trim5 = this.edDoorNumber.getText().toString().trim();
        String trim6 = this.edBuildingName.getText().toString().trim();
        String trim7 = this.edAddressDepiction.getText().toString().trim();
        str5 = "";
        if (trim == null || trim.isEmpty()) {
            str5 = "Adres Etiketi alanı boş bırakılamaz.";
        } else if (trim2 == null || trim2.isEmpty()) {
            str5 = "Ad alanı boş bırakılamaz.";
        } else if (trim3 == null || trim3.isEmpty()) {
            str5 = "Soyad alanı boş bırakılamaz.";
        } else if (this.spinCity.getAdapter() == null || this.spinCity.getSelectedItemPosition() == 0) {
            str5 = "İl seçiniz.";
        } else if (this.spinTown.getAdapter() == null || this.spinTown.getSelectedItemPosition() == 0) {
            str5 = "İlçe seçiniz.";
        } else if (this.spinDistrict.getAdapter() == null || this.spinDistrict.getSelectedItemPosition() == 0) {
            str5 = "Mahalle seçiniz.";
        } else if (this.spinStreet.getAdapter() == null || this.spinStreet.getSelectedItemPosition() == 0) {
            str5 = "Sokak seçiniz.";
        } else if (trim5 == null || trim5.isEmpty()) {
            str5 = "Kapı No alanı boş bırakılamaz.";
        } else if (trim4 == null || trim4.isEmpty()) {
            str5 = "Bina No alanı boş bırakılamaz.";
        } else if (!this.cBoxPrivacyAgreement.isChecked()) {
            str5 = "Gizlilik Sözleşmesi'ni kabul ediniz.";
        }
        if (str5.isEmpty()) {
            ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.CREATE_CUSTOMER);
            serviceItem.parameterList.add(new ServiceItemRequestParameter("AD", trim2));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("ADRES_ETIKETI", trim));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("APARTMAN_ADI", trim6));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("BINA_NO", trim4));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("DAIRE_NO", trim5));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("ILCE_KODU", str3));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("IL_KODU", str));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("MAHALLE_KODU", str4));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("SOKAK_KODU", str2));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("SOYAD", trim3));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TARIF", trim7));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", this.phoneNumber));
            ServiceBase serviceBase = this.serviceBase;
            serviceBase.getClass();
            new Retrieve2(serviceItem, this).execute(new Void[0]);
            this.frameAddCurrentAddress.setEnabled(false);
            this.progressBar.setVisibility(0);
            return;
        }
        InfoCallAlertDialogFragment.show(this.activity, str5);
    }

    @OnClick({2131558606})
    void clickLinearPrivacyAgreement() {
        this.activity.startActivity(new Intent(this.activity, PrivacyAgreementActivity.class));
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.type == REQUEST_TYPE.CITY_LIST && serviceItem.serviceErrorItem == null) {
            this.cityList = ((ILLER_PARENT) serviceItem.object).list;
            setCitySpin();
        }
        if (serviceItem.type == REQUEST_TYPE.TOWN_LIST && serviceItem.serviceErrorItem == null) {
            this.townList = ((ILCELER_PARENT) serviceItem.object).list;
            setTownSpin();
        }
        if (serviceItem.type == REQUEST_TYPE.DISTRICT_LIST && serviceItem.serviceErrorItem == null) {
            this.districtList = ((MAHALLELER_PARENT) serviceItem.object).list;
            setDistrictSpin();
        }
        if (serviceItem.type == REQUEST_TYPE.STREET_LIST && serviceItem.serviceErrorItem == null) {
            this.streetList = ((SOKAKLAR_PARENT) serviceItem.object).list;
            setStreetSpin();
        }
        if (serviceItem.type == REQUEST_TYPE.CREATE_CUSTOMER) {
            this.frameAddCurrentAddress.setEnabled(true);
            this.progressBar.setVisibility(4);
            if (serviceItem.serviceErrorItem == null) {
                InfoCallAlertDialogFragment.show(this, "Başarıyla kaydedildi.", this, 0);
                Adjust.trackEvent(new AdjustEvent("kah9hn"));
                return;
            }
            InfoCallAlertDialogFragment.show(this.activity, serviceItem.serviceErrorItem.detail);
        }
    }

    public void onDismissListener(int i) {
        if (LoginActivity.isCreateUser) {
            LoginActivity.isCreateUser = false;
            Preferences.PHONE_NUMBER = this.phoneNumber;
            MyApplication.getInstance().getPreferences().save();
            startActivity(new Intent(this, MainActivity.class));
        } else {
            setResult(-1);
        }
        finish();
    }

    private void setSpinGlob(List<?> list, Spinner spinner) {
        SpinnerAdapter anonymousClass3 = new ArrayAdapter(this.activity, this.spinResource, new ArrayList(list)) {
            public boolean isEnabled(int i) {
                if (i == 0) {
                    return false;
                }
                return true;
            }

            public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                j jVar = (j) dropDownView;
                if (i == 0) {
                    jVar.setTextColor(-7829368);
                } else {
                    jVar.setTextColor(-16777216);
                }
                return dropDownView;
            }
        };
        anonymousClass3.setDropDownViewResource(17367049);
        spinner.setAdapter(anonymousClass3);
    }

    private void setCitySpin() {
        Collections.sort(this.cityList, new CustomComparator("ILADI", "ILADI"));
        ILLER iller = new ILLER();
        iller.ILADI = "Seçiniz";
        this.cityList.add(0, iller);
        setSpinGlob(this.cityList, this.spinCity);
    }

    private void setTownSpin() {
        Collections.sort(this.townList, new CustomComparator("ILCE_ADI", "ILCE_ADI"));
        ILCELER ilceler = new ILCELER();
        ilceler.ILCE_ADI = "Seçiniz";
        this.townList.add(0, ilceler);
        setSpinGlob(this.townList, this.spinTown);
    }

    private void setDistrictSpin() {
        Collections.sort(this.districtList, new CustomComparator("MAHALLE_ADI", "MAHALLE_ADI"));
        MAHALLELER mahalleler = new MAHALLELER();
        mahalleler.MAHALLE_ADI = "Seçiniz";
        this.districtList.add(0, mahalleler);
        setSpinGlob(this.districtList, this.spinDistrict);
    }

    private void setStreetSpin() {
        Collections.sort(this.streetList, new CustomComparator("SOKAK_ADI", "SOKAK_ADI"));
        SOKAKLAR sokaklar = new SOKAKLAR();
        sokaklar.SOKAK_ADI = "Seçiniz";
        this.streetList.add(0, sokaklar);
        setSpinGlob(this.streetList, this.spinStreet);
    }
}
