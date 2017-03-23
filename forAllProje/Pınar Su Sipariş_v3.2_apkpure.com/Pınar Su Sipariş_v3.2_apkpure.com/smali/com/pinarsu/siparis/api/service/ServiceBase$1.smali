.class Lcom/pinarsu/siparis/api/service/ServiceBase$1;
.super Ljava/lang/Object;
.source "ServiceBase.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/ISapResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/api/service/ServiceBase;->request(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/api/service/ServiceBase;

.field final synthetic val$serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$1;->this$0:Lcom/pinarsu/siparis/api/service/ServiceBase;

    iput-object p2, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$1;->val$serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccessfullResult(Lorg/b/a/h;)V
    .locals 2

    .prologue
    .line 66
    .line 69
    :try_start_0
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$1;->this$0:Lcom/pinarsu/siparis/api/service/ServiceBase;

    iget-object v1, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$1;->val$serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

    # invokes: Lcom/pinarsu/siparis/api/service/ServiceBase;->parse(Lorg/b/a/h;Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    invoke-static {v0, p1, v1}, Lcom/pinarsu/siparis/api/service/ServiceBase;->access$000(Lcom/pinarsu/siparis/api/service/ServiceBase;Lorg/b/a/h;Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :goto_0
    return-void

    .line 70
    :catch_0
    move-exception v0

    .line 71
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$1;->val$serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    invoke-direct {v1}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>()V

    iput-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    .line 72
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$1;->val$serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v1, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    iput-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    goto :goto_0
.end method

.method public onUnsuccessfullResult(Lcom/pinarsu/siparis/api/service/ServiceErrorItem;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase$1;->val$serviceItem:Lcom/pinarsu/siparis/api/service/ServiceItem;

    iput-object p1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    .line 79
    return-void
.end method
