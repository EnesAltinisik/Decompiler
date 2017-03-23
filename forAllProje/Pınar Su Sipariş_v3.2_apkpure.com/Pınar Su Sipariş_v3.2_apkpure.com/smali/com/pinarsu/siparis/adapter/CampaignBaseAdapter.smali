.class public Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;
.super Landroid/widget/BaseAdapter;
.source "CampaignBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private activity:Landroid/app/Activity;

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/KAMPANYALAR;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/KAMPANYALAR;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;->activity:Landroid/app/Activity;

    .line 34
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;->list:Ljava/util/List;

    .line 35
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 49
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams",
            "DefaultLocale"
        }
    .end annotation

    .prologue
    const v5, 0x7f020069

    .line 55
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 57
    if-nez p2, :cond_0

    .line 58
    new-instance v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;

    invoke-direct {v1}, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;-><init>()V

    .line 59
    const v2, 0x7f030064

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 60
    const v0, 0x7f0d0146

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvBarTitle:Landroid/widget/TextView;

    .line 62
    const v0, 0x7f0d0101

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    .line 63
    const v0, 0x7f0d00b2

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvAddress:Landroid/widget/TextView;

    .line 64
    const v0, 0x7f0d00d4

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->im:Landroid/widget/ImageView;

    .line 65
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 70
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;

    .line 72
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->KAMPANYA_ADI:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->KAMPANYA_ADI:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 73
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvBarTitle:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->KAMPANYA_ADI:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    :goto_1
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->KAMPANYA_TANIMI:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->KAMPANYA_TANIMI:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 83
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->KAMPANYA_TANIMI:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    :goto_2
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->GECERLI_ADRES:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->GECERLI_ADRES:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 90
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvAddress:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->GECERLI_ADRES:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    :goto_3
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->RESIM_ADRESI:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->RESIM_ADRESI:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 95
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v2

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/KAMPANYALAR;->RESIM_ADRESI:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->im:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 100
    :goto_4
    return-object p2

    .line 68
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;

    move-object v1, v0

    goto/16 :goto_0

    .line 75
    :cond_1
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvBarTitle:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 86
    :cond_2
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 92
    :cond_3
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->tvAddress:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 97
    :cond_4
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, v1, Lcom/pinarsu/siparis/adapter/CampaignBaseAdapter$ViewHolder;->im:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_4
.end method
