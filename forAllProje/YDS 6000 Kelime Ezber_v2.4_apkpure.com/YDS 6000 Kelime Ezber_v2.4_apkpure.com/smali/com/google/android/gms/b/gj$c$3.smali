.class Lcom/google/android/gms/b/gj$c$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gj$c;->d()V
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

    iput-object p1, p0, Lcom/google/android/gms/b/gj$c$3;->a:Lcom/google/android/gms/b/gj$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/gj$c$3;->a:Lcom/google/android/gms/b/gj$c;

    iget-object v0, v0, Lcom/google/android/gms/b/gj$c;->a:Lcom/google/android/gms/b/gj;

    invoke-static {v0}, Lcom/google/android/gms/b/gj;->b(Lcom/google/android/gms/b/gj;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gj$c$3;->a:Lcom/google/android/gms/b/gj$c;

    iget-object v0, v0, Lcom/google/android/gms/b/gj$c;->a:Lcom/google/android/gms/b/gj;

    invoke-static {v0}, Lcom/google/android/gms/b/gj;->b(Lcom/google/android/gms/b/gj;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    const-string v1, "closed"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/gj$c$3;->a:Lcom/google/android/gms/b/gj$c;

    iget-object v0, v0, Lcom/google/android/gms/b/gj$c;->a:Lcom/google/android/gms/b/gj;

    invoke-static {v0}, Lcom/google/android/gms/b/gj;->e(Lcom/google/android/gms/b/gj;)V

    return-void
.end method
