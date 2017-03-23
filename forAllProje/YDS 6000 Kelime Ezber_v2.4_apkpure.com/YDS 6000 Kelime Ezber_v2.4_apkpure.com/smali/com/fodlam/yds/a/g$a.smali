.class public Lcom/fodlam/yds/a/g$a;
.super Landroid/support/v4/b/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fodlam/yds/a/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:[Landroid/support/v7/widget/CardView;

.field b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    const/16 v10, 0xc

    const/4 v9, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/fodlam/yds/a/g$a;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "position"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/a/g$a;->b:I

    const v0, 0x7f04004a

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x4

    new-array v4, v1, [Landroid/widget/TableRow;

    const v1, 0x7f100181

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TableRow;

    aput-object v1, v4, v2

    const v1, 0x7f100182

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TableRow;

    aput-object v1, v4, v9

    const/4 v3, 0x2

    const v1, 0x7f100183

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TableRow;

    aput-object v1, v4, v3

    const/4 v3, 0x3

    const v1, 0x7f100184

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TableRow;

    aput-object v1, v4, v3

    invoke-virtual {p0}, Lcom/fodlam/yds/a/g$a;->i()Landroid/support/v4/b/m;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/b/m;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p0}, Lcom/fodlam/yds/a/g$a;->i()Landroid/support/v4/b/m;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/b/m;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v5, v3

    const/high16 v3, 0x42480000    # 50.0f

    mul-float v6, v1, v3

    new-array v1, v10, [Landroid/support/v7/widget/CardView;

    iput-object v1, p0, Lcom/fodlam/yds/a/g$a;->a:[Landroid/support/v7/widget/CardView;

    move v3, v2

    :goto_0
    if-ge v3, v10, :cond_0

    iget v1, p0, Lcom/fodlam/yds/a/g$a;->b:I

    mul-int/lit8 v1, v1, 0xc

    add-int/2addr v1, v3

    sget-object v2, Lcom/fodlam/yds/a/g;->a:Lcom/fodlam/yds/f/b;

    invoke-virtual {v2}, Lcom/fodlam/yds/f/b;->d()I

    move-result v2

    if-lt v1, v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/fodlam/yds/a/g$a;->a()V

    return-object v0

    :cond_1
    const v1, 0x7f040049

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/CardView;

    div-int/lit8 v2, v3, 0x3

    aget-object v2, v4, v2

    invoke-virtual {v2, v1}, Landroid/widget/TableRow;->addView(Landroid/view/View;)V

    const v2, 0x7f10017b

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, ""

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget v8, p0, Lcom/fodlam/yds/a/g$a;->b:I

    mul-int/lit8 v8, v8, 0xc

    add-int/2addr v8, v3

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Landroid/support/v7/widget/CardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    sub-float v7, v5, v6

    const/high16 v8, 0x40400000    # 3.0f

    div-float/2addr v7, v8

    float-to-int v7, v7

    iput v7, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {v1}, Landroid/support/v7/widget/CardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1}, Landroid/support/v7/widget/CardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v7, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, p0, Lcom/fodlam/yds/a/g$a;->a:[Landroid/support/v7/widget/CardView;

    aput-object v1, v2, v3

    const v2, 0x7f10013a

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    const-string v2, "#BBDEFB"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/balysv/materialripple/a$c;->a(I)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    const v2, 0x3ecccccd    # 0.4f

    invoke-virtual {v1, v2}, Lcom/balysv/materialripple/a$c;->a(F)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    invoke-virtual {v1, v9}, Lcom/balysv/materialripple/a$c;->a(Z)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    invoke-virtual {v1, v9}, Lcom/balysv/materialripple/a$c;->b(Z)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/balysv/materialripple/a$c;->a()Lcom/balysv/materialripple/a;

    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto/16 :goto_0
.end method

.method public a()V
    .locals 12

    const v11, 0x7f100180

    const/4 v10, 0x4

    const/4 v9, 0x3

    const/4 v2, 0x0

    new-array v4, v9, [Landroid/widget/ImageView;

    move v3, v2

    :goto_0
    const/16 v0, 0xc

    if-ge v3, v0, :cond_0

    iget v0, p0, Lcom/fodlam/yds/a/g$a;->b:I

    mul-int/lit8 v0, v0, 0xc

    add-int/2addr v0, v3

    sget-object v1, Lcom/fodlam/yds/a/g;->a:Lcom/fodlam/yds/f/b;

    invoke-virtual {v1}, Lcom/fodlam/yds/f/b;->d()I

    move-result v1

    if-lt v0, v1, :cond_1

    :cond_0
    return-void

    :cond_1
    sget-object v0, Lcom/fodlam/yds/a/g;->a:Lcom/fodlam/yds/f/b;

    iget v1, p0, Lcom/fodlam/yds/a/g$a;->b:I

    mul-int/lit8 v1, v1, 0xc

    add-int/2addr v1, v3

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/f/b;->a(I)Lcom/fodlam/yds/f/g;

    move-result-object v5

    sget-object v0, Lcom/fodlam/yds/a/g;->a:Lcom/fodlam/yds/f/b;

    iget v1, p0, Lcom/fodlam/yds/a/g$a;->b:I

    mul-int/lit8 v1, v1, 0xc

    add-int/2addr v1, v3

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/f/b;->a(I)Lcom/fodlam/yds/f/g;

    move-result-object v0

    invoke-virtual {v5}, Lcom/fodlam/yds/f/g;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/fodlam/yds/f/g;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v5, v2}, Lcom/fodlam/yds/f/g;->a(Z)V

    :cond_2
    iget-object v0, p0, Lcom/fodlam/yds/a/g$a;->a:[Landroid/support/v7/widget/CardView;

    aget-object v6, v0, v3

    if-eqz v6, :cond_0

    const v0, 0x7f10017c

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v2

    const/4 v1, 0x1

    const v0, 0x7f10017d

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v1

    const/4 v1, 0x2

    const v0, 0x7f10017e

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v1

    move v0, v2

    :goto_1
    if-ge v0, v9, :cond_3

    aget-object v1, v4, v0

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v6}, Landroid/support/v7/widget/CardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    mul-int/lit8 v7, v7, 0xb

    div-int/lit8 v7, v7, 0x3c

    iput v7, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    aget-object v1, v4, v0

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    aget-object v7, v4, v0

    invoke-virtual {v7}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v7, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lcom/fodlam/yds/f/g;->b()I

    move-result v0

    move v1, v2

    :goto_2
    if-ge v1, v0, :cond_4

    aget-object v7, v4, v1

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setAlpha(F)V

    aget-object v7, v4, v1

    const v8, 0x7f0200a8

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    if-ge v0, v9, :cond_5

    aget-object v1, v4, v0

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setAlpha(F)V

    aget-object v1, v4, v0

    const v7, 0x7f0200a7

    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    const v0, 0x7f10013a

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/fodlam/yds/f/g;->c()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v6, v11}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v6, v11}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/v4/b/l;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/v4/b/l;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public i(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/v4/b/l;->i(Landroid/os/Bundle;)V

    return-void
.end method

.method public s()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/b/l;->s()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/a/g$a;->a:[Landroid/support/v7/widget/CardView;

    return-void
.end method
