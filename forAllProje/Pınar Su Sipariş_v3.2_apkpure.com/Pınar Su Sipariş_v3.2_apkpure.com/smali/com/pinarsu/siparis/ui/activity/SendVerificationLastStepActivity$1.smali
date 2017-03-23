.class Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;
.super Ljava/lang/Object;
.source "SendVerificationLastStepActivity.java"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 3

    .prologue
    .line 85
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v0

    .line 86
    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->linearTimer:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 88
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v1, v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->timerProgressbar:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getWidth()I

    move-result v1

    iput v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->progressBarWidth:I

    .line 89
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v1, v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->progressBarWidth:I

    int-to-float v1, v1

    const/high16 v2, 0x43340000    # 180.0f

    div-float/2addr v1, v2

    iput v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->progressAPieceWidth:F

    .line 91
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    const/16 v1, 0xb4

    iput v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    .line 93
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    # getter for: Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->countDownTimer:Landroid/os/CountDownTimer;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->access$000(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;)Landroid/os/CountDownTimer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 95
    :cond_0
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "v.getX() : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    return-void
.end method
