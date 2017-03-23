.class public Lcom/google/android/gms/b/fk;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/gy;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/firebase/b;


# direct methods
.method public constructor <init>(Lcom/google/firebase/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/fk;->b:Ljava/util/Set;

    iput-object p1, p0, Lcom/google/android/gms/b/fk;->c:Lcom/google/firebase/b;

    iget-object v0, p0, Lcom/google/android/gms/b/fk;->c:Lcom/google/firebase/b;

    if-nez v0, :cond_0

    const-string v0, "FirebaseDatabase"

    const-string v1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FirebaseDatabase"

    const-string v1, "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FirebaseDatabase"

    const-string v1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "You need to call FirebaseApp.initializeApp() before using Firebase Database."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/fk;->c:Lcom/google/firebase/b;

    invoke-virtual {v0}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/fk;->a:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/fk;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/fk;->a:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/gb;Lcom/google/android/gms/b/gd;Lcom/google/android/gms/b/gf$a;)Lcom/google/android/gms/b/gf;
    .locals 7

    new-instance v0, Lcom/google/firebase/database/connection/idl/c;

    invoke-virtual {p1}, Lcom/google/android/gms/b/gq;->e()Lcom/google/android/gms/b/jc$a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/b/gq;->h()Z

    move-result v4

    invoke-static {}, Lcom/google/firebase/database/f;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/google/android/gms/b/gq;->l()Ljava/lang/String;

    move-result-object v6

    move-object v1, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/database/connection/idl/c;-><init>(Lcom/google/android/gms/b/gd;Lcom/google/android/gms/b/jc$a;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/b/fk;->a:Landroid/content/Context;

    invoke-static {v1, v0, p2, p4}, Lcom/google/firebase/database/connection/idl/e;->a(Landroid/content/Context;Lcom/google/firebase/database/connection/idl/c;Lcom/google/android/gms/b/gb;Lcom/google/android/gms/b/gf$a;)Lcom/google/firebase/database/connection/idl/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/fk;->c:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/android/gms/b/fk$2;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/b/fk$2;-><init>(Lcom/google/android/gms/b/fk;Lcom/google/android/gms/b/gf;)V

    invoke-virtual {v1, v2}, Lcom/google/firebase/b;->a(Lcom/google/firebase/b$b;)V

    return-object v0
.end method

.method public a(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/b/gm;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/fi;

    iget-object v1, p0, Lcom/google/android/gms/b/fk;->c:Lcom/google/firebase/b;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/b/fi;-><init>(Lcom/google/firebase/b;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gq;)Lcom/google/android/gms/b/gu;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/fj;

    invoke-direct {v0}, Lcom/google/android/gms/b/fj;-><init>()V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gq;Ljava/lang/String;)Lcom/google/android/gms/b/ib;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/b/gq;->m()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/fk;->b:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v1, Lcom/google/firebase/database/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2f

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "SessionPersistenceKey \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\' has already been used."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/firebase/database/c;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/fk;->b:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/google/android/gms/b/fl;

    iget-object v2, p0, Lcom/google/android/gms/b/fk;->a:Landroid/content/Context;

    invoke-direct {v0, v2, p1, v1}, Lcom/google/android/gms/b/fl;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/gq;Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/b/hz;

    invoke-virtual {p1}, Lcom/google/android/gms/b/gq;->i()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/b/hz;-><init>(J)V

    new-instance v2, Lcom/google/android/gms/b/hy;

    invoke-direct {v2, p1, v0, v1}, Lcom/google/android/gms/b/hy;-><init>(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/ic;Lcom/google/android/gms/b/hx;)V

    return-object v2
.end method

.method public a(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/jc$a;Ljava/util/List;)Lcom/google/android/gms/b/jc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gq;",
            "Lcom/google/android/gms/b/jc$a;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/b/jc;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/b/iz;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/b/iz;-><init>(Lcom/google/android/gms/b/jc$a;Ljava/util/List;)V

    return-object v0
.end method

.method public b(Lcom/google/android/gms/b/gq;)Lcom/google/android/gms/b/hc;
    .locals 2

    const-string v0, "RunLoop"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/gq;->a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/fk$1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/b/fk$1;-><init>(Lcom/google/android/gms/b/fk;Lcom/google/android/gms/b/jb;)V

    return-object v1
.end method

.method public c(Lcom/google/android/gms/b/gq;)Ljava/lang/String;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Android"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
