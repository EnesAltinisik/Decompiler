package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes {
    private static final String[] zzaQa = new String[]{"requestId", "outcome"};
    private final HashMap<String, Integer> zzaQb;
    private final int zzahG;

    public static final class Builder {
        private HashMap<String, Integer> zzaQb = new HashMap();
        private int zzahG = 0;

        public RequestUpdateOutcomes zzBl() {
            return new RequestUpdateOutcomes(this.zzahG, this.zzaQb);
        }

        public Builder zzhg(int i) {
            this.zzahG = i;
            return this;
        }

        public Builder zzv(String str, int i) {
            if (RequestUpdateResultOutcome.isValid(i)) {
                this.zzaQb.put(str, Integer.valueOf(i));
            }
            return this;
        }
    }

    private RequestUpdateOutcomes(int i, HashMap<String, Integer> hashMap) {
        this.zzahG = i;
        this.zzaQb = hashMap;
    }

    public static RequestUpdateOutcomes zzal(DataHolder dataHolder) {
        Builder builder = new Builder();
        builder.zzhg(dataHolder.getStatusCode());
        int count = dataHolder.getCount();
        for (int i = 0; i < count; i++) {
            int zzbP = dataHolder.zzbP(i);
            builder.zzv(dataHolder.zzd("requestId", i, zzbP), dataHolder.zzc("outcome", i, zzbP));
        }
        return builder.zzBl();
    }

    public Set<String> getRequestIds() {
        return this.zzaQb.keySet();
    }

    public int getRequestOutcome(String str) {
        zzaa.zzb(this.zzaQb.containsKey(str), new StringBuilder(String.valueOf(str).length() + 46).append("Request ").append(str).append(" was not part of the update operation!").toString());
        return ((Integer) this.zzaQb.get(str)).intValue();
    }
}
