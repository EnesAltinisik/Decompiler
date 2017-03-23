.class Landroid/support/v7/c/n$a;
.super Landroid/support/v7/c/n;
.source "SystemMediaRouteProvider.java"

# interfaces
.implements Landroid/support/v7/c/h$a;
.implements Landroid/support/v7/c/h$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/c/n$a$a;,
        Landroid/support/v7/c/n$a$c;,
        Landroid/support/v7/c/n$a$b;
    }
.end annotation


# static fields
.field private static final j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/IntentFilter;",
            ">;"
        }
    .end annotation
.end field

.field private static final k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/IntentFilter;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final a:Ljava/lang/Object;

.field protected final b:Ljava/lang/Object;

.field protected final c:Ljava/lang/Object;

.field protected final d:Ljava/lang/Object;

.field protected e:I

.field protected f:Z

.field protected g:Z

.field protected final h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/c/n$a$b;",
            ">;"
        }
    .end annotation
.end field

.field protected final i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/c/n$a$c;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Landroid/support/v7/c/n$e;

.field private m:Landroid/support/v7/c/h$e;

.field private n:Landroid/support/v7/c/h$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 208
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 209
    const-string v1, "android.media.intent.category.LIVE_AUDIO"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 211
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Landroid/support/v7/c/n$a;->j:Ljava/util/ArrayList;

    .line 212
    sget-object v1, Landroid/support/v7/c/n$a;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 218
    const-string v1, "android.media.intent.category.LIVE_VIDEO"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 220
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Landroid/support/v7/c/n$a;->k:Ljava/util/ArrayList;

    .line 221
    sget-object v1, Landroid/support/v7/c/n$a;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/c/n$e;)V
    .locals 3

    .prologue
    .line 249
    invoke-direct {p0, p1}, Landroid/support/v7/c/n;-><init>(Landroid/content/Context;)V

    .line 238
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    .line 242
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/n$a;->i:Ljava/util/ArrayList;

    .line 250
    iput-object p2, p0, Landroid/support/v7/c/n$a;->l:Landroid/support/v7/c/n$e;

    .line 251
    invoke-static {p1}, Landroid/support/v7/c/h;->a(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    .line 252
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->h()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/n$a;->b:Ljava/lang/Object;

    .line 253
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->i()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/n$a;->c:Ljava/lang/Object;

    .line 255
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 256
    iget-object v1, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    sget v2, Landroid/support/v7/d/a$d;->mr_user_route_category_name:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/support/v7/c/h;->a(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/n$a;->d:Ljava/lang/Object;

    .line 259
    invoke-direct {p0}, Landroid/support/v7/c/n$a;->k()V

    .line 260
    return-void
.end method

.method private e(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 319
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->g(Ljava/lang/Object;)Landroid/support/v7/c/n$a$c;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->f(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    .line 321
    invoke-direct {p0, p1}, Landroid/support/v7/c/n$a;->j(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 322
    new-instance v1, Landroid/support/v7/c/n$a$b;

    invoke-direct {v1, p1, v0}, Landroid/support/v7/c/n$a$b;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    invoke-virtual {p0, v1}, Landroid/support/v7/c/n$a;->a(Landroid/support/v7/c/n$a$b;)V

    .line 324
    iget-object v0, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    const/4 v0, 0x1

    .line 327
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v2, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 334
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->j()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    move v0, v4

    .line 335
    :goto_0
    if-eqz v0, :cond_1

    const-string v0, "DEFAULT_ROUTE"

    .line 337
    :goto_1
    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$a;->b(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_2

    .line 343
    :goto_2
    return-object v0

    :cond_0
    move v0, v5

    .line 334
    goto :goto_0

    .line 335
    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "ROUTE_%08x"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move v1, v2

    .line 341
    :goto_3
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "%s_%d"

    new-array v7, v2, [Ljava/lang/Object;

    aput-object v0, v7, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-static {v3, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 342
    invoke-virtual {p0, v3}, Landroid/support/v7/c/n$a;->b(Ljava/lang/String;)I

    move-result v6

    if-gez v6, :cond_3

    move-object v0, v3

    .line 343
    goto :goto_2

    .line 340
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_3
.end method

.method private k()V
    .locals 3

    .prologue
    .line 309
    const/4 v0, 0x0

    .line 310
    iget-object v1, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    invoke-static {v1}, Landroid/support/v7/c/h;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 311
    invoke-direct {p0, v2}, Landroid/support/v7/c/n$a;->e(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 312
    goto :goto_0

    .line 313
    :cond_0
    if-eqz v0, :cond_1

    .line 314
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->f()V

    .line 316
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/support/v7/c/c$d;
    .locals 2

    .prologue
    .line 264
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->b(Ljava/lang/String;)I

    move-result v0

    .line 265
    if-ltz v0, :cond_0

    .line 266
    iget-object v1, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    .line 267
    new-instance v1, Landroid/support/v7/c/n$a$a;

    iget-object v0, v0, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-direct {v1, p0, v0}, Landroid/support/v7/c/n$a$a;-><init>(Landroid/support/v7/c/n$a;Ljava/lang/Object;)V

    move-object v0, v1

    .line 269
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(ILjava/lang/Object;)V
    .locals 2

    .prologue
    .line 391
    iget-object v0, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    const v1, 0x800003

    invoke-static {v0, v1}, Landroid/support/v7/c/h;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    if-eq p2, v0, :cond_1

    .line 414
    :cond_0
    :goto_0
    return-void

    .line 398
    :cond_1
    invoke-virtual {p0, p2}, Landroid/support/v7/c/n$a;->g(Ljava/lang/Object;)Landroid/support/v7/c/n$a$c;

    move-result-object v0

    .line 399
    if-eqz v0, :cond_2

    .line 400
    iget-object v0, v0, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v0}, Landroid/support/v7/c/g$f;->o()V

    goto :goto_0

    .line 404
    :cond_2
    invoke-virtual {p0, p2}, Landroid/support/v7/c/n$a;->f(Ljava/lang/Object;)I

    move-result v0

    .line 405
    if-ltz v0, :cond_0

    .line 406
    iget-object v1, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    .line 407
    iget-object v1, p0, Landroid/support/v7/c/n$a;->l:Landroid/support/v7/c/n$e;

    iget-object v0, v0, Landroid/support/v7/c/n$a$b;->b:Ljava/lang/String;

    invoke-interface {v1, v0}, Landroid/support/v7/c/n$e;->a(Ljava/lang/String;)Landroid/support/v7/c/g$f;

    move-result-object v0

    .line 409
    if-eqz v0, :cond_0

    .line 410
    invoke-virtual {v0}, Landroid/support/v7/c/g$f;->o()V

    goto :goto_0
.end method

.method public a(Landroid/support/v7/c/g$f;)V
    .locals 3

    .prologue
    .line 450
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->q()Landroid/support/v7/c/c;

    move-result-object v0

    if-eq v0, p0, :cond_1

    .line 451
    iget-object v0, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Landroid/support/v7/c/n$a;->d:Ljava/lang/Object;

    invoke-static {v0, v1}, Landroid/support/v7/c/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 453
    new-instance v1, Landroid/support/v7/c/n$a$c;

    invoke-direct {v1, p1, v0}, Landroid/support/v7/c/n$a$c;-><init>(Landroid/support/v7/c/g$f;Ljava/lang/Object;)V

    .line 454
    invoke-static {v0, v1}, Landroid/support/v7/c/h$d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 455
    iget-object v2, p0, Landroid/support/v7/c/n$a;->c:Ljava/lang/Object;

    invoke-static {v0, v2}, Landroid/support/v7/c/h$f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 456
    invoke-virtual {p0, v1}, Landroid/support/v7/c/n$a;->a(Landroid/support/v7/c/n$a$c;)V

    .line 457
    iget-object v2, p0, Landroid/support/v7/c/n$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    iget-object v1, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    invoke-static {v1, v0}, Landroid/support/v7/c/h;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 473
    :cond_0
    :goto_0
    return-void

    .line 463
    :cond_1
    iget-object v0, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    const v1, 0x800003

    invoke-static {v0, v1}, Landroid/support/v7/c/h;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 465
    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$a;->f(Ljava/lang/Object;)I

    move-result v0

    .line 466
    if-ltz v0, :cond_0

    .line 467
    iget-object v1, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    .line 468
    iget-object v0, v0, Landroid/support/v7/c/n$a$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 469
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->o()V

    goto :goto_0
.end method

.method protected a(Landroid/support/v7/c/n$a$b;)V
    .locals 3

    .prologue
    .line 571
    new-instance v0, Landroid/support/v7/c/a$a;

    iget-object v1, p1, Landroid/support/v7/c/n$a$b;->b:Ljava/lang/String;

    iget-object v2, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-virtual {p0, v2}, Landroid/support/v7/c/n$a;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/c/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    invoke-virtual {p0, p1, v0}, Landroid/support/v7/c/n$a;->a(Landroid/support/v7/c/n$a$b;Landroid/support/v7/c/a$a;)V

    .line 574
    invoke-virtual {v0}, Landroid/support/v7/c/a$a;->a()Landroid/support/v7/c/a;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v7/c/n$a$b;->c:Landroid/support/v7/c/a;

    .line 575
    return-void
.end method

.method protected a(Landroid/support/v7/c/n$a$b;Landroid/support/v7/c/a$a;)V
    .locals 2

    .prologue
    .line 588
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/h$d;->a(Ljava/lang/Object;)I

    move-result v0

    .line 590
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 591
    sget-object v1, Landroid/support/v7/c/n$a;->j:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Landroid/support/v7/c/a$a;->a(Ljava/util/Collection;)Landroid/support/v7/c/a$a;

    .line 593
    :cond_0
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 594
    sget-object v0, Landroid/support/v7/c/n$a;->k:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->a(Ljava/util/Collection;)Landroid/support/v7/c/a$a;

    .line 597
    :cond_1
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/h$d;->b(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->a(I)Landroid/support/v7/c/a$a;

    .line 599
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/h$d;->c(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->b(I)Landroid/support/v7/c/a$a;

    .line 601
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/h$d;->d(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->c(I)Landroid/support/v7/c/a$a;

    .line 603
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/h$d;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->d(I)Landroid/support/v7/c/a$a;

    .line 605
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/h$d;->f(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->e(I)Landroid/support/v7/c/a$a;

    .line 607
    return-void
.end method

.method protected a(Landroid/support/v7/c/n$a$c;)V
    .locals 2

    .prologue
    .line 610
    iget-object v0, p1, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v1}, Landroid/support/v7/c/g$f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v7/c/h$f;->a(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 612
    iget-object v0, p1, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v1}, Landroid/support/v7/c/g$f;->g()I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/c/h$f;->a(Ljava/lang/Object;I)V

    .line 614
    iget-object v0, p1, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v1}, Landroid/support/v7/c/g$f;->h()I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/c/h$f;->b(Ljava/lang/Object;I)V

    .line 616
    iget-object v0, p1, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v1}, Landroid/support/v7/c/g$f;->j()I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/c/h$f;->c(Ljava/lang/Object;I)V

    .line 618
    iget-object v0, p1, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v1}, Landroid/support/v7/c/g$f;->k()I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/c/h$f;->d(Ljava/lang/Object;I)V

    .line 620
    iget-object v0, p1, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v1}, Landroid/support/v7/c/g$f;->i()I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/c/h$f;->e(Ljava/lang/Object;I)V

    .line 622
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 303
    invoke-direct {p0, p1}, Landroid/support/v7/c/n$a;->e(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->f()V

    .line 306
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;I)V
    .locals 1

    .prologue
    .line 434
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->g(Ljava/lang/Object;)Landroid/support/v7/c/n$a$c;

    move-result-object v0

    .line 435
    if-eqz v0, :cond_0

    .line 436
    iget-object v0, v0, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/g$f;->a(I)V

    .line 438
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 430
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .prologue
    .line 425
    return-void
.end method

.method protected b(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 544
    iget-object v0, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 545
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 546
    iget-object v0, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    iget-object v0, v0, Landroid/support/v7/c/n$a$b;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 550
    :goto_1
    return v0

    .line 545
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 550
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public b(ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 420
    return-void
.end method

.method public b(Landroid/support/v7/c/b;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 274
    .line 276
    if-eqz p1, :cond_5

    .line 277
    invoke-virtual {p1}, Landroid/support/v7/c/b;->a()Landroid/support/v7/c/f;

    move-result-object v1

    .line 278
    invoke-virtual {v1}, Landroid/support/v7/c/f;->a()Ljava/util/List;

    move-result-object v3

    .line 279
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    move v2, v0

    move v1, v0

    .line 280
    :goto_0
    if-ge v2, v4, :cond_2

    .line 281
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 282
    const-string v5, "android.media.intent.category.LIVE_AUDIO"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 283
    or-int/lit8 v0, v1, 0x1

    .line 280
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 284
    :cond_0
    const-string v5, "android.media.intent.category.LIVE_VIDEO"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 285
    or-int/lit8 v0, v1, 0x2

    goto :goto_1

    .line 287
    :cond_1
    const/high16 v0, 0x800000

    or-int/2addr v0, v1

    goto :goto_1

    .line 290
    :cond_2
    invoke-virtual {p1}, Landroid/support/v7/c/b;->b()Z

    move-result v0

    .line 293
    :goto_2
    iget v2, p0, Landroid/support/v7/c/n$a;->e:I

    if-ne v2, v1, :cond_3

    iget-boolean v2, p0, Landroid/support/v7/c/n$a;->f:Z

    if-eq v2, v0, :cond_4

    .line 294
    :cond_3
    iput v1, p0, Landroid/support/v7/c/n$a;->e:I

    .line 295
    iput-boolean v0, p0, Landroid/support/v7/c/n$a;->f:Z

    .line 296
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->g()V

    .line 297
    invoke-direct {p0}, Landroid/support/v7/c/n$a;->k()V

    .line 299
    :cond_4
    return-void

    :cond_5
    move v1, v0

    goto :goto_2
.end method

.method public b(Landroid/support/v7/c/g$f;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 477
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->q()Landroid/support/v7/c/c;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 478
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->e(Landroid/support/v7/c/g$f;)I

    move-result v0

    .line 479
    if-ltz v0, :cond_0

    .line 480
    iget-object v1, p0, Landroid/support/v7/c/n$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$c;

    .line 481
    iget-object v1, v0, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    invoke-static {v1, v2}, Landroid/support/v7/c/h$d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 482
    iget-object v1, v0, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    invoke-static {v1, v2}, Landroid/support/v7/c/h$f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 483
    iget-object v1, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    iget-object v0, v0, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, Landroid/support/v7/c/h;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 486
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 350
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->g(Ljava/lang/Object;)Landroid/support/v7/c/n$a$c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 351
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->f(Ljava/lang/Object;)I

    move-result v0

    .line 352
    if-ltz v0, :cond_0

    .line 353
    iget-object v1, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 354
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->f()V

    .line 357
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;I)V
    .locals 1

    .prologue
    .line 442
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->g(Ljava/lang/Object;)Landroid/support/v7/c/n$a$c;

    move-result-object v0

    .line 443
    if-eqz v0, :cond_0

    .line 444
    iget-object v0, v0, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v0, p2}, Landroid/support/v7/c/g$f;->b(I)V

    .line 446
    :cond_0
    return-void
.end method

.method public c(Landroid/support/v7/c/g$f;)V
    .locals 2

    .prologue
    .line 490
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->q()Landroid/support/v7/c/c;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 491
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->e(Landroid/support/v7/c/g$f;)I

    move-result v0

    .line 492
    if-ltz v0, :cond_0

    .line 493
    iget-object v1, p0, Landroid/support/v7/c/n$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$c;

    .line 494
    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$a;->a(Landroid/support/v7/c/n$a$c;)V

    .line 497
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 361
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->g(Ljava/lang/Object;)Landroid/support/v7/c/n$a$c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 362
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->f(Ljava/lang/Object;)I

    move-result v0

    .line 363
    if-ltz v0, :cond_0

    .line 364
    iget-object v1, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    .line 365
    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$a;->a(Landroid/support/v7/c/n$a$b;)V

    .line 366
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->f()V

    .line 369
    :cond_0
    return-void
.end method

.method public d(Landroid/support/v7/c/g$f;)V
    .locals 2

    .prologue
    .line 501
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 520
    :cond_0
    :goto_0
    return-void

    .line 507
    :cond_1
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->q()Landroid/support/v7/c/c;

    move-result-object v0

    if-eq v0, p0, :cond_2

    .line 508
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->e(Landroid/support/v7/c/g$f;)I

    move-result v0

    .line 509
    if-ltz v0, :cond_0

    .line 510
    iget-object v1, p0, Landroid/support/v7/c/n$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$c;

    .line 511
    iget-object v0, v0, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$a;->i(Ljava/lang/Object;)V

    goto :goto_0

    .line 514
    :cond_2
    invoke-virtual {p1}, Landroid/support/v7/c/g$f;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$a;->b(Ljava/lang/String;)I

    move-result v0

    .line 515
    if-ltz v0, :cond_0

    .line 516
    iget-object v1, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    .line 517
    iget-object v0, v0, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$a;->i(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public d(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 373
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->g(Ljava/lang/Object;)Landroid/support/v7/c/n$a$c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 374
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$a;->f(Ljava/lang/Object;)I

    move-result v0

    .line 375
    if-ltz v0, :cond_0

    .line 376
    iget-object v1, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    .line 377
    invoke-static {p1}, Landroid/support/v7/c/h$d;->d(Ljava/lang/Object;)I

    move-result v1

    .line 378
    iget-object v2, v0, Landroid/support/v7/c/n$a$b;->c:Landroid/support/v7/c/a;

    invoke-virtual {v2}, Landroid/support/v7/c/a;->k()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 379
    new-instance v2, Landroid/support/v7/c/a$a;

    iget-object v3, v0, Landroid/support/v7/c/n$a$b;->c:Landroid/support/v7/c/a;

    invoke-direct {v2, v3}, Landroid/support/v7/c/a$a;-><init>(Landroid/support/v7/c/a;)V

    invoke-virtual {v2, v1}, Landroid/support/v7/c/a$a;->c(I)Landroid/support/v7/c/a$a;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/c/a$a;->a()Landroid/support/v7/c/a;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/c/n$a$b;->c:Landroid/support/v7/c/a;

    .line 383
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->f()V

    .line 387
    :cond_0
    return-void
.end method

.method protected e(Landroid/support/v7/c/g$f;)I
    .locals 3

    .prologue
    .line 554
    iget-object v0, p0, Landroid/support/v7/c/n$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 555
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 556
    iget-object v0, p0, Landroid/support/v7/c/n$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$c;

    iget-object v0, v0, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    if-ne v0, p1, :cond_0

    move v0, v1

    .line 560
    :goto_1
    return v0

    .line 555
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 560
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method protected f(Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 534
    iget-object v0, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 535
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 536
    iget-object v0, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    iget-object v0, v0, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    if-ne v0, p1, :cond_0

    move v0, v1

    .line 540
    :goto_1
    return v0

    .line 535
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 540
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method protected f()V
    .locals 4

    .prologue
    .line 523
    new-instance v2, Landroid/support/v7/c/d$a;

    invoke-direct {v2}, Landroid/support/v7/c/d$a;-><init>()V

    .line 525
    iget-object v0, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 526
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 527
    iget-object v0, p0, Landroid/support/v7/c/n$a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    iget-object v0, v0, Landroid/support/v7/c/n$a$b;->c:Landroid/support/v7/c/a;

    invoke-virtual {v2, v0}, Landroid/support/v7/c/d$a;->a(Landroid/support/v7/c/a;)Landroid/support/v7/c/d$a;

    .line 526
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 530
    :cond_0
    invoke-virtual {v2}, Landroid/support/v7/c/d$a;->a()Landroid/support/v7/c/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$a;->a(Landroid/support/v7/c/d;)V

    .line 531
    return-void
.end method

.method protected g(Ljava/lang/Object;)Landroid/support/v7/c/n$a$c;
    .locals 2

    .prologue
    .line 564
    invoke-static {p1}, Landroid/support/v7/c/h$d;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 565
    instance-of v1, v0, Landroid/support/v7/c/n$a$c;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v7/c/n$a$c;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected g()V
    .locals 3

    .prologue
    .line 625
    iget-boolean v0, p0, Landroid/support/v7/c/n$a;->g:Z

    if-eqz v0, :cond_0

    .line 626
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/c/n$a;->g:Z

    .line 627
    iget-object v0, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Landroid/support/v7/c/n$a;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Landroid/support/v7/c/h;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 630
    :cond_0
    iget v0, p0, Landroid/support/v7/c/n$a;->e:I

    if-eqz v0, :cond_1

    .line 631
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/c/n$a;->g:Z

    .line 632
    iget-object v0, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    iget v1, p0, Landroid/support/v7/c/n$a;->e:I

    iget-object v2, p0, Landroid/support/v7/c/n$a;->b:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Landroid/support/v7/c/h;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 634
    :cond_1
    return-void
.end method

.method protected h()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 637
    invoke-static {p0}, Landroid/support/v7/c/h;->a(Landroid/support/v7/c/h$a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected h(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 582
    invoke-virtual {p0}, Landroid/support/v7/c/n$a;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/support/v7/c/h$d;->a(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 583
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method protected i()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 641
    invoke-static {p0}, Landroid/support/v7/c/h;->a(Landroid/support/v7/c/h$g;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected i(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 645
    iget-object v0, p0, Landroid/support/v7/c/n$a;->m:Landroid/support/v7/c/h$e;

    if-nez v0, :cond_0

    .line 646
    new-instance v0, Landroid/support/v7/c/h$e;

    invoke-direct {v0}, Landroid/support/v7/c/h$e;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/n$a;->m:Landroid/support/v7/c/h$e;

    .line 648
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/n$a;->m:Landroid/support/v7/c/h$e;

    iget-object v1, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    const v2, 0x800003

    invoke-virtual {v0, v1, v2, p1}, Landroid/support/v7/c/h$e;->a(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 650
    return-void
.end method

.method protected j()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 653
    iget-object v0, p0, Landroid/support/v7/c/n$a;->n:Landroid/support/v7/c/h$c;

    if-nez v0, :cond_0

    .line 654
    new-instance v0, Landroid/support/v7/c/h$c;

    invoke-direct {v0}, Landroid/support/v7/c/h$c;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/n$a;->n:Landroid/support/v7/c/h$c;

    .line 656
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/n$a;->n:Landroid/support/v7/c/h$c;

    iget-object v1, p0, Landroid/support/v7/c/n$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/support/v7/c/h$c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
