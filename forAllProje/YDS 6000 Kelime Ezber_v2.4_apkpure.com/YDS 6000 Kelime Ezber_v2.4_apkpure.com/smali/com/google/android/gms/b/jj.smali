.class public Lcom/google/android/gms/b/jj;
.super Lcom/google/android/gms/b/jf;

# interfaces
.implements Lcom/google/android/gms/b/jr;


# static fields
.field private static final c:Lcom/google/android/gms/b/jj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/jj;

    invoke-direct {v0}, Lcom/google/android/gms/b/jj;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/jj;->c:Lcom/google/android/gms/b/jj;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/jf;-><init>()V

    return-void
.end method

.method public static f()Lcom/google/android/gms/b/jj;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/jj;->c:Lcom/google/android/gms/b/jj;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/jr;)I
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;
    .locals 0

    return-object p0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p2

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/jj;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-interface {v1, v2, p2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/jj;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object p2

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 1

    invoke-interface {p2}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/je;->e()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/jf;

    invoke-direct {v0}, Lcom/google/android/gms/b/jf;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/jf;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object p0

    goto :goto_0
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Z)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jr$a;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/je;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/je;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/jj;->c(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jj;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jj;
    .locals 0

    return-object p0
.end method

.method public c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;
    .locals 0

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/b/jr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/jj;->a(Lcom/google/android/gms/b/jr;)I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/google/android/gms/b/jr;
    .locals 0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v1, 0x1

    instance-of v0, p1, Lcom/google/android/gms/b/jj;

    if-eqz v0, :cond_0

    :goto_0
    return v1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/b/jr;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/b/jr;

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/jj;->e()Lcom/google/android/gms/b/jr;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/b/jr;

    invoke-interface {p1}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/b/jq;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "<Empty Node>"

    return-object v0
.end method
