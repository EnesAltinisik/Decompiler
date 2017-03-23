.class public Lcom/fodlam/yds/a/g;
.super Landroid/support/v4/b/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/a/g$a;
    }
.end annotation


# static fields
.field static a:Lcom/fodlam/yds/f/b;


# instance fields
.field b:Lcom/fodlam/yds/TestLevelActivity;

.field c:[Lcom/fodlam/yds/a/g$a;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/TestLevelActivity;)V
    .locals 2

    invoke-virtual {p1}, Lcom/fodlam/yds/TestLevelActivity;->e()Landroid/support/v4/b/q;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v4/b/u;-><init>(Landroid/support/v4/b/q;)V

    iput-object p1, p0, Lcom/fodlam/yds/a/g;->b:Lcom/fodlam/yds/TestLevelActivity;

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v0

    sput-object v0, Lcom/fodlam/yds/a/g;->a:Lcom/fodlam/yds/f/b;

    sget-object v0, Lcom/fodlam/yds/a/g;->a:Lcom/fodlam/yds/f/b;

    invoke-virtual {v0}, Lcom/fodlam/yds/f/b;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41400000    # 12.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    new-array v0, v0, [Lcom/fodlam/yds/a/g$a;

    iput-object v0, p0, Lcom/fodlam/yds/a/g;->c:[Lcom/fodlam/yds/a/g$a;

    return-void
.end method


# virtual methods
.method public a(I)Landroid/support/v4/b/l;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "position"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/fodlam/yds/a/g;->c:[Lcom/fodlam/yds/a/g$a;

    new-instance v2, Lcom/fodlam/yds/a/g$a;

    invoke-direct {v2}, Lcom/fodlam/yds/a/g$a;-><init>()V

    aput-object v2, v1, p1

    iget-object v1, p0, Lcom/fodlam/yds/a/g;->c:[Lcom/fodlam/yds/a/g$a;

    aget-object v1, v1, p1

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/a/g$a;->g(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/fodlam/yds/a/g;->c:[Lcom/fodlam/yds/a/g$a;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a/g;->c:[Lcom/fodlam/yds/a/g$a;

    array-length v0, v0

    return v0
.end method

.method public c()V
    .locals 4

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v0

    sput-object v0, Lcom/fodlam/yds/a/g;->a:Lcom/fodlam/yds/f/b;

    iget-object v0, p0, Lcom/fodlam/yds/a/g;->c:[Lcom/fodlam/yds/a/g$a;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/fodlam/yds/a/g;->c:[Lcom/fodlam/yds/a/g$a;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/fodlam/yds/a/g$a;->a()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
