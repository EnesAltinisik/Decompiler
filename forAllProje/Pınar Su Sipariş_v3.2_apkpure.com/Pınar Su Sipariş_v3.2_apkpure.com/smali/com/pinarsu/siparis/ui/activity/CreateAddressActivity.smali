.class public Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity;
.source "CreateAddressActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IBackPressed;
.implements Lcom/pinarsu/siparis/interfaces/IDismissListener;
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# instance fields
.field BAYI_NO:Ljava/lang/String;

.field MAHALLE_KODU:Ljava/lang/String;

.field checkedStreetCode:Ljava/lang/String;

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

.field isNewRecord:Z

.field private onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

.field phoneNumber:Ljava/lang/String;

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

.field tvAddressDepictionStar:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c7
    .end annotation
.end field

.field tvBuildingNameStar:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c1
    .end annotation
.end field

.field tvCityStar:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b9
    .end annotation
.end field

.field tvDistrictStar:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00bd
    .end annotation
.end field

.field tvInfo:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00c9
    .end annotation
.end field

.field tvStreetStar:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00bf
    .end annotation
.end field

.field tvTownStar:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00bb
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;-><init>()V

    .line 99
    const v0, 0x7f03004f

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinResource:I

    .line 100
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    .line 101
    const-string v0, ""

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->BAYI_NO:Ljava/lang/String;

    .line 102
    const-string v0, ""

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->MAHALLE_KODU:Ljava/lang/String;

    .line 368
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$2;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->getCityList()V

    return-void
.end method

.method private getCityList()V
    .locals 3

    .prologue
    .line 150
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CITY_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 151
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, v2, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 152
    return-void
.end method

.method private setCitySpin()V
    .locals 4

    .prologue
    .line 444
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->cityList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparator;

    const-string v2, "ILADI"

    const-string v3, "ILADI"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 446
    new-instance v0, Lcom/pinarsu/siparis/model/data/ILLER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/ILLER;-><init>()V

    .line 447
    const-string v1, "Se\u00e7iniz"

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILLER;->ILADI:Ljava/lang/String;

    .line 448
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->cityList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->cityList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinCity:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V

    .line 451
    return-void
.end method

.method private setDistrictSpin()V
    .locals 4

    .prologue
    .line 470
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-eqz v0, :cond_0

    .line 471
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->districtList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparator;

    const-string v2, "MAHALLE_ADI"

    const-string v3, "MAHALLE_ADI"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 472
    new-instance v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/MAHALLELER;-><init>()V

    .line 473
    const-string v1, "Se\u00e7iniz"

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;->MAHALLE_ADI:Ljava/lang/String;

    .line 474
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->districtList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 476
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->districtList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V

    .line 477
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
    .line 413
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$3;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    iget v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinResource:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$3;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;Landroid/content/Context;ILjava/util/List;)V

    .line 436
    const v1, 0x1090009

    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 437
    invoke-virtual {p2, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 438
    return-void
.end method

.method private setStreetSpin()V
    .locals 4

    .prologue
    .line 483
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-eqz v0, :cond_0

    .line 484
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->streetList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparator;

    const-string v2, "SOKAK_ADI"

    const-string v3, "SOKAK_ADI"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 485
    new-instance v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/SOKAKLAR;-><init>()V

    .line 486
    const-string v1, "Se\u00e7iniz"

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;->SOKAK_ADI:Ljava/lang/String;

    .line 487
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->streetList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->streetList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V

    .line 490
    return-void
.end method

.method private setTownSpin()V
    .locals 4

    .prologue
    .line 457
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-eqz v0, :cond_0

    .line 458
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->townList:Ljava/util/List;

    new-instance v1, Lcom/pinarsu/siparis/tools/CustomComparator;

    const-string v2, "ILCE_ADI"

    const-string v3, "ILCE_ADI"

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/tools/CustomComparator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 459
    new-instance v0, Lcom/pinarsu/siparis/model/data/ILCELER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/ILCELER;-><init>()V

    .line 460
    const-string v1, "Se\u00e7iniz"

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILCELER;->ILCE_ADI:Ljava/lang/String;

    .line 461
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->townList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 463
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->townList:Ljava/util/List;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinTown:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v1}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setSpinGlob(Ljava/util/List;Landroid/widget/Spinner;)V

    .line 464
    return-void
.end method

.method private updateAddress(Lcom/pinarsu/siparis/model/data/ADRES;)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x0

    .line 221
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const v1, 0x7f06004a

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->setTitle(I)V

    .line 223
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvBuildingNameStar:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 224
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvAddressDepictionStar:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvCityStar:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 227
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvTownStar:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvDistrictStar:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 229
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvStreetStar:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 230
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvInfo:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, "Adres g\u00fcncelleme s\u0131ras\u0131nda sadece (*) ile i\u015faretli alanlar de\u011fi\u015fitirilebilir."

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    const v0, 0x7f030050

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinResource:I

    .line 234
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES_ETIKETI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 235
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressDepiction:Lcom/pinarsu/siparis/view/EditText;

    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->TARIF:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 236
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edBuildingName:Lcom/pinarsu/siparis/view/EditText;

    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->APARTMAN_ADI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 237
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edBuildingNumber:Lcom/pinarsu/siparis/view/EditText;

    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->BINA_NO:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 238
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edDoorNumber:Lcom/pinarsu/siparis/view/EditText;

    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->DAIRE_NO:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 240
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->cityList:Ljava/util/List;

    .line 241
    new-instance v0, Lcom/pinarsu/siparis/model/data/ILLER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/ILLER;-><init>()V

    .line 242
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->IL_ADI:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILLER;->ILADI:Ljava/lang/String;

    .line 243
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->IL_KODU:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILLER;->ILKODU:Ljava/lang/String;

    .line 244
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->cityList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setCitySpin()V

    .line 246
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinCity:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 248
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->townList:Ljava/util/List;

    .line 249
    new-instance v0, Lcom/pinarsu/siparis/model/data/ILCELER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/ILCELER;-><init>()V

    .line 250
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->IL_ADI:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILCELER;->IL_KODU:Ljava/lang/String;

    .line 251
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->ILCE_ADI:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILCELER;->ILCE_ADI:Ljava/lang/String;

    .line 252
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->ILCE_KODU:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/ILCELER;->ILCE_KODU:Ljava/lang/String;

    .line 253
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->townList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setTownSpin()V

    .line 255
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinTown:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 257
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->districtList:Ljava/util/List;

    .line 258
    new-instance v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/MAHALLELER;-><init>()V

    .line 259
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->ILCE_KODU:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;->ILCE_KODU:Ljava/lang/String;

    .line 260
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->MAHALLE_ADI:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;->MAHALLE_ADI:Ljava/lang/String;

    .line 261
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->MAHALLE_KODU:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER;->MAHALLE_KODU:Ljava/lang/String;

    .line 262
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->districtList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setDistrictSpin()V

    .line 264
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 266
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->streetList:Ljava/util/List;

    .line 267
    new-instance v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;

    invoke-direct {v0}, Lcom/pinarsu/siparis/model/data/SOKAKLAR;-><init>()V

    .line 268
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->MAHALLE_KODU:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;->MAHALLE_KODU:Ljava/lang/String;

    .line 269
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->SOKAK_ADI:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;->SOKAK_ADI:Ljava/lang/String;

    .line 270
    iget-object v1, p1, Lcom/pinarsu/siparis/model/data/ADRES;->SOKAK_KODU:Ljava/lang/String;

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;->SOKAK_KODU:Ljava/lang/String;

    .line 271
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->streetList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 272
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setStreetSpin()V

    .line 273
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 274
    return-void
.end method


# virtual methods
.method clickFrameAddCurrentAddress()V
    .locals 10
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00ca
        }
    .end annotation

    .prologue
    .line 283
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 284
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Adres Etiketi alan\u0131 bo\u015f b\u0131rak\u0131lamaz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 345
    :goto_0
    return-void

    .line 288
    :cond_0
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-eqz v0, :cond_4

    .line 289
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinCity:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    if-nez v0, :cond_1

    .line 290
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "\u0130l se\u00e7iniz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0

    .line 293
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinTown:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    if-nez v0, :cond_2

    .line 294
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "\u0130l\u00e7e se\u00e7iniz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0

    .line 297
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinDistrict:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    if-nez v0, :cond_3

    .line 298
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Mahalle se\u00e7iniz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0

    .line 301
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    if-nez v0, :cond_4

    .line 302
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Sokak se\u00e7iniz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0

    .line 306
    :cond_4
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;->SOKAK_KODU:Ljava/lang/String;

    .line 307
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edBuildingNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 308
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 309
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Bina numaras\u0131 belirtiniz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0

    .line 312
    :cond_5
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edDoorNumber:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 313
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 314
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    const-string v1, "Daire numaras\u0131 belirtiniz."

    invoke-direct {v0, p0, v1}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto/16 :goto_0

    .line 317
    :cond_6
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edBuildingName:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 318
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressDepiction:Lcom/pinarsu/siparis/view/EditText;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 321
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-eqz v0, :cond_7

    .line 322
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v7, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CREATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v7}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 327
    :goto_1
    iget-boolean v7, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-eqz v7, :cond_8

    .line 328
    iget-object v7, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v8, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v9, "ADRES_ETIKETI"

    invoke-direct {v8, v9, v1}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v7, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v8, "APARTMAN_ADI"

    invoke-direct {v7, v8, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v5, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v7, "BINA_NO"

    invoke-direct {v5, v7, v3}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v5, "DAIRE_NO"

    invoke-direct {v3, v5, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v3, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v4, "SOKAK_KODU"

    invoke-direct {v3, v4, v2}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 333
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TARIF"

    invoke-direct {v2, v3, v6}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 334
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->phoneNumber:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 344
    :goto_2
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, v2, v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0

    .line 324
    :cond_7
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v7, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->UPDATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v7}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    goto :goto_1

    .line 336
    :cond_8
    iget-object v2, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v7, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v8, "ADRES_ETIKETI"

    invoke-direct {v7, v8, v1}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 337
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v7, "APARTMAN_ADI"

    invoke-direct {v2, v7, v5}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v5, "BAYI_NO"

    iget-object v7, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->BAYI_NO:Ljava/lang/String;

    invoke-direct {v2, v5, v7}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v5, "BINA_NO"

    invoke-direct {v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "DAIRE_NO"

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TARIF"

    invoke-direct {v2, v3, v6}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 342
    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    const-string v3, "TELEFON_NO"

    iget-object v4, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->phoneNumber:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 212
    const v0, 0x7f03001c

    return v0
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 363
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onBackPressed()V

    .line 364
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    if-eqz v0, :cond_0

    .line 365
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->startActivity(Landroid/content/Intent;)V

    .line 366
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 107
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 109
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const v1, 0x7f06004d

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->setTitle(I)V

    .line 110
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 111
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->serviceBase:Lcom/pinarsu/siparis/api/service/ServiceBase;

    .line 112
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/tools/Tools;->keyboardClose(Landroid/app/Activity;Lcom/pinarsu/siparis/view/EditText;)V

    .line 113
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 115
    const-string v1, "phoneNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 116
    const-string v1, "phoneNumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->phoneNumber:Ljava/lang/String;

    .line 120
    :goto_0
    const-string v1, "isNewRecord"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    .line 122
    iget-boolean v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-nez v1, :cond_1

    .line 124
    const-string v1, "address"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    .line 125
    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/ADRES;->BAYI_NO:Ljava/lang/String;

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->BAYI_NO:Ljava/lang/String;

    .line 126
    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/ADRES;->MAHALLE_KODU:Ljava/lang/String;

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->MAHALLE_KODU:Ljava/lang/String;

    .line 127
    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/ADRES;->SOKAK_KODU:Ljava/lang/String;

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->checkedStreetCode:Ljava/lang/String;

    .line 128
    invoke-direct {p0, v0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->updateAddress(Lcom/pinarsu/siparis/model/data/ADRES;)V

    .line 147
    :goto_1
    return-void

    .line 118
    :cond_0
    sget-object v1, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->phoneNumber:Ljava/lang/String;

    goto :goto_0

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinCity:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 132
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinTown:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 133
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinDistrict:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->onItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 135
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinCity:Landroid/widget/Spinner;

    new-instance v1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$1;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 145
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->getCityList()V

    goto :goto_1
.end method

.method public onDismissListener(I)V
    .locals 2

    .prologue
    .line 350
    sget-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    if-eqz v0, :cond_0

    .line 351
    const/4 v0, 0x0

    sput-boolean v0, Lcom/pinarsu/siparis/ui/activity/LoginActivity;->isCreateUser:Z

    .line 352
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->phoneNumber:Ljava/lang/String;

    sput-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    .line 353
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 354
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->startActivity(Landroid/content/Intent;)V

    .line 357
    :goto_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->finish()V

    .line 358
    return-void

    .line 356
    :cond_0
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setResult(I)V

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 2

    .prologue
    .line 156
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CITY_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_0

    .line 157
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/ILLER_PARENT;

    .line 159
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ILLER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->cityList:Ljava/util/List;

    .line 161
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setCitySpin()V

    .line 164
    :cond_0
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->TOWN_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_1

    .line 166
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_1

    .line 167
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/ILCELER_PARENT;

    .line 168
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ILCELER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->townList:Ljava/util/List;

    .line 170
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setTownSpin()V

    .line 173
    :cond_1
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DISTRICT_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_2

    .line 175
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_2

    .line 177
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/MAHALLELER_PARENT;

    .line 178
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MAHALLELER_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->districtList:Ljava/util/List;

    .line 179
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setDistrictSpin()V

    .line 182
    :cond_2
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->STREET_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_3

    .line 184
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_3

    .line 185
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR_PARENT;

    .line 186
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SOKAKLAR_PARENT;->list:Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->streetList:Ljava/util/List;

    .line 188
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->setStreetSpin()V

    .line 191
    :cond_3
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CREATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-eq v0, v1, :cond_4

    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->UPDATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    if-ne v0, v1, :cond_5

    .line 194
    :cond_4
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    if-nez v0, :cond_7

    .line 196
    iget-boolean v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->isNewRecord:Z

    if-eqz v0, :cond_6

    .line 197
    const-string v0, "Adres ba\u015far\u0131yla kaydedildi."

    .line 201
    :goto_0
    const/4 v1, 0x0

    invoke-static {p0, v0, p0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V

    .line 208
    :cond_5
    :goto_1
    return-void

    .line 199
    :cond_6
    const-string v0, "Adres ba\u015far\u0131yla g\u00fcncellendi."

    goto :goto_0

    .line 204
    :cond_7
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_1
.end method
