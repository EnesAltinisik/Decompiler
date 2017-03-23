package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;

public abstract class Task implements Parcelable {
    public static final int EXTRAS_LIMIT_BYTES = 10240;
    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1;
    private final Bundle mExtras;
    private final String mTag;
    private final String zzaTr;
    private final boolean zzaTs;
    private final boolean zzaTt;
    private final int zzaTu;
    private final boolean zzaTv;
    private final zzc zzaTw;

    public static abstract class Builder {
        protected Bundle extras;
        protected String gcmTaskService;
        protected boolean isPersisted;
        protected int requiredNetworkState;
        protected boolean requiresCharging;
        protected String tag;
        protected boolean updateCurrent;
        protected zzc zzaTx = zzc.zzaTm;

        public abstract Task build();

        protected void checkConditions() {
            zzaa.zzb(this.gcmTaskService != null, (Object) "Must provide an endpoint for this task by calling setService(ComponentName).");
            GcmNetworkManager.zzeu(this.tag);
            Task.zza(this.zzaTx);
            if (this.isPersisted) {
                Task.zzH(this.extras);
            }
        }

        public abstract Builder setExtras(Bundle bundle);

        public abstract Builder setPersisted(boolean z);

        public abstract Builder setRequiredNetwork(int i);

        public abstract Builder setRequiresCharging(boolean z);

        public abstract Builder setService(Class<? extends GcmTaskService> cls);

        public abstract Builder setTag(String str);

        public abstract Builder setUpdateCurrent(boolean z);
    }

    @Deprecated
    Task(Parcel parcel) {
        boolean z = true;
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.zzaTr = parcel.readString();
        this.mTag = parcel.readString();
        this.zzaTs = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.zzaTt = z;
        this.zzaTu = 2;
        this.zzaTv = false;
        this.zzaTw = zzc.zzaTm;
        this.mExtras = null;
    }

    Task(Builder builder) {
        this.zzaTr = builder.gcmTaskService;
        this.mTag = builder.tag;
        this.zzaTs = builder.updateCurrent;
        this.zzaTt = builder.isPersisted;
        this.zzaTu = builder.requiredNetworkState;
        this.zzaTv = builder.requiresCharging;
        this.mExtras = builder.extras;
        this.zzaTw = builder.zzaTx != null ? builder.zzaTx : zzc.zzaTm;
    }

    private static boolean zzE(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean);
    }

    public static void zzH(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            if (dataSize > EXTRAS_LIMIT_BYTES) {
                obtain.recycle();
                String valueOf = String.valueOf("Extras exceeding maximum size(10240 bytes): ");
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(dataSize).toString());
            }
            obtain.recycle();
            for (String str : bundle.keySet()) {
                if (!zzE(bundle.get(str))) {
                    throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean. ");
                }
            }
        }
    }

    public static void zza(zzc com_google_android_gms_gcm_zzc) {
        if (com_google_android_gms_gcm_zzc != null) {
            int zzBQ = com_google_android_gms_gcm_zzc.zzBQ();
            if (zzBQ == 1 || zzBQ == 0) {
                int zzBR = com_google_android_gms_gcm_zzc.zzBR();
                int zzBS = com_google_android_gms_gcm_zzc.zzBS();
                if (zzBQ == 0 && zzBR < 0) {
                    throw new IllegalArgumentException("InitialBackoffSeconds can't be negative: " + zzBR);
                } else if (zzBQ == 1 && zzBR < 10) {
                    throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                } else if (zzBS < zzBR) {
                    throw new IllegalArgumentException("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: " + com_google_android_gms_gcm_zzc.zzBS());
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Must provide a valid RetryPolicy: " + zzBQ);
        }
    }

    public int describeContents() {
        return 0;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public int getRequiredNetwork() {
        return this.zzaTu;
    }

    public boolean getRequiresCharging() {
        return this.zzaTv;
    }

    public String getServiceName() {
        return this.zzaTr;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isPersisted() {
        return this.zzaTt;
    }

    public boolean isUpdateCurrent() {
        return this.zzaTs;
    }

    public void toBundle(Bundle bundle) {
        bundle.putString("tag", this.mTag);
        bundle.putBoolean("update_current", this.zzaTs);
        bundle.putBoolean("persisted", this.zzaTt);
        bundle.putString("service", this.zzaTr);
        bundle.putInt("requiredNetwork", this.zzaTu);
        bundle.putBoolean("requiresCharging", this.zzaTv);
        bundle.putBundle("retryStrategy", this.zzaTw.zzG(new Bundle()));
        bundle.putBundle("extras", this.mExtras);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.zzaTr);
        parcel.writeString(this.mTag);
        parcel.writeInt(this.zzaTs ? 1 : 0);
        if (!this.zzaTt) {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }
}
