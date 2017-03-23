.class Lcom/arlib/floatingsearchview/FloatingSearchView$11;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/FloatingSearchView;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/FloatingSearchView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$11;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$11;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->e(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/support/v7/widget/CardView;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$11;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$11;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->f(Lcom/arlib/floatingsearchview/FloatingSearchView;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(I)V

    return-void
.end method
