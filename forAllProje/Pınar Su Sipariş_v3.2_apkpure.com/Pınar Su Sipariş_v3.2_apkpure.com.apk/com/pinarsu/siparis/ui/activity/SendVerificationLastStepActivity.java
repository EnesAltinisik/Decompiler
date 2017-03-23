package com.pinarsu.siparis.ui.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.view.EditText;
import com.pinarsu.siparis.view.TextView;

@SuppressLint({"ParcelCreator"})
public class SendVerificationLastStepActivity extends AppCompatActivity implements IDismissListener, IServiceResponse {
    final int SECOND_REMAINING = 180;
    int TOTAL_SECOND_REMAINING = 180000;
    float X;
    ADRES address;
    @InjectView(2131558624)
    Button btnOk;
    private CountDownTimer countDownTimer = new CountDownTimer((long) this.TOTAL_SECOND_REMAINING, 1000) {
        public void onTick(long j) {
            Log.v("Log_tag", "Tick of Progress : " + j);
            SendVerificationLastStepActivity.this.timerProgressbar.setProgress(SendVerificationLastStepActivity.this.remaningTime);
            SendVerificationLastStepActivity.this.tvTimer.setText(SendVerificationLastStepActivity.this.remaningTime + "sn");
            SendVerificationLastStepActivity.this.X = SendVerificationLastStepActivity.this.linearTimer.getX();
            SendVerificationLastStepActivity.this.X -= SendVerificationLastStepActivity.this.progressAPieceWidth;
            if (SendVerificationLastStepActivity.this.X > 0.0f) {
                SendVerificationLastStepActivity.this.linearTimer.setX(SendVerificationLastStepActivity.this.X);
            }
            Log.d("MNTTAG", "linearTimer X : " + SendVerificationLastStepActivity.this.X);
            SendVerificationLastStepActivity sendVerificationLastStepActivity = SendVerificationLastStepActivity.this;
            sendVerificationLastStepActivity.remaningTime--;
        }

        public void onFinish() {
            SendVerificationLastStepActivity sendVerificationLastStepActivity = SendVerificationLastStepActivity.this;
            sendVerificationLastStepActivity.remaningTime--;
            SendVerificationLastStepActivity.this.timerProgressbar.setProgress(SendVerificationLastStepActivity.this.remaningTime);
            SendVerificationLastStepActivity.this.tvTimer.setText(SendVerificationLastStepActivity.this.remaningTime + "sn");
            InfoCallAlertDialogFragment.show(SendVerificationLastStepActivity.this, "Zaman Aşımı\nLütfen tekrar deneyiniz", SendVerificationLastStepActivity.this, 0);
        }
    };
    @InjectView(2131558629)
    EditText edVerificationCode;
    String homeNumber = null;
    @InjectView(2131558631)
    LinearLayout linearTimer;
    String phoneNumber;
    float progressAPieceWidth;
    int progressBarWidth;
    int remaningTime;
    @InjectView(2131558630)
    ProgressBar timerProgressbar;
    @InjectView(2131558632)
    TextView tvTimer;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_send_verification_last_step);
        ButterKnife.inject((Activity) this);
        Bundle extras = getIntent().getExtras();
        this.phoneNumber = extras.getString("phoneNumber");
        if (extras.containsKey("homeNumber")) {
            this.homeNumber = extras.getString("homeNumber");
        }
        this.address = (ADRES) extras.getSerializable("address");
        this.timerProgressbar.setProgress(180);
        this.linearTimer.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (view.getX() > 0.0f) {
                    SendVerificationLastStepActivity.this.linearTimer.removeOnLayoutChangeListener(this);
                    SendVerificationLastStepActivity.this.progressBarWidth = SendVerificationLastStepActivity.this.timerProgressbar.getWidth();
                    SendVerificationLastStepActivity.this.progressAPieceWidth = ((float) SendVerificationLastStepActivity.this.progressBarWidth) / BitmapDescriptorFactory.HUE_CYAN;
                    SendVerificationLastStepActivity.this.remaningTime = 180;
                    SendVerificationLastStepActivity.this.countDownTimer.start();
                }
                Log.d("MNTTAG", "v.getX() : " + view.getX());
            }
        });
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.countDownTimer != null) {
            this.countDownTimer.cancel();
        }
    }

    @OnClick({2131558624})
    void clickOk() {
        String obj = this.edVerificationCode.getText().toString();
        if (!obj.isEmpty()) {
            this.btnOk.setEnabled(false);
            ServiceBase serviceBase = new ServiceBase(this);
            ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.VERY_VERIFICATION_CODE);
            serviceItem.parameterList.add(new ServiceItemRequestParameter("DOGRULAMA_KODU", obj));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", this.phoneNumber));
            serviceBase.getClass();
            new Retrieve2(serviceItem, this).execute(new Void[0]);
            Tools.keyboardClose(this, this.edVerificationCode);
        }
    }

    public void onResponse(ServiceItem serviceItem) {
        this.btnOk.setEnabled(true);
        if (serviceItem.serviceErrorItem == null) {
            if (this.countDownTimer != null) {
                this.countDownTimer.cancel();
            }
            Bundle bundle = new Bundle();
            if (!(this.homeNumber == null || this.homeNumber.isEmpty())) {
                bundle.putString("homeNumber", this.homeNumber);
            }
            bundle.putString("phoneNumber", this.phoneNumber);
            bundle.putSerializable("address", this.address);
            startActivity(new Intent(this, MatchSuccessActivity.class).putExtras(bundle));
            finish();
            return;
        }
        InfoCallAlertDialogFragment.show(this, serviceItem.serviceErrorItem.detail);
    }

    public void onDismissListener(int i) {
        finishActivityBack();
    }

    public void onBackPressed() {
        super.onBackPressed();
        finishActivityBack();
    }

    @OnClick({2131558627})
    void clickBack() {
        finishActivityBack();
    }

    void finishActivityBack() {
        finish();
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.phoneNumber);
        bundle.putSerializable("address", this.address);
        startActivity(new Intent(this, SendVerificationCodeActivity.class).putExtras(bundle));
    }
}
