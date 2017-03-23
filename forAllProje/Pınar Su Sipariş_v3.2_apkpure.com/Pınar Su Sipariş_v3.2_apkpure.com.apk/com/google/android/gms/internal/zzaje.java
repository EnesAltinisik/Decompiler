package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzaje {
    private long zzajg;
    private Map<String, Map<String, byte[]>> zzbTw;

    public zzaje(Map<String, Map<String, byte[]>> map, long j) {
        this.zzbTw = map;
        this.zzajg = j;
    }

    public long getTimestamp() {
        return this.zzajg;
    }

    public void setTimestamp(long j) {
        this.zzajg = j;
    }

    public Map<String, Map<String, byte[]>> zzUB() {
        return this.zzbTw;
    }

    public boolean zzUC() {
        return (this.zzbTw == null || this.zzbTw.isEmpty()) ? false : true;
    }

    public boolean zzaq(String str, String str2) {
        return zzUC() && zziE(str2) && zzar(str, str2) != null;
    }

    public byte[] zzar(String str, String str2) {
        return (str == null || !zziE(str2)) ? null : (byte[]) ((Map) this.zzbTw.get(str2)).get(str);
    }

    public boolean zziE(String str) {
        if (str == null) {
            return false;
        }
        boolean z = (!zzUC() || this.zzbTw.get(str) == null || ((Map) this.zzbTw.get(str)).isEmpty()) ? false : true;
        return z;
    }

    public void zzk(Map<String, byte[]> map, String str) {
        if (this.zzbTw == null) {
            this.zzbTw = new HashMap();
        }
        this.zzbTw.put(str, map);
    }
}
