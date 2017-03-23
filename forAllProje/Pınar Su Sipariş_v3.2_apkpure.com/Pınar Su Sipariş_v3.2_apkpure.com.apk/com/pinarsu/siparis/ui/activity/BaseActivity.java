package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.interfaces.IActivityResult;
import com.pinarsu.siparis.view.TextView;

public abstract class BaseActivity extends AppCompatActivity {
    public static int REQUEST_TYPE = 999;
    public BaseActivity activity;
    @InjectView(2131558627)
    ImageView imBack;
    @InjectView(2131558742)
    ImageView imLeftMenu;
    @InjectView(2131558743)
    ImageView imLogo;
    @InjectView(2131558746)
    ImageView imRightMenu;
    public MyApplication myApplication;
    IActivityResult onActivityResultDelegate;
    public Resources resources;
    @InjectView(2131558568)
    Toolbar toolbar;
    @InjectView(2131558577)
    TextView tvTitle;

    public abstract int getLayoutResource();

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutResource());
        ButterKnife.inject((Activity) this);
        this.imLogo.setVisibility(4);
        this.imLeftMenu.setVisibility(4);
        this.imBack.setVisibility(0);
        this.imRightMenu.setVisibility(4);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        this.activity = this;
        this.resources = this.activity.getResources();
        this.myApplication = MyApplication.getInstance();
    }

    public void setTitle(int i) {
        if (i != 0) {
            this.tvTitle.setVisibility(0);
            this.tvTitle.setText(getString(i));
            return;
        }
        this.tvTitle.setVisibility(4);
        this.tvTitle.setText("");
    }

    public void setTitle(String str) {
        if (str.isEmpty()) {
            this.tvTitle.setVisibility(4);
            this.tvTitle.setText("");
            return;
        }
        this.tvTitle.setVisibility(0);
        this.tvTitle.setText(str);
    }

    @OnClick({2131558627})
    void clickBack() {
        onBackPressed();
    }

    public void setOnActivityResultDelegate(IActivityResult iActivityResult) {
        this.onActivityResultDelegate = iActivityResult;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.onActivityResultDelegate == null) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.onActivityResultDelegate.onActivityResult(intent);
            this.onActivityResultDelegate = null;
        }
    }
}
