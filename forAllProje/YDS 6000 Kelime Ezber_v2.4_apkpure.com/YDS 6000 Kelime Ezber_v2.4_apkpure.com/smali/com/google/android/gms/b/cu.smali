.class public Lcom/google/android/gms/b/cu;
.super Lcom/google/android/gms/b/cy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/cu$a;,
        Lcom/google/android/gms/b/cu$b;,
        Lcom/google/android/gms/b/cu$c;,
        Lcom/google/android/gms/b/cu$d;
    }
.end annotation


# static fields
.field private static final j:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field private a:Lcom/google/android/gms/b/cu$d;

.field private b:Lcom/google/android/gms/b/cu$d;

.field private final c:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue",
            "<",
            "Ljava/util/concurrent/FutureTask",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/util/concurrent/FutureTask",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final f:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final g:Ljava/lang/Object;

.field private final h:Ljava/util/concurrent/Semaphore;

.field private volatile i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/high16 v2, -0x8000000000000000L

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/google/android/gms/b/cu;->j:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/b/cv;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cy;-><init>(Lcom/google/android/gms/b/cv;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/cu;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/b/cu;->h:Ljava/util/concurrent/Semaphore;

    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/cu;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/cu;->d:Ljava/util/concurrent/BlockingQueue;

    new-instance v0, Lcom/google/android/gms/b/cu$b;

    const-string v1, "Thread death: Uncaught exception on worker thread"

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/b/cu$b;-><init>(Lcom/google/android/gms/b/cu;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/cu;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    new-instance v0, Lcom/google/android/gms/b/cu$b;

    const-string v1, "Thread death: Uncaught exception on network thread"

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/b/cu$b;-><init>(Lcom/google/android/gms/b/cu;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/cu;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/cu;Lcom/google/android/gms/b/cu$d;)Lcom/google/android/gms/b/cu$d;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/b/cu;)Ljava/util/concurrent/Semaphore;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->h:Ljava/util/concurrent/Semaphore;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/cu$c;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/cu$c",
            "<*>;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/b/cu;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/cu;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/cu$d;

    const-string v2, "Measurement Worker"

    iget-object v3, p0, Lcom/google/android/gms/b/cu;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0, p0, v2, v3}, Lcom/google/android/gms/b/cu$d;-><init>(Lcom/google/android/gms/b/cu;Ljava/lang/String;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    iget-object v2, p0, Lcom/google/android/gms/b/cu;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/cu$d;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cu$d;->start()V

    :goto_0
    monitor-exit v1

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cu$d;->a()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Ljava/util/concurrent/FutureTask;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/FutureTask",
            "<*>;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/b/cu;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/cu;->d:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->b:Lcom/google/android/gms/b/cu$d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/cu$d;

    const-string v2, "Measurement Network"

    iget-object v3, p0, Lcom/google/android/gms/b/cu;->d:Ljava/util/concurrent/BlockingQueue;

    invoke-direct {v0, p0, v2, v3}, Lcom/google/android/gms/b/cu$d;-><init>(Lcom/google/android/gms/b/cu;Ljava/lang/String;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/google/android/gms/b/cu;->b:Lcom/google/android/gms/b/cu$d;

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->b:Lcom/google/android/gms/b/cu$d;

    iget-object v2, p0, Lcom/google/android/gms/b/cu;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/cu$d;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->b:Lcom/google/android/gms/b/cu$d;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cu$d;->start()V

    :goto_0
    monitor-exit v1

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/cu;->b:Lcom/google/android/gms/b/cu$d;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cu$d;->a()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/cu;Lcom/google/android/gms/b/cu$d;)Lcom/google/android/gms/b/cu$d;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/cu;->b:Lcom/google/android/gms/b/cu$d;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/b/cu;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/cu;->i:Z

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/b/cu;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/b/cu;)Lcom/google/android/gms/b/cu$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/b/cu;)Lcom/google/android/gms/b/cu$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cu;->b:Lcom/google/android/gms/b/cu$d;

    return-object v0
.end method

.method static synthetic z()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/cu;->j:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)",
            "Ljava/util/concurrent/Future",
            "<TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/b/cu;->Q()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/b/cu$c;

    const/4 v1, 0x0

    const-string v2, "Task exception on worker thread"

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/google/android/gms/b/cu$c;-><init>(Lcom/google/android/gms/b/cu;Ljava/util/concurrent/Callable;ZLjava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cu$c;->run()V

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cu;->a(Lcom/google/android/gms/b/cu$c;)V

    goto :goto_0
.end method

.method protected a()V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cu;->Q()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/b/cu$c;

    const/4 v1, 0x0

    const-string v2, "Task exception on worker thread"

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/google/android/gms/b/cu$c;-><init>(Lcom/google/android/gms/b/cu;Ljava/lang/Runnable;ZLjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cu;->a(Lcom/google/android/gms/b/cu$c;)V

    return-void
.end method

.method public b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)",
            "Ljava/util/concurrent/Future",
            "<TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/b/cu;->Q()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/b/cu$c;

    const/4 v1, 0x1

    const-string v2, "Task exception on worker thread"

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/google/android/gms/b/cu$c;-><init>(Lcom/google/android/gms/b/cu;Ljava/util/concurrent/Callable;ZLjava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cu$c;->run()V

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cu;->a(Lcom/google/android/gms/b/cu$c;)V

    goto :goto_0
.end method

.method public bridge synthetic b()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->b()V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cu;->Q()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/b/cu$c;

    const/4 v1, 0x0

    const-string v2, "Task exception on network thread"

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/google/android/gms/b/cu$c;-><init>(Lcom/google/android/gms/b/cu;Ljava/lang/Runnable;ZLjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cu;->a(Ljava/util/concurrent/FutureTask;)V

    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->c()V

    return-void
.end method

.method public d()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cu;->b:Lcom/google/android/gms/b/cu$d;

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call expected from network thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call expected from worker thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public bridge synthetic f()Lcom/google/android/gms/b/bt;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->f()Lcom/google/android/gms/b/bt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lcom/google/android/gms/b/bx;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->g()Lcom/google/android/gms/b/bx;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/google/android/gms/b/da;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->h()Lcom/google/android/gms/b/da;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i()Lcom/google/android/gms/b/cl;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->i()Lcom/google/android/gms/b/cl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j()Lcom/google/android/gms/b/cb;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->j()Lcom/google/android/gms/b/cb;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k()Lcom/google/android/gms/b/dc;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->k()Lcom/google/android/gms/b/dc;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lcom/google/android/gms/b/db;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->l()Lcom/google/android/gms/b/db;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Lcom/google/android/gms/common/util/c;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->n()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o()Lcom/google/android/gms/b/cm;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->o()Lcom/google/android/gms/b/cm;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Lcom/google/android/gms/b/bz;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q()Lcom/google/android/gms/b/dl;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->q()Lcom/google/android/gms/b/dl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r()Lcom/google/android/gms/b/ct;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->r()Lcom/google/android/gms/b/ct;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s()Lcom/google/android/gms/b/de;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->s()Lcom/google/android/gms/b/de;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t()Lcom/google/android/gms/b/cu;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->t()Lcom/google/android/gms/b/cu;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Lcom/google/android/gms/b/co;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Lcom/google/android/gms/b/cr;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic w()Lcom/google/android/gms/b/by;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->w()Lcom/google/android/gms/b/by;

    move-result-object v0

    return-object v0
.end method

.method public x()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public y()Z
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cu;->a:Lcom/google/android/gms/b/cu$d;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
