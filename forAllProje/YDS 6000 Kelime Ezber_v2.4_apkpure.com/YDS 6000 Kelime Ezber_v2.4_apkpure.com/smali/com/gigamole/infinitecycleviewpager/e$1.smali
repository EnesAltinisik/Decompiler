.class final Lcom/gigamole/infinitecycleviewpager/e$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/gigamole/infinitecycleviewpager/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/gigamole/infinitecycleviewpager/e$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/gigamole/infinitecycleviewpager/e$b;Lcom/gigamole/infinitecycleviewpager/e$b;)I
    .locals 2

    iget v0, p1, Lcom/gigamole/infinitecycleviewpager/e$b;->b:I

    iget v1, p2, Lcom/gigamole/infinitecycleviewpager/e$b;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/gigamole/infinitecycleviewpager/e$b;

    check-cast p2, Lcom/gigamole/infinitecycleviewpager/e$b;

    invoke-virtual {p0, p1, p2}, Lcom/gigamole/infinitecycleviewpager/e$1;->a(Lcom/gigamole/infinitecycleviewpager/e$b;Lcom/gigamole/infinitecycleviewpager/e$b;)I

    move-result v0

    return v0
.end method
