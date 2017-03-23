.class public abstract Lcom/google/android/gms/b/fv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ft;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/ft",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/b/ft;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/b/ft;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/fv;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/b/fv;->b:Ljava/lang/Object;

    if-nez p3, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/fs;->a()Lcom/google/android/gms/b/fs;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    if-nez p4, :cond_1

    invoke-static {}, Lcom/google/android/gms/b/fs;->a()Lcom/google/android/gms/b/fs;

    move-result-object p4

    :cond_1
    iput-object p4, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    return-void
.end method

.method private static b(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft$a;
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/b/ft$a;->b:Lcom/google/android/gms/b/ft$a;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/b/ft$a;->a:Lcom/google/android/gms/b/ft$a;

    goto :goto_0
.end method

.method private j()Lcom/google/android/gms/b/ft;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/fs;->a()Lcom/google/android/gms/b/fs;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/fv;->f()Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/fv;->f()Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->f()Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->k()Lcom/google/android/gms/b/fv;

    move-result-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    check-cast v0, Lcom/google/android/gms/b/fv;

    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->j()Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-virtual {p0, v1, v1, v0, v1}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object v0

    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->m()Lcom/google/android/gms/b/fv;

    move-result-object v0

    goto :goto_0
.end method

.method private k()Lcom/google/android/gms/b/fv;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->p()Lcom/google/android/gms/b/fv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/fv;->g()Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->f()Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/b/fv;->g()Lcom/google/android/gms/b/ft;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/fv;

    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->o()Lcom/google/android/gms/b/fv;

    move-result-object v0

    invoke-virtual {v1, v2, v2, v2, v0}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object v0

    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->n()Lcom/google/android/gms/b/fv;

    move-result-object v0

    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->p()Lcom/google/android/gms/b/fv;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method private l()Lcom/google/android/gms/b/fv;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->p()Lcom/google/android/gms/b/fv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/fv;->f()Lcom/google/android/gms/b/ft;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/b/ft;->f()Lcom/google/android/gms/b/ft;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->o()Lcom/google/android/gms/b/fv;

    move-result-object v0

    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->p()Lcom/google/android/gms/b/fv;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private m()Lcom/google/android/gms/b/fv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->n()Lcom/google/android/gms/b/fv;

    move-result-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    check-cast v0, Lcom/google/android/gms/b/fv;

    iget-object v0, v0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->o()Lcom/google/android/gms/b/fv;

    move-result-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->p()Lcom/google/android/gms/b/fv;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method private n()Lcom/google/android/gms/b/fv;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    sget-object v3, Lcom/google/android/gms/b/ft$a;->a:Lcom/google/android/gms/b/ft$a;

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    check-cast v0, Lcom/google/android/gms/b/fv;

    iget-object v5, v0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    move-object v0, p0

    move-object v2, v1

    move-object v4, v1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/b/fv;

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-virtual {p0}, Lcom/google/android/gms/b/fv;->a()Lcom/google/android/gms/b/ft$a;

    move-result-object v3

    move-object v2, v1

    move-object v5, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/b/ft;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/fv;

    return-object v0
.end method

.method private o()Lcom/google/android/gms/b/fv;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    sget-object v3, Lcom/google/android/gms/b/ft$a;->a:Lcom/google/android/gms/b/ft$a;

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    check-cast v0, Lcom/google/android/gms/b/fv;

    iget-object v4, v0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    move-object v0, p0

    move-object v2, v1

    move-object v5, v1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/b/fv;

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-virtual {p0}, Lcom/google/android/gms/b/fv;->a()Lcom/google/android/gms/b/ft$a;

    move-result-object v3

    move-object v2, v1

    move-object v4, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/b/ft;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/fv;

    return-object v0
.end method

.method private p()Lcom/google/android/gms/b/fv;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    iget-object v2, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-static {v2}, Lcom/google/android/gms/b/fv;->b(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft$a;

    move-result-object v3

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/b/ft;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    iget-object v2, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-static {v2}, Lcom/google/android/gms/b/fv;->b(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft$a;

    move-result-object v3

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/b/ft;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;

    move-result-object v5

    invoke-static {p0}, Lcom/google/android/gms/b/fv;->b(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft$a;

    move-result-object v3

    move-object v0, p0

    move-object v2, v1

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/fv;

    return-object v0
.end method


# virtual methods
.method protected abstract a()Lcom/google/android/gms/b/ft$a;
.end method

.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;
    .locals 1

    invoke-virtual/range {p0 .. p5}, Lcom/google/android/gms/b/fv;->b(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/b/ft;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->a:Ljava/lang/Object;

    invoke-interface {p3, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/b/ft;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-virtual {p0, v1, v1, v0, v1}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object v0

    :goto_0
    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->m()Lcom/google/android/gms/b/fv;

    move-result-object v0

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2, v1, v1}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/b/ft;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-virtual {p0, v1, v1, v1, v0}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/b/ft;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->a:Ljava/lang/Object;

    invoke-interface {p2, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    check-cast v0, Lcom/google/android/gms/b/fv;

    iget-object v0, v0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->k()Lcom/google/android/gms/b/fv;

    move-result-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/ft;->a(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-virtual {p0, v3, v3, v0, v3}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object v0

    :goto_0
    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->m()Lcom/google/android/gms/b/fv;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->o()Lcom/google/android/gms/b/fv;

    move-result-object p0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->c()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    check-cast v0, Lcom/google/android/gms/b/fv;

    iget-object v0, v0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/b/fv;->l()Lcom/google/android/gms/b/fv;

    move-result-object p0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->a:Ljava/lang/Object;

    invoke-interface {p2, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/b/fs;->a()Lcom/google/android/gms/b/fs;

    move-result-object v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->h()Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->e()Ljava/lang/Object;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    check-cast v0, Lcom/google/android/gms/b/fv;

    invoke-direct {v0}, Lcom/google/android/gms/b/fv;->j()Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object p0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/ft;->a(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/b/ft;

    move-result-object v0

    invoke-virtual {p0, v3, v3, v3, v0}, Lcom/google/android/gms/b/fv;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;

    move-result-object v0

    goto :goto_0
.end method

.method protected abstract a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation
.end method

.method public a(Lcom/google/android/gms/b/ft$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ft$b",
            "<TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/ft;->a(Lcom/google/android/gms/b/ft$b;)V

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/b/fv;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/b/ft$b;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/ft;->a(Lcom/google/android/gms/b/ft$b;)V

    return-void
.end method

.method a(Lcom/google/android/gms/b/ft;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    return-void
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/b/ft$a;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/b/fv;->a:Ljava/lang/Object;

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/b/fv;->b:Ljava/lang/Object;

    :cond_1
    if-nez p4, :cond_2

    iget-object p4, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    :cond_2
    if-nez p5, :cond_3

    iget-object p5, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    :cond_3
    sget-object v0, Lcom/google/android/gms/b/ft$a;->a:Lcom/google/android/gms/b/ft$a;

    if-ne p3, v0, :cond_4

    new-instance v0, Lcom/google/android/gms/b/fu;

    invoke-direct {v0, p1, p2, p4, p5}, Lcom/google/android/gms/b/fu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V

    :goto_0
    return-object v0

    :cond_4
    new-instance v0, Lcom/google/android/gms/b/fr;

    invoke-direct {v0, p1, p2, p4, p5}, Lcom/google/android/gms/b/fr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/b/ft;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/b/ft;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    return-object v0
.end method

.method public h()Lcom/google/android/gms/b/ft;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->h()Lcom/google/android/gms/b/ft;

    move-result-object p0

    goto :goto_0
.end method

.method public i()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/fv;->c:Lcom/google/android/gms/b/ft;

    invoke-interface {v0}, Lcom/google/android/gms/b/ft;->i()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/b/fv;->d:Lcom/google/android/gms/b/ft;

    invoke-interface {v1}, Lcom/google/android/gms/b/ft;->i()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
