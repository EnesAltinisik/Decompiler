package com.google.android.gms.b;

import android.content.Context;

@vz
public class wa {

    public interface a {
        void a(com.google.android.gms.b.yu.a aVar);
    }

    public zd a(Context context, com.google.android.gms.b.wf.a aVar, dp dpVar, a aVar2) {
        zd wsVar = aVar.b.c.getBundle("sdk_less_server_data") != null ? new ws(context, aVar, aVar2) : new wb(context, aVar, dpVar, aVar2);
        wsVar.e();
        return wsVar;
    }
}
