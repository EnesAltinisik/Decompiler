.class public abstract Lcom/google/android/gms/b/jk;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/b/jq;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/b/jk;
    .locals 2

    const-string v0, ".value"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/jy;->b()Lcom/google/android/gms/b/jy;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ".key"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/b/jn;->b()Lcom/google/android/gms/b/jn;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ".priority"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "queryDefinition shouldn\'t ever be .priority since it\'s the default"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/b/jt;

    new-instance v1, Lcom/google/android/gms/b/gx;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/gx;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/jt;-><init>(Lcom/google/android/gms/b/gx;)V

    goto :goto_0
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract a(Lcom/google/android/gms/b/jr;)Z
.end method

.method public a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;)Z
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/jq;

    invoke-static {}, Lcom/google/android/gms/b/je;->a()Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/b/jq;-><init>(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    new-instance v1, Lcom/google/android/gms/b/jq;

    invoke-static {}, Lcom/google/android/gms/b/je;->a()Lcom/google/android/gms/b/je;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Lcom/google/android/gms/b/jq;-><init>(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/jk;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
