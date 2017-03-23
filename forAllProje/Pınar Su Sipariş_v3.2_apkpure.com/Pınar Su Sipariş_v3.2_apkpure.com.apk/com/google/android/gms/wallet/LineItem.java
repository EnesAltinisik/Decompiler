package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LineItem extends AbstractSafeParcelable {
    public static final Creator<LineItem> CREATOR = new zzj();
    String description;
    private final int mVersionCode;
    String zzbyM;
    String zzbyN;
    String zzbzq;
    String zzbzr;
    int zzbzs;

    public final class Builder {
        final /* synthetic */ LineItem zzbzt;

        private Builder(LineItem lineItem) {
            this.zzbzt = lineItem;
        }

        public LineItem build() {
            return this.zzbzt;
        }

        public Builder setCurrencyCode(String str) {
            this.zzbzt.zzbyN = str;
            return this;
        }

        public Builder setDescription(String str) {
            this.zzbzt.description = str;
            return this;
        }

        public Builder setQuantity(String str) {
            this.zzbzt.zzbzq = str;
            return this;
        }

        public Builder setRole(int i) {
            this.zzbzt.zzbzs = i;
            return this;
        }

        public Builder setTotalPrice(String str) {
            this.zzbzt.zzbyM = str;
            return this;
        }

        public Builder setUnitPrice(String str) {
            this.zzbzt.zzbzr = str;
            return this;
        }
    }

    public interface Role {
        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;
    }

    LineItem() {
        this.mVersionCode = 1;
        this.zzbzs = 0;
    }

    LineItem(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.mVersionCode = i;
        this.description = str;
        this.zzbzq = str2;
        this.zzbzr = str3;
        this.zzbyM = str4;
        this.zzbzs = i2;
        this.zzbyN = str5;
    }

    public static Builder newBuilder() {
        LineItem lineItem = new LineItem();
        lineItem.getClass();
        return new Builder();
    }

    public String getCurrencyCode() {
        return this.zzbyN;
    }

    public String getDescription() {
        return this.description;
    }

    public String getQuantity() {
        return this.zzbzq;
    }

    public int getRole() {
        return this.zzbzs;
    }

    public String getTotalPrice() {
        return this.zzbyM;
    }

    public String getUnitPrice() {
        return this.zzbzr;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }
}
