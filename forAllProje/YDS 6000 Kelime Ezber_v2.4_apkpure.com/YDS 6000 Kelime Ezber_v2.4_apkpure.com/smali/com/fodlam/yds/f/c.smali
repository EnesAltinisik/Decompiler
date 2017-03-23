.class public Lcom/fodlam/yds/f/c;
.super Lcom/fodlam/yds/f/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/fodlam/yds/f/b;-><init>(Ljava/lang/String;ZI)V

    return-void
.end method


# virtual methods
.method public a(Lcom/fodlam/yds/f/h;)V
    .locals 3

    iget v0, p0, Lcom/fodlam/yds/f/c;->d:I

    div-int/lit8 v0, v0, 0xf

    iput v0, p1, Lcom/fodlam/yds/f/h;->g:I

    iget-object v0, p0, Lcom/fodlam/yds/f/c;->e:Ljava/util/HashMap;

    iget v1, p1, Lcom/fodlam/yds/f/h;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/g;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fodlam/yds/f/g;

    iget v1, p1, Lcom/fodlam/yds/f/h;->g:I

    invoke-direct {v0, v1}, Lcom/fodlam/yds/f/g;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/f/g;->a(Z)V

    iget-object v1, p0, Lcom/fodlam/yds/f/c;->e:Ljava/util/HashMap;

    iget v2, p1, Lcom/fodlam/yds/f/h;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0, p1}, Lcom/fodlam/yds/f/g;->a(Lcom/fodlam/yds/f/h;)V

    iget v0, p0, Lcom/fodlam/yds/f/c;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fodlam/yds/f/c;->d:I

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/f/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Lcom/fodlam/yds/f/h;)V
    .locals 4

    :try_start_0
    iget v0, p1, Lcom/fodlam/yds/f/h;->g:I

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/f/c;->a(I)Lcom/fodlam/yds/f/g;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/fodlam/yds/f/g;->b(Lcom/fodlam/yds/f/h;)V

    invoke-virtual {p0}, Lcom/fodlam/yds/f/c;->i()Lcom/fodlam/yds/f/g;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v0, v2, Lcom/fodlam/yds/f/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, v2, Lcom/fodlam/yds/f/g;->b:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/f/g;->a(Lcom/fodlam/yds/f/h;)V

    invoke-virtual {v2}, Lcom/fodlam/yds/f/g;->a()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/f/c;->e:Ljava/util/HashMap;

    iget v1, v2, Lcom/fodlam/yds/f/g;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget v0, p0, Lcom/fodlam/yds/f/c;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/fodlam/yds/f/c;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public i()Lcom/fodlam/yds/f/g;
    .locals 5

    iget-object v0, p0, Lcom/fodlam/yds/f/c;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/g;

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/g;

    iget v3, v0, Lcom/fodlam/yds/f/g;->a:I

    iget v4, v1, Lcom/fodlam/yds/f/g;->a:I

    if-le v3, v4, :cond_1

    :goto_1
    move-object v1, v0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method public j()V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/fodlam/yds/f/c;->e()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v1, p0, Lcom/fodlam/yds/f/c;->e:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    iput v0, p0, Lcom/fodlam/yds/f/c;->d:I

    new-instance v1, Lcom/fodlam/yds/f/c$1;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/f/c$1;-><init>(Lcom/fodlam/yds/f/c;)V

    invoke-static {v2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    move v1, v0

    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/f/c;->a(Lcom/fodlam/yds/f/h;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method
