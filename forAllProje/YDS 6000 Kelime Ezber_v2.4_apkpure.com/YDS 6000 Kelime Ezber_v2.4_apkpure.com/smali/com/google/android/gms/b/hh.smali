.class public Lcom/google/android/gms/b/hh;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/hh$b;,
        Lcom/google/android/gms/b/hh$c;,
        Lcom/google/android/gms/b/hh$a;
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private b:Lcom/google/android/gms/b/ig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ig",
            "<",
            "Lcom/google/android/gms/b/hg;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/b/hp;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/hi;",
            "Lcom/google/android/gms/b/it;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/it;",
            "Lcom/google/android/gms/b/hi;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/b/it;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/b/hh$c;

.field private final h:Lcom/google/android/gms/b/ib;

.field private final i:Lcom/google/android/gms/b/jb;

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/hh;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/hh;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/ib;Lcom/google/android/gms/b/hh$c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/google/android/gms/b/hh;->j:J

    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hh;->b:Lcom/google/android/gms/b/ig;

    new-instance v0, Lcom/google/android/gms/b/hp;

    invoke-direct {v0}, Lcom/google/android/gms/b/hp;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/hh;->c:Lcom/google/android/gms/b/hp;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/hh;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/hh;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/hh;->f:Ljava/util/Set;

    iput-object p3, p0, Lcom/google/android/gms/b/hh;->g:Lcom/google/android/gms/b/hh$c;

    iput-object p2, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    const-string v0, "SyncTree"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/gq;->a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/hh;->i:Lcom/google/android/gms/b/jb;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/hi;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/hi;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/ig;)Lcom/google/android/gms/b/ig;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/hh;->b:Lcom/google/android/gms/b/ig;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hi;)Lcom/google/android/gms/b/it;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hi;)Lcom/google/android/gms/b/it;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/it;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/jb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->i:Lcom/google/android/gms/b/jb;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hu;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hu;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hu;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hu;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/hu;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/hu;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->b:Lcom/google/android/gms/b/ig;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/b/hh;->c:Lcom/google/android/gms/b/hp;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/hq;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/hu;",
            "Lcom/google/android/gms/b/ig",
            "<",
            "Lcom/google/android/gms/b/hg;",
            ">;",
            "Lcom/google/android/gms/b/jr;",
            "Lcom/google/android/gms/b/hq;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/hu;->c()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/b/ig;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hg;

    if-nez p3, :cond_1

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object p3

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/b/hu;->c()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/google/android/gms/b/hu;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hu;

    move-result-object v5

    invoke-virtual {p2}, Lcom/google/android/gms/b/ig;->c()Lcom/google/android/gms/b/fo;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/b/fo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/ig;

    if-eqz v1, :cond_2

    if-eqz v5, :cond_2

    if-eqz p3, :cond_4

    invoke-interface {p3, v4}, Lcom/google/android/gms/b/jr;->c(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/jr;

    move-result-object v2

    :goto_1
    invoke-virtual {p4, v4}, Lcom/google/android/gms/b/hq;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hq;

    move-result-object v4

    invoke-direct {p0, v5, v1, v2, v4}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0, p1, p4, p3}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    move-object v0, v3

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/b/ig;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ig",
            "<",
            "Lcom/google/android/gms/b/hg;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/iu;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/ig;Ljava/util/List;)V

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/it;",
            "Lcom/google/android/gms/b/gs;",
            "Lcom/google/firebase/database/b;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$8;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/b/hh$8;-><init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hu;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/it;",
            "Lcom/google/android/gms/b/hu;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->b:Lcom/google/android/gms/b/ig;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ig;->e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hg;

    sget-boolean v2, Lcom/google/android/gms/b/hh;->a:Z

    if-nez v2, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing sync point for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/b/hh;->c:Lcom/google/android/gms/b/hp;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/hq;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, v2}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/hh;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/hh;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/b/ig;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ig",
            "<",
            "Lcom/google/android/gms/b/hg;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/iu;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/ig;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hg;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/b/hg;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/b/hg;->d()Lcom/google/android/gms/b/iu;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/b/hg;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/b/ig;->c()Lcom/google/android/gms/b/fo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/fo;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ig;

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/ig;Ljava/util/List;)V

    goto :goto_0
.end method

.method private a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/it;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/it;

    invoke-virtual {v0}, Lcom/google/android/gms/b/it;->d()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/hi;

    move-result-object v2

    sget-boolean v3, Lcom/google/android/gms/b/hh;->a:Z

    if-nez v3, :cond_1

    if-nez v2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/b/hh;->e:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method private b(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/hi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hi;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ib;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/it;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/it;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/google/android/gms/b/hi;)Lcom/google/android/gms/b/it;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/it;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/ig;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/ig;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/ig;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/hu;",
            "Lcom/google/android/gms/b/ig",
            "<",
            "Lcom/google/android/gms/b/hg;",
            ">;",
            "Lcom/google/android/gms/b/jr;",
            "Lcom/google/android/gms/b/hq;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/b/ig;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/b/hg;

    if-nez p3, :cond_1

    if-eqz v6, :cond_1

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v2

    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/b/ig;->c()Lcom/google/android/gms/b/fo;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/b/hh$9;

    move-object v1, p0

    move-object v3, p4

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/hh$9;-><init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/hu;Ljava/util/List;)V

    invoke-virtual {v7, v0}, Lcom/google/android/gms/b/fo;->a(Lcom/google/android/gms/b/ft$b;)V

    if-eqz v6, :cond_0

    invoke-virtual {v6, p1, p4, v2}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/hu;Lcom/google/android/gms/b/hq;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v5

    :cond_1
    move-object v2, p3

    goto :goto_0
.end method

.method static synthetic c(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/hp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->c:Lcom/google/android/gms/b/hp;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/ig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->b:Lcom/google/android/gms/b/ig;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/b/hh;)Lcom/google/android/gms/b/hh$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->g:Lcom/google/android/gms/b/hh$c;

    return-object v0
.end method


# virtual methods
.method public a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZ",
            "Lcom/google/android/gms/b/kl;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$11;

    move-object v2, p0

    move v3, p4

    move-wide v4, p1

    move v6, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/b/hh$11;-><init>(Lcom/google/android/gms/b/hh;ZJZLcom/google/android/gms/b/kl;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gs;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gs;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/gs;->a()Lcom/google/android/gms/b/it;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$4;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/hh$4;-><init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/gx;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/go;JZ)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/go;",
            "Lcom/google/android/gms/b/go;",
            "JZ)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$10;

    move-object v2, p0

    move/from16 v3, p6

    move-object v4, p1

    move-object v5, p2

    move-wide v6, p4

    move-object v8, p3

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/b/hh$10;-><init>(Lcom/google/android/gms/b/hh;ZLcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;JLcom/google/android/gms/b/go;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/jr;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/b/hh$2;-><init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hi;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/jr;",
            "Lcom/google/android/gms/b/hi;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$6;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/android/gms/b/hh$6;-><init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hi;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;JZZ)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/jr;",
            "Lcom/google/android/gms/b/jr;",
            "JZZ)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    if-nez p6, :cond_0

    if-nez p7, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "We shouldn\'t be persisting non-visible writes."

    invoke-static {v0, v1}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$1;

    move-object v2, p0

    move/from16 v3, p7

    move-object v4, p1

    move-object v5, p2

    move-wide v6, p4

    move-object v8, p3

    move/from16 v9, p6

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/b/hh$1;-><init>(Lcom/google/android/gms/b/hh;ZLcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;JLcom/google/android/gms/b/jr;Z)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/jw;",
            ">;)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->b:Lcom/google/android/gms/b/ig;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ig;->e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hg;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/b/hg;->d()Lcom/google/android/gms/b/iu;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jw;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/jw;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;Ljava/util/List;Lcom/google/android/gms/b/hi;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/jw;",
            ">;",
            "Lcom/google/android/gms/b/hi;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/hi;)Lcom/google/android/gms/b/it;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-boolean v0, Lcom/google/android/gms/b/hh;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/gx;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/hh;->b:Lcom/google/android/gms/b/ig;

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/ig;->e(Lcom/google/android/gms/b/gx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hg;

    sget-boolean v2, Lcom/google/android/gms/b/hh;->a:Z

    if-nez v2, :cond_1

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing sync point for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/it;)Lcom/google/android/gms/b/iu;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/b/hh;->a:Z

    if-nez v1, :cond_2

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing view for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/b/iu;->b()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/jw;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/jw;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hi;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/b/gx;Ljava/util/Map;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/jr;",
            ">;)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$3;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/b/hh$3;-><init>(Lcom/google/android/gms/b/hh;Ljava/util/Map;Lcom/google/android/gms/b/gx;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Ljava/util/Map;Lcom/google/android/gms/b/hi;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/gx;",
            "Lcom/google/android/gms/b/jr;",
            ">;",
            "Lcom/google/android/gms/b/hi;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$7;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/android/gms/b/hh$7;-><init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hi;Lcom/google/android/gms/b/gx;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/hi;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/hi;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/hh;->h:Lcom/google/android/gms/b/ib;

    new-instance v1, Lcom/google/android/gms/b/hh$5;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/hh$5;-><init>(Lcom/google/android/gms/b/hh;Lcom/google/android/gms/b/hi;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/ib;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/it;Lcom/google/firebase/database/b;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/it;",
            "Lcom/google/firebase/database/b;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ip;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/gs;Lcom/google/firebase/database/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/b/gx;Ljava/util/List;)Lcom/google/android/gms/b/jr;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/b/jr;"
        }
    .end annotation

    iget-object v2, p0, Lcom/google/android/gms/b/hh;->b:Lcom/google/android/gms/b/ig;

    invoke-virtual {v2}, Lcom/google/android/gms/b/ig;->b()Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v0

    move-object v4, v2

    move-object v2, p1

    :goto_0
    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v6

    if-eqz v5, :cond_1

    invoke-virtual {v4, v5}, Lcom/google/android/gms/b/ig;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/ig;

    move-result-object v4

    :goto_1
    invoke-virtual {v4}, Lcom/google/android/gms/b/ig;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/hg;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v6}, Lcom/google/android/gms/b/hg;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    :goto_2
    invoke-virtual {v3}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/hh;->c:Lcom/google/android/gms/b/hp;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, p2, v2}, Lcom/google/android/gms/b/hp;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Ljava/util/List;Z)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/b/ig;->a()Lcom/google/android/gms/b/ig;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_2

    :cond_3
    move-object v1, v0

    move-object v0, v2

    move-object v2, v3

    goto :goto_0
.end method
