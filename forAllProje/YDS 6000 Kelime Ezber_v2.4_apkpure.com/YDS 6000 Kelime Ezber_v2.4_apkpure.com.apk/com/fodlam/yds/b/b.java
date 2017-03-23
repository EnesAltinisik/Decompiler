package com.fodlam.yds.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

public class b extends ArrayAdapter<c> {
    public b(Context context, List<c> list) {
        super(context, 0, list);
    }

    public int getItemViewType(int i) {
        return ((c) getItem(i)).a();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return ((c) getItem(i)).a(i, view, getContext());
    }

    public int getViewTypeCount() {
        return 4;
    }
}
