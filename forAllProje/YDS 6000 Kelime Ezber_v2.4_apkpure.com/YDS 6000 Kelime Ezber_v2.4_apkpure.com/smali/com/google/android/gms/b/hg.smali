.class public Lcom/google/android/gms/b/hg;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/is;",
            "Lcom/google/android/gms/b/iu;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/b/ib;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/hg;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/hg;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/b/iu;Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/iu;",
            "Lcom/google/android/gms/b/hu;",
            "Lcom/google/android/gms/b/hq;",
            "Lcom/google/android/gms/b/jr;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/in;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p2, p3, p4}, Lcom/google/android/gms/b/iu;->a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/iu$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/b/iu;->a()Lcom/google/android/gms/b/it;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->d()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iget-object v0, v1, Lcom/google/android/gms/b/iu$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/im;

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->b()Lcom/google/android/gms/b/ip$a;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/b/ip$a;->b:Lcom/google/android/gms/b/ip$a;

    if-ne v5, v6, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->a()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v6, Lcom/google/android/gms/b/ip$a;->a:Lcom/google/android/gms/b/ip$a;

    if-ne v5, v6, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/im;->a()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/hg;->c:Lcom/google/android/gms/b/ib;

    invoke-virtual {p1}, Lcom/google/android/gms/b/iu;->a()Lcom/google/android/gms/b/it;

    move-result-object v4

    invoke-interface {v0, v4, v3, v2}, Lcom/google/android/gms/b/ib;->a(Lcom/google/android/gms/b/it;Ljava/util/Set;Ljava/util/Set;)V

    :cond_4
    iget-object v0, v1, Lcom/google/android/gms/b/iu$a;->a:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/iu;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/hg;->d()Lcom/google/android/gms/b/iu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/iu;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/iu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/iu;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/iu;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;)Lcom/google/android/gms/b/kr;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/it;",
            "Lcom/google/android/gms/b/gs;",
            "Lcom/google/firebase/database/b;",
            ")",
            "Lcom/google/android/gms/b/kr",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/it;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ip;",
            ">;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/hg;->c()Z

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/iu;

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/b/iu;->a(Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->c()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->a()Lcom/google/android/gms/b/it;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/b/it;->d()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->a()Lcom/google/android/gms/b/it;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/iu;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/b/iu;->a(Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->c()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->a()Lcom/google/android/gms/b/it;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/b/it;->d()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->a()Lcom/google/android/gms/b/it;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/hg;->c()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v0, Lcom/google/android/gms/b/kr;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/kr;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/hu;",
            "Lcom/google/android/gms/b/hq;",
            "Lcom/google/android/gms/b/jr;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/in;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/hu;->d()Lcom/google/android/gms/b/hv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/hv;->d()Lcom/google/android/gms/b/is;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/iu;

    sget-boolean v1, Lcom/google/android/gms/b/hg;->a:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/iu;Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/iu;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/iu;Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public b()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/iu;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/iu;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->a()Lcom/google/android/gms/b/it;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/it;->d()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public b(Lcom/google/android/gms/b/it;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/iu;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/hg;->d()Lcom/google/android/gms/b/iu;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Lcom/google/android/gms/b/iu;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/hg;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/iu;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->a()Lcom/google/android/gms/b/it;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/it;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
