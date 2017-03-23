.class public Lorg/c/a/a;
.super Ljava/lang/Object;
.source "KXmlParser.java"

# interfaces
.implements Lorg/xmlpull/v1/XmlPullParser;


# instance fields
.field private A:[Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:[I

.field private D:I

.field private E:Z

.field private F:Z

.field private G:Z

.field private a:Ljava/lang/Object;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/Boolean;

.field private d:Z

.field private e:Z

.field private f:Ljava/util/Hashtable;

.field private g:I

.field private h:[Ljava/lang/String;

.field private i:[Ljava/lang/String;

.field private j:[I

.field private k:Ljava/io/Reader;

.field private l:Ljava/lang/String;

.field private m:[C

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:[C

.field private s:I

.field private t:I

.field private u:Z

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Z

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const/16 v0, 0x80

    const/16 v2, 0x10

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-array v1, v2, [Ljava/lang/String;

    iput-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    .line 51
    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/String;

    iput-object v1, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    .line 52
    const/4 v1, 0x4

    new-array v1, v1, [I

    iput-object v1, p0, Lorg/c/a/a;->j:[I

    .line 69
    new-array v1, v0, [C

    iput-object v1, p0, Lorg/c/a/a;->r:[C

    .line 83
    new-array v1, v2, [Ljava/lang/String;

    iput-object v1, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    .line 91
    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, p0, Lorg/c/a/a;->C:[I

    .line 99
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v2

    const-wide/32 v4, 0x100000

    cmp-long v1, v2, v4

    if-ltz v1, :cond_0

    const/16 v0, 0x2000

    :cond_0
    new-array v0, v0, [C

    iput-object v0, p0, Lorg/c/a/a;->m:[C

    .line 101
    return-void
.end method

.method private final a(Z)I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/16 v2, 0x9

    const/16 v4, 0x3f

    const/16 v5, 0x2d

    const/4 v1, 0x1

    const/4 v8, 0x0

    .line 343
    const-string v3, ""

    .line 348
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 349
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    move-result v0

    .line 351
    if-ne v0, v4, :cond_d

    .line 352
    invoke-direct {p0, v8}, Lorg/c/a/a;->c(I)I

    move-result v0

    const/16 v6, 0x78

    if-eq v0, v6, :cond_0

    invoke-direct {p0, v8}, Lorg/c/a/a;->c(I)I

    move-result v0

    const/16 v6, 0x58

    if-ne v0, v6, :cond_c

    :cond_0
    invoke-direct {p0, v1}, Lorg/c/a/a;->c(I)I

    move-result v0

    const/16 v6, 0x6d

    if-eq v0, v6, :cond_1

    invoke-direct {p0, v1}, Lorg/c/a/a;->c(I)I

    move-result v0

    const/16 v6, 0x4d

    if-ne v0, v6, :cond_c

    .line 355
    :cond_1
    if-eqz p1, :cond_2

    .line 356
    invoke-direct {p0, v8}, Lorg/c/a/a;->c(I)I

    move-result v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(I)V

    .line 357
    invoke-direct {p0, v1}, Lorg/c/a/a;->c(I)I

    move-result v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(I)V

    .line 359
    :cond_2
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 360
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 362
    invoke-direct {p0, v8}, Lorg/c/a/a;->c(I)I

    move-result v0

    const/16 v6, 0x6c

    if-eq v0, v6, :cond_3

    invoke-direct {p0, v8}, Lorg/c/a/a;->c(I)I

    move-result v0

    const/16 v6, 0x4c

    if-ne v0, v6, :cond_c

    :cond_3
    invoke-direct {p0, v1}, Lorg/c/a/a;->c(I)I

    move-result v0

    const/16 v6, 0x20

    if-gt v0, v6, :cond_c

    .line 364
    iget v0, p0, Lorg/c/a/a;->p:I

    if-ne v0, v1, :cond_4

    iget v0, p0, Lorg/c/a/a;->q:I

    const/4 v2, 0x4

    if-le v0, v2, :cond_5

    .line 365
    :cond_4
    const-string v0, "PI must not start with xml"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 367
    :cond_5
    invoke-direct {p0, v1}, Lorg/c/a/a;->c(Z)V

    .line 369
    iget v0, p0, Lorg/c/a/a;->z:I

    if-lt v0, v1, :cond_6

    const-string v0, "version"

    iget-object v2, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 370
    :cond_6
    const-string v0, "version expected"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 372
    :cond_7
    iget-object v0, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v0, v0, v2

    iput-object v0, p0, Lorg/c/a/a;->b:Ljava/lang/String;

    .line 376
    iget v0, p0, Lorg/c/a/a;->z:I

    if-ge v1, v0, :cond_19

    const-string v0, "encoding"

    iget-object v2, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 378
    iget-object v0, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    iput-object v0, p0, Lorg/c/a/a;->l:Ljava/lang/String;

    .line 379
    const/4 v0, 0x2

    .line 382
    :goto_0
    iget v2, p0, Lorg/c/a/a;->z:I

    if-ge v0, v2, :cond_8

    const-string v2, "standalone"

    iget-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    mul-int/lit8 v4, v0, 0x4

    add-int/lit8 v4, v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 384
    iget-object v2, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    mul-int/lit8 v3, v0, 0x4

    add-int/lit8 v3, v3, 0x3

    aget-object v2, v2, v3

    .line 385
    const-string v3, "yes"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 386
    new-instance v2, Ljava/lang/Boolean;

    invoke-direct {v2, v1}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v2, p0, Lorg/c/a/a;->c:Ljava/lang/Boolean;

    .line 391
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 394
    :cond_8
    iget v2, p0, Lorg/c/a/a;->z:I

    if-eq v0, v2, :cond_9

    .line 395
    const-string v0, "illegal xmldecl"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 397
    :cond_9
    iput-boolean v1, p0, Lorg/c/a/a;->u:Z

    .line 398
    iput v8, p0, Lorg/c/a/a;->s:I

    .line 400
    const/16 v2, 0x3e6

    .line 468
    :goto_2
    return v2

    .line 387
    :cond_a
    const-string v3, "no"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 388
    new-instance v2, Ljava/lang/Boolean;

    invoke-direct {v2, v8}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v2, p0, Lorg/c/a/a;->c:Ljava/lang/Boolean;

    goto :goto_1

    .line 390
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "illegal standalone value: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 409
    :cond_c
    const/16 v0, 0x8

    move-object v6, v3

    move v3, v4

    :goto_3
    move v7, v8

    .line 434
    :goto_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v7, v9, :cond_11

    .line 435
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-direct {p0, v9}, Lorg/c/a/a;->a(C)V

    .line 434
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 411
    :cond_d
    const/16 v3, 0x21

    if-ne v0, v3, :cond_10

    .line 412
    invoke-direct {p0, v8}, Lorg/c/a/a;->c(I)I

    move-result v0

    if-ne v0, v5, :cond_e

    .line 414
    const-string v0, "--"

    move v3, v5

    move-object v6, v0

    move v0, v2

    .line 415
    goto :goto_3

    .line 417
    :cond_e
    invoke-direct {p0, v8}, Lorg/c/a/a;->c(I)I

    move-result v0

    const/16 v3, 0x5b

    if-ne v0, v3, :cond_f

    .line 418
    const/4 v0, 0x5

    .line 419
    const-string v6, "[CDATA["

    .line 420
    const/16 v3, 0x5d

    move p1, v1

    .line 421
    goto :goto_3

    .line 424
    :cond_f
    const/16 v0, 0xa

    .line 425
    const-string v6, "DOCTYPE"

    .line 426
    const/4 v3, -0x1

    goto :goto_3

    .line 430
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "illegal: <"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 437
    :cond_11
    const/16 v6, 0xa

    if-ne v0, v6, :cond_18

    .line 438
    invoke-direct {p0, p1}, Lorg/c/a/a;->b(Z)V

    :cond_12
    :goto_5
    move v2, v0

    .line 468
    goto/16 :goto_2

    :cond_13
    move v6, v7

    .line 441
    :goto_6
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    move-result v7

    .line 442
    const/4 v9, -0x1

    if-ne v7, v9, :cond_14

    .line 443
    const-string v0, "Unexpected EOF"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 447
    :cond_14
    if-eqz p1, :cond_15

    .line 448
    invoke-direct {p0, v7}, Lorg/c/a/a;->b(I)V

    .line 450
    :cond_15
    if-eq v3, v4, :cond_16

    if-ne v7, v3, :cond_13

    :cond_16
    invoke-direct {p0, v8}, Lorg/c/a/a;->c(I)I

    move-result v9

    if-ne v9, v3, :cond_13

    invoke-direct {p0, v1}, Lorg/c/a/a;->c(I)I

    move-result v9

    const/16 v10, 0x3e

    if-ne v9, v10, :cond_13

    .line 458
    if-ne v3, v5, :cond_17

    if-ne v6, v5, :cond_17

    iget-boolean v1, p0, Lorg/c/a/a;->e:Z

    if-nez v1, :cond_17

    .line 459
    const-string v1, "illegal comment delimiter: --->"

    invoke-direct {p0, v1}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 461
    :cond_17
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 462
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 464
    if-eqz p1, :cond_12

    if-eq v3, v4, :cond_12

    .line 465
    iget v1, p0, Lorg/c/a/a;->s:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/c/a/a;->s:I

    goto :goto_5

    :cond_18
    move v6, v8

    goto :goto_6

    :cond_19
    move v0, v1

    goto/16 :goto_0
.end method

.method private final a(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 577
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lorg/c/a/a;->r:[C

    iget v2, p0, Lorg/c/a/a;->s:I

    sub-int/2addr v2, p1

    invoke-direct {v0, v1, p1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method private final a(C)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 840
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    move-result v0

    .line 841
    if-eq v0, p1, :cond_0

    .line 842
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expected: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' actual: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-char v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 843
    :cond_0
    return-void
.end method

.method private final a(IZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/16 v7, 0x5d

    const/16 v6, 0x3e

    const/4 v5, 0x2

    const/16 v4, 0x20

    const/4 v1, 0x0

    .line 804
    invoke-direct {p0, v1}, Lorg/c/a/a;->c(I)I

    move-result v0

    move v2, v0

    move v0, v1

    .line 807
    :goto_0
    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    if-eq v2, p1, :cond_0

    .line 809
    if-ne p1, v4, :cond_1

    .line 810
    if-le v2, v4, :cond_0

    if-ne v2, v6, :cond_1

    .line 836
    :cond_0
    return-void

    .line 813
    :cond_1
    const/16 v3, 0x26

    if-ne v2, v3, :cond_3

    .line 814
    if-eqz p2, :cond_0

    .line 817
    invoke-direct {p0}, Lorg/c/a/a;->e()V

    .line 826
    :goto_1
    if-ne v2, v6, :cond_2

    if-lt v0, v5, :cond_2

    if-eq p1, v7, :cond_2

    .line 827
    const-string v3, "Illegal: ]]>"

    invoke-direct {p0, v3}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 829
    :cond_2
    if-ne v2, v7, :cond_5

    .line 830
    add-int/lit8 v0, v0, 0x1

    .line 834
    :goto_2
    invoke-direct {p0, v1}, Lorg/c/a/a;->c(I)I

    move-result v2

    goto :goto_0

    .line 819
    :cond_3
    const/16 v3, 0xa

    if-ne v2, v3, :cond_4

    iget v3, p0, Lorg/c/a/a;->t:I

    if-ne v3, v5, :cond_4

    .line 820
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 821
    invoke-direct {p0, v4}, Lorg/c/a/a;->b(I)V

    goto :goto_1

    .line 824
    :cond_4
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    move-result v3

    invoke-direct {p0, v3}, Lorg/c/a/a;->b(I)V

    goto :goto_1

    :cond_5
    move v0, v1

    .line 832
    goto :goto_2
.end method

.method private final a(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 233
    iget-boolean v0, p0, Lorg/c/a/a;->e:Z

    if-eqz v0, :cond_1

    .line 234
    iget-object v0, p0, Lorg/c/a/a;->B:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ERR: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/c/a/a;->B:Ljava/lang/String;

    .line 239
    :cond_0
    :goto_0
    return-void

    .line 238
    :cond_1
    invoke-direct {p0, p1}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private final a()Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/16 v9, 0x3a

    const/4 v8, -0x1

    const/4 v1, 0x0

    .line 114
    move v0, v1

    move v2, v1

    .line 116
    :goto_0
    iget v3, p0, Lorg/c/a/a;->z:I

    shl-int/lit8 v3, v3, 0x2

    if-ge v0, v3, :cond_4

    .line 119
    iget-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x2

    aget-object v4, v3, v4

    .line 120
    invoke-virtual {v4, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    .line 123
    if-eq v5, v8, :cond_1

    .line 124
    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 125
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 134
    :goto_1
    const-string v5, "xmlns"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 135
    const/4 v2, 0x1

    .line 116
    :cond_0
    :goto_2
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    .line 127
    :cond_1
    const-string v3, "xmlns"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 129
    const/4 v3, 0x0

    move-object v10, v4

    move-object v4, v3

    move-object v3, v10

    goto :goto_1

    .line 138
    :cond_2
    iget-object v3, p0, Lorg/c/a/a;->j:[I

    iget v5, p0, Lorg/c/a/a;->g:I

    aget v6, v3, v5

    add-int/lit8 v7, v6, 0x1

    aput v7, v3, v5

    shl-int/lit8 v3, v6, 0x1

    .line 140
    iget-object v5, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    add-int/lit8 v6, v3, 0x2

    invoke-direct {p0, v5, v6}, Lorg/c/a/a;->a([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    .line 141
    iget-object v5, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    aput-object v4, v5, v3

    .line 142
    iget-object v5, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    iget-object v6, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v7, v0, 0x3

    aget-object v6, v6, v7

    aput-object v6, v5, v3

    .line 144
    if-eqz v4, :cond_3

    iget-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x3

    aget-object v3, v3, v4

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 145
    const-string v3, "illegal empty namespace"

    invoke-direct {p0, v3}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 151
    :cond_3
    iget-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x4

    iget-object v5, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    iget v6, p0, Lorg/c/a/a;->z:I

    add-int/lit8 v6, v6, -0x1

    iput v6, p0, Lorg/c/a/a;->z:I

    shl-int/lit8 v6, v6, 0x2

    sub-int/2addr v6, v0

    invoke-static {v3, v4, v5, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    add-int/lit8 v0, v0, -0x4

    goto :goto_2

    .line 162
    :cond_4
    if-eqz v2, :cond_8

    .line 163
    iget v0, p0, Lorg/c/a/a;->z:I

    shl-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0x4

    :goto_3
    if-ltz v0, :cond_8

    .line 165
    iget-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x2

    aget-object v3, v3, v4

    .line 166
    invoke-virtual {v3, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    .line 168
    if-nez v4, :cond_5

    iget-boolean v5, p0, Lorg/c/a/a;->e:Z

    if-nez v5, :cond_5

    .line 169
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "illegal attribute name: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 172
    :cond_5
    if-eq v4, v8, :cond_7

    .line 173
    invoke-virtual {v3, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 175
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 177
    invoke-virtual {p0, v5}, Lorg/c/a/a;->getNamespace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 179
    if-nez v4, :cond_6

    iget-boolean v6, p0, Lorg/c/a/a;->e:Z

    if-nez v6, :cond_6

    .line 180
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Undefined Prefix: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_6
    iget-object v6, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    aput-object v4, v6, v0

    .line 184
    iget-object v4, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v6, v0, 0x1

    aput-object v5, v4, v6

    .line 185
    iget-object v4, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v5, v0, 0x2

    aput-object v3, v4, v5

    .line 163
    :cond_7
    add-int/lit8 v0, v0, -0x4

    goto :goto_3

    .line 203
    :cond_8
    iget-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 205
    if-nez v0, :cond_9

    .line 206
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "illegal tag name: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 208
    :cond_9
    if-eq v0, v8, :cond_a

    .line 209
    iget-object v3, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    .line 210
    iget-object v1, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    .line 213
    :cond_a
    iget-object v0, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lorg/c/a/a;->getNamespace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    .line 215
    iget-object v0, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    if-nez v0, :cond_c

    .line 216
    iget-object v0, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "undefined prefix: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 218
    :cond_b
    const-string v0, ""

    iput-object v0, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    .line 221
    :cond_c
    return v2
.end method

.method private final a(Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 1

    .prologue
    .line 104
    const-string v0, "http://xmlpull.org/v1/doc/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    const/4 v0, 0x0

    .line 109
    :goto_0
    return v0

    .line 106
    :cond_0
    if-eqz p2, :cond_1

    .line 107
    const/16 v0, 0x2a

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 109
    :cond_1
    const/16 v0, 0x28

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private final a([Ljava/lang/String;I)[Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 225
    array-length v0, p1

    if-lt v0, p2, :cond_0

    .line 229
    :goto_0
    return-object p1

    .line 227
    :cond_0
    add-int/lit8 v0, p2, 0x10

    new-array v0, v0, [Ljava/lang/String;

    .line 228
    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v0

    .line 229
    goto :goto_0
.end method

.method private final b()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x0

    const/4 v0, 0x0

    .line 254
    iget-object v1, p0, Lorg/c/a/a;->k:Ljava/io/Reader;

    if-nez v1, :cond_0

    .line 255
    const-string v1, "No Input specified"

    invoke-direct {p0, v1}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    .line 257
    :cond_0
    iget v1, p0, Lorg/c/a/a;->t:I

    if-ne v1, v4, :cond_1

    .line 258
    iget v1, p0, Lorg/c/a/a;->g:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/c/a/a;->g:I

    .line 261
    :cond_1
    const/4 v1, -0x1

    iput v1, p0, Lorg/c/a/a;->z:I

    .line 266
    iget-boolean v1, p0, Lorg/c/a/a;->y:Z

    if-eqz v1, :cond_3

    .line 267
    iput-boolean v0, p0, Lorg/c/a/a;->y:Z

    .line 268
    iput v4, p0, Lorg/c/a/a;->t:I

    .line 335
    :cond_2
    :goto_0
    :pswitch_0
    return-void

    .line 273
    :cond_3
    iget-object v1, p0, Lorg/c/a/a;->B:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 274
    :goto_1
    iget-object v1, p0, Lorg/c/a/a;->B:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 275
    iget-object v1, p0, Lorg/c/a/a;->B:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lorg/c/a/a;->b(I)V

    .line 274
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 277
    :cond_4
    iput-object v3, p0, Lorg/c/a/a;->B:Ljava/lang/String;

    .line 278
    const/16 v0, 0x9

    iput v0, p0, Lorg/c/a/a;->t:I

    goto :goto_0

    .line 297
    :cond_5
    iput-object v3, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    .line 298
    iput-object v3, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    .line 299
    iput-object v3, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    .line 302
    invoke-direct {p0}, Lorg/c/a/a;->d()I

    move-result v1

    iput v1, p0, Lorg/c/a/a;->t:I

    .line 304
    iget v1, p0, Lorg/c/a/a;->t:I

    packed-switch v1, :pswitch_data_0

    .line 333
    :pswitch_1
    iget-boolean v1, p0, Lorg/c/a/a;->G:Z

    invoke-direct {p0, v1}, Lorg/c/a/a;->a(Z)I

    move-result v1

    iput v1, p0, Lorg/c/a/a;->t:I

    .line 334
    iget v1, p0, Lorg/c/a/a;->t:I

    const/16 v2, 0x3e6

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 307
    :pswitch_2
    invoke-direct {p0}, Lorg/c/a/a;->e()V

    goto :goto_0

    .line 311
    :pswitch_3
    invoke-direct {p0, v0}, Lorg/c/a/a;->c(Z)V

    goto :goto_0

    .line 315
    :pswitch_4
    invoke-direct {p0}, Lorg/c/a/a;->c()V

    goto :goto_0

    .line 322
    :pswitch_5
    const/16 v1, 0x3c

    iget-boolean v2, p0, Lorg/c/a/a;->G:Z

    if-nez v2, :cond_6

    const/4 v0, 0x1

    :cond_6
    invoke-direct {p0, v1, v0}, Lorg/c/a/a;->a(IZ)V

    .line 323
    iget v0, p0, Lorg/c/a/a;->g:I

    if-nez v0, :cond_2

    .line 324
    iget-boolean v0, p0, Lorg/c/a/a;->u:Z

    if-eqz v0, :cond_2

    .line 325
    const/4 v0, 0x7

    iput v0, p0, Lorg/c/a/a;->t:I

    goto :goto_0

    .line 304
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private final b(I)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 590
    iget-boolean v2, p0, Lorg/c/a/a;->u:Z

    const/16 v0, 0x20

    if-gt p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    and-int/2addr v0, v2

    iput-boolean v0, p0, Lorg/c/a/a;->u:Z

    .line 592
    iget v0, p0, Lorg/c/a/a;->s:I

    iget-object v2, p0, Lorg/c/a/a;->r:[C

    array-length v2, v2

    if-ne v0, v2, :cond_0

    .line 593
    iget v0, p0, Lorg/c/a/a;->s:I

    mul-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, 0x4

    new-array v0, v0, [C

    .line 594
    iget-object v2, p0, Lorg/c/a/a;->r:[C

    iget v3, p0, Lorg/c/a/a;->s:I

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 595
    iput-object v0, p0, Lorg/c/a/a;->r:[C

    .line 598
    :cond_0
    iget-object v0, p0, Lorg/c/a/a;->r:[C

    iget v1, p0, Lorg/c/a/a;->s:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/c/a/a;->s:I

    int-to-char v2, p1

    aput-char v2, v0, v1

    .line 599
    return-void

    :cond_1
    move v0, v1

    .line 590
    goto :goto_0
.end method

.method private final b(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/16 v3, 0x64

    .line 242
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v1, v3, :cond_0

    :goto_0
    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private final b(Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 476
    move v0, v1

    move v2, v3

    .line 482
    :cond_0
    :goto_0
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    move-result v4

    .line 483
    sparse-switch v4, :sswitch_data_0

    .line 505
    :cond_1
    :goto_1
    if-eqz p1, :cond_0

    .line 506
    invoke-direct {p0, v4}, Lorg/c/a/a;->b(I)V

    goto :goto_0

    .line 486
    :sswitch_0
    const-string v0, "Unexpected EOF"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 501
    :goto_2
    return-void

    .line 490
    :sswitch_1
    if-nez v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_1

    .line 494
    :sswitch_2
    if-nez v0, :cond_1

    .line 495
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 499
    :sswitch_3
    if-nez v0, :cond_1

    .line 500
    add-int/lit8 v2, v2, -0x1

    if-nez v2, :cond_1

    goto :goto_2

    .line 483
    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x27 -> :sswitch_1
        0x3c -> :sswitch_2
        0x3e -> :sswitch_3
    .end sparse-switch
.end method

.method private final c(I)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v6, 0xa

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 875
    :goto_0
    iget v0, p0, Lorg/c/a/a;->D:I

    if-lt p1, v0, :cond_6

    .line 879
    iget-object v0, p0, Lorg/c/a/a;->m:[C

    array-length v0, v0

    if-gt v0, v5, :cond_0

    .line 880
    iget-object v0, p0, Lorg/c/a/a;->k:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->read()I

    move-result v0

    .line 893
    :goto_1
    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    .line 894
    iput-boolean v5, p0, Lorg/c/a/a;->E:Z

    .line 895
    iget-object v0, p0, Lorg/c/a/a;->C:[I

    iget v1, p0, Lorg/c/a/a;->D:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/c/a/a;->D:I

    aput v6, v0, v1

    goto :goto_0

    .line 881
    :cond_0
    iget v0, p0, Lorg/c/a/a;->n:I

    iget v1, p0, Lorg/c/a/a;->o:I

    if-ge v0, v1, :cond_1

    .line 882
    iget-object v0, p0, Lorg/c/a/a;->m:[C

    iget v1, p0, Lorg/c/a/a;->n:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/c/a/a;->n:I

    aget-char v0, v0, v1

    goto :goto_1

    .line 884
    :cond_1
    iget-object v0, p0, Lorg/c/a/a;->k:Ljava/io/Reader;

    iget-object v1, p0, Lorg/c/a/a;->m:[C

    iget-object v2, p0, Lorg/c/a/a;->m:[C

    array-length v2, v2

    invoke-virtual {v0, v1, v4, v2}, Ljava/io/Reader;->read([CII)I

    move-result v0

    iput v0, p0, Lorg/c/a/a;->o:I

    .line 885
    iget v0, p0, Lorg/c/a/a;->o:I

    if-gtz v0, :cond_2

    .line 886
    const/4 v0, -0x1

    .line 890
    :goto_2
    iput v5, p0, Lorg/c/a/a;->n:I

    goto :goto_1

    .line 888
    :cond_2
    iget-object v0, p0, Lorg/c/a/a;->m:[C

    aget-char v0, v0, v4

    goto :goto_2

    .line 898
    :cond_3
    if-ne v0, v6, :cond_5

    .line 899
    iget-boolean v0, p0, Lorg/c/a/a;->E:Z

    if-nez v0, :cond_4

    .line 900
    iget-object v0, p0, Lorg/c/a/a;->C:[I

    iget v1, p0, Lorg/c/a/a;->D:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/c/a/a;->D:I

    aput v6, v0, v1

    .line 905
    :cond_4
    :goto_3
    iput-boolean v4, p0, Lorg/c/a/a;->E:Z

    goto :goto_0

    .line 903
    :cond_5
    iget-object v1, p0, Lorg/c/a/a;->C:[I

    iget v2, p0, Lorg/c/a/a;->D:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/c/a/a;->D:I

    aput v0, v1, v2

    goto :goto_3

    .line 909
    :cond_6
    iget-object v0, p0, Lorg/c/a/a;->C:[I

    aget v0, v0, p1

    return v0
.end method

.method private final c()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 515
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 516
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 517
    invoke-direct {p0}, Lorg/c/a/a;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    .line 518
    invoke-direct {p0}, Lorg/c/a/a;->h()V

    .line 519
    const/16 v0, 0x3e

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(C)V

    .line 521
    iget v0, p0, Lorg/c/a/a;->g:I

    add-int/lit8 v0, v0, -0x1

    shl-int/lit8 v0, v0, 0x2

    .line 523
    iget v1, p0, Lorg/c/a/a;->g:I

    if-nez v1, :cond_1

    .line 524
    const-string v0, "element stack empty"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 525
    const/16 v0, 0x9

    iput v0, p0, Lorg/c/a/a;->t:I

    .line 553
    :cond_0
    :goto_0
    return-void

    .line 529
    :cond_1
    iget-boolean v1, p0, Lorg/c/a/a;->e:Z

    if-nez v1, :cond_0

    .line 530
    iget-object v1, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    iget-object v2, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    add-int/lit8 v3, v0, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 531
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expected: /"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    add-int/lit8 v3, v0, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " read: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 549
    :cond_2
    iget-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    aget-object v1, v1, v0

    iput-object v1, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    .line 550
    iget-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x1

    aget-object v1, v1, v2

    iput-object v1, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    .line 551
    iget-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    aget-object v0, v1, v0

    iput-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    goto :goto_0
.end method

.method private final c(Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/16 v9, 0x3d

    const/16 v1, 0x20

    const/4 v8, 0x1

    const/16 v7, 0x3e

    const/4 v6, 0x0

    .line 606
    if-nez p1, :cond_0

    .line 607
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 608
    :cond_0
    invoke-direct {p0}, Lorg/c/a/a;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    .line 609
    iput v6, p0, Lorg/c/a/a;->z:I

    .line 612
    :cond_1
    :goto_0
    invoke-direct {p0}, Lorg/c/a/a;->h()V

    .line 614
    invoke-direct {p0, v6}, Lorg/c/a/a;->c(I)I

    move-result v0

    .line 616
    if-eqz p1, :cond_2

    .line 617
    const/16 v2, 0x3f

    if-ne v0, v2, :cond_5

    .line 618
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 619
    invoke-direct {p0, v7}, Lorg/c/a/a;->a(C)V

    .line 724
    :goto_1
    return-void

    .line 624
    :cond_2
    const/16 v2, 0x2f

    if-ne v0, v2, :cond_4

    .line 625
    iput-boolean v8, p0, Lorg/c/a/a;->y:Z

    .line 626
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 627
    invoke-direct {p0}, Lorg/c/a/a;->h()V

    .line 628
    invoke-direct {p0, v7}, Lorg/c/a/a;->a(C)V

    .line 693
    :goto_2
    iget v0, p0, Lorg/c/a/a;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/c/a/a;->g:I

    shl-int/lit8 v0, v0, 0x2

    .line 695
    iget-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x4

    invoke-direct {p0, v1, v2}, Lorg/c/a/a;->a([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    .line 696
    iget-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x3

    iget-object v3, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    aput-object v3, v1, v2

    .line 698
    iget v1, p0, Lorg/c/a/a;->g:I

    iget-object v2, p0, Lorg/c/a/a;->j:[I

    array-length v2, v2

    if-lt v1, v2, :cond_3

    .line 699
    iget v1, p0, Lorg/c/a/a;->g:I

    add-int/lit8 v1, v1, 0x4

    new-array v1, v1, [I

    .line 700
    iget-object v2, p0, Lorg/c/a/a;->j:[I

    iget-object v3, p0, Lorg/c/a/a;->j:[I

    array-length v3, v3

    invoke-static {v2, v6, v1, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 701
    iput-object v1, p0, Lorg/c/a/a;->j:[I

    .line 704
    :cond_3
    iget-object v1, p0, Lorg/c/a/a;->j:[I

    iget v2, p0, Lorg/c/a/a;->g:I

    iget-object v3, p0, Lorg/c/a/a;->j:[I

    iget v4, p0, Lorg/c/a/a;->g:I

    add-int/lit8 v4, v4, -0x1

    aget v3, v3, v4

    aput v3, v1, v2

    .line 716
    iget-boolean v1, p0, Lorg/c/a/a;->d:Z

    if-eqz v1, :cond_c

    .line 717
    invoke-direct {p0}, Lorg/c/a/a;->a()Z

    .line 721
    :goto_3
    iget-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    iget-object v2, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    aput-object v2, v1, v0

    .line 722
    iget-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x1

    iget-object v3, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    aput-object v3, v1, v2

    .line 723
    iget-object v1, p0, Lorg/c/a/a;->h:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    iget-object v2, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    aput-object v2, v1, v0

    goto :goto_1

    .line 632
    :cond_4
    if-ne v0, v7, :cond_5

    if-nez p1, :cond_5

    .line 633
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    goto :goto_2

    .line 638
    :cond_5
    const/4 v2, -0x1

    if-ne v0, v2, :cond_6

    .line 639
    const-string v0, "Unexpected EOF"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 644
    :cond_6
    invoke-direct {p0}, Lorg/c/a/a;->g()Ljava/lang/String;

    move-result-object v0

    .line 646
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_7

    .line 647
    const-string v0, "attr name expected"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 652
    :cond_7
    iget v2, p0, Lorg/c/a/a;->z:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/c/a/a;->z:I

    shl-int/lit8 v2, v2, 0x2

    .line 654
    iget-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v4, v2, 0x4

    invoke-direct {p0, v3, v4}, Lorg/c/a/a;->a([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    .line 656
    iget-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v4, v2, 0x1

    const-string v5, ""

    aput-object v5, v3, v2

    .line 657
    iget-object v2, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v3, v4, 0x1

    const/4 v5, 0x0

    aput-object v5, v2, v4

    .line 658
    iget-object v2, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v4, v3, 0x1

    aput-object v0, v2, v3

    .line 660
    invoke-direct {p0}, Lorg/c/a/a;->h()V

    .line 662
    invoke-direct {p0, v6}, Lorg/c/a/a;->c(I)I

    move-result v2

    if-eq v2, v9, :cond_9

    .line 663
    iget-boolean v2, p0, Lorg/c/a/a;->e:Z

    if-nez v2, :cond_8

    .line 664
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attr.value missing f. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 666
    :cond_8
    iget-object v2, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    aput-object v0, v2, v4

    goto/16 :goto_0

    .line 669
    :cond_9
    invoke-direct {p0, v9}, Lorg/c/a/a;->a(C)V

    .line 670
    invoke-direct {p0}, Lorg/c/a/a;->h()V

    .line 671
    invoke-direct {p0, v6}, Lorg/c/a/a;->c(I)I

    move-result v0

    .line 673
    const/16 v2, 0x27

    if-eq v0, v2, :cond_b

    const/16 v2, 0x22

    if-eq v0, v2, :cond_b

    .line 674
    iget-boolean v0, p0, Lorg/c/a/a;->e:Z

    if-nez v0, :cond_a

    .line 675
    const-string v0, "attr value delimiter missing!"

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    :cond_a
    move v0, v1

    .line 682
    :goto_4
    iget v2, p0, Lorg/c/a/a;->s:I

    .line 683
    invoke-direct {p0, v0, v8}, Lorg/c/a/a;->a(IZ)V

    .line 685
    iget-object v3, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    invoke-direct {p0, v2}, Lorg/c/a/a;->a(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    .line 686
    iput v2, p0, Lorg/c/a/a;->s:I

    .line 688
    if-eq v0, v1, :cond_1

    .line 689
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    goto/16 :goto_0

    .line 680
    :cond_b
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    goto :goto_4

    .line 719
    :cond_c
    const-string v1, ""

    iput-object v1, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    goto/16 :goto_3
.end method

.method private final d()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 556
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lorg/c/a/a;->c(I)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 572
    const/4 v0, 0x4

    :goto_0
    :sswitch_0
    return v0

    .line 560
    :sswitch_1
    const/4 v0, 0x6

    goto :goto_0

    .line 562
    :sswitch_2
    invoke-direct {p0, v0}, Lorg/c/a/a;->c(I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    .line 569
    const/4 v0, 0x2

    goto :goto_0

    .line 564
    :sswitch_3
    const/4 v0, 0x3

    goto :goto_0

    .line 567
    :sswitch_4
    const/16 v0, 0x3e7

    goto :goto_0

    .line 556
    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x26 -> :sswitch_1
        0x3c -> :sswitch_2
    .end sparse-switch

    .line 562
    :sswitch_data_1
    .sparse-switch
        0x21 -> :sswitch_4
        0x2f -> :sswitch_3
        0x3f -> :sswitch_4
    .end sparse-switch
.end method

.method private final e()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/16 v5, 0x23

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 733
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    move-result v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(I)V

    .line 736
    iget v0, p0, Lorg/c/a/a;->s:I

    .line 739
    :goto_0
    invoke-direct {p0, v2}, Lorg/c/a/a;->c(I)I

    move-result v3

    .line 740
    const/16 v4, 0x3b

    if-ne v3, v4, :cond_2

    .line 741
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    .line 766
    invoke-direct {p0, v0}, Lorg/c/a/a;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 767
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/c/a/a;->s:I

    .line 768
    iget-boolean v0, p0, Lorg/c/a/a;->G:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v4, 0x6

    if-ne v0, v4, :cond_0

    .line 769
    iput-object v3, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    .line 772
    :cond_0
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v5, :cond_9

    .line 773
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x78

    if-ne v0, v2, :cond_8

    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 777
    :goto_1
    invoke-direct {p0, v0}, Lorg/c/a/a;->b(I)V

    .line 793
    :cond_1
    :goto_2
    return-void

    .line 744
    :cond_2
    const/16 v4, 0x80

    if-ge v3, v4, :cond_7

    const/16 v4, 0x30

    if-lt v3, v4, :cond_3

    const/16 v4, 0x39

    if-le v3, v4, :cond_7

    :cond_3
    const/16 v4, 0x61

    if-lt v3, v4, :cond_4

    const/16 v4, 0x7a

    if-le v3, v4, :cond_7

    :cond_4
    const/16 v4, 0x41

    if-lt v3, v4, :cond_5

    const/16 v4, 0x5a

    if-le v3, v4, :cond_7

    :cond_5
    const/16 v4, 0x5f

    if-eq v3, v4, :cond_7

    const/16 v4, 0x2d

    if-eq v3, v4, :cond_7

    if-eq v3, v5, :cond_7

    .line 751
    iget-boolean v1, p0, Lorg/c/a/a;->e:Z

    if-nez v1, :cond_6

    .line 752
    const-string v1, "unterminated entity ref"

    invoke-direct {p0, v1}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 755
    :cond_6
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "broken entitiy: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    .line 763
    :cond_7
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    move-result v3

    invoke-direct {p0, v3}, Lorg/c/a/a;->b(I)V

    goto/16 :goto_0

    .line 773
    :cond_8
    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_1

    .line 781
    :cond_9
    iget-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 783
    if-nez v0, :cond_a

    :goto_3
    iput-boolean v1, p0, Lorg/c/a/a;->F:Z

    .line 785
    iget-boolean v1, p0, Lorg/c/a/a;->F:Z

    if-eqz v1, :cond_b

    .line 786
    iget-boolean v0, p0, Lorg/c/a/a;->G:Z

    if-nez v0, :cond_1

    .line 787
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unresolved: &"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_a
    move v1, v2

    .line 783
    goto :goto_3

    .line 790
    :cond_b
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v2, v1, :cond_1

    .line 791
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lorg/c/a/a;->b(I)V

    .line 790
    add-int/lit8 v2, v2, 0x1

    goto :goto_4
.end method

.method private final f()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 848
    iget v0, p0, Lorg/c/a/a;->D:I

    if-nez v0, :cond_1

    .line 849
    invoke-direct {p0, v3}, Lorg/c/a/a;->c(I)I

    move-result v0

    .line 858
    :goto_0
    iget v1, p0, Lorg/c/a/a;->D:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/c/a/a;->D:I

    .line 860
    iget v1, p0, Lorg/c/a/a;->q:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/c/a/a;->q:I

    .line 862
    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 864
    iget v1, p0, Lorg/c/a/a;->p:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/c/a/a;->p:I

    .line 865
    iput v4, p0, Lorg/c/a/a;->q:I

    .line 868
    :cond_0
    return v0

    .line 851
    :cond_1
    iget-object v0, p0, Lorg/c/a/a;->C:[I

    aget v0, v0, v3

    .line 852
    iget-object v1, p0, Lorg/c/a/a;->C:[I

    iget-object v2, p0, Lorg/c/a/a;->C:[I

    aget v2, v2, v4

    aput v2, v1, v3

    goto :goto_0
.end method

.method private final g()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/16 v7, 0x5f

    const/16 v6, 0x5a

    const/16 v5, 0x41

    const/16 v4, 0x3a

    const/4 v3, 0x0

    .line 915
    iget v0, p0, Lorg/c/a/a;->s:I

    .line 916
    invoke-direct {p0, v3}, Lorg/c/a/a;->c(I)I

    move-result v1

    .line 917
    const/16 v2, 0x61

    if-lt v1, v2, :cond_0

    const/16 v2, 0x7a

    if-le v1, v2, :cond_2

    :cond_0
    if-lt v1, v5, :cond_1

    if-le v1, v6, :cond_2

    :cond_1
    if-eq v1, v7, :cond_2

    if-eq v1, v4, :cond_2

    const/16 v2, 0xc0

    if-ge v1, v2, :cond_2

    iget-boolean v1, p0, Lorg/c/a/a;->e:Z

    if-nez v1, :cond_2

    .line 923
    const-string v1, "name expected"

    invoke-direct {p0, v1}, Lorg/c/a/a;->a(Ljava/lang/String;)V

    .line 926
    :cond_2
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    move-result v1

    invoke-direct {p0, v1}, Lorg/c/a/a;->b(I)V

    .line 927
    invoke-direct {p0, v3}, Lorg/c/a/a;->c(I)I

    move-result v1

    .line 936
    const/16 v2, 0x61

    if-lt v1, v2, :cond_3

    const/16 v2, 0x7a

    if-le v1, v2, :cond_2

    :cond_3
    if-lt v1, v5, :cond_4

    if-le v1, v6, :cond_2

    :cond_4
    const/16 v2, 0x30

    if-lt v1, v2, :cond_5

    const/16 v2, 0x39

    if-le v1, v2, :cond_2

    :cond_5
    if-eq v1, v7, :cond_2

    const/16 v2, 0x2d

    if-eq v1, v2, :cond_2

    if-eq v1, v4, :cond_2

    const/16 v2, 0x2e

    if-eq v1, v2, :cond_2

    const/16 v2, 0xb7

    if-ge v1, v2, :cond_2

    .line 938
    invoke-direct {p0, v0}, Lorg/c/a/a;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 939
    iput v0, p0, Lorg/c/a/a;->s:I

    .line 940
    return-object v1
.end method

.method private final h()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 946
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/c/a/a;->c(I)I

    move-result v0

    .line 947
    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 951
    :cond_0
    return-void

    .line 949
    :cond_1
    invoke-direct {p0}, Lorg/c/a/a;->f()I

    goto :goto_0
.end method


# virtual methods
.method public defineEntityReplacementText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 1122
    iget-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    .line 1123
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "entity replacement text must be defined after setInput!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1124
    :cond_0
    iget-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1125
    return-void
.end method

.method public getAttributeCount()I
    .locals 1

    .prologue
    .line 1280
    iget v0, p0, Lorg/c/a/a;->z:I

    return v0
.end method

.method public getAttributeName(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1298
    iget v0, p0, Lorg/c/a/a;->z:I

    if-lt p1, v0, :cond_0

    .line 1299
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1300
    :cond_0
    iget-object v0, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getAttributeNamespace(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1292
    iget v0, p0, Lorg/c/a/a;->z:I

    if-lt p1, v0, :cond_0

    .line 1293
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1294
    :cond_0
    iget-object v0, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getAttributePrefix(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1304
    iget v0, p0, Lorg/c/a/a;->z:I

    if-lt p1, v0, :cond_0

    .line 1305
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1306
    :cond_0
    iget-object v0, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getAttributeType(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1284
    const-string v0, "CDATA"

    return-object v0
.end method

.method public getAttributeValue(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1310
    iget v0, p0, Lorg/c/a/a;->z:I

    if-lt p1, v0, :cond_0

    .line 1311
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1312
    :cond_0
    iget-object v0, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x3

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1317
    iget v0, p0, Lorg/c/a/a;->z:I

    shl-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0x4

    :goto_0
    if-ltz v0, :cond_2

    .line 1318
    iget-object v1, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1320
    :cond_0
    iget-object v1, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x3

    aget-object v0, v1, v0

    .line 1323
    :goto_1
    return-object v0

    .line 1317
    :cond_1
    add-int/lit8 v0, v0, -0x4

    goto :goto_0

    .line 1323
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getColumnNumber()I
    .locals 1

    .prologue
    .line 1230
    iget v0, p0, Lorg/c/a/a;->q:I

    return v0
.end method

.method public getDepth()I
    .locals 1

    .prologue
    .line 1170
    iget v0, p0, Lorg/c/a/a;->g:I

    return v0
.end method

.method public getEventType()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 1327
    iget v0, p0, Lorg/c/a/a;->t:I

    return v0
.end method

.method public getFeature(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1108
    const-string v1, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1109
    iget-boolean v0, p0, Lorg/c/a/a;->d:Z

    .line 1113
    :cond_0
    :goto_0
    return v0

    .line 1110
    :cond_1
    const-string v1, "relaxed"

    invoke-direct {p0, p1, v0, v1}, Lorg/c/a/a;->a(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1111
    iget-boolean v0, p0, Lorg/c/a/a;->e:Z

    goto :goto_0
.end method

.method public getInputEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1117
    iget-object v0, p0, Lorg/c/a/a;->l:Ljava/lang/String;

    return-object v0
.end method

.method public getLineNumber()I
    .locals 1

    .prologue
    .line 1226
    iget v0, p0, Lorg/c/a/a;->p:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1266
    iget-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1262
    iget-object v0, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    return-object v0
.end method

.method public getNamespace(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1153
    const-string v0, "xml"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1154
    const-string v0, "http://www.w3.org/XML/1998/namespace"

    .line 1166
    :goto_0
    return-object v0

    .line 1155
    :cond_0
    const-string v0, "xmlns"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1156
    const-string v0, "http://www.w3.org/2000/xmlns/"

    goto :goto_0

    .line 1158
    :cond_1
    iget v0, p0, Lorg/c/a/a;->g:I

    invoke-virtual {p0, v0}, Lorg/c/a/a;->getNamespaceCount(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, -0x2

    :goto_1
    if-ltz v0, :cond_4

    .line 1159
    if-nez p1, :cond_2

    .line 1160
    iget-object v1, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    aget-object v1, v1, v0

    if-nez v1, :cond_3

    .line 1161
    iget-object v1, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v1, v0

    goto :goto_0

    .line 1163
    :cond_2
    iget-object v1, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1164
    iget-object v1, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v1, v0

    goto :goto_0

    .line 1158
    :cond_3
    add-int/lit8 v0, v0, -0x2

    goto :goto_1

    .line 1166
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getNamespaceCount(I)I
    .locals 1

    .prologue
    .line 1138
    iget v0, p0, Lorg/c/a/a;->g:I

    if-le p1, v0, :cond_0

    .line 1139
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1140
    :cond_0
    iget-object v0, p0, Lorg/c/a/a;->j:[I

    aget v0, v0, p1

    return v0
.end method

.method public getNamespacePrefix(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1144
    iget-object v0, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getNamespaceUri(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1148
    iget-object v0, p0, Lorg/c/a/a;->i:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x1

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getPositionDescription()Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0x20

    const/16 v5, 0x10

    const/4 v4, 0x3

    const/4 v1, 0x0

    .line 1175
    new-instance v2, Ljava/lang/StringBuffer;

    iget v0, p0, Lorg/c/a/a;->t:I

    sget-object v3, Lorg/c/a/a;->TYPES:[Ljava/lang/String;

    array-length v3, v3

    if-ge v0, v3, :cond_5

    sget-object v0, Lorg/c/a/a;->TYPES:[Ljava/lang/String;

    iget v3, p0, Lorg/c/a/a;->t:I

    aget-object v0, v0, v3

    :goto_0
    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 1177
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1179
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    iget v0, p0, Lorg/c/a/a;->t:I

    if-ne v0, v4, :cond_9

    .line 1180
    :cond_0
    iget-boolean v0, p0, Lorg/c/a/a;->y:Z

    if-eqz v0, :cond_1

    .line 1181
    const-string v0, "(empty) "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1182
    :cond_1
    const/16 v0, 0x3c

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1183
    iget v0, p0, Lorg/c/a/a;->t:I

    if-ne v0, v4, :cond_2

    .line 1184
    const/16 v0, 0x2f

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1186
    :cond_2
    iget-object v0, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 1187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "{"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "}"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1188
    :cond_3
    iget-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1190
    iget v0, p0, Lorg/c/a/a;->z:I

    shl-int/lit8 v3, v0, 0x2

    move v0, v1

    .line 1191
    :goto_1
    if-ge v0, v3, :cond_6

    .line 1192
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1193
    iget-object v1, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x1

    aget-object v1, v1, v4

    if-eqz v1, :cond_4

    .line 1194
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "{"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    aget-object v4, v4, v0

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "}"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v5, v0, 0x1

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ":"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1196
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v5, v0, 0x2

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "=\'"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, p0, Lorg/c/a/a;->A:[Ljava/lang/String;

    add-int/lit8 v5, v0, 0x3

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "\'"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1191
    add-int/lit8 v0, v0, 0x4

    goto :goto_1

    .line 1175
    :cond_5
    const-string v0, "unknown"

    goto/16 :goto_0

    .line 1199
    :cond_6
    const/16 v0, 0x3e

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1213
    :cond_7
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/c/a/a;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/c/a/a;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1214
    iget-object v0, p0, Lorg/c/a/a;->a:Ljava/lang/Object;

    if-eqz v0, :cond_d

    .line 1215
    const-string v0, " in "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1216
    iget-object v0, p0, Lorg/c/a/a;->a:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 1222
    :cond_8
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1201
    :cond_9
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v3, 0x7

    if-eq v0, v3, :cond_7

    .line 1202
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v3, 0x4

    if-eq v0, v3, :cond_a

    .line 1203
    invoke-virtual {p0}, Lorg/c/a/a;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 1204
    :cond_a
    iget-boolean v0, p0, Lorg/c/a/a;->u:Z

    if-eqz v0, :cond_b

    .line 1205
    const-string v0, "(whitespace)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 1207
    :cond_b
    invoke-virtual {p0}, Lorg/c/a/a;->getText()Ljava/lang/String;

    move-result-object v0

    .line 1208
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v5, :cond_c

    .line 1209
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1210
    :cond_c
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 1218
    :cond_d
    iget-object v0, p0, Lorg/c/a/a;->k:Ljava/io/Reader;

    if-eqz v0, :cond_8

    .line 1219
    const-string v0, " in "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1220
    iget-object v0, p0, Lorg/c/a/a;->k:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1270
    iget-object v0, p0, Lorg/c/a/a;->w:Ljava/lang/String;

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 1128
    const-string v0, "xmldecl-version"

    invoke-direct {p0, p1, v1, v0}, Lorg/c/a/a;->a(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1129
    iget-object v0, p0, Lorg/c/a/a;->b:Ljava/lang/String;

    .line 1134
    :goto_0
    return-object v0

    .line 1130
    :cond_0
    const-string v0, "xmldecl-standalone"

    invoke-direct {p0, p1, v1, v0}, Lorg/c/a/a;->a(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1131
    iget-object v0, p0, Lorg/c/a/a;->c:Ljava/lang/Boolean;

    goto :goto_0

    .line 1132
    :cond_1
    const-string v0, "location"

    invoke-direct {p0, p1, v1, v0}, Lorg/c/a/a;->a(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1133
    iget-object v0, p0, Lorg/c/a/a;->a:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/c/a/a;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/c/a/a;->k:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1134
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getText()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1240
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lorg/c/a/a;->F:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/c/a/a;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getTextCharacters([I)[C
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1245
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    .line 1246
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 1247
    aput v2, p1, v2

    .line 1248
    iget-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    aput v0, p1, v3

    .line 1249
    iget-object v0, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 1258
    :goto_0
    return-object v0

    .line 1251
    :cond_0
    aput v2, p1, v2

    .line 1252
    iget v0, p0, Lorg/c/a/a;->s:I

    aput v0, p1, v3

    .line 1253
    iget-object v0, p0, Lorg/c/a/a;->r:[C

    goto :goto_0

    .line 1256
    :cond_1
    aput v4, p1, v2

    .line 1257
    aput v4, p1, v3

    .line 1258
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isAttributeDefault(I)Z
    .locals 1

    .prologue
    .line 1288
    const/4 v0, 0x0

    return v0
.end method

.method public isEmptyElementTag()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 1274
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 1275
    const-string v0, "Wrong event type"

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    .line 1276
    :cond_0
    iget-boolean v0, p0, Lorg/c/a/a;->y:Z

    return v0
.end method

.method public isWhitespace()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 1234
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 1235
    const-string v0, "Wrong event type"

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    .line 1236
    :cond_0
    iget-boolean v0, p0, Lorg/c/a/a;->u:Z

    return v0
.end method

.method public next()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x4

    .line 1332
    iput v1, p0, Lorg/c/a/a;->s:I

    .line 1333
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/c/a/a;->u:Z

    .line 1334
    const/16 v0, 0x270f

    .line 1335
    iput-boolean v1, p0, Lorg/c/a/a;->G:Z

    .line 1338
    :cond_0
    invoke-direct {p0}, Lorg/c/a/a;->b()V

    .line 1339
    iget v1, p0, Lorg/c/a/a;->t:I

    if-ge v1, v0, :cond_1

    .line 1340
    iget v0, p0, Lorg/c/a/a;->t:I

    .line 1344
    :cond_1
    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    if-lt v0, v2, :cond_2

    invoke-direct {p0}, Lorg/c/a/a;->d()I

    move-result v1

    if-ge v1, v2, :cond_0

    .line 1346
    :cond_2
    iput v0, p0, Lorg/c/a/a;->t:I

    .line 1347
    iget v0, p0, Lorg/c/a/a;->t:I

    if-le v0, v2, :cond_3

    .line 1348
    iput v2, p0, Lorg/c/a/a;->t:I

    .line 1350
    :cond_3
    iget v0, p0, Lorg/c/a/a;->t:I

    return v0
.end method

.method public nextTag()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1368
    invoke-virtual {p0}, Lorg/c/a/a;->next()I

    .line 1369
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lorg/c/a/a;->u:Z

    if-eqz v0, :cond_0

    .line 1370
    invoke-virtual {p0}, Lorg/c/a/a;->next()I

    .line 1372
    :cond_0
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 1373
    const-string v0, "unexpected type"

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    .line 1375
    :cond_1
    iget v0, p0, Lorg/c/a/a;->t:I

    return v0
.end method

.method public nextText()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1389
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 1390
    const-string v0, "precondition: START_TAG"

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    .line 1392
    :cond_0
    invoke-virtual {p0}, Lorg/c/a/a;->next()I

    .line 1396
    iget v0, p0, Lorg/c/a/a;->t:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 1397
    invoke-virtual {p0}, Lorg/c/a/a;->getText()Ljava/lang/String;

    move-result-object v0

    .line 1398
    invoke-virtual {p0}, Lorg/c/a/a;->next()I

    .line 1403
    :goto_0
    iget v1, p0, Lorg/c/a/a;->t:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    .line 1404
    const-string v1, "END_TAG expected"

    invoke-direct {p0, v1}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    .line 1406
    :cond_1
    return-object v0

    .line 1401
    :cond_2
    const-string v0, ""

    goto :goto_0
.end method

.method public nextToken()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 1355
    iput-boolean v1, p0, Lorg/c/a/a;->u:Z

    .line 1356
    const/4 v0, 0x0

    iput v0, p0, Lorg/c/a/a;->s:I

    .line 1358
    iput-boolean v1, p0, Lorg/c/a/a;->G:Z

    .line 1359
    invoke-direct {p0}, Lorg/c/a/a;->b()V

    .line 1360
    iget v0, p0, Lorg/c/a/a;->t:I

    return v0
.end method

.method public require(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1381
    iget v0, p0, Lorg/c/a/a;->t:I

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lorg/c/a/a;->getNamespace()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lorg/c/a/a;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1384
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "expected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lorg/c/a/a;->TYPES:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    .line 1386
    :cond_2
    return-void
.end method

.method public setFeature(Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 1411
    const-string v0, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1412
    iput-boolean p2, p0, Lorg/c/a/a;->d:Z

    .line 1417
    :goto_0
    return-void

    .line 1413
    :cond_0
    const/4 v0, 0x0

    const-string v1, "relaxed"

    invoke-direct {p0, p1, v0, v1}, Lorg/c/a/a;->a(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1414
    iput-boolean p2, p0, Lorg/c/a/a;->e:Z

    goto :goto_0

    .line 1416
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unsupported feature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/a/a;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setInput(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v5, -0x1

    const/4 v0, 0x0

    .line 988
    iput v0, p0, Lorg/c/a/a;->n:I

    .line 989
    iput v0, p0, Lorg/c/a/a;->o:I

    .line 992
    if-nez p1, :cond_0

    .line 993
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 997
    :cond_0
    if-nez p2, :cond_b

    move v1, v0

    .line 1002
    :goto_0
    :try_start_0
    iget v0, p0, Lorg/c/a/a;->o:I

    const/4 v2, 0x4

    if-ge v0, v2, :cond_1

    .line 1003
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 1004
    if-ne v2, v5, :cond_5

    .line 1010
    :cond_1
    iget v0, p0, Lorg/c/a/a;->o:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_b

    .line 1011
    sparse-switch v1, :sswitch_data_0

    :cond_2
    move-object v0, p2

    .line 1070
    :goto_1
    const/high16 v2, -0x10000

    and-int/2addr v2, v1

    const/high16 v3, -0x1010000

    if-ne v2, v3, :cond_9

    .line 1071
    const-string v0, "UTF-16BE"

    .line 1072
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/c/a/a;->m:[C

    const/4 v4, 0x2

    aget-char v3, v3, v4

    shl-int/lit8 v3, v3, 0x8

    iget-object v4, p0, Lorg/c/a/a;->m:[C

    const/4 v5, 0x3

    aget-char v4, v4, v5

    or-int/2addr v3, v4

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 1074
    const/4 v1, 0x1

    iput v1, p0, Lorg/c/a/a;->o:I

    .line 1091
    :cond_3
    :goto_2
    if-nez v0, :cond_4

    .line 1092
    const-string v0, "UTF-8"

    .line 1094
    :cond_4
    iget v1, p0, Lorg/c/a/a;->o:I

    .line 1095
    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lorg/c/a/a;->setInput(Ljava/io/Reader;)V

    .line 1096
    iput-object p2, p0, Lorg/c/a/a;->l:Ljava/lang/String;

    .line 1097
    iput v1, p0, Lorg/c/a/a;->o:I

    .line 1105
    return-void

    .line 1006
    :cond_5
    shl-int/lit8 v0, v1, 0x8

    or-int/2addr v0, v2

    .line 1007
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    iget v3, p0, Lorg/c/a/a;->o:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lorg/c/a/a;->o:I

    int-to-char v2, v2

    aput-char v2, v1, v3

    move v1, v0

    .line 1008
    goto :goto_0

    .line 1013
    :sswitch_0
    const-string v0, "UTF-32BE"

    .line 1014
    const/4 v1, 0x0

    iput v1, p0, Lorg/c/a/a;->o:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1099
    :catch_0
    move-exception v0

    .line 1100
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid stream or encoding: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p0, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V

    throw v1

    .line 1018
    :sswitch_1
    :try_start_1
    const-string v0, "UTF-32LE"

    .line 1019
    const/4 v1, 0x0

    iput v1, p0, Lorg/c/a/a;->o:I

    goto :goto_2

    .line 1023
    :sswitch_2
    const-string v0, "UTF-32BE"

    .line 1024
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x0

    const/16 v3, 0x3c

    aput-char v3, v1, v2

    .line 1025
    const/4 v1, 0x1

    iput v1, p0, Lorg/c/a/a;->o:I

    goto :goto_2

    .line 1029
    :sswitch_3
    const-string v0, "UTF-32LE"

    .line 1030
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x0

    const/16 v3, 0x3c

    aput-char v3, v1, v2

    .line 1031
    const/4 v1, 0x1

    iput v1, p0, Lorg/c/a/a;->o:I

    goto :goto_2

    .line 1035
    :sswitch_4
    const-string v0, "UTF-16BE"

    .line 1036
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x0

    const/16 v3, 0x3c

    aput-char v3, v1, v2

    .line 1037
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x1

    const/16 v3, 0x3f

    aput-char v3, v1, v2

    .line 1038
    const/4 v1, 0x2

    iput v1, p0, Lorg/c/a/a;->o:I

    goto :goto_2

    .line 1042
    :sswitch_5
    const-string v0, "UTF-16LE"

    .line 1043
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x0

    const/16 v3, 0x3c

    aput-char v3, v1, v2

    .line 1044
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x1

    const/16 v3, 0x3f

    aput-char v3, v1, v2

    .line 1045
    const/4 v1, 0x2

    iput v1, p0, Lorg/c/a/a;->o:I

    goto/16 :goto_2

    .line 1050
    :cond_6
    :sswitch_6
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 1051
    if-ne v0, v5, :cond_7

    move-object v0, p2

    .line 1052
    goto/16 :goto_1

    .line 1053
    :cond_7
    iget-object v2, p0, Lorg/c/a/a;->m:[C

    iget v3, p0, Lorg/c/a/a;->o:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lorg/c/a/a;->o:I

    int-to-char v4, v0

    aput-char v4, v2, v3

    .line 1054
    const/16 v2, 0x3e

    if-ne v0, v2, :cond_6

    .line 1055
    new-instance v2, Ljava/lang/String;

    iget-object v0, p0, Lorg/c/a/a;->m:[C

    const/4 v3, 0x0

    iget v4, p0, Lorg/c/a/a;->o:I

    invoke-direct {v2, v0, v3, v4}, Ljava/lang/String;-><init>([CII)V

    .line 1056
    const-string v0, "encoding"

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 1057
    if-eq v0, v5, :cond_2

    .line 1059
    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x22

    if-eq v3, v4, :cond_8

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x27

    if-eq v3, v4, :cond_8

    .line 1060
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 1061
    :cond_8
    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 1062
    invoke-virtual {v2, v0, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 1063
    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 1076
    :cond_9
    const/high16 v2, -0x10000

    and-int/2addr v2, v1

    const/high16 v3, -0x20000

    if-ne v2, v3, :cond_a

    .line 1077
    const-string v0, "UTF-16LE"

    .line 1078
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/c/a/a;->m:[C

    const/4 v4, 0x3

    aget-char v3, v3, v4

    shl-int/lit8 v3, v3, 0x8

    iget-object v4, p0, Lorg/c/a/a;->m:[C

    const/4 v5, 0x2

    aget-char v4, v4, v5

    or-int/2addr v3, v4

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 1080
    const/4 v1, 0x1

    iput v1, p0, Lorg/c/a/a;->o:I

    goto/16 :goto_2

    .line 1082
    :cond_a
    and-int/lit16 v1, v1, -0x100

    const v2, -0x10444100

    if-ne v1, v2, :cond_3

    .line 1083
    const-string v0, "UTF-8"

    .line 1084
    iget-object v1, p0, Lorg/c/a/a;->m:[C

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/c/a/a;->m:[C

    const/4 v4, 0x3

    aget-char v3, v3, v4

    aput-char v3, v1, v2

    .line 1085
    const/4 v1, 0x1

    iput v1, p0, Lorg/c/a/a;->o:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    :cond_b
    move-object v0, p2

    goto/16 :goto_2

    .line 1011
    nop

    :sswitch_data_0
    .sparse-switch
        -0x20000 -> :sswitch_1
        0x3c -> :sswitch_2
        0xfeff -> :sswitch_0
        0x3c003f -> :sswitch_4
        0x3c000000 -> :sswitch_3
        0x3c003f00 -> :sswitch_5
        0x3c3f786d -> :sswitch_6
    .end sparse-switch
.end method

.method public setInput(Ljava/io/Reader;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 956
    iput-object p1, p0, Lorg/c/a/a;->k:Ljava/io/Reader;

    .line 958
    const/4 v0, 0x1

    iput v0, p0, Lorg/c/a/a;->p:I

    .line 959
    iput v1, p0, Lorg/c/a/a;->q:I

    .line 960
    iput v1, p0, Lorg/c/a/a;->t:I

    .line 961
    iput-object v2, p0, Lorg/c/a/a;->x:Ljava/lang/String;

    .line 962
    iput-object v2, p0, Lorg/c/a/a;->v:Ljava/lang/String;

    .line 963
    iput-boolean v1, p0, Lorg/c/a/a;->y:Z

    .line 964
    const/4 v0, -0x1

    iput v0, p0, Lorg/c/a/a;->z:I

    .line 965
    iput-object v2, p0, Lorg/c/a/a;->l:Ljava/lang/String;

    .line 966
    iput-object v2, p0, Lorg/c/a/a;->b:Ljava/lang/String;

    .line 967
    iput-object v2, p0, Lorg/c/a/a;->c:Ljava/lang/Boolean;

    .line 969
    if-nez p1, :cond_0

    .line 983
    :goto_0
    return-void

    .line 972
    :cond_0
    iput v1, p0, Lorg/c/a/a;->n:I

    .line 973
    iput v1, p0, Lorg/c/a/a;->o:I

    .line 974
    iput v1, p0, Lorg/c/a/a;->D:I

    .line 975
    iput v1, p0, Lorg/c/a/a;->g:I

    .line 977
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    .line 978
    iget-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    const-string v1, "amp"

    const-string v2, "&"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 979
    iget-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    const-string v1, "apos"

    const-string v2, "\'"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 980
    iget-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    const-string v1, "gt"

    const-string v2, ">"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 981
    iget-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    const-string v1, "lt"

    const-string v2, "<"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 982
    iget-object v0, p0, Lorg/c/a/a;->f:Ljava/util/Hashtable;

    const-string v1, "quot"

    const-string v2, "\""

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 1421
    const/4 v0, 0x1

    const-string v1, "location"

    invoke-direct {p0, p1, v0, v1}, Lorg/c/a/a;->a(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1422
    iput-object p2, p0, Lorg/c/a/a;->a:Ljava/lang/Object;

    .line 1425
    return-void

    .line 1424
    :cond_0
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unsupported property: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
