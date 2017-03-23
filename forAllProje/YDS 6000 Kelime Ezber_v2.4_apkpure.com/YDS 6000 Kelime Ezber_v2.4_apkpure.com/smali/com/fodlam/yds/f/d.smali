.class public Lcom/fodlam/yds/f/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public a:[Lcom/fodlam/yds/f/h;

.field public b:I

.field public c:Z

.field public d:Z

.field public e:[Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/fodlam/yds/f/d;->c:Z

    iput-boolean v0, p0, Lcom/fodlam/yds/f/d;->d:Z

    const/4 v0, 0x4

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/fodlam/yds/f/d;->e:[Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fodlam/yds/f/d;->c:Z

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>([Lcom/fodlam/yds/f/h;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/fodlam/yds/f/d;->c:Z

    iput-boolean v0, p0, Lcom/fodlam/yds/f/d;->d:Z

    const/4 v0, 0x4

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/fodlam/yds/f/d;->e:[Z

    iput-object p1, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    iput p2, p0, Lcom/fodlam/yds/f/d;->b:I

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method


# virtual methods
.method public a()Lcom/fodlam/yds/f/h;
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    iget v1, p0, Lcom/fodlam/yds/f/d;->b:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public a(I)Lcom/fodlam/yds/f/h;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public a(Lcom/fodlam/yds/f/h;)Z
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    iget-object v1, p1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    iget-object v2, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    aget-object v2, v2, v0

    iget-object v2, v2, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fodlam/yds/f/d;->e:[Z

    const/4 v2, 0x1

    aput-boolean v2, v1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    iget-object v1, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    iget v2, p0, Lcom/fodlam/yds/f/d;->b:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 3

    const-string v0, "?"

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->b:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v1, v2, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    iget v1, p0, Lcom/fodlam/yds/f/d;->b:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->c:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v1, v2, :cond_2

    iget-object v0, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    iget v1, p0, Lcom/fodlam/yds/f/d;->b:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->e:Lcom/fodlam/yds/OxfordApplication$a;

    if-eq v1, v2, :cond_3

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->d:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v1, v2, :cond_0

    :cond_3
    const-string v0, "?"

    goto :goto_0
.end method

.method public b(I)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->b:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v1, v2, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->c:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v1, v2, :cond_2

    iget-object v0, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->e:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v1, v2, :cond_3

    iget-object v0, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    goto :goto_0

    :cond_3
    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->d:Lcom/fodlam/yds/OxfordApplication$a;

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/f/d;->a:[Lcom/fodlam/yds/f/h;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fodlam/yds/f/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/f/d;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/f/d;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
