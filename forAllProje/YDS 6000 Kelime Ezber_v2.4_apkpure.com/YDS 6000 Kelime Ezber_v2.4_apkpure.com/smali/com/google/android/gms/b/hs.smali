.class public Lcom/google/android/gms/b/hs;
.super Lcom/google/android/gms/b/hu;


# static fields
.field static final synthetic a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/hs;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/hs;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/hu$a;->d:Lcom/google/android/gms/b/hu$a;

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/b/hu;-><init>(Lcom/google/android/gms/b/hu$a;Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V

    sget-boolean v0, Lcom/google/android/gms/b/hs;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/hv;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Can\'t have a listen complete from a user source"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hu;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/hs;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/hs;

    iget-object v1, p0, Lcom/google/android/gms/b/hs;->c:Lcom/google/android/gms/b/hv;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/hs;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/hs;

    iget-object v1, p0, Lcom/google/android/gms/b/hs;->c:Lcom/google/android/gms/b/hv;

    iget-object v2, p0, Lcom/google/android/gms/b/hs;->d:Lcom/google/android/gms/b/gx;

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/hs;-><init>(Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "ListenComplete { path=%s, source=%s }"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/hs;->c()Lcom/google/android/gms/b/gx;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/b/hs;->d()Lcom/google/android/gms/b/hv;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
