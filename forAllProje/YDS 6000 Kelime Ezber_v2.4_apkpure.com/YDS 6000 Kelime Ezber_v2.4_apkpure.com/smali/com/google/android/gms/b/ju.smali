.class public Lcom/google/android/gms/b/ju;
.super Lcom/google/android/gms/b/jk;


# static fields
.field private static final a:Lcom/google/android/gms/b/ju;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/ju;

    invoke-direct {v0}, Lcom/google/android/gms/b/ju;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ju;->a:Lcom/google/android/gms/b/ju;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/jk;-><init>()V

    return-void
.end method

.method public static b()Lcom/google/android/gms/b/ju;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ju;->a:Lcom/google/android/gms/b/ju;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/jq;Lcom/google/android/gms/b/jq;)I
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v3

    invoke-static {v2, v0, v3, v1}, Lcom/google/android/gms/b/js;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)I

    move-result v0

    return v0
.end method

.method public a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get query definition on priority index!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/b/jr;)Z
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/b/jr;->e()Lcom/google/android/gms/b/jr;

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

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/ju;->a(Lcom/google/android/gms/b/jq;Lcom/google/android/gms/b/jq;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/b/ju;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x302679

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PriorityIndex"

    return-object v0
.end method
