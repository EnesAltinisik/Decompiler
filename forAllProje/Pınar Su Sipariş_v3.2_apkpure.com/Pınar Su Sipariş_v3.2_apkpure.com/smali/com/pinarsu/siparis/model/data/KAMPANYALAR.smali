.class public Lcom/pinarsu/siparis/model/data/KAMPANYALAR;
.super Ljava/lang/Object;
.source "KAMPANYALAR.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public GECERLI_ADRES:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "GECERLI_ADRES"
    .end annotation
.end field

.field public KAMPANYA_ADI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "KAMPANYA_ADI"
    .end annotation
.end field

.field public KAMPANYA_TANIMI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "KAMPANYA_TANIMI"
    .end annotation
.end field

.field public RESIM_ADRESI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "RESIM_ADRESI"
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
