.class Lcom/pinarsu/siparis/adapter/AllAddressAdapter$1;
.super Ljava/lang/Object;
.source "AllAddressAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/adapter/AllAddressAdapter;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/adapter/AllAddressAdapter;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/AllAddressAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter$1;->this$0:Lcom/pinarsu/siparis/adapter/AllAddressAdapter;

    iget-object v0, v0, Lcom/pinarsu/siparis/adapter/AllAddressAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;->onObject(Ljava/lang/Object;I)V

    .line 97
    return-void
.end method
