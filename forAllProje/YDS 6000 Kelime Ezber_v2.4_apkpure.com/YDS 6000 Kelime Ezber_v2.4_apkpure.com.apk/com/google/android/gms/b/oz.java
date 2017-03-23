package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.b.op.a;

@vz
public class oz extends c<oq> {
    public oz() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    protected /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }

    public op b(Context context) {
        try {
            return a.a(((oq) a(context)).a(b.a((Object) context), 10084000));
        } catch (Throwable e) {
            zy.c("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (Throwable e2) {
            zy.c("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }

    protected oq b(IBinder iBinder) {
        return oq.a.a(iBinder);
    }
}
