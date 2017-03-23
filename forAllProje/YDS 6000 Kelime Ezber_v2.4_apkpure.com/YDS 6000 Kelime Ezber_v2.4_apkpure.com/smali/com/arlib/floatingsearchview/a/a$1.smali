.class Lcom/arlib/floatingsearchview/a/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/arlib/floatingsearchview/a/a$c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/a/a;->b(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/a/a;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/a/a$1;->a:Lcom/arlib/floatingsearchview/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$1;->a:Lcom/arlib/floatingsearchview/a/a;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/a/a;->a(Lcom/arlib/floatingsearchview/a/a;)Lcom/arlib/floatingsearchview/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$1;->a:Lcom/arlib/floatingsearchview/a/a;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/a/a;->a(Lcom/arlib/floatingsearchview/a/a;)Lcom/arlib/floatingsearchview/a/a$a;

    move-result-object v1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$1;->a:Lcom/arlib/floatingsearchview/a/a;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/a/a;->b(Lcom/arlib/floatingsearchview/a/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arlib/floatingsearchview/a/a/a;

    invoke-interface {v1, v0}, Lcom/arlib/floatingsearchview/a/a$a;->a(Lcom/arlib/floatingsearchview/a/a/a;)V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$1;->a:Lcom/arlib/floatingsearchview/a/a;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/a/a;->a(Lcom/arlib/floatingsearchview/a/a;)Lcom/arlib/floatingsearchview/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$1;->a:Lcom/arlib/floatingsearchview/a/a;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/a/a;->a(Lcom/arlib/floatingsearchview/a/a;)Lcom/arlib/floatingsearchview/a/a$a;

    move-result-object v1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$1;->a:Lcom/arlib/floatingsearchview/a/a;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/a/a;->b(Lcom/arlib/floatingsearchview/a/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arlib/floatingsearchview/a/a/a;

    invoke-interface {v1, v0}, Lcom/arlib/floatingsearchview/a/a$a;->b(Lcom/arlib/floatingsearchview/a/a/a;)V

    :cond_0
    return-void
.end method
