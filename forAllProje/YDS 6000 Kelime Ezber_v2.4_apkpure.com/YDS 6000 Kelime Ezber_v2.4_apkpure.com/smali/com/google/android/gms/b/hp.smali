.class public Lcom/google/android/gms/b/hp;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z

.field private static final e:Lcom/google/android/gms/b/ih;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ih",
            "<",
            "Lcom/google/android/gms/b/hl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/google/android/gms/b/go;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/hl;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/hp;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/hp;->a:Z

    new-instance v0, Lcom/google/android/gms/b/hp$2;

    invoke-direct {v0}, Lcom/google/android/gms/b/hp$2;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/hp;->e:Lcom/google/android/gms/b/ih;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/b/go;->a()Lcom/google/android/gms/b/go;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->d:Ljava/lang/Long;

    return-void
.end method

.method private static a(Ljava/util/List;Lcom/google/android/gms/b/ih;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/hl;",
            ">;",
            "Lcom/google/android/gms/b/ih",
            "<",
            "Lcom/google/android/gms/b/hl;",
            ">;",
            "Lcom/google/android/gms/b/gx;",
            ")",
            "Lcom/google/android/gms/b/go;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/b/go;->a()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hl;

    invoke-interface {p1, v0}, Lcom/google/android/gms/b/ih;->a(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->e()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p2, v3}, Lcom/google/android/gms/b/gx;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p2, v3}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/go;

    move-result-object v1

    move-object v0, v1

    :goto_1
    move-object v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p2}, Lcom/google/android/gms/b/gx;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-static {v3, p2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/go;

    move-result-object v1

    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, v3}, Lcom/google/android/gms/b/gx;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p2, v3}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)Lcom/google/android/gms/b/go;

    move-result-object v1

    move-object v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v3, p2}, Lcom/google/android/gms/b/gx;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v3, p2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)Lcom/google/android/gms/b/go;

    move-result-object v1

    move-object v0, v1

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/go;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/go;

    move-result-object v1

    move-object v0, v1

    goto :goto_1

    :cond_4
    return-object v1

    :cond_5
    move-object v0, v1

    goto :goto_1
.end method

.method private a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    sget-object v1, Lcom/google/android/gms/b/hp;->e:Lcom/google/android/gms/b/ih;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/b/hp;->a(Ljava/util/List;Lcom/google/android/gms/b/ih;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hl;

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->d:Ljava/lang/Long;

    :goto_0
    return-void

    :cond_0
    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->d:Ljava/lang/Long;

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/b/hl;Lcom/google/android/gms/b/gx;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/b/hl;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/b/gx;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/go;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gx;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/b/gx;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(J)Lcom/google/android/gms/b/hl;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hl;

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-nez v2, :cond_0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/hq;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/hq;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/b/hq;-><init>(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hp;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 2

    sget-boolean v0, Lcom/google/android/gms/b/hp;->a:Z

    if-nez v0, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Either existingEventSnap or existingServerSnap must exist"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    invoke-virtual {p1, p2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/go;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/go;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/go;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p4, p2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-interface {p4, p2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/ik;)Lcom/google/android/gms/b/jr;
    .locals 2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/gx;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/go;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p3, p2}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/je;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/go;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1, p2}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 8

    invoke-static {}, Lcom/google/android/gms/b/jj;->f()Lcom/google/android/gms/b/jj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/b/go;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/b/jr;->d()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v1}, Lcom/google/android/gms/b/jr;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/b/go;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v2

    invoke-interface {p2}, Lcom/google/android/gms/b/jr;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jq;

    new-instance v4, Lcom/google/android/gms/b/gx;

    const/4 v5, 0x1

    new-array v5, v5, [Lcom/google/android/gms/b/je;

    const/4 v6, 0x0

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-direct {v4, v5}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/b/go;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-interface {v1, v0, v4}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/b/go;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :cond_3
    return-object v1
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Ljava/util/List;Z)Lcom/google/android/gms/b/jr;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/jr;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;Z)",
            "Lcom/google/android/gms/b/jr;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p4, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/go;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object p2, v0

    :cond_0
    :goto_0
    return-object p2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/go;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/go;->e()Z

    move-result v2

    if-nez v2, :cond_0

    if-nez p2, :cond_2

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/go;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v2

    if-nez v2, :cond_2

    move-object p2, v1

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    :goto_1
    invoke-virtual {v0, p2}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object p2

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/android/gms/b/jj;->f()Lcom/google/android/gms/b/jj;

    move-result-object p2

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/go;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v0

    if-nez p4, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/b/go;->e()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_5
    if-nez p4, :cond_6

    if-nez p2, :cond_6

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/go;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v0

    if-nez v0, :cond_6

    move-object p2, v1

    goto :goto_0

    :cond_6
    new-instance v0, Lcom/google/android/gms/b/hp$1;

    invoke-direct {v0, p0, p4, p3, p1}, Lcom/google/android/gms/b/hp$1;-><init>(Lcom/google/android/gms/b/hp;ZLjava/util/List;Lcom/google/android/gms/b/gx;)V

    iget-object v1, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lcom/google/android/gms/b/hp;->a(Ljava/util/List;Lcom/google/android/gms/b/ih;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v0

    if-eqz p2, :cond_7

    :goto_2
    invoke-virtual {v0, p2}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object p2

    goto :goto_0

    :cond_7
    invoke-static {}, Lcom/google/android/gms/b/jj;->f()Lcom/google/android/gms/b/jj;

    move-result-object p2

    goto :goto_2
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Ljava/lang/Long;)V
    .locals 4

    sget-boolean v0, Lcom/google/android/gms/b/hp;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/b/hp;->d:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    new-instance v1, Lcom/google/android/gms/b/hl;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/b/hl;-><init>(JLcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)Lcom/google/android/gms/b/go;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    iput-object p3, p0, Lcom/google/android/gms/b/hp;->d:Ljava/lang/Long;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Ljava/lang/Long;Z)V
    .locals 7

    sget-boolean v0, Lcom/google/android/gms/b/hp;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/b/hp;->d:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    new-instance v1, Lcom/google/android/gms/b/hl;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object v4, p1

    move-object v5, p2

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/b/hl;-><init>(JLcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/go;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    :cond_1
    iput-object p3, p0, Lcom/google/android/gms/b/hp;->d:Ljava/lang/Long;

    return-void
.end method

.method public b(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/go;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public b(J)Z
    .locals 9

    const/4 v5, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hl;

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v6

    cmp-long v6, v6, p1

    if-nez v6, :cond_1

    move-object v3, v0

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/b/hp;->a:Z

    if-nez v0, :cond_2

    if-nez v3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "removeWrite called with nonexistent writeId"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lcom/google/android/gms/b/hl;->f()Z

    move-result v6

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v7, v0

    move v4, v2

    :goto_1
    if-eqz v6, :cond_4

    if-ltz v7, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->c:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hl;

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->f()Z

    move-result v8

    if-eqz v8, :cond_9

    if-lt v7, v1, :cond_3

    invoke-virtual {v3}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v8

    invoke-direct {p0, v0, v8}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/hl;Lcom/google/android/gms/b/gx;)Z

    move-result v8

    if-eqz v8, :cond_3

    move v0, v4

    move v4, v2

    :goto_2
    add-int/lit8 v6, v7, -0x1

    move v7, v6

    move v6, v4

    move v4, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v8

    invoke-virtual {v0}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/google/android/gms/b/gx;->b(Lcom/google/android/gms/b/gx;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v0, v5

    move v4, v6

    goto :goto_2

    :cond_4
    if-nez v6, :cond_6

    move v5, v2

    :cond_5
    :goto_3
    return v5

    :cond_6
    if-eqz v4, :cond_7

    invoke-direct {p0}, Lcom/google/android/gms/b/hp;->a()V

    goto :goto_3

    :cond_7
    invoke-virtual {v3}, Lcom/google/android/gms/b/hl;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v3}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    goto :goto_3

    :cond_8
    invoke-virtual {v3}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/go;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gx;

    iget-object v2, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    invoke-virtual {v3}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hp;->b:Lcom/google/android/gms/b/go;

    goto :goto_4

    :cond_9
    move v0, v4

    move v4, v6

    goto :goto_2
.end method
