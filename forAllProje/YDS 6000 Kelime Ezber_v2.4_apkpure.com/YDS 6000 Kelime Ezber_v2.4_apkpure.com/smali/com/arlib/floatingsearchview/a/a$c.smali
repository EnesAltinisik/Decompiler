.class public Lcom/arlib/floatingsearchview/a/a$c;
.super Landroid/support/v7/widget/RecyclerView$w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arlib/floatingsearchview/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arlib/floatingsearchview/a/a$c$a;
    }
.end annotation


# instance fields
.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/widget/ImageView;

.field private q:Lcom/arlib/floatingsearchview/a/a$c$a;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/arlib/floatingsearchview/a/a$c$a;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$w;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/arlib/floatingsearchview/a/a$c;->q:Lcom/arlib/floatingsearchview/a/a$c$a;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->body:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/a/a$c;->n:Landroid/widget/TextView;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->left_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/a/a$c;->o:Landroid/widget/ImageView;

    sget v0, Lcom/arlib/floatingsearchview/R$id;->right_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arlib/floatingsearchview/a/a$c;->p:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$c;->p:Landroid/widget/ImageView;

    new-instance v1, Lcom/arlib/floatingsearchview/a/a$c$1;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/a/a$c$1;-><init>(Lcom/arlib/floatingsearchview/a/a$c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$c;->a:Landroid/view/View;

    new-instance v1, Lcom/arlib/floatingsearchview/a/a$c$2;

    invoke-direct {v1, p0}, Lcom/arlib/floatingsearchview/a/a$c$2;-><init>(Lcom/arlib/floatingsearchview/a/a$c;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/a/a$c;)Lcom/arlib/floatingsearchview/a/a$c$a;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$c;->q:Lcom/arlib/floatingsearchview/a/a$c$a;

    return-object v0
.end method
