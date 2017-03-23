package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnItemClick;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.AllAddressAdapter;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IBackPressed;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.model.data.ADRESLER_PARENT;
import com.pinarsu.siparis.tools.ToastHelper;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.ui.fragment.YesOrNoFragment;
import java.io.Serializable;
import java.util.List;

public class AllAddressActivity extends AppCompatActivity implements IBackPressed, IDelegateOneObjectLister, IServiceResponse {
    private List<ADRES> addressList;
    @InjectView(2131558582)
    FrameLayout frameAdd;
    private boolean isFromHome;
    @InjectView(2131558581)
    ListView lv;
    private int selectedItem;
    private ServiceBase serviceBase;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_all_address);
        setTitle(R.string.address_record);
        ButterKnife.inject((Activity) this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("isFromHome")) {
            this.isFromHome = false;
        } else {
            this.isFromHome = extras.getBoolean("isFromHome");
        }
        this.serviceBase = new ServiceBase(this);
        getAllAdress();
    }

    private void getAllAdress() {
        Log.d("MNTTAG", "SERVICE E CIKTI");
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.ALL_ADDRESS);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
        ServiceBase serviceBase = this.serviceBase;
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem != null) {
            InfoCallAlertDialogFragment.show(this, serviceItem.serviceErrorItem.detail);
        } else if (serviceItem.type != REQUEST_TYPE.ALL_ADDRESS) {
            new ToastHelper((Activity) this, "Adres başarıyla silindi.").show();
            getAllAdress();
        } else if (serviceItem.object != null) {
            this.addressList = ((ADRESLER_PARENT) serviceItem.object).list;
            setView();
        }
    }

    private void setView() {
        this.lv.setAdapter(new AllAddressAdapter(this, this.addressList, this));
    }

    @OnItemClick({2131558581})
    void onItemClick(int i) {
        if (this.isFromHome) {
            Intent intent = new Intent();
            intent.putExtra("address", (Serializable) this.addressList.get(i));
            setResult(-1, intent);
            finish();
        }
    }

    @OnClick({2131558582})
    void clickFrameAdd() {
        startActivityForResult(new Intent(this, CreateAddressActivity.class).putExtra("phoneNumber", Preferences.PHONE_NUMBER).putExtra("isNewRecord", true), 666);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            getAllAdress();
        }
    }

    public void onObject(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof View) {
                View view = (View) obj;
                int intValue = ((Integer) view.getTag()).intValue();
                Log.d("MNTTAG", "onClickListener position : " + intValue);
                this.selectedItem = intValue;
                if (view.getId() == R.id.imEdit) {
                    Intent intent = new Intent(this, CreateAddressActivity.class);
                    intent.putExtra("isNewRecord", false);
                    intent.putExtra("address", (Serializable) this.addressList.get(this.selectedItem));
                    startActivityForResult(intent, 777);
                    return;
                }
                String str = ((ADRES) this.addressList.get(intValue)).ADRES_ETIKETI;
                if (str != null && str.isEmpty()) {
                    str = ((ADRES) this.addressList.get(intValue)).getAddress();
                }
                YesOrNoFragment.show(this, this, "Silmek istediğinizden emin misiniz?", str);
            } else if (obj instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Log.d("MNTTAG", "" + booleanValue);
                if (booleanValue) {
                    ADRES adres = (ADRES) this.addressList.get(this.selectedItem);
                    ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.DELETE_ADDRESS);
                    serviceItem.parameterList.add(new ServiceItemRequestParameter("BAYI_NO", adres.BAYI_NO));
                    serviceItem.parameterList.add(new ServiceItemRequestParameter("SOKAK_KODU", adres.SOKAK_KODU));
                    serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
                    ServiceBase serviceBase = this.serviceBase;
                    serviceBase.getClass();
                    new Retrieve2(serviceItem, this).execute(new Void[0]);
                }
            }
        }
    }
}
