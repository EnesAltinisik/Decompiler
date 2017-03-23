.class public Lcom/google/android/gms/b/gq;
.super Ljava/lang/Object;


# instance fields
.field protected a:Lcom/google/android/gms/b/jc;

.field protected b:Lcom/google/android/gms/b/gu;

.field protected c:Lcom/google/android/gms/b/gm;

.field protected d:Lcom/google/android/gms/b/hc;

.field protected e:Ljava/lang/String;

.field protected f:Ljava/lang/String;

.field protected g:Lcom/google/android/gms/b/jc$a;

.field protected h:Z

.field protected i:J

.field protected j:Lcom/google/firebase/b;

.field private k:Z

.field private l:Z

.field private m:Lcom/google/android/gms/b/gy;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/b/jc$a;->b:Lcom/google/android/gms/b/jc$a;

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->g:Lcom/google/android/gms/b/jc$a;

    const-wide/32 v0, 0xa00000

    iput-wide v0, p0, Lcom/google/android/gms/b/gq;->i:J

    iput-boolean v2, p0, Lcom/google/android/gms/b/gq;->k:Z

    iput-boolean v2, p0, Lcom/google/android/gms/b/gq;->l:Z

    return-void
.end method

.method private static a(Lcom/google/android/gms/b/gm;)Lcom/google/android/gms/b/ga;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/gq$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/gq$1;-><init>(Lcom/google/android/gms/b/gm;)V

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Firebase/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "5"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/database/f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private o()Lcom/google/android/gms/b/gy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->m:Lcom/google/android/gms/b/gy;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/ki;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->p()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/b/gq;->m:Lcom/google/android/gms/b/gy;

    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/b/gv;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/b/gv;->a:Lcom/google/android/gms/b/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gv;->b()V

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->m:Lcom/google/android/gms/b/gy;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/android/gms/b/gw;->a:Lcom/google/android/gms/b/gw;

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->m:Lcom/google/android/gms/b/gy;

    goto :goto_0
.end method

.method private declared-synchronized p()V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/b/fk;

    iget-object v1, p0, Lcom/google/android/gms/b/gq;->j:Lcom/google/firebase/b;

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/fk;-><init>(Lcom/google/firebase/b;)V

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->m:Lcom/google/android/gms/b/gy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private q()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->t()V

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->o()Lcom/google/android/gms/b/gy;

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->w()V

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->v()V

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->u()V

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->y()V

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->x()V

    return-void
.end method

.method private r()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->b:Lcom/google/android/gms/b/gu;

    invoke-interface {v0}, Lcom/google/android/gms/b/gu;->a()V

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->d:Lcom/google/android/gms/b/hc;

    invoke-interface {v0}, Lcom/google/android/gms/b/hc;->c()V

    return-void
.end method

.method private s()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/gq;->k()Lcom/google/android/gms/b/hc;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/b/ko;

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Custom run loops are not supported!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast v0, Lcom/google/android/gms/b/ko;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ko;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private t()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->a:Lcom/google/android/gms/b/jc;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->o()Lcom/google/android/gms/b/gy;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gq;->g:Lcom/google/android/gms/b/jc$a;

    const/4 v2, 0x0

    invoke-interface {v0, p0, v1, v2}, Lcom/google/android/gms/b/gy;->a(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/jc$a;Ljava/util/List;)Lcom/google/android/gms/b/jc;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->a:Lcom/google/android/gms/b/jc;

    :cond_0
    return-void
.end method

.method private u()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->d:Lcom/google/android/gms/b/hc;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->m:Lcom/google/android/gms/b/gy;

    invoke-interface {v0, p0}, Lcom/google/android/gms/b/gy;->b(Lcom/google/android/gms/b/gq;)Lcom/google/android/gms/b/hc;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->d:Lcom/google/android/gms/b/hc;

    :cond_0
    return-void
.end method

.method private v()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->b:Lcom/google/android/gms/b/gu;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->o()Lcom/google/android/gms/b/gy;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/b/gy;->a(Lcom/google/android/gms/b/gq;)Lcom/google/android/gms/b/gu;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->b:Lcom/google/android/gms/b/gu;

    :cond_0
    return-void
.end method

.method private w()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->o()Lcom/google/android/gms/b/gy;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/b/gy;->c(Lcom/google/android/gms/b/gq;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->f:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private x()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->c:Lcom/google/android/gms/b/gm;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->o()Lcom/google/android/gms/b/gy;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->s()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/gy;->a(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/b/gm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->c:Lcom/google/android/gms/b/gm;

    :cond_0
    return-void
.end method

.method private y()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "default"

    iput-object v0, p0, Lcom/google/android/gms/b/gq;->e:Ljava/lang/String;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/gd;Lcom/google/android/gms/b/gf$a;)Lcom/google/android/gms/b/gf;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->o()Lcom/google/android/gms/b/gy;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/gq;->g()Lcom/google/android/gms/b/gb;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, Lcom/google/android/gms/b/gy;->a(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/gb;Lcom/google/android/gms/b/gd;Lcom/google/android/gms/b/gf$a;)Lcom/google/android/gms/b/gf;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/jb;

    iget-object v1, p0, Lcom/google/android/gms/b/gq;->a:Lcom/google/android/gms/b/jc;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/b/jb;-><init>(Lcom/google/android/gms/b/jc;Ljava/lang/String;)V

    return-object v0
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/gq;->k:Z

    return v0
.end method

.method b(Ljava/lang/String;)Lcom/google/android/gms/b/ib;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/b/gq;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->m:Lcom/google/android/gms/b/gy;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/b/gy;->a(Lcom/google/android/gms/b/gq;Ljava/lang/String;)Lcom/google/android/gms/b/ib;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You have enabled persistence, but persistence is not supported on this platform."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/ia;

    invoke-direct {v0}, Lcom/google/android/gms/b/ia;-><init>()V

    :cond_1
    return-object v0
.end method

.method declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/gq;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/gq;->k:Z

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/gq;->l:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/gq;->l:Z

    :cond_0
    return-void
.end method

.method protected d()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/gq;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/database/c;

    const-string v1, "Modifications to DatabaseConfig objects must occur before they are in use"

    invoke-direct {v0, v1}, Lcom/google/firebase/database/c;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public e()Lcom/google/android/gms/b/jc$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->g:Lcom/google/android/gms/b/jc$a;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/b/jc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->a:Lcom/google/android/gms/b/jc;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/b/gb;
    .locals 7

    new-instance v0, Lcom/google/android/gms/b/gb;

    invoke-virtual {p0}, Lcom/google/android/gms/b/gq;->f()Lcom/google/android/gms/b/jc;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/b/gq;->n()Lcom/google/android/gms/b/gm;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/b/gq;->a(Lcom/google/android/gms/b/gm;)Lcom/google/android/gms/b/ga;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/android/gms/b/gq;->s()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/b/gq;->h()Z

    move-result v4

    invoke-static {}, Lcom/google/firebase/database/f;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/google/android/gms/b/gq;->l()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/b/gb;-><init>(Lcom/google/android/gms/b/jc;Lcom/google/android/gms/b/ga;Ljava/util/concurrent/ScheduledExecutorService;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/gq;->h:Z

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/b/gq;->i:J

    return-wide v0
.end method

.method public j()Lcom/google/android/gms/b/gu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->b:Lcom/google/android/gms/b/gu;

    return-object v0
.end method

.method public k()Lcom/google/android/gms/b/hc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->d:Lcom/google/android/gms/b/hc;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->f:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->e:Ljava/lang/String;

    return-object v0
.end method

.method public n()Lcom/google/android/gms/b/gm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gq;->c:Lcom/google/android/gms/b/gm;

    return-object v0
.end method
