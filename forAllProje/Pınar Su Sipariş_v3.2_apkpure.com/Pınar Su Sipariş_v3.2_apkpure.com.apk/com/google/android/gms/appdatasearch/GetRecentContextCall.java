package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GetRecentContextCall {

    public static class Request extends AbstractSafeParcelable {
        public static final zzf CREATOR = new zzf();
        final int mVersionCode;
        public final Account zzZM;
        public final boolean zzZN;
        public final boolean zzZO;
        public final boolean zzZP;
        public final String zzZQ;

        public Request() {
            this(null, false, false, false, null);
        }

        Request(int i, Account account, boolean z, boolean z2, boolean z3, String str) {
            this.mVersionCode = i;
            this.zzZM = account;
            this.zzZN = z;
            this.zzZO = z2;
            this.zzZP = z3;
            this.zzZQ = str;
        }

        public Request(Account account, boolean z, boolean z2, boolean z3, String str) {
            this(1, account, z, z2, z3, str);
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzf com_google_android_gms_appdatasearch_zzf = CREATOR;
            zzf.zza(this, parcel, i);
        }
    }

    public static class Response extends AbstractSafeParcelable implements Result {
        public static final zzg CREATOR = new zzg();
        final int mVersionCode;
        public Status zzZR;
        public List<UsageInfo> zzZS;
        @Deprecated
        public String[] zzZT;

        public Response() {
            this.mVersionCode = 1;
        }

        Response(int i, Status status, List<UsageInfo> list, String[] strArr) {
            this.mVersionCode = i;
            this.zzZR = status;
            this.zzZS = list;
            this.zzZT = strArr;
        }

        public Status getStatus() {
            return this.zzZR;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzg com_google_android_gms_appdatasearch_zzg = CREATOR;
            zzg.zza(this, parcel, i);
        }
    }
}
