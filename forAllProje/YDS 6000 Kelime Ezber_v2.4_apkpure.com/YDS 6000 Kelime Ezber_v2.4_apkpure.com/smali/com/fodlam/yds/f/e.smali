.class public Lcom/fodlam/yds/f/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(III)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/fodlam/yds/f/e;->a:I

    iput p2, p0, Lcom/fodlam/yds/f/e;->b:I

    iput p3, p0, Lcom/fodlam/yds/f/e;->c:I

    new-instance v0, Ljava/util/HashMap;

    sget-object v1, Lcom/fodlam/yds/c/a;->a:[Ljava/lang/String;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/fodlam/yds/f/e;->d:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Lcom/fodlam/yds/f/h;)V
    .locals 3

    iget v0, p1, Lcom/fodlam/yds/f/h;->c:I

    iget v1, p1, Lcom/fodlam/yds/f/h;->d:I

    iget v2, p1, Lcom/fodlam/yds/f/h;->e:I

    invoke-direct {p0, v0, v1, v2}, Lcom/fodlam/yds/f/e;-><init>(III)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/f/e;->a(I)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/f/e;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fodlam/yds/f/e;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 2

    const/4 v0, 0x3

    :goto_0
    sget-object v1, Lcom/fodlam/yds/c/a;->a:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    sget-object v1, Lcom/fodlam/yds/c/a;->a:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p0, v1, p1}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/f/e;->d:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 5

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/fodlam/yds/f/e;->b()Z

    move-result v0

    iget-object v1, p0, Lcom/fodlam/yds/f/e;->d:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/fodlam/yds/f/e;->b()Z

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-static {v4}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fodlam/yds/c/a;->f()Lcom/fodlam/yds/f/f;

    move-result-object v2

    iget v3, v2, Lcom/fodlam/yds/f/f;->c:I

    if-nez v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    add-int/2addr v0, v3

    iput v0, v2, Lcom/fodlam/yds/f/f;->c:I

    invoke-static {v4}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/fodlam/yds/c/a;->b(Lcom/fodlam/yds/f/f;)I

    :cond_0
    return-void

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public b()Z
    .locals 5

    const/4 v3, 0x0

    const/4 v0, 0x3

    move v1, v0

    move v2, v3

    :goto_0
    sget-object v0, Lcom/fodlam/yds/c/a;->a:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/f/e;->d:Ljava/util/HashMap;

    sget-object v4, Lcom/fodlam/yds/c/a;->a:[Ljava/lang/String;

    aget-object v4, v4, v1

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v2, v0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/fodlam/yds/OxfordApplication;->a:I

    if-lt v2, v0, :cond_1

    const/4 v3, 0x1

    :cond_1
    return v3
.end method

.method public c()Z
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fodlam/yds/f/e;->d:Ljava/util/HashMap;

    const-string v3, "issent"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return v2

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/f/e;->d:Ljava/util/HashMap;

    const-string v3, "issent"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_1

    move v0, v1

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method

.method public d()V
    .locals 2

    const-string v0, "issent"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/fodlam/yds/f/e;->b(Ljava/lang/String;I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/fodlam/yds/f/e;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fodlam/yds/f/e;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fodlam/yds/f/e;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fodlam/yds/f/e;->a()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
