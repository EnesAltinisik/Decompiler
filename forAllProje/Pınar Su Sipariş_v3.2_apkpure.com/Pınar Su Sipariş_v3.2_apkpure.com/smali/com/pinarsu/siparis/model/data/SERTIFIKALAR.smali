.class public Lcom/pinarsu/siparis/model/data/SERTIFIKALAR;
.super Ljava/lang/Object;
.source "SERTIFIKALAR.java"


# instance fields
.field public PDF:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "PDF"
    .end annotation
.end field

.field public SERTIFIKA_ADI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "SERTIFIKA_ADI"
    .end annotation
.end field

.field public SERTIFIKA_ADRESI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "SERTIFIKA_ADRESI"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
