.class Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector$1;
.super Ljava/lang/Object;
.source "ProductListActivity$$ViewInjector.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/ProductListActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/ProductListActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/ProductListActivity;)V
    .locals 0

    .prologue
    .line 15
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector$1;->this$0:Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/ProductListActivity;

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
    .line 22
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ProductListActivity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/ProductListActivity;

    invoke-virtual {v0, p3}, Lcom/pinarsu/siparis/ui/activity/ProductListActivity;->onItemClick(I)V

    .line 23
    return-void
.end method
