package com.pinarsu.siparis.ui.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.view.EditText;

@SuppressLint({"ParcelCreator"})
public class SendVerificationCodeActivity extends AppCompatActivity implements IServiceResponse {
    ADRES address;
    @InjectView(2131558613)
    EditText edPhoneNumber;
    String homeNumber = null;
    String phoneNumber;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_send_verification_code);
        ButterKnife.inject((Activity) this);
        Bundle extras = getIntent().getExtras();
        this.phoneNumber = extras.getString("phoneNumber");
        this.edPhoneNumber.setText(this.phoneNumber);
        this.address = (ADRES) extras.getSerializable("address");
        this.edPhoneNumber.setEnabled(false);
        this.edPhoneNumber.setTextColor(getResources().getColor(R.color.gray_dark));
        if (extras.containsKey("homeNumber")) {
            this.homeNumber = extras.getString("homeNumber");
        }
    }

    @OnClick({2131558627})
    void clickBack() {
        onBackPressed();
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.homeNumber == null || this.homeNumber.isEmpty()) {
            startActivity(new Intent(this, LoginActivity.class).putExtra("phoneNumber", this.phoneNumber));
        } else {
            startActivity(new Intent(this, LoginActivity.class).putExtra("homeNumber", this.homeNumber));
        }
    }

    @OnClick({2131558628})
    void clickBtnSendCode() {
        this.phoneNumber = this.edPhoneNumber.getText().toString();
        if (!this.phoneNumber.isEmpty() && this.phoneNumber.length() == 10) {
            ServiceBase serviceBase = new ServiceBase(this);
            ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.SEND_VERIFICATION_CODE);
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", this.phoneNumber));
            serviceBase.getClass();
            new Retrieve2(serviceItem, this).execute(new Void[0]);
            Tools.keyboardClose(this, this.edPhoneNumber);
        }
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem == null) {
            Bundle bundle = new Bundle();
            if (!(this.homeNumber == null || this.homeNumber.isEmpty())) {
                bundle.putString("homeNumber", this.homeNumber);
            }
            bundle.putString("phoneNumber", this.phoneNumber);
            bundle.putSerializable("address", this.address);
            startActivity(new Intent(this, SendVerificationLastStepActivity.class).putExtras(bundle));
            finish();
            return;
        }
        InfoCallAlertDialogFragment.show(this, serviceItem.serviceErrorItem.detail);
    }
}
