package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.zzaa;

class a extends BroadcastReceiver {
    static final String a = a.class.getName();
    private final zzf b;
    private boolean c;
    private boolean d;

    a(zzf com_google_android_gms_analytics_internal_zzf) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzf);
        this.b = com_google_android_gms_analytics_internal_zzf;
    }

    private void g() {
        i();
        j();
    }

    private Context h() {
        return this.b.getContext();
    }

    private zzaf i() {
        return this.b.zzlR();
    }

    private zzb j() {
        return this.b.zzkw();
    }

    public void a() {
        g();
        if (!this.c) {
            Context h = h();
            h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(h.getPackageName());
            h.registerReceiver(this, intentFilter);
            this.d = f();
            this.b.zzlR().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
            this.c = true;
        }
    }

    public void b() {
        if (d()) {
            this.b.zzlR().zzbG("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                h().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                i().zze("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void c() {
        if (VERSION.SDK_INT > 10) {
            Context h = h();
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(h.getPackageName());
            intent.putExtra(a, true);
            h.sendOrderedBroadcast(intent, null);
        }
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        if (!this.c) {
            this.b.zzlR().zzbJ("Connectivity unknown. Receiver not registered");
        }
        return this.d;
    }

    protected boolean f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) h().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e) {
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        g();
        String action = intent.getAction();
        this.b.zzlR().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = f();
            if (this.d != f) {
                this.d = f;
                j().zzR(f);
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.b.zzlR().zzd("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(a)) {
            j().zzlM();
        }
    }
}
