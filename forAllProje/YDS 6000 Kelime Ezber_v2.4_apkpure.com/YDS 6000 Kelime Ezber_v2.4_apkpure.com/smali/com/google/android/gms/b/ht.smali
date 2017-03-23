.class public Lcom/google/android/gms/b/ht;
.super Lcom/google/android/gms/b/hu;


# instance fields
.field private final a:Lcom/google/android/gms/b/go;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/hu$a;->b:Lcom/google/android/gms/b/hu$a;

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/b/hu;-><init>(Lcom/google/android/gms/b/hu$a;Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V

    iput-object p3, p0, Lcom/google/android/gms/b/ht;->a:Lcom/google/android/gms/b/go;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/go;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ht;->a:Lcom/google/android/gms/b/go;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hu;
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/b/ht;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/b/ht;->a:Lcom/google/android/gms/b/go;

    new-instance v2, Lcom/google/android/gms/b/gx;

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/google/android/gms/b/je;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-direct {v2, v3}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/go;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/go;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/go;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/b/go;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/b/hw;

    iget-object v2, p0, Lcom/google/android/gms/b/ht;->c:Lcom/google/android/gms/b/hv;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/b/go;->b()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/b/hw;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/b/ht;

    iget-object v2, p0, Lcom/google/android/gms/b/ht;->c:Lcom/google/android/gms/b/hv;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/b/ht;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/b/ht;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/b/je;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/b/ht;

    iget-object v1, p0, Lcom/google/android/gms/b/ht;->c:Lcom/google/android/gms/b/hv;

    iget-object v2, p0, Lcom/google/android/gms/b/ht;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/ht;->a:Lcom/google/android/gms/b/go;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/ht;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Merge { path=%s, source=%s, children=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/ht;->c()Lcom/google/android/gms/b/gx;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/b/ht;->d()Lcom/google/android/gms/b/hv;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/b/ht;->a:Lcom/google/android/gms/b/go;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
