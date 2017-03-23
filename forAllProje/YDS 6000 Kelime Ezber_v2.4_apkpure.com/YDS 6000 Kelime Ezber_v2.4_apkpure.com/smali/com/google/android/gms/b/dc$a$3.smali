.class Lcom/google/android/gms/b/dc$a$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/dc$a;->a(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ck;

.field final synthetic b:Lcom/google/android/gms/b/dc$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/dc$a;Lcom/google/android/gms/b/ck;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/dc$a$3;->b:Lcom/google/android/gms/b/dc$a;

    iput-object p2, p0, Lcom/google/android/gms/b/dc$a$3;->a:Lcom/google/android/gms/b/ck;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/b/dc$a$3;->b:Lcom/google/android/gms/b/dc$a;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/dc$a$3;->b:Lcom/google/android/gms/b/dc$a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/b/dc$a;->a(Lcom/google/android/gms/b/dc$a;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/b/dc$a$3;->b:Lcom/google/android/gms/b/dc$a;

    iget-object v0, v0, Lcom/google/android/gms/b/dc$a;->a:Lcom/google/android/gms/b/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->x()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/dc$a$3;->b:Lcom/google/android/gms/b/dc$a;

    iget-object v0, v0, Lcom/google/android/gms/b/dc$a;->a:Lcom/google/android/gms/b/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Connected to remote service"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/dc$a$3;->b:Lcom/google/android/gms/b/dc$a;

    iget-object v0, v0, Lcom/google/android/gms/b/dc$a;->a:Lcom/google/android/gms/b/dc;

    iget-object v2, p0, Lcom/google/android/gms/b/dc$a$3;->a:Lcom/google/android/gms/b/ck;

    invoke-static {v0, v2}, Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/b/dc;Lcom/google/android/gms/b/ck;)V

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
