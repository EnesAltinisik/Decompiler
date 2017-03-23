package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.common.util.k;

@vz
public class vk {

    public interface a {
        void b(yu yuVar);
    }

    public zk a(Context context, com.google.android.gms.ads.internal.a aVar, com.google.android.gms.b.yu.a aVar2, dp dpVar, aaq com_google_android_gms_b_aaq, tn tnVar, a aVar3, qa qaVar) {
        wi wiVar = aVar2.b;
        zk voVar = wiVar.h ? new vo(context, aVar2, tnVar, aVar3, qaVar, com_google_android_gms_b_aaq) : (wiVar.t || (aVar instanceof r)) ? (wiVar.t && (aVar instanceof r)) ? new vp(context, (r) aVar, aVar2, dpVar, aVar3, qaVar) : new vm(aVar2, aVar3) : (((Boolean) pr.X.c()).booleanValue() && wiVar.p) ? new vi(context, aVar2, com_google_android_gms_b_aaq, aVar3) : (((Boolean) pr.aq.c()).booleanValue() && k.g() && !k.i() && com_google_android_gms_b_aaq != null && com_google_android_gms_b_aaq.k().e) ? new vn(context, aVar2, com_google_android_gms_b_aaq, aVar3) : new vl(context, aVar2, com_google_android_gms_b_aaq, aVar3);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(voVar.getClass().getName());
        zy.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        voVar.e();
        return voVar;
    }

    public zk a(Context context, com.google.android.gms.b.yu.a aVar, xo xoVar) {
        zk yfVar = new yf(context, aVar, xoVar);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(yfVar.getClass().getName());
        zy.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        yfVar.e();
        return yfVar;
    }
}
