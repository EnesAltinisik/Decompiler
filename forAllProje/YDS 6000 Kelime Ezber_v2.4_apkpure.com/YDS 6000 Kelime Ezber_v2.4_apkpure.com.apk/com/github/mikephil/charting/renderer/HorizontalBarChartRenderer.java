package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer = new RectF();

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mValuePaint.setTextAlign(Align.LEFT);
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
                this.mBarShadowRectBuffer.top = x - barWidth;
                this.mBarShadowRectBuffer.bottom = x + barWidth;
                transformer.rectValueToPixel(this.mBarShadowRectBuffer);
                if (this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
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
        int i3 = 0;
        while (i3 < barBuffer.size() && this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i3 + 3])) {
            if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i3 + 1])) {
                if (obj2 == null) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i3 / 4));
                }
                canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], barBuffer.buffer[i3 + 2], barBuffer.buffer[i3 + 3], this.mRenderPaint);
                if (obj != null) {
                    canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], barBuffer.buffer[i3 + 2], barBuffer.buffer[i3 + 3], this.mBarBorderPaint);
                }
            }
            i3 += 4;
        }
    }

    protected void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = Utils.convertDpToPixel(5.0f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            for (int i = 0; i < this.mChart.getBarData().getDataSetCount(); i++) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i);
                if (shouldDrawValues(iBarDataSet)) {
                    boolean isInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    applyValueTextStyle(iBarDataSet);
                    float calcTextHeight = ((float) Utils.calcTextHeight(this.mValuePaint, "10")) / 2.0f;
                    IValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    BarBuffer barBuffer = this.mBarBuffers[i];
                    float phaseY = this.mAnimator.getPhaseY();
                    float f;
                    float y;
                    String formattedValue;
                    float f2;
                    float f3;
                    if (!iBarDataSet.isStacked()) {
                        int i2 = 0;
                        while (((float) i2) < ((float) barBuffer.buffer.length) * this.mAnimator.getPhaseX()) {
                            f = (barBuffer.buffer[i2 + 1] + barBuffer.buffer[i2 + 3]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i2 + 1])) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[i2]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i2 + 1])) {
                                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i2 / 4);
                                y = barEntry.getY();
                                formattedValue = valueFormatter.getFormattedValue(y, barEntry, i, this.mViewPortHandler);
                                float calcTextWidth = (float) Utils.calcTextWidth(this.mValuePaint, formattedValue);
                                f2 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth + convertDpToPixel);
                                f3 = isDrawValueAboveBarEnabled ? -(calcTextWidth + convertDpToPixel) : convertDpToPixel;
                                if (isInverted) {
                                    f2 = (-f2) - calcTextWidth;
                                    f3 = (-f3) - calcTextWidth;
                                }
                                calcTextWidth = barBuffer.buffer[i2 + 2];
                                if (y < 0.0f) {
                                    f2 = f3;
                                }
                                drawValue(canvas, formattedValue, calcTextWidth + f2, f + calcTextHeight, iBarDataSet.getValueTextColor(i2 / 2));
                            }
                            i2 += 4;
                        }
                    } else {
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i3 = 0;
                        int i4 = 0;
                        while (((float) i3) < ((float) iBarDataSet.getEntryCount()) * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i3);
                            int valueTextColor = iBarDataSet.getValueTextColor(i3);
                            float[] yVals = barEntry2.getYVals();
                            if (yVals == null) {
                                if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i4 + 1])) {
                                    break;
                                } else if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[i4]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i4 + 1])) {
                                    formattedValue = valueFormatter.getFormattedValue(barEntry2.getY(), barEntry2, i, this.mViewPortHandler);
                                    y = (float) Utils.calcTextWidth(this.mValuePaint, formattedValue);
                                    f2 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(y + convertDpToPixel);
                                    f3 = isDrawValueAboveBarEnabled ? -(y + convertDpToPixel) : convertDpToPixel;
                                    if (isInverted) {
                                        f2 = (-f2) - y;
                                        f3 = (-f3) - y;
                                    }
                                    y = barBuffer.buffer[i4 + 2];
                                    if (barEntry2.getY() < 0.0f) {
                                        f2 = f3;
                                    }
                                    drawValue(canvas, formattedValue, y + f2, barBuffer.buffer[i4 + 1] + calcTextHeight, valueTextColor);
                                }
                            } else {
                                float[] fArr = new float[(yVals.length * 2)];
                                y = 0.0f;
                                float f4 = -barEntry2.getNegativeSum();
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < fArr.length) {
                                    f = yVals[i6];
                                    if (f >= 0.0f) {
                                        y += f;
                                        f = y;
                                    } else {
                                        float f5 = f4;
                                        f4 -= f;
                                        f = f5;
                                    }
                                    fArr[i5] = f * phaseY;
                                    i5 += 2;
                                    i6++;
                                }
                                transformer.pointValuesToPixel(fArr);
                                for (int i7 = 0; i7 < fArr.length; i7 += 2) {
                                    y = yVals[i7 / 2];
                                    formattedValue = valueFormatter.getFormattedValue(y, barEntry2, i, this.mViewPortHandler);
                                    f = (float) Utils.calcTextWidth(this.mValuePaint, formattedValue);
                                    f2 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(f + convertDpToPixel);
                                    f3 = isDrawValueAboveBarEnabled ? -(f + convertDpToPixel) : convertDpToPixel;
                                    if (isInverted) {
                                        f2 = (-f2) - f;
                                        f3 = (-f3) - f;
                                    }
                                    f = fArr[i7];
                                    if (y < 0.0f) {
                                        f2 = f3;
                                    }
                                    y = f + f2;
                                    f3 = (barBuffer.buffer[i4 + 1] + barBuffer.buffer[i4 + 3]) / 2.0f;
                                    if (!this.mViewPortHandler.isInBoundsTop(f3)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsX(y) && this.mViewPortHandler.isInBoundsBottom(f3)) {
                                        drawValue(canvas, formattedValue, y, f3 + calcTextHeight, valueTextColor);
                                    }
                                }
                            }
                            i3++;
                            i4 = yVals == null ? i4 + 4 : i4 + (yVals.length * 4);
                        }
                    }
                }
            }
        }
    }

    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new HorizontalBarBuffer((iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1) * (iBarDataSet.getEntryCount() * 4), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    protected boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < ((float) chartInterface.getMaxVisibleCount()) * this.mViewPortHandler.getScaleY();
    }

    protected void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f2, f - f4, f3, f + f4);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    protected void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }
}
