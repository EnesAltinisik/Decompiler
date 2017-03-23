package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import java.util.ArrayList;

public final class AppContentSectionBuffer extends zzf<AppContentSection> {
    public void release() {
        ArrayList arrayList = null;
        super.release();
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            DataHolder dataHolder = (DataHolder) arrayList.get(i);
            if (dataHolder != null) {
                dataHolder.close();
            }
        }
    }

    protected /* synthetic */ Object zzm(int i, int i2) {
        return zzo(i, i2);
    }

    protected AppContentSection zzo(int i, int i2) {
        return new AppContentSectionRef(null, i, i2);
    }

    protected String zzsW() {
        return "section_id";
    }

    protected String zzsY() {
        return "card_id";
    }
}
