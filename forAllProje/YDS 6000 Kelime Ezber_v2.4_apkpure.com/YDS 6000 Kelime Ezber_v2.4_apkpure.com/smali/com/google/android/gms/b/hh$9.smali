.class Lcom/google/android/gms/b/hh$9;
.super Lcom/google/android/gms/b/ft$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/ft$b",
        "<",
        "Lcom/google/android/gms/b/je;",
        "Lcom/google/android/gms/b/ig",
        "<",
        "Lcom/google/android/gms/b/hg;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/jr;

.field final synthetic b:Lcom/google/android/gms/b/hq;

.field final synthetic c:Lcom/google/android/gms/b/hu;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Lcom/google/android/gms/b/hh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/hu;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/hh$9;->e:Lcom/google/android/gms/b/hh;

    iput-object p2, p0, Lcom/google/android/gms/b/hh$9;->a:Lcom/google/android/gms/b/jr;

    iput-object p3, p0, Lcom/google/android/gms/b/hh$9;->b:Lcom/google/android/gms/b/hq;

    iput-object p4, p0, Lcom/google/android/gms/b/hh$9;->c:Lcom/google/android/gms/b/hu;

    iput-object p5, p0, Lcom/google/android/gms/b/hh$9;->d:Ljava/util/List;

    invoke-direct {p0}, Lcom/google/android/gms/b/ft$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/ig;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/je;",
            "Lcom/google/android/gms/b/ig",
            "<",
            "Lcom/google/android/gms/b/hg;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/b/hh$9;->a:Lcom/google/android/gms/b/jr;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/hh$9;->a:Lcom/google/android/gms/b/jr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/hh$9;->b:Lcom/google/android/gms/b/hq;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hq;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/hh$9;->c:Lcom/google/android/gms/b/hu;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/b/hu;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hu;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/b/hh$9;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/google/android/gms/b/hh$9;->e:Lcom/google/android/gms/b/hh;

    invoke-static {v4, v2, p2, v0, v1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-void
.end method

.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/je;

    check-cast p2, Lcom/google/android/gms/b/ig;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/hh$9;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/ig;)V

    return-void
.end method
