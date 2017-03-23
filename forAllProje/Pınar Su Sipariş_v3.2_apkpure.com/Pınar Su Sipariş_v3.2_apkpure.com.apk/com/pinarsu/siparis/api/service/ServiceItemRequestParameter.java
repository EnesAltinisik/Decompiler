package com.pinarsu.siparis.api.service;

import org.b.a.h;

public class ServiceItemRequestParameter {
    public String paramName;
    public String paramValue;
    public h soapObject;

    public ServiceItemRequestParameter(String str, String str2) {
        this.paramName = str;
        this.paramValue = str2;
    }

    public ServiceItemRequestParameter(String str, h hVar) {
        this.paramName = str;
        this.soapObject = hVar;
    }
}
