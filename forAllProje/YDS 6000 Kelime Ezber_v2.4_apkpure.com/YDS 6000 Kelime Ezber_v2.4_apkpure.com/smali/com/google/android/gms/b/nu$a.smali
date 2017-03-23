.class Lcom/google/android/gms/b/nu$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/nu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/tv;

.field private final b:Lcom/google/android/gms/b/vx;

.field private final c:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/nu;Lcom/google/android/gms/b/tv;Lcom/google/android/gms/b/vx;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/b/nu$a;->a:Lcom/google/android/gms/b/tv;

    iput-object p3, p0, Lcom/google/android/gms/b/nu$a;->b:Lcom/google/android/gms/b/vx;

    iput-object p4, p0, Lcom/google/android/gms/b/nu$a;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/nu$a;->b:Lcom/google/android/gms/b/vx;

    invoke-virtual {v0}, Lcom/google/android/gms/b/vx;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/nu$a;->a:Lcom/google/android/gms/b/tv;

    iget-object v1, p0, Lcom/google/android/gms/b/nu$a;->b:Lcom/google/android/gms/b/vx;

    iget-object v1, v1, Lcom/google/android/gms/b/vx;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/tv;->a(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/b/nu$a;->b:Lcom/google/android/gms/b/vx;

    iget-boolean v0, v0, Lcom/google/android/gms/b/vx;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/nu$a;->a:Lcom/google/android/gms/b/tv;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/tv;->b(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/b/nu$a;->c:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/nu$a;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/nu$a;->a:Lcom/google/android/gms/b/tv;

    iget-object v1, p0, Lcom/google/android/gms/b/nu$a;->b:Lcom/google/android/gms/b/vx;

    iget-object v1, v1, Lcom/google/android/gms/b/vx;->c:Lcom/google/android/gms/b/abb;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/tv;->b(Lcom/google/android/gms/b/abb;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/nu$a;->a:Lcom/google/android/gms/b/tv;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/tv;->c(Ljava/lang/String;)V

    goto :goto_1
.end method
