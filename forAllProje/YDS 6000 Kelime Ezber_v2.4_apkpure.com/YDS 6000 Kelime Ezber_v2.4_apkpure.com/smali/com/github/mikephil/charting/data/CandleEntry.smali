.class public Lcom/github/mikephil/charting/data/CandleEntry;
.super Lcom/github/mikephil/charting/data/Entry;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field private mClose:F

.field private mOpen:F

.field private mShadowHigh:F

.field private mShadowLow:F


# direct methods
.method public constructor <init>(FFFFF)V
    .locals 3

    const/4 v2, 0x0

    add-float v0, p2, p3

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-direct {p0, p1, v0}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    iput v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowHigh:F

    iput v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowLow:F

    iput v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mClose:F

    iput v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mOpen:F

    iput p2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowHigh:F

    iput p3, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowLow:F

    iput p4, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mOpen:F

    iput p5, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mClose:F

    return-void
.end method

.method public constructor <init>(FFFFFLjava/lang/Object;)V
    .locals 3

    const/4 v2, 0x0

    add-float v0, p2, p3

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-direct {p0, p1, v0, p6}, Lcom/github/mikephil/charting/data/Entry;-><init>(FFLjava/lang/Object;)V

    iput v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowHigh:F

    iput v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowLow:F

    iput v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mClose:F

    iput v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mOpen:F

    iput p2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowHigh:F

    iput p3, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowLow:F

    iput p4, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mOpen:F

    iput p5, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mClose:F

    return-void
.end method


# virtual methods
.method public copy()Lcom/github/mikephil/charting/data/CandleEntry;
    .locals 7

    new-instance v0, Lcom/github/mikephil/charting/data/CandleEntry;

    invoke-virtual {p0}, Lcom/github/mikephil/charting/data/CandleEntry;->getX()F

    move-result v1

    iget v2, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowHigh:F

    iget v3, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowLow:F

    iget v4, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mOpen:F

    iget v5, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mClose:F

    invoke-virtual {p0}, Lcom/github/mikephil/charting/data/CandleEntry;->getData()Ljava/lang/Object;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/github/mikephil/charting/data/CandleEntry;-><init>(FFFFFLjava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic copy()Lcom/github/mikephil/charting/data/Entry;
    .locals 1

    invoke-virtual {p0}, Lcom/github/mikephil/charting/data/CandleEntry;->copy()Lcom/github/mikephil/charting/data/CandleEntry;

    move-result-object v0

    return-object v0
.end method

.method public getBodyRange()F
    .locals 2

    iget v0, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mOpen:F

    iget v1, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mClose:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method public getClose()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mClose:F

    return v0
.end method

.method public getHigh()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowHigh:F

    return v0
.end method

.method public getLow()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowLow:F

    return v0
.end method

.method public getOpen()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mOpen:F

    return v0
.end method

.method public getShadowRange()F
    .locals 2

    iget v0, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowHigh:F

    iget v1, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowLow:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method public getY()F
    .locals 1

    invoke-super {p0}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    return v0
.end method

.method public setClose(F)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mClose:F

    return-void
.end method

.method public setHigh(F)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowHigh:F

    return-void
.end method

.method public setLow(F)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mShadowLow:F

    return-void
.end method

.method public setOpen(F)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/data/CandleEntry;->mOpen:F

    return-void
.end method
