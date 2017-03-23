.class Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;
.super Landroid/os/CountDownTimer;
.source "SendVerificationLastStepActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;JJ)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 4

    .prologue
    .line 120
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    .line 121
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->timerProgressbar:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v1, v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 122
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->tvTimer:Lcom/pinarsu/siparis/view/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v2, v2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sn"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    const-string v1, "Zaman A\u015f\u0131m\u0131\nL\u00fctfen tekrar deneyiniz"

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;Lcom/pinarsu/siparis/interfaces/IDismissListener;I)V

    .line 124
    return-void
.end method

.method public onTick(J)V
    .locals 3

    .prologue
    .line 106
    const-string v0, "Log_tag"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tick of Progress : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->timerProgressbar:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v1, v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 109
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->tvTimer:Lcom/pinarsu/siparis/view/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v2, v2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sn"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v1, v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->linearTimer:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getX()F

    move-result v1

    iput v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->X:F

    .line 111
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v1, v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->X:F

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v2, v2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->progressAPieceWidth:F

    sub-float/2addr v1, v2

    iput v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->X:F

    .line 112
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v0, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->X:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->linearTimer:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v1, v1, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->X:F

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setX(F)V

    .line 114
    :cond_0
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "linearTimer X : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v2, v2, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->X:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;

    iget v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lcom/pinarsu/siparis/ui/activity/SendVerificationLastStepActivity;->remaningTime:I

    .line 116
    return-void
.end method
