.class Lcom/google/android/gms/b/gz$16;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/gi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->a(Ljava/util/List;Lcom/google/android/gms/b/gx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gx;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/google/android/gms/b/gz;

.field final synthetic d:Lcom/google/android/gms/b/gz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;Ljava/util/List;Lcom/google/android/gms/b/gz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    iput-object p2, p0, Lcom/google/android/gms/b/gz$16;->a:Lcom/google/android/gms/b/gx;

    iput-object p3, p0, Lcom/google/android/gms/b/gz$16;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/b/gz$16;->c:Lcom/google/android/gms/b/gz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const/4 v4, 0x0

    invoke-static {p1, p2}, Lcom/google/android/gms/b/gz;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/b;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    const-string v2, "Transaction"

    iget-object v3, p0, Lcom/google/android/gms/b/gz$16;->a:Lcom/google/android/gms/b/gx;

    invoke-static {v0, v2, v3, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Ljava/lang/String;Lcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    if-nez v1, :cond_1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/gz$16;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gz$a;

    sget-object v1, Lcom/google/android/gms/b/gz$b;->d:Lcom/google/android/gms/b/gz$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/gz$b;)Lcom/google/android/gms/b/gz$b;

    iget-object v1, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    invoke-static {v1}, Lcom/google/android/gms/b/gz;->e(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/hh;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->c(Lcom/google/android/gms/b/gz$a;)J

    move-result-wide v2

    iget-object v5, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    invoke-static {v5}, Lcom/google/android/gms/b/gz;->f(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/kq;

    move-result-object v6

    move v5, v4

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/b/hh;->a(JZZLcom/google/android/gms/b/kl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v7, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->h(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/jr;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/gz$16;->c:Lcom/google/android/gms/b/gz;

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)Lcom/google/firebase/database/d;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/b/jl;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jl;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/firebase/database/n;->a(Lcom/google/firebase/database/d;Lcom/google/android/gms/b/jl;)Lcom/google/firebase/database/a;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/b/gz$16$1;

    invoke-direct {v2, p0, v0, v1}, Lcom/google/android/gms/b/gz$16$1;-><init>(Lcom/google/android/gms/b/gz$16;Lcom/google/android/gms/b/gz$a;Lcom/google/firebase/database/a;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    new-instance v2, Lcom/google/android/gms/b/hn;

    iget-object v3, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->j(Lcom/google/android/gms/b/gz$a;)Lcom/google/firebase/database/m;

    move-result-object v5

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object v0

    invoke-direct {v2, v3, v5, v0}, Lcom/google/android/gms/b/hn;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/firebase/database/m;Lcom/google/android/gms/b/it;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gs;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    iget-object v1, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    invoke-static {v1}, Lcom/google/android/gms/b/gz;->g(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/ii;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/gz$16;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/ii;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/ii;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/b/gz;->b(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/ii;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    invoke-static {v0}, Lcom/google/android/gms/b/gz;->h(Lcom/google/android/gms/b/gz;)V

    iget-object v0, p0, Lcom/google/android/gms/b/gz$16;->c:Lcom/google/android/gms/b/gz;

    invoke-static {v0, v7}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Ljava/util/List;)V

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/gz;->b(Ljava/lang/Runnable;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/google/firebase/database/b;->a()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/gz$16;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gz$a;

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->d(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gz$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/b/gz$b;->e:Lcom/google/android/gms/b/gz$b;

    if-ne v2, v3, :cond_2

    sget-object v2, Lcom/google/android/gms/b/gz$b;->f:Lcom/google/android/gms/b/gz$b;

    invoke-static {v0, v2}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/gz$b;)Lcom/google/android/gms/b/gz$b;

    goto :goto_2

    :cond_2
    sget-object v2, Lcom/google/android/gms/b/gz$b;->b:Lcom/google/android/gms/b/gz$b;

    invoke-static {v0, v2}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/gz$b;)Lcom/google/android/gms/b/gz$b;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/gz$16;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/gz$a;

    sget-object v3, Lcom/google/android/gms/b/gz$b;->f:Lcom/google/android/gms/b/gz$b;

    invoke-static {v0, v3}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/android/gms/b/gz$b;)Lcom/google/android/gms/b/gz$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/b/gz$a;->a(Lcom/google/android/gms/b/gz$a;Lcom/google/firebase/database/b;)Lcom/google/firebase/database/b;

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/gz$16;->d:Lcom/google/android/gms/b/gz;

    iget-object v1, p0, Lcom/google/android/gms/b/gz$16;->a:Lcom/google/android/gms/b/gx;

    invoke-static {v0, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    :cond_5
    return-void
.end method
