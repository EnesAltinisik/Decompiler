package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class MALZEMELER_PARENT {
    @SerializedName("BANNERLAR")
    public List<String> bannerList;
    @SerializedName("TESLIMAT_SAATLERI")
    public List<TESLIMAT_SAATLERI> deliveryList;
    @SerializedName("MALZEMELER")
    public List<MALZEMELER> productList;
}
