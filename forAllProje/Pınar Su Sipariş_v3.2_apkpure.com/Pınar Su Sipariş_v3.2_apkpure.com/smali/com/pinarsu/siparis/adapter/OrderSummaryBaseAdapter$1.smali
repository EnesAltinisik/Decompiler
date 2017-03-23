.class Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$1;
.super Ljava/lang/Object;
.source "OrderSummaryBaseAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 133
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 134
    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;

    iget-object v1, v1, Lcom/pinarsu/siparis/adapter/OrderSummaryBaseAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;

    invoke-interface {v1, v0}, Lcom/pinarsu/siparis/interfaces/IClickListener;->onClickListener(I)V

    .line 135
    return-void
.end method
