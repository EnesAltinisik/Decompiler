.class public Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;
.super Lcom/pinarsu/siparis/ui/fragment/BaseFragment;
.source "CampaignsFragment.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field campaignList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/KAMPANYALAR;",
            ">;"
        }
    .end annotation
.end field

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field tvNoRecord:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0104
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;-><init>()V

    .line 37
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 91
    const/4 v0, 0x0

    return v0
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 81
    const v0, 0x7f030041

    return v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 71
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 72
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 41
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 43
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 48
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v1, 0x7f060059

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setTitle(I)V

    .line 49
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 51
    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 76
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onDetach()V

    .line 77
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 56
    invoke-super {p0, p1, p2}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 57
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 58
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 59
    const-string v1, "campaignList"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->campaignList:Ljava/util/List;

    .line 61
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->campaignList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->campaignList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 62
    new-instance v0, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->campaignList:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    .line 63
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->lv:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 67
    :goto_0
    return-void

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;->tvNoRecord:Lcom/pinarsu/siparis/view/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 97
    return-void
.end method
