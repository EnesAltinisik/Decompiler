.class public Lcom/pinarsu/siparis/model/data/CEVAPLAR;
.super Ljava/lang/Object;
.source "CEVAPLAR.java"


# instance fields
.field public CEVAP_METNI:Ljava/lang/String;

.field public SORU_ID:I

.field public answerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/SurveyAnswer;",
            ">;"
        }
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
