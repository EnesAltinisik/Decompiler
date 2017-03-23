.class Lcom/google/android/gms/b/dc$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/dc;->a(Ljava/util/concurrent/atomic/AtomicReference;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic b:Lcom/google/android/gms/b/dc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/dc;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/dc$6;->b:Lcom/google/android/gms/b/dc;

    iput-object p2, p0, Lcom/google/android/gms/b/dc$6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v1, p0, Lcom/google/android/gms/b/dc$6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/dc$6;->b:Lcom/google/android/gms/b/dc;

    invoke-static {v0}, Lcom/google/android/gms/b/dc;->c(Lcom/google/android/gms/b/dc;)Lcom/google/android/gms/b/ck;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/dc$6;->b:Lcom/google/android/gms/b/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Failed to get app instance id"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/dc$6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_2
    iget-object v2, p0, Lcom/google/android/gms/b/dc$6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lcom/google/android/gms/b/dc$6;->b:Lcom/google/android/gms/b/dc;

    invoke-virtual {v3}, Lcom/google/android/gms/b/dc;->i()Lcom/google/android/gms/b/cl;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/google/android/gms/b/cl;->a(Ljava/lang/String;)Lcom/google/android/gms/b/bv;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/google/android/gms/b/ck;->c(Lcom/google/android/gms/b/bv;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/b/dc$6;->b:Lcom/google/android/gms/b/dc;

    invoke-static {v0}, Lcom/google/android/gms/b/dc;->d(Lcom/google/android/gms/b/dc;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/b/dc$6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    :goto_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_4
    iget-object v2, p0, Lcom/google/android/gms/b/dc$6;->b:Lcom/google/android/gms/b/dc;

    invoke-virtual {v2}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Failed to get app instance id"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object v0, p0, Lcom/google/android/gms/b/dc$6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    goto :goto_1

    :catchall_1
    move-exception v0

    iget-object v2, p0, Lcom/google/android/gms/b/dc$6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method
