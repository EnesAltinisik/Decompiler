package com.pinarsu.siparis.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.model.Category;
import com.pinarsu.siparis.model.data.TESLIMAT_SAATLERI;
import com.pinarsu.siparis.tools.DateTimeTool;
import com.pinarsu.siparis.tools.DateTimeTool.DATETIMEFORMAT;
import com.pinarsu.siparis.view.AnimatedExpandableListView.AnimatedExpandableListAdapter;
import com.pinarsu.siparis.view.TextView;
import java.util.List;

@SuppressLint({"InflateParams"})
public class DeliveryHoursAnimatedExpandableAdapter extends AnimatedExpandableListAdapter {
    private Context c;
    private List<Category> catList;

    private class ChildHolder {
        public TextView tvFinishHour;
        public TextView tvStartHour;

        private ChildHolder() {
        }
    }

    public class GroupHolder {
        public ImageView im;
        public LinearLayout linearChildTitle;
        public LinearLayout linearParent;
        public TextView tvTitle;
    }

    public DeliveryHoursAnimatedExpandableAdapter(List<Category> list, Context context) {
        this.catList = list;
        this.c = context;
    }

    public Object getChild(int i, int i2) {
        return ((Category) this.catList.get(i)).list.get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getRealChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        ChildHolder childHolder;
        LayoutInflater layoutInflater = (LayoutInflater) this.c.getSystemService("layout_inflater");
        if (view == null) {
            childHolder = new ChildHolder();
            view = layoutInflater.inflate(R.layout.row_delivery_hours_child, viewGroup, false);
            childHolder.tvStartHour = (TextView) view.findViewById(R.id.tvStartHour);
            childHolder.tvFinishHour = (TextView) view.findViewById(R.id.tvFinishHour);
            view.setTag(childHolder);
        } else {
            childHolder = (ChildHolder) view.getTag();
        }
        TESLIMAT_SAATLERI teslimat_saatleri = (TESLIMAT_SAATLERI) ((Category) this.catList.get(i)).list.get(i2);
        String str = teslimat_saatleri.BASLANGIC_SAATI;
        if (str.isEmpty()) {
            childHolder.tvStartHour.setText("");
        } else {
            childHolder.tvStartHour.setText(DateTimeTool.getHourMinute(str));
        }
        str = teslimat_saatleri.BITIS_SAATI;
        if (teslimat_saatleri.BITIS_SAATI.isEmpty()) {
            childHolder.tvFinishHour.setText("");
        } else {
            childHolder.tvFinishHour.setText(DateTimeTool.getHourMinute(str));
        }
        return view;
    }

    public int getRealChildrenCount(int i) {
        return ((Category) this.catList.get(i)).list.size();
    }

    public Category getGroup(int i) {
        return (Category) this.catList.get(i);
    }

    public int getGroupCount() {
        return this.catList.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        GroupHolder groupHolder;
        LayoutInflater layoutInflater = (LayoutInflater) this.c.getSystemService("layout_inflater");
        if (view == null) {
            groupHolder = new GroupHolder();
            view = layoutInflater.inflate(R.layout.row_delivery_hours_group, null);
            groupHolder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            groupHolder.im = (ImageView) view.findViewById(R.id.im);
            groupHolder.linearParent = (LinearLayout) view.findViewById(R.id.linearParent);
            groupHolder.linearChildTitle = (LinearLayout) view.findViewById(R.id.linearChildTitle);
            view.setTag(groupHolder);
        } else {
            groupHolder = (GroupHolder) view.getTag();
        }
        String str = ((Category) this.catList.get(i)).title;
        if (str.isEmpty()) {
            groupHolder.tvTitle.setText("");
        } else {
            groupHolder.tvTitle.setText(DateTimeTool.getDateWithMonthDayName(str, DATETIMEFORMAT.AROX));
        }
        if (z) {
            groupHolder.im.setImageResource(R.drawable.down_arrow);
            groupHolder.linearParent.setBackgroundResource(17170443);
            groupHolder.linearChildTitle.setVisibility(0);
            groupHolder.tvTitle.setTextColor(this.c.getResources().getColor(R.color.blue_dark));
        } else {
            groupHolder.im.setImageResource(R.drawable.right_arrow);
            groupHolder.linearParent.setBackgroundResource(R.color.gray_light_accent);
            groupHolder.linearChildTitle.setVisibility(8);
            groupHolder.tvTitle.setTextColor(this.c.getResources().getColor(17170443));
        }
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
