.class public Lcom/pinarsu/siparis/ui/activity/SSSActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "SSSActivity.java"


# instance fields
.field im1:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00eb
    .end annotation
.end field

.field im2:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ef
    .end annotation
.end field

.field imBack:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e3
    .end annotation
.end field

.field imLeftMenu:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0156
    .end annotation
.end field

.field imLogo:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0157
    .end annotation
.end field

.field private isExpanded1:Z

.field private isExpanded2:Z

.field linearParent1:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e9
    .end annotation
.end field

.field linearParent2:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ed
    .end annotation
.end field

.field tvTitle:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b1
    .end annotation
.end field

.field tvTitle1:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ea
    .end annotation
.end field

.field tvTitle2:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ee
    .end annotation
.end field

.field webView1:Landroid/webkit/WebView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ec
    .end annotation
.end field

.field webView2:Landroid/webkit/WebView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00f0
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private prepareWebView(Z)V
    .locals 5

    .prologue
    const v4, 0x7f0c000a

    const v3, 0x7f02009d

    const v2, 0x106000b

    const/4 v1, 0x0

    .line 93
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->refresh()V

    .line 94
    if-eqz p1, :cond_1

    .line 95
    iput-boolean v1, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->isExpanded2:Z

    .line 96
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->isExpanded1:Z

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView1:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 98
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->im1:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 99
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->linearParent1:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 100
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle1:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 111
    :cond_0
    :goto_0
    return-void

    .line 103
    :cond_1
    iput-boolean v1, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->isExpanded1:Z

    .line 104
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->isExpanded2:Z

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView2:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 106
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->im2:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 107
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->linearParent2:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 108
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle2:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    goto :goto_0
.end method

.method private refresh()V
    .locals 5

    .prologue
    const v4, 0x7f0c000a

    const v3, 0x7f0200eb

    const v2, 0x106000b

    const/16 v1, 0x8

    .line 115
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView1:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView2:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 117
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->im1:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 118
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->im2:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 119
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->linearParent1:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 120
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->linearParent2:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 121
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle1:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 122
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle2:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setTextColor(I)V

    .line 123
    return-void
.end method

.method private setWebView(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 127
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 128
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 130
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 131
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 132
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file:///android_asset/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 135
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/SSSActivity$1;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/ui/activity/SSSActivity$1;-><init>(Lcom/pinarsu/siparis/ui/activity/SSSActivity;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 141
    return-void
.end method


# virtual methods
.method clickBack()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00e3
        }
    .end annotation

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->finish()V

    .line 77
    return-void
.end method

.method public onClick1(Landroid/view/View;)V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00e9
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 81
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->isExpanded1:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->isExpanded1:Z

    .line 82
    invoke-direct {p0, v1}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->prepareWebView(Z)V

    .line 84
    return-void

    .line 81
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onClick2(Landroid/view/View;)V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00ed
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 88
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->isExpanded2:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->isExpanded2:Z

    .line 89
    invoke-direct {p0, v1}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->prepareWebView(Z)V

    .line 90
    return-void

    :cond_0
    move v0, v1

    .line 88
    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 58
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 60
    const v0, 0x7f03002b

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->setContentView(I)V

    .line 62
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 63
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imLeftMenu:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 64
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imLogo:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->imBack:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 66
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 67
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const v1, 0x7f0600ab

    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView1:Landroid/webkit/WebView;

    const-string v1, "SSSSuKategorisi.html"

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->setWebView(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->webView2:Landroid/webkit/WebView;

    const-string v1, "SSSMadenSuyuKategorisi.html"

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->setWebView(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 72
    return-void
.end method
