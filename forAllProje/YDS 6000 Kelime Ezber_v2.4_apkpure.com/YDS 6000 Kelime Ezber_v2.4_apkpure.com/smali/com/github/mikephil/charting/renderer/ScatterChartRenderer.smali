.class public Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;
.super Lcom/github/mikephil/charting/renderer/LineScatterCandleRadarRenderer;


# instance fields
.field protected mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

.field mPixelBuffer:[F


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V
    .locals 1

    invoke-direct {p0, p2, p3}, Lcom/github/mikephil/charting/renderer/LineScatterCandleRadarRenderer;-><init>(Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    iput-object p1, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    return-void
.end method


# virtual methods
.method public drawData(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-interface {v0}, Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;->getScatterData()Lcom/github/mikephil/charting/data/ScatterData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/ScatterData;->getDataSets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;

    invoke-interface {v0}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1, v0}, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->drawDataSet(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected drawDataSet(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;)V
    .locals 12

    iget-object v8, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-interface {p2}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getAxisDependency()Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;->getTransformer(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)Lcom/github/mikephil/charting/utils/Transformer;

    move-result-object v9

    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/animation/ChartAnimator;->getPhaseY()F

    move-result v10

    invoke-interface {p2}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getShapeRenderer()Lcom/github/mikephil/charting/renderer/scatter/IShapeRenderer;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "MISSING"

    const-string v1, "There\'s no IShapeRenderer specified for ScatterDataSet"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    invoke-interface {p2}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getEntryCount()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/animation/ChartAnimator;->getPhaseX()F

    move-result v2

    mul-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    invoke-interface {p2}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getEntryCount()I

    move-result v1

    int-to-float v1, v1

    float-to-double v4, v1

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    double-to-int v11, v2

    const/4 v1, 0x0

    move v7, v1

    :goto_0
    if-ge v7, v11, :cond_0

    invoke-interface {p2, v7}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    iget-object v2, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    const/4 v3, 0x0

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v4

    aput v4, v2, v3

    iget-object v2, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    const/4 v3, 0x1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v10

    aput v1, v2, v3

    iget-object v1, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    invoke-virtual {v9, v1}, Lcom/github/mikephil/charting/utils/Transformer;->pointValuesToPixel([F)V

    iget-object v1, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v8, v1}, Lcom/github/mikephil/charting/utils/ViewPortHandler;->isInBoundsRight(F)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v8, v1}, Lcom/github/mikephil/charting/utils/ViewPortHandler;->isInBoundsLeft(F)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v8, v1}, Lcom/github/mikephil/charting/utils/ViewPortHandler;->isInBoundsY(F)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    :goto_1
    add-int/lit8 v1, v7, 0x1

    move v7, v1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mRenderPaint:Landroid/graphics/Paint;

    div-int/lit8 v2, v7, 0x2

    invoke-interface {p2, v2}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v3, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    iget-object v1, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    const/4 v2, 0x0

    aget v4, v1, v2

    iget-object v1, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mPixelBuffer:[F

    const/4 v2, 0x1

    aget v5, v1, v2

    iget-object v6, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mRenderPaint:Landroid/graphics/Paint;

    move-object v1, p1

    move-object v2, p2

    invoke-interface/range {v0 .. v6}, Lcom/github/mikephil/charting/renderer/scatter/IShapeRenderer;->renderShape(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;Lcom/github/mikephil/charting/utils/ViewPortHandler;FFLandroid/graphics/Paint;)V

    goto :goto_1
.end method

.method public drawExtras(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public drawHighlighted(Landroid/graphics/Canvas;[Lcom/github/mikephil/charting/highlight/Highlight;)V
    .locals 10

    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-interface {v0}, Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;->getScatterData()Lcom/github/mikephil/charting/data/ScatterData;

    move-result-object v2

    array-length v3, p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_2

    aget-object v4, p2, v1

    invoke-virtual {v4}, Lcom/github/mikephil/charting/highlight/Highlight;->getDataSetIndex()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/data/ScatterData;->getDataSetByIndex(I)Lcom/github/mikephil/charting/interfaces/datasets/IDataSet;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->isHighlightEnabled()Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Lcom/github/mikephil/charting/highlight/Highlight;->getX()F

    move-result v5

    invoke-virtual {v4}, Lcom/github/mikephil/charting/highlight/Highlight;->getY()F

    move-result v6

    invoke-interface {v0, v5, v6}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getEntryForXValue(FF)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v5

    invoke-virtual {p0, v5, v0}, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->isInBoundsX(Lcom/github/mikephil/charting/data/Entry;Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-interface {v0}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getAxisDependency()Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    move-result-object v7

    invoke-interface {v6, v7}, Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;->getTransformer(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)Lcom/github/mikephil/charting/utils/Transformer;

    move-result-object v6

    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v7

    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v5

    iget-object v8, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    invoke-virtual {v8}, Lcom/github/mikephil/charting/animation/ChartAnimator;->getPhaseY()F

    move-result v8

    mul-float/2addr v5, v8

    invoke-virtual {v6, v7, v5}, Lcom/github/mikephil/charting/utils/Transformer;->getPixelForValues(FF)Lcom/github/mikephil/charting/utils/MPPointD;

    move-result-object v5

    iget-wide v6, v5, Lcom/github/mikephil/charting/utils/MPPointD;->x:D

    double-to-float v6, v6

    iget-wide v8, v5, Lcom/github/mikephil/charting/utils/MPPointD;->y:D

    double-to-float v7, v8

    invoke-virtual {v4, v6, v7}, Lcom/github/mikephil/charting/highlight/Highlight;->setDraw(FF)V

    iget-wide v6, v5, Lcom/github/mikephil/charting/utils/MPPointD;->x:D

    double-to-float v4, v6

    iget-wide v6, v5, Lcom/github/mikephil/charting/utils/MPPointD;->y:D

    double-to-float v5, v6

    invoke-virtual {p0, p1, v4, v5, v0}, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->drawHighlightLines(Landroid/graphics/Canvas;FFLcom/github/mikephil/charting/interfaces/datasets/ILineScatterCandleRadarDataSet;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public drawValues(Landroid/graphics/Canvas;)V
    .locals 14

    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->isDrawingValuesAllowed(Lcom/github/mikephil/charting/interfaces/dataprovider/ChartInterface;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-interface {v0}, Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;->getScatterData()Lcom/github/mikephil/charting/data/ScatterData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/ScatterData;->getDataSets()Ljava/util/List;

    move-result-object v11

    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-interface {v0}, Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;->getScatterData()Lcom/github/mikephil/charting/data/ScatterData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/ScatterData;->getDataSetCount()I

    move-result v0

    if-ge v7, v0, :cond_4

    invoke-interface {v11, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;

    invoke-virtual {p0, v1}, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->shouldDrawValues(Lcom/github/mikephil/charting/interfaces/datasets/IDataSet;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->applyValueTextStyle(Lcom/github/mikephil/charting/interfaces/datasets/IDataSet;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget-object v2, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-virtual {v0, v2, v1}, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->set(Lcom/github/mikephil/charting/interfaces/dataprovider/BarLineScatterCandleBubbleDataProvider;Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mChart:Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;

    invoke-interface {v1}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getAxisDependency()Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/github/mikephil/charting/interfaces/dataprovider/ScatterDataProvider;->getTransformer(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)Lcom/github/mikephil/charting/utils/Transformer;

    move-result-object v0

    iget-object v2, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/animation/ChartAnimator;->getPhaseX()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mAnimator:Lcom/github/mikephil/charting/animation/ChartAnimator;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/animation/ChartAnimator;->getPhaseY()F

    move-result v3

    iget-object v4, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget v4, v4, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->min:I

    iget-object v5, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget v5, v5, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->max:I

    invoke-virtual/range {v0 .. v5}, Lcom/github/mikephil/charting/utils/Transformer;->generateTransformedValuesScatter(Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;FFII)[F

    move-result-object v12

    invoke-interface {v1}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getScatterShapeSize()F

    move-result v0

    invoke-static {v0}, Lcom/github/mikephil/charting/utils/Utils;->convertDpToPixel(F)F

    move-result v13

    const/4 v0, 0x0

    :goto_1
    array-length v2, v12

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    aget v3, v12, v0

    invoke-virtual {v2, v3}, Lcom/github/mikephil/charting/utils/ViewPortHandler;->isInBoundsRight(F)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    aget v3, v12, v0

    invoke-virtual {v2, v3}, Lcom/github/mikephil/charting/utils/ViewPortHandler;->isInBoundsLeft(F)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mViewPortHandler:Lcom/github/mikephil/charting/utils/ViewPortHandler;

    add-int/lit8 v3, v0, 0x1

    aget v3, v12, v3

    invoke-virtual {v2, v3}, Lcom/github/mikephil/charting/utils/ViewPortHandler;->isInBoundsY(F)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_3
    div-int/lit8 v2, v0, 0x2

    iget-object v3, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget v3, v3, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->min:I

    add-int/2addr v2, v3

    invoke-interface {v1, v2}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v6

    invoke-interface {v1}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getValueFormatter()Lcom/github/mikephil/charting/formatter/IValueFormatter;

    move-result-object v4

    invoke-virtual {v6}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v5

    aget v8, v12, v0

    add-int/lit8 v2, v0, 0x1

    aget v2, v12, v2

    sub-float v9, v2, v13

    div-int/lit8 v2, v0, 0x2

    iget-object v3, p0, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->mXBounds:Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;

    iget v3, v3, Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;->min:I

    add-int/2addr v2, v3

    invoke-interface {v1, v2}, Lcom/github/mikephil/charting/interfaces/datasets/IScatterDataSet;->getValueTextColor(I)I

    move-result v10

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v10}, Lcom/github/mikephil/charting/renderer/ScatterChartRenderer;->drawValue(Landroid/graphics/Canvas;Lcom/github/mikephil/charting/formatter/IValueFormatter;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    goto :goto_2

    :cond_4
    return-void
.end method

.method public initBuffers()V
    .locals 0

    return-void
.end method
