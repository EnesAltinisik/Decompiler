.class Lcom/google/android/gms/b/sv$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/aaj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/sv;->a(Lcom/google/android/gms/b/dp;)Lcom/google/android/gms/b/sv$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/aaj$c",
        "<",
        "Lcom/google/android/gms/b/sr;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/sv$d;

.field final synthetic b:Lcom/google/android/gms/b/sv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/sv;Lcom/google/android/gms/b/sv$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/sv$2;->b:Lcom/google/android/gms/b/sv;

    iput-object p2, p0, Lcom/google/android/gms/b/sv$2;->a:Lcom/google/android/gms/b/sv$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/sr;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/sv$2;->b:Lcom/google/android/gms/b/sv;

    invoke-static {v0}, Lcom/google/android/gms/b/sv;->c(Lcom/google/android/gms/b/sv;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/sv$2;->b:Lcom/google/android/gms/b/sv;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/b/sv;->a(Lcom/google/android/gms/b/sv;I)I

    iget-object v0, p0, Lcom/google/android/gms/b/sv$2;->b:Lcom/google/android/gms/b/sv;

    invoke-static {v0}, Lcom/google/android/gms/b/sv;->g(Lcom/google/android/gms/b/sv;)Lcom/google/android/gms/b/sv$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/sv$2;->a:Lcom/google/android/gms/b/sv$d;

    iget-object v2, p0, Lcom/google/android/gms/b/sv$2;->b:Lcom/google/android/gms/b/sv;

    invoke-static {v2}, Lcom/google/android/gms/b/sv;->g(Lcom/google/android/gms/b/sv;)Lcom/google/android/gms/b/sv$d;

    move-result-object v2

    if-eq v0, v2, :cond_0

    const-string v0, "New JS engine is loaded, marking previous one as destroyable."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/sv$2;->b:Lcom/google/android/gms/b/sv;

    invoke-static {v0}, Lcom/google/android/gms/b/sv;->g(Lcom/google/android/gms/b/sv;)Lcom/google/android/gms/b/sv$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/sv$d;->c()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/sv$2;->b:Lcom/google/android/gms/b/sv;

    iget-object v2, p0, Lcom/google/android/gms/b/sv$2;->a:Lcom/google/android/gms/b/sv$d;

    invoke-static {v0, v2}, Lcom/google/android/gms/b/sv;->a(Lcom/google/android/gms/b/sv;Lcom/google/android/gms/b/sv$d;)Lcom/google/android/gms/b/sv$d;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/sr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/sv$2;->a(Lcom/google/android/gms/b/sr;)V

    return-void
.end method
