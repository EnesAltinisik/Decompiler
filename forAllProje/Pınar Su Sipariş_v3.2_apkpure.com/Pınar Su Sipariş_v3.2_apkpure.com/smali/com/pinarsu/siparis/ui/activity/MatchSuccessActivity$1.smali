.class Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity$1;
.super Landroid/os/CountDownTimer;
.source "MatchSuccessActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;JJ)V
    .locals 0

    .prologue
    .line 125
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MatchSuccessActivity;->clickImMatchSuccess()V

    .line 134
    return-void
.end method

.method public onTick(J)V
    .locals 3

    .prologue
    .line 128
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Kalan s\u00fcre : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    return-void
.end method
