.class public Lcom/google/android/gms/b/iu;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/iu$a;
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Lcom/google/android/gms/b/it;

.field private final c:Lcom/google/android/gms/b/iw;

.field private d:Lcom/google/android/gms/b/iv;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gs;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/google/android/gms/b/iq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/iu;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/iu;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/gs;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/im;",
            ">;",
            "Lcom/google/android/gms/b/jl;",
            "Lcom/google/android/gms/b/gs;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/in;",
            ">;"
        }
    .end annotation

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/b/iu;->f:Lcom/google/android/gms/b/iq;

    invoke-virtual {v1, p1, p2, v0}, Lcom/google/android/gms/b/iq;->a(Ljava/util/List;Lcom/google/android/gms/b/jl;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/b/gs;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/it;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->b:Lcom/google/android/gms/b/it;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/iu$a;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/b/hu;->e()Lcom/google/android/gms/b/hu$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/hu$a;->b:Lcom/google/android/gms/b/hu$a;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/b/hu;->d()Lcom/google/android/gms/b/hv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/hv;->d()Lcom/google/android/gms/b/is;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/google/android/gms/b/iu;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->d:Lcom/google/android/gms/b/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iv;->d()Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We should always have a full cache before handling merges"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/b/iu;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->d:Lcom/google/android/gms/b/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iv;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing event cache, even though we have a server cache"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/iu;->d:Lcom/google/android/gms/b/iv;

    iget-object v1, p0, Lcom/google/android/gms/b/iu;->c:Lcom/google/android/gms/b/iw;

    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/google/android/gms/b/iw;->a(Lcom/google/android/gms/b/iv;Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/iw$a;

    move-result-object v1

    sget-boolean v2, Lcom/google/android/gms/b/iu;->a:Z

    if-nez v2, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/b/iw$a;->a:Lcom/google/android/gms/b/iv;

    invoke-virtual {v2}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Once a server snap is complete, it should never go back"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v0, v1, Lcom/google/android/gms/b/iw$a;->a:Lcom/google/android/gms/b/iv;

    iput-object v0, p0, Lcom/google/android/gms/b/iu;->d:Lcom/google/android/gms/b/iv;

    iget-object v0, v1, Lcom/google/android/gms/b/iw$a;->b:Ljava/util/List;

    iget-object v2, v1, Lcom/google/android/gms/b/iw$a;->a:Lcom/google/android/gms/b/iv;

    invoke-virtual {v2}, Lcom/google/android/gms/b/iv;->a()Lcom/google/android/gms/b/ik;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/ik;->d()Lcom/google/android/gms/b/jl;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {p0, v0, v2, v3}, Lcom/google/android/gms/b/iu;->a(Ljava/util/List;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/gs;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/b/iu$a;

    iget-object v1, v1, Lcom/google/android/gms/b/iw$a;->b:Ljava/util/List;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/b/iu$a;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->d:Lcom/google/android/gms/b/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iv;->d()Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/iu;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->d()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gs;",
            "Lcom/google/firebase/database/b;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    const/4 v3, -0x1

    if-eqz p2, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-boolean v0, Lcom/google/android/gms/b/iu;->a:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "A cancel should cancel all event registrations"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/iu;->b:Lcom/google/android/gms/b/it;

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gs;

    new-instance v5, Lcom/google/android/gms/b/il;

    invoke-direct {v5, v0, p2, v2}, Lcom/google/android/gms/b/il;-><init>(Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;Lcom/google/android/gms/b/gx;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz p1, :cond_6

    const/4 v0, 0x0

    move v1, v0

    move v2, v3

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gs;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/gs;->a(Lcom/google/android/gms/b/gs;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/b/gs;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_3
    if-eq v1, v3, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gs;

    iget-object v2, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gs;->b()V

    :cond_2
    :goto_4
    return-object v4

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_4
    move v2, v1

    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gs;->b()V

    goto :goto_5

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_4

    :cond_8
    move v1, v2

    goto :goto_3
.end method

.method public b()Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->d:Lcom/google/android/gms/b/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/iv;->c()Lcom/google/android/gms/b/ik;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ik;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/iu;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method
