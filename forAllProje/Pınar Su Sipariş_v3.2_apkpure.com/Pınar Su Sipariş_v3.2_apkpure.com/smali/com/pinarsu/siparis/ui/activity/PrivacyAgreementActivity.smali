.class public Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "PrivacyAgreementActivity.java"


# instance fields
.field webView:Landroid/webkit/WebView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e1
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private setWebView()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 39
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 40
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 42
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 43
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 44
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 45
    const/16 v1, 0x50

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 47
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$1;-><init>(Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 52
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$2;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$2;-><init>(Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 57
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->webView:Landroid/webkit/WebView;

    const-string v1, "file:///android_asset/privacy_agreement.html"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 59
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 30
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    const v0, 0x7f030026

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->setContentView(I)V

    .line 33
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 34
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->setWebView()V

    .line 35
    return-void
.end method
