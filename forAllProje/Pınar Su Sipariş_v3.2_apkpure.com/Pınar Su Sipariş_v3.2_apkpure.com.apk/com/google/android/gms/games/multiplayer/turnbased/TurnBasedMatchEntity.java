package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public final class TurnBasedMatchEntity extends AbstractSafeParcelable implements TurnBasedMatch {
    public static final Creator<TurnBasedMatchEntity> CREATOR = new TurnBasedMatchEntityCreator();
    private final int mVersion;
    private final int mVersionCode;
    private final String zzVw;
    private final long zzaKl;
    private final String zzaLQ;
    private final GameEntity zzaOX;
    private final long zzaQH;
    private final ArrayList<ParticipantEntity> zzaQK;
    private final int zzaQL;
    private final Bundle zzaRb;
    private final String zzaRd;
    private final String zzaRl;
    private final String zzaRm;
    private final int zzaRn;
    private final byte[] zzaRo;
    private final String zzaRp;
    private final byte[] zzaRq;
    private final int zzaRr;
    private final int zzaRs;
    private final boolean zzaRt;
    private final String zzaRu;

    TurnBasedMatchEntity(int i, GameEntity gameEntity, String str, String str2, long j, String str3, long j2, String str4, int i2, int i3, int i4, byte[] bArr, ArrayList<ParticipantEntity> arrayList, String str5, byte[] bArr2, int i5, Bundle bundle, int i6, boolean z, String str6, String str7) {
        this.mVersionCode = i;
        this.zzaOX = gameEntity;
        this.zzaLQ = str;
        this.zzaRd = str2;
        this.zzaQH = j;
        this.zzaRl = str3;
        this.zzaKl = j2;
        this.zzaRm = str4;
        this.zzaRn = i2;
        this.zzaRs = i6;
        this.zzaQL = i3;
        this.mVersion = i4;
        this.zzaRo = bArr;
        this.zzaQK = arrayList;
        this.zzaRp = str5;
        this.zzaRq = bArr2;
        this.zzaRr = i5;
        this.zzaRb = bundle;
        this.zzaRt = z;
        this.zzVw = str6;
        this.zzaRu = str7;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnBasedMatch) {
        this.mVersionCode = 2;
        this.zzaOX = new GameEntity(turnBasedMatch.getGame());
        this.zzaLQ = turnBasedMatch.getMatchId();
        this.zzaRd = turnBasedMatch.getCreatorId();
        this.zzaQH = turnBasedMatch.getCreationTimestamp();
        this.zzaRl = turnBasedMatch.getLastUpdaterId();
        this.zzaKl = turnBasedMatch.getLastUpdatedTimestamp();
        this.zzaRm = turnBasedMatch.getPendingParticipantId();
        this.zzaRn = turnBasedMatch.getStatus();
        this.zzaRs = turnBasedMatch.getTurnStatus();
        this.zzaQL = turnBasedMatch.getVariant();
        this.mVersion = turnBasedMatch.getVersion();
        this.zzaRp = turnBasedMatch.getRematchId();
        this.zzaRr = turnBasedMatch.getMatchNumber();
        this.zzaRb = turnBasedMatch.getAutoMatchCriteria();
        this.zzaRt = turnBasedMatch.isLocallyModified();
        this.zzVw = turnBasedMatch.getDescription();
        this.zzaRu = turnBasedMatch.getDescriptionParticipantId();
        Object data = turnBasedMatch.getData();
        if (data == null) {
            this.zzaRo = null;
        } else {
            this.zzaRo = new byte[data.length];
            System.arraycopy(data, 0, this.zzaRo, 0, data.length);
        }
        data = turnBasedMatch.getPreviousMatchData();
        if (data == null) {
            this.zzaRq = null;
        } else {
            this.zzaRq = new byte[data.length];
            System.arraycopy(data, 0, this.zzaRq, 0, data.length);
        }
        ArrayList participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        this.zzaQK = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.zzaQK.add((ParticipantEntity) ((Participant) participants.get(i)).freeze());
        }
    }

    static int zza(TurnBasedMatch turnBasedMatch) {
        return zzz.hashCode(turnBasedMatch.getGame(), turnBasedMatch.getMatchId(), turnBasedMatch.getCreatorId(), Long.valueOf(turnBasedMatch.getCreationTimestamp()), turnBasedMatch.getLastUpdaterId(), Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp()), turnBasedMatch.getPendingParticipantId(), Integer.valueOf(turnBasedMatch.getStatus()), Integer.valueOf(turnBasedMatch.getTurnStatus()), turnBasedMatch.getDescription(), Integer.valueOf(turnBasedMatch.getVariant()), Integer.valueOf(turnBasedMatch.getVersion()), turnBasedMatch.getParticipants(), turnBasedMatch.getRematchId(), Integer.valueOf(turnBasedMatch.getMatchNumber()), turnBasedMatch.getAutoMatchCriteria(), Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnBasedMatch.isLocallyModified()));
    }

    static int zza(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant.getStatus();
            }
        }
        String valueOf = String.valueOf(turnBasedMatch.getMatchId());
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    static boolean zza(TurnBasedMatch turnBasedMatch, Object obj) {
        if (!(obj instanceof TurnBasedMatch)) {
            return false;
        }
        if (turnBasedMatch == obj) {
            return true;
        }
        TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch) obj;
        return zzz.equal(turnBasedMatch2.getGame(), turnBasedMatch.getGame()) && zzz.equal(turnBasedMatch2.getMatchId(), turnBasedMatch.getMatchId()) && zzz.equal(turnBasedMatch2.getCreatorId(), turnBasedMatch.getCreatorId()) && zzz.equal(Long.valueOf(turnBasedMatch2.getCreationTimestamp()), Long.valueOf(turnBasedMatch.getCreationTimestamp())) && zzz.equal(turnBasedMatch2.getLastUpdaterId(), turnBasedMatch.getLastUpdaterId()) && zzz.equal(Long.valueOf(turnBasedMatch2.getLastUpdatedTimestamp()), Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp())) && zzz.equal(turnBasedMatch2.getPendingParticipantId(), turnBasedMatch.getPendingParticipantId()) && zzz.equal(Integer.valueOf(turnBasedMatch2.getStatus()), Integer.valueOf(turnBasedMatch.getStatus())) && zzz.equal(Integer.valueOf(turnBasedMatch2.getTurnStatus()), Integer.valueOf(turnBasedMatch.getTurnStatus())) && zzz.equal(turnBasedMatch2.getDescription(), turnBasedMatch.getDescription()) && zzz.equal(Integer.valueOf(turnBasedMatch2.getVariant()), Integer.valueOf(turnBasedMatch.getVariant())) && zzz.equal(Integer.valueOf(turnBasedMatch2.getVersion()), Integer.valueOf(turnBasedMatch.getVersion())) && zzz.equal(turnBasedMatch2.getParticipants(), turnBasedMatch.getParticipants()) && zzz.equal(turnBasedMatch2.getRematchId(), turnBasedMatch.getRematchId()) && zzz.equal(Integer.valueOf(turnBasedMatch2.getMatchNumber()), Integer.valueOf(turnBasedMatch.getMatchNumber())) && zzz.equal(turnBasedMatch2.getAutoMatchCriteria(), turnBasedMatch.getAutoMatchCriteria()) && zzz.equal(Integer.valueOf(turnBasedMatch2.getAvailableAutoMatchSlots()), Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots())) && zzz.equal(Boolean.valueOf(turnBasedMatch2.isLocallyModified()), Boolean.valueOf(turnBasedMatch.isLocallyModified()));
    }

    static String zzb(TurnBasedMatch turnBasedMatch) {
        return zzz.zzy(turnBasedMatch).zzg("Game", turnBasedMatch.getGame()).zzg("MatchId", turnBasedMatch.getMatchId()).zzg("CreatorId", turnBasedMatch.getCreatorId()).zzg("CreationTimestamp", Long.valueOf(turnBasedMatch.getCreationTimestamp())).zzg("LastUpdaterId", turnBasedMatch.getLastUpdaterId()).zzg("LastUpdatedTimestamp", Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp())).zzg("PendingParticipantId", turnBasedMatch.getPendingParticipantId()).zzg("MatchStatus", Integer.valueOf(turnBasedMatch.getStatus())).zzg("TurnStatus", Integer.valueOf(turnBasedMatch.getTurnStatus())).zzg("Description", turnBasedMatch.getDescription()).zzg("Variant", Integer.valueOf(turnBasedMatch.getVariant())).zzg("Data", turnBasedMatch.getData()).zzg("Version", Integer.valueOf(turnBasedMatch.getVersion())).zzg("Participants", turnBasedMatch.getParticipants()).zzg("RematchId", turnBasedMatch.getRematchId()).zzg("PreviousData", turnBasedMatch.getPreviousMatchData()).zzg("MatchNumber", Integer.valueOf(turnBasedMatch.getMatchNumber())).zzg("AutoMatchCriteria", turnBasedMatch.getAutoMatchCriteria()).zzg("AvailableAutoMatchSlots", Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots())).zzg("LocallyModified", Boolean.valueOf(turnBasedMatch.isLocallyModified())).zzg("DescriptionParticipantId", turnBasedMatch.getDescriptionParticipantId()).toString();
    }

    static String zzb(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(str)) {
                return participant.getParticipantId();
            }
        }
        return null;
    }

    static Participant zzc(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant;
            }
        }
        String valueOf = String.valueOf(turnBasedMatch.getMatchId());
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    static ArrayList<String> zzc(TurnBasedMatch turnBasedMatch) {
        ArrayList participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        ArrayList<String> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((Participant) participants.get(i)).getParticipantId());
        }
        return arrayList;
    }

    public boolean canRematch() {
        return this.zzaRn == 2 && this.zzaRp == null;
    }

    public boolean equals(Object obj) {
        return zza((TurnBasedMatch) this, obj);
    }

    public TurnBasedMatch freeze() {
        return this;
    }

    public Bundle getAutoMatchCriteria() {
        return this.zzaRb;
    }

    public int getAvailableAutoMatchSlots() {
        return this.zzaRb == null ? 0 : this.zzaRb.getInt(Multiplayer.EXTRA_MAX_AUTOMATCH_PLAYERS);
    }

    public long getCreationTimestamp() {
        return this.zzaQH;
    }

    public String getCreatorId() {
        return this.zzaRd;
    }

    public byte[] getData() {
        return this.zzaRo;
    }

    public String getDescription() {
        return this.zzVw;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzVw, charArrayBuffer);
    }

    public Participant getDescriptionParticipant() {
        String descriptionParticipantId = getDescriptionParticipantId();
        return descriptionParticipantId == null ? null : getParticipant(descriptionParticipantId);
    }

    public String getDescriptionParticipantId() {
        return this.zzaRu;
    }

    public Game getGame() {
        return this.zzaOX;
    }

    public long getLastUpdatedTimestamp() {
        return this.zzaKl;
    }

    public String getLastUpdaterId() {
        return this.zzaRl;
    }

    public String getMatchId() {
        return this.zzaLQ;
    }

    public int getMatchNumber() {
        return this.zzaRr;
    }

    public Participant getParticipant(String str) {
        return zzc(this, str);
    }

    public String getParticipantId(String str) {
        return zzb(this, str);
    }

    public ArrayList<String> getParticipantIds() {
        return zzc(this);
    }

    public int getParticipantStatus(String str) {
        return zza((TurnBasedMatch) this, str);
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList(this.zzaQK);
    }

    public String getPendingParticipantId() {
        return this.zzaRm;
    }

    public byte[] getPreviousMatchData() {
        return this.zzaRq;
    }

    public String getRematchId() {
        return this.zzaRp;
    }

    public int getStatus() {
        return this.zzaRn;
    }

    public int getTurnStatus() {
        return this.zzaRs;
    }

    public int getVariant() {
        return this.zzaQL;
    }

    public int getVersion() {
        return this.mVersion;
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

    public boolean isLocallyModified() {
        return this.zzaRt;
    }

    public String toString() {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        TurnBasedMatchEntityCreator.zza(this, parcel, i);
    }
}
