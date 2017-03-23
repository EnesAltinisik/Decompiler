package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzdm extends bu {
    private static final String ID = zzad.UNIVERSAL_ANALYTICS.toString();
    private static final String zzbrP = zzae.ACCOUNT.toString();
    private static final String zzbrQ = zzae.ANALYTICS_PASS_THROUGH.toString();
    private static final String zzbrR = zzae.ENABLE_ECOMMERCE.toString();
    private static final String zzbrS = zzae.ECOMMERCE_USE_DATA_LAYER.toString();
    private static final String zzbrT = zzae.ECOMMERCE_MACRO_DATA.toString();
    private static final String zzbrU = zzae.ANALYTICS_FIELDS.toString();
    private static final String zzbrV = zzae.TRACK_TRANSACTION.toString();
    private static final String zzbrW = zzae.TRANSACTION_DATALAYER_MAP.toString();
    private static final String zzbrX = zzae.TRANSACTION_ITEM_DATALAYER_MAP.toString();
    private static final List<String> zzbrY = Arrays.asList(new String[]{ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, ProductAction.ACTION_PURCHASE, ProductAction.ACTION_REFUND});
    private static final Pattern zzbrZ = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzbsa = Pattern.compile("metric(\\d+)");
    private static Map<String, String> zzbsb;
    private static Map<String, String> zzbsc;
    private final DataLayer zzbnS;
    private final Set<String> zzbsd;
    private final zzdi zzbse;

    public zzdm(Context context, DataLayer dataLayer) {
        this(context, dataLayer, new zzdi(context));
    }

    zzdm(Context context, DataLayer dataLayer, zzdi com_google_android_gms_tagmanager_zzdi) {
        super(ID, new String[0]);
        this.zzbnS = dataLayer;
        this.zzbse = com_google_android_gms_tagmanager_zzdi;
        this.zzbsd = new HashSet();
        this.zzbsd.add("");
        this.zzbsd.add("0");
        this.zzbsd.add("false");
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

    private void zza(Tracker tracker, Map<String, zza> map) {
        String zzgS = zzgS("transactionId");
        if (zzgS == null) {
            zzbn.e("Cannot find transactionId in data layer.");
            return;
        }
        List<Map> linkedList = new LinkedList();
        try {
            Map zzm = zzm((zza) map.get(zzbrU));
            zzm.put("&t", "transaction");
            for (Entry entry : zzah(map).entrySet()) {
                zze(zzm, (String) entry.getValue(), zzgS((String) entry.getKey()));
            }
            linkedList.add(zzm);
            List<Map> zzgT = zzgT("transactionProducts");
            if (zzgT != null) {
                for (Map map2 : zzgT) {
                    if (map2.get("name") == null) {
                        zzbn.e("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map zzm2 = zzm((zza) map.get(zzbrU));
                    zzm2.put("&t", "item");
                    zzm2.put("&ti", zzgS);
                    for (Entry entry2 : zzai(map).entrySet()) {
                        zze(zzm2, (String) entry2.getValue(), (String) map2.get(entry2.getKey()));
                    }
                    linkedList.add(zzm2);
                }
            }
            for (Map map22 : linkedList) {
                tracker.send(map22);
            }
        } catch (Throwable e) {
            zzbn.zzb("Unable to send transaction", e);
        }
    }

    private Promotion zzaf(Map<String, String> map) {
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

    private Product zzag(Map<String, Object> map) {
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
                    zzbn.zzaW(str22.length() != 0 ? str.concat(str22) : new String(str));
                }
            } else {
                matcher = zzbsa.matcher(str22);
                if (matcher.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher.group(1)), zzV(map.get(str22)).intValue());
                    } catch (NumberFormatException e2) {
                        str = "illegal number in custom metric value: ";
                        str22 = String.valueOf(str22);
                        zzbn.zzaW(str22.length() != 0 ? str.concat(str22) : new String(str));
                    }
                }
            }
        }
        return product;
    }

    private Map<String, String> zzah(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(zzbrW);
        if (com_google_android_gms_internal_zzag_zza != null) {
            return zzc(com_google_android_gms_internal_zzag_zza);
        }
        if (zzbsb == null) {
            Map hashMap = new HashMap();
            hashMap.put("transactionId", "&ti");
            hashMap.put("transactionAffiliation", "&ta");
            hashMap.put("transactionTax", "&tt");
            hashMap.put("transactionShipping", "&ts");
            hashMap.put("transactionTotal", "&tr");
            hashMap.put("transactionCurrency", "&cu");
            zzbsb = hashMap;
        }
        return zzbsb;
    }

    private Map<String, String> zzai(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(zzbrX);
        if (com_google_android_gms_internal_zzag_zza != null) {
            return zzc(com_google_android_gms_internal_zzag_zza);
        }
        if (zzbsc == null) {
            Map hashMap = new HashMap();
            hashMap.put("name", "&in");
            hashMap.put("sku", "&ic");
            hashMap.put("category", "&iv");
            hashMap.put(Param.PRICE, "&ip");
            hashMap.put(Param.QUANTITY, "&iq");
            hashMap.put(Param.CURRENCY, "&cu");
            zzbsc = hashMap;
        }
        return zzbsc;
    }

    private void zzb(Tracker tracker, Map<String, zza> map) {
        Object obj;
        Map map2;
        String str;
        ScreenViewBuilder screenViewBuilder = new ScreenViewBuilder();
        Map zzm = zzm((zza) map.get(zzbrU));
        screenViewBuilder.setAll(zzm);
        if (zzj(map, zzbrS)) {
            obj = this.zzbnS.get("ecommerce");
            map2 = obj instanceof Map ? (Map) obj : null;
        } else {
            obj = zzdl.zzl((zza) map.get(zzbrT));
            map2 = obj instanceof Map ? (Map) obj : null;
        }
        if (map2 != null) {
            Map map3;
            List<Map> list;
            String str2 = (String) zzm.get("&cu");
            if (str2 == null) {
                str2 = (String) map2.get("currencyCode");
            }
            if (str2 != null) {
                screenViewBuilder.set("&cu", str2);
            }
            obj = map2.get("impressions");
            if (obj instanceof List) {
                for (Map map4 : (List) obj) {
                    try {
                        screenViewBuilder.addImpression(zzag(map4), (String) map4.get("list"));
                    } catch (RuntimeException e) {
                        str = "Failed to extract a product from DataLayer. ";
                        str2 = String.valueOf(e.getMessage());
                        zzbn.e(str2.length() != 0 ? str.concat(str2) : new String(str));
                    }
                }
            }
            List list2 = map2.containsKey("promoClick") ? (List) ((Map) map2.get("promoClick")).get("promotions") : map2.containsKey("promoView") ? (List) ((Map) map2.get("promoView")).get("promotions") : null;
            if (r0 != null) {
                for (Map map42 : r0) {
                    try {
                        screenViewBuilder.addPromotion(zzaf(map42));
                    } catch (RuntimeException e2) {
                        str = "Failed to extract a promotion from DataLayer. ";
                        str2 = String.valueOf(e2.getMessage());
                        zzbn.e(str2.length() != 0 ? str.concat(str2) : new String(str));
                    }
                }
                if (map2.containsKey("promoClick")) {
                    screenViewBuilder.set("&promoa", "click");
                    obj = null;
                    if (obj != null) {
                        for (String str22 : zzbrY) {
                            if (map2.containsKey(str22)) {
                                map3 = (Map) map2.get(str22);
                                list = (List) map3.get("products");
                                if (list != null) {
                                    for (Map map22 : list) {
                                        try {
                                            screenViewBuilder.addProduct(zzag(map22));
                                        } catch (RuntimeException e3) {
                                            str = "Failed to extract a product from DataLayer. ";
                                            String valueOf = String.valueOf(e3.getMessage());
                                            zzbn.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                        }
                                    }
                                }
                                try {
                                    screenViewBuilder.setProductAction(map3.containsKey("actionField") ? zzg(str22, (Map) map3.get("actionField")) : new ProductAction(str22));
                                } catch (RuntimeException e22) {
                                    String str3 = "Failed to extract a product action from DataLayer. ";
                                    str22 = String.valueOf(e22.getMessage());
                                    zzbn.e(str22.length() != 0 ? str3.concat(str22) : new String(str3));
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
                    if (map22.containsKey(str222)) {
                        map3 = (Map) map22.get(str222);
                        list = (List) map3.get("products");
                        if (list != null) {
                            while (r4.hasNext()) {
                                screenViewBuilder.addProduct(zzag(map22));
                            }
                        }
                        if (map3.containsKey("actionField")) {
                        }
                        screenViewBuilder.setProductAction(map3.containsKey("actionField") ? zzg(str222, (Map) map3.get("actionField")) : new ProductAction(str222));
                    }
                }
            }
        }
        tracker.send(screenViewBuilder.build());
    }

    private Map<String, String> zzc(zza com_google_android_gms_internal_zzag_zza) {
        Object zzl = zzdl.zzl(com_google_android_gms_internal_zzag_zza);
        if (!(zzl instanceof Map)) {
            return null;
        }
        Map map = (Map) zzl;
        Map<String, String> linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private void zze(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private ProductAction zzg(String str, Map<String, Object> map) {
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

    private String zzgS(String str) {
        Object obj = this.zzbnS.get(str);
        return obj == null ? null : obj.toString();
    }

    private List<Map<String, String>> zzgT(String str) {
        Object obj = this.zzbnS.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
                }
            }
            return (List) obj;
        }
        throw new IllegalArgumentException("transactionProducts should be of type List.");
    }

    private boolean zzj(Map<String, zza> map, String str) {
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(str);
        return com_google_android_gms_internal_zzag_zza == null ? false : zzdl.zzk(com_google_android_gms_internal_zzag_zza).booleanValue();
    }

    private Map<String, String> zzm(zza com_google_android_gms_internal_zzag_zza) {
        if (com_google_android_gms_internal_zzag_zza == null) {
            return new HashMap();
        }
        Map<String, String> zzc = zzc(com_google_android_gms_internal_zzag_zza);
        if (zzc == null) {
            return new HashMap();
        }
        String str = (String) zzc.get("&aip");
        if (str != null && this.zzbsd.contains(str.toLowerCase())) {
            zzc.remove("&aip");
        }
        return zzc;
    }

    public /* bridge */ /* synthetic */ String zzJO() {
        return super.zzJO();
    }

    public /* bridge */ /* synthetic */ Set zzJP() {
        return super.zzJP();
    }

    public /* bridge */ /* synthetic */ boolean zzJf() {
        return super.zzJf();
    }

    public void zzX(Map<String, zza> map) {
        Tracker zzgK = this.zzbse.zzgK("_GTM_DEFAULT_TRACKER_");
        zzgK.enableAdvertisingIdCollection(zzj(map, "collect_adid"));
        if (zzj(map, zzbrR)) {
            zzb(zzgK, map);
        } else if (zzj(map, zzbrQ)) {
            zzgK.send(zzm((zza) map.get(zzbrU)));
        } else if (zzj(map, zzbrV)) {
            zza(zzgK, map);
        } else {
            zzbn.zzaW("Ignoring unknown tag.");
        }
    }
}
