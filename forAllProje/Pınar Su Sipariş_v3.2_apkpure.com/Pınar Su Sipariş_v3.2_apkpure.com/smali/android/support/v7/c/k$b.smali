.class final Landroid/support/v7/c/k$b;
.super Landroid/support/v7/c/c$d;
.source "RegisteredMediaRouteProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/c/k;

.field private final b:Ljava/lang/String;

.field private c:Z

.field private d:I

.field private e:I

.field private f:Landroid/support/v7/c/k$a;

.field private g:I


# direct methods
.method public constructor <init>(Landroid/support/v7/c/k;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 304
    iput-object p1, p0, Landroid/support/v7/c/k$b;->a:Landroid/support/v7/c/k;

    invoke-direct {p0}, Landroid/support/v7/c/c$d;-><init>()V

    .line 298
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/c/k$b;->d:I

    .line 305
    iput-object p2, p0, Landroid/support/v7/c/k$b;->b:Ljava/lang/String;

    .line 306
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Landroid/support/v7/c/k$b;->a:Landroid/support/v7/c/k;

    invoke-static {v0, p0}, Landroid/support/v7/c/k;->a(Landroid/support/v7/c/k;Landroid/support/v7/c/k$b;)V

    .line 335
    return-void
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 352
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/c/k$b;->c:Z

    .line 353
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    iget v1, p0, Landroid/support/v7/c/k$b;->g:I

    invoke-virtual {v0, v1, p1}, Landroid/support/v7/c/k$a;->a(II)V

    .line 356
    :cond_0
    return-void
.end method

.method public a(Landroid/support/v7/c/k$a;)V
    .locals 2

    .prologue
    .line 309
    iput-object p1, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    .line 310
    iget-object v0, p0, Landroid/support/v7/c/k$b;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/support/v7/c/k$a;->a(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Landroid/support/v7/c/k$b;->g:I

    .line 311
    iget-boolean v0, p0, Landroid/support/v7/c/k$b;->c:Z

    if-eqz v0, :cond_1

    .line 312
    iget v0, p0, Landroid/support/v7/c/k$b;->g:I

    invoke-virtual {p1, v0}, Landroid/support/v7/c/k$a;->d(I)V

    .line 313
    iget v0, p0, Landroid/support/v7/c/k$b;->d:I

    if-ltz v0, :cond_0

    .line 314
    iget v0, p0, Landroid/support/v7/c/k$b;->g:I

    iget v1, p0, Landroid/support/v7/c/k$b;->d:I

    invoke-virtual {p1, v0, v1}, Landroid/support/v7/c/k$a;->b(II)V

    .line 315
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/c/k$b;->d:I

    .line 317
    :cond_0
    iget v0, p0, Landroid/support/v7/c/k$b;->e:I

    if-eqz v0, :cond_1

    .line 318
    iget v0, p0, Landroid/support/v7/c/k$b;->g:I

    iget v1, p0, Landroid/support/v7/c/k$b;->e:I

    invoke-virtual {p1, v0, v1}, Landroid/support/v7/c/k$a;->c(II)V

    .line 319
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/c/k$b;->e:I

    .line 322
    :cond_1
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 339
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/c/k$b;->c:Z

    .line 340
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    if-eqz v0, :cond_0

    .line 341
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    iget v1, p0, Landroid/support/v7/c/k$b;->g:I

    invoke-virtual {v0, v1}, Landroid/support/v7/c/k$a;->d(I)V

    .line 343
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    .prologue
    .line 360
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    if-eqz v0, :cond_0

    .line 361
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    iget v1, p0, Landroid/support/v7/c/k$b;->g:I

    invoke-virtual {v0, v1, p1}, Landroid/support/v7/c/k$a;->b(II)V

    .line 366
    :goto_0
    return-void

    .line 363
    :cond_0
    iput p1, p0, Landroid/support/v7/c/k$b;->d:I

    .line 364
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/c/k$b;->e:I

    goto :goto_0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 347
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/c/k$b;->a(I)V

    .line 348
    return-void
.end method

.method public c(I)V
    .locals 2

    .prologue
    .line 370
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    if-eqz v0, :cond_0

    .line 371
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    iget v1, p0, Landroid/support/v7/c/k$b;->g:I

    invoke-virtual {v0, v1, p1}, Landroid/support/v7/c/k$a;->c(II)V

    .line 375
    :goto_0
    return-void

    .line 373
    :cond_0
    iget v0, p0, Landroid/support/v7/c/k$b;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Landroid/support/v7/c/k$b;->e:I

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 325
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    iget v1, p0, Landroid/support/v7/c/k$b;->g:I

    invoke-virtual {v0, v1}, Landroid/support/v7/c/k$a;->c(I)V

    .line 327
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/c/k$b;->f:Landroid/support/v7/c/k$a;

    .line 328
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/c/k$b;->g:I

    .line 330
    :cond_0
    return-void
.end method
