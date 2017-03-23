package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public final class NotifyTransactionStatusRequest extends AbstractSafeParcelable {
    public static final Creator<NotifyTransactionStatusRequest> CREATOR = new zzn();
    final int mVersionCode;
    int status;
    String zzbAe;
    String zzbyT;

    public final class Builder {
        final /* synthetic */ NotifyTransactionStatusRequest zzbAf;

        private Builder(NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
            this.zzbAf = notifyTransactionStatusRequest;
        }

        public NotifyTransactionStatusRequest build() {
            boolean z = true;
            zzaa.zzb(!TextUtils.isEmpty(this.zzbAf.zzbyT), (Object) "googleTransactionId is required");
            if (this.zzbAf.status < 1 || this.zzbAf.status > 8) {
                z = false;
            }
            zzaa.zzb(z, (Object) "status is an unrecognized value");
            return this.zzbAf;
        }

        public Builder setDetailedReason(String str) {
            this.zzbAf.zzbAe = str;
            return this;
        }

        public Builder setGoogleTransactionId(String str) {
            this.zzbAf.zzbyT = str;
            return this;
        }

        public Builder setStatus(int i) {
            this.zzbAf.status = i;
            return this;
        }
    }

    public interface Status {
        public static final int SUCCESS = 1;

        public interface Error {
            public static final int AVS_DECLINE = 7;
            public static final int BAD_CARD = 4;
            public static final int BAD_CVC = 3;
            public static final int DECLINED = 5;
            public static final int FRAUD_DECLINE = 8;
            public static final int OTHER = 6;
            public static final int UNKNOWN = 2;
        }
    }

    NotifyTransactionStatusRequest() {
        this.mVersionCode = 1;
    }

    NotifyTransactionStatusRequest(int i, String str, int i2, String str2) {
        this.mVersionCode = i;
        this.zzbyT = str;
        this.status = i2;
        this.zzbAe = str2;
    }

    public static Builder newBuilder() {
        NotifyTransactionStatusRequest notifyTransactionStatusRequest = new NotifyTransactionStatusRequest();
        notifyTransactionStatusRequest.getClass();
        return new Builder();
    }

    public String getDetailedReason() {
        return this.zzbAe;
    }

    public String getGoogleTransactionId() {
        return this.zzbyT;
    }

    public int getStatus() {
        return this.status;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }
}
