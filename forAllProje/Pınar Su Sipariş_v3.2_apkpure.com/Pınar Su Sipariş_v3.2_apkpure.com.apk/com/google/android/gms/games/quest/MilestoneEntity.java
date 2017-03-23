package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class MilestoneEntity extends AbstractSafeParcelable implements Milestone {
    public static final Creator<MilestoneEntity> CREATOR = new MilestoneEntityCreator();
    private final int mState;
    private final int mVersionCode;
    private final String zzaKM;
    private final String zzaMb;
    private final long zzaRv;
    private final long zzaRw;
    private final byte[] zzaRx;

    MilestoneEntity(int i, String str, long j, long j2, byte[] bArr, int i2, String str2) {
        this.mVersionCode = i;
        this.zzaMb = str;
        this.zzaRv = j;
        this.zzaRw = j2;
        this.zzaRx = bArr;
        this.mState = i2;
        this.zzaKM = str2;
    }

    public MilestoneEntity(Milestone milestone) {
        this.mVersionCode = 4;
        this.zzaMb = milestone.getMilestoneId();
        this.zzaRv = milestone.getCurrentProgress();
        this.zzaRw = milestone.getTargetProgress();
        this.mState = milestone.getState();
        this.zzaKM = milestone.getEventId();
        Object completionRewardData = milestone.getCompletionRewardData();
        if (completionRewardData == null) {
            this.zzaRx = null;
            return;
        }
        this.zzaRx = new byte[completionRewardData.length];
        System.arraycopy(completionRewardData, 0, this.zzaRx, 0, completionRewardData.length);
    }

    static int zza(Milestone milestone) {
        return zzz.hashCode(milestone.getMilestoneId(), Long.valueOf(milestone.getCurrentProgress()), Long.valueOf(milestone.getTargetProgress()), Integer.valueOf(milestone.getState()), milestone.getEventId());
    }

    static boolean zza(Milestone milestone, Object obj) {
        if (!(obj instanceof Milestone)) {
            return false;
        }
        if (milestone == obj) {
            return true;
        }
        Milestone milestone2 = (Milestone) obj;
        return zzz.equal(milestone2.getMilestoneId(), milestone.getMilestoneId()) && zzz.equal(Long.valueOf(milestone2.getCurrentProgress()), Long.valueOf(milestone.getCurrentProgress())) && zzz.equal(Long.valueOf(milestone2.getTargetProgress()), Long.valueOf(milestone.getTargetProgress())) && zzz.equal(Integer.valueOf(milestone2.getState()), Integer.valueOf(milestone.getState())) && zzz.equal(milestone2.getEventId(), milestone.getEventId());
    }

    static String zzb(Milestone milestone) {
        return zzz.zzy(milestone).zzg("MilestoneId", milestone.getMilestoneId()).zzg("CurrentProgress", Long.valueOf(milestone.getCurrentProgress())).zzg("TargetProgress", Long.valueOf(milestone.getTargetProgress())).zzg("State", Integer.valueOf(milestone.getState())).zzg("CompletionRewardData", milestone.getCompletionRewardData()).zzg("EventId", milestone.getEventId()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public Milestone freeze() {
        return this;
    }

    public byte[] getCompletionRewardData() {
        return this.zzaRx;
    }

    public long getCurrentProgress() {
        return this.zzaRv;
    }

    public String getEventId() {
        return this.zzaKM;
    }

    public String getMilestoneId() {
        return this.zzaMb;
    }

    public int getState() {
        return this.mState;
    }

    public long getTargetProgress() {
        return this.zzaRw;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zza(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        MilestoneEntityCreator.zza(this, parcel, i);
    }
}
