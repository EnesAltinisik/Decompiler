package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzagt {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzagt.class.desiredAssertionStatus());
    public static final zzagt zzbPK = new zzagt();
    private zzaho zzbPG = zzahx.zzTL();
    private Integer zzbPL;
    private a zzbPM;
    private zzahu zzbPN = null;
    private zzahi zzbPO = null;
    private zzahu zzbPP = null;
    private zzahi zzbPQ = null;
    private String zzbPR = null;

    private enum a {
        LEFT,
        RIGHT
    }

    private zzagt zzSL() {
        zzagt com_google_android_gms_internal_zzagt = new zzagt();
        com_google_android_gms_internal_zzagt.zzbPL = this.zzbPL;
        com_google_android_gms_internal_zzagt.zzbPN = this.zzbPN;
        com_google_android_gms_internal_zzagt.zzbPO = this.zzbPO;
        com_google_android_gms_internal_zzagt.zzbPP = this.zzbPP;
        com_google_android_gms_internal_zzagt.zzbPQ = this.zzbPQ;
        com_google_android_gms_internal_zzagt.zzbPM = this.zzbPM;
        com_google_android_gms_internal_zzagt.zzbPG = this.zzbPG;
        return com_google_android_gms_internal_zzagt;
    }

    public static zzagt zzaA(Map<String, Object> map) {
        String str;
        zzagt com_google_android_gms_internal_zzagt = new zzagt();
        com_google_android_gms_internal_zzagt.zzbPL = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            com_google_android_gms_internal_zzagt.zzbPN = zzahv.zzaq(map.get("sp"));
            str = (String) map.get("sn");
            if (str != null) {
                com_google_android_gms_internal_zzagt.zzbPO = zzahi.zzig(str);
            }
        }
        if (map.containsKey("ep")) {
            com_google_android_gms_internal_zzagt.zzbPP = zzahv.zzaq(map.get("ep"));
            str = (String) map.get("en");
            if (str != null) {
                com_google_android_gms_internal_zzagt.zzbPQ = zzahi.zzig(str);
            }
        }
        str = (String) map.get("vf");
        if (str != null) {
            com_google_android_gms_internal_zzagt.zzbPM = str.equals("l") ? a.LEFT : a.RIGHT;
        }
        str = (String) map.get("i");
        if (str != null) {
            com_google_android_gms_internal_zzagt.zzbPG = zzaho.zzih(str);
        }
        return com_google_android_gms_internal_zzagt;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzagt com_google_android_gms_internal_zzagt = (zzagt) obj;
        return (this.zzbPL == null ? com_google_android_gms_internal_zzagt.zzbPL != null : !this.zzbPL.equals(com_google_android_gms_internal_zzagt.zzbPL)) ? false : (this.zzbPG == null ? com_google_android_gms_internal_zzagt.zzbPG != null : !this.zzbPG.equals(com_google_android_gms_internal_zzagt.zzbPG)) ? false : (this.zzbPQ == null ? com_google_android_gms_internal_zzagt.zzbPQ != null : !this.zzbPQ.equals(com_google_android_gms_internal_zzagt.zzbPQ)) ? false : (this.zzbPP == null ? com_google_android_gms_internal_zzagt.zzbPP != null : !this.zzbPP.equals(com_google_android_gms_internal_zzagt.zzbPP)) ? false : (this.zzbPO == null ? com_google_android_gms_internal_zzagt.zzbPO != null : !this.zzbPO.equals(com_google_android_gms_internal_zzagt.zzbPO)) ? false : (this.zzbPN == null ? com_google_android_gms_internal_zzagt.zzbPN != null : !this.zzbPN.equals(com_google_android_gms_internal_zzagt.zzbPN)) ? false : zzSM() == com_google_android_gms_internal_zzagt.zzSM();
    }

    public int getLimit() {
        if (zzSI()) {
            return this.zzbPL.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.zzbPQ != null ? this.zzbPQ.hashCode() : 0) + (((this.zzbPP != null ? this.zzbPP.hashCode() : 0) + (((this.zzbPO != null ? this.zzbPO.hashCode() : 0) + (((this.zzbPN != null ? this.zzbPN.hashCode() : 0) + (((zzSM() ? 1231 : 1237) + ((this.zzbPL != null ? this.zzbPL.intValue() : 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.zzbPG != null) {
            i = this.zzbPG.hashCode();
        }
        return hashCode + i;
    }

    public boolean isDefault() {
        return zzSO() && this.zzbPG.equals(zzahx.zzTL());
    }

    public boolean isValid() {
        return (zzSC() && zzSF() && zzSI() && !zzSJ()) ? false : true;
    }

    public String toString() {
        return zzSN().toString();
    }

    public boolean zzSC() {
        return this.zzbPN != null;
    }

    public zzahu zzSD() {
        if (zzSC()) {
            return this.zzbPN;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public zzahi zzSE() {
        if (zzSC()) {
            return this.zzbPO != null ? this.zzbPO : zzahi.zzTh();
        } else {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
    }

    public boolean zzSF() {
        return this.zzbPP != null;
    }

    public zzahu zzSG() {
        if (zzSF()) {
            return this.zzbPP;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public zzahi zzSH() {
        if (zzSF()) {
            return this.zzbPQ != null ? this.zzbPQ : zzahi.zzTi();
        } else {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
    }

    public boolean zzSI() {
        return this.zzbPL != null;
    }

    public boolean zzSJ() {
        return zzSI() && this.zzbPM != null;
    }

    public zzaho zzSK() {
        return this.zzbPG;
    }

    public boolean zzSM() {
        return this.zzbPM != null ? this.zzbPM == a.LEFT : zzSC();
    }

    public Map<String, Object> zzSN() {
        Map<String, Object> hashMap = new HashMap();
        if (zzSC()) {
            hashMap.put("sp", this.zzbPN.getValue());
            if (this.zzbPO != null) {
                hashMap.put("sn", this.zzbPO.asString());
            }
        }
        if (zzSF()) {
            hashMap.put("ep", this.zzbPP.getValue());
            if (this.zzbPQ != null) {
                hashMap.put("en", this.zzbPQ.asString());
            }
        }
        if (this.zzbPL != null) {
            hashMap.put("l", this.zzbPL);
            a aVar = this.zzbPM;
            if (aVar == null) {
                aVar = zzSC() ? a.LEFT : a.RIGHT;
            }
            switch (aVar) {
                case LEFT:
                    hashMap.put("vf", "l");
                    break;
                case RIGHT:
                    hashMap.put("vf", "r");
                    break;
            }
        }
        if (!this.zzbPG.equals(zzahx.zzTL())) {
            hashMap.put("i", this.zzbPG.zzTD());
        }
        return hashMap;
    }

    public boolean zzSO() {
        return (zzSC() || zzSF() || zzSI()) ? false : true;
    }

    public String zzSP() {
        if (this.zzbPR == null) {
            try {
                this.zzbPR = zzaim.zzaB(zzSN());
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return this.zzbPR;
    }

    public zzahb zzSQ() {
        return zzSO() ? new zzagz(zzSK()) : zzSI() ? new zzaha(this) : new zzahc(this);
    }

    public zzagt zza(zzaho com_google_android_gms_internal_zzaho) {
        zzagt zzSL = zzSL();
        zzSL.zzbPG = com_google_android_gms_internal_zzaho;
        return zzSL;
    }

    public zzagt zza(zzahu com_google_android_gms_internal_zzahu, zzahi com_google_android_gms_internal_zzahi) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzahu.zzTo() || com_google_android_gms_internal_zzahu.isEmpty()) {
            zzagt zzSL = zzSL();
            zzSL.zzbPN = com_google_android_gms_internal_zzahu;
            zzSL.zzbPO = com_google_android_gms_internal_zzahi;
            return zzSL;
        }
        throw new AssertionError();
    }

    public zzagt zzb(zzahu com_google_android_gms_internal_zzahu, zzahi com_google_android_gms_internal_zzahi) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzahu.zzTo() || com_google_android_gms_internal_zzahu.isEmpty()) {
            zzagt zzSL = zzSL();
            zzSL.zzbPP = com_google_android_gms_internal_zzahu;
            zzSL.zzbPQ = com_google_android_gms_internal_zzahi;
            return zzSL;
        }
        throw new AssertionError();
    }

    public zzagt zznC(int i) {
        zzagt zzSL = zzSL();
        zzSL.zzbPL = Integer.valueOf(i);
        zzSL.zzbPM = a.LEFT;
        return zzSL;
    }

    public zzagt zznD(int i) {
        zzagt zzSL = zzSL();
        zzSL.zzbPL = Integer.valueOf(i);
        zzSL.zzbPM = a.RIGHT;
        return zzSL;
    }
}
