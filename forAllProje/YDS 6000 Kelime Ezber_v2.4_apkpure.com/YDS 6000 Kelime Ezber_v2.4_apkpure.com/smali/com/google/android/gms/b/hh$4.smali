.class Lcom/google/android/gms/b/hh$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;)Ljava/util/List;
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
.field final synthetic a:Lcom/google/android/gms/b/gx;

.field final synthetic b:Lcom/google/android/gms/b/hh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/gx;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/hh$4;->b:Lcom/google/android/gms/b/hh;

    iput-object p2, p0, Lcom/google/android/gms/b/hh$4;->a:Lcom/google/android/gms/b/gx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh$4;->b:Lcom/google/android/gms/b/hh;

    invoke-static {v0}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ib;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hh$4;->a:Lcom/google/android/gms/b/gx;

    invoke-static {v1}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->b(Lcom/google/android/gms/b/it;)V

    iget-object v0, p0, Lcom/google/android/gms/b/hh$4;->b:Lcom/google/android/gms/b/hh;

    new-instance v1, Lcom/google/android/gms/b/hs;

    sget-object v2, Lcom/google/android/gms/b/hv;->b:Lcom/google/android/gms/b/hv;

    iget-object v3, p0, Lcom/google/android/gms/b/hh$4;->a:Lcom/google/android/gms/b/gx;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/b/hs;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hu;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/hh$4;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
