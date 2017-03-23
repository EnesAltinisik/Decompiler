.class public Lcom/fodlam/yds/a/f;
.super Landroid/support/v7/widget/RecyclerView$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/a/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$a",
        "<",
        "Lcom/fodlam/yds/a/f$a;",
        ">;"
    }
.end annotation


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

.field b:Lcom/fodlam/yds/SearchResultsActivity;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/SearchResultsActivity;)V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$a;-><init>()V

    iput-object p1, p0, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->c()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lcom/fodlam/yds/a/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/a/f;->b()V

    return-void
.end method

.method static synthetic a(Lcom/fodlam/yds/a/f;Lcom/fodlam/yds/f/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fodlam/yds/a/f;->c(Lcom/fodlam/yds/f/h;)V

    return-void
.end method

.method private a(Lcom/fodlam/yds/f/h;)V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/fodlam/yds/c/b;->a(Lcom/fodlam/yds/f/h;Z)V

    iget-object v0, p0, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    const v3, 0x7f090040

    invoke-virtual {v2, v3}, Lcom/fodlam/yds/SearchResultsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/FirebaseCrash;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Lcom/fodlam/yds/f/h;Landroid/widget/ImageButton;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fodlam/yds/f/h;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0200a8

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setAlpha(F)V

    :goto_0
    return-void

    :cond_0
    const v0, 0x7f0200a7

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setAlpha(F)V

    goto :goto_0
.end method

.method private b()V
    .locals 2

    new-instance v0, Lcom/afollestad/materialdialogs/f$a;

    iget-object v1, p0, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    invoke-direct {v0, v1}, Lcom/afollestad/materialdialogs/f$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090042

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f090041

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->c(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f09036a

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->f(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f090308

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->g(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    sget-object v1, Lcom/afollestad/materialdialogs/h;->a:Lcom/afollestad/materialdialogs/h;

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(Lcom/afollestad/materialdialogs/h;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f020078

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->b(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f0e001c

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->i(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, -0xbbbbbc

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->d(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    new-instance v1, Lcom/fodlam/yds/a/f$4;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/a/f$4;-><init>(Lcom/fodlam/yds/a/f;)V

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->b(Lcom/afollestad/materialdialogs/f$j;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/f$a;->c()Lcom/afollestad/materialdialogs/f;

    return-void
.end method

.method static synthetic b(Lcom/fodlam/yds/a/f;Lcom/fodlam/yds/f/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fodlam/yds/a/f;->b(Lcom/fodlam/yds/f/h;)V

    return-void
.end method

.method private b(Lcom/fodlam/yds/f/h;)V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fodlam/yds/c/b;->a(Lcom/fodlam/yds/f/h;)V

    iget-object v0, p0, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    const v3, 0x7f09037d

    invoke-virtual {v2, v3}, Lcom/fodlam/yds/SearchResultsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/FirebaseCrash;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/fodlam/yds/a/f;Lcom/fodlam/yds/f/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fodlam/yds/a/f;->a(Lcom/fodlam/yds/f/h;)V

    return-void
.end method

.method private c(Lcom/fodlam/yds/f/h;)V
    .locals 3

    invoke-virtual {p1}, Lcom/fodlam/yds/f/h;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/afollestad/materialdialogs/f$a;

    iget-object v2, p0, Lcom/fodlam/yds/a/f;->b:Lcom/fodlam/yds/SearchResultsActivity;

    invoke-direct {v1, v2}, Lcom/afollestad/materialdialogs/f$a;-><init>(Landroid/content/Context;)V

    const v2, 0x7f090059

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->a(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/afollestad/materialdialogs/f$a;->b(Ljava/lang/CharSequence;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f09036a

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->f(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    sget-object v1, Lcom/afollestad/materialdialogs/h;->a:Lcom/afollestad/materialdialogs/h;

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(Lcom/afollestad/materialdialogs/h;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f0e001e

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->i(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, -0xbbbbbc

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->d(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/f$a;->c()Lcom/afollestad/materialdialogs/f;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public a(Landroid/view/ViewGroup;I)Lcom/fodlam/yds/a/f$a;
    .locals 3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f040050

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f100192

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/fodlam/yds/a/f$1;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/a/f$1;-><init>(Lcom/fodlam/yds/a/f;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f100194

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/fodlam/yds/a/f$2;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/a/f$2;-><init>(Lcom/fodlam/yds/a/f;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f100193

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/fodlam/yds/a/f$3;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/a/f$3;-><init>(Lcom/fodlam/yds/a/f;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Lcom/fodlam/yds/a/f$a;

    invoke-direct {v1, v0}, Lcom/fodlam/yds/a/f$a;-><init>(Landroid/view/View;)V

    return-object v1
.end method

.method public a(ZLjava/lang/String;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/a/j;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v3, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Lcom/fodlam/yds/a/j;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-direct {v3, v0}, Lcom/fodlam/yds/a/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v3, v0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v3, Lcom/fodlam/yds/a/j;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    invoke-direct {v3, v0}, Lcom/fodlam/yds/a/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v1
.end method

.method public bridge synthetic a(Landroid/support/v7/widget/RecyclerView$w;I)V
    .locals 0

    check-cast p1, Lcom/fodlam/yds/a/f$a;

    invoke-virtual {p0, p1, p2}, Lcom/fodlam/yds/a/f;->a(Lcom/fodlam/yds/a/f$a;I)V

    return-void
.end method

.method public a(Lcom/fodlam/yds/a/f$a;I)V
    .locals 5

    const v4, 0x7f100193

    iget-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v1, p1, Lcom/fodlam/yds/a/f$a;->n:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v1, p1, Lcom/fodlam/yds/a/f$a;->n:Landroid/view/View;

    const v2, 0x7f100194

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v1, p1, Lcom/fodlam/yds/a/f$a;->n:Landroid/view/View;

    const v2, 0x7f100192

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v1, p1, Lcom/fodlam/yds/a/f$a;->n:Landroid/view/View;

    const v2, 0x7f10013b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Lcom/fodlam/yds/a/f$a;->n:Landroid/view/View;

    const v2, 0x7f100191

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lcom/fodlam/yds/f/h;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Lcom/fodlam/yds/a/f$a;->n:Landroid/view/View;

    const v2, 0x7f10017b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, v0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Lcom/fodlam/yds/a/f$a;->n:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    invoke-direct {p0, v0, v1}, Lcom/fodlam/yds/a/f;->a(Lcom/fodlam/yds/f/h;Landroid/widget/ImageButton;)V

    return-void
.end method

.method public b(ZLjava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    iget-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    return v1

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_2
    iget-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    iget-object v0, p0, Lcom/fodlam/yds/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_3
    const/4 v1, -0x1

    goto :goto_1
.end method

.method public synthetic b(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$w;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/fodlam/yds/a/f;->a(Landroid/view/ViewGroup;I)Lcom/fodlam/yds/a/f$a;

    move-result-object v0

    return-object v0
.end method
