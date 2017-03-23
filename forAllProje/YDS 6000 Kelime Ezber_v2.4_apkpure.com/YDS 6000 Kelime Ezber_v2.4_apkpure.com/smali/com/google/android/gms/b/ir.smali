.class public Lcom/google/android/gms/b/ir;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/b/gu;

.field private final b:Lcom/google/android/gms/b/jb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/gq;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/b/gq;->j()Lcom/google/android/gms/b/gu;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ir;->a:Lcom/google/android/gms/b/gu;

    const-string v0, "EventRaiser"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/gq;->a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ir;->b:Lcom/google/android/gms/b/jb;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/ir;)Lcom/google/android/gms/b/jb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ir;->b:Lcom/google/android/gms/b/jb;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/ir;->b:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ir;->b:Lcom/google/android/gms/b/jb;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Raising "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " event(s)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lcom/google/android/gms/b/ir;->a:Lcom/google/android/gms/b/gu;

    new-instance v2, Lcom/google/android/gms/b/ir$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/b/ir$1;-><init>(Lcom/google/android/gms/b/ir;Ljava/util/ArrayList;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/b/gu;->a(Ljava/lang/Runnable;)V

    return-void
.end method
