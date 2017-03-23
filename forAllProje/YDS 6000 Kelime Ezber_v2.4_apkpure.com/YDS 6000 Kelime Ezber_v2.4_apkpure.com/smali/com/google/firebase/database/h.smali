.class public Lcom/google/firebase/database/h;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/b/he;

.field private final b:Lcom/google/android/gms/b/gx;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/he;Lcom/google/android/gms/b/gx;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/database/h;->a:Lcom/google/android/gms/b/he;

    iput-object p2, p0, Lcom/google/firebase/database/h;->b:Lcom/google/android/gms/b/gx;

    iget-object v0, p0, Lcom/google/firebase/database/h;->b:Lcom/google/android/gms/b/gx;

    invoke-virtual {p0}, Lcom/google/firebase/database/h;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/b/hm;->a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/b/jr;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/he;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/he;-><init>(Lcom/google/android/gms/b/jr;)V

    new-instance v1, Lcom/google/android/gms/b/gx;

    const-string v2, ""

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/gx;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/database/h;-><init>(Lcom/google/android/gms/b/he;Lcom/google/android/gms/b/gx;)V

    return-void
.end method


# virtual methods
.method a()Lcom/google/android/gms/b/jr;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/database/h;->a:Lcom/google/android/gms/b/he;

    iget-object v1, p0, Lcom/google/firebase/database/h;->b:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/he;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/database/h;->a()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/firebase/database/h;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/firebase/database/h;->a:Lcom/google/android/gms/b/he;

    move-object v0, p1

    check-cast v0, Lcom/google/firebase/database/h;

    iget-object v0, v0, Lcom/google/firebase/database/h;->a:Lcom/google/android/gms/b/he;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/database/h;->b:Lcom/google/android/gms/b/gx;

    check-cast p1, Lcom/google/firebase/database/h;

    iget-object v1, p1, Lcom/google/firebase/database/h;->b:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gx;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/database/h;->b:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/je;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/google/firebase/database/h;->a:Lcom/google/android/gms/b/he;

    invoke-virtual {v1}, Lcom/google/android/gms/b/he;->a()Lcom/google/android/gms/b/jr;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/google/android/gms/b/jr;->a(Z)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x20

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "MutableData { key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", value = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "<none>"

    goto :goto_0
.end method
