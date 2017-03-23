.class Landroid/support/v7/c/n$b;
.super Landroid/support/v7/c/n$a;
.source "SystemMediaRouteProvider.java"

# interfaces
.implements Landroid/support/v7/c/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private j:Landroid/support/v7/c/i$a;

.field private k:Landroid/support/v7/c/i$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/c/n$e;)V
    .locals 0

    .prologue
    .line 716
    invoke-direct {p0, p1, p2}, Landroid/support/v7/c/n$a;-><init>(Landroid/content/Context;Landroid/support/v7/c/n$e;)V

    .line 717
    return-void
.end method


# virtual methods
.method protected a(Landroid/support/v7/c/n$a$b;Landroid/support/v7/c/a$a;)V
    .locals 1

    .prologue
    .line 742
    invoke-super {p0, p1, p2}, Landroid/support/v7/c/n$a;->a(Landroid/support/v7/c/n$a$b;Landroid/support/v7/c/a$a;)V

    .line 744
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/i$e;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 745
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->a(Z)Landroid/support/v7/c/a$a;

    .line 748
    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$b;->b(Landroid/support/v7/c/n$a$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 749
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->b(Z)Landroid/support/v7/c/a$a;

    .line 752
    :cond_1
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/i$e;->b(Ljava/lang/Object;)Landroid/view/Display;

    move-result-object v0

    .line 754
    if-eqz v0, :cond_2

    .line 755
    invoke-virtual {v0}, Landroid/view/Display;->getDisplayId()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->f(I)Landroid/support/v7/c/a$a;

    .line 757
    :cond_2
    return-void
.end method

.method protected b(Landroid/support/v7/c/n$a$b;)Z
    .locals 2

    .prologue
    .line 776
    iget-object v0, p0, Landroid/support/v7/c/n$b;->k:Landroid/support/v7/c/i$d;

    if-nez v0, :cond_0

    .line 777
    new-instance v0, Landroid/support/v7/c/i$d;

    invoke-direct {v0}, Landroid/support/v7/c/i$d;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/n$b;->k:Landroid/support/v7/c/i$d;

    .line 779
    :cond_0
    iget-object v0, p0, Landroid/support/v7/c/n$b;->k:Landroid/support/v7/c/i$d;

    iget-object v1, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/support/v7/c/i$d;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 721
    invoke-virtual {p0, p1}, Landroid/support/v7/c/n$b;->f(Ljava/lang/Object;)I

    move-result v0

    .line 722
    if-ltz v0, :cond_0

    .line 723
    iget-object v1, p0, Landroid/support/v7/c/n$b;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/n$a$b;

    .line 724
    invoke-static {p1}, Landroid/support/v7/c/i$e;->b(Ljava/lang/Object;)Landroid/view/Display;

    move-result-object v1

    .line 726
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/Display;->getDisplayId()I

    move-result v1

    .line 728
    :goto_0
    iget-object v2, v0, Landroid/support/v7/c/n$a$b;->c:Landroid/support/v7/c/a;

    invoke-virtual {v2}, Landroid/support/v7/c/a;->n()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 730
    new-instance v2, Landroid/support/v7/c/a$a;

    iget-object v3, v0, Landroid/support/v7/c/n$a$b;->c:Landroid/support/v7/c/a;

    invoke-direct {v2, v3}, Landroid/support/v7/c/a$a;-><init>(Landroid/support/v7/c/a;)V

    invoke-virtual {v2, v1}, Landroid/support/v7/c/a$a;->f(I)Landroid/support/v7/c/a$a;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/c/a$a;->a()Landroid/support/v7/c/a;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/c/n$a$b;->c:Landroid/support/v7/c/a;

    .line 734
    invoke-virtual {p0}, Landroid/support/v7/c/n$b;->f()V

    .line 737
    :cond_0
    return-void

    .line 726
    :cond_1
    const/4 v1, -0x1

    goto :goto_0
.end method

.method protected g()V
    .locals 3

    .prologue
    .line 761
    invoke-super {p0}, Landroid/support/v7/c/n$a;->g()V

    .line 763
    iget-object v0, p0, Landroid/support/v7/c/n$b;->j:Landroid/support/v7/c/i$a;

    if-nez v0, :cond_0

    .line 764
    new-instance v0, Landroid/support/v7/c/i$a;

    invoke-virtual {p0}, Landroid/support/v7/c/n$b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v7/c/n$b;->b()Landroid/os/Handler;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/c/i$a;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Landroid/support/v7/c/n$b;->j:Landroid/support/v7/c/i$a;

    .line 767
    :cond_0
    iget-object v1, p0, Landroid/support/v7/c/n$b;->j:Landroid/support/v7/c/i$a;

    iget-boolean v0, p0, Landroid/support/v7/c/n$b;->f:Z

    if-eqz v0, :cond_1

    iget v0, p0, Landroid/support/v7/c/n$b;->e:I

    :goto_0
    invoke-virtual {v1, v0}, Landroid/support/v7/c/i$a;->a(I)V

    .line 768
    return-void

    .line 767
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected h()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 772
    invoke-static {p0}, Landroid/support/v7/c/i;->a(Landroid/support/v7/c/i$b;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
