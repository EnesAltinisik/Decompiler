.class public Lorg/b/b/b;
.super Lorg/b/b/g;
.source "HttpTransportSE.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/b/b/g;-><init>(Ljava/net/Proxy;Ljava/lang/String;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0, p1, p2}, Lorg/b/b/g;-><init>(Ljava/lang/String;I)V

    .line 75
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1, p2}, Lorg/b/b/g;-><init>(Ljava/lang/String;I)V

    .line 93
    return-void
.end method

.method public constructor <init>(Ljava/net/Proxy;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0, p1, p2}, Lorg/b/b/g;-><init>(Ljava/net/Proxy;Ljava/lang/String;)V

    .line 63
    return-void
.end method

.method public constructor <init>(Ljava/net/Proxy;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0, p1, p2, p3}, Lorg/b/b/g;-><init>(Ljava/net/Proxy;Ljava/lang/String;I)V

    .line 79
    return-void
.end method

.method public constructor <init>(Ljava/net/Proxy;Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0, p1, p2, p3}, Lorg/b/b/g;-><init>(Ljava/net/Proxy;Ljava/lang/String;I)V

    .line 97
    return-void
.end method

.method private getUnZippedInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 319
    :try_start_0
    check-cast p1, Ljava/util/zip/GZIPInputStream;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    :goto_0
    return-object p1

    .line 320
    :catch_0
    move-exception v0

    .line 321
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v0

    goto :goto_0
.end method

.method private readDebug(Ljava/io/InputStream;ILjava/io/File;)Ljava/io/InputStream;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v5, 0x100

    const/4 v4, 0x0

    .line 282
    if-eqz p3, :cond_0

    .line 283
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 289
    :goto_0
    new-array v1, v5, [B

    .line 292
    :goto_1
    invoke-virtual {p1, v1, v4, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    .line 293
    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    .line 299
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 300
    instance-of v2, v0, Ljava/io/ByteArrayOutputStream;

    if-eqz v2, :cond_4

    .line 301
    check-cast v0, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 304
    :goto_2
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    iput-object v1, p0, Lorg/b/b/b;->responseDump:Ljava/lang/String;

    .line 305
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 307
    if-eqz p3, :cond_3

    .line 308
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 310
    :goto_3
    return-object v0

    .line 286
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    if-lez p2, :cond_1

    :goto_4
    invoke-direct {v0, p2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    goto :goto_0

    :cond_1
    const/high16 p2, 0x40000

    goto :goto_4

    .line 296
    :cond_2
    invoke-virtual {v0, v1, v4, v2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_1

    .line 310
    :cond_3
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v0, v1

    goto :goto_3

    :cond_4
    move-object v0, v1

    goto :goto_2
.end method


# virtual methods
.method public call(Ljava/lang/String;Lorg/b/b;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/b/b/a;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 118
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/b/b/b;->call(Ljava/lang/String;Lorg/b/b;Ljava/util/List;Ljava/io/File;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call(Ljava/lang/String;Lorg/b/b;Ljava/util/List;Ljava/io/File;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/b/b/a;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 145
    if-nez p1, :cond_0

    .line 146
    const-string p1, "\"\""

    .line 149
    :cond_0
    const-string v1, "UTF-8"

    invoke-virtual {p0, p2, v1}, Lorg/b/b/b;->createRequestData(Lorg/b/b;Ljava/lang/String;)[B

    move-result-object v3

    .line 151
    iget-boolean v1, p0, Lorg/b/b/b;->debug:Z

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>([B)V

    :goto_0
    iput-object v1, p0, Lorg/b/b/b;->requestDump:Ljava/lang/String;

    .line 152
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/b/b/b;->responseDump:Ljava/lang/String;

    .line 154
    invoke-virtual {p0}, Lorg/b/b/b;->getServiceConnection()Lorg/b/b/e;

    move-result-object v7

    .line 156
    const-string v1, "User-Agent"

    const-string v2, "ksoap2-android/2.6.0+"

    invoke-interface {v7, v1, v2}, Lorg/b/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    iget v1, p2, Lorg/b/b;->f:I

    const/16 v2, 0x78

    if-eq v1, v2, :cond_1

    .line 161
    const-string v1, "SOAPAction"

    invoke-interface {v7, v1, p1}, Lorg/b/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    :cond_1
    iget v1, p2, Lorg/b/b;->f:I

    const/16 v2, 0x78

    if-ne v1, v2, :cond_3

    .line 165
    const-string v1, "Content-Type"

    const-string v2, "application/soap+xml;charset=utf-8"

    invoke-interface {v7, v1, v2}, Lorg/b/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    :goto_1
    const-string v1, "Accept-Encoding"

    const-string v2, "gzip"

    invoke-interface {v7, v1, v2}, Lorg/b/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v1, "Content-Length"

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, ""

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    array-length v4, v3

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v1, v2}, Lorg/b/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    array-length v1, v3

    invoke-interface {v7, v1}, Lorg/b/b/e;->a(I)V

    .line 177
    if-eqz p3, :cond_4

    .line 178
    const/4 v1, 0x0

    move v2, v1

    :goto_2
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 179
    move-object/from16 v0, p3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/b/a;

    .line 180
    invoke-virtual {v1}, Lorg/b/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lorg/b/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v4, v1}, Lorg/b/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_2

    .line 151
    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    .line 167
    :cond_3
    const-string v1, "Content-Type"

    const-string v2, "text/xml;charset=utf-8"

    invoke-interface {v7, v1, v2}, Lorg/b/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 184
    :cond_4
    const-string v1, "POST"

    invoke-interface {v7, v1}, Lorg/b/b/e;->a(Ljava/lang/String;)V

    .line 185
    invoke-interface {v7}, Lorg/b/b/e;->d()Ljava/io/OutputStream;

    move-result-object v1

    .line 187
    const/4 v2, 0x0

    array-length v4, v3

    invoke-virtual {v1, v3, v2, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 188
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 189
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 192
    const/4 v5, 0x0

    .line 194
    const/16 v4, 0x2000

    .line 195
    const/4 v3, 0x0

    .line 196
    const/4 v2, 0x0

    .line 197
    invoke-interface {v7}, Lorg/b/b/e;->c()I

    move-result v8

    .line 200
    :try_start_0
    invoke-interface {v7}, Lorg/b/b/e;->b()Ljava/util/List;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v5

    .line 201
    const/4 v1, 0x0

    move v6, v1

    :goto_3
    :try_start_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    if-ge v6, v1, :cond_8

    .line 202
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/b/a;

    .line 204
    invoke-virtual {v1}, Lorg/b/a;->a()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_5

    move v1, v2

    move v2, v3

    move v3, v4

    .line 201
    :goto_4
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    move v4, v3

    move v3, v2

    move v2, v1

    goto :goto_3

    .line 209
    :cond_5
    invoke-virtual {v1}, Lorg/b/a;->a()Ljava/lang/String;

    move-result-object v9

    const-string v10, "content-length"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 210
    invoke-virtual {v1}, Lorg/b/a;->b()Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v9

    if-eqz v9, :cond_6

    .line 212
    :try_start_2
    invoke-virtual {v1}, Lorg/b/a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-result v4

    .line 221
    :cond_6
    :goto_5
    :try_start_3
    invoke-virtual {v1}, Lorg/b/a;->a()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Content-Type"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v1}, Lorg/b/a;->b()Ljava/lang/String;

    move-result-object v9

    const-string v10, "xml"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 223
    const/4 v2, 0x1

    .line 228
    :cond_7
    invoke-virtual {v1}, Lorg/b/a;->a()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Content-Encoding"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-virtual {v1}, Lorg/b/a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v9, "gzip"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 230
    const/4 v1, 0x1

    move v3, v4

    move v11, v1

    move v1, v2

    move v2, v11

    goto :goto_4

    .line 213
    :catch_0
    move-exception v4

    .line 214
    const/16 v4, 0x2000

    goto :goto_5

    .line 235
    :cond_8
    const/16 v1, 0xc8

    if-eq v8, v1, :cond_a

    .line 237
    new-instance v1, Lorg/b/b/a;

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    const-string v9, "HTTP request failed, HTTP status: "

    invoke-virtual {v6, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    invoke-virtual {v6, v8}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v6, v8}, Lorg/b/b/a;-><init>(Ljava/lang/String;I)V

    throw v1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 246
    :catch_1
    move-exception v1

    move-object v11, v1

    move v1, v3

    move-object v3, v11

    move v12, v2

    move-object v2, v5

    move v5, v12

    .line 247
    :goto_6
    if-eqz v1, :cond_d

    .line 248
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-interface {v7}, Lorg/b/b/e;->f()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v1, v6, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, v1}, Lorg/b/b/b;->getUnZippedInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v1

    .line 254
    :goto_7
    instance-of v6, v3, Lorg/b/b/a;

    if-eqz v6, :cond_e

    .line 255
    if-nez v5, :cond_e

    .line 256
    iget-boolean v2, p0, Lorg/b/b/b;->debug:Z

    if-eqz v2, :cond_9

    if-eqz v1, :cond_9

    .line 258
    move-object/from16 v0, p4

    invoke-direct {p0, v1, v4, v0}, Lorg/b/b/b;->readDebug(Ljava/io/InputStream;ILjava/io/File;)Ljava/io/InputStream;

    .line 262
    :cond_9
    invoke-interface {v7}, Lorg/b/b/e;->a()V

    .line 263
    throw v3

    .line 240
    :cond_a
    if-eqz v3, :cond_c

    .line 241
    :try_start_4
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-interface {v7}, Lorg/b/b/e;->e()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v1, v6, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, v1}, Lorg/b/b/b;->getUnZippedInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    move-result-object v1

    :goto_8
    move-object v2, v1

    move-object v1, v5

    .line 268
    :goto_9
    iget-boolean v3, p0, Lorg/b/b/b;->debug:Z

    if-eqz v3, :cond_b

    .line 269
    move-object/from16 v0, p4

    invoke-direct {p0, v2, v4, v0}, Lorg/b/b/b;->readDebug(Ljava/io/InputStream;ILjava/io/File;)Ljava/io/InputStream;

    move-result-object v2

    .line 272
    :cond_b
    invoke-virtual {p0, p2, v2}, Lorg/b/b/b;->parseResponse(Lorg/b/b;Ljava/io/InputStream;)V

    .line 277
    return-object v1

    .line 244
    :cond_c
    :try_start_5
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-interface {v7}, Lorg/b/b/e;->e()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v1, v6, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_8

    .line 251
    :cond_d
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-interface {v7}, Lorg/b/b/e;->f()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v1, v6, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    goto :goto_7

    .line 246
    :catch_2
    move-exception v1

    move-object v11, v1

    move v1, v3

    move-object v3, v11

    move v12, v2

    move-object v2, v5

    move v5, v12

    goto :goto_6

    :cond_e
    move-object v11, v2

    move-object v2, v1

    move-object v1, v11

    goto :goto_9

    :cond_f
    move v1, v2

    move v2, v3

    move v3, v4

    goto/16 :goto_4
.end method

.method public call(Ljava/lang/String;Lorg/b/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/b/b/a;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 113
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/b/b/b;->call(Ljava/lang/String;Lorg/b/b;Ljava/util/List;)Ljava/util/List;

    .line 114
    return-void
.end method

.method public getServiceConnection()Lorg/b/b/e;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 326
    new-instance v0, Lorg/b/b/f;

    iget-object v1, p0, Lorg/b/b/b;->proxy:Ljava/net/Proxy;

    iget-object v2, p0, Lorg/b/b/b;->url:Ljava/lang/String;

    iget v3, p0, Lorg/b/b/b;->timeout:I

    invoke-direct {v0, v1, v2, v3}, Lorg/b/b/f;-><init>(Ljava/net/Proxy;Ljava/lang/String;I)V

    return-object v0
.end method
