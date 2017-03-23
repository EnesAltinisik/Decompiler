package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class MediationAdRequest {
    private final Date zzbg;
    private final Gender zzbh;
    private final Set<String> zzbi;
    private final boolean zzbj;
    private final Location zzbk;

    public MediationAdRequest(Date date, Gender gender, Set<String> set, boolean z, Location location) {
        this.zzbg = date;
        this.zzbh = gender;
        this.zzbi = set;
        this.zzbj = z;
        this.zzbk = location;
    }

    public Integer getAgeInYears() {
        if (this.zzbg == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.zzbg);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        return (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
    }

    public Date getBirthday() {
        return this.zzbg;
    }

    public Gender getGender() {
        return this.zzbh;
    }

    public Set<String> getKeywords() {
        return this.zzbi;
    }

    public Location getLocation() {
        return this.zzbk;
    }

    public boolean isTesting() {
        return this.zzbj;
    }
}
