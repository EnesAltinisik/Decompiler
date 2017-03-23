package com.pinarsu.siparis.model.data;

import com.google.gson.annotations.SerializedName;
import com.pinarsu.siparis.model.SurveyAnswer;
import java.io.Serializable;
import java.util.List;

public class SORULAR implements Serializable {
    public String CEVAP_METNI = "";
    public long SORU_ID;
    public String SORU_METNI;
    public String TEK_CEVAP_SECILSIN;
    public List<SurveyAnswer> answerObjectList;
    @SerializedName("CEVAP_SECENEKLERI")
    public List<String> questionList;
}
