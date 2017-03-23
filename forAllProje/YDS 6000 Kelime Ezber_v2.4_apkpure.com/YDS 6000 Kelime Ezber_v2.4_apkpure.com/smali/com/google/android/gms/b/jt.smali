.class public Lcom/google/android/gms/b/jt;
.super Lcom/google/android/gms/b/jk;


# instance fields
.field private final a:Lcom/google/android/gms/b/gx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/gx;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/b/jk;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/je;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t create PathIndex with \'.priority\' as key. Please use PriorityIndex instead!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/b/jt;->a:Lcom/google/android/gms/b/gx;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/jq;Lcom/google/android/gms/b/jq;)I
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/jt;->a:Lcom/google/android/gms/b/gx;

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/jt;->a:Lcom/google/android/gms/b/gx;

    invoke-interface {v1, v2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/jr;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/je;->a(Lcom/google/android/gms/b/je;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/jt;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jr;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/jt;->a:Lcom/google/android/gms/b/gx;

    invoke-interface {p1, v0}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/b/jq;

    check-cast p2, Lcom/google/android/gms/b/jq;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/jt;->a(Lcom/google/android/gms/b/jq;Lcom/google/android/gms/b/jq;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Lcom/google/android/gms/b/jt;

    iget-object v2, p0, Lcom/google/android/gms/b/jt;->a:Lcom/google/android/gms/b/gx;

    iget-object v3, p1, Lcom/google/android/gms/b/jt;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/gx;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/jt;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->hashCode()I

    move-result v0

    return v0
.end method
