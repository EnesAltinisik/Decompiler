.class public Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;
.super Lcom/github/mikephil/charting/listener/ChartTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/mikephil/charting/listener/ChartTouchListener",
        "<",
        "Lcom/github/mikephil/charting/charts/PieRadarChartBase",
        "<*>;>;"
    }
.end annotation


# instance fields
.field private _velocitySamples:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;",
            ">;"
        }
    .end annotation
.end field

.field private mDecelerationAngularVelocity:F

.field private mDecelerationLastTime:J

.field private mStartAngle:F

.field private mTouchStartPoint:Lcom/github/mikephil/charting/utils/MPPointF;


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/PieRadarChartBase;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/mikephil/charting/charts/PieRadarChartBase",
            "<*>;)V"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/listener/ChartTouchListener;-><init>(Lcom/github/mikephil/charting/charts/Chart;)V

    invoke-static {v2, v2}, Lcom/github/mikephil/charting/utils/MPPointF;->getInstance(FF)Lcom/github/mikephil/charting/utils/MPPointF;

    move-result-object v0

    iput-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchStartPoint:Lcom/github/mikephil/charting/utils/MPPointF;

    iput v2, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mStartAngle:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationLastTime:J

    iput v2, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    return-void
.end method

.method private calculateVelocity()F
    .locals 10

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;

    iget-object v1, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;

    iget-object v2, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move v3, v2

    move-object v2, v0

    :goto_1
    if-ltz v3, :cond_2

    iget-object v2, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;

    iget v4, v2, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    iget v5, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_5

    :cond_2
    iget-wide v4, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->time:J

    iget-wide v6, v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->time:J

    sub-long/2addr v4, v6

    long-to-float v3, v4

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    const/4 v4, 0x0

    cmpl-float v4, v3, v4

    if-nez v4, :cond_3

    const v3, 0x3dcccccd    # 0.1f

    :cond_3
    iget v4, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    iget v5, v2, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    cmpl-float v4, v4, v5

    if-ltz v4, :cond_6

    const/4 v4, 0x1

    :goto_2
    iget v5, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    iget v2, v2, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    sub-float v2, v5, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v6, v2

    const-wide v8, 0x4070e00000000000L    # 270.0

    cmpl-double v2, v6, v8

    if-lez v2, :cond_9

    if-nez v4, :cond_7

    const/4 v2, 0x1

    :goto_3
    iget v4, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    iget v5, v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    sub-float/2addr v4, v5

    float-to-double v4, v4

    const-wide v6, 0x4066800000000000L    # 180.0

    cmpl-double v4, v4, v6

    if-lez v4, :cond_8

    iget v4, v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    float-to-double v4, v4

    const-wide v6, 0x4076800000000000L    # 360.0

    add-double/2addr v4, v6

    double-to-float v4, v4

    iput v4, v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    :cond_4
    :goto_4
    iget v1, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    iget v0, v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    sub-float v0, v1, v0

    div-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    if-nez v2, :cond_0

    neg-float v0, v0

    goto/16 :goto_0

    :cond_5
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_6
    const/4 v4, 0x0

    goto :goto_2

    :cond_7
    const/4 v2, 0x0

    goto :goto_3

    :cond_8
    iget v4, v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    iget v5, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    sub-float/2addr v4, v5

    float-to-double v4, v4

    const-wide v6, 0x4066800000000000L    # 180.0

    cmpl-double v4, v4, v6

    if-lez v4, :cond_4

    iget v4, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    float-to-double v4, v4

    const-wide v6, 0x4076800000000000L    # 360.0

    add-double/2addr v4, v6

    double-to-float v4, v4

    iput v4, v1, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->angle:F

    goto :goto_4

    :cond_9
    move v2, v4

    goto :goto_3
.end method

.method private resetVelocity()V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private sampleVelocity(FF)V
    .locals 9

    const/4 v8, 0x0

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    new-instance v4, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getAngleForPoint(FF)F

    move-result v0

    invoke-direct {v4, p0, v2, v3, v0}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;-><init>(Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;JF)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v0

    :goto_0
    add-int/lit8 v0, v1, -0x2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;

    iget-wide v4, v0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener$AngularVelocitySample;->time:J

    sub-long v4, v2, v4

    const-wide/16 v6, 0x3e8

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->_velocitySamples:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public computeScroll()V
    .locals 6

    iget v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iget v1, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getDragDecelerationFrictionCoef()F

    move-result v0

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    iget-wide v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationLastTime:J

    sub-long v0, v2, v0

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v4, v0, v1

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    iget-object v1, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v1, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getRotationAngle()F

    move-result v1

    iget v5, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    mul-float/2addr v4, v5

    add-float/2addr v1, v4

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->setRotationAngle(F)V

    iput-wide v2, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationLastTime:J

    iget v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    invoke-static {v0}, Lcom/github/mikephil/charting/utils/Utils;->postInvalidateOnAnimation(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->stopDeceleration()V

    goto :goto_0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    sget-object v0, Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;->LONG_PRESS:Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;

    iput-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mLastGesture:Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getOnChartGestureListener()Lcom/github/mikephil/charting/listener/OnChartGestureListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/github/mikephil/charting/listener/OnChartGestureListener;->onChartLongPressed(Landroid/view/MotionEvent;)V

    :cond_0
    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 3

    sget-object v0, Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;->SINGLE_TAP:Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;

    iput-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mLastGesture:Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getOnChartGestureListener()Lcom/github/mikephil/charting/listener/OnChartGestureListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/github/mikephil/charting/listener/OnChartGestureListener;->onChartSingleTapped(Landroid/view/MotionEvent;)V

    :cond_0
    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->isHighlightPerTapEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getHighlightByTouchPoint(FF)Lcom/github/mikephil/charting/highlight/Highlight;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->performHighlight(Lcom/github/mikephil/charting/highlight/Highlight;Landroid/view/MotionEvent;)V

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const/4 v5, 0x6

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mGestureDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return v4

    :cond_1
    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->isRotationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0, p2}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->startAction(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->stopDeceleration()V

    invoke-direct {p0}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->resetVelocity()V

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->isDragDecelerationEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v1, v2}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->sampleVelocity(FF)V

    :cond_2
    invoke-virtual {p0, v1, v2}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->setGestureStartAngle(FF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchStartPoint:Lcom/github/mikephil/charting/utils/MPPointF;

    iput v1, v0, Lcom/github/mikephil/charting/utils/MPPointF;->x:F

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchStartPoint:Lcom/github/mikephil/charting/utils/MPPointF;

    iput v2, v0, Lcom/github/mikephil/charting/utils/MPPointF;->y:F

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->isDragDecelerationEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, v1, v2}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->sampleVelocity(FF)V

    :cond_3
    iget v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchMode:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchStartPoint:Lcom/github/mikephil/charting/utils/MPPointF;

    iget v0, v0, Lcom/github/mikephil/charting/utils/MPPointF;->x:F

    iget-object v3, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchStartPoint:Lcom/github/mikephil/charting/utils/MPPointF;

    iget v3, v3, Lcom/github/mikephil/charting/utils/MPPointF;->y:F

    invoke-static {v1, v0, v2, v3}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->distance(FFFF)F

    move-result v0

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v3}, Lcom/github/mikephil/charting/utils/Utils;->convertDpToPixel(F)F

    move-result v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_5

    sget-object v0, Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;->ROTATE:Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;

    iput-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mLastGesture:Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;

    iput v5, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchMode:I

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->disableScroll()V

    :cond_4
    :goto_1
    invoke-virtual {p0, p2}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->endAction(Landroid/view/MotionEvent;)V

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchMode:I

    if-ne v0, v5, :cond_4

    invoke-virtual {p0, v1, v2}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->updateGestureRotation(FF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->invalidate()V

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->isDragDecelerationEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->stopDeceleration()V

    invoke-direct {p0, v1, v2}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->sampleVelocity(FF)V

    invoke-direct {p0}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->calculateVelocity()F

    move-result v0

    iput v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    iget v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationLastTime:J

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    invoke-static {v0}, Lcom/github/mikephil/charting/utils/Utils;->postInvalidateOnAnimation(Landroid/view/View;)V

    :cond_6
    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->enableScroll()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mTouchMode:I

    invoke-virtual {p0, p2}, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->endAction(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setGestureStartAngle(FF)V
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getAngleForPoint(FF)F

    move-result v1

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getRawRotationAngle()F

    move-result v0

    sub-float v0, v1, v0

    iput v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mStartAngle:F

    return-void
.end method

.method public stopDeceleration()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mDecelerationAngularVelocity:F

    return-void
.end method

.method public updateGestureRotation(FF)V
    .locals 3

    iget-object v0, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    iget-object v1, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mChart:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v1, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v1, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->getAngleForPoint(FF)F

    move-result v1

    iget v2, p0, Lcom/github/mikephil/charting/listener/PieRadarChartTouchListener;->mStartAngle:F

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->setRotationAngle(F)V

    return-void
.end method
