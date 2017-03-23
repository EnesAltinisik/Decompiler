.class public Lorg/b/b/d;
.super Lorg/b/b/b;
.source "HttpsTransportSE.java"


# static fields
.field static final PROTOCOL:Ljava/lang/String; = "https"

.field private static final PROTOCOL_FULL:Ljava/lang/String; = "https://"


# instance fields
.field protected final file:Ljava/lang/String;

.field protected final host:Ljava/lang/String;

.field protected final port:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 2

    .prologue
    .line 24
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p4}, Lorg/b/b/b;-><init>(Ljava/lang/String;I)V

    .line 25
    iput-object p1, p0, Lorg/b/b/d;->host:Ljava/lang/String;

    .line 26
    iput p2, p0, Lorg/b/b/d;->port:I

    .line 27
    iput-object p3, p0, Lorg/b/b/d;->file:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/net/Proxy;Ljava/lang/String;ILjava/lang/String;I)V
    .locals 2

    .prologue
    .line 38
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/b/b/b;-><init>(Ljava/net/Proxy;Ljava/lang/String;)V

    .line 39
    iput-object p2, p0, Lorg/b/b/d;->host:Ljava/lang/String;

    .line 40
    iput p3, p0, Lorg/b/b/d;->port:I

    .line 41
    iput-object p4, p0, Lorg/b/b/d;->file:Ljava/lang/String;

    .line 42
    iput p5, p0, Lorg/b/b/d;->timeout:I

    .line 43
    return-void
.end method


# virtual methods
.method public getServiceConnection()Lorg/b/b/e;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 51
    new-instance v0, Lorg/b/b/c;

    iget-object v1, p0, Lorg/b/b/d;->proxy:Ljava/net/Proxy;

    iget-object v2, p0, Lorg/b/b/d;->host:Ljava/lang/String;

    iget v3, p0, Lorg/b/b/d;->port:I

    iget-object v4, p0, Lorg/b/b/d;->file:Ljava/lang/String;

    iget v5, p0, Lorg/b/b/d;->timeout:I

    invoke-direct/range {v0 .. v5}, Lorg/b/b/c;-><init>(Ljava/net/Proxy;Ljava/lang/String;ILjava/lang/String;I)V

    return-object v0
.end method
