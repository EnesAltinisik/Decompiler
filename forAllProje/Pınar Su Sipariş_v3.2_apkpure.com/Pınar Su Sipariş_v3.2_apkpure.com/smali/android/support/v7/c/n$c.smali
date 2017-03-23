.class Landroid/support/v7/c/n$c;
.super Landroid/support/v7/c/n$b;
.source "SystemMediaRouteProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/c/n$e;)V
    .locals 0

    .prologue
    .line 788
    invoke-direct {p0, p1, p2}, Landroid/support/v7/c/n$b;-><init>(Landroid/content/Context;Landroid/support/v7/c/n$e;)V

    .line 789
    return-void
.end method


# virtual methods
.method protected a(Landroid/support/v7/c/n$a$b;Landroid/support/v7/c/a$a;)V
    .locals 1

    .prologue
    .line 794
    invoke-super {p0, p1, p2}, Landroid/support/v7/c/n$b;->a(Landroid/support/v7/c/n$a$b;Landroid/support/v7/c/a$a;)V

    .line 796
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/j$a;->a(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 798
    if-eqz v0, :cond_0

    .line 799
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v7/c/a$a;->c(Ljava/lang/String;)Landroid/support/v7/c/a$a;

    .line 801
    :cond_0
    return-void
.end method

.method protected a(Landroid/support/v7/c/n$a$c;)V
    .locals 2

    .prologue
    .line 816
    invoke-super {p0, p1}, Landroid/support/v7/c/n$b;->a(Landroid/support/v7/c/n$a$c;)V

    .line 818
    iget-object v0, p1, Landroid/support/v7/c/n$a$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Landroid/support/v7/c/n$a$c;->a:Landroid/support/v7/c/g$f;

    invoke-virtual {v1}, Landroid/support/v7/c/g$f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v7/c/j$b;->a(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 820
    return-void
.end method

.method protected b(Landroid/support/v7/c/n$a$b;)Z
    .locals 1

    .prologue
    .line 836
    iget-object v0, p1, Landroid/support/v7/c/n$a$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/j$a;->b(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected g()V
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 824
    iget-boolean v1, p0, Landroid/support/v7/c/n$c;->g:Z

    if-eqz v1, :cond_0

    .line 825
    iget-object v1, p0, Landroid/support/v7/c/n$c;->a:Ljava/lang/Object;

    iget-object v2, p0, Landroid/support/v7/c/n$c;->b:Ljava/lang/Object;

    invoke-static {v1, v2}, Landroid/support/v7/c/h;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 828
    :cond_0
    iput-boolean v0, p0, Landroid/support/v7/c/n$c;->g:Z

    .line 829
    iget-object v1, p0, Landroid/support/v7/c/n$c;->a:Ljava/lang/Object;

    iget v2, p0, Landroid/support/v7/c/n$c;->e:I

    iget-object v3, p0, Landroid/support/v7/c/n$c;->b:Ljava/lang/Object;

    iget-boolean v4, p0, Landroid/support/v7/c/n$c;->f:Z

    if-eqz v4, :cond_1

    :goto_0
    or-int/lit8 v0, v0, 0x2

    invoke-static {v1, v2, v3, v0}, Landroid/support/v7/c/j;->a(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 832
    return-void

    .line 829
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected i(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 805
    iget-object v0, p0, Landroid/support/v7/c/n$c;->a:Ljava/lang/Object;

    const v1, 0x800003

    invoke-static {v0, v1, p1}, Landroid/support/v7/c/h;->a(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 807
    return-void
.end method

.method protected j()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 811
    iget-object v0, p0, Landroid/support/v7/c/n$c;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroid/support/v7/c/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
