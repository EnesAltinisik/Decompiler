.class Landroid/support/design/widget/s;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/design/widget/s$e;,
        Landroid/support/design/widget/s$d;,
        Landroid/support/design/widget/s$b;,
        Landroid/support/design/widget/s$a;,
        Landroid/support/design/widget/s$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/support/design/widget/s$e;


# direct methods
.method constructor <init>(Landroid/support/design/widget/s$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0}, Landroid/support/design/widget/s$e;->a()V

    return-void
.end method

.method public a(FF)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0, p1, p2}, Landroid/support/design/widget/s$e;->a(FF)V

    return-void
.end method

.method public a(II)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0, p1, p2}, Landroid/support/design/widget/s$e;->a(II)V

    return-void
.end method

.method public a(J)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0, p1, p2}, Landroid/support/design/widget/s$e;->a(J)V

    return-void
.end method

.method public a(Landroid/support/design/widget/s$a;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    new-instance v1, Landroid/support/design/widget/s$2;

    invoke-direct {v1, p0, p1}, Landroid/support/design/widget/s$2;-><init>(Landroid/support/design/widget/s;Landroid/support/design/widget/s$a;)V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/s$e;->a(Landroid/support/design/widget/s$e$a;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/s$e;->a(Landroid/support/design/widget/s$e$a;)V

    goto :goto_0
.end method

.method public a(Landroid/support/design/widget/s$c;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    new-instance v1, Landroid/support/design/widget/s$1;

    invoke-direct {v1, p0, p1}, Landroid/support/design/widget/s$1;-><init>(Landroid/support/design/widget/s;Landroid/support/design/widget/s$c;)V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/s$e;->a(Landroid/support/design/widget/s$e$b;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/s$e;->a(Landroid/support/design/widget/s$e$b;)V

    goto :goto_0
.end method

.method public a(Landroid/view/animation/Interpolator;)V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/s$e;->a(Landroid/view/animation/Interpolator;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0}, Landroid/support/design/widget/s$e;->b()Z

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0}, Landroid/support/design/widget/s$e;->c()I

    move-result v0

    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0}, Landroid/support/design/widget/s$e;->d()V

    return-void
.end method

.method public e()F
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0}, Landroid/support/design/widget/s$e;->e()F

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0}, Landroid/support/design/widget/s$e;->f()V

    return-void
.end method

.method public g()J
    .locals 2

    iget-object v0, p0, Landroid/support/design/widget/s;->a:Landroid/support/design/widget/s$e;

    invoke-virtual {v0}, Landroid/support/design/widget/s$e;->g()J

    move-result-wide v0

    return-wide v0
.end method
