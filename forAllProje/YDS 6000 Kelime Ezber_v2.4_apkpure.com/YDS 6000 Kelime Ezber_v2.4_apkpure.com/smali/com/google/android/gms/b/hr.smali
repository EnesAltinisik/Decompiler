.class public Lcom/google/android/gms/b/hr;
.super Lcom/google/android/gms/b/hu;


# instance fields
.field private final a:Z

.field private final e:Lcom/google/android/gms/b/ig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ig",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/ig",
            "<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/b/hu$a;->c:Lcom/google/android/gms/b/hu$a;

    sget-object v1, Lcom/google/android/gms/b/hv;->a:Lcom/google/android/gms/b/hv;

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/b/hu;-><init>(Lcom/google/android/gms/b/hu$a;Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V

    iput-object p2, p0, Lcom/google/android/gms/b/hr;->e:Lcom/google/android/gms/b/ig;

    iput-boolean p3, p0, Lcom/google/android/gms/b/hr;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hu;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/hr;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hr;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/je;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "operationForChild called for unrelated child."

    invoke-static {v0, v1}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/b/hr;

    iget-object v1, p0, Lcom/google/android/gms/b/hr;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/hr;->e:Lcom/google/android/gms/b/ig;

    iget-boolean v3, p0, Lcom/google/android/gms/b/hr;->a:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/hr;-><init>(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;Z)V

    move-object p0, v0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hr;->e:Lcom/google/android/gms/b/ig;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ig;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/hr;->e:Lcom/google/android/gms/b/ig;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ig;->c()Lcom/google/android/gms/b/fo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/fo;->b()Z

    move-result v0

    const-string v1, "affectedTree should not have overlapping affected paths."

    invoke-static {v0, v1}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/hr;->e:Lcom/google/android/gms/b/ig;

    new-instance v1, Lcom/google/android/gms/b/gx;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/b/je;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ig;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ig;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/b/hr;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    iget-boolean v3, p0, Lcom/google/android/gms/b/hr;->a:Z

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/b/hr;-><init>(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;Z)V

    move-object p0, v0

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/b/ig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/ig",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hr;->e:Lcom/google/android/gms/b/ig;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/hr;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "AckUserWrite { path=%s, revert=%s, affectedTree=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/hr;->c()Lcom/google/android/gms/b/gx;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-boolean v3, p0, Lcom/google/android/gms/b/hr;->a:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/b/hr;->e:Lcom/google/android/gms/b/ig;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
