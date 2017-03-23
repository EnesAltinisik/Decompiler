.class public Lcom/google/android/gms/b/jg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/jg$a;,
        Lcom/google/android/gms/b/jg$b;,
        Lcom/google/android/gms/b/jg$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gx;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gx;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Number of posts need to be n-1 for n hashes in CompoundHash"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/b/jg;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/b/jg;->b:Ljava/util/List;

    return-void
.end method

.method public static a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jg;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/jg$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/jg$b;-><init>(Lcom/google/android/gms/b/jr;)V

    invoke-static {p0, v0}, Lcom/google/android/gms/b/jg;->a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jg$c;)Lcom/google/android/gms/b/jg;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jg$c;)Lcom/google/android/gms/b/jg;
    .locals 3

    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/jg;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-string v2, ""

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/jg;-><init>(Ljava/util/List;Ljava/util/List;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/b/jg$a;

    invoke-direct {v1, p1}, Lcom/google/android/gms/b/jg$a;-><init>(Lcom/google/android/gms/b/jg$c;)V

    invoke-static {p0, v1}, Lcom/google/android/gms/b/jg;->b(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jg$a;)V

    invoke-static {v1}, Lcom/google/android/gms/b/jg$a;->a(Lcom/google/android/gms/b/jg$a;)V

    new-instance v0, Lcom/google/android/gms/b/jg;

    invoke-static {v1}, Lcom/google/android/gms/b/jg$a;->b(Lcom/google/android/gms/b/jg$a;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/b/jg$a;->c(Lcom/google/android/gms/b/jg$a;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/b/jg;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jg$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/b/jg;->b(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jg$a;)V

    return-void
.end method

.method private static b(Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jg$a;)V
    .locals 4

    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/b/jo;

    invoke-static {p1, p0}, Lcom/google/android/gms/b/jg$a;->a(Lcom/google/android/gms/b/jg$a;Lcom/google/android/gms/b/jo;)V

    :goto_0
    return-void

    :cond_0
    invoke-interface {p0}, Lcom/google/android/gms/b/jr;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t calculate hash on empty node!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v0, p0, Lcom/google/android/gms/b/jf;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x21

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Expected children node, but got: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    check-cast p0, Lcom/google/android/gms/b/jf;

    new-instance v0, Lcom/google/android/gms/b/jg$1;

    invoke-direct {v0, p1}, Lcom/google/android/gms/b/jg$1;-><init>(Lcom/google/android/gms/b/jg$a;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/jf;->a(Lcom/google/android/gms/b/jf$a;Z)V

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gx;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/jg;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/jg;->b:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
