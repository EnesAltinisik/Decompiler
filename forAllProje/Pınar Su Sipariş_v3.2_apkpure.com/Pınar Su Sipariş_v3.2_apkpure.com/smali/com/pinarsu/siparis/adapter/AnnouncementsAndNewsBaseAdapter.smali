.class public Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;
.super Landroid/widget/BaseAdapter;
.source "AnnouncementsAndNewsBaseAdapter.java"


# instance fields
.field private activity:Landroid/app/Activity;

.field private duyuruList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/DUYURULAR;",
            ">;"
        }
    .end annotation
.end field

.field private sertifikaList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/DUYURULAR;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->activity:Landroid/app/Activity;

    .line 31
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->duyuruList:Ljava/util/List;

    .line 32
    iput-object p3, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->sertifikaList:Ljava/util/List;

    .line 33
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->duyuruList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->sertifikaList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

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
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams",
            "DefaultLocale"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const v4, 0x7f0d00b1

    const v8, 0x7f0200db

    .line 55
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    .line 56
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->duyuruList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_4

    .line 61
    const v0, 0x7f030063

    invoke-virtual {v1, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 63
    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 65
    const v1, 0x7f0d011a

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 66
    const v2, 0x7f0d0145

    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 67
    const v3, 0x7f0d0101

    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 78
    iget-object v4, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->duyuruList:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;

    .line 81
    iget-object v6, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->DUYURU_BASLIK:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_0

    .line 82
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->DUYURU_BASLIK:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    :goto_0
    iget-object v0, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->DUYURU_METNI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v6, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->DUYURU_METNI:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    :goto_1
    iget-object v0, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->DUYURU_TARIHI:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->DUYURU_TARIHI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 93
    iget-object v0, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->DUYURU_TARIHI:Ljava/lang/String;

    const-string v3, ":"

    const-string v6, "."

    invoke-virtual {v0, v3, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    :goto_2
    iget-object v0, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->RESIM_ADRESI:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->RESIM_ADRESI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 100
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v2, v4, Lcom/pinarsu/siparis/model/data/DUYURULAR;->RESIM_ADRESI:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    :goto_3
    move-object v0, v5

    .line 126
    :goto_4
    return-object v0

    .line 84
    :cond_0
    const-string v6, ""

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 89
    :cond_1
    const-string v0, ""

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 95
    :cond_2
    const-string v0, ""

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 102
    :cond_3
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_3

    .line 106
    :cond_4
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->sertifikaList:Ljava/util/List;

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/AnnouncementsAndNewsBaseAdapter;->duyuruList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int v2, p1, v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;

    .line 108
    const v2, 0x7f030065

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 109
    const v1, 0x7f0d00d4

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 110
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 112
    iget-object v4, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADI:Ljava/lang/String;

    if-eqz v4, :cond_5

    iget-object v4, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADI:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    .line 114
    iget-object v4, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADI:Ljava/lang/String;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    :goto_5
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADRESI:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADRESI:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 118
    iget-object v2, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADRESI:Ljava/lang/String;

    const-string v4, " "

    const-string v5, "%20"

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADRESI:Ljava/lang/String;

    .line 120
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v2

    iget-object v4, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADRESI:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 121
    const-string v1, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "item.SERTIFIKA_ADRESI : "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;->SERTIFIKA_ADRESI:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_6
    move-object v0, v3

    .line 126
    goto/16 :goto_4

    .line 116
    :cond_5
    const-string v4, ""

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 123
    :cond_6
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_6
.end method
