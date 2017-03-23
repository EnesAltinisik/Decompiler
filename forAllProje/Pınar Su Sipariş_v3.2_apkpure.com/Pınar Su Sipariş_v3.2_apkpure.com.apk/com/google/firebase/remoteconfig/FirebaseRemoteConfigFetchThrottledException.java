package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigFetchException {
    private final long zzauK;

    public FirebaseRemoteConfigFetchThrottledException(long j) {
        this.zzauK = j;
    }

    public long getThrottleEndTimeMillis() {
        return this.zzauK;
    }
}
