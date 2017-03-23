.class Lorg/b/a/c;
.super Ljava/lang/Object;
.source "DM.java"

# interfaces
.implements Lorg/b/a/f;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;Lorg/b/a/g;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 35
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 36
    const/4 v1, 0x0

    invoke-virtual {p3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 46
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 40
    :sswitch_0
    new-instance v1, Ljava/lang/Integer;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    move-object v0, v1

    .line 44
    :goto_0
    :sswitch_1
    return-object v0

    .line 42
    :sswitch_2
    new-instance v1, Ljava/lang/Long;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    move-object v0, v1

    goto :goto_0

    .line 44
    :sswitch_3
    new-instance v1, Ljava/lang/Boolean;

    invoke-static {v0}, Lorg/b/b;->a(Ljava/lang/String;)Z

    move-result v0

    invoke-direct {v1, v0}, Ljava/lang/Boolean;-><init>(Z)V

    move-object v0, v1

    goto :goto_0

    .line 36
    nop

    :sswitch_data_0
    .sparse-switch
        0x62 -> :sswitch_3
        0x69 -> :sswitch_0
        0x6c -> :sswitch_2
        0x73 -> :sswitch_1
    .end sparse-switch
.end method

.method public a(Lorg/b/a/j;)V
    .locals 3

    .prologue
    .line 72
    iget-object v0, p1, Lorg/b/a/j;->j:Ljava/lang/String;

    const-string v1, "int"

    sget-object v2, Lorg/b/a/g;->c:Ljava/lang/Class;

    invoke-virtual {p1, v0, v1, v2, p0}, Lorg/b/a/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/b/a/f;)V

    .line 73
    iget-object v0, p1, Lorg/b/a/j;->j:Ljava/lang/String;

    const-string v1, "long"

    sget-object v2, Lorg/b/a/g;->d:Ljava/lang/Class;

    invoke-virtual {p1, v0, v1, v2, p0}, Lorg/b/a/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/b/a/f;)V

    .line 74
    iget-object v0, p1, Lorg/b/a/j;->j:Ljava/lang/String;

    const-string v1, "string"

    sget-object v2, Lorg/b/a/g;->b:Ljava/lang/Class;

    invoke-virtual {p1, v0, v1, v2, p0}, Lorg/b/a/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/b/a/f;)V

    .line 75
    iget-object v0, p1, Lorg/b/a/j;->j:Ljava/lang/String;

    const-string v1, "boolean"

    sget-object v2, Lorg/b/a/g;->e:Ljava/lang/Class;

    invoke-virtual {p1, v0, v1, v2, p0}, Lorg/b/a/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/b/a/f;)V

    .line 76
    return-void
.end method

.method public a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 58
    instance-of v0, p2, Lorg/b/a/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 59
    check-cast v0, Lorg/b/a/a;

    .line 60
    invoke-virtual {v0}, Lorg/b/a/a;->a()I

    move-result v2

    .line 61
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 62
    new-instance v3, Lorg/b/a/b;

    invoke-direct {v3}, Lorg/b/a/b;-><init>()V

    .line 63
    invoke-virtual {v0, v1, v3}, Lorg/b/a/a;->a(ILorg/b/a/b;)V

    .line 64
    invoke-virtual {v3}, Lorg/b/a/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lorg/b/a/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lorg/b/a/b;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v4, v5, v3}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 61
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 69
    return-void
.end method
