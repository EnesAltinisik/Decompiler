package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class MAHALLELER_PARENT implements Serializable {
    @SerializedName("MAHALLELER")
    public List<MAHALLELER> list;
}
