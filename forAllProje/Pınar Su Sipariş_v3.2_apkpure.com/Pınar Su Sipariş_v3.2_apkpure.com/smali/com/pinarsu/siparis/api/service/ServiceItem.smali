.class public Lcom/pinarsu/siparis/api/service/ServiceItem;
.super Ljava/lang/Object;
.source "ServiceItem.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public object:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public parameterList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;",
            ">;"
        }
    .end annotation
.end field

.field public serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

.field public type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;


# direct methods
.method public constructor <init>(Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    .line 31
    iput-object p1, p0, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 32
    return-void
.end method
