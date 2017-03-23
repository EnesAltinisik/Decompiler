.class public Lcom/fodlam/yds/a/k;
.super Landroid/support/v4/b/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/a/k$b;,
        Lcom/fodlam/yds/a/k$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/a/k$a;",
            ">;"
        }
    .end annotation
.end field

.field public b:[Lcom/fodlam/yds/a/k$b;

.field c:Lcom/fodlam/yds/WriteWordActivity;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/WriteWordActivity;Landroid/os/Bundle;)V
    .locals 4

    invoke-virtual {p1}, Lcom/fodlam/yds/WriteWordActivity;->e()Landroid/support/v4/b/q;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v4/b/w;-><init>(Landroid/support/v4/b/q;)V

    iput-object p1, p0, Lcom/fodlam/yds/a/k;->c:Lcom/fodlam/yds/WriteWordActivity;

    if-eqz p2, :cond_1

    const-string v0, "writewordlist"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/fodlam/yds/a/k;->a:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/a/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lcom/fodlam/yds/a/k$b;

    iput-object v0, p0, Lcom/fodlam/yds/a/k;->b:[Lcom/fodlam/yds/a/k$b;

    return-void

    :cond_1
    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->b()Lcom/fodlam/yds/f/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/g;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    sget-boolean v1, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    new-instance v2, Lcom/fodlam/yds/f/h;

    invoke-direct {v2}, Lcom/fodlam/yds/f/h;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/fodlam/yds/a/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v2, p0, Lcom/fodlam/yds/a/k;->a:Ljava/util/ArrayList;

    new-instance v3, Lcom/fodlam/yds/a/k$a;

    invoke-direct {v3, v0}, Lcom/fodlam/yds/a/k$a;-><init>(Lcom/fodlam/yds/f/h;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public a(I)Landroid/support/v4/b/l;
    .locals 3

    iget-object v0, p0, Lcom/fodlam/yds/a/k;->b:[Lcom/fodlam/yds/a/k$b;

    aget-object v0, v0, p1

    if-nez v0, :cond_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, Lcom/fodlam/yds/a/k;->b:[Lcom/fodlam/yds/a/k$b;

    new-instance v2, Lcom/fodlam/yds/a/k$b;

    invoke-direct {v2}, Lcom/fodlam/yds/a/k$b;-><init>()V

    aput-object v2, v0, p1

    const-string v2, "writeWord"

    iget-object v0, p0, Lcom/fodlam/yds/a/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    iget-object v0, p0, Lcom/fodlam/yds/a/k;->b:[Lcom/fodlam/yds/a/k$b;

    aget-object v0, v0, p1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/a/k$b;->g(Landroid/os/Bundle;)V

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/a/k;->b:[Lcom/fodlam/yds/a/k$b;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/k;->b:[Lcom/fodlam/yds/a/k$b;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/fodlam/yds/a/k$b;->a()V

    return-void
.end method

.method public c()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fodlam/yds/a/k;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/a/k$a;

    iget-object v3, v0, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-boolean v3, v3, Lcom/fodlam/yds/f/h;->b:Z

    if-nez v3, :cond_1

    iget-object v0, v0, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    sget-object v3, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v3}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    move v0, v1

    goto :goto_1
.end method
