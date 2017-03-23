package com.pinarsu.siparis.adapter;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IOnItemViewClickListener;
import com.pinarsu.siparis.tools.DateTimeTool;
import com.pinarsu.siparis.tools.DateTimeTool.DATETIMEFORMAT;
import com.pinarsu.siparis.tools.calendarevent.CalendarItem;
import java.util.Calendar;
import java.util.List;

public class ReminderAdapter extends BaseAdapter implements OnClickListener {
    Activity activity;
    IOnItemViewClickListener delegate;
    CalendarItem item;
    List<CalendarItem> list;

    public static class ViewHolder {
        public ImageView imDelete;
        public ImageView imEdit;
        public TextView tvDetail;
        public TextView tvTitle;
    }

    public ReminderAdapter(Activity activity, List<CalendarItem> list, IOnItemViewClickListener iOnItemViewClickListener) {
        this.activity = activity;
        this.list = list;
        this.delegate = iOnItemViewClickListener;
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
            view = layoutInflater.inflate(R.layout.row_reminder, null);
            viewHolder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            viewHolder.tvDetail = (TextView) view.findViewById(R.id.tvDetail);
            viewHolder.imEdit = (ImageView) view.findViewById(R.id.imEdit);
            viewHolder.imDelete = (ImageView) view.findViewById(R.id.imDelete);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        this.item = (CalendarItem) this.list.get(i);
        Calendar calendarFromTimeMillis = DateTimeTool.getCalendarFromTimeMillis(this.item.start.longValue());
        CharSequence spannableString = new SpannableString(DateTimeTool.getDateWithFormat(calendarFromTimeMillis, DATETIMEFORMAT.AROX2));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        viewHolder.tvTitle.setText(spannableString);
        viewHolder.tvDetail.setText(DateTimeTool.getDateWithFormat(calendarFromTimeMillis, DATETIMEFORMAT.ONLYTIME_WITHOUT_SECOND) + " - " + this.item.description);
        viewHolder.imEdit.setTag(Integer.valueOf(i));
        viewHolder.imEdit.setOnClickListener(this);
        viewHolder.imDelete.setTag(Integer.valueOf(i));
        viewHolder.imDelete.setOnClickListener(this);
        return view;
    }

    public void onClick(View view) {
        this.delegate.onItemClick(view, ((Integer) view.getTag()).intValue());
    }
}
