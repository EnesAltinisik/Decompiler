.class public final Landroid/support/v4/view/au;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/au$e;,
        Landroid/support/v4/view/au$d;,
        Landroid/support/v4/view/au$b;,
        Landroid/support/v4/view/au$a;,
        Landroid/support/v4/view/au$f;,
        Landroid/support/v4/view/au$c;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/view/au$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/view/au$e;

    invoke-direct {v0}, Landroid/support/v4/view/au$e;-><init>()V

    sput-object v0, Landroid/support/v4/view/au;->a:Landroid/support/v4/view/au$c;

    :goto_0
    return-void

    :cond_0
    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/view/au$d;

    invoke-direct {v0}, Landroid/support/v4/view/au$d;-><init>()V

    sput-object v0, Landroid/support/v4/view/au;->a:Landroid/support/v4/view/au$c;

    goto :goto_0

    :cond_1
    const/16 v1, 0xe

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/view/au$b;

    invoke-direct {v0}, Landroid/support/v4/view/au$b;-><init>()V

    sput-object v0, Landroid/support/v4/view/au;->a:Landroid/support/v4/view/au$c;

    goto :goto_0

    :cond_2
    const/16 v1, 0xb

    if-lt v0, v1, :cond_3

    new-instance v0, Landroid/support/v4/view/au$a;

    invoke-direct {v0}, Landroid/support/v4/view/au$a;-><init>()V

    sput-object v0, Landroid/support/v4/view/au;->a:Landroid/support/v4/view/au$c;

    goto :goto_0

    :cond_3
    new-instance v0, Landroid/support/v4/view/au$f;

    invoke-direct {v0}, Landroid/support/v4/view/au$f;-><init>()V

    sput-object v0, Landroid/support/v4/view/au;->a:Landroid/support/v4/view/au$c;

    goto :goto_0
.end method

.method public static a(Landroid/view/ViewGroup;Z)V
    .locals 1

    sget-object v0, Landroid/support/v4/view/au;->a:Landroid/support/v4/view/au$c;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/au$c;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method
