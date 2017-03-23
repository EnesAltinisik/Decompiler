.class public Lcom/pinarsu/siparis/model/data/MUSTERI_ARAMA_ADRES;
.super Ljava/lang/Object;
.source "MUSTERI_ARAMA_ADRES.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public address:Lcom/pinarsu/siparis/model/data/ADRES;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ADRES"
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
