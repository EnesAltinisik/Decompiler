.class public Lcom/pinarsu/siparis/ui/activity/MainActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "MainActivity.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;
.implements Lcom/pinarsu/siparis/interfaces/IDismissListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;
    }
.end annotation


# static fields
.field public static IS_ORDER_SUMMARY_CHANGED:Z

.field public static REQUEST_ADDRESS:I

.field public static REQUEST_EDIT_LEFT_MENU:I

.field public static REQUEST_TYPE:I

.field public static TRY_APP:Z


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

.field public allCampaignList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/KAMPANYALAR;",
            ">;"
        }
    .end annotation
.end field

.field public allProductParent:Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

.field public campaignList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/KAMPANYALAR;",
            ">;"
        }
    .end annotation
.end field

.field private delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

.field private delegateRequestPermissionsResult:Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;

.field public imBack:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e3
    .end annotation
.end field

.field public imLeftMenu:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0156
    .end annotation
.end field

.field public imLogo:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0157
    .end annotation
.end field

.field public imRightMenu:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d015a
    .end annotation
.end field

.field private isInternetExceptionShowing:Z

.field isLoadedLastOrder:Z

.field private isOnResumeFragment:Z

.field public lastOrder:Lcom/pinarsu/siparis/model/data/SON_SIPARIS;

.field public lastType:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

.field private number:Ljava/lang/String;

.field onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

.field public orderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SIPARISLER;",
            ">;"
        }
    .end annotation
.end field

.field public productParent:Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

.field private rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

.field private serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00a8
    .end annotation
.end field

.field public tvLogin:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d011e
    .end annotation
.end field

.field tvTitle:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b1
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 133
    sput-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    .line 134
    sput-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->IS_ORDER_SUMMARY_CHANGED:Z

    .line 168
    const/16 v0, 0x3e7

    sput v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_TYPE:I

    .line 169
    const/16 v0, 0x22b

    sput v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_ADDRESS:I

    .line 170
    const/16 v0, 0x29a

    sput v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_EDIT_LEFT_MENU:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 93
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 135
    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isLoadedLastOrder:Z

    .line 165
    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isInternetExceptionShowing:Z

    .line 173
    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isOnResumeFragment:Z

    return-void
.end method

.method private chooseAddress()V
    .locals 3

    .prologue
    .line 387
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/AllAddressActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 388
    const-string v1, "isFromHome"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 389
    sget v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_ADDRESS:I

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 390
    return-void
.end method

.method private createNavigationDrawer()V
    .locals 6

    .prologue
    const v5, 0x7f0d00dc

    const v4, 0x7f0d00db

    const v3, 0x7f0d00d7

    .line 493
    .line 494
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    .line 495
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {p0, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v4, v0, v2}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setUp(ILandroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;)V

    .line 498
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    .line 499
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {p0, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v5, v0, v2}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->setUp(ILandroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;)V

    .line 500
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-eqz v0, :cond_0

    .line 501
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lockRightSideMenu()V

    .line 503
    :cond_0
    return-void
.end method

.method private getAddressListFromService()V
    .locals 5

    .prologue
    .line 234
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 235
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, v2, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 237
    return-void
.end method


# virtual methods
.method clickImLeftMenu()V
    .locals 1
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d0156
        }
    .end annotation

    .prologue
    .line 403
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->isDrawerOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 404
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->closeLeftDrawer()V

    .line 407
    :goto_0
    return-void

    .line 406
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->openLeftDrawer()V

    goto :goto_0
.end method

.method public clickImRightMenu()V
    .locals 1
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d015a
        }
    .end annotation

    .prologue
    .line 411
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->isDrawerOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->closeRightDrawer()V

    .line 415
    :goto_0
    return-void

    .line 414
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->openRightDrawer()V

    goto :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 394
    const/4 v0, 0x0

    return v0
.end method

.method public displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 512
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastType:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-ne v0, p1, :cond_0

    .line 513
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->closeLeftDrawer()V

    .line 562
    :goto_0
    return-void

    .line 517
    :cond_0
    iget-object v1, p1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->clazz:Ljava/lang/Class;

    .line 518
    const/4 v0, 0x0

    .line 520
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 526
    :goto_1
    check-cast v0, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;

    .line 527
    if-nez p2, :cond_1

    .line 528
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 529
    :cond_1
    const-string v1, "lastType"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastType:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 530
    if-eqz p2, :cond_2

    .line 531
    invoke-virtual {v0, p2}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 534
    :cond_2
    if-eqz v0, :cond_3

    .line 535
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 536
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 540
    const v2, 0x7f0d00da

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 542
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 544
    :cond_3
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastType:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 546
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-eqz v0, :cond_5

    .line 547
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-ne p1, v0, :cond_4

    .line 548
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvLogin:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    goto :goto_0

    .line 521
    :catch_0
    move-exception v1

    .line 522
    invoke-virtual {v1}, Ljava/lang/InstantiationException;->printStackTrace()V

    goto :goto_1

    .line 523
    :catch_1
    move-exception v1

    .line 524
    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_1

    .line 550
    :cond_4
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvLogin:Lcom/pinarsu/siparis/view/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    goto :goto_0

    .line 553
    :cond_5
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastOrder:Lcom/pinarsu/siparis/model/data/SON_SIPARIS;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastOrder:Lcom/pinarsu/siparis/model/data/SON_SIPARIS;

    iget v0, v0, Lcom/pinarsu/siparis/model/data/SON_SIPARIS;->MIKTAR:I

    if-lez v0, :cond_7

    .line 554
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-ne p1, v0, :cond_6

    .line 555
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->unLockRightSideMenu(Z)V

    goto :goto_0

    .line 557
    :cond_6
    invoke-virtual {p0, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->unLockRightSideMenu(Z)V

    goto :goto_0

    .line 560
    :cond_7
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lockRightSideMenu()V

    goto :goto_0
.end method

.method public getAllOrder()V
    .locals 5

    .prologue
    .line 712
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_10_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 714
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 715
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, v2, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 716
    return-void
.end method

.method public getCampaignListFromService(Lcom/pinarsu/siparis/api/service/ServiceBase;Ljava/lang/Boolean;)V
    .locals 5

    .prologue
    .line 245
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_CAMPAIGNS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 251
    :goto_0
    sget-boolean v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v1, :cond_1

    .line 252
    const-string v1, ""

    .line 253
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    .line 254
    sget-object v1, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    .line 256
    :cond_0
    iget-object v2, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "BAYI_NO"

    invoke-direct {v3, v4, v1}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    sget-object v4, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    :cond_1
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p1, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 260
    return-void

    .line 248
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    .line 249
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CAMPAIGNS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    goto :goto_0
.end method

.method public lockLeftSideMenu()V
    .locals 3

    .prologue
    .line 439
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->a(II)V

    .line 440
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLeftMenu:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 441
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLeftMenu:Landroid/widget/ImageView;

    const v1, 0x7f0200ee

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 443
    return-void
.end method

.method public lockRightSideMenu()V
    .locals 3

    .prologue
    .line 452
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x1

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->a(II)V

    .line 453
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imRightMenu:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 454
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imRightMenu:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 455
    return-void
.end method

.method login()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d011e
        }
    .end annotation

    .prologue
    .line 434
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 435
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    .line 436
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 681
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

    if-eqz v0, :cond_1

    .line 682
    if-ne p2, v1, :cond_0

    .line 683
    sget v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_TYPE:I

    if-ne p1, v0, :cond_0

    .line 684
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 685
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

    invoke-interface {v0, p3}, Lcom/pinarsu/siparis/interfaces/IActivityResult;->onActivityResult(Landroid/content/Intent;)V

    .line 686
    iput-object v3, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

    .line 709
    :cond_0
    :goto_0
    return-void

    .line 690
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 691
    sget v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_ADDRESS:I

    if-ne p1, v0, :cond_3

    .line 692
    if-ne p2, v1, :cond_2

    .line 694
    const-string v0, "address"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    .line 695
    sput-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 696
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 697
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getCampaignListFromService(Lcom/pinarsu/siparis/api/service/ServiceBase;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 702
    :cond_2
    const-string v0, "Devam edebilmek i\u00e7in l\u00fctfen adres se\u00e7iniz"

    invoke-static {p0, v0, p0, v2}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V

    goto :goto_0

    .line 704
    :cond_3
    sget v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->REQUEST_EDIT_LEFT_MENU:I

    if-ne p1, v0, :cond_0

    .line 705
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastType:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastType:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-eq v0, v1, :cond_0

    .line 706
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {p0, v0, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 663
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

    if-eqz v0, :cond_0

    .line 664
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

    invoke-interface {v0}, Lcom/pinarsu/siparis/interfaces/IBackPressed;->onBackPressed()V

    .line 665
    iput-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

    .line 677
    :goto_0
    return-void

    .line 667
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->isDrawerOpen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 668
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->closeRightDrawer()V

    goto :goto_0

    .line 672
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastType:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-ne v0, v1, :cond_2

    .line 673
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    goto :goto_0

    .line 675
    :cond_2
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {p0, v0, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method onClick(Landroid/view/View;)V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d010b
        }
    .end annotation

    .prologue
    .line 419
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 430
    :goto_0
    return-void

    .line 421
    :pswitch_0
    const-string v0, ""

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    .line 422
    const/4 v0, 0x0

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 423
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/MyApplication;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 424
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 425
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    goto :goto_0

    .line 419
    :pswitch_data_0
    .packed-switch 0x7f0d010b
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 178
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 180
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    .line 182
    invoke-static {p0}, Lcom/pinarsu/siparis/tools/Tools;->isInternetConnected(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    const v0, 0x7f06008b

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6f

    invoke-static {p0, p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDismissListener;Ljava/lang/String;I)V

    .line 221
    :goto_0
    return-void

    .line 190
    :cond_0
    const v0, 0x7f030022

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setContentView(I)V

    .line 192
    invoke-static {p0}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->startService(Landroid/content/Context;)V

    .line 193
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->appWillOpenUrl(Landroid/net/Uri;)V

    .line 194
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 196
    sget-boolean v0, Lcom/pinarsu/siparis/Preferences;->isFIRST_OPEN_APP:Z

    if-eqz v0, :cond_1

    .line 197
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 198
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    goto :goto_0

    .line 202
    :cond_1
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 203
    sput-boolean v2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    .line 207
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 208
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 212
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->createNavigationDrawer()V

    .line 213
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v0, :cond_3

    .line 214
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getAddressListFromService()V

    .line 215
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getCampaignListFromService(Lcom/pinarsu/siparis/api/service/ServiceBase;Ljava/lang/Boolean;)V

    .line 216
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getAllOrder()V

    goto :goto_0

    .line 205
    :cond_2
    sput-boolean v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    goto :goto_1

    .line 219
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getCampaignListFromService(Lcom/pinarsu/siparis/api/service/ServiceBase;Ljava/lang/Boolean;)V

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 0

    .prologue
    .line 225
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 226
    invoke-static {p0}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->stopService(Landroid/content/Context;)V

    .line 227
    return-void
.end method

.method public onDismissListener(I)V
    .locals 2

    .prologue
    .line 376
    const/16 v0, 0x6f

    if-ne p1, v0, :cond_0

    .line 377
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isInternetExceptionShowing:Z

    .line 378
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 379
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    .line 384
    :goto_0
    return-void

    .line 380
    :cond_0
    const/16 v0, 0x79

    if-ne p1, v0, :cond_1

    .line 381
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    goto :goto_0

    .line 383
    :cond_1
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->chooseAddress()V

    goto :goto_0
.end method

.method public onItemClick(Landroid/view/View;I)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    .line 571
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 572
    const-string v0, "Ba\u011flant\u0131 yap\u0131lamad\u0131 l\u00fctfen internet ba\u011flant\u0131n\u0131z\u0131 kontrol ediniz."

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 606
    :goto_0
    return-void

    .line 576
    :cond_0
    const v0, 0x7f0d00d4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 577
    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 581
    const/4 v0, 0x0

    .line 582
    if-nez v1, :cond_1

    .line 583
    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 604
    :goto_1
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->closeLeftDrawer()V

    .line 605
    invoke-virtual {p0, v1, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    goto :goto_0

    .line 584
    :cond_1
    if-ne v1, v3, :cond_2

    .line 585
    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->PROFILE:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    goto :goto_1

    .line 586
    :cond_2
    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 587
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 588
    const-string v2, "campaignList"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->allCampaignList:Ljava/util/List;

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 589
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->CAMPAIGNS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_1

    .line 590
    :cond_3
    const/4 v2, 0x3

    if-ne v1, v2, :cond_4

    .line 591
    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER_SUMMARY:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    goto :goto_1

    .line 592
    :cond_4
    const/4 v2, 0x4

    if-ne v1, v2, :cond_5

    .line 593
    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ANNOUNCEMENTS_AND_NEWS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    goto :goto_1

    .line 594
    :cond_5
    const/4 v2, 0x5

    if-ne v1, v2, :cond_6

    .line 595
    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->REMINDER:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    goto :goto_1

    .line 599
    :cond_6
    sput-boolean v3, Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;->isFromMain:Z

    .line 600
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/TutorialActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onObject(Ljava/lang/Object;I)V
    .locals 4

    .prologue
    .line 100
    if-nez p1, :cond_1

    .line 113
    :cond_0
    :goto_0
    return-void

    .line 102
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 103
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

    .line 104
    const/16 v1, 0x7b

    if-ne p2, v1, :cond_0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    const/16 v0, 0x6f

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->onDismissListener(I)V

    goto :goto_0

    .line 109
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->number:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/tools/Tools;->callNumber(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 110
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->finish()V

    goto :goto_0
.end method

.method protected onPostResume()V
    .locals 1

    .prologue
    .line 369
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPostResume()V

    .line 370
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isOnResumeFragment:Z

    .line 371
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .prologue
    .line 654
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->delegateRequestPermissionsResult:Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;

    if-eqz v0, :cond_0

    .line 655
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->delegateRequestPermissionsResult:Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;

    invoke-interface {v0, p1, p2, p3}, Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 656
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->delegateRequestPermissionsResult:Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;

    .line 659
    :goto_0
    return-void

    .line 658
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 264
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_d

    .line 265
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_3

    .line 266
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRESLER_PARENT;

    .line 268
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRESLER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->addressList:Ljava/util/List;

    .line 269
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->addressList:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->addressList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 270
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->addressList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v4, :cond_1

    .line 272
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->addressList:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->ADDRESS:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 273
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 274
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getCampaignListFromService(Lcom/pinarsu/siparis/api/service/ServiceBase;Ljava/lang/Boolean;)V

    .line 357
    :cond_0
    :goto_0
    return-void

    .line 277
    :cond_1
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->chooseAddress()V

    goto :goto_0

    .line 280
    :cond_2
    const-string v0, "Kay\u0131tl\u0131 bir adres bulunamad\u0131."

    const/16 v1, 0x79

    invoke-static {p0, v0, p0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V

    goto :goto_0

    .line 284
    :cond_3
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CAMPAIGNS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_5

    .line 285
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 286
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR_PARENT;

    .line 287
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    .line 290
    :goto_1
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {p0, v0, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    goto :goto_0

    .line 289
    :cond_4
    iput-object v3, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    goto :goto_1

    .line 291
    :cond_5
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_CAMPAIGNS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_9

    .line 292
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_8

    .line 293
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR_PARENT;

    .line 294
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->allCampaignList:Ljava/util/List;

    .line 295
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->allCampaignList:Ljava/util/List;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->allCampaignList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_7

    .line 296
    :cond_6
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, v5, v2}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    .line 304
    :goto_2
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-eqz v0, :cond_0

    .line 305
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {p0, v0, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    goto :goto_0

    .line 298
    :cond_7
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, v5, v4}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    goto :goto_2

    .line 301
    :cond_8
    const-string v0, "MNTTAG"

    const-string v1, "kampanya bos"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 302
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, v5, v2}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    goto :goto_2

    .line 306
    :cond_9
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_10_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_0

    .line 307
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_c

    .line 308
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/SIPARISLER_PARENT;

    .line 309
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    .line 310
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_b

    .line 311
    :cond_a
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, v6, v2}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    goto/16 :goto_0

    .line 313
    :cond_b
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, v6, v4}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    goto/16 :goto_0

    .line 316
    :cond_c
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, v6, v2}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    .line 317
    iput-object v3, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    goto/16 :goto_0

    .line 321
    :cond_d
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CAMPAIGNS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_f

    .line 322
    iput-object v3, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->campaignList:Ljava/util/List;

    .line 323
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {p0, v0, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    .line 332
    :cond_e
    :goto_3
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    .line 334
    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 335
    if-eqz v1, :cond_11

    .line 336
    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 337
    aget-object v0, v0, v4

    .line 338
    const-string v1, "MNTTAG"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 339
    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->number:Ljava/lang/String;

    .line 340
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isOnResumeFragment:Z

    if-eqz v0, :cond_0

    .line 341
    const/16 v2, 0x7b

    const-string v3, ""

    const-string v4, ""

    const v0, 0x7f0600b9

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v0, 0x7f060058

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 324
    :cond_f
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_CAMPAIGNS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_10

    .line 325
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, v5, v2}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    .line 326
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-eqz v0, :cond_e

    .line 327
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {p0, v0, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->displayView(Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;Landroid/os/Bundle;)V

    goto :goto_3

    .line 328
    :cond_10
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_10_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_e

    .line 329
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, v6, v2}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->setItemVisibility(IZ)V

    .line 330
    iput-object v3, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->orderList:Ljava/util/List;

    goto :goto_3

    .line 345
    :cond_11
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-boolean v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->isCrashed:Z

    if-nez v0, :cond_12

    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_CAMPAIGNS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-eq v0, v1, :cond_12

    .line 346
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 349
    :cond_12
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->lastType:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    if-nez v0, :cond_13

    .line 350
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isInternetExceptionShowing:Z

    if-nez v0, :cond_13

    .line 351
    iput-boolean v4, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isInternetExceptionShowing:Z

    .line 352
    const v0, 0x7f06009e

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6f

    invoke-static {p0, p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InternetConnectionDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDismissListener;Ljava/lang/String;I)V

    .line 355
    :cond_13
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "servis hatasi : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v2, v2, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 720
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    .line 721
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->IS_ORDER_SUMMARY_CHANGED:Z

    if-eqz v0, :cond_0

    .line 722
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getAllOrder()V

    .line 723
    const/4 v0, 0x0

    sput-boolean v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->IS_ORDER_SUMMARY_CHANGED:Z

    .line 725
    :cond_0
    return-void
.end method

.method protected onResumeFragments()V
    .locals 1

    .prologue
    .line 362
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResumeFragments()V

    .line 363
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isOnResumeFragment:Z

    .line 365
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 737
    const-string v0, "WORKAROUND_FOR_BUG_19917_KEY"

    const-string v1, "WORKAROUND_FOR_BUG_19917_VALUE"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 738
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 739
    return-void
.end method

.method public setDelegateIBackPressed(Lcom/pinarsu/siparis/interfaces/IBackPressed;)V
    .locals 0

    .prologue
    .line 640
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->delegateIBackPressed:Lcom/pinarsu/siparis/interfaces/IBackPressed;

    .line 641
    return-void
.end method

.method public setOnActivityResultDelegate(Lcom/pinarsu/siparis/interfaces/IActivityResult;)V
    .locals 0

    .prologue
    .line 631
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

    .line 632
    return-void
.end method

.method public setRequestPermissionsDelegate(Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;)V
    .locals 0

    .prologue
    .line 649
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->delegateRequestPermissionsResult:Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;

    .line 650
    return-void
.end method

.method public setTitle(I)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x0

    .line 614
    if-eqz p1, :cond_0

    .line 615
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 616
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 617
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLogo:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 623
    :goto_0
    return-void

    .line 619
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 620
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 621
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLogo:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public unLockLeftSideMenu()V
    .locals 3

    .prologue
    .line 446
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->a(II)V

    .line 447
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLeftMenu:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 448
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imLeftMenu:Landroid/widget/ImageView;

    const v1, 0x7f0200ed

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 449
    return-void
.end method

.method public unLockRightSideMenu(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x5

    const/4 v3, 0x3

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 459
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imRightMenu:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 460
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->imRightMenu:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 461
    if-eqz p1, :cond_1

    .line 462
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->a(II)V

    .line 463
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v2, v4}, Landroid/support/v4/widget/DrawerLayout;->a(II)V

    .line 468
    :goto_0
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isLoadedLastOrder:Z

    if-nez v0, :cond_0

    .line 469
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->getLastOrder()V

    .line 470
    iput-boolean v1, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->isLoadedLastOrder:Z

    .line 472
    :cond_0
    return-void

    .line 465
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->leftDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v1, v3}, Landroid/support/v4/widget/DrawerLayout;->a(II)V

    .line 466
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity;->rightDrawerFragment:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/widget/DrawerLayout;->a(II)V

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 399
    return-void
.end method
