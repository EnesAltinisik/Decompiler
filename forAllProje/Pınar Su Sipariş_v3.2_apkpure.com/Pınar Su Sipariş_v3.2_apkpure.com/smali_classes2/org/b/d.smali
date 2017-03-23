.class public Lorg/b/d;
.super Lorg/b/c;
.source "SoapFault12.java"


# instance fields
.field public f:Lorg/c/b/b;

.field public g:Lorg/c/b/b;

.field public h:Lorg/c/b/b;

.field public i:Lorg/c/b/b;

.field public j:Lorg/c/b/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Lorg/b/c;-><init>()V

    .line 51
    const/16 v0, 0x78

    iput v0, p0, Lorg/b/d;->e:I

    .line 52
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lorg/b/c;-><init>()V

    .line 56
    iput p1, p0, Lorg/b/d;->e:I

    .line 57
    return-void
.end method

.method private b(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x3

    const/4 v2, 0x2

    .line 73
    const-string v0, "http://www.w3.org/2003/05/soap-envelope"

    const-string v1, "Fault"

    invoke-interface {p1, v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 75
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    move-result v0

    if-ne v0, v2, :cond_5

    .line 76
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 77
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 78
    const-string v1, "Code"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 79
    new-instance v1, Lorg/c/b/b;

    invoke-direct {v1}, Lorg/c/b/b;-><init>()V

    iput-object v1, p0, Lorg/b/d;->f:Lorg/c/b/b;

    .line 80
    iget-object v1, p0, Lorg/b/d;->f:Lorg/c/b/b;

    invoke-virtual {v1, p1}, Lorg/c/b/b;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 97
    :goto_1
    const-string v1, "http://www.w3.org/2003/05/soap-envelope"

    invoke-interface {p1, v3, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 81
    :cond_0
    const-string v1, "Reason"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 82
    new-instance v1, Lorg/c/b/b;

    invoke-direct {v1}, Lorg/c/b/b;-><init>()V

    iput-object v1, p0, Lorg/b/d;->g:Lorg/c/b/b;

    .line 83
    iget-object v1, p0, Lorg/b/d;->g:Lorg/c/b/b;

    invoke-virtual {v1, p1}, Lorg/c/b/b;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 84
    :cond_1
    const-string v1, "Node"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 85
    new-instance v1, Lorg/c/b/b;

    invoke-direct {v1}, Lorg/c/b/b;-><init>()V

    iput-object v1, p0, Lorg/b/d;->h:Lorg/c/b/b;

    .line 86
    iget-object v1, p0, Lorg/b/d;->h:Lorg/c/b/b;

    invoke-virtual {v1, p1}, Lorg/c/b/b;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 87
    :cond_2
    const-string v1, "Role"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 88
    new-instance v1, Lorg/c/b/b;

    invoke-direct {v1}, Lorg/c/b/b;-><init>()V

    iput-object v1, p0, Lorg/b/d;->i:Lorg/c/b/b;

    .line 89
    iget-object v1, p0, Lorg/b/d;->i:Lorg/c/b/b;

    invoke-virtual {v1, p1}, Lorg/c/b/b;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 90
    :cond_3
    const-string v1, "Detail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 91
    new-instance v1, Lorg/c/b/b;

    invoke-direct {v1}, Lorg/c/b/b;-><init>()V

    iput-object v1, p0, Lorg/b/d;->j:Lorg/c/b/b;

    .line 92
    iget-object v1, p0, Lorg/b/d;->j:Lorg/c/b/b;

    invoke-virtual {v1, p1}, Lorg/c/b/b;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 94
    :cond_4
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "unexpected tag:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 99
    :cond_5
    const-string v0, "http://www.w3.org/2003/05/soap-envelope"

    const-string v1, "Fault"

    invoke-interface {p1, v3, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 102
    return-void
.end method


# virtual methods
.method public a(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 63
    invoke-direct {p0, p1}, Lorg/b/d;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 65
    iget-object v0, p0, Lorg/b/d;->f:Lorg/c/b/b;

    const-string v1, "http://www.w3.org/2003/05/soap-envelope"

    const-string v2, "Value"

    invoke-virtual {v0, v1, v2}, Lorg/c/b/b;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/c/b/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lorg/c/b/a;->h(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/b/d;->a:Ljava/lang/String;

    .line 66
    iget-object v0, p0, Lorg/b/d;->g:Lorg/c/b/b;

    const-string v1, "http://www.w3.org/2003/05/soap-envelope"

    const-string v2, "Text"

    invoke-virtual {v0, v1, v2}, Lorg/c/b/b;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/c/b/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lorg/c/b/a;->h(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/b/d;->b:Ljava/lang/String;

    .line 67
    iget-object v0, p0, Lorg/b/d;->j:Lorg/c/b/b;

    iput-object v0, p0, Lorg/b/d;->d:Lorg/c/b/b;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/b/d;->c:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public getMessage()Ljava/lang/String;
    .locals 3

    .prologue
    .line 140
    iget-object v0, p0, Lorg/b/d;->g:Lorg/c/b/b;

    const-string v1, "http://www.w3.org/2003/05/soap-envelope"

    const-string v2, "Text"

    invoke-virtual {v0, v1, v2}, Lorg/c/b/b;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/c/b/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/c/b/a;->h(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 145
    iget-object v0, p0, Lorg/b/d;->g:Lorg/c/b/b;

    const-string v1, "http://www.w3.org/2003/05/soap-envelope"

    const-string v2, "Text"

    invoke-virtual {v0, v1, v2}, Lorg/c/b/b;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/c/b/a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lorg/c/b/a;->h(I)Ljava/lang/String;

    move-result-object v0

    .line 146
    iget-object v1, p0, Lorg/b/d;->f:Lorg/c/b/b;

    const-string v2, "http://www.w3.org/2003/05/soap-envelope"

    const-string v3, "Value"

    invoke-virtual {v1, v2, v3}, Lorg/c/b/b;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/c/b/a;

    move-result-object v1

    invoke-virtual {v1, v4}, Lorg/c/b/a;->h(I)Ljava/lang/String;

    move-result-object v1

    .line 147
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const-string v2, ", Reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
