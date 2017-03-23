.class Lcom/google/android/gms/b/gg$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gg;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/b/gg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gg;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gg$1;->b:Lcom/google/android/gms/b/gg;

    iput-boolean p2, p0, Lcom/google/android/gms/b/gg$1;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/gg$1;->b:Lcom/google/android/gms/b/gg;

    invoke-static {v0}, Lcom/google/android/gms/b/gg;->a(Lcom/google/android/gms/b/gg;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    const-string v3, "Trying to fetch auth token"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gg$1;->b:Lcom/google/android/gms/b/gg;

    invoke-static {v0}, Lcom/google/android/gms/b/gg;->b(Lcom/google/android/gms/b/gg;)Lcom/google/android/gms/b/gg$b;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/b/gg$b;->a:Lcom/google/android/gms/b/gg$b;

    if-ne v0, v3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Not in disconnected state: %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/b/gg$1;->b:Lcom/google/android/gms/b/gg;

    invoke-static {v4}, Lcom/google/android/gms/b/gg;->b(Lcom/google/android/gms/b/gg;)Lcom/google/android/gms/b/gg$b;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/b/gc;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gg$1;->b:Lcom/google/android/gms/b/gg;

    sget-object v1, Lcom/google/android/gms/b/gg$b;->b:Lcom/google/android/gms/b/gg$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/b/gg;->a(Lcom/google/android/gms/b/gg;Lcom/google/android/gms/b/gg$b;)Lcom/google/android/gms/b/gg$b;

    iget-object v0, p0, Lcom/google/android/gms/b/gg$1;->b:Lcom/google/android/gms/b/gg;

    invoke-static {v0}, Lcom/google/android/gms/b/gg;->c(Lcom/google/android/gms/b/gg;)J

    iget-object v0, p0, Lcom/google/android/gms/b/gg$1;->b:Lcom/google/android/gms/b/gg;

    invoke-static {v0}, Lcom/google/android/gms/b/gg;->d(Lcom/google/android/gms/b/gg;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/b/gg$1;->b:Lcom/google/android/gms/b/gg;

    invoke-static {v2}, Lcom/google/android/gms/b/gg;->f(Lcom/google/android/gms/b/gg;)Lcom/google/android/gms/b/ga;

    move-result-object v2

    iget-boolean v3, p0, Lcom/google/android/gms/b/gg$1;->a:Z

    new-instance v4, Lcom/google/android/gms/b/gg$1$1;

    invoke-direct {v4, p0, v0, v1}, Lcom/google/android/gms/b/gg$1$1;-><init>(Lcom/google/android/gms/b/gg$1;J)V

    invoke-interface {v2, v3, v4}, Lcom/google/android/gms/b/ga;->a(ZLcom/google/android/gms/b/ga$a;)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0
.end method
