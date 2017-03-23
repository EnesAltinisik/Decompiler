package com.google.android.gms.games.request;

import com.google.android.gms.common.data.AbstractDataBuffer;

public final class GameRequestSummaryBuffer extends AbstractDataBuffer<GameRequestSummary> {
    public /* synthetic */ Object get(int i) {
        return zzhq(i);
    }

    public GameRequestSummary zzhq(int i) {
        return new GameRequestSummaryRef(this.zzamz, i);
    }
}
