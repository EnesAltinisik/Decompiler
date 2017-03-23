package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
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
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.tools.ToastHelper;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;

public class MatchSuccessActivity extends AppCompatActivity implements IDismissListener, IServiceResponse {
    private static final long TOTAL_TIME = 2000;
    ADRES address;
    private CountDownTimer countDownTimer = new CountDownTimer(TOTAL_TIME, 1000) {
        public void onTick(long j) {
            Log.d("MNTTAG", "Kalan süre : " + j);
        }

        public void onFinish() {
            MatchSuccessActivity.this.clickImMatchSuccess();
        }
    };
    String homeNumber = null;
    @InjectView(2131558742)
    ImageView imLeftMenu;
    @InjectView(2131558621)
    ImageView imMatchSuccess;
    String phoneNumber;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_match_success);
        Adjust.appWillOpenUrl(null);
        ButterKnife.inject((Activity) this);
        this.imLeftMenu.setImageResource(R.drawable.side_bar_icon_inactive);
        Bundle extras = getIntent().getExtras();
        this.address = (ADRES) extras.getSerializable("address");
        this.phoneNumber = extras.getString("phoneNumber");
        if (extras.containsKey("homeNumber")) {
            this.homeNumber = extras.getString("homeNumber");
        }
        if (this.homeNumber == null || this.homeNumber.isEmpty()) {
            this.countDownTimer.start();
            return;
        }
        this.imMatchSuccess.setVisibility(4);
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.UPDATE_CUSTOMER_PHONE);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", this.homeNumber));
        serviceItem.parameterList.add(new ServiceItemRequestParameter("YENI_TELEFON_NO", this.phoneNumber));
        ServiceBase serviceBase = new ServiceBase(this);
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem == null) {
            this.imMatchSuccess.setVisibility(0);
            new ToastHelper((Activity) this, "Telefon numaranız güncellendi.").show();
            this.countDownTimer.start();
            return;
        }
        InfoCallAlertDialogFragment.show(this, serviceItem.serviceErrorItem.detail, this, 0);
    }

    public void onBackPressed() {
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.countDownTimer != null) {
            this.countDownTimer.cancel();
        }
    }

    @OnClick({2131558621})
    void clickImMatchSuccess() {
        if (this.countDownTimer != null) {
            this.countDownTimer.cancel();
        }
        if (LoginActivity.isCreateUser) {
            Bundle bundle = new Bundle();
            bundle.putString("phoneNumber", this.phoneNumber);
            startActivity(new Intent(this, CreateCustomerActivity.class).putExtras(bundle).addFlags(67108864));
        } else {
            Preferences.ADDRESS = this.address;
            Preferences.PHONE_NUMBER = this.phoneNumber;
            Preferences.PUSH_TOKEN = "";
            MyApplication.getInstance().getPreferences().save();
            startActivity(new Intent(this, MainActivity.class).addFlags(67108864));
            Adjust.trackEvent(new AdjustEvent("uyx96w"));
        }
        finish();
    }

    public void onDismissListener(int i) {
        Intent intent = new Intent(this, SendVerificationCodeActivity.class);
        intent.putExtra("address", this.address);
        intent.putExtra("phoneNumber", this.phoneNumber);
        intent.putExtra("homeNumber", this.homeNumber);
        startActivity(intent);
        finish();
    }
}
