.class Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$3;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "RightDrawerFragment$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$3;->this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$3;->val$target:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$$ViewInjector$3;->val$target:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->clickBlob()V

    .line 41
    return-void
.end method
