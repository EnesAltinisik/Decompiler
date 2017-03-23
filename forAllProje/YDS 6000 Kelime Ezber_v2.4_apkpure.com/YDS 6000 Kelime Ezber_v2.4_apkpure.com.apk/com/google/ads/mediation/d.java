package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.b;

@Deprecated
public interface d<ADDITIONAL_PARAMETERS extends i, SERVER_PARAMETERS extends h> extends c<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void a(e eVar, Activity activity, SERVER_PARAMETERS server_parameters, b bVar, b bVar2, ADDITIONAL_PARAMETERS additional_parameters);

    View d();
}
