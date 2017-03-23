package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IBackPressed;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.ui.fragment.EditTextDialogFragment;

public class AddressCheckActivity extends AppCompatActivity implements IBackPressed, IDelegateOneObjectLister {
    ADRES address;
    String homeNumber = null;
    String phoneNumber;
    @InjectView(2131558578)
    TextView tvAddress;
    @InjectView(2131558576)
    TextView tvFoundRecord;
    @InjectView(2131558577)
    TextView tvTitle;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_address_check);
        ButterKnife.inject((Activity) this);
        Bundle extras = getIntent().getExtras();
        this.address = (ADRES) extras.getSerializable("address");
        this.phoneNumber = extras.getString("phoneNumber");
        if (this.address != null) {
            this.tvFoundRecord.setText("1 " + getResources().getString(R.string.find_record));
            CharSequence charSequence = "";
            if (!(this.address.AD == null || this.address.AD.isEmpty())) {
                charSequence = this.address.AD;
            }
            if (!(this.address.SOYADI == null || this.address.SOYADI.isEmpty())) {
                charSequence = charSequence + " " + this.address.SOYADI;
            }
            this.tvTitle.setText(charSequence);
            if (this.address.ADRES != null && !this.address.ADRES.isEmpty()) {
                this.tvAddress.setText(this.address.ADRES);
            }
        }
    }

    @OnClick({2131558579})
    void clickFalse() {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.phoneNumber);
        startActivity(new Intent(this, LoginActivity.class).putExtras(bundle));
        finish();
    }

    @OnClick({2131558580})
    void clickTrue() {
        if (this.phoneNumber.startsWith("5")) {
            sendVerificationCode();
        } else {
            EditTextDialogFragment.newInstance(this).show(this);
        }
    }

    private void sendVerificationCode() {
        Bundle bundle = new Bundle();
        if (!(this.homeNumber == null || this.homeNumber.isEmpty())) {
            bundle.putString("homeNumber", this.homeNumber);
        }
        bundle.putString("phoneNumber", this.phoneNumber);
        bundle.putSerializable("address", this.address);
        startActivity(new Intent(this, SendVerificationCodeActivity.class).putExtras(bundle));
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        clickFalse();
    }

    public void onObject(Object obj, int i) {
        if (obj != null) {
            this.homeNumber = this.phoneNumber;
            this.phoneNumber = (String) obj;
            sendVerificationCode();
        }
    }
}
