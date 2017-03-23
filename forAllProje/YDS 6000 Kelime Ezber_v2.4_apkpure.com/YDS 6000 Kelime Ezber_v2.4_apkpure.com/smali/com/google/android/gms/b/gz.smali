.class public Lcom/google/android/gms/b/gz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/gf$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/gz$a;,
        Lcom/google/android/gms/b/gz$b;
    }
.end annotation


# static fields
.field static final synthetic b:Z


# instance fields
.field public a:J

.field private final c:Lcom/google/android/gms/b/ha;

.field private final d:Lcom/google/android/gms/b/kq;

.field private final e:Lcom/google/android/gms/b/gf;

.field private f:Lcom/google/android/gms/b/he;

.field private g:Lcom/google/android/gms/b/hf;

.field private h:Lcom/google/android/gms/b/ii;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/ii",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private i:Z

.field private final j:Lcom/google/android/gms/b/ir;

.field private final k:Lcom/google/android/gms/b/gq;

.field private final l:Lcom/google/android/gms/b/jb;

.field private final m:Lcom/google/android/gms/b/jb;

.field private final n:Lcom/google/android/gms/b/jb;

.field private o:J

.field private p:Lcom/google/android/gms/b/hh;

.field private q:Lcom/google/android/gms/b/hh;

.field private r:Lcom/google/firebase/database/f;

.field private s:Z

.field private t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/gz;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/gz;->b:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/b/ha;Lcom/google/android/gms/b/gq;Lcom/google/firebase/database/f;)V
    .locals 5

    const/4 v4, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/kq;

    new-instance v1, Lcom/google/android/gms/b/km;

    invoke-direct {v1}, Lcom/google/android/gms/b/km;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/kq;-><init>(Lcom/google/android/gms/b/kl;J)V

    iput-object v0, p0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    iput-boolean v4, p0, Lcom/google/android/gms/b/gz;->i:Z

    iput-wide v2, p0, Lcom/google/android/gms/b/gz;->a:J

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/google/android/gms/b/gz;->o:J

    iput-boolean v4, p0, Lcom/google/android/gms/b/gz;->s:Z

    iput-wide v2, p0, Lcom/google/android/gms/b/gz;->t:J

    iput-object p1, p0, Lcom/google/android/gms/b/gz;->c:Lcom/google/android/gms/b/ha;

    iput-object p2, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    iput-object p3, p0, Lcom/google/android/gms/b/gz;->r:Lcom/google/firebase/database/f;

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    const-string v1, "RepoOperation"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gq;->a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    const-string v1, "Transaction"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gq;->a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gz;->m:Lcom/google/android/gms/b/jb;

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    const-string v1, "DataOperation"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gq;->a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gz;->n:Lcom/google/android/gms/b/jb;

    new-instance v0, Lcom/google/android/gms/b/ir;

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/ir;-><init>(Lcom/google/android/gms/b/gq;)V

    iput-object v0, p0, Lcom/google/android/gms/b/gz;->j:Lcom/google/android/gms/b/ir;

    new-instance v0, Lcom/google/android/gms/b/gd;

    iget-object v1, p1, Lcom/google/android/gms/b/ha;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/b/ha;->c:Ljava/lang/String;

    iget-boolean v3, p1, Lcom/google/android/gms/b/ha;->b:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/gd;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p2, v0, p0}, Lcom/google/android/gms/b/gq;->a(Lcom/google/android/gms/b/gd;Lcom/google/android/gms/b/gf$a;)Lcom/google/android/gms/b/gf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    new-instance v0, Lcom/google/android/gms/b/gz$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/gz$1;-><init>(Lcom/google/android/gms/b/gz;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/gz;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ii;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ii;->b()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->c(Lcom/google/android/gms/b/ii;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/b/gz;->b(Ljava/util/List;Lcom/google/android/gms/b/gx;)V

    return-object v1
.end method

.method private a(Lcom/google/android/gms/b/gx;I)Lcom/google/android/gms/b/gx;
    .locals 7

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ii;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ii;->b()Lcom/google/android/gms/b/gx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->m:Lcom/google/android/gms/b/jb;

    invoke-virtual {v1}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x2c

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Aborting transactions for path: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ". Affected: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/gz;->h:Lcom/google/android/gms/b/ii;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/b/ii;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ii;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/b/gz$6;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/b/gz$6;-><init>(Lcom/google/android/gms/b/gz;I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/ii;->a(Lcom/google/android/gms/b/ii$a;)Z

    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/ii;I)V

    new-instance v2, Lcom/google/android/gms/b/gz$7;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/b/gz$7;-><init>(Lcom/google/android/gms/b/gz;I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/ii;->a(Lcom/google/android/gms/b/ii$b;)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;I)Lcom/google/android/gms/b/gx;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;I)Lcom/google/android/gms/b/gx;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/gx;Ljava/util/List;)Lcom/google/android/gms/b/jr;
    .locals 1
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

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/hh;->b(Lcom/google/android/gms/b/gx;Ljava/util/List;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/jj;->f()Lcom/google/android/gms/b/jj;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/b;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/b/gz;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/b;

    move-result-object v0

    return-object v0
.end method

.method private a(JLcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v5, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lcom/google/firebase/database/b;->a()I

    move-result v0

    const/16 v1, -0x19

    if-ne v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    if-nez p4, :cond_2

    move v0, v5

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    if-nez v0, :cond_3

    move v4, v5

    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    move-wide v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/b/hh;->a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    invoke-direct {p0, p3}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    :cond_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    move v4, v2

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/gz;->e()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;JLcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/b/gz;->a(JLcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/ii;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/ii;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/ii;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/ii;I)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;Ljava/lang/String;Lcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/b/gz;->a(Ljava/lang/String;Lcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/gz;Ljava/util/List;Lcom/google/android/gms/b/ii;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;Lcom/google/android/gms/b/ii;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/b/ib;)V
    .locals 12

    invoke-interface {p1}, Lcom/google/android/gms/b/ib;->a()Ljava/util/List;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-static {v0}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/kl;)Ljava/util/Map;

    move-result-object v10

    const-wide/high16 v0, -0x8000000000000000L

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-wide v2, v0

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/b/hl;

    new-instance v0, Lcom/google/android/gms/b/gz$11;

    invoke-direct {v0, p0, v4}, Lcom/google/android/gms/b/gz$11;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/hl;)V

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v6

    cmp-long v1, v2, v6

    if-ltz v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Write ids were not in order."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v8

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v2

    const-wide/16 v6, 0x1

    add-long/2addr v2, v6

    iput-wide v2, p0, Lcom/google/android/gms/b/gz;->o:J

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-virtual {v1}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v2

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x30

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Restoring overwrite with id "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->c()Lcom/google/android/gms/b/jr;

    move-result-object v3

    const/4 v5, 0x1

    invoke-interface {v3, v5}, Lcom/google/android/gms/b/jr;->a(Z)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/google/android/gms/b/gf;->a(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/b/gi;)V

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->c()Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-static {v0, v10}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/jr;Ljava/util/Map;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->c()Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;JZZ)Ljava/util/List;

    :goto_1
    move-wide v2, v8

    goto/16 :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-virtual {v1}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v2

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x2c

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Restoring merge with id "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v3

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lcom/google/android/gms/b/go;->a(Z)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/google/android/gms/b/gf;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/b/gi;)V

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v0

    invoke-static {v0, v10}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/go;Ljava/util/Map;)Lcom/google/android/gms/b/go;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->d()Lcom/google/android/gms/b/go;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/go;Lcom/google/android/gms/b/go;JZ)Ljava/util/List;

    goto :goto_1

    :cond_4
    return-void
.end method

.method private a(Lcom/google/android/gms/b/ii;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ii",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/ii;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/gz;->c(Lcom/google/android/gms/b/ii;)Ljava/util/List;

    move-result-object v2

    sget-boolean v0, Lcom/google/android/gms/b/gz;->b:Z

    if-nez v0, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gz$a;

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/b/gz$b;->b:Lcom/google/android/gms/b/gz$b;

    if-eq v0, v4, :cond_1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/b/ii;->b()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;Lcom/google/android/gms/b/gx;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/b/ii;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/b/gz$15;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/gz$15;-><init>(Lcom/google/android/gms/b/gz;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/ii;->b(Lcom/google/android/gms/b/ii$b;)V

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/b/ii;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ii",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;>;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/ii;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_a

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, -0x9

    if-ne p2, v1, :cond_0

    const-string v1, "overriddenBySet"

    invoke-static {v1}, Lcom/google/firebase/database/b;->a(Ljava/lang/String;)Lcom/google/firebase/database/b;

    move-result-object v1

    move-object v8, v1

    :goto_0
    const/4 v2, -0x1

    const/4 v1, 0x0

    move v9, v1

    move v10, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v9, v1, :cond_8

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/gms/b/gz$a;

    invoke-static {v7}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/b/gz$b;->e:Lcom/google/android/gms/b/gz$b;

    if-ne v1, v2, :cond_2

    move v2, v10

    :goto_2
    add-int/lit8 v1, v9, 0x1

    move v9, v1

    move v10, v2

    goto :goto_1

    :cond_0
    const/16 v1, -0x19

    if-ne p2, v1, :cond_1

    const/4 v1, 0x1

    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown transaction abort reason: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    const/16 v1, -0x19

    invoke-static {v1}, Lcom/google/firebase/database/b;->a(I)Lcom/google/firebase/database/b;

    move-result-object v1

    move-object v8, v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    invoke-static {v7}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/b/gz$b;->c:Lcom/google/android/gms/b/gz$b;

    if-ne v1, v2, :cond_4

    sget-boolean v1, Lcom/google/android/gms/b/gz;->b:Z

    if-nez v1, :cond_3

    add-int/lit8 v1, v9, -0x1

    if-eq v10, v1, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_3
    sget-object v1, Lcom/google/android/gms/b/gz$b;->e:Lcom/google/android/gms/b/gz$b;

    invoke-static {v7, v1}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/gz$b;)Lcom/google/android/gms/b/gz$b;

    invoke-static {v7, v8}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/firebase/database/b;)Lcom/google/firebase/database/b;

    move v2, v9

    goto :goto_2

    :cond_4
    sget-boolean v1, Lcom/google/android/gms/b/gz;->b:Z

    if-nez v1, :cond_5

    invoke-static {v7}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/b/gz$b;->b:Lcom/google/android/gms/b/gz$b;

    if-eq v1, v2, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_5
    new-instance v1, Lcom/google/android/gms/b/hn;

    invoke-static {v7}, Lcom/google/android/gms/b/gz$a;->j(Lcom/google/android/gms/b/gz$a;)Lcom/google/firebase/database/m;

    move-result-object v2

    invoke-static {v7}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3}, Lcom/google/android/gms/b/hn;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/firebase/database/m;Lcom/google/android/gms/b/it;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gs;)V

    const/16 v1, -0x9

    if-ne p2, v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-static {v7}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/b/hh;->a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_4
    new-instance v1, Lcom/google/android/gms/b/gz$8;

    invoke-direct {v1, p0, v7, v8}, Lcom/google/android/gms/b/gz$8;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gz$a;Lcom/google/firebase/database/b;)V

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v10

    goto/16 :goto_2

    :cond_6
    const/16 v1, -0x19

    if-ne p2, v1, :cond_7

    const/4 v1, 0x1

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown transaction abort reason: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    goto :goto_5

    :cond_8
    const/4 v1, -0x1

    if-ne v10, v1, :cond_9

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/ii;->a(Ljava/lang/Object;)V

    :goto_6
    invoke-direct {p0, v11}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/gz;->b(Ljava/lang/Runnable;)V

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    add-int/lit8 v2, v10, 0x1

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/ii;->a(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V
    .locals 6

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/google/firebase/database/b;->a()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p3}, Lcom/google/firebase/database/b;->a()I

    move-result v0

    const/16 v1, -0x19

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lcom/google/firebase/database/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xd

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " at "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " failed: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/b/ip;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->j:Lcom/google/android/gms/b/ir;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ir;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/b/gx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;",
            "Lcom/google/android/gms/b/gx;",
            ")V"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gz$a;

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;Ljava/util/List;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/jr;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gz$a;

    sget-boolean v4, Lcom/google/android/gms/b/gz;->b:Z

    if-nez v4, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/b/gz$b;->b:Lcom/google/android/gms/b/gz$b;

    if-eq v4, v5, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    sget-object v4, Lcom/google/android/gms/b/gz$b;->c:Lcom/google/android/gms/b/gz$b;

    invoke-static {v0, v4}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/gz$b;)Lcom/google/android/gms/b/gz$b;

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->e(Lcom/google/android/gms/b/gz$a;)I

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-static {p2, v4}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->g(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    invoke-interface {v1, v4, v0}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Lcom/google/android/gms/b/jr;->a(Z)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/b/gz;->f()J

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    invoke-virtual {p2}, Lcom/google/android/gms/b/gx;->c()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/b/gz$16;

    invoke-direct {v4, p0, p2, p1, p0}, Lcom/google/android/gms/b/gz$16;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;Ljava/util/List;Lcom/google/android/gms/b/gz;)V

    invoke-interface {v1, v3, v0, v2, v4}, Lcom/google/android/gms/b/gf;->a(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/b/gi;)V

    return-void
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/b/ii;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;",
            "Lcom/google/android/gms/b/ii",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/b/ii;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/gz$5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/gz$5;-><init>(Lcom/google/android/gms/b/gz;Ljava/util/List;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/b/ii;->b(Lcom/google/android/gms/b/ii$b;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/gf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    return-object v0
.end method

.method private b(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ii;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            ")",
            "Lcom/google/android/gms/b/ii",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->h:Lcom/google/android/gms/b/ii;

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ii;->a()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/b/gx;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/b/je;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/ii;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ii;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->e()Lcom/google/android/gms/b/gx;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/b;
    .locals 1

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lcom/google/firebase/database/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/b;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/ii;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/ii;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/b/ii;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ii",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/b/ii;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/gz$a;

    invoke-static {v1}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/b/gz$b;->d:Lcom/google/android/gms/b/gz$b;

    if-ne v1, v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v1, v2

    :goto_1
    move v2, v1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/ii;->a(Ljava/lang/Object;)V

    :cond_2
    :goto_2
    new-instance v0, Lcom/google/android/gms/b/gz$17;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/gz$17;-><init>(Lcom/google/android/gms/b/gz;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/ii;->b(Lcom/google/android/gms/b/ii$b;)V

    return-void

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/ii;->a(Ljava/lang/Object;)V

    goto :goto_2
.end method

.method private b(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/b/gp;->b:Lcom/google/android/gms/b/je;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/je;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    move-object v0, p2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/kq;->a(J)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/gx;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/b/je;

    const/4 v2, 0x0

    sget-object v3, Lcom/google/android/gms/b/gp;->a:Lcom/google/android/gms/b/je;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/b/js;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/gz;->f:Lcom/google/android/gms/b/he;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/b/he;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    iget-object v2, p0, Lcom/google/android/gms/b/gz;->p:Lcom/google/android/gms/b/hh;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V
    :try_end_0
    .catch Lcom/google/firebase/database/c; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    const-string v2, "Failed to parse info update"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private b(Ljava/util/List;Lcom/google/android/gms/b/gx;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;",
            "Lcom/google/android/gms/b/gx;",
            ")V"
        }
    .end annotation

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/gz$a;

    invoke-static {v2}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :cond_2
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/google/android/gms/b/gz$a;

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    const/4 v12, 0x0

    const/4 v11, 0x0

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    sget-boolean v3, Lcom/google/android/gms/b/gz;->b:Z

    if-nez v3, :cond_3

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    :cond_3
    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/b/gz$b;->f:Lcom/google/android/gms/b/gz$b;

    if-ne v2, v3, :cond_5

    const/4 v2, 0x1

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->k(Lcom/google/android/gms/b/gz$a;)Lcom/google/firebase/database/b;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/firebase/database/b;->a()I

    move-result v3

    const/16 v4, -0x19

    if-eq v3, v4, :cond_4

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/b/hh;->a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    if-eqz v2, :cond_2

    sget-object v2, Lcom/google/android/gms/b/gz$b;->d:Lcom/google/android/gms/b/gz$b;

    invoke-static {v10, v2}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/gz$b;)Lcom/google/android/gms/b/gz$b;

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)Lcom/google/firebase/database/d;

    move-result-object v2

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->b(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jl;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/database/n;->a(Lcom/google/firebase/database/d;Lcom/google/android/gms/b/jl;)Lcom/google/firebase/database/a;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/b/gz$2;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v10}, Lcom/google/android/gms/b/gz$2;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gz$a;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/gz;->a(Ljava/lang/Runnable;)V

    new-instance v3, Lcom/google/android/gms/b/gz$3;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v10, v9, v2}, Lcom/google/android/gms/b/gz$3;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gz$a;Lcom/google/firebase/database/b;Lcom/google/firebase/database/a;)V

    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_5
    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/b/gz$b;->b:Lcom/google/android/gms/b/gz$b;

    if-ne v2, v3, :cond_a

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->l(Lcom/google/android/gms/b/gz$a;)I

    move-result v2

    const/16 v3, 0x19

    if-lt v2, v3, :cond_6

    const/4 v2, 0x1

    const-string v3, "maxretries"

    invoke-static {v3}, Lcom/google/firebase/database/b;->a(Ljava/lang/String;)Lcom/google/firebase/database/b;

    move-result-object v9

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/b/hh;->a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_6
    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v14}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;Ljava/util/List;)Lcom/google/android/gms/b/jr;

    move-result-object v2

    invoke-static {v10, v2}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    invoke-static {v2}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/b/jr;)Lcom/google/firebase/database/h;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->i(Lcom/google/android/gms/b/gz$a;)Lcom/google/firebase/database/l$a;

    move-result-object v4

    invoke-interface {v4, v2}, Lcom/google/firebase/database/l$a;->a(Lcom/google/firebase/database/h;)Lcom/google/firebase/database/l$b;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    move-object v9, v3

    :goto_4
    invoke-virtual {v2}, Lcom/google/firebase/database/l$b;->a()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-static {v3}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/kl;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/firebase/database/l$b;->b()Lcom/google/android/gms/b/jr;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/jr;Ljava/util/Map;)Lcom/google/android/gms/b/jr;

    move-result-object v5

    invoke-static {v10, v4}, Lcom/google/android/gms/b/gz$a;->b(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    invoke-static {v10, v5}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/b/gz;->f()J

    move-result-wide v2

    invoke-static {v10, v2, v3}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;J)J

    move-object/from16 v0, v17

    invoke-interface {v14, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v6

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->m(Lcom/google/android/gms/b/gz$a;)Z

    move-result v8

    const/4 v9, 0x0

    invoke-virtual/range {v2 .. v9}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;JZZ)Ljava/util/List;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/b/hh;->a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object v9, v11

    move v2, v12

    goto/16 :goto_3

    :catch_0
    move-exception v2

    invoke-static {v2}, Lcom/google/firebase/database/b;->a(Ljava/lang/Throwable;)Lcom/google/firebase/database/b;

    move-result-object v3

    invoke-static {}, Lcom/google/firebase/database/l;->a()Lcom/google/firebase/database/l$b;

    move-result-object v2

    move-object v9, v3

    goto :goto_4

    :cond_7
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-static {v10}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/b/hh;->a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/b/gz;->h:Lcom/google/android/gms/b/ii;

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/ii;)V

    const/4 v2, 0x0

    move v3, v2

    :goto_5
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_9

    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/gz;->b(Ljava/lang/Runnable;)V

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_5

    :cond_9
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/b/gz;->h()V

    goto/16 :goto_0

    :cond_a
    move-object v9, v11

    move v2, v12

    goto/16 :goto_3
.end method

.method static synthetic c(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/he;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->f:Lcom/google/android/gms/b/he;

    return-object v0
.end method

.method private c(Lcom/google/android/gms/b/ii;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ii",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;>;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;Lcom/google/android/gms/b/ii;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/hh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->p:Lcom/google/android/gms/b/hh;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/hh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    return-object v0
.end method

.method private e()V
    .locals 6

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gq;->n()Lcom/google/android/gms/b/gm;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/gz$4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/gz$4;-><init>(Lcom/google/android/gms/b/gz;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/gm;->a(Lcom/google/android/gms/b/gm$b;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    invoke-interface {v0}, Lcom/google/android/gms/b/gf;->a()V

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->c:Lcom/google/android/gms/b/ha;

    iget-object v1, v1, Lcom/google/android/gms/b/ha;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gq;->b(Ljava/lang/String;)Lcom/google/android/gms/b/ib;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/he;

    invoke-direct {v1}, Lcom/google/android/gms/b/he;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/b/gz;->f:Lcom/google/android/gms/b/he;

    new-instance v1, Lcom/google/android/gms/b/hf;

    invoke-direct {v1}, Lcom/google/android/gms/b/hf;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/b/gz;->g:Lcom/google/android/gms/b/hf;

    new-instance v1, Lcom/google/android/gms/b/ii;

    invoke-direct {v1}, Lcom/google/android/gms/b/ii;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/b/gz;->h:Lcom/google/android/gms/b/ii;

    new-instance v1, Lcom/google/android/gms/b/hh;

    iget-object v2, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    new-instance v3, Lcom/google/android/gms/b/ia;

    invoke-direct {v3}, Lcom/google/android/gms/b/ia;-><init>()V

    new-instance v4, Lcom/google/android/gms/b/gz$9;

    invoke-direct {v4, p0}, Lcom/google/android/gms/b/gz$9;-><init>(Lcom/google/android/gms/b/gz;)V

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/b/hh;-><init>(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/ib;Lcom/google/android/gms/b/hh$c;)V

    iput-object v1, p0, Lcom/google/android/gms/b/gz;->p:Lcom/google/android/gms/b/hh;

    new-instance v1, Lcom/google/android/gms/b/hh;

    iget-object v2, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    new-instance v3, Lcom/google/android/gms/b/gz$10;

    invoke-direct {v3, p0}, Lcom/google/android/gms/b/gz$10;-><init>(Lcom/google/android/gms/b/gz;)V

    invoke-direct {v1, v2, v0, v3}, Lcom/google/android/gms/b/hh;-><init>(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/ib;Lcom/google/android/gms/b/hh$c;)V

    iput-object v1, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/ib;)V

    sget-object v0, Lcom/google/android/gms/b/gp;->c:Lcom/google/android/gms/b/je;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/b/gp;->d:Lcom/google/android/gms/b/je;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V

    return-void
.end method

.method private f()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/b/gz;->o:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/b/gz;->o:J

    return-wide v0
.end method

.method static synthetic f(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/kq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/ii;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->h:Lcom/google/android/gms/b/ii;

    return-object v0
.end method

.method private g()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-static {v0}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/kl;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->g:Lcom/google/android/gms/b/hf;

    invoke-static {v1, v0}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/hf;Ljava/util/Map;)Lcom/google/android/gms/b/hf;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/b/gz$14;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/b/gz$14;-><init>(Lcom/google/android/gms/b/gz;Ljava/util/List;)V

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/hf;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hf$b;)V

    new-instance v0, Lcom/google/android/gms/b/hf;

    invoke-direct {v0}, Lcom/google/android/gms/b/hf;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/gz;->g:Lcom/google/android/gms/b/hf;

    invoke-direct {p0, v1}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    return-void
.end method

.method private h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->h:Lcom/google/android/gms/b/ii;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/ii;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/ii;)V

    return-void
.end method

.method static synthetic h(Lcom/google/android/gms/b/gz;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/gz;->h()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/gp;->d:Lcom/google/android/gms/b/je;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/b/gs;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/gp;->a:Lcom/google/android/gms/b/je;

    invoke-virtual {p1}, Lcom/google/android/gms/b/gs;->a()Lcom/google/android/gms/b/it;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/it;->a()Lcom/google/android/gms/b/gx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/gx;->d()Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/je;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->p:Lcom/google/android/gms/b/hh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gs;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gs;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/firebase/database/d$a;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v6, 0x1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x5

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "set: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/gz;->n:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->n:Lcom/google/android/gms/b/jb;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x6

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "set: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/gz;->d:Lcom/google/android/gms/b/kq;

    invoke-static {v0}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/kl;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/jr;Ljava/util/Map;)Lcom/google/android/gms/b/jr;

    move-result-object v3

    invoke-direct {p0}, Lcom/google/android/gms/b/gz;->f()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    move-object v1, p1

    move-object v2, p2

    move v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/jr;JZZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    invoke-virtual {p1}, Lcom/google/android/gms/b/gx;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {p2, v6}, Lcom/google/android/gms/b/jr;->a(Z)Ljava/lang/Object;

    move-result-object v8

    new-instance v1, Lcom/google/android/gms/b/gz$13;

    move-object v2, p0

    move-object v3, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/b/gz$13;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;JLcom/google/firebase/database/d$a;)V

    invoke-interface {v0, v7, v8, v1}, Lcom/google/android/gms/b/gf;->a(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/b/gi;)V

    const/16 v0, -0x9

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;I)Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    return-void
.end method

.method public a(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V

    return-void
.end method

.method a(Lcom/google/firebase/database/d$a;Lcom/google/firebase/database/b;Lcom/google/android/gms/b/gx;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/b/gx;->g()Lcom/google/android/gms/b/je;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/b/je;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/google/android/gms/b/gx;->f()Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)Lcom/google/firebase/database/d;

    move-result-object v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/b/gz$12;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/b/gz$12;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/firebase/database/d$a;Lcom/google/firebase/database/b;Lcom/google/firebase/database/d;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/b/gz;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :cond_1
    invoke-static {p0, p3}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)Lcom/google/firebase/database/d;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gq;->c()V

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gq;->k()Lcom/google/android/gms/b/hc;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/hc;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/util/List;Ljava/lang/Object;ZLjava/lang/Long;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Z",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const/4 v7, 0x0

    new-instance v1, Lcom/google/android/gms/b/gx;

    invoke-direct {v1, p1}, Lcom/google/android/gms/b/gx;-><init>(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xe

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "onDataUpdate: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/gz;->n:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0xf

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "onDataUpdate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/b/gz;->a:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/b/gz;->a:J

    if-eqz p4, :cond_5

    :try_start_0
    new-instance v2, Lcom/google/android/gms/b/hi;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct {v2, v4, v5}, Lcom/google/android/gms/b/hi;-><init>(J)V

    if-eqz p3, :cond_4

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/b/js;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/jr;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/b/gx;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v6, v0}, Lcom/google/android/gms/b/gx;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/firebase/database/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    const-string v2, "FIREBASE INTERNAL ERROR"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v0, v1, v3, v2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Ljava/util/Map;Lcom/google/android/gms/b/hi;)Ljava/util/List;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-direct {p0, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    :cond_3
    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lcom/google/android/gms/b/js;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v3, v1, v0, v2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/hi;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_5
    if-eqz p3, :cond_7

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/b/js;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/jr;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/b/gx;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v5, v0}, Lcom/google/android/gms/b/gx;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_7
    invoke-static {p2}, Lcom/google/android/gms/b/js;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Ljava/util/List;
    :try_end_1
    .catch Lcom/google/firebase/database/c; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_2
.end method

.method public a(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gh;",
            ">;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const/4 v7, 0x0

    new-instance v1, Lcom/google/android/gms/b/gx;

    invoke-direct {v1, p1}, Lcom/google/android/gms/b/gx;-><init>(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x14

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "onRangeMergeUpdate: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/gz;->n:Lcom/google/android/gms/b/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/b/jb;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->l:Lcom/google/android/gms/b/jb;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x15

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "onRangeMergeUpdate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/b/gz;->a:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/b/gz;->a:J

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gh;

    new-instance v4, Lcom/google/android/gms/b/jw;

    invoke-direct {v4, v0}, Lcom/google/android/gms/b/jw;-><init>(Lcom/google/android/gms/b/gh;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    new-instance v3, Lcom/google/android/gms/b/hi;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/b/hi;-><init>(J)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Ljava/util/List;Lcom/google/android/gms/b/hi;)Ljava/util/List;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-direct {p0, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    :cond_3
    invoke-direct {p0, v0}, Lcom/google/android/gms/b/gz;->a(Ljava/util/List;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/gz;->q:Lcom/google/android/gms/b/hh;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/b/je;->a(Ljava/lang/String;)Lcom/google/android/gms/b/je;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/gp;->c:Lcom/google/android/gms/b/je;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/gp;->d:Lcom/google/android/gms/b/je;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/je;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/b/gz;->g()V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gq;->c()V

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->k:Lcom/google/android/gms/b/gq;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gq;->j()Lcom/google/android/gms/b/gu;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/gu;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    const-string v1, "repo_interrupt"

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/gf;->d(Ljava/lang/String;)V

    return-void
.end method

.method d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->e:Lcom/google/android/gms/b/gf;

    const-string v1, "repo_interrupt"

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/gf;->e(Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gz;->c:Lcom/google/android/gms/b/ha;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ha;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
