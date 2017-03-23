.class Lcom/google/android/gms/b/hh$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Ljava/util/Map;Lcom/google/android/gms/b/hi;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/List",
        "<+",
        "Lcom/google/android/gms/b/ip;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/hi;

.field final synthetic b:Lcom/google/android/gms/b/gx;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Lcom/google/android/gms/b/hh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hi;Lcom/google/android/gms/b/gx;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/hh$7;->d:Lcom/google/android/gms/b/hh;

    iput-object p2, p0, Lcom/google/android/gms/b/hh$7;->a:Lcom/google/android/gms/b/hi;

    iput-object p3, p0, Lcom/google/android/gms/b/hh$7;->b:Lcom/google/android/gms/b/gx;

    iput-object p4, p0, Lcom/google/android/gms/b/hh$7;->c:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh$7;->d:Lcom/google/android/gms/b/hh;

    iget-object v1, p0, Lcom/google/android/gms/b/hh$7;->a:Lcom/google/android/gms/b/hi;

    invoke-static {v0, v1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hi;)Lcom/google/android/gms/b/it;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/hh$7;->b:Lcom/google/android/gms/b/gx;

    invoke-static {v1, v2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/hh$7;->c:Ljava/util/Map;

    invoke-static {v2}, Lcom/google/android/gms/b/go;->b(Ljava/util/Map;)Lcom/google/android/gms/b/go;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/hh$7;->d:Lcom/google/android/gms/b/hh;

    invoke-static {v3}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ib;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/b/hh$7;->b:Lcom/google/android/gms/b/gx;

    invoke-interface {v3, v4, v2}, Lcom/google/android/gms/b/ib;->b(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V

    new-instance v3, Lcom/google/android/gms/b/ht;

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/b/hv;->a(Lcom/google/android/gms/b/is;)Lcom/google/android/gms/b/hv;

    move-result-object v4

    invoke-direct {v3, v4, v1, v2}, Lcom/google/android/gms/b/ht;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V

    iget-object v1, p0, Lcom/google/android/gms/b/hh$7;->d:Lcom/google/android/gms/b/hh;

    invoke-static {v1, v0, v3}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hu;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/hh$7;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
