.class public Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;
.super Ljava/lang/Object;
.source "PushServiceSaveTokenItem.java"


# instance fields
.field private devicetoken:Ljava/lang/String;

.field private isIOS:I

.field private phone:Ljava/lang/String;

.field private uniqueid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;->phone:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;->isIOS:I

    .line 22
    iput-object p1, p0, Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;->uniqueid:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;->devicetoken:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/pinarsu/siparis/model/PushServiceSaveTokenItem;->phone:Ljava/lang/String;

    .line 25
    return-void
.end method
