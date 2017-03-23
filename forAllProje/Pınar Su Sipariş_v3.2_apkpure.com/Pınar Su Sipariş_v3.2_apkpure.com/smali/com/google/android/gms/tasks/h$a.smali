.class Lcom/google/android/gms/tasks/h$a;
.super Lcom/google/android/gms/internal/zzoq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tasks/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/tasks/f",
            "<*>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzor;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzoq;-><init>(Lcom/google/android/gms/internal/zzor;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tasks/h$a;->a:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/tasks/h$a;->zzaop:Lcom/google/android/gms/internal/zzor;

    const-string v1, "TaskOnStopCallback"

    invoke-interface {v0, v1, p0}, Lcom/google/android/gms/internal/zzor;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzoq;)V

    return-void
.end method

.method public static a(Landroid/app/Activity;)Lcom/google/android/gms/tasks/h$a;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/tasks/h$a;->zzs(Landroid/app/Activity;)Lcom/google/android/gms/internal/zzor;

    move-result-object v1

    const-string v0, "TaskOnStopCallback"

    const-class v2, Lcom/google/android/gms/tasks/h$a;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/zzor;->zza(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/gms/internal/zzoq;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tasks/h$a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tasks/h$a;

    invoke-direct {v0, v1}, Lcom/google/android/gms/tasks/h$a;-><init>(Lcom/google/android/gms/internal/zzor;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tasks/f;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/tasks/f",
            "<TT;>;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/tasks/h$a;->a:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tasks/h$a;->a:Ljava/util/List;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onStop()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/tasks/h$a;->a:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tasks/h$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tasks/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/tasks/f;->a()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tasks/h$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method
