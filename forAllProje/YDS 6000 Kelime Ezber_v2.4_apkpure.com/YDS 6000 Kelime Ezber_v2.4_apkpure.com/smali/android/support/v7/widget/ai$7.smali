.class Landroid/support/v7/widget/ai$7;
.super Landroid/support/v7/widget/ai$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/widget/ai;->a(Landroid/support/v7/widget/ai$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/ai$a;

.field final synthetic b:Landroid/support/v4/view/ay;

.field final synthetic c:Landroid/support/v7/widget/ai;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/ai;Landroid/support/v7/widget/ai$a;Landroid/support/v4/view/ay;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/ai$7;->c:Landroid/support/v7/widget/ai;

    iput-object p2, p0, Landroid/support/v7/widget/ai$7;->a:Landroid/support/v7/widget/ai$a;

    iput-object p3, p0, Landroid/support/v7/widget/ai$7;->b:Landroid/support/v4/view/ay;

    invoke-direct {p0}, Landroid/support/v7/widget/ai$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/ai$7;->c:Landroid/support/v7/widget/ai;

    iget-object v1, p0, Landroid/support/v7/widget/ai$7;->a:Landroid/support/v7/widget/ai$a;

    iget-object v1, v1, Landroid/support/v7/widget/ai$a;->a:Landroid/support/v7/widget/RecyclerView$w;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/ai;->b(Landroid/support/v7/widget/RecyclerView$w;Z)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v7/widget/ai$7;->b:Landroid/support/v4/view/ay;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ay;->a(Landroid/support/v4/view/bc;)Landroid/support/v4/view/ay;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Landroid/support/v4/view/ah;->c(Landroid/view/View;F)V

    invoke-static {p1, v2}, Landroid/support/v4/view/ah;->a(Landroid/view/View;F)V

    invoke-static {p1, v2}, Landroid/support/v4/view/ah;->b(Landroid/view/View;F)V

    iget-object v0, p0, Landroid/support/v7/widget/ai$7;->c:Landroid/support/v7/widget/ai;

    iget-object v1, p0, Landroid/support/v7/widget/ai$7;->a:Landroid/support/v7/widget/ai$a;

    iget-object v1, v1, Landroid/support/v7/widget/ai$a;->a:Landroid/support/v7/widget/RecyclerView$w;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/ai;->a(Landroid/support/v7/widget/RecyclerView$w;Z)V

    iget-object v0, p0, Landroid/support/v7/widget/ai$7;->c:Landroid/support/v7/widget/ai;

    iget-object v0, v0, Landroid/support/v7/widget/ai;->g:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/v7/widget/ai$7;->a:Landroid/support/v7/widget/ai$a;

    iget-object v1, v1, Landroid/support/v7/widget/ai$a;->a:Landroid/support/v7/widget/RecyclerView$w;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/v7/widget/ai$7;->c:Landroid/support/v7/widget/ai;

    invoke-virtual {v0}, Landroid/support/v7/widget/ai;->c()V

    return-void
.end method
