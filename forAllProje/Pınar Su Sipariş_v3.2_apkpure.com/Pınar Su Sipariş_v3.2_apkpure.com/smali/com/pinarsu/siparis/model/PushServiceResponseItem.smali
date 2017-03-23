.class public Lcom/pinarsu/siparis/model/PushServiceResponseItem;
.super Ljava/lang/Object;
.source "PushServiceResponseItem.java"


# instance fields
.field private Message:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Message"
    .end annotation
.end field

.field private Succeed:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Succeed"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/pinarsu/siparis/model/PushServiceResponseItem;->Message:Ljava/lang/String;

    return-object v0
.end method

.method public getSucceed()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/pinarsu/siparis/model/PushServiceResponseItem;->Succeed:Ljava/lang/Integer;

    return-object v0
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/pinarsu/siparis/model/PushServiceResponseItem;->Message:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setSucceed(Ljava/lang/Integer;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/pinarsu/siparis/model/PushServiceResponseItem;->Succeed:Ljava/lang/Integer;

    .line 34
    return-void
.end method
