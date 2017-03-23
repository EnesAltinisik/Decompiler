package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DUYURULAR_PARENT {
    @SerializedName("DUYURULAR")
    public List<DUYURULAR> duyurularList;
    @SerializedName("SERTIFIKALAR")
    public List<SERTIFIKALAR> sertifikaList;
}
