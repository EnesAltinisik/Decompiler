.class public Lcom/fodlam/yds/f/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/f/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/fodlam/yds/f/h;",
        ">;"
    }
.end annotation


# static fields
.field public static a:I


# instance fields
.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Lcom/fodlam/yds/f/e;

.field private m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, Lcom/fodlam/yds/f/h;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lcom/fodlam/yds/f/h;->b:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/fodlam/yds/f/h;->g:I

    iput-boolean v1, p0, Lcom/fodlam/yds/f/h;->m:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fodlam/yds/f/h;->b:Z

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lcom/fodlam/yds/f/h;->b:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/fodlam/yds/f/h;->g:I

    iput-boolean v1, p0, Lcom/fodlam/yds/f/h;->m:Z

    iput p1, p0, Lcom/fodlam/yds/f/h;->c:I

    iput-object p4, p0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    iput p2, p0, Lcom/fodlam/yds/f/h;->d:I

    iput-object p5, p0, Lcom/fodlam/yds/f/h;->i:Ljava/lang/String;

    iput-object p6, p0, Lcom/fodlam/yds/f/h;->j:Ljava/lang/String;

    iput-object p7, p0, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    iput p3, p0, Lcom/fodlam/yds/f/h;->e:I

    iput p8, p0, Lcom/fodlam/yds/f/h;->f:I

    return-void
.end method


# virtual methods
.method public a(Lcom/fodlam/yds/f/h;)I
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    iget-object v1, p1, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lcom/fodlam/yds/f/h;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/fodlam/yds/f/h;->a:I

    :goto_0
    iput-boolean p1, p0, Lcom/fodlam/yds/f/h;->m:Z

    return-void

    :cond_0
    sget v0, Lcom/fodlam/yds/f/h;->a:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/fodlam/yds/f/h;->a:I

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fodlam/yds/f/h;->m:Z

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/f/h;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Z)V
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lcom/fodlam/yds/f/h;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/fodlam/yds/f/h;->a:I

    :cond_0
    iput-boolean p1, p0, Lcom/fodlam/yds/f/h;->m:Z

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    iget v1, p0, Lcom/fodlam/yds/f/h;->c:I

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/c/b;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/f/h;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/fodlam/yds/f/h;

    invoke-virtual {p0, p1}, Lcom/fodlam/yds/f/h;->a(Lcom/fodlam/yds/f/h;)I

    move-result v0

    return v0
.end method
