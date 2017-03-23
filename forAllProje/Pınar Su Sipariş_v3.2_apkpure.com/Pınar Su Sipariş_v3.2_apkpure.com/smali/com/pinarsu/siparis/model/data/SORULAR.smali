.class public Lcom/pinarsu/siparis/model/data/SORULAR;
.super Ljava/lang/Object;
.source "SORULAR.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public CEVAP_METNI:Ljava/lang/String;

.field public SORU_ID:J

.field public SORU_METNI:Ljava/lang/String;

.field public TEK_CEVAP_SECILSIN:Ljava/lang/String;

.field public answerObjectList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/SurveyAnswer;",
            ">;"
        }
    .end annotation
.end field

.field public questionList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "CEVAP_SECENEKLERI"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/pinarsu/siparis/model/data/SORULAR;->CEVAP_METNI:Ljava/lang/String;

    return-void
.end method
