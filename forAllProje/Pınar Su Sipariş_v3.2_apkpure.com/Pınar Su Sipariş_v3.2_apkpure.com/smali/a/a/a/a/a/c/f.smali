.class public abstract La/a/a/a/a/c/f;
.super La/a/a/a/a/c/a;
.source "PriorityAsyncTask.java"

# interfaces
.implements La/a/a/a/a/c/b;
.implements La/a/a/a/a/c/i;
.implements La/a/a/a/a/c/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/a/a/c/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Progress:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "La/a/a/a/a/c/a",
        "<TParams;TProgress;TResult;>;",
        "La/a/a/a/a/c/b",
        "<",
        "La/a/a/a/a/c/l;",
        ">;",
        "La/a/a/a/a/c/i;",
        "La/a/a/a/a/c/l;"
    }
.end annotation


# instance fields
.field private final a:La/a/a/a/a/c/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, La/a/a/a/a/c/a;-><init>()V

    .line 37
    new-instance v0, La/a/a/a/a/c/j;

    invoke-direct {v0}, La/a/a/a/a/c/j;-><init>()V

    iput-object v0, p0, La/a/a/a/a/c/f;->a:La/a/a/a/a/c/j;

    .line 38
    return-void
.end method


# virtual methods
.method public a(La/a/a/a/a/c/l;)V
    .locals 2

    .prologue
    .line 58
    invoke-virtual {p0}, La/a/a/a/a/c/f;->b()La/a/a/a/a/c/a$d;

    move-result-object v0

    sget-object v1, La/a/a/a/a/c/a$d;->a:La/a/a/a/a/c/a$d;

    if-eq v0, v1, :cond_0

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must not add Dependency after task is running"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_0
    invoke-virtual {p0}, La/a/a/a/a/c/f;->e()La/a/a/a/a/c/b;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/i;

    check-cast v0, La/a/a/a/a/c/b;

    invoke-interface {v0, p1}, La/a/a/a/a/c/b;->addDependency(Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method public final varargs a(Ljava/util/concurrent/ExecutorService;[Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ExecutorService;",
            "[TParams;)V"
        }
    .end annotation

    .prologue
    .line 42
    new-instance v0, La/a/a/a/a/c/f$a;

    invoke-direct {v0, p1, p0}, La/a/a/a/a/c/f$a;-><init>(Ljava/util/concurrent/Executor;La/a/a/a/a/c/f;)V

    .line 43
    invoke-super {p0, v0, p2}, La/a/a/a/a/c/a;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)La/a/a/a/a/c/a;

    .line 44
    return-void
.end method

.method public synthetic addDependency(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 27
    check-cast p1, La/a/a/a/a/c/l;

    invoke-virtual {p0, p1}, La/a/a/a/a/c/f;->a(La/a/a/a/a/c/l;)V

    return-void
.end method

.method public areDependenciesMet()Z
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p0}, La/a/a/a/a/c/f;->e()La/a/a/a/a/c/b;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/i;

    check-cast v0, La/a/a/a/a/c/b;

    invoke-interface {v0}, La/a/a/a/a/c/b;->areDependenciesMet()Z

    move-result v0

    return v0
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 48
    invoke-static {p0, p1}, La/a/a/a/a/c/e;->a(La/a/a/a/a/c/i;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public e()La/a/a/a/a/c/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "La/a/a/a/a/c/b",
            "<",
            "La/a/a/a/a/c/l;",
            ">;:",
            "La/a/a/a/a/c/i;",
            ":",
            "La/a/a/a/a/c/l;",
            ">()TT;"
        }
    .end annotation

    .prologue
    .line 101
    iget-object v0, p0, La/a/a/a/a/c/f;->a:La/a/a/a/a/c/j;

    return-object v0
.end method

.method public getDependencies()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/a/c/l;",
            ">;"
        }
    .end annotation

    .prologue
    .line 66
    invoke-virtual {p0}, La/a/a/a/a/c/f;->e()La/a/a/a/a/c/b;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/i;

    check-cast v0, La/a/a/a/a/c/b;

    invoke-interface {v0}, La/a/a/a/a/c/b;->getDependencies()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getPriority()La/a/a/a/a/c/e;
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, La/a/a/a/a/c/f;->e()La/a/a/a/a/c/b;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/i;

    invoke-interface {v0}, La/a/a/a/a/c/i;->getPriority()La/a/a/a/a/c/e;

    move-result-object v0

    return-object v0
.end method

.method public isFinished()Z
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p0}, La/a/a/a/a/c/f;->e()La/a/a/a/a/c/b;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/i;

    check-cast v0, La/a/a/a/a/c/l;

    invoke-interface {v0}, La/a/a/a/a/c/l;->isFinished()Z

    move-result v0

    return v0
.end method

.method public setError(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 91
    invoke-virtual {p0}, La/a/a/a/a/c/f;->e()La/a/a/a/a/c/b;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/i;

    check-cast v0, La/a/a/a/a/c/l;

    invoke-interface {v0, p1}, La/a/a/a/a/c/l;->setError(Ljava/lang/Throwable;)V

    .line 92
    return-void
.end method

.method public setFinished(Z)V
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, La/a/a/a/a/c/f;->e()La/a/a/a/a/c/b;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/i;

    check-cast v0, La/a/a/a/a/c/l;

    invoke-interface {v0, p1}, La/a/a/a/a/c/l;->setFinished(Z)V

    .line 82
    return-void
.end method
