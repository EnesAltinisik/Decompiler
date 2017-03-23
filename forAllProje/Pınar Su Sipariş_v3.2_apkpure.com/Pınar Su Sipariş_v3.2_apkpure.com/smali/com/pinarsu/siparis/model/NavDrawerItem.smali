.class public Lcom/pinarsu/siparis/model/NavDrawerItem;
.super Ljava/lang/Object;
.source "NavDrawerItem.java"


# instance fields
.field public drawableId:Ljava/lang/Integer;

.field public isActive:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/model/NavDrawerItem;->drawableId:Ljava/lang/Integer;

    .line 19
    iput-boolean p2, p0, Lcom/pinarsu/siparis/model/NavDrawerItem;->isActive:Z

    .line 21
    return-void
.end method
