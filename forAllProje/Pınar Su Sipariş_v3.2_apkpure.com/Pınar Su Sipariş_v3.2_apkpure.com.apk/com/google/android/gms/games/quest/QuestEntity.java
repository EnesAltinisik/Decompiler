package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
import java.util.List;

public final class QuestEntity extends AbstractSafeParcelable implements Quest {
    public static final Creator<QuestEntity> CREATOR = new QuestEntityCreator();
    private final Uri mIconUri;
    private final String mName;
    private final int mState;
    private final int mVersionCode;
    private final String zzVw;
    private final long zzaKl;
    private final GameEntity zzaOX;
    private final Uri zzaRA;
    private final String zzaRB;
    private final long zzaRC;
    private final String zzaRD;
    private final long zzaRE;
    private final long zzaRF;
    private final ArrayList<MilestoneEntity> zzaRG;
    private final String zzaRy;
    private final long zzaRz;
    private final int zzagd;

    QuestEntity(int i, GameEntity gameEntity, String str, long j, Uri uri, String str2, String str3, long j2, long j3, Uri uri2, String str4, String str5, long j4, long j5, int i2, int i3, ArrayList<MilestoneEntity> arrayList) {
        this.mVersionCode = i;
        this.zzaOX = gameEntity;
        this.zzaRy = str;
        this.zzaRz = j;
        this.zzaRA = uri;
        this.zzaRB = str2;
        this.zzVw = str3;
        this.zzaRC = j2;
        this.zzaKl = j3;
        this.mIconUri = uri2;
        this.zzaRD = str4;
        this.mName = str5;
        this.zzaRE = j4;
        this.zzaRF = j5;
        this.mState = i2;
        this.zzagd = i3;
        this.zzaRG = arrayList;
    }

    public QuestEntity(Quest quest) {
        this.mVersionCode = 2;
        this.zzaOX = new GameEntity(quest.getGame());
        this.zzaRy = quest.getQuestId();
        this.zzaRz = quest.getAcceptedTimestamp();
        this.zzVw = quest.getDescription();
        this.zzaRA = quest.getBannerImageUri();
        this.zzaRB = quest.getBannerImageUrl();
        this.zzaRC = quest.getEndTimestamp();
        this.mIconUri = quest.getIconImageUri();
        this.zzaRD = quest.getIconImageUrl();
        this.zzaKl = quest.getLastUpdatedTimestamp();
        this.mName = quest.getName();
        this.zzaRE = quest.zzBw();
        this.zzaRF = quest.getStartTimestamp();
        this.mState = quest.getState();
        this.zzagd = quest.getType();
        List zzBv = quest.zzBv();
        int size = zzBv.size();
        this.zzaRG = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.zzaRG.add((MilestoneEntity) ((Milestone) zzBv.get(i)).freeze());
        }
    }

    static int zza(Quest quest) {
        return zzz.hashCode(quest.getGame(), quest.getQuestId(), Long.valueOf(quest.getAcceptedTimestamp()), quest.getBannerImageUri(), quest.getDescription(), Long.valueOf(quest.getEndTimestamp()), quest.getIconImageUri(), Long.valueOf(quest.getLastUpdatedTimestamp()), quest.zzBv(), quest.getName(), Long.valueOf(quest.zzBw()), Long.valueOf(quest.getStartTimestamp()), Integer.valueOf(quest.getState()));
    }

    static boolean zza(Quest quest, Object obj) {
        if (!(obj instanceof Quest)) {
            return false;
        }
        if (quest == obj) {
            return true;
        }
        Quest quest2 = (Quest) obj;
        return zzz.equal(quest2.getGame(), quest.getGame()) && zzz.equal(quest2.getQuestId(), quest.getQuestId()) && zzz.equal(Long.valueOf(quest2.getAcceptedTimestamp()), Long.valueOf(quest.getAcceptedTimestamp())) && zzz.equal(quest2.getBannerImageUri(), quest.getBannerImageUri()) && zzz.equal(quest2.getDescription(), quest.getDescription()) && zzz.equal(Long.valueOf(quest2.getEndTimestamp()), Long.valueOf(quest.getEndTimestamp())) && zzz.equal(quest2.getIconImageUri(), quest.getIconImageUri()) && zzz.equal(Long.valueOf(quest2.getLastUpdatedTimestamp()), Long.valueOf(quest.getLastUpdatedTimestamp())) && zzz.equal(quest2.zzBv(), quest.zzBv()) && zzz.equal(quest2.getName(), quest.getName()) && zzz.equal(Long.valueOf(quest2.zzBw()), Long.valueOf(quest.zzBw())) && zzz.equal(Long.valueOf(quest2.getStartTimestamp()), Long.valueOf(quest.getStartTimestamp())) && zzz.equal(Integer.valueOf(quest2.getState()), Integer.valueOf(quest.getState()));
    }

    static String zzb(Quest quest) {
        return zzz.zzy(quest).zzg("Game", quest.getGame()).zzg("QuestId", quest.getQuestId()).zzg("AcceptedTimestamp", Long.valueOf(quest.getAcceptedTimestamp())).zzg("BannerImageUri", quest.getBannerImageUri()).zzg("BannerImageUrl", quest.getBannerImageUrl()).zzg("Description", quest.getDescription()).zzg("EndTimestamp", Long.valueOf(quest.getEndTimestamp())).zzg("IconImageUri", quest.getIconImageUri()).zzg("IconImageUrl", quest.getIconImageUrl()).zzg("LastUpdatedTimestamp", Long.valueOf(quest.getLastUpdatedTimestamp())).zzg("Milestones", quest.zzBv()).zzg("Name", quest.getName()).zzg("NotifyTimestamp", Long.valueOf(quest.zzBw())).zzg("StartTimestamp", Long.valueOf(quest.getStartTimestamp())).zzg("State", Integer.valueOf(quest.getState())).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public Quest freeze() {
        return this;
    }

    public long getAcceptedTimestamp() {
        return this.zzaRz;
    }

    public Uri getBannerImageUri() {
        return this.zzaRA;
    }

    public String getBannerImageUrl() {
        return this.zzaRB;
    }

    public Milestone getCurrentMilestone() {
        return (Milestone) zzBv().get(0);
    }

    public String getDescription() {
        return this.zzVw;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzVw, charArrayBuffer);
    }

    public long getEndTimestamp() {
        return this.zzaRC;
    }

    public Game getGame() {
        return this.zzaOX;
    }

    public Uri getIconImageUri() {
        return this.mIconUri;
    }

    public String getIconImageUrl() {
        return this.zzaRD;
    }

    public long getLastUpdatedTimestamp() {
        return this.zzaKl;
    }

    public String getName() {
        return this.mName;
    }

    public void getName(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.mName, charArrayBuffer);
    }

    public String getQuestId() {
        return this.zzaRy;
    }

    public long getStartTimestamp() {
        return this.zzaRF;
    }

    public int getState() {
        return this.mState;
    }

    public int getType() {
        return this.zzagd;
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

    public boolean isEndingSoon() {
        return this.zzaRE <= System.currentTimeMillis() + 1800000;
    }

    public String toString() {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        QuestEntityCreator.zza(this, parcel, i);
    }

    public List<Milestone> zzBv() {
        return new ArrayList(this.zzaRG);
    }

    public long zzBw() {
        return this.zzaRE;
    }
}
