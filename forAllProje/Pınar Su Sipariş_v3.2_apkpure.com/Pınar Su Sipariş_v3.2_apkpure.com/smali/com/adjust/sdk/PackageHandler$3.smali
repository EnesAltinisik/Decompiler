.class Lcom/adjust/sdk/PackageHandler$3;
.super Ljava/lang/Object;
.source "PackageHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adjust/sdk/PackageHandler;->sendFirstPackage()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adjust/sdk/PackageHandler;


# direct methods
.method constructor <init>(Lcom/adjust/sdk/PackageHandler;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/adjust/sdk/PackageHandler$3;->this$0:Lcom/adjust/sdk/PackageHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/adjust/sdk/PackageHandler$3;->this$0:Lcom/adjust/sdk/PackageHandler;

    # invokes: Lcom/adjust/sdk/PackageHandler;->sendFirstInternal()V
    invoke-static {v0}, Lcom/adjust/sdk/PackageHandler;->access$200(Lcom/adjust/sdk/PackageHandler;)V

    .line 87
    return-void
.end method
