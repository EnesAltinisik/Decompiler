.class public Lcom/pinarsu/siparis/ui/fragment/HomeFragment;
.super Lcom/pinarsu/siparis/ui/fragment/BaseFragment;
.source "HomeFragment.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IActivityResult;
.implements Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;
.implements Lcom/pinarsu/siparis/interfaces/IDismissListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field private adapter:Lcom/pinarsu/siparis/adapter/ProductAdapter;

.field private address:Lcom/pinarsu/siparis/model/data/ADRES;

.field private allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

.field private bannerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/ViewPagerItem;",
            ">;"
        }
    .end annotation
.end field

.field private bannerSize:I

.field frameCampaigns:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0105
    .end annotation
.end field

.field private handler:Landroid/os/Handler;

.field private isInternetExceptionShowing:Z

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field private number:Ljava/lang/String;

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

.field private productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

.field private runnable:Ljava/lang/Runnable;

.field private serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

.field private tvAddress:Lcom/pinarsu/siparis/view/TextView;

.field private viewPager:Landroid/support/v4/view/ViewPager;

.field private viewPagerAdapter:Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;-><init>()V

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->isInternetExceptionShowing:Z

    .line 322
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->runnable:Ljava/lang/Runnable;

    .line 67
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->bannerSize:I

    return v0
.end method

.method static synthetic access$200(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->runnable:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$300(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method private getProductInAddress()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 416
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-static {v0}, Lcom/pinarsu/siparis/tools/Tools;->isInternetConnected(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 417
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f06008b

    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x6f

    invoke-static {v0, p0, v1, v2}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDismissListener;Ljava/lang/String;I)V

    .line 444
    :goto_0
    return-void

    .line 420
    :cond_0
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v0, :cond_2

    .line 422
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    if-nez v0, :cond_1

    .line 424
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->PRODUCTS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 425
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "BAYI_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v4, v4, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 426
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 427
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v1, v2, v0, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v0, v5, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 429
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    .line 430
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->setView()V

    goto :goto_0

    .line 434
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    if-nez v0, :cond_3

    .line 437
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_PRODUCTS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 438
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v1, v2, v0, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    new-array v0, v5, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 440
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    .line 441
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->setView()V

    goto :goto_0
.end method

.method private setAddress()V
    .locals 2

    .prologue
    .line 375
    const-string v0, ""

    .line 376
    sget-boolean v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v1, :cond_4

    .line 377
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    if-eqz v1, :cond_3

    .line 378
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->ILCE_ADI:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->ILCE_ADI:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 379
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->ILCE_ADI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 380
    :cond_0
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->IL_ADI:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->IL_ADI:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 381
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 382
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " / "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->IL_ADI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 392
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->tvAddress:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 393
    return-void

    .line 384
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->IL_ADI:Ljava/lang/String;

    goto :goto_0

    .line 387
    :cond_3
    const-string v0, ""

    goto :goto_0

    .line 390
    :cond_4
    const-string v0, "Adres"

    goto :goto_0
.end method

.method private setView()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 251
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;->productList:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productList:Ljava/util/List;

    .line 256
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productList:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 258
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;->bannerList:Ljava/util/List;

    .line 263
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 264
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 265
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 266
    new-instance v3, Lcom/pinarsu/siparis/model/ViewPagerItem;

    const/4 v4, 0x0

    sget-object v5, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->FROM_URL:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    invoke-direct {v3, v6, v0, v4, v5}, Lcom/pinarsu/siparis/model/ViewPagerItem;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;->productList:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productList:Ljava/util/List;

    goto :goto_0

    .line 261
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;->bannerList:Ljava/util/List;

    goto :goto_1

    .line 269
    :cond_2
    new-instance v0, Lcom/pinarsu/siparis/model/ViewPagerItem;

    const v2, 0x7f020052

    sget-object v3, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->FROM_DRAWABLE:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    invoke-direct {v0, v6, v6, v2, v3}, Lcom/pinarsu/siparis/model/ViewPagerItem;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    :cond_3
    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->bannerList:Ljava/util/List;

    .line 272
    new-instance v0, Lcom/pinarsu/siparis/adapter/ProductAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productList:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/adapter/ProductAdapter;-><init>(Landroid/support/v7/app/AppCompatActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->adapter:Lcom/pinarsu/siparis/adapter/ProductAdapter;

    .line 273
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->setViewPager()V

    .line 274
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->lv:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->adapter:Lcom/pinarsu/siparis/adapter/ProductAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 277
    :cond_4
    return-void
.end method

.method private setViewPager()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 283
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03004e

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 285
    const v0, 0x7f0d0121

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 287
    const v1, 0x7f0d0122

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 289
    new-instance v3, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;

    invoke-direct {v3, p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)V

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 303
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->bannerList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->bannerSize:I

    .line 304
    new-instance v1, Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    iget-object v4, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->bannerList:Ljava/util/List;

    invoke-direct {v1, v3, v4, v5}, Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IClickListener;)V

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPagerAdapter:Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;

    .line 305
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    if-nez v1, :cond_0

    .line 306
    const v1, 0x7f0d00b2

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/pinarsu/siparis/view/TextView;

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->tvAddress:Lcom/pinarsu/siparis/view/TextView;

    .line 307
    const v1, 0x7f0d00f3

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ViewPager;

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    .line 308
    const v1, 0x7f0d00f4

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/pinarsu/siparis/view/ViewPagerIndicator;

    .line 309
    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    iget-object v4, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPagerAdapter:Lcom/pinarsu/siparis/adapter/ViewPagerAdapter;

    invoke-virtual {v3, v4}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/ac;)V

    .line 310
    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v3}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 311
    invoke-virtual {v1}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->bringToFront()V

    .line 312
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    sget v1, Lcom/pinarsu/siparis/MyApplication;->SCREEN_WIDTH:I

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x4

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 313
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->lv:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 314
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->startSlide()V

    .line 318
    :goto_0
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->setAddress()V

    .line 319
    return-void

    .line 316
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->adapter:Lcom/pinarsu/siparis/adapter/ProductAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/adapter/ProductAdapter;->notifyDataSetChanged()V

    goto :goto_0
.end method


# virtual methods
.method clickCampaigns()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0105
        }
    .end annotation

    .prologue
    .line 475
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 476
    const-string v2, "campaignList"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 477
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    sget-object v2, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->CAMPAIGNS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {v0, v2, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    .line 479
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 174
    const/4 v0, 0x0

    return v0
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 169
    const v0, 0x7f030042

    return v0
.end method

.method itemClick(I)V
    .locals 5
    .annotation build Lbutterknife/OnItemClick;
        value = {
            0x7f0d00b5
        }
    .end annotation

    .prologue
    .line 448
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-eqz v0, :cond_1

    .line 449
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->loginPopup()V

    .line 471
    :cond_0
    :goto_0
    return-void

    .line 452
    :cond_1
    if-lez p1, :cond_0

    .line 454
    add-int/lit8 v0, p1, -0x1

    .line 455
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "positionlvv : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 457
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;->deliveryList:Ljava/util/List;

    .line 458
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productList:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 465
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v4, Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 466
    if-eqz v1, :cond_2

    .line 467
    const-string v3, "deliveryList"

    check-cast v1, Ljava/io/Serializable;

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 468
    :cond_2
    const-string v3, "productListParent"

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productList:Ljava/util/List;

    check-cast v1, Ljava/io/Serializable;

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 469
    const-string v1, "product"

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 470
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public loginPopup()V
    .locals 7

    .prologue
    .line 482
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/16 v2, 0x6f

    const-string v3, ""

    const-string v4, "Uygulaman\u0131n t\u00fcm \u00f6zelliklerini kullanabilmek i\u00e7in giri\u015f yapman\u0131z gerekmektedir."

    const-string v5, "\u0130ptal"

    const-string v6, "Giri\u015f Yap"

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    return-void
.end method

.method public onActivityResult(Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 398
    const-string v0, "address"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    .line 399
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "+address.BAYI_NO : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 400
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 413
    :goto_0
    return-void

    .line 403
    :cond_0
    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 404
    sput-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 405
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 406
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->setAddress()V

    .line 408
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    .line 409
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->frameCampaigns:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 410
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getCampaignListFromService(Lcom/pinarsu/siparis/api/service/ServiceBase;Ljava/lang/Boolean;)V

    .line 412
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->getProductInAddress()V

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 159
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 160
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 95
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 96
    const-string v0, "MNTTAG"

    const-string v1, "HomeFragment onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    .line 99
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setTitle(I)V

    .line 106
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setDelegateIBackPressed(Lcom/pinarsu/siparis/interfaces/IBackPressed;)V

    .line 108
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 109
    return-object v0
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    .line 122
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onDestroyView()V

    .line 123
    sget-boolean v0, Lcom/pinarsu/siparis/Preferences;->HOME_ORDER_POPUP_VIEWED:Z

    if-nez v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f0d00d9

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 126
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 128
    :cond_0
    return-void
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 164
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onDetach()V

    .line 165
    return-void
.end method

.method public onDismissListener(I)V
    .locals 3

    .prologue
    .line 510
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->isInternetExceptionShowing:Z

    .line 511
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->startActivity(Landroid/content/Intent;)V

    .line 512
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    .line 513
    return-void
.end method

.method public onObject(Ljava/lang/Object;I)V
    .locals 4

    .prologue
    .line 488
    if-nez p1, :cond_1

    .line 506
    :cond_0
    :goto_0
    return-void

    .line 490
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 491
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

    .line 492
    const/16 v1, 0x6f

    if-ne p2, v1, :cond_2

    .line 493
    if-nez v0, :cond_0

    .line 494
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v3, Lcom/pinarsu/siparis/ui/activity/LoginActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 495
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    goto :goto_0

    .line 497
    :cond_2
    const/16 v1, 0x7b

    if-ne p2, v1, :cond_0

    .line 498
    if-eqz v0, :cond_3

    .line 499
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->onDismissListener(I)V

    goto :goto_0

    .line 502
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->number:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/tools/Tools;->callNumber(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 503
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 114
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onPause()V

    .line 115
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->adapter:Lcom/pinarsu/siparis/adapter/ProductAdapter;

    if-nez v0, :cond_0

    .line 118
    :goto_0
    return-void

    .line 117
    :cond_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->stopSlide()V

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 183
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_7

    .line 184
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_PRODUCTS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-eq v0, v1, :cond_0

    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->PRODUCTS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_3

    .line 185
    :cond_0
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 186
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v0, :cond_2

    .line 188
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    .line 189
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    iput-object v1, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    .line 195
    :goto_0
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->setView()V

    .line 247
    :cond_1
    :goto_1
    return-void

    .line 192
    :cond_2
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    .line 193
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    iput-object v1, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    goto :goto_0

    .line 197
    :cond_3
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CAMPAIGNS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_1

    .line 198
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 199
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR_PARENT;

    .line 200
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR_PARENT;->list:Ljava/util/List;

    iput-object v0, v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    .line 202
    :cond_4
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 203
    :cond_5
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->frameCampaigns:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_1

    .line 205
    :cond_6
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->frameCampaigns:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_1

    .line 229
    :cond_7
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    .line 231
    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 232
    if-eqz v1, :cond_8

    .line 233
    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 234
    aget-object v0, v1, v2

    .line 235
    const-string v2, "MNTTAG"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->number:Ljava/lang/String;

    .line 237
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/16 v2, 0x7b

    const-string v3, ""

    aget-object v4, v1, v4

    const v1, 0x7f0600b9

    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v1, 0x7f060058

    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 242
    :cond_8
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->isInternetExceptionShowing:Z

    if-nez v0, :cond_1

    .line 243
    iput-boolean v2, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->isInternetExceptionShowing:Z

    .line 244
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f06009e

    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x6f

    invoke-static {v0, p0, v1, v2}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDismissListener;Ljava/lang/String;I)V

    goto/16 :goto_1
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 132
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onResume()V

    .line 133
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->adapter:Lcom/pinarsu/siparis/adapter/ProductAdapter;

    if-nez v0, :cond_1

    .line 140
    :cond_0
    :goto_0
    return-void

    .line 135
    :cond_1
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->startSlide()V

    .line 136
    sget-boolean v0, Lcom/pinarsu/siparis/Preferences;->HOME_ORDER_POPUP_VIEWED:Z

    if-nez v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f0d00d9

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 138
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 144
    invoke-super {p0, p1, p2}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 145
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 146
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->frameCampaigns:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 150
    :cond_1
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->address:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 152
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->getProductInAddress()V

    .line 155
    return-void
.end method

.method public startSlide()V
    .locals 4

    .prologue
    .line 351
    :try_start_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->handler:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 352
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->handler:Landroid/os/Handler;

    .line 354
    :cond_0
    iget v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->bannerSize:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 355
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->runnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    :cond_1
    :goto_0
    return-void

    .line 357
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public stopSlide()V
    .locals 2

    .prologue
    .line 365
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->runnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 367
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->handler:Landroid/os/Handler;

    .line 369
    :cond_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 179
    return-void
.end method
