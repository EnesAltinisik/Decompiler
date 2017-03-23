.class Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$1;
.super Landroid/webkit/WebChromeClient;
.source "PrivacyAgreementActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->setWebView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;

    mul-int/lit16 v1, p2, 0x3e8

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->setProgress(I)V

    .line 50
    return-void
.end method
