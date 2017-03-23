.class Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$1;
.super Ljava/lang/Object;
.source "ViewPagerFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 75
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;)Lcom/pinarsu/siparis/interfaces/IClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IClickListener;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;)Lcom/pinarsu/siparis/interfaces/IClickListener;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->position:I
    invoke-static {v1}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;->access$100(Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/pinarsu/siparis/interfaces/IClickListener;->onClickListener(I)V

    .line 77
    :cond_0
    return-void
.end method
