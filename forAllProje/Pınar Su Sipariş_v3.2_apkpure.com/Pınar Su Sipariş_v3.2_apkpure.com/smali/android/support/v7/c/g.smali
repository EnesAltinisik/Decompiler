.class public final Landroid/support/v7/c/g;
.super Ljava/lang/Object;
.source "MediaRouter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/c/g$1;,
        Landroid/support/v7/c/g$d;,
        Landroid/support/v7/c/g$b;,
        Landroid/support/v7/c/g$c;,
        Landroid/support/v7/c/g$a;,
        Landroid/support/v7/c/g$e;,
        Landroid/support/v7/c/g$f;
    }
.end annotation


# static fields
.field static a:Landroid/support/v7/c/g$d;

.field private static final d:Z


# instance fields
.field final b:Landroid/content/Context;

.field final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/c/g$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 72
    const-string v0, "MediaRouter"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroid/support/v7/c/g;->d:Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    .line 219
    iput-object p1, p0, Landroid/support/v7/c/g;->b:Landroid/content/Context;

    .line 220
    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/support/v7/c/g;
    .locals 2

    .prologue
    .line 240
    if-nez p0, :cond_0

    .line 241
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :cond_0
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 245
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    if-nez v0, :cond_1

    .line 246
    new-instance v0, Landroid/support/v7/c/g$d;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/c/g$d;-><init>(Landroid/content/Context;)V

    sput-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    .line 247
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->a()V

    .line 249
    :cond_1
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0, p0}, Landroid/support/v7/c/g$d;->a(Landroid/content/Context;)Landroid/support/v7/c/g;

    move-result-object v0

    return-object v0
.end method

.method static a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;)Z"
        }
    .end annotation

    .prologue
    .line 754
    if-eq p0, p1, :cond_0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

.method private b(Landroid/support/v7/c/g$a;)I
    .locals 3

    .prologue
    .line 610
    iget-object v0, p0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 611
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 612
    iget-object v0, p0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$b;

    iget-object v0, v0, Landroid/support/v7/c/g$b;->b:Landroid/support/v7/c/g$a;

    if-ne v0, p1, :cond_0

    move v0, v1

    .line 616
    :goto_1
    return v0

    .line 611
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 616
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method static e()V
    .locals 2

    .prologue
    .line 747
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 748
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The media router service must only be accessed on the application\'s main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 751
    :cond_0
    return-void
.end method

.method static synthetic f()Z
    .locals 1

    .prologue
    .line 70
    sget-boolean v0, Landroid/support/v7/c/g;->d:Z

    return v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/c/g$f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 257
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 258
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 396
    if-ltz p1, :cond_0

    const/4 v0, 0x3

    if-le p1, v0, :cond_1

    .line 398
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported reason to unselect route"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 400
    :cond_1
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 402
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {p0}, Landroid/support/v7/c/g;->b()Landroid/support/v7/c/g$f;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/support/v7/c/g$d;->c(Landroid/support/v7/c/g$f;I)V

    .line 403
    return-void
.end method

.method public a(Landroid/support/v7/c/f;Landroid/support/v7/c/g$a;)V
    .locals 1

    .prologue
    .line 450
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v7/c/g;->a(Landroid/support/v7/c/f;Landroid/support/v7/c/g$a;I)V

    .line 451
    return-void
.end method

.method public a(Landroid/support/v7/c/f;Landroid/support/v7/c/g$a;I)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 548
    if-nez p1, :cond_0

    .line 549
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 551
    :cond_0
    if-nez p2, :cond_1

    .line 552
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 554
    :cond_1
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 556
    sget-boolean v0, Landroid/support/v7/c/g;->d:Z

    if-eqz v0, :cond_2

    .line 557
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addCallback: selector="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", callback="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", flags="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 562
    :cond_2
    invoke-direct {p0, p2}, Landroid/support/v7/c/g;->b(Landroid/support/v7/c/g$a;)I

    move-result v0

    .line 563
    if-gez v0, :cond_5

    .line 564
    new-instance v0, Landroid/support/v7/c/g$b;

    invoke-direct {v0, p0, p2}, Landroid/support/v7/c/g$b;-><init>(Landroid/support/v7/c/g;Landroid/support/v7/c/g$a;)V

    .line 565
    iget-object v1, p0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 569
    :goto_0
    const/4 v1, 0x0

    .line 570
    iget v3, v0, Landroid/support/v7/c/g$b;->d:I

    xor-int/lit8 v3, v3, -0x1

    and-int/2addr v3, p3

    if-eqz v3, :cond_3

    .line 571
    iget v1, v0, Landroid/support/v7/c/g$b;->d:I

    or-int/2addr v1, p3

    iput v1, v0, Landroid/support/v7/c/g$b;->d:I

    move v1, v2

    .line 574
    :cond_3
    iget-object v3, v0, Landroid/support/v7/c/g$b;->c:Landroid/support/v7/c/f;

    invoke-virtual {v3, p1}, Landroid/support/v7/c/f;->a(Landroid/support/v7/c/f;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 575
    new-instance v1, Landroid/support/v7/c/f$a;

    iget-object v3, v0, Landroid/support/v7/c/g$b;->c:Landroid/support/v7/c/f;

    invoke-direct {v1, v3}, Landroid/support/v7/c/f$a;-><init>(Landroid/support/v7/c/f;)V

    invoke-virtual {v1, p1}, Landroid/support/v7/c/f$a;->a(Landroid/support/v7/c/f;)Landroid/support/v7/c/f$a;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/c/f$a;->a()Landroid/support/v7/c/f;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/c/g$b;->c:Landroid/support/v7/c/f;

    .line 580
    :goto_1
    if-eqz v2, :cond_4

    .line 581
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->e()V

    .line 583
    :cond_4
    return-void

    .line 567
    :cond_5
    iget-object v1, p0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$b;

    goto :goto_0

    :cond_6
    move v2, v1

    goto :goto_1
.end method

.method public a(Landroid/support/v7/c/g$a;)V
    .locals 3

    .prologue
    .line 593
    if-nez p1, :cond_0

    .line 594
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 596
    :cond_0
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 598
    sget-boolean v0, Landroid/support/v7/c/g;->d:Z

    if-eqz v0, :cond_1

    .line 599
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "removeCallback: callback="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 602
    :cond_1
    invoke-direct {p0, p1}, Landroid/support/v7/c/g;->b(Landroid/support/v7/c/g$a;)I

    move-result v0

    .line 603
    if-ltz v0, :cond_2

    .line 604
    iget-object v1, p0, Landroid/support/v7/c/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 605
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->e()V

    .line 607
    :cond_2
    return-void
.end method

.method public a(Landroid/support/v7/c/g$f;)V
    .locals 3

    .prologue
    .line 371
    if-nez p1, :cond_0

    .line 372
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "route must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 374
    :cond_0
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 376
    sget-boolean v0, Landroid/support/v7/c/g;->d:Z

    if-eqz v0, :cond_1

    .line 377
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "selectRoute: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 379
    :cond_1
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0, p1}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$f;)V

    .line 380
    return-void
.end method

.method public a(Landroid/support/v7/c/f;I)Z
    .locals 2

    .prologue
    .line 428
    if-nez p1, :cond_0

    .line 429
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 431
    :cond_0
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 433
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/f;I)Z

    move-result v0

    return v0
.end method

.method public b()Landroid/support/v7/c/g$f;
    .locals 1

    .prologue
    .line 280
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 281
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->c()Landroid/support/v7/c/g$f;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/support/v7/c/g$f;
    .locals 1

    .prologue
    .line 331
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 332
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->d()Landroid/support/v7/c/g$f;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    .prologue
    .line 739
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->f()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    return-object v0
.end method
