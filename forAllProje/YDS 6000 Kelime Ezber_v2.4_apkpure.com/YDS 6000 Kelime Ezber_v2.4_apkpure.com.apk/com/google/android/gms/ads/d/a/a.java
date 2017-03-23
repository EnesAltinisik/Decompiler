package com.google.android.gms.ads.d.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.b;

public interface a extends b {
    void initialize(Context context, com.google.android.gms.ads.mediation.a aVar, String str, b bVar, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}
