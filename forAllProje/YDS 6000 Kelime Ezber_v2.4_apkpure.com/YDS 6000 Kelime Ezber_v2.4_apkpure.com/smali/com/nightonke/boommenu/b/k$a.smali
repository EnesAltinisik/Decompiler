.class public Lcom/nightonke/boommenu/b/k$a;
.super Lcom/nightonke/boommenu/b/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nightonke/boommenu/b/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/nightonke/boommenu/b/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget v0, p0, Lcom/nightonke/boommenu/b/k$a;->an:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/nightonke/boommenu/b/k$a;->F:Landroid/graphics/Rect;

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/nightonke/boommenu/b/k$a;->ad:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_0
    return v0
.end method

.method public a(I)Lcom/nightonke/boommenu/b/k$a;
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/b/k$a;->a:I

    return-object p0
.end method

.method public a(Lcom/nightonke/boommenu/b/g;)Lcom/nightonke/boommenu/b/k$a;
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/b/k$a;->b:Lcom/nightonke/boommenu/b/g;

    return-object p0
.end method

.method public b()I
    .locals 3

    iget v0, p0, Lcom/nightonke/boommenu/b/k$a;->an:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/nightonke/boommenu/b/k$a;->F:Landroid/graphics/Rect;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/nightonke/boommenu/b/k$a;->F:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget v2, p0, Lcom/nightonke/boommenu/b/k$a;->k:I

    sub-int/2addr v1, v2

    iget v2, p0, Lcom/nightonke/boommenu/b/k$a;->l:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_0
    return v0
.end method

.method public b(Landroid/content/Context;)Lcom/nightonke/boommenu/b/k;
    .locals 2

    new-instance v0, Lcom/nightonke/boommenu/b/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/nightonke/boommenu/b/k;-><init>(Lcom/nightonke/boommenu/b/k$a;Landroid/content/Context;Lcom/nightonke/boommenu/b/k$1;)V

    return-object v0
.end method
