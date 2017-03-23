.class Lcom/google/android/gms/b/gj$c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gj$c;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gj$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gj$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gj$c$1;->a:Lcom/google/android/gms/b/gj$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/gj$c$1;->a:Lcom/google/android/gms/b/gj$c;

    iget-object v0, v0, Lcom/google/android/gms/b/gj$c;->a:Lcom/google/android/gms/b/gj;

    invoke-static {v0}, Lcom/google/android/gms/b/gj;->a(Lcom/google/android/gms/b/gj;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    iget-object v0, p0, Lcom/google/android/gms/b/gj$c$1;->a:Lcom/google/android/gms/b/gj$c;

    iget-object v0, v0, Lcom/google/android/gms/b/gj$c;->a:Lcom/google/android/gms/b/gj;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/b/gj;->a(Lcom/google/android/gms/b/gj;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/b/gj$c$1;->a:Lcom/google/android/gms/b/gj$c;

    iget-object v0, v0, Lcom/google/android/gms/b/gj$c;->a:Lcom/google/android/gms/b/gj;

    invoke-static {v0}, Lcom/google/android/gms/b/gj;->b(Lcom/google/android/gms/b/gj;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gj$c$1;->a:Lcom/google/android/gms/b/gj$c;

    iget-object v0, v0, Lcom/google/android/gms/b/gj$c;->a:Lcom/google/android/gms/b/gj;

    invoke-static {v0}, Lcom/google/android/gms/b/gj;->b(Lcom/google/android/gms/b/gj;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    const-string v1, "websocket opened"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/gj$c$1;->a:Lcom/google/android/gms/b/gj$c;

    iget-object v0, v0, Lcom/google/android/gms/b/gj$c;->a:Lcom/google/android/gms/b/gj;

    invoke-static {v0}, Lcom/google/android/gms/b/gj;->c(Lcom/google/android/gms/b/gj;)V

    return-void
.end method
