package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.zzg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class zzlt extends zzg<zzlt> {
    private ProductAction zzUf;
    private final Map<String, List<Product>> zzUg = new HashMap();
    private final List<Promotion> zzUh = new ArrayList();
    private final List<Product> zzUi = new ArrayList();

    public String toString() {
        Map hashMap = new HashMap();
        if (!this.zzUi.isEmpty()) {
            hashMap.put("products", this.zzUi);
        }
        if (!this.zzUh.isEmpty()) {
            hashMap.put("promotions", this.zzUh);
        }
        if (!this.zzUg.isEmpty()) {
            hashMap.put("impressions", this.zzUg);
        }
        hashMap.put("productAction", this.zzUf);
        return zzg.zzj(hashMap);
    }

    public void zza(Product product, String str) {
        if (product != null) {
            Object obj;
            if (str == null) {
                obj = "";
            }
            if (!this.zzUg.containsKey(obj)) {
                this.zzUg.put(obj, new ArrayList());
            }
            ((List) this.zzUg.get(obj)).add(product);
        }
    }

    public void zza(zzlt com_google_android_gms_internal_zzlt) {
        com_google_android_gms_internal_zzlt.zzUi.addAll(this.zzUi);
        com_google_android_gms_internal_zzlt.zzUh.addAll(this.zzUh);
        for (Entry entry : this.zzUg.entrySet()) {
            String str = (String) entry.getKey();
            for (Product zza : (List) entry.getValue()) {
                com_google_android_gms_internal_zzlt.zza(zza, str);
            }
        }
        if (this.zzUf != null) {
            com_google_android_gms_internal_zzlt.zzUf = this.zzUf;
        }
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzlt) com_google_android_gms_analytics_zzg);
    }

    public ProductAction zzll() {
        return this.zzUf;
    }

    public List<Product> zzlm() {
        return Collections.unmodifiableList(this.zzUi);
    }

    public Map<String, List<Product>> zzln() {
        return this.zzUg;
    }

    public List<Promotion> zzlo() {
        return Collections.unmodifiableList(this.zzUh);
    }
}
