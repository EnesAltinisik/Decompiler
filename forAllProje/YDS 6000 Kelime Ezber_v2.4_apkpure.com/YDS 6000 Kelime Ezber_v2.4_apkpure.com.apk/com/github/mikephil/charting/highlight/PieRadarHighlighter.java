package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

public abstract class PieRadarHighlighter<T extends PieRadarChartBase> implements IHighlighter {
    protected T mChart;
    protected List<Highlight> mHighlightBuffer = new ArrayList();

    public PieRadarHighlighter(T t) {
        this.mChart = t;
    }

    protected abstract Highlight getClosestHighlight(int i, float f, float f2);

    public Highlight getHighlight(float f, float f2) {
        if (this.mChart.distanceToCenter(f, f2) > this.mChart.getRadius()) {
            return null;
        }
        float angleForPoint = this.mChart.getAngleForPoint(f, f2);
        if (this.mChart instanceof PieChart) {
            angleForPoint /= this.mChart.getAnimator().getPhaseY();
        }
        int indexForAngle = this.mChart.getIndexForAngle(angleForPoint);
        return (indexForAngle < 0 || indexForAngle >= this.mChart.getData().getMaxEntryCountSet().getEntryCount()) ? null : getClosestHighlight(indexForAngle, f, f2);
    }
}
