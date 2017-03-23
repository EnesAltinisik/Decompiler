package com.pinarsu.siparis.model;

import java.util.List;

public class Category<T> {
    public int dateInt;
    public List<T> list;
    public String title;

    public Category(String str, List<T> list, int i) {
        this.title = str;
        this.list = list;
        this.dateInt = i;
    }

    public Category(String str, List<T> list) {
        this.title = str;
        this.list = list;
    }
}
