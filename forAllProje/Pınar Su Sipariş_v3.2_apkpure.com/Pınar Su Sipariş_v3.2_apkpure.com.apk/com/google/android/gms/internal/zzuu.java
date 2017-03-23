package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzyp.zza;
import com.google.android.gms.tagmanager.zzax;
import com.google.android.gms.tagmanager.zzba;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzuu {
    private final Context mContext;
    private final String zzbnR;
    private int zzbqL;
    private final zzba zzbsk;
    private final zzax zzbsq;
    private final zzabc zzbtc;
    private final zzuw zzbtd = new zzuw();
    private final zzabn zzbte = new zzabn(new HashMap(50));
    private final zzabn zzbtf = new zzabn(new HashMap(10));
    private final Set<String> zzbtg = new HashSet();
    private zzzd zzbth;
    private zzud zzbti;
    private final zzc zzbtj = new zzc(this) {
        final /* synthetic */ zzuu a;

        {
            this.a = r1;
        }

        public zzud zzLr() {
            return this.a.zzbti;
        }
    };

    public interface zzc {
        zzud zzLr();
    }

    private class a implements zza {
        final /* synthetic */ zzuu a;

        private a(zzuu com_google_android_gms_internal_zzuu) {
            this.a = com_google_android_gms_internal_zzuu;
        }

        public Object zzd(String str, Map<String, Object> map) {
            try {
                this.a.zzbsq.zze(str, map);
            } catch (RemoteException e) {
                String str2 = "Error calling customEvaluator proxy:";
                String valueOf = String.valueOf(e.getMessage());
                zzun.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return null;
        }
    }

    private class b implements zza {
        final /* synthetic */ zzuu a;

        private b(zzuu com_google_android_gms_internal_zzuu) {
            this.a = com_google_android_gms_internal_zzuu;
        }

        public Object zzd(String str, Map<String, Object> map) {
            try {
                return this.a.zzbsq.zzf(str, map);
            } catch (RemoteException e) {
                String str2 = "Error calling customEvaluator proxy:";
                String valueOf = String.valueOf(e.getMessage());
                zzun.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
        }
    }

    public zzuu(Context context, String str, zzabc com_google_android_gms_internal_zzabc, zzabf com_google_android_gms_internal_zzabf, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) {
        zzaa.zzb((Object) com_google_android_gms_internal_zzabc, (Object) "Internal Error: Container resource cannot be null");
        zzaa.zzb((Object) com_google_android_gms_internal_zzabf, (Object) "Internal Error: Runtime resource cannot be null");
        zzaa.zzh(str, "Internal Error: ContainerId cannot be empty");
        zzaa.zzz(com_google_android_gms_tagmanager_zzba);
        zzaa.zzz(com_google_android_gms_tagmanager_zzax);
        this.mContext = context;
        this.zzbnR = str;
        this.zzbtc = com_google_android_gms_internal_zzabc;
        this.zzbsk = com_google_android_gms_tagmanager_zzba;
        this.zzbsq = com_google_android_gms_tagmanager_zzax;
        zzLk();
        zzLl();
        zzLm();
        zzLn();
        zzLo();
        zza(com_google_android_gms_internal_zzabf);
        zzLp();
    }

    private String zzB(String str, int i) {
        switch (i) {
            case 12:
                return zzhb(str);
            default:
                zzun.e("Unsupported Value Escaping: " + i);
                return str;
        }
    }

    private String zzKs() {
        if (this.zzbqL <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.zzbqL));
        for (int i = 2; i < this.zzbqL; i++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    private void zzLk() {
        this.zzbtd.zza("1", new zzabk(new zzwd()));
        this.zzbtd.zza("12", new zzabk(new zzwe()));
        this.zzbtd.zza("18", new zzabk(new zzwf()));
        this.zzbtd.zza("19", new zzabk(new zzwg()));
        this.zzbtd.zza("20", new zzabk(new zzwh()));
        this.zzbtd.zza("21", new zzabk(new zzwi()));
        this.zzbtd.zza("23", new zzabk(new zzwj()));
        this.zzbtd.zza("24", new zzabk(new zzwk()));
        this.zzbtd.zza("27", new zzabk(new zzwl()));
        this.zzbtd.zza("28", new zzabk(new zzwm()));
        this.zzbtd.zza("29", new zzabk(new zzwn()));
        this.zzbtd.zza("30", new zzabk(new zzwo()));
        this.zzbtd.zza("32", new zzabk(new zzwp()));
        this.zzbtd.zza("33", new zzabk(new zzwp()));
        this.zzbtd.zza("34", new zzabk(new zzwq()));
        this.zzbtd.zza("35", new zzabk(new zzwq()));
        this.zzbtd.zza("39", new zzabk(new zzwr()));
        this.zzbtd.zza("40", new zzabk(new zzws()));
    }

    private void zzLl() {
        this.zzbtd.zza("0", new zzabk(new zzxp()));
        this.zzbtd.zza("10", new zzabk(new zzxq()));
        this.zzbtd.zza("25", new zzabk(new zzxr()));
        this.zzbtd.zza("26", new zzabk(new zzxs()));
        this.zzbtd.zza("37", new zzabk(new zzxt()));
    }

    private void zzLm() {
        this.zzbtd.zza("2", new zzabk(new zzwt()));
        this.zzbtd.zza("3", new zzabk(new zzwu()));
        this.zzbtd.zza("4", new zzabk(new zzwv()));
        this.zzbtd.zza("5", new zzabk(new zzww()));
        this.zzbtd.zza("6", new zzabk(new zzwx()));
        this.zzbtd.zza("7", new zzabk(new zzwy()));
        this.zzbtd.zza("8", new zzabk(new zzwz()));
        this.zzbtd.zza("9", new zzabk(new zzww()));
        this.zzbtd.zza("13", new zzabk(new zzxa()));
        this.zzbtd.zza("47", new zzabk(new zzxb()));
        this.zzbtd.zza("15", new zzabk(new zzxc()));
        this.zzbtd.zza("48", new zzabk(new zzxd(this)));
        zzvh com_google_android_gms_internal_zzxe = new zzxe();
        this.zzbtd.zza("16", new zzabk(com_google_android_gms_internal_zzxe));
        this.zzbtd.zza("17", new zzabk(com_google_android_gms_internal_zzxe));
        this.zzbtd.zza("22", new zzabk(new zzxg()));
        this.zzbtd.zza("45", new zzabk(new zzxh()));
        this.zzbtd.zza("46", new zzabk(new zzxi()));
        this.zzbtd.zza("36", new zzabk(new zzxj()));
        this.zzbtd.zza("43", new zzabk(new zzxk()));
        this.zzbtd.zza("38", new zzabk(new zzxl()));
        this.zzbtd.zza("44", new zzabk(new zzxm()));
        this.zzbtd.zza("41", new zzabk(new zzxn()));
        this.zzbtd.zza("42", new zzabk(new zzxo()));
    }

    private void zzLn() {
        zza(zzad.CONTAINS, new zzzy());
        zza(zzad.ENDS_WITH, new zzzz());
        zza(zzad.EQUALS, new zzaaa());
        zza(zzad.GREATER_EQUALS, new zzaab());
        zza(zzad.GREATER_THAN, new zzaac());
        zza(zzad.LESS_EQUALS, new zzaad());
        zza(zzad.LESS_THAN, new zzaae());
        zza(zzad.REGEX, new zzaag());
        zza(zzad.STARTS_WITH, new zzaah());
        this.zzbte.zzc("advertiserId", new zzabk(new zzyt(this.mContext)));
        this.zzbte.zzc("advertiserTrackingEnabled", new zzabk(new zzyu()));
        this.zzbte.zzc("adwordsClickReferrer", new zzabk(new zzyv(this.mContext, this.zzbtj)));
        this.zzbte.zzc("applicationId", new zzabk(new zzyw(this.mContext)));
        this.zzbte.zzc("applicationName", new zzabk(new zzyx(this.mContext)));
        this.zzbte.zzc("applicationVersion", new zzabk(new zzyy(this.mContext)));
        this.zzbte.zzc("applicationVersionName", new zzabk(new zzyz(this.mContext)));
        this.zzbte.zzc("arbitraryPixieMacro", new zzabk(new zzyq(1, this.zzbtd)));
        this.zzbte.zzc("carrier", new zzabk(new zzza(this.mContext)));
        this.zzbte.zzc("constant", new zzabk(new zzxj()));
        this.zzbte.zzc("containerId", new zzabk(new zzzb(new zzabp(this.zzbnR))));
        this.zzbte.zzc("containerVersion", new zzabk(new zzzb(new zzabp(this.zzbtc.getVersion()))));
        this.zzbte.zzc("customMacro", new zzabk(new zzyp(new b())));
        this.zzbte.zzc("deviceId", new zzabk(new zzze(this.mContext)));
        this.zzbte.zzc("deviceName", new zzabk(new zzzf()));
        this.zzbte.zzc("encode", new zzabk(new zzzg()));
        this.zzbte.zzc("encrypt", new zzabk(new zzzh()));
        this.zzbte.zzc("event", new zzabk(new zzzc()));
        this.zzbte.zzc("eventParameters", new zzabk(new zzzi(this.zzbtj)));
        this.zzbte.zzc("version", new zzabk(new zzzj()));
        this.zzbte.zzc("hashcode", new zzabk(new zzzk()));
        this.zzbte.zzc("installReferrer", new zzabk(new zzzl(this.mContext)));
        this.zzbte.zzc("join", new zzabk(new zzzm()));
        this.zzbte.zzc("language", new zzabk(new zzzn()));
        this.zzbte.zzc("locale", new zzabk(new zzzo()));
        this.zzbte.zzc("adWordsUniqueId", new zzabk(new zzzq(this.mContext)));
        this.zzbte.zzc("osVersion", new zzabk(new zzzr()));
        this.zzbte.zzc("platform", new zzabk(new zzzs()));
        this.zzbte.zzc("random", new zzabk(new zzzt()));
        this.zzbte.zzc("regexGroup", new zzabk(new zzzu()));
        this.zzbte.zzc("resolution", new zzabk(new zzzw(this.mContext)));
        this.zzbte.zzc("runtimeVersion", new zzabk(new zzzv()));
        this.zzbte.zzc("sdkVersion", new zzabk(new zzzx()));
        this.zzbth = new zzzd();
        this.zzbte.zzc("currentTime", new zzabk(this.zzbth));
        this.zzbte.zzc("userProperty", new zzabk(new zzzp(this.mContext, this.zzbtj)));
        this.zzbte.zzc("arbitraryPixel", new zzabk(new zzaak(zzub.zzbr(this.mContext))));
        this.zzbte.zzc("customTag", new zzabk(new zzyp(new a())));
        this.zzbte.zzc("universalAnalytics", new zzabk(new zzaal(this.mContext, this.zzbtj)));
        this.zzbte.zzc("queueRequest", new zzabk(new zzaai(zzub.zzbr(this.mContext))));
        this.zzbte.zzc("sendMeasurement", new zzabk(new zzaaj(this.zzbsk, this.zzbtj)));
        this.zzbte.zzc("arbitraryPixieTag", new zzabk(new zzyq(0, this.zzbtd)));
        this.zzbte.zzc("suppressPassthrough", new zzabk(new zzys(this.mContext, this.zzbtj)));
    }

    private void zzLo() {
        this.zzbtf.zzc("decodeURI", new zzabk(new zzyk()));
        this.zzbtf.zzc("decodeURIComponent", new zzabk(new zzyl()));
        this.zzbtf.zzc("encodeURI", new zzabk(new zzym()));
        this.zzbtf.zzc("encodeURIComponent", new zzabk(new zzyn()));
        this.zzbtf.zzc("log", new zzabk(new zzyr()));
        this.zzbtf.zzc("isArray", new zzabk(new zzyo()));
    }

    private void zzLp() {
        zzabh com_google_android_gms_internal_zzabn = new zzabn(new HashMap(1));
        com_google_android_gms_internal_zzabn.zzc("mobile", this.zzbte);
        com_google_android_gms_internal_zzabn.zzc("common", this.zzbtf);
        this.zzbtd.zza("gtmUtils", com_google_android_gms_internal_zzabn);
        zzabh com_google_android_gms_internal_zzabn2 = new zzabn(new HashMap((Map) this.zzbte.zzMk()));
        com_google_android_gms_internal_zzabn2.zzMu();
        zzabh com_google_android_gms_internal_zzabn3 = new zzabn(new HashMap((Map) this.zzbtf.zzMk()));
        com_google_android_gms_internal_zzabn3.zzMu();
        if (this.zzbtd.has("main") && (this.zzbtd.zzhc("main") instanceof zzabk)) {
            List arrayList = new ArrayList();
            arrayList.add(com_google_android_gms_internal_zzabn);
            zzabq.zza(this.zzbtd, new zzabo("main", arrayList));
        }
        this.zzbte.zzc("base", com_google_android_gms_internal_zzabn2);
        this.zzbtf.zzc("base", com_google_android_gms_internal_zzabn3);
        com_google_android_gms_internal_zzabn.zzMu();
        this.zzbte.zzMu();
        this.zzbtf.zzMu();
    }

    private zzabh<?> zza(zzabg com_google_android_gms_internal_zzabg) {
        switch (com_google_android_gms_internal_zzabg.getType()) {
            case 1:
                try {
                    return new zzabj(Double.valueOf(Double.parseDouble((String) com_google_android_gms_internal_zzabg.getValue())));
                } catch (NumberFormatException e) {
                    return new zzabp((String) com_google_android_gms_internal_zzabg.getValue());
                }
            case 2:
                List<zzabg> list = (List) com_google_android_gms_internal_zzabg.getValue();
                List arrayList = new ArrayList(list.size());
                for (zzabg zza : list) {
                    arrayList.add(zza(zza));
                }
                return new zzabm(arrayList);
            case 3:
                Map map = (Map) com_google_android_gms_internal_zzabg.getValue();
                Map hashMap = new HashMap(map.size());
                for (Entry entry : map.entrySet()) {
                    hashMap.put(zzvi.zzd(zza((zzabg) entry.getKey())), zza((zzabg) entry.getValue()));
                }
                return new zzabn(hashMap);
            case 4:
                zzabh<?> zzgZ = zzgZ((String) com_google_android_gms_internal_zzabg.getValue());
                return (!(zzgZ instanceof zzabp) || com_google_android_gms_internal_zzabg.zzMh().isEmpty()) ? zzgZ : new zzabp(zzc((String) ((zzabp) zzgZ).zzMk(), com_google_android_gms_internal_zzabg.zzMh()));
            case 5:
                return new zzabp((String) com_google_android_gms_internal_zzabg.getValue());
            case 6:
                return new zzabj(Double.valueOf(((Integer) com_google_android_gms_internal_zzabg.getValue()).doubleValue()));
            case 7:
                StringBuilder stringBuilder = new StringBuilder();
                for (zzabg zza2 : (List) com_google_android_gms_internal_zzabg.getValue()) {
                    stringBuilder.append(zzvi.zzd(zza(zza2)));
                }
                return new zzabp(stringBuilder.toString());
            case 8:
                return new zzabi((Boolean) com_google_android_gms_internal_zzabg.getValue());
            default:
                throw new IllegalStateException("Attempting to expand unknown Value type " + com_google_android_gms_internal_zzabg.getType() + ".");
        }
    }

    private void zza(zzabf com_google_android_gms_internal_zzabf) {
        for (zzvg com_google_android_gms_internal_zzvg : com_google_android_gms_internal_zzabf.zzMf()) {
            com_google_android_gms_internal_zzvg.zza(this.zzbtd);
            this.zzbtd.zza(com_google_android_gms_internal_zzvg.getName(), new zzabk(com_google_android_gms_internal_zzvg));
        }
    }

    private void zza(zzad com_google_android_gms_internal_zzad, zzvh com_google_android_gms_internal_zzvh) {
        this.zzbte.zzc(zzvf.zza(com_google_android_gms_internal_zzad), new zzabk(com_google_android_gms_internal_zzvh));
    }

    private boolean zza(zzabd com_google_android_gms_internal_zzabd) {
        zzabg com_google_android_gms_internal_zzabg = (zzabg) com_google_android_gms_internal_zzabd.zzLY().get(zzae.DISPATCH_ON_FIRE.toString());
        return com_google_android_gms_internal_zzabg != null && com_google_android_gms_internal_zzabg.getType() == 8 && ((Boolean) com_google_android_gms_internal_zzabg.getValue()).booleanValue();
    }

    private Map<String, zzabh<?>> zzak(Map<String, zzabg> map) {
        Map<String, zzabh<?>> hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), zza((zzabg) entry.getValue()));
        }
        return hashMap;
    }

    private zzabh zzal(Map<String, zzabh<?>> map) {
        if (map == null) {
            zzun.e("Cannot access the function parameters.");
            return zzabl.zzbvN;
        }
        zzabh com_google_android_gms_internal_zzabh = (zzabh) map.get(zzae.FUNCTION.toString());
        if (com_google_android_gms_internal_zzabh instanceof zzabp) {
            zzabo com_google_android_gms_internal_zzabo;
            String str = (String) ((zzabp) com_google_android_gms_internal_zzabh).zzMk();
            if (this.zzbtd.has(str)) {
                Map hashMap = new HashMap();
                for (Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()).startsWith("vtp_")) {
                        hashMap.put(((String) entry.getKey()).substring(4), (zzabh) entry.getValue());
                    }
                }
                List arrayList = new ArrayList();
                arrayList.add(new zzabn(hashMap));
                com_google_android_gms_internal_zzabo = new zzabo(str, arrayList);
            } else if (zzha(str)) {
                com_google_android_gms_internal_zzabo = zzh(str, map);
            } else {
                zzun.e(new StringBuilder(String.valueOf(str).length() + 30).append("functionId '").append(str).append("' is not supported").toString());
                return zzabl.zzbvN;
            }
            if (com_google_android_gms_internal_zzabo == null) {
                zzun.e("Internal error: failed to convert function to a valid statement");
                return zzabl.zzbvN;
            }
            String str2 = "Executing: ";
            str = String.valueOf(com_google_android_gms_internal_zzabo.zzMw());
            zzun.v(str.length() != 0 ? str2.concat(str) : new String(str2));
            zzabh zza = zzabq.zza(this.zzbtd, com_google_android_gms_internal_zzabo);
            return ((zza instanceof zzabl) && ((zzabl) zza).zzMr()) ? (zzabh) ((zzabl) zza).zzMk() : zza;
        } else {
            zzun.e("No function id in properties");
            return zzabl.zzbvN;
        }
    }

    private String zzc(String str, List<Integer> list) {
        for (Integer intValue : list) {
            str = zzB(str, intValue.intValue());
        }
        return str;
    }

    private zzabh<?> zzgZ(String str) {
        this.zzbqL++;
        String valueOf = String.valueOf(zzKs());
        zzun.v(new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(str).length()).append(valueOf).append("Beginning to evaluate variable ").append(str).toString());
        if (this.zzbtg.contains(str)) {
            this.zzbqL--;
            String valueOf2 = String.valueOf(this.zzbtg.toString());
            throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 77) + String.valueOf(valueOf2).length()).append("Macro cycle detected.  Current macro reference: ").append(str).append(". Previous macro references: ").append(valueOf2).toString());
        }
        this.zzbtg.add(str);
        zzabd zzhq = this.zzbtc.zzhq(str);
        if (zzhq == null) {
            this.zzbqL--;
            this.zzbtg.remove(str);
            valueOf2 = String.valueOf(zzKs());
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf2).length() + 36) + String.valueOf(str).length()).append(valueOf2).append("Attempting to resolve unknown macro ").append(str).toString());
        }
        zzabh<?> zzal = zzal(zzak(zzhq.zzLY()));
        valueOf2 = String.valueOf(zzKs());
        zzun.v(new StringBuilder((String.valueOf(valueOf2).length() + 25) + String.valueOf(str).length()).append(valueOf2).append("Done evaluating variable ").append(str).toString());
        this.zzbqL--;
        this.zzbtg.remove(str);
        return zzal;
    }

    private zzabo zzh(String str, Map<String, zzabh<?>> map) {
        try {
            return zzvf.zza(str, map, zzLq());
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzun.e(new StringBuilder((String.valueOf(str).length() + 30) + String.valueOf(valueOf).length()).append("Incorrect keys for function ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    private boolean zzha(String str) {
        String zzhe = zzvf.zzhe(str);
        return zzhe != null && this.zzbte.zzht(zzhe);
    }

    private String zzhb(String str) {
        try {
            str = URLEncoder.encode(str, Constants.ENCODING).replaceAll("\\+", "%20");
        } catch (Throwable e) {
            zzun.zzb("Escape URI: unsupported encoding", e);
        }
        return str;
    }

    public void dispatch() {
        zzub.zzbr(this.mContext).dispatch();
    }

    zzuw zzLq() {
        return this.zzbtd;
    }

    zzabh<?> zza(zzabe com_google_android_gms_internal_zzabe, Map<zzabd, zzabh<?>> map) {
        String valueOf = String.valueOf(com_google_android_gms_internal_zzabe);
        zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Evaluating trigger ").append(valueOf).toString());
        for (zzabd com_google_android_gms_internal_zzabd : com_google_android_gms_internal_zzabe.zzMb()) {
            zzabh com_google_android_gms_internal_zzabh = (zzabh) map.get(com_google_android_gms_internal_zzabd);
            if (com_google_android_gms_internal_zzabh == null) {
                com_google_android_gms_internal_zzabh = zzb(com_google_android_gms_internal_zzabd);
                map.put(com_google_android_gms_internal_zzabd, com_google_android_gms_internal_zzabh);
            }
            zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh;
            if (com_google_android_gms_internal_zzabh2 == zzabl.zzbvM) {
                return zzabl.zzbvM;
            }
            if (((Boolean) ((zzabi) com_google_android_gms_internal_zzabh2).zzMk()).booleanValue()) {
                return new zzabi(Boolean.valueOf(false));
            }
        }
        for (zzabd com_google_android_gms_internal_zzabd2 : com_google_android_gms_internal_zzabe.zzMa()) {
            com_google_android_gms_internal_zzabh = (zzabh) map.get(com_google_android_gms_internal_zzabd2);
            if (com_google_android_gms_internal_zzabh == null) {
                com_google_android_gms_internal_zzabh = zzb(com_google_android_gms_internal_zzabd2);
                map.put(com_google_android_gms_internal_zzabd2, com_google_android_gms_internal_zzabh);
            }
            com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh;
            if (com_google_android_gms_internal_zzabh2 == zzabl.zzbvM) {
                return zzabl.zzbvM;
            }
            if (!((Boolean) ((zzabi) com_google_android_gms_internal_zzabh2).zzMk()).booleanValue()) {
                return new zzabi(Boolean.valueOf(false));
            }
        }
        return new zzabi(Boolean.valueOf(true));
    }

    zzabh<?> zzb(zzabd com_google_android_gms_internal_zzabd) {
        this.zzbtg.clear();
        try {
            zzabh<?> zzal = zzal(zzak(com_google_android_gms_internal_zzabd.zzLY()));
            if (zzal instanceof zzabi) {
                return zzal;
            }
            zzun.e("Predicate must return a boolean value");
            return new zzabi(Boolean.valueOf(false));
        } catch (IllegalStateException e) {
            zzun.e("Error evaluating predicate.");
            return zzabl.zzbvM;
        }
    }

    public void zzb(zzud com_google_android_gms_internal_zzud) {
        this.zzbtd.zza("gtm.globals.eventName", new zzabp(com_google_android_gms_internal_zzud.zzKU()));
        this.zzbth.zza(com_google_android_gms_internal_zzud);
        this.zzbti = com_google_android_gms_internal_zzud;
        Set<zzabd> hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        Map hashMap = new HashMap();
        for (zzabe com_google_android_gms_internal_zzabe : this.zzbtc.zzLW()) {
            String valueOf;
            if (com_google_android_gms_internal_zzabe.zzMc().isEmpty() && com_google_android_gms_internal_zzabe.zzMd().isEmpty()) {
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzabe);
                zzun.v(new StringBuilder(String.valueOf(valueOf2).length() + 64).append("Trigger is not being evaluated since it has no associated tags: ").append(valueOf2).toString());
            } else {
                zzabh zza = zza(com_google_android_gms_internal_zzabe, hashMap);
                if (zza == zzabl.zzbvM) {
                    valueOf = String.valueOf(com_google_android_gms_internal_zzabe);
                    zzun.zzaW(new StringBuilder(String.valueOf(valueOf).length() + 41).append("Error encounted while evaluating trigger ").append(valueOf).toString());
                    if (!com_google_android_gms_internal_zzabe.zzMd().isEmpty()) {
                        valueOf = String.valueOf(com_google_android_gms_internal_zzabe.zzMd());
                        zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Blocking tags: ").append(valueOf).toString());
                        hashSet2.addAll(com_google_android_gms_internal_zzabe.zzMd());
                    }
                } else if (((Boolean) ((zzabi) zza).zzMk()).booleanValue()) {
                    valueOf = String.valueOf(com_google_android_gms_internal_zzabe);
                    zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Trigger is firing: ").append(valueOf).toString());
                    if (!com_google_android_gms_internal_zzabe.zzMc().isEmpty()) {
                        valueOf = String.valueOf(com_google_android_gms_internal_zzabe.zzMc());
                        zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Adding tags to firing candidates: ").append(valueOf).toString());
                        hashSet.addAll(com_google_android_gms_internal_zzabe.zzMc());
                    }
                    if (!com_google_android_gms_internal_zzabe.zzMd().isEmpty()) {
                        valueOf = String.valueOf(com_google_android_gms_internal_zzabe.zzMd());
                        zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Blocking disabled tags: ").append(valueOf).toString());
                        hashSet2.addAll(com_google_android_gms_internal_zzabe.zzMd());
                    }
                }
            }
        }
        hashSet.removeAll(hashSet2);
        Object obj = null;
        for (zzabd com_google_android_gms_internal_zzabd : hashSet) {
            Object obj2;
            this.zzbtg.clear();
            String valueOf3 = String.valueOf(com_google_android_gms_internal_zzabd);
            zzun.v(new StringBuilder(String.valueOf(valueOf3).length() + 21).append("Executing firing tag ").append(valueOf3).toString());
            try {
                zzal(zzak(com_google_android_gms_internal_zzabd.zzLY()));
                if (zza(com_google_android_gms_internal_zzabd)) {
                    obj = 1;
                    valueOf2 = String.valueOf(com_google_android_gms_internal_zzabd);
                    zzun.v(new StringBuilder(String.valueOf(valueOf2).length() + 36).append("Tag configured to dispatch on fire: ").append(valueOf2).toString());
                }
                obj2 = obj;
            } catch (IllegalStateException e) {
                valueOf3 = "Error firing tag: ";
                valueOf2 = String.valueOf(e.getMessage());
                zzun.e(valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3));
                obj2 = obj;
            }
            obj = obj2;
        }
        this.zzbtd.remove("gtm.globals.eventName");
        if (com_google_android_gms_internal_zzud.zzKX()) {
            valueOf2 = String.valueOf(com_google_android_gms_internal_zzud.zzKU());
            zzun.v(new StringBuilder(String.valueOf(valueOf2).length() + 35).append("Log passthrough event ").append(valueOf2).append(" to Firebase.").toString());
            try {
                this.zzbsk.zza(com_google_android_gms_internal_zzud.zzKW(), com_google_android_gms_internal_zzud.zzKU(), com_google_android_gms_internal_zzud.zzKV(), com_google_android_gms_internal_zzud.currentTimeMillis());
            } catch (RemoteException e2) {
                valueOf = "Error calling measurement proxy:";
                valueOf2 = String.valueOf(e2.getMessage());
                zzun.e(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
        } else {
            valueOf2 = String.valueOf(com_google_android_gms_internal_zzud.zzKU());
            zzun.v(new StringBuilder(String.valueOf(valueOf2).length() + 63).append("Non-passthrough event ").append(valueOf2).append(" doesn't get logged to Firebase directly.").toString());
        }
        if (obj != null) {
            zzun.v("Dispatch called for dispatchOnFire tags.");
            dispatch();
        }
    }

    public zzabh<?> zzgY(String str) {
        if (this.zzbtg.contains(str)) {
            String valueOf = String.valueOf(this.zzbtg.toString());
            throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 77) + String.valueOf(valueOf).length()).append("Macro cycle detected.  Current macro reference: ").append(str).append(". Previous macro references: ").append(valueOf).toString());
        }
        this.zzbqL = 0;
        return zzgZ(str);
    }
}
