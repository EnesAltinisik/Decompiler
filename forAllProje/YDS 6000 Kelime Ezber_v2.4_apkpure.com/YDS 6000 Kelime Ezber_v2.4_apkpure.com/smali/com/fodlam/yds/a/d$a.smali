.class public Lcom/fodlam/yds/a/d$a;
.super Landroid/support/v4/b/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fodlam/yds/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/b/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    const v5, 0x7f10013b

    const/16 v4, 0x190

    const/4 v6, 0x1

    const/4 v10, 0x4

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/fodlam/yds/a/d$a;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "question"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/d;

    iget-boolean v1, v0, Lcom/fodlam/yds/f/d;->c:Z

    if-eqz v1, :cond_0

    const v0, 0x7f04002b

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x7f10013d

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/fodlam/yds/a/d$a;->i()Landroid/support/v4/b/m;

    move-result-object v2

    invoke-static {v2, v1, v4, v4}, Lcom/fodlam/yds/utility/c;->a(Landroid/content/Context;Landroid/view/ViewGroup;II)Lcom/google/android/gms/ads/i;

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f09003f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-object v0

    :cond_0
    const v1, 0x7f04006e

    invoke-virtual {p1, v1, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v4, Lcom/fodlam/yds/a/d$a$1;

    invoke-direct {v4, p0}, Lcom/fodlam/yds/a/d$a$1;-><init>(Lcom/fodlam/yds/a/d$a;)V

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Lcom/fodlam/yds/f/d;->a()Lcom/fodlam/yds/f/h;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;)Lcom/balysv/materialripple/a$c;

    move-result-object v4

    const-string v5, "#BBDEFB"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/balysv/materialripple/a$c;->a(I)Lcom/balysv/materialripple/a$c;

    move-result-object v4

    const v5, 0x3e99999a    # 0.3f

    invoke-virtual {v4, v5}, Lcom/balysv/materialripple/a$c;->a(F)Lcom/balysv/materialripple/a$c;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/balysv/materialripple/a$c;->b(Z)Lcom/balysv/materialripple/a$c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/balysv/materialripple/a$c;->a()Lcom/balysv/materialripple/a;

    invoke-virtual {v0}, Lcom/fodlam/yds/f/d;->a()Lcom/fodlam/yds/f/h;

    move-result-object v4

    iget-object v4, v4, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    sget-object v5, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v5}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v4

    if-ne v4, v6, :cond_3

    const v4, 0x7f1001bb

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    sget-object v4, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v5, Lcom/fodlam/yds/OxfordApplication$a;->c:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v4, v5, :cond_1

    const v4, 0x7f1001bc

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-virtual {v0}, Lcom/fodlam/yds/f/d;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-array v4, v10, [Landroid/widget/TextView;

    const v2, 0x7f100155

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    aput-object v2, v4, v3

    const v2, 0x7f100157

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    aput-object v2, v4, v6

    const/4 v5, 0x2

    const v2, 0x7f10015a

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    aput-object v2, v4, v5

    const/4 v5, 0x3

    const v2, 0x7f10015c

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    aput-object v2, v4, v5

    move v2, v3

    :goto_2
    if-ge v2, v10, :cond_5

    aget-object v5, v4, v2

    invoke-virtual {v0, v2}, Lcom/fodlam/yds/f/d;->a(I)Lcom/fodlam/yds/f/h;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    aget-object v5, v4, v2

    invoke-virtual {v0, v2}, Lcom/fodlam/yds/f/d;->b(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, v0, Lcom/fodlam/yds/f/d;->e:[Z

    aget-boolean v5, v5, v2

    if-eqz v5, :cond_2

    iget v5, v0, Lcom/fodlam/yds/f/d;->b:I

    if-ne v5, v2, :cond_4

    aget-object v5, v4, v2

    const/16 v6, 0xff

    const/16 v7, 0x7a

    const/16 v8, 0xb2

    const/16 v9, 0x93

    invoke-static {v6, v7, v8, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setBackgroundColor(I)V

    :goto_3
    aget-object v5, v4, v2

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    const v4, 0x7f1001bb

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    :cond_4
    aget-object v5, v4, v2

    const/16 v6, 0xc8

    const/16 v7, 0xf4

    const/16 v8, 0x66

    const/16 v9, 0x97

    invoke-static {v6, v7, v8, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setBackgroundColor(I)V

    goto :goto_3

    :cond_5
    move-object v0, v1

    goto/16 :goto_0
.end method
