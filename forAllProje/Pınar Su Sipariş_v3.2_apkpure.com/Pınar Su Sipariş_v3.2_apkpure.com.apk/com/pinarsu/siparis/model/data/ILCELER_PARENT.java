package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class ILCELER_PARENT implements Serializable {
    @SerializedName("ILCELER")
    public List<ILCELER> list;
}
