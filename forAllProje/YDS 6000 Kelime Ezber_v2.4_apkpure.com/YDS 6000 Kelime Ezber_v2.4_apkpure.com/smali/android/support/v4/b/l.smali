.class public Landroid/support/v4/b/l;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/b/l$a;,
        Landroid/support/v4/b/l$c;,
        Landroid/support/v4/b/l$b;,
        Landroid/support/v4/b/l$d;
    }
.end annotation


# static fields
.field private static final a:Landroid/support/v4/i/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/i/k",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation
.end field

.field static final j:Ljava/lang/Object;


# instance fields
.field A:Landroid/support/v4/b/p;

.field B:Landroid/support/v4/b/r;

.field C:Landroid/support/v4/b/s;

.field D:Landroid/support/v4/b/l;

.field E:I

.field F:I

.field G:Ljava/lang/String;

.field H:Z

.field I:Z

.field J:Z

.field K:Z

.field L:Z

.field M:Z

.field N:Z

.field O:Landroid/view/ViewGroup;

.field P:Landroid/view/View;

.field Q:Landroid/view/View;

.field R:Z

.field S:Z

.field T:Landroid/support/v4/b/ab;

.field U:Z

.field V:Z

.field W:Landroid/support/v4/b/l$a;

.field X:Z

.field Y:Z

.field Z:F

.field k:I

.field l:Landroid/os/Bundle;

.field m:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field n:I

.field o:Ljava/lang/String;

.field p:Landroid/os/Bundle;

.field q:Landroid/support/v4/b/l;

.field r:I

.field s:I

.field t:Z

.field u:Z

.field v:Z

.field w:Z

.field x:Z

.field y:I

.field z:Landroid/support/v4/b/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v4/i/k;

    invoke-direct {v0}, Landroid/support/v4/i/k;-><init>()V

    sput-object v0, Landroid/support/v4/b/l;->a:Landroid/support/v4/i/k;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroid/support/v4/b/l;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    iput v1, p0, Landroid/support/v4/b/l;->n:I

    iput v1, p0, Landroid/support/v4/b/l;->r:I

    iput-boolean v2, p0, Landroid/support/v4/b/l;->M:Z

    iput-boolean v2, p0, Landroid/support/v4/b/l;->S:Z

    return-void
.end method

.method private X()Landroid/support/v4/b/l$a;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v4/b/l$a;

    invoke-direct {v0}, Landroid/support/v4/b/l$a;-><init>()V

    iput-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/b/l;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/support/v4/b/l;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/b/l;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/b/l;
    .locals 4

    :try_start_0
    sget-object v0, Landroid/support/v4/b/l;->a:Landroid/support/v4/i/k;

    invoke-virtual {v0, p1}, Landroid/support/v4/i/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Landroid/support/v4/b/l;->a:Landroid/support/v4/i/k;

    invoke-virtual {v1, p1, v0}, Landroid/support/v4/i/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/b/l;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iput-object p2, v0, Landroid/support/v4/b/l;->p:Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    :cond_1
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Landroid/support/v4/b/l$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instantiate fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/b/l$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Landroid/support/v4/b/l$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instantiate fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/b/l$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Landroid/support/v4/b/l$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instantiate fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/b/l$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method private a()V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v1, :cond_1

    :goto_0
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/support/v4/b/l$c;->a()V

    :cond_0
    return-void

    :cond_1
    iget-object v1, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/support/v4/b/l$a;->h:Z

    iget-object v1, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-object v1, v1, Landroid/support/v4/b/l$a;->i:Landroid/support/v4/b/l$c;

    iget-object v2, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iput-object v0, v2, Landroid/support/v4/b/l$a;->i:Landroid/support/v4/b/l$c;

    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic b(Landroid/support/v4/b/l;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/b/l;->a()V

    return-void
.end method

.method static b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    :try_start_0
    sget-object v0, Landroid/support/v4/b/l;->a:Landroid/support/v4/i/k;

    invoke-virtual {v0, p1}, Landroid/support/v4/i/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Landroid/support/v4/b/l;->a:Landroid/support/v4/i/k;

    invoke-virtual {v1, p1, v0}, Landroid/support/v4/i/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-class v1, Landroid/support/v4/b/l;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public A()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->f(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Landroid/support/v4/b/l;->j:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v4/b/l;->z()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->f(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public B()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->g(Landroid/support/v4/b/l$a;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->g(Landroid/support/v4/b/l$a;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public C()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->h(Landroid/support/v4/b/l$a;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->h(Landroid/support/v4/b/l$a;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public D()V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    iget-object v0, v0, Landroid/support/v4/b/r;->n:Landroid/support/v4/b/p;

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0}, Landroid/support/v4/b/l;->X()Landroid/support/v4/b/l$a;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v4/b/l$a;->h:Z

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    iget-object v1, v1, Landroid/support/v4/b/r;->n:Landroid/support/v4/b/p;

    invoke-virtual {v1}, Landroid/support/v4/b/p;->h()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    iget-object v0, v0, Landroid/support/v4/b/r;->n:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->h()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Landroid/support/v4/b/l$1;

    invoke-direct {v1, p0}, Landroid/support/v4/b/l$1;-><init>(Landroid/support/v4/b/l;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Landroid/support/v4/b/l;->a()V

    goto :goto_0
.end method

.method E()V
    .locals 3

    new-instance v0, Landroid/support/v4/b/r;

    invoke-direct {v0}, Landroid/support/v4/b/r;-><init>()V

    iput-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    iget-object v1, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    new-instance v2, Landroid/support/v4/b/l$2;

    invoke-direct {v2, p0}, Landroid/support/v4/b/l$2;-><init>(Landroid/support/v4/b/l;)V

    invoke-virtual {v0, v1, v2, p0}, Landroid/support/v4/b/r;->a(Landroid/support/v4/b/p;Landroid/support/v4/b/n;Landroid/support/v4/b/l;)V

    return-void
.end method

.method F()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->i()V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->d()Z

    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0}, Landroid/support/v4/b/l;->c()V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->l()V

    :cond_2
    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    invoke-virtual {v0}, Landroid/support/v4/b/ab;->g()V

    :cond_3
    return-void
.end method

.method G()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->i()V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->d()Z

    :cond_0
    const/4 v0, 0x5

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0}, Landroid/support/v4/b/l;->q()V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->m()V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->d()Z

    :cond_2
    return-void
.end method

.method H()V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v4/b/l;->onLowMemory()V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->s()V

    :cond_0
    return-void
.end method

.method I()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->n()V

    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0}, Landroid/support/v4/b/l;->r()V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method J()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->o()V

    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0}, Landroid/support/v4/b/l;->d()V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method K()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->p()V

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    iget-boolean v0, p0, Landroid/support/v4/b/l;->U:Z

    if-eqz v0, :cond_2

    iput-boolean v3, p0, Landroid/support/v4/b/l;->U:Z

    iget-boolean v0, p0, Landroid/support/v4/b/l;->V:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->V:Z

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    iget-object v1, p0, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/b/l;->U:Z

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/b/p;->a(Ljava/lang/String;ZZ)Landroid/support/v4/b/ab;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    invoke-virtual {v0}, Landroid/support/v4/b/ab;->d()V

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    invoke-virtual {v0}, Landroid/support/v4/b/ab;->c()V

    goto :goto_0
.end method

.method L()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->q()V

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0}, Landroid/support/v4/b/l;->e()V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    invoke-virtual {v0}, Landroid/support/v4/b/ab;->f()V

    :cond_2
    return-void
.end method

.method M()V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->r()V

    :cond_0
    iput v1, p0, Landroid/support/v4/b/l;->k:I

    iput-boolean v1, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0}, Landroid/support/v4/b/l;->s()V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    return-void
.end method

.method N()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0}, Landroid/support/v4/b/l;->b()V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Landroid/support/v4/b/l;->K:Z

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Child FragmentManager of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " was not "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " destroyed and this fragment is not retaining instance"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->r()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    :cond_2
    return-void
.end method

.method O()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget v0, v0, Landroid/support/v4/b/l$a;->c:I

    goto :goto_0
.end method

.method P()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget v0, v0, Landroid/support/v4/b/l$a;->d:I

    goto :goto_0
.end method

.method Q()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget v0, v0, Landroid/support/v4/b/l$a;->e:I

    goto :goto_0
.end method

.method R()Landroid/support/v4/b/av;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-object v0, v0, Landroid/support/v4/b/l$a;->f:Landroid/support/v4/b/av;

    goto :goto_0
.end method

.method S()Landroid/support/v4/b/av;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-object v0, v0, Landroid/support/v4/b/l$a;->g:Landroid/support/v4/b/av;

    goto :goto_0
.end method

.method T()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-object v0, v0, Landroid/support/v4/b/l$a;->a:Landroid/view/View;

    goto :goto_0
.end method

.method U()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget v0, v0, Landroid/support/v4/b/l$a;->b:I

    goto :goto_0
.end method

.method V()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-boolean v0, v0, Landroid/support/v4/b/l$a;->h:Z

    goto :goto_0
.end method

.method W()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-boolean v0, v0, Landroid/support/v4/b/l$a;->j:Z

    goto :goto_0
.end method

.method a(Ljava/lang/String;)Landroid/support/v4/b/l;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/r;->b(Ljava/lang/String;)Landroid/support/v4/b/l;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(IZI)Landroid/view/animation/Animation;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroid/support/v4/b/l;->j()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method a(II)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Landroid/support/v4/b/l;->X()Landroid/support/v4/b/l$a;

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iput p1, v0, Landroid/support/v4/b/l$a;->d:I

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iput p2, v0, Landroid/support/v4/b/l$a;->e:I

    goto :goto_0
.end method

.method public a(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method final a(ILandroid/support/v4/b/l;)V
    .locals 2

    iput p1, p0, Landroid/support/v4/b/l;->n:I

    if-eqz p2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p2, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v4/b/l;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android:fragment:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v4/b/l;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    goto :goto_0
.end method

.method public a(I[Ljava/lang/String;[I)V
    .locals 0

    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method public a(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0, v0}, Landroid/support/v4/b/l;->a(Landroid/app/Activity;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->f()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0, v0, p2, p3}, Landroid/support/v4/b/l;->a(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->f()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to Activity"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroid/support/v4/b/p;->a(Landroid/support/v4/b/l;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method a(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/r;->a(Landroid/content/res/Configuration;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->h(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0, v1}, Landroid/support/v4/b/r;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->j()V

    :cond_0
    return-void
.end method

.method a(Landroid/support/v4/b/l$c;)V
    .locals 3

    invoke-direct {p0}, Landroid/support/v4/b/l;->X()Landroid/support/v4/b/l$a;

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-object v0, v0, Landroid/support/v4/b/l$a;->i:Landroid/support/v4/b/l$c;

    if-ne p1, v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-object v0, v0, Landroid/support/v4/b/l$a;->i:Landroid/support/v4/b/l$c;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to set a replacement startPostponedEnterTransition on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iget-boolean v0, v0, Landroid/support/v4/b/l$a;->h:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    iput-object p1, v0, Landroid/support/v4/b/l$a;->i:Landroid/support/v4/b/l$c;

    :cond_3
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/support/v4/b/l$c;->b()V

    goto :goto_0
.end method

.method public a(Landroid/support/v4/b/l$d;)V
    .locals 2

    iget v0, p0, Landroid/support/v4/b/l;->n:I

    if-ltz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment already active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p1, Landroid/support/v4/b/l$d;->a:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroid/support/v4/b/l$d;->a:Landroid/os/Bundle;

    :goto_0
    iput-object v0, p0, Landroid/support/v4/b/l;->l:Landroid/os/Bundle;

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/support/v4/b/l;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    return-void
.end method

.method a(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/b/l;->X()Landroid/support/v4/b/l$a;

    move-result-object v0

    iput-object p1, v0, Landroid/support/v4/b/l$a;->a:Landroid/view/View;

    return-void
.end method

.method public a(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/b/l;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/b/l;->F:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->G:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/b/l;->k:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mIndex="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/b/l;->n:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/b/l;->y:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->t:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->u:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->v:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->w:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->H:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->I:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->M:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->L:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->J:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRetaining="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->K:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->S:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v0, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    if-eqz v0, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->D:Landroid/support/v4/b/l;

    if-eqz v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->D:Landroid/support/v4/b/l;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Landroid/support/v4/b/l;->p:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->p:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Landroid/support/v4/b/l;->l:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->l:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Landroid/support/v4/b/l;->m:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->m:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v0, p0, Landroid/support/v4/b/l;->q:Landroid/support/v4/b/l;

    if-eqz v0, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTarget="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->q:Landroid/support/v4/b/l;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/b/l;->s:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_6
    invoke-virtual {p0}, Landroid/support/v4/b/l;->O()I

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mNextAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/support/v4/b/l;->O()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_7
    iget-object v0, p0, Landroid/support/v4/b/l;->O:Landroid/view/ViewGroup;

    if-eqz v0, :cond_8

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->O:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_8
    iget-object v0, p0, Landroid/support/v4/b/l;->P:Landroid/view/View;

    if-eqz v0, :cond_9

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->P:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_9
    iget-object v0, p0, Landroid/support/v4/b/l;->Q:Landroid/view/View;

    if-eqz v0, :cond_a

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mInnerView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->P:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {p0}, Landroid/support/v4/b/l;->T()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/support/v4/b/l;->T()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mStateAfterAnimating="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/support/v4/b/l;->U()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_b
    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    if-eqz v0, :cond_c

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loader Manager:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/b/ab;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_c
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Child "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/b/r;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_d
    return-void
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->b()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v4/b/l;->l()Landroid/support/v4/b/q;

    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v1}, Landroid/support/v4/b/r;->t()Landroid/support/v4/view/n;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v4/view/j;->a(Landroid/view/LayoutInflater;Landroid/support/v4/view/n;)V

    return-object v0
.end method

.method b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->i()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/b/l;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method b(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Landroid/support/v4/b/l;->X()Landroid/support/v4/b/l$a;

    move-result-object v0

    iput p1, v0, Landroid/support/v4/b/l$a;->c:I

    goto :goto_0
.end method

.method public b(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method b(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Landroid/support/v4/b/l;->H:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Landroid/support/v4/b/l;->L:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroid/support/v4/b/l;->M:Z

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/support/v4/b/l;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_0
    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/b/r;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v1

    or-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 4

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v4/b/l;->N:Z

    iget-boolean v0, p0, Landroid/support/v4/b/l;->U:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Landroid/support/v4/b/l;->U:Z

    iget-boolean v0, p0, Landroid/support/v4/b/l;->V:Z

    if-nez v0, :cond_0

    iput-boolean v1, p0, Landroid/support/v4/b/l;->V:Z

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    iget-object v1, p0, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/b/l;->U:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/b/p;->a(Ljava/lang/String;ZZ)Landroid/support/v4/b/ab;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    invoke-virtual {v0}, Landroid/support/v4/b/ab;->b()V

    :cond_1
    return-void
.end method

.method c(I)V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/b/l;->X()Landroid/support/v4/b/l$a;

    move-result-object v0

    iput p1, v0, Landroid/support/v4/b/l$a;->b:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    return-void
.end method

.method c(Landroid/view/Menu;)Z
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Landroid/support/v4/b/l;->H:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Landroid/support/v4/b/l;->L:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroid/support/v4/b/l;->M:Z

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->a(Landroid/view/Menu;)V

    :cond_0
    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v1, p1}, Landroid/support/v4/b/r;->a(Landroid/view/Menu;)Z

    move-result v1

    or-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method c(Landroid/view/MenuItem;)Z
    .locals 2

    const/4 v0, 0x1

    iget-boolean v1, p0, Landroid/support/v4/b/l;->H:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Landroid/support/v4/b/l;->L:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Landroid/support/v4/b/l;->M:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->a(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v1, p1}, Landroid/support/v4/b/r;->a(Landroid/view/MenuItem;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method d(Landroid/view/Menu;)V
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/b/l;->H:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v4/b/l;->L:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/b/l;->M:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->b(Landroid/view/Menu;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/r;->b(Landroid/view/Menu;)V

    :cond_1
    return-void
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/v4/b/l;->J:Z

    return-void
.end method

.method d(Landroid/view/MenuItem;)Z
    .locals 2

    const/4 v0, 0x1

    iget-boolean v1, p0, Landroid/support/v4/b/l;->H:Z

    if-nez v1, :cond_2

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->b(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v1, p1}, Landroid/support/v4/b/r;->b(Landroid/view/MenuItem;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public e(Z)V
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/b/l;->M:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Landroid/support/v4/b/l;->M:Z

    iget-boolean v0, p0, Landroid/support/v4/b/l;->L:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/b/l;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/b/l;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->c()V

    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method final f(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->m:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->Q:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/b/l;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/b/l;->m:Landroid/util/SparseArray;

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->i(Landroid/os/Bundle;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public f(Z)V
    .locals 2

    const/4 v1, 0x4

    iget-boolean v0, p0, Landroid/support/v4/b/l;->S:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    iget v0, p0, Landroid/support/v4/b/l;->k:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/b/l;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    invoke-virtual {v0, p0}, Landroid/support/v4/b/r;->b(Landroid/support/v4/b/l;)V

    :cond_0
    iput-boolean p1, p0, Landroid/support/v4/b/l;->S:Z

    iget v0, p0, Landroid/support/v4/b/l;->k:I

    if-ge v0, v1, :cond_1

    if-nez p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v4/b/l;->R:Z

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final f()Z
    .locals 1

    iget v0, p0, Landroid/support/v4/b/l;->y:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->p:Landroid/os/Bundle;

    return-object v0
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 2

    iget v0, p0, Landroid/support/v4/b/l;->n:I

    if-ltz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment already active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Landroid/support/v4/b/l;->p:Landroid/os/Bundle;

    return-void
.end method

.method public g(Z)V
    .locals 0

    return-void
.end method

.method public h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->g()Landroid/content/Context;

    move-result-object v0

    goto :goto_0
.end method

.method h(Landroid/os/Bundle;)V
    .locals 3

    if-eqz p1, :cond_1

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/b/l;->E()V

    :cond_0
    iget-object v1, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    iget-object v2, p0, Landroid/support/v4/b/l;->C:Landroid/support/v4/b/s;

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/b/r;->a(Landroid/os/Parcelable;Landroid/support/v4/b/s;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/b/l;->C:Landroid/support/v4/b/s;

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->j()V

    :cond_1
    return-void
.end method

.method public h(Z)V
    .locals 0

    return-void
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Landroid/support/v4/b/m;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->f()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroid/support/v4/b/m;

    goto :goto_0
.end method

.method public i(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method i(Z)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->g(Z)V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/r;->a(Z)V

    :cond_0
    return-void
.end method

.method public final j()Landroid/content/res/Resources;
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to Activity"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    invoke-virtual {v0}, Landroid/support/v4/b/p;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method j(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->i()V

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->a(Landroid/os/Bundle;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onCreate()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method j(Z)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->h(Z)V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0, p1}, Landroid/support/v4/b/r;->b(Z)V

    :cond_0
    return-void
.end method

.method public final k()Landroid/support/v4/b/q;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    return-object v0
.end method

.method k(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->i()V

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->d(Landroid/os/Bundle;)V

    iget-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/b/aw;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onActivityCreated()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/b/aw;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->k()V

    :cond_2
    return-void
.end method

.method k(Z)V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/b/l;->X()Landroid/support/v4/b/l$a;

    move-result-object v0

    iput-boolean p1, v0, Landroid/support/v4/b/l$a;->j:Z

    return-void
.end method

.method public final l()Landroid/support/v4/b/q;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/b/l;->E()V

    iget v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->m()V

    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    return-object v0

    :cond_1
    iget v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->l()V

    goto :goto_0

    :cond_2
    iget v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->k()V

    goto :goto_0

    :cond_3
    iget v0, p0, Landroid/support/v4/b/l;->k:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->j()V

    goto :goto_0
.end method

.method l(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroid/support/v4/b/l;->e(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    invoke-virtual {v0}, Landroid/support/v4/b/r;->h()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/b/l;->t:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/b/l;->u:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/b/l;->H:Z

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v4/b/l;->i()Landroid/support/v4/b/m;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/b/m;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method public p()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->P:Landroid/view/View;

    return-object v0
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method public r()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/b/l;->N:Z

    return-void
.end method

.method public s()V
    .locals 4

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v4/b/l;->N:Z

    iget-boolean v0, p0, Landroid/support/v4/b/l;->V:Z

    if-nez v0, :cond_0

    iput-boolean v1, p0, Landroid/support/v4/b/l;->V:Z

    iget-object v0, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    iget-object v1, p0, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/b/l;->U:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/b/p;->a(Ljava/lang/String;ZZ)Landroid/support/v4/b/ab;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    invoke-virtual {v0}, Landroid/support/v4/b/ab;->h()V

    :cond_1
    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/b/l;->a(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method t()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/b/l;->n:I

    iput-object v2, p0, Landroid/support/v4/b/l;->o:Ljava/lang/String;

    iput-boolean v1, p0, Landroid/support/v4/b/l;->t:Z

    iput-boolean v1, p0, Landroid/support/v4/b/l;->u:Z

    iput-boolean v1, p0, Landroid/support/v4/b/l;->v:Z

    iput-boolean v1, p0, Landroid/support/v4/b/l;->w:Z

    iput-boolean v1, p0, Landroid/support/v4/b/l;->x:Z

    iput v1, p0, Landroid/support/v4/b/l;->y:I

    iput-object v2, p0, Landroid/support/v4/b/l;->z:Landroid/support/v4/b/r;

    iput-object v2, p0, Landroid/support/v4/b/l;->B:Landroid/support/v4/b/r;

    iput-object v2, p0, Landroid/support/v4/b/l;->A:Landroid/support/v4/b/p;

    iput v1, p0, Landroid/support/v4/b/l;->E:I

    iput v1, p0, Landroid/support/v4/b/l;->F:I

    iput-object v2, p0, Landroid/support/v4/b/l;->G:Ljava/lang/String;

    iput-boolean v1, p0, Landroid/support/v4/b/l;->H:Z

    iput-boolean v1, p0, Landroid/support/v4/b/l;->I:Z

    iput-boolean v1, p0, Landroid/support/v4/b/l;->K:Z

    iput-object v2, p0, Landroid/support/v4/b/l;->T:Landroid/support/v4/b/ab;

    iput-boolean v1, p0, Landroid/support/v4/b/l;->U:Z

    iput-boolean v1, p0, Landroid/support/v4/b/l;->V:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {p0, v0}, Landroid/support/v4/i/d;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    iget v1, p0, Landroid/support/v4/b/l;->n:I

    if-ltz v1, :cond_0

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/b/l;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, Landroid/support/v4/b/l;->E:I

    if-eqz v1, :cond_1

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/b/l;->E:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Landroid/support/v4/b/l;->G:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/b/l;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 0

    return-void
.end method

.method public v()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->a(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public w()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->b(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Landroid/support/v4/b/l;->j:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v4/b/l;->v()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->b(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public x()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->c(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public y()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->d(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Landroid/support/v4/b/l;->j:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v4/b/l;->x()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->d(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public z()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/l;->W:Landroid/support/v4/b/l$a;

    invoke-static {v0}, Landroid/support/v4/b/l$a;->e(Landroid/support/v4/b/l$a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method
