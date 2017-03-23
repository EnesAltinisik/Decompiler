package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzig
public final class zzil {
    private int mOrientation = -1;
    private String zzAE;
    private final AdRequestInfoParcel zzFm;
    private List<String> zzKx;
    private String zzNA = "";
    private boolean zzNB = false;
    private RewardItemParcel zzNC;
    private List<String> zzND;
    private List<String> zzNE;
    private boolean zzNF = false;
    private AutoClickProtectionConfigurationParcel zzNG;
    private boolean zzNH = false;
    private String zzNI;
    private List<String> zzNJ;
    private String zzNK;
    private boolean zzNL;
    private String zzNl;
    private String zzNm;
    private List<String> zzNn;
    private String zzNo;
    private String zzNp;
    private List<String> zzNq;
    private long zzNr = -1;
    private boolean zzNs = false;
    private final long zzNt = -1;
    private long zzNu = -1;
    private boolean zzNv = false;
    private boolean zzNw = false;
    private boolean zzNx = false;
    private boolean zzNy = true;
    private int zzNz = 0;
    private boolean zzwo = false;

    public zzil(AdRequestInfoParcel adRequestInfoParcel) {
        this.zzFm = adRequestInfoParcel;
    }

    private void zzA(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Gws-Query-Id");
        if (list != null && !list.isEmpty()) {
            this.zzNA = (String) list.get(0);
        }
    }

    private void zzB(Map<String, List<String>> map) {
        String zzd = zzd(map, "X-Afma-Fluid");
        if (zzd != null && zzd.equals("height")) {
            this.zzNB = true;
        }
    }

    private void zzC(Map<String, List<String>> map) {
        this.zzwo = "native_express".equals(zzd(map, "X-Afma-Ad-Format"));
    }

    private void zzD(Map<String, List<String>> map) {
        this.zzNC = RewardItemParcel.zzaG(zzd(map, "X-Afma-Rewards"));
    }

    private void zzE(Map<String, List<String>> map) {
        if (this.zzND == null) {
            this.zzND = zzf(map, "X-Afma-Reward-Video-Start-Urls");
        }
    }

    private void zzF(Map<String, List<String>> map) {
        if (this.zzNE == null) {
            this.zzNE = zzf(map, "X-Afma-Reward-Video-Complete-Urls");
        }
    }

    private void zzG(Map<String, List<String>> map) {
        this.zzNF |= zzg(map, "X-Afma-Use-Displayed-Impression");
    }

    private void zzH(Map<String, List<String>> map) {
        this.zzNH |= zzg(map, "X-Afma-Auto-Collect-Location");
    }

    private void zzI(Map<String, List<String>> map) {
        List zzf = zzf(map, "X-Afma-Remote-Ping-Urls");
        if (zzf != null) {
            this.zzNJ = zzf;
        }
    }

    private void zzJ(Map<String, List<String>> map) {
        Object zzd = zzd(map, "X-Afma-Auto-Protection-Configuration");
        if (zzd == null || TextUtils.isEmpty(zzd)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.zzNo)) {
                buildUpon.appendQueryParameter("debugDialog", this.zzNo);
            }
            boolean booleanValue = ((Boolean) zzcu.zzxh.get()).booleanValue();
            String[] strArr = new String[1];
            String valueOf = String.valueOf(buildUpon.toString());
            String valueOf2 = String.valueOf("navigationURL");
            strArr[0] = new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append(valueOf).append("&").append(valueOf2).append("={NAVIGATION_URL}").toString();
            this.zzNG = new AutoClickProtectionConfigurationParcel(booleanValue, Arrays.asList(strArr));
            return;
        }
        try {
            this.zzNG = AutoClickProtectionConfigurationParcel.zzg(new JSONObject(zzd));
        } catch (Throwable e) {
            zzb.zzd("Error parsing configuration JSON", e);
            this.zzNG = new AutoClickProtectionConfigurationParcel();
        }
    }

    private void zzK(Map<String, List<String>> map) {
        this.zzNI = zzd(map, "Set-Cookie");
    }

    private void zzL(Map<String, List<String>> map) {
        this.zzNK = zzd(map, "X-Afma-Safe-Browsing");
    }

    static String zzd(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    static long zze(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                zzb.zzaW(new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(str2).length()).append("Could not parse float from ").append(str).append(" header: ").append(str2).toString());
            }
        }
        return -1;
    }

    static List<String> zzf(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private boolean zzg(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() || !Boolean.valueOf((String) list.get(0)).booleanValue()) ? false : true;
    }

    private void zzk(Map<String, List<String>> map) {
        this.zzNl = zzd(map, "X-Afma-Ad-Size");
    }

    private void zzl(Map<String, List<String>> map) {
        List zzf = zzf(map, "X-Afma-Click-Tracking-Urls");
        if (zzf != null) {
            this.zzNn = zzf;
        }
    }

    private void zzm(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.zzNo = (String) list.get(0);
        }
    }

    private void zzn(Map<String, List<String>> map) {
        List zzf = zzf(map, "X-Afma-Tracking-Urls");
        if (zzf != null) {
            this.zzNq = zzf;
        }
    }

    private void zzo(Map<String, List<String>> map) {
        long zze = zze(map, "X-Afma-Interstitial-Timeout");
        if (zze != -1) {
            this.zzNr = zze;
        }
    }

    private void zzp(Map<String, List<String>> map) {
        this.zzNp = zzd(map, "X-Afma-ActiveView");
    }

    private void zzq(Map<String, List<String>> map) {
        this.zzNw = "native".equals(zzd(map, "X-Afma-Ad-Format"));
    }

    private void zzr(Map<String, List<String>> map) {
        this.zzNv |= zzg(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void zzs(Map<String, List<String>> map) {
        this.zzNs |= zzg(map, "X-Afma-Mediation");
    }

    private void zzt(Map<String, List<String>> map) {
        this.zzNL |= zzg(map, "X-Afma-Render-In-Browser");
    }

    private void zzu(Map<String, List<String>> map) {
        List zzf = zzf(map, "X-Afma-Manual-Tracking-Urls");
        if (zzf != null) {
            this.zzKx = zzf;
        }
    }

    private void zzv(Map<String, List<String>> map) {
        long zze = zze(map, "X-Afma-Refresh-Rate");
        if (zze != -1) {
            this.zzNu = zze;
        }
    }

    private void zzw(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.mOrientation = zzu.zzcm().zzjf();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.mOrientation = zzu.zzcm().zzje();
            }
        }
    }

    private void zzx(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Use-HTTPS");
        if (list != null && !list.isEmpty()) {
            this.zzNx = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void zzy(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.zzNy = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void zzz(Map<String, List<String>> map) {
        List<String> zzf = zzf(map, "X-Afma-OAuth-Token-Status");
        this.zzNz = 0;
        if (zzf != null) {
            for (String str : zzf) {
                if ("Clear".equalsIgnoreCase(str)) {
                    this.zzNz = 1;
                    return;
                } else if ("No-Op".equalsIgnoreCase(str)) {
                    this.zzNz = 0;
                    return;
                }
            }
        }
    }

    public void zzb(String str, Map<String, List<String>> map, String str2) {
        this.zzNm = str;
        this.zzAE = str2;
        zzj((Map) map);
    }

    public AdResponseParcel zzj(long j) {
        return new AdResponseParcel(this.zzFm, this.zzNm, this.zzAE, this.zzNn, this.zzNq, this.zzNr, this.zzNs, -1, this.zzKx, this.zzNu, this.mOrientation, this.zzNl, j, this.zzNo, this.zzNp, this.zzNv, this.zzNw, this.zzNx, this.zzNy, false, this.zzNz, this.zzNA, this.zzNB, this.zzwo, this.zzNC, this.zzND, this.zzNE, this.zzNF, this.zzNG, this.zzNH, this.zzNI, this.zzNJ, this.zzNK, this.zzNL);
    }

    public void zzj(Map<String, List<String>> map) {
        zzk(map);
        zzl(map);
        zzm(map);
        zzn(map);
        zzo(map);
        zzs(map);
        zzu(map);
        zzv(map);
        zzw(map);
        zzp(map);
        zzx(map);
        zzr(map);
        zzq(map);
        zzy(map);
        zzz(map);
        zzA(map);
        zzB(map);
        zzC(map);
        zzD(map);
        zzE(map);
        zzF(map);
        zzG(map);
        zzH(map);
        zzK(map);
        zzJ(map);
        zzI(map);
        zzL(map);
        zzt(map);
    }
}
