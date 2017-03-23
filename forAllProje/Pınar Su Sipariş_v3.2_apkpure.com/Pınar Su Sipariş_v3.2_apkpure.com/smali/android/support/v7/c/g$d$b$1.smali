.class Landroid/support/v7/c/g$d$b$1;
.super Landroid/support/v4/media/d;
.source "MediaRouter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/c/g$d$b;->a(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/c/g$d$b;


# direct methods
.method constructor <init>(Landroid/support/v7/c/g$d$b;III)V
    .locals 0

    .prologue
    .line 2299
    iput-object p1, p0, Landroid/support/v7/c/g$d$b$1;->a:Landroid/support/v7/c/g$d$b;

    invoke-direct {p0, p2, p3, p4}, Landroid/support/v4/media/d;-><init>(III)V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 2

    .prologue
    .line 2302
    iget-object v0, p0, Landroid/support/v7/c/g$d$b$1;->a:Landroid/support/v7/c/g$d$b;

    iget-object v0, v0, Landroid/support/v7/c/g$d$b;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->b(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/g$d$a;

    move-result-object v0

    new-instance v1, Landroid/support/v7/c/g$d$b$1$1;

    invoke-direct {v1, p0, p1}, Landroid/support/v7/c/g$d$b$1$1;-><init>(Landroid/support/v7/c/g$d$b$1;I)V

    invoke-virtual {v0, v1}, Landroid/support/v7/c/g$d$a;->post(Ljava/lang/Runnable;)Z

    .line 2310
    return-void
.end method

.method public c(I)V
    .locals 2

    .prologue
    .line 2314
    iget-object v0, p0, Landroid/support/v7/c/g$d$b$1;->a:Landroid/support/v7/c/g$d$b;

    iget-object v0, v0, Landroid/support/v7/c/g$d$b;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->b(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/g$d$a;

    move-result-object v0

    new-instance v1, Landroid/support/v7/c/g$d$b$1$2;

    invoke-direct {v1, p0, p1}, Landroid/support/v7/c/g$d$b$1$2;-><init>(Landroid/support/v7/c/g$d$b$1;I)V

    invoke-virtual {v0, v1}, Landroid/support/v7/c/g$d$a;->post(Ljava/lang/Runnable;)Z

    .line 2322
    return-void
.end method
