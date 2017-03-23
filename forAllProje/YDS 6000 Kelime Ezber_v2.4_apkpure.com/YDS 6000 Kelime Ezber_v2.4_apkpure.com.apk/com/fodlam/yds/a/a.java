package com.fodlam.yds.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.fodlam.yds.R;
import java.util.HashMap;
import java.util.List;

public class a extends BaseExpandableListAdapter {
    private Context a;
    private List<String> b;
    private HashMap<String, List<a>> c;

    public static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public a(Context context, List<String> list, HashMap<String, List<a>> hashMap) {
        this.a = context;
        this.b = list;
        this.c = hashMap;
    }

    public Object getChild(int i, int i2) {
        return ((List) this.c.get(this.b.get(i))).get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        CharSequence charSequence = ((a) getChild(i, i2)).a;
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.list_item, null);
        }
        ((TextView) view.findViewById(R.id.expandedListItem)).setText(charSequence);
        return view;
    }

    public int getChildrenCount(int i) {
        return ((List) this.c.get(this.b.get(i))).size();
    }

    public Object getGroup(int i) {
        return this.b.get(i);
    }

    public int getGroupCount() {
        return this.b.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        String str = (String) getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.list_group, null);
        }
        TextView textView = (TextView) view.findViewById(R.id.listTitle);
        textView.setTypeface(null, 1);
        textView.setText(str);
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
