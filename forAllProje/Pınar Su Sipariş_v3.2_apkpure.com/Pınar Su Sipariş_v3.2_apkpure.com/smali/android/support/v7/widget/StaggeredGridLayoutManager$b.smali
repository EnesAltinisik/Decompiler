.class public Landroid/support/v7/widget/StaggeredGridLayoutManager$b;
.super Landroid/support/v7/widget/RecyclerView$i;
.source "StaggeredGridLayoutManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field e:Landroid/support/v7/widget/StaggeredGridLayoutManager$c;

.field f:Z


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .prologue
    .line 2280
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$i;-><init>(II)V

    .line 2281
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 2276
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$i;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2277
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 2288
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2289
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 0

    .prologue
    .line 2284
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 2285
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 2314
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager$b;->f:Z

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 2324
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager$b;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager$c;

    if-nez v0, :cond_0

    .line 2325
    const/4 v0, -0x1

    .line 2327
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager$b;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager$c;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$c;->d:I

    goto :goto_0
.end method
