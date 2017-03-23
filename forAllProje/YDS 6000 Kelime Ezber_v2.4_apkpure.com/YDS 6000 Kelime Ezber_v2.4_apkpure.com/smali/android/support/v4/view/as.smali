.class public final Landroid/support/v4/view/as;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/as$c;,
        Landroid/support/v4/view/as$b;,
        Landroid/support/v4/view/as$a;,
        Landroid/support/v4/view/as$d;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/view/as$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/view/as$c;

    invoke-direct {v0}, Landroid/support/v4/view/as$c;-><init>()V

    sput-object v0, Landroid/support/v4/view/as;->a:Landroid/support/v4/view/as$d;

    :goto_0
    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/view/as$b;

    invoke-direct {v0}, Landroid/support/v4/view/as$b;-><init>()V

    sput-object v0, Landroid/support/v4/view/as;->a:Landroid/support/v4/view/as$d;

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/support/v4/view/as$a;

    invoke-direct {v0}, Landroid/support/v4/view/as$a;-><init>()V

    sput-object v0, Landroid/support/v4/view/as;->a:Landroid/support/v4/view/as$d;

    goto :goto_0
.end method

.method public static a(Landroid/view/ViewConfiguration;)Z
    .locals 1

    sget-object v0, Landroid/support/v4/view/as;->a:Landroid/support/v4/view/as$d;

    invoke-interface {v0, p0}, Landroid/support/v4/view/as$d;->a(Landroid/view/ViewConfiguration;)Z

    move-result v0

    return v0
.end method
