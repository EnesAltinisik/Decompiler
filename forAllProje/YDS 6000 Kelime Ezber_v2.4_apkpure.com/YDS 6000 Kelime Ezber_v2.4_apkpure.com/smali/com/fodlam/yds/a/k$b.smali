.class public Lcom/fodlam/yds/a/k$b;
.super Landroid/support/v4/b/l;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fodlam/yds/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lcom/fodlam/yds/a/k$a;

.field b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/b/l;-><init>()V

    return-void
.end method

.method private X()V
    .locals 5

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/a;->f()Lcom/fodlam/yds/f/f;

    move-result-object v1

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v2, v2, Lcom/fodlam/yds/a/k$a;->d:I

    iget-object v3, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v3, v3, Lcom/fodlam/yds/a/k$a;->b:[C

    array-length v3, v3

    div-int/lit8 v3, v3, 0x2

    if-gt v2, v3, :cond_1

    sget-object v2, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v2}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v3, v3, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v3, v3, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v3, v2}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v3, v3, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v3, v3, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v4}, Lcom/fodlam/yds/f/e;->b(Ljava/lang/String;I)V

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v2, v2, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v0, v2}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/e;)I

    :cond_0
    iget v2, v1, Lcom/fodlam/yds/f/f;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/fodlam/yds/f/f;->d:I

    :goto_0
    invoke-virtual {v0, v1}, Lcom/fodlam/yds/c/a;->b(Lcom/fodlam/yds/f/f;)I

    invoke-virtual {p0}, Lcom/fodlam/yds/a/k$b;->i()Landroid/support/v4/b/m;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/WriteWordActivity;

    invoke-virtual {v0}, Lcom/fodlam/yds/WriteWordActivity;->j()V

    return-void

    :cond_1
    iget v2, v1, Lcom/fodlam/yds/f/f;->e:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/fodlam/yds/f/f;->e:I

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    invoke-virtual {p0}, Lcom/fodlam/yds/a/k$b;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "writeWord"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/a/k$a;

    iput-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v0, v0, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-boolean v0, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-eqz v0, :cond_0

    const v0, 0x7f04002b

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x7f10013d

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/fodlam/yds/a/k$b;->h()Landroid/content/Context;

    move-result-object v2

    const/16 v3, 0x190

    const/16 v4, 0x190

    invoke-static {v2, v1, v3, v4}, Lcom/fodlam/yds/utility/c;->a(Landroid/content/Context;Landroid/view/ViewGroup;II)Lcom/google/android/gms/ads/i;

    const v1, 0x7f10013b

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f09003f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x7f04008e

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x7f1001f7

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v3, Lcom/fodlam/yds/OxfordApplication$a;->h:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v2, v2, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    const-string v2, "#BBDEFB"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/balysv/materialripple/a$c;->a(I)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    const v2, 0x3e99999a    # 0.3f

    invoke-virtual {v1, v2}, Lcom/balysv/materialripple/a$c;->a(F)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/balysv/materialripple/a$c;->b(Z)Lcom/balysv/materialripple/a$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/balysv/materialripple/a$c;->a()Lcom/balysv/materialripple/a;

    const v1, 0x7f1001f8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/fodlam/yds/a/k$b;->b:Landroid/widget/TextView;

    const/16 v1, 0xa

    new-array v3, v1, [Landroid/widget/Button;

    const/4 v2, 0x0

    const v1, 0x7f100122

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/4 v2, 0x1

    const v1, 0x7f100126

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/4 v2, 0x2

    const v1, 0x7f1001f9

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/4 v2, 0x3

    const v1, 0x7f1001fa

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/4 v2, 0x4

    const v1, 0x7f1001fb

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/4 v2, 0x5

    const v1, 0x7f1001fc

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/4 v2, 0x6

    const v1, 0x7f1001fd

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/4 v2, 0x7

    const v1, 0x7f1001fe

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/16 v2, 0x8

    const v1, 0x7f1001ff

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    const/16 v2, 0x9

    const v1, 0x7f100200

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v3, v2

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v1, v1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v1, v5, :cond_3

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7a

    if-gt v5, v6, :cond_1

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x61

    if-lt v5, v6, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v2, v2, Lcom/fodlam/yds/f/h;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_3
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    :goto_3
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v5

    const/16 v6, 0xa

    if-ge v5, v6, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/16 v6, 0x1a

    invoke-virtual {v1, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x61

    int-to-char v6, v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Ljava/util/HashSet;->toArray()[Ljava/lang/Object;

    move-result-object v5

    const/4 v1, 0x0

    move v2, v1

    :goto_4
    const/16 v1, 0xa

    if-ge v2, v1, :cond_5

    aget-object v6, v3, v2

    aget-object v1, v5, v2

    check-cast v1, Ljava/lang/String;

    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    aget-object v1, v3, v2

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_4

    :cond_5
    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-boolean v1, v1, Lcom/fodlam/yds/a/k$a;->a:Z

    if-nez v1, :cond_e

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    new-array v2, v2, [C

    iput-object v2, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    const/4 v1, 0x0

    :goto_5
    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->b:[C

    array-length v2, v2

    if-ge v1, v2, :cond_6

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->b:[C

    const/16 v3, 0x5f

    aput-char v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    :goto_6
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_9

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7a

    if-gt v2, v3, :cond_7

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x61

    if-ge v2, v3, :cond_8

    :cond_7
    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->b:[C

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    aput-char v3, v2, v1

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_9
    const/16 v1, 0xa

    move v2, v1

    :goto_7
    array-length v1, v5

    if-ge v2, v1, :cond_c

    const/4 v1, 0x0

    move v3, v1

    :goto_8
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v3, v1, :cond_b

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    aget-object v1, v5, v2

    check-cast v1, Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v6, v1, :cond_a

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v6, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    aget-object v1, v5, v2

    check-cast v1, Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v1

    aput-char v1, v6, v3

    :cond_a
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_8

    :cond_b
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_7

    :cond_c
    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    const/4 v2, 0x0

    iput v2, v1, Lcom/fodlam/yds/a/k$a;->c:I

    const/4 v1, 0x0

    :goto_9
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_d

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->b:[C

    aget-char v2, v2, v1

    const/16 v3, 0x5f

    if-ne v2, v3, :cond_f

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iput v1, v2, Lcom/fodlam/yds/a/k$a;->c:I

    :cond_d
    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/fodlam/yds/a/k$a;->a:Z

    :cond_e
    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->b:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v3, v3, Lcom/fodlam/yds/a/k$a;->b:[C

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v1, v1, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v2}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_10

    const v1, 0x7f1001bb

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    :cond_f
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_10
    const v1, 0x7f1001bb

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v0, v0, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-boolean v0, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v0, v0, Lcom/fodlam/yds/a/k$a;->c:I

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v1, v0, Lcom/fodlam/yds/a/k$a;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/fodlam/yds/a/k$a;->d:I

    invoke-virtual {p0}, Lcom/fodlam/yds/a/k$b;->h()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->d()V

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v0, v0, Lcom/fodlam/yds/a/k$a;->b:[C

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v1, v1, Lcom/fodlam/yds/a/k$a;->c:I

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v2, v2, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    iget-object v3, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v3, v3, Lcom/fodlam/yds/a/k$a;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    aput-char v2, v0, v1

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v1, v0, Lcom/fodlam/yds/a/k$a;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/fodlam/yds/a/k$a;->c:I

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v0, v0, Lcom/fodlam/yds/a/k$a;->c:I

    :goto_1
    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v1, v1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    aget-char v1, v1, v0

    const/16 v2, 0x5f

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iput v0, v1, Lcom/fodlam/yds/a/k$a;->c:I

    :cond_2
    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->b:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->b:[C

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->invalidate()V

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v0, v0, Lcom/fodlam/yds/a/k$a;->c:I

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    array-length v1, v1

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/fodlam/yds/a/k$b;->X()V

    goto/16 :goto_0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/b/l;->a(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/a/k$b;->d(Z)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v0, v0, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-boolean v0, v0, Lcom/fodlam/yds/f/h;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v0, v0, Lcom/fodlam/yds/a/k$a;->c:I

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    array-length v1, v1

    if-ge v0, v1, :cond_0

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    iget-object v1, v1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v2, v2, Lcom/fodlam/yds/a/k$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v0, :cond_4

    invoke-virtual {p0}, Lcom/fodlam/yds/a/k$b;->h()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fodlam/yds/utility/a;->a()V

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v3, v2, Lcom/fodlam/yds/a/k$a;->c:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v2, Lcom/fodlam/yds/a/k$a;->c:I

    aput-char v0, v1, v3

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v0, v0, Lcom/fodlam/yds/a/k$a;->c:I

    :goto_1
    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    array-length v1, v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iput v0, v1, Lcom/fodlam/yds/a/k$a;->c:I

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    aget-char v1, v1, v0

    const/16 v2, 0x5f

    if-ne v1, v2, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->b:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v2, v2, Lcom/fodlam/yds/a/k$a;->b:[C

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v0, v0, Lcom/fodlam/yds/a/k$a;->c:I

    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget-object v1, v1, Lcom/fodlam/yds/a/k$a;->b:[C

    array-length v1, v1

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/fodlam/yds/a/k$b;->X()V

    goto/16 :goto_0

    :cond_3
    iget-object v1, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    iget v2, v1, Lcom/fodlam/yds/a/k$a;->c:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/fodlam/yds/a/k$a;->c:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/fodlam/yds/a/k$b;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->b()V

    goto/16 :goto_0
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Landroid/support/v4/b/l;->s()V

    iput-object v0, p0, Lcom/fodlam/yds/a/k$b;->b:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fodlam/yds/a/k$b;->a:Lcom/fodlam/yds/a/k$a;

    return-void
.end method
