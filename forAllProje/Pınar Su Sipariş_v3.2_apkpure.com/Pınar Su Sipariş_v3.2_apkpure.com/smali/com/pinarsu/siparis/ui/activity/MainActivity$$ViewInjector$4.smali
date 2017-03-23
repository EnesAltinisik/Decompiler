.class Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$4;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "MainActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/MainActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/MainActivity;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$4;->this$0:Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$4;->val$target:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity$$ViewInjector$4;->val$target:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0, p1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->onClick(Landroid/view/View;)V

    .line 56
    return-void
.end method
