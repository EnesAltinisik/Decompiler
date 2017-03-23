.class Lcom/google/android/gms/b/cw$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/bv;Z)Ljava/util/List;
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
        "<",
        "Lcom/google/android/gms/b/dk;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/bv;

.field final synthetic b:Lcom/google/android/gms/b/cw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/bv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/cw$7;->b:Lcom/google/android/gms/b/cw;

    iput-object p2, p0, Lcom/google/android/gms/b/cw$7;->a:Lcom/google/android/gms/b/bv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/dk;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/cw$7;->b:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->N()V

    iget-object v0, p0, Lcom/google/android/gms/b/cw$7;->b:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cw$7;->a:Lcom/google/android/gms/b/bv;

    iget-object v1, v1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cw$7;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
