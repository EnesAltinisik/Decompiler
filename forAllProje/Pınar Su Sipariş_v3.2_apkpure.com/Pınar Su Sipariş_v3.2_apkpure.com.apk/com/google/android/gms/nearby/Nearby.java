package com.google.android.gms.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.internal.zzsr;
import com.google.android.gms.nearby.bootstrap.zza;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.internal.connection.zze;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.internal.zzp;
import com.google.android.gms.nearby.messages.internal.zzq;

public final class Nearby {
    public static final Api<NoOptions> CONNECTIONS_API = new Api("Nearby.CONNECTIONS_API", zze.zzaaA, zze.zzaaz);
    public static final Connections Connections = new zze();
    public static final Api<MessagesOptions> MESSAGES_API = new Api("Nearby.MESSAGES_API", zzp.zzaaA, zzp.zzaaz);
    public static final Messages Messages = new zzp();
    public static final com.google.android.gms.nearby.messages.zze zzbhG = new zzq();
    public static final Api<NoOptions> zzbhH = new Api("Nearby.BOOTSTRAP_API", zzsr.zzaaA, zzsr.zzaaz);
    public static final zza zzbhI = new zzsr();

    private Nearby() {
    }
}
