.class public Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;
.super Landroid/widget/BaseAdapter;
.source "Order2BaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

.field private clickListener:Landroid/view/View$OnClickListener;

.field item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

.field list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MALZEMELER;",
            ">;"
        }
    .end annotation
.end field

.field view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;


# direct methods
.method public constructor <init>(Lcom/pinarsu/siparis/ui/activity/OrderActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pinarsu/siparis/ui/activity/OrderActivity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/MALZEMELER;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 97
    new-instance v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;-><init>(Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->clickListener:Landroid/view/View$OnClickListener;

    .line 33
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    .line 34
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    .line 35
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
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
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams",
            "DefaultLocale"
        }
    .end annotation

    .prologue
    .line 57
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 60
    if-nez p2, :cond_0

    .line 61
    new-instance v1, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    invoke-direct {v1}, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;-><init>()V

    iput-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    .line 62
    const v1, 0x7f03006a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 64
    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    const v0, 0x7f0d014d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvDesc:Landroid/widget/TextView;

    .line 65
    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    const v0, 0x7f0d014f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvQuantity:Landroid/widget/TextView;

    .line 66
    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    const v0, 0x7f0d014e

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvPrice:Landroid/widget/TextView;

    .line 67
    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    const v0, 0x7f0d0150

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvDecrease:Landroid/widget/TextView;

    .line 68
    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    const v0, 0x7f0d0151

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvIncrease:Landroid/widget/TextView;

    .line 69
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvIncrease:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvDecrease:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 77
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iput-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 79
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME_TANIMI:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME_TANIMI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 80
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvDesc:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v2, v2, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MALZEME_TANIMI:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    const-string v1, "-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 85
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "item.price : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v2, v2, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvPrice:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget-object v2, v2, Lcom/pinarsu/siparis/model/data/MALZEMELER;->FIYAT:Ljava/lang/String;

    invoke-static {v2}, Lcom/pinarsu/siparis/tools/Tools;->fFormat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " TL"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    :goto_2
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvQuantity:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->item:Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget v2, v2, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvDecrease:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvIncrease:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 93
    return-object p2

    .line 74
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iput-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    goto/16 :goto_0

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvDesc:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->view:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$ViewHolder;->tvPrice:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method
