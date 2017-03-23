package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageFilter extends AbstractSafeParcelable {
    public static final Creator<MessageFilter> CREATOR = new zzd();
    public static final MessageFilter INCLUDE_ALL_MY_TYPES = new Builder().includeAllMyTypes().build();
    final int mVersionCode;
    private final List<MessageType> zzbiN;
    private final List<NearbyDeviceFilter> zzbiO;
    private final boolean zzbiP;

    public static final class Builder {
        private final List<NearbyDeviceFilter> zzbiO = new ArrayList();
        private boolean zzbiP;
        private final List<MessageType> zzbiQ = new ArrayList();

        private Builder zzab(String str, String str2) {
            this.zzbiQ.add(new MessageType(str, str2));
            return this;
        }

        public MessageFilter build() {
            boolean z = this.zzbiP || !this.zzbiQ.isEmpty();
            zzaa.zza(z, (Object) "At least one of the include methods must be called.");
            return new MessageFilter(this.zzbiQ, this.zzbiO, this.zzbiP);
        }

        public Builder includeAllMyTypes() {
            this.zzbiP = true;
            return this;
        }

        public Builder includeFilter(MessageFilter messageFilter) {
            this.zzbiQ.addAll(messageFilter.zzHM());
            this.zzbiO.addAll(messageFilter.zzHO());
            this.zzbiP |= messageFilter.zzHN();
            return this;
        }

        public Builder includeNamespacedType(String str, String str2) {
            boolean z = (str == null || str.isEmpty() || str.contains("*")) ? false : true;
            zzaa.zzb(z, "namespace(%s) cannot be null, empty or contain (*).", str);
            z = (str2 == null || str2.contains("*")) ? false : true;
            zzaa.zzb(z, "type(%s) cannot be null or contain (*).", str2);
            return zzab(str, str2);
        }
    }

    MessageFilter(int i, List<MessageType> list, List<NearbyDeviceFilter> list2, boolean z) {
        List emptyList;
        this.mVersionCode = i;
        this.zzbiN = Collections.unmodifiableList((List) zzaa.zzz(list));
        this.zzbiP = z;
        if (list2 == null) {
            emptyList = Collections.emptyList();
        }
        this.zzbiO = Collections.unmodifiableList(emptyList);
    }

    private MessageFilter(List<MessageType> list, List<NearbyDeviceFilter> list2, boolean z) {
        this(1, (List) list, (List) list2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.zzbiP == messageFilter.zzbiP && zzz.equal(this.zzbiN, messageFilter.zzbiN) && zzz.equal(this.zzbiO, messageFilter.zzbiO);
    }

    public int hashCode() {
        return zzz.hashCode(this.zzbiN, this.zzbiO, Boolean.valueOf(this.zzbiP));
    }

    public String toString() {
        boolean z = this.zzbiP;
        String valueOf = String.valueOf(this.zzbiN);
        return new StringBuilder(String.valueOf(valueOf).length() + 53).append("MessageFilter{includeAllMyTypes=").append(z).append(", messageTypes=").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }

    List<MessageType> zzHM() {
        return this.zzbiN;
    }

    boolean zzHN() {
        return this.zzbiP;
    }

    List<NearbyDeviceFilter> zzHO() {
        return this.zzbiO;
    }
}
