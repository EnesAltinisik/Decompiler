.class public Lcom/nightonke/boommenu/b/e;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/nightonke/boommenu/b/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/nightonke/boommenu/b/e;

    invoke-direct {v0}, Lcom/nightonke/boommenu/b/e;-><init>()V

    sput-object v0, Lcom/nightonke/boommenu/b/e;->a:Lcom/nightonke/boommenu/b/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(FFFF)F
    .locals 3

    const/high16 v2, 0x40000000    # 2.0f

    div-float v0, p0, v2

    div-float v1, p2, v2

    add-float/2addr v0, v1

    div-float v1, p0, v2

    div-float v2, p2, v2

    add-float/2addr v1, v2

    mul-float/2addr v0, v1

    add-float v1, p1, p3

    div-float/2addr v0, v1

    return v0
.end method

.method private static a(FF)Landroid/graphics/Point;
    .locals 3

    new-instance v0, Landroid/graphics/Point;

    float-to-int v1, p0

    float-to-int v2, p1

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    return-object v0
.end method

.method private static a(II)Landroid/graphics/Point;
    .locals 1

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, p0, p1}, Landroid/graphics/Point;-><init>(II)V

    return-object v0
.end method

.method public static a(Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FFIFFFFFFF)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nightonke/boommenu/b/d;",
            "Lcom/nightonke/boommenu/b/c;",
            "Landroid/graphics/Point;",
            "FFIFFFFFFF)",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    move/from16 v0, p5

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    div-int/lit8 v4, p5, 0x2

    sget-object v3, Lcom/nightonke/boommenu/b/e$1;->a:[I

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/d;->ordinal()I

    move-result v5

    aget v3, v3, v5

    packed-switch v3, :pswitch_data_0

    :cond_0
    :goto_0
    sget-object v3, Lcom/nightonke/boommenu/b/e$1;->a:[I

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/d;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_1

    :goto_1
    :pswitch_0
    invoke-static {v2, p2}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;Landroid/graphics/Point;)V

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move/from16 v7, p9

    move/from16 v8, p10

    move/from16 v9, p11

    move/from16 v10, p12

    invoke-static/range {v2 .. v10}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FFFFFF)V

    return-object v2

    :pswitch_1
    rem-int/lit8 v3, p5, 0x2

    if-nez v3, :cond_2

    add-int/lit8 v3, v4, -0x1

    :goto_2
    if-ltz v3, :cond_1

    neg-float v5, p3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, p6, v6

    sub-float/2addr v5, v6

    int-to-float v6, v3

    add-float v7, p3, p6

    mul-float/2addr v6, v7

    sub-float/2addr v5, v6

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    :goto_3
    if-ge v3, v4, :cond_0

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p3, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, p6, v6

    add-float/2addr v5, v6

    int-to-float v6, v3

    add-float v7, p3, p6

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v4, -0x1

    :goto_4
    if-ltz v3, :cond_3

    neg-float v5, p3

    sub-float v5, v5, p6

    int-to-float v6, v3

    add-float v7, p3, p6

    mul-float/2addr v6, v7

    sub-float/2addr v5, v6

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    :cond_3
    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v3, v5}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v4, :cond_0

    add-float v5, p3, p6

    int-to-float v6, v3

    add-float v7, p3, p6

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :pswitch_2
    rem-int/lit8 v3, p5, 0x2

    if-nez v3, :cond_5

    add-int/lit8 v3, v4, -0x1

    :goto_6
    if-ltz v3, :cond_4

    const/4 v5, 0x0

    neg-float v6, p4

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    const/high16 v7, 0x40000000    # 2.0f

    div-float v7, p7, v7

    sub-float/2addr v6, v7

    int-to-float v7, v3

    add-float v8, p4, p7

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_6

    :cond_4
    const/4 v3, 0x0

    :goto_7
    if-ge v3, v4, :cond_0

    const/4 v5, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, p4, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float v7, p7, v7

    add-float/2addr v6, v7

    int-to-float v7, v3

    add-float v8, p4, p7

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_5
    add-int/lit8 v3, v4, -0x1

    :goto_8
    if-ltz v3, :cond_6

    const/4 v5, 0x0

    neg-float v6, p4

    sub-float v6, v6, p7

    int-to-float v7, v3

    add-float v8, p4, p7

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_8

    :cond_6
    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v3, v5}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v4, :cond_0

    const/4 v5, 0x0

    add-float v6, p4, p7

    int-to-float v7, v3

    add-float v8, p4, p7

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :pswitch_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_4
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_5
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_6
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_7
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_8
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_9
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_a
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_b
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_c
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_d
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_e
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_f
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_10
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_11
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_12
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_13
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_14
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_15
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_16
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_17
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_18
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_19
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1a
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40400000    # 3.0f

    mul-float v3, v3, p6

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1b
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40400000    # 3.0f

    mul-float v3, v3, p6

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1c
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1d
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1e
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1f
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p4

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, p7

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p4

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_20
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v3, v3, p6

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, p3

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, p3

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_21
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40400000    # 3.0f

    mul-float v3, v3, p6

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40400000    # 3.0f

    mul-float v3, v3, p6

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_22
    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v5, p4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v5, p4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float v4, v4, p7

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v5, p4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float v4, v4, p7

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v5, p4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_23
    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_24
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p4

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p6, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    add-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, p7

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p4

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p3, v4

    sub-float/2addr v3, v4

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_25
    const/4 v3, 0x0

    move/from16 v0, p7

    neg-float v4, v0

    sub-float/2addr v4, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v3, v3, p6

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, p3

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v3, p6, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    add-float v4, p7, p4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p7, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, p3

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p6

    neg-float v3, v0

    sub-float/2addr v3, p3

    move/from16 v0, p7

    neg-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p4, v5

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_26
    const/4 v3, 0x0

    move/from16 v0, p6

    move/from16 v1, p7

    invoke-static {v0, v1, p3, p4}, Lcom/nightonke/boommenu/b/e;->a(FFFF)F

    move-result v4

    invoke-static {v2, v3, v4}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;FF)V

    goto/16 :goto_1

    :pswitch_27
    const/4 v3, 0x0

    move/from16 v0, p6

    move/from16 v1, p7

    invoke-static {v0, v1, p3, p4}, Lcom/nightonke/boommenu/b/e;->a(FFFF)F

    move-result v4

    neg-float v4, v4

    invoke-static {v2, v3, v4}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;FF)V

    goto/16 :goto_1

    :pswitch_28
    const/4 v3, 0x0

    sub-float v4, p4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    invoke-static {v2, v3, v4}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;FF)V

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
        :pswitch_24
        :pswitch_25
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_26
        :pswitch_27
        :pswitch_0
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
    .end packed-switch
.end method

.method public static a(Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FFIFFFFFFLjava/lang/Float;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nightonke/boommenu/b/d;",
            "Lcom/nightonke/boommenu/b/c;",
            "Landroid/graphics/Point;",
            "FFIFFFFFF",
            "Ljava/lang/Float;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p5}, Ljava/util/ArrayList;-><init>(I)V

    div-int/lit8 v2, p5, 0x2

    sget-object v1, Lcom/nightonke/boommenu/b/e$1;->a:[I

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/d;->ordinal()I

    move-result v3

    aget v1, v1, v3

    sparse-switch v1, :sswitch_data_0

    :cond_0
    :goto_0
    invoke-static {v0, p2}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;Landroid/graphics/Point;)V

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move/from16 v5, p8

    move/from16 v6, p9

    move/from16 v7, p10

    move/from16 v8, p11

    invoke-static/range {v0 .. v8}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FFFFFF)V

    return-object v0

    :sswitch_0
    rem-int/lit8 v1, p5, 0x2

    if-nez v1, :cond_2

    add-int/lit8 v1, v2, -0x1

    :goto_1
    if-ltz v1, :cond_1

    neg-float v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p6, v4

    sub-float/2addr v3, v4

    int-to-float v4, v1

    add-float v5, p3, p6

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v2, :cond_0

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p6, v4

    add-float/2addr v3, v4

    int-to-float v4, v1

    add-float v5, p3, p6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v2, -0x1

    :goto_3
    if-ltz v1, :cond_3

    neg-float v3, p3

    sub-float/2addr v3, p6

    int-to-float v4, v1

    add-float v5, p3, p6

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v2, :cond_0

    add-float v3, p3, p6

    int-to-float v4, v1

    add-float v5, p3, p6

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :sswitch_1
    rem-int/lit8 v1, p5, 0x2

    if-nez v1, :cond_5

    add-int/lit8 v1, v2, -0x1

    :goto_5
    if-ltz v1, :cond_4

    const/4 v3, 0x0

    neg-float v4, p4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p7, v5

    sub-float/2addr v4, v5

    int-to-float v5, v1

    add-float v6, p4, p7

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_5

    :cond_4
    const/4 v1, 0x0

    :goto_6
    if-ge v1, v2, :cond_7

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p7, v5

    add-float/2addr v4, v5

    int-to-float v5, v1

    add-float v6, p4, p7

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_5
    add-int/lit8 v1, v2, -0x1

    :goto_7
    if-ltz v1, :cond_6

    const/4 v3, 0x0

    neg-float v4, p4

    sub-float v4, v4, p7

    int-to-float v5, v1

    add-float v6, p4, p7

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_7

    :cond_6
    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    :goto_8
    if-ge v1, v2, :cond_7

    const/4 v3, 0x0

    add-float v4, p4, p7

    int-to-float v5, v1

    add-float v6, p4, p7

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_7
    const/4 v1, 0x2

    if-lt p5, v1, :cond_0

    if-eqz p12, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Point;

    const/4 v2, 0x0

    invoke-virtual/range {p12 .. p12}, Ljava/lang/Float;->floatValue()F

    move-result v3

    sub-float v3, v3, p7

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Point;->offset(II)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x26 -> :sswitch_1
        0x27 -> :sswitch_1
        0x28 -> :sswitch_1
        0x29 -> :sswitch_1
        0x2a -> :sswitch_1
        0x2b -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FIFFFFFFF)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nightonke/boommenu/b/d;",
            "Lcom/nightonke/boommenu/b/c;",
            "Landroid/graphics/Point;",
            "FIFFFFFFF)",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p4}, Ljava/util/ArrayList;-><init>(I)V

    div-int/lit8 v2, p4, 0x2

    sget-object v1, Lcom/nightonke/boommenu/b/e$1;->a:[I

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/d;->ordinal()I

    move-result v3

    aget v1, v1, v3

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    invoke-static {v0, p2}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;Landroid/graphics/Point;)V

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v3, p3, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v4, p3, v1

    move-object v1, p1

    move-object v2, p2

    move/from16 v5, p8

    move/from16 v6, p9

    move/from16 v7, p10

    move/from16 v8, p11

    invoke-static/range {v0 .. v8}, Lcom/nightonke/boommenu/b/e;->a(Ljava/util/ArrayList;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FFFFFF)V

    return-object v0

    :pswitch_0
    rem-int/lit8 v1, p4, 0x2

    if-nez v1, :cond_2

    add-int/lit8 v1, v2, -0x1

    :goto_1
    if-ltz v1, :cond_1

    neg-float v3, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p5, v4

    sub-float/2addr v3, v4

    int-to-float v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p3

    add-float/2addr v5, p5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v2, :cond_0

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p5, v3

    add-float/2addr v3, p3

    int-to-float v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p3

    add-float/2addr v5, p5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v2, -0x1

    :goto_3
    if-ltz v1, :cond_3

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v3, p5

    int-to-float v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p3

    add-float/2addr v5, p5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v2, :cond_0

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    add-float/2addr v3, p5

    int-to-float v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p3

    add-float/2addr v5, p5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :pswitch_1
    rem-int/lit8 v1, p4, 0x2

    if-nez v1, :cond_5

    add-int/lit8 v1, v2, -0x1

    :goto_5
    if-ltz v1, :cond_4

    const/4 v3, 0x0

    neg-float v4, p3

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p6, v5

    sub-float/2addr v4, v5

    int-to-float v5, v1

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, p3

    add-float/2addr v6, p6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_5

    :cond_4
    const/4 v1, 0x0

    :goto_6
    if-ge v1, v2, :cond_0

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p6, v4

    add-float/2addr v4, p3

    int-to-float v5, v1

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, p3

    add-float/2addr v6, p6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_5
    add-int/lit8 v1, v2, -0x1

    :goto_7
    if-ltz v1, :cond_6

    const/4 v3, 0x0

    const/high16 v4, -0x40000000    # -2.0f

    mul-float/2addr v4, p3

    sub-float/2addr v4, p6

    int-to-float v5, v1

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, p3

    add-float/2addr v6, p6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_7

    :cond_6
    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    :goto_8
    if-ge v1, v2, :cond_0

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, p3

    add-float/2addr v4, p6

    int-to-float v5, v1

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, p3

    add-float/2addr v6, p6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :pswitch_2
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_3
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_4
    const/4 v1, 0x0

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_5
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_6
    const/4 v1, 0x0

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_7
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    neg-float v4, v1

    neg-float v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v3

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_8
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/4 v4, 0x0

    neg-float v2, v2

    invoke-static {v4, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_9
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_a
    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float v1, v1, p7

    float-to-double v2, v1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-float v1, v2

    const/4 v2, 0x0

    neg-float v3, v1

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_b
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/high16 v4, -0x40000000    # -2.0f

    mul-float/2addr v4, v1

    neg-float v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v1, v4

    neg-float v2, v2

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_c
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p5, v4

    add-float/2addr v4, p3

    neg-float v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, p5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, p3

    neg-float v3, v3

    invoke-static {v4, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v1

    invoke-static {v3, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    invoke-static {v3, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v1, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_d
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_e
    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float v1, v1, p7

    float-to-double v2, v1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-float v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    neg-float v1, v1

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_f
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_10
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_11
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    neg-float v4, v1

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v1

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v1

    add-float/2addr v2, v3

    invoke-static {v4, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_12
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/4 v4, 0x0

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    neg-float v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    invoke-static {v4, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    invoke-static {v4, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v3

    sub-float v2, v3, v2

    neg-float v1, v1

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_13
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    sub-float v4, v2, v3

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v1

    neg-float v6, v3

    sub-float/2addr v6, v2

    add-float/2addr v6, v4

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x0

    neg-float v6, v3

    sub-float/2addr v6, v2

    add-float/2addr v6, v4

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v1, v5

    neg-float v5, v3

    sub-float/2addr v5, v2

    add-float/2addr v5, v4

    invoke-static {v1, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v1, v5

    sub-float/2addr v1, p3

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    add-float/2addr v2, v3

    add-float/2addr v2, v4

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_14
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    sub-float v4, v2, v3

    const/4 v5, 0x0

    neg-float v6, v3

    sub-float/2addr v6, v2

    sub-float/2addr v6, v4

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v5, p5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, p3

    neg-float v6, v4

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p5, v5

    add-float/2addr v5, p3

    neg-float v6, v4

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v1

    add-float v6, v3, v2

    sub-float/2addr v6, v4

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x0

    add-float v6, v3, v2

    sub-float/2addr v6, v4

    invoke-static {v5, v6}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v1, v5

    add-float/2addr v2, v3

    sub-float/2addr v2, v4

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_15
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_16
    const/4 v1, 0x0

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_17
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v1

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v1

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v1

    add-float/2addr v2, v3

    invoke-static {v4, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_18
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    neg-float v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    invoke-static {v4, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    invoke-static {v4, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v3

    sub-float v2, v3, v2

    neg-float v1, v1

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_19
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/high16 v4, -0x3fc00000    # -3.0f

    mul-float/2addr v4, v1

    neg-float v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v1

    neg-float v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, v1

    neg-float v3, v3

    invoke-static {v4, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v3, v1

    invoke-static {v3, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    invoke-static {v3, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v1, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1a
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/high16 v4, -0x40000000    # -2.0f

    mul-float/2addr v4, v1

    neg-float v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v1

    neg-float v2, v2

    invoke-static {v4, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x3fc00000    # -3.0f

    mul-float/2addr v2, v1

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    invoke-static {v1, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1b
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/high16 v4, -0x40000000    # -2.0f

    mul-float/2addr v4, v1

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v1

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, p5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, p3

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p5, v4

    add-float/2addr v4, p3

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, -0x40000000    # -2.0f

    mul-float/2addr v4, v1

    add-float v5, v3, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    add-float v5, v3, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v1, v4

    add-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1c
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    neg-float v4, v3

    sub-float/2addr v4, v2

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, p6

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, p3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, p6, v5

    add-float/2addr v5, p3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v1

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v1, v3

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1d
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1e
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/4 v4, 0x0

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v2

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, p5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, p3

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p5, v4

    add-float/2addr v4, p3

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, -0x40000000    # -2.0f

    mul-float/2addr v4, v1

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v1, v4

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    sub-float/2addr v1, p3

    add-float v4, v3, v2

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    add-float v4, v3, v2

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v2, v4

    add-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1f
    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float v1, v1, p7

    float-to-double v2, v1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-float v1, v2

    const/4 v2, 0x0

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v3, v1

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v1

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v2, v1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    neg-float v1, v1

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_20
    neg-float v1, p5

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v2, p3

    add-float/2addr v1, v2

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v2, p3

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_21
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p6, v2

    add-float/2addr v2, p3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, p3

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v3, p3

    add-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v3, p3

    add-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_22
    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    neg-float v2, p6

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, p3

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float/2addr v1, p5

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p3

    add-float/2addr v2, p6

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_23
    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    float-to-double v2, v1

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    const/4 v4, 0x0

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v2

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, p5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, p3

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, p5, v4

    add-float/2addr v4, p3

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, -0x40000000    # -2.0f

    mul-float/2addr v4, v1

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v1, v4

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v1, p5

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    sub-float/2addr v1, p3

    add-float v4, v3, v2

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p5, v1

    add-float/2addr v1, p3

    add-float v4, v3, v2

    invoke-static {v1, v4}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v2, v4

    add-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_24
    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p3

    add-float v1, v1, p7

    float-to-double v2, v1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-float v1, v2

    const/4 v2, 0x0

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v3, v1

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    invoke-static {v1, v2}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(II)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v1

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v2, v1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v1

    neg-float v1, v1

    invoke-static {v2, v1}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
        :pswitch_24
    .end packed-switch
.end method

.method private static a(Ljava/util/ArrayList;FF)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;FF)V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    add-float v2, v0, p1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    add-float/2addr v0, p2

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/b/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static a(Ljava/util/ArrayList;Landroid/graphics/Point;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;",
            "Landroid/graphics/Point;",
            ")V"
        }
    .end annotation

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    new-instance v2, Landroid/graphics/Point;

    iget v3, v0, Landroid/graphics/Point;->x:I

    int-to-double v4, v3

    iget v3, p1, Landroid/graphics/Point;->x:I

    int-to-double v6, v3

    div-double/2addr v6, v8

    add-double/2addr v4, v6

    double-to-int v3, v4

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v4, v0

    iget v0, p1, Landroid/graphics/Point;->y:I

    int-to-double v6, v0

    div-double/2addr v6, v8

    add-double/2addr v4, v6

    double-to-int v0, v4

    invoke-direct {v2, v3, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {p0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static a(Ljava/util/ArrayList;Lcom/nightonke/boommenu/b/c;Landroid/graphics/Point;FFFFFF)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;",
            "Lcom/nightonke/boommenu/b/c;",
            "Landroid/graphics/Point;",
            "FFFFFF)V"
        }
    .end annotation

    const v3, 0x7fffffff

    const/high16 v2, -0x80000000

    const v1, 0x7fffffff

    const/high16 v0, -0x80000000

    new-instance v5, Landroid/graphics/Point;

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v0

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v7, v0, Landroid/graphics/Point;->y:I

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v7, v0, Landroid/graphics/Point;->y:I

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget v7, v0, Landroid/graphics/Point;->x:I

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/nightonke/boommenu/b/e$1;->b:[I

    invoke-virtual {p1}, Lcom/nightonke/boommenu/b/c;->ordinal()I

    move-result v6

    aget v0, v0, v6

    packed-switch v0, :pswitch_data_0

    :goto_1
    :pswitch_0
    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    new-instance v2, Landroid/graphics/Point;

    iget v3, v0, Landroid/graphics/Point;->x:I

    iget v4, v5, Landroid/graphics/Point;->x:I

    add-int/2addr v3, v4

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v4, v5, Landroid/graphics/Point;->y:I

    add-int/2addr v0, v4

    invoke-direct {v2, v3, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {p0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :pswitch_1
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p4, v0

    add-float/2addr v0, p5

    int-to-float v1, v4

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->y:I

    goto :goto_1

    :pswitch_2
    iget v0, p2, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p4, v1

    sub-float/2addr v0, v1

    int-to-float v1, v3

    sub-float/2addr v0, v1

    sub-float/2addr v0, p6

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->y:I

    goto :goto_1

    :pswitch_3
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p3, v0

    add-float/2addr v0, p7

    int-to-float v1, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->x:I

    goto :goto_1

    :pswitch_4
    iget v0, p2, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p3, v2

    sub-float/2addr v0, v2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float v0, v0, p8

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->x:I

    goto :goto_1

    :pswitch_5
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p4, v0

    add-float/2addr v0, p5

    int-to-float v1, v4

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->y:I

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p3, v0

    add-float/2addr v0, p7

    int-to-float v1, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->x:I

    goto :goto_1

    :pswitch_6
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p4, v0

    add-float/2addr v0, p5

    int-to-float v2, v4

    sub-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->y:I

    iget v0, p2, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p3, v2

    sub-float/2addr v0, v2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float v0, v0, p8

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->x:I

    goto/16 :goto_1

    :pswitch_7
    iget v0, p2, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p4, v1

    sub-float/2addr v0, v1

    int-to-float v1, v3

    sub-float/2addr v0, v1

    sub-float/2addr v0, p6

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->y:I

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p3, v0

    add-float/2addr v0, p7

    int-to-float v1, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->x:I

    goto/16 :goto_1

    :pswitch_8
    iget v0, p2, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p4, v2

    sub-float/2addr v0, v2

    int-to-float v2, v3

    sub-float/2addr v0, v2

    sub-float/2addr v0, p6

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->y:I

    iget v0, p2, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p3, v2

    sub-float/2addr v0, v2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float v0, v0, p8

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->x:I

    goto/16 :goto_1

    :pswitch_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown button-place-alignment-enum!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void

    nop

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
    .end packed-switch
.end method
