.class public Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "PrivacyAgreementActivity$$ViewInjector.java"

# interfaces
.implements Lbutterknife/ButterKnife$Injector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;",
        ">",
        "Ljava/lang/Object;",
        "Lbutterknife/ButterKnife$Injector",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbutterknife/ButterKnife$Finder;",
            "TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    const v2, 0x7f0d00e1

    .line 11
    const-string v0, "field \'webView\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 12
    const-string v1, "field \'webView\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->webView:Landroid/webkit/WebView;

    .line 13
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 16
    const/4 v0, 0x0

    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;->webView:Landroid/webkit/WebView;

    .line 17
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 8
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;)V

    return-void
.end method
