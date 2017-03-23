.class public interface abstract Lcom/pinarsu/siparis/interfaces/IServicePush;
.super Ljava/lang/Object;
.source "IServicePush.java"


# virtual methods
.method public abstract getChangeStatus(Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;Lretrofit/Callback;)V
    .param p1    # Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;
        .annotation runtime Lretrofit/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;",
            "Lretrofit/Callback",
            "<",
            "Lcom/pinarsu/siparis/model/PushServiceResponseItem;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/Headers;
        value = {
            "Content-Type: application/json;charset=UTF-8"
        }
    .end annotation

    .annotation runtime Lretrofit/http/POST;
        value = "/changestatus"
    .end annotation
.end method

.method public abstract getPushToken(Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;Lretrofit/Callback;)V
    .param p1    # Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;
        .annotation runtime Lretrofit/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;",
            "Lretrofit/Callback",
            "<",
            "Lcom/pinarsu/siparis/model/PushServiceResponseItem;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/Headers;
        value = {
            "Content-Type: application/json;charset=UTF-8"
        }
    .end annotation

    .annotation runtime Lretrofit/http/POST;
        value = "/savetoken"
    .end annotation
.end method
