.class final Lokhttp3/Cache$Entry;
.super Ljava/lang/Object;
.source "Cache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/Cache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Entry"
.end annotation


# instance fields
.field private final code:I

.field private final handshake:Lokhttp3/Handshake;

.field private final message:Ljava/lang/String;

.field private final protocol:Lokhttp3/Protocol;

.field private final requestMethod:Ljava/lang/String;

.field private final responseHeaders:Lokhttp3/Headers;

.field private final url:Ljava/lang/String;

.field private final varyHeaders:Lokhttp3/Headers;


# direct methods
.method public constructor <init>(Lb/s;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 531
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 533
    :try_start_0
    invoke-static {p1}, Lb/m;->a(Lb/s;)Lb/e;

    move-result-object v3

    .line 534
    invoke-interface {v3}, Lb/e;->r()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    .line 535
    invoke-interface {v3}, Lb/e;->r()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    .line 536
    new-instance v4, Lokhttp3/Headers$Builder;

    invoke-direct {v4}, Lokhttp3/Headers$Builder;-><init>()V

    .line 537
    # invokes: Lokhttp3/Cache;->readInt(Lb/e;)I
    invoke-static {v3}, Lokhttp3/Cache;->access$1000(Lb/e;)I

    move-result v5

    move v2, v1

    .line 538
    :goto_0
    if-ge v2, v5, :cond_0

    .line 539
    invoke-interface {v3}, Lb/e;->r()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lokhttp3/Headers$Builder;->addLenient(Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 538
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 541
    :cond_0
    invoke-virtual {v4}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v2

    iput-object v2, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    .line 543
    invoke-interface {v3}, Lb/e;->r()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lokhttp3/internal/http/StatusLine;->parse(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    move-result-object v2

    .line 544
    iget-object v4, v2, Lokhttp3/internal/http/StatusLine;->protocol:Lokhttp3/Protocol;

    iput-object v4, p0, Lokhttp3/Cache$Entry;->protocol:Lokhttp3/Protocol;

    .line 545
    iget v4, v2, Lokhttp3/internal/http/StatusLine;->code:I

    iput v4, p0, Lokhttp3/Cache$Entry;->code:I

    .line 546
    iget-object v2, v2, Lokhttp3/internal/http/StatusLine;->message:Ljava/lang/String;

    iput-object v2, p0, Lokhttp3/Cache$Entry;->message:Ljava/lang/String;

    .line 547
    new-instance v2, Lokhttp3/Headers$Builder;

    invoke-direct {v2}, Lokhttp3/Headers$Builder;-><init>()V

    .line 548
    # invokes: Lokhttp3/Cache;->readInt(Lb/e;)I
    invoke-static {v3}, Lokhttp3/Cache;->access$1000(Lb/e;)I

    move-result v4

    .line 549
    :goto_1
    if-ge v1, v4, :cond_1

    .line 550
    invoke-interface {v3}, Lb/e;->r()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lokhttp3/Headers$Builder;->addLenient(Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 549
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 552
    :cond_1
    invoke-virtual {v2}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    .line 554
    invoke-direct {p0}, Lokhttp3/Cache$Entry;->isHttps()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 555
    invoke-interface {v3}, Lb/e;->r()Ljava/lang/String;

    move-result-object v1

    .line 556
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    .line 557
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 571
    :catchall_0
    move-exception v0

    invoke-interface {p1}, Lb/s;->close()V

    throw v0

    .line 559
    :cond_2
    :try_start_1
    invoke-interface {v3}, Lb/e;->r()Ljava/lang/String;

    move-result-object v1

    .line 560
    invoke-static {v1}, Lokhttp3/CipherSuite;->forJavaName(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v1

    .line 561
    invoke-direct {p0, v3}, Lokhttp3/Cache$Entry;->readCertificateList(Lb/e;)Ljava/util/List;

    move-result-object v2

    .line 562
    invoke-direct {p0, v3}, Lokhttp3/Cache$Entry;->readCertificateList(Lb/e;)Ljava/util/List;

    move-result-object v4

    .line 563
    invoke-interface {v3}, Lb/e;->f()Z

    move-result v5

    if-nez v5, :cond_3

    .line 564
    invoke-interface {v3}, Lb/e;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/TlsVersion;->forJavaName(Ljava/lang/String;)Lokhttp3/TlsVersion;

    move-result-object v0

    .line 566
    :cond_3
    invoke-static {v0, v1, v2, v4}, Lokhttp3/Handshake;->get(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)Lokhttp3/Handshake;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 571
    :goto_2
    invoke-interface {p1}, Lb/s;->close()V

    .line 573
    return-void

    .line 568
    :cond_4
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2
.end method

.method public constructor <init>(Lokhttp3/Response;)V
    .locals 1

    .prologue
    .line 575
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 576
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    .line 577
    invoke-static {p1}, Lokhttp3/internal/http/OkHeaders;->varyHeaders(Lokhttp3/Response;)Lokhttp3/Headers;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    .line 578
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    .line 579
    invoke-virtual {p1}, Lokhttp3/Response;->protocol()Lokhttp3/Protocol;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->protocol:Lokhttp3/Protocol;

    .line 580
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v0

    iput v0, p0, Lokhttp3/Cache$Entry;->code:I

    .line 581
    invoke-virtual {p1}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->message:Ljava/lang/String;

    .line 582
    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    .line 583
    invoke-virtual {p1}, Lokhttp3/Response;->handshake()Lokhttp3/Handshake;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    .line 584
    return-void
.end method

.method private isHttps()Z
    .locals 2

    .prologue
    .line 629
    iget-object v0, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private readCertificateList(Lb/e;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/e;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 633
    # invokes: Lokhttp3/Cache;->readInt(Lb/e;)I
    invoke-static {p1}, Lokhttp3/Cache;->access$1000(Lb/e;)I

    move-result v2

    .line 634
    const/4 v0, -0x1

    if-ne v2, v0, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 645
    :cond_0
    return-object v0

    .line 637
    :cond_1
    :try_start_0
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v3

    .line 638
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 639
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 640
    invoke-interface {p1}, Lb/e;->r()Ljava/lang/String;

    move-result-object v4

    .line 641
    new-instance v5, Lb/c;

    invoke-direct {v5}, Lb/c;-><init>()V

    .line 642
    invoke-static {v4}, Lb/f;->b(Ljava/lang/String;)Lb/f;

    move-result-object v4

    invoke-virtual {v5, v4}, Lb/c;->a(Lb/f;)Lb/c;

    .line 643
    invoke-virtual {v5}, Lb/c;->g()Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 639
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 646
    :catch_0
    move-exception v0

    .line 647
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private writeCertList(Lb/d;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/d;",
            "Ljava/util/List",
            "<",
            "Ljava/security/cert/Certificate;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 654
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lb/d;->l(J)Lb/d;

    .line 655
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Lb/d;->h(I)Lb/d;

    .line 656
    const/4 v0, 0x0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 657
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v0

    .line 658
    invoke-static {v0}, Lb/f;->a([B)Lb/f;

    move-result-object v0

    invoke-virtual {v0}, Lb/f;->b()Ljava/lang/String;

    move-result-object v0

    .line 659
    invoke-interface {p1, v0}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 660
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Lb/d;->h(I)Lb/d;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 656
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 662
    :catch_0
    move-exception v0

    .line 663
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/security/cert/CertificateEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 665
    :cond_0
    return-void
.end method


# virtual methods
.method public matches(Lokhttp3/Request;Lokhttp3/Response;)Z
    .locals 2

    .prologue
    .line 668
    iget-object v0, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    .line 669
    invoke-virtual {p1}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    .line 670
    invoke-static {p2, v0, p1}, Lokhttp3/internal/http/OkHeaders;->varyMatches(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public response(Lokhttp3/internal/DiskLruCache$Snapshot;)Lokhttp3/Response;
    .locals 5

    .prologue
    .line 674
    iget-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 675
    iget-object v1, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    const-string v2, "Content-Length"

    invoke-virtual {v1, v2}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 676
    new-instance v2, Lokhttp3/Request$Builder;

    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    iget-object v3, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    .line 677
    invoke-virtual {v2, v3}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    const/4 v4, 0x0

    .line 678
    invoke-virtual {v2, v3, v4}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    .line 679
    invoke-virtual {v2, v3}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    move-result-object v2

    .line 680
    invoke-virtual {v2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v2

    .line 681
    new-instance v3, Lokhttp3/Response$Builder;

    invoke-direct {v3}, Lokhttp3/Response$Builder;-><init>()V

    .line 682
    invoke-virtual {v3, v2}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/Cache$Entry;->protocol:Lokhttp3/Protocol;

    .line 683
    invoke-virtual {v2, v3}, Lokhttp3/Response$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object v2

    iget v3, p0, Lokhttp3/Cache$Entry;->code:I

    .line 684
    invoke-virtual {v2, v3}, Lokhttp3/Response$Builder;->code(I)Lokhttp3/Response$Builder;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/Cache$Entry;->message:Ljava/lang/String;

    .line 685
    invoke-virtual {v2, v3}, Lokhttp3/Response$Builder;->message(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    .line 686
    invoke-virtual {v2, v3}, Lokhttp3/Response$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;

    move-result-object v2

    new-instance v3, Lokhttp3/Cache$CacheResponseBody;

    invoke-direct {v3, p1, v0, v1}, Lokhttp3/Cache$CacheResponseBody;-><init>(Lokhttp3/internal/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V

    .line 687
    invoke-virtual {v2, v3}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    .line 688
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->handshake(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 689
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lokhttp3/internal/DiskLruCache$Editor;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/16 v6, 0xa

    .line 587
    invoke-virtual {p1, v0}, Lokhttp3/internal/DiskLruCache$Editor;->newSink(I)Lb/r;

    move-result-object v1

    invoke-static {v1}, Lb/m;->a(Lb/r;)Lb/d;

    move-result-object v2

    .line 589
    iget-object v1, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    invoke-interface {v2, v1}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 590
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 591
    iget-object v1, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    invoke-interface {v2, v1}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 592
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 593
    iget-object v1, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    invoke-virtual {v1}, Lokhttp3/Headers;->size()I

    move-result v1

    int-to-long v4, v1

    invoke-interface {v2, v4, v5}, Lb/d;->l(J)Lb/d;

    .line 594
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 595
    iget-object v1, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    invoke-virtual {v1}, Lokhttp3/Headers;->size()I

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 596
    iget-object v4, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    invoke-virtual {v4, v1}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 597
    const-string v4, ": "

    invoke-interface {v2, v4}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 598
    iget-object v4, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    invoke-virtual {v4, v1}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 599
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 595
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 602
    :cond_0
    new-instance v1, Lokhttp3/internal/http/StatusLine;

    iget-object v3, p0, Lokhttp3/Cache$Entry;->protocol:Lokhttp3/Protocol;

    iget v4, p0, Lokhttp3/Cache$Entry;->code:I

    iget-object v5, p0, Lokhttp3/Cache$Entry;->message:Ljava/lang/String;

    invoke-direct {v1, v3, v4, v5}, Lokhttp3/internal/http/StatusLine;-><init>(Lokhttp3/Protocol;ILjava/lang/String;)V

    invoke-virtual {v1}, Lokhttp3/internal/http/StatusLine;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 603
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 604
    iget-object v1, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    invoke-virtual {v1}, Lokhttp3/Headers;->size()I

    move-result v1

    int-to-long v4, v1

    invoke-interface {v2, v4, v5}, Lb/d;->l(J)Lb/d;

    .line 605
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 606
    iget-object v1, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    invoke-virtual {v1}, Lokhttp3/Headers;->size()I

    move-result v1

    :goto_1
    if-ge v0, v1, :cond_1

    .line 607
    iget-object v3, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    invoke-virtual {v3, v0}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 608
    const-string v3, ": "

    invoke-interface {v2, v3}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 609
    iget-object v3, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    invoke-virtual {v3, v0}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 610
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 606
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 613
    :cond_1
    invoke-direct {p0}, Lokhttp3/Cache$Entry;->isHttps()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 614
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 615
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->cipherSuite()Lokhttp3/CipherSuite;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CipherSuite;->javaName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 616
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 617
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->peerCertificates()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lokhttp3/Cache$Entry;->writeCertList(Lb/d;Ljava/util/List;)V

    .line 618
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->localCertificates()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lokhttp3/Cache$Entry;->writeCertList(Lb/d;Ljava/util/List;)V

    .line 620
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->tlsVersion()Lokhttp3/TlsVersion;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 621
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->tlsVersion()Lokhttp3/TlsVersion;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/TlsVersion;->javaName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 622
    invoke-interface {v2, v6}, Lb/d;->h(I)Lb/d;

    .line 625
    :cond_2
    invoke-interface {v2}, Lb/d;->close()V

    .line 626
    return-void
.end method
