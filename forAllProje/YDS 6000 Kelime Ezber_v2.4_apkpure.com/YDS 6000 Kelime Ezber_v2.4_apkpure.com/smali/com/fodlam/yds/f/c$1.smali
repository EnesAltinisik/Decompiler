.class Lcom/fodlam/yds/f/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/f/c;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/fodlam/yds/f/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/f/c;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/f/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/f/c$1;->a:Lcom/fodlam/yds/f/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fodlam/yds/f/h;Lcom/fodlam/yds/f/h;)I
    .locals 2

    iget v0, p1, Lcom/fodlam/yds/f/h;->c:I

    iget v1, p2, Lcom/fodlam/yds/f/h;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget v0, p1, Lcom/fodlam/yds/f/h;->c:I

    iget v1, p2, Lcom/fodlam/yds/f/h;->c:I

    if-le v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/fodlam/yds/f/h;

    check-cast p2, Lcom/fodlam/yds/f/h;

    invoke-virtual {p0, p1, p2}, Lcom/fodlam/yds/f/c$1;->a(Lcom/fodlam/yds/f/h;Lcom/fodlam/yds/f/h;)I

    move-result v0

    return v0
.end method
