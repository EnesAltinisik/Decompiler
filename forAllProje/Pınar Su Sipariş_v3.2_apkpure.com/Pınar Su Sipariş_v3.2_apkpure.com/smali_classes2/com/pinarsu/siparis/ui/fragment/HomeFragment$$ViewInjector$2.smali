.class Lcom/pinarsu/siparis/ui/fragment/HomeFragment$$ViewInjector$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "HomeFragment$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/HomeFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/HomeFragment;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/HomeFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/HomeFragment;)V
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$$ViewInjector$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/HomeFragment$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/HomeFragment$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;->clickCampaigns()V

    .line 32
    return-void
.end method
