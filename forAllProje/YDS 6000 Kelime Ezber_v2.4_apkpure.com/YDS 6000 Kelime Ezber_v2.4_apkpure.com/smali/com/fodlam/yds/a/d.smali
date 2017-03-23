.class public Lcom/fodlam/yds/a/d;
.super Landroid/support/v4/b/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/a/d$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/d;",
            ">;"
        }
    .end annotation
.end field

.field b:Lcom/fodlam/yds/MultipleChoiceActivity;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/MultipleChoiceActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fodlam/yds/MultipleChoiceActivity;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/d;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/fodlam/yds/MultipleChoiceActivity;->e()Landroid/support/v4/b/q;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v4/b/w;-><init>(Landroid/support/v4/b/q;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/fodlam/yds/a/d;->b:Lcom/fodlam/yds/MultipleChoiceActivity;

    iput-object p2, p0, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(I)Landroid/support/v4/b/l;
    .locals 4

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    new-instance v2, Lcom/fodlam/yds/a/d$a;

    invoke-direct {v2}, Lcom/fodlam/yds/a/d$a;-><init>()V

    const-string v3, "question"

    iget-object v0, p0, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v2, v1}, Lcom/fodlam/yds/a/d$a;->g(Landroid/os/Bundle;)V

    return-object v2
.end method

.method public a(Lcom/fodlam/yds/f/h;I)Z
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/d;

    invoke-virtual {v0, p1}, Lcom/fodlam/yds/f/d;->a(Lcom/fodlam/yds/f/h;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public b(I)Z
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/d;

    iget-boolean v0, v0, Lcom/fodlam/yds/f/d;->d:Z

    return v0
.end method

.method public c()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/d;

    iget-boolean v3, v0, Lcom/fodlam/yds/f/d;->c:Z

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/fodlam/yds/f/d;->a()Lcom/fodlam/yds/f/h;

    move-result-object v0

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

.method public e(I)V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/fodlam/yds/f/d;->d:Z

    return-void
.end method
