.class public Lorg/b/a/h;
.super Lorg/b/a/a;
.source "SoapObject.java"

# interfaces
.implements Lorg/b/a/e;


# instance fields
.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:Ljava/util/Vector;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 66
    const-string v0, ""

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Lorg/b/a/a;-><init>()V

    .line 55
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    .line 78
    iput-object p1, p0, Lorg/b/a/h;->b:Ljava/lang/String;

    .line 79
    iput-object p2, p0, Lorg/b/a/h;->c:Ljava/lang/String;

    .line 80
    return-void
.end method


# virtual methods
.method public a(Lorg/b/a/g;)Lorg/b/a/h;
    .locals 1

    .prologue
    .line 560
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 561
    return-object p0
.end method

.method public a(Lorg/b/a/h;)Lorg/b/a/h;
    .locals 1

    .prologue
    .line 587
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 588
    return-object p0
.end method

.method public a(ILjava/lang/Object;)V
    .locals 2

    .prologue
    .line 496
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 497
    instance-of v1, v0, Lorg/b/a/g;

    if-eqz v1, :cond_0

    .line 498
    check-cast v0, Lorg/b/a/g;

    invoke-virtual {v0, p2}, Lorg/b/a/g;->b(Ljava/lang/Object;)V

    .line 501
    :cond_0
    return-void
.end method

.method public a(ILjava/util/Hashtable;Lorg/b/a/g;)V
    .locals 0

    .prologue
    .line 423
    invoke-virtual {p0, p1, p3}, Lorg/b/a/h;->a(ILorg/b/a/g;)V

    .line 424
    return-void
.end method

.method public a(ILorg/b/a/g;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 436
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 437
    instance-of v1, v0, Lorg/b/a/g;

    if-eqz v1, :cond_0

    .line 438
    check-cast v0, Lorg/b/a/g;

    .line 439
    iget-object v1, v0, Lorg/b/a/g;->h:Ljava/lang/String;

    iput-object v1, p2, Lorg/b/a/g;->h:Ljava/lang/String;

    .line 440
    iget-object v1, v0, Lorg/b/a/g;->i:Ljava/lang/String;

    iput-object v1, p2, Lorg/b/a/g;->i:Ljava/lang/String;

    .line 441
    iget v1, v0, Lorg/b/a/g;->j:I

    iput v1, p2, Lorg/b/a/g;->j:I

    .line 442
    iget-object v1, v0, Lorg/b/a/g;->l:Ljava/lang/Object;

    iput-object v1, p2, Lorg/b/a/g;->l:Ljava/lang/Object;

    .line 443
    iget-object v1, v0, Lorg/b/a/g;->n:Lorg/b/a/g;

    iput-object v1, p2, Lorg/b/a/g;->n:Lorg/b/a/g;

    .line 444
    iget-object v1, v0, Lorg/b/a/g;->k:Ljava/lang/Object;

    iput-object v1, p2, Lorg/b/a/g;->k:Ljava/lang/Object;

    .line 445
    iget-boolean v0, v0, Lorg/b/a/g;->m:Z

    iput-boolean v0, p2, Lorg/b/a/g;->m:Z

    .line 456
    :goto_0
    return-void

    .line 448
    :cond_0
    iput-object v2, p2, Lorg/b/a/g;->h:Ljava/lang/String;

    .line 449
    iput-object v2, p2, Lorg/b/a/g;->i:Ljava/lang/String;

    .line 450
    iput v3, p2, Lorg/b/a/g;->j:I

    .line 451
    iput-object v2, p2, Lorg/b/a/g;->l:Ljava/lang/Object;

    .line 452
    iput-object v2, p2, Lorg/b/a/g;->n:Lorg/b/a/g;

    .line 453
    iput-object v0, p2, Lorg/b/a/g;->k:Ljava/lang/Object;

    .line 454
    iput-boolean v3, p2, Lorg/b/a/g;->m:Z

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;I)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 118
    invoke-virtual {p0}, Lorg/b/a/h;->a_()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 134
    :cond_0
    :goto_0
    return v1

    .line 121
    :cond_1
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, p2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 122
    instance-of v2, p1, Lorg/b/a/g;

    if-eqz v2, :cond_3

    instance-of v2, v0, Lorg/b/a/g;

    if-eqz v2, :cond_3

    .line 125
    check-cast p1, Lorg/b/a/g;

    .line 126
    check-cast v0, Lorg/b/a/g;

    .line 127
    invoke-virtual {p1}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    .line 129
    :cond_3
    instance-of v2, p1, Lorg/b/a/h;

    if-eqz v2, :cond_0

    instance-of v2, v0, Lorg/b/a/h;

    if-eqz v2, :cond_0

    .line 130
    check-cast p1, Lorg/b/a/h;

    .line 131
    check-cast v0, Lorg/b/a/h;

    .line 132
    invoke-virtual {p1, v0}, Lorg/b/a/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method public a_()I
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method

.method public a_(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 149
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 150
    instance-of v1, v0, Lorg/b/a/g;

    if-eqz v1, :cond_0

    .line 151
    check-cast v0, Lorg/b/a/g;

    invoke-virtual {v0}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v0

    .line 153
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lorg/b/a/h;

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lorg/b/a/h;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;
    .locals 2

    .prologue
    .line 513
    new-instance v1, Lorg/b/a/g;

    invoke-direct {v1}, Lorg/b/a/g;-><init>()V

    .line 514
    iput-object p1, v1, Lorg/b/a/g;->h:Ljava/lang/String;

    .line 515
    if-nez p2, :cond_0

    sget-object v0, Lorg/b/a/g;->a:Ljava/lang/Class;

    :goto_0
    iput-object v0, v1, Lorg/b/a/g;->l:Ljava/lang/Object;

    .line 517
    iput-object p2, v1, Lorg/b/a/g;->k:Ljava/lang/Object;

    .line 518
    invoke-virtual {p0, v1}, Lorg/b/a/h;->a(Lorg/b/a/g;)Lorg/b/a/h;

    move-result-object v0

    return-object v0

    .line 515
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lorg/b/a/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lorg/b/a/h;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 466
    new-instance v3, Lorg/b/a/h;

    iget-object v0, p0, Lorg/b/a/h;->b:Ljava/lang/String;

    iget-object v1, p0, Lorg/b/a/h;->c:Ljava/lang/String;

    invoke-direct {v3, v0, v1}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move v1, v2

    .line 467
    :goto_0
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 468
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 469
    instance-of v4, v0, Lorg/b/a/g;

    if-eqz v4, :cond_1

    .line 470
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/g;

    .line 471
    invoke-virtual {v0}, Lorg/b/a/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/g;

    .line 472
    invoke-virtual {v3, v0}, Lorg/b/a/h;->a(Lorg/b/a/g;)Lorg/b/a/h;

    .line 467
    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 473
    :cond_1
    instance-of v4, v0, Lorg/b/a/h;

    if-eqz v4, :cond_0

    .line 474
    check-cast v0, Lorg/b/a/h;

    invoke-virtual {v0}, Lorg/b/a/h;->d()Lorg/b/a/h;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/b/a/h;->a(Lorg/b/a/h;)Lorg/b/a/h;

    goto :goto_1

    .line 477
    :cond_2
    :goto_2
    invoke-virtual {p0}, Lorg/b/a/h;->a()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 478
    new-instance v0, Lorg/b/a/b;

    invoke-direct {v0}, Lorg/b/a/b;-><init>()V

    .line 479
    invoke-virtual {p0, v2, v0}, Lorg/b/a/h;->a(ILorg/b/a/b;)V

    .line 482
    invoke-virtual {v3, v0}, Lorg/b/a/h;->a(Lorg/b/a/b;)V

    .line 477
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 484
    :cond_3
    return-object v3
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 83
    instance-of v1, p1, Lorg/b/a/h;

    if-nez v1, :cond_1

    .line 107
    :cond_0
    :goto_0
    return v0

    .line 87
    :cond_1
    check-cast p1, Lorg/b/a/h;

    .line 89
    iget-object v1, p0, Lorg/b/a/h;->c:Ljava/lang/String;

    iget-object v2, p1, Lorg/b/a/h;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/b/a/h;->b:Ljava/lang/String;

    iget-object v2, p1, Lorg/b/a/h;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 94
    iget-object v1, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v2

    .line 95
    iget-object v1, p1, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-ne v2, v1, :cond_0

    move v1, v0

    .line 100
    :goto_1
    if-ge v1, v2, :cond_2

    .line 101
    iget-object v3, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    .line 102
    invoke-virtual {p1, v3, v1}, Lorg/b/a/h;->a(Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 100
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 107
    :cond_2
    invoke-virtual {p0, p1}, Lorg/b/a/h;->a(Lorg/b/a/a;)Z

    move-result v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 597
    new-instance v2, Ljava/lang/StringBuffer;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lorg/b/a/h;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 598
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lorg/b/a/h;->a_()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 599
    iget-object v0, p0, Lorg/b/a/h;->d:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 600
    instance-of v3, v0, Lorg/b/a/g;

    if-eqz v3, :cond_0

    .line 601
    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    check-cast v0, Lorg/b/a/g;

    invoke-virtual {v0}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v3, "="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0, v1}, Lorg/b/a/h;->a_(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v3, "; "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 598
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 607
    :cond_0
    check-cast v0, Lorg/b/a/h;

    invoke-virtual {v0}, Lorg/b/a/h;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 610
    :cond_1
    const-string v0, "}"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 611
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
