package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceErrorItem;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.MUSTERI_ARAMA_ADRES;
import com.pinarsu.siparis.tools.ToastHelper;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.view.EditText;

public class LoginActivity extends AppCompatActivity implements IServiceResponse {
    public static boolean isCreateUser = false;
    @InjectView(2131558613)
    EditText edPhoneNumber;
    @InjectView(2131558745)
    ImageView imHome;
    @InjectView(2131558742)
    ImageView imLeftMenu;
    private String phoneNumber;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_login);
        ButterKnife.inject((Activity) this);
        this.imHome.setVisibility(0);
        this.imLeftMenu.setImageResource(R.drawable.side_bar_icon_inactive);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("homeNumber")) {
            this.edPhoneNumber.setText(extras.getString("homeNumber"));
        } else if (extras != null && extras.containsKey("phoneNumber")) {
            this.edPhoneNumber.setText(extras.getString("phoneNumber"));
        }
    }

    @OnClick({2131558614})
    void clickLogin() {
        this.phoneNumber = this.edPhoneNumber.getText().toString().trim();
        if (!this.phoneNumber.isEmpty()) {
            if (this.phoneNumber.length() != 10) {
                new ToastHelper((Activity) this, "Telefon numaranızı eksiksiz giriniz.").show();
            } else if (this.phoneNumber.startsWith("0")) {
                new ToastHelper((Activity) this, "Telefon numaranızı kontrol ediniz.").show();
            } else {
                Tools.keyboardClose(this, this.edPhoneNumber);
                ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.CUSTOMER_SEARCH);
                serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", this.phoneNumber));
                ServiceBase serviceBase = new ServiceBase(this);
                serviceBase.getClass();
                new Retrieve2(serviceItem, this).execute(new Void[0]);
            }
        }
    }

    public void onResponse(ServiceItem serviceItem) {
        isCreateUser = false;
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.phoneNumber);
        if (serviceItem.serviceErrorItem == null) {
            bundle.putSerializable("address", ((MUSTERI_ARAMA_ADRES) serviceItem.object).address);
            startActivity(new Intent(this, AddressCheckActivity.class).putExtras(bundle));
            finish();
        } else if (this.phoneNumber.startsWith("5")) {
            ServiceErrorItem serviceErrorItem = serviceItem.serviceErrorItem;
            if (serviceErrorItem.title == null || !serviceErrorItem.title.equals("MUSTERI_BULUNAMADI")) {
                InfoCallAlertDialogFragment.show(this, "" + serviceErrorItem.detail);
                return;
            }
            isCreateUser = true;
            startActivity(new Intent(this, SendVerificationCodeActivity.class).putExtras(bundle));
            finish();
        } else {
            InfoCallAlertDialogFragment.show(this, "Sayın müşterimiz uygulamamızı kullanmanız için cep telefonu numaranızı bildirmeniz gerekmektedir.");
        }
    }

    @OnClick({2131558745})
    void clickHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
