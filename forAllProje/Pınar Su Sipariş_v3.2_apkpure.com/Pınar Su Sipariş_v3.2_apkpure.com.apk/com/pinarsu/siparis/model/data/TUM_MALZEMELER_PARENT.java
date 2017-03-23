package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TUM_MALZEMELER_PARENT {
    @SerializedName("BANNERLAR")
    public List<String> bannerList;
    @SerializedName("URUNLER")
    public List<MALZEMELER> productList;
}
