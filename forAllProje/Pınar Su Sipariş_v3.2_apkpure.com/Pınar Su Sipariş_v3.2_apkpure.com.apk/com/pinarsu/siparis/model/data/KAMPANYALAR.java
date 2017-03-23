package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class KAMPANYALAR implements Serializable {
    @SerializedName("GECERLI_ADRES")
    public String GECERLI_ADRES;
    @SerializedName("KAMPANYA_ADI")
    public String KAMPANYA_ADI;
    @SerializedName("KAMPANYA_TANIMI")
    public String KAMPANYA_TANIMI;
    @SerializedName("RESIM_ADRESI")
    public String RESIM_ADRESI;
}
