.class public Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "SendVerificationCodeActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field address:Lcom/pinarsu/siparis/model/data/ADRES;

.field edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00d5
    .end annotation
.end field

.field homeNumber:Ljava/lang/String;

.field phoneNumber:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->homeNumber:Ljava/lang/String;

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
    .line 61
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->onBackPressed()V

    .line 62
    return-void
.end method

.method clickBtnSendCode()V
    .locals 6
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00e4
        }
    .end annotation

    .prologue
    .line 75
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->phoneNumber:Ljava/lang/String;

    .line 76
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    .line 85
    :cond_0
    :goto_0
    return-void

    .line 79
    :cond_1
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 80
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SEND_VERIFICATION_CODE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v1, v2}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 82
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "TELEFON_NO"

    iget-object v5, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->phoneNumber:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v2, v0, v1, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 84
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/tools/Tools;->keyboardClose(Landroid/app/Activity;Lcom/pinarsu/siparis/view/EditText;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 66
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    .line 67
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->homeNumber:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "homeNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 71
    :goto_0
    return-void

    .line 70
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 43
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    const v0, 0x7f030029

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->setContentView(I)V

    .line 46
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 48
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 49
    const-string v0, "phoneNumber"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->phoneNumber:Ljava/lang/String;

    .line 50
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 51
    const-string v0, "address"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 52
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/EditText;->setEnabled(Z)V

    .line 53
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c003a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/EditText;->setTextColor(I)V

    .line 55
    const-string v0, "homeNumber"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    const-string v0, "homeNumber"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->homeNumber:Ljava/lang/String;

    .line 57
    :cond_0
    return-void
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 3

    .prologue
    .line 90
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_1

    .line 91
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 92
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->homeNumber:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 93
    const-string v1, "homeNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    :cond_0
    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v1, "address"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 96
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 97
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->finish()V

    .line 101
    :goto_0
    return-void

    .line 99
    :cond_1
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method
