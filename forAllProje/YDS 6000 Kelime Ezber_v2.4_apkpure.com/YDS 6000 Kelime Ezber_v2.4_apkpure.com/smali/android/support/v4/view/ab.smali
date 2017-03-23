.class public final Landroid/support/v4/view/ab;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/ab$a;,
        Landroid/support/v4/view/ab$b;,
        Landroid/support/v4/view/ab$c;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/view/ab$c;


# instance fields
.field private b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/support/v4/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/support/v4/view/ab$a;

    invoke-direct {v0}, Landroid/support/v4/view/ab$a;-><init>()V

    sput-object v0, Landroid/support/v4/view/ab;->a:Landroid/support/v4/view/ab$c;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/v4/view/ab$b;

    invoke-direct {v0}, Landroid/support/v4/view/ab$b;-><init>()V

    sput-object v0, Landroid/support/v4/view/ab;->a:Landroid/support/v4/view/ab$c;

    goto :goto_0
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/view/ab;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;I)Landroid/support/v4/view/ab;
    .locals 2

    new-instance v0, Landroid/support/v4/view/ab;

    sget-object v1, Landroid/support/v4/view/ab;->a:Landroid/support/v4/view/ab$c;

    invoke-interface {v1, p0, p1}, Landroid/support/v4/view/ab$c;->a(Landroid/content/Context;I)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/view/ab;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/view/ab;->b:Ljava/lang/Object;

    return-object v0
.end method
