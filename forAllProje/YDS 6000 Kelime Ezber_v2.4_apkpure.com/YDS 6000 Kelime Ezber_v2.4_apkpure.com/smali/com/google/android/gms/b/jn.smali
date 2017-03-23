.class public Lcom/google/android/gms/b/jn;
.super Lcom/google/android/gms/b/jk;


# static fields
.field static final synthetic a:Z

.field private static final b:Lcom/google/android/gms/b/jn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/jn;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/jn;->a:Z

    new-instance v0, Lcom/google/android/gms/b/jn;

    invoke-direct {v0}, Lcom/google/android/gms/b/jn;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/jn;->b:Lcom/google/android/gms/b/jn;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/jk;-><init>()V

    return-void
.end method

.method public static b()Lcom/google/android/gms/b/jn;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/jn;->b:Lcom/google/android/gms/b/jn;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/jq;Lcom/google/android/gms/b/jq;)I
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/je;->a(Lcom/google/android/gms/b/je;)I

    move-result v0

    return v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, ".key"

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jr;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/b/jq;

    check-cast p2, Lcom/google/android/gms/b/jq;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/jn;->a(Lcom/google/android/gms/b/jq;Lcom/google/android/gms/b/jq;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/b/jn;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const/16 v0, 0x25

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "KeyIndex"

    return-object v0
.end method
