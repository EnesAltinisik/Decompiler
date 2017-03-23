package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

public class EntryXComparator implements Comparator<Entry> {
    public int compare(Entry entry, Entry entry2) {
        float x = entry.getX() - entry2.getX();
        return x == 0.0f ? 0 : x > 0.0f ? 1 : -1;
    }
}
