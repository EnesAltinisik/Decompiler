.class Lcom/arlib/floatingsearchview/FloatingSearchView$4;
.super Lcom/arlib/floatingsearchview/util/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/FloatingSearchView;->l()V
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

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$4;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$4;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->u(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$4;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->u(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/b;->a(Landroid/app/Activity;)V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
