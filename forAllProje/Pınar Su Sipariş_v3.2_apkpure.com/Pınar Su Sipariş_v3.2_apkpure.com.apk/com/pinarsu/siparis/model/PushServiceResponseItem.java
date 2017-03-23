package com.pinarsu.siparis.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PushServiceResponseItem {
    @SerializedName("Message")
    @Expose
    private String Message;
    @SerializedName("Succeed")
    @Expose
    private Integer Succeed;

    public Integer getSucceed() {
        return this.Succeed;
    }

    public void setSucceed(Integer num) {
        this.Succeed = num;
    }

    public String getMessage() {
        return this.Message;
    }

    public void setMessage(String str) {
        this.Message = str;
    }
}
