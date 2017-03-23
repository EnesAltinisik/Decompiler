.class Lcom/pinarsu/siparis/gcm/GCMRegistrationService$1;
.super Ljava/lang/Object;
.source "GCMRegistrationService.java"

# interfaces
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->getPushToken(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit/Callback",
        "<",
        "Lcom/pinarsu/siparis/model/PushServiceResponseItem;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/gcm/GCMRegistrationService;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/gcm/GCMRegistrationService;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/pinarsu/siparis/gcm/GCMRegistrationService$1;->this$0:Lcom/pinarsu/siparis/gcm/GCMRegistrationService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 3

    .prologue
    .line 91
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Token dan hata d\u00f6nd\u00fc.getPushToken : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lretrofit/RetrofitError;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    return-void
.end method

.method public success(Lcom/pinarsu/siparis/model/PushServiceResponseItem;Lretrofit/client/Response;)V
    .locals 3

    .prologue
    .line 82
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Token al\u0131nd\u0131.  tokenItem.getSucceed() :  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pinarsu/siparis/model/PushServiceResponseItem;->getSucceed()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    invoke-virtual {p1}, Lcom/pinarsu/siparis/model/PushServiceResponseItem;->getSucceed()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 84
    iget-object v0, p0, Lcom/pinarsu/siparis/gcm/GCMRegistrationService$1;->this$0:Lcom/pinarsu/siparis/gcm/GCMRegistrationService;

    invoke-static {v0}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService;->stopService(Landroid/content/Context;)V

    .line 87
    :goto_0
    return-void

    .line 86
    :cond_0
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Token dan hata d\u00f6nd\u00fc.getPushToken : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pinarsu/siparis/model/PushServiceResponseItem;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .prologue
    .line 79
    check-cast p1, Lcom/pinarsu/siparis/model/PushServiceResponseItem;

    invoke-virtual {p0, p1, p2}, Lcom/pinarsu/siparis/gcm/GCMRegistrationService$1;->success(Lcom/pinarsu/siparis/model/PushServiceResponseItem;Lretrofit/client/Response;)V

    return-void
.end method
