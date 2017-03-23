package com.pinarsu.siparis.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.cast.TextTrackStyle;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.model.NavDrawerItem;
import java.util.List;

public class LeftNavigationBaseAdapter extends BaseAdapter {
    Activity activity;
    public List<NavDrawerItem> list;

    public static class ViewHolder {
        public ImageView im;
        public LinearLayout linear;
    }

    public LeftNavigationBaseAdapter(Activity activity, List<NavDrawerItem> list) {
        this.activity = activity;
        this.list = list;
    }

    public int getCount() {
        return this.list.size();
    }

    public NavDrawerItem getItem(int i) {
        return (NavDrawerItem) this.list.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"InflateParams", "DefaultLocale"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        LayoutInflater layoutInflater = this.activity.getLayoutInflater();
        if (view == null) {
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.nav_drawer_row, null);
            viewHolder.im = (ImageView) view.findViewById(R.id.im);
            viewHolder.linear = (LinearLayout) view.findViewById(R.id.linear);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        NavDrawerItem navDrawerItem = (NavDrawerItem) this.list.get(i);
        viewHolder.im.setImageResource(navDrawerItem.drawableId.intValue());
        viewHolder.im.setTag(Integer.valueOf(i));
        if (navDrawerItem.isActive) {
            viewHolder.im.setAlpha(TextTrackStyle.DEFAULT_FONT_SCALE);
        } else {
            viewHolder.im.setAlpha(0.5f);
        }
        return view;
    }

    public void setItemVisibility(int i, boolean z) {
        ((NavDrawerItem) this.list.get(i)).isActive = z;
        notifyDataSetChanged();
    }

    public void remove(int i) {
        this.list.remove(i);
        notifyDataSetChanged();
    }
}
