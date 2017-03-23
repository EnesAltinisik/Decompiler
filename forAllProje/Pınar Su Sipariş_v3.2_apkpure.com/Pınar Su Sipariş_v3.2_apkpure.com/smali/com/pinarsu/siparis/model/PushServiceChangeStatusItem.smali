.class public Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;
.super Ljava/lang/Object;
.source "PushServiceChangeStatusItem.java"


# instance fields
.field private devicetoken:Ljava/lang/String;

.field private isActive:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x1

    iput v0, p0, Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;->isActive:I

    .line 20
    iput-object p1, p0, Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;->devicetoken:Ljava/lang/String;

    .line 21
    iput p2, p0, Lcom/pinarsu/siparis/model/PushServiceChangeStatusItem;->isActive:I

    .line 22
    return-void
.end method
