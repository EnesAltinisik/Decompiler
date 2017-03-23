.class Lcom/arlib/floatingsearchview/FloatingSearchView$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/arlib/floatingsearchview/a/a$a;


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

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/arlib/floatingsearchview/a/a/a;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0, v2}, Lcom/arlib/floatingsearchview/FloatingSearchView;->e(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->p(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->p(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$g;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$g;->a(Lcom/arlib/floatingsearchview/a/a/a;)V

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)Z

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->q(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-interface {p1}, Lcom/arlib/floatingsearchview/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSearchBarTitle(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0, v2}, Lcom/arlib/floatingsearchview/FloatingSearchView;->d(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-interface {p1}, Lcom/arlib/floatingsearchview/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->setSearchText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public b(Lcom/arlib/floatingsearchview/a/a/a;)V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    move-result-object v0

    invoke-interface {p1}, Lcom/arlib/floatingsearchview/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$6;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setSelection(I)V

    return-void
.end method
