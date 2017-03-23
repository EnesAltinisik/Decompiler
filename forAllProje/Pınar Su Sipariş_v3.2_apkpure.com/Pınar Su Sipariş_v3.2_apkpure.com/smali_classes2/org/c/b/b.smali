.class public Lorg/c/b/b;
.super Ljava/lang/Object;
.source "Node.java"


# instance fields
.field protected f:Ljava/util/Vector;

.field protected g:Ljava/lang/StringBuffer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 4

    .prologue
    .line 200
    invoke-virtual {p0}, Lorg/c/b/b;->e()I

    move-result v1

    move v0, p3

    .line 202
    :goto_0
    if-ge v0, v1, :cond_2

    .line 204
    invoke-virtual {p0, v0}, Lorg/c/b/b;->g(I)Lorg/c/b/a;

    move-result-object v2

    .line 206
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/c/b/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {v2}, Lorg/c/b/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 211
    :cond_0
    :goto_1
    return v0

    .line 202
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 211
    :cond_2
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lorg/c/b/a;
    .locals 1

    .prologue
    .line 86
    new-instance v0, Lorg/c/b/a;

    invoke-direct {v0}, Lorg/c/b/a;-><init>()V

    .line 87
    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iput-object p1, v0, Lorg/c/b/a;->a:Ljava/lang/String;

    .line 88
    iput-object p2, v0, Lorg/c/b/a;->b:Ljava/lang/String;

    .line 89
    return-object v0
.end method

.method public a(IILjava/lang/Object;)V
    .locals 2

    .prologue
    .line 49
    if-nez p3, :cond_0

    .line 50
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 52
    :cond_0
    iget-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    if-nez v0, :cond_1

    .line 53
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    .line 54
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iput-object v0, p0, Lorg/c/b/b;->g:Ljava/lang/StringBuffer;

    .line 57
    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_4

    .line 58
    instance-of v0, p3, Lorg/c/b/a;

    if-nez v0, :cond_2

    .line 59
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Element obj expected)"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object v0, p3

    .line 61
    check-cast v0, Lorg/c/b/a;

    invoke-virtual {v0, p0}, Lorg/c/b/a;->a(Lorg/c/b/b;)V

    .line 66
    :cond_3
    iget-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    invoke-virtual {v0, p3, p1}, Ljava/util/Vector;->insertElementAt(Ljava/lang/Object;I)V

    .line 67
    iget-object v0, p0, Lorg/c/b/b;->g:Ljava/lang/StringBuffer;

    int-to-char v1, p2

    invoke-virtual {v0, p1, v1}, Ljava/lang/StringBuffer;->insert(IC)Ljava/lang/StringBuffer;

    .line 68
    return-void

    .line 63
    :cond_4
    instance-of v0, p3, Ljava/lang/String;

    if-nez v0, :cond_3

    .line 64
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "String expected"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 73
    invoke-virtual {p0}, Lorg/c/b/b;->e()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Lorg/c/b/b;->a(IILjava/lang/Object;)V

    .line 74
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
    const/4 v3, 0x6

    .line 226
    const/4 v0, 0x0

    .line 229
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    .line 233
    packed-switch v1, :pswitch_data_0

    .line 257
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 258
    if-ne v1, v3, :cond_1

    const/4 v1, 0x4

    :cond_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/c/b/b;->a(ILjava/lang/Object;)V

    .line 266
    :cond_2
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 269
    :goto_1
    if-eqz v0, :cond_0

    .line 270
    return-void

    .line 237
    :pswitch_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/c/b/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/c/b/a;

    move-result-object v1

    .line 242
    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lorg/c/b/b;->a(ILjava/lang/Object;)V

    .line 247
    invoke-virtual {v1, p1}, Lorg/c/b/a;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 253
    :pswitch_1
    const/4 v0, 0x1

    .line 254
    goto :goto_1

    .line 261
    :cond_3
    if-ne v1, v3, :cond_2

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 264
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v3, v1}, Lorg/c/b/b;->a(ILjava/lang/Object;)V

    goto :goto_0

    .line 233
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lorg/xmlpull/v1/XmlSerializer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 313
    invoke-virtual {p0, p1}, Lorg/c/b/b;->b(Lorg/xmlpull/v1/XmlSerializer;)V

    .line 314
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlSerializer;->flush()V

    .line 315
    return-void
.end method

.method public b(Lorg/xmlpull/v1/XmlSerializer;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 320
    iget-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    if-nez v0, :cond_1

    .line 365
    :cond_0
    return-void

    .line 323
    :cond_1
    iget-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v2

    .line 325
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 326
    invoke-virtual {p0, v1}, Lorg/c/b/b;->i(I)I

    move-result v3

    .line 327
    iget-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 328
    packed-switch v3, :pswitch_data_0

    .line 362
    :pswitch_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 330
    :pswitch_1
    check-cast v0, Lorg/c/b/a;

    invoke-virtual {v0, p1}, Lorg/c/b/a;->a(Lorg/xmlpull/v1/XmlSerializer;)V

    .line 325
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 334
    :pswitch_2
    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto :goto_1

    .line 338
    :pswitch_3
    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlSerializer;->ignorableWhitespace(Ljava/lang/String;)V

    goto :goto_1

    .line 342
    :pswitch_4
    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlSerializer;->cdsect(Ljava/lang/String;)V

    goto :goto_1

    .line 346
    :pswitch_5
    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlSerializer;->comment(Ljava/lang/String;)V

    goto :goto_1

    .line 350
    :pswitch_6
    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlSerializer;->entityRef(Ljava/lang/String;)V

    goto :goto_1

    .line 354
    :pswitch_7
    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlSerializer;->processingInstruction(Ljava/lang/String;)V

    goto :goto_1

    .line 358
    :pswitch_8
    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlSerializer;->docdecl(Ljava/lang/String;)V

    goto :goto_1

    .line 328
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_7
        :pswitch_5
        :pswitch_8
    .end packed-switch
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Lorg/c/b/a;
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 120
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/c/b/b;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 121
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, p1, p2, v1}, Lorg/c/b/b;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v1

    .line 123
    if-eq v0, v4, :cond_0

    if-eq v1, v4, :cond_2

    .line 124
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Element {"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-ne v0, v4, :cond_1

    const-string v0, " not found in "

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, " more than once in "

    goto :goto_0

    .line 132
    :cond_2
    invoke-virtual {p0, v0}, Lorg/c/b/b;->g(I)Lorg/c/b/a;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    goto :goto_0
.end method

.method public f(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lorg/c/b/b;->f:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g(I)Lorg/c/b/a;
    .locals 2

    .prologue
    .line 110
    invoke-virtual {p0, p1}, Lorg/c/b/b;->f(I)Ljava/lang/Object;

    move-result-object v0

    .line 111
    instance-of v1, v0, Lorg/c/b/a;

    if-eqz v1, :cond_0

    check-cast v0, Lorg/c/b/a;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 175
    invoke-virtual {p0, p1}, Lorg/c/b/b;->j(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lorg/c/b/b;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public i(I)I
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lorg/c/b/b;->g:Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v0

    return v0
.end method

.method public j(I)Z
    .locals 2

    .prologue
    .line 215
    invoke-virtual {p0, p1}, Lorg/c/b/b;->i(I)I

    move-result v0

    .line 216
    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
