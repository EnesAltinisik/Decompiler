package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class ANKET_ARAMA_PARENT implements Serializable {
    @SerializedName("ANKET_ID")
    public long ANKET_ID;
    public int SORU_SAYISI;
    @SerializedName("SORULAR")
    public List<SORULAR> list;
}
