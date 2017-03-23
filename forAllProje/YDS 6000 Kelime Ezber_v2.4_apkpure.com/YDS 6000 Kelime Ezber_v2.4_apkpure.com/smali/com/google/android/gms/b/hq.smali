.class public Lcom/google/android/gms/b/hq;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/b/gx;

.field private final b:Lcom/google/android/gms/b/hp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/hq;->a:Lcom/google/android/gms/b/gx;

    iput-object p2, p0, Lcom/google/android/gms/b/hq;->b:Lcom/google/android/gms/b/hp;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hq;
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/hq;

    iget-object v1, p0, Lcom/google/android/gms/b/hq;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/gx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/hq;->b:Lcom/google/android/gms/b/hp;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/hq;-><init>(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hp;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/hq;->b:Lcom/google/android/gms/b/hp;

    iget-object v1, p0, Lcom/google/android/gms/b/hq;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/hp;->b(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/hq;->b:Lcom/google/android/gms/b/hp;

    iget-object v1, p0, Lcom/google/android/gms/b/hq;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/ik;)Lcom/google/android/gms/b/jr;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/hq;->b:Lcom/google/android/gms/b/hp;

    iget-object v1, p0, Lcom/google/android/gms/b/hq;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/ik;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/jr;Ljava/util/List;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jr;Ljava/util/List;)Lcom/google/android/gms/b/jr;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/jr;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/b/jr;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/jr;Ljava/util/List;Z)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jr;Ljava/util/List;Z)Lcom/google/android/gms/b/jr;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/jr;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;Z)",
            "Lcom/google/android/gms/b/jr;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hq;->b:Lcom/google/android/gms/b/hp;

    iget-object v1, p0, Lcom/google/android/gms/b/hq;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Ljava/util/List;Z)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/hq;->b:Lcom/google/android/gms/b/hp;

    iget-object v1, p0, Lcom/google/android/gms/b/hq;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method
