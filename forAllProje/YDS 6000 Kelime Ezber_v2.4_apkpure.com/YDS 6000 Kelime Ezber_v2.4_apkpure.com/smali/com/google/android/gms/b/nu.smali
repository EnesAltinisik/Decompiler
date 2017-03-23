.class public Lcom/google/android/gms/b/nu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/wy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/nu$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/nu$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/nu$1;-><init>(Lcom/google/android/gms/b/nu;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/google/android/gms/b/nu;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/tv;Lcom/google/android/gms/b/abb;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/tv",
            "<*>;",
            "Lcom/google/android/gms/b/abb;",
            ")V"
        }
    .end annotation

    const-string v0, "post-error"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/tv;->b(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/google/android/gms/b/vx;->a(Lcom/google/android/gms/b/abb;)Lcom/google/android/gms/b/vx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/nu;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/b/nu$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v0, v3}, Lcom/google/android/gms/b/nu$a;-><init>(Lcom/google/android/gms/b/nu;Lcom/google/android/gms/b/tv;Lcom/google/android/gms/b/vx;Ljava/lang/Runnable;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/tv;Lcom/google/android/gms/b/vx;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/tv",
            "<*>;",
            "Lcom/google/android/gms/b/vx",
            "<*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/b/nu;->a(Lcom/google/android/gms/b/tv;Lcom/google/android/gms/b/vx;Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/tv;Lcom/google/android/gms/b/vx;Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/tv",
            "<*>;",
            "Lcom/google/android/gms/b/vx",
            "<*>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/tv;->p()V

    const-string v0, "post-response"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/tv;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/nu;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/b/nu$a;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/b/nu$a;-><init>(Lcom/google/android/gms/b/nu;Lcom/google/android/gms/b/tv;Lcom/google/android/gms/b/vx;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
