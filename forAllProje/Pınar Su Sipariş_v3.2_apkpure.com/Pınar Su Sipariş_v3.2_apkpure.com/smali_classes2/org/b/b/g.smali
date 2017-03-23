.class public abstract Lorg/b/b/g;
.super Ljava/lang/Object;
.source "Transport.java"


# static fields
.field protected static final CONTENT_TYPE_SOAP_XML_CHARSET_UTF_8:Ljava/lang/String; = "application/soap+xml;charset=utf-8"

.field protected static final CONTENT_TYPE_XML_CHARSET_UTF_8:Ljava/lang/String; = "text/xml;charset=utf-8"

.field protected static final USER_AGENT:Ljava/lang/String; = "ksoap2-android/2.6.0+"


# instance fields
.field private bufferLength:I

.field public debug:Z

.field protected proxy:Ljava/net/Proxy;

.field public requestDump:Ljava/lang/String;

.field public responseDump:Ljava/lang/String;

.field protected timeout:I

.field protected url:Ljava/lang/String;

.field private xmlVersionTag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/16 v0, 0x4e20

    iput v0, p0, Lorg/b/b/g;->timeout:I

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lorg/b/b/g;->xmlVersionTag:Ljava/lang/String;

    .line 65
    const/high16 v0, 0x40000

    iput v0, p0, Lorg/b/b/g;->bufferLength:I

    .line 68
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/b/b/g;-><init>(Ljava/net/Proxy;Ljava/lang/String;)V

    .line 72
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/16 v0, 0x4e20

    iput v0, p0, Lorg/b/b/g;->timeout:I

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lorg/b/b/g;->xmlVersionTag:Ljava/lang/String;

    .line 65
    const/high16 v0, 0x40000

    iput v0, p0, Lorg/b/b/g;->bufferLength:I

    .line 75
    iput-object p1, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    .line 76
    iput p2, p0, Lorg/b/b/g;->timeout:I

    .line 77
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/16 v0, 0x4e20

    iput v0, p0, Lorg/b/b/g;->timeout:I

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lorg/b/b/g;->xmlVersionTag:Ljava/lang/String;

    .line 65
    const/high16 v0, 0x40000

    iput v0, p0, Lorg/b/b/g;->bufferLength:I

    .line 80
    iput-object p1, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    .line 81
    iput p2, p0, Lorg/b/b/g;->timeout:I

    .line 82
    iput p3, p0, Lorg/b/b/g;->bufferLength:I

    .line 83
    return-void
.end method

.method public constructor <init>(Ljava/net/Proxy;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/16 v0, 0x4e20

    iput v0, p0, Lorg/b/b/g;->timeout:I

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lorg/b/b/g;->xmlVersionTag:Ljava/lang/String;

    .line 65
    const/high16 v0, 0x40000

    iput v0, p0, Lorg/b/b/g;->bufferLength:I

    .line 94
    iput-object p1, p0, Lorg/b/b/g;->proxy:Ljava/net/Proxy;

    .line 95
    iput-object p2, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public constructor <init>(Ljava/net/Proxy;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/16 v0, 0x4e20

    iput v0, p0, Lorg/b/b/g;->timeout:I

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lorg/b/b/g;->xmlVersionTag:Ljava/lang/String;

    .line 65
    const/high16 v0, 0x40000

    iput v0, p0, Lorg/b/b/g;->bufferLength:I

    .line 99
    iput-object p1, p0, Lorg/b/b/g;->proxy:Ljava/net/Proxy;

    .line 100
    iput-object p2, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    .line 101
    iput p3, p0, Lorg/b/b/g;->timeout:I

    .line 102
    return-void
.end method

.method public constructor <init>(Ljava/net/Proxy;Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/16 v0, 0x4e20

    iput v0, p0, Lorg/b/b/g;->timeout:I

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lorg/b/b/g;->xmlVersionTag:Ljava/lang/String;

    .line 65
    const/high16 v0, 0x40000

    iput v0, p0, Lorg/b/b/g;->bufferLength:I

    .line 105
    iput-object p1, p0, Lorg/b/b/g;->proxy:Ljava/net/Proxy;

    .line 106
    iput-object p2, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    .line 107
    iput p3, p0, Lorg/b/b/g;->timeout:I

    .line 108
    iput p4, p0, Lorg/b/b/g;->bufferLength:I

    .line 109
    return-void
.end method


# virtual methods
.method public abstract call(Ljava/lang/String;Lorg/b/b;Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation
.end method

.method public abstract call(Ljava/lang/String;Lorg/b/b;Ljava/util/List;Ljava/io/File;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation
.end method

.method public call(Ljava/lang/String;Lorg/b/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 227
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/b/b/g;->call(Ljava/lang/String;Lorg/b/b;Ljava/util/List;)Ljava/util/List;

    .line 228
    return-void
.end method

.method protected createRequestData(Lorg/b/b;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 148
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/b/b/g;->createRequestData(Lorg/b/b;Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method protected createRequestData(Lorg/b/b;Ljava/lang/String;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 129
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    iget v1, p0, Lorg/b/b/g;->bufferLength:I

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 131
    iget-object v1, p0, Lorg/b/b/g;->xmlVersionTag:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 132
    new-instance v1, Lorg/c/a/b;

    invoke-direct {v1}, Lorg/c/a/b;-><init>()V

    .line 133
    invoke-interface {v1, v0, p2}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 134
    invoke-virtual {p1, v1}, Lorg/b/b;->a(Lorg/xmlpull/v1/XmlSerializer;)V

    .line 135
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlSerializer;->flush()V

    .line 136
    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 137
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 138
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 139
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 142
    return-object v0
.end method

.method public getHost()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .prologue
    .line 237
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .prologue
    .line 257
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPort()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .prologue
    .line 247
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    move-result v0

    return v0
.end method

.method public abstract getServiceConnection()Lorg/b/b/e;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected parseResponse(Lorg/b/b;Ljava/io/InputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 115
    new-instance v0, Lorg/c/a/a;

    invoke-direct {v0}, Lorg/c/a/a;-><init>()V

    .line 116
    const-string v1, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 117
    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 118
    invoke-virtual {p1, v0}, Lorg/b/b;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 122
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 123
    return-void
.end method

.method public reset()V
    .locals 0

    .prologue
    .line 176
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lorg/b/b/g;->url:Ljava/lang/String;

    .line 159
    return-void
.end method

.method public setXmlVersionTag(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 169
    iput-object p1, p0, Lorg/b/b/g;->xmlVersionTag:Ljava/lang/String;

    .line 170
    return-void
.end method
