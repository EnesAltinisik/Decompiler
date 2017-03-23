.class public Lcom/google/android/gms/b/mi;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/mk;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Lcom/google/android/gms/b/yu;",
            "Lcom/google/android/gms/b/mj;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/b/mj;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/Context;

.field private final e:Lcom/google/android/gms/b/aab;

.field private final f:Lcom/google/android/gms/b/sv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/sv;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/mi;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/mi;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/mi;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/b/mi;->e:Lcom/google/android/gms/b/aab;

    iput-object p3, p0, Lcom/google/android/gms/b/mi;->f:Lcom/google/android/gms/b/sv;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/mj;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/mj;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/mi;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

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

    if-ne v0, p1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;)V
    .locals 1

    iget-object v0, p2, Lcom/google/android/gms/b/yu;->b:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->b()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/b/mi;->a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Landroid/view/View;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Landroid/view/View;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/mj$d;

    invoke-direct {v0, p3, p2}, Lcom/google/android/gms/b/mj$d;-><init>(Landroid/view/View;Lcom/google/android/gms/b/yu;)V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/gms/b/mi;->a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/mq;Lcom/google/android/gms/b/sw;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Landroid/view/View;Lcom/google/android/gms/b/sw;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/mj$d;

    invoke-direct {v0, p3, p2}, Lcom/google/android/gms/b/mj$d;-><init>(Landroid/view/View;Lcom/google/android/gms/b/yu;)V

    invoke-virtual {p0, p1, p2, v0, p4}, Lcom/google/android/gms/b/mi;->a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/mq;Lcom/google/android/gms/b/sw;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/mq;Lcom/google/android/gms/b/sw;)V
    .locals 7

    iget-object v6, p0, Lcom/google/android/gms/b/mi;->a:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    invoke-virtual {p0, p2}, Lcom/google/android/gms/b/mi;->a(Lcom/google/android/gms/b/yu;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/mj;

    :goto_0
    if-eqz p4, :cond_1

    new-instance v1, Lcom/google/android/gms/b/ml;

    invoke-direct {v1, v0, p4}, Lcom/google/android/gms/b/ml;-><init>(Lcom/google/android/gms/b/mj;Lcom/google/android/gms/b/sw;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/mj;->a(Lcom/google/android/gms/b/mn;)V

    :goto_1
    monitor-exit v6

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/mj;

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->d:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/b/mi;->e:Lcom/google/android/gms/b/aab;

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/mj;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/mq;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/mj;->a(Lcom/google/android/gms/b/mk;)V

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    new-instance v1, Lcom/google/android/gms/b/mm;

    iget-object v2, p0, Lcom/google/android/gms/b/mi;->f:Lcom/google/android/gms/b/sv;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/b/mm;-><init>(Lcom/google/android/gms/b/mj;Lcom/google/android/gms/b/sv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/mj;->a(Lcom/google/android/gms/b/mn;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/qp;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/mj$a;

    invoke-direct {v0, p3}, Lcom/google/android/gms/b/mj$a;-><init>(Lcom/google/android/gms/b/qp;)V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/gms/b/mi;->a(Lcom/google/android/gms/b/nx;Lcom/google/android/gms/b/yu;Lcom/google/android/gms/b/mq;Lcom/google/android/gms/b/sw;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/yu;)Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/mj;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/mj;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Lcom/google/android/gms/b/yu;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/mj;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/mj;->d()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c(Lcom/google/android/gms/b/yu;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/mj;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/mj;->o()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public d(Lcom/google/android/gms/b/yu;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/mj;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/mj;->p()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public e(Lcom/google/android/gms/b/yu;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/mi;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/mi;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/mj;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/mj;->q()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
