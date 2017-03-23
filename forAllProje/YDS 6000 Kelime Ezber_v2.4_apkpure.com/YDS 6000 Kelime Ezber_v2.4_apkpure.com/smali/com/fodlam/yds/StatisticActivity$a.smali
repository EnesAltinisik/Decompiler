.class public Lcom/fodlam/yds/StatisticActivity$a;
.super Landroid/support/v4/b/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fodlam/yds/StatisticActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/b/l;-><init>()V

    return-void
.end method

.method private a(FFLjava/lang/String;Ljava/lang/String;I)Lcom/github/mikephil/charting/data/PieData;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/github/mikephil/charting/data/PieEntry;

    invoke-direct {v1, p1, p3}, Lcom/github/mikephil/charting/data/PieEntry;-><init>(FLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/github/mikephil/charting/data/PieEntry;

    invoke-direct {v1, p2, p4}, Lcom/github/mikephil/charting/data/PieEntry;-><init>(FLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/github/mikephil/charting/data/PieDataSet;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/github/mikephil/charting/data/PieDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/high16 v0, 0x40400000    # 3.0f

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/data/PieDataSet;->setSliceSpace(F)V

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/data/PieDataSet;->setSelectionShift(F)V

    if-nez p5, :cond_1

    sget-object v0, Lcom/github/mikephil/charting/utils/ColorTemplate;->MATERIAL_COLORS:[I

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/data/PieDataSet;->setColors([I)V

    :cond_0
    :goto_0
    new-instance v0, Lcom/github/mikephil/charting/data/PieData;

    invoke-direct {v0, v1}, Lcom/github/mikephil/charting/data/PieData;-><init>(Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;)V

    new-instance v1, Lcom/github/mikephil/charting/formatter/PercentFormatter;

    invoke-direct {v1}, Lcom/github/mikephil/charting/formatter/PercentFormatter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/PieData;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IValueFormatter;)V

    const/high16 v1, 0x41300000    # 11.0f

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/PieData;->setValueTextSize(F)V

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/PieData;->setValueTextColor(I)V

    return-object v0

    :cond_1
    const/4 v0, 0x1

    if-ne p5, v0, :cond_2

    sget-object v0, Lcom/github/mikephil/charting/utils/ColorTemplate;->JOYFUL_COLORS:[I

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/data/PieDataSet;->setColors([I)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne p5, v0, :cond_0

    sget-object v0, Lcom/github/mikephil/charting/utils/ColorTemplate;->COLORFUL_COLORS:[I

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/data/PieDataSet;->setColors([I)V

    goto :goto_0
.end method

.method public static d(I)Lcom/fodlam/yds/StatisticActivity$a;
    .locals 3

    new-instance v0, Lcom/fodlam/yds/StatisticActivity$a;

    invoke-direct {v0}, Lcom/fodlam/yds/StatisticActivity$a;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "section_number"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/StatisticActivity$a;->g(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 13

    const v0, 0x7f040020

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    const v0, 0x7f10012d

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ListView;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v8

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->g()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "section_number"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v0}, Lcom/fodlam/yds/utility/c;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/fodlam/yds/c/a;->b(Ljava/lang/String;)F

    move-result v0

    new-instance v10, Lcom/fodlam/yds/b/e;

    const v1, 0x7f09038b

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v11

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, v0, v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v2, v0, v2

    if-nez v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    const v0, 0x7f090050

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f090395

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/fodlam/yds/StatisticActivity$a;->a(FFLjava/lang/String;Ljava/lang/String;I)Lcom/github/mikephil/charting/data/PieData;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->i()Landroid/support/v4/b/m;

    move-result-object v1

    invoke-direct {v10, v11, v0, v1}, Lcom/fodlam/yds/b/e;-><init>(Ljava/lang/String;Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/fodlam/yds/b/d;

    const/4 v1, 0x0

    invoke-virtual {v8}, Lcom/fodlam/yds/c/a;->g()[F

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/fodlam/yds/b/d;-><init>(Lcom/github/mikephil/charting/data/ChartData;[F)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v0, 0x1e

    invoke-virtual {v8, v0}, Lcom/fodlam/yds/c/a;->a(I)[F

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_2
    array-length v3, v1

    if-ge v0, v3, :cond_2

    new-instance v3, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v4, v0

    aget v5, v1, v0

    invoke-direct {v3, v4, v5}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_0
    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v1, v0

    goto :goto_0

    :cond_1
    const/high16 v2, 0x42c80000    # 100.0f

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v0, v3, v0

    mul-float/2addr v2, v0

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/github/mikephil/charting/data/BarDataSet;

    const v1, 0x7f090332

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    sget-object v1, Lcom/github/mikephil/charting/utils/ColorTemplate;->VORDIPLOM_COLORS:[I

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/BarDataSet;->setColors([I)V

    const/16 v1, 0xcb

    const/16 v2, 0xcb

    const/16 v3, 0xcb

    invoke-static {v1, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/BarDataSet;->setBarShadowColor(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/BarDataSet;->setDrawValues(Z)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/github/mikephil/charting/data/BarData;

    invoke-direct {v0, v1}, Lcom/github/mikephil/charting/data/BarData;-><init>(Ljava/util/List;)V

    const v1, 0x3f666666    # 0.9f

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/BarData;->setBarWidth(F)V

    new-instance v1, Lcom/fodlam/yds/b/a;

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->h()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Lcom/fodlam/yds/b/a;-><init>(Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;Z)V

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v0, 0x1e

    invoke-virtual {v8, v0}, Lcom/fodlam/yds/c/a;->b(I)[F

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_3
    array-length v3, v1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v4, v0

    aget v5, v1, v0

    invoke-direct {v3, v4, v5}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    new-instance v0, Lcom/github/mikephil/charting/data/BarDataSet;

    const v1, 0x7f090333

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    sget-object v1, Lcom/github/mikephil/charting/utils/ColorTemplate;->VORDIPLOM_COLORS:[I

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/BarDataSet;->setColors([I)V

    const/16 v1, 0xcb

    const/16 v2, 0xcb

    const/16 v3, 0xcb

    invoke-static {v1, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/BarDataSet;->setBarShadowColor(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/BarDataSet;->setDrawValues(Z)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/github/mikephil/charting/data/BarData;

    invoke-direct {v0, v1}, Lcom/github/mikephil/charting/data/BarData;-><init>(Ljava/util/List;)V

    const v1, 0x3f666666    # 0.9f

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/BarData;->setBarWidth(F)V

    new-instance v1, Lcom/fodlam/yds/b/a;

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->h()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Lcom/fodlam/yds/b/a;-><init>(Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;Z)V

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/fodlam/yds/b/b;

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->i()Landroid/support/v4/b/m;

    move-result-object v1

    invoke-direct {v0, v1, v9}, Lcom/fodlam/yds/b/b;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_4
    :goto_4
    return-object v7

    :cond_5
    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->g()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "section_number"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_6

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/c/b;->c(I)Lcom/fodlam/yds/f/b;

    move-result-object v2

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/c/b;->c(I)Lcom/fodlam/yds/f/b;

    move-result-object v8

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/c/b;->c(I)Lcom/fodlam/yds/f/b;

    move-result-object v9

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-virtual {v2}, Lcom/fodlam/yds/f/b;->h()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {v2}, Lcom/fodlam/yds/f/b;->a()I

    move-result v1

    int-to-float v1, v1

    div-float v1, v0, v1

    new-instance v11, Lcom/fodlam/yds/b/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f090336

    invoke-virtual {p0, v2}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/high16 v0, 0x42c80000    # 100.0f

    sub-float v2, v0, v1

    const v0, 0x7f090334

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f09037a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/fodlam/yds/StatisticActivity$a;->a(FFLjava/lang/String;Ljava/lang/String;I)Lcom/github/mikephil/charting/data/PieData;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->i()Landroid/support/v4/b/m;

    move-result-object v1

    invoke-direct {v11, v12, v0, v1}, Lcom/fodlam/yds/b/e;-><init>(Ljava/lang/String;Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-virtual {v8}, Lcom/fodlam/yds/f/b;->h()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {v8}, Lcom/fodlam/yds/f/b;->a()I

    move-result v1

    int-to-float v1, v1

    div-float v1, v0, v1

    new-instance v11, Lcom/fodlam/yds/b/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v8, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f090336

    invoke-virtual {p0, v2}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/high16 v0, 0x42c80000    # 100.0f

    sub-float v2, v0, v1

    const v0, 0x7f090334

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f09037a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/fodlam/yds/StatisticActivity$a;->a(FFLjava/lang/String;Ljava/lang/String;I)Lcom/github/mikephil/charting/data/PieData;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->i()Landroid/support/v4/b/m;

    move-result-object v1

    invoke-direct {v11, v8, v0, v1}, Lcom/fodlam/yds/b/e;-><init>(Ljava/lang/String;Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-virtual {v9}, Lcom/fodlam/yds/f/b;->h()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {v9}, Lcom/fodlam/yds/f/b;->a()I

    move-result v1

    int-to-float v1, v1

    div-float v1, v0, v1

    new-instance v8, Lcom/fodlam/yds/b/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v9, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f090336

    invoke-virtual {p0, v2}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/high16 v0, 0x42c80000    # 100.0f

    sub-float v2, v0, v1

    const v0, 0x7f090334

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f09037a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/fodlam/yds/StatisticActivity$a;->a(FFLjava/lang/String;Ljava/lang/String;I)Lcom/github/mikephil/charting/data/PieData;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->i()Landroid/support/v4/b/m;

    move-result-object v1

    invoke-direct {v8, v9, v0, v1}, Lcom/fodlam/yds/b/e;-><init>(Ljava/lang/String;Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;)V

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/fodlam/yds/b/b;

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->i()Landroid/support/v4/b/m;

    move-result-object v1

    invoke-direct {v0, v1, v10}, Lcom/fodlam/yds/b/b;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto/16 :goto_4

    :cond_6
    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "section_number"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    invoke-virtual {v8}, Lcom/fodlam/yds/c/a;->h()[F

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lcom/github/mikephil/charting/data/BarEntry;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    aget v5, v0, v5

    invoke-direct {v3, v4, v5}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/github/mikephil/charting/data/BarDataSet;

    const v4, 0x7f090379

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    sget-object v2, Lcom/github/mikephil/charting/utils/ColorTemplate;->VORDIPLOM_COLORS:[I

    invoke-virtual {v3, v2}, Lcom/github/mikephil/charting/data/BarDataSet;->setColors([I)V

    const/16 v2, 0xcb

    const/16 v4, 0xcb

    const/16 v5, 0xcb

    invoke-static {v2, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/github/mikephil/charting/data/BarDataSet;->setBarShadowColor(I)V

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lcom/github/mikephil/charting/data/BarDataSet;->setDrawValues(Z)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Lcom/github/mikephil/charting/data/BarEntry;

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v8, 0x1

    aget v8, v0, v8

    invoke-direct {v4, v5, v8}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/github/mikephil/charting/data/BarDataSet;

    const v5, 0x7f090357

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    sget-object v3, Lcom/github/mikephil/charting/utils/ColorTemplate;->COLORFUL_COLORS:[I

    invoke-virtual {v4, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setColors([I)V

    const/16 v3, 0xcb

    const/16 v5, 0xcb

    const/16 v8, 0xcb

    invoke-static {v3, v5, v8}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v4, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setBarShadowColor(I)V

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setDrawValues(Z)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Lcom/github/mikephil/charting/data/BarEntry;

    const/high16 v5, 0x40400000    # 3.0f

    const/4 v8, 0x2

    aget v8, v0, v8

    invoke-direct {v4, v5, v8}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/github/mikephil/charting/data/BarDataSet;

    const v5, 0x7f09038c

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    sget-object v3, Lcom/github/mikephil/charting/utils/ColorTemplate;->MATERIAL_COLORS:[I

    invoke-virtual {v4, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setColors([I)V

    const/16 v3, 0xcb

    const/16 v5, 0xcb

    const/16 v8, 0xcb

    invoke-static {v3, v5, v8}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v4, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setBarShadowColor(I)V

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setDrawValues(Z)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Lcom/github/mikephil/charting/data/BarEntry;

    const/high16 v5, 0x40800000    # 4.0f

    const/4 v8, 0x3

    aget v0, v0, v8

    invoke-direct {v4, v5, v0}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/github/mikephil/charting/data/BarDataSet;

    const v4, 0x7f090394

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/StatisticActivity$a;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    sget-object v3, Lcom/github/mikephil/charting/utils/ColorTemplate;->JOYFUL_COLORS:[I

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setColors([I)V

    const/16 v3, 0xcb

    const/16 v4, 0xcb

    const/16 v5, 0xcb

    invoke-static {v3, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setBarShadowColor(I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setDrawValues(Z)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/github/mikephil/charting/data/BarData;

    invoke-direct {v0, v2}, Lcom/github/mikephil/charting/data/BarData;-><init>(Ljava/util/List;)V

    const v3, 0x3f666666    # 0.9f

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/data/BarData;->setBarWidth(F)V

    new-instance v0, Lcom/github/mikephil/charting/data/BarData;

    invoke-direct {v0, v2}, Lcom/github/mikephil/charting/data/BarData;-><init>(Ljava/util/List;)V

    const v2, 0x3f666666    # 0.9f

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/data/BarData;->setBarWidth(F)V

    new-instance v2, Lcom/fodlam/yds/b/a;

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->h()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, Lcom/fodlam/yds/b/a;-><init>(Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;Z)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/fodlam/yds/b/b;

    invoke-virtual {p0}, Lcom/fodlam/yds/StatisticActivity$a;->i()Landroid/support/v4/b/m;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lcom/fodlam/yds/b/b;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto/16 :goto_4
.end method
