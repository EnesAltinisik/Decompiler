package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Creator<ParticipantEntity> CREATOR = new a();
    private final int mVersionCode;
    private final int zzDO;
    private final Uri zzaIU;
    private final Uri zzaIV;
    private final String zzaJf;
    private final String zzaJg;
    private final String zzaKO;
    private final PlayerEntity zzaKi;
    private final String zzaLY;
    private final boolean zzaQO;
    private final ParticipantResult zzaQP;
    private final String zzaco;
    private final int zzaeF;

    static final class a extends ParticipantEntityCreator {
        a() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return zzev(parcel);
        }

        public ParticipantEntity zzev(Parcel parcel) {
            Object obj = 1;
            if (GamesDowngradeableSafeParcel.zzf(DowngradeableSafeParcel.zztF()) || DowngradeableSafeParcel.zzde(ParticipantEntity.class.getCanonicalName())) {
                return super.zzev(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            String readString4 = parcel.readString();
            Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() > 0;
            if (parcel.readInt() <= 0) {
                obj = null;
            }
            return new ParticipantEntity(3, readString, readString2, parse, parse2, readInt, readString5, z, obj != null ? (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7, null, null, null);
        }
    }

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3, ParticipantResult participantResult, String str4, String str5) {
        this.mVersionCode = i;
        this.zzaLY = str;
        this.zzaco = str2;
        this.zzaIU = uri;
        this.zzaIV = uri2;
        this.zzDO = i2;
        this.zzaKO = str3;
        this.zzaQO = z;
        this.zzaKi = playerEntity;
        this.zzaeF = i3;
        this.zzaQP = participantResult;
        this.zzaJf = str4;
        this.zzaJg = str5;
    }

    public ParticipantEntity(Participant participant) {
        this.mVersionCode = 3;
        this.zzaLY = participant.getParticipantId();
        this.zzaco = participant.getDisplayName();
        this.zzaIU = participant.getIconImageUri();
        this.zzaIV = participant.getHiResImageUri();
        this.zzDO = participant.getStatus();
        this.zzaKO = participant.zzzM();
        this.zzaQO = participant.isConnectedToRoom();
        Player player = participant.getPlayer();
        this.zzaKi = player == null ? null : new PlayerEntity(player);
        this.zzaeF = participant.getCapabilities();
        this.zzaQP = participant.getResult();
        this.zzaJf = participant.getIconImageUrl();
        this.zzaJg = participant.getHiResImageUrl();
    }

    static int zza(Participant participant) {
        return zzz.hashCode(participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.zzzM(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId());
    }

    static boolean zza(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return zzz.equal(participant2.getPlayer(), participant.getPlayer()) && zzz.equal(Integer.valueOf(participant2.getStatus()), Integer.valueOf(participant.getStatus())) && zzz.equal(participant2.zzzM(), participant.zzzM()) && zzz.equal(Boolean.valueOf(participant2.isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) && zzz.equal(participant2.getDisplayName(), participant.getDisplayName()) && zzz.equal(participant2.getIconImageUri(), participant.getIconImageUri()) && zzz.equal(participant2.getHiResImageUri(), participant.getHiResImageUri()) && zzz.equal(Integer.valueOf(participant2.getCapabilities()), Integer.valueOf(participant.getCapabilities())) && zzz.equal(participant2.getResult(), participant.getResult()) && zzz.equal(participant2.getParticipantId(), participant.getParticipantId());
    }

    static String zzb(Participant participant) {
        return zzz.zzy(participant).zzg("ParticipantId", participant.getParticipantId()).zzg("Player", participant.getPlayer()).zzg("Status", Integer.valueOf(participant.getStatus())).zzg("ClientAddress", participant.zzzM()).zzg("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).zzg("DisplayName", participant.getDisplayName()).zzg("IconImage", participant.getIconImageUri()).zzg("IconImageUrl", participant.getIconImageUrl()).zzg("HiResImage", participant.getHiResImageUri()).zzg("HiResImageUrl", participant.getHiResImageUrl()).zzg("Capabilities", Integer.valueOf(participant.getCapabilities())).zzg("Result", participant.getResult()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public Participant freeze() {
        return this;
    }

    public int getCapabilities() {
        return this.zzaeF;
    }

    public String getDisplayName() {
        return this.zzaKi == null ? this.zzaco : this.zzaKi.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        if (this.zzaKi == null) {
            zzg.zzb(this.zzaco, charArrayBuffer);
        } else {
            this.zzaKi.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getHiResImageUri() {
        return this.zzaKi == null ? this.zzaIV : this.zzaKi.getHiResImageUri();
    }

    public String getHiResImageUrl() {
        return this.zzaKi == null ? this.zzaJg : this.zzaKi.getHiResImageUrl();
    }

    public Uri getIconImageUri() {
        return this.zzaKi == null ? this.zzaIU : this.zzaKi.getIconImageUri();
    }

    public String getIconImageUrl() {
        return this.zzaKi == null ? this.zzaJf : this.zzaKi.getIconImageUrl();
    }

    public String getParticipantId() {
        return this.zzaLY;
    }

    public Player getPlayer() {
        return this.zzaKi;
    }

    public ParticipantResult getResult() {
        return this.zzaQP;
    }

    public int getStatus() {
        return this.zzDO;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zza(this);
    }

    public boolean isConnectedToRoom() {
        return this.zzaQO;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        int i2 = 0;
        if (zztG()) {
            parcel.writeString(this.zzaLY);
            parcel.writeString(this.zzaco);
            parcel.writeString(this.zzaIU == null ? null : this.zzaIU.toString());
            if (this.zzaIV != null) {
                str = this.zzaIV.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.zzDO);
            parcel.writeString(this.zzaKO);
            parcel.writeInt(this.zzaQO ? 1 : 0);
            if (this.zzaKi != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            if (this.zzaKi != null) {
                this.zzaKi.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        ParticipantEntityCreator.zza(this, parcel, i);
    }

    public String zzzM() {
        return this.zzaKO;
    }
}
