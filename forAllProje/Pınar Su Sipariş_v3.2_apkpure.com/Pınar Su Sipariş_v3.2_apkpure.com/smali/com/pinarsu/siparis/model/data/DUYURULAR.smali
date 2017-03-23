.class public Lcom/pinarsu/siparis/model/data/DUYURULAR;
.super Ljava/lang/Object;
.source "DUYURULAR.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public DUYURU_BASLIK:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "DUYURU_BASLIK"
    .end annotation
.end field

.field public DUYURU_METNI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "DUYURU_METNI"
    .end annotation
.end field

.field public DUYURU_TARIHI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "DUYURU_TARIHI"
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
