.class public Lcom/google/android/gms/b/if;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z

.field private static final b:Lcom/google/android/gms/b/ih;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ih",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/is;",
            "Lcom/google/android/gms/b/ie;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/android/gms/b/ih;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ih",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/is;",
            "Lcom/google/android/gms/b/ie;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final d:Lcom/google/android/gms/b/ih;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ih",
            "<",
            "Lcom/google/android/gms/b/ie;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/google/android/gms/b/ih;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ih",
            "<",
            "Lcom/google/android/gms/b/ie;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private f:Lcom/google/android/gms/b/ig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ig",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/is;",
            "Lcom/google/android/gms/b/ie;",
            ">;>;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/b/ic;

.field private final h:Lcom/google/android/gms/b/jb;

.field private final i:Lcom/google/android/gms/b/kl;

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/if;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/if;->a:Z

    new-instance v0, Lcom/google/android/gms/b/if$1;

    invoke-direct {v0}, Lcom/google/android/gms/b/if$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/if;->b:Lcom/google/android/gms/b/ih;

    new-instance v0, Lcom/google/android/gms/b/if$2;

    invoke-direct {v0}, Lcom/google/android/gms/b/if$2;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/if;->c:Lcom/google/android/gms/b/ih;

    new-instance v0, Lcom/google/android/gms/b/if$3;

    invoke-direct {v0}, Lcom/google/android/gms/b/if$3;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/if;->d:Lcom/google/android/gms/b/ih;

    new-instance v0, Lcom/google/android/gms/b/if$4;

    invoke-direct {v0}, Lcom/google/android/gms/b/if$4;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/if;->e:Lcom/google/android/gms/b/ih;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/b/ic;Lcom/google/android/gms/b/jb;Lcom/google/android/gms/b/kl;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/b/if;->j:J

    iput-object p1, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    iput-object p2, p0, Lcom/google/android/gms/b/if;->h:Lcom/google/android/gms/b/jb;

    iput-object p3, p0, Lcom/google/android/gms/b/if;->i:Lcom/google/android/gms/b/kl;

    new-instance v0, Lcom/google/android/gms/b/ig;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/ig;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    invoke-direct {p0}, Lcom/google/android/gms/b/if;->c()V

    iget-object v0, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    invoke-interface {v0}, Lcom/google/android/gms/b/ic;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ie;

    iget-wide v2, v0, Lcom/google/android/gms/b/ie;->a:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iget-wide v4, p0, Lcom/google/android/gms/b/if;->j:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/if;->j:J

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/ie;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static a(Lcom/google/android/gms/b/hx;J)J
    .locals 5

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-interface {p0}, Lcom/google/android/gms/b/hx;->a()F

    move-result v1

    sub-float/2addr v0, v1

    long-to-float v1, p1

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-long v0, v0

    invoke-interface {p0}, Lcom/google/android/gms/b/hx;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    sub-long v0, p1, v0

    return-wide v0
.end method

.method private a(Lcom/google/android/gms/b/ih;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ih",
            "<",
            "Lcom/google/android/gms/b/ie;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ie;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ig;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ie;

    invoke-interface {p1, v0}, Lcom/google/android/gms/b/ih;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private a(Lcom/google/android/gms/b/ie;)V
    .locals 6

    iget-object v0, p1, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-static {v0}, Lcom/google/android/gms/b/if;->e(Lcom/google/android/gms/b/it;)V

    iget-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    iget-object v1, p1, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ig;->e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    iget-object v2, p1, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v2}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;)Lcom/google/android/gms/b/ig;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    move-object v1, v0

    :goto_0
    iget-object v0, p1, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ie;

    if-eqz v0, :cond_0

    iget-wide v2, v0, Lcom/google/android/gms/b/ie;->a:J

    iget-wide v4, p1, Lcom/google/android/gms/b/ie;->a:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/b/kt;->a(Z)V

    iget-object v0, p1, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/if;Lcom/google/android/gms/b/ie;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/if;->b(Lcom/google/android/gms/b/ie;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/b/it;Z)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/b/if;->f(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/it;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/ie;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/if;->i:Lcom/google/android/gms/b/kl;

    invoke-interface {v1}, Lcom/google/android/gms/b/kl;->a()J

    move-result-wide v4

    if-eqz v0, :cond_0

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/b/ie;->a(J)Lcom/google/android/gms/b/ie;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/b/ie;->a(Z)Lcom/google/android/gms/b/ie;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/b/if;->b(Lcom/google/android/gms/b/ie;)V

    return-void

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/b/if;->a:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "If we\'re setting the query to inactive, we should already be tracking it!"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/b/ie;

    iget-wide v1, p0, Lcom/google/android/gms/b/if;->j:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v1

    iput-wide v6, p0, Lcom/google/android/gms/b/if;->j:J

    const/4 v6, 0x0

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/b/ie;-><init>(JLcom/google/android/gms/b/it;JZZ)V

    goto :goto_0
.end method

.method static synthetic b()Lcom/google/android/gms/b/ih;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/if;->d:Lcom/google/android/gms/b/ih;

    return-object v0
.end method

.method private b(Lcom/google/android/gms/b/ie;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/ie;)V

    iget-object v0, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/ic;->a(Lcom/google/android/gms/b/ie;)V

    return-void
.end method

.method private c()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    invoke-interface {v0}, Lcom/google/android/gms/b/ic;->d()V

    iget-object v0, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    iget-object v1, p0, Lcom/google/android/gms/b/if;->i:Lcom/google/android/gms/b/kl;

    invoke-interface {v1}, Lcom/google/android/gms/b/kl;->a()J

    move-result-wide v2

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/b/ic;->c(J)V

    iget-object v0, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    invoke-interface {v0}, Lcom/google/android/gms/b/ic;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    invoke-interface {v0}, Lcom/google/android/gms/b/ic;->e()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    invoke-interface {v1}, Lcom/google/android/gms/b/ic;->e()V

    throw v0
.end method

.method private d(Lcom/google/android/gms/b/gx;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    sget-object v1, Lcom/google/android/gms/b/if;->b:Lcom/google/android/gms/b/ih;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ih;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static e(Lcom/google/android/gms/b/it;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/it;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/it;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "Can\'t have tracked non-default query that loads all data"

    invoke-static {v0, v1}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static f(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/it;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/it;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/if;->d:Lcom/google/android/gms/b/ih;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/ih;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public a(Lcom/google/android/gms/b/hx;)Lcom/google/android/gms/b/id;
    .locals 10

    const/4 v3, 0x0

    sget-object v0, Lcom/google/android/gms/b/if;->d:Lcom/google/android/gms/b/ih;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/ih;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/hx;J)J

    move-result-wide v6

    new-instance v1, Lcom/google/android/gms/b/id;

    invoke-direct {v1}, Lcom/google/android/gms/b/id;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/if;->h:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/if;->h:Lcom/google/android/gms/b/jb;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v8, 0x50

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v8, "Pruning old queries.  Prunable: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, " Count to prune: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v5}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/if$6;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/if$6;-><init>(Lcom/google/android/gms/b/if;)V

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    move v2, v3

    :goto_0
    int-to-long v8, v2

    cmp-long v0, v8, v6

    if-gez v0, :cond_1

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ie;

    iget-object v5, v0, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v5}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/b/id;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/id;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/if;->b(Lcom/google/android/gms/b/it;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    long-to-int v0, v6

    move-object v2, v1

    move v1, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ie;

    iget-object v0, v0, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/id;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/id;

    move-result-object v2

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/google/android/gms/b/if;->e:Lcom/google/android/gms/b/ih;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/ih;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/if;->h:Lcom/google/android/gms/b/jb;

    invoke-virtual {v1}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/b/if;->h:Lcom/google/android/gms/b/jb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x1f

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Unprunable queries: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ie;

    iget-object v0, v0, Lcom/google/android/gms/b/ie;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/id;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/id;

    move-result-object v2

    goto :goto_2

    :cond_4
    return-object v2
.end method

.method public a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/ie;
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/b/if;->f(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/it;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/ig;->e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ie;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ig;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ig;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/if$5;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/if$5;-><init>(Lcom/google/android/gms/b/if;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/ig$a;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/b/gx;)V
    .locals 8

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/if;->d(Lcom/google/android/gms/b/gx;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/ie;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/b/ie;

    iget-wide v1, p0, Lcom/google/android/gms/b/if;->j:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v1

    iput-wide v4, p0, Lcom/google/android/gms/b/if;->j:J

    iget-object v4, p0, Lcom/google/android/gms/b/if;->i:Lcom/google/android/gms/b/kl;

    invoke-interface {v4}, Lcom/google/android/gms/b/kl;->a()J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/b/ie;-><init>(JLcom/google/android/gms/b/it;JZZ)V

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/b/if;->b(Lcom/google/android/gms/b/ie;)V

    :cond_0
    return-void

    :cond_1
    sget-boolean v1, Lcom/google/android/gms/b/if;->a:Z

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lcom/google/android/gms/b/ie;->d:Z

    if-eqz v1, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "This should have been handled above!"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/b/ie;->a()Lcom/google/android/gms/b/ie;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/b/it;)V
    .locals 6

    invoke-static {p1}, Lcom/google/android/gms/b/if;->f(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/it;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/ie;

    move-result-object v0

    sget-boolean v2, Lcom/google/android/gms/b/if;->a:Z

    if-nez v2, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Query must exist to be removed."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/b/if;->g:Lcom/google/android/gms/b/ic;

    iget-wide v4, v0, Lcom/google/android/gms/b/ie;->a:J

    invoke-interface {v2, v4, v5}, Lcom/google/android/gms/b/ic;->b(J)V

    iget-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/ig;->e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ig;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    :cond_1
    return-void
.end method

.method public c(Lcom/google/android/gms/b/it;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/it;Z)V

    return-void
.end method

.method public c(Lcom/google/android/gms/b/gx;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/if;->f:Lcom/google/android/gms/b/ig;

    sget-object v1, Lcom/google/android/gms/b/if;->c:Lcom/google/android/gms/b/ih;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/b/ig;->b(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ih;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/b/it;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/b/if;->f(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/it;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/ie;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/google/android/gms/b/ie;->d:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ie;->a()Lcom/google/android/gms/b/ie;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/if;->b(Lcom/google/android/gms/b/ie;)V

    :cond_0
    return-void
.end method
