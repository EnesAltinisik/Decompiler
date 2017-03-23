.class Lcom/arlib/floatingsearchview/FloatingSearchView$20;
.super Lcom/arlib/floatingsearchview/util/a/c;


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

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    const/4 v1, 0x4

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->i(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->j(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0, v2}, Lcom/arlib/floatingsearchview/FloatingSearchView;->b(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)Z

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->a(Lcom/arlib/floatingsearchview/FloatingSearchView;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_2
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->k(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->k(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->k(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->k(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/view/ah;->s(Landroid/view/View;)Landroid/support/v4/view/ay;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ay;->a(F)Landroid/support/v4/view/ay;

    move-result-object v0

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/view/ay;->a(J)Landroid/support/v4/view/ay;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ay;->c()V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->l(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$f;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->j(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->m(Lcom/arlib/floatingsearchview/FloatingSearchView;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->l(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/FloatingSearchView$f;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->m(Lcom/arlib/floatingsearchview/FloatingSearchView;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v2}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/arlib/floatingsearchview/FloatingSearchView$f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->h(Lcom/arlib/floatingsearchview/FloatingSearchView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$20;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->k(Lcom/arlib/floatingsearchview/FloatingSearchView;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method
