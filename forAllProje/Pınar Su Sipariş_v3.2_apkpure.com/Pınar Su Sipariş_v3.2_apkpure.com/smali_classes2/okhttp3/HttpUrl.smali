.class public final Lokhttp3/HttpUrl;
.super Ljava/lang/Object;
.source "HttpUrl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/HttpUrl$Builder;
    }
.end annotation


# static fields
.field static final FORM_ENCODE_SET:Ljava/lang/String; = " \"\':;<=>@[]^`{}|/\\?#&!$(),~"

.field static final FRAGMENT_ENCODE_SET:Ljava/lang/String; = ""

.field static final FRAGMENT_ENCODE_SET_URI:Ljava/lang/String; = " \"#<>\\^`{|}"

.field private static final HEX_DIGITS:[C

.field static final PASSWORD_ENCODE_SET:Ljava/lang/String; = " \"\':;<=>@[]^`{}|/\\?#"

.field static final PATH_SEGMENT_ENCODE_SET:Ljava/lang/String; = " \"<>^`{}|/\\?#"

.field static final PATH_SEGMENT_ENCODE_SET_URI:Ljava/lang/String; = "[]"

.field static final QUERY_COMPONENT_ENCODE_SET:Ljava/lang/String; = " \"\'<>#&="

.field static final QUERY_COMPONENT_ENCODE_SET_URI:Ljava/lang/String; = "\\^`{|}"

.field static final QUERY_ENCODE_SET:Ljava/lang/String; = " \"\'<>#"

.field static final USERNAME_ENCODE_SET:Ljava/lang/String; = " \"\':;<=>@[]^`{}|/\\?#"


# instance fields
.field private final fragment:Ljava/lang/String;

.field private final host:Ljava/lang/String;

.field private final password:Ljava/lang/String;

.field private final pathSegments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final port:I

.field private final queryNamesAndValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final scheme:Ljava/lang/String;

.field private final url:Ljava/lang/String;

.field private final username:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 279
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lokhttp3/HttpUrl;->HEX_DIGITS:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method private constructor <init>(Lokhttp3/HttpUrl$Builder;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 327
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 328
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->scheme:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    .line 329
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->encodedUsername:Ljava/lang/String;

    invoke-static {v0, v3}, Lokhttp3/HttpUrl;->percentDecode(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/HttpUrl;->username:Ljava/lang/String;

    .line 330
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->encodedPassword:Ljava/lang/String;

    invoke-static {v0, v3}, Lokhttp3/HttpUrl;->percentDecode(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/HttpUrl;->password:Ljava/lang/String;

    .line 331
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->host:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/HttpUrl;->host:Ljava/lang/String;

    .line 332
    invoke-virtual {p1}, Lokhttp3/HttpUrl$Builder;->effectivePort()I

    move-result v0

    iput v0, p0, Lokhttp3/HttpUrl;->port:I

    .line 333
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->encodedPathSegments:Ljava/util/List;

    invoke-direct {p0, v0, v3}, Lokhttp3/HttpUrl;->percentDecode(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/HttpUrl;->pathSegments:Ljava/util/List;

    .line 334
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->encodedQueryNamesAndValues:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->encodedQueryNamesAndValues:Ljava/util/List;

    const/4 v2, 0x1

    .line 335
    invoke-direct {p0, v0, v2}, Lokhttp3/HttpUrl;->percentDecode(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    .line 337
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->encodedFragment:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->encodedFragment:Ljava/lang/String;

    .line 338
    invoke-static {v0, v3}, Lokhttp3/HttpUrl;->percentDecode(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    :cond_0
    iput-object v1, p0, Lokhttp3/HttpUrl;->fragment:Ljava/lang/String;

    .line 340
    invoke-virtual {p1}, Lokhttp3/HttpUrl$Builder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    .line 341
    return-void

    :cond_1
    move-object v0, v1

    .line 335
    goto :goto_0
.end method

.method synthetic constructor <init>(Lokhttp3/HttpUrl$Builder;Lokhttp3/HttpUrl$1;)V
    .locals 0

    .prologue
    .line 278
    invoke-direct {p0, p1}, Lokhttp3/HttpUrl;-><init>(Lokhttp3/HttpUrl$Builder;)V

    return-void
.end method

.method static synthetic access$100(Lokhttp3/HttpUrl;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lokhttp3/HttpUrl;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lokhttp3/HttpUrl;->host:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lokhttp3/HttpUrl;)I
    .locals 1

    .prologue
    .line 278
    iget v0, p0, Lokhttp3/HttpUrl;->port:I

    return v0
.end method

.method static canonicalize(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 9

    .prologue
    .line 1518
    move v2, p1

    :goto_0
    if-ge v2, p2, :cond_4

    .line 1519
    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    .line 1520
    const/16 v1, 0x20

    if-lt v0, v1, :cond_2

    const/16 v1, 0x7f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x80

    if-lt v0, v1, :cond_0

    if-nez p7, :cond_2

    .line 1523
    :cond_0
    invoke-virtual {p3, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_2

    const/16 v1, 0x25

    if-ne v0, v1, :cond_1

    if-eqz p4, :cond_2

    if-eqz p5, :cond_1

    .line 1524
    invoke-static {p0, v2, p2}, Lokhttp3/HttpUrl;->percentEncoded(Ljava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const/16 v1, 0x2b

    if-ne v0, v1, :cond_3

    if-eqz p6, :cond_3

    .line 1527
    :cond_2
    new-instance v0, Lb/c;

    invoke-direct {v0}, Lb/c;-><init>()V

    .line 1528
    invoke-virtual {v0, p0, p1, v2}, Lb/c;->a(Ljava/lang/String;II)Lb/c;

    move-object v1, p0

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move/from16 v8, p7

    .line 1529
    invoke-static/range {v0 .. v8}, Lokhttp3/HttpUrl;->canonicalize(Lb/c;Ljava/lang/String;IILjava/lang/String;ZZZZ)V

    .line 1531
    invoke-virtual {v0}, Lb/c;->q()Ljava/lang/String;

    move-result-object v0

    .line 1536
    :goto_1
    return-object v0

    .line 1518
    :cond_3
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    add-int/2addr v2, v0

    goto :goto_0

    .line 1536
    :cond_4
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method static canonicalize(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 8

    .prologue
    .line 1576
    const/4 v1, 0x0

    .line 1577
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    .line 1576
    invoke-static/range {v0 .. v7}, Lokhttp3/HttpUrl;->canonicalize(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static canonicalize(Lb/c;Ljava/lang/String;IILjava/lang/String;ZZZZ)V
    .locals 6

    .prologue
    const/16 v5, 0x25

    .line 1541
    const/4 v0, 0x0

    .line 1543
    :goto_0
    if-ge p2, p3, :cond_8

    .line 1544
    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    .line 1545
    if-eqz p5, :cond_1

    const/16 v1, 0x9

    if-eq v2, v1, :cond_0

    const/16 v1, 0xa

    if-eq v2, v1, :cond_0

    const/16 v1, 0xc

    if-eq v2, v1, :cond_0

    const/16 v1, 0xd

    if-ne v2, v1, :cond_1

    .line 1543
    :cond_0
    :goto_1
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr p2, v1

    goto :goto_0

    .line 1548
    :cond_1
    const/16 v1, 0x2b

    if-ne v2, v1, :cond_3

    if-eqz p7, :cond_3

    .line 1550
    if-eqz p5, :cond_2

    const-string v1, "+"

    :goto_2
    invoke-virtual {p0, v1}, Lb/c;->a(Ljava/lang/String;)Lb/c;

    goto :goto_1

    :cond_2
    const-string v1, "%2B"

    goto :goto_2

    .line 1551
    :cond_3
    const/16 v1, 0x20

    if-lt v2, v1, :cond_5

    const/16 v1, 0x7f

    if-eq v2, v1, :cond_5

    const/16 v1, 0x80

    if-lt v2, v1, :cond_4

    if-nez p8, :cond_5

    .line 1554
    :cond_4
    invoke-virtual {p4, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_5

    if-ne v2, v5, :cond_7

    if-eqz p5, :cond_5

    if-eqz p6, :cond_7

    .line 1555
    invoke-static {p1, p2, p3}, Lokhttp3/HttpUrl;->percentEncoded(Ljava/lang/String;II)Z

    move-result v1

    if-nez v1, :cond_7

    .line 1557
    :cond_5
    if-nez v0, :cond_6

    .line 1558
    new-instance v0, Lb/c;

    invoke-direct {v0}, Lb/c;-><init>()V

    .line 1560
    :cond_6
    invoke-virtual {v0, v2}, Lb/c;->a(I)Lb/c;

    .line 1561
    :goto_3
    invoke-virtual {v0}, Lb/c;->f()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1562
    invoke-virtual {v0}, Lb/c;->i()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    .line 1563
    invoke-virtual {p0, v5}, Lb/c;->b(I)Lb/c;

    .line 1564
    sget-object v3, Lokhttp3/HttpUrl;->HEX_DIGITS:[C

    shr-int/lit8 v4, v1, 0x4

    and-int/lit8 v4, v4, 0xf

    aget-char v3, v3, v4

    invoke-virtual {p0, v3}, Lb/c;->b(I)Lb/c;

    .line 1565
    sget-object v3, Lokhttp3/HttpUrl;->HEX_DIGITS:[C

    and-int/lit8 v1, v1, 0xf

    aget-char v1, v3, v1

    invoke-virtual {p0, v1}, Lb/c;->b(I)Lb/c;

    goto :goto_3

    .line 1569
    :cond_7
    invoke-virtual {p0, v2}, Lb/c;->a(I)Lb/c;

    goto :goto_1

    .line 1572
    :cond_8
    return-void
.end method

.method static decodeHexDigit(C)I
    .locals 1

    .prologue
    .line 1493
    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    add-int/lit8 v0, p0, -0x30

    .line 1496
    :goto_0
    return v0

    .line 1494
    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 v0, p0, -0x61

    add-int/lit8 v0, v0, 0xa

    goto :goto_0

    .line 1495
    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0xa

    goto :goto_0

    .line 1496
    :cond_2
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static defaultPort(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 443
    const-string v0, "http"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 444
    const/16 v0, 0x50

    .line 448
    :goto_0
    return v0

    .line 445
    :cond_0
    const-string v0, "https"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 446
    const/16 v0, 0x1bb

    goto :goto_0

    .line 448
    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static get(Ljava/net/URI;)Lokhttp3/HttpUrl;
    .locals 1

    .prologue
    .line 679
    invoke-virtual {p0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    return-object v0
.end method

.method public static get(Ljava/net/URL;)Lokhttp3/HttpUrl;
    .locals 1

    .prologue
    .line 652
    invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    return-object v0
.end method

.method static getChecked(Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .prologue
    .line 663
    new-instance v0, Lokhttp3/HttpUrl$Builder;

    invoke-direct {v0}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 664
    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Lokhttp3/HttpUrl$Builder;->parse(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder$ParseResult;

    move-result-object v1

    .line 665
    sget-object v2, Lokhttp3/HttpUrl$1;->$SwitchMap$okhttp3$HttpUrl$Builder$ParseResult:[I

    invoke-virtual {v1}, Lokhttp3/HttpUrl$Builder$ParseResult;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 674
    new-instance v0, Ljava/net/MalformedURLException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid URL: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 667
    :pswitch_0
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object v0

    return-object v0

    .line 669
    :pswitch_1
    new-instance v0, Ljava/net/UnknownHostException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid host: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 665
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static namesAndValuesToQueryString(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 503
    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    move v2, v0

    :goto_0
    if-ge v2, v3, :cond_2

    .line 504
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 505
    add-int/lit8 v1, v2, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 506
    if-lez v2, :cond_0

    const/16 v4, 0x26

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 507
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    if-eqz v1, :cond_1

    .line 509
    const/16 v0, 0x3d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 510
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    :cond_1
    add-int/lit8 v0, v2, 0x2

    move v2, v0

    goto :goto_0

    .line 513
    :cond_2
    return-void
.end method

.method public static parse(Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 642
    new-instance v1, Lokhttp3/HttpUrl$Builder;

    invoke-direct {v1}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 643
    invoke-virtual {v1, v0, p0}, Lokhttp3/HttpUrl$Builder;->parse(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder$ParseResult;

    move-result-object v2

    .line 644
    sget-object v3, Lokhttp3/HttpUrl$Builder$ParseResult;->SUCCESS:Lokhttp3/HttpUrl$Builder$ParseResult;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method static pathSegmentsToString(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 467
    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 468
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 469
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 471
    :cond_0
    return-void
.end method

.method static percentDecode(Ljava/lang/String;IIZ)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1450
    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_2

    .line 1451
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 1452
    const/16 v2, 0x25

    if-eq v1, v2, :cond_0

    const/16 v2, 0x2b

    if-ne v1, v2, :cond_1

    if-eqz p3, :cond_1

    .line 1454
    :cond_0
    new-instance v1, Lb/c;

    invoke-direct {v1}, Lb/c;-><init>()V

    .line 1455
    invoke-virtual {v1, p0, p1, v0}, Lb/c;->a(Ljava/lang/String;II)Lb/c;

    .line 1456
    invoke-static {v1, p0, v0, p2, p3}, Lokhttp3/HttpUrl;->percentDecode(Lb/c;Ljava/lang/String;IIZ)V

    .line 1457
    invoke-virtual {v1}, Lb/c;->q()Ljava/lang/String;

    move-result-object v0

    .line 1462
    :goto_1
    return-object v0

    .line 1450
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1462
    :cond_2
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method static percentDecode(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1438
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {p0, v0, v1, p1}, Lokhttp3/HttpUrl;->percentDecode(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private percentDecode(Ljava/util/List;Z)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1442
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1443
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1444
    if-eqz v0, :cond_0

    invoke-static {v0, p2}, Lokhttp3/HttpUrl;->percentDecode(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 1446
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static percentDecode(Lb/c;Ljava/lang/String;IIZ)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 1467
    move v0, p2

    :goto_0
    if-ge v0, p3, :cond_2

    .line 1468
    invoke-virtual {p1, v0}, Ljava/lang/String;->codePointAt(I)I

    move-result v1

    .line 1469
    const/16 v2, 0x25

    if-ne v1, v2, :cond_0

    add-int/lit8 v2, v0, 0x2

    if-ge v2, p3, :cond_0

    .line 1470
    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lokhttp3/HttpUrl;->decodeHexDigit(C)I

    move-result v2

    .line 1471
    add-int/lit8 v3, v0, 0x2

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lokhttp3/HttpUrl;->decodeHexDigit(C)I

    move-result v3

    .line 1472
    if-eq v2, v4, :cond_1

    if-eq v3, v4, :cond_1

    .line 1473
    shl-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v3

    invoke-virtual {p0, v2}, Lb/c;->b(I)Lb/c;

    .line 1474
    add-int/lit8 v0, v0, 0x2

    .line 1467
    :goto_1
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    .line 1477
    :cond_0
    const/16 v2, 0x2b

    if-ne v1, v2, :cond_1

    if-eqz p4, :cond_1

    .line 1478
    const/16 v2, 0x20

    invoke-virtual {p0, v2}, Lb/c;->b(I)Lb/c;

    goto :goto_1

    .line 1481
    :cond_1
    invoke-virtual {p0, v1}, Lb/c;->a(I)Lb/c;

    goto :goto_1

    .line 1483
    :cond_2
    return-void
.end method

.method static percentEncoded(Ljava/lang/String;II)Z
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 1486
    add-int/lit8 v0, p1, 0x2

    if-ge v0, p2, :cond_0

    .line 1487
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x25

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, p1, 0x1

    .line 1488
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lokhttp3/HttpUrl;->decodeHexDigit(C)I

    move-result v0

    if-eq v0, v2, :cond_0

    add-int/lit8 v0, p1, 0x2

    .line 1489
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lokhttp3/HttpUrl;->decodeHexDigit(C)I

    move-result v0

    if-eq v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static queryStringToNamesAndValues(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, -0x1

    .line 522
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 523
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v0, v1, :cond_3

    .line 524
    const/16 v1, 0x26

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    .line 525
    if-ne v1, v4, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 527
    :cond_0
    const/16 v3, 0x3d

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 528
    if-eq v3, v4, :cond_1

    if-le v3, v1, :cond_2

    .line 529
    :cond_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 530
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 535
    :goto_1
    add-int/lit8 v0, v1, 0x1

    .line 536
    goto :goto_0

    .line 532
    :cond_2
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 533
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 537
    :cond_3
    return-object v2
.end method


# virtual methods
.method public encodedFragment()Ljava/lang/String;
    .locals 2

    .prologue
    .line 594
    iget-object v0, p0, Lokhttp3/HttpUrl;->fragment:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 596
    :goto_0
    return-object v0

    .line 595
    :cond_0
    iget-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 596
    iget-object v1, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public encodedPassword()Ljava/lang/String;
    .locals 3

    .prologue
    .line 403
    iget-object v0, p0, Lokhttp3/HttpUrl;->password:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    .line 406
    :goto_0
    return-object v0

    .line 404
    :cond_0
    iget-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    const/16 v1, 0x3a

    iget-object v2, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 405
    iget-object v1, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 406
    iget-object v2, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public encodedPath()Ljava/lang/String;
    .locals 4

    .prologue
    .line 461
    iget-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    const/16 v1, 0x2f

    iget-object v2, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 462
    iget-object v1, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    iget-object v2, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "?#"

    invoke-static {v1, v0, v2, v3}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    .line 463
    iget-object v2, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public encodedPathSegments()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/16 v5, 0x2f

    .line 474
    iget-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 475
    iget-object v1, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    iget-object v2, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "?#"

    invoke-static {v1, v0, v2, v3}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    .line 476
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 477
    :goto_0
    if-ge v0, v1, :cond_0

    .line 478
    add-int/lit8 v3, v0, 0x1

    .line 479
    iget-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-static {v0, v3, v1, v5}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IIC)I

    move-result v0

    .line 480
    iget-object v4, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v4, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 483
    :cond_0
    return-object v2
.end method

.method public encodedQuery()Ljava/lang/String;
    .locals 5

    .prologue
    .line 496
    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 499
    :goto_0
    return-object v0

    .line 497
    :cond_0
    iget-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 498
    iget-object v1, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    add-int/lit8 v2, v0, 0x1

    iget-object v3, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x23

    invoke-static {v1, v2, v3, v4}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IIC)I

    move-result v1

    .line 499
    iget-object v2, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public encodedUsername()Ljava/lang/String;
    .locals 4

    .prologue
    .line 391
    iget-object v0, p0, Lokhttp3/HttpUrl;->username:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    .line 394
    :goto_0
    return-object v0

    .line 392
    :cond_0
    iget-object v0, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    .line 393
    iget-object v1, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    iget-object v2, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, ":@"

    invoke-static {v1, v0, v2, v3}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    .line 394
    iget-object v2, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 683
    instance-of v0, p1, Lokhttp3/HttpUrl;

    if-eqz v0, :cond_0

    check-cast p1, Lokhttp3/HttpUrl;

    iget-object v0, p1, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public fragment()Ljava/lang/String;
    .locals 1

    .prologue
    .line 600
    iget-object v0, p0, Lokhttp3/HttpUrl;->fragment:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 687
    iget-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public host()Ljava/lang/String;
    .locals 1

    .prologue
    .line 426
    iget-object v0, p0, Lokhttp3/HttpUrl;->host:Ljava/lang/String;

    return-object v0
.end method

.method public isHttps()Z
    .locals 2

    .prologue
    .line 386
    iget-object v0, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public newBuilder()Lokhttp3/HttpUrl$Builder;
    .locals 3

    .prologue
    .line 613
    new-instance v1, Lokhttp3/HttpUrl$Builder;

    invoke-direct {v1}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 614
    iget-object v0, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    iput-object v0, v1, Lokhttp3/HttpUrl$Builder;->scheme:Ljava/lang/String;

    .line 615
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->encodedUsername()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lokhttp3/HttpUrl$Builder;->encodedUsername:Ljava/lang/String;

    .line 616
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->encodedPassword()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lokhttp3/HttpUrl$Builder;->encodedPassword:Ljava/lang/String;

    .line 617
    iget-object v0, p0, Lokhttp3/HttpUrl;->host:Ljava/lang/String;

    iput-object v0, v1, Lokhttp3/HttpUrl$Builder;->host:Ljava/lang/String;

    .line 619
    iget v0, p0, Lokhttp3/HttpUrl;->port:I

    iget-object v2, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    invoke-static {v2}, Lokhttp3/HttpUrl;->defaultPort(Ljava/lang/String;)I

    move-result v2

    if-eq v0, v2, :cond_0

    iget v0, p0, Lokhttp3/HttpUrl;->port:I

    :goto_0
    iput v0, v1, Lokhttp3/HttpUrl$Builder;->port:I

    .line 620
    iget-object v0, v1, Lokhttp3/HttpUrl$Builder;->encodedPathSegments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 621
    iget-object v0, v1, Lokhttp3/HttpUrl$Builder;->encodedPathSegments:Ljava/util/List;

    invoke-virtual {p0}, Lokhttp3/HttpUrl;->encodedPathSegments()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 622
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->encodedQuery()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lokhttp3/HttpUrl$Builder;->encodedQuery(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 623
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->encodedFragment()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lokhttp3/HttpUrl$Builder;->encodedFragment:Ljava/lang/String;

    .line 624
    return-object v1

    .line 619
    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public newBuilder(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;
    .locals 3

    .prologue
    .line 632
    new-instance v0, Lokhttp3/HttpUrl$Builder;

    invoke-direct {v0}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 633
    invoke-virtual {v0, p0, p1}, Lokhttp3/HttpUrl$Builder;->parse(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder$ParseResult;

    move-result-object v1

    .line 634
    sget-object v2, Lokhttp3/HttpUrl$Builder$ParseResult;->SUCCESS:Lokhttp3/HttpUrl$Builder$ParseResult;

    if-ne v1, v2, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public password()Ljava/lang/String;
    .locals 1

    .prologue
    .line 411
    iget-object v0, p0, Lokhttp3/HttpUrl;->password:Ljava/lang/String;

    return-object v0
.end method

.method public pathSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 487
    iget-object v0, p0, Lokhttp3/HttpUrl;->pathSegments:Ljava/util/List;

    return-object v0
.end method

.method public pathSize()I
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lokhttp3/HttpUrl;->pathSegments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public port()I
    .locals 1

    .prologue
    .line 435
    iget v0, p0, Lokhttp3/HttpUrl;->port:I

    return v0
.end method

.method public query()Ljava/lang/String;
    .locals 2

    .prologue
    .line 541
    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 544
    :goto_0
    return-object v0

    .line 542
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 543
    iget-object v1, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    invoke-static {v0, v1}, Lokhttp3/HttpUrl;->namesAndValuesToQueryString(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 544
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public queryParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 556
    iget-object v1, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    if-nez v1, :cond_1

    .line 562
    :cond_0
    :goto_0
    return-object v0

    .line 557
    :cond_1
    const/4 v1, 0x0

    iget-object v2, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_0

    .line 558
    iget-object v3, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 559
    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    .line 557
    :cond_2
    add-int/lit8 v1, v1, 0x2

    goto :goto_1
.end method

.method public queryParameterName(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 586
    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    mul-int/lit8 v1, p1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public queryParameterNames()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 566
    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    .line 571
    :goto_0
    return-object v0

    .line 567
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 568
    const/4 v0, 0x0

    iget-object v2, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v0, v2, :cond_1

    .line 569
    iget-object v3, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 568
    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    .line 571
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0
.end method

.method public queryParameterValue(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 590
    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    mul-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public queryParameterValues(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 575
    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 582
    :goto_0
    return-object v0

    .line 576
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 577
    const/4 v0, 0x0

    iget-object v2, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v0, v2, :cond_2

    .line 578
    iget-object v3, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 579
    iget-object v3, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    add-int/lit8 v4, v0, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 577
    :cond_1
    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    .line 582
    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public querySize()I
    .locals 1

    .prologue
    .line 548
    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/HttpUrl;->queryNamesAndValues:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public resolve(Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 1

    .prologue
    .line 608
    invoke-virtual {p0, p1}, Lokhttp3/HttpUrl;->newBuilder(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    .line 609
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public scheme()Ljava/lang/String;
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lokhttp3/HttpUrl;->scheme:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 691
    iget-object v0, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    return-object v0
.end method

.method public uri()Ljava/net/URI;
    .locals 4

    .prologue
    .line 366
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->reencodeForUri()Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 368
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    :goto_0
    return-object v0

    .line 369
    :catch_0
    move-exception v0

    .line 372
    :try_start_1
    const-string v2, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 373
    invoke-static {v1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 374
    :catch_1
    move-exception v1

    .line 375
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public url()Ljava/net/URL;
    .locals 2

    .prologue
    .line 346
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lokhttp3/HttpUrl;->url:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 347
    :catch_0
    move-exception v0

    .line 348
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public username()Ljava/lang/String;
    .locals 1

    .prologue
    .line 398
    iget-object v0, p0, Lokhttp3/HttpUrl;->username:Ljava/lang/String;

    return-object v0
.end method
