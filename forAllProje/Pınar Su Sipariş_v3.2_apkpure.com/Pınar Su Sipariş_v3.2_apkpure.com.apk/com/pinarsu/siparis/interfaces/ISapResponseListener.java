package com.pinarsu.siparis.interfaces;

import com.pinarsu.siparis.api.service.ServiceErrorItem;
import org.b.a.h;

public interface ISapResponseListener {
    void onSuccessfullResult(h hVar);

    void onUnsuccessfullResult(ServiceErrorItem serviceErrorItem);
}
