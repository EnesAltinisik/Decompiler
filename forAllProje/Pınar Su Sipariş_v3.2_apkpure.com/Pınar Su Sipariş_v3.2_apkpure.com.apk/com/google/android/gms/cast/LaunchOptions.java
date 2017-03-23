package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.Locale;

public class LaunchOptions extends AbstractSafeParcelable {
    public static final Creator<LaunchOptions> CREATOR = new zzd();
    private final int mVersionCode;
    private String zzVp;
    private boolean zzafn;

    public static final class Builder {
        private LaunchOptions zzafo = new LaunchOptions();

        public LaunchOptions build() {
            return this.zzafo;
        }

        public Builder setLocale(Locale locale) {
            this.zzafo.setLanguage(zzf.zzb(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean z) {
            this.zzafo.setRelaunchIfRunning(z);
            return this;
        }
    }

    public LaunchOptions() {
        this(1, false, zzf.zzb(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean z, String str) {
        this.mVersionCode = i;
        this.zzafn = z;
        this.zzVp = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.zzafn == launchOptions.zzafn && zzf.zza(this.zzVp, launchOptions.zzVp);
    }

    public String getLanguage() {
        return this.zzVp;
    }

    public boolean getRelaunchIfRunning() {
        return this.zzafn;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Boolean.valueOf(this.zzafn), this.zzVp);
    }

    public void setLanguage(String str) {
        this.zzVp = str;
    }

    public void setRelaunchIfRunning(boolean z) {
        this.zzafn = z;
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[]{Boolean.valueOf(this.zzafn), this.zzVp});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
