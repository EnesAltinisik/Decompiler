.class public Lorg/b/a/j;
.super Lorg/b/b;
.source "SoapSerializationEnvelope.java"


# static fields
.field static final k:Lorg/b/a/f;

.field static u:Ljava/lang/Class;


# instance fields
.field public l:Ljava/util/Hashtable;

.field m:Ljava/util/Hashtable;

.field n:Ljava/util/Vector;

.field public o:Z

.field public p:Z

.field public q:Z

.field protected r:Ljava/util/Hashtable;

.field protected s:Ljava/util/Hashtable;

.field protected t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Lorg/b/a/c;

    invoke-direct {v0}, Lorg/b/a/c;-><init>()V

    sput-object v0, Lorg/b/a/j;->k:Lorg/b/a/f;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .prologue
    .line 99
    invoke-direct {p0, p1}, Lorg/b/b;-><init>(I)V

    .line 54
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/b/a/j;->l:Ljava/util/Hashtable;

    .line 56
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/b/a/j;->m:Ljava/util/Hashtable;

    .line 84
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/b/a/j;->r:Ljava/util/Hashtable;

    .line 90
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/b/a/j;->s:Ljava/util/Hashtable;

    .line 95
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/b/a/j;->t:Z

    .line 100
    iget-object v0, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v1, "Array"

    sget-object v2, Lorg/b/a/g;->f:Ljava/lang/Class;

    invoke-virtual {p0, v0, v1, v2}, Lorg/b/a/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V

    .line 101
    sget-object v0, Lorg/b/a/j;->k:Lorg/b/a/f;

    invoke-interface {v0, p0}, Lorg/b/a/f;->a(Lorg/b/a/j;)V

    .line 102
    return-void
.end method

.method private a(Ljava/lang/String;II)I
    .locals 2

    .prologue
    .line 284
    if-nez p1, :cond_1

    .line 287
    :cond_0
    :goto_0
    return p3

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p2

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    add-int/lit8 v0, p2, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    goto :goto_0
.end method

.method private a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/Object;Lorg/b/a/g;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 655
    if-eqz p4, :cond_0

    .line 656
    check-cast p4, Lorg/b/a/f;

    invoke-interface {p4, p1, p2}, Lorg/b/a/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/Object;)V

    .line 666
    :goto_0
    return-void

    .line 657
    :cond_0
    instance-of v0, p2, Lorg/b/a/h;

    if-eqz v0, :cond_1

    .line 658
    check-cast p2, Lorg/b/a/h;

    invoke-virtual {p0, p1, p2}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Lorg/b/a/h;)V

    goto :goto_0

    .line 659
    :cond_1
    instance-of v0, p2, Lorg/b/a/e;

    if-eqz v0, :cond_2

    .line 660
    check-cast p2, Lorg/b/a/e;

    invoke-virtual {p0, p1, p2}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Lorg/b/a/e;)V

    goto :goto_0

    .line 661
    :cond_2
    instance-of v0, p2, Ljava/util/Vector;

    if-eqz v0, :cond_3

    .line 662
    check-cast p2, Ljava/util/Vector;

    iget-object v0, p3, Lorg/b/a/g;->n:Lorg/b/a/g;

    invoke-virtual {p0, p1, p2, v0}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/util/Vector;Lorg/b/a/g;)V

    goto :goto_0

    .line 664
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot serialize: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static b(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .prologue
    .line 431
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/NoClassDefFoundError;

    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NoClassDefFoundError;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x3

    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 337
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 338
    const-string v0, "href"

    invoke-interface {p1, v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 340
    if-eqz v0, :cond_3

    .line 341
    if-nez p2, :cond_0

    .line 342
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "href at root level?!?"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 344
    :cond_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 345
    iget-object v0, p0, Lorg/b/a/j;->m:Ljava/util/Hashtable;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 346
    if-eqz v0, :cond_1

    instance-of v3, v0, Lorg/b/a/d;

    if-eqz v3, :cond_2

    .line 347
    :cond_1
    new-instance v3, Lorg/b/a/d;

    invoke-direct {v3}, Lorg/b/a/d;-><init>()V

    .line 348
    check-cast v0, Lorg/b/a/d;

    iput-object v0, v3, Lorg/b/a/d;->a:Lorg/b/a/d;

    .line 349
    iput-object p2, v3, Lorg/b/a/d;->b:Ljava/lang/Object;

    .line 350
    iput p3, v3, Lorg/b/a/d;->c:I

    .line 351
    iget-object v0, p0, Lorg/b/a/j;->m:Ljava/util/Hashtable;

    invoke-virtual {v0, v1, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v2

    .line 354
    :cond_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 355
    invoke-interface {p1, v7, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 413
    :goto_0
    invoke-interface {p1, v7, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 414
    return-object v0

    .line 357
    :cond_3
    iget-object v0, p0, Lorg/b/a/j;->i:Ljava/lang/String;

    const-string v1, "nil"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 358
    const-string v1, "id"

    invoke-interface {p1, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 359
    if-nez v0, :cond_4

    .line 360
    iget-object v0, p0, Lorg/b/a/j;->i:Ljava/lang/String;

    const-string v1, "null"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 362
    :cond_4
    if-eqz v0, :cond_8

    invoke-static {v0}, Lorg/b/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 364
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 365
    invoke-interface {p1, v7, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    move-object v3, v2

    .line 393
    :cond_5
    :goto_1
    if-eqz v5, :cond_7

    .line 394
    iget-object v0, p0, Lorg/b/a/j;->m:Ljava/util/Hashtable;

    invoke-virtual {v0, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 395
    instance-of v1, v0, Lorg/b/a/d;

    if-eqz v1, :cond_f

    .line 396
    check-cast v0, Lorg/b/a/d;

    move-object v1, v0

    .line 398
    :goto_2
    iget-object v0, v1, Lorg/b/a/d;->b:Ljava/lang/Object;

    instance-of v0, v0, Lorg/b/a/e;

    if-eqz v0, :cond_e

    .line 399
    iget-object v0, v1, Lorg/b/a/d;->b:Ljava/lang/Object;

    check-cast v0, Lorg/b/a/e;

    iget v6, v1, Lorg/b/a/d;->c:I

    invoke-interface {v0, v6, v3}, Lorg/b/a/e;->a(ILjava/lang/Object;)V

    .line 403
    :goto_3
    iget-object v0, v1, Lorg/b/a/d;->a:Lorg/b/a/d;

    .line 405
    if-nez v0, :cond_10

    .line 409
    :cond_6
    iget-object v0, p0, Lorg/b/a/j;->m:Ljava/util/Hashtable;

    invoke-virtual {v0, v5, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    move-object v0, v3

    goto :goto_0

    .line 367
    :cond_8
    iget-object v0, p0, Lorg/b/a/j;->i:Ljava/lang/String;

    const-string v1, "type"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 368
    if-eqz v3, :cond_c

    .line 369
    const/16 v0, 0x3a

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 370
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p5

    .line 371
    const/4 v1, -0x1

    if-ne v0, v1, :cond_b

    const-string v0, ""

    .line 372
    :goto_4
    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 384
    :cond_9
    :goto_5
    if-nez v3, :cond_a

    .line 385
    iput-boolean v6, p0, Lorg/b/a/j;->o:Z

    .line 387
    :cond_a
    invoke-virtual {p0, p1, p4, p5, p6}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;

    move-result-object v3

    .line 388
    if-nez v3, :cond_5

    .line 389
    invoke-virtual {p0, p1, p4, p5}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_1

    .line 371
    :cond_b
    invoke-virtual {v3, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 373
    :cond_c
    if-nez p5, :cond_9

    if-nez p4, :cond_9

    .line 374
    iget-object v0, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v1, "arrayType"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 375
    iget-object p4, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    .line 376
    const-string p5, "Array"

    goto :goto_5

    .line 378
    :cond_d
    iget-object v0, p6, Lorg/b/a/g;->l:Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, Lorg/b/a/j;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 379
    aget-object v0, v1, v8

    check-cast v0, Ljava/lang/String;

    .line 380
    aget-object v1, v1, v6

    check-cast v1, Ljava/lang/String;

    move-object p5, v1

    move-object p4, v0

    goto :goto_5

    .line 401
    :cond_e
    iget-object v0, v1, Lorg/b/a/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Vector;

    iget v6, v1, Lorg/b/a/d;->c:I

    invoke-virtual {v0, v3, v6}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    goto :goto_3

    .line 406
    :cond_f
    if-eqz v0, :cond_6

    .line 407
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "double ID"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    move-object v1, v0

    goto/16 :goto_2
.end method

.method protected a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v10, 0x3

    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 227
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    .line 228
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v8

    .line 231
    new-instance v6, Ljava/util/Vector;

    invoke-direct {v6}, Ljava/util/Vector;-><init>()V

    move v0, v1

    .line 232
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 233
    new-instance v2, Lorg/b/a/b;

    invoke-direct {v2}, Lorg/b/a/b;-><init>()V

    .line 234
    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/b/a/b;->a(Ljava/lang/String;)V

    .line 235
    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/b/a/b;->b(Ljava/lang/Object;)V

    .line 236
    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/b/a/b;->b(Ljava/lang/String;)V

    .line 237
    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeType(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/b/a/b;->a(Ljava/lang/Object;)V

    .line 238
    invoke-virtual {v6, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 232
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 241
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 244
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    .line 245
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v3

    .line 246
    new-instance v5, Lorg/b/a/i;

    invoke-direct {v5, p2, p3, v3}, Lorg/b/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    move v2, v1

    .line 249
    :goto_1
    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 250
    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/b;

    invoke-virtual {v5, v0}, Lorg/b/a/i;->a(Lorg/b/a/b;)V

    .line 249
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 252
    :cond_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-object v0, v3

    move-object v2, v5

    .line 262
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    const/4 v5, 0x2

    if-ne v3, v5, :cond_6

    .line 263
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    .line 264
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Malformed input: Mixed content"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 253
    :cond_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v10, :cond_7

    .line 254
    new-instance v3, Lorg/b/a/h;

    invoke-direct {v3, p2, p3}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v1

    .line 256
    :goto_3
    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 257
    invoke-virtual {v6, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/b;

    invoke-virtual {v3, v0}, Lorg/b/a/h;->a(Lorg/b/a/b;)V

    .line 256
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    :cond_3
    move-object v0, v4

    move-object v2, v3

    .line 259
    goto :goto_2

    .line 266
    :cond_4
    new-instance v2, Lorg/b/a/h;

    invoke-direct {v2, p2, p3}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    :goto_4
    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 269
    invoke-virtual {v6, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/b;

    invoke-virtual {v2, v0}, Lorg/b/a/h;->a(Lorg/b/a/b;)V

    .line 268
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 272
    :cond_5
    :goto_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-eq v0, v10, :cond_6

    .line 273
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lorg/b/a/h;->a_()I

    move-result v3

    sget-object v6, Lorg/b/a/g;->g:Lorg/b/a/g;

    move-object v0, p0

    move-object v1, p1

    move-object v5, v4

    invoke-virtual/range {v0 .. v6}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 275
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    goto :goto_5

    .line 279
    :cond_6
    invoke-interface {p1, v10, v8, v7}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 280
    return-object v2

    :cond_7
    move-object v0, v4

    move-object v2, v4

    goto :goto_2
.end method

.method public a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 423
    iget-object v0, p0, Lorg/b/a/j;->r:Ljava/util/Hashtable;

    new-instance v2, Lorg/b/a/i;

    invoke-direct {v2, p2, p3, v1}, Lorg/b/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 424
    if-nez v0, :cond_0

    .line 450
    :goto_0
    return-object v1

    .line 427
    :cond_0
    instance-of v1, v0, Lorg/b/a/f;

    if-eqz v1, :cond_1

    .line 428
    check-cast v0, Lorg/b/a/f;

    invoke-interface {v0, p1, p2, p3, p4}, Lorg/b/a/f;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    .line 429
    :cond_1
    instance-of v1, v0, Lorg/b/a/h;

    if-eqz v1, :cond_2

    .line 430
    check-cast v0, Lorg/b/a/h;

    invoke-virtual {v0}, Lorg/b/a/h;->d()Lorg/b/a/h;

    move-result-object v1

    .line 441
    :goto_1
    instance-of v0, v1, Lorg/b/a/h;

    if-eqz v0, :cond_5

    move-object v0, v1

    .line 442
    check-cast v0, Lorg/b/a/h;

    invoke-virtual {p0, p1, v0}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Lorg/b/a/h;)V

    goto :goto_0

    .line 431
    :cond_2
    sget-object v1, Lorg/b/a/j;->u:Ljava/lang/Class;

    if-nez v1, :cond_3

    const-string v1, "org.b.a.h"

    invoke-static {v1}, Lorg/b/a/j;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/b/a/j;->u:Ljava/lang/Class;

    :goto_2
    if-ne v0, v1, :cond_4

    .line 432
    new-instance v1, Lorg/b/a/h;

    invoke-direct {v1, p2, p3}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 431
    :cond_3
    sget-object v1, Lorg/b/a/j;->u:Ljava/lang/Class;

    goto :goto_2

    .line 435
    :cond_4
    :try_start_0
    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_1

    .line 436
    :catch_0
    move-exception v0

    .line 437
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 443
    :cond_5
    instance-of v0, v1, Lorg/b/a/e;

    if-eqz v0, :cond_6

    move-object v0, v1

    .line 444
    check-cast v0, Lorg/b/a/e;

    invoke-virtual {p0, p1, v0}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Lorg/b/a/e;)V

    goto :goto_0

    .line 445
    :cond_6
    instance-of v0, v1, Ljava/util/Vector;

    if-eqz v0, :cond_7

    move-object v0, v1

    .line 446
    check-cast v0, Ljava/util/Vector;

    iget-object v2, p4, Lorg/b/a/g;->n:Lorg/b/a/g;

    invoke-virtual {p0, p1, v0, v2}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Vector;Lorg/b/a/g;)V

    goto :goto_0

    .line 448
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "no deserializer for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1

    .prologue
    .line 497
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/b/a/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/b/a/f;)V

    .line 498
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/b/a/f;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 488
    iget-object v1, p0, Lorg/b/a/j;->r:Ljava/util/Hashtable;

    new-instance v2, Lorg/b/a/i;

    invoke-direct {v2, p1, p2, v4}, Lorg/b/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    if-nez p4, :cond_0

    move-object v0, p3

    :goto_0
    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    iget-object v0, p0, Lorg/b/a/j;->s:Ljava/util/Hashtable;

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object v4, v2, v3

    const/4 v3, 0x3

    aput-object p4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    return-void

    :cond_0
    move-object v0, p4

    .line 488
    goto :goto_0
.end method

.method protected a(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Vector;Lorg/b/a/g;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v11, 0x3

    const/4 v6, -0x1

    const/4 v10, 0x0

    const/4 v9, 0x0

    .line 293
    .line 295
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    .line 296
    const/4 v1, 0x1

    .line 297
    iget-object v2, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v3, "arrayType"

    invoke-interface {p1, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 298
    if-eqz v2, :cond_5

    .line 299
    const/16 v0, 0x3a

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 300
    const-string v3, "["

    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    .line 301
    add-int/lit8 v4, v0, 0x1

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 302
    if-ne v0, v6, :cond_1

    const-string v0, ""

    .line 303
    :goto_0
    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 304
    invoke-direct {p0, v2, v3, v6}, Lorg/b/a/j;->a(Ljava/lang/String;II)I

    move-result v0

    .line 305
    if-eq v0, v6, :cond_4

    .line 306
    invoke-virtual {p2, v0}, Ljava/util/Vector;->setSize(I)V

    move v8, v9

    move v1, v0

    .line 310
    :goto_1
    if-nez p3, :cond_3

    .line 311
    sget-object v6, Lorg/b/a/g;->g:Lorg/b/a/g;

    .line 313
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 314
    iget-object v0, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v2, "offset"

    invoke-interface {p1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v9, v9}, Lorg/b/a/j;->a(Ljava/lang/String;II)I

    move-result v0

    .line 315
    :goto_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    if-eq v2, v11, :cond_2

    .line 317
    iget-object v2, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v3, "position"

    invoke-interface {p1, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v9, v0}, Lorg/b/a/j;->a(Ljava/lang/String;II)I

    move-result v3

    .line 318
    if-eqz v8, :cond_0

    if-lt v3, v1, :cond_0

    .line 319
    add-int/lit8 v1, v3, 0x1

    .line 320
    invoke-virtual {p2, v1}, Ljava/util/Vector;->setSize(I)V

    :cond_0
    move v7, v1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 323
    invoke-virtual/range {v0 .. v6}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0, v3}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    .line 324
    add-int/lit8 v0, v3, 0x1

    .line 325
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    move v1, v7

    goto :goto_3

    .line 302
    :cond_1
    invoke-virtual {v2, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 327
    :cond_2
    invoke-interface {p1, v11, v10, v10}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 328
    return-void

    :cond_3
    move-object v6, p3

    goto :goto_2

    :cond_4
    move v8, v1

    move v1, v0

    goto :goto_1

    :cond_5
    move v8, v1

    move-object v5, v10

    move-object v4, v10

    move v1, v0

    goto :goto_1
.end method

.method protected a(Lorg/xmlpull/v1/XmlPullParser;Lorg/b/a/e;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 177
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_9

    .line 178
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    .line 179
    iget-boolean v0, p0, Lorg/b/a/j;->o:Z

    if-eqz v0, :cond_1

    instance-of v0, p2, Lorg/b/a/h;

    if-nez v0, :cond_8

    .line 180
    :cond_1
    new-instance v6, Lorg/b/a/g;

    invoke-direct {v6}, Lorg/b/a/g;-><init>()V

    .line 181
    invoke-interface {p2}, Lorg/b/a/e;->a_()I

    move-result v9

    .line 182
    const/4 v0, 0x0

    .line 184
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v9, :cond_5

    if-nez v0, :cond_5

    .line 185
    invoke-virtual {v6}, Lorg/b/a/g;->a()V

    .line 186
    iget-object v1, p0, Lorg/b/a/j;->l:Ljava/util/Hashtable;

    invoke-interface {p2, v3, v1, v6}, Lorg/b/a/e;->a(ILjava/util/Hashtable;Lorg/b/a/g;)V

    .line 188
    iget-object v1, v6, Lorg/b/a/g;->h:Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v6, Lorg/b/a/g;->i:Ljava/lang/String;

    if-eqz v1, :cond_3

    :cond_2
    iget-object v1, v6, Lorg/b/a/g;->h:Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v6, Lorg/b/a/g;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 190
    :cond_3
    const/4 v7, 0x1

    .line 191
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v3, v0}, Lorg/b/a/e;->a(ILjava/lang/Object;)V

    move v0, v7

    .line 184
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 195
    :cond_5
    if-nez v0, :cond_0

    .line 196
    iget-boolean v0, p0, Lorg/b/a/j;->q:Z

    if-eqz v0, :cond_7

    .line 198
    :cond_6
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 200
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Unknown Property: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object v7, p2

    .line 206
    check-cast v7, Lorg/b/a/h;

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-interface {p2}, Lorg/b/a/e;->a_()I

    move-result v3

    move-object v0, p2

    check-cast v0, Lorg/b/a/h;

    invoke-virtual {v0}, Lorg/b/a/h;->c()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lorg/b/a/g;->g:Lorg/b/a/g;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, v8

    invoke-virtual/range {v0 .. v6}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v9, v0}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    goto/16 :goto_0

    .line 210
    :cond_9
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 211
    return-void
.end method

.method protected a(Lorg/xmlpull/v1/XmlPullParser;Lorg/b/a/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 165
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 166
    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    .line 167
    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    .line 168
    invoke-virtual {p2, v1, v2}, Lorg/b/a/h;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 170
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Lorg/b/a/e;)V

    .line 171
    return-void
.end method

.method protected a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/Object;Lorg/b/a/g;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x2

    .line 632
    if-nez p2, :cond_1

    .line 633
    iget-object v1, p0, Lorg/b/a/j;->i:Ljava/lang/String;

    iget v0, p0, Lorg/b/a/j;->f:I

    const/16 v2, 0x78

    if-lt v0, v2, :cond_0

    const-string v0, "nil"

    :goto_0
    const-string v2, "true"

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 651
    :goto_1
    return-void

    .line 633
    :cond_0
    const-string v0, "null"

    goto :goto_0

    .line 636
    :cond_1
    invoke-virtual {p0, v6, p2}, Lorg/b/a/j;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 637
    iget-boolean v0, p3, Lorg/b/a/g;->m:Z

    if-nez v0, :cond_2

    aget-object v0, v1, v4

    if-eqz v0, :cond_5

    .line 638
    :cond_2
    iget-object v0, p0, Lorg/b/a/j;->n:Ljava/util/Vector;

    invoke-virtual {v0, p2}, Ljava/util/Vector;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 639
    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    .line 640
    iget-object v0, p0, Lorg/b/a/j;->n:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    .line 641
    iget-object v2, p0, Lorg/b/a/j;->n:Ljava/util/Vector;

    invoke-virtual {v2, p2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 643
    :cond_3
    const-string v2, "href"

    aget-object v3, v1, v4

    if-nez v3, :cond_4

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "#o"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-interface {p1, v6, v2, v0}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "#"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 645
    :cond_5
    iget-boolean v0, p0, Lorg/b/a/j;->o:Z

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v2, p3, Lorg/b/a/g;->l:Ljava/lang/Object;

    if-eq v0, v2, :cond_7

    .line 646
    :cond_6
    const/4 v0, 0x0

    aget-object v0, v1, v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0, v5}, Lorg/xmlpull/v1/XmlSerializer;->getPrefix(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    .line 647
    iget-object v2, p0, Lorg/b/a/j;->i:Ljava/lang/String;

    const-string v3, "type"

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v4, ":"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    aget-object v4, v1, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v3, v0}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 649
    :cond_7
    const/4 v0, 0x3

    aget-object v0, v1, v0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/Object;Lorg/b/a/g;Ljava/lang/Object;)V

    goto/16 :goto_1
.end method

.method protected a(Lorg/xmlpull/v1/XmlSerializer;Ljava/util/Vector;Lorg/b/a/g;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 670
    const-string v1, "item"

    .line 673
    if-nez p3, :cond_1

    .line 674
    sget-object p3, Lorg/b/a/g;->g:Lorg/b/a/g;

    move-object v2, v1

    move-object v1, v0

    .line 682
    :goto_0
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v6

    .line 683
    iget-object v5, p3, Lorg/b/a/g;->l:Ljava/lang/Object;

    invoke-virtual {p0, v5, v0}, Lorg/b/a/j;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    .line 686
    iget-boolean v0, p0, Lorg/b/a/j;->o:Z

    if-nez v0, :cond_2

    .line 687
    iget-object v7, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v8, "arrayType"

    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    aget-object v0, v5, v3

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0, v3}, Lorg/xmlpull/v1/XmlSerializer;->getPrefix(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v9, ":"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    aget-object v5, v5, v4

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v5, "["

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v5, "]"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v7, v8, v0}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    :cond_0
    :goto_1
    move v5, v3

    move v0, v3

    .line 700
    :goto_2
    if-ge v5, v6, :cond_5

    .line 701
    invoke-virtual {p2, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_3

    move v0, v4

    .line 700
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 675
    :cond_1
    instance-of v2, p3, Lorg/b/a/g;

    if-eqz v2, :cond_6

    .line 676
    iget-object v2, p3, Lorg/b/a/g;->h:Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 677
    iget-object v2, p3, Lorg/b/a/g;->h:Ljava/lang/String;

    .line 678
    iget-object v1, p3, Lorg/b/a/g;->i:Ljava/lang/String;

    goto :goto_0

    .line 693
    :cond_2
    if-nez v1, :cond_0

    .line 695
    aget-object v0, v5, v3

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    goto :goto_1

    .line 704
    :cond_3
    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 705
    if-eqz v0, :cond_4

    .line 706
    iget-object v0, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v7, "position"

    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    const-string v9, "["

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v8

    const-string v9, "]"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1, v0, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    move v0, v3

    .line 709
    :cond_4
    invoke-virtual {p2, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, p1, v7, p3}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/Object;Lorg/b/a/g;)V

    .line 710
    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto :goto_3

    .line 713
    :cond_5
    return-void

    :cond_6
    move-object v2, v1

    move-object v1, v0

    goto/16 :goto_0
.end method

.method public a(Lorg/xmlpull/v1/XmlSerializer;Lorg/b/a/e;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v12, 0x1

    const/4 v5, 0x0

    .line 580
    invoke-interface {p2}, Lorg/b/a/e;->a_()I

    move-result v6

    .line 581
    new-instance v7, Lorg/b/a/g;

    invoke-direct {v7}, Lorg/b/a/g;-><init>()V

    move v4, v5

    .line 585
    :goto_0
    if-ge v4, v6, :cond_5

    .line 587
    invoke-interface {p2, v4}, Lorg/b/a/e;->a_(I)Ljava/lang/Object;

    move-result-object v0

    .line 589
    iget-object v1, p0, Lorg/b/a/j;->l:Ljava/util/Hashtable;

    invoke-interface {p2, v4, v1, v7}, Lorg/b/a/e;->a(ILjava/util/Hashtable;Lorg/b/a/g;)V

    .line 591
    instance-of v1, v0, Lorg/b/a/h;

    if-nez v1, :cond_1

    .line 593
    iget v0, v7, Lorg/b/a/g;->j:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    .line 594
    iget-object v0, v7, Lorg/b/a/g;->i:Ljava/lang/String;

    iget-object v1, v7, Lorg/b/a/g;->h:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 595
    invoke-interface {p2, v4}, Lorg/b/a/e;->a_(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v0, v7}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/Object;Lorg/b/a/g;)V

    .line 596
    iget-object v0, v7, Lorg/b/a/g;->i:Ljava/lang/String;

    iget-object v1, v7, Lorg/b/a/g;->h:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 585
    :cond_0
    :goto_1
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    .line 600
    :cond_1
    check-cast v0, Lorg/b/a/h;

    .line 602
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lorg/b/a/j;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    .line 603
    aget-object v1, v8, v5

    check-cast v1, Ljava/lang/String;

    .line 604
    aget-object v1, v8, v12

    check-cast v1, Ljava/lang/String;

    .line 607
    iget-object v2, v7, Lorg/b/a/g;->h:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, v7, Lorg/b/a/g;->h:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    .line 608
    iget-object v2, v7, Lorg/b/a/g;->h:Ljava/lang/String;

    move-object v3, v2

    .line 614
    :goto_2
    iget-object v2, v7, Lorg/b/a/g;->i:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v2, v7, Lorg/b/a/g;->i:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_4

    .line 615
    iget-object v2, v7, Lorg/b/a/g;->i:Ljava/lang/String;

    .line 620
    :goto_3
    invoke-interface {p1, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 621
    iget-boolean v8, p0, Lorg/b/a/j;->o:Z

    if-nez v8, :cond_2

    .line 622
    invoke-interface {p1, v2, v12}, Lorg/xmlpull/v1/XmlSerializer;->getPrefix(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    .line 623
    iget-object v9, p0, Lorg/b/a/j;->i:Ljava/lang/String;

    const-string v10, "type"

    new-instance v11, Ljava/lang/StringBuffer;

    invoke-direct {v11}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v8

    const-string v11, ":"

    invoke-virtual {v8, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v9, v10, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 625
    :cond_2
    invoke-virtual {p0, p1, v0}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Lorg/b/a/h;)V

    .line 626
    invoke-interface {p1, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto :goto_1

    .line 610
    :cond_3
    aget-object v2, v8, v12

    check-cast v2, Ljava/lang/String;

    move-object v3, v2

    goto :goto_2

    .line 617
    :cond_4
    aget-object v2, v8, v5

    check-cast v2, Ljava/lang/String;

    goto :goto_3

    .line 629
    :cond_5
    return-void
.end method

.method public a(Lorg/xmlpull/v1/XmlSerializer;Lorg/b/a/h;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 565
    .line 566
    invoke-virtual {p2}, Lorg/b/a/h;->a()I

    move-result v1

    .line 567
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 568
    new-instance v2, Lorg/b/a/b;

    invoke-direct {v2}, Lorg/b/a/b;-><init>()V

    .line 569
    invoke-virtual {p2, v0, v2}, Lorg/b/a/h;->a(ILorg/b/a/b;)V

    .line 570
    invoke-virtual {v2}, Lorg/b/a/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lorg/b/a/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lorg/b/a/b;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v3, v4, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 567
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 573
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Lorg/b/a/e;)V

    .line 574
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 459
    if-nez p1, :cond_6

    .line 460
    instance-of v0, p2, Lorg/b/a/h;

    if-nez v0, :cond_0

    instance-of v0, p2, Lorg/b/a/i;

    if-eqz v0, :cond_2

    :cond_0
    move-object v0, p2

    .line 466
    :goto_0
    instance-of v1, v0, Lorg/b/a/h;

    if-eqz v1, :cond_3

    .line 467
    check-cast v0, Lorg/b/a/h;

    .line 468
    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/b/a/h;->c()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {v0}, Lorg/b/a/h;->b()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v5

    aput-object v3, v1, v6

    aput-object v3, v1, v7

    move-object v0, v1

    .line 480
    :cond_1
    :goto_1
    return-object v0

    .line 463
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    .line 470
    :cond_3
    instance-of v1, v0, Lorg/b/a/i;

    if-eqz v1, :cond_4

    .line 471
    check-cast v0, Lorg/b/a/i;

    .line 472
    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/b/a/i;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {v0}, Lorg/b/a/i;->c()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v5

    aput-object v3, v1, v6

    sget-object v0, Lorg/b/a/j;->k:Lorg/b/a/f;

    aput-object v0, v1, v7

    move-object v0, v1

    goto :goto_1

    .line 474
    :cond_4
    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_5

    sget-object v1, Lorg/b/a/g;->a:Ljava/lang/Class;

    if-eq v0, v1, :cond_5

    .line 475
    iget-object v1, p0, Lorg/b/a/j;->s:Ljava/util/Hashtable;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 476
    if-nez v0, :cond_1

    .line 480
    :cond_5
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lorg/b/a/j;->j:Ljava/lang/String;

    aput-object v1, v0, v4

    const-string v1, "anyType"

    aput-object v1, v0, v5

    aput-object v3, v0, v6

    aput-object v3, v0, v7

    goto :goto_1

    :cond_6
    move-object v0, p1

    goto :goto_0
.end method

.method public c(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v8, 0x2

    .line 135
    iput-object v2, p0, Lorg/b/a/j;->a:Ljava/lang/Object;

    .line 136
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 137
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v8, :cond_2

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/b/a/j;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Fault"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 140
    iget v0, p0, Lorg/b/a/j;->f:I

    const/16 v1, 0x78

    if-ge v0, v1, :cond_1

    .line 141
    new-instance v0, Lorg/b/c;

    iget v1, p0, Lorg/b/a/j;->f:I

    invoke-direct {v0, v1}, Lorg/b/c;-><init>(I)V

    .line 145
    :goto_0
    invoke-virtual {v0, p1}, Lorg/b/c;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 146
    iput-object v0, p0, Lorg/b/a/j;->a:Ljava/lang/Object;

    .line 159
    :cond_0
    return-void

    .line 143
    :cond_1
    new-instance v0, Lorg/b/d;

    iget v1, p0, Lorg/b/a/j;->f:I

    invoke-direct {v0, v1}, Lorg/b/d;-><init>(I)V

    goto :goto_0

    .line 148
    :cond_2
    :goto_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v8, :cond_0

    .line 149
    iget-object v0, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v1, "root"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 151
    const/4 v3, -0x1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lorg/b/a/g;->g:Lorg/b/a/g;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;

    move-result-object v0

    .line 153
    const-string v1, "1"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lorg/b/a/j;->a:Ljava/lang/Object;

    if-nez v1, :cond_4

    .line 154
    :cond_3
    iput-object v0, p0, Lorg/b/a/j;->a:Ljava/lang/Object;

    .line 156
    :cond_4
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    goto :goto_1
.end method

.method public c(Lorg/xmlpull/v1/XmlSerializer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 543
    iget-object v0, p0, Lorg/b/a/j;->b:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 544
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/b/a/j;->n:Ljava/util/Vector;

    .line 545
    iget-object v0, p0, Lorg/b/a/j;->n:Ljava/util/Vector;

    iget-object v1, p0, Lorg/b/a/j;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 546
    iget-object v0, p0, Lorg/b/a/j;->b:Ljava/lang/Object;

    invoke-virtual {p0, v4, v0}, Lorg/b/a/j;->a(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 547
    iget-boolean v0, p0, Lorg/b/a/j;->p:Z

    if-eqz v0, :cond_3

    const-string v0, ""

    move-object v1, v0

    :goto_0
    aget-object v0, v2, v6

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 548
    iget-boolean v0, p0, Lorg/b/a/j;->p:Z

    if-eqz v0, :cond_0

    .line 549
    const-string v1, "xmlns"

    aget-object v0, v2, v5

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v4, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 551
    :cond_0
    iget-boolean v0, p0, Lorg/b/a/j;->t:Z

    if-eqz v0, :cond_1

    .line 552
    const-string v1, "id"

    aget-object v0, v2, v3

    if-nez v0, :cond_4

    const-string v0, "o0"

    :goto_1
    invoke-interface {p1, v4, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 553
    iget-object v0, p0, Lorg/b/a/j;->h:Ljava/lang/String;

    const-string v1, "root"

    const-string v3, "1"

    invoke-interface {p1, v0, v1, v3}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 555
    :cond_1
    iget-object v0, p0, Lorg/b/a/j;->b:Ljava/lang/Object;

    const/4 v1, 0x3

    aget-object v1, v2, v1

    invoke-direct {p0, p1, v0, v4, v1}, Lorg/b/a/j;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/Object;Lorg/b/a/g;Ljava/lang/Object;)V

    .line 556
    iget-boolean v0, p0, Lorg/b/a/j;->p:Z

    if-eqz v0, :cond_5

    const-string v0, ""

    move-object v1, v0

    :goto_2
    aget-object v0, v2, v6

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 558
    :cond_2
    return-void

    .line 547
    :cond_3
    aget-object v0, v2, v5

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    goto :goto_0

    .line 552
    :cond_4
    aget-object v0, v2, v3

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    .line 556
    :cond_5
    aget-object v0, v2, v5

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    goto :goto_2
.end method
