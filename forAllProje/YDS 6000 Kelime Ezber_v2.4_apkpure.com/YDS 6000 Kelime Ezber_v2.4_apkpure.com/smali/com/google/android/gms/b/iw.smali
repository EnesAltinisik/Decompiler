.class public Lcom/google/android/gms/b/iw;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/iw$b;,
        Lcom/google/android/gms/b/iw$a;
    }
.end annotation


# static fields
.field static final synthetic a:Z

.field private static c:Lcom/google/android/gms/b/iy$a;


# instance fields
.field private final b:Lcom/google/android/gms/b/iy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/iw;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/iw;->a:Z

    new-instance v0, Lcom/google/android/gms/b/iw$1;

    invoke-direct {v0}, Lcom/google/android/gms/b/iw$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/iw;->c:Lcom/google/android/gms/b/iy$a;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;
    .locals 8

    sget-boolean v0, Lcom/google/android/gms/b/iw;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/b/go;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Can\'t have a merge that is an overwrite"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    invoke-virtual {p3}, Lcom/google/android/gms/b/go;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-object v1, p1

    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/gx;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/je;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/b/jr;

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Lcom/google/android/gms/b/go;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/gx;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/je;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/b/jr;

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method private a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;
    .locals 11

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/b/iw;->a:Z

    if-nez v0, :cond_1

    invoke-virtual {p3}, Lcom/google/android/gms/b/go;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Can\'t have a merge that is an overwrite"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v8

    invoke-virtual {p3}, Lcom/google/android/gms/b/go;->d()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v1, p1

    :cond_2
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/google/android/gms/b/je;

    invoke-interface {v8, v4}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/je;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v8, v4}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/go;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    new-instance v2, Lcom/google/android/gms/b/gx;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/b/je;

    const/4 v5, 0x0

    aput-object v4, v0, v5

    invoke-direct {v2, v0}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    move-object v0, p0

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v1

    goto :goto_2

    :cond_3
    invoke-static {}, Lcom/google/android/gms/b/go;->a()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)Lcom/google/android/gms/b/go;

    move-result-object p3

    goto :goto_1

    :cond_4
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/google/android/gms/b/je;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/go;

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/je;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Lcom/google/android/gms/b/go;->b()Lcom/google/android/gms/b/jr;

    move-result-object v2

    if-nez v2, :cond_6

    const/4 v2, 0x1

    :goto_4
    invoke-interface {v8, v4}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/je;)Z

    move-result v3

    if-nez v3, :cond_5

    if-nez v2, :cond_5

    invoke-interface {v8, v4}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/go;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    new-instance v2, Lcom/google/android/gms/b/gx;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/b/je;

    const/4 v5, 0x0

    aput-object v4, v0, v5

    invoke-direct {v2, v0}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    move-object v0, p0

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v1

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    goto :goto_4

    :cond_7
    move-object p1, v1

    goto/16 :goto_0
.end method

.method private a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/iy$a;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;
    .locals 9

    const/4 v7, 0x1

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v8

    invoke-virtual {p3, p2}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-boolean v0, Lcom/google/android/gms/b/iw;->a:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "If change path is empty, we must have complete server data"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->d()Lcom/google/android/gms/b/jr;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/b/jf;

    if-eqz v1, :cond_3

    :goto_1
    invoke-virtual {p3, v0}, Lcom/google/android/gms/b/hq;->b(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v1}, Lcom/google/android/gms/b/iy;->c()Lcom/google/android/gms/b/jk;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v2

    invoke-interface {v1, v2, v0, p5}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    :goto_3
    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_2
    move v1, v7

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v2}, Lcom/google/android/gms/b/iy;->a()Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/b/iv;->a(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/android/gms/b/jj;->f()Lcom/google/android/gms/b/jj;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->d()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/je;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-boolean v0, Lcom/google/android/gms/b/iw;->a:Z

    if-nez v0, :cond_6

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->i()I

    move-result v0

    if-eq v0, v7, :cond_6

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Can\'t have a priority with additional path components"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_6
    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-virtual {p3, p2, v0, v1}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v0

    goto :goto_3

    :cond_8
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual {v8, v2}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/je;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-virtual {p3, p2, v1, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1, v4, v0}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_5
    move-object v3, v0

    :goto_6
    if-eqz v3, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v1

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/iy$a;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    goto/16 :goto_3

    :cond_9
    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    goto :goto_5

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {p3, v2, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/ik;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    goto :goto_6

    :cond_b
    invoke-virtual {v8}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v0

    goto/16 :goto_3

    :cond_c
    const/4 v1, 0x0

    goto/16 :goto_4
.end method

.method private a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/iv;",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/ig",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/google/android/gms/b/hq;",
            "Lcom/google/android/gms/b/jr;",
            "Lcom/google/android/gms/b/ix;",
            ")",
            "Lcom/google/android/gms/b/iv;"
        }
    .end annotation

    invoke-virtual {p4, p2}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object p1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->b()Z

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v1

    invoke-virtual {p3}, Lcom/google/android/gms/b/ig;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-virtual {v1, p2}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/gx;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/go;->a()Lcom/google/android/gms/b/go;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/go;

    move-result-object v3

    goto :goto_1

    :cond_5
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object p1

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/android/gms/b/go;->a()Lcom/google/android/gms/b/go;

    move-result-object v3

    invoke-virtual {p3}, Lcom/google/android/gms/b/ig;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gx;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/gx;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v5

    invoke-interface {v5, v4}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/go;

    move-result-object v3

    goto :goto_2

    :cond_8
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object p1

    goto/16 :goto_0
.end method

.method private a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;
    .locals 8

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v7

    new-instance v5, Lcom/google/android/gms/b/iw$b;

    invoke-direct {v5, p4, p1, p5}, Lcom/google/android/gms/b/iw$b;-><init>(Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/jr;)V

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v0}, Lcom/google/android/gms/b/iy;->c()Lcom/google/android/gms/b/jk;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v2

    invoke-interface {v1, v2, v0, p6}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v2}, Lcom/google/android/gms/b/iy;->a()Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/b/iv;->a(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;

    move-result-object p1

    :cond_0
    :goto_0
    return-object p1

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/je;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v1

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->b()Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/b/iv;->a(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {v4}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v3, p3

    :cond_3
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v1

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/iy$a;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v2}, Lcom/google/android/gms/b/iy;->a()Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/b/iv;->a(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-interface {v5, v2}, Lcom/google/android/gms/b/iy$a;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v4}, Lcom/google/android/gms/b/gx;->g()Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/je;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v4}, Lcom/google/android/gms/b/gx;->f()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-interface {v3, v1}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_5
    invoke-interface {v3, v4, p3}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    goto :goto_1

    :cond_6
    invoke-static {}, Lcom/google/android/gms/b/jj;->f()Lcom/google/android/gms/b/jj;

    move-result-object v3

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;
    .locals 8

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v7

    if-eqz p6, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/b/iy;->c()Lcom/google/android/gms/b/jk;

    move-result-object v2

    invoke-static {p3, v2}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/jl;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    :goto_1
    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_0
    const/4 v2, 0x1

    :goto_2
    invoke-interface {v0}, Lcom/google/android/gms/b/iy;->a()Z

    move-result v0

    invoke-virtual {p1, v1, v2, v0}, Lcom/google/android/gms/b/iv;->b(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;

    move-result-object v1

    new-instance v4, Lcom/google/android/gms/b/iw$b;

    invoke-direct {v4, p4, v1, p5}, Lcom/google/android/gms/b/iw$b;-><init>(Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/jr;)V

    move-object v0, p0

    move-object v2, p2

    move-object v3, p4

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/iy$a;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object p1

    :cond_1
    return-object p1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v0}, Lcom/google/android/gms/b/iy;->b()Lcom/google/android/gms/b/iy;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Lcom/google/android/gms/b/iy;->a()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->b()Z

    move-result v1

    if-nez v1, :cond_5

    sget-boolean v1, Lcom/google/android/gms/b/iw;->a:Z

    if-nez v1, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "An empty path should have been caught in the other branch"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_4
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    invoke-interface {v3, v2, p3}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    goto :goto_1

    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v2

    invoke-virtual {v7, p2}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/gx;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->i()I

    move-result v1

    const/4 v3, 0x1

    if-gt v1, v3, :cond_1

    :cond_6
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1, v4, p3}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/b/je;->e()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    goto/16 :goto_1

    :cond_7
    invoke-virtual {v7}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/b/iw;->c:Lcom/google/android/gms/b/iy$a;

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/iy$a;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    goto/16 :goto_1

    :cond_8
    const/4 v2, 0x0

    goto/16 :goto_2
.end method

.method private a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/iv;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/iv;",
            "Lcom/google/android/gms/b/iv;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/im;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->b()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->b()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/im;->a(Lcom/google/android/gms/b/jl;)Lcom/google/android/gms/b/im;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void

    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/je;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/je;)Z

    move-result v0

    return v0
.end method

.method private b(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/b/ik;->b()Z

    move-result v1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/b/iv;->b(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;

    move-result-object v1

    sget-object v4, Lcom/google/android/gms/b/iw;->c:Lcom/google/android/gms/b/iy$a;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/iy$a;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;
    .locals 7

    invoke-virtual {p3, p2}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    new-instance v5, Lcom/google/android/gms/b/iw$b;

    invoke-direct {v5, p3, p1, p4}, Lcom/google/android/gms/b/iw$b;-><init>(Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/jr;)V

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/je;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->d()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v2}, Lcom/google/android/gms/b/iy;->c()Lcom/google/android/gms/b/jk;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v2, v1, v0, p5}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    :cond_2
    :goto_2
    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_9

    :cond_3
    const/4 v0, 0x1

    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v2}, Lcom/google/android/gms/b/iy;->a()Z

    move-result v2

    invoke-virtual {p1, v1, v0, v2}, Lcom/google/android/gms/b/iv;->a(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/b/hq;->b(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {p3, v2, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/ik;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    if-nez v3, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/je;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v1}, Lcom/google/android/gms/b/jl;->a()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    :cond_6
    if-eqz v3, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/iy$a;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    :cond_7
    :goto_4
    invoke-virtual {v1}, Lcom/google/android/gms/b/jl;->a()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->d()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v2}, Lcom/google/android/gms/b/iy;->c()Lcom/google/android/gms/b/jk;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/jl;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-interface {v2, v1, v0, p5}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    goto/16 :goto_2

    :cond_8
    if-nez v3, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/je;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/b/iw;->b:Lcom/google/android/gms/b/iy;

    invoke-static {}, Lcom/google/android/gms/b/jj;->f()Lcom/google/android/gms/b/jj;

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/b/iy;->a(Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/iy$a;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    goto/16 :goto_3
.end method

.method public a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/iw$a;
    .locals 17

    new-instance v8, Lcom/google/android/gms/b/ix;

    invoke-direct {v8}, Lcom/google/android/gms/b/ix;-><init>()V

    sget-object v2, Lcom/google/android/gms/b/iw$2;->a:[I

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hu;->e()Lcom/google/android/gms/b/hu$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/hu$a;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hu;->e()Lcom/google/android/gms/b/hu$a;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x13

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Unknown operation: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    :pswitch_0
    check-cast p2, Lcom/google/android/gms/b/hw;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hw;->d()Lcom/google/android/gms/b/hv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/hv;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hw;->c()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hw;->a()Lcom/google/android/gms/b/jr;

    move-result-object v5

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v2

    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v8}, Lcom/google/android/gms/b/ix;->a()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/iv;Ljava/util/List;)V

    new-instance v4, Lcom/google/android/gms/b/iw$a;

    invoke-direct {v4, v2, v3}, Lcom/google/android/gms/b/iw$a;-><init>(Lcom/google/android/gms/b/iv;Ljava/util/List;)V

    return-object v4

    :cond_0
    sget-boolean v2, Lcom/google/android/gms/b/iw;->a:Z

    if-nez v2, :cond_1

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hw;->d()Lcom/google/android/gms/b/hv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/hv;->b()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hw;->d()Lcom/google/android/gms/b/hv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/hv;->c()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/ik;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hw;->c()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    const/4 v15, 0x1

    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hw;->c()Lcom/google/android/gms/b/gx;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hw;->a()Lcom/google/android/gms/b/jr;

    move-result-object v12

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move-object/from16 v16, v8

    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v2

    goto :goto_0

    :cond_3
    const/4 v15, 0x0

    goto :goto_1

    :pswitch_1
    check-cast p2, Lcom/google/android/gms/b/ht;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/ht;->d()Lcom/google/android/gms/b/hv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/hv;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/ht;->c()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/ht;->a()Lcom/google/android/gms/b/go;

    move-result-object v5

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v2

    goto/16 :goto_0

    :cond_4
    sget-boolean v2, Lcom/google/android/gms/b/iw;->a:Z

    if-nez v2, :cond_5

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/ht;->d()Lcom/google/android/gms/b/hv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/hv;->b()Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    :cond_5
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/ht;->d()Lcom/google/android/gms/b/hv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/hv;->c()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/ik;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    const/4 v15, 0x1

    :goto_2
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/ht;->c()Lcom/google/android/gms/b/gx;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/ht;->a()Lcom/google/android/gms/b/go;

    move-result-object v12

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move-object/from16 v16, v8

    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;ZLcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v2

    goto/16 :goto_0

    :cond_7
    const/4 v15, 0x0

    goto :goto_2

    :pswitch_2
    check-cast p2, Lcom/google/android/gms/b/hr;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hr;->b()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hr;->c()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hr;->a()Lcom/google/android/gms/b/ig;

    move-result-object v5

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v2

    goto/16 :goto_0

    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hr;->c()Lcom/google/android/gms/b/gx;

    move-result-object v5

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v2

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/b/hu;->c()Lcom/google/android/gms/b/gx;

    move-result-object v5

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/b/iw;->b(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/ix;)Lcom/google/android/gms/b/iv;

    move-result-object v2

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
