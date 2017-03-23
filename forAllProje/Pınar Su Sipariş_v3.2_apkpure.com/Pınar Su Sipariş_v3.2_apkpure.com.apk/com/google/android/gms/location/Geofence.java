package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;

public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {
        private String zzII = null;
        private int zzaUS = 0;
        private long zzaUT = Long.MIN_VALUE;
        private short zzaUU = (short) -1;
        private double zzaUV;
        private double zzaUW;
        private float zzaUX;
        private int zzaUY = 0;
        private int zzaUZ = -1;

        public Geofence build() {
            if (this.zzII == null) {
                throw new IllegalArgumentException("Request ID not set.");
            } else if (this.zzaUS == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if ((this.zzaUS & 4) != 0 && this.zzaUZ < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            } else if (this.zzaUT == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            } else if (this.zzaUU == (short) -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            } else if (this.zzaUY >= 0) {
                return new ParcelableGeofence(this.zzII, this.zzaUS, (short) 1, this.zzaUV, this.zzaUW, this.zzaUX, this.zzaUT, this.zzaUY, this.zzaUZ);
            } else {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
        }

        public Builder setCircularRegion(double d, double d2, float f) {
            this.zzaUU = (short) 1;
            this.zzaUV = d;
            this.zzaUW = d2;
            this.zzaUX = f;
            return this;
        }

        public Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.zzaUT = -1;
            } else {
                this.zzaUT = SystemClock.elapsedRealtime() + j;
            }
            return this;
        }

        public Builder setLoiteringDelay(int i) {
            this.zzaUZ = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i) {
            this.zzaUY = i;
            return this;
        }

        public Builder setRequestId(String str) {
            this.zzII = str;
            return this;
        }

        public Builder setTransitionTypes(int i) {
            this.zzaUS = i;
            return this;
        }
    }

    String getRequestId();
}
