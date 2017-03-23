.class Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;
.super Ljava/lang/Object;
.source "Order2BaseAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 100
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 124
    :goto_0
    return-void

    .line 104
    :pswitch_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget v1, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    .line 105
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MAKSIMUM_URUN_SAYISI:I

    .line 106
    if-ne v1, v0, :cond_0

    .line 107
    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v1, v1, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Tek sipari\u015fte "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " adetten fazla \u00fcr\u00fcn sat\u0131n alamazs\u0131n\u0131z."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget v1, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    .line 111
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->notifyDataSetChanged()V

    goto :goto_0

    .line 114
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 115
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget v2, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    .line 116
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    iget v0, v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    if-gtz v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/model/data/MALZEMELER;

    .line 118
    iget-object v2, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v2, v2, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->activity:Lcom/pinarsu/siparis/ui/activity/OrderActivity;

    invoke-virtual {v2, v0}, Lcom/pinarsu/siparis/ui/activity/OrderActivity;->addProductFromProductParentList(Lcom/pinarsu/siparis/model/data/MALZEMELER;)V

    .line 119
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->list:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 121
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/adapter/Order2BaseAdapter;->notifyDataSetChanged()V

    goto/16 :goto_0

    .line 100
    :pswitch_data_0
    .packed-switch 0x7f0d0150
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
