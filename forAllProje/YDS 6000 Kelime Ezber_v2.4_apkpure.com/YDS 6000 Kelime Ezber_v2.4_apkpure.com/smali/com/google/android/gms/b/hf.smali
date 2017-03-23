.class Lcom/google/android/gms/b/hf;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/hf$a;,
        Lcom/google/android/gms/b/hf$b;
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/b/jr;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/je;",
            "Lcom/google/android/gms/b/hf;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/hf;->a:Lcom/google/android/gms/b/jr;

    iput-object v0, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hf$b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hf;->a:Lcom/google/android/gms/b/jr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hf;->a:Lcom/google/android/gms/b/jr;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/b/hf$b;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/hf$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/b/hf$1;-><init>(Lcom/google/android/gms/b/hf;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hf$b;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/hf;->a(Lcom/google/android/gms/b/hf$a;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/b/hf;->a:Lcom/google/android/gms/b/jr;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hf;->a:Lcom/google/android/gms/b/jr;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/hf;->a:Lcom/google/android/gms/b/jr;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hf;->a:Lcom/google/android/gms/b/jr;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    new-instance v2, Lcom/google/android/gms/b/hf;

    invoke-direct {v2}, Lcom/google/android/gms/b/hf;-><init>()V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hf;

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/b/hf;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/hf$a;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hf;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/je;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hf;

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/b/hf$a;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/hf;)V

    goto :goto_0

    :cond_0
    return-void
.end method
