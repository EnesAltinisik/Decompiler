package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzaa;

public class DataSource extends AbstractSafeParcelable {
    public static final Creator<DataSource> CREATOR = new zzf();
    public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;
    private final String mName;
    private final int mVersionCode;
    private final DataType zzaCH;
    private final Device zzaDf;
    private final Application zzaDg;
    private final String zzaDh;
    private final String zzaDi;
    private final int zzagd;

    public static final class Builder {
        private String mName;
        private DataType zzaCH;
        private Device zzaDf;
        private Application zzaDg;
        private String zzaDh = "";
        private int zzagd = -1;

        public DataSource build() {
            boolean z = true;
            zzaa.zza(this.zzaCH != null, (Object) "Must set data type");
            if (this.zzagd < 0) {
                z = false;
            }
            zzaa.zza(z, (Object) "Must set data source type");
            return new DataSource();
        }

        public Builder setAppPackageName(Context context) {
            return setAppPackageName(context.getPackageName());
        }

        public Builder setAppPackageName(String str) {
            this.zzaDg = Application.zzdO(str);
            return this;
        }

        public Builder setDataType(DataType dataType) {
            this.zzaCH = dataType;
            return this;
        }

        public Builder setDevice(Device device) {
            this.zzaDf = device;
            return this;
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }

        public Builder setStreamName(String str) {
            zzaa.zzb(str != null, (Object) "Must specify a valid stream name");
            this.zzaDh = str;
            return this;
        }

        public Builder setType(int i) {
            this.zzagd = i;
            return this;
        }
    }

    DataSource(int i, DataType dataType, String str, int i2, Device device, Application application, String str2) {
        this.mVersionCode = i;
        this.zzaCH = dataType;
        this.zzagd = i2;
        this.mName = str;
        this.zzaDf = device;
        this.zzaDg = application;
        this.zzaDh = str2;
        this.zzaDi = zzxx();
    }

    private DataSource(Builder builder) {
        this.mVersionCode = 3;
        this.zzaCH = builder.zzaCH;
        this.zzagd = builder.zzagd;
        this.mName = builder.mName;
        this.zzaDf = builder.zzaDf;
        this.zzaDg = builder.zzaDg;
        this.zzaDh = builder.zzaDh;
        this.zzaDi = zzxx();
    }

    public static DataSource extract(Intent intent) {
        return intent == null ? null : (DataSource) zzc.zza(intent, EXTRA_DATA_SOURCE, CREATOR);
    }

    private String getTypeString() {
        switch (this.zzagd) {
            case 0:
                return "raw";
            case 1:
                return "derived";
            default:
                throw new IllegalArgumentException("invalid type value");
        }
    }

    private boolean zza(DataSource dataSource) {
        return this.zzaDi.equals(dataSource.zzaDi);
    }

    private String zzxx() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getTypeString());
        stringBuilder.append(":").append(this.zzaCH.getName());
        if (this.zzaDg != null) {
            stringBuilder.append(":").append(this.zzaDg.getPackageName());
        }
        if (this.zzaDf != null) {
            stringBuilder.append(":").append(this.zzaDf.getStreamIdentifier());
        }
        if (this.zzaDh != null) {
            stringBuilder.append(":").append(this.zzaDh);
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataSource) && zza((DataSource) obj));
    }

    public String getAppPackageName() {
        return this.zzaDg == null ? null : this.zzaDg.getPackageName();
    }

    public DataType getDataType() {
        return this.zzaCH;
    }

    public Device getDevice() {
        return this.zzaDf;
    }

    public String getName() {
        return this.mName;
    }

    public String getStreamIdentifier() {
        return this.zzaDi;
    }

    public String getStreamName() {
        return this.zzaDh;
    }

    public int getType() {
        return this.zzagd;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return this.zzaDi.hashCode();
    }

    public String toDebugString() {
        String str;
        String str2;
        String valueOf;
        String str3 = this.zzagd == 0 ? "r" : "d";
        String valueOf2 = String.valueOf(this.zzaCH.zzxy());
        if (this.zzaDg == null) {
            str = "";
        } else if (this.zzaDg.equals(Application.zzaCO)) {
            str = ":gms";
        } else {
            str2 = ":";
            str = String.valueOf(this.zzaDg.getPackageName());
            str = str.length() != 0 ? str2.concat(str) : new String(str2);
        }
        if (this.zzaDf != null) {
            str2 = String.valueOf(this.zzaDf.getModel());
            valueOf = String.valueOf(this.zzaDf.getUid());
            str2 = new StringBuilder((String.valueOf(str2).length() + 2) + String.valueOf(valueOf).length()).append(":").append(str2).append(":").append(valueOf).toString();
        } else {
            str2 = "";
        }
        if (this.zzaDh != null) {
            String str4 = ":";
            valueOf = String.valueOf(this.zzaDh);
            valueOf = valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4);
        } else {
            valueOf = "";
        }
        return new StringBuilder(((((String.valueOf(str3).length() + 1) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append(str3).append(":").append(valueOf2).append(str).append(str2).append(valueOf).toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DataSource{");
        stringBuilder.append(getTypeString());
        if (this.mName != null) {
            stringBuilder.append(":").append(this.mName);
        }
        if (this.zzaDg != null) {
            stringBuilder.append(":").append(this.zzaDg);
        }
        if (this.zzaDf != null) {
            stringBuilder.append(":").append(this.zzaDf);
        }
        if (this.zzaDh != null) {
            stringBuilder.append(":").append(this.zzaDh);
        }
        stringBuilder.append(":").append(this.zzaCH);
        return stringBuilder.append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    public Application zzxw() {
        return this.zzaDg;
    }
}
