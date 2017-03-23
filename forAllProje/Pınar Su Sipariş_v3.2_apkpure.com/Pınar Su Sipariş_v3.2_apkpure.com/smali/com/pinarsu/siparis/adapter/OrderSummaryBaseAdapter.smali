.class public Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;
.super Landroid/widget/BaseAdapter;
.source "OrderSummaryBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field activity:Landroid/app/Activity;

.field delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

.field item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

.field list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SIPARISLER;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SIPARISLER;",
            ">;",
            "Lcom/pinarsu/siparis/interfaces/IClickListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->activity:Landroid/app/Activity;

    .line 39
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->list:Ljava/util/List;

    .line 40
    iput-object p3, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    .line 41
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 56
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams",
            "DefaultLocale"
        }
    .end annotation

    .prologue
    const v6, 0x7f020069

    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 62
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 66
    if-nez p2, :cond_1

    .line 67
    new-instance v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;

    invoke-direct {v1}, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;-><init>()V

    .line 68
    const v2, 0x7f03006b

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 70
    const v0, 0x7f0d00b1

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    .line 71
    const v0, 0x7f0d0152

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvStatus:Lcom/pinarsu/siparis/view/TextView;

    .line 72
    const v0, 0x7f0d011a

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->imPhoto:Landroid/widget/ImageView;

    .line 73
    const v0, 0x7f0d0145

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvDate:Lcom/pinarsu/siparis/view/TextView;

    .line 74
    const v0, 0x7f0d00aa

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvTime:Lcom/pinarsu/siparis/view/TextView;

    .line 75
    const v0, 0x7f0d014f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvQuantity:Lcom/pinarsu/siparis/view/TextView;

    .line 76
    const v0, 0x7f0d014c

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    .line 77
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 80
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iput-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    .line 83
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->MALZEMEADI:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->MALZEMEADI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 84
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v3, v3, Lcom/pinarsu/siparis/model/data/SIPARISLER;->MALZEMEADI:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    :goto_1
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIPARIS_DURUMU:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIPARIS_DURUMU:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 89
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvStatus:Lcom/pinarsu/siparis/view/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v3, v3, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIPARIS_DURUMU:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    :goto_2
    const-string v0, "MNTTAG"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "item.SIP_TARIH : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v3, v3, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIP_TARIH:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIP_TARIH:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIP_TARIH:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 95
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIP_TARIH:Ljava/lang/String;

    .line 96
    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v0, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateTime(Ljava/lang/String;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/util/Calendar;

    move-result-object v0

    .line 98
    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->DATESLASH:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v0, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateWithFormat(Ljava/util/Calendar;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/lang/String;

    move-result-object v0

    .line 99
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvDate:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    :goto_3
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIP_SAAT:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIP_SAAT:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 105
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->SIP_SAAT:Ljava/lang/String;

    .line 106
    const-string v2, ":00:00"

    const-string v3, ":00"

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v2, v5, :cond_0

    .line 108
    const/4 v2, 0x5

    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 110
    :cond_0
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvTime:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    :goto_4
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->MIKTAR:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->MIKTAR:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 115
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvQuantity:Lcom/pinarsu/siparis/view/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v3, v3, Lcom/pinarsu/siparis/model/data/SIPARISLER;->MIKTAR:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " Adet"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    :goto_5
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->RESIM_ADRESI:Ljava/lang/String;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->RESIM_ADRESI:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 121
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v2, v2, Lcom/pinarsu/siparis/model/data/SIPARISLER;->RESIM_ADRESI:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->imPhoto:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 124
    :goto_6
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->IPTAL_EDILEBILIR:Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->item:Lcom/pinarsu/siparis/model/data/SIPARISLER;

    iget-object v0, v0, Lcom/pinarsu/siparis/model/data/SIPARISLER;->IPTAL_EDILEBILIR:Ljava/lang/String;

    const-string v2, "X"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 126
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 130
    :goto_7
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    new-instance v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$1;-><init>(Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    return-object p2

    .line 79
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;

    move-object v1, v0

    goto/16 :goto_0

    .line 86
    :cond_2
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 91
    :cond_3
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvStatus:Lcom/pinarsu/siparis/view/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 101
    :cond_4
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvDate:Lcom/pinarsu/siparis/view/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 112
    :cond_5
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvTime:Lcom/pinarsu/siparis/view/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 117
    :cond_6
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->tvQuantity:Lcom/pinarsu/siparis/view/TextView;

    const-string v2, "0 Adet"

    invoke-virtual {v0, v2}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 123
    :cond_7
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->imPhoto:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_6

    .line 128
    :cond_8
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_7
.end method
