.class Landroid/support/v7/c/g$d$b$1$1;
.super Ljava/lang/Object;
.source "MediaRouter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/c/g$d$b$1;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroid/support/v7/c/g$d$b$1;


# direct methods
.method constructor <init>(Landroid/support/v7/c/g$d$b$1;I)V
    .locals 0

    .prologue
    .line 2302
    iput-object p1, p0, Landroid/support/v7/c/g$d$b$1$1;->b:Landroid/support/v7/c/g$d$b$1;

    iput p2, p0, Landroid/support/v7/c/g$d$b$1$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 2305
    iget-object v0, p0, Landroid/support/v7/c/g$d$b$1$1;->b:Landroid/support/v7/c/g$d$b$1;

    iget-object v0, v0, Landroid/support/v7/c/g$d$b$1;->a:Landroid/support/v7/c/g$d$b;

    iget-object v0, v0, Landroid/support/v7/c/g$d$b;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/g$f;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2306
    iget-object v0, p0, Landroid/support/v7/c/g$d$b$1$1;->b:Landroid/support/v7/c/g$d$b$1;

    iget-object v0, v0, Landroid/support/v7/c/g$d$b$1;->a:Landroid/support/v7/c/g$d$b;

    iget-object v0, v0, Landroid/support/v7/c/g$d$b;->a:Landroid/support/v7/c/g$d;

    invoke-static {v0}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/g$f;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/c/g$d$b$1$1;->a:I

    invoke-virtual {v0, v1}, Landroid/support/v7/c/g$f;->a(I)V

    .line 2308
    :cond_0
    return-void
.end method
