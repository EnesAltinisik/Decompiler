.class final Landroid/support/v7/c/g$d;
.super Ljava/lang/Object;
.source "MediaRouter.java"

# interfaces
.implements Landroid/support/v7/c/l$a;
.implements Landroid/support/v7/c/n$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/c/g$d$a;,
        Landroid/support/v7/c/g$d$d;,
        Landroid/support/v7/c/g$d$b;,
        Landroid/support/v7/c/g$d$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/support/v7/c/g;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/c/g$f;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/c/g$e;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/c/g$d$d;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/support/v7/c/m$a;

.field private final g:Landroid/support/v7/c/g$d$c;

.field private final h:Landroid/support/v7/c/g$d$a;

.field private final i:Landroid/support/v4/d/a/a;

.field private final j:Landroid/support/v7/c/n;

.field private final k:Z

.field private l:Landroid/support/v7/c/l;

.field private m:Landroid/support/v7/c/g$f;

.field private n:Landroid/support/v7/c/g$f;

.field private o:Landroid/support/v7/c/c$d;

.field private p:Landroid/support/v7/c/b;

.field private q:Landroid/support/v7/c/g$d$b;

.field private r:Landroid/support/v4/media/session/MediaSessionCompat;

.field private s:Landroid/support/v4/media/session/MediaSessionCompat$b;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1642
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1605
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    .line 1607
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    .line 1608
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    .line 1610
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->e:Ljava/util/ArrayList;

    .line 1612
    new-instance v0, Landroid/support/v7/c/m$a;

    invoke-direct {v0}, Landroid/support/v7/c/m$a;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    .line 1614
    new-instance v0, Landroid/support/v7/c/g$d$c;

    invoke-direct {v0, p0, v1}, Landroid/support/v7/c/g$d$c;-><init>(Landroid/support/v7/c/g$d;Landroid/support/v7/c/g$1;)V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->g:Landroid/support/v7/c/g$d$c;

    .line 1615
    new-instance v0, Landroid/support/v7/c/g$d$a;

    invoke-direct {v0, p0, v1}, Landroid/support/v7/c/g$d$a;-><init>(Landroid/support/v7/c/g$d;Landroid/support/v7/c/g$1;)V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    .line 1628
    new-instance v0, Landroid/support/v7/c/g$d$1;

    invoke-direct {v0, p0}, Landroid/support/v7/c/g$d$1;-><init>(Landroid/support/v7/c/g$d;)V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->s:Landroid/support/v4/media/session/MediaSessionCompat$b;

    .line 1643
    iput-object p1, p0, Landroid/support/v7/c/g$d;->a:Landroid/content/Context;

    .line 1644
    invoke-static {p1}, Landroid/support/v4/d/a/a;->a(Landroid/content/Context;)Landroid/support/v4/d/a/a;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/g$d;->i:Landroid/support/v4/d/a/a;

    .line 1645
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-static {v0}, Landroid/support/v4/app/ActivityManagerCompat;->isLowRamDevice(Landroid/app/ActivityManager;)Z

    move-result v0

    iput-boolean v0, p0, Landroid/support/v7/c/g$d;->k:Z

    .line 1652
    invoke-static {p1, p0}, Landroid/support/v7/c/n;->a(Landroid/content/Context;Landroid/support/v7/c/n$e;)Landroid/support/v7/c/n;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/g$d;->j:Landroid/support/v7/c/n;

    .line 1653
    iget-object v0, p0, Landroid/support/v7/c/g$d;->j:Landroid/support/v7/c/n;

    invoke-virtual {p0, v0}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/c;)V

    .line 1654
    return-void
.end method

.method static synthetic a(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/g$f;
    .locals 1

    .prologue
    .line 1601
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    return-object v0
.end method

.method private a(Landroid/support/v7/c/g$e;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x2

    .line 2032
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/support/v7/c/g$e;->c()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 2034
    invoke-direct {p0, v2}, Landroid/support/v7/c/g$d;->b(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_0

    move-object v0, v2

    .line 2040
    :goto_0
    return-object v0

    :cond_0
    move v0, v1

    .line 2038
    :goto_1
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "%s_%d"

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v6, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 2039
    invoke-direct {p0, v3}, Landroid/support/v7/c/g$d;->b(Ljava/lang/String;)I

    move-result v4

    if-gez v4, :cond_1

    move-object v0, v3

    .line 2040
    goto :goto_0

    .line 2037
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private a(Landroid/support/v7/c/c;Landroid/support/v7/c/d;)V
    .locals 2

    .prologue
    .line 1903
    invoke-direct {p0, p1}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/c;)I

    move-result v0

    .line 1904
    if-ltz v0, :cond_0

    .line 1906
    iget-object v1, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$e;

    .line 1907
    invoke-direct {p0, v0, p2}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$e;Landroid/support/v7/c/d;)V

    .line 1909
    :cond_0
    return-void
.end method

.method static synthetic a(Landroid/support/v7/c/g$d;Landroid/support/v7/c/c;Landroid/support/v7/c/d;)V
    .locals 0

    .prologue
    .line 1601
    invoke-direct {p0, p1, p2}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/c;Landroid/support/v7/c/d;)V

    return-void
.end method

.method private a(Landroid/support/v7/c/g$e;Landroid/support/v7/c/d;)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 1923
    invoke-virtual {p1, p2}, Landroid/support/v7/c/g$e;->a(Landroid/support/v7/c/d;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1928
    if-eqz p2, :cond_a

    .line 1929
    invoke-virtual {p2}, Landroid/support/v7/c/d;->b()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1930
    invoke-virtual {p2}, Landroid/support/v7/c/d;->a()Ljava/util/List;

    move-result-object v6

    .line 1932
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    move v5, v2

    move v3, v2

    .line 1933
    :goto_0
    if-ge v5, v7, :cond_b

    .line 1934
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/a;

    .line 1935
    invoke-virtual {v0}, Landroid/support/v7/c/a;->a()Ljava/lang/String;

    move-result-object v1

    .line 1936
    invoke-virtual {p1, v1}, Landroid/support/v7/c/g$e;->a(Ljava/lang/String;)I

    move-result v8

    .line 1937
    if-gez v8, :cond_1

    .line 1939
    invoke-direct {p0, p1, v1}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1940
    new-instance v8, Landroid/support/v7/c/g$f;

    invoke-direct {v8, p1, v1, v4}, Landroid/support/v7/c/g$f;-><init>(Landroid/support/v7/c/g$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 1941
    invoke-static {p1}, Landroid/support/v7/c/g$e;->b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;

    move-result-object v4

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v4, v3, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1942
    iget-object v3, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1944
    invoke-virtual {v8, v0}, Landroid/support/v7/c/g$f;->a(Landroid/support/v7/c/a;)I

    .line 1946
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1947
    const-string v0, "MediaRouter"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Route added: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1949
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v3, 0x101

    invoke-virtual {v0, v3, v8}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    move v0, v2

    .line 1933
    :goto_1
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v3, v1

    move v2, v0

    goto :goto_0

    .line 1950
    :cond_1
    if-ge v8, v3, :cond_2

    .line 1951
    const-string v1, "MediaRouter"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Ignoring route descriptor with duplicate id: "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    move v1, v3

    goto :goto_1

    .line 1955
    :cond_2
    invoke-static {p1}, Landroid/support/v7/c/g$e;->b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/c/g$f;

    .line 1956
    invoke-static {p1}, Landroid/support/v7/c/g$e;->b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;

    move-result-object v9

    add-int/lit8 v4, v3, 0x1

    invoke-static {v9, v8, v3}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 1959
    invoke-virtual {v1, v0}, Landroid/support/v7/c/g$f;->a(Landroid/support/v7/c/a;)I

    move-result v0

    .line 1961
    if-eqz v0, :cond_11

    .line 1962
    and-int/lit8 v3, v0, 0x1

    if-eqz v3, :cond_4

    .line 1963
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1964
    const-string v3, "MediaRouter"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Route changed: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1966
    :cond_3
    iget-object v3, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v8, 0x103

    invoke-virtual {v3, v8, v1}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 1969
    :cond_4
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_6

    .line 1970
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 1971
    const-string v3, "MediaRouter"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Route volume changed: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1973
    :cond_5
    iget-object v3, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v8, 0x104

    invoke-virtual {v3, v8, v1}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 1976
    :cond_6
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_8

    .line 1977
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1978
    const-string v0, "MediaRouter"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Route presentation display changed: "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1981
    :cond_7
    iget-object v0, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v3, 0x105

    invoke-virtual {v0, v3, v1}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 1984
    :cond_8
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-ne v1, v0, :cond_11

    .line 1985
    const/4 v0, 0x1

    move v1, v4

    goto/16 :goto_1

    .line 1991
    :cond_9
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ignoring invalid provider descriptor: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    move v3, v2

    .line 1996
    :cond_b
    invoke-static {p1}, Landroid/support/v7/c/g$e;->b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-lt v1, v3, :cond_c

    .line 1998
    invoke-static {p1}, Landroid/support/v7/c/g$e;->b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$f;

    .line 1999
    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/support/v7/c/g$f;->a(Landroid/support/v7/c/a;)I

    .line 2001
    iget-object v4, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1996
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 2005
    :cond_c
    invoke-direct {p0, v2}, Landroid/support/v7/c/g$d;->a(Z)V

    .line 2012
    invoke-static {p1}, Landroid/support/v7/c/g$e;->b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_3
    if-lt v1, v3, :cond_e

    .line 2013
    invoke-static {p1}, Landroid/support/v7/c/g$e;->b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$f;

    .line 2014
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 2015
    const-string v2, "MediaRouter"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Route removed: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2017
    :cond_d
    iget-object v2, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v4, 0x102

    invoke-virtual {v2, v4, v0}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 2012
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_3

    .line 2021
    :cond_e
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 2022
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Provider changed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2024
    :cond_f
    iget-object v0, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v1, 0x203

    invoke-virtual {v0, v1, p1}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 2026
    :cond_10
    return-void

    :cond_11
    move v0, v2

    move v1, v4

    goto/16 :goto_1
.end method

.method private a(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 2057
    iget-object v0, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    invoke-direct {p0, v0}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/g$f;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2058
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Clearing the default route because it is no longer selectable: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2060
    iput-object v4, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    .line 2062
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    if-nez v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2063
    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$f;

    .line 2064
    invoke-direct {p0, v0}, Landroid/support/v7/c/g$d;->d(Landroid/support/v7/c/g$f;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v0}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/g$f;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2065
    iput-object v0, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    .line 2066
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Found default route: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2073
    :cond_2
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-direct {p0, v0}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/g$f;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2074
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unselecting the current route because it is no longer selectable: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2076
    invoke-direct {p0, v4, v3}, Landroid/support/v7/c/g$d;->d(Landroid/support/v7/c/g$f;I)V

    .line 2079
    :cond_3
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-nez v0, :cond_5

    .line 2083
    invoke-direct {p0}, Landroid/support/v7/c/g$d;->g()Landroid/support/v7/c/g$f;

    move-result-object v0

    invoke-direct {p0, v0, v3}, Landroid/support/v7/c/g$d;->d(Landroid/support/v7/c/g$f;I)V

    .line 2089
    :cond_4
    :goto_0
    return-void

    .line 2085
    :cond_5
    if-eqz p1, :cond_4

    .line 2087
    invoke-direct {p0}, Landroid/support/v7/c/g$d;->h()V

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 2046
    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 2047
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 2048
    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$f;

    invoke-static {v0}, Landroid/support/v7/c/g$f;->c(Landroid/support/v7/c/g$f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 2052
    :goto_1
    return v0

    .line 2047
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2052
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method static synthetic b(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/g$d$a;
    .locals 1

    .prologue
    .line 1601
    iget-object v0, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    return-object v0
.end method

.method private b(Landroid/support/v7/c/g$f;)Z
    .locals 2

    .prologue
    .line 2107
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->q()Landroid/support/v7/c/c;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/c/g$d;->j:Landroid/support/v7/c/n;

    if-ne v0, v1, :cond_0

    const-string v0, "android.media.intent.category.LIVE_AUDIO"

    invoke-virtual {p1, v0}, Landroid/support/v7/c/g$f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android.media.intent.category.LIVE_VIDEO"

    invoke-virtual {p1, v0}, Landroid/support/v7/c/g$f;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Landroid/support/v7/c/c;)I
    .locals 3

    .prologue
    .line 1912
    iget-object v0, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 1913
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 1914
    iget-object v0, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$e;

    invoke-static {v0}, Landroid/support/v7/c/g$e;->a(Landroid/support/v7/c/g$e;)Landroid/support/v7/c/c;

    move-result-object v0

    if-ne v0, p1, :cond_0

    move v0, v1

    .line 1918
    :goto_1
    return v0

    .line 1913
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1918
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method static synthetic c(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/m$a;
    .locals 1

    .prologue
    .line 1601
    iget-object v0, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    return-object v0
.end method

.method private c(Landroid/support/v7/c/g$f;)Z
    .locals 1

    .prologue
    .line 2115
    invoke-static {p1}, Landroid/support/v7/c/g$f;->d(Landroid/support/v7/c/g$f;)Landroid/support/v7/c/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/support/v7/c/g$f;->b(Landroid/support/v7/c/g$f;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic d(Landroid/support/v7/c/g$d;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 1601
    iget-object v0, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method private d(Landroid/support/v7/c/g$f;I)V
    .locals 3

    .prologue
    .line 2125
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-eq v0, p1, :cond_5

    .line 2126
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-eqz v0, :cond_1

    .line 2127
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2128
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Route unselected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2131
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v1, 0x107

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 2132
    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    if-eqz v0, :cond_1

    .line 2133
    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/c$d;->a(I)V

    .line 2134
    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    invoke-virtual {v0}, Landroid/support/v7/c/c$d;->a()V

    .line 2135
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    .line 2139
    :cond_1
    iput-object p1, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    .line 2141
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-eqz v0, :cond_4

    .line 2142
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->q()Landroid/support/v7/c/c;

    move-result-object v0

    invoke-static {p1}, Landroid/support/v7/c/g$f;->a(Landroid/support/v7/c/g$f;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/c/c;->a(Ljava/lang/String;)Landroid/support/v7/c/c$d;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    .line 2144
    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    if-eqz v0, :cond_2

    .line 2145
    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    invoke-virtual {v0}, Landroid/support/v7/c/c$d;->b()V

    .line 2147
    :cond_2
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2148
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Route selected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2150
    :cond_3
    iget-object v0, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v1, 0x106

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 2153
    :cond_4
    invoke-direct {p0}, Landroid/support/v7/c/g$d;->h()V

    .line 2155
    :cond_5
    return-void
.end method

.method private d(Landroid/support/v7/c/g$f;)Z
    .locals 2

    .prologue
    .line 2119
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->q()Landroid/support/v7/c/c;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/c/g$d;->j:Landroid/support/v7/c/n;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Landroid/support/v7/c/g$f;->a(Landroid/support/v7/c/g$f;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DEFAULT_ROUTE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/n;
    .locals 1

    .prologue
    .line 1601
    iget-object v0, p0, Landroid/support/v7/c/g$d;->j:Landroid/support/v7/c/n;

    return-object v0
.end method

.method private g()Landroid/support/v7/c/g$f;
    .locals 3

    .prologue
    .line 2096
    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$f;

    .line 2097
    iget-object v2, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    if-eq v0, v2, :cond_0

    invoke-direct {p0, v0}, Landroid/support/v7/c/g$d;->b(Landroid/support/v7/c/g$f;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/g$f;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2103
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    goto :goto_0
.end method

.method private h()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 2238
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-eqz v0, :cond_3

    .line 2239
    iget-object v0, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v2}, Landroid/support/v7/c/g$f;->j()I

    move-result v2

    iput v2, v0, Landroid/support/v7/c/m$a;->a:I

    .line 2240
    iget-object v0, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v2}, Landroid/support/v7/c/g$f;->k()I

    move-result v2

    iput v2, v0, Landroid/support/v7/c/m$a;->b:I

    .line 2241
    iget-object v0, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v2}, Landroid/support/v7/c/g$f;->i()I

    move-result v2

    iput v2, v0, Landroid/support/v7/c/m$a;->c:I

    .line 2242
    iget-object v0, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v2}, Landroid/support/v7/c/g$f;->h()I

    move-result v2

    iput v2, v0, Landroid/support/v7/c/m$a;->d:I

    .line 2243
    iget-object v0, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    iget-object v2, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {v2}, Landroid/support/v7/c/g$f;->g()I

    move-result v2

    iput v2, v0, Landroid/support/v7/c/m$a;->e:I

    .line 2245
    iget-object v0, p0, Landroid/support/v7/c/g$d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v1

    .line 2246
    :goto_0
    if-ge v2, v3, :cond_0

    .line 2247
    iget-object v0, p0, Landroid/support/v7/c/g$d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$d$d;

    .line 2248
    invoke-virtual {v0}, Landroid/support/v7/c/g$d$d;->a()V

    .line 2246
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 2250
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/g$d;->q:Landroid/support/v7/c/g$d$b;

    if-eqz v0, :cond_1

    .line 2251
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    invoke-virtual {p0}, Landroid/support/v7/c/g$d;->c()Landroid/support/v7/c/g$f;

    move-result-object v2

    if-ne v0, v2, :cond_2

    .line 2253
    iget-object v0, p0, Landroid/support/v7/c/g$d;->q:Landroid/support/v7/c/g$d$b;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d$b;->a()V

    .line 2270
    :cond_1
    :goto_1
    return-void

    .line 2257
    :cond_2
    iget-object v0, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    iget v0, v0, Landroid/support/v7/c/m$a;->c:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    .line 2259
    const/4 v0, 0x2

    .line 2261
    :goto_2
    iget-object v1, p0, Landroid/support/v7/c/g$d;->q:Landroid/support/v7/c/g$d$b;

    iget-object v2, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    iget v2, v2, Landroid/support/v7/c/m$a;->b:I

    iget-object v3, p0, Landroid/support/v7/c/g$d;->f:Landroid/support/v7/c/m$a;

    iget v3, v3, Landroid/support/v7/c/m$a;->a:I

    invoke-virtual {v1, v0, v2, v3}, Landroid/support/v7/c/g$d$b;->a(III)V

    goto :goto_1

    .line 2266
    :cond_3
    iget-object v0, p0, Landroid/support/v7/c/g$d;->q:Landroid/support/v7/c/g$d$b;

    if-eqz v0, :cond_1

    .line 2267
    iget-object v0, p0, Landroid/support/v7/c/g$d;->q:Landroid/support/v7/c/g$d$b;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d$b;->a()V

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_2
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/support/v7/c/g$f;
    .locals 2

    .prologue
    .line 2159
    iget-object v0, p0, Landroid/support/v7/c/g$d;->j:Landroid/support/v7/c/n;

    invoke-direct {p0, v0}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/c;)I

    move-result v0

    .line 2160
    if-ltz v0, :cond_0

    .line 2161
    iget-object v1, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$e;

    .line 2162
    invoke-virtual {v0, p1}, Landroid/support/v7/c/g$e;->a(Ljava/lang/String;)I

    move-result v1

    .line 2163
    if-ltz v1, :cond_0

    .line 2164
    invoke-static {v0}, Landroid/support/v7/c/g$e;->b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$f;

    .line 2167
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/content/Context;)Landroid/support/v7/c/g;
    .locals 3

    .prologue
    .line 1666
    iget-object v0, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-ltz v1, :cond_1

    .line 1667
    iget-object v0, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g;

    .line 1668
    if-nez v0, :cond_0

    .line 1669
    iget-object v0, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v0, v1

    goto :goto_0

    .line 1670
    :cond_0
    iget-object v2, v0, Landroid/support/v7/c/g;->b:Landroid/content/Context;

    if-ne v2, p1, :cond_2

    .line 1676
    :goto_1
    return-object v0

    .line 1674
    :cond_1
    new-instance v0, Landroid/support/v7/c/g;

    invoke-direct {v0, p1}, Landroid/support/v7/c/g;-><init>(Landroid/content/Context;)V

    .line 1675
    iget-object v1, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 1659
    new-instance v0, Landroid/support/v7/c/l;

    iget-object v1, p0, Landroid/support/v7/c/g$d;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Landroid/support/v7/c/l;-><init>(Landroid/content/Context;Landroid/support/v7/c/l$a;)V

    iput-object v0, p0, Landroid/support/v7/c/g$d;->l:Landroid/support/v7/c/l;

    .line 1661
    iget-object v0, p0, Landroid/support/v7/c/g$d;->l:Landroid/support/v7/c/l;

    invoke-virtual {v0}, Landroid/support/v7/c/l;->a()V

    .line 1662
    return-void
.end method

.method public a(Landroid/support/v7/c/c;)V
    .locals 4

    .prologue
    .line 1863
    invoke-direct {p0, p1}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/c;)I

    move-result v0

    .line 1864
    if-gez v0, :cond_1

    .line 1866
    new-instance v0, Landroid/support/v7/c/g$e;

    invoke-direct {v0, p1}, Landroid/support/v7/c/g$e;-><init>(Landroid/support/v7/c/c;)V

    .line 1867
    iget-object v1, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1868
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1869
    const-string v1, "MediaRouter"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Provider added: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1871
    :cond_0
    iget-object v1, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v2, 0x201

    invoke-virtual {v1, v2, v0}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 1873
    invoke-virtual {p1}, Landroid/support/v7/c/c;->e()Landroid/support/v7/c/d;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$e;Landroid/support/v7/c/d;)V

    .line 1875
    iget-object v0, p0, Landroid/support/v7/c/g$d;->g:Landroid/support/v7/c/g$d$c;

    invoke-virtual {p1, v0}, Landroid/support/v7/c/c;->a(Landroid/support/v7/c/c$a;)V

    .line 1877
    iget-object v0, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    invoke-virtual {p1, v0}, Landroid/support/v7/c/c;->a(Landroid/support/v7/c/b;)V

    .line 1879
    :cond_1
    return-void
.end method

.method public a(Landroid/support/v7/c/g$f;)V
    .locals 1

    .prologue
    .line 1754
    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/g$f;I)V

    .line 1755
    return-void
.end method

.method public a(Landroid/support/v7/c/g$f;I)V
    .locals 1

    .prologue
    .line 1712
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    if-eqz v0, :cond_0

    .line 1713
    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/c$d;->b(I)V

    .line 1715
    :cond_0
    return-void
.end method

.method public a(Landroid/support/v7/c/f;I)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1771
    invoke-virtual {p1}, Landroid/support/v7/c/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 1794
    :goto_0
    return v0

    .line 1776
    :cond_0
    and-int/lit8 v0, p2, 0x2

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v7/c/g$d;->k:Z

    if-eqz v0, :cond_1

    move v0, v2

    .line 1777
    goto :goto_0

    .line 1781
    :cond_1
    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v1

    .line 1782
    :goto_1
    if-ge v3, v4, :cond_4

    .line 1783
    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$f;

    .line 1784
    and-int/lit8 v5, p2, 0x1

    if-eqz v5, :cond_3

    invoke-virtual {v0}, Landroid/support/v7/c/g$f;->f()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 1782
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 1788
    :cond_3
    invoke-virtual {v0, p1}, Landroid/support/v7/c/g$f;->a(Landroid/support/v7/c/f;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    .line 1789
    goto :goto_0

    :cond_4
    move v0, v1

    .line 1794
    goto :goto_0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/c/g$f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1724
    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public b(Landroid/support/v7/c/c;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 1883
    invoke-direct {p0, p1}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/c;)I

    move-result v1

    .line 1884
    if-ltz v1, :cond_1

    .line 1886
    invoke-virtual {p1, v2}, Landroid/support/v7/c/c;->a(Landroid/support/v7/c/c$a;)V

    .line 1888
    invoke-virtual {p1, v2}, Landroid/support/v7/c/c;->a(Landroid/support/v7/c/b;)V

    .line 1890
    iget-object v0, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$e;

    .line 1891
    invoke-direct {p0, v0, v2}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$e;Landroid/support/v7/c/d;)V

    .line 1893
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1894
    const-string v2, "MediaRouter"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Provider removed: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1896
    :cond_0
    iget-object v2, p0, Landroid/support/v7/c/g$d;->h:Landroid/support/v7/c/g$d$a;

    const/16 v3, 0x202

    invoke-virtual {v2, v3, v0}, Landroid/support/v7/c/g$d$a;->a(ILjava/lang/Object;)V

    .line 1897
    iget-object v0, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1899
    :cond_1
    return-void
.end method

.method public b(Landroid/support/v7/c/g$f;I)V
    .locals 1

    .prologue
    .line 1718
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    if-eqz v0, :cond_0

    .line 1719
    iget-object v0, p0, Landroid/support/v7/c/g$d;->o:Landroid/support/v7/c/c$d;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/c$d;->c(I)V

    .line 1721
    :cond_0
    return-void
.end method

.method public c()Landroid/support/v7/c/g$f;
    .locals 2

    .prologue
    .line 1732
    iget-object v0, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    if-nez v0, :cond_0

    .line 1736
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There is no default route.  The media router has not yet been fully initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1739
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/g$d;->m:Landroid/support/v7/c/g$f;

    return-object v0
.end method

.method public c(Landroid/support/v7/c/g$f;I)V
    .locals 3

    .prologue
    .line 1758
    iget-object v0, p0, Landroid/support/v7/c/g$d;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1759
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring attempt to select removed route: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1768
    :goto_0
    return-void

    .line 1762
    :cond_0
    invoke-static {p1}, Landroid/support/v7/c/g$f;->b(Landroid/support/v7/c/g$f;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1763
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring attempt to select disabled route: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1767
    :cond_1
    invoke-direct {p0, p1, p2}, Landroid/support/v7/c/g$d;->d(Landroid/support/v7/c/g$f;I)V

    goto :goto_0
.end method

.method public d()Landroid/support/v7/c/g$f;
    .locals 2

    .prologue
    .line 1743
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    if-nez v0, :cond_0

    .line 1747
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There is no currently selected route.  The media router has not yet been fully initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1750
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/g$d;->n:Landroid/support/v7/c/g$f;

    return-object v0
.end method

.method public e()V
    .locals 11

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 1799
    .line 1801
    new-instance v8, Landroid/support/v7/c/f$a;

    invoke-direct {v8}, Landroid/support/v7/c/f$a;-><init>()V

    .line 1802
    iget-object v0, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v5

    move v4, v5

    :goto_0
    add-int/lit8 v7, v0, -0x1

    if-ltz v7, :cond_5

    .line 1803
    iget-object v0, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g;

    .line 1804
    if-nez v0, :cond_1

    .line 1805
    iget-object v0, p0, Landroid/support/v7/c/g$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    move v0, v7

    .line 1825
    goto :goto_0

    .line 1807
    :cond_1
    iget-object v1, v0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v6, v5

    .line 1808
    :goto_1
    if-ge v6, v9, :cond_0

    .line 1809
    iget-object v1, v0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/c/g$b;

    .line 1810
    iget-object v10, v1, Landroid/support/v7/c/g$b;->c:Landroid/support/v7/c/f;

    invoke-virtual {v8, v10}, Landroid/support/v7/c/f$a;->a(Landroid/support/v7/c/f;)Landroid/support/v7/c/f$a;

    .line 1811
    iget v10, v1, Landroid/support/v7/c/g$b;->d:I

    and-int/lit8 v10, v10, 0x1

    if-eqz v10, :cond_2

    move v2, v3

    move v4, v3

    .line 1815
    :cond_2
    iget v10, v1, Landroid/support/v7/c/g$b;->d:I

    and-int/lit8 v10, v10, 0x4

    if-eqz v10, :cond_3

    .line 1816
    iget-boolean v10, p0, Landroid/support/v7/c/g$d;->k:Z

    if-nez v10, :cond_3

    move v4, v3

    .line 1820
    :cond_3
    iget v1, v1, Landroid/support/v7/c/g$b;->d:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    move v4, v3

    .line 1808
    :cond_4
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    goto :goto_1

    .line 1826
    :cond_5
    if-eqz v4, :cond_7

    invoke-virtual {v8}, Landroid/support/v7/c/f$a;->a()Landroid/support/v7/c/f;

    move-result-object v0

    .line 1829
    :goto_2
    iget-object v1, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    if-eqz v1, :cond_8

    iget-object v1, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    invoke-virtual {v1}, Landroid/support/v7/c/b;->a()Landroid/support/v7/c/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v7/c/f;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    invoke-virtual {v1}, Landroid/support/v7/c/b;->b()Z

    move-result v1

    if-ne v1, v2, :cond_8

    .line 1859
    :cond_6
    return-void

    .line 1826
    :cond_7
    sget-object v0, Landroid/support/v7/c/f;->a:Landroid/support/v7/c/f;

    goto :goto_2

    .line 1834
    :cond_8
    invoke-virtual {v0}, Landroid/support/v7/c/f;->b()Z

    move-result v1

    if-eqz v1, :cond_b

    if-nez v2, :cond_b

    .line 1836
    iget-object v0, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    if-eqz v0, :cond_6

    .line 1839
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    .line 1844
    :goto_3
    invoke-static {}, Landroid/support/v7/c/g;->f()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1845
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Updated discovery request: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1847
    :cond_9
    if-eqz v4, :cond_a

    if-nez v2, :cond_a

    iget-boolean v0, p0, Landroid/support/v7/c/g$d;->k:Z

    if-eqz v0, :cond_a

    .line 1848
    const-string v0, "MediaRouter"

    const-string v1, "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1855
    :cond_a
    iget-object v0, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v1, v5

    .line 1856
    :goto_4
    if-ge v1, v2, :cond_6

    .line 1857
    iget-object v0, p0, Landroid/support/v7/c/g$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$e;

    invoke-static {v0}, Landroid/support/v7/c/g$e;->a(Landroid/support/v7/c/g$e;)Landroid/support/v7/c/c;

    move-result-object v0

    iget-object v3, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    invoke-virtual {v0, v3}, Landroid/support/v7/c/c;->a(Landroid/support/v7/c/b;)V

    .line 1856
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    .line 1842
    :cond_b
    new-instance v1, Landroid/support/v7/c/b;

    invoke-direct {v1, v0, v2}, Landroid/support/v7/c/b;-><init>(Landroid/support/v7/c/f;Z)V

    iput-object v1, p0, Landroid/support/v7/c/g$d;->p:Landroid/support/v7/c/b;

    goto :goto_3
.end method

.method public f()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    .prologue
    .line 2218
    iget-object v0, p0, Landroid/support/v7/c/g$d;->q:Landroid/support/v7/c/g$d$b;

    if-eqz v0, :cond_0

    .line 2219
    iget-object v0, p0, Landroid/support/v7/c/g$d;->q:Landroid/support/v7/c/g$d$b;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d$b;->b()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    .line 2223
    :goto_0
    return-object v0

    .line 2220
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/g$d;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    if-eqz v0, :cond_1

    .line 2221
    iget-object v0, p0, Landroid/support/v7/c/g$d;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->a()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    goto :goto_0

    .line 2223
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
