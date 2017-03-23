.class public Lcom/google/android/gms/b/iv;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/b/ik;

.field private final b:Lcom/google/android/gms/b/ik;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/ik;Lcom/google/android/gms/b/ik;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/iv;->a:Lcom/google/android/gms/b/ik;

    iput-object p2, p0, Lcom/google/android/gms/b/iv;->b:Lcom/google/android/gms/b/ik;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/ik;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/iv;->a:Lcom/google/android/gms/b/ik;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/iv;

    new-instance v1, Lcom/google/android/gms/b/ik;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/b/ik;-><init>(Lcom/google/android/gms/b/jl;ZZ)V

    iget-object v2, p0, Lcom/google/android/gms/b/iv;->b:Lcom/google/android/gms/b/ik;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/iv;-><init>(Lcom/google/android/gms/b/ik;Lcom/google/android/gms/b/ik;)V

    return-object v0
.end method

.method public b(Lcom/google/android/gms/b/jl;ZZ)Lcom/google/android/gms/b/iv;
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/iv;

    iget-object v1, p0, Lcom/google/android/gms/b/iv;->a:Lcom/google/android/gms/b/ik;

    new-instance v2, Lcom/google/android/gms/b/ik;

    invoke-direct {v2, p1, p2, p3}, Lcom/google/android/gms/b/ik;-><init>(Lcom/google/android/gms/b/jl;ZZ)V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/iv;-><init>(Lcom/google/android/gms/b/ik;Lcom/google/android/gms/b/ik;)V

    return-object v0
.end method

.method public b()Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/iv;->a:Lcom/google/android/gms/b/ik;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/iv;->a:Lcom/google/android/gms/b/ik;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/b/ik;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/iv;->b:Lcom/google/android/gms/b/ik;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/iv;->b:Lcom/google/android/gms/b/ik;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/iv;->b:Lcom/google/android/gms/b/ik;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
