package com.pinarsu.siparis.tools;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class CustomComparator<T> implements Comparator<T> {
    private static final Collator collator = Collator.getInstance(new Locale("tr_TR"));
    String str1;
    String str2;

    public CustomComparator(String str, String str2) {
        this.str1 = str;
        this.str2 = str2;
    }

    public int compare(T t, T t2) {
        return collator.compare(String.valueOf(getValue(t, this.str1)), String.valueOf(getValue(t2, this.str2)));
    }

    private Object getValue(T t, String str) {
        try {
            return t.getClass().getField(str).get(t);
        } catch (NoSuchFieldException e) {
            return null;
        } catch (IllegalAccessException e2) {
            return null;
        }
    }
}
