.class Landroid/support/design/widget/t;
.super Ljava/lang/Object;
.source "ViewGroupUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/design/widget/t$1;,
        Landroid/support/design/widget/t$c;,
        Landroid/support/design/widget/t$b;,
        Landroid/support/design/widget/t$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/support/design/widget/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 51
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 53
    new-instance v0, Landroid/support/design/widget/t$c;

    invoke-direct {v0, v2}, Landroid/support/design/widget/t$c;-><init>(Landroid/support/design/widget/t$1;)V

    sput-object v0, Landroid/support/design/widget/t;->a:Landroid/support/design/widget/t$a;

    .line 57
    :goto_0
    return-void

    .line 55
    :cond_0
    new-instance v0, Landroid/support/design/widget/t$b;

    invoke-direct {v0, v2}, Landroid/support/design/widget/t$b;-><init>(Landroid/support/design/widget/t$1;)V

    sput-object v0, Landroid/support/design/widget/t;->a:Landroid/support/design/widget/t$a;

    goto :goto_0
.end method

.method static a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 69
    sget-object v0, Landroid/support/design/widget/t;->a:Landroid/support/design/widget/t$a;

    invoke-interface {v0, p0, p1, p2}, Landroid/support/design/widget/t$a;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 70
    return-void
.end method

.method static b(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 81
    invoke-static {p0, p1, p2}, Landroid/support/design/widget/t;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 82
    return-void
.end method
