package com.pinarsu.siparis.model.data;

import java.io.Serializable;

public class ADRES implements Serializable {
    public String AD;
    public String ADRES;
    public String ADRES_ETIKETI;
    public String APARTMAN_ADI;
    public String BAYI_NO;
    public String BINA_NO;
    public String DAIRE_NO;
    public String ILCE_ADI;
    public String ILCE_KODU;
    public String IL_ADI;
    public String IL_KODU;
    public String MAHALLE_ADI;
    public String MAHALLE_KODU;
    public String SOKAK_ADI;
    public String SOKAK_KODU;
    public String SOYADI;
    public String TARIF;

    public String getAddress() {
        String str = "";
        if (!(this.MAHALLE_ADI == null || this.MAHALLE_ADI.isEmpty())) {
            str = str + this.MAHALLE_ADI + " mah. ";
        }
        if (!(this.SOKAK_ADI == null || this.SOKAK_ADI.isEmpty())) {
            str = str + this.SOKAK_ADI + " sok. ";
        }
        if (!(this.APARTMAN_ADI == null || this.APARTMAN_ADI.isEmpty())) {
            str = str + this.APARTMAN_ADI + " apt. ";
        }
        if (!(this.BINA_NO == null || this.BINA_NO.isEmpty())) {
            str = str + this.BINA_NO + " / " + this.DAIRE_NO;
        }
        return str + "\n" + this.ILCE_ADI + " / " + this.IL_ADI;
    }

    public String getAddressWithoutCityTown() {
        String str = "";
        if (!(this.MAHALLE_ADI == null || this.MAHALLE_ADI.isEmpty())) {
            str = str + this.MAHALLE_ADI + " mah. ";
        }
        if (!(this.SOKAK_ADI == null || this.SOKAK_ADI.isEmpty())) {
            str = str + this.SOKAK_ADI + " sok. ";
        }
        if (!(this.APARTMAN_ADI == null || this.APARTMAN_ADI.isEmpty())) {
            str = str + this.APARTMAN_ADI + " apt. ";
        }
        if (this.BINA_NO == null || this.BINA_NO.isEmpty()) {
            return str;
        }
        return str + this.BINA_NO + " / " + this.DAIRE_NO;
    }
}
