package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Creator<RoomEntity> CREATOR = new a();
    private final int mVersionCode;
    private final String zzVw;
    private final String zzaLv;
    private final long zzaQH;
    private final ArrayList<ParticipantEntity> zzaQK;
    private final int zzaQL;
    private final Bundle zzaRb;
    private final String zzaRd;
    private final int zzaRe;
    private final int zzaRf;

    static final class a extends RoomEntityCreator {
        a() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return zzey(parcel);
        }

        public RoomEntity zzey(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.zzf(DowngradeableSafeParcel.zztF()) || DowngradeableSafeParcel.zzde(RoomEntity.class.getCanonicalName())) {
                return super.zzey(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            Bundle readBundle = parcel.readBundle();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i < readInt3; i++) {
                arrayList.add((ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
        }
    }

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList<ParticipantEntity> arrayList, int i4) {
        this.mVersionCode = i;
        this.zzaLv = str;
        this.zzaRd = str2;
        this.zzaQH = j;
        this.zzaRe = i2;
        this.zzVw = str3;
        this.zzaQL = i3;
        this.zzaRb = bundle;
        this.zzaQK = arrayList;
        this.zzaRf = i4;
    }

    public RoomEntity(Room room) {
        this.mVersionCode = 2;
        this.zzaLv = room.getRoomId();
        this.zzaRd = room.getCreatorId();
        this.zzaQH = room.getCreationTimestamp();
        this.zzaRe = room.getStatus();
        this.zzVw = room.getDescription();
        this.zzaQL = room.getVariant();
        this.zzaRb = room.getAutoMatchCriteria();
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        this.zzaQK = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.zzaQK.add((ParticipantEntity) ((Participant) participants.get(i)).freeze());
        }
        this.zzaRf = room.getAutoMatchWaitEstimateSeconds();
    }

    static int zza(Room room) {
        return zzz.hashCode(room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()));
    }

    static int zza(Room room, String str) {
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant.getStatus();
            }
        }
        String valueOf = String.valueOf(room.getRoomId());
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 28) + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in room ").append(valueOf).toString());
    }

    static boolean zza(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return zzz.equal(room2.getRoomId(), room.getRoomId()) && zzz.equal(room2.getCreatorId(), room.getCreatorId()) && zzz.equal(Long.valueOf(room2.getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) && zzz.equal(Integer.valueOf(room2.getStatus()), Integer.valueOf(room.getStatus())) && zzz.equal(room2.getDescription(), room.getDescription()) && zzz.equal(Integer.valueOf(room2.getVariant()), Integer.valueOf(room.getVariant())) && zzz.equal(room2.getAutoMatchCriteria(), room.getAutoMatchCriteria()) && zzz.equal(room2.getParticipants(), room.getParticipants()) && zzz.equal(Integer.valueOf(room2.getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()));
    }

    static String zzb(Room room) {
        return zzz.zzy(room).zzg("RoomId", room.getRoomId()).zzg("CreatorId", room.getCreatorId()).zzg("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).zzg("RoomStatus", Integer.valueOf(room.getStatus())).zzg("Description", room.getDescription()).zzg("Variant", Integer.valueOf(room.getVariant())).zzg("AutoMatchCriteria", room.getAutoMatchCriteria()).zzg("Participants", room.getParticipants()).zzg("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    static String zzb(Room room, String str) {
        ArrayList participants = room.getParticipants();
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

    static Participant zzc(Room room, String str) {
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant;
            }
        }
        String valueOf = String.valueOf(room.getRoomId());
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    static ArrayList<String> zzc(Room room) {
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        ArrayList<String> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((Participant) participants.get(i)).getParticipantId());
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return zza((Room) this, obj);
    }

    public Room freeze() {
        return this;
    }

    public Bundle getAutoMatchCriteria() {
        return this.zzaRb;
    }

    public int getAutoMatchWaitEstimateSeconds() {
        return this.zzaRf;
    }

    public long getCreationTimestamp() {
        return this.zzaQH;
    }

    public String getCreatorId() {
        return this.zzaRd;
    }

    public String getDescription() {
        return this.zzVw;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzVw, charArrayBuffer);
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
        return zza((Room) this, str);
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList(this.zzaQK);
    }

    public String getRoomId() {
        return this.zzaLv;
    }

    public int getStatus() {
        return this.zzaRe;
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
            parcel.writeString(this.zzaLv);
            parcel.writeString(this.zzaRd);
            parcel.writeLong(this.zzaQH);
            parcel.writeInt(this.zzaRe);
            parcel.writeString(this.zzVw);
            parcel.writeInt(this.zzaQL);
            parcel.writeBundle(this.zzaRb);
            int size = this.zzaQK.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.zzaQK.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        RoomEntityCreator.zza(this, parcel, i);
    }
}
