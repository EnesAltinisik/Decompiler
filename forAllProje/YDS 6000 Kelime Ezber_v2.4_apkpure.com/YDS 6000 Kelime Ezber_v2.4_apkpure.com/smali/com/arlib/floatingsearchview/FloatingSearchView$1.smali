.class Lcom/arlib/floatingsearchview/FloatingSearchView$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/FloatingSearchView;->onLayout(ZIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/arlib/floatingsearchview/FloatingSearchView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/FloatingSearchView;I)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    iput p2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    iget v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->a:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->c(Lcom/arlib/floatingsearchview/FloatingSearchView;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->d(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->d(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$h;

    move-result-object v0

    invoke-interface {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$h;->a()V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$1;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Lcom/arlib/floatingsearchview/FloatingSearchView;Lcom/arlib/floatingsearchview/FloatingSearchView$h;)Lcom/arlib/floatingsearchview/FloatingSearchView$h;

    :cond_0
    return-void
.end method
