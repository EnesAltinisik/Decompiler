.class public Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "AddressCheckActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IBackPressed;
.implements Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;


# instance fields
.field address:Lcom/pinarsu/siparis/model/data/ADRES;

.field homeNumber:Ljava/lang/String;

.field phoneNumber:Ljava/lang/String;

.field tvAddress:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b2
    .end annotation
.end field

.field tvFoundRecord:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b0
    .end annotation
.end field

.field tvTitle:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b1
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->homeNumber:Ljava/lang/String;

    .line 33
    return-void
.end method

.method private sendVerificationCode()V
    .locals 3

    .prologue
    .line 90
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 91
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->homeNumber:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 92
    const-string v1, "homeNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->homeNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :cond_0
    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v1, "address"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 95
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->startActivity(Landroid/content/Intent;)V

    .line 96
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->finish()V

    .line 97
    return-void
.end method


# virtual methods
.method clickFalse()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00b3
        }
    .end annotation

    .prologue
    .line 73
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 74
    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/LoginActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->startActivity(Landroid/content/Intent;)V

    .line 76
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->finish()V

    .line 77
    return-void
.end method

.method clickTrue()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00b4
        }
    .end annotation

    .prologue
    .line 81
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->phoneNumber:Ljava/lang/String;

    const-string v1, "5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->sendVerificationCode()V

    .line 87
    :goto_0
    return-void

    .line 84
    :cond_0
    invoke-static {p0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->newInstance(Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;)Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/ui/fragment/EditTextDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 101
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    .line 102
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->clickFalse()V

    .line 103
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 49
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    const v0, 0x7f03001a

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->setContentView(I)V

    .line 52
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 53
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 54
    const-string v0, "address"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 55
    const-string v0, "phoneNumber"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->phoneNumber:Ljava/lang/String;

    .line 56
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    if-eqz v0, :cond_2

    .line 57
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->tvFoundRecord:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "1 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060077

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    const-string v0, ""

    .line 60
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->AD:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->AD:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 61
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->AD:Ljava/lang/String;

    .line 62
    :cond_0
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->SOYADI:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->SOYADI:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->SOYADI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 64
    :cond_1
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 67
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->tvAddress:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    :cond_2
    return-void
.end method

.method public onObject(Ljava/lang/Object;I)V
    .locals 1

    .prologue
    .line 107
    if-eqz p1, :cond_0

    .line 108
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->phoneNumber:Ljava/lang/String;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->homeNumber:Ljava/lang/String;

    .line 109
    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->phoneNumber:Ljava/lang/String;

    .line 110
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;->sendVerificationCode()V

    .line 112
    :cond_0
    return-void
.end method
