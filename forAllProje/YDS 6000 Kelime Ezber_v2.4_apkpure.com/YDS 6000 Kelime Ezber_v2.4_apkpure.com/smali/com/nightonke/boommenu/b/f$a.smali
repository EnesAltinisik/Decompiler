.class public Lcom/nightonke/boommenu/b/f$a;
.super Lcom/nightonke/boommenu/b/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nightonke/boommenu/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v3, 0x0

    const/high16 v2, 0x42700000    # 60.0f

    invoke-direct {p0}, Lcom/nightonke/boommenu/b/b;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-static {v2}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v1

    invoke-static {v2}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v2

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/f$a;->u:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    const/high16 v1, 0x428c0000    # 70.0f

    invoke-static {v1}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v2}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v2

    const/high16 v3, 0x438c0000    # 280.0f

    invoke-static {v3}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v3

    const/high16 v4, 0x42200000    # 40.0f

    invoke-static {v4}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/f$a;->F:Landroid/graphics/Rect;

    const v0, 0x800013

    iput v0, p0, Lcom/nightonke/boommenu/b/f$a;->J:I

    const/16 v0, 0xf

    iput v0, p0, Lcom/nightonke/boommenu/b/f$a;->L:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/f$a;->ao:I

    return v0
.end method

.method public a(I)Lcom/nightonke/boommenu/b/f$a;
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/b/f$a;->a:I

    return-object p0
.end method

.method public a(Landroid/graphics/Typeface;)Lcom/nightonke/boommenu/b/f$a;
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/b/f$a;->H:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public a(Landroid/graphics/drawable/Drawable;)Lcom/nightonke/boommenu/b/f$a;
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/b/f$a;->r:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public a(Lcom/nightonke/boommenu/b/g;)Lcom/nightonke/boommenu/b/f$a;
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/b/f$a;->b:Lcom/nightonke/boommenu/b/g;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/nightonke/boommenu/b/f$a;
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/b/f$a;->z:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/nightonke/boommenu/b/f$a;
    .locals 0

    iput-boolean p1, p0, Lcom/nightonke/boommenu/b/f$a;->af:Z

    return-object p0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/f$a;->ap:I

    return v0
.end method

.method public b(I)Lcom/nightonke/boommenu/b/f$a;
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/b/f$a;->L:I

    return-object p0
.end method

.method public b(Landroid/content/Context;)Lcom/nightonke/boommenu/b/f;
    .locals 2

    new-instance v0, Lcom/nightonke/boommenu/b/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/nightonke/boommenu/b/f;-><init>(Lcom/nightonke/boommenu/b/f$a;Landroid/content/Context;Lcom/nightonke/boommenu/b/f$1;)V

    return-object v0
.end method

.method public c(I)Lcom/nightonke/boommenu/b/f$a;
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/b/f$a;->ah:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(I)Lcom/nightonke/boommenu/b/f$a;
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/b/f$a;->h:Ljava/lang/Integer;

    return-object p0
.end method
