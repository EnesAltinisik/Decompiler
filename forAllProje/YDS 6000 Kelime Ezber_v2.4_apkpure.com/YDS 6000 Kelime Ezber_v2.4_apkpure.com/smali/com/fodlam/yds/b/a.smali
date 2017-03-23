.class public Lcom/fodlam/yds/b/a;
.super Lcom/fodlam/yds/b/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fodlam/yds/b/a$a;
    }
.end annotation


# instance fields
.field a:Z


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/data/ChartData;Landroid/content/Context;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/mikephil/charting/data/ChartData",
            "<*>;",
            "Landroid/content/Context;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/fodlam/yds/b/c;-><init>(Lcom/github/mikephil/charting/data/ChartData;)V

    iput-boolean p3, p0, Lcom/fodlam/yds/b/a;->a:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(ILandroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .locals 9

    const/4 v8, 0x1

    const/high16 v7, 0x42c80000    # 100.0f

    const/4 v6, 0x0

    const/high16 v5, 0x41a00000    # 20.0f

    const/4 v4, 0x0

    if-nez p2, :cond_1

    new-instance v1, Lcom/fodlam/yds/b/a$a;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lcom/fodlam/yds/b/a$a;-><init>(Lcom/fodlam/yds/b/a$1;)V

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f04004d

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    const v0, 0x7f100187

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/BarChart;

    iput-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarChart;->getDescription()Lcom/github/mikephil/charting/components/Description;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/components/Description;->setEnabled(Z)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawGridBackground(Z)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawBarShadow(Z)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0, v5}, Lcom/github/mikephil/charting/charts/BarChart;->setExtraBottomOffset(F)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v0

    const/high16 v2, 0x41400000    # 12.0f

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/components/Legend;->setTextSize(F)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    sget-object v2, Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;->BOTTOM:Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/components/XAxis;->setPosition(Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;)V

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    invoke-virtual {v0, v8}, Lcom/github/mikephil/charting/components/XAxis;->setDrawAxisLine(Z)V

    iget-boolean v2, p0, Lcom/fodlam/yds/b/a;->a:Z

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/components/XAxis;->setDrawLabels(Z)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v4}, Lcom/github/mikephil/charting/components/YAxis;->setLabelCount(IZ)V

    invoke-virtual {v0, v5}, Lcom/github/mikephil/charting/components/YAxis;->setSpaceTop(F)V

    iget-boolean v2, p0, Lcom/fodlam/yds/b/a;->a:Z

    if-nez v2, :cond_0

    invoke-virtual {v0, v7}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaximum(F)V

    iget-object v2, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaximum(F)V

    :cond_0
    invoke-virtual {v0, v6}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v4}, Lcom/github/mikephil/charting/components/YAxis;->setLabelCount(IZ)V

    invoke-virtual {v0, v5}, Lcom/github/mikephil/charting/components/YAxis;->setSpaceTop(F)V

    invoke-virtual {v0, v6}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    iget-object v2, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    iget-object v0, p0, Lcom/fodlam/yds/b/a;->b:Lcom/github/mikephil/charting/data/ChartData;

    check-cast v0, Lcom/github/mikephil/charting/data/BarData;

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/BarChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {v0, v8}, Lcom/github/mikephil/charting/charts/BarChart;->setFitBars(Z)V

    iget-object v0, v1, Lcom/fodlam/yds/b/a$a;->a:Lcom/github/mikephil/charting/charts/BarChart;

    const/16 v1, 0x2bc

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/BarChart;->animateY(I)V

    return-object p2

    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/b/a$a;

    move-object v1, v0

    goto/16 :goto_0
.end method
