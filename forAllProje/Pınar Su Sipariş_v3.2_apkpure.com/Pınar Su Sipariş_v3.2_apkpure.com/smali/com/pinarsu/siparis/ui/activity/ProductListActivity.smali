.class public Lcom/pinarsu/siparis/ui/activity/ProductListActivity;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity;
.source "ProductListActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# instance fields
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

.field tvAddedAll:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e2
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;-><init>()V

    return-void
.end method

.method private setView()V
    .locals 2

    .prologue
    .line 65
    new-instance v0, Lcom/pinarsu/siparis/adapter/ProductAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->productList:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/adapter/ProductAdapter;-><init>(Landroid/support/v7/app/AppCompatActivity;Ljava/util/List;)V

    .line 66
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->lv:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 67
    return-void
.end method


# virtual methods
.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 71
    const v0, 0x7f030027

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 43
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    const v0, 0x7f060046

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->setTitle(I)V

    .line 45
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 46
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 48
    const-string v1, "productListParent"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->productList:Ljava/util/List;

    .line 49
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->productList:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 50
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->productList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 51
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->setView()V

    .line 62
    :goto_0
    return-void

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->tvAddedAll:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v6}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    goto :goto_0

    .line 55
    :cond_1
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 56
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->PRODUCTS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v1, v2}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 57
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "BAYI_NO"

    sget-object v5, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v5, v5, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    iget-object v2, v1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "TELEFON_NO"

    sget-object v5, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v2, v0, v1, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v0, v6, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

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
    .line 88
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->productList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 93
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 94
    const-string v2, "product"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 95
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->setResult(ILandroid/content/Intent;)V

    .line 96
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->finish()V

    .line 97
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->productList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 98
    return-void
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    .line 78
    if-eqz v0, :cond_0

    .line 79
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;->productList:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->productList:Ljava/util/List;

    .line 80
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->setView()V

    .line 83
    :cond_0
    return-void
.end method
