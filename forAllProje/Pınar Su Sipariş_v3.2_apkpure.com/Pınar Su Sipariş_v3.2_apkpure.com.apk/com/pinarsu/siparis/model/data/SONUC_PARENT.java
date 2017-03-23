package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class SONUC_PARENT implements Serializable {
    @SerializedName("BASARILI_SONUC_MESAJI")
    public String BASARILI_SONUC_MESAJI;
    @SerializedName("SONUC")
    public String SONUC;
}
