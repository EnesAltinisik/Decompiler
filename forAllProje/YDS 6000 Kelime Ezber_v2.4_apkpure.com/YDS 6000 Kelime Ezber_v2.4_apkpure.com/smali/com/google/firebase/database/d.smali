.class public Lcom/google/firebase/database/d;
.super Lcom/google/firebase/database/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/database/d$a;
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/database/j;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)V

    return-void
.end method

.method private a(Ljava/lang/Object;Lcom/google/android/gms/b/jr;Lcom/google/firebase/database/d$a;)Lcom/google/android/gms/c/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/b/jr;",
            "Lcom/google/firebase/database/d$a;",
            ")",
            "Lcom/google/android/gms/c/d",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->c()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/ku;->a(Lcom/google/android/gms/b/gx;)V

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->c()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/b/hm;->a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/b/kv;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/ku;->a(Ljava/lang/Object;)V

    invoke-static {v0, p2}, Lcom/google/android/gms/b/js;->a(Ljava/lang/Object;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-static {p3}, Lcom/google/android/gms/b/kt;->a(Lcom/google/firebase/database/d$a;)Lcom/google/android/gms/b/kr;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/database/d;->a:Lcom/google/android/gms/b/gz;

    new-instance v3, Lcom/google/firebase/database/d$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/firebase/database/d$1;-><init>(Lcom/google/firebase/database/d;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/kr;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/gz;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Lcom/google/android/gms/b/kr;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/c/d;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/google/android/gms/c/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/c/d",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/gms/b/jv;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/firebase/database/d;->a(Ljava/lang/Object;Lcom/google/android/gms/b/jr;Lcom/google/firebase/database/d$a;)Lcom/google/android/gms/c/d;

    move-result-object v0

    return-object v0
.end method

.method public a()Lcom/google/firebase/database/d;
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->c()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->f()Lcom/google/android/gms/b/gx;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/firebase/database/d;

    iget-object v2, p0, Lcom/google/firebase/database/d;->a:Lcom/google/android/gms/b/gz;

    invoke-direct {v0, v2, v1}, Lcom/google/firebase/database/d;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)V

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/google/firebase/database/d;
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Can\'t pass null for argument \'pathString\' in child()"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/database/d;->c()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/b/ku;->b(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lcom/google/firebase/database/d;->c()Lcom/google/android/gms/b/gx;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/gx;

    invoke-direct {v1, p1}, Lcom/google/android/gms/b/gx;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/database/d;

    iget-object v2, p0, Lcom/google/firebase/database/d;->a:Lcom/google/android/gms/b/gz;

    invoke-direct {v1, v2, v0}, Lcom/google/firebase/database/d;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)V

    return-object v1

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/b/ku;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->c()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/database/d;->c()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->g()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/je;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/firebase/database/d;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->a()Lcom/google/firebase/database/d;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/database/d;->a:Lcom/google/android/gms/b/gz;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gz;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/google/firebase/database/d;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "+"

    const-string v3, "%20"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    new-instance v2, Lcom/google/firebase/database/c;

    const-string v3, "Failed to URLEncode key: "

    invoke-virtual {p0}, Lcom/google/firebase/database/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v2, v0, v1}, Lcom/google/firebase/database/c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method
