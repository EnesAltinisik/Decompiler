.class public Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "MatchSuccessActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IDismissListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# static fields
.field private static final TOTAL_TIME:J = 0x7d0L


# instance fields
.field address:Lcom/pinarsu/siparis/model/data/ADRES;

.field private countDownTimer:Landroid/os/CountDownTimer;

.field homeNumber:Ljava/lang/String;

.field imLeftMenu:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0156
    .end annotation
.end field

.field imMatchSuccess:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00dd
    .end annotation
.end field

.field phoneNumber:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->homeNumber:Ljava/lang/String;

    .line 125
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity$1;

    const-wide/16 v2, 0x7d0

    const-wide/16 v4, 0x3e8

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity$1;-><init>(Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;JJ)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->countDownTimer:Landroid/os/CountDownTimer;

    return-void
.end method


# virtual methods
.method clickImMatchSuccess()V
    .locals 4
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00dd
        }
    .end annotation

    .prologue
    const/high16 v3, 0x4000000

    .line 104
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->countDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->countDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 107
    :cond_0
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    if-eqz v0, :cond_1

    .line 108
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 109
    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->startActivity(Landroid/content/Intent;)V

    .line 122
    :goto_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->finish()V

    .line 123
    return-void

    .line 114
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 115
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->phoneNumber:Ljava/lang/String;

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    .line 116
    const-string v0, ""

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PUSH_TOKEN:Ljava/lang/String;

    .line 117
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 118
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->startActivity(Landroid/content/Intent;)V

    .line 119
    new-instance v0, Lcom/adjust/sdk/AdjustEvent;

    const-string v1, "uyx96w"

    invoke-direct {v0, v1}, Lcom/adjust/sdk/AdjustEvent;-><init>(Ljava/lang/String;)V

    .line 120
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->trackEvent(Lcom/adjust/sdk/AdjustEvent;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 92
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 55
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 57
    const v0, 0x7f030023

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->setContentView(I)V

    .line 60
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->appWillOpenUrl(Landroid/net/Uri;)V

    .line 61
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 62
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->imLeftMenu:Landroid/widget/ImageView;

    const v1, 0x7f0200ee

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 63
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 64
    const-string v0, "address"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 65
    const-string v0, "phoneNumber"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->phoneNumber:Ljava/lang/String;

    .line 66
    const-string v0, "homeNumber"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    const-string v0, "homeNumber"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->homeNumber:Ljava/lang/String;

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->homeNumber:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->imMatchSuccess:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 70
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->UPDATE_CUSTOMER_PHONE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 71
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->homeNumber:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "YENI_TELEFON_NO"

    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->phoneNumber:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 74
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v2, v1, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 77
    :goto_0
    return-void

    .line 76
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->countDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 98
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 99
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->countDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->countDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 100
    :cond_0
    return-void
.end method

.method public onDismissListener(I)V
    .locals 3

    .prologue
    .line 139
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    const-string v1, "address"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 141
    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    const-string v1, "homeNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->startActivity(Landroid/content/Intent;)V

    .line 144
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->finish()V

    .line 145
    return-void
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 81
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->imMatchSuccess:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 83
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Telefon numaran\u0131z g\u00fcncellendi."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 84
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->countDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 88
    :goto_0
    return-void

    .line 86
    :cond_0
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {p0, v0, p0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V

    goto :goto_0
.end method
