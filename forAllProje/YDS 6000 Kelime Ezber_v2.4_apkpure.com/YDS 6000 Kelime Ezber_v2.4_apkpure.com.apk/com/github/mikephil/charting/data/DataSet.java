package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

public abstract class DataSet<T extends Entry> extends BaseDataSet<T> {
    protected List<T> mValues = null;
    protected float mXMax = -3.4028235E38f;
    protected float mXMin = Float.MAX_VALUE;
    protected float mYMax = -3.4028235E38f;
    protected float mYMin = Float.MAX_VALUE;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.mValues = list;
        if (this.mValues == null) {
            this.mValues = new ArrayList();
        }
        calcMinMax();
    }

    public boolean addEntry(T t) {
        if (t == null) {
            return false;
        }
        List values = getValues();
        if (values == null) {
            values = new ArrayList();
        }
        calcMinMax(t);
        return values.add(t);
    }

    public void addEntryOrdered(T t) {
        if (t != null) {
            if (this.mValues == null) {
                this.mValues = new ArrayList();
            }
            calcMinMax(t);
            if (this.mValues.size() <= 0 || ((Entry) this.mValues.get(this.mValues.size() - 1)).getX() <= t.getX()) {
                this.mValues.add(t);
                return;
            }
            this.mValues.add(getEntryIndex(t.getX(), t.getY(), Rounding.UP), t);
        }
    }

    public void calcMinMax() {
        if (this.mValues != null && !this.mValues.isEmpty()) {
            this.mYMax = -3.4028235E38f;
            this.mYMin = Float.MAX_VALUE;
            this.mXMax = -3.4028235E38f;
            this.mXMin = Float.MAX_VALUE;
            for (Entry calcMinMax : this.mValues) {
                calcMinMax(calcMinMax);
            }
        }
    }

    protected void calcMinMax(T t) {
        if (t != null) {
            calcMinMaxX(t);
            calcMinMaxY(t);
        }
    }

    protected void calcMinMaxX(T t) {
        if (t.getX() < this.mXMin) {
            this.mXMin = t.getX();
        }
        if (t.getX() > this.mXMax) {
            this.mXMax = t.getX();
        }
    }

    public void calcMinMaxY(float f, float f2) {
        if (this.mValues != null && !this.mValues.isEmpty()) {
            this.mYMax = -3.4028235E38f;
            this.mYMin = Float.MAX_VALUE;
            int entryIndex = getEntryIndex(f, Float.NaN, Rounding.DOWN);
            int entryIndex2 = getEntryIndex(f2, Float.NaN, Rounding.UP);
            for (int i = entryIndex; i <= entryIndex2; i++) {
                calcMinMaxY((Entry) this.mValues.get(i));
            }
        }
    }

    protected void calcMinMaxY(T t) {
        if (t.getY() < this.mYMin) {
            this.mYMin = t.getY();
        }
        if (t.getY() > this.mYMax) {
            this.mYMax = t.getY();
        }
    }

    public void clear() {
        this.mValues.clear();
        notifyDataSetChanged();
    }

    public abstract DataSet<T> copy();

    public List<T> getEntriesForXValue(float f) {
        List<T> arrayList = new ArrayList();
        int i = 0;
        int size = this.mValues.size() - 1;
        while (i <= size) {
            int i2 = (size + i) / 2;
            Entry entry = (Entry) this.mValues.get(i2);
            if (f == entry.getX()) {
                size = i2;
                while (size > 0 && ((Entry) this.mValues.get(size - 1)).getX() == f) {
                    size--;
                }
                i = this.mValues.size();
                while (size < i) {
                    entry = (Entry) this.mValues.get(size);
                    if (entry.getX() != f) {
                        break;
                    }
                    arrayList.add(entry);
                    size++;
                }
                return arrayList;
            }
            int i3;
            if (f > entry.getX()) {
                int i4 = size;
                size = i2 + 1;
                i3 = i4;
            } else {
                i3 = i2 - 1;
                size = i;
            }
            i = size;
            size = i3;
        }
        return arrayList;
    }

    public int getEntryCount() {
        return this.mValues.size();
    }

    public T getEntryForIndex(int i) {
        return (Entry) this.mValues.get(i);
    }

    public T getEntryForXValue(float f, float f2) {
        return getEntryForXValue(f, f2, Rounding.CLOSEST);
    }

    public T getEntryForXValue(float f, float f2, Rounding rounding) {
        int entryIndex = getEntryIndex(f, f2, rounding);
        return entryIndex > -1 ? (Entry) this.mValues.get(entryIndex) : null;
    }

    public int getEntryIndex(float f, float f2, Rounding rounding) {
        if (this.mValues == null || this.mValues.isEmpty()) {
            return -1;
        }
        int i = 0;
        int size = this.mValues.size() - 1;
        int i2 = size;
        while (i < i2) {
            int i3;
            size = (i + i2) / 2;
            float x = ((Entry) this.mValues.get(size)).getX() - f;
            float x2 = ((Entry) this.mValues.get(size + 1)).getX() - f;
            float abs = Math.abs(x);
            x2 = Math.abs(x2);
            int i4;
            if (x2 < abs) {
                i4 = i2;
                i2 = size + 1;
                i3 = i4;
            } else if (abs < x2) {
                i3 = size;
                i2 = i;
            } else if (((double) x) >= 0.0d) {
                i3 = size;
                i2 = i;
            } else if (((double) x) < 0.0d) {
                i4 = i2;
                i2 = size + 1;
                i3 = i4;
            } else {
                i3 = i2;
                i2 = i;
            }
            size = i3;
            i = i2;
            i2 = i3;
        }
        if (size == -1) {
            return size;
        }
        float x3 = ((Entry) this.mValues.get(size)).getX();
        if (rounding == Rounding.UP) {
            if (x3 < f && size < this.mValues.size() - 1) {
                i3 = size + 1;
            }
            i3 = size;
        } else {
            if (rounding == Rounding.DOWN && x3 > f && size > 0) {
                i3 = size - 1;
            }
            i3 = size;
        }
        if (Float.isNaN(f2)) {
            return i3;
        }
        i2 = i3;
        while (i2 > 0 && ((Entry) this.mValues.get(i2 - 1)).getX() == x3) {
            i2--;
        }
        float y = ((Entry) this.mValues.get(i2)).getY();
        i3 = i2;
        while (true) {
            i = i3 + 1;
            if (i < this.mValues.size()) {
                Entry entry = (Entry) this.mValues.get(i);
                if (entry.getX() != x3) {
                    break;
                }
                float f3;
                if (Math.abs(entry.getY() - f2) < Math.abs(y - f2)) {
                    i3 = i;
                    f3 = f2;
                } else {
                    i3 = i2;
                    f3 = y;
                }
                y = f3;
                i2 = i3;
                i3 = i;
            } else {
                break;
            }
        }
        return i2;
    }

    public int getEntryIndex(Entry entry) {
        return this.mValues.indexOf(entry);
    }

    public List<T> getValues() {
        return this.mValues;
    }

    public float getXMax() {
        return this.mXMax;
    }

    public float getXMin() {
        return this.mXMin;
    }

    public float getYMax() {
        return this.mYMax;
    }

    public float getYMin() {
        return this.mYMin;
    }

    public boolean removeEntry(T t) {
        boolean z = false;
        if (!(t == null || this.mValues == null)) {
            z = this.mValues.remove(t);
            if (z) {
                calcMinMax();
            }
        }
        return z;
    }

    public void setValues(List<T> list) {
        this.mValues = list;
        notifyDataSetChanged();
    }

    public String toSimpleString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DataSet, label: " + (getLabel() == null ? "" : getLabel()) + ", entries: " + this.mValues.size() + "\n");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(toSimpleString());
        for (int i = 0; i < this.mValues.size(); i++) {
            stringBuffer.append(((Entry) this.mValues.get(i)).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
