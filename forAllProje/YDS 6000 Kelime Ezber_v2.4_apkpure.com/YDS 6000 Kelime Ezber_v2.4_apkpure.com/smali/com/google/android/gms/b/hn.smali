.class public Lcom/google/android/gms/b/hn;
.super Lcom/google/android/gms/b/gs;


# instance fields
.field private final b:Lcom/google/android/gms/b/gz;

.field private final c:Lcom/google/firebase/database/m;

.field private final d:Lcom/google/android/gms/b/it;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/gz;Lcom/google/firebase/database/m;Lcom/google/android/gms/b/it;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/gs;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/hn;->b:Lcom/google/android/gms/b/gz;

    iput-object p2, p0, Lcom/google/android/gms/b/hn;->c:Lcom/google/firebase/database/m;

    iput-object p3, p0, Lcom/google/android/gms/b/hn;->d:Lcom/google/android/gms/b/it;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/im;Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/in;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/hn;->b:Lcom/google/android/gms/b/gz;

    invoke-virtual {p2}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)Lcom/google/firebase/database/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/im;->c()Lcom/google/android/gms/b/jl;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/n;->a(Lcom/google/firebase/database/d;Lcom/google/android/gms/b/jl;)Lcom/google/firebase/database/a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/in;

    sget-object v2, Lcom/google/android/gms/b/ip$a;->e:Lcom/google/android/gms/b/ip$a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p0, v0, v3}, Lcom/google/android/gms/b/in;-><init>(Lcom/google/android/gms/b/ip$a;Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/a;Ljava/lang/String;)V

    return-object v1
.end method

.method public a()Lcom/google/android/gms/b/it;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hn;->d:Lcom/google/android/gms/b/it;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/in;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/hn;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hn;->c:Lcom/google/firebase/database/m;

    invoke-virtual {p1}, Lcom/google/android/gms/b/in;->c()Lcom/google/firebase/database/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/database/m;->a(Lcom/google/firebase/database/a;)V

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/database/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hn;->c:Lcom/google/firebase/database/m;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/m;->a(Lcom/google/firebase/database/b;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gs;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/b/hn;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/b/hn;

    iget-object v0, p1, Lcom/google/android/gms/b/hn;->c:Lcom/google/firebase/database/m;

    iget-object v1, p0, Lcom/google/android/gms/b/hn;->c:Lcom/google/firebase/database/m;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/ip$a;)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ip$a;->e:Lcom/google/android/gms/b/ip$a;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/b/hn;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/b/hn;

    iget-object v0, v0, Lcom/google/android/gms/b/hn;->c:Lcom/google/firebase/database/m;

    iget-object v1, p0, Lcom/google/android/gms/b/hn;->c:Lcom/google/firebase/database/m;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/b/hn;

    iget-object v0, v0, Lcom/google/android/gms/b/hn;->b:Lcom/google/android/gms/b/gz;

    iget-object v1, p0, Lcom/google/android/gms/b/hn;->b:Lcom/google/android/gms/b/gz;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/b/hn;

    iget-object v0, p1, Lcom/google/android/gms/b/hn;->d:Lcom/google/android/gms/b/it;

    iget-object v1, p0, Lcom/google/android/gms/b/hn;->d:Lcom/google/android/gms/b/it;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/it;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/hn;->c:Lcom/google/firebase/database/m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/b/hn;->b:Lcom/google/android/gms/b/gz;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/b/hn;->d:Lcom/google/android/gms/b/it;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ValueEventRegistration"

    return-object v0
.end method
