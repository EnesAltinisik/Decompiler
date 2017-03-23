package com.pinarsu.siparis.interfaces;

import java.io.Serializable;

public interface IDelegateOneObjectLister extends Serializable {
    void onObject(Object obj, int i);
}
