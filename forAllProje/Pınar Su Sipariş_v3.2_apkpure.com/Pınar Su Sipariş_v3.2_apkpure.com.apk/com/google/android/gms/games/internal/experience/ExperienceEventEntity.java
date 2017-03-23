package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;

public final class ExperienceEventEntity extends AbstractSafeParcelable implements ExperienceEvent {
    public static final ExperienceEventEntityCreator CREATOR = new ExperienceEventEntityCreator();
    private final int mVersionCode;
    private final Uri zzaIU;
    private final String zzaJf;
    private final String zzaOW;
    private final GameEntity zzaOX;
    private final String zzaOY;
    private final String zzaOZ;
    private final long zzaPa;
    private final long zzaPb;
    private final long zzaPc;
    private final int zzaPd;
    private final int zzagd;

    ExperienceEventEntity(int i, String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j, long j2, long j3, int i2, int i3) {
        this.mVersionCode = i;
        this.zzaOW = str;
        this.zzaOX = gameEntity;
        this.zzaOY = str2;
        this.zzaOZ = str3;
        this.zzaJf = str4;
        this.zzaIU = uri;
        this.zzaPa = j;
        this.zzaPb = j2;
        this.zzaPc = j3;
        this.zzagd = i2;
        this.zzaPd = i3;
    }

    public ExperienceEventEntity(ExperienceEvent experienceEvent) {
        this.mVersionCode = 1;
        this.zzaOW = experienceEvent.zzAG();
        this.zzaOX = new GameEntity(experienceEvent.getGame());
        this.zzaOY = experienceEvent.zzAH();
        this.zzaOZ = experienceEvent.zzAI();
        this.zzaJf = experienceEvent.getIconImageUrl();
        this.zzaIU = experienceEvent.getIconImageUri();
        this.zzaPa = experienceEvent.zzAJ();
        this.zzaPb = experienceEvent.zzAK();
        this.zzaPc = experienceEvent.zzAL();
        this.zzagd = experienceEvent.getType();
        this.zzaPd = experienceEvent.zzAM();
    }

    static int zza(ExperienceEvent experienceEvent) {
        return zzz.hashCode(experienceEvent.zzAG(), experienceEvent.getGame(), experienceEvent.zzAH(), experienceEvent.zzAI(), experienceEvent.getIconImageUrl(), experienceEvent.getIconImageUri(), Long.valueOf(experienceEvent.zzAJ()), Long.valueOf(experienceEvent.zzAK()), Long.valueOf(experienceEvent.zzAL()), Integer.valueOf(experienceEvent.getType()), Integer.valueOf(experienceEvent.zzAM()));
    }

    static boolean zza(ExperienceEvent experienceEvent, Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (experienceEvent == obj) {
            return true;
        }
        ExperienceEvent experienceEvent2 = (ExperienceEvent) obj;
        return zzz.equal(experienceEvent2.zzAG(), experienceEvent.zzAG()) && zzz.equal(experienceEvent2.getGame(), experienceEvent.getGame()) && zzz.equal(experienceEvent2.zzAH(), experienceEvent.zzAH()) && zzz.equal(experienceEvent2.zzAI(), experienceEvent.zzAI()) && zzz.equal(experienceEvent2.getIconImageUrl(), experienceEvent.getIconImageUrl()) && zzz.equal(experienceEvent2.getIconImageUri(), experienceEvent.getIconImageUri()) && zzz.equal(Long.valueOf(experienceEvent2.zzAJ()), Long.valueOf(experienceEvent.zzAJ())) && zzz.equal(Long.valueOf(experienceEvent2.zzAK()), Long.valueOf(experienceEvent.zzAK())) && zzz.equal(Long.valueOf(experienceEvent2.zzAL()), Long.valueOf(experienceEvent.zzAL())) && zzz.equal(Integer.valueOf(experienceEvent2.getType()), Integer.valueOf(experienceEvent.getType())) && zzz.equal(Integer.valueOf(experienceEvent2.zzAM()), Integer.valueOf(experienceEvent.zzAM()));
    }

    static String zzb(ExperienceEvent experienceEvent) {
        return zzz.zzy(experienceEvent).zzg("ExperienceId", experienceEvent.zzAG()).zzg("Game", experienceEvent.getGame()).zzg("DisplayTitle", experienceEvent.zzAH()).zzg("DisplayDescription", experienceEvent.zzAI()).zzg("IconImageUrl", experienceEvent.getIconImageUrl()).zzg("IconImageUri", experienceEvent.getIconImageUri()).zzg("CreatedTimestamp", Long.valueOf(experienceEvent.zzAJ())).zzg("XpEarned", Long.valueOf(experienceEvent.zzAK())).zzg("CurrentXp", Long.valueOf(experienceEvent.zzAL())).zzg("Type", Integer.valueOf(experienceEvent.getType())).zzg("NewLevel", Integer.valueOf(experienceEvent.zzAM())).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzAN();
    }

    public Game getGame() {
        return this.zzaOX;
    }

    public Uri getIconImageUri() {
        return this.zzaIU;
    }

    public String getIconImageUrl() {
        return this.zzaJf;
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

    public String toString() {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ExperienceEventEntityCreator.zza(this, parcel, i);
    }

    public String zzAG() {
        return this.zzaOW;
    }

    public String zzAH() {
        return this.zzaOY;
    }

    public String zzAI() {
        return this.zzaOZ;
    }

    public long zzAJ() {
        return this.zzaPa;
    }

    public long zzAK() {
        return this.zzaPb;
    }

    public long zzAL() {
        return this.zzaPc;
    }

    public int zzAM() {
        return this.zzaPd;
    }

    public ExperienceEvent zzAN() {
        return this;
    }
}
