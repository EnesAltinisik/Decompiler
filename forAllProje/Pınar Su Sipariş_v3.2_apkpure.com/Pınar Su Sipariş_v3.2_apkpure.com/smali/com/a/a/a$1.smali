.class final Lcom/a/a/a$1;
.super Lokhttp3/RequestBody;
.source "Ok3Client.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/a/a/a;->a(Lretrofit/mime/TypedOutput;)Lokhttp3/RequestBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lokhttp3/MediaType;

.field final synthetic b:Lretrofit/mime/TypedOutput;


# direct methods
.method constructor <init>(Lokhttp3/MediaType;Lretrofit/mime/TypedOutput;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/a/a/a$1;->a:Lokhttp3/MediaType;

    iput-object p2, p0, Lcom/a/a/a$1;->b:Lretrofit/mime/TypedOutput;

    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .prologue
    .line 81
    iget-object v0, p0, Lcom/a/a/a$1;->b:Lretrofit/mime/TypedOutput;

    invoke-interface {v0}, Lretrofit/mime/TypedOutput;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/a/a/a$1;->a:Lokhttp3/MediaType;

    return-object v0
.end method

.method public writeTo(Lb/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 77
    iget-object v0, p0, Lcom/a/a/a$1;->b:Lretrofit/mime/TypedOutput;

    invoke-interface {p1}, Lb/d;->c()Ljava/io/OutputStream;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/mime/TypedOutput;->writeTo(Ljava/io/OutputStream;)V

    .line 78
    return-void
.end method
