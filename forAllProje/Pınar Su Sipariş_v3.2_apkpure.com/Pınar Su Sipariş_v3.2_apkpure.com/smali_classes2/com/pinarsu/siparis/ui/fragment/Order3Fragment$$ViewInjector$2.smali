.class Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "Order3Fragment$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$2;->this$0:Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;->clickSelectCalendar()V

    .line 45
    return-void
.end method
