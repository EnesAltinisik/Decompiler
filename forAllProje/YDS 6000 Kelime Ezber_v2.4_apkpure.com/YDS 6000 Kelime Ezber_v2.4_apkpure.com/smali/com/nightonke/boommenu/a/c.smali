.class public Lcom/nightonke/boommenu/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/TimeInterpolator;


# static fields
.field private static f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nightonke/boommenu/a/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/nightonke/boommenu/a/d;

.field private b:Landroid/graphics/PointF;

.field private c:Landroid/graphics/PointF;

.field private d:Landroid/graphics/PointF;

.field private e:Ljava/lang/Boolean;


# direct methods
.method private constructor <init>(Lcom/nightonke/boommenu/a/d;)V
    .locals 14

    const-wide v4, 0x3fa999999999999aL    # 0.05

    const-wide/16 v10, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/a/c;->b:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/a/c;->c:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/a/c;->e:Ljava/lang/Boolean;

    sget-object v0, Lcom/nightonke/boommenu/a/c$1;->a:[I

    invoke-virtual {p1}, Lcom/nightonke/boommenu/a/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Ease-enum not found!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-wide v2, 0x3fe3333333333333L    # 0.6

    const-wide v4, -0x4036666666666666L    # -0.2

    const-wide v6, 0x3fe7851eb851eb85L    # 0.735

    const-wide v8, 0x3fa70a3d70a3d70aL    # 0.045

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    :goto_0
    iput-object p1, p0, Lcom/nightonke/boommenu/a/c;->a:Lcom/nightonke/boommenu/a/d;

    return-void

    :pswitch_1
    const-wide v2, 0x3fe3333333333333L    # 0.6

    const-wide v4, 0x3fa47ae147ae147bL    # 0.04

    const-wide v6, 0x3fef5c28f5c28f5cL    # 0.98

    const-wide v8, 0x3fd570a3d70a3d71L    # 0.335

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto :goto_0

    :pswitch_2
    const-wide v2, 0x3fe199999999999aL    # 0.55

    const-wide v4, 0x3fac28f5c28f5c29L    # 0.055

    const-wide v6, 0x3fe599999999999aL    # 0.675

    const-wide v8, 0x3fc851eb851eb852L    # 0.19

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto :goto_0

    :pswitch_3
    const-wide v2, 0x3fee666666666666L    # 0.95

    const-wide v6, 0x3fe970a3d70a3d71L    # 0.795

    const-wide v8, 0x3fa1eb851eb851ecL    # 0.035

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto :goto_0

    :pswitch_4
    const-wide v2, 0x3fde147ae147ae14L    # 0.47

    const-wide v6, 0x3fe7d70a3d70a3d7L    # 0.745

    const-wide v8, 0x3fe6e147ae147ae1L    # 0.715

    move-object v1, p0

    move-wide v4, v10

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto :goto_0

    :pswitch_5
    const-wide v2, 0x3fe199999999999aL    # 0.55

    const-wide v4, 0x3fb5c28f5c28f5c3L    # 0.085

    const-wide v6, 0x3fe5c28f5c28f5c3L    # 0.68

    const-wide v8, 0x3fe0f5c28f5c28f6L    # 0.53

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto :goto_0

    :pswitch_6
    const-wide v2, 0x3fe828f5c28f5c29L    # 0.755

    const-wide v6, 0x3feb5c28f5c28f5cL    # 0.855

    const-wide v8, 0x3faeb851eb851eb8L    # 0.06

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_7
    const-wide v2, 0x3feca3d70a3d70a4L    # 0.895

    const-wide v4, 0x3f9eb851eb851eb8L    # 0.03

    const-wide v6, 0x3fe5eb851eb851ecL    # 0.685

    const-wide v8, 0x3fcc28f5c28f5c29L    # 0.22

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_8
    const-wide v2, 0x3fc645a1cac08312L    # 0.174

    const-wide v4, 0x3fec51eb851eb852L    # 0.885

    const-wide v6, 0x3fd47ae147ae147bL    # 0.32

    const-wide v8, 0x3ff4666666666666L    # 1.275

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_9
    const-wide v2, 0x3fb3333333333333L    # 0.075

    const-wide v4, 0x3fea3d70a3d70a3dL    # 0.82

    const-wide v6, 0x3fc51eb851eb851fL    # 0.165

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_a
    const-wide v2, 0x3fcb851eb851eb85L    # 0.215

    const-wide v4, 0x3fe3851eb851eb85L    # 0.61

    const-wide v6, 0x3fd6b851eb851eb8L    # 0.355

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_b
    const-wide v6, 0x3fc851eb851eb852L    # 0.19

    const-wide v10, 0x3fcc28f5c28f5c29L    # 0.22

    move-object v5, p0

    move-wide v12, v8

    invoke-direct/range {v5 .. v13}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_c
    const-wide v2, 0x3fd8f5c28f5c28f6L    # 0.39

    const-wide v4, 0x3fe2666666666666L    # 0.575

    const-wide v6, 0x3fe2147ae147ae14L    # 0.565

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_d
    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    const-wide v4, 0x3fdd70a3d70a3d71L    # 0.46

    const-wide v6, 0x3fdccccccccccccdL    # 0.45

    const-wide v8, 0x3fee147ae147ae14L    # 0.94

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_e
    const-wide v6, 0x3fcd70a3d70a3d71L    # 0.23

    const-wide v10, 0x3fd47ae147ae147bL    # 0.32

    move-object v5, p0

    move-wide v12, v8

    invoke-direct/range {v5 .. v13}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_f
    const-wide v2, 0x3fc51eb851eb851fL    # 0.165

    const-wide v4, 0x3feae147ae147ae1L    # 0.84

    const-wide v6, 0x3fdc28f5c28f5c29L    # 0.44

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_10
    const-wide v2, 0x3fe5c28f5c28f5c3L    # 0.68

    const-wide v4, -0x401e666666666666L    # -0.55

    const-wide v6, 0x3fd0f5c28f5c28f6L    # 0.265

    const-wide v8, 0x3ff8cccccccccccdL    # 1.55

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_11
    const-wide v2, 0x3fe91eb851eb851fL    # 0.785

    const-wide v4, 0x3fc147ae147ae148L    # 0.135

    const-wide v6, 0x3fc3333333333333L    # 0.15

    const-wide v8, 0x3feb851eb851eb85L    # 0.86

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_12
    const-wide v2, 0x3fe4a3d70a3d70a4L    # 0.645

    const-wide v4, 0x3fa70a3d70a3d70aL    # 0.045

    const-wide v6, 0x3fd570a3d70a3d71L    # 0.335

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_13
    invoke-direct {p0, v3, v2, v2, v3}, Lcom/nightonke/boommenu/a/c;->a(FFFF)V

    goto/16 :goto_0

    :pswitch_14
    const-wide v2, 0x3fdc7ae147ae147bL    # 0.445

    const-wide v6, 0x3fe199999999999aL    # 0.55

    const-wide v8, 0x3fee666666666666L    # 0.95

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_15
    const-wide v2, 0x3fdd1eb851eb851fL    # 0.455

    const-wide v4, 0x3f9eb851eb851eb8L    # 0.03

    const-wide v6, 0x3fe07ae147ae147bL    # 0.515

    const-wide v8, 0x3fee8f5c28f5c28fL    # 0.955

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_16
    const-wide v2, 0x3feb851eb851eb85L    # 0.86

    const-wide v6, 0x3fb1eb851eb851ecL    # 0.07

    move-object v1, p0

    move-wide v4, v10

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_17
    const-wide v2, 0x3fe8a3d70a3d70a4L    # 0.77

    const-wide v6, 0x3fc6666666666666L    # 0.175

    move-object v1, p0

    move-wide v4, v10

    invoke-direct/range {v1 .. v9}, Lcom/nightonke/boommenu/a/c;->a(DDDD)V

    goto/16 :goto_0

    :pswitch_18
    invoke-direct {p0, v2, v2, v3, v3}, Lcom/nightonke/boommenu/a/c;->a(FFFF)V

    goto/16 :goto_0

    :pswitch_19
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/nightonke/boommenu/a/c;->e:Ljava/lang/Boolean;

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
    .end packed-switch
.end method

.method private a(F)F
    .locals 8

    const/4 v0, 0x1

    move v1, p1

    :goto_0
    const/16 v2, 0xe

    if-ge v0, v2, :cond_0

    invoke-direct {p0, v1}, Lcom/nightonke/boommenu/a/c;->c(F)F

    move-result v2

    sub-float/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-double v4, v3

    const-wide v6, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v3, v4, v6

    if-gez v3, :cond_1

    :cond_0
    return v1

    :cond_1
    invoke-direct {p0, v1}, Lcom/nightonke/boommenu/a/c;->d(F)F

    move-result v3

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static a(Lcom/nightonke/boommenu/a/d;)Lcom/nightonke/boommenu/a/c;
    .locals 3

    sget-object v0, Lcom/nightonke/boommenu/a/c;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {}, Lcom/nightonke/boommenu/a/d;->values()[Lcom/nightonke/boommenu/a/d;

    move-result-object v1

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/nightonke/boommenu/a/c;->f:Ljava/util/ArrayList;

    invoke-static {}, Lcom/nightonke/boommenu/a/d;->values()[Lcom/nightonke/boommenu/a/d;

    move-result-object v0

    array-length v0, v0

    :goto_0
    if-lez v0, :cond_0

    sget-object v1, Lcom/nightonke/boommenu/a/c;->f:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/nightonke/boommenu/a/c;->f:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/nightonke/boommenu/a/d;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/a/c;

    if-nez v0, :cond_1

    new-instance v0, Lcom/nightonke/boommenu/a/c;

    invoke-direct {v0, p0}, Lcom/nightonke/boommenu/a/c;-><init>(Lcom/nightonke/boommenu/a/d;)V

    sget-object v1, Lcom/nightonke/boommenu/a/c;->f:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/nightonke/boommenu/a/d;->a()I

    move-result v2

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method private a(DDDD)V
    .locals 5

    double-to-float v0, p1

    double-to-float v1, p3

    double-to-float v2, p5

    double-to-float v3, p7

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/nightonke/boommenu/a/c;->a(FFFF)V

    return-void
.end method

.method private a(FFFF)V
    .locals 7

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v5, 0x40400000    # 3.0f

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, p3, p4}, Landroid/graphics/PointF;-><init>(FF)V

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v3, v0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v3, v5

    iput v3, v2, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->c:Landroid/graphics/PointF;

    iget v3, v1, Landroid/graphics/PointF;->x:F

    iget v4, v0, Landroid/graphics/PointF;->x:F

    sub-float/2addr v3, v4

    mul-float/2addr v3, v5

    iget-object v4, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->x:F

    sub-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->b:Landroid/graphics/PointF;

    iget-object v3, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    sub-float v3, v6, v3

    iget-object v4, p0, Lcom/nightonke/boommenu/a/c;->c:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->x:F

    sub-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v3, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v3, v5

    iput v3, v2, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->c:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    sub-float v0, v1, v0

    mul-float/2addr v0, v5

    iget-object v1, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v1

    iput v0, v2, Landroid/graphics/PointF;->y:F

    iget-object v0, p0, Lcom/nightonke/boommenu/a/c;->b:Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float v1, v6, v1

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->c:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method private b(F)F
    .locals 3

    iget-object v0, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    iget-object v1, p0, Lcom/nightonke/boommenu/a/c;->c:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->b:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    mul-float/2addr v0, p1

    return v0
.end method

.method private b(FFFF)F
    .locals 2

    sub-float v0, p4, p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p3, p4}, Lcom/nightonke/boommenu/a/c;->c(FFFF)F

    move-result v0

    sub-float v0, p3, v0

    add-float/2addr v0, p2

    return v0
.end method

.method private c(F)F
    .locals 3

    iget-object v0, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lcom/nightonke/boommenu/a/c;->c:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->b:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    mul-float/2addr v0, p1

    return v0
.end method

.method private c(FFFF)F
    .locals 6

    div-float v0, p1, p4

    float-to-double v2, v0

    const-wide v4, 0x3fd745d1745d1746L    # 0.36363636363636365

    cmpg-double v1, v2, v4

    if-gez v1, :cond_0

    const/high16 v1, 0x40f20000    # 7.5625f

    mul-float/2addr v1, v0

    mul-float/2addr v0, v1

    mul-float/2addr v0, p3

    add-float/2addr v0, p2

    :goto_0
    return v0

    :cond_0
    float-to-double v2, v0

    const-wide v4, 0x3fe745d1745d1746L    # 0.7272727272727273

    cmpg-double v1, v2, v4

    if-gez v1, :cond_1

    float-to-double v0, v0

    const-wide v2, 0x3fe1745d1745d174L    # 0.5454545454545454

    sub-double/2addr v0, v2

    double-to-float v0, v0

    const/high16 v1, 0x40f20000    # 7.5625f

    mul-float/2addr v1, v0

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f400000    # 0.75f

    add-float/2addr v0, v1

    mul-float/2addr v0, p3

    add-float/2addr v0, p2

    goto :goto_0

    :cond_1
    float-to-double v2, v0

    const-wide v4, 0x3fe745d1745d1746L    # 0.7272727272727273

    cmpg-double v1, v2, v4

    if-gez v1, :cond_2

    float-to-double v0, v0

    const-wide v2, 0x3fe1745d1745d174L    # 0.5454545454545454

    sub-double/2addr v0, v2

    double-to-float v0, v0

    const/high16 v1, 0x40f20000    # 7.5625f

    mul-float/2addr v1, v0

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f700000    # 0.9375f

    add-float/2addr v0, v1

    mul-float/2addr v0, p3

    add-float/2addr v0, p2

    goto :goto_0

    :cond_2
    float-to-double v0, v0

    const-wide v2, 0x3fee8ba2e8ba2e8cL    # 0.9545454545454546

    sub-double/2addr v0, v2

    double-to-float v0, v0

    const/high16 v1, 0x40f20000    # 7.5625f

    mul-float/2addr v1, v0

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f7c0000    # 0.984375f

    add-float/2addr v0, v1

    mul-float/2addr v0, p3

    add-float/2addr v0, p2

    goto :goto_0
.end method

.method private d(F)F
    .locals 4

    iget-object v0, p0, Lcom/nightonke/boommenu/a/c;->d:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    iget-object v2, p0, Lcom/nightonke/boommenu/a/c;->c:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    mul-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    iget-object v3, p0, Lcom/nightonke/boommenu/a/c;->b:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    mul-float/2addr v2, v3

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method private e(F)F
    .locals 3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    sub-float v0, v2, p1

    invoke-direct {p0, v0, v1, v2, v2}, Lcom/nightonke/boommenu/a/c;->c(FFFF)F

    move-result v0

    sub-float v0, v2, v0

    add-float/2addr v0, v1

    return v0
.end method

.method private f(F)F
    .locals 8

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v6, 0x40f20000    # 7.5625f

    const/4 v0, 0x0

    div-float v1, p1, v7

    float-to-double v2, v1

    const-wide v4, 0x3fd745d1745d1746L    # 0.36363636363636365

    cmpg-double v2, v2, v4

    if-gez v2, :cond_0

    mul-float v2, v6, v1

    mul-float/2addr v1, v2

    mul-float/2addr v1, v7

    add-float/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    float-to-double v2, v1

    const-wide v4, 0x3fe745d1745d1746L    # 0.7272727272727273

    cmpg-double v2, v2, v4

    if-gez v2, :cond_1

    float-to-double v2, v1

    const-wide v4, 0x3fe1745d1745d174L    # 0.5454545454545454

    sub-double/2addr v2, v4

    double-to-float v1, v2

    mul-float v2, v6, v1

    mul-float/2addr v1, v2

    const/high16 v2, 0x3f400000    # 0.75f

    add-float/2addr v1, v2

    mul-float/2addr v1, v7

    add-float/2addr v0, v1

    goto :goto_0

    :cond_1
    float-to-double v2, v1

    const-wide v4, 0x3fed1745d1745d17L    # 0.9090909090909091

    cmpg-double v2, v2, v4

    if-gez v2, :cond_2

    float-to-double v2, v1

    const-wide v4, 0x3fea2e8ba2e8ba2fL    # 0.8181818181818182

    sub-double/2addr v2, v4

    double-to-float v1, v2

    mul-float v2, v6, v1

    mul-float/2addr v1, v2

    const/high16 v2, 0x3f700000    # 0.9375f

    add-float/2addr v1, v2

    mul-float/2addr v1, v7

    add-float/2addr v0, v1

    goto :goto_0

    :cond_2
    float-to-double v2, v1

    const-wide v4, 0x3fee8ba2e8ba2e8cL    # 0.9545454545454546

    sub-double/2addr v2, v4

    double-to-float v1, v2

    mul-float v2, v6, v1

    mul-float/2addr v1, v2

    const/high16 v2, 0x3f7c0000    # 0.984375f

    add-float/2addr v1, v2

    mul-float/2addr v1, v7

    add-float/2addr v0, v1

    goto :goto_0
.end method

.method private g(F)F
    .locals 5

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    div-float v0, v4, v3

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    mul-float v0, p1, v3

    invoke-direct {p0, v0, v2, v4, v4}, Lcom/nightonke/boommenu/a/c;->b(FFFF)F

    move-result v0

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    :goto_0
    return v0

    :cond_0
    mul-float v0, p1, v3

    invoke-direct {p0, v0, v2, v4, v4}, Lcom/nightonke/boommenu/a/c;->c(FFFF)F

    move-result v0

    mul-float/2addr v0, v1

    mul-float/2addr v1, v4

    add-float/2addr v0, v1

    add-float/2addr v0, v2

    goto :goto_0
.end method

.method private h(F)F
    .locals 9

    const/4 v0, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    div-float v1, p1, v8

    cmpl-float v2, v1, v8

    if-nez v2, :cond_1

    add-float/2addr v0, v8

    goto :goto_0

    :cond_1
    const v2, 0x3e99999a    # 0.3f

    mul-float/2addr v2, v8

    const/high16 v3, 0x40800000    # 4.0f

    div-float v3, v2, v3

    sub-float/2addr v1, v8

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    const/high16 v6, 0x41200000    # 10.0f

    mul-float/2addr v6, v1

    float-to-double v6, v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v8

    mul-float/2addr v1, v8

    sub-float/2addr v1, v3

    const v3, 0x40c90fdb

    mul-float/2addr v1, v3

    div-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v1, v2

    mul-float/2addr v1, v4

    neg-float v1, v1

    add-float/2addr v0, v1

    goto :goto_0
.end method

.method private i(F)F
    .locals 9

    const/4 v0, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    div-float v1, p1, v8

    cmpl-float v2, v1, v8

    if-nez v2, :cond_1

    add-float/2addr v0, v8

    goto :goto_0

    :cond_1
    const v2, 0x3e99999a    # 0.3f

    mul-float/2addr v2, v8

    const/high16 v3, 0x40800000    # 4.0f

    div-float v3, v2, v3

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    const/high16 v6, -0x3ee00000    # -10.0f

    mul-float/2addr v6, v1

    float-to-double v6, v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v8

    mul-float/2addr v1, v8

    sub-float/2addr v1, v3

    const v3, 0x40c90fdb

    mul-float/2addr v1, v3

    div-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v1, v2

    mul-float/2addr v1, v4

    add-float/2addr v1, v8

    add-float/2addr v0, v1

    goto :goto_0
.end method

.method private j(F)F
    .locals 12

    const v9, 0x40c90fdb

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v0, 0x0

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    const/high16 v8, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    div-float v1, v8, v2

    div-float v1, p1, v1

    cmpl-float v2, v1, v2

    if-nez v2, :cond_1

    add-float/2addr v0, v8

    goto :goto_0

    :cond_1
    const v2, 0x3ee66666    # 0.45f

    mul-float/2addr v2, v8

    const/high16 v3, 0x40800000    # 4.0f

    div-float v3, v2, v3

    cmpg-float v4, v1, v8

    if-gez v4, :cond_2

    sub-float/2addr v1, v8

    const/high16 v4, -0x41000000    # -0.5f

    const/high16 v5, 0x41200000    # 10.0f

    mul-float/2addr v5, v1

    float-to-double v6, v5

    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v5, v6

    mul-float/2addr v5, v8

    mul-float/2addr v1, v8

    sub-float/2addr v1, v3

    mul-float/2addr v1, v9

    div-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v1, v2

    mul-float/2addr v1, v5

    mul-float/2addr v1, v4

    add-float/2addr v0, v1

    goto :goto_0

    :cond_2
    sub-float/2addr v1, v8

    const/high16 v4, -0x3ee00000    # -10.0f

    mul-float/2addr v4, v1

    float-to-double v4, v4

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v8

    mul-float/2addr v1, v8

    sub-float/2addr v1, v3

    mul-float/2addr v1, v9

    div-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v1, v2

    mul-float/2addr v1, v4

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float/2addr v1, v8

    add-float/2addr v0, v1

    goto :goto_0
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 2

    iget-object v0, p0, Lcom/nightonke/boommenu/a/c;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/a/c;->a(F)F

    move-result v0

    invoke-direct {p0, v0}, Lcom/nightonke/boommenu/a/c;->b(F)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/nightonke/boommenu/a/c$1;->a:[I

    iget-object v1, p0, Lcom/nightonke/boommenu/a/c;->a:Lcom/nightonke/boommenu/a/d;

    invoke-virtual {v1}, Lcom/nightonke/boommenu/a/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Wrong ease-enum initialize method."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/a/c;->e(F)F

    move-result v0

    goto :goto_0

    :pswitch_1
    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/a/c;->h(F)F

    move-result v0

    goto :goto_0

    :pswitch_2
    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/a/c;->f(F)F

    move-result v0

    goto :goto_0

    :pswitch_3
    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/a/c;->i(F)F

    move-result v0

    goto :goto_0

    :pswitch_4
    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/a/c;->g(F)F

    move-result v0

    goto :goto_0

    :pswitch_5
    invoke-direct {p0, p1}, Lcom/nightonke/boommenu/a/c;->j(F)F

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_3
        :pswitch_5
    .end packed-switch
.end method
