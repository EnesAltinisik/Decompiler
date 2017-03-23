.class public abstract La/a/a/a/i;
.super Ljava/lang/Object;
.source "Kit.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "La/a/a/a/i;",
        ">;"
    }
.end annotation


# instance fields
.field context:Landroid/content/Context;

.field fabric:La/a/a/a/c;

.field idManager:La/a/a/a/a/b/o;

.field initializationCallback:La/a/a/a/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/f",
            "<TResult;>;"
        }
    .end annotation
.end field

.field initializationTask:La/a/a/a/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/h",
            "<TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, La/a/a/a/h;

    invoke-direct {v0, p0}, La/a/a/a/h;-><init>(La/a/a/a/i;)V

    iput-object v0, p0, La/a/a/a/i;->initializationTask:La/a/a/a/h;

    .line 44
    return-void
.end method


# virtual methods
.method public compareTo(La/a/a/a/i;)I
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 142
    invoke-virtual {p0, p1}, La/a/a/a/i;->containsAnnotatedDependency(La/a/a/a/i;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 151
    :cond_0
    :goto_0
    return v0

    .line 144
    :cond_1
    invoke-virtual {p1, p0}, La/a/a/a/i;->containsAnnotatedDependency(La/a/a/a/i;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v0, v1

    .line 145
    goto :goto_0

    .line 146
    :cond_2
    invoke-virtual {p0}, La/a/a/a/i;->hasAnnotatedDependency()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, La/a/a/a/i;->hasAnnotatedDependency()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 148
    :cond_3
    invoke-virtual {p0}, La/a/a/a/i;->hasAnnotatedDependency()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, La/a/a/a/i;->hasAnnotatedDependency()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 149
    goto :goto_0

    .line 151
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 33
    check-cast p1, La/a/a/a/i;

    invoke-virtual {p0, p1}, La/a/a/a/i;->compareTo(La/a/a/a/i;)I

    move-result v0

    return v0
.end method

.method containsAnnotatedDependency(La/a/a/a/i;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, La/a/a/a/a/c/d;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/d;

    .line 161
    if-eqz v0, :cond_1

    .line 162
    invoke-interface {v0}, La/a/a/a/a/c/d;->a()[Ljava/lang/Class;

    move-result-object v2

    .line 163
    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 165
    const/4 v0, 0x1

    .line 169
    :goto_1
    return v0

    .line 163
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 169
    goto :goto_1
.end method

.method protected abstract doInBackground()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, La/a/a/a/i;->context:Landroid/content/Context;

    return-object v0
.end method

.method protected getDependencies()Ljava/util/Collection;
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
    .line 183
    iget-object v0, p0, La/a/a/a/i;->initializationTask:La/a/a/a/h;

    invoke-virtual {v0}, La/a/a/a/h;->getDependencies()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getFabric()La/a/a/a/c;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, La/a/a/a/i;->fabric:La/a/a/a/c;

    return-object v0
.end method

.method protected getIdManager()La/a/a/a/a/b/o;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, La/a/a/a/i;->idManager:La/a/a/a/a/b/o;

    return-object v0
.end method

.method public abstract getIdentifier()Ljava/lang/String;
.end method

.method public getPath()Ljava/lang/String;
    .locals 2

    .prologue
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ".Fabric"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, La/a/a/a/i;->getIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract getVersion()Ljava/lang/String;
.end method

.method hasAnnotatedDependency()Z
    .locals 2

    .prologue
    .line 177
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, La/a/a/a/a/c/d;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/d;

    .line 178
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final initialize()V
    .locals 5

    .prologue
    .line 66
    iget-object v1, p0, La/a/a/a/i;->initializationTask:La/a/a/a/h;

    iget-object v0, p0, La/a/a/a/i;->fabric:La/a/a/a/c;

    invoke-virtual {v0}, La/a/a/a/c;->f()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Void;

    const/4 v4, 0x0

    const/4 v0, 0x0

    check-cast v0, Ljava/lang/Void;

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, La/a/a/a/h;->a(Ljava/util/concurrent/ExecutorService;[Ljava/lang/Object;)V

    .line 67
    return-void
.end method

.method injectParameters(Landroid/content/Context;La/a/a/a/c;La/a/a/a/f;La/a/a/a/a/b/o;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "La/a/a/a/c;",
            "La/a/a/a/f",
            "<TResult;>;",
            "La/a/a/a/a/b/o;",
            ")V"
        }
    .end annotation

    .prologue
    .line 56
    iput-object p2, p0, La/a/a/a/i;->fabric:La/a/a/a/c;

    .line 57
    new-instance v0, La/a/a/a/d;

    invoke-virtual {p0}, La/a/a/a/i;->getIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, La/a/a/a/i;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, La/a/a/a/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, La/a/a/a/i;->context:Landroid/content/Context;

    .line 58
    iput-object p3, p0, La/a/a/a/i;->initializationCallback:La/a/a/a/f;

    .line 59
    iput-object p4, p0, La/a/a/a/i;->idManager:La/a/a/a/a/b/o;

    .line 60
    return-void
.end method

.method protected onCancelled(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 100
    return-void
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 93
    return-void
.end method

.method protected onPreExecute()Z
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x1

    return v0
.end method
