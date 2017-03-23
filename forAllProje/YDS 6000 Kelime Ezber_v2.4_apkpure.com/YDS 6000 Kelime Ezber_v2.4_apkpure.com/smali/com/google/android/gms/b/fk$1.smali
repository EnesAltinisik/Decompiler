.class Lcom/google/android/gms/b/fk$1;
.super Lcom/google/android/gms/b/ko;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/fk;->b(Lcom/google/android/gms/b/gq;)Lcom/google/android/gms/b/hc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/jb;

.field final synthetic b:Lcom/google/android/gms/b/fk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/fk;Lcom/google/android/gms/b/jb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/fk$1;->b:Lcom/google/android/gms/b/fk;

    iput-object p2, p0, Lcom/google/android/gms/b/fk$1;->a:Lcom/google/android/gms/b/jb;

    invoke-direct {p0}, Lcom/google/android/gms/b/ko;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/b/ko;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/fk$1;->a:Lcom/google/android/gms/b/jb;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/b/fk$1;->b:Lcom/google/android/gms/b/fk;

    invoke-static {v2}, Lcom/google/android/gms/b/fk;->a(Lcom/google/android/gms/b/fk;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lcom/google/android/gms/b/fk$1$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/b/fk$1$1;-><init>(Lcom/google/android/gms/b/fk$1;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/fk$1;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    return-void
.end method
