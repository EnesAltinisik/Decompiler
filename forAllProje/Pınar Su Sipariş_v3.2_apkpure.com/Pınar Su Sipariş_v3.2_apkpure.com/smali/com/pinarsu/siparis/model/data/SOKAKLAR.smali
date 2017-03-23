.class public Lcom/pinarsu/siparis/model/data/SOKAKLAR;
.super Ljava/lang/Object;
.source "SOKAKLAR.java"


# instance fields
.field public MAHALLE_KODU:Ljava/lang/String;

.field public SOKAK_ADI:Ljava/lang/String;

.field public SOKAK_KODU:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/pinarsu/siparis/model/data/SOKAKLAR;->SOKAK_ADI:Ljava/lang/String;

    return-object v0
.end method
