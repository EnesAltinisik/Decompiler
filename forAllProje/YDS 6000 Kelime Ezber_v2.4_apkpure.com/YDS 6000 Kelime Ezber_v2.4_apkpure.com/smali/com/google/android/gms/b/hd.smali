.class public Lcom/google/android/gms/b/hd;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lcom/google/android/gms/b/go;Ljava/util/Map;)Lcom/google/android/gms/b/go;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/go;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/b/go;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/b/go;->a()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/go;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/gx;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jr;

    invoke-static {v0, p1}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/jr;Ljava/util/Map;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/b/go;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/go;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public static a(Lcom/google/android/gms/b/hf;Ljava/util/Map;)Lcom/google/android/gms/b/hf;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/hf;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/b/hf;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/b/hf;

    invoke-direct {v0}, Lcom/google/android/gms/b/hf;-><init>()V

    new-instance v1, Lcom/google/android/gms/b/gx;

    const-string v2, ""

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/gx;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/b/hd$1;

    invoke-direct {v2, v0, p1}, Lcom/google/android/gms/b/hd$1;-><init>(Lcom/google/android/gms/b/hf;Ljava/util/Map;)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/b/hf;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hf$b;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/b/jr;Ljava/util/Map;)Lcom/google/android/gms/b/jr;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/jr;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/b/jr;"
        }
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->a()Ljava/lang/Object;

    move-result-object v1

    instance-of v0, v1, Ljava/util/Map;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Ljava/util/Map;

    const-string v2, ".sv"

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, ".sv"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_0
    invoke-static {v1}, Lcom/google/android/gms/b/jv;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/android/gms/b/hd;->a(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-static {v1, v0}, Lcom/google/android/gms/b/js;->a(Ljava/lang/Object;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0

    :cond_3
    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v1

    if-nez v1, :cond_2

    check-cast p0, Lcom/google/android/gms/b/jf;

    new-instance v1, Lcom/google/android/gms/b/he;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/he;-><init>(Lcom/google/android/gms/b/jr;)V

    new-instance v2, Lcom/google/android/gms/b/hd$2;

    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/b/hd$2;-><init>(Ljava/util/Map;Lcom/google/android/gms/b/he;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/b/jf;->a(Lcom/google/android/gms/b/jf$a;)V

    invoke-virtual {v1}, Lcom/google/android/gms/b/he;->a()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/b/he;->a()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/b/jr;->b(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object p0

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lcom/google/android/gms/b/he;->a()Lcom/google/android/gms/b/jr;

    move-result-object p0

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    const-string v1, ".sv"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ".sv"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static a(Lcom/google/android/gms/b/kl;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/kl;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "timestamp"

    invoke-interface {p0}, Lcom/google/android/gms/b/kl;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
