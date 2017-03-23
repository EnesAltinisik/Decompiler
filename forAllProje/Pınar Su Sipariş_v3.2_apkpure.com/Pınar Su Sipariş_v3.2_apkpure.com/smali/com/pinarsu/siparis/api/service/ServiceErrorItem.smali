.class public Lcom/pinarsu/siparis/api/service/ServiceErrorItem;
.super Ljava/lang/Object;
.source "ServiceErrorItem.java"


# instance fields
.field public detail:Ljava/lang/String;

.field public isCrashed:Z

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->isCrashed:Z

    .line 21
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->isCrashed:Z

    .line 15
    iput-object p1, p0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->title:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    .line 17
    return-void
.end method
