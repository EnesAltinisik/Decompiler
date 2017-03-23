package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    protected Paint mBarBorderPaint;
    protected BarBuffer[] mBarBuffers;
    protected RectF mBarRect = new RectF();
    private RectF mBarShadowRectBuffer = new RectF();
    protected BarDataProvider mChart;
    protected Paint mShadowPaint;

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = barDataProvider;
        this.mHighlightPaint = new Paint(1);
        this.mHighlightPaint.setStyle(Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        this.mShadowPaint = new Paint(1);
        this.mShadowPaint.setStyle(Style.FILL);
        this.mBarBorderPaint = new Paint(1);
        this.mBarBorderPaint.setStyle(Style.STROKE);
    }

    public void drawData(Canvas canvas) {
        BarData barData = this.mChart.getBarData();
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i);
            }
        }
    }

    protected void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        Object obj = iBarDataSet.getBarBorderWidth() > 0.0f ? 1 : null;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) iBarDataSet.getEntryCount()) * phaseX)), iBarDataSet.getEntryCount());
            for (int i2 = 0; i2 < min; i2++) {
                float x = ((BarEntry) iBarDataSet.getEntryForIndex(i2)).getX();
                this.mBarShadowRectBuffer.left = x - barWidth;
                this.mBarShadowRectBuffer.right = x + barWidth;
                transformer.rectValueToPixel(this.mBarShadowRectBuffer);
                if (this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        Object obj2 = iBarDataSet.getColors().size() == 1 ? 1 : null;
        if (obj2 != null) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        for (int i3 = 0; i3 < barBuffer.size(); i3 += 4) {
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i3 + 2])) {
                if (this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                    if (obj2 == null) {
                        this.mRenderPaint.setColor(iBarDataSet.getColor(i3 / 4));
                    }
                    canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], barBuffer.buffer[i3 + 2], barBuffer.buffer[i3 + 3], this.mRenderPaint);
                    if (obj != null) {
                        canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], barBuffer.buffer[i3 + 2], barBuffer.buffer[i3 + 3], this.mBarBorderPaint);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void drawExtras(Canvas canvas) {
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    float y;
                    float f;
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    Object obj = (highlight.getStackIndex() < 0 || !barEntry.isStacked()) ? null : 1;
                    if (obj == null) {
                        y = barEntry.getY();
                        f = 0.0f;
                    } else if (this.mChart.isHighlightFullBarEnabled()) {
                        y = barEntry.getPositiveSum();
                        f = -barEntry.getNegativeSum();
                    } else {
                        Range range = barEntry.getRanges()[highlight.getStackIndex()];
                        y = range.from;
                        f = range.to;
                    }
                    prepareBarHighlight(barEntry.getX(), y, f, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            for (int i = 0; i < this.mChart.getBarData().getDataSetCount(); i++) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i);
                if (shouldDrawValues(iBarDataSet)) {
                    float f;
                    float f2;
                    applyValueTextStyle(iBarDataSet);
                    boolean isInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float calcTextHeight = (float) Utils.calcTextHeight(this.mValuePaint, "8");
                    float f3 = isDrawValueAboveBarEnabled ? -convertDpToPixel : calcTextHeight + convertDpToPixel;
                    float f4 = isDrawValueAboveBarEnabled ? calcTextHeight + convertDpToPixel : -convertDpToPixel;
                    if (isInverted) {
                        f = (-f4) - calcTextHeight;
                        f2 = (-f3) - calcTextHeight;
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    BarBuffer barBuffer = this.mBarBuffers[i];
                    float phaseY = this.mAnimator.getPhaseY();
                    int i2;
                    float f5;
                    BarEntry barEntry;
                    if (!iBarDataSet.isStacked()) {
                        for (i2 = 0; ((float) i2) < ((float) barBuffer.buffer.length) * this.mAnimator.getPhaseX(); i2 += 4) {
                            f5 = (barBuffer.buffer[i2] + barBuffer.buffer[i2 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f5)) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i2 + 1]) && this.mViewPortHandler.isInBoundsLeft(f5)) {
                                barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i2 / 4);
                                calcTextHeight = barEntry.getY();
                                drawValue(canvas, iBarDataSet.getValueFormatter(), calcTextHeight, barEntry, i, f5, calcTextHeight >= 0.0f ? barBuffer.buffer[i2 + 1] + f2 : barBuffer.buffer[i2 + 3] + f, iBarDataSet.getValueTextColor(i2 / 4));
                            }
                        }
                    } else {
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        i2 = 0;
                        int i3 = 0;
                        while (((float) i2) < ((float) iBarDataSet.getEntryCount()) * this.mAnimator.getPhaseX()) {
                            barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i2);
                            float[] yVals = barEntry.getYVals();
                            f5 = (barBuffer.buffer[i3] + barBuffer.buffer[i3 + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i2);
                            if (yVals == null) {
                                if (!this.mViewPortHandler.isInBoundsRight(f5)) {
                                    break;
                                } else if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i3 + 1]) && this.mViewPortHandler.isInBoundsLeft(f5)) {
                                    drawValue(canvas, iBarDataSet.getValueFormatter(), barEntry.getY(), barEntry, i, f5, barBuffer.buffer[i3 + 1] + (barEntry.getY() >= 0.0f ? f2 : f), valueTextColor);
                                }
                            } else {
                                float f6;
                                float[] fArr = new float[(yVals.length * 2)];
                                calcTextHeight = 0.0f;
                                float f7 = -barEntry.getNegativeSum();
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < fArr.length) {
                                    f6 = yVals[i5];
                                    if (f6 >= 0.0f) {
                                        calcTextHeight += f6;
                                        f6 = calcTextHeight;
                                    } else {
                                        float f8 = f7;
                                        f7 -= f6;
                                        f6 = f8;
                                    }
                                    fArr[i4 + 1] = f6 * phaseY;
                                    i4 += 2;
                                    i5++;
                                }
                                transformer.pointValuesToPixel(fArr);
                                for (int i6 = 0; i6 < fArr.length; i6 += 2) {
                                    f6 = fArr[i6 + 1] + (yVals[i6 / 2] >= 0.0f ? f2 : f);
                                    if (!this.mViewPortHandler.isInBoundsRight(f5)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsY(f6) && this.mViewPortHandler.isInBoundsLeft(f5)) {
                                        drawValue(canvas, iBarDataSet.getValueFormatter(), yVals[i6 / 2], barEntry, i, f5, f6, valueTextColor);
                                    }
                                }
                            }
                            i2++;
                            i3 = yVals == null ? i3 + 4 : i3 + (yVals.length * 4);
                        }
                    }
                }
            }
        }
    }

    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new BarBuffer((iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1) * (iBarDataSet.getEntryCount() * 4), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    protected void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    protected void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }
}
