.class public Lcom/google/android/gms/b/cw;
.super Lcom/google/android/gms/b/ck$a;


# instance fields
.field private final a:Lcom/google/android/gms/b/cv;

.field private b:Ljava/lang/Boolean;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/cv;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/cw;-><init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ck$a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    iput-object p2, p0, Lcom/google/android/gms/b/cw;->c:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    return-object v0
.end method

.method private b(Lcom/google/android/gms/b/bv;Z)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/b/cw;->b(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/dl;->f(Ljava/lang/String;)Z

    return-void
.end method

.method private b(Ljava/lang/String;Z)V
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Measurement Service called without app package"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Measurement Service called without app package"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/cw;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Measurement Service called with invalid calling package. appId"

    invoke-static {p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/bv;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/bv;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/di;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/cw;->b(Lcom/google/android/gms/b/bv;Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$7;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/cw$7;-><init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/bv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/dk;

    if-nez p2, :cond_1

    iget-object v3, v0, Lcom/google/android/gms/b/dk;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/b/dl;->j(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_1
    new-instance v3, Lcom/google/android/gms/b/di;

    invoke-direct {v3, v0}, Lcom/google/android/gms/b/di;-><init>(Lcom/google/android/gms/b/dk;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Failed to get user attributes. appId"

    iget-object v3, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_2
    return-object v0

    :cond_2
    move-object v0, v1

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$9;

    move-object v2, p0

    move-object v3, p4

    move-object v4, p5

    move-object v5, p3

    move-wide v6, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/b/cw$9;-><init>(Lcom/google/android/gms/b/cw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/bv;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/cw;->b(Lcom/google/android/gms/b/bv;Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$8;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/cw$8;-><init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/bv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/b/cw;->b(Lcom/google/android/gms/b/bv;Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/b/cw$2;-><init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/ch;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/b/cw;->b(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/b/cw$3;-><init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/ch;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/b/cw;->b(Lcom/google/android/gms/b/bv;Z)V

    invoke-virtual {p1}, Lcom/google/android/gms/b/di;->a()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/b/cw$5;-><init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$6;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/b/cw$6;-><init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;Z)V
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->b:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    const-string v0, "com.google.android.gms"

    iget-object v3, p0, Lcom/google/android/gms/b/cw;->c:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/util/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/n;->a(Landroid/content/Context;)Lcom/google/android/gms/common/n;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v3}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/common/n;->a(Landroid/content/pm/PackageManager;I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cw;->b:Ljava/lang/Boolean;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/cw;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_2
    return-void

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/cw;->c:Ljava/lang/String;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v3

    invoke-static {v0, v3, p1}, Lcom/google/android/gms/common/m;->a(Landroid/content/Context;ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iput-object p1, p0, Lcom/google/android/gms/b/cw;->c:Ljava/lang/String;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/b/cw;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/SecurityException;

    const-string v3, "Unknown calling package name \'%s\'."

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/b/ch;Ljava/lang/String;)[B
    .locals 9

    const-wide/32 v4, 0xf4240

    invoke-static {p2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/b/cw;->b(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Log and bundle. event"

    iget-object v2, p1, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->c()J

    move-result-wide v0

    div-long v2, v0, v4

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/b/cw$4;-><init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/ch;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Log and bundle returned null. appId"

    invoke-static {p2}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    new-array v0, v0, [B

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->c()J

    move-result-wide v4

    const-wide/32 v6, 0xf4240

    div-long/2addr v4, v6

    iget-object v1, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v6, "Log and bundle processed. event, size, time_ms"

    iget-object v7, p1, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    array-length v8, v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sub-long v2, v4, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v6, v7, v8, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Failed to log and bundle. appId, event, error"

    invoke-static {p2}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p1, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public b(Lcom/google/android/gms/b/bv;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/cw;->b(Lcom/google/android/gms/b/bv;Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cw$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/cw$1;-><init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/bv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/b/bv;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/cw;->b(Lcom/google/android/gms/b/bv;Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cw;->a:Lcom/google/android/gms/b/cv;

    iget-object v1, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cv;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
