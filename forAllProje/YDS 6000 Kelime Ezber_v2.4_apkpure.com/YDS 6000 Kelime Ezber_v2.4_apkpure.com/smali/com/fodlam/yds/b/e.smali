.class public Lcom/fodlam/yds/b/e;
.super Lcom/fodlam/yds/b/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/b/e$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/github/mikephil/charting/data/ChartData",
            "<*>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/fodlam/yds/b/c;-><init>(Lcom/github/mikephil/charting/data/ChartData;)V

    iput-object p1, p0, Lcom/fodlam/yds/b/e;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public a(ILandroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .locals 8

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/high16 v5, -0x1000000

    const/high16 v4, 0x41800000    # 16.0f

    const/4 v3, 0x0

    if-nez p2, :cond_0

    new-instance v1, Lcom/fodlam/yds/b/e$a;

    invoke-direct {v1, v7}, Lcom/fodlam/yds/b/e$a;-><init>(Lcom/fodlam/yds/b/e$1;)V

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f04004f

    invoke-virtual {v0, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    const v0, 0x7f100187

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/PieChart;

    iput-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v0, v3, v3, v3, v2}, Lcom/github/mikephil/charting/charts/PieChart;->setExtraOffsets(FFFF)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->getDescription()Lcom/github/mikephil/charting/components/Description;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/github/mikephil/charting/components/Description;->setEnabled(Z)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    const/high16 v2, 0x42500000    # 52.0f

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/PieChart;->setHoleRadius(F)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    const/high16 v2, 0x42640000    # 57.0f

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/PieChart;->setTransparentCircleRadius(F)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    iget-object v2, p0, Lcom/fodlam/yds/b/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/PieChart;->setCenterText(Ljava/lang/CharSequence;)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v5}, Lcom/github/mikephil/charting/charts/PieChart;->setCenterTextColor(I)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/charts/PieChart;->setCenterTextSize(F)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/PieChart;->setUsePercentValues(Z)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v6}, Lcom/github/mikephil/charting/charts/PieChart;->setDrawEntryLabels(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/b/e;->b:Lcom/github/mikephil/charting/data/ChartData;

    new-instance v2, Lcom/github/mikephil/charting/formatter/PercentFormatter;

    invoke-direct {v2}, Lcom/github/mikephil/charting/formatter/PercentFormatter;-><init>()V

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/data/ChartData;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IValueFormatter;)V

    iget-object v0, p0, Lcom/fodlam/yds/b/e;->b:Lcom/github/mikephil/charting/data/ChartData;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/data/ChartData;->setValueTextSize(F)V

    iget-object v0, p0, Lcom/fodlam/yds/b/e;->b:Lcom/github/mikephil/charting/data/ChartData;

    invoke-virtual {v0, v5}, Lcom/github/mikephil/charting/data/ChartData;->setValueTextColor(I)V

    iget-object v2, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    iget-object v0, p0, Lcom/fodlam/yds/b/e;->b:Lcom/github/mikephil/charting/data/ChartData;

    check-cast v0, Lcom/github/mikephil/charting/data/PieData;

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/PieChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v0

    sget-object v2, Lcom/github/mikephil/charting/components/Legend$LegendVerticalAlignment;->TOP:Lcom/github/mikephil/charting/components/Legend$LegendVerticalAlignment;

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/components/Legend;->setVerticalAlignment(Lcom/github/mikephil/charting/components/Legend$LegendVerticalAlignment;)V

    sget-object v2, Lcom/github/mikephil/charting/components/Legend$LegendHorizontalAlignment;->CENTER:Lcom/github/mikephil/charting/components/Legend$LegendHorizontalAlignment;

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/components/Legend;->setHorizontalAlignment(Lcom/github/mikephil/charting/components/Legend$LegendHorizontalAlignment;)V

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/components/Legend;->setTextSize(F)V

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/components/Legend;->setYEntrySpace(F)V

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/components/Legend;->setYOffset(F)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    const/16 v2, 0x384

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/PieChart;->animateY(I)V

    iget-object v0, v1, Lcom/fodlam/yds/b/e$a;->a:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->invalidate()V

    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/b/e$a;

    move-object v1, v0

    goto/16 :goto_0
.end method
