.class public Lcom/nightonke/boommenu/c/e;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/nightonke/boommenu/c/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/nightonke/boommenu/c/e;

    invoke-direct {v0}, Lcom/nightonke/boommenu/c/e;-><init>()V

    sput-object v0, Lcom/nightonke/boommenu/c/e;->a:Lcom/nightonke/boommenu/c/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

.method public static a(Landroid/content/Context;Lcom/nightonke/boommenu/c/d;I)Lcom/nightonke/boommenu/c/a;
    .locals 2

    sget-object v0, Lcom/nightonke/boommenu/c/e$2;->a:[I

    invoke-virtual {p1}, Lcom/nightonke/boommenu/c/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown button-enum!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p0, p2}, Lcom/nightonke/boommenu/c/e;->a(Landroid/content/Context;I)Lcom/nightonke/boommenu/c/b;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    invoke-static {p0, p2}, Lcom/nightonke/boommenu/c/e;->b(Landroid/content/Context;I)Lcom/nightonke/boommenu/c/c;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static a(Landroid/content/Context;I)Lcom/nightonke/boommenu/c/b;
    .locals 1

    new-instance v0, Lcom/nightonke/boommenu/c/b;

    invoke-direct {v0, p0}, Lcom/nightonke/boommenu/c/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/nightonke/boommenu/c/b;->a(I)V

    return-object v0
.end method

.method public static a(Landroid/graphics/Point;III)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Point;",
            "III)",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation

    const/high16 v8, 0x40000000    # 2.0f

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    int-to-double v2, p3

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    div-double/2addr v2, v6

    double-to-float v2, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    rem-int/lit8 v3, v0, 0x3

    packed-switch v3, :pswitch_data_0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :pswitch_0
    div-float v3, v2, v8

    neg-int v4, p3

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_1
    neg-float v3, v2

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_2
    div-float v3, v2, v8

    div-int/lit8 v4, p3, 0x2

    int-to-float v4, v4

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/nightonke/boommenu/c/e$1;

    invoke-direct {v0}, Lcom/nightonke/boommenu/c/e$1;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v3, p0, Landroid/graphics/Point;->x:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, p1

    iget v4, p0, Landroid/graphics/Point;->y:I

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v4, p1

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Point;->offset(II)V

    goto :goto_2

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Lcom/nightonke/boommenu/c/d;Landroid/graphics/Point;III)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nightonke/boommenu/c/d;",
            "Landroid/graphics/Point;",
            "III)",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v10, 0x0

    const/high16 v9, 0x40000000    # 2.0f

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    int-to-float v3, p2

    int-to-float v4, p3

    int-to-float v5, p4

    invoke-virtual {p0}, Lcom/nightonke/boommenu/c/d;->a()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Lcom/nightonke/boommenu/c/d;->a()I

    move-result v6

    rem-int/lit8 v6, v6, 0x2

    if-nez v6, :cond_1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    neg-float v6, v4

    div-float/2addr v6, v9

    div-float v7, v5, v9

    sub-float/2addr v6, v7

    int-to-float v7, v1

    add-float v8, v4, v5

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    invoke-static {v10, v6}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    :goto_1
    int-to-float v1, v0

    cmpg-float v1, v1, v4

    if-gez v1, :cond_3

    div-float v1, v4, v9

    div-float v6, v5, v9

    add-float/2addr v1, v6

    int-to-float v6, v0

    add-float v7, v4, v5

    mul-float/2addr v6, v7

    add-float/2addr v1, v6

    invoke-static {v10, v1}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    :goto_2
    if-ltz v1, :cond_2

    neg-float v6, v4

    sub-float/2addr v6, v5

    int-to-float v7, v1

    add-float v8, v4, v5

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    invoke-static {v10, v6}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_2
    invoke-static {v0, v0}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    int-to-float v1, v0

    cmpg-float v1, v1, v4

    if-gez v1, :cond_3

    add-float v1, v4, v5

    int-to-float v6, v0

    add-float v7, v4, v5

    mul-float/2addr v6, v7

    add-float/2addr v1, v6

    invoke-static {v10, v1}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v5, p1, Landroid/graphics/Point;->x:I

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    div-float v6, v3, v9

    sub-float/2addr v5, v6

    float-to-int v5, v5

    iget v6, p1, Landroid/graphics/Point;->y:I

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    div-float v7, v4, v9

    sub-float/2addr v6, v7

    float-to-int v6, v6

    invoke-virtual {v0, v5, v6}, Landroid/graphics/Point;->offset(II)V

    goto :goto_4

    :cond_4
    return-object v2
.end method

.method public static a(Lcom/nightonke/boommenu/c/d;Landroid/graphics/Point;IIII)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nightonke/boommenu/c/d;",
            "Landroid/graphics/Point;",
            "IIII)",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    int-to-float v0, p2

    int-to-float v2, p3

    int-to-float v3, p4

    int-to-float v4, p5

    sget-object v5, Lcom/nightonke/boommenu/c/e$2;->a:[I

    invoke-virtual {p0}, Lcom/nightonke/boommenu/c/d;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown piece-place-enum!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v3, p1, Landroid/graphics/Point;->x:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, p2

    iget v4, p1, Landroid/graphics/Point;->y:I

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v4, p2

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Point;->offset(II)V

    goto :goto_1

    :pswitch_1
    neg-float v3, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v3, v0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_2
    const/4 v2, 0x0

    neg-float v4, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    invoke-static {v2, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_3
    neg-float v3, v2

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    add-float/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_4
    const/4 v3, 0x0

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v0, v4

    add-float/2addr v0, v2

    invoke-static {v3, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_5
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    float-to-double v2, v0

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    neg-float v4, v0

    neg-float v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v3

    invoke-static {v0, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_6
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    float-to-double v2, v0

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

    invoke-static {v4, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_7
    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    add-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    add-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    add-float/2addr v2, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_8
    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v0, v2

    add-float/2addr v0, v4

    float-to-double v2, v0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-float v0, v2

    const/4 v2, 0x0

    neg-float v3, v0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v0, v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_9
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    add-float/2addr v3, v0

    float-to-double v4, v3

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    const/high16 v6, -0x40000000    # -2.0f

    mul-float/2addr v6, v3

    neg-float v7, v5

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    neg-float v7, v5

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v3, v6

    neg-float v5, v5

    invoke-static {v3, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v3, v5

    sub-float/2addr v3, v0

    invoke-static {v3, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    invoke-static {v0, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_a
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    add-float/2addr v3, v0

    float-to-double v4, v3

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    neg-float v6, v2

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    sub-float/2addr v6, v0

    neg-float v7, v4

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v2, v6

    add-float/2addr v0, v2

    neg-float v2, v4

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v0, -0x40000000    # -2.0f

    mul-float/2addr v0, v3

    invoke-static {v0, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-static {v0, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    invoke-static {v0, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_b
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v4, v2

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    add-float/2addr v3, v5

    invoke-static {v4, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    sub-float v0, v2, v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_c
    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v0, v2

    add-float/2addr v0, v4

    float-to-double v2, v0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-float v0, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    neg-float v0, v0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_d
    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v4, v2

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    add-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    add-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_e
    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    add-float/2addr v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    add-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    add-float/2addr v4, v0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    add-float/2addr v2, v0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_f
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    float-to-double v2, v0

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    neg-float v4, v0

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    invoke-static {v0, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    invoke-static {v0, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v0

    add-float/2addr v2, v3

    invoke-static {v4, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_10
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    float-to-double v2, v0

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

    mul-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    neg-float v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    invoke-static {v4, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    invoke-static {v4, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v3

    sub-float v2, v3, v2

    neg-float v0, v0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_11
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    add-float/2addr v3, v0

    float-to-double v4, v3

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    sub-float v6, v4, v5

    const/high16 v7, -0x40000000    # -2.0f

    mul-float/2addr v7, v3

    neg-float v8, v5

    sub-float/2addr v8, v4

    add-float/2addr v8, v6

    invoke-static {v7, v8}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x0

    neg-float v8, v5

    sub-float/2addr v8, v4

    add-float/2addr v8, v6

    invoke-static {v7, v8}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v7, 0x40000000    # 2.0f

    mul-float/2addr v3, v7

    neg-float v7, v5

    sub-float/2addr v7, v4

    add-float/2addr v7, v6

    invoke-static {v3, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v2

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v3, v7

    sub-float/2addr v3, v0

    invoke-static {v3, v6}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    invoke-static {v0, v6}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    add-float v2, v5, v4

    add-float/2addr v2, v6

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_12
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    add-float/2addr v3, v0

    float-to-double v4, v3

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    sub-float v6, v4, v5

    const/4 v7, 0x0

    neg-float v8, v5

    sub-float/2addr v8, v4

    sub-float/2addr v8, v6

    invoke-static {v7, v8}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v7, v2

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    sub-float/2addr v7, v0

    neg-float v8, v6

    invoke-static {v7, v8}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v2, v7

    add-float/2addr v0, v2

    neg-float v2, v6

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v0, -0x40000000    # -2.0f

    mul-float/2addr v0, v3

    add-float v2, v5, v4

    sub-float/2addr v2, v6

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    add-float v2, v5, v4

    sub-float/2addr v2, v6

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    add-float v2, v5, v4

    sub-float/2addr v2, v6

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_13
    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v4, v2

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v2, v4

    const/4 v4, 0x0

    invoke-static {v2, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_14
    const/4 v4, 0x0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v4, v2

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    add-float/2addr v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    add-float/2addr v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_15
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    float-to-double v2, v0

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

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v0

    neg-float v5, v3

    sub-float/2addr v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    invoke-static {v0, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    invoke-static {v0, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v0

    add-float/2addr v2, v3

    invoke-static {v4, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_16
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    float-to-double v2, v0

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

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    neg-float v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v4, v3, v2

    invoke-static {v4, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    sub-float/2addr v4, v2

    invoke-static {v4, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v3

    sub-float v2, v3, v2

    neg-float v0, v0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_17
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    float-to-double v2, v0

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

    mul-float/2addr v4, v0

    neg-float v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v0

    neg-float v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v3

    invoke-static {v0, v4}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, v0

    neg-float v3, v3

    invoke-static {v4, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v3, v0

    invoke-static {v3, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    invoke-static {v3, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_18
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    float-to-double v2, v0

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

    mul-float/2addr v4, v0

    neg-float v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v2

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    neg-float v2, v2

    invoke-static {v4, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x3fc00000    # -3.0f

    mul-float/2addr v2, v0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v0, v2

    invoke-static {v0, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_19
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    add-float/2addr v3, v0

    float-to-double v4, v3

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    const/high16 v6, -0x40000000    # -2.0f

    mul-float/2addr v6, v3

    neg-float v7, v5

    sub-float/2addr v7, v4

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    neg-float v7, v5

    sub-float/2addr v7, v4

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v3

    neg-float v7, v5

    sub-float/2addr v7, v4

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v6, v2

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    sub-float/2addr v6, v0

    const/4 v7, 0x0

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v2, v6

    add-float/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v0, -0x40000000    # -2.0f

    mul-float/2addr v0, v3

    add-float v2, v5, v4

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    add-float v2, v5, v4

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    add-float v2, v5, v4

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1a
    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v3, v2

    add-float/2addr v2, v0

    float-to-double v4, v2

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    neg-float v6, v5

    sub-float/2addr v6, v4

    const/high16 v7, -0x40000000    # -2.0f

    mul-float/2addr v7, v2

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v6, v5

    sub-float/2addr v6, v4

    const/4 v7, 0x0

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v6, v5

    sub-float/2addr v6, v4

    const/high16 v7, 0x40000000    # 2.0f

    mul-float/2addr v7, v2

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    neg-float v7, v3

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    sub-float/2addr v7, v0

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v3, v7

    add-float/2addr v0, v3

    invoke-static {v6, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v0, v5, v4

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v3, v2

    invoke-static {v0, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v0, v5, v4

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-float v0, v5, v4

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1b
    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v4, v2

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v4, v2

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    add-float/2addr v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    add-float/2addr v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1c
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    add-float/2addr v3, v0

    float-to-double v4, v3

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    const/4 v6, 0x0

    const/high16 v7, -0x40000000    # -2.0f

    mul-float/2addr v7, v5

    const/high16 v8, 0x40000000    # 2.0f

    mul-float/2addr v8, v4

    sub-float/2addr v7, v8

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v6, v2

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    sub-float/2addr v6, v0

    neg-float v7, v5

    sub-float/2addr v7, v4

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v2, v6

    add-float/2addr v6, v0

    neg-float v7, v5

    sub-float/2addr v7, v4

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, -0x40000000    # -2.0f

    mul-float/2addr v6, v3

    const/4 v7, 0x0

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v3, v6

    const/4 v6, 0x0

    invoke-static {v3, v6}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v2

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    sub-float/2addr v3, v0

    add-float v6, v5, v4

    invoke-static {v3, v6}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    add-float v2, v5, v4

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v5

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1d
    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v0, v2

    add-float/2addr v0, v4

    float-to-double v2, v0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-float v0, v2

    const/4 v2, 0x0

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v3, v0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v2, v0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    neg-float v0, v0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1e
    neg-float v4, v2

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    add-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v5, v0

    add-float/2addr v4, v5

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    add-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    add-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    add-float/2addr v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    add-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, v0

    add-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1f
    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40400000    # 3.0f

    mul-float/2addr v5, v6

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    const/high16 v6, 0x40400000    # 3.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    add-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40400000    # 3.0f

    mul-float/2addr v5, v6

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    const/high16 v6, 0x40400000    # 3.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    add-float/2addr v4, v0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    add-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    add-float/2addr v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v3, v5

    add-float/2addr v5, v0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    const/high16 v6, 0x40400000    # 3.0f

    mul-float/2addr v6, v0

    add-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    add-float/2addr v2, v0

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_20
    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v4, v2

    neg-float v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v4, v2

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v4, v2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    add-float/2addr v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v0

    add-float/2addr v5, v3

    invoke-static {v4, v5}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    add-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_21
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    add-float/2addr v3, v0

    float-to-double v4, v3

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    const/4 v6, 0x0

    const/high16 v7, -0x40000000    # -2.0f

    mul-float/2addr v7, v5

    const/high16 v8, 0x40000000    # 2.0f

    mul-float/2addr v8, v4

    sub-float/2addr v7, v8

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v6, v2

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    sub-float/2addr v6, v0

    neg-float v7, v5

    sub-float/2addr v7, v4

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v2, v6

    add-float/2addr v6, v0

    neg-float v7, v5

    sub-float/2addr v7, v4

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, -0x40000000    # -2.0f

    mul-float/2addr v6, v3

    const/4 v7, 0x0

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v6, v7}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v3, v6

    const/4 v6, 0x0

    invoke-static {v3, v6}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v3, v2

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    sub-float/2addr v3, v0

    add-float v6, v5, v4

    invoke-static {v3, v6}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    add-float v2, v5, v4

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v5

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_22
    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v0, v2

    add-float/2addr v0, v4

    float-to-double v2, v0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-float v0, v2

    const/4 v2, 0x0

    const/high16 v3, -0x40000000    # -2.0f

    mul-float/2addr v3, v0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    invoke-static {v0, v2}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(II)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v2, -0x40000000    # -2.0f

    mul-float/2addr v2, v0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-float v2, v0

    neg-float v0, v0

    invoke-static {v2, v0}, Lcom/nightonke/boommenu/c/e;->a(FF)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_0
    return-object v1

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
    .end packed-switch
.end method

.method private static b(Landroid/content/Context;I)Lcom/nightonke/boommenu/c/c;
    .locals 1

    new-instance v0, Lcom/nightonke/boommenu/c/c;

    invoke-direct {v0, p0}, Lcom/nightonke/boommenu/c/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/nightonke/boommenu/c/c;->a(I)V

    return-object v0
.end method
