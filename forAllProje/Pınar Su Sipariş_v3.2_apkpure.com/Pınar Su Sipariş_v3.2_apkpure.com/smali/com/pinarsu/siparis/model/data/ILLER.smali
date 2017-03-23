.class public Lcom/pinarsu/siparis/model/data/ILLER;
.super Ljava/lang/Object;
.source "ILLER.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ILADI:Ljava/lang/String;

.field public ILKODU:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/pinarsu/siparis/model/data/ILLER;->ILADI:Ljava/lang/String;

    return-object v0
.end method
