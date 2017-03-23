package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.zzaa;

class i extends BroadcastReceiver {
    static final String a = i.class.getName();
    private final zzx b;
    private boolean c;
    private boolean d;

    i(zzx com_google_android_gms_measurement_internal_zzx) {
        zzaa.zzz(com_google_android_gms_measurement_internal_zzx);
        this.b = com_google_android_gms_measurement_internal_zzx;
    }

    private Context d() {
        return this.b.getContext();
    }

    private zzp e() {
        return this.b.zzFm();
    }

    public void a() {
        this.b.zzma();
        this.b.zzkN();
        if (!this.c) {
            d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = this.b.zzGb().zzod();
            e().zzFL().zzj("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
            this.c = true;
        }
    }

    public void b() {
        this.b.zzma();
        this.b.zzkN();
        if (c()) {
            e().zzFL().log("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                d().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                e().zzFE().zzj("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public boolean c() {
        this.b.zzkN();
        return this.c;
    }

    public void onReceive(Context context, Intent intent) {
        this.b.zzma();
        String action = intent.getAction();
        e().zzFL().zzj("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            final boolean zzod = this.b.zzGb().zzod();
            if (this.d != zzod) {
                this.d = zzod;
                this.b.zzFl().zzg(new Runnable(this) {
                    final /* synthetic */ i b;

                    public void run() {
                        this.b.b.zzR(zzod);
                    }
                });
                return;
            }
            return;
        }
        e().zzFG().zzj("NetworkBroadcastReceiver received unknown action", action);
    }
}
