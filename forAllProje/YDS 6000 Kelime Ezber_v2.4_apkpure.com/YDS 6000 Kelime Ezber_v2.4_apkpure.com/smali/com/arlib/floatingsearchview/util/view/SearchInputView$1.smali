.class Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arlib/floatingsearchview/util/view/SearchInputView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/util/view/SearchInputView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/util/view/SearchInputView;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;->a:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/16 v0, 0x42

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;->a:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->a(Lcom/arlib/floatingsearchview/util/view/SearchInputView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;->a:Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->a(Lcom/arlib/floatingsearchview/util/view/SearchInputView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;->a()V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
