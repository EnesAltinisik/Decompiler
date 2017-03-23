.class public Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;
.super Ljava/lang/Object;
.source "ServiceItemRequestParameter.java"


# instance fields
.field public paramName:Ljava/lang/String;

.field public paramValue:Ljava/lang/String;

.field public soapObject:Lorg/b/a/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;->paramName:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;->paramValue:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/b/a/h;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;->paramName:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;->soapObject:Lorg/b/a/h;

    .line 24
    return-void
.end method
