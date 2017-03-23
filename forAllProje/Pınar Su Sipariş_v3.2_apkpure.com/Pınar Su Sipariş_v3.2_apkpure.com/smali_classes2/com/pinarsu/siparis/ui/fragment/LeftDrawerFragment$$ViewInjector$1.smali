.class Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$$ViewInjector$1;
.super Ljava/lang/Object;
.source "LeftDrawerFragment$$ViewInjector.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;)V
    .locals 0

    .prologue
    .line 14
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$$ViewInjector$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 21
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;

    invoke-virtual {v0, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->itemClick(Landroid/view/View;I)V

    .line 22
    return-void
.end method
