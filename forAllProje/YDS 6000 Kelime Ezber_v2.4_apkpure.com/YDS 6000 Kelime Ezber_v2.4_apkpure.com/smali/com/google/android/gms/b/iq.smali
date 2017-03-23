.class public Lcom/google/android/gms/b/iq;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/b/it;

.field private final b:Lcom/google/android/gms/b/jk;


# direct methods
.method private a(Lcom/google/android/gms/b/im;Lcom/google/android/gms/b/gs;Lcom/google/android/gms/b/jl;)Lcom/google/android/gms/b/in;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/b/im;->b()Lcom/google/android/gms/b/ip$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/ip$a;->e:Lcom/google/android/gms/b/ip$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ip$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/im;->b()Lcom/google/android/gms/b/ip$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/ip$a;->a:Lcom/google/android/gms/b/ip$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ip$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/b/iq;->a:Lcom/google/android/gms/b/it;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/b/gs;->a(Lcom/google/android/gms/b/im;Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/in;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/im;->a()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/im;->c()Lcom/google/android/gms/b/jl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/jl;->a()Lcom/google/android/gms/b/jr;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/iq;->b:Lcom/google/android/gms/b/jk;

    invoke-virtual {p3, v0, v1, v2}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/im;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/im;

    move-result-object p1

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/iq;)Lcom/google/android/gms/b/jk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/iq;->b:Lcom/google/android/gms/b/jk;

    return-object v0
.end method

.method private a()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<",
            "Lcom/google/android/gms/b/im;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/b/iq$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/iq$1;-><init>(Lcom/google/android/gms/b/iq;)V

    return-object v0
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/b/ip$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/b/jl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/in;",
            ">;",
            "Lcom/google/android/gms/b/ip$a;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/im;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gs;",
            ">;",
            "Lcom/google/android/gms/b/jl;",
            ")V"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/im;

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->b()Lcom/google/android/gms/b/ip$a;

    move-result-object v3

    invoke-virtual {v3, p2}, Lcom/google/android/gms/b/ip$a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/b/iq;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/im;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/gs;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/b/gs;->a(Lcom/google/android/gms/b/ip$a;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v0, v1, p5}, Lcom/google/android/gms/b/iq;->a(Lcom/google/android/gms/b/im;Lcom/google/android/gms/b/gs;Lcom/google/android/gms/b/jl;)Lcom/google/android/gms/b/in;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lcom/google/android/gms/b/jl;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/im;",
            ">;",
            "Lcom/google/android/gms/b/jl;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gs;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/in;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/im;

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->b()Lcom/google/android/gms/b/ip$a;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/b/ip$a;->d:Lcom/google/android/gms/b/ip$a;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/b/ip$a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/b/iq;->b:Lcom/google/android/gms/b/jk;

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->d()Lcom/google/android/gms/b/jl;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/b/jl;->a()Lcom/google/android/gms/b/jr;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->c()Lcom/google/android/gms/b/jl;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/b/jl;->a()Lcom/google/android/gms/b/jr;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/b/jk;->a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->a()Lcom/google/android/gms/b/je;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->c()Lcom/google/android/gms/b/jl;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/b/im;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jl;)Lcom/google/android/gms/b/im;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/google/android/gms/b/ip$a;->a:Lcom/google/android/gms/b/ip$a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/iq;->a(Ljava/util/List;Lcom/google/android/gms/b/ip$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/b/jl;)V

    sget-object v2, Lcom/google/android/gms/b/ip$a;->b:Lcom/google/android/gms/b/ip$a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/iq;->a(Ljava/util/List;Lcom/google/android/gms/b/ip$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/b/jl;)V

    sget-object v2, Lcom/google/android/gms/b/ip$a;->c:Lcom/google/android/gms/b/ip$a;

    move-object v0, p0

    move-object v3, v6

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/iq;->a(Ljava/util/List;Lcom/google/android/gms/b/ip$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/b/jl;)V

    sget-object v2, Lcom/google/android/gms/b/ip$a;->d:Lcom/google/android/gms/b/ip$a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/iq;->a(Ljava/util/List;Lcom/google/android/gms/b/ip$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/b/jl;)V

    sget-object v2, Lcom/google/android/gms/b/ip$a;->e:Lcom/google/android/gms/b/ip$a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/iq;->a(Ljava/util/List;Lcom/google/android/gms/b/ip$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/b/jl;)V

    return-object v1
.end method
