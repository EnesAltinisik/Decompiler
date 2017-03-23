.class public Lorg/b/b;
.super Ljava/lang/Object;
.source "SoapEnvelope.java"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:[Lorg/c/b/a;

.field public d:[Lorg/c/b/a;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput p1, p0, Lorg/b/b;->f:I

    .line 109
    const/16 v0, 0x64

    if-ne p1, v0, :cond_0

    .line 110
    const-string v0, "http://www.w3.org/1999/XMLSchema-instance"

    iput-object v0, p0, Lorg/b/b;->i:Ljava/lang/String;

    .line 111
    const-string v0, "http://www.w3.org/1999/XMLSchema"

    iput-object v0, p0, Lorg/b/b;->j:Ljava/lang/String;

    .line 116
    :goto_0
    const/16 v0, 0x78

    if-ge p1, v0, :cond_1

    .line 117
    const-string v0, "http://schemas.xmlsoap.org/soap/encoding/"

    iput-object v0, p0, Lorg/b/b;->h:Ljava/lang/String;

    .line 118
    const-string v0, "http://schemas.xmlsoap.org/soap/envelope/"

    iput-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    .line 123
    :goto_1
    return-void

    .line 113
    :cond_0
    const-string v0, "http://www.w3.org/2001/XMLSchema-instance"

    iput-object v0, p0, Lorg/b/b;->i:Ljava/lang/String;

    .line 114
    const-string v0, "http://www.w3.org/2001/XMLSchema"

    iput-object v0, p0, Lorg/b/b;->j:Ljava/lang/String;

    goto :goto_0

    .line 120
    :cond_1
    const-string v0, "http://www.w3.org/2003/05/soap-encoding"

    iput-object v0, p0, Lorg/b/b;->h:Ljava/lang/String;

    .line 121
    const-string v0, "http://www.w3.org/2003/05/soap-envelope"

    iput-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 62
    if-nez p0, :cond_1

    .line 66
    :cond_0
    :goto_0
    return v0

    .line 65
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 66
    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "true"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 237
    iput-object p1, p0, Lorg/b/b;->b:Ljava/lang/Object;

    .line 238
    return-void
.end method

.method public a(Lorg/xmlpull/v1/XmlPullParser;)V
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

    .line 127
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 128
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Envelope"

    invoke-interface {p1, v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "encodingStyle"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/b/b;->e:Ljava/lang/String;

    .line 130
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 131
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v2, :cond_0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/b/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Header"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    invoke-virtual {p0, p1}, Lorg/b/b;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 135
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Header"

    invoke-interface {p1, v3, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 138
    :cond_0
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Body"

    invoke-interface {p1, v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "encodingStyle"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/b/b;->e:Ljava/lang/String;

    .line 140
    invoke-virtual {p0, p1}, Lorg/b/b;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 141
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Body"

    invoke-interface {p1, v3, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 142
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 143
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Envelope"

    invoke-interface {p1, v3, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 144
    return-void
.end method

.method public a(Lorg/xmlpull/v1/XmlSerializer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 196
    const-string v0, "i"

    iget-object v1, p0, Lorg/b/b;->i:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->setPrefix(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v0, "d"

    iget-object v1, p0, Lorg/b/b;->j:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->setPrefix(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const-string v0, "c"

    iget-object v1, p0, Lorg/b/b;->h:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->setPrefix(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    const-string v0, "v"

    iget-object v1, p0, Lorg/b/b;->g:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->setPrefix(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Envelope"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 201
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Header"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 202
    invoke-virtual {p0, p1}, Lorg/b/b;->b(Lorg/xmlpull/v1/XmlSerializer;)V

    .line 203
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Header"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 204
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Body"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 205
    invoke-virtual {p0, p1}, Lorg/b/b;->c(Lorg/xmlpull/v1/XmlSerializer;)V

    .line 206
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Body"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 207
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "Envelope"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 208
    return-void
.end method

.method public b(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 148
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 150
    new-instance v3, Lorg/c/b/b;

    invoke-direct {v3}, Lorg/c/b/b;-><init>()V

    .line 151
    invoke-virtual {v3, p1}, Lorg/c/b/b;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    move v0, v1

    move v2, v1

    .line 153
    :goto_0
    invoke-virtual {v3}, Lorg/c/b/b;->e()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 154
    invoke-virtual {v3, v0}, Lorg/c/b/b;->g(I)Lorg/c/b/a;

    move-result-object v4

    .line 155
    if-eqz v4, :cond_0

    .line 156
    add-int/lit8 v2, v2, 0x1

    .line 153
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 159
    :cond_1
    new-array v0, v2, [Lorg/c/b/a;

    iput-object v0, p0, Lorg/b/b;->c:[Lorg/c/b/a;

    move v0, v1

    .line 161
    :goto_1
    invoke-virtual {v3}, Lorg/c/b/b;->e()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 162
    invoke-virtual {v3, v1}, Lorg/c/b/b;->g(I)Lorg/c/b/a;

    move-result-object v4

    .line 163
    if-eqz v4, :cond_2

    .line 164
    iget-object v5, p0, Lorg/b/b;->c:[Lorg/c/b/a;

    add-int/lit8 v2, v0, 0x1

    aput-object v4, v5, v0

    move v0, v2

    .line 161
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 167
    :cond_3
    return-void
.end method

.method public b(Lorg/xmlpull/v1/XmlSerializer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 214
    iget-object v0, p0, Lorg/b/b;->d:[Lorg/c/b/a;

    if-eqz v0, :cond_0

    .line 215
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/b/b;->d:[Lorg/c/b/a;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 216
    iget-object v1, p0, Lorg/b/b;->d:[Lorg/c/b/a;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Lorg/c/b/a;->a(Lorg/xmlpull/v1/XmlSerializer;)V

    .line 215
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 219
    :cond_0
    return-void
.end method

.method public c(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 170
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 172
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/b/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Fault"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 177
    iget v0, p0, Lorg/b/b;->f:I

    const/16 v1, 0x78

    if-ge v0, v1, :cond_0

    .line 178
    new-instance v0, Lorg/b/c;

    iget v1, p0, Lorg/b/b;->f:I

    invoke-direct {v0, v1}, Lorg/b/c;-><init>(I)V

    .line 182
    :goto_0
    invoke-virtual {v0, p1}, Lorg/b/c;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 183
    iput-object v0, p0, Lorg/b/b;->a:Ljava/lang/Object;

    .line 189
    :goto_1
    return-void

    .line 180
    :cond_0
    new-instance v0, Lorg/b/d;

    iget v1, p0, Lorg/b/b;->f:I

    invoke-direct {v0, v1}, Lorg/b/d;-><init>(I)V

    goto :goto_0

    .line 185
    :cond_1
    iget-object v0, p0, Lorg/b/b;->a:Ljava/lang/Object;

    instance-of v0, v0, Lorg/c/b/b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/b/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/c/b/b;

    .line 186
    :goto_2
    invoke-virtual {v0, p1}, Lorg/c/b/b;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 187
    iput-object v0, p0, Lorg/b/b;->a:Ljava/lang/Object;

    goto :goto_1

    .line 185
    :cond_2
    new-instance v0, Lorg/c/b/b;

    invoke-direct {v0}, Lorg/c/b/b;-><init>()V

    goto :goto_2
.end method

.method public c(Lorg/xmlpull/v1/XmlSerializer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 226
    iget-object v0, p0, Lorg/b/b;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 227
    iget-object v0, p0, Lorg/b/b;->g:Ljava/lang/String;

    const-string v1, "encodingStyle"

    iget-object v2, p0, Lorg/b/b;->e:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 229
    :cond_0
    iget-object v0, p0, Lorg/b/b;->b:Ljava/lang/Object;

    check-cast v0, Lorg/c/b/b;

    invoke-virtual {v0, p1}, Lorg/c/b/b;->a(Lorg/xmlpull/v1/XmlSerializer;)V

    .line 230
    return-void
.end method
