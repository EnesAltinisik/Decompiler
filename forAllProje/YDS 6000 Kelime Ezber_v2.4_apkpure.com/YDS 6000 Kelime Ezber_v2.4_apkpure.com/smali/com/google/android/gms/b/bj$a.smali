.class Lcom/google/android/gms/b/bj$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/o$b;
.implements Lcom/google/android/gms/common/internal/o$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/bj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field protected a:Lcom/google/android/gms/b/bk;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue",
            "<",
            "Lcom/google/android/gms/b/aw$a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/os/HandlerThread;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/b/bj$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/b/bj$a;->c:Ljava/lang/String;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "GassClient"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/bj$a;->e:Landroid/os/HandlerThread;

    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Lcom/google/android/gms/b/bk;

    iget-object v1, p0, Lcom/google/android/gms/b/bj$a;->e:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p1, v1, p0, p0}, Lcom/google/android/gms/b/bk;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/o$b;Lcom/google/android/gms/common/internal/o$c;)V

    iput-object v0, p0, Lcom/google/android/gms/b/bj$a;->a:Lcom/google/android/gms/b/bk;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/bj$a;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p0}, Lcom/google/android/gms/b/bj$a;->c()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/aw$a;
    .locals 1

    const/16 v0, 0x7d0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/bj$a;->b(I)Lcom/google/android/gms/b/aw$a;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v1, Lcom/google/android/gms/b/aw$a;

    invoke-direct {v1}, Lcom/google/android/gms/b/aw$a;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/bj$a;->b()Lcom/google/android/gms/b/bp;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v1, Lcom/google/android/gms/b/bl;

    iget-object v2, p0, Lcom/google/android/gms/b/bj$a;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/b/bj$a;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/b/bl;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/bp;->a(Lcom/google/android/gms/b/bl;)Lcom/google/android/gms/b/bn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bn;->b()Lcom/google/android/gms/b/aw$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/bj$a;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/bj$a;->d()V

    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/bj$a;->d()V

    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/bj$a;->d()V

    iget-object v1, p0, Lcom/google/android/gms/b/bj$a;->e:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    throw v0
.end method

.method public a(Lcom/google/android/gms/common/a;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v1, Lcom/google/android/gms/b/aw$a;

    invoke-direct {v1}, Lcom/google/android/gms/b/aw$a;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(I)Lcom/google/android/gms/b/aw$a;
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    int-to-long v2, p1

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/aw$a;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/aw$a;

    invoke-direct {v0}, Lcom/google/android/gms/b/aw$a;-><init>()V

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method

.method protected b()Lcom/google/android/gms/b/bp;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->a:Lcom/google/android/gms/b/bk;

    invoke-virtual {v0}, Lcom/google/android/gms/b/bk;->k()Lcom/google/android/gms/b/bp;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method protected c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->a:Lcom/google/android/gms/b/bk;

    invoke-virtual {v0}, Lcom/google/android/gms/b/bk;->n()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->a:Lcom/google/android/gms/b/bk;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->a:Lcom/google/android/gms/b/bk;

    invoke-virtual {v0}, Lcom/google/android/gms/b/bk;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->a:Lcom/google/android/gms/b/bk;

    invoke-virtual {v0}, Lcom/google/android/gms/b/bk;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/bj$a;->a:Lcom/google/android/gms/b/bk;

    invoke-virtual {v0}, Lcom/google/android/gms/b/bk;->a()V

    :cond_1
    return-void
.end method
