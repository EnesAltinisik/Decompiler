.class public Lorg/c/a/b;
.super Ljava/lang/Object;
.source "KXmlSerializer.java"

# interfaces
.implements Lorg/xmlpull/v1/XmlSerializer;


# instance fields
.field private a:Ljava/io/Writer;

.field private b:Z

.field private c:I

.field private d:I

.field private e:[Ljava/lang/String;

.field private f:[I

.field private g:[Ljava/lang/String;

.field private h:[Z

.field private i:Z

.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    .line 39
    new-array v0, v1, [I

    iput-object v0, p0, Lorg/c/a/b;->f:[I

    .line 40
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    .line 42
    new-array v0, v1, [Z

    iput-object v0, p0, Lorg/c/a/b;->h:[Z

    return-void
.end method

.method private final a(Ljava/lang/String;ZZ)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 185
    iget-object v0, p0, Lorg/c/a/b;->f:[I

    iget v2, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v2, v2, 0x1

    aget v0, v0, v2

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0x2

    move v3, v0

    .line 186
    :goto_0
    if-ltz v3, :cond_3

    .line 188
    iget-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    add-int/lit8 v2, v3, 0x1

    aget-object v0, v0, v2

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_0

    iget-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    aget-object v0, v0, v3

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 190
    :cond_0
    iget-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    aget-object v2, v0, v3

    .line 191
    add-int/lit8 v0, v3, 0x2

    .line 192
    :goto_1
    iget-object v4, p0, Lorg/c/a/b;->f:[I

    iget v5, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v5, v5, 0x1

    aget v4, v4, v5

    mul-int/lit8 v4, v4, 0x2

    if-ge v0, v4, :cond_8

    .line 194
    iget-object v4, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    aget-object v4, v4, v0

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v0, v1

    .line 199
    :goto_2
    if-eqz v0, :cond_2

    .line 230
    :goto_3
    return-object v0

    .line 193
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 187
    :cond_2
    add-int/lit8 v0, v3, -0x2

    move v3, v0

    goto :goto_0

    .line 204
    :cond_3
    if-nez p3, :cond_4

    move-object v0, v1

    .line 205
    goto :goto_3

    .line 209
    :cond_4
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 210
    const-string v0, ""

    .line 226
    :goto_4
    iget-boolean v1, p0, Lorg/c/a/b;->b:Z

    .line 227
    const/4 v2, 0x0

    iput-boolean v2, p0, Lorg/c/a/b;->b:Z

    .line 228
    invoke-virtual {p0, v0, p1}, Lorg/c/a/b;->setPrefix(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    iput-boolean v1, p0, Lorg/c/a/b;->b:Z

    goto :goto_3

    .line 213
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lorg/c/a/b;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/c/a/b;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 214
    iget-object v2, p0, Lorg/c/a/b;->f:[I

    iget v3, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v3, v3, 0x1

    aget v2, v2, v3

    mul-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, -0x2

    .line 215
    :goto_5
    if-ltz v2, :cond_6

    .line 217
    iget-object v3, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object v0, v1

    .line 223
    :cond_6
    if-eqz v0, :cond_5

    goto :goto_4

    .line 216
    :cond_7
    add-int/lit8 v2, v2, -0x2

    goto :goto_5

    :cond_8
    move-object v0, v2

    goto :goto_2
.end method

.method private final a(Ljava/lang/String;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 91
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 93
    sparse-switch v1, :sswitch_data_0

    .line 122
    :cond_0
    const/16 v2, 0x20

    if-lt v1, v2, :cond_4

    const/16 v2, 0x40

    if-eq v1, v2, :cond_4

    const/16 v2, 0x7f

    if-lt v1, v2, :cond_1

    iget-boolean v2, p0, Lorg/c/a/b;->i:Z

    if-eqz v2, :cond_4

    .line 123
    :cond_1
    iget-object v2, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(I)V

    .line 91
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 97
    :sswitch_0
    const/4 v2, -0x1

    if-ne p2, v2, :cond_2

    .line 98
    iget-object v2, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(I)V

    goto :goto_1

    .line 100
    :cond_2
    iget-object v2, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "&#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v3, 0x3b

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 103
    :sswitch_1
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v2, "&amp;"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 106
    :sswitch_2
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v2, "&gt;"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 109
    :sswitch_3
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v2, "&lt;"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 113
    :sswitch_4
    if-ne v1, p2, :cond_0

    .line 114
    iget-object v2, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v3, 0x22

    if-ne v1, v3, :cond_3

    const-string v1, "&quot;"

    :goto_2
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v1, "&apos;"

    goto :goto_2

    .line 125
    :cond_4
    iget-object v2, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "&#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ";"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 129
    :cond_5
    return-void

    .line 93
    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xd -> :sswitch_0
        0x22 -> :sswitch_4
        0x26 -> :sswitch_1
        0x27 -> :sswitch_4
        0x3c -> :sswitch_3
        0x3e -> :sswitch_2
    .end sparse-switch
.end method

.method private final a(Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v5, 0x22

    const/4 v4, 0x0

    .line 47
    iget-boolean v0, p0, Lorg/c/a/b;->b:Z

    if-nez v0, :cond_0

    .line 86
    :goto_0
    return-void

    .line 50
    :cond_0
    iget v0, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/c/a/b;->d:I

    .line 51
    iput-boolean v4, p0, Lorg/c/a/b;->b:Z

    .line 53
    iget-object v0, p0, Lorg/c/a/b;->h:[Z

    array-length v0, v0

    iget v1, p0, Lorg/c/a/b;->d:I

    if-gt v0, v1, :cond_1

    .line 54
    iget v0, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v0, v0, 0x4

    new-array v0, v0, [Z

    .line 55
    iget-object v1, p0, Lorg/c/a/b;->h:[Z

    iget v2, p0, Lorg/c/a/b;->d:I

    invoke-static {v1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    iput-object v0, p0, Lorg/c/a/b;->h:[Z

    .line 58
    :cond_1
    iget-object v0, p0, Lorg/c/a/b;->h:[Z

    iget v1, p0, Lorg/c/a/b;->d:I

    iget-object v2, p0, Lorg/c/a/b;->h:[Z

    iget v3, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v3, v3, -0x1

    aget-boolean v2, v2, v3

    aput-boolean v2, v0, v1

    .line 60
    iget-object v0, p0, Lorg/c/a/b;->f:[I

    iget v1, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    .line 61
    :goto_1
    iget-object v1, p0, Lorg/c/a/b;->f:[I

    iget v2, p0, Lorg/c/a/b;->d:I

    aget v1, v1, v2

    if-ge v0, v1, :cond_4

    .line 63
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 64
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v2, "xmlns"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 65
    const-string v1, ""

    iget-object v2, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v3, v0, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 66
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 67
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    iget-object v2, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v3, v0, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 71
    :cond_2
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v2, "=\""

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 72
    iget-object v1, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v2, v0, 0x2

    add-int/lit8 v2, v2, 0x1

    aget-object v1, v1, v2

    invoke-direct {p0, v1, v5}, Lorg/c/a/b;->a(Ljava/lang/String;I)V

    .line 73
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(I)V

    .line 62
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 69
    :cond_3
    const-string v1, ""

    invoke-virtual {p0}, Lorg/c/a/b;->getNamespace()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ""

    iget-object v2, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v3, v0, 0x2

    add-int/lit8 v3, v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set default namespace for elements in no namespace"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_4
    iget-object v0, p0, Lorg/c/a/b;->f:[I

    array-length v0, v0

    iget v1, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    if-gt v0, v1, :cond_5

    .line 77
    iget v0, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v0, v0, 0x8

    new-array v0, v0, [I

    .line 78
    iget-object v1, p0, Lorg/c/a/b;->f:[I

    iget v2, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    iput-object v0, p0, Lorg/c/a/b;->f:[I

    .line 82
    :cond_5
    iget-object v0, p0, Lorg/c/a/b;->f:[I

    iget v1, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lorg/c/a/b;->f:[I

    iget v3, p0, Lorg/c/a/b;->d:I

    aget v2, v2, v3

    aput v2, v0, v1

    .line 85
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    if-eqz p1, :cond_6

    const-string v0, " />"

    :goto_2
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    const-string v0, ">"

    goto :goto_2
.end method


# virtual methods
.method public attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v1, 0x22

    .line 404
    iget-boolean v0, p0, Lorg/c/a/b;->b:Z

    if-nez v0, :cond_0

    .line 405
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "illegal position for attribute"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 409
    :cond_0
    if-nez p1, :cond_1

    .line 410
    const-string p1, ""

    .line 415
    :cond_1
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, ""

    .line 436
    :goto_0
    iget-object v2, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/io/Writer;->write(I)V

    .line 437
    const-string v2, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 438
    iget-object v2, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 439
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(I)V

    .line 441
    :cond_2
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 442
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(I)V

    .line 443
    invoke-virtual {p3, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_4

    move v0, v1

    .line 444
    :goto_1
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 445
    invoke-direct {p0, p3, v0}, Lorg/c/a/b;->a(Ljava/lang/String;I)V

    .line 446
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 448
    return-object p0

    .line 415
    :cond_3
    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v2}, Lorg/c/a/b;->a(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 443
    :cond_4
    const/16 v0, 0x27

    goto :goto_1
.end method

.method public cdsect(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 527
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/c/a/b;->a(Z)V

    .line 528
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "<![CDATA["

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 529
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 530
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "]]>"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 531
    return-void
.end method

.method public comment(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 534
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/c/a/b;->a(Z)V

    .line 535
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "<!--"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 536
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 537
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "-->"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 538
    return-void
.end method

.method public docdecl(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 139
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "<!DOCTYPE"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 142
    return-void
.end method

.method public endDocument()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 145
    :goto_0
    iget v0, p0, Lorg/c/a/b;->d:I

    if-lez v0, :cond_0

    .line 146
    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lorg/c/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, -0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    iget v2, p0, Lorg/c/a/b;->d:I

    mul-int/lit8 v2, v2, 0x3

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    invoke-virtual {p0, v0, v1}, Lorg/c/a/b;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto :goto_0

    .line 150
    :cond_0
    invoke-virtual {p0}, Lorg/c/a/b;->flush()V

    .line 151
    return-void
.end method

.method public endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 464
    iget-boolean v0, p0, Lorg/c/a/b;->b:Z

    if-nez v0, :cond_0

    .line 465
    iget v0, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/c/a/b;->d:I

    .line 469
    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lorg/c/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    aget-object v0, v0, v1

    if-nez v0, :cond_3

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lorg/c/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lorg/c/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 474
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "</{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "> does not match start"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 476
    :cond_4
    iget-boolean v0, p0, Lorg/c/a/b;->b:Z

    if-eqz v0, :cond_5

    .line 477
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/c/a/b;->a(Z)V

    .line 478
    iget v0, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/c/a/b;->d:I

    .line 497
    :goto_0
    iget-object v0, p0, Lorg/c/a/b;->f:[I

    iget v1, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lorg/c/a/b;->f:[I

    iget v3, p0, Lorg/c/a/b;->d:I

    aget v2, v2, v3

    aput v2, v0, v1

    .line 498
    return-object p0

    .line 481
    :cond_5
    iget-object v0, p0, Lorg/c/a/b;->h:[Z

    iget v1, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_6

    .line 482
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 483
    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Lorg/c/a/b;->d:I

    if-ge v0, v1, :cond_6

    .line 484
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 483
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 487
    :cond_6
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "</"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 488
    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lorg/c/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    .line 489
    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 490
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 491
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 493
    :cond_7
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 494
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    goto :goto_0
.end method

.method public entityRef(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 154
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/c/a/b;->a(Z)V

    .line 155
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x26

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 156
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3b

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 158
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 452
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/c/a/b;->a(Z)V

    .line 453
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 454
    return-void
.end method

.method public getDepth()I
    .locals 1

    .prologue
    .line 510
    iget-boolean v0, p0, Lorg/c/a/b;->b:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v0, v0, 0x1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lorg/c/a/b;->d:I

    goto :goto_0
.end method

.method public getFeature(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 162
    const-string v0, "http://xmlpull.org/v1/doc/features.html#indent-output"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/c/a/b;->h:[Z

    iget v1, p0, Lorg/c/a/b;->d:I

    aget-boolean v0, v0, v1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 506
    invoke-virtual {p0}, Lorg/c/a/b;->getDepth()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    invoke-virtual {p0}, Lorg/c/a/b;->getDepth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    goto :goto_0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 2

    .prologue
    .line 502
    invoke-virtual {p0}, Lorg/c/a/b;->getDepth()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    invoke-virtual {p0}, Lorg/c/a/b;->getDepth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, -0x3

    aget-object v0, v0, v1

    goto :goto_0
.end method

.method public getPrefix(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .prologue
    .line 172
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, v0, p2}, Lorg/c/a/b;->a(Ljava/lang/String;ZZ)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 174
    :catch_0
    move-exception v0

    .line 175
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 234
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unsupported property"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ignorableWhitespace(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 239
    invoke-virtual {p0, p1}, Lorg/c/a/b;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 240
    return-void
.end method

.method public processingInstruction(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 542
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/c/a/b;->a(Z)V

    .line 543
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "<?"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 544
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 545
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "?>"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 546
    return-void
.end method

.method public setFeature(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 243
    const-string v0, "http://xmlpull.org/v1/doc/features.html#indent-output"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lorg/c/a/b;->h:[Z

    iget v1, p0, Lorg/c/a/b;->d:I

    aput-boolean p2, v0, v1

    .line 249
    return-void

    .line 248
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unsupported Feature"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 307
    if-nez p1, :cond_0

    .line 308
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 309
    :cond_0
    if-nez p2, :cond_2

    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    :goto_0
    invoke-virtual {p0, v0}, Lorg/c/a/b;->setOutput(Ljava/io/Writer;)V

    .line 313
    iput-object p2, p0, Lorg/c/a/b;->j:Ljava/lang/String;

    .line 314
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/c/a/b;->i:Z

    .line 317
    :cond_1
    return-void

    .line 309
    :cond_2
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setOutput(Ljava/io/Writer;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 285
    iput-object p1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    .line 292
    iget-object v0, p0, Lorg/c/a/b;->f:[I

    aput v2, v0, v3

    .line 293
    iget-object v0, p0, Lorg/c/a/b;->f:[I

    aput v2, v0, v4

    .line 294
    iget-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v3

    .line 295
    iget-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v4

    .line 296
    iget-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    const-string v1, "xml"

    aput-object v1, v0, v2

    .line 297
    iget-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    const/4 v1, 0x3

    const-string v2, "http://www.w3.org/XML/1998/namespace"

    aput-object v2, v0, v1

    .line 298
    iput-boolean v3, p0, Lorg/c/a/b;->b:Z

    .line 299
    iput v3, p0, Lorg/c/a/b;->c:I

    .line 300
    iput v3, p0, Lorg/c/a/b;->d:I

    .line 302
    iput-boolean v3, p0, Lorg/c/a/b;->i:Z

    .line 303
    return-void
.end method

.method public setPrefix(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 259
    invoke-direct {p0, v4}, Lorg/c/a/b;->a(Z)V

    .line 260
    if-nez p1, :cond_0

    .line 261
    const-string p1, ""

    .line 262
    :cond_0
    if-nez p2, :cond_1

    .line 263
    const-string p2, ""

    .line 265
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0, v4}, Lorg/c/a/b;->a(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    .line 269
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 282
    :goto_0
    return-void

    .line 272
    :cond_2
    iget-object v0, p0, Lorg/c/a/b;->f:[I

    iget v1, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    aget v2, v0, v1

    add-int/lit8 v3, v2, 0x1

    aput v3, v0, v1

    shl-int/lit8 v0, v2, 0x1

    .line 274
    iget-object v1, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v2, v0, 0x1

    if-ge v1, v2, :cond_3

    .line 275
    iget-object v1, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, 0x10

    new-array v1, v1, [Ljava/lang/String;

    .line 276
    iget-object v2, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 277
    iput-object v1, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    .line 280
    :cond_3
    iget-object v1, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x1

    aput-object p1, v1, v0

    .line 281
    iget-object v0, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    aput-object p2, v0, v2

    goto :goto_0
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 252
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported Property:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 323
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "<?xml version=\'1.0\' "

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 325
    if-eqz p1, :cond_0

    .line 326
    iput-object p1, p0, Lorg/c/a/b;->j:Ljava/lang/String;

    .line 327
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/c/a/b;->i:Z

    .line 331
    :cond_0
    iget-object v0, p0, Lorg/c/a/b;->j:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 332
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "encoding=\'"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    iget-object v1, p0, Lorg/c/a/b;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "\' "

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 337
    :cond_1
    if-eqz p2, :cond_2

    .line 338
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "standalone=\'"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 339
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "yes"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 341
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "\' "

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 343
    :cond_2
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v1, "?>"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 344
    return-void

    .line 339
    :cond_3
    const-string v0, "no"

    goto :goto_0
.end method

.method public startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 348
    invoke-direct {p0, v1}, Lorg/c/a/b;->a(Z)V

    .line 353
    iget-object v0, p0, Lorg/c/a/b;->h:[Z

    iget v2, p0, Lorg/c/a/b;->d:I

    aget-boolean v0, v0, v2

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v2, "\r\n"

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    move v0, v1

    .line 355
    :goto_0
    iget v2, p0, Lorg/c/a/b;->d:I

    if-ge v0, v2, :cond_0

    .line 356
    iget-object v2, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const-string v3, "  "

    invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 355
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 359
    :cond_0
    iget v0, p0, Lorg/c/a/b;->d:I

    mul-int/lit8 v2, v0, 0x3

    .line 361
    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v3, v2, 0x3

    if-ge v0, v3, :cond_1

    .line 362
    iget-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    .line 363
    iget-object v3, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 364
    iput-object v0, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    .line 367
    :cond_1
    if-nez p1, :cond_2

    const-string v0, ""

    .line 372
    :goto_1
    const-string v1, ""

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 373
    iget-object v1, p0, Lorg/c/a/b;->f:[I

    iget v3, p0, Lorg/c/a/b;->d:I

    aget v1, v1, v3

    .line 374
    :goto_2
    iget-object v3, p0, Lorg/c/a/b;->f:[I

    iget v4, p0, Lorg/c/a/b;->d:I

    add-int/lit8 v4, v4, 0x1

    aget v3, v3, v4

    if-ge v1, v3, :cond_4

    .line 376
    const-string v3, ""

    iget-object v4, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v5, v1, 0x2

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, ""

    iget-object v4, p0, Lorg/c/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v5, v1, 0x2

    add-int/lit8 v5, v5, 0x1

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 377
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set default namespace for elements in no namespace"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 367
    :cond_2
    invoke-direct {p0, p1, v6, v6}, Lorg/c/a/b;->a(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 375
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 382
    :cond_4
    iget-object v1, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    add-int/lit8 v3, v2, 0x1

    aput-object p1, v1, v2

    .line 383
    iget-object v1, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    add-int/lit8 v2, v3, 0x1

    aput-object v0, v1, v3

    .line 384
    iget-object v1, p0, Lorg/c/a/b;->e:[Ljava/lang/String;

    aput-object p2, v1, v2

    .line 386
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x3c

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 387
    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 388
    iget-object v1, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 392
    :cond_5
    iget-object v0, p0, Lorg/c/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 394
    iput-boolean v6, p0, Lorg/c/a/b;->b:Z

    .line 396
    return-object p0
.end method

.method public text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 514
    invoke-direct {p0, v2}, Lorg/c/a/b;->a(Z)V

    .line 515
    iget-object v0, p0, Lorg/c/a/b;->h:[Z

    iget v1, p0, Lorg/c/a/b;->d:I

    aput-boolean v2, v0, v1

    .line 516
    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lorg/c/a/b;->a(Ljava/lang/String;I)V

    .line 517
    return-object p0
.end method

.method public text([CII)Lorg/xmlpull/v1/XmlSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 522
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {p0, v0}, Lorg/c/a/b;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 523
    return-object p0
.end method
