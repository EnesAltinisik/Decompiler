package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.ProviderQueryResult;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import java.util.List;

public class zzadi implements ProviderQueryResult {
    private List<String> zzbGk;

    public zzadi(CreateAuthUriResponse createAuthUriResponse) {
        zzaa.zzz(createAuthUriResponse);
        this.zzbGk = createAuthUriResponse.getAllProviders();
    }

    public List<String> getProviders() {
        return this.zzbGk;
    }
}
