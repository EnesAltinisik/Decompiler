.class public Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;
.source "CreateCustomerActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;",
        ">",
        "Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/BaseActivity;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbutterknife/ButterKnife$Finder;",
            "TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    const v6, 0x7f0d00c0

    const v5, 0x7f0d00be

    const v4, 0x7f0d00bc

    const v3, 0x7f0d00ba

    const v2, 0x7f0d00b8

    .line 9
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/BaseActivity;Ljava/lang/Object;)V

    .line 12
    const-string v0, "field \'spinCity\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 13
    const-string v1, "field \'spinCity\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    .line 14
    const-string v0, "field \'spinTown\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 15
    const-string v1, "field \'spinTown\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinTown:Landroid/widget/Spinner;

    .line 16
    const-string v0, "field \'spinDistrict\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 17
    const-string v1, "field \'spinDistrict\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinDistrict:Landroid/widget/Spinner;

    .line 18
    const-string v0, "field \'spinStreet\'"

    invoke-virtual {p1, p3, v6, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 19
    const-string v1, "field \'spinStreet\'"

    invoke-virtual {p1, v0, v6, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinStreet:Landroid/widget/Spinner;

    .line 20
    const-string v0, "field \'edAddressLabel\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 21
    const-string v1, "field \'edAddressLabel\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    .line 22
    const v0, 0x7f0d00cb

    const-string v1, "field \'edFirstName\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 23
    const v1, 0x7f0d00cb

    const-string v2, "field \'edFirstName\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edFirstName:Lcom/pinarsu/siparis/view/EditText;

    .line 24
    const v0, 0x7f0d00cc

    const-string v1, "field \'edLastName\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 25
    const v1, 0x7f0d00cc

    const-string v2, "field \'edLastName\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edLastName:Lcom/pinarsu/siparis/view/EditText;

    .line 26
    const v0, 0x7f0d00c8

    const-string v1, "field \'edAddressDepiction\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 27
    const v1, 0x7f0d00c8

    const-string v2, "field \'edAddressDepiction\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edAddressDepiction:Lcom/pinarsu/siparis/view/EditText;

    .line 28
    const v0, 0x7f0d00c4

    const-string v1, "field \'edDoorNumber\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 29
    const v1, 0x7f0d00c4

    const-string v2, "field \'edDoorNumber\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edDoorNumber:Lcom/pinarsu/siparis/view/EditText;

    .line 30
    const v0, 0x7f0d00c6

    const-string v1, "field \'edBuildingNumber\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 31
    const v1, 0x7f0d00c6

    const-string v2, "field \'edBuildingNumber\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edBuildingNumber:Lcom/pinarsu/siparis/view/EditText;

    .line 32
    const v0, 0x7f0d00c2

    const-string v1, "field \'edBuildingName\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 33
    const v1, 0x7f0d00c2

    const-string v2, "field \'edBuildingName\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edBuildingName:Lcom/pinarsu/siparis/view/EditText;

    .line 34
    const v0, 0x7f0d00d1

    const-string v1, "field \'progressBar\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 35
    const v1, 0x7f0d00d1

    const-string v2, "field \'progressBar\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->progressBar:Landroid/widget/ProgressBar;

    .line 36
    const v0, 0x7f0d00cf

    const-string v1, "field \'frameAddCurrentAddress\' and method \'clickFrameAddCurrentAddress\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 37
    const v1, 0x7f0d00cf

    const-string v2, "field \'frameAddCurrentAddress\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->frameAddCurrentAddress:Landroid/widget/FrameLayout;

    .line 38
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    const v0, 0x7f0d00cd

    const-string v1, "field \'cBoxPrivacyAgreement\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 47
    const v1, 0x7f0d00cd

    const-string v2, "field \'cBoxPrivacyAgreement\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->cBoxPrivacyAgreement:Landroid/widget/CheckBox;

    .line 48
    const v0, 0x7f0d00d0

    const-string v1, "field \'tvAdd\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 49
    const v1, 0x7f0d00d0

    const-string v2, "field \'tvAdd\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->tvAdd:Landroid/widget/TextView;

    .line 50
    const v0, 0x7f0d00ce

    const-string v1, "method \'clickLinearPrivacyAgreement\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 51
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector$2;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector$2;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 62
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V

    .line 64
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinCity:Landroid/widget/Spinner;

    .line 65
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinTown:Landroid/widget/Spinner;

    .line 66
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinDistrict:Landroid/widget/Spinner;

    .line 67
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->spinStreet:Landroid/widget/Spinner;

    .line 68
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    .line 69
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edFirstName:Lcom/pinarsu/siparis/view/EditText;

    .line 70
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edLastName:Lcom/pinarsu/siparis/view/EditText;

    .line 71
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edAddressDepiction:Lcom/pinarsu/siparis/view/EditText;

    .line 72
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edDoorNumber:Lcom/pinarsu/siparis/view/EditText;

    .line 73
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edBuildingNumber:Lcom/pinarsu/siparis/view/EditText;

    .line 74
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->edBuildingName:Lcom/pinarsu/siparis/view/EditText;

    .line 75
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->progressBar:Landroid/widget/ProgressBar;

    .line 76
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->frameAddCurrentAddress:Landroid/widget/FrameLayout;

    .line 77
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->cBoxPrivacyAgreement:Landroid/widget/CheckBox;

    .line 78
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->tvAdd:Landroid/widget/TextView;

    .line 79
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V

    return-void
.end method
