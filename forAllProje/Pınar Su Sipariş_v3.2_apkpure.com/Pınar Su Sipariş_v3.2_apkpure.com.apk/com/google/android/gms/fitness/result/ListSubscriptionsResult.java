package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSubscriptionsResult extends AbstractSafeParcelable implements Result {
    public static final Creator<ListSubscriptionsResult> CREATOR = new zzh();
    private final int mVersionCode;
    private final List<Subscription> zzaIz;
    private final Status zzaaO;

    ListSubscriptionsResult(int i, List<Subscription> list, Status status) {
        this.mVersionCode = i;
        this.zzaIz = list;
        this.zzaaO = status;
    }

    public ListSubscriptionsResult(List<Subscription> list, Status status) {
        this.mVersionCode = 3;
        this.zzaIz = Collections.unmodifiableList(list);
        this.zzaaO = (Status) zzaa.zzb((Object) status, (Object) "status");
    }

    public static ListSubscriptionsResult zzX(Status status) {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    private boolean zzb(ListSubscriptionsResult listSubscriptionsResult) {
        return this.zzaaO.equals(listSubscriptionsResult.zzaaO) && zzz.equal(this.zzaIz, listSubscriptionsResult.zzaIz);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ListSubscriptionsResult) && zzb((ListSubscriptionsResult) obj));
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    public List<Subscription> getSubscriptions() {
        return this.zzaIz;
    }

    public List<Subscription> getSubscriptions(DataType dataType) {
        List arrayList = new ArrayList();
        for (Subscription subscription : this.zzaIz) {
            if (dataType.equals(subscription.zzxI())) {
                arrayList.add(subscription);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaO, this.zzaIz);
    }

    public String toString() {
        return zzz.zzy(this).zzg("status", this.zzaaO).zzg("subscriptions", this.zzaIz).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }
}
