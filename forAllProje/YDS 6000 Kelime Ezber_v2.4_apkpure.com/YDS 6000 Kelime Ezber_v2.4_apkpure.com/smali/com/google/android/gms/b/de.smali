.class public Lcom/google/android/gms/b/de;
.super Lcom/google/android/gms/b/cy;


# instance fields
.field protected a:J

.field private b:Landroid/os/Handler;

.field private final c:Lcom/google/android/gms/b/ca;

.field private final d:Lcom/google/android/gms/b/ca;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cv;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cy;-><init>(Lcom/google/android/gms/b/cv;)V

    new-instance v0, Lcom/google/android/gms/b/de$1;

    iget-object v1, p0, Lcom/google/android/gms/b/de;->n:Lcom/google/android/gms/b/cv;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/b/de$1;-><init>(Lcom/google/android/gms/b/de;Lcom/google/android/gms/b/cv;)V

    iput-object v0, p0, Lcom/google/android/gms/b/de;->c:Lcom/google/android/gms/b/ca;

    new-instance v0, Lcom/google/android/gms/b/de$2;

    iget-object v1, p0, Lcom/google/android/gms/b/de;->n:Lcom/google/android/gms/b/cv;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/b/de$2;-><init>(Lcom/google/android/gms/b/de;Lcom/google/android/gms/b/cv;)V

    iput-object v0, p0, Lcom/google/android/gms/b/de;->d:Lcom/google/android/gms/b/ca;

    return-void
.end method

.method private A()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/de;->b:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/b/de;->b:Landroid/os/Handler;

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private B()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->e()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/de;->a(Z)Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->f()Lcom/google/android/gms/b/bt;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/bt;->a(J)V

    return-void
.end method

.method private a(J)V
    .locals 9

    const-wide/16 v6, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->e()V

    invoke-direct {p0}, Lcom/google/android/gms/b/de;->A()V

    iget-object v0, p0, Lcom/google/android/gms/b/de;->c:Lcom/google/android/gms/b/ca;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ca;->c()V

    iget-object v0, p0, Lcom/google/android/gms/b/de;->d:Lcom/google/android/gms/b/ca;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ca;->c()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Activity resumed, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iput-wide p1, p0, Lcom/google/android/gms/b/de;->a:J

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/b/cr;->i:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v2}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/b/cr;->k:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v2}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->j:Lcom/google/android/gms/b/cr$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cr$a;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->l:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/b/cr$b;->a(J)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->j:Lcom/google/android/gms/b/cr$a;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr$a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/de;->c:Lcom/google/android/gms/b/ca;

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/b/cr;->h:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/b/cr;->l:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/ca;->a(J)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/de;->d:Lcom/google/android/gms/b/ca;

    const-wide/32 v2, 0x36ee80

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/b/cr;->l:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/ca;->a(J)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/de;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/de;->B()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/de;J)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/de;->a(J)V

    return-void
.end method

.method private b(J)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->e()V

    invoke-direct {p0}, Lcom/google/android/gms/b/de;->A()V

    iget-object v0, p0, Lcom/google/android/gms/b/de;->c:Lcom/google/android/gms/b/ca;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ca;->c()V

    iget-object v0, p0, Lcom/google/android/gms/b/de;->d:Lcom/google/android/gms/b/ca;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ca;->c()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Activity paused, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-wide v0, p0, Lcom/google/android/gms/b/de;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->l:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/b/cr;->l:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/b/de;->a:J

    sub-long v4, p1, v4

    add-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->k:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/b/de;J)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/de;->b(J)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    return-void
.end method

.method public a(Z)Z
    .locals 12

    const-wide/32 v10, 0x36ee80

    const-wide/16 v8, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->Q()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/b/de;->a:J

    cmp-long v2, v2, v8

    if-nez v2, :cond_0

    sub-long v2, v0, v10

    iput-wide v2, p0, Lcom/google/android/gms/b/de;->a:J

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/b/de;->a:J

    sub-long v2, v0, v2

    if-nez p1, :cond_1

    const-wide/16 v4, 0x3e8

    cmp-long v4, v2, v4

    if-gez v4, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Screen exposed for less than 1000 ms. Event not sent. time"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/b/cr;->l:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->u()Lcom/google/android/gms/b/co;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v4

    const-string v5, "Recording user engagement, ms"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "_et"

    invoke-virtual {v4, v5, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->l()Lcom/google/android/gms/b/db;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/db;->x()Lcom/google/android/gms/b/db$a;

    move-result-object v2

    invoke-static {v2, v4}, Lcom/google/android/gms/b/db;->a(Lcom/google/android/gms/measurement/AppMeasurement$f;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->h()Lcom/google/android/gms/b/da;

    move-result-object v2

    const-string v3, "auto"

    const-string v5, "_e"

    invoke-virtual {v2, v3, v5, v4}, Lcom/google/android/gms/b/da;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-wide v0, p0, Lcom/google/android/gms/b/de;->a:J

    iget-object v0, p0, Lcom/google/android/gms/b/de;->d:Lcom/google/android/gms/b/ca;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ca;->c()V

    iget-object v0, p0, Lcom/google/android/gms/b/de;->d:Lcom/google/android/gms/b/ca;

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/b/cr;->l:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v1}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v2

    sub-long v2, v10, v2

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/ca;->a(J)V

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public bridge synthetic b()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->b()V

    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->c()V

    return-void
.end method

.method public bridge synthetic d()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->d()V

    return-void
.end method

.method public bridge synthetic e()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->e()V

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

.method protected x()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->t()Lcom/google/android/gms/b/cu;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/b/de$3;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/android/gms/b/de$3;-><init>(Lcom/google/android/gms/b/de;J)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected y()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->t()Lcom/google/android/gms/b/cu;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/b/de$4;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/android/gms/b/de$4;-><init>(Lcom/google/android/gms/b/de;J)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected z()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->u()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Session started, time"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->j:Lcom/google/android/gms/b/cr$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cr$a;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/de;->h()Lcom/google/android/gms/b/da;

    move-result-object v0

    const-string v1, "auto"

    const-string v2, "_s"

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/b/da;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
