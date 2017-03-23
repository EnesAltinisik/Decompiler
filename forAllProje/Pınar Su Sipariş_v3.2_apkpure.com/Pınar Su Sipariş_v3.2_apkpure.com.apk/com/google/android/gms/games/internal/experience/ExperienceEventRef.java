package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;

public final class ExperienceEventRef extends zzc implements ExperienceEvent {
    private final GameRef zzaPe;

    public ExperienceEventRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        if (zzda("external_game_id")) {
            this.zzaPe = null;
        } else {
            this.zzaPe = new GameRef(this.zzamz, this.zzapa);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return ExperienceEventEntity.zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzAN();
    }

    public Game getGame() {
        return this.zzaPe;
    }

    public Uri getIconImageUri() {
        return zzcZ("icon_uri");
    }

    public String getIconImageUrl() {
        return getString("icon_url");
    }

    public int getType() {
        return getInteger("type");
    }

    public int hashCode() {
        return ExperienceEventEntity.zza(this);
    }

    public String toString() {
        return ExperienceEventEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ExperienceEventEntity) ((ExperienceEvent) freeze())).writeToParcel(parcel, i);
    }

    public String zzAG() {
        return getString("external_experience_id");
    }

    public String zzAH() {
        return getString("display_title");
    }

    public String zzAI() {
        return getString("display_description");
    }

    public long zzAJ() {
        return getLong("created_timestamp");
    }

    public long zzAK() {
        return getLong("xp_earned");
    }

    public long zzAL() {
        return getLong("current_xp");
    }

    public int zzAM() {
        return getInteger("newLevel");
    }

    public ExperienceEvent zzAN() {
        return new ExperienceEventEntity(this);
    }
}
