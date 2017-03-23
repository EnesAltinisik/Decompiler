package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class SSSActivity extends AppCompatActivity {
    @InjectView(2131558635)
    ImageView im1;
    @InjectView(2131558639)
    ImageView im2;
    @InjectView(2131558627)
    ImageView imBack;
    @InjectView(2131558742)
    ImageView imLeftMenu;
    @InjectView(2131558743)
    ImageView imLogo;
    private boolean isExpanded1;
    private boolean isExpanded2;
    @InjectView(2131558633)
    LinearLayout linearParent1;
    @InjectView(2131558637)
    LinearLayout linearParent2;
    @InjectView(2131558577)
    TextView tvTitle;
    @InjectView(2131558634)
    TextView tvTitle1;
    @InjectView(2131558638)
    TextView tvTitle2;
    @InjectView(2131558636)
    WebView webView1;
    @InjectView(2131558640)
    WebView webView2;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_sss);
        ButterKnife.inject((Activity) this);
        this.imLeftMenu.setVisibility(8);
        this.imLogo.setVisibility(8);
        this.imBack.setVisibility(0);
        this.tvTitle.setVisibility(0);
        this.tvTitle.setText(getString(R.string.sss));
        setWebView(this.webView1, "SSSSuKategorisi.html");
        setWebView(this.webView2, "SSSMadenSuyuKategorisi.html");
    }

    @OnClick({2131558627})
    void clickBack() {
        finish();
    }

    @OnClick({2131558633})
    public void onClick1(View view) {
        this.isExpanded1 = !this.isExpanded1;
        prepareWebView(true);
    }

    @OnClick({2131558637})
    public void onClick2(View view) {
        boolean z;
        if (this.isExpanded2) {
            z = false;
        } else {
            z = true;
        }
        this.isExpanded2 = z;
        prepareWebView(false);
    }

    private void prepareWebView(boolean z) {
        refresh();
        if (z) {
            this.isExpanded2 = false;
            if (this.isExpanded1) {
                this.webView1.setVisibility(0);
                this.im1.setImageResource(R.drawable.down_arrow);
                this.linearParent1.setBackgroundResource(17170443);
                this.tvTitle1.setTextColor(getResources().getColor(R.color.blue_dark));
                return;
            }
            return;
        }
        this.isExpanded1 = false;
        if (this.isExpanded2) {
            this.webView2.setVisibility(0);
            this.im2.setImageResource(R.drawable.down_arrow);
            this.linearParent2.setBackgroundResource(17170443);
            this.tvTitle2.setTextColor(getResources().getColor(R.color.blue_dark));
        }
    }

    private void refresh() {
        this.webView1.setVisibility(8);
        this.webView2.setVisibility(8);
        this.im1.setImageResource(R.drawable.right_arrow_white);
        this.im2.setImageResource(R.drawable.right_arrow_white);
        this.linearParent1.setBackgroundResource(R.color.blue_dark);
        this.linearParent2.setBackgroundResource(R.color.blue_dark);
        this.tvTitle1.setTextColor(getResources().getColor(17170443));
        this.tvTitle2.setTextColor(getResources().getColor(17170443));
    }

    private void setWebView(WebView webView, String str) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        webView.loadUrl("file:///android_asset/" + str);
        webView.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View view) {
                return true;
            }
        });
    }
}
