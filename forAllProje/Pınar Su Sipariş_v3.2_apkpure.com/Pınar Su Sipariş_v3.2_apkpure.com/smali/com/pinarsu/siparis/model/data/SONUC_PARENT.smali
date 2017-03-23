.class public Lcom/pinarsu/siparis/model/data/SONUC_PARENT;
.super Ljava/lang/Object;
.source "SONUC_PARENT.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public BASARILI_SONUC_MESAJI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "BASARILI_SONUC_MESAJI"
    .end annotation
.end field

.field public SONUC:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "SONUC"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
