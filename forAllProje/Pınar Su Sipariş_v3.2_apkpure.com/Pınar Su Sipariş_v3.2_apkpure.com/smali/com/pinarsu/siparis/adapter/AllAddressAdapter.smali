.class public Lcom/pinarsu/siparis/adapter/AllAddressAdapter;
.super Landroid/widget/BaseAdapter;
.source "AllAddressAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field activity:Landroid/app/Activity;

.field delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

.field item:Lcom/pinarsu/siparis/model/data/ADRES;

.field list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/ADRES;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/ADRES;",
            ">;",
            "Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;",
            ")V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->activity:Landroid/app/Activity;

    .line 35
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->list:Ljava/util/List;

    .line 36
    iput-object p3, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    .line 37
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 52
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 58
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 62
    if-nez p2, :cond_1

    .line 63
    new-instance v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;

    invoke-direct {v1}, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;-><init>()V

    .line 64
    const v2, 0x7f030069

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 66
    const v0, 0x7f0d00b1

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    .line 67
    const v0, 0x7f0d0101

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    .line 68
    const v0, 0x7f0d014b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imEdit:Landroid/widget/ImageView;

    .line 70
    const v0, 0x7f0d014c

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    .line 71
    const v0, 0x7f0d014a

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imRightArrow:Landroid/widget/ImageView;

    .line 72
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 75
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/ADRES;

    iput-object v0, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->item:Lcom/pinarsu/siparis/model/data/ADRES;

    .line 78
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->item:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/ADRES;->ADRES_ETIKETI:Ljava/lang/String;

    .line 79
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->item:Lcom/pinarsu/siparis/model/data/ADRES;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/model/data/ADRES;->getAddressWithoutCityTown()Ljava/lang/String;

    move-result-object v0

    .line 81
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->item:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v2, v2, Lcom/pinarsu/siparis/model/data/ADRES;->ILCE_ADI:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " / "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->item:Lcom/pinarsu/siparis/model/data/ADRES;

    iget-object v2, v2, Lcom/pinarsu/siparis/model/data/ADRES;->IL_ADI:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 87
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imEdit:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 89
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 92
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imEdit:Landroid/widget/ImageView;

    const v2, 0x7f0200a2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 93
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imEdit:Landroid/widget/ImageView;

    new-instance v2, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$1;

    invoke-direct {v2, p0}, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$1;-><init>(Lcom/pinarsu/siparis/adapter/AllAddressAdapter;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imEdit:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 101
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 102
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    new-instance v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$2;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$2;-><init>(Lcom/pinarsu/siparis/adapter/AllAddressAdapter;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    return-object p2

    .line 74
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;

    move-object v1, v0

    goto/16 :goto_0

    .line 83
    :cond_2
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    invoke-static {v2, v0}, Lcom/pinarsu/siparis/tools/Tools;->setTextViewUnderLine(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_1
.end method
