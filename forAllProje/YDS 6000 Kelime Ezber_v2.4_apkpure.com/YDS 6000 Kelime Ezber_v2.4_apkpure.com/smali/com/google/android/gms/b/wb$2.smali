.class Lcom/google/android/gms/b/wb$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/wb;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/aaj;

.field final synthetic b:Lcom/google/android/gms/b/wb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/wb;Lcom/google/android/gms/b/aaj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wb$2;->b:Lcom/google/android/gms/b/wb;

    iput-object p2, p0, Lcom/google/android/gms/b/wb$2;->a:Lcom/google/android/gms/b/aaj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/b/wb$2;->b:Lcom/google/android/gms/b/wb;

    invoke-static {v0}, Lcom/google/android/gms/b/wb;->a(Lcom/google/android/gms/b/wb;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/wb$2;->b:Lcom/google/android/gms/b/wb;

    iget-object v2, p0, Lcom/google/android/gms/b/wb$2;->b:Lcom/google/android/gms/b/wb;

    iget-object v3, p0, Lcom/google/android/gms/b/wb$2;->b:Lcom/google/android/gms/b/wb;

    invoke-static {v3}, Lcom/google/android/gms/b/wb;->b(Lcom/google/android/gms/b/wb;)Lcom/google/android/gms/b/wf$a;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/b/wf$a;->j:Lcom/google/android/gms/b/aab;

    iget-object v4, p0, Lcom/google/android/gms/b/wb$2;->a:Lcom/google/android/gms/b/aaj;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/wb;->a(Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;)Lcom/google/android/gms/b/zk;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/b/wb;->a:Lcom/google/android/gms/b/zk;

    iget-object v0, p0, Lcom/google/android/gms/b/wb$2;->b:Lcom/google/android/gms/b/wb;

    iget-object v0, v0, Lcom/google/android/gms/b/wb;->a:Lcom/google/android/gms/b/zk;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/wb$2;->b:Lcom/google/android/gms/b/wb;

    const/4 v2, 0x0

    const-string v3, "Could not start the ad request service."

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/b/wb;->a(Lcom/google/android/gms/b/wb;ILjava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/b/wb$2;->b:Lcom/google/android/gms/b/wb;

    invoke-static {v2}, Lcom/google/android/gms/b/wb;->c(Lcom/google/android/gms/b/wb;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

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
