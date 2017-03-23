package com.google.android.gms.games.video;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class VideoBuffer extends AbstractDataBuffer<Video> {
    public VideoBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object get(int i) {
        return zzhz(i);
    }

    public VideoRef zzhz(int i) {
        return new VideoRef(this.zzamz, i);
    }
}
