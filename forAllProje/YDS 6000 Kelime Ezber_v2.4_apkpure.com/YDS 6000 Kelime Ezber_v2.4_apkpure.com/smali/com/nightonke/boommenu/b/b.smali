.class public abstract Lcom/nightonke/boommenu/b/b;
.super Ljava/lang/Object;


# instance fields
.field A:Ljava/lang/String;

.field B:Ljava/lang/String;

.field C:I

.field D:I

.field E:I

.field F:Landroid/graphics/Rect;

.field G:Landroid/graphics/Rect;

.field H:Landroid/graphics/Typeface;

.field I:I

.field J:I

.field K:Landroid/text/TextUtils$TruncateAt;

.field L:I

.field M:I

.field N:I

.field O:I

.field P:Ljava/lang/String;

.field Q:Ljava/lang/String;

.field R:Ljava/lang/String;

.field S:I

.field T:I

.field U:I

.field V:Landroid/graphics/Rect;

.field W:Landroid/graphics/Rect;

.field X:Landroid/graphics/Typeface;

.field Y:I

.field Z:I

.field a:I

.field aa:Landroid/text/TextUtils$TruncateAt;

.field ab:I

.field ac:I

.field ad:I

.field ae:I

.field af:Z

.field ag:I

.field ah:Ljava/lang/Integer;

.field ai:I

.field aj:Ljava/lang/Integer;

.field ak:I

.field al:Ljava/lang/Integer;

.field am:Z

.field an:I

.field ao:I

.field ap:I

.field aq:I

.field b:Lcom/nightonke/boommenu/b/g;

.field c:Lcom/nightonke/boommenu/b/h;

.field d:Z

.field e:Z

.field f:Z

.field g:Ljava/lang/Integer;

.field h:Ljava/lang/Integer;

.field i:Z

.field j:I

.field k:I

.field l:I

.field m:I

.field n:I

.field o:I

.field p:I

.field q:I

.field r:Landroid/graphics/drawable/Drawable;

.field s:Landroid/graphics/drawable/Drawable;

.field t:Landroid/graphics/drawable/Drawable;

.field u:Landroid/graphics/Rect;

.field v:Landroid/graphics/Rect;

.field w:I

.field x:I

.field y:I

.field z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 10

    const/high16 v9, 0x40a00000    # 5.0f

    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v5, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->a:I

    iput-boolean v8, p0, Lcom/nightonke/boommenu/b/b;->d:Z

    iput-boolean v8, p0, Lcom/nightonke/boommenu/b/b;->e:Z

    iput-boolean v8, p0, Lcom/nightonke/boommenu/b/b;->f:Z

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->g:Ljava/lang/Integer;

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->h:Ljava/lang/Integer;

    iput-boolean v8, p0, Lcom/nightonke/boommenu/b/b;->i:Z

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->j:I

    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->k:I

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->l:I

    const-string v0, "#88757575"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->m:I

    invoke-static {v9}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->n:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->o:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->p:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->q:I

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->r:Landroid/graphics/drawable/Drawable;

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->s:Landroid/graphics/drawable/Drawable;

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->t:Landroid/graphics/drawable/Drawable;

    new-instance v0, Landroid/graphics/Rect;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v2}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v2

    const/high16 v3, 0x428c0000    # 70.0f

    invoke-static {v3}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v3

    const/high16 v4, 0x428c0000    # 70.0f

    invoke-static {v4}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/b;->u:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v6, v6, v6, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/b;->v:Landroid/graphics/Rect;

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->w:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->x:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->y:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->C:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->D:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->E:I

    new-instance v0, Landroid/graphics/Rect;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v1

    const/high16 v2, 0x42500000    # 52.0f

    invoke-static {v2}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v2

    const/high16 v3, 0x42820000    # 65.0f

    invoke-static {v3}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v3

    const/high16 v4, 0x42900000    # 72.0f

    invoke-static {v4}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/b;->F:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v6, v6, v6, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/b;->G:Landroid/graphics/Rect;

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->H:Landroid/graphics/Typeface;

    iput v8, p0, Lcom/nightonke/boommenu/b/b;->I:I

    const/16 v0, 0x11

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->J:I

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->MARQUEE:Landroid/text/TextUtils$TruncateAt;

    iput-object v0, p0, Lcom/nightonke/boommenu/b/b;->K:Landroid/text/TextUtils$TruncateAt;

    const/16 v0, 0xa

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->L:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->M:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->N:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->O:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->S:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->T:I

    iput v5, p0, Lcom/nightonke/boommenu/b/b;->U:I

    new-instance v0, Landroid/graphics/Rect;

    const/high16 v1, 0x428c0000    # 70.0f

    invoke-static {v1}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v1

    const/high16 v2, 0x420c0000    # 35.0f

    invoke-static {v2}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v2

    const/high16 v3, 0x438c0000    # 280.0f

    invoke-static {v3}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v3

    const/high16 v4, 0x425c0000    # 55.0f

    invoke-static {v4}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/b;->V:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v6, v6, v6, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/nightonke/boommenu/b/b;->W:Landroid/graphics/Rect;

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->X:Landroid/graphics/Typeface;

    iput v8, p0, Lcom/nightonke/boommenu/b/b;->Y:I

    const v0, 0x800013

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->Z:I

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->MARQUEE:Landroid/text/TextUtils$TruncateAt;

    iput-object v0, p0, Lcom/nightonke/boommenu/b/b;->aa:Landroid/text/TextUtils$TruncateAt;

    const/16 v0, 0xa

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ab:I

    invoke-static {v9}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ac:I

    const/high16 v0, 0x42a00000    # 80.0f

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ad:I

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ae:I

    iput-boolean v8, p0, Lcom/nightonke/boommenu/b/b;->af:Z

    invoke-static {}, Lcom/nightonke/boommenu/e;->a()I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ag:I

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->ah:Ljava/lang/Integer;

    invoke-static {}, Lcom/nightonke/boommenu/e;->a()I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ai:I

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->aj:Ljava/lang/Integer;

    invoke-static {}, Lcom/nightonke/boommenu/e;->a()I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ak:I

    iput-object v7, p0, Lcom/nightonke/boommenu/b/b;->al:Ljava/lang/Integer;

    iput-boolean v6, p0, Lcom/nightonke/boommenu/b/b;->am:Z

    const/high16 v0, 0x42200000    # 40.0f

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->an:I

    const/high16 v0, 0x43960000    # 300.0f

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ao:I

    const/high16 v0, 0x42700000    # 60.0f

    invoke-static {v0}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->ap:I

    invoke-static {v9}, Lcom/nightonke/boommenu/e;->a(F)I

    move-result v0

    iput v0, p0, Lcom/nightonke/boommenu/b/b;->aq:I

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)I
    .locals 2

    iget-object v0, p0, Lcom/nightonke/boommenu/b/b;->g:Ljava/lang/Integer;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/nightonke/boommenu/b/b;->h:Ljava/lang/Integer;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/nightonke/boommenu/b/b;->am:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/b/b;->al:Ljava/lang/Integer;

    iget v1, p0, Lcom/nightonke/boommenu/b/b;->ak:I

    invoke-static {p1, v0, v1}, Lcom/nightonke/boommenu/e;->a(Landroid/content/Context;Ljava/lang/Integer;I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/b/b;->ah:Ljava/lang/Integer;

    iget v1, p0, Lcom/nightonke/boommenu/b/b;->ag:I

    invoke-static {p1, v0, v1}, Lcom/nightonke/boommenu/e;->a(Landroid/content/Context;Ljava/lang/Integer;I)I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/nightonke/boommenu/b/b;->g:Ljava/lang/Integer;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/nightonke/boommenu/b/b;->h:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Lcom/nightonke/boommenu/e;->b(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/nightonke/boommenu/b/b;->h:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/nightonke/boommenu/b/b;->g:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/nightonke/boommenu/e;->a(Landroid/content/Context;Ljava/lang/Integer;I)I

    move-result v0

    goto :goto_0
.end method
