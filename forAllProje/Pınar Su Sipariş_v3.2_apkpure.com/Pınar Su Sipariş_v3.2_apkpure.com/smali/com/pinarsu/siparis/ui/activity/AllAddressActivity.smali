.class public Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "AllAddressActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IBackPressed;
.implements Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# instance fields
.field private addressList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/ADRES;",
            ">;"
        }
    .end annotation
.end field

.field frameAdd:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b6
    .end annotation
.end field

.field private isFromHome:Z

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field private selectedItem:I

.field private serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private getAllAdress()V
    .locals 5

    .prologue
    .line 78
    const-string v0, "MNTTAG"

    const-string v1, "SERVICE E CIKTI"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 80
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, v2, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 82
    return-void
.end method

.method private setView()V
    .locals 2

    .prologue
    .line 107
    new-instance v0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->addressList:Ljava/util/List;

    invoke-direct {v0, p0, v1, p0}, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;)V

    .line 108
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->lv:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 109
    return-void
.end method


# virtual methods
.method clickFrameAdd()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00b6
        }
    .end annotation

    .prologue
    .line 124
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "phoneNumber"

    sget-object v2, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isNewRecord"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x29a

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 125
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 129
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 130
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 131
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->getAllAdress()V

    .line 133
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 60
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    const v0, 0x7f03001b

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->setContentView(I)V

    .line 63
    const v0, 0x7f06004d

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->setTitle(I)V

    .line 65
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 66
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 67
    if-eqz v0, :cond_0

    const-string v1, "isFromHome"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 68
    const-string v1, "isFromHome"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->isFromHome:Z

    .line 73
    :goto_0
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    .line 74
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->getAllAdress()V

    .line 75
    return-void

    .line 70
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->isFromHome:Z

    goto :goto_0
.end method

.method onItemClick(I)V
    .locals 3
    .annotation build Lbutterknife/OnItemClick;
        value = {
            0x7f0d00b5
        }
    .end annotation

    .prologue
    .line 113
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->isFromHome:Z

    if-nez v0, :cond_0

    .line 120
    :goto_0
    return-void

    .line 116
    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 117
    const-string v2, "address"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->addressList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 118
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->setResult(ILandroid/content/Intent;)V

    .line 119
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->finish()V

    goto :goto_0
.end method

.method public onObject(Ljava/lang/Object;I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 137
    if-nez p1, :cond_1

    .line 169
    :cond_0
    :goto_0
    return-void

    .line 139
    :cond_1
    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_4

    .line 140
    check-cast p1, Landroid/view/View;

    .line 141
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 142
    const-string v0, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClickListener position : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->selectedItem:I

    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f0d014b

    if-ne v0, v2, :cond_2

    .line 146
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 147
    const-string v0, "isNewRecord"

    invoke-virtual {v1, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 148
    const-string v2, "address"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->addressList:Ljava/util/List;

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->selectedItem:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 150
    const/16 v0, 0x309

    invoke-virtual {p0, v1, v0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->addressList:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES_ETIKETI:Ljava/lang/String;

    .line 153
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 154
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->addressList:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/model/data/ADRES;->getAddress()Ljava/lang/String;

    move-result-object v0

    .line 155
    :cond_3
    const-string v1, "Silmek istedi\u011finizden emin misiniz?"

    invoke-static {p0, p0, v1, v0}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 157
    :cond_4
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 158
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 159
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->addressList:Ljava/util/List;

    iget v1, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->selectedItem:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    .line 162
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DELETE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v1, v2}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 163
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "BAYI_NO"

    iget-object v5, v0, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "SOKAK_KODU"

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->SOKAK_KODU:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object v0, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v2, v1, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v1, v6, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 2

    .prologue
    .line 86
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_2

    .line 88
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_1

    .line 89
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRESLER_PARENT;

    .line 92
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRESLER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->addressList:Ljava/util/List;

    .line 93
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->setView()V

    .line 103
    :cond_0
    :goto_0
    return-void

    .line 97
    :cond_1
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Adres ba\u015far\u0131yla silindi."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 98
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;->getAllAdress()V

    goto :goto_0

    .line 101
    :cond_2
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method
