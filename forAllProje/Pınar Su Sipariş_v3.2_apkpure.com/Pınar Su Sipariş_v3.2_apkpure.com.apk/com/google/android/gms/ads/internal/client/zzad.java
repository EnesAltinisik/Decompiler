package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.zzig;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@zzig
public final class zzad {
    public static final String DEVICE_ID_EMULATOR = zzm.zzdQ().zzaT("emulator");
    private final Date zzbg;
    private final Set<String> zzbi;
    private final Location zzbk;
    private final boolean zzqs;
    private final Bundle zzvT;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzvU;
    private final SearchAdRequest zzvV;
    private final Set<String> zzvW;
    private final Set<String> zzvX;
    private final int zzve;
    private final int zzvh;
    private final String zzvi;
    private final String zzvk;
    private final Bundle zzvm;
    private final String zzvo;
    private final boolean zzvq;

    public static final class zza {
        private Date zzbg;
        private Location zzbk;
        private boolean zzqs = false;
        private final Bundle zzvT = new Bundle();
        private final HashSet<String> zzvY = new HashSet();
        private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzvZ = new HashMap();
        private int zzve = -1;
        private int zzvh = -1;
        private String zzvi;
        private String zzvk;
        private final Bundle zzvm = new Bundle();
        private String zzvo;
        private boolean zzvq;
        private final HashSet<String> zzwa = new HashSet();
        private final HashSet<String> zzwb = new HashSet();

        public void setManualImpressionsEnabled(boolean z) {
            this.zzqs = z;
        }

        public void zzF(String str) {
            this.zzvY.add(str);
        }

        public void zzG(String str) {
            this.zzwa.add(str);
        }

        public void zzH(String str) {
            this.zzwa.remove(str);
        }

        public void zzI(String str) {
            this.zzvk = str;
        }

        public void zzJ(String str) {
            this.zzvi = str;
        }

        public void zzK(String str) {
            this.zzvo = str;
        }

        public void zzL(String str) {
            this.zzwb.add(str);
        }

        @Deprecated
        public void zza(NetworkExtras networkExtras) {
            if (networkExtras instanceof AdMobExtras) {
                zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
            } else {
                this.zzvZ.put(networkExtras.getClass(), networkExtras);
            }
        }

        public void zza(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zzvT.putBundle(cls.getName(), bundle);
        }

        public void zza(Date date) {
            this.zzbg = date;
        }

        public void zzb(Location location) {
            this.zzbk = location;
        }

        public void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
            if (this.zzvT.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
                this.zzvT.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            this.zzvT.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
        }

        public void zzd(String str, String str2) {
            this.zzvm.putString(str, str2);
        }

        public void zzm(boolean z) {
            this.zzvh = z ? 1 : 0;
        }

        public void zzn(boolean z) {
            this.zzvq = z;
        }

        public void zzr(int i) {
            this.zzve = i;
        }
    }

    public zzad(zza com_google_android_gms_ads_internal_client_zzad_zza) {
        this(com_google_android_gms_ads_internal_client_zzad_zza, null);
    }

    public zzad(zza com_google_android_gms_ads_internal_client_zzad_zza, SearchAdRequest searchAdRequest) {
        this.zzbg = com_google_android_gms_ads_internal_client_zzad_zza.zzbg;
        this.zzvk = com_google_android_gms_ads_internal_client_zzad_zza.zzvk;
        this.zzve = com_google_android_gms_ads_internal_client_zzad_zza.zzve;
        this.zzbi = Collections.unmodifiableSet(com_google_android_gms_ads_internal_client_zzad_zza.zzvY);
        this.zzbk = com_google_android_gms_ads_internal_client_zzad_zza.zzbk;
        this.zzqs = com_google_android_gms_ads_internal_client_zzad_zza.zzqs;
        this.zzvT = com_google_android_gms_ads_internal_client_zzad_zza.zzvT;
        this.zzvU = Collections.unmodifiableMap(com_google_android_gms_ads_internal_client_zzad_zza.zzvZ);
        this.zzvi = com_google_android_gms_ads_internal_client_zzad_zza.zzvi;
        this.zzvo = com_google_android_gms_ads_internal_client_zzad_zza.zzvo;
        this.zzvV = searchAdRequest;
        this.zzvh = com_google_android_gms_ads_internal_client_zzad_zza.zzvh;
        this.zzvW = Collections.unmodifiableSet(com_google_android_gms_ads_internal_client_zzad_zza.zzwa);
        this.zzvm = com_google_android_gms_ads_internal_client_zzad_zza.zzvm;
        this.zzvX = Collections.unmodifiableSet(com_google_android_gms_ads_internal_client_zzad_zza.zzwb);
        this.zzvq = com_google_android_gms_ads_internal_client_zzad_zza.zzvq;
    }

    public Date getBirthday() {
        return this.zzbg;
    }

    public String getContentUrl() {
        return this.zzvk;
    }

    public Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzvT.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle != null ? bundle.getBundle(cls.getName()) : null;
    }

    public Bundle getCustomTargeting() {
        return this.zzvm;
    }

    public int getGender() {
        return this.zzve;
    }

    public Set<String> getKeywords() {
        return this.zzbi;
    }

    public Location getLocation() {
        return this.zzbk;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zzqs;
    }

    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (NetworkExtras) this.zzvU.get(cls);
    }

    public Bundle getNetworkExtrasBundle(Class<? extends MediationAdapter> cls) {
        return this.zzvT.getBundle(cls.getName());
    }

    public String getPublisherProvidedId() {
        return this.zzvi;
    }

    public boolean isDesignedForFamilies() {
        return this.zzvq;
    }

    public boolean isTestDevice(Context context) {
        return this.zzvW.contains(zzm.zzdQ().zzP(context));
    }

    public String zzdY() {
        return this.zzvo;
    }

    public SearchAdRequest zzdZ() {
        return this.zzvV;
    }

    public Map<Class<? extends NetworkExtras>, NetworkExtras> zzea() {
        return this.zzvU;
    }

    public Bundle zzeb() {
        return this.zzvT;
    }

    public int zzec() {
        return this.zzvh;
    }

    public Set<String> zzed() {
        return this.zzvX;
    }
}
