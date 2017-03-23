.class Lcom/google/android/gms/b/fw$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/fw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/fw$a$a;,
        Lcom/google/android/gms/b/fw$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        "C:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<TA;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TB;TC;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/b/fo$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/fo$a$a",
            "<TA;TB;>;"
        }
    .end annotation
.end field

.field private d:Lcom/google/android/gms/b/fv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/fv",
            "<TA;TC;>;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/gms/b/fv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/fv",
            "<TA;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/b/fo$a$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<TA;>;",
            "Ljava/util/Map",
            "<TB;TC;>;",
            "Lcom/google/android/gms/b/fo$a$a",
            "<TA;TB;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/fw$a;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/b/fw$a;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/b/fw$a;->c:Lcom/google/android/gms/b/fo$a$a;

    return-void
.end method

.method private a(II)Lcom/google/android/gms/b/ft;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/android/gms/b/ft",
            "<TA;TC;>;"
        }
    .end annotation

    const/4 v3, 0x0

    if-nez p2, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/fs;->a()Lcom/google/android/gms/b/fs;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/fw$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/b/fr;

    invoke-direct {p0, v1}, Lcom/google/android/gms/b/fw$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/b/fr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V

    goto :goto_0

    :cond_1
    div-int/lit8 v0, p2, 0x2

    add-int v1, p1, v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/fw$a;->a(II)Lcom/google/android/gms/b/ft;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    invoke-direct {p0, v3, v0}, Lcom/google/android/gms/b/fw$a;->a(II)Lcom/google/android/gms/b/ft;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/b/fw$a;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/b/fr;

    invoke-direct {p0, v1}, Lcom/google/android/gms/b/fw$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/google/android/gms/b/fr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V

    goto :goto_0
.end method

.method public static a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/b/fo$a$a;Ljava/util/Comparator;)Lcom/google/android/gms/b/fw;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TA;>;",
            "Ljava/util/Map",
            "<TB;TC;>;",
            "Lcom/google/android/gms/b/fo$a$a",
            "<TA;TB;>;",
            "Ljava/util/Comparator",
            "<TA;>;)",
            "Lcom/google/android/gms/b/fw",
            "<TA;TC;>;"
        }
    .end annotation

    new-instance v2, Lcom/google/android/gms/b/fw$a;

    invoke-direct {v2, p0, p1, p2}, Lcom/google/android/gms/b/fw$a;-><init>(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/b/fo$a$a;)V

    invoke-static {p0, p3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v0, Lcom/google/android/gms/b/fw$a$a;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/fw$a$a;-><init>(I)V

    invoke-virtual {v0}, Lcom/google/android/gms/b/fw$a$a;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/fw$a$b;

    iget v4, v0, Lcom/google/android/gms/b/fw$a$b;->b:I

    sub-int/2addr v1, v4

    iget-boolean v4, v0, Lcom/google/android/gms/b/fw$a$b;->a:Z

    if-eqz v4, :cond_0

    sget-object v4, Lcom/google/android/gms/b/ft$a;->b:Lcom/google/android/gms/b/ft$a;

    iget v0, v0, Lcom/google/android/gms/b/fw$a$b;->b:I

    invoke-direct {v2, v4, v0, v1}, Lcom/google/android/gms/b/fw$a;->a(Lcom/google/android/gms/b/ft$a;II)V

    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_0
    sget-object v4, Lcom/google/android/gms/b/ft$a;->b:Lcom/google/android/gms/b/ft$a;

    iget v5, v0, Lcom/google/android/gms/b/fw$a$b;->b:I

    invoke-direct {v2, v4, v5, v1}, Lcom/google/android/gms/b/fw$a;->a(Lcom/google/android/gms/b/ft$a;II)V

    iget v4, v0, Lcom/google/android/gms/b/fw$a$b;->b:I

    sub-int/2addr v1, v4

    sget-object v4, Lcom/google/android/gms/b/ft$a;->a:Lcom/google/android/gms/b/ft$a;

    iget v0, v0, Lcom/google/android/gms/b/fw$a$b;->b:I

    invoke-direct {v2, v4, v0, v1}, Lcom/google/android/gms/b/fw$a;->a(Lcom/google/android/gms/b/ft$a;II)V

    move v0, v1

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/google/android/gms/b/fw;

    iget-object v0, v2, Lcom/google/android/gms/b/fw$a;->d:Lcom/google/android/gms/b/fv;

    if-nez v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/b/fs;->a()Lcom/google/android/gms/b/fs;

    move-result-object v0

    :goto_2
    const/4 v2, 0x0

    invoke-direct {v1, v0, p3, v2}, Lcom/google/android/gms/b/fw;-><init>(Lcom/google/android/gms/b/ft;Ljava/util/Comparator;Lcom/google/android/gms/b/fw$1;)V

    return-object v1

    :cond_2
    iget-object v0, v2, Lcom/google/android/gms/b/fw$a;->d:Lcom/google/android/gms/b/fv;

    goto :goto_2
.end method

.method private a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)TC;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fw$a;->b:Ljava/util/Map;

    iget-object v1, p0, Lcom/google/android/gms/b/fw$a;->c:Lcom/google/android/gms/b/fo$a$a;

    invoke-interface {v1, p1}, Lcom/google/android/gms/b/fo$a$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/ft$a;II)V
    .locals 5

    const/4 v4, 0x0

    add-int/lit8 v0, p3, 0x1

    add-int/lit8 v1, p2, -0x1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/b/fw$a;->a(II)Lcom/google/android/gms/b/ft;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/fw$a;->a:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v0, Lcom/google/android/gms/b/ft$a;->a:Lcom/google/android/gms/b/ft$a;

    if-ne p1, v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/fu;

    invoke-direct {p0, v2}, Lcom/google/android/gms/b/fw$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/google/android/gms/b/fu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/b/fw$a;->d:Lcom/google/android/gms/b/fv;

    if-nez v1, :cond_1

    iput-object v0, p0, Lcom/google/android/gms/b/fw$a;->d:Lcom/google/android/gms/b/fv;

    iput-object v0, p0, Lcom/google/android/gms/b/fw$a;->e:Lcom/google/android/gms/b/fv;

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/fr;

    invoke-direct {p0, v2}, Lcom/google/android/gms/b/fw$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/google/android/gms/b/fr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/b/fw$a;->e:Lcom/google/android/gms/b/fv;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/fv;->a(Lcom/google/android/gms/b/ft;)V

    iput-object v0, p0, Lcom/google/android/gms/b/fw$a;->e:Lcom/google/android/gms/b/fv;

    goto :goto_1
.end method
