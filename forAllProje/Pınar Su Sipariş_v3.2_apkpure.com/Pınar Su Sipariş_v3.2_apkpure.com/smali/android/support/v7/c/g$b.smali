.class final Landroid/support/v7/c/g$b;
.super Ljava/lang/Object;
.source "MediaRouter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/support/v7/c/g;

.field public final b:Landroid/support/v7/c/g$a;

.field public c:Landroid/support/v7/c/f;

.field public d:I


# direct methods
.method public constructor <init>(Landroid/support/v7/c/g;Landroid/support/v7/c/g$a;)V
    .locals 1

    .prologue
    .line 1582
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1583
    iput-object p1, p0, Landroid/support/v7/c/g$b;->a:Landroid/support/v7/c/g;

    .line 1584
    iput-object p2, p0, Landroid/support/v7/c/g$b;->b:Landroid/support/v7/c/g$a;

    .line 1585
    sget-object v0, Landroid/support/v7/c/f;->a:Landroid/support/v7/c/f;

    iput-object v0, p0, Landroid/support/v7/c/g$b;->c:Landroid/support/v7/c/f;

    .line 1586
    return-void
.end method


# virtual methods
.method public a(Landroid/support/v7/c/g$f;)Z
    .locals 1

    .prologue
    .line 1589
    iget v0, p0, Landroid/support/v7/c/g$b;->d:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/c/g$b;->c:Landroid/support/v7/c/f;

    invoke-virtual {p1, v0}, Landroid/support/v7/c/g$f;->a(Landroid/support/v7/c/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
