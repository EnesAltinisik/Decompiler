.class public Lcom/pinarsu/siparis/model/data/ILCELER;
.super Ljava/lang/Object;
.source "ILCELER.java"


# instance fields
.field public ILCE_ADI:Ljava/lang/String;

.field public ILCE_KODU:Ljava/lang/String;

.field public IL_KODU:Ljava/lang/String;


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
    iget-object v0, p0, Lcom/pinarsu/siparis/model/data/ILCELER;->ILCE_ADI:Ljava/lang/String;

    return-object v0
.end method
