.class public Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;
.super Lcom/pinarsu/siparis/ui/fragment/BaseFragment;
.source "AnnouncementsAndNewsFragment.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field duyurularList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/DUYURULAR;",
            ">;"
        }
    .end annotation
.end field

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field sertifikalarList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;",
            ">;"
        }
    .end annotation
.end field

.field tvNoRecord:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0104
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;-><init>()V

    .line 43
    return-void
.end method

.method private setView()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 126
    .line 127
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 132
    :goto_0
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 133
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v0, v2

    .line 138
    :goto_1
    if-lez v0, :cond_2

    .line 139
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->tvNoRecord:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 140
    new-instance v0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;)V

    .line 141
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->lv:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 145
    :goto_2
    return-void

    .line 130
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    move v0, v1

    goto :goto_0

    .line 135
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    goto :goto_1

    .line 143
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->tvNoRecord:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 96
    const/4 v0, 0x0

    return v0
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 91
    const v0, 0x7f030040

    return v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 81
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 82
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 55
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f060050

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setTitle(I)V

    .line 61
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 63
    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 86
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onDetach()V

    .line 87
    return-void
.end method

.method onItemClickLV(I)V
    .locals 3
    .annotation build Lbutterknife/OnItemClick;
        value = {
            0x7f0d00b5
        }
    .end annotation

    .prologue
    .line 149
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr p1, v0

    .line 152
    :cond_0
    if-gez p1, :cond_1

    .line 156
    :goto_0
    return-void

    .line 155
    :cond_1
    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/ImageViewerActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "url"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADRESI:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 4

    .prologue
    .line 106
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 107
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    check-cast v0, Lcom/pinarsu/siparis/model/data/DUYURULAR_PARENT;

    .line 108
    iget-object v1, v0, Lcom/pinarsu/siparis/model/data/DUYURULAR_PARENT;->duyurularList:Ljava/util/List;

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    .line 109
    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/DUYURULAR_PARENT;->sertifikaList:Ljava/util/List;

    .line 110
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 111
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    .line 112
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;

    .line 113
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->PDF:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->PDF:Ljava/lang/String;

    const-string v3, "X"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 114
    :cond_1
    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 119
    :cond_2
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->setView()V

    .line 120
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 68
    invoke-super {p0, p1, p2}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 69
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 70
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->duyurularList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->sertifikalarList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 71
    :cond_1
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->setView()V

    .line 77
    :goto_0
    return-void

    .line 73
    :cond_2
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ANNOUNCEMENTS_AND_NEWS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/api/service/ServiceItem;-><init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V

    .line 74
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceBase;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/api/service/ServiceBase;-><init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V

    .line 75
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v2, v1, v0, v3}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;Landroid/support/v7/app/AppCompatActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 102
    return-void
.end method
