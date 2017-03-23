package com.pinarsu.siparis.interfaces;

import com.pinarsu.siparis.model.PushServiceChangeStatusItem;
import com.pinarsu.siparis.model.PushServiceResponseItem;
import com.pinarsu.siparis.model.PushServiceSaveTokenItem;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

public interface IServicePush {
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("/changestatus")
    void getChangeStatus(@Body PushServiceChangeStatusItem pushServiceChangeStatusItem, Callback<PushServiceResponseItem> callback);

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("/savetoken")
    void getPushToken(@Body PushServiceSaveTokenItem pushServiceSaveTokenItem, Callback<PushServiceResponseItem> callback);
}
