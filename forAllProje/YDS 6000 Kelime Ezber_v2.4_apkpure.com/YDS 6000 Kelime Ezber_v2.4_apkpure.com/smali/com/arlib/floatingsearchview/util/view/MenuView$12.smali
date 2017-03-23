.class Lcom/arlib/floatingsearchview/util/view/MenuView$12;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/util/view/MenuView;->a(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/view/menu/j;

.field final synthetic b:Lcom/arlib/floatingsearchview/util/view/MenuView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/util/view/MenuView;Landroid/support/v7/view/menu/j;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$12;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    iput-object p2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$12;->a:Landroid/support/v7/view/menu/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$12;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Lcom/arlib/floatingsearchview/util/view/MenuView;)Landroid/support/v7/view/menu/h$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$12;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Lcom/arlib/floatingsearchview/util/view/MenuView;)Landroid/support/v7/view/menu/h$a;

    move-result-object v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$12;->b:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/util/view/MenuView;->b(Lcom/arlib/floatingsearchview/util/view/MenuView;)Landroid/support/v7/view/menu/h;

    move-result-object v1

    iget-object v2, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$12;->a:Landroid/support/v7/view/menu/j;

    invoke-interface {v0, v1, v2}, Landroid/support/v7/view/menu/h$a;->a(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)Z

    :cond_0
    return-void
.end method
