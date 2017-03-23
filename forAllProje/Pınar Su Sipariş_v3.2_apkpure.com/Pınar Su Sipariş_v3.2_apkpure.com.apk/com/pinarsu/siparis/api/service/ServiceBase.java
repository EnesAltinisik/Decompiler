package com.pinarsu.siparis.api.service;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.api.SapConnector;
import com.pinarsu.siparis.interfaces.ISapResponseListener;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.ui.fragment.ProgressDialogFragment;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;
import org.b.a.g;
import org.b.a.h;
import org.json.JSONArray;
import org.json.JSONObject;

public class ServiceBase {
    private static final String PINAR_SERVICE_ERROR = "Pınar Su servislerine ulaşılamadı. Lütfen daha sonra tekrar deneyiniz.";
    private String NAMESPACE = MyApplication.getInstance().getServiceNamespace();
    private IServiceResponse delegate;

    public class Retrieve2 extends AsyncTask<Void, Void, Void> {
        final AppCompatActivity activity;
        final ProgressDialogFragment progressDialogFragment = ProgressDialogFragment.newInstance();
        final ServiceItem serviceItem;

        public Retrieve2(ServiceItem serviceItem, AppCompatActivity appCompatActivity) {
            this.serviceItem = serviceItem;
            this.activity = appCompatActivity;
        }

        protected void onPreExecute() {
            super.onPreExecute();
            try {
                this.progressDialogFragment.show(this.activity);
            } catch (IllegalStateException e) {
                e.printStackTrace();
                cancel(true);
            }
        }

        protected Void doInBackground(Void... voidArr) {
            ServiceBase.this.request(this.serviceItem);
            return null;
        }

        protected void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            try {
                this.progressDialogFragment.dismissAllowingStateLoss();
            } catch (IllegalStateException e) {
                Log.w("MNTTAG", "progressDialogFragment.dismiss() error");
            }
            ServiceBase.this.delegate.onResponse(this.serviceItem);
        }
    }

    public ServiceBase(IServiceResponse iServiceResponse) {
        this.delegate = iServiceResponse;
    }

    private void request(final ServiceItem serviceItem) {
        try {
            new SapConnector().connect(prepare(serviceItem), new ISapResponseListener() {
                public void onSuccessfullResult(h hVar) {
                    try {
                        ServiceBase.this.parse(hVar, serviceItem);
                    } catch (Exception e) {
                        serviceItem.serviceErrorItem = new ServiceErrorItem();
                        serviceItem.serviceErrorItem.detail = ServiceBase.PINAR_SERVICE_ERROR;
                    }
                }

                public void onUnsuccessfullResult(ServiceErrorItem serviceErrorItem) {
                    serviceItem.serviceErrorItem = serviceErrorItem;
                }
            });
        } catch (TimeoutException e) {
            serviceItem.serviceErrorItem = new ServiceErrorItem();
            serviceItem.serviceErrorItem.detail = PINAR_SERVICE_ERROR;
        } catch (SocketTimeoutException e2) {
            serviceItem.serviceErrorItem = new ServiceErrorItem();
            serviceItem.serviceErrorItem.detail = PINAR_SERVICE_ERROR;
        } catch (Exception e3) {
            serviceItem.serviceErrorItem = new ServiceErrorItem();
            serviceItem.serviceErrorItem.detail = PINAR_SERVICE_ERROR;
        }
    }

    private h prepare(ServiceItem serviceItem) throws Exception {
        h hVar = new h(this.NAMESPACE, serviceItem.type.method);
        for (ServiceItemRequestParameter serviceItemRequestParameter : serviceItem.parameterList) {
            if (serviceItemRequestParameter.soapObject != null) {
                hVar.a(serviceItemRequestParameter.soapObject);
            } else {
                hVar.b(serviceItemRequestParameter.paramName, serviceItemRequestParameter.paramValue);
            }
        }
        hVar.b("VERSIYON_NO", "4");
        return hVar;
    }

    private void parse(h hVar, ServiceItem serviceItem) throws Exception {
        if (hVar.a_() != 0) {
            Class cls = serviceItem.type.clazz;
            Gson gson = new Gson();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            for (int i = 0; i < hVar.a_(); i++) {
                Object a_ = hVar.a_(i);
                g gVar = new g();
                hVar.a(i, gVar);
                g gVar2;
                if (!(a_ instanceof h) || ((h) a_).a_() <= 0) {
                    gVar2 = new g();
                    hVar.a(i, gVar2);
                    if (gVar2.d().toString().equals("anyType{}")) {
                        jSONObject.put(gVar2.b(), null);
                    } else {
                        jSONObject.put(gVar2.b(), gVar2.d().toString());
                    }
                } else {
                    JSONArray jSONArray = new JSONArray();
                    h hVar2 = (h) a_;
                    for (int i2 = 0; i2 < hVar2.a_(); i2++) {
                        Object a_2 = hVar2.a_(i2);
                        if (!(a_2 instanceof h) || ((h) a_2).a_() <= 0) {
                            gVar2 = new g();
                            hVar2.a(i2, gVar2);
                            if (gVar2.b().equals("item")) {
                                jSONArray.put(gVar2.d());
                            } else if (gVar2.d().toString().equals("anyType{}")) {
                                jSONObject2.put(gVar2.b(), null);
                            } else {
                                jSONObject2.put(gVar2.b(), gVar2.d().toString());
                            }
                        } else {
                            h hVar3 = (h) a_2;
                            JSONObject jSONObject4 = new JSONObject();
                            for (int i3 = 0; i3 < hVar3.a_(); i3++) {
                                Object a_3 = hVar3.a_(i3);
                                if (!(a_3 instanceof h) || ((h) a_3).a_() <= 0) {
                                    gVar2 = new g();
                                    hVar3.a(i3, gVar2);
                                    if (gVar2.d().toString().equals("anyType{}")) {
                                        jSONObject4.put(gVar2.b(), null);
                                    } else {
                                        jSONObject4.put(gVar2.b(), gVar2.d().toString());
                                    }
                                } else {
                                    g gVar3 = new g();
                                    hVar3.a(i3, gVar3);
                                    jSONObject3 = new JSONObject();
                                    h hVar4 = (h) a_3;
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (int i4 = 0; i4 < hVar4.a_(); i4++) {
                                        g gVar4 = new g();
                                        hVar4.a(i4, gVar4);
                                        jSONArray2.put(gVar4.d().toString().replace("anyType{}", ""));
                                    }
                                    jSONObject4.put(gVar3.b(), jSONArray2);
                                }
                            }
                            jSONArray.put(jSONObject4);
                        }
                    }
                    if (jSONArray == null || jSONArray.length() <= 0) {
                        jSONObject.put(gVar.b(), jSONObject2);
                    } else {
                        jSONObject.put(gVar.b(), jSONArray);
                    }
                }
            }
            try {
                serviceItem.object = gson.fromJson(jSONObject.toString(), cls);
            } catch (JsonSyntaxException e) {
                serviceItem.object = null;
            }
        }
    }
}
