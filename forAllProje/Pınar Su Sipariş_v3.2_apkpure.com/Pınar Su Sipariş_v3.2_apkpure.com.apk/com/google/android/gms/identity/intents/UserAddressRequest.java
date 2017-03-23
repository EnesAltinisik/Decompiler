package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest extends AbstractSafeParcelable {
    public static final Creator<UserAddressRequest> CREATOR = new zza();
    private final int mVersionCode;
    List<CountrySpecification> zzaTK;

    public final class Builder {
        final /* synthetic */ UserAddressRequest zzaTL;

        private Builder(UserAddressRequest userAddressRequest) {
            this.zzaTL = userAddressRequest;
        }

        public Builder addAllowedCountrySpecification(CountrySpecification countrySpecification) {
            if (this.zzaTL.zzaTK == null) {
                this.zzaTL.zzaTK = new ArrayList();
            }
            this.zzaTL.zzaTK.add(countrySpecification);
            return this;
        }

        public Builder addAllowedCountrySpecifications(Collection<CountrySpecification> collection) {
            if (this.zzaTL.zzaTK == null) {
                this.zzaTL.zzaTK = new ArrayList();
            }
            this.zzaTL.zzaTK.addAll(collection);
            return this;
        }

        public UserAddressRequest build() {
            if (this.zzaTL.zzaTK != null) {
                this.zzaTL.zzaTK = Collections.unmodifiableList(this.zzaTL.zzaTK);
            }
            return this.zzaTL;
        }
    }

    UserAddressRequest() {
        this.mVersionCode = 1;
    }

    UserAddressRequest(int i, List<CountrySpecification> list) {
        this.mVersionCode = i;
        this.zzaTK = list;
    }

    public static Builder newBuilder() {
        UserAddressRequest userAddressRequest = new UserAddressRequest();
        userAddressRequest.getClass();
        return new Builder();
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
