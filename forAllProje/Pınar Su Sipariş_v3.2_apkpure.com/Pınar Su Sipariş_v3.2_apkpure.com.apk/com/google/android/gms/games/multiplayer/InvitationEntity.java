package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Creator<InvitationEntity> CREATOR = new a();
    private final int mVersionCode;
    private final GameEntity zzaOX;
    private final long zzaQH;
    private final int zzaQI;
    private final ParticipantEntity zzaQJ;
    private final ArrayList<ParticipantEntity> zzaQK;
    private final int zzaQL;
    private final int zzaQM;
    private final String zzaaF;

    static final class a extends InvitationEntityCreator {
        a() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return zzeu(parcel);
        }

        public InvitationEntity zzeu(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.zzf(DowngradeableSafeParcel.zztF()) || DowngradeableSafeParcel.zzde(InvitationEntity.class.getCanonicalName())) {
                return super.zzeu(parcel);
            }
            GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add((ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new InvitationEntity(2, gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1, 0);
        }
    }

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList<ParticipantEntity> arrayList, int i3, int i4) {
        this.mVersionCode = i;
        this.zzaOX = gameEntity;
        this.zzaaF = str;
        this.zzaQH = j;
        this.zzaQI = i2;
        this.zzaQJ = participantEntity;
        this.zzaQK = arrayList;
        this.zzaQL = i3;
        this.zzaQM = i4;
    }

    InvitationEntity(Invitation invitation) {
        this.mVersionCode = 2;
        this.zzaOX = new GameEntity(invitation.getGame());
        this.zzaaF = invitation.getInvitationId();
        this.zzaQH = invitation.getCreationTimestamp();
        this.zzaQI = invitation.getInvitationType();
        this.zzaQL = invitation.getVariant();
        this.zzaQM = invitation.getAvailableAutoMatchSlots();
        String participantId = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList participants = invitation.getParticipants();
        int size = participants.size();
        this.zzaQK = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(participantId)) {
                obj = participant;
            }
            this.zzaQK.add((ParticipantEntity) participant.freeze());
        }
        zzaa.zzb(obj, (Object) "Must have a valid inviter!");
        this.zzaQJ = (ParticipantEntity) obj.freeze();
    }

    static int zza(Invitation invitation) {
        return zzz.hashCode(invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.getInvitationType()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()));
    }

    static boolean zza(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return zzz.equal(invitation2.getGame(), invitation.getGame()) && zzz.equal(invitation2.getInvitationId(), invitation.getInvitationId()) && zzz.equal(Long.valueOf(invitation2.getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) && zzz.equal(Integer.valueOf(invitation2.getInvitationType()), Integer.valueOf(invitation.getInvitationType())) && zzz.equal(invitation2.getInviter(), invitation.getInviter()) && zzz.equal(invitation2.getParticipants(), invitation.getParticipants()) && zzz.equal(Integer.valueOf(invitation2.getVariant()), Integer.valueOf(invitation.getVariant())) && zzz.equal(Integer.valueOf(invitation2.getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()));
    }

    static String zzb(Invitation invitation) {
        return zzz.zzy(invitation).zzg("Game", invitation.getGame()).zzg("InvitationId", invitation.getInvitationId()).zzg("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).zzg("InvitationType", Integer.valueOf(invitation.getInvitationType())).zzg("Inviter", invitation.getInviter()).zzg("Participants", invitation.getParticipants()).zzg("Variant", Integer.valueOf(invitation.getVariant())).zzg("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public Invitation freeze() {
        return this;
    }

    public int getAvailableAutoMatchSlots() {
        return this.zzaQM;
    }

    public long getCreationTimestamp() {
        return this.zzaQH;
    }

    public Game getGame() {
        return this.zzaOX;
    }

    public String getInvitationId() {
        return this.zzaaF;
    }

    public int getInvitationType() {
        return this.zzaQI;
    }

    public Participant getInviter() {
        return this.zzaQJ;
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList(this.zzaQK);
    }

    public int getVariant() {
        return this.zzaQL;
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
        if (zztG()) {
            this.zzaOX.writeToParcel(parcel, i);
            parcel.writeString(this.zzaaF);
            parcel.writeLong(this.zzaQH);
            parcel.writeInt(this.zzaQI);
            this.zzaQJ.writeToParcel(parcel, i);
            int size = this.zzaQK.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.zzaQK.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        InvitationEntityCreator.zza(this, parcel, i);
    }
}
