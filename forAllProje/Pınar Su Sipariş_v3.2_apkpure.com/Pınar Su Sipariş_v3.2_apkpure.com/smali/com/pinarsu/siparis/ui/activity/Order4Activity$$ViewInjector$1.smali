.class Lcom/pinarsu/siparis/ui/activity/Order4Activity$$ViewInjector$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "Order4Activity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/Order4Activity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/Order4Activity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/Order4Activity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/Order4Activity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/Order4Activity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/Order4Activity;)V
    .locals 0

    .prologue
    .line 17
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity$$ViewInjector$1;->this$0:Lcom/pinarsu/siparis/ui/activity/Order4Activity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/Order4Activity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/Order4Activity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/Order4Activity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/Order4Activity;->clickOk()V

    .line 22
    return-void
.end method
