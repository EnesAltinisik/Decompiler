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
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
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
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.model.data.ILCELER;
import com.pinarsu.siparis.model.data.ILCELER_PARENT;
import com.pinarsu.siparis.model.data.ILLER;
import com.pinarsu.siparis.model.data.ILLER_PARENT;
import com.pinarsu.siparis.model.data.MAHALLELER;
import com.pinarsu.siparis.model.data.MAHALLELER_PARENT;
import com.pinarsu.siparis.model.data.SOKAKLAR;
import com.pinarsu.siparis.model.data.SOKAKLAR_PARENT;
import com.pinarsu.siparis.tools.CustomComparator;
import com.pinarsu.siparis.tools.ToastHelper;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.view.EditText;
import com.pinarsu.siparis.view.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateAddressActivity extends BaseActivity implements IBackPressed, IDismissListener, IServiceResponse {
    String BAYI_NO = "";
    String MAHALLE_KODU = "";
    String checkedStreetCode;
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
    boolean isNewRecord = true;
    private OnItemSelectedListener onItemSelectedListener = new OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ServiceItem serviceItem;
            ServiceBase serviceBase;
            switch (adapterView.getId()) {
                case R.id.spinCity:
                    CreateAddressActivity.this.spinTown.setAdapter(null);
                    CreateAddressActivity.this.spinDistrict.setAdapter(null);
                    CreateAddressActivity.this.spinStreet.setAdapter(null);
                    serviceItem = new ServiceItem(REQUEST_TYPE.TOWN_LIST);
                    serviceItem.parameterList.add(new ServiceItemRequestParameter("ILKODU", ((ILLER) CreateAddressActivity.this.cityList.get(i)).ILKODU));
                    serviceBase = CreateAddressActivity.this.serviceBase;
                    serviceBase.getClass();
                    new Retrieve2(serviceItem, CreateAddressActivity.this).execute(new Void[0]);
                    return;
                case R.id.spinTown:
                    CreateAddressActivity.this.spinDistrict.setAdapter(null);
                    CreateAddressActivity.this.spinStreet.setAdapter(null);
                    if (i != 0) {
                        serviceItem = new ServiceItem(REQUEST_TYPE.DISTRICT_LIST);
                        serviceItem.parameterList.add(new ServiceItemRequestParameter("ILCEKODU", ((ILCELER) CreateAddressActivity.this.townList.get(i)).ILCE_KODU));
                        serviceBase = CreateAddressActivity.this.serviceBase;
                        serviceBase.getClass();
                        new Retrieve2(serviceItem, CreateAddressActivity.this).execute(new Void[0]);
                        return;
                    }
                    return;
                case R.id.spinDistrict:
                    CreateAddressActivity.this.spinStreet.setAdapter(null);
                    if (i != 0) {
                        serviceItem = new ServiceItem(REQUEST_TYPE.STREET_LIST);
                        serviceItem.parameterList.add(new ServiceItemRequestParameter("MAHALLE_KODU", ((MAHALLELER) CreateAddressActivity.this.districtList.get(i)).MAHALLE_KODU));
                        serviceBase = CreateAddressActivity.this.serviceBase;
                        serviceBase.getClass();
                        new Retrieve2(serviceItem, CreateAddressActivity.this).execute(new Void[0]);
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
    @InjectView(2131558599)
    TextView tvAddressDepictionStar;
    @InjectView(2131558593)
    TextView tvBuildingNameStar;
    @InjectView(2131558585)
    TextView tvCityStar;
    @InjectView(2131558589)
    TextView tvDistrictStar;
    @InjectView(2131558601)
    TextView tvInfo;
    @InjectView(2131558591)
    TextView tvStreetStar;
    @InjectView(2131558587)
    TextView tvTownStar;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity.setTitle((int) R.string.address_record);
        ButterKnife.inject((Activity) this);
        this.serviceBase = new ServiceBase(this);
        Tools.keyboardClose(this.activity, this.edAddressLabel);
        Bundle extras = getIntent().getExtras();
        if (extras.containsKey("phoneNumber")) {
            this.phoneNumber = extras.getString("phoneNumber");
        } else {
            this.phoneNumber = Preferences.PHONE_NUMBER;
        }
        this.isNewRecord = extras.getBoolean("isNewRecord");
        if (this.isNewRecord) {
            this.spinCity.setOnItemSelectedListener(this.onItemSelectedListener);
            this.spinTown.setOnItemSelectedListener(this.onItemSelectedListener);
            this.spinDistrict.setOnItemSelectedListener(this.onItemSelectedListener);
            this.spinCity.setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (CreateAddressActivity.this.cityList == null) {
                        CreateAddressActivity.this.getCityList();
                    }
                    return false;
                }
            });
            getCityList();
            return;
        }
        ADRES adres = (ADRES) extras.getSerializable("address");
        this.BAYI_NO = adres.BAYI_NO;
        this.MAHALLE_KODU = adres.MAHALLE_KODU;
        this.checkedStreetCode = adres.SOKAK_KODU;
        updateAddress(adres);
    }

    private void getCityList() {
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.CITY_LIST);
        ServiceBase serviceBase = this.serviceBase;
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
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
        if (serviceItem.type != REQUEST_TYPE.CREATE_ADDRESS && serviceItem.type != REQUEST_TYPE.UPDATE_ADDRESS) {
            return;
        }
        if (serviceItem.serviceErrorItem == null) {
            String str;
            if (this.isNewRecord) {
                str = "Adres başarıyla kaydedildi.";
            } else {
                str = "Adres başarıyla güncellendi.";
            }
            InfoCallAlertDialogFragment.show(this, str, this, 0);
            return;
        }
        InfoCallAlertDialogFragment.show(this, serviceItem.serviceErrorItem.detail);
    }

    public int getLayoutResource() {
        return R.layout.activity_create_address;
    }

    private void updateAddress(ADRES adres) {
        this.activity.setTitle((int) R.string.address_edit);
        this.tvBuildingNameStar.setVisibility(0);
        this.tvAddressDepictionStar.setVisibility(0);
        this.tvCityStar.setVisibility(4);
        this.tvTownStar.setVisibility(4);
        this.tvDistrictStar.setVisibility(4);
        this.tvStreetStar.setVisibility(4);
        this.tvInfo.setText("Adres güncelleme sırasında sadece (*) ile işaretli alanlar değişitirilebilir.");
        this.spinResource = R.layout.item_spinner_inactive;
        this.edAddressLabel.setText(adres.ADRES_ETIKETI);
        this.edAddressDepiction.setText(adres.TARIF);
        this.edBuildingName.setText(adres.APARTMAN_ADI);
        this.edBuildingNumber.setText(adres.BINA_NO);
        this.edDoorNumber.setText(adres.DAIRE_NO);
        this.cityList = new ArrayList();
        ILLER iller = new ILLER();
        iller.ILADI = adres.IL_ADI;
        iller.ILKODU = adres.IL_KODU;
        this.cityList.add(iller);
        setCitySpin();
        this.spinCity.setEnabled(false);
        this.townList = new ArrayList();
        ILCELER ilceler = new ILCELER();
        ilceler.IL_KODU = adres.IL_ADI;
        ilceler.ILCE_ADI = adres.ILCE_ADI;
        ilceler.ILCE_KODU = adres.ILCE_KODU;
        this.townList.add(ilceler);
        setTownSpin();
        this.spinTown.setEnabled(false);
        this.districtList = new ArrayList();
        MAHALLELER mahalleler = new MAHALLELER();
        mahalleler.ILCE_KODU = adres.ILCE_KODU;
        mahalleler.MAHALLE_ADI = adres.MAHALLE_ADI;
        mahalleler.MAHALLE_KODU = adres.MAHALLE_KODU;
        this.districtList.add(mahalleler);
        setDistrictSpin();
        this.spinDistrict.setEnabled(false);
        this.streetList = new ArrayList();
        SOKAKLAR sokaklar = new SOKAKLAR();
        sokaklar.MAHALLE_KODU = adres.MAHALLE_KODU;
        sokaklar.SOKAK_ADI = adres.SOKAK_ADI;
        sokaklar.SOKAK_KODU = adres.SOKAK_KODU;
        this.streetList.add(sokaklar);
        setStreetSpin();
        this.spinStreet.setEnabled(false);
    }

    @OnClick({2131558602})
    void clickFrameAddCurrentAddress() {
        String trim = this.edAddressLabel.getText().toString().trim();
        if (trim.isEmpty()) {
            new ToastHelper((Activity) this, "Adres Etiketi alanı boş bırakılamaz.").show();
            return;
        }
        if (this.isNewRecord) {
            if (this.spinCity.getSelectedItemPosition() == 0) {
                new ToastHelper((Activity) this, "İl seçiniz.").show();
                return;
            } else if (this.spinTown.getSelectedItemPosition() == 0) {
                new ToastHelper((Activity) this, "İlçe seçiniz.").show();
                return;
            } else if (this.spinDistrict.getSelectedItemPosition() == 0) {
                new ToastHelper((Activity) this, "Mahalle seçiniz.").show();
                return;
            } else if (this.spinStreet.getSelectedItemPosition() == 0) {
                new ToastHelper((Activity) this, "Sokak seçiniz.").show();
                return;
            }
        }
        String str = ((SOKAKLAR) this.spinStreet.getSelectedItem()).SOKAK_KODU;
        String trim2 = this.edBuildingNumber.getText().toString().trim();
        if (trim2.isEmpty()) {
            new ToastHelper((Activity) this, "Bina numarası belirtiniz.").show();
            return;
        }
        String trim3 = this.edDoorNumber.getText().toString().trim();
        if (trim3.isEmpty()) {
            new ToastHelper((Activity) this, "Daire numarası belirtiniz.").show();
            return;
        }
        ServiceItem serviceItem;
        String obj = this.edBuildingName.getText().toString();
        String obj2 = this.edAddressDepiction.getText().toString();
        if (this.isNewRecord) {
            serviceItem = new ServiceItem(REQUEST_TYPE.CREATE_ADDRESS);
        } else {
            serviceItem = new ServiceItem(REQUEST_TYPE.UPDATE_ADDRESS);
        }
        if (this.isNewRecord) {
            serviceItem.parameterList.add(new ServiceItemRequestParameter("ADRES_ETIKETI", trim));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("APARTMAN_ADI", obj));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("BINA_NO", trim2));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("DAIRE_NO", trim3));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("SOKAK_KODU", str));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TARIF", obj2));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", this.phoneNumber));
        } else {
            serviceItem.parameterList.add(new ServiceItemRequestParameter("ADRES_ETIKETI", trim));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("APARTMAN_ADI", obj));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("BAYI_NO", this.BAYI_NO));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("BINA_NO", trim2));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("DAIRE_NO", trim3));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TARIF", obj2));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", this.phoneNumber));
        }
        ServiceBase serviceBase = this.serviceBase;
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
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

    public void onBackPressed() {
        super.onBackPressed();
        if (LoginActivity.isCreateUser) {
            startActivity(new Intent(this, LoginActivity.class).putExtra("phoneNumber", this.phoneNumber));
        }
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
        if (this.isNewRecord) {
            Collections.sort(this.cityList, new CustomComparator("ILADI", "ILADI"));
            ILLER iller = new ILLER();
            iller.ILADI = "Seçiniz";
            this.cityList.add(0, iller);
        }
        setSpinGlob(this.cityList, this.spinCity);
    }

    private void setTownSpin() {
        if (this.isNewRecord) {
            Collections.sort(this.townList, new CustomComparator("ILCE_ADI", "ILCE_ADI"));
            ILCELER ilceler = new ILCELER();
            ilceler.ILCE_ADI = "Seçiniz";
            this.townList.add(0, ilceler);
        }
        setSpinGlob(this.townList, this.spinTown);
    }

    private void setDistrictSpin() {
        if (this.isNewRecord) {
            Collections.sort(this.districtList, new CustomComparator("MAHALLE_ADI", "MAHALLE_ADI"));
            MAHALLELER mahalleler = new MAHALLELER();
            mahalleler.MAHALLE_ADI = "Seçiniz";
            this.districtList.add(0, mahalleler);
        }
        setSpinGlob(this.districtList, this.spinDistrict);
    }

    private void setStreetSpin() {
        if (this.isNewRecord) {
            Collections.sort(this.streetList, new CustomComparator("SOKAK_ADI", "SOKAK_ADI"));
            SOKAKLAR sokaklar = new SOKAKLAR();
            sokaklar.SOKAK_ADI = "Seçiniz";
            this.streetList.add(0, sokaklar);
        }
        setSpinGlob(this.streetList, this.spinStreet);
    }
}
