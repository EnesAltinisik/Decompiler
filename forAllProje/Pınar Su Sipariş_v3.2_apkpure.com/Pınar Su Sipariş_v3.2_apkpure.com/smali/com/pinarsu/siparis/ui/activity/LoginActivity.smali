.class public Lcom/pinarsu/siparis/ui/activity/LoginActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "LoginActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# static fields
.field public static isCreateUser:Z


# instance fields
.field edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00d5
    .end annotation
.end field

.field imHome:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0159
    .end annotation
.end field

.field imLeftMenu:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0156
    .end annotation
.end field

.field private phoneNumber:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    sput-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method clickHome()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0159
        }
    .end annotation

    .prologue
    .line 121
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->startActivity(Landroid/content/Intent;)V

    .line 122
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->finish()V

    .line 123
    return-void
.end method

.method clickLogin()V
    .locals 5
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00d6
        }
    .end annotation

    .prologue
    .line 65
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->phoneNumber:Ljava/lang/String;

    .line 66
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    .line 68
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Telefon numaran\u0131z\u0131 eksiksiz giriniz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 84
    :cond_0
    :goto_0
    return-void

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->phoneNumber:Ljava/lang/String;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Telefon numaran\u0131z\u0131 kontrol ediniz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0

    .line 76
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/tools/Tools;->keyboardClose(Landroid/app/Activity;Lcom/pinarsu/siparis/view/EditText;)V

    .line 78
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CUSTOMER_SEARCH:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 79
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->phoneNumber:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 81
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v2, v1, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 47
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 49
    const v0, 0x7f030021

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->setContentView(I)V

    .line 50
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 53
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->imHome:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 54
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->imLeftMenu:Landroid/widget/ImageView;

    const v1, 0x7f0200ee

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 55
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 56
    if-eqz v0, :cond_1

    const-string v1, "homeNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 57
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    const-string v2, "homeNumber"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/view/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 61
    :cond_0
    :goto_0
    return-void

    .line 58
    :cond_1
    if-eqz v0, :cond_0

    const-string v1, "phoneNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 59
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->edPhoneNumber:Lcom/pinarsu/siparis/view/EditText;

    const-string v2, "phoneNumber"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/view/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 4

    .prologue
    .line 88
    const/4 v0, 0x0

    sput-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    .line 89
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 90
    const-string v0, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_0

    .line 93
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/MUSTERI_ARAMA_ADRES;

    .line 94
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MUSTERI_ARAMA_ADRES;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 95
    const-string v2, "address"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 96
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/AddressCheckActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->startActivity(Landroid/content/Intent;)V

    .line 97
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->finish()V

    .line 117
    :goto_0
    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->phoneNumber:Ljava/lang/String;

    const-string v2, "5"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 101
    const-string v0, "Say\u0131n m\u00fc\u015fterimiz uygulamam\u0131z\u0131 kullanman\u0131z i\u00e7in cep telefonu numaran\u0131z\u0131 bildirmeniz gerekmektedir."

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 106
    :cond_1
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    .line 108
    iget-object v2, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->title:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->title:Ljava/lang/String;

    const-string v3, "MUSTERI_BULUNAMADI"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 109
    const/4 v0, 0x1

    sput-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    .line 110
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->startActivity(Landroid/content/Intent;)V

    .line 111
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->finish()V

    goto :goto_0

    .line 113
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method
