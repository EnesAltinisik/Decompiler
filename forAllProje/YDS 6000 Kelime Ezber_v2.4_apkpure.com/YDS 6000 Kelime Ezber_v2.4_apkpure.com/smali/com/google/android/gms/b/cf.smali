.class public abstract Lcom/google/android/gms/b/cf;
.super Lcom/google/android/gms/b/br;


# static fields
.field protected static final l:Ljava/lang/Object;

.field protected static volatile m:Lcom/google/android/gms/b/eq;

.field static n:Z

.field private static final s:Ljava/lang/String;

.field private static t:J


# instance fields
.field protected o:Z

.field protected p:Ljava/lang/String;

.field protected q:Z

.field protected r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/cf;->l:Ljava/lang/Object;

    const-class v0, Lcom/google/android/gms/b/cf;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/cf;->s:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/b/cf;->n:Z

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/google/android/gms/b/cf;->t:J

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/br;-><init>(Landroid/content/Context;)V

    iput-boolean v0, p0, Lcom/google/android/gms/b/cf;->o:Z

    iput-boolean v0, p0, Lcom/google/android/gms/b/cf;->q:Z

    iput-boolean v0, p0, Lcom/google/android/gms/b/cf;->r:Z

    iput-object p2, p0, Lcom/google/android/gms/b/cf;->p:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/google/android/gms/b/cf;->o:Z

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/br;-><init>(Landroid/content/Context;)V

    iput-boolean v0, p0, Lcom/google/android/gms/b/cf;->o:Z

    iput-boolean v0, p0, Lcom/google/android/gms/b/cf;->q:Z

    iput-boolean v0, p0, Lcom/google/android/gms/b/cf;->r:Z

    iput-object p2, p0, Lcom/google/android/gms/b/cf;->p:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/b/cf;->o:Z

    return-void
.end method

.method static a(Lcom/google/android/gms/b/eq;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lcom/google/android/gms/b/er;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/b/ei;->H()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->I()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/em;

    invoke-direct {v0}, Lcom/google/android/gms/b/em;-><init>()V

    throw v0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/b/er;

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/b/er;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v1

    :catch_0
    move-exception v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/b/em;

    invoke-direct {v1, v0}, Lcom/google/android/gms/b/em;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected static declared-synchronized a(Landroid/content/Context;Z)V
    .locals 6

    const-class v1, Lcom/google/android/gms/b/cf;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lcom/google/android/gms/b/cf;->n:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/es;->a()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    sput-wide v2, Lcom/google/android/gms/b/cf;->t:J

    invoke-static {p0, p1}, Lcom/google/android/gms/b/cf;->b(Landroid/content/Context;Z)Lcom/google/android/gms/b/eq;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/google/android/gms/b/cf;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static a(Lcom/google/android/gms/b/eq;)V
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const-class v0, Landroid/content/Context;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->n()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->x()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->v()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->r()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->J()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->K()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    new-array v0, v5, [Ljava/lang/Class;

    const-class v1, Landroid/view/MotionEvent;

    aput-object v1, v0, v3

    const-class v1, Landroid/util/DisplayMetrics;

    aput-object v1, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->H()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->I()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->F()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->E()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->u()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/b/ei;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Landroid/content/Context;

    aput-object v1, v0, v3

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v4

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v5

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    new-array v0, v4, [Ljava/lang/Class;

    const-class v1, [Ljava/lang/StackTraceElement;

    aput-object v1, v0, v3

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->z()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->A()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    new-array v0, v4, [Ljava/lang/Class;

    const-class v1, Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->L()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->M()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    return-void
.end method

.method private a(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;)V
    .locals 12

    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    const-wide/16 v10, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/cf;->a:Landroid/view/MotionEvent;

    iget-object v4, p0, Lcom/google/android/gms/b/cf;->k:Landroid/util/DisplayMetrics;

    invoke-static {p1, v0, v4}, Lcom/google/android/gms/b/cf;->a(Lcom/google/android/gms/b/eq;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lcom/google/android/gms/b/er;

    move-result-object v0

    iget-object v4, v0, Lcom/google/android/gms/b/er;->a:Ljava/lang/Long;

    iput-object v4, p2, Lcom/google/android/gms/b/aw$a;->n:Ljava/lang/Long;

    iget-object v4, v0, Lcom/google/android/gms/b/er;->b:Ljava/lang/Long;

    iput-object v4, p2, Lcom/google/android/gms/b/aw$a;->o:Ljava/lang/Long;

    iget-object v4, v0, Lcom/google/android/gms/b/er;->c:Ljava/lang/Long;

    iput-object v4, p2, Lcom/google/android/gms/b/aw$a;->p:Ljava/lang/Long;

    iget-boolean v4, p0, Lcom/google/android/gms/b/cf;->j:Z

    if-eqz v4, :cond_0

    iget-object v4, v0, Lcom/google/android/gms/b/er;->d:Ljava/lang/Long;

    iput-object v4, p2, Lcom/google/android/gms/b/aw$a;->D:Ljava/lang/Long;

    iget-object v0, v0, Lcom/google/android/gms/b/er;->e:Ljava/lang/Long;

    iput-object v0, p2, Lcom/google/android/gms/b/aw$a;->E:Ljava/lang/Long;

    :cond_0
    sget-object v0, Lcom/google/android/gms/b/pr;->bA:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/b/pr;->bv:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    new-instance v4, Lcom/google/android/gms/b/aw$a$a;

    invoke-direct {v4}, Lcom/google/android/gms/b/aw$a$a;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/cf;->a:Landroid/view/MotionEvent;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/cf;->b(Landroid/view/MotionEvent;)Lcom/google/android/gms/b/er;

    move-result-object v5

    iget-object v0, v5, Lcom/google/android/gms/b/er;->a:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->a:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/b/er;->b:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->b:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/b/er;->c:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->h:Ljava/lang/Long;

    iget-boolean v0, p0, Lcom/google/android/gms/b/cf;->j:Z

    if-eqz v0, :cond_3

    iget-object v0, v5, Lcom/google/android/gms/b/er;->e:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->c:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/b/er;->d:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->e:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/b/er;->f:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v6, v10

    if-eqz v0, :cond_9

    move v0, v2

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->g:Ljava/lang/Integer;

    iget-wide v6, p0, Lcom/google/android/gms/b/cf;->d:J

    cmp-long v0, v6, v10

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/cf;->k:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_a

    iget-wide v6, p0, Lcom/google/android/gms/b/cf;->i:J

    long-to-double v6, v6

    iget-wide v8, p0, Lcom/google/android/gms/b/cf;->d:J

    long-to-double v8, v8

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_1
    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->d:Ljava/lang/Long;

    iget-wide v6, p0, Lcom/google/android/gms/b/cf;->h:J

    long-to-double v6, v6

    iget-wide v8, p0, Lcom/google/android/gms/b/cf;->d:J

    long-to-double v8, v8

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->f:Ljava/lang/Long;

    :cond_2
    iget-object v0, v5, Lcom/google/android/gms/b/er;->i:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->j:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/b/er;->j:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->i:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/b/er;->k:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v6, v10

    if-eqz v0, :cond_b

    move v0, v2

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->k:Ljava/lang/Integer;

    iget-wide v6, p0, Lcom/google/android/gms/b/cf;->g:J

    cmp-long v0, v6, v10

    if-lez v0, :cond_3

    iget-wide v6, p0, Lcom/google/android/gms/b/cf;->g:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->l:Ljava/lang/Long;

    :cond_3
    iput-object v4, p2, Lcom/google/android/gms/b/aw$a;->W:Lcom/google/android/gms/b/aw$a$a;
    :try_end_0
    .catch Lcom/google/android/gms/b/em; {:try_start_0 .. :try_end_0} :catch_1

    :cond_4
    :goto_3
    iget-wide v4, p0, Lcom/google/android/gms/b/cf;->c:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_5

    iget-wide v4, p0, Lcom/google/android/gms/b/cf;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/google/android/gms/b/aw$a;->I:Ljava/lang/Long;

    :cond_5
    iget-wide v4, p0, Lcom/google/android/gms/b/cf;->d:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_6

    iget-wide v4, p0, Lcom/google/android/gms/b/cf;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/google/android/gms/b/aw$a;->H:Ljava/lang/Long;

    :cond_6
    iget-wide v4, p0, Lcom/google/android/gms/b/cf;->e:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_7

    iget-wide v4, p0, Lcom/google/android/gms/b/cf;->e:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/google/android/gms/b/aw$a;->G:Ljava/lang/Long;

    :cond_7
    iget-wide v4, p0, Lcom/google/android/gms/b/cf;->f:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_8

    iget-wide v4, p0, Lcom/google/android/gms/b/cf;->f:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/google/android/gms/b/aw$a;->J:Ljava/lang/Long;

    :cond_8
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/cf;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    if-lez v2, :cond_c

    new-array v0, v2, [Lcom/google/android/gms/b/aw$a$a;

    iput-object v0, p2, Lcom/google/android/gms/b/aw$a;->X:[Lcom/google/android/gms/b/aw$a$a;

    :goto_4
    if-ge v1, v2, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/b/cf;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MotionEvent;

    iget-object v4, p0, Lcom/google/android/gms/b/cf;->k:Landroid/util/DisplayMetrics;

    invoke-static {p1, v0, v4}, Lcom/google/android/gms/b/cf;->a(Lcom/google/android/gms/b/eq;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lcom/google/android/gms/b/er;

    move-result-object v0

    new-instance v4, Lcom/google/android/gms/b/aw$a$a;

    invoke-direct {v4}, Lcom/google/android/gms/b/aw$a$a;-><init>()V

    iget-object v5, v0, Lcom/google/android/gms/b/er;->a:Ljava/lang/Long;

    iput-object v5, v4, Lcom/google/android/gms/b/aw$a$a;->a:Ljava/lang/Long;

    iget-object v0, v0, Lcom/google/android/gms/b/er;->b:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/b/aw$a$a;->b:Ljava/lang/Long;

    iget-object v0, p2, Lcom/google/android/gms/b/aw$a;->X:[Lcom/google/android/gms/b/aw$a$a;

    aput-object v4, v0, v1
    :try_end_1
    .catch Lcom/google/android/gms/b/em; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    :cond_9
    move v0, v1

    goto/16 :goto_0

    :cond_a
    move-object v0, v3

    goto/16 :goto_1

    :cond_b
    move v0, v1

    goto/16 :goto_2

    :catch_0
    move-exception v0

    iput-object v3, p2, Lcom/google/android/gms/b/aw$a;->X:[Lcom/google/android/gms/b/aw$a$a;

    :cond_c
    return-void

    :catch_1
    move-exception v0

    goto :goto_3
.end method

.method protected static b(Landroid/content/Context;Z)Lcom/google/android/gms/b/eq;
    .locals 3

    sget-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/b/cf;->l:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/ei;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ei;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v0, v2, p1}, Lcom/google/android/gms/b/eq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/b/eq;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/cf;->a(Lcom/google/android/gms/b/eq;)V

    sput-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected a([Ljava/lang/StackTraceElement;)J
    .locals 5

    sget-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    invoke-static {}, Lcom/google/android/gms/b/ei;->z()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->A()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/em;

    invoke-direct {v0}, Lcom/google/android/gms/b/em;-><init>()V

    throw v0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/b/eo;

    const/4 v2, 0x0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/b/eo;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/b/eo;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-wide v0

    return-wide v0

    :catch_0
    move-exception v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/b/em;

    invoke-direct {v1, v0}, Lcom/google/android/gms/b/em;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected a(Landroid/content/Context;Landroid/view/View;)Lcom/google/android/gms/b/aw$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/aw$a;

    invoke-direct {v0}, Lcom/google/android/gms/b/aw$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/b/cf;->p:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/cf;->p:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/b/aw$a;->b:Ljava/lang/String;

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/b/cf;->o:Z

    invoke-static {p1, v1}, Lcom/google/android/gms/b/cf;->b(Landroid/content/Context;Z)Lcom/google/android/gms/b/eq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/eq;->p()V

    invoke-virtual {p0, v1, v0, p2}, Lcom/google/android/gms/b/cf;->b(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;Landroid/view/View;)V

    invoke-virtual {v1}, Lcom/google/android/gms/b/eq;->q()V

    return-object v0
.end method

.method protected a(Landroid/content/Context;Lcom/google/android/gms/b/au$a;)Lcom/google/android/gms/b/aw$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/aw$a;

    invoke-direct {v0}, Lcom/google/android/gms/b/aw$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/b/cf;->p:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/cf;->p:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/b/aw$a;->b:Ljava/lang/String;

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/b/cf;->o:Z

    invoke-static {p1, v1}, Lcom/google/android/gms/b/cf;->b(Landroid/content/Context;Z)Lcom/google/android/gms/b/eq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/eq;->p()V

    invoke-virtual {p0, v1, v0, p2}, Lcom/google/android/gms/b/cf;->a(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;Lcom/google/android/gms/b/au$a;)V

    invoke-virtual {v1}, Lcom/google/android/gms/b/eq;->q()V

    return-object v0
.end method

.method protected a(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;Landroid/view/View;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/eq;",
            "Lcom/google/android/gms/b/aw$a;",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/b/eq;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    if-nez v2, :cond_0

    move-object/from16 v2, v18

    :goto_0
    return-object v2

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/b/eq;->r()I

    move-result v7

    new-instance v2, Lcom/google/android/gms/b/ho;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/b/ho;-><init>(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/kn;

    invoke-static {}, Lcom/google/android/gms/b/ei;->t()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->u()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x1

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/kn;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v9, Lcom/google/android/gms/b/fn;

    invoke-static {}, Lcom/google/android/gms/b/ei;->l()Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lcom/google/android/gms/b/ei;->m()Ljava/lang/String;

    move-result-object v12

    sget-wide v14, Lcom/google/android/gms/b/cf;->t:J

    const/16 v17, 0x19

    move-object/from16 v10, p1

    move-object/from16 v13, p2

    move/from16 v16, v7

    invoke-direct/range {v9 .. v17}, Lcom/google/android/gms/b/fn;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;JII)V

    move-object/from16 v0, v18

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/ez;

    invoke-static {}, Lcom/google/android/gms/b/ei;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->k()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x2c

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/ez;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/eu;

    invoke-static {}, Lcom/google/android/gms/b/ei;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->e()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x3

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/eu;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/io;

    invoke-static {}, Lcom/google/android/gms/b/ei;->p()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->q()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x16

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/io;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lcom/google/android/gms/b/pr;->bG:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/b/pr;->bv:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    new-instance v2, Lcom/google/android/gms/b/ey;

    invoke-static {}, Lcom/google/android/gms/b/ei;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->i()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x5

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/ey;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-object v2, Lcom/google/android/gms/b/pr;->bz:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/google/android/gms/b/pr;->bv:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    new-instance v2, Lcom/google/android/gms/b/lt;

    invoke-static {}, Lcom/google/android/gms/b/ei;->J()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->K()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x30

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/lt;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    sget-object v2, Lcom/google/android/gms/b/pr;->bE:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_5

    sget-object v2, Lcom/google/android/gms/b/pr;->bv:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_5
    new-instance v2, Lcom/google/android/gms/b/lc;

    invoke-static {}, Lcom/google/android/gms/b/ei;->B()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->C()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x33

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/lc;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    sget-object v2, Lcom/google/android/gms/b/pr;->bJ:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_7

    sget-object v2, Lcom/google/android/gms/b/pr;->bv:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_7
    new-instance v2, Lcom/google/android/gms/b/lb;

    invoke-static {}, Lcom/google/android/gms/b/ei;->z()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->A()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x2d

    new-instance v3, Ljava/lang/Throwable;

    invoke-direct {v3}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v9

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/b/lb;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II[Ljava/lang/StackTraceElement;)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    sget-object v2, Lcom/google/android/gms/b/pr;->bK:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_9

    new-instance v2, Lcom/google/android/gms/b/lw;

    invoke-static {}, Lcom/google/android/gms/b/ei;->L()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->M()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x39

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    move-object/from16 v9, p3

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/b/lw;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;IILandroid/view/View;)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    move-object/from16 v2, v18

    goto/16 :goto_0
.end method

.method protected a(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;Lcom/google/android/gms/b/au$a;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/b/eq;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/b/cf;->b(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;Lcom/google/android/gms/b/au$a;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/cf;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method protected a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Void;",
            ">;>;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/eq;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/pr;->bq:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, p1, v2, v3, v0}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/b/cf;->s:Ljava/lang/String;

    const-string v2, "class methods got exception: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Lcom/google/android/gms/b/es;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method protected b(Landroid/view/MotionEvent;)Lcom/google/android/gms/b/er;
    .locals 6

    sget-object v0, Lcom/google/android/gms/b/cf;->m:Lcom/google/android/gms/b/eq;

    invoke-static {}, Lcom/google/android/gms/b/ei;->F()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/b/ei;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/eq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/em;

    invoke-direct {v0}, Lcom/google/android/gms/b/em;-><init>()V

    throw v0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/b/er;

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/google/android/gms/b/cf;->k:Landroid/util/DisplayMetrics;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/b/er;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v1

    :catch_0
    move-exception v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/b/em;

    invoke-direct {v1, v0}, Lcom/google/android/gms/b/em;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected b(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;Lcom/google/android/gms/b/au$a;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/eq;",
            "Lcom/google/android/gms/b/aw$a;",
            "Lcom/google/android/gms/b/au$a;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/b/eq;->r()I

    move-result v7

    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/google/android/gms/b/ew;

    invoke-static {}, Lcom/google/android/gms/b/ei;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->g()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x1b

    sget-object v3, Lcom/google/android/gms/b/pr;->bu:Lcom/google/android/gms/b/pn;

    invoke-virtual {v3}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lcom/google/android/gms/b/pr;->bv:Lcom/google/android/gms/b/pn;

    invoke-virtual {v3}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_0
    const/4 v9, 0x1

    :goto_0
    move-object/from16 v3, p1

    move-object/from16 v6, p2

    move-object/from16 v10, p3

    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/b/ew;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;IIZLcom/google/android/gms/b/au$a;)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v9, Lcom/google/android/gms/b/fn;

    invoke-static {}, Lcom/google/android/gms/b/ei;->l()Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lcom/google/android/gms/b/ei;->m()Ljava/lang/String;

    move-result-object v12

    sget-wide v14, Lcom/google/android/gms/b/cf;->t:J

    const/16 v17, 0x19

    move-object/from16 v10, p1

    move-object/from16 v13, p2

    move/from16 v16, v7

    invoke-direct/range {v9 .. v17}, Lcom/google/android/gms/b/fn;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;JII)V

    move-object/from16 v0, v18

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/kn;

    invoke-static {}, Lcom/google/android/gms/b/ei;->t()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->u()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x1

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/kn;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/la;

    invoke-static {}, Lcom/google/android/gms/b/ei;->v()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->w()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x1f

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/la;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/le;

    invoke-static {}, Lcom/google/android/gms/b/ei;->D()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->E()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x21

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/le;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/ev;

    invoke-static {}, Lcom/google/android/gms/b/ei;->x()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->y()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x1d

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/ev;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/ey;

    invoke-static {}, Lcom/google/android/gms/b/ei;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->i()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x5

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/ey;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/jm;

    invoke-static {}, Lcom/google/android/gms/b/ei;->r()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->s()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0xc

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/jm;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/eu;

    invoke-static {}, Lcom/google/android/gms/b/ei;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->e()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x3

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/eu;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/ez;

    invoke-static {}, Lcom/google/android/gms/b/ei;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->k()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x2c

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/ez;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/b/io;

    invoke-static {}, Lcom/google/android/gms/b/ei;->p()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->q()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x16

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/io;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lcom/google/android/gms/b/pr;->bx:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/b/pr;->bv:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    new-instance v2, Lcom/google/android/gms/b/lt;

    invoke-static {}, Lcom/google/android/gms/b/ei;->J()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->K()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x30

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/lt;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-object v2, Lcom/google/android/gms/b/pr;->bC:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/google/android/gms/b/pr;->bv:Lcom/google/android/gms/b/pn;

    invoke-virtual {v2}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    new-instance v2, Lcom/google/android/gms/b/lc;

    invoke-static {}, Lcom/google/android/gms/b/ei;->B()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/b/ei;->C()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x33

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/lc;-><init>(Lcom/google/android/gms/b/eq;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aw$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v18

    :cond_5
    const/4 v9, 0x0

    goto/16 :goto_0
.end method

.method protected b(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;Landroid/view/View;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/cf;->a(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/b/cf;->a(Lcom/google/android/gms/b/eq;Lcom/google/android/gms/b/aw$a;Landroid/view/View;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/cf;->a(Ljava/util/List;)V

    return-void
.end method
