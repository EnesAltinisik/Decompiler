.class public Lcom/google/android/gms/ads/internal/j;
.super Lcom/google/android/gms/b/oh$a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/b/og;

.field private final c:Lcom/google/android/gms/b/tn;

.field private final d:Lcom/google/android/gms/b/re;

.field private final e:Lcom/google/android/gms/b/rf;

.field private final f:Landroid/support/v4/i/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rh;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Landroid/support/v4/i/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rg;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/b/qr;

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/google/android/gms/b/oo;

.field private final k:Ljava/lang/String;

.field private final l:Lcom/google/android/gms/b/aab;

.field private m:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/ads/internal/r;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Lcom/google/android/gms/ads/internal/d;

.field private final o:Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/og;Lcom/google/android/gms/b/re;Lcom/google/android/gms/b/rf;Landroid/support/v4/i/k;Landroid/support/v4/i/k;Lcom/google/android/gms/b/qr;Lcom/google/android/gms/b/oo;Lcom/google/android/gms/ads/internal/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/tn;",
            "Lcom/google/android/gms/b/aab;",
            "Lcom/google/android/gms/b/og;",
            "Lcom/google/android/gms/b/re;",
            "Lcom/google/android/gms/b/rf;",
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rh;",
            ">;",
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/rg;",
            ">;",
            "Lcom/google/android/gms/b/qr;",
            "Lcom/google/android/gms/b/oo;",
            "Lcom/google/android/gms/ads/internal/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/b/oh$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/j;->o:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/j;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/j;->k:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/j;->c:Lcom/google/android/gms/b/tn;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/j;->l:Lcom/google/android/gms/b/aab;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/j;->b:Lcom/google/android/gms/b/og;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/j;->e:Lcom/google/android/gms/b/rf;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/j;->d:Lcom/google/android/gms/b/re;

    iput-object p8, p0, Lcom/google/android/gms/ads/internal/j;->f:Landroid/support/v4/i/k;

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/j;->g:Landroid/support/v4/i/k;

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/j;->h:Lcom/google/android/gms/b/qr;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/j;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/j;->i:Ljava/util/List;

    iput-object p11, p0, Lcom/google/android/gms/ads/internal/j;->j:Lcom/google/android/gms/b/oo;

    iput-object p12, p0, Lcom/google/android/gms/ads/internal/j;->n:Lcom/google/android/gms/ads/internal/d;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/j;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->o:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/j;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/j;->m:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/ads/internal/j;)Lcom/google/android/gms/b/re;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->d:Lcom/google/android/gms/b/re;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/internal/j;)Lcom/google/android/gms/b/rf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->e:Lcom/google/android/gms/b/rf;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/ads/internal/j;)Landroid/support/v4/i/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->f:Landroid/support/v4/i/k;

    return-object v0
.end method

.method private d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/j;->e:Lcom/google/android/gms/b/rf;

    if-eqz v1, :cond_0

    const-string v1, "1"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/j;->d:Lcom/google/android/gms/b/re;

    if-eqz v1, :cond_1

    const-string v1, "2"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/j;->f:Landroid/support/v4/i/k;

    invoke-virtual {v1}, Landroid/support/v4/i/k;->size()I

    move-result v1

    if-lez v1, :cond_2

    const-string v1, "3"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/ads/internal/j;)Lcom/google/android/gms/b/og;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->b:Lcom/google/android/gms/b/og;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/ads/internal/j;)Landroid/support/v4/i/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->g:Landroid/support/v4/i/k;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/ads/internal/j;)Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/j;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/ads/internal/j;)Lcom/google/android/gms/b/qr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->h:Lcom/google/android/gms/b/qr;

    return-object v0
.end method

.method static synthetic i(Lcom/google/android/gms/ads/internal/j;)Lcom/google/android/gms/b/oo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->j:Lcom/google/android/gms/b/oo;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/j;->o:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->m:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->m:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/r;->F()Ljava/lang/String;

    move-result-object v0

    :goto_0
    monitor-exit v2

    :goto_1
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    monitor-exit v2

    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/b/ns;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/j$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/ads/internal/j$1;-><init>(Lcom/google/android/gms/ads/internal/j;Lcom/google/android/gms/b/ns;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/j;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected a(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()Z
    .locals 3

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/j;->o:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->m:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->m:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/r;->q()Z

    move-result v0

    :goto_0
    monitor-exit v2

    :goto_1
    return v0

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    monitor-exit v2

    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected c()Lcom/google/android/gms/ads/internal/r;
    .locals 7

    new-instance v0, Lcom/google/android/gms/ads/internal/r;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/j;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/j;->n:Lcom/google/android/gms/ads/internal/d;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/j;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/android/gms/b/nx;->a(Landroid/content/Context;)Lcom/google/android/gms/b/nx;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/j;->k:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/j;->c:Lcom/google/android/gms/b/tn;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/j;->l:Lcom/google/android/gms/b/aab;

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/r;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/d;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;Lcom/google/android/gms/b/aab;)V

    return-object v0
.end method
