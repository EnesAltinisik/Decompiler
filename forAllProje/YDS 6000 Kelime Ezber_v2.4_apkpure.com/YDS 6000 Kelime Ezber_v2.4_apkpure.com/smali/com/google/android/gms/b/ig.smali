.class public Lcom/google/android/gms/b/ig;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/ig$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Ljava/util/Map$Entry",
        "<",
        "Lcom/google/android/gms/b/gx;",
        "TT;>;>;"
    }
.end annotation


# static fields
.field private static final c:Lcom/google/android/gms/b/fo;

.field private static final d:Lcom/google/android/gms/b/ig;


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/b/fo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/fo",
            "<",
            "Lcom/google/android/gms/b/je;",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/google/android/gms/b/je;

    invoke-static {v0}, Lcom/google/android/gms/b/fx;->a(Ljava/lang/Class;)Lcom/google/android/gms/b/fx;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/fo$a;->a(Ljava/util/Comparator;)Lcom/google/android/gms/b/fo;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/ig;->c:Lcom/google/android/gms/b/fo;

    new-instance v0, Lcom/google/android/gms/b/ig;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/b/ig;->c:Lcom/google/android/gms/b/fo;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/ig;-><init>(Ljava/lang/Object;Lcom/google/android/gms/b/fo;)V

    sput-object v0, Lcom/google/android/gms/b/ig;->d:Lcom/google/android/gms/b/ig;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/b/ig;->c:Lcom/google/android/gms/b/fo;

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/ig;-><init>(Ljava/lang/Object;Lcom/google/android/gms/b/fo;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/b/fo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/b/fo",
            "<",
            "Lcom/google/android/gms/b/je;",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    return-void
.end method

.method public static a()Lcom/google/android/gms/b/ig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/android/gms/b/ig",
            "<TV;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/b/ig;->d:Lcom/google/android/gms/b/ig;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/ig$a",
            "<-TT;TR;>;TR;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0}, Lcom/google/android/gms/b/fo;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/ig;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/je;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-direct {v1, v0, p2, p3}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-interface {p2, p1, v0, p3}, Lcom/google/android/gms/b/ig$a;->a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :cond_1
    return-object p3
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ih;->d:Lcom/google/android/gms/b/ih;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ih;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ih;)Lcom/google/android/gms/b/gx;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/ih",
            "<-TT;>;)",
            "Lcom/google/android/gms/b/gx;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-interface {p2, v0}, Lcom/google/android/gms/b/ih;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v0, v3, p2}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ih;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/google/android/gms/b/gx;

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/google/android/gms/b/je;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-direct {v1, v3}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;)Lcom/google/android/gms/b/ig;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;)",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p2

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig;)Lcom/google/android/gms/b/ig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ig;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/fo;->c(Ljava/lang/Object;)Lcom/google/android/gms/b/fo;

    move-result-object v0

    :goto_1
    new-instance p2, Lcom/google/android/gms/b/ig;

    iget-object v1, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-direct {p2, v1, v0}, Lcom/google/android/gms/b/ig;-><init>(Ljava/lang/Object;Lcom/google/android/gms/b/fo;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/b/fo;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/b/fo;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;)Lcom/google/android/gms/b/ig;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "TT;)",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/ig;

    iget-object v1, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/b/ig;-><init>(Ljava/lang/Object;Lcom/google/android/gms/b/fo;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;)Lcom/google/android/gms/b/ig;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/b/fo;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/b/fo;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/b/ig;

    iget-object v2, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/b/ig;-><init>(Ljava/lang/Object;Lcom/google/android/gms/b/fo;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/ig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/je;",
            ")",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;Lcom/google/android/gms/b/ig$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lcom/google/android/gms/b/ig$a",
            "<-TT;TR;>;)TR;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-direct {p0, v0, p2, p1}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/ig$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ig$a",
            "<TT;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ig$a;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/ih;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ih",
            "<-TT;>;)Z"
        }
    .end annotation

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lcom/google/android/gms/b/ih;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0}, Lcom/google/android/gms/b/fo;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/ih;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public b(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/b/ih;->d:Lcom/google/android/gms/b/ih;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/b/ig;->c(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ih;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ih;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/ih",
            "<-TT;>;)TT;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-interface {p2, v0}, Lcom/google/android/gms/b/ih;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/je;

    iget-object v3, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v3, :cond_2

    iget-object v3, v0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-interface {p2, v3}, Lcom/google/android/gms/b/ih;->a(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, v0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    move-object p0, v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/b/fo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/fo",
            "<",
            "Lcom/google/android/gms/b/je;",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    return-object v0
.end method

.method public c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ig;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            ")",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ig;->c(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ig;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object p0

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/ih;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/ih",
            "<-TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-interface {p2, v0}, Lcom/google/android/gms/b/ih;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/je;

    iget-object v3, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-nez v0, :cond_2

    :cond_0
    return-object v1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v3, v0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v3, :cond_3

    iget-object v3, v0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-interface {p2, v3}, Lcom/google/android/gms/b/ih;->a(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v1, v0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    :cond_3
    move-object p0, v0

    goto :goto_1
.end method

.method public d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ig;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            ")",
            "Lcom/google/android/gms/b/ig",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0}, Lcom/google/android/gms/b/fo;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object p0

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    new-instance v0, Lcom/google/android/gms/b/ig;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/ig;-><init>(Ljava/lang/Object;Lcom/google/android/gms/b/fo;)V

    move-object p0, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/ig;->d(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ig;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/fo;->c(Ljava/lang/Object;)Lcom/google/android/gms/b/fo;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/b/fo;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object p0

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/b/fo;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/b/fo;

    move-result-object v0

    goto :goto_1

    :cond_4
    new-instance v1, Lcom/google/android/gms/b/ig;

    iget-object v2, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/b/ig;-><init>(Ljava/lang/Object;Lcom/google/android/gms/b/fo;)V

    move-object p0, v1

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0}, Lcom/google/android/gms/b/fo;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ig;->e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/google/android/gms/b/ig$1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/b/ig$1;-><init>(Lcom/google/android/gms/b/ig;Ljava/util/ArrayList;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/ig$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Lcom/google/android/gms/b/ig;

    iget-object v2, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    iget-object v3, p1, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/fo;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p1, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    if-nez v2, :cond_4

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    iget-object v3, p1, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    goto :goto_0

    :cond_7
    iget-object v2, p1, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public hashCode()I
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v1}, Lcom/google/android/gms/b/fo;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Lcom/google/android/gms/b/gx;",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/google/android/gms/b/ig$2;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/b/ig$2;-><init>(Lcom/google/android/gms/b/ig;Ljava/util/List;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/ig$a;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ImmutableTree { value="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/gms/b/ig;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", children={"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/gms/b/ig;->b:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0}, Lcom/google/android/gms/b/fo;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/je;

    invoke-virtual {v1}, Lcom/google/android/gms/b/je;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "} }"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
