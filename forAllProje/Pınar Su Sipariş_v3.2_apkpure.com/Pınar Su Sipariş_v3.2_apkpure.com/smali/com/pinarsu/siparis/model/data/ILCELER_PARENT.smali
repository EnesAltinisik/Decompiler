.class public Lcom/pinarsu/siparis/model/data/ILCELER_PARENT;
.super Ljava/lang/Object;
.source "ILCELER_PARENT.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public list:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ILCELER"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/data/ILCELER;",
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
