.class Lcom/arlib/floatingsearchview/FloatingSearchView$7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Z

.field final synthetic c:Lcom/arlib/floatingsearchview/FloatingSearchView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/FloatingSearchView;Ljava/util/List;Z)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$7;->c:Lcom/arlib/floatingsearchview/FloatingSearchView;

    iput-object p2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$7;->a:Ljava/util/List;

    iput-boolean p3, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$7;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$7;->c:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->v(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$7;->c:Lcom/arlib/floatingsearchview/FloatingSearchView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$7;->a:Ljava/util/List;

    iget-boolean v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$7;->b:Z

    invoke-static {v0, v1, v2}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Lcom/arlib/floatingsearchview/FloatingSearchView;Ljava/util/List;Z)V

    return-void
.end method
