package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

public class zzaec {
    private final List<List<String>> zzbIH;
    private final List<String> zzbII;

    public zzaec(List<List<String>> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.zzbIH = list;
        this.zzbII = list2;
    }

    public List<List<String>> zzPR() {
        return Collections.unmodifiableList(this.zzbIH);
    }

    public List<String> zzPS() {
        return Collections.unmodifiableList(this.zzbII);
    }
}
