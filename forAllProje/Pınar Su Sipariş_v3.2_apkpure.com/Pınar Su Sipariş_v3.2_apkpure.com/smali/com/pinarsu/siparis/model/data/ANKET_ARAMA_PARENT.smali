.class public Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;
.super Ljava/lang/Object;
.source "ANKET_ARAMA_PARENT.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ANKET_ID:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ANKET_ID"
    .end annotation
.end field

.field public SORU_SAYISI:I

.field public list:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "SORULAR"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/SORULAR;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
