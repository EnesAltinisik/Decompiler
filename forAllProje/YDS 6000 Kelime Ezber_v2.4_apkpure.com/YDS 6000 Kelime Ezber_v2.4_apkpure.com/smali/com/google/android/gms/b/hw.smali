.class public Lcom/google/android/gms/b/hw;
.super Lcom/google/android/gms/b/hu;


# instance fields
.field private final a:Lcom/google/android/gms/b/jr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/hu$a;->a:Lcom/google/android/gms/b/hu$a;

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/b/hu;-><init>(Lcom/google/android/gms/b/hu$a;Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V

    iput-object p3, p0, Lcom/google/android/gms/b/hw;->a:Lcom/google/android/gms/b/jr;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hu;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/hw;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/hw;

    iget-object v1, p0, Lcom/google/android/gms/b/hw;->c:Lcom/google/android/gms/b/hv;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/hw;->a:Lcom/google/android/gms/b/jr;

    invoke-interface {v3, p1}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/hw;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/hw;

    iget-object v1, p0, Lcom/google/android/gms/b/hw;->c:Lcom/google/android/gms/b/hv;

    iget-object v2, p0, Lcom/google/android/gms/b/hw;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/hw;->a:Lcom/google/android/gms/b/jr;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/hw;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hw;->a:Lcom/google/android/gms/b/jr;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Overwrite { path=%s, source=%s, snapshot=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/hw;->c()Lcom/google/android/gms/b/gx;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/b/hw;->d()Lcom/google/android/gms/b/hv;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/b/hw;->a:Lcom/google/android/gms/b/jr;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
