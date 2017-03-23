package com.pinarsu.siparis.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.model.SurveyAnswer;
import com.squareup.picasso.Picasso;
import java.util.List;

public class SurveyBaseAdapter extends BaseAdapter {
    Activity activity;
    public boolean isRadio;
    SurveyAnswer item;
    List<SurveyAnswer> list;

    public static class ViewHolder {
        public ImageView imPhoto;
        public LinearLayout linear;
        public TextView tvTitle;
    }

    public SurveyBaseAdapter(Activity activity, List<SurveyAnswer> list, boolean z) {
        this.activity = activity;
        this.list = list;
        this.isRadio = z;
    }

    public int getCount() {
        return this.list.size();
    }

    public Object getItem(int i) {
        return this.list.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        LayoutInflater layoutInflater = this.activity.getLayoutInflater();
        if (view == null) {
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.row_survey_viewpager_item, null);
            viewHolder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            viewHolder.imPhoto = (ImageView) view.findViewById(R.id.imPhoto);
            viewHolder.linear = (LinearLayout) view.findViewById(R.id.linear);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        this.item = (SurveyAnswer) this.list.get(i);
        if (this.item.answer.isEmpty()) {
            viewHolder.tvTitle.setText("");
        } else {
            viewHolder.tvTitle.setText("" + this.item.answer);
        }
        if (this.item.isChecked) {
            Picasso.with(viewGroup.getContext()).load((int) R.drawable.check_green_white).into(viewHolder.imPhoto);
            viewHolder.linear.setBackgroundColor(this.activity.getResources().getColor(R.color.blue_dark));
            viewHolder.tvTitle.setTextColor(this.activity.getResources().getColor(17170443));
        } else {
            Picasso.with(viewGroup.getContext()).load((int) R.drawable.circle_white).into(viewHolder.imPhoto);
            viewHolder.linear.setBackgroundColor(this.activity.getResources().getColor(R.color.ce2e1e1));
            viewHolder.tvTitle.setTextColor(this.activity.getResources().getColor(R.color.blue_dark));
        }
        return view;
    }

    public void clearFlags() {
        for (int i = 0; i < this.list.size(); i++) {
            ((SurveyAnswer) this.list.get(i)).isChecked = false;
        }
    }
}
