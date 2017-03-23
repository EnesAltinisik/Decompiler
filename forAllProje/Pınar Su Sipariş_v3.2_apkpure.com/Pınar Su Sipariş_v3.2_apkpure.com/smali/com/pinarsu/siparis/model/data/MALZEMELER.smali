.class public Lcom/pinarsu/siparis/model/data/MALZEMELER;
.super Ljava/lang/Object;
.source "MALZEMELER.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public FIYAT:Ljava/lang/String;

.field public MAKSIMUM_URUN_SAYISI:I

.field public MALZEME:Ljava/lang/String;

.field public MALZEME_TANIMI:Ljava/lang/String;

.field public MIKTAR:I

.field public RESIM_ADRESI:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lcom/pinarsu/siparis/model/data/MALZEMELER;->MIKTAR:I

    return-void
.end method
