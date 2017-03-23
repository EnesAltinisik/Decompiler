.class public Lcom/fodlam/yds/a/b;
.super Landroid/support/v4/view/aa;


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/h;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/view/aa;-><init>()V

    iput-object p1, p0, Lcom/fodlam/yds/a/b;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/a/b;->c:Landroid/view/LayoutInflater;

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->b()Lcom/fodlam/yds/f/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/g;->f()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/a/b;->a:Ljava/util/ArrayList;

    return-void
.end method

.method private a(Lcom/fodlam/yds/OxfordApplication$a;)I
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p1}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, Lcom/fodlam/yds/a/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-boolean v4, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-nez v4, :cond_1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v0, v2}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_0
    div-int/lit8 v0, v1, 0x5

    return v0

    :cond_1
    move v0, v1

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public a(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 7

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fodlam/yds/a/b;->c:Landroid/view/LayoutInflater;

    const v2, 0x7f040048

    invoke-virtual {v0, v2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    invoke-static {}, Lcom/fodlam/yds/OxfordApplication$a;->values()[Lcom/fodlam/yds/OxfordApplication$a;

    move-result-object v0

    aget-object v3, v0, p2

    const v0, 0x7f100139

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const v0, 0x7f10017b

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/fodlam/yds/OxfordApplication$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f10017a

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v3}, Lcom/fodlam/yds/OxfordApplication$a;->b()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v0, 0x3

    new-array v4, v0, [Landroid/widget/ImageView;

    const v0, 0x7f10017c

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v1

    const/4 v5, 0x1

    const v0, 0x7f10017d

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v5

    const/4 v5, 0x2

    const v0, 0x7f10017e

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v5

    invoke-direct {p0, v3}, Lcom/fodlam/yds/a/b;->a(Lcom/fodlam/yds/OxfordApplication$a;)I

    move-result v5

    move v0, v1

    :goto_0
    if-ge v0, v5, :cond_0

    aget-object v1, v4, v0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-object v2
.end method

.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 6

    const/4 v1, 0x0

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/OxfordApplication$a;

    invoke-direct {p0, v0}, Lcom/fodlam/yds/a/b;->a(Lcom/fodlam/yds/OxfordApplication$a;)I

    move-result v2

    const/4 v0, 0x3

    new-array v3, v0, [Landroid/widget/ImageView;

    const v0, 0x7f10017c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v3, v1

    const/4 v4, 0x1

    const v0, 0x7f10017d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v3, v4

    const/4 v4, 0x2

    const v0, 0x7f10017e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v3, v4

    move v0, v1

    :goto_0
    array-length v4, v3

    if-ge v0, v4, :cond_0

    aget-object v4, v3, v0

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setAlpha(F)V

    aget-object v4, v3, v0

    const v5, 0x7f0200a7

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v1, v2, :cond_1

    aget-object v0, v3, v1

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setAlpha(F)V

    aget-object v0, v3, v1

    const v4, 0x7f0200a8

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    invoke-static {}, Lcom/fodlam/yds/OxfordApplication$a;->values()[Lcom/fodlam/yds/OxfordApplication$a;

    move-result-object v0

    array-length v0, v0

    return v0
.end method
