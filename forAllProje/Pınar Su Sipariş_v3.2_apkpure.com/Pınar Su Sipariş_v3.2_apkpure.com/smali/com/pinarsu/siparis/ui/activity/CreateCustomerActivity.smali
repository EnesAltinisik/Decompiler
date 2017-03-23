.class public Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity;
.source "CreateCustomerActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IBackPressed;
.implements Lcom/pinarsu/siparis/interfaces/IDismissListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# instance fields
.field cBoxPrivacyAgreement:Landroid/widget/CheckBox;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00cd
    .end annotation
.end field

.field cityList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/ILLER;",
            ">;"
        }
    .end annotation
.end field

.field districtList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MAHALLELER;",
            ">;"
        }
    .end annotation
.end field

.field edAddressDepiction:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c8
    .end annotation
.end field

.field edAddressLabel:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b8
    .end annotation
.end field

.field edBuildingName:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c2
    .end annotation
.end field

.field edBuildingNumber:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c6
    .end annotation
.end field

.field edDoorNumber:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c4
    .end annotation
.end field

.field edFirstName:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00cb
    .end annotation
.end field

.field edLastName:Lcom/pinarsu/siparis/view/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00cc
    .end annotation
.end field

.field frameAddCurrentAddress:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00cf
    .end annotation
.end field

.field onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

.field phoneNumber:Ljava/lang/String;

.field progressBar:Landroid/widget/ProgressBar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00d1
    .end annotation
.end field

.field serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

.field spinCity:Landroid/widget/Spinner;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ba
    .end annotation
.end field

.field spinDistrict:Landroid/widget/Spinner;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00be
    .end annotation
.end field

.field spinResource:I

.field spinStreet:Landroid/widget/Spinner;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c0
    .end annotation
.end field

.field spinTown:Landroid/widget/Spinner;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00bc
    .end annotation
.end field

.field streetList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SOKAKLAR;",
            ">;"
        }
    .end annotation
.end field

.field townList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/ILCELER;",
            ">;"
        }
    .end annotation
.end field

.field tvAdd:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00d0
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;-><init>()V

    .line 102
    const v0, 0x7f03004f

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinResource:I

    .line 293
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$2;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$2;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->getCityList()V

    return-void
.end method

.method private getCityList()V
    .locals 3

    .prologue
    .line 140
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CITY_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 141
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, v2, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 142
    return-void
.end method

.method private setCitySpin()V
    .locals 4

    .prologue
    .line 381
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->cityList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparator;

    const-string v2, "ILADI"

    const-string v3, "ILADI"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 382
    new-instance v0, Lcom/pinarsu/siparis/model/data/ILLER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/ILLER;-><init>()V

    .line 383
    const-string v1, "Se\u00e7iniz"

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILLER;->ILADI:Ljava/lang/String;

    .line 384
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->cityList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 385
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->cityList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V

    .line 386
    return-void
.end method

.method private setDistrictSpin()V
    .locals 4

    .prologue
    .line 405
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->districtList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparator;

    const-string v2, "MAHALLE_ADI"

    const-string v3, "MAHALLE_ADI"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 406
    new-instance v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/MAHALLELER;-><init>()V

    .line 407
    const-string v1, "Se\u00e7iniz"

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;->MAHALLE_ADI:Ljava/lang/String;

    .line 408
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->districtList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 409
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->districtList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V

    .line 410
    return-void
.end method

.method private setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<*>;",
            "Landroid/widget/Spinner;",
            ")V"
        }
    .end annotation

    .prologue
    .line 349
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$3;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    iget v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinResource:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$3;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;Landroid/content/Context;ILjava/util/List;)V

    .line 372
    const v1, 0x1090009

    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 373
    invoke-virtual {p2, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 374
    return-void
.end method

.method private setStreetSpin()V
    .locals 4

    .prologue
    .line 417
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->streetList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparator;

    const-string v2, "SOKAK_ADI"

    const-string v3, "SOKAK_ADI"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 418
    new-instance v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/SOKAKLAR;-><init>()V

    .line 419
    const-string v1, "Se\u00e7iniz"

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;->SOKAK_ADI:Ljava/lang/String;

    .line 420
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->streetList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 421
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->streetList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V

    .line 422
    return-void
.end method

.method private setTownSpin()V
    .locals 4

    .prologue
    .line 393
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->townList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparator;

    const-string v2, "ILCE_ADI"

    const-string v3, "ILCE_ADI"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 394
    new-instance v0, Lcom/pinarsu/siparis/model/data/ILCELER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/ILCELER;-><init>()V

    .line 395
    const-string v1, "Se\u00e7iniz"

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILCELER;->ILCE_ADI:Ljava/lang/String;

    .line 396
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->townList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 397
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->townList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinTown:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V

    .line 398
    return-void
.end method


# virtual methods
.method clickFrameAddCurrentAddress()V
    .locals 15
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00cf
        }
    .end annotation

    .prologue
    .line 159
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 160
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edFirstName:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 161
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edLastName:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 162
    const-string v0, ""

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    .line 164
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v1

    if-eqz v1, :cond_17

    .line 165
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ILLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ILLER;->ILKODU:Ljava/lang/String;

    move-object v1, v0

    .line 166
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinTown:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinTown:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ILCELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ILCELER;->ILCE_KODU:Ljava/lang/String;

    move-object v2, v0

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 169
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;->MAHALLE_KODU:Ljava/lang/String;

    move-object v3, v0

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 171
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;->SOKAK_KODU:Ljava/lang/String;

    .line 173
    :goto_1
    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edBuildingNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v4}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 174
    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edDoorNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v4}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    .line 175
    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edBuildingName:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v4}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 176
    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edAddressDepiction:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v4}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    .line 178
    const-string v4, ""

    .line 179
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_4

    .line 180
    :cond_2
    const-string v4, "Adres Etiketi alan\u0131 bo\u015f b\u0131rak\u0131lamaz."

    .line 210
    :cond_3
    :goto_2
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_15

    .line 211
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    invoke-static {v0, v4}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 234
    :goto_3
    return-void

    .line 181
    :cond_4
    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_6

    .line 182
    :cond_5
    const-string v4, "Ad alan\u0131 bo\u015f b\u0131rak\u0131lamaz."

    goto :goto_2

    .line 183
    :cond_6
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_8

    .line 184
    :cond_7
    const-string v4, "Soyad alan\u0131 bo\u015f b\u0131rak\u0131lamaz."

    goto :goto_2

    .line 185
    :cond_8
    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    invoke-virtual {v12}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v12

    if-eqz v12, :cond_9

    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    invoke-virtual {v12}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v12

    if-nez v12, :cond_a

    .line 186
    :cond_9
    const-string v4, "\u0130l se\u00e7iniz."

    goto :goto_2

    .line 187
    :cond_a
    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinTown:Landroid/widget/Spinner;

    invoke-virtual {v12}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v12

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinTown:Landroid/widget/Spinner;

    invoke-virtual {v12}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v12

    if-nez v12, :cond_c

    .line 188
    :cond_b
    const-string v4, "\u0130l\u00e7e se\u00e7iniz."

    goto :goto_2

    .line 189
    :cond_c
    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-virtual {v12}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v12

    if-eqz v12, :cond_d

    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-virtual {v12}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v12

    if-nez v12, :cond_e

    .line 190
    :cond_d
    const-string v4, "Mahalle se\u00e7iniz."

    goto :goto_2

    .line 191
    :cond_e
    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v12}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v12

    if-eqz v12, :cond_f

    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v12}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v12

    if-nez v12, :cond_10

    .line 192
    :cond_f
    const-string v4, "Sokak se\u00e7iniz."

    goto :goto_2

    .line 198
    :cond_10
    if-eqz v9, :cond_11

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_12

    .line 199
    :cond_11
    const-string v4, "Kap\u0131 No alan\u0131 bo\u015f b\u0131rak\u0131lamaz."

    goto :goto_2

    .line 200
    :cond_12
    if-eqz v8, :cond_13

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_14

    .line 201
    :cond_13
    const-string v4, "Bina No alan\u0131 bo\u015f b\u0131rak\u0131lamaz."

    goto/16 :goto_2

    .line 206
    :cond_14
    iget-object v12, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->cBoxPrivacyAgreement:Landroid/widget/CheckBox;

    invoke-virtual {v12}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v12

    if-nez v12, :cond_3

    .line 207
    const-string v4, "Gizlilik S\u00f6zle\u015fmesi\'ni kabul ediniz."

    goto/16 :goto_2

    .line 215
    :cond_15
    new-instance v4, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v12, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CREATE_CUSTOMER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v4, v12}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 217
    iget-object v12, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v13, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v14, "AD"

    invoke-direct {v13, v14, v6}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    iget-object v6, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v12, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v13, "ADRES_ETIKETI"

    invoke-direct {v12, v13, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    iget-object v5, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v6, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v12, "APARTMAN_ADI"

    invoke-direct {v6, v12, v10}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    iget-object v5, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v6, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v10, "BINA_NO"

    invoke-direct {v6, v10, v8}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    iget-object v5, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v6, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v8, "DAIRE_NO"

    invoke-direct {v6, v8, v9}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    iget-object v5, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v6, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v8, "ILCE_KODU"

    invoke-direct {v6, v8, v2}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    iget-object v2, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v5, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v6, "IL_KODU"

    invoke-direct {v5, v6, v1}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    iget-object v1, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v5, "MAHALLE_KODU"

    invoke-direct {v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    iget-object v1, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "SOKAK_KODU"

    invoke-direct {v2, v3, v0}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    iget-object v0, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v2, "SOYAD"

    invoke-direct {v1, v2, v7}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    iget-object v0, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v2, "TARIF"

    invoke-direct {v1, v2, v11}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    iget-object v0, v4, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v2, "TELEFON_NO"

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->phoneNumber:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v1, v4, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 232
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->frameAddCurrentAddress:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 233
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto/16 :goto_3

    :cond_16
    move-object v0, v4

    goto/16 :goto_1

    :cond_17
    move-object v1, v0

    goto/16 :goto_0
.end method

.method clickLinearPrivacyAgreement()V
    .locals 4
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00ce
        }
    .end annotation

    .prologue
    .line 238
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const-class v3, Lcom/pinarsu/siparis/ui/activity/PrivacyAgreementActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 239
    return-void
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 153
    const v0, 0x7f03001d

    return v0
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 146
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onBackPressed()V

    .line 147
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    if-eqz v0, :cond_0

    .line 148
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->startActivity(Landroid/content/Intent;)V

    .line 149
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 106
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 108
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const v1, 0x7f060097

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->setTitle(I)V

    .line 110
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->appWillOpenUrl(Landroid/net/Uri;)V

    .line 111
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 112
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    .line 113
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/tools/Tools;->keyboardClose(Landroid/app/Activity;Lcom/pinarsu/siparis/view/EditText;)V

    .line 114
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 116
    if-eqz v0, :cond_0

    const-string v1, "phoneNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 117
    const-string v1, "phoneNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->phoneNumber:Ljava/lang/String;

    .line 121
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 122
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinTown:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 123
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinDistrict:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 124
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    new-instance v1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$1;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 134
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->getCityList()V

    .line 137
    return-void

    .line 119
    :cond_0
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->phoneNumber:Ljava/lang/String;

    goto :goto_0
.end method

.method public onDismissListener(I)V
    .locals 2

    .prologue
    .line 336
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    if-eqz v0, :cond_0

    .line 337
    const/4 v0, 0x0

    sput-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    .line 338
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->phoneNumber:Ljava/lang/String;

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    .line 339
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 340
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->startActivity(Landroid/content/Intent;)V

    .line 343
    :goto_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->finish()V

    .line 344
    return-void

    .line 342
    :cond_0
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setResult(I)V

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 2

    .prologue
    .line 243
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CITY_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_0

    .line 244
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_0

    .line 245
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/ILLER_PARENT;

    .line 246
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ILLER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->cityList:Ljava/util/List;

    .line 248
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setCitySpin()V

    .line 251
    :cond_0
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->TOWN_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_1

    .line 253
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_1

    .line 254
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/ILCELER_PARENT;

    .line 255
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ILCELER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->townList:Ljava/util/List;

    .line 256
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setTownSpin()V

    .line 259
    :cond_1
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DISTRICT_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_2

    .line 261
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_2

    .line 263
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/MAHALLELER_PARENT;

    .line 264
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->districtList:Ljava/util/List;

    .line 265
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setDistrictSpin()V

    .line 268
    :cond_2
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->STREET_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_3

    .line 270
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_3

    .line 271
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR_PARENT;

    .line 272
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->streetList:Ljava/util/List;

    .line 274
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->setStreetSpin()V

    .line 277
    :cond_3
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CREATE_CUSTOMER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_4

    .line 278
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->frameAddCurrentAddress:Landroid/widget/FrameLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 279
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 280
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_5

    .line 281
    const-string v0, "Ba\u015far\u0131yla kaydedildi."

    .line 282
    const/4 v1, 0x0

    invoke-static {p0, v0, p0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V

    .line 283
    new-instance v0, Lcom/adjust/sdk/AdjustEvent;

    const-string v1, "kah9hn"

    invoke-direct {v0, v1}, Lcom/adjust/sdk/AdjustEvent;-><init>(Ljava/lang/String;)V

    .line 284
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->trackEvent(Lcom/adjust/sdk/AdjustEvent;)V

    .line 291
    :cond_4
    :goto_0
    return-void

    .line 287
    :cond_5
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    iget-object v1, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v1, v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method
