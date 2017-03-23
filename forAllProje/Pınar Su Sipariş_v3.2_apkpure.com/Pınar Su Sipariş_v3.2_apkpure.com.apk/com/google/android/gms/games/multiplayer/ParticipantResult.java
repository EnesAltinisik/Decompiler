package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.games.internal.constants.MatchResult;

public final class ParticipantResult extends AbstractSafeParcelable {
    public static final Creator<ParticipantResult> CREATOR = new ParticipantResultCreator();
    public static final int MATCH_RESULT_DISAGREED = 5;
    public static final int MATCH_RESULT_DISCONNECT = 4;
    public static final int MATCH_RESULT_LOSS = 1;
    public static final int MATCH_RESULT_NONE = 3;
    public static final int MATCH_RESULT_TIE = 2;
    public static final int MATCH_RESULT_UNINITIALIZED = -1;
    public static final int MATCH_RESULT_WIN = 0;
    public static final int PLACING_UNINITIALIZED = -1;
    private final int mVersionCode;
    private final String zzaLY;
    private final int zzaQR;
    private final int zzaQS;

    public ParticipantResult(int i, String str, int i2, int i3) {
        this.mVersionCode = i;
        this.zzaLY = (String) zzaa.zzz(str);
        zzaa.zzai(MatchResult.isValid(i2));
        this.zzaQR = i2;
        this.zzaQS = i3;
    }

    public ParticipantResult(String str, int i, int i2) {
        this(1, str, i, i2);
    }

    public String getParticipantId() {
        return this.zzaLY;
    }

    public int getPlacing() {
        return this.zzaQS;
    }

    public int getResult() {
        return this.zzaQR;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParticipantResultCreator.zza(this, parcel, i);
    }
}
