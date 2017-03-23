.class public Lcom/google/android/gms/b/ik;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/b/jl;

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/jl;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/ik;->a:Lcom/google/android/gms/b/jl;

    iput-boolean p2, p0, Lcom/google/android/gms/b/ik;->b:Z

    iput-boolean p3, p0, Lcom/google/android/gms/b/ik;->c:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/ik;->b:Z

    return v0
.end method

.method public a(Lcom/google/android/gms/b/gx;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/b/ik;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/ik;->a(Lcom/google/android/gms/b/je;)Z

    move-result v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/je;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/b/ik;->c:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ik;->a:Lcom/google/android/gms/b/jl;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jl;->a()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/je;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/ik;->c:Z

    return v0
.end method

.method public c()Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ik;->a:Lcom/google/android/gms/b/jl;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jl;->a()Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/b/jl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ik;->a:Lcom/google/android/gms/b/jl;

    return-object v0
.end method
