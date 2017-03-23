.class public final Lcom/google/android/gms/b/wc;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/wc$b;,
        Lcom/google/android/gms/b/wc$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)Lcom/google/android/gms/b/zk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/b/aab;",
            "Lcom/google/android/gms/b/aaj",
            "<",
            "Lcom/google/android/gms/b/wf;",
            ">;",
            "Lcom/google/android/gms/b/wc$a;",
            ")",
            "Lcom/google/android/gms/b/zk;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/b/wc$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/wc$1;-><init>(Landroid/content/Context;)V

    invoke-static {p0, p1, p2, p3, v0}, Lcom/google/android/gms/b/wc;->a(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;Lcom/google/android/gms/b/wc$b;)Lcom/google/android/gms/b/zk;

    move-result-object v0

    return-object v0
.end method

.method static a(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;Lcom/google/android/gms/b/wc$b;)Lcom/google/android/gms/b/zk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/b/aab;",
            "Lcom/google/android/gms/b/aaj",
            "<",
            "Lcom/google/android/gms/b/wf;",
            ">;",
            "Lcom/google/android/gms/b/wc$a;",
            "Lcom/google/android/gms/b/wc$b;",
            ")",
            "Lcom/google/android/gms/b/zk;"
        }
    .end annotation

    invoke-interface {p4, p1}, Lcom/google/android/gms/b/wc$b;->a(Lcom/google/android/gms/b/aab;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p2, p3}, Lcom/google/android/gms/b/wc;->a(Landroid/content/Context;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)Lcom/google/android/gms/b/zk;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/b/wc;->b(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)Lcom/google/android/gms/b/zk;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)Lcom/google/android/gms/b/zk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/b/aaj",
            "<",
            "Lcom/google/android/gms/b/wf;",
            ">;",
            "Lcom/google/android/gms/b/wc$a;",
            ")",
            "Lcom/google/android/gms/b/zk;"
        }
    .end annotation

    const-string v0, "Fetching ad response from local ad request service."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/b/wd$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/b/wd$a;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)V

    invoke-virtual {v0}, Lcom/google/android/gms/b/wd;->e()Ljava/lang/Object;

    return-object v0
.end method

.method private static b(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)Lcom/google/android/gms/b/zk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/b/aab;",
            "Lcom/google/android/gms/b/aaj",
            "<",
            "Lcom/google/android/gms/b/wf;",
            ">;",
            "Lcom/google/android/gms/b/wc$a;",
            ")",
            "Lcom/google/android/gms/b/zk;"
        }
    .end annotation

    const-string v0, "Fetching ad response from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/b/oc;->a()Lcom/google/android/gms/b/zx;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/zx;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Failed to connect to remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->e(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/wd$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/b/wd$b;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)V

    goto :goto_0
.end method
