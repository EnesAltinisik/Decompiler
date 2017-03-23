.class public Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;
.super Landroid/support/v4/app/Fragment;
.source "Order2Fragment.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/pinarsu/siparis/interfaces/IBackPressed;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field private activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

.field private adapter:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field private productList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MALZEMELER;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 53
    return-void
.end method


# virtual methods
.method clickAddAnotherProduct()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d010e
        }
    .end annotation

    .prologue
    .line 154
    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "productListParent"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productListParent:Ljava/util/List;

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0xde

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 158
    return-void
.end method

.method clickContinue()V
    .locals 7
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00f6
        }
    .end annotation

    .prologue
    .line 121
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->productList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-string v1, "L\u00fctfen \u00fcr\u00fcn ekleyiniz."

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 143
    :goto_0
    return-void

    .line 125
    :cond_0
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CALCULATE_ORDER_TOTAL:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 126
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    .line 128
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "BAYI_NO  "

    invoke-direct {v3, v4, v0}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    iget-object v0, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO "

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    new-instance v2, Lorg/b/a/h;

    const-string v0, ""

    const-string v3, "URUNLER"

    invoke-direct {v2, v0, v3}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->productList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 133
    new-instance v4, Lorg/b/a/h;

    const-string v5, ""

    const-string v6, "item"

    invoke-direct {v4, v5, v6}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string v5, "MALZEME_NO"

    iget-object v6, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 135
    const-string v5, "MIKTAR"

    iget v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 136
    invoke-virtual {v2, v4}, Lorg/b/a/h;->a(Lorg/b/a/h;)Lorg/b/a/h;

    goto :goto_1

    .line 138
    :cond_1
    iget-object v0, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, ""

    invoke-direct {v3, v4, v2}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Lorg/b/a/h;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 141
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-direct {v2, v0, v1, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 109
    const/4 v0, 0x0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 163
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 164
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 165
    const/16 v0, 0xde

    if-ne p1, v0, :cond_0

    .line 166
    const-string v0, "product"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 167
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->productList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->productList:Ljava/util/List;

    iput-object v2, v1, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productList:Ljava/util/List;

    .line 169
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->removeProductFromProductParentList(Lcom/pinarsu/siparis/model/data/MALZEMELER;)V

    .line 170
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->adapter:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->adapter:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->notifyDataSetChanged()V

    .line 174
    :cond_0
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 98
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 99
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 147
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER1:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    .line 148
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 65
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 66
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    .line 68
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->productList:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->productList:Ljava/util/List;

    .line 69
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 76
    const v0, 0x7f030046

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 77
    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 103
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 104
    return-void
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 3

    .prologue
    .line 178
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_2

    .line 179
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CALCULATE_ORDER_TOTAL:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_0

    .line 180
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;

    .line 181
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 182
    if-eqz v0, :cond_1

    .line 183
    const-string v2, "SIPARIS_TUTARI_PARENT"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 184
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    sget-object v2, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER3:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {v0, v2, v1}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    .line 194
    :cond_0
    :goto_0
    return-void

    .line 186
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    const-string v1, "\u0130\u015flem ba\u015far\u0131s\u0131z."

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 190
    :cond_2
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CALCULATE_ORDER_TOTAL:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_0

    .line 191
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v1, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v1, v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 92
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 93
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->setDelegateIBackPressed(Lcom/pinarsu/siparis/interfaces/IBackPressed;)V

    .line 94
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 82
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 83
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 84
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->productList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 85
    new-instance v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->productList:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;-><init>(Lcom/pinarsu/siparis/ui/activity/OrderActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->adapter:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    .line 86
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->lv:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;->adapter:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 88
    :cond_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 115
    return-void
.end method
