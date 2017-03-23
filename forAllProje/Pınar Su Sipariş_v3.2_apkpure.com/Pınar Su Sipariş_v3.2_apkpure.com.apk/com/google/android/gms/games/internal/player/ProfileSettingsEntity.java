package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.Players.LoadProfileSettingsResult;

public class ProfileSettingsEntity extends AbstractSafeParcelable implements LoadProfileSettingsResult {
    public static final ProfileSettingsEntityCreator CREATOR = new ProfileSettingsEntityCreator();
    private final int mVersionCode;
    private final boolean zzaJJ;
    private final String zzaJL;
    private final boolean zzaPT;
    private final boolean zzaPU;
    private final StockProfileImageEntity zzaPV;
    private final boolean zzaPW;
    private final boolean zzaPX;
    private final Status zzaaO;

    ProfileSettingsEntity(int i, Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5) {
        this.mVersionCode = i;
        this.zzaaO = status;
        this.zzaJL = str;
        this.zzaPT = z;
        this.zzaJJ = z2;
        this.zzaPU = z3;
        this.zzaPV = stockProfileImageEntity;
        this.zzaPW = z4;
        this.zzaPX = z5;
    }

    public ProfileSettingsEntity(DataHolder dataHolder) {
        this.mVersionCode = 3;
        this.zzaaO = new Status(dataHolder.getStatusCode());
        if (!this.zzaaO.isSuccess() || dataHolder.getCount() <= 0) {
            this.zzaJL = null;
            this.zzaPT = false;
            this.zzaJJ = false;
            this.zzaPU = false;
            this.zzaPV = null;
            this.zzaPW = false;
            this.zzaPX = false;
            return;
        }
        int zzbP = dataHolder.zzbP(0);
        this.zzaJL = dataHolder.zzd("gamer_tag", 0, zzbP);
        this.zzaPT = dataHolder.zze("gamer_tag_explicitly_set", 0, zzbP);
        this.zzaJJ = dataHolder.zze("profile_visible", 0, zzbP);
        this.zzaPU = dataHolder.zze("profile_visibility_explicitly_set", 0, zzbP);
        Object zzd = dataHolder.zzd("stock_avatar_url", 0, zzbP);
        Object zzd2 = dataHolder.zzd("stock_avatar_uri", 0, zzbP);
        if (TextUtils.isEmpty(zzd) || TextUtils.isEmpty(zzd2)) {
            this.zzaPV = null;
        } else {
            this.zzaPV = new StockProfileImageEntity(zzd, Uri.parse(zzd2));
        }
        this.zzaPW = dataHolder.zze("profile_discoverable", 0, zzbP);
        this.zzaPX = dataHolder.zze("auto_sign_in", 0, zzbP);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LoadProfileSettingsResult)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        LoadProfileSettingsResult loadProfileSettingsResult = (LoadProfileSettingsResult) obj;
        return zzz.equal(this.zzaJL, loadProfileSettingsResult.zzyQ()) && zzz.equal(Boolean.valueOf(this.zzaPT), Boolean.valueOf(loadProfileSettingsResult.zzza())) && zzz.equal(Boolean.valueOf(this.zzaJJ), Boolean.valueOf(loadProfileSettingsResult.zzyT())) && zzz.equal(Boolean.valueOf(this.zzaPU), Boolean.valueOf(loadProfileSettingsResult.zzyY())) && zzz.equal(this.zzaaO, loadProfileSettingsResult.getStatus()) && zzz.equal(this.zzaPV, loadProfileSettingsResult.zzyZ()) && zzz.equal(Boolean.valueOf(this.zzaPW), Boolean.valueOf(loadProfileSettingsResult.zzzb())) && zzz.equal(Boolean.valueOf(this.zzaPX), Boolean.valueOf(loadProfileSettingsResult.zzzc()));
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaJL, Boolean.valueOf(this.zzaPT), Boolean.valueOf(this.zzaJJ), Boolean.valueOf(this.zzaPU), this.zzaaO, this.zzaPV, Boolean.valueOf(this.zzaPW), Boolean.valueOf(this.zzaPX));
    }

    public String toString() {
        return zzz.zzy(this).zzg("GamerTag", this.zzaJL).zzg("IsGamerTagExplicitlySet", Boolean.valueOf(this.zzaPT)).zzg("IsProfileVisible", Boolean.valueOf(this.zzaJJ)).zzg("IsVisibilityExplicitlySet", Boolean.valueOf(this.zzaPU)).zzg("Status", this.zzaaO).zzg("StockProfileImage", this.zzaPV).zzg("IsProfileDiscoverable", Boolean.valueOf(this.zzaPW)).zzg("AutoSignIn", Boolean.valueOf(this.zzaPX)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ProfileSettingsEntityCreator.zza(this, parcel, i);
    }

    public String zzyQ() {
        return this.zzaJL;
    }

    public boolean zzyT() {
        return this.zzaJJ;
    }

    public boolean zzyY() {
        return this.zzaPU;
    }

    public StockProfileImage zzyZ() {
        return this.zzaPV;
    }

    public boolean zzza() {
        return this.zzaPT;
    }

    public boolean zzzb() {
        return this.zzaPW;
    }

    public boolean zzzc() {
        return this.zzaPX;
    }
}
