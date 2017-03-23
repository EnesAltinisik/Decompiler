.class Lcom/google/android/gms/b/hh$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hi;)Ljava/util/List;
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

.field final synthetic c:Lcom/google/android/gms/b/jr;

.field final synthetic d:Lcom/google/android/gms/b/hh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hi;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/hh$6;->d:Lcom/google/android/gms/b/hh;

    iput-object p2, p0, Lcom/google/android/gms/b/hh$6;->a:Lcom/google/android/gms/b/hi;

    iput-object p3, p0, Lcom/google/android/gms/b/hh$6;->b:Lcom/google/android/gms/b/gx;

    iput-object p4, p0, Lcom/google/android/gms/b/hh$6;->c:Lcom/google/android/gms/b/jr;

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

    iget-object v0, p0, Lcom/google/android/gms/b/hh$6;->d:Lcom/google/android/gms/b/hh;

    iget-object v1, p0, Lcom/google/android/gms/b/hh$6;->a:Lcom/google/android/gms/b/hi;

    invoke-static {v0, v1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hi;)Lcom/google/android/gms/b/it;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/b/hh$6;->b:Lcom/google/android/gms/b/gx;

    invoke-static {v0, v2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/b/hh$6;->d:Lcom/google/android/gms/b/hh;

    invoke-static {v3}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ib;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/b/hh$6;->c:Lcom/google/android/gms/b/jr;

    invoke-interface {v3, v0, v4}, Lcom/google/android/gms/b/ib;->a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/jr;)V

    new-instance v0, Lcom/google/android/gms/b/hw;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->b()Lcom/google/android/gms/b/is;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/hv;->a(Lcom/google/android/gms/b/is;)Lcom/google/android/gms/b/hv;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/b/hh$6;->c:Lcom/google/android/gms/b/jr;

    invoke-direct {v0, v3, v2, v4}, Lcom/google/android/gms/b/hw;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    iget-object v2, p0, Lcom/google/android/gms/b/hh$6;->d:Lcom/google/android/gms/b/hh;

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hu;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hh$6;->b:Lcom/google/android/gms/b/gx;

    invoke-static {v0}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/hh$6;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
