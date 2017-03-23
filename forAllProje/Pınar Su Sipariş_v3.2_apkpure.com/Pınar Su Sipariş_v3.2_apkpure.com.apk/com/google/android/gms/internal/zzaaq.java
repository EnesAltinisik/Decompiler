package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzaaq {
    private final Context mContext;
    private String zzbot;
    private final zzaav zzbuO;
    final Map<String, b<zzabc>> zzbuP;
    private final Map<String, zzabb> zzbuQ;
    private final zze zzsd;

    class a extends zzaap {
        final /* synthetic */ zzaaq a;
        private final zza b;
        private final List<Integer> c;
        private final int d;

        a(zzaaq com_google_android_gms_internal_zzaaq, int i, zzaat com_google_android_gms_internal_zzaat, zzaar com_google_android_gms_internal_zzaar, List<Integer> list, int i2, zza com_google_android_gms_internal_zzaaq_zza) {
            this.a = com_google_android_gms_internal_zzaaq;
            super(i, com_google_android_gms_internal_zzaat, com_google_android_gms_internal_zzaar);
            this.b = com_google_android_gms_internal_zzaaq_zza;
            this.c = list;
            this.d = i2;
        }

        protected void zza(zzaau com_google_android_gms_internal_zzaau) {
            String valueOf;
            Object obj;
            String valueOf2;
            if (com_google_android_gms_internal_zzaau.getStatus() == Status.zzalw) {
                String str = "Container resource successfully loaded from ";
                valueOf = String.valueOf(com_google_android_gms_internal_zzaau.zzLQ());
                zzun.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                int i;
                if (com_google_android_gms_internal_zzaau.getSource() == 0) {
                    com.google.android.gms.internal.zzaau.zza zzLO = com_google_android_gms_internal_zzaau.zzLO();
                    if (zzLO.zzLS().zzLJ()) {
                        obj = 1;
                    } else {
                        this.a.zza(com_google_android_gms_internal_zzaau.getStatus(), zzLO);
                        if (zzLO.zzLR() != null && zzLO.zzLR().length > 0) {
                            this.a.zzbuO.zzg(zzLO.zzLS().zzLI(), zzLO.zzLR());
                            i = 1;
                        }
                    }
                } else {
                    i = 1;
                }
                if (obj == null) {
                    this.b.zza(com_google_android_gms_internal_zzaau);
                }
                valueOf2 = String.valueOf(com_google_android_gms_internal_zzaau.zzLQ());
                valueOf = com_google_android_gms_internal_zzaau.getStatus().isSuccess() ? "SUCCESS" : "FAILURE";
                zzun.v(new StringBuilder((String.valueOf(valueOf2).length() + 54) + String.valueOf(valueOf).length()).append("Cannot fetch a valid resource from ").append(valueOf2).append(". Response status: ").append(valueOf).toString());
                if (com_google_android_gms_internal_zzaau.getStatus().isSuccess()) {
                    valueOf2 = "Response source: ";
                    valueOf = String.valueOf(com_google_android_gms_internal_zzaau.zzLQ());
                    zzun.v(valueOf.length() == 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                    zzun.v("Response size: " + com_google_android_gms_internal_zzaau.zzLO().zzLR().length);
                }
                this.a.zza(this.zzbuM, this.c, this.d + 1, this.b);
                return;
            }
            obj = null;
            if (obj == null) {
                valueOf2 = String.valueOf(com_google_android_gms_internal_zzaau.zzLQ());
                if (com_google_android_gms_internal_zzaau.getStatus().isSuccess()) {
                }
                zzun.v(new StringBuilder((String.valueOf(valueOf2).length() + 54) + String.valueOf(valueOf).length()).append("Cannot fetch a valid resource from ").append(valueOf2).append(". Response status: ").append(valueOf).toString());
                if (com_google_android_gms_internal_zzaau.getStatus().isSuccess()) {
                    valueOf2 = "Response source: ";
                    valueOf = String.valueOf(com_google_android_gms_internal_zzaau.zzLQ());
                    if (valueOf.length() == 0) {
                    }
                    zzun.v(valueOf.length() == 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                    zzun.v("Response size: " + com_google_android_gms_internal_zzaau.zzLO().zzLR().length);
                }
                this.a.zza(this.zzbuM, this.c, this.d + 1, this.b);
                return;
            }
            this.b.zza(com_google_android_gms_internal_zzaau);
        }
    }

    static class b<T> {
        private Status a;
        private T b;
        private long c;

        public b(Status status, T t, long j) {
            this.a = status;
            this.b = t;
            this.c = j;
        }

        public long a() {
            return this.c;
        }

        public void a(long j) {
            this.c = j;
        }

        public void a(Status status) {
            this.a = status;
        }

        public void a(T t) {
            this.b = t;
        }
    }

    public interface zza {
        void zza(zzaau com_google_android_gms_internal_zzaau);
    }

    public zzaaq(Context context) {
        this(context, new HashMap(), new zzaav(context), zzh.zzuW());
    }

    zzaaq(Context context, Map<String, zzabb> map, zzaav com_google_android_gms_internal_zzaav, zze com_google_android_gms_common_util_zze) {
        this.zzbot = null;
        this.zzbuP = new HashMap();
        this.mContext = context.getApplicationContext();
        this.zzsd = com_google_android_gms_common_util_zze;
        this.zzbuO = com_google_android_gms_internal_zzaav;
        this.zzbuQ = map;
    }

    private void zzb(zzaat com_google_android_gms_internal_zzaat, List<Integer> list, int i, zza com_google_android_gms_internal_zzaaq_zza) {
        Object obj;
        zzaam zzLN = com_google_android_gms_internal_zzaat.zzLN();
        b bVar = (b) this.zzbuP.get(zzLN.getContainerId());
        if (com_google_android_gms_internal_zzaat.zzLN().zzLJ()) {
            obj = 1;
        } else {
            obj = (bVar != null ? bVar.a() : this.zzbuO.zzhk(zzLN.getContainerId())) + 900000 < this.zzsd.currentTimeMillis() ? 1 : null;
        }
        if (obj != null) {
            zzabb com_google_android_gms_internal_zzabb;
            zzabb com_google_android_gms_internal_zzabb2 = (zzabb) this.zzbuQ.get(com_google_android_gms_internal_zzaat.getId());
            if (com_google_android_gms_internal_zzabb2 == null) {
                com_google_android_gms_internal_zzabb2 = null == null ? new zzabb() : new zzabb(this.zzbot);
                this.zzbuQ.put(com_google_android_gms_internal_zzaat.getId(), com_google_android_gms_internal_zzabb2);
                com_google_android_gms_internal_zzabb = com_google_android_gms_internal_zzabb2;
            } else {
                com_google_android_gms_internal_zzabb = com_google_android_gms_internal_zzabb2;
            }
            String valueOf = String.valueOf(zzLN.getContainerId());
            zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Attempting to fetch container ").append(valueOf).append(" from network").toString());
            com_google_android_gms_internal_zzabb.zza(this.mContext, com_google_android_gms_internal_zzaat, 0, new a(this, 0, com_google_android_gms_internal_zzaat, zzaas.zzbuW, list, i, com_google_android_gms_internal_zzaaq_zza));
            return;
        }
        zza(com_google_android_gms_internal_zzaat, list, i + 1, com_google_android_gms_internal_zzaaq_zza);
    }

    private void zzc(zzaat com_google_android_gms_internal_zzaat, List<Integer> list, int i, zza com_google_android_gms_internal_zzaaq_zza) {
        zzaam zzLN = com_google_android_gms_internal_zzaat.zzLN();
        String valueOf = String.valueOf(zzLN.getContainerId());
        zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 52).append("Attempting to fetch container ").append(valueOf).append(" from a saved resource").toString());
        this.zzbuO.zza(zzLN.zzLI(), new a(this, 1, com_google_android_gms_internal_zzaat, zzaas.zzbuW, list, i, com_google_android_gms_internal_zzaaq_zza));
    }

    private void zzd(zzaat com_google_android_gms_internal_zzaat, List<Integer> list, int i, zza com_google_android_gms_internal_zzaaq_zza) {
        zzaam zzLN = com_google_android_gms_internal_zzaat.zzLN();
        String valueOf = String.valueOf(zzLN.getContainerId());
        zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Attempting to fetch container ").append(valueOf).append(" from the default resource").toString());
        this.zzbuO.zza(zzLN.zzLI(), zzLN.zzLG(), new a(this, 2, com_google_android_gms_internal_zzaat, zzaas.zzbuW, list, i, com_google_android_gms_internal_zzaaq_zza));
    }

    void zza(Status status, com.google.android.gms.internal.zzaau.zza com_google_android_gms_internal_zzaau_zza) {
        String containerId = com_google_android_gms_internal_zzaau_zza.zzLS().getContainerId();
        Object zzLT = com_google_android_gms_internal_zzaau_zza.zzLT();
        if (this.zzbuP.containsKey(containerId)) {
            b bVar = (b) this.zzbuP.get(containerId);
            bVar.a(this.zzsd.currentTimeMillis());
            if (status == Status.zzalw) {
                bVar.a(status);
                bVar.a(zzLT);
                return;
            }
            return;
        }
        this.zzbuP.put(containerId, new b(status, zzLT, this.zzsd.currentTimeMillis()));
    }

    void zza(zzaat com_google_android_gms_internal_zzaat, List<Integer> list, int i, zza com_google_android_gms_internal_zzaaq_zza) {
        if (i == 0) {
            zzun.v("Starting to fetch a new resource");
        }
        if (i >= list.size()) {
            String str = "There is no valid resource for the container: ";
            String valueOf = String.valueOf(com_google_android_gms_internal_zzaat.zzLN().getContainerId());
            valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            zzun.v(valueOf);
            com_google_android_gms_internal_zzaaq_zza.zza(new zzaau(new Status(16, valueOf), ((Integer) list.get(i - 1)).intValue()));
            return;
        }
        switch (((Integer) list.get(i)).intValue()) {
            case 0:
                zzb(com_google_android_gms_internal_zzaat, list, i, com_google_android_gms_internal_zzaaq_zza);
                return;
            case 1:
                zzc(com_google_android_gms_internal_zzaat, list, i, com_google_android_gms_internal_zzaaq_zza);
                return;
            case 2:
                zzd(com_google_android_gms_internal_zzaat, list, i, com_google_android_gms_internal_zzaaq_zza);
                return;
            default:
                throw new UnsupportedOperationException("Unknown fetching source: " + i);
        }
    }

    public void zza(String str, String str2, String str3, List<Integer> list, zza com_google_android_gms_internal_zzaaq_zza) {
        zzaa.zzaj(!list.isEmpty());
        zza(new zzaat().zza(new zzaam(str, str2, str3, zzhj(str), zzus.zzLi().zzLj())), Collections.unmodifiableList(list), 0, com_google_android_gms_internal_zzaaq_zza);
    }

    boolean zzhj(String str) {
        zzus zzLi = zzus.zzLi();
        return zzLi.isPreview() && str.equals(zzLi.getContainerId());
    }
}
