.class Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "ProfileFragment$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)V
    .locals 0

    .prologue
    .line 14
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->clickMyRegisteredAddress()V

    .line 19
    return-void
.end method
