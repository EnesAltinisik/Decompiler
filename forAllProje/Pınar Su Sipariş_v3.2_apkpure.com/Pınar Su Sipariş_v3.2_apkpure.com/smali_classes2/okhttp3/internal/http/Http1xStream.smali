.class public final Lokhttp3/internal/http/Http1xStream;
.super Ljava/lang/Object;
.source "Http1xStream.java"

# interfaces
.implements Lokhttp3/internal/http/HttpStream;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;,
        Lokhttp3/internal/http/Http1xStream$ChunkedSource;,
        Lokhttp3/internal/http/Http1xStream$FixedLengthSource;,
        Lokhttp3/internal/http/Http1xStream$AbstractSource;,
        Lokhttp3/internal/http/Http1xStream$ChunkedSink;,
        Lokhttp3/internal/http/Http1xStream$FixedLengthSink;
    }
.end annotation


# static fields
.field private static final STATE_CLOSED:I = 0x6

.field private static final STATE_IDLE:I = 0x0

.field private static final STATE_OPEN_REQUEST_BODY:I = 0x1

.field private static final STATE_OPEN_RESPONSE_BODY:I = 0x4

.field private static final STATE_READING_RESPONSE_BODY:I = 0x5

.field private static final STATE_READ_RESPONSE_HEADERS:I = 0x3

.field private static final STATE_WRITING_REQUEST_BODY:I = 0x2


# instance fields
.field private httpEngine:Lokhttp3/internal/http/HttpEngine;

.field private final sink:Lb/d;

.field private final source:Lb/e;

.field private state:I

.field private final streamAllocation:Lokhttp3/internal/http/StreamAllocation;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http/StreamAllocation;Lb/e;Lb/d;)V
    .locals 1

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    .line 79
    iput-object p1, p0, Lokhttp3/internal/http/Http1xStream;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    .line 80
    iput-object p2, p0, Lokhttp3/internal/http/Http1xStream;->source:Lb/e;

    .line 81
    iput-object p3, p0, Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;

    .line 82
    return-void
.end method

.method static synthetic access$300(Lokhttp3/internal/http/Http1xStream;)Lb/d;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;

    return-object v0
.end method

.method static synthetic access$400(Lokhttp3/internal/http/Http1xStream;Lb/j;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0, p1}, Lokhttp3/internal/http/Http1xStream;->detachTimeout(Lb/j;)V

    return-void
.end method

.method static synthetic access$500(Lokhttp3/internal/http/Http1xStream;)I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    return v0
.end method

.method static synthetic access$502(Lokhttp3/internal/http/Http1xStream;I)I
    .locals 0

    .prologue
    .line 62
    iput p1, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    return p1
.end method

.method static synthetic access$600(Lokhttp3/internal/http/Http1xStream;)Lb/e;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->source:Lb/e;

    return-object v0
.end method

.method static synthetic access$700(Lokhttp3/internal/http/Http1xStream;)Lokhttp3/internal/http/StreamAllocation;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    return-object v0
.end method

.method private detachTimeout(Lb/j;)V
    .locals 2

    .prologue
    .line 260
    invoke-virtual {p1}, Lb/j;->a()Lb/t;

    move-result-object v0

    .line 261
    sget-object v1, Lb/t;->NONE:Lb/t;

    invoke-virtual {p1, v1}, Lb/j;->a(Lb/t;)Lb/j;

    .line 262
    invoke-virtual {v0}, Lb/t;->clearDeadline()Lb/t;

    .line 263
    invoke-virtual {v0}, Lb/t;->clearTimeout()Lb/t;

    .line 264
    return-void
.end method

.method private getTransferStream(Lokhttp3/Response;)Lb/s;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 135
    invoke-static {p1}, Lokhttp3/internal/http/HttpEngine;->hasBody(Lokhttp3/Response;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lokhttp3/internal/http/Http1xStream;->newFixedLengthSource(J)Lb/s;

    move-result-object v0

    .line 151
    :goto_0
    return-object v0

    .line 139
    :cond_0
    const-string v0, "chunked"

    const-string v1, "Transfer-Encoding"

    invoke-virtual {p1, v1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream;->newChunkedSource(Lokhttp3/internal/http/HttpEngine;)Lb/s;

    move-result-object v0

    goto :goto_0

    .line 143
    :cond_1
    invoke-static {p1}, Lokhttp3/internal/http/OkHeaders;->contentLength(Lokhttp3/Response;)J

    move-result-wide v0

    .line 144
    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_2

    .line 145
    invoke-virtual {p0, v0, v1}, Lokhttp3/internal/http/Http1xStream;->newFixedLengthSource(J)Lb/s;

    move-result-object v0

    goto :goto_0

    .line 151
    :cond_2
    invoke-virtual {p0}, Lokhttp3/internal/http/Http1xStream;->newUnknownLengthSource()Lb/s;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/http/StreamAllocation;->connection()Lokhttp3/internal/io/RealConnection;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/internal/io/RealConnection;->cancel()V

    .line 106
    :cond_0
    return-void
.end method

.method public createRequestBody(Lokhttp3/Request;J)Lb/r;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 89
    const-string v0, "chunked"

    const-string v1, "Transfer-Encoding"

    invoke-virtual {p1, v1}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p0}, Lokhttp3/internal/http/Http1xStream;->newChunkedSink()Lb/r;

    move-result-object v0

    .line 96
    :goto_0
    return-object v0

    .line 94
    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_1

    .line 96
    invoke-virtual {p0, p2, p3}, Lokhttp3/internal/http/Http1xStream;->newFixedLengthSink(J)Lb/r;

    move-result-object v0

    goto :goto_0

    .line 99
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public finishRequest()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 160
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;

    invoke-interface {v0}, Lb/d;->flush()V

    .line 161
    return-void
.end method

.method public isClosed()Z
    .locals 2

    .prologue
    .line 156
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public newChunkedSink()Lb/r;
    .locals 3

    .prologue
    .line 217
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    .line 219
    new-instance v0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lokhttp3/internal/http/Http1xStream$ChunkedSink;-><init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/Http1xStream$1;)V

    return-object v0
.end method

.method public newChunkedSource(Lokhttp3/internal/http/HttpEngine;)Lb/s;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 241
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 242
    :cond_0
    const/4 v0, 0x5

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    .line 243
    new-instance v0, Lokhttp3/internal/http/Http1xStream$ChunkedSource;

    invoke-direct {v0, p0, p1}, Lokhttp3/internal/http/Http1xStream$ChunkedSource;-><init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/HttpEngine;)V

    return-object v0
.end method

.method public newFixedLengthSink(J)Lb/r;
    .locals 3

    .prologue
    .line 223
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 224
    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    .line 225
    new-instance v0, Lokhttp3/internal/http/Http1xStream$FixedLengthSink;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lokhttp3/internal/http/Http1xStream$FixedLengthSink;-><init>(Lokhttp3/internal/http/Http1xStream;JLokhttp3/internal/http/Http1xStream$1;)V

    return-object v0
.end method

.method public newFixedLengthSource(J)Lb/s;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 235
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 236
    :cond_0
    const/4 v0, 0x5

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    .line 237
    new-instance v0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;

    invoke-direct {v0, p0, p1, p2}, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;-><init>(Lokhttp3/internal/http/Http1xStream;J)V

    return-object v0
.end method

.method public newUnknownLengthSource()Lb/s;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 247
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 248
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "streamAllocation == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 249
    :cond_1
    const/4 v0, 0x5

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    .line 250
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/http/StreamAllocation;->noNewStreams()V

    .line 251
    new-instance v0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;-><init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/Http1xStream$1;)V

    return-object v0
.end method

.method public openResponseBody(Lokhttp3/Response;)Lokhttp3/ResponseBody;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lokhttp3/internal/http/Http1xStream;->getTransferStream(Lokhttp3/Response;)Lb/s;

    move-result-object v0

    .line 131
    new-instance v1, Lokhttp3/internal/http/RealResponseBody;

    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v2

    invoke-static {v0}, Lb/m;->a(Lb/s;)Lb/e;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lokhttp3/internal/http/RealResponseBody;-><init>(Lokhttp3/Headers;Lb/e;)V

    return-object v1
.end method

.method public readHeaders()Lokhttp3/Headers;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 208
    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    .line 210
    :goto_0
    iget-object v1, p0, Lokhttp3/internal/http/Http1xStream;->source:Lb/e;

    invoke-interface {v1}, Lb/e;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    .line 211
    sget-object v2, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    invoke-virtual {v2, v0, v1}, Lokhttp3/internal/Internal;->addLenient(Lokhttp3/Headers$Builder;Ljava/lang/String;)V

    goto :goto_0

    .line 213
    :cond_0
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v0

    return-object v0
.end method

.method public readResponse()Lokhttp3/Response$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 179
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 180
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_0
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->source:Lb/e;

    invoke-interface {v0}, Lb/e;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/StatusLine;->parse(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    move-result-object v0

    .line 187
    new-instance v1, Lokhttp3/Response$Builder;

    invoke-direct {v1}, Lokhttp3/Response$Builder;-><init>()V

    iget-object v2, v0, Lokhttp3/internal/http/StatusLine;->protocol:Lokhttp3/Protocol;

    .line 188
    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object v1

    iget v2, v0, Lokhttp3/internal/http/StatusLine;->code:I

    .line 189
    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->code(I)Lokhttp3/Response$Builder;

    move-result-object v1

    iget-object v2, v0, Lokhttp3/internal/http/StatusLine;->message:Ljava/lang/String;

    .line 190
    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->message(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v1

    .line 191
    invoke-virtual {p0}, Lokhttp3/internal/http/Http1xStream;->readHeaders()Lokhttp3/Headers;

    move-result-object v2

    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;

    move-result-object v1

    .line 193
    iget v0, v0, Lokhttp3/internal/http/StatusLine;->code:I

    const/16 v2, 0x64

    if-eq v0, v2, :cond_0

    .line 194
    const/4 v0, 0x4

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    return-object v1

    .line 198
    :catch_0
    move-exception v0

    .line 200
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unexpected end of stream on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/internal/http/Http1xStream;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 201
    invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 202
    throw v1
.end method

.method public readResponseHeaders()Lokhttp3/Response$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 126
    invoke-virtual {p0}, Lokhttp3/internal/http/Http1xStream;->readResponse()Lokhttp3/Response$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setHttpEngine(Lokhttp3/internal/http/HttpEngine;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lokhttp3/internal/http/Http1xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    .line 86
    return-void
.end method

.method public writeRequest(Lokhttp3/Headers;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 165
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;

    invoke-interface {v0, p2}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 167
    const/4 v0, 0x0

    invoke-virtual {p1}, Lokhttp3/Headers;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    .line 168
    iget-object v2, p0, Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;

    invoke-virtual {p1, v0}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    move-result-object v2

    const-string v3, ": "

    .line 169
    invoke-interface {v2, v3}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    move-result-object v2

    .line 170
    invoke-virtual {p1, v0}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    move-result-object v2

    const-string v3, "\r\n"

    .line 171
    invoke-interface {v2, v3}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 167
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 173
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lb/d;->b(Ljava/lang/String;)Lb/d;

    .line 174
    const/4 v0, 0x1

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    .line 175
    return-void
.end method

.method public writeRequestBody(Lokhttp3/internal/http/RetryableSink;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 229
    iget v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 230
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lokhttp3/internal/http/Http1xStream;->state:I

    .line 231
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->sink:Lb/d;

    invoke-virtual {p1, v0}, Lokhttp3/internal/http/RetryableSink;->writeToSocket(Lb/r;)V

    .line 232
    return-void
.end method

.method public writeRequestHeaders(Lokhttp3/Request;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 119
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->writingRequestHeaders()V

    .line 120
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    .line 121
    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->getConnection()Lokhttp3/Connection;

    move-result-object v0

    invoke-interface {v0}, Lokhttp3/Connection;->route()Lokhttp3/Route;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Route;->proxy()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    .line 120
    invoke-static {p1, v0}, Lokhttp3/internal/http/RequestLine;->get(Lokhttp3/Request;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-virtual {p1}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lokhttp3/internal/http/Http1xStream;->writeRequest(Lokhttp3/Headers;Ljava/lang/String;)V

    .line 123
    return-void
.end method
