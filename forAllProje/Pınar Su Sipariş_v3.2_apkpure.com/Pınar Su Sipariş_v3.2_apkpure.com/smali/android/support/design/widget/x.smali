.class Landroid/support/design/widget/x;
.super Ljava/lang/Object;
.source "ViewUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/design/widget/x$c;,
        Landroid/support/design/widget/x$b;,
        Landroid/support/design/widget/x$a;
    }
.end annotation


# static fields
.field static final a:Landroid/support/design/widget/q$b;

.field private static final b:Landroid/support/design/widget/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 24
    new-instance v0, Landroid/support/design/widget/x$1;

    invoke-direct {v0}, Landroid/support/design/widget/x$1;-><init>()V

    sput-object v0, Landroid/support/design/widget/x;->a:Landroid/support/design/widget/q$b;

    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 57
    new-instance v0, Landroid/support/design/widget/x$c;

    invoke-direct {v0, v2}, Landroid/support/design/widget/x$c;-><init>(Landroid/support/design/widget/x$1;)V

    sput-object v0, Landroid/support/design/widget/x;->b:Landroid/support/design/widget/x$a;

    .line 61
    :goto_0
    return-void

    .line 59
    :cond_0
    new-instance v0, Landroid/support/design/widget/x$b;

    invoke-direct {v0, v2}, Landroid/support/design/widget/x$b;-><init>(Landroid/support/design/widget/x$1;)V

    sput-object v0, Landroid/support/design/widget/x;->b:Landroid/support/design/widget/x$a;

    goto :goto_0
.end method

.method static a()Landroid/support/design/widget/q;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Landroid/support/design/widget/x;->a:Landroid/support/design/widget/q$b;

    invoke-interface {v0}, Landroid/support/design/widget/q$b;->a()Landroid/support/design/widget/q;

    move-result-object v0

    return-object v0
.end method
