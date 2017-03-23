.class abstract Landroid/support/design/widget/f$d;
.super Landroid/support/design/widget/s$b;

# interfaces
.implements Landroid/support/design/widget/s$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/design/widget/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "d"
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Landroid/support/design/widget/f;

.field private c:F

.field private d:F


# direct methods
.method private constructor <init>(Landroid/support/design/widget/f;)V
    .locals 0

    iput-object p1, p0, Landroid/support/design/widget/f$d;->b:Landroid/support/design/widget/f;

    invoke-direct {p0}, Landroid/support/design/widget/s$b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/design/widget/f;Landroid/support/design/widget/f$1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/design/widget/f$d;-><init>(Landroid/support/design/widget/f;)V

    return-void
.end method


# virtual methods
.method protected abstract a()F
.end method

.method public a(Landroid/support/design/widget/s;)V
    .locals 4

    iget-boolean v0, p0, Landroid/support/design/widget/f$d;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/f$d;->b:Landroid/support/design/widget/f;

    iget-object v0, v0, Landroid/support/design/widget/f;->a:Landroid/support/design/widget/m;

    invoke-virtual {v0}, Landroid/support/design/widget/m;->a()F

    move-result v0

    iput v0, p0, Landroid/support/design/widget/f$d;->c:F

    invoke-virtual {p0}, Landroid/support/design/widget/f$d;->a()F

    move-result v0

    iput v0, p0, Landroid/support/design/widget/f$d;->d:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/design/widget/f$d;->a:Z

    :cond_0
    iget-object v0, p0, Landroid/support/design/widget/f$d;->b:Landroid/support/design/widget/f;

    iget-object v0, v0, Landroid/support/design/widget/f;->a:Landroid/support/design/widget/m;

    iget v1, p0, Landroid/support/design/widget/f$d;->c:F

    iget v2, p0, Landroid/support/design/widget/f$d;->d:F

    iget v3, p0, Landroid/support/design/widget/f$d;->c:F

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/support/design/widget/s;->e()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/support/design/widget/m;->b(F)V

    return-void
.end method

.method public b(Landroid/support/design/widget/s;)V
    .locals 2

    iget-object v0, p0, Landroid/support/design/widget/f$d;->b:Landroid/support/design/widget/f;

    iget-object v0, v0, Landroid/support/design/widget/f;->a:Landroid/support/design/widget/m;

    iget v1, p0, Landroid/support/design/widget/f$d;->d:F

    invoke-virtual {v0, v1}, Landroid/support/design/widget/m;->b(F)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/design/widget/f$d;->a:Z

    return-void
.end method
