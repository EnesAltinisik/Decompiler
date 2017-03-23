.class public Lorg/b/a/a;
.super Ljava/lang/Object;
.source "AttributeContainer.java"


# instance fields
.field protected a:Ljava/util/Vector;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/b/a/a;->a:Ljava/util/Vector;

    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 111
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lorg/b/a/a;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 112
    iget-object v0, p0, Lorg/b/a/a;->a:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/b;

    invoke-virtual {v0}, Lorg/b/a/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 116
    :goto_1
    return-object v0

    .line 111
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 116
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lorg/b/a/a;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method

.method public a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lorg/b/a/a;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/b;

    invoke-virtual {v0}, Lorg/b/a/b;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(ILorg/b/a/b;)V
    .locals 2

    .prologue
    .line 15
    iget-object v0, p0, Lorg/b/a/a;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/b;

    .line 16
    iget-object v1, v0, Lorg/b/a/b;->h:Ljava/lang/String;

    iput-object v1, p2, Lorg/b/a/b;->h:Ljava/lang/String;

    .line 17
    iget-object v1, v0, Lorg/b/a/b;->i:Ljava/lang/String;

    iput-object v1, p2, Lorg/b/a/b;->i:Ljava/lang/String;

    .line 18
    iget v1, v0, Lorg/b/a/b;->j:I

    iput v1, p2, Lorg/b/a/b;->j:I

    .line 19
    iget-object v1, v0, Lorg/b/a/b;->l:Ljava/lang/Object;

    iput-object v1, p2, Lorg/b/a/b;->l:Ljava/lang/Object;

    .line 20
    iget-object v1, v0, Lorg/b/a/b;->n:Lorg/b/a/g;

    iput-object v1, p2, Lorg/b/a/b;->n:Lorg/b/a/g;

    .line 21
    invoke-virtual {v0}, Lorg/b/a/b;->d()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p2, Lorg/b/a/b;->k:Ljava/lang/Object;

    .line 22
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 162
    new-instance v1, Lorg/b/a/b;

    invoke-direct {v1}, Lorg/b/a/b;-><init>()V

    .line 163
    iput-object p1, v1, Lorg/b/a/b;->h:Ljava/lang/String;

    .line 164
    if-nez p2, :cond_0

    sget-object v0, Lorg/b/a/g;->a:Ljava/lang/Class;

    :goto_0
    iput-object v0, v1, Lorg/b/a/b;->l:Ljava/lang/Object;

    .line 165
    iput-object p2, v1, Lorg/b/a/b;->k:Ljava/lang/Object;

    .line 166
    invoke-virtual {p0, v1}, Lorg/b/a/a;->a(Lorg/b/a/b;)V

    .line 167
    return-void

    .line 164
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lorg/b/a/b;)V
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lorg/b/a/a;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 189
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lorg/b/a/a;->c(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 72
    const/4 v0, 0x1

    .line 74
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a(Lorg/b/a/a;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 135
    invoke-virtual {p0}, Lorg/b/a/a;->a()I

    move-result v3

    .line 136
    invoke-virtual {p1}, Lorg/b/a/a;->a()I

    move-result v0

    if-eq v3, v0, :cond_0

    move v0, v1

    .line 151
    :goto_0
    return v0

    :cond_0
    move v2, v1

    .line 140
    :goto_1
    if-ge v2, v3, :cond_3

    .line 141
    iget-object v0, p0, Lorg/b/a/a;->a:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/b;

    .line 142
    invoke-virtual {v0}, Lorg/b/a/b;->d()Ljava/lang/Object;

    move-result-object v4

    .line 143
    invoke-virtual {v0}, Lorg/b/a/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lorg/b/a/a;->a(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    move v0, v1

    .line 144
    goto :goto_0

    .line 146
    :cond_1
    invoke-virtual {v0}, Lorg/b/a/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/b/a/a;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 147
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 148
    goto :goto_0

    .line 140
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 151
    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lorg/b/a/a;->c(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 86
    if-eqz v0, :cond_0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    .line 89
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
