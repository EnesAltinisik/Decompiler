package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.ANKET_ARAMA_PARENT;

public class Order4Activity extends AppCompatActivity implements IServiceResponse {
    private String amount = "";
    ANKET_ARAMA_PARENT parent = null;
    @InjectView(2131558623)
    TextView tvAmount;
    @InjectView(2131558622)
    TextView tvMessage;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_order4);
        Adjust.appWillOpenUrl(null);
        ButterKnife.inject((Activity) this);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("amount")) {
            this.amount = extras.getString("amount");
        }
        if (this.amount.isEmpty()) {
            this.tvAmount.setVisibility(8);
        } else {
            this.tvAmount.setText(this.amount);
        }
        CharSequence string = extras.getString("BASARILI_SONUC_MESAJI");
        if (!(string == null || string.isEmpty())) {
            this.tvMessage.setText(string);
        }
        getSurveyList();
        Adjust.trackEvent(new AdjustEvent("7iv9kq"));
    }

    @OnClick({2131558624})
    void clickOk() {
        finishOrderStartSurvey();
    }

    public void onBackPressed() {
        finishOrderStartSurvey();
    }

    private void finishOrderStartSurvey() {
        if (!(this.parent == null || this.parent.list == null || this.parent.list.size() <= 0)) {
            startActivity(new Intent(this, SurveyPreviewActivity.class).putExtra("parent", this.parent));
        }
        finish();
    }

    private void getSurveyList() {
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.SURVEY_SEARCH);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
        ServiceBase serviceBase = new ServiceBase(this);
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem == null && serviceItem.object != null) {
            this.parent = (ANKET_ARAMA_PARENT) serviceItem.object;
        }
    }
}
