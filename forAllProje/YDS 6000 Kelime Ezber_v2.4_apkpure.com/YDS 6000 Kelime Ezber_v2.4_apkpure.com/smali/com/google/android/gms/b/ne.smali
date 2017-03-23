.class public Lcom/google/android/gms/b/ne;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Ljava/lang/Runnable;

.field private final b:Ljava/lang/Object;

.field private c:Lcom/google/android/gms/b/nh;

.field private d:Landroid/content/Context;

.field private e:Lcom/google/android/gms/b/nl;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/ne$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/ne$1;-><init>(Lcom/google/android/gms/b/ne;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ne;->a:Ljava/lang/Runnable;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/ne;->b:Ljava/lang/Object;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/ne;Lcom/google/android/gms/b/nh;)Lcom/google/android/gms/b/nh;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/b/ne;Lcom/google/android/gms/b/nl;)Lcom/google/android/gms/b/nl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ne;->e:Lcom/google/android/gms/b/nl;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/b/ne;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ne;->c()V

    return-void
.end method

.method private b()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/b/ne;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ne;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    if-eqz v0, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/b/ne$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/ne$3;-><init>(Lcom/google/android/gms/b/ne;)V

    new-instance v2, Lcom/google/android/gms/b/ne$4;

    invoke-direct {v2, p0}, Lcom/google/android/gms/b/ne$4;-><init>(Lcom/google/android/gms/b/ne;)V

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/b/ne;->a(Lcom/google/android/gms/common/internal/o$b;Lcom/google/android/gms/common/internal/o$c;)Lcom/google/android/gms/b/nh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    iget-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    invoke-virtual {v0}, Lcom/google/android/gms/b/nh;->n()V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/ne;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ne;->b()V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/b/ne;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ne;->b:Ljava/lang/Object;

    return-object v0
.end method

.method private c()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/ne;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    if-nez v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    invoke-virtual {v0}, Lcom/google/android/gms/b/nh;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    invoke-virtual {v0}, Lcom/google/android/gms/b/nh;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    invoke-virtual {v0}, Lcom/google/android/gms/b/nh;->a()V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/ne;->e:Lcom/google/android/gms/b/nl;

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->u()Lcom/google/android/gms/b/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/zq;->b()V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic d(Lcom/google/android/gms/b/ne;)Lcom/google/android/gms/b/nh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ne;->c:Lcom/google/android/gms/b/nh;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/ni;)Lcom/google/android/gms/b/nf;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/b/ne;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ne;->e:Lcom/google/android/gms/b/nl;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/nf;

    invoke-direct {v0}, Lcom/google/android/gms/b/nf;-><init>()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/ne;->e:Lcom/google/android/gms/b/nl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/nl;->a(Lcom/google/android/gms/b/ni;)Lcom/google/android/gms/b/nf;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "Unable to call into cache service."

    invoke-static {v2, v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lcom/google/android/gms/b/nf;

    invoke-direct {v0}, Lcom/google/android/gms/b/nf;-><init>()V

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/common/internal/o$b;Lcom/google/android/gms/common/internal/o$c;)Lcom/google/android/gms/b/nh;
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/nh;

    iget-object v1, p0, Lcom/google/android/gms/b/ne;->d:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->u()Lcom/google/android/gms/b/zq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/zq;->a()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/android/gms/b/nh;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/o$b;Lcom/google/android/gms/common/internal/o$c;)V

    return-object v0
.end method

.method public a()V
    .locals 6

    sget-object v0, Lcom/google/android/gms/b/pr;->cW:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ne;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/b/ne;->b()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/b/ne;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    sget-object v2, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    iget-object v3, p0, Lcom/google/android/gms/b/ne;->a:Ljava/lang/Runnable;

    sget-object v0, Lcom/google/android/gms/b/pr;->cX:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit v1

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 2

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/ne;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ne;->d:Landroid/content/Context;

    if-eqz v0, :cond_1

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ne;->d:Landroid/content/Context;

    sget-object v0, Lcom/google/android/gms/b/pr;->cV:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/b/ne;->b()V

    :cond_2
    :goto_1
    monitor-exit v1

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/google/android/gms/b/pr;->cU:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/b/ne$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/ne$2;-><init>(Lcom/google/android/gms/b/ne;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/ne;->a(Lcom/google/android/gms/b/mu$b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method protected a(Lcom/google/android/gms/b/mu$b;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->h()Lcom/google/android/gms/b/mu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/mu;->a(Lcom/google/android/gms/b/mu$b;)V

    return-void
.end method
