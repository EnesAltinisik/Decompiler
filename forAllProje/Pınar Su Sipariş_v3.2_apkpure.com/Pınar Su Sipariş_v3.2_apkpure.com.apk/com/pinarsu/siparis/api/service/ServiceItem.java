package com.pinarsu.siparis.api.service;

import com.pinarsu.siparis.model.data.ADRESLER_PARENT;
import com.pinarsu.siparis.model.data.ANKET_ARAMA_PARENT;
import com.pinarsu.siparis.model.data.DUYURULAR_PARENT;
import com.pinarsu.siparis.model.data.ILCELER_PARENT;
import com.pinarsu.siparis.model.data.ILLER_PARENT;
import com.pinarsu.siparis.model.data.KAMPANYALAR_PARENT;
import com.pinarsu.siparis.model.data.MAHALLELER_PARENT;
import com.pinarsu.siparis.model.data.MALZEMELER_PARENT;
import com.pinarsu.siparis.model.data.MUSTERI_ARAMA_ADRES;
import com.pinarsu.siparis.model.data.SIPARISLER_PARENT;
import com.pinarsu.siparis.model.data.SIPARIS_TUTARI_PARENT;
import com.pinarsu.siparis.model.data.SOKAKLAR_PARENT;
import com.pinarsu.siparis.model.data.SONUC_PARENT;
import com.pinarsu.siparis.model.data.SON_SIPARIS_PARENT;
import com.pinarsu.siparis.model.data.TUM_MALZEMELER_PARENT;
import java.util.ArrayList;
import java.util.List;

public class ServiceItem<T> {
    public T object;
    public List<ServiceItemRequestParameter> parameterList = new ArrayList();
    public ServiceErrorItem serviceErrorItem;
    public REQUEST_TYPE type;

    public enum REQUEST_TYPE {
        LAST_10_ORDER(SIPARISLER_PARENT.class, "Z_SDB_RFC_MUSTERI_SON_ON_SIP"),
        CUSTOMER_SEARCH(MUSTERI_ARAMA_ADRES.class, "Z_SDB_RFC_MUSTERI_ARAMA"),
        LAST_ORDER(SON_SIPARIS_PARENT.class, "Z_SDB_RFC_MUSTERI_SON_SIPARIS"),
        SURVEY_SEARCH(ANKET_ARAMA_PARENT.class, "Z_SDB_RFC_ANKET_ARAMA"),
        SURVEY_SAVE(null, "Z_SDB_RFC_ANKET_KAYDETME"),
        CITY_LIST(ILLER_PARENT.class, "Z_SDB_RFC_IL_LISTESI"),
        TOWN_LIST(ILCELER_PARENT.class, "Z_SDB_RFC_ILCE_LISTESI"),
        DISTRICT_LIST(MAHALLELER_PARENT.class, "Z_SDB_RFC_MAHALLE_LISTESI"),
        STREET_LIST(SOKAKLAR_PARENT.class, "Z_SDB_RFC_SOKAK_LISTESI"),
        CREATE_ADDRESS(null, "Z_SDB_RFC_MUSTERI_ADRES_KAYDET"),
        ALL_ADDRESS(ADRESLER_PARENT.class, "Z_SDB_RFC_MUSTERI_TUM_ADRESLER"),
        ALL_PRODUCTS(TUM_MALZEMELER_PARENT.class, "Z_SDB_RFC_PINARSU_TUM_URUNLERI"),
        SEND_VERIFICATION_CODE(null, "Z_SDB_RFC_DOGRULAMA_KOD_GONDER"),
        VERY_VERIFICATION_CODE(SONUC_PARENT.class, "Z_SDB_RFC_KOD_DOGRULA"),
        GIVE_ORDER(SONUC_PARENT.class, "Z_SDB_RFC_MOBIL_SIPARIS_KAYDET"),
        PRODUCTS_IN_ADDRESS(MALZEMELER_PARENT.class, "Z_SDB_RFC_ADRESTE_SAT_URUNLER"),
        ANNOUNCEMENTS_AND_NEWS(DUYURULAR_PARENT.class, "Z_SDB_RFC_PINAR_DUYURU_HABER"),
        UPDATE_ADDRESS(null, "Z_SDB_RFC_MUSTERI_ADRES_GUNC"),
        DELETE_ADDRESS(null, "Z_SDB_RFC_MUSTERI_ADRES_SIL"),
        CALCULATE_ORDER_TOTAL(SIPARIS_TUTARI_PARENT.class, "Z_SDB_RFC_SIPARIS_TUTARI_HESAP"),
        CAMPAIGNS_IN_ADDRESS(KAMPANYALAR_PARENT.class, "Z_SDB_RFC_MUSTERI_KAMPANYALARI"),
        ALL_CAMPAIGNS(KAMPANYALAR_PARENT.class, "Z_SDB_RFC_MUSTERI_KAMPANYALARI"),
        CREATE_CUSTOMER(null, "Z_SDB_RFC_MB_MUSTERI_YARAT"),
        UPDATE_CUSTOMER_PHONE(null, "Z_SDB_RFC_MUSTERI_TELEFON_GUNC"),
        DELETE_ORDER(null, "Z_SDB_RFC_ILERI_TRH_SIP_IPTAL");
        
        public Class clazz;
        public String method;

        private REQUEST_TYPE(Class cls, String str) {
            this.clazz = cls;
            this.method = str;
        }
    }

    public ServiceItem(REQUEST_TYPE request_type) {
        this.type = request_type;
    }
}
