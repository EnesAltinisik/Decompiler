.class Lcom/pinarsu/siparis/MyApplication$4;
.super Ljava/lang/Object;
.source "MyApplication.java"

# interfaces
.implements Lcom/adjust/sdk/OnSessionTrackingSucceededListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/MyApplication;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/MyApplication;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/MyApplication;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/pinarsu/siparis/MyApplication$4;->this$0:Lcom/pinarsu/siparis/MyApplication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinishedSessionTrackingSucceeded(Lcom/adjust/sdk/AdjustSessionSuccess;)V
    .locals 3

    .prologue
    .line 112
    const-string v0, "example"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "success session tracking: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/adjust/sdk/AdjustSessionSuccess;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    return-void
.end method
