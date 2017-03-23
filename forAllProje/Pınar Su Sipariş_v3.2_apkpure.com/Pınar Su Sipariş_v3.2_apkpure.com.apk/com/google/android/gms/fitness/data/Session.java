package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.plus.PlusShare;
import java.util.concurrent.TimeUnit;

public class Session extends AbstractSafeParcelable {
    public static final Creator<Session> CREATOR = new zzq();
    public static final String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
    private final String mName;
    private final int mVersionCode;
    private final String zzVw;
    private final long zzXy;
    private final long zzaCJ;
    private final int zzaCT;
    private final String zzaDY;
    private final Long zzaDZ;
    private final Application zzaDg;

    public static class Builder {
        private String mName = null;
        private String zzVw;
        private long zzXy = 0;
        private long zzaCJ = 0;
        private int zzaCT = 4;
        private String zzaDY;
        private Long zzaDZ;

        public Session build() {
            boolean z = false;
            zzaa.zza(this.zzXy > 0, (Object) "Start time should be specified.");
            if (this.zzaCJ == 0 || this.zzaCJ > this.zzXy) {
                z = true;
            }
            zzaa.zza(z, (Object) "End time should be later than start time.");
            if (this.zzaDY == null) {
                String str = this.mName == null ? "" : this.mName;
                this.zzaDY = new StringBuilder(String.valueOf(str).length() + 20).append(str).append(this.zzXy).toString();
            }
            return new Session();
        }

        public Builder setActiveTime(long j, TimeUnit timeUnit) {
            this.zzaDZ = Long.valueOf(timeUnit.toMillis(j));
            return this;
        }

        public Builder setActivity(String str) {
            return zzfq(FitnessActivities.zzdN(str));
        }

        public Builder setDescription(String str) {
            zzaa.zzb(str.length() <= 1000, "Session description cannot exceed %d characters", Integer.valueOf(1000));
            this.zzVw = str;
            return this;
        }

        public Builder setEndTime(long j, TimeUnit timeUnit) {
            zzaa.zza(j >= 0, (Object) "End time should be positive.");
            this.zzaCJ = timeUnit.toMillis(j);
            return this;
        }

        public Builder setIdentifier(String str) {
            boolean z = str != null && TextUtils.getTrimmedLength(str) > 0;
            zzaa.zzaj(z);
            this.zzaDY = str;
            return this;
        }

        public Builder setName(String str) {
            zzaa.zzb(str.length() <= 100, "Session name cannot exceed %d characters", Integer.valueOf(100));
            this.mName = str;
            return this;
        }

        public Builder setStartTime(long j, TimeUnit timeUnit) {
            zzaa.zza(j > 0, (Object) "Start time should be positive.");
            this.zzXy = timeUnit.toMillis(j);
            return this;
        }

        public Builder zzfq(int i) {
            this.zzaCT = i;
            return this;
        }
    }

    Session(int i, long j, long j2, String str, String str2, String str3, int i2, Application application, Long l) {
        this.mVersionCode = i;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.mName = str;
        this.zzaDY = str2;
        this.zzVw = str3;
        this.zzaCT = i2;
        this.zzaDg = application;
        this.zzaDZ = l;
    }

    public Session(long j, long j2, String str, String str2, String str3, int i, Application application, Long l) {
        this(3, j, j2, str, str2, str3, i, application, l);
    }

    private Session(Builder builder) {
        this(builder.zzXy, builder.zzaCJ, builder.mName, builder.zzaDY, builder.zzVw, builder.zzaCT, null, builder.zzaDZ);
    }

    public static Session extract(Intent intent) {
        return intent == null ? null : (Session) zzc.zza(intent, EXTRA_SESSION, CREATOR);
    }

    public static String getMimeType(String str) {
        String valueOf = String.valueOf(MIME_TYPE_PREFIX);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private boolean zza(Session session) {
        return this.zzXy == session.zzXy && this.zzaCJ == session.zzaCJ && zzz.equal(this.mName, session.mName) && zzz.equal(this.zzaDY, session.zzaDY) && zzz.equal(this.zzVw, session.zzVw) && zzz.equal(this.zzaDg, session.zzaDg) && this.zzaCT == session.zzaCT;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Session) && zza((Session) obj));
    }

    public long getActiveTime(TimeUnit timeUnit) {
        zzaa.zza(this.zzaDZ != null, (Object) "Active time is not set");
        return timeUnit.convert(this.zzaDZ.longValue(), TimeUnit.MILLISECONDS);
    }

    public String getActivity() {
        return FitnessActivities.getName(this.zzaCT);
    }

    public String getAppPackageName() {
        return this.zzaDg == null ? null : this.zzaDg.getPackageName();
    }

    public String getDescription() {
        return this.zzVw;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaCJ, TimeUnit.MILLISECONDS);
    }

    public String getIdentifier() {
        return this.zzaDY;
    }

    public String getName() {
        return this.mName;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzXy, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean hasActiveTime() {
        return this.zzaDZ != null;
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ), this.zzaDY);
    }

    public boolean isOngoing() {
        return this.zzaCJ == 0;
    }

    public String toString() {
        return zzz.zzy(this).zzg("startTime", Long.valueOf(this.zzXy)).zzg("endTime", Long.valueOf(this.zzaCJ)).zzg("name", this.mName).zzg("identifier", this.zzaDY).zzg(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, this.zzVw).zzg("activity", Integer.valueOf(this.zzaCT)).zzg("application", this.zzaDg).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzq.zza(this, parcel, i);
    }

    public long zzoq() {
        return this.zzXy;
    }

    public Long zzxG() {
        return this.zzaDZ;
    }

    public int zzxl() {
        return this.zzaCT;
    }

    public long zzxn() {
        return this.zzaCJ;
    }

    public Application zzxw() {
        return this.zzaDg;
    }
}
