.class Lcom/arlib/floatingsearchview/util/view/MenuView$14;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/arlib/floatingsearchview/util/view/MenuView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/util/view/MenuView;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/util/view/MenuView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/util/view/MenuView;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$14;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v7/view/menu/j;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/support/v7/view/menu/j;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/view/menu/j;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
