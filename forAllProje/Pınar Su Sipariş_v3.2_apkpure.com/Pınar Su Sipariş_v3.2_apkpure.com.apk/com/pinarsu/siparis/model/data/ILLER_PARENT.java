package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class ILLER_PARENT implements Serializable {
    @SerializedName("ILLER")
    public List<ILLER> list;
}
