.class public Lcom/google/android/gms/b/jl;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Lcom/google/android/gms/b/jq;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/b/fq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/fq",
            "<",
            "Lcom/google/android/gms/b/jq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/google/android/gms/b/jr;

.field private c:Lcom/google/android/gms/b/fq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/fq",
            "<",
            "Lcom/google/android/gms/b/jq;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/b/jk;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/fq;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/fq;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    sput-object v0, Lcom/google/android/gms/b/jl;->a:Lcom/google/android/gms/b/fq;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    iput-object p1, p0, Lcom/google/android/gms/b/jl;->b:Lcom/google/android/gms/b/jr;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;Lcom/google/android/gms/b/fq;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/jr;",
            "Lcom/google/android/gms/b/jk;",
            "Lcom/google/android/gms/b/fq",
            "<",
            "Lcom/google/android/gms/b/jq;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    iput-object p1, p0, Lcom/google/android/gms/b/jl;->b:Lcom/google/android/gms/b/jr;

    iput-object p3, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    return-void
.end method

.method public static a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jl;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/jl;

    invoke-static {}, Lcom/google/android/gms/b/ju;->b()Lcom/google/android/gms/b/ju;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/b/jl;-><init>(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/jl;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/jl;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/jl;-><init>(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)V

    return-object v0
.end method

.method private b()V
    .locals 7

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    invoke-static {}, Lcom/google/android/gms/b/jn;->b()Lcom/google/android/gms/b/jn;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/b/jl;->a:Lcom/google/android/gms/b/fq;

    iput-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->b:Lcom/google/android/gms/b/jr;

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jq;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/b/jk;->a(Lcom/google/android/gms/b/jr;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :goto_2
    new-instance v5, Lcom/google/android/gms/b/jq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-direct {v5, v6, v0}, Lcom/google/android/gms/b/jq;-><init>(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    new-instance v0, Lcom/google/android/gms/b/fq;

    iget-object v1, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    invoke-direct {v0, v3, v1}, Lcom/google/android/gms/b/fq;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    goto :goto_0

    :cond_5
    sget-object v0, Lcom/google/android/gms/b/jl;->a:Lcom/google/android/gms/b/fq;

    iput-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;)Lcom/google/android/gms/b/je;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    invoke-static {}, Lcom/google/android/gms/b/jn;->b()Lcom/google/android/gms/b/jn;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    invoke-virtual {v0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Index not available in IndexedNode!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/b/jl;->b()V

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    sget-object v1, Lcom/google/android/gms/b/jl;->a:Lcom/google/android/gms/b/fq;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->b:Lcom/google/android/gms/b/jr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/jr;->b(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/je;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    new-instance v1, Lcom/google/android/gms/b/jq;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/b/jq;-><init>(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/fq;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jq;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/b/jq;->a()Lcom/google/android/gms/b/je;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jl;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->b:Lcom/google/android/gms/b/jr;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    sget-object v1, Lcom/google/android/gms/b/jl;->a:Lcom/google/android/gms/b/fq;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/b/jk;->a(Lcom/google/android/gms/b/jr;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/jl;

    iget-object v1, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    sget-object v3, Lcom/google/android/gms/b/jl;->a:Lcom/google/android/gms/b/fq;

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/b/jl;-><init>(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;Lcom/google/android/gms/b/fq;)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    sget-object v1, Lcom/google/android/gms/b/jl;->a:Lcom/google/android/gms/b/fq;

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Lcom/google/android/gms/b/jl;

    iget-object v1, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/b/jl;-><init>(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;Lcom/google/android/gms/b/fq;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/jl;->b:Lcom/google/android/gms/b/jr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    new-instance v3, Lcom/google/android/gms/b/jq;

    invoke-direct {v3, p1, v0}, Lcom/google/android/gms/b/jq;-><init>(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/b/fq;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/fq;

    move-result-object v0

    invoke-interface {p2}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lcom/google/android/gms/b/jq;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/b/jq;-><init>(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/fq;->b(Ljava/lang/Object;)Lcom/google/android/gms/b/fq;

    move-result-object v0

    :cond_3
    new-instance v1, Lcom/google/android/gms/b/jl;

    iget-object v3, p0, Lcom/google/android/gms/b/jl;->d:Lcom/google/android/gms/b/jk;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/b/jl;-><init>(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jk;Lcom/google/android/gms/b/fq;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->b:Lcom/google/android/gms/b/jr;

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/b/jq;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/b/jl;->b()V

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    sget-object v1, Lcom/google/android/gms/b/jl;->a:Lcom/google/android/gms/b/fq;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/jl;->b:Lcom/google/android/gms/b/jr;

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/jl;->c:Lcom/google/android/gms/b/fq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/fq;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0
.end method
