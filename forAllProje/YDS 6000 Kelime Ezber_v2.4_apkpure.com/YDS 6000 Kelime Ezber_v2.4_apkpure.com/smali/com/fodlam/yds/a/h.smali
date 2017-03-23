.class public Lcom/fodlam/yds/a/h;
.super Landroid/support/v4/view/aa;


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/h;",
            ">;"
        }
    .end annotation
.end field

.field b:Lcom/fodlam/yds/WordLearningActivity;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/WordLearningActivity;Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0}, Landroid/support/v4/view/aa;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/fodlam/yds/a/h;->b:Lcom/fodlam/yds/WordLearningActivity;

    if-nez p2, :cond_1

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->b()Lcom/fodlam/yds/f/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/g;->f()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    new-instance v2, Lcom/fodlam/yds/f/h;

    invoke-direct {v2}, Lcom/fodlam/yds/f/h;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "wordlearninglist"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/fodlam/yds/f/h;)I
    .locals 4

    const/4 v2, 0x0

    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v3, p1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    return v1

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public a(I)Lcom/fodlam/yds/f/h;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    return-object v0
.end method

.method public a(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 6

    const v5, 0x7f10013b

    const/16 v4, 0x190

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v1, p0, Lcom/fodlam/yds/a/h;->b:Lcom/fodlam/yds/WordLearningActivity;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-boolean v2, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-eqz v2, :cond_0

    const v0, 0x7f04002b

    invoke-virtual {v1, v0, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x7f10013d

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/fodlam/yds/a/h;->b:Lcom/fodlam/yds/WordLearningActivity;

    invoke-static {v2, v1, v4, v4}, Lcom/fodlam/yds/utility/c;->a(Landroid/content/Context;Landroid/view/ViewGroup;II)Lcom/google/android/gms/ads/i;

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f09003f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    new-instance v2, Lcom/fodlam/yds/a/h$1;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/a/h$1;-><init>(Lcom/fodlam/yds/a/h;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0

    :cond_0
    const v2, 0x7f04008d

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/fodlam/yds/f/h;

    iget-object v3, v3, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f1001f6

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/fodlam/yds/f/h;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f10017b

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, v0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    const-string v2, "#BBDEFB"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/balysv/materialripple/a$c;->a(I)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    const v2, 0x3e19999a    # 0.15f

    invoke-virtual {v0, v2}, Lcom/balysv/materialripple/a$c;->a(F)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/balysv/materialripple/a$c;->b(Z)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/balysv/materialripple/a$c;->a()Lcom/balysv/materialripple/a;

    move-result-object v0

    new-instance v2, Lcom/fodlam/yds/a/h$2;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/a/h$2;-><init>(Lcom/fodlam/yds/a/h;)V

    invoke-virtual {v0, v2}, Lcom/balysv/materialripple/a;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fodlam/yds/a/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-boolean v3, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-nez v3, :cond_1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    sget-object v3, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v3}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    move v0, v1

    goto :goto_1
.end method
