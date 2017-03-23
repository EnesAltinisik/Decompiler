package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.zzig;
import java.util.ArrayList;
import java.util.List;

@zzig
public final class zzf {
    private Bundle mExtras;
    private Location zzbk;
    private boolean zzqs;
    private long zzvd;
    private int zzve;
    private List<String> zzvf;
    private boolean zzvg;
    private int zzvh;
    private String zzvi;
    private SearchAdRequestParcel zzvj;
    private String zzvk;
    private Bundle zzvl;
    private Bundle zzvm;
    private List<String> zzvn;
    private String zzvo;
    private String zzvp;
    private boolean zzvq;

    public zzf() {
        this.zzvd = -1;
        this.mExtras = new Bundle();
        this.zzve = -1;
        this.zzvf = new ArrayList();
        this.zzvg = false;
        this.zzvh = -1;
        this.zzqs = false;
        this.zzvi = null;
        this.zzvj = null;
        this.zzbk = null;
        this.zzvk = null;
        this.zzvl = new Bundle();
        this.zzvm = new Bundle();
        this.zzvn = new ArrayList();
        this.zzvo = null;
        this.zzvp = null;
        this.zzvq = false;
    }

    public zzf(AdRequestParcel adRequestParcel) {
        this.zzvd = adRequestParcel.zzuN;
        this.mExtras = adRequestParcel.extras;
        this.zzve = adRequestParcel.zzuO;
        this.zzvf = adRequestParcel.zzuP;
        this.zzvg = adRequestParcel.zzuQ;
        this.zzvh = adRequestParcel.zzuR;
        this.zzqs = adRequestParcel.zzuS;
        this.zzvi = adRequestParcel.zzuT;
        this.zzvj = adRequestParcel.zzuU;
        this.zzbk = adRequestParcel.zzuV;
        this.zzvk = adRequestParcel.zzuW;
        this.zzvl = adRequestParcel.zzuX;
        this.zzvm = adRequestParcel.zzuY;
        this.zzvn = adRequestParcel.zzuZ;
        this.zzvo = adRequestParcel.zzva;
        this.zzvp = adRequestParcel.zzvb;
    }

    public zzf zza(Location location) {
        this.zzbk = location;
        return this;
    }

    public zzf zzc(Bundle bundle) {
        this.zzvl = bundle;
        return this;
    }

    public AdRequestParcel zzdA() {
        return new AdRequestParcel(7, this.zzvd, this.mExtras, this.zzve, this.zzvf, this.zzvg, this.zzvh, this.zzqs, this.zzvi, this.zzvj, this.zzbk, this.zzvk, this.zzvl, this.zzvm, this.zzvn, this.zzvo, this.zzvp, false);
    }
}
