.class Landroid/support/v4/b/m$2;
.super Landroid/support/v4/b/m$d;
.source "ModernAsyncTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/b/m;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/b/m$d",
        "<TParams;TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/b/m;


# direct methods
.method constructor <init>(Landroid/support/v4/b/m;)V
    .locals 1

    .prologue
    .line 123
    iput-object p1, p0, Landroid/support/v4/b/m$2;->a:Landroid/support/v4/b/m;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v4/b/m$d;-><init>(Landroid/support/v4/b/m$1;)V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 125
    iget-object v0, p0, Landroid/support/v4/b/m$2;->a:Landroid/support/v4/b/m;

    invoke-static {v0}, Landroid/support/v4/b/m;->a(Landroid/support/v4/b/m;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 127
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 128
    iget-object v0, p0, Landroid/support/v4/b/m$2;->a:Landroid/support/v4/b/m;

    iget-object v1, p0, Landroid/support/v4/b/m$2;->a:Landroid/support/v4/b/m;

    iget-object v2, p0, Landroid/support/v4/b/m$2;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v2}, Landroid/support/v4/b/m;->a([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v4/b/m;->a(Landroid/support/v4/b/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
