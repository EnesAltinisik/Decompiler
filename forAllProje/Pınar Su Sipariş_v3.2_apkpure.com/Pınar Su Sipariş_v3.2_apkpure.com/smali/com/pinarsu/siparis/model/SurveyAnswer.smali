.class public Lcom/pinarsu/siparis/model/SurveyAnswer;
.super Ljava/lang/Object;
.source "SurveyAnswer.java"


# instance fields
.field public answer:Ljava/lang/String;

.field public isChecked:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/pinarsu/siparis/model/SurveyAnswer;->answer:Ljava/lang/String;

    .line 20
    iput-boolean p2, p0, Lcom/pinarsu/siparis/model/SurveyAnswer;->isChecked:Z

    .line 21
    return-void
.end method
