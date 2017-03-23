package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.pinarsu.siparis.R;

public class PrivacyAgreementActivity extends AppCompatActivity {
    @InjectView(2131558625)
    WebView webView;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_privacy_agreement);
        ButterKnife.inject((Activity) this);
        setWebView();
    }

    private void setWebView() {
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(80);
        this.webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView webView, int i) {
                PrivacyAgreementActivity.this.setProgress(i * 1000);
            }
        });
        this.webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                Toast.makeText(PrivacyAgreementActivity.this, "Hata! " + str, 0).show();
            }
        });
        this.webView.loadUrl("file:///android_asset/privacy_agreement.html");
    }
}
