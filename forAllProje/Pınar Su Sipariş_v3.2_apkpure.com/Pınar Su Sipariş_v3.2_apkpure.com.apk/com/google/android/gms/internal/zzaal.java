package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzf;
import com.google.android.gms.internal.zzuu.zzc;
import com.google.android.gms.tagmanager.zzdi;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzaal extends zzvj {
    private static final String ID = zzad.zzdc.toString();
    private static final List<String> zzbrY = Arrays.asList(new String[]{ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, ProductAction.ACTION_PURCHASE, ProductAction.ACTION_REFUND});
    private static final Pattern zzbrZ = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzbsa = Pattern.compile("metric(\\d+)");
    private static final Set<String> zzbuF = zzf.zza("", "0", "false");
    private static final Map<String, String> zzbuG = zzf.zza("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");
    private static final Map<String, String> zzbuH = zzf.zza("name", "&in", "sku", "&ic", "category", "&iv", Param.PRICE, "&ip", Param.QUANTITY, "&iq", Param.CURRENCY, "&cu");
    private final zzdi zzbse;
    private final zzc zzbtj;
    private Map<String, Object> zzbuI;

    public zzaal(Context context, zzc com_google_android_gms_internal_zzuu_zzc) {
        this(new zzdi(context), com_google_android_gms_internal_zzuu_zzc);
    }

    public zzaal(zzdi com_google_android_gms_tagmanager_zzdi, zzc com_google_android_gms_internal_zzuu_zzc) {
        this.zzbtj = com_google_android_gms_internal_zzuu_zzc;
        this.zzbse = com_google_android_gms_tagmanager_zzdi;
    }

    private Double zzU(Object obj) {
        String str;
        String valueOf;
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                str = "Cannot convert the object to Double: ";
                valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            str = "Cannot convert the object to Double: ";
            valueOf = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private Integer zzV(Object obj) {
        String str;
        String valueOf;
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                str = "Cannot convert the object to Integer: ";
                valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            str = "Cannot convert the object to Integer: ";
            valueOf = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private void zza(Tracker tracker, zzabh<?> com_google_android_gms_internal_zzabh_) {
        tracker.send(zzi(com_google_android_gms_internal_zzabh_));
    }

    private void zza(Tracker tracker, zzabh<?> com_google_android_gms_internal_zzabh_, zzabh<?> com_google_android_gms_internal_zzabh_2, zzabh<?> com_google_android_gms_internal_zzabh_3) {
        String str = (String) this.zzbuI.get("transactionId");
        if (str == null) {
            zzun.e("Cannot find transactionId in data layer.");
            return;
        }
        List<Map> linkedList = new LinkedList();
        try {
            Map zzi = zzi(com_google_android_gms_internal_zzabh_);
            zzi.put("&t", "transaction");
            for (Entry entry : zzj(com_google_android_gms_internal_zzabh_2).entrySet()) {
                String str2 = (String) this.zzbuI.get(entry.getKey());
                if (str2 != null) {
                    zzi.put((String) entry.getValue(), str2);
                }
            }
            linkedList.add(zzi);
            List<Map> zzhf = zzhf("transactionProducts");
            if (zzhf != null) {
                for (Map map : zzhf) {
                    if (map.get("name") == null) {
                        zzun.e("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map zzi2 = zzi(com_google_android_gms_internal_zzabh_);
                    zzi2.put("&t", "item");
                    zzi2.put("&ti", str);
                    for (Entry entry2 : zzk(com_google_android_gms_internal_zzabh_3).entrySet()) {
                        Object obj = map.get(entry2.getKey());
                        if (obj != null) {
                            zzi2.put((String) entry2.getValue(), obj.toString());
                        }
                    }
                    linkedList.add(zzi2);
                }
            }
            for (Map send : linkedList) {
                tracker.send(send);
            }
        } catch (Throwable e) {
            zzun.zzb("Unable to send transaction", e);
        }
    }

    private Promotion zzam(Map<String, String> map) {
        Promotion promotion = new Promotion();
        String str = (String) map.get("id");
        if (str != null) {
            promotion.setId(String.valueOf(str));
        }
        str = (String) map.get("name");
        if (str != null) {
            promotion.setName(String.valueOf(str));
        }
        str = (String) map.get("creative");
        if (str != null) {
            promotion.setCreative(String.valueOf(str));
        }
        str = (String) map.get("position");
        if (str != null) {
            promotion.setPosition(String.valueOf(str));
        }
        return promotion;
    }

    private Product zzan(Map<String, Object> map) {
        String str;
        Product product = new Product();
        Object obj = map.get("id");
        if (obj != null) {
            product.setId(String.valueOf(obj));
        }
        obj = map.get("name");
        if (obj != null) {
            product.setName(String.valueOf(obj));
        }
        obj = map.get("brand");
        if (obj != null) {
            product.setBrand(String.valueOf(obj));
        }
        obj = map.get("category");
        if (obj != null) {
            product.setCategory(String.valueOf(obj));
        }
        obj = map.get("variant");
        if (obj != null) {
            product.setVariant(String.valueOf(obj));
        }
        obj = map.get(Param.COUPON);
        if (obj != null) {
            product.setCouponCode(String.valueOf(obj));
        }
        obj = map.get("position");
        if (obj != null) {
            product.setPosition(zzV(obj).intValue());
        }
        obj = map.get(Param.PRICE);
        if (obj != null) {
            product.setPrice(zzU(obj).doubleValue());
        }
        obj = map.get(Param.QUANTITY);
        if (obj != null) {
            product.setQuantity(zzV(obj).intValue());
        }
        for (String str2 : map.keySet()) {
            String str22;
            Matcher matcher = zzbrZ.matcher(str22);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str22)));
                } catch (NumberFormatException e) {
                    str = "illegal number in custom dimension value: ";
                    str22 = String.valueOf(str22);
                    zzun.zzaW(str22.length() != 0 ? str.concat(str22) : new String(str));
                }
            } else {
                matcher = zzbsa.matcher(str22);
                if (matcher.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher.group(1)), zzV(map.get(str22)).intValue());
                    } catch (NumberFormatException e2) {
                        str = "illegal number in custom metric value: ";
                        str22 = String.valueOf(str22);
                        zzun.zzaW(str22.length() != 0 ? str.concat(str22) : new String(str));
                    }
                }
            }
        }
        return product;
    }

    private void zzb(Tracker tracker, zzabh<?> com_google_android_gms_internal_zzabh_, zzabh<?> com_google_android_gms_internal_zzabh_2, zzabh<?> com_google_android_gms_internal_zzabh_3) {
        String str;
        ScreenViewBuilder screenViewBuilder = new ScreenViewBuilder();
        Map zzi = zzi(com_google_android_gms_internal_zzabh_);
        screenViewBuilder.setAll(zzi);
        Object zzl = zzvi.zza(com_google_android_gms_internal_zzabh_2) ? this.zzbuI.get("ecommerce") : zzabq.zzl(zzabq.zzm(com_google_android_gms_internal_zzabh_3));
        if (zzl instanceof Map) {
            List<Map> list;
            Map map = (Map) zzl;
            String str2 = (String) zzi.get("&cu");
            if (str2 == null) {
                str2 = (String) map.get("currencyCode");
            }
            if (str2 != null) {
                screenViewBuilder.set("&cu", str2);
            }
            Object obj = map.get("impressions");
            if (obj instanceof List) {
                for (Map zzi2 : (List) obj) {
                    try {
                        screenViewBuilder.addImpression(zzan(zzi2), (String) zzi2.get("list"));
                    } catch (RuntimeException e) {
                        String str3 = "Failed to extract a product from event data. ";
                        str2 = String.valueOf(e.getMessage());
                        zzun.e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                    }
                }
            }
            List list2 = null;
            if (map.containsKey("promoClick")) {
                list2 = (List) ((Map) map.get("promoClick")).get("promotions");
            } else if (map.containsKey("promoView")) {
                list2 = (List) ((Map) map.get("promoView")).get("promotions");
            }
            if (r1 != null) {
                for (Map zzi22 : r1) {
                    try {
                        screenViewBuilder.addPromotion(zzam(zzi22));
                    } catch (RuntimeException e2) {
                        str = "Failed to extract a promotion from event data. ";
                        str2 = String.valueOf(e2.getMessage());
                        zzun.e(str2.length() != 0 ? str.concat(str2) : new String(str));
                    }
                }
                if (map.containsKey("promoClick")) {
                    screenViewBuilder.set("&promoa", "click");
                    obj = null;
                    if (obj != null) {
                        for (String str22 : zzbrY) {
                            if (map.containsKey(str22)) {
                                map = (Map) map.get(str22);
                                list = (List) map.get("products");
                                if (list != null) {
                                    for (Map zzan : list) {
                                        try {
                                            screenViewBuilder.addProduct(zzan(zzan));
                                        } catch (RuntimeException e3) {
                                            str = "Failed to extract a product from event data. ";
                                            String valueOf = String.valueOf(e3.getMessage());
                                            zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                        }
                                    }
                                }
                                try {
                                    screenViewBuilder.setProductAction(map.containsKey("actionField") ? zzi(str22, (Map) map.get("actionField")) : new ProductAction(str22));
                                } catch (RuntimeException e4) {
                                    str22 = "Failed to extract a product action from event data. ";
                                    String valueOf2 = String.valueOf(e4.getMessage());
                                    zzun.e(valueOf2.length() != 0 ? str22.concat(valueOf2) : new String(str22));
                                }
                            }
                        }
                    }
                } else {
                    screenViewBuilder.set("&promoa", Promotion.ACTION_VIEW);
                }
            }
            int i = 1;
            if (obj != null) {
                for (String str222 : zzbrY) {
                    if (map.containsKey(str222)) {
                        map = (Map) map.get(str222);
                        list = (List) map.get("products");
                        if (list != null) {
                            while (r4.hasNext()) {
                                screenViewBuilder.addProduct(zzan(zzan));
                            }
                        }
                        if (map.containsKey("actionField")) {
                        }
                        screenViewBuilder.setProductAction(map.containsKey("actionField") ? zzi(str222, (Map) map.get("actionField")) : new ProductAction(str222));
                    }
                }
            }
        }
        tracker.send(screenViewBuilder.build());
    }

    private Map<String, String> zzh(zzabh<?> com_google_android_gms_internal_zzabh_) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ instanceof zzabn);
        Map<String, String> linkedHashMap = new LinkedHashMap();
        Object zzl = zzabq.zzl(zzabq.zzm(com_google_android_gms_internal_zzabh_));
        zzaa.zzai(zzl instanceof Map);
        for (Entry entry : ((Map) zzl).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private List<Map<String, Object>> zzhf(String str) {
        Object obj = this.zzbuI.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List<Map<String, Object>> list = (List) obj;
            for (Object obj2 : list) {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
                }
            }
            return list;
        }
        throw new IllegalArgumentException("transactionProducts should be of type List.");
    }

    private ProductAction zzi(String str, Map<String, Object> map) {
        ProductAction productAction = new ProductAction(str);
        Object obj = map.get("id");
        if (obj != null) {
            productAction.setTransactionId(String.valueOf(obj));
        }
        obj = map.get("affiliation");
        if (obj != null) {
            productAction.setTransactionAffiliation(String.valueOf(obj));
        }
        obj = map.get(Param.COUPON);
        if (obj != null) {
            productAction.setTransactionCouponCode(String.valueOf(obj));
        }
        obj = map.get("list");
        if (obj != null) {
            productAction.setProductActionList(String.valueOf(obj));
        }
        obj = map.get("option");
        if (obj != null) {
            productAction.setCheckoutOptions(String.valueOf(obj));
        }
        obj = map.get("revenue");
        if (obj != null) {
            productAction.setTransactionRevenue(zzU(obj).doubleValue());
        }
        obj = map.get(Param.TAX);
        if (obj != null) {
            productAction.setTransactionTax(zzU(obj).doubleValue());
        }
        obj = map.get(Param.SHIPPING);
        if (obj != null) {
            productAction.setTransactionShipping(zzU(obj).doubleValue());
        }
        obj = map.get("step");
        if (obj != null) {
            productAction.setCheckoutStep(zzV(obj).intValue());
        }
        return productAction;
    }

    private Map<String, String> zzi(zzabh<?> com_google_android_gms_internal_zzabh_) {
        Map<String, String> zzh = zzh(com_google_android_gms_internal_zzabh_);
        String str = (String) zzh.get("&aip");
        if (str != null && zzbuF.contains(str.toLowerCase())) {
            zzh.remove("&aip");
        }
        return zzh;
    }

    private Map<String, String> zzj(zzabh<?> com_google_android_gms_internal_zzabh_) {
        return com_google_android_gms_internal_zzabh_ == zzabl.zzbvN ? zzbuG : zzh(com_google_android_gms_internal_zzabh_);
    }

    private Map<String, String> zzk(zzabh<?> com_google_android_gms_internal_zzabh_) {
        return com_google_android_gms_internal_zzabh_ == zzabl.zzbvN ? zzbuH : zzh(com_google_android_gms_internal_zzabh_);
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = false;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        try {
            this.zzbuI = zzabq.zzM(this.zzbtj.zzLr().zzKV());
            zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
            zzabh com_google_android_gms_internal_zzabi = com_google_android_gms_internal_zzabh_Arr.length > 1 ? com_google_android_gms_internal_zzabh_Arr[1] : new zzabi(Boolean.valueOf(true));
            zzabh com_google_android_gms_internal_zzabi2 = com_google_android_gms_internal_zzabh_Arr.length > 2 ? com_google_android_gms_internal_zzabh_Arr[2] : new zzabi(Boolean.valueOf(false));
            zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr.length > 3 ? com_google_android_gms_internal_zzabh_Arr[3] : zzabl.zzbvN;
            zzabh com_google_android_gms_internal_zzabh3 = com_google_android_gms_internal_zzabh_Arr.length > 4 ? com_google_android_gms_internal_zzabh_Arr[4] : zzabl.zzbvN;
            zzabh com_google_android_gms_internal_zzabi3 = com_google_android_gms_internal_zzabh_Arr.length > 5 ? com_google_android_gms_internal_zzabh_Arr[5] : new zzabi(Boolean.valueOf(false));
            zzabh com_google_android_gms_internal_zzabi4 = com_google_android_gms_internal_zzabh_Arr.length > 6 ? com_google_android_gms_internal_zzabh_Arr[6] : new zzabi(Boolean.valueOf(false));
            zzabh com_google_android_gms_internal_zzabh4 = com_google_android_gms_internal_zzabh_Arr.length > 7 ? com_google_android_gms_internal_zzabh_Arr[7] : zzabl.zzbvN;
            zzabh com_google_android_gms_internal_zzabi5 = com_google_android_gms_internal_zzabh_Arr.length > 8 ? com_google_android_gms_internal_zzabh_Arr[8] : new zzabi(Boolean.valueOf(false));
            zzaa.zzaj(com_google_android_gms_internal_zzabh instanceof zzabn);
            boolean z2 = com_google_android_gms_internal_zzabh2 == zzabl.zzbvN || (com_google_android_gms_internal_zzabh2 instanceof zzabn);
            zzaa.zzaj(z2);
            z2 = com_google_android_gms_internal_zzabh3 == zzabl.zzbvN || (com_google_android_gms_internal_zzabh3 instanceof zzabn);
            zzaa.zzaj(z2);
            if (com_google_android_gms_internal_zzabh4 == zzabl.zzbvN || (com_google_android_gms_internal_zzabh4 instanceof zzabn)) {
                z = true;
            }
            zzaa.zzaj(z);
            Tracker zzgK = this.zzbse.zzgK("_GTM_DEFAULT_TRACKER_");
            zzgK.enableAdvertisingIdCollection(zzvi.zza(com_google_android_gms_internal_zzabi5));
            if (zzvi.zza(com_google_android_gms_internal_zzabi3)) {
                zzb(zzgK, com_google_android_gms_internal_zzabh, com_google_android_gms_internal_zzabi4, com_google_android_gms_internal_zzabh4);
            } else if (zzvi.zza(com_google_android_gms_internal_zzabi)) {
                zza(zzgK, com_google_android_gms_internal_zzabh);
            } else if (zzvi.zza(com_google_android_gms_internal_zzabi2)) {
                zza(zzgK, com_google_android_gms_internal_zzabh, com_google_android_gms_internal_zzabh2, com_google_android_gms_internal_zzabh3);
            } else {
                zzun.zzaW("Ignoring unknown tag.");
            }
            this.zzbuI = null;
            return zzabl.zzbvN;
        } catch (Throwable th) {
            this.zzbuI = null;
        }
    }
}
