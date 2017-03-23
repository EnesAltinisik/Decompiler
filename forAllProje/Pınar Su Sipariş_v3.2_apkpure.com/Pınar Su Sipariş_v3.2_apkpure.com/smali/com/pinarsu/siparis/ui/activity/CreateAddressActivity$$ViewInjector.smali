.class public Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;
.source "CreateAddressActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;",
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
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;Ljava/lang/Object;)V
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
    const v6, 0x7f0d00bc

    const v5, 0x7f0d00bb

    const v2, 0x7f0d00ba

    const v4, 0x7f0d00b9

    const v3, 0x7f0d00b8

    .line 9
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/BaseActivity;Ljava/lang/Object;)V

    .line 12
    const-string v0, "field \'spinCity\'"

    invoke-virtual {p1, p3, v2, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 13
    const-string v1, "field \'spinCity\'"

    invoke-virtual {p1, v0, v2, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinCity:Landroid/widget/Spinner;

    .line 14
    const-string v0, "field \'spinTown\'"

    invoke-virtual {p1, p3, v6, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 15
    const-string v1, "field \'spinTown\'"

    invoke-virtual {p1, v0, v6, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinTown:Landroid/widget/Spinner;

    .line 16
    const v0, 0x7f0d00be

    const-string v1, "field \'spinDistrict\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 17
    const v1, 0x7f0d00be

    const-string v2, "field \'spinDistrict\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinDistrict:Landroid/widget/Spinner;

    .line 18
    const v0, 0x7f0d00c0

    const-string v1, "field \'spinStreet\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 19
    const v1, 0x7f0d00c0

    const-string v2, "field \'spinStreet\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    .line 20
    const-string v0, "field \'edAddressLabel\'"

    invoke-virtual {p1, p3, v3, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 21
    const-string v1, "field \'edAddressLabel\'"

    invoke-virtual {p1, v0, v3, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    .line 22
    const v0, 0x7f0d00c8

    const-string v1, "field \'edAddressDepiction\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 23
    const v1, 0x7f0d00c8

    const-string v2, "field \'edAddressDepiction\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressDepiction:Lcom/pinarsu/siparis/view/EditText;

    .line 24
    const v0, 0x7f0d00c4

    const-string v1, "field \'edDoorNumber\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 25
    const v1, 0x7f0d00c4

    const-string v2, "field \'edDoorNumber\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edDoorNumber:Lcom/pinarsu/siparis/view/EditText;

    .line 26
    const v0, 0x7f0d00c6

    const-string v1, "field \'edBuildingNumber\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 27
    const v1, 0x7f0d00c6

    const-string v2, "field \'edBuildingNumber\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edBuildingNumber:Lcom/pinarsu/siparis/view/EditText;

    .line 28
    const v0, 0x7f0d00c2

    const-string v1, "field \'edBuildingName\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 29
    const v1, 0x7f0d00c2

    const-string v2, "field \'edBuildingName\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/EditText;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edBuildingName:Lcom/pinarsu/siparis/view/EditText;

    .line 30
    const-string v0, "field \'tvCityStar\'"

    invoke-virtual {p1, p3, v4, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 31
    const-string v1, "field \'tvCityStar\'"

    invoke-virtual {p1, v0, v4, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvCityStar:Lcom/pinarsu/siparis/view/TextView;

    .line 32
    const-string v0, "field \'tvTownStar\'"

    invoke-virtual {p1, p3, v5, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 33
    const-string v1, "field \'tvTownStar\'"

    invoke-virtual {p1, v0, v5, v1}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvTownStar:Lcom/pinarsu/siparis/view/TextView;

    .line 34
    const v0, 0x7f0d00bd

    const-string v1, "field \'tvDistrictStar\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 35
    const v1, 0x7f0d00bd

    const-string v2, "field \'tvDistrictStar\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvDistrictStar:Lcom/pinarsu/siparis/view/TextView;

    .line 36
    const v0, 0x7f0d00bf

    const-string v1, "field \'tvStreetStar\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 37
    const v1, 0x7f0d00bf

    const-string v2, "field \'tvStreetStar\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvStreetStar:Lcom/pinarsu/siparis/view/TextView;

    .line 38
    const v0, 0x7f0d00c1

    const-string v1, "field \'tvBuildingNameStar\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 39
    const v1, 0x7f0d00c1

    const-string v2, "field \'tvBuildingNameStar\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvBuildingNameStar:Lcom/pinarsu/siparis/view/TextView;

    .line 40
    const v0, 0x7f0d00c7

    const-string v1, "field \'tvAddressDepictionStar\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 41
    const v1, 0x7f0d00c7

    const-string v2, "field \'tvAddressDepictionStar\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvAddressDepictionStar:Lcom/pinarsu/siparis/view/TextView;

    .line 42
    const v0, 0x7f0d00c9

    const-string v1, "field \'tvInfo\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 43
    const v1, 0x7f0d00c9

    const-string v2, "field \'tvInfo\'"

    invoke-virtual {p1, v0, v1, v2}, Lbutterknife/ButterKnife$Finder;->castView(Landroid/view/View;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvInfo:Lcom/pinarsu/siparis/view/TextView;

    .line 44
    const v0, 0x7f0d00ca

    const-string v1, "method \'clickFrameAddCurrentAddress\'"

    invoke-virtual {p1, p3, v0, v1}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 45
    new-instance v1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector$1;

    invoke-direct {v1, p0, p2}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector$1;-><init>(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    return-void
.end method

.method public bridge synthetic inject(Lbutterknife/ButterKnife$Finder;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p2, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V

    return-void
.end method

.method public reset(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 56
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/BaseActivity;)V

    .line 58
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinCity:Landroid/widget/Spinner;

    .line 59
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinTown:Landroid/widget/Spinner;

    .line 60
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinDistrict:Landroid/widget/Spinner;

    .line 61
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->spinStreet:Landroid/widget/Spinner;

    .line 62
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressLabel:Lcom/pinarsu/siparis/view/EditText;

    .line 63
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edAddressDepiction:Lcom/pinarsu/siparis/view/EditText;

    .line 64
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edDoorNumber:Lcom/pinarsu/siparis/view/EditText;

    .line 65
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edBuildingNumber:Lcom/pinarsu/siparis/view/EditText;

    .line 66
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->edBuildingName:Lcom/pinarsu/siparis/view/EditText;

    .line 67
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvCityStar:Lcom/pinarsu/siparis/view/TextView;

    .line 68
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvTownStar:Lcom/pinarsu/siparis/view/TextView;

    .line 69
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvDistrictStar:Lcom/pinarsu/siparis/view/TextView;

    .line 70
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvStreetStar:Lcom/pinarsu/siparis/view/TextView;

    .line 71
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvBuildingNameStar:Lcom/pinarsu/siparis/view/TextView;

    .line 72
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvAddressDepictionStar:Lcom/pinarsu/siparis/view/TextView;

    .line 73
    iput-object v0, p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->tvInfo:Lcom/pinarsu/siparis/view/TextView;

    .line 74
    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 7
    check-cast p1, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;->reset(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V

    return-void
.end method
