.class Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "SSSActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/SSSActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/SSSActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SSSActivity;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/activity/SSSActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SSSActivity$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/activity/SSSActivity;

    invoke-virtual {v0, p1}, Lcom/pinarsu/siparis/ui/activity/SSSActivity;->onClick1(Landroid/view/View;)V

    .line 39
    return-void
.end method
