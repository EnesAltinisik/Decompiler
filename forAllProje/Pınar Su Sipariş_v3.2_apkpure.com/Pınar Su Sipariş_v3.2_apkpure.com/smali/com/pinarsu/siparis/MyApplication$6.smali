.class Lcom/pinarsu/siparis/MyApplication$6;
.super Ljava/lang/Object;
.source "MyApplication.java"

# interfaces
.implements Lcom/adjust/sdk/OnDeeplinkResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/MyApplication;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/MyApplication;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/MyApplication;)V
    .locals 0

    .prologue
    .line 125
    iput-object p1, p0, Lcom/pinarsu/siparis/MyApplication$6;->this$0:Lcom/pinarsu/siparis/MyApplication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public launchReceivedDeeplink(Landroid/net/Uri;)Z
    .locals 3

    .prologue
    .line 128
    const-string v0, "example"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deeplink to open: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    const/4 v0, 0x1

    return v0
.end method
