package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class Cart extends AbstractSafeParcelable {
    public static final Creator<Cart> CREATOR = new zzb();
    private final int mVersionCode;
    String zzbyM;
    String zzbyN;
    ArrayList<LineItem> zzbyO;

    public final class Builder {
        final /* synthetic */ Cart zzbyP;

        private Builder(Cart cart) {
            this.zzbyP = cart;
        }

        public Builder addLineItem(LineItem lineItem) {
            this.zzbyP.zzbyO.add(lineItem);
            return this;
        }

        public Cart build() {
            return this.zzbyP;
        }

        public Builder setCurrencyCode(String str) {
            this.zzbyP.zzbyN = str;
            return this;
        }

        public Builder setLineItems(List<LineItem> list) {
            this.zzbyP.zzbyO.clear();
            this.zzbyP.zzbyO.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String str) {
            this.zzbyP.zzbyM = str;
            return this;
        }
    }

    Cart() {
        this.mVersionCode = 1;
        this.zzbyO = new ArrayList();
    }

    Cart(int i, String str, String str2, ArrayList<LineItem> arrayList) {
        this.mVersionCode = i;
        this.zzbyM = str;
        this.zzbyN = str2;
        this.zzbyO = arrayList;
    }

    public static Builder newBuilder() {
        Cart cart = new Cart();
        cart.getClass();
        return new Builder();
    }

    public String getCurrencyCode() {
        return this.zzbyN;
    }

    public ArrayList<LineItem> getLineItems() {
        return this.zzbyO;
    }

    public String getTotalPrice() {
        return this.zzbyM;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
