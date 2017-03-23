.class Lcom/arlib/floatingsearchview/FloatingSearchView$5;
.super Lcom/arlib/floatingsearchview/util/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/FloatingSearchView;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/GestureDetector;

.field final synthetic b:Lcom/arlib/floatingsearchview/FloatingSearchView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/FloatingSearchView;Landroid/view/GestureDetector;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$5;->b:Lcom/arlib/floatingsearchview/FloatingSearchView;

    iput-object p2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$5;->a:Landroid/view/GestureDetector;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v7/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$5;->a:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 v0, 0x0

    return v0
.end method
