package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class SOKAKLAR_PARENT implements Serializable {
    @SerializedName("SOKAKLAR")
    public List<SOKAKLAR> list;
}
