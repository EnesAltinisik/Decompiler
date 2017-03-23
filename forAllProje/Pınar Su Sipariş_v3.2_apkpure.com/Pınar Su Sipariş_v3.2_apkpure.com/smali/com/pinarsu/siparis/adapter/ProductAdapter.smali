.class public Lcom/pinarsu/siparis/adapter/ProductAdapter;
.super Landroid/widget/BaseAdapter;
.source "ProductAdapter.java"


# instance fields
.field inflater:Landroid/view/LayoutInflater;

.field private item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

.field private final list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MALZEMELER;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v7/app/AppCompatActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v7/app/AppCompatActivity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MALZEMELER;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 32
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->list:Ljava/util/List;

    .line 33
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 34
    return-void
.end method


# virtual methods
.method public clearAll()V
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 38
    invoke-virtual {p0}, Lcom/pinarsu/siparis/adapter/ProductAdapter;->notifyDataSetChanged()V

    .line 39
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->list:Ljava/util/List;

    if-nez v0, :cond_0

    .line 44
    const/4 v0, 0x0

    .line 45
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 55
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const v6, 0x7f020069

    .line 61
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->inflater:Landroid/view/LayoutInflater;

    const v1, 0x7f03006c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 62
    const v0, 0x7f0d00b1

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    .line 63
    const v1, 0x7f0d0101

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/pinarsu/siparis/view/TextView;

    .line 64
    const v2, 0x7f0d011a

    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 66
    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->list:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iput-object v3, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 68
    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v3, v3, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME_TANIMI:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v5, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v5, v5, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME_TANIMI:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    const-string v3, "-1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v3, v3, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " TL"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->RESIM_ADRESI:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->RESIM_ADRESI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 79
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/ProductAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v1, v1, Lcom/pinarsu/siparis/model/data/MALZEMELER;->RESIM_ADRESI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 82
    :goto_2
    return-object v4

    .line 71
    :cond_0
    const-string v3, ""

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 76
    :cond_1
    const-string v0, ""

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_2
.end method
