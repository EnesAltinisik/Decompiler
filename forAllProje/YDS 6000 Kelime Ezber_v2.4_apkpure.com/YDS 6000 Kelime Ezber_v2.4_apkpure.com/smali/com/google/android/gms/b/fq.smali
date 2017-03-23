.class public Lcom/google/android/gms/b/fq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/fq$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/fo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/fo",
            "<TT;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/fo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/fo",
            "<TT;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/fq;->a:Lcom/google/android/gms/b/fo;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<TT;>;",
            "Ljava/util/Comparator",
            "<TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/fo$a;->a()Lcom/google/android/gms/b/fo$a$a;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/b/fo$a;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/b/fo$a$a;Ljava/util/Comparator;)Lcom/google/android/gms/b/fo;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/fq;->a:Lcom/google/android/gms/b/fo;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/google/android/gms/b/fq;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/google/android/gms/b/fq",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fq;->a:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/fo;->c(Ljava/lang/Object;)Lcom/google/android/gms/b/fo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/fq;->a:Lcom/google/android/gms/b/fo;

    if-ne v0, v1, :cond_0

    :goto_0
    return-object p0

    :cond_0
    new-instance p0, Lcom/google/android/gms/b/fq;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/fq;-><init>(Lcom/google/android/gms/b/fo;)V

    goto :goto_0
.end method

.method public b(Ljava/lang/Object;)Lcom/google/android/gms/b/fq;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/google/android/gms/b/fq",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/b/fq;

    iget-object v1, p0, Lcom/google/android/gms/b/fq;->a:Lcom/google/android/gms/b/fo;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/b/fo;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/b/fo;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/fq;-><init>(Lcom/google/android/gms/b/fo;)V

    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/fq;->a:Lcom/google/android/gms/b/fo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/fo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/b/fq$a;

    iget-object v1, p0, Lcom/google/android/gms/b/fq;->a:Lcom/google/android/gms/b/fo;

    invoke-virtual {v1}, Lcom/google/android/gms/b/fo;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/fq$a;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method
