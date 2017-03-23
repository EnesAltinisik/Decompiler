package com.pinarsu.siparis.tools;

import java.util.Comparator;

public class CustomComparatorInt<T> implements Comparator<T> {
    String str1;
    String str2;

    public CustomComparatorInt(String str, String str2) {
        this.str1 = str;
        this.str2 = str2;
    }

    public int compare(T t, T t2) {
        int intValue = ((Integer) getValue(t, this.str1)).intValue();
        int intValue2 = ((Integer) getValue(t2, this.str2)).intValue();
        if (intValue2 > intValue) {
            return -1;
        }
        return intValue2 == intValue ? 0 : 1;
    }

    private Object getValue(T t, String str) {
        try {
            return t.getClass().getField(str).get(t);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
