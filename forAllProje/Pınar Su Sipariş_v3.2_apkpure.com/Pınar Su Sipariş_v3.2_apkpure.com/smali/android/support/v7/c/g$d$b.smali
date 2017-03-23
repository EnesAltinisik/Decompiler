.class final Landroid/support/v7/c/g$d$b;
.super Ljava/lang/Object;
.source "MediaRouter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/g$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/c/g$d;

.field private final b:Landroid/support/v4/media/session/MediaSessionCompat;

.field private c:I

.field private d:I

.field private e:Landroid/support/v4/media/d;


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 2329
    iget-object v0, p0, Landroid/support/v7/c/g$d$b;->b:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v1, p0, Landroid/support/v7/c/g$d$b;->a:Landroid/support/v7/c/g$d;

    invoke-static {v1}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/g$d;)Landroid/support/v7/c/m$a;

    move-result-object v1

    iget v1, v1, Landroid/support/v7/c/m$a;->d:I

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->a(I)V

    .line 2330
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/c/g$d$b;->e:Landroid/support/v4/media/d;

    .line 2331
    return-void
.end method

.method public a(III)V
    .locals 2

    .prologue
    .line 2293
    iget-object v0, p0, Landroid/support/v7/c/g$d$b;->e:Landroid/support/v4/media/d;

    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/c/g$d$b;->c:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Landroid/support/v7/c/g$d$b;->d:I

    if-ne p2, v0, :cond_0

    .line 2296
    iget-object v0, p0, Landroid/support/v7/c/g$d$b;->e:Landroid/support/v4/media/d;

    invoke-virtual {v0, p3}, Landroid/support/v4/media/d;->a(I)V

    .line 2326
    :goto_0
    return-void

    .line 2299
    :cond_0
    new-instance v0, Landroid/support/v7/c/g$d$b$1;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/support/v7/c/g$d$b$1;-><init>(Landroid/support/v7/c/g$d$b;III)V

    iput-object v0, p0, Landroid/support/v7/c/g$d$b;->e:Landroid/support/v4/media/d;

    .line 2324
    iget-object v0, p0, Landroid/support/v7/c/g$d$b;->b:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v1, p0, Landroid/support/v7/c/g$d$b;->e:Landroid/support/v4/media/d;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->a(Landroid/support/v4/media/d;)V

    goto :goto_0
.end method

.method public b()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    .prologue
    .line 2334
    iget-object v0, p0, Landroid/support/v7/c/g$d$b;->b:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->a()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    return-object v0
.end method
