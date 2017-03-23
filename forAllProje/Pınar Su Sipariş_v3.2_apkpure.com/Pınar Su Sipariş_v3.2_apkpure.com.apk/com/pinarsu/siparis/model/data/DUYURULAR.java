package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DUYURULAR implements Serializable {
    @SerializedName("DUYURU_BASLIK")
    public String DUYURU_BASLIK;
    @SerializedName("DUYURU_METNI")
    public String DUYURU_METNI;
    @SerializedName("DUYURU_TARIHI")
    public String DUYURU_TARIHI;
    @SerializedName("RESIM_ADRESI")
    public String RESIM_ADRESI;
}
