.class Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "SendVerificationLastStepActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->clickBack()V

    .line 36
    return-void
.end method
