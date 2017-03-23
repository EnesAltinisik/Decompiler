.class Lcom/google/android/gms/b/hh$10;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/go;JZ)Ljava/util/List;
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
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/b/gx;

.field final synthetic c:Lcom/google/android/gms/b/go;

.field final synthetic d:J

.field final synthetic e:Lcom/google/android/gms/b/go;

.field final synthetic f:Lcom/google/android/gms/b/hh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/hh;ZLcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;JLcom/google/android/gms/b/go;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/b/hh$10;->f:Lcom/google/android/gms/b/hh;

    iput-boolean p2, p0, Lcom/google/android/gms/b/hh$10;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/b/hh$10;->b:Lcom/google/android/gms/b/gx;

    iput-object p4, p0, Lcom/google/android/gms/b/hh$10;->c:Lcom/google/android/gms/b/go;

    iput-wide p5, p0, Lcom/google/android/gms/b/hh$10;->d:J

    iput-object p7, p0, Lcom/google/android/gms/b/hh$10;->e:Lcom/google/android/gms/b/go;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/b/hh$10;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hh$10;->f:Lcom/google/android/gms/b/hh;

    invoke-static {v0}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ib;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hh$10;->b:Lcom/google/android/gms/b/gx;

    iget-object v2, p0, Lcom/google/android/gms/b/hh$10;->c:Lcom/google/android/gms/b/go;

    iget-wide v4, p0, Lcom/google/android/gms/b/hh$10;->d:J

    invoke-interface {v0, v1, v2, v4, v5}, Lcom/google/android/gms/b/ib;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hh$10;->f:Lcom/google/android/gms/b/hh;

    invoke-static {v0}, Lcom/google/android/gms/b/hh;->c(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/hp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hh$10;->b:Lcom/google/android/gms/b/gx;

    iget-object v2, p0, Lcom/google/android/gms/b/hh$10;->e:Lcom/google/android/gms/b/go;

    iget-wide v4, p0, Lcom/google/android/gms/b/hh$10;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/google/android/gms/b/hh$10;->f:Lcom/google/android/gms/b/hh;

    new-instance v1, Lcom/google/android/gms/b/ht;

    sget-object v2, Lcom/google/android/gms/b/hv;->a:Lcom/google/android/gms/b/hv;

    iget-object v3, p0, Lcom/google/android/gms/b/hh$10;->b:Lcom/google/android/gms/b/gx;

    iget-object v4, p0, Lcom/google/android/gms/b/hh$10;->e:Lcom/google/android/gms/b/go;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/b/ht;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hu;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/hh$10;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
