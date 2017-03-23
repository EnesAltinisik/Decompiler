package com.google.firebase.database;

import com.google.android.gms.internal.zzahu;

public class Transaction {

    public interface Handler {
        Result doTransaction(MutableData mutableData);

        void onComplete(DatabaseError databaseError, boolean z, DataSnapshot dataSnapshot);
    }

    public static class Result {
        private boolean zzbHG;
        private zzahu zzbHH;

        private Result(boolean z, zzahu com_google_android_gms_internal_zzahu) {
            this.zzbHG = z;
            this.zzbHH = com_google_android_gms_internal_zzahu;
        }

        public boolean isSuccess() {
            return this.zzbHG;
        }

        public zzahu zzPj() {
            return this.zzbHH;
        }
    }

    public static Result abort() {
        return new Result(false, null);
    }

    public static Result success(MutableData mutableData) {
        return new Result(true, mutableData.zzPj());
    }
}
