.class Landroid/support/v7/widget/bc$a;
.super Ljava/lang/Object;
.source "ViewInfoStore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field static d:Landroid/support/v4/h/i$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/h/i$a",
            "<",
            "Landroid/support/v7/widget/bc$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:I

.field b:Landroid/support/v7/widget/RecyclerView$e$c;

.field c:Landroid/support/v7/widget/RecyclerView$e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 309
    new-instance v0, Landroid/support/v4/h/i$b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/support/v4/h/i$b;-><init>(I)V

    sput-object v0, Landroid/support/v7/widget/bc$a;->d:Landroid/support/v4/h/i$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    return-void
.end method

.method static a()Landroid/support/v7/widget/bc$a;
    .locals 1

    .prologue
    .line 315
    sget-object v0, Landroid/support/v7/widget/bc$a;->d:Landroid/support/v4/h/i$a;

    invoke-interface {v0}, Landroid/support/v4/h/i$a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bc$a;

    .line 316
    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/widget/bc$a;

    invoke-direct {v0}, Landroid/support/v7/widget/bc$a;-><init>()V

    :cond_0
    return-object v0
.end method

.method static a(Landroid/support/v7/widget/bc$a;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 320
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/bc$a;->a:I

    .line 321
    iput-object v1, p0, Landroid/support/v7/widget/bc$a;->b:Landroid/support/v7/widget/RecyclerView$e$c;

    .line 322
    iput-object v1, p0, Landroid/support/v7/widget/bc$a;->c:Landroid/support/v7/widget/RecyclerView$e$c;

    .line 323
    sget-object v0, Landroid/support/v7/widget/bc$a;->d:Landroid/support/v4/h/i$a;

    invoke-interface {v0, p0}, Landroid/support/v4/h/i$a;->a(Ljava/lang/Object;)Z

    .line 324
    return-void
.end method

.method static b()V
    .locals 1

    .prologue
    .line 328
    :cond_0
    sget-object v0, Landroid/support/v7/widget/bc$a;->d:Landroid/support/v4/h/i$a;

    invoke-interface {v0}, Landroid/support/v4/h/i$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 329
    return-void
.end method
