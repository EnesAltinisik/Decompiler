.class Landroid/support/v7/widget/ae$4;
.super Landroid/support/v7/widget/ae$c;
.source "DefaultItemAnimator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/widget/ae;->t(Landroid/support/v7/widget/RecyclerView$u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/RecyclerView$u;

.field final synthetic b:Landroid/support/v4/view/az;

.field final synthetic c:Landroid/support/v7/widget/ae;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/ae;Landroid/support/v7/widget/RecyclerView$u;Landroid/support/v4/view/az;)V
    .locals 1

    .prologue
    .line 198
    iput-object p1, p0, Landroid/support/v7/widget/ae$4;->c:Landroid/support/v7/widget/ae;

    iput-object p2, p0, Landroid/support/v7/widget/ae$4;->a:Landroid/support/v7/widget/RecyclerView$u;

    iput-object p3, p0, Landroid/support/v7/widget/ae$4;->b:Landroid/support/v4/view/az;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/ae$c;-><init>(Landroid/support/v7/widget/ae$1;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Landroid/support/v7/widget/ae$4;->b:Landroid/support/v4/view/az;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/az;->a(Landroid/support/v4/view/bd;)Landroid/support/v4/view/az;

    .line 207
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Landroid/support/v4/view/ah;->c(Landroid/view/View;F)V

    .line 208
    iget-object v0, p0, Landroid/support/v7/widget/ae$4;->c:Landroid/support/v7/widget/ae;

    iget-object v1, p0, Landroid/support/v7/widget/ae$4;->a:Landroid/support/v7/widget/RecyclerView$u;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ae;->h(Landroid/support/v7/widget/RecyclerView$u;)V

    .line 209
    iget-object v0, p0, Landroid/support/v7/widget/ae$4;->c:Landroid/support/v7/widget/ae;

    invoke-static {v0}, Landroid/support/v7/widget/ae;->d(Landroid/support/v7/widget/ae;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/ae$4;->a:Landroid/support/v7/widget/RecyclerView$u;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 210
    iget-object v0, p0, Landroid/support/v7/widget/ae$4;->c:Landroid/support/v7/widget/ae;

    invoke-static {v0}, Landroid/support/v7/widget/ae;->e(Landroid/support/v7/widget/ae;)V

    .line 211
    return-void
.end method

.method public onAnimationStart(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Landroid/support/v7/widget/ae$4;->c:Landroid/support/v7/widget/ae;

    iget-object v1, p0, Landroid/support/v7/widget/ae$4;->a:Landroid/support/v7/widget/RecyclerView$u;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ae;->k(Landroid/support/v7/widget/RecyclerView$u;)V

    .line 202
    return-void
.end method
