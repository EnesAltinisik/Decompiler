.class public Lcom/nightonke/boommenu/a/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/nightonke/boommenu/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/nightonke/boommenu/a/a;

    invoke-direct {v0}, Lcom/nightonke/boommenu/a/a;-><init>()V

    sput-object v0, Lcom/nightonke/boommenu/a/a;->a:Lcom/nightonke/boommenu/a/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;Landroid/animation/AnimatorListenerAdapter;[F)Landroid/animation/ObjectAnimator;
    .locals 2

    invoke-static {p0, p1, p8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v0, p4, p5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    if-eqz p6, :cond_0

    invoke-virtual {v0, p6}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_0
    if-eqz p7, :cond_1

    invoke-virtual {v0, p7}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_1
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;[F)Landroid/animation/ObjectAnimator;
    .locals 10

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object/from16 v6, p6

    move-object/from16 v8, p7

    invoke-static/range {v0 .. v8}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;Landroid/animation/AnimatorListenerAdapter;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;Landroid/animation/AnimatorListenerAdapter;[I)Landroid/animation/ObjectAnimator;
    .locals 2

    invoke-static {p0, p1, p8}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v0, p4, p5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, p6}, Landroid/animation/ObjectAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    if-eqz p7, :cond_0

    invoke-virtual {v0, p7}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;[I)Landroid/animation/ObjectAnimator;
    .locals 10

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object/from16 v6, p6

    move-object/from16 v8, p7

    invoke-static/range {v0 .. v8}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TypeEvaluator;Landroid/animation/AnimatorListenerAdapter;[I)Landroid/animation/ObjectAnimator;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/nightonke/boommenu/a/f;I)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nightonke/boommenu/a/f;",
            "I)",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sget-object v0, Lcom/nightonke/boommenu/a/a$1;->a:[I

    invoke-virtual {p0}, Lcom/nightonke/boommenu/a/f;->ordinal()I

    move-result v3

    aget v0, v0, v3

    packed-switch v0, :pswitch_data_0

    :cond_0
    return-object v2

    :goto_0
    :pswitch_0
    if-ge v1, p1, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :goto_1
    :pswitch_1
    if-ge v1, p1, :cond_0

    sub-int v0, p1, v1

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :pswitch_2
    new-array v3, p1, [Z

    move v0, v1

    :goto_2
    array-length v4, v3

    if-ge v0, v4, :cond_1

    aput-boolean v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    move v0, v1

    :cond_2
    :goto_3
    if-ge v0, p1, :cond_0

    invoke-virtual {v4, p1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    aget-boolean v5, v3, v1

    if-nez v5, :cond_2

    const/4 v5, 0x1

    aput-boolean v5, v3, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Lcom/nightonke/boommenu/a/b;Landroid/graphics/Point;ILandroid/graphics/Point;Landroid/graphics/Point;[F[F)V
    .locals 12

    iget v1, p3, Landroid/graphics/Point;->x:I

    move-object/from16 v0, p4

    iget v2, v0, Landroid/graphics/Point;->x:I

    if-ne v1, v2, :cond_0

    sget-object p0, Lcom/nightonke/boommenu/a/b;->a:Lcom/nightonke/boommenu/a/b;

    :cond_0
    iget v1, p3, Landroid/graphics/Point;->x:I

    int-to-float v2, v1

    iget v1, p3, Landroid/graphics/Point;->y:I

    int-to-float v3, v1

    move-object/from16 v0, p4

    iget v1, v0, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    move-object/from16 v0, p4

    iget v4, v0, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    int-to-float v6, p2

    div-float/2addr v5, v6

    sub-float v6, v1, v2

    sub-float v7, v4, v3

    sget-object v8, Lcom/nightonke/boommenu/a/a$1;->b:[I

    invoke-virtual {p0}, Lcom/nightonke/boommenu/a/b;->ordinal()I

    move-result v9

    aget v8, v8, v9

    packed-switch v8, :pswitch_data_0

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    const/4 v1, 0x0

    :goto_1
    move-object/from16 v0, p5

    array-length v4, v0

    if-ge v1, v4, :cond_1

    int-to-float v4, v1

    mul-float/2addr v4, v5

    mul-float v8, v4, v6

    add-float/2addr v8, v2

    aput v8, p5, v1

    mul-float/2addr v4, v7

    add-float/2addr v4, v3

    aput v4, p6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :pswitch_1
    add-float v7, v2, v1

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v8

    const/high16 v9, 0x40400000    # 3.0f

    mul-float/2addr v8, v9

    const/high16 v9, 0x40800000    # 4.0f

    div-float/2addr v8, v9

    sub-float v9, v1, v7

    mul-float/2addr v9, v3

    sub-float v10, v7, v2

    mul-float/2addr v10, v4

    add-float/2addr v9, v10

    sub-float v10, v2, v1

    mul-float/2addr v8, v10

    add-float/2addr v8, v9

    mul-float v9, v2, v2

    sub-float v10, v1, v7

    mul-float/2addr v9, v10

    mul-float v10, v1, v1

    sub-float v11, v7, v2

    mul-float/2addr v10, v11

    add-float/2addr v9, v10

    mul-float/2addr v7, v7

    sub-float v10, v2, v1

    mul-float/2addr v7, v10

    add-float/2addr v7, v9

    div-float v7, v8, v7

    sub-float v4, v3, v4

    sub-float v8, v2, v1

    div-float/2addr v4, v8

    add-float/2addr v1, v2

    mul-float/2addr v1, v7

    sub-float/2addr v4, v1

    mul-float v1, v2, v2

    mul-float/2addr v1, v7

    sub-float v1, v3, v1

    mul-float v3, v2, v4

    sub-float v3, v1, v3

    const/4 v1, 0x0

    :goto_2
    move-object/from16 v0, p5

    array-length v8, v0

    if-ge v1, v8, :cond_1

    int-to-float v8, v1

    mul-float/2addr v8, v5

    mul-float/2addr v8, v6

    add-float/2addr v8, v2

    aput v8, p5, v1

    aget v8, p5, v1

    mul-float/2addr v8, v7

    aget v9, p5, v1

    mul-float/2addr v8, v9

    aget v9, p5, v1

    mul-float/2addr v9, v4

    add-float/2addr v8, v9

    add-float/2addr v8, v3

    aput v8, p6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :pswitch_2
    add-float v7, v2, v1

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    iget v8, p1, Landroid/graphics/Point;->y:I

    int-to-float v8, v8

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v9

    add-float/2addr v8, v9

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    sub-float v9, v1, v7

    mul-float/2addr v9, v3

    sub-float v10, v7, v2

    mul-float/2addr v10, v4

    add-float/2addr v9, v10

    sub-float v10, v2, v1

    mul-float/2addr v8, v10

    add-float/2addr v8, v9

    mul-float v9, v2, v2

    sub-float v10, v1, v7

    mul-float/2addr v9, v10

    mul-float v10, v1, v1

    sub-float v11, v7, v2

    mul-float/2addr v10, v11

    add-float/2addr v9, v10

    mul-float/2addr v7, v7

    sub-float v10, v2, v1

    mul-float/2addr v7, v10

    add-float/2addr v7, v9

    div-float v7, v8, v7

    sub-float v4, v3, v4

    sub-float v8, v2, v1

    div-float/2addr v4, v8

    add-float/2addr v1, v2

    mul-float/2addr v1, v7

    sub-float/2addr v4, v1

    mul-float v1, v2, v2

    mul-float/2addr v1, v7

    sub-float v1, v3, v1

    mul-float v3, v2, v4

    sub-float v3, v1, v3

    const/4 v1, 0x0

    :goto_3
    move-object/from16 v0, p5

    array-length v8, v0

    if-ge v1, v8, :cond_1

    int-to-float v8, v1

    mul-float/2addr v8, v5

    mul-float/2addr v8, v6

    add-float/2addr v8, v2

    aput v8, p5, v1

    aget v8, p5, v1

    mul-float/2addr v8, v7

    aget v9, p5, v1

    mul-float/2addr v8, v9

    aget v9, p5, v1

    mul-float/2addr v9, v4

    add-float/2addr v8, v9

    add-float/2addr v8, v3

    aput v8, p6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :pswitch_3
    add-float v6, v3, v4

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v6, v8

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    sub-float v9, v4, v6

    mul-float/2addr v9, v2

    sub-float v10, v6, v3

    mul-float/2addr v10, v1

    add-float/2addr v9, v10

    sub-float v10, v3, v4

    mul-float/2addr v8, v10

    add-float/2addr v8, v9

    mul-float v9, v3, v3

    sub-float v10, v4, v6

    mul-float/2addr v9, v10

    mul-float v10, v4, v4

    sub-float v11, v6, v3

    mul-float/2addr v10, v11

    add-float/2addr v9, v10

    mul-float/2addr v6, v6

    sub-float v10, v3, v4

    mul-float/2addr v6, v10

    add-float/2addr v6, v9

    div-float v6, v8, v6

    sub-float v1, v2, v1

    sub-float v8, v3, v4

    div-float/2addr v1, v8

    add-float/2addr v4, v3

    mul-float/2addr v4, v6

    sub-float v4, v1, v4

    mul-float v1, v3, v3

    mul-float/2addr v1, v6

    sub-float v1, v2, v1

    mul-float v2, v3, v4

    sub-float v2, v1, v2

    const/4 v1, 0x0

    :goto_4
    move-object/from16 v0, p5

    array-length v8, v0

    if-ge v1, v8, :cond_1

    int-to-float v8, v1

    mul-float/2addr v8, v5

    mul-float/2addr v8, v7

    add-float/2addr v8, v3

    aput v8, p6, v1

    aget v8, p6, v1

    mul-float/2addr v8, v6

    aget v9, p6, v1

    mul-float/2addr v8, v9

    aget v9, p6, v1

    mul-float/2addr v9, v4

    add-float/2addr v8, v9

    add-float/2addr v8, v2

    aput v8, p5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :pswitch_4
    add-float v6, v3, v4

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v6, v8

    iget v8, p1, Landroid/graphics/Point;->x:I

    int-to-float v8, v8

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v9

    add-float/2addr v8, v9

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    sub-float v9, v4, v6

    mul-float/2addr v9, v2

    sub-float v10, v6, v3

    mul-float/2addr v10, v1

    add-float/2addr v9, v10

    sub-float v10, v3, v4

    mul-float/2addr v8, v10

    add-float/2addr v8, v9

    mul-float v9, v3, v3

    sub-float v10, v4, v6

    mul-float/2addr v9, v10

    mul-float v10, v4, v4

    sub-float v11, v6, v3

    mul-float/2addr v10, v11

    add-float/2addr v9, v10

    mul-float/2addr v6, v6

    sub-float v10, v3, v4

    mul-float/2addr v6, v10

    add-float/2addr v6, v9

    div-float v6, v8, v6

    sub-float v1, v2, v1

    sub-float v8, v3, v4

    div-float/2addr v1, v8

    add-float/2addr v4, v3

    mul-float/2addr v4, v6

    sub-float v4, v1, v4

    mul-float v1, v3, v3

    mul-float/2addr v1, v6

    sub-float v1, v2, v1

    mul-float v2, v3, v4

    sub-float v2, v1, v2

    const/4 v1, 0x0

    :goto_5
    move-object/from16 v0, p5

    array-length v8, v0

    if-ge v1, v8, :cond_1

    int-to-float v8, v1

    mul-float/2addr v8, v5

    mul-float/2addr v8, v7

    add-float/2addr v8, v3

    aput v8, p6, v1

    aget v8, p6, v1

    mul-float/2addr v8, v6

    aget v9, p6, v1

    mul-float/2addr v8, v9

    aget v9, p6, v1

    mul-float/2addr v9, v4

    add-float/2addr v8, v9

    add-float/2addr v8, v2

    aput v8, p5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :pswitch_5
    const/high16 v7, 0x40000000    # 2.0f

    mul-float/2addr v7, v1

    sub-float/2addr v7, v2

    sub-float v8, v7, v1

    mul-float/2addr v8, v3

    sub-float v9, v1, v2

    mul-float/2addr v9, v3

    add-float/2addr v8, v9

    sub-float v9, v2, v7

    mul-float/2addr v4, v9

    add-float/2addr v4, v8

    mul-float v8, v2, v2

    sub-float v9, v7, v1

    mul-float/2addr v8, v9

    mul-float v9, v7, v7

    sub-float v10, v1, v2

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    mul-float/2addr v1, v1

    sub-float v9, v2, v7

    mul-float/2addr v1, v9

    add-float/2addr v1, v8

    div-float/2addr v4, v1

    sub-float v1, v3, v3

    sub-float v8, v2, v7

    div-float/2addr v1, v8

    add-float/2addr v7, v2

    mul-float/2addr v7, v4

    sub-float v7, v1, v7

    mul-float v1, v2, v2

    mul-float/2addr v1, v4

    sub-float v1, v3, v1

    mul-float v3, v2, v7

    sub-float v3, v1, v3

    const/4 v1, 0x0

    :goto_6
    move-object/from16 v0, p5

    array-length v8, v0

    if-ge v1, v8, :cond_1

    int-to-float v8, v1

    mul-float/2addr v8, v5

    mul-float/2addr v8, v6

    add-float/2addr v8, v2

    aput v8, p5, v1

    aget v8, p5, v1

    mul-float/2addr v8, v4

    aget v9, p5, v1

    mul-float/2addr v8, v9

    aget v9, p5, v1

    mul-float/2addr v9, v7

    add-float/2addr v8, v9

    add-float/2addr v8, v3

    aput v8, p6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :pswitch_6
    iget v1, p3, Landroid/graphics/Point;->x:I

    int-to-float v2, v1

    iget v1, p3, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    move-object/from16 v0, p4

    iget v3, v0, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    move-object/from16 v0, p4

    iget v4, v0, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    const/high16 v7, 0x40000000    # 2.0f

    mul-float/2addr v7, v2

    sub-float/2addr v7, v3

    sub-float v8, v7, v2

    mul-float/2addr v8, v4

    sub-float v9, v2, v3

    mul-float/2addr v9, v4

    add-float/2addr v8, v9

    sub-float v9, v3, v7

    mul-float/2addr v1, v9

    add-float/2addr v1, v8

    mul-float v8, v3, v3

    sub-float v9, v7, v2

    mul-float/2addr v8, v9

    mul-float v9, v7, v7

    sub-float v10, v2, v3

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    mul-float v9, v2, v2

    sub-float v10, v3, v7

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    div-float v8, v1, v8

    sub-float v1, v4, v4

    sub-float v9, v3, v7

    div-float/2addr v1, v9

    add-float/2addr v7, v3

    mul-float/2addr v7, v8

    sub-float v7, v1, v7

    mul-float v1, v3, v3

    mul-float/2addr v1, v8

    sub-float v1, v4, v1

    mul-float/2addr v3, v7

    sub-float v3, v1, v3

    const/4 v1, 0x0

    :goto_7
    move-object/from16 v0, p5

    array-length v4, v0

    if-ge v1, v4, :cond_1

    int-to-float v4, v1

    mul-float/2addr v4, v5

    mul-float/2addr v4, v6

    add-float/2addr v4, v2

    aput v4, p5, v1

    aget v4, p5, v1

    mul-float/2addr v4, v8

    aget v9, p5, v1

    mul-float/2addr v4, v9

    aget v9, p5, v1

    mul-float/2addr v9, v7

    add-float/2addr v4, v9

    add-float/2addr v4, v3

    aput v4, p6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :pswitch_7
    invoke-static {}, Lcom/nightonke/boommenu/a/b;->values()[Lcom/nightonke/boommenu/a/b;

    move-result-object v1

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    sget-object v3, Lcom/nightonke/boommenu/a/b;->h:Lcom/nightonke/boommenu/a/b;

    invoke-virtual {v3}, Lcom/nightonke/boommenu/a/b;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    aget-object v1, v1, v2

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-static/range {v1 .. v7}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/b;Landroid/graphics/Point;ILandroid/graphics/Point;Landroid/graphics/Point;[F[F)V

    goto/16 :goto_0

    :pswitch_8
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unknown boom-enum!"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

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
    .end packed-switch
.end method

.method public static varargs a(Lcom/nightonke/boommenu/b/a;JJLandroid/animation/TimeInterpolator;[F)V
    .locals 11

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/a;->G()V

    const/4 v0, 0x0

    move v9, v0

    :goto_0
    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/a;->z()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_0

    invoke-virtual {p0}, Lcom/nightonke/boommenu/b/a;->z()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const-string v1, "rotation"

    const/4 v7, 0x0

    move-wide v2, p1

    move-wide v4, p3

    move-object/from16 v6, p5

    move-object/from16 v8, p6

    invoke-static/range {v0 .. v8}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;Landroid/animation/AnimatorListenerAdapter;[F)Landroid/animation/ObjectAnimator;

    add-int/lit8 v0, v9, 0x1

    move v9, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;JJ[FLandroid/animation/TimeInterpolator;Ljava/util/ArrayList;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJ[F",
            "Landroid/animation/TimeInterpolator;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const/4 v7, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-object/from16 v6, p6

    move-object/from16 v8, p5

    invoke-static/range {v0 .. v8}, Lcom/nightonke/boommenu/a/a;->a(Ljava/lang/Object;Ljava/lang/String;JJLandroid/animation/TimeInterpolator;Landroid/animation/AnimatorListenerAdapter;[F)Landroid/animation/ObjectAnimator;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(Lcom/nightonke/boommenu/a/b;Landroid/graphics/Point;ILandroid/graphics/Point;Landroid/graphics/Point;[F[F)V
    .locals 10

    iget v0, p3, Landroid/graphics/Point;->x:I

    iget v1, p4, Landroid/graphics/Point;->x:I

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/nightonke/boommenu/a/b;->a:Lcom/nightonke/boommenu/a/b;

    :goto_0
    iget v1, p3, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, p3, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, p4, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, p4, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    int-to-float v6, p2

    div-float/2addr v5, v6

    sub-float v6, v3, v1

    sub-float v7, v4, v2

    sget-object v7, Lcom/nightonke/boommenu/a/a$1;->b:[I

    invoke-virtual {v0}, Lcom/nightonke/boommenu/a/b;->ordinal()I

    move-result v8

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_0

    :cond_0
    :goto_1
    return-void

    :pswitch_0
    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lcom/nightonke/boommenu/a/a;->a(Lcom/nightonke/boommenu/a/b;Landroid/graphics/Point;ILandroid/graphics/Point;Landroid/graphics/Point;[F[F)V

    goto :goto_1

    :pswitch_1
    iget v0, p3, Landroid/graphics/Point;->x:I

    int-to-float v1, v0

    iget v0, p3, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    iget v2, p4, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    iget v3, p4, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v1

    sub-float/2addr v4, v2

    sub-float v7, v4, v1

    mul-float/2addr v7, v3

    sub-float v8, v1, v2

    mul-float/2addr v8, v3

    add-float/2addr v7, v8

    sub-float v8, v2, v4

    mul-float/2addr v0, v8

    add-float/2addr v0, v7

    mul-float v7, v2, v2

    sub-float v8, v4, v1

    mul-float/2addr v7, v8

    mul-float v8, v4, v4

    sub-float v9, v1, v2

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    mul-float v8, v1, v1

    sub-float v9, v2, v4

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    div-float v7, v0, v7

    sub-float v0, v3, v3

    sub-float v8, v2, v4

    div-float/2addr v0, v8

    add-float/2addr v4, v2

    mul-float/2addr v4, v7

    sub-float v4, v0, v4

    mul-float v0, v2, v2

    mul-float/2addr v0, v7

    sub-float v0, v3, v0

    mul-float/2addr v2, v4

    sub-float v2, v0, v2

    const/4 v0, 0x0

    :goto_2
    array-length v3, p5

    if-ge v0, v3, :cond_0

    int-to-float v3, v0

    mul-float/2addr v3, v5

    mul-float/2addr v3, v6

    add-float/2addr v3, v1

    aput v3, p5, v0

    aget v3, p5, v0

    mul-float/2addr v3, v7

    aget v8, p5, v0

    mul-float/2addr v3, v8

    aget v8, p5, v0

    mul-float/2addr v8, v4

    add-float/2addr v3, v8

    add-float/2addr v3, v2

    aput v3, p6, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :pswitch_2
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    sub-float/2addr v0, v1

    sub-float v7, v0, v3

    mul-float/2addr v7, v2

    sub-float v8, v3, v1

    mul-float/2addr v8, v2

    add-float/2addr v7, v8

    sub-float v8, v1, v0

    mul-float/2addr v4, v8

    add-float/2addr v4, v7

    mul-float v7, v1, v1

    sub-float v8, v0, v3

    mul-float/2addr v7, v8

    mul-float v8, v0, v0

    sub-float v9, v3, v1

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    mul-float/2addr v3, v3

    sub-float v8, v1, v0

    mul-float/2addr v3, v8

    add-float/2addr v3, v7

    div-float v3, v4, v3

    sub-float v4, v2, v2

    sub-float v7, v1, v0

    div-float/2addr v4, v7

    add-float/2addr v0, v1

    mul-float/2addr v0, v3

    sub-float/2addr v4, v0

    mul-float v0, v1, v1

    mul-float/2addr v0, v3

    sub-float v0, v2, v0

    mul-float v2, v1, v4

    sub-float v2, v0, v2

    const/4 v0, 0x0

    :goto_3
    array-length v7, p5

    if-ge v0, v7, :cond_0

    int-to-float v7, v0

    mul-float/2addr v7, v5

    mul-float/2addr v7, v6

    add-float/2addr v7, v1

    aput v7, p5, v0

    aget v7, p5, v0

    mul-float/2addr v7, v3

    aget v8, p5, v0

    mul-float/2addr v7, v8

    aget v8, p5, v0

    mul-float/2addr v8, v4

    add-float/2addr v7, v8

    add-float/2addr v7, v2

    aput v7, p6, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_1
    move-object v0, p0

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
