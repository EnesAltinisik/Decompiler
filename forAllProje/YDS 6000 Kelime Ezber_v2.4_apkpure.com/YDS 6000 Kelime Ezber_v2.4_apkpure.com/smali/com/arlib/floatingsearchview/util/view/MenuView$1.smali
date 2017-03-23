.class Lcom/arlib/floatingsearchview/util/view/MenuView$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/util/view/MenuView;->a(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Landroid/support/v7/view/menu/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/util/view/MenuView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/util/view/MenuView;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/MenuView$1;->a:Lcom/arlib/floatingsearchview/util/view/MenuView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v7/view/menu/j;Landroid/support/v7/view/menu/j;)I
    .locals 2

    invoke-virtual {p1}, Landroid/support/v7/view/menu/j;->getOrder()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Landroid/support/v7/view/menu/j;->getOrder()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Landroid/support/v7/view/menu/j;

    check-cast p2, Landroid/support/v7/view/menu/j;

    invoke-virtual {p0, p1, p2}, Lcom/arlib/floatingsearchview/util/view/MenuView$1;->a(Landroid/support/v7/view/menu/j;Landroid/support/v7/view/menu/j;)I

    move-result v0

    return v0
.end method
