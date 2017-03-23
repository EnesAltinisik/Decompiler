package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class QuestBuffer extends zzf<Quest> {
    public QuestBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object zzm(int i, int i2) {
        return zzt(i, i2);
    }

    protected String zzsW() {
        return "external_quest_id";
    }

    protected Quest zzt(int i, int i2) {
        return new QuestRef(this.zzamz, i, i2);
    }
}
