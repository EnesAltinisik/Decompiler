.class Lcom/google/android/gms/b/gg$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gg;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gg$7;->a:Lcom/google/android/gms/b/gg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/gg$7;->a:Lcom/google/android/gms/b/gg;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/b/gg;->a(Lcom/google/android/gms/b/gg;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    iget-object v0, p0, Lcom/google/android/gms/b/gg$7;->a:Lcom/google/android/gms/b/gg;

    invoke-static {v0}, Lcom/google/android/gms/b/gg;->p(Lcom/google/android/gms/b/gg;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gg$7;->a:Lcom/google/android/gms/b/gg;

    const-string v1, "connection_idle"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gg;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/gg$7;->a:Lcom/google/android/gms/b/gg;

    invoke-static {v0}, Lcom/google/android/gms/b/gg;->n(Lcom/google/android/gms/b/gg;)V

    goto :goto_0
.end method
