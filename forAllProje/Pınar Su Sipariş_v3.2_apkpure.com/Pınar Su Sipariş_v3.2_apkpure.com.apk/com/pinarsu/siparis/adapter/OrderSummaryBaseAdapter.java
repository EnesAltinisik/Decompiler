package com.pinarsu.siparis.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IClickListener;
import com.pinarsu.siparis.model.data.SIPARISLER;
import com.pinarsu.siparis.tools.DateTimeTool;
import com.pinarsu.siparis.tools.DateTimeTool.DATETIMEFORMAT;
import com.pinarsu.siparis.view.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class OrderSummaryBaseAdapter extends BaseAdapter {
    Activity activity;
    IClickListener delegate;
    SIPARISLER item;
    List<SIPARISLER> list;

    public static class ViewHolder {
        public ImageView imDelete;
        public ImageView imPhoto;
        public TextView tvDate;
        public TextView tvQuantity;
        public TextView tvStatus;
        public TextView tvTime;
        public TextView tvTitle;
    }

    public OrderSummaryBaseAdapter(Activity activity, List<SIPARISLER> list, IClickListener iClickListener) {
        this.activity = activity;
        this.list = list;
        this.delegate = iClickListener;
    }

    public int getCount() {
        return this.list.size();
    }

    public Object getItem(int i) {
        return null;
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
            view = layoutInflater.inflate(R.layout.row_order_summary, null);
            viewHolder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            viewHolder.tvStatus = (TextView) view.findViewById(R.id.tvStatus);
            viewHolder.imPhoto = (ImageView) view.findViewById(R.id.imPhoto);
            viewHolder.tvDate = (TextView) view.findViewById(R.id.tvDate);
            viewHolder.tvTime = (TextView) view.findViewById(R.id.tvTime);
            viewHolder.tvQuantity = (TextView) view.findViewById(R.id.tvQuantity);
            viewHolder.imDelete = (ImageView) view.findViewById(R.id.imDelete);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        this.item = (SIPARISLER) this.list.get(i);
        if (this.item.MALZEMEADI == null || this.item.MALZEMEADI.isEmpty()) {
            viewHolder.tvTitle.setText("");
        } else {
            viewHolder.tvTitle.setText("" + this.item.MALZEMEADI);
        }
        if (this.item.SIPARIS_DURUMU == null || this.item.SIPARIS_DURUMU.isEmpty()) {
            viewHolder.tvStatus.setText("");
        } else {
            viewHolder.tvStatus.setText("" + this.item.SIPARIS_DURUMU);
        }
        Log.d("MNTTAG", "item.SIP_TARIH : " + this.item.SIP_TARIH);
        if (this.item.SIP_TARIH == null || this.item.SIP_TARIH.isEmpty()) {
            viewHolder.tvDate.setText("");
        } else {
            viewHolder.tvDate.setText(DateTimeTool.getDateWithFormat(DateTimeTool.getDateTime(this.item.SIP_TARIH, DATETIMEFORMAT.AROX), DATETIMEFORMAT.DATESLASH));
        }
        if (this.item.SIP_SAAT == null || this.item.SIP_SAAT.isEmpty()) {
            viewHolder.tvTime.setText("");
        } else {
            CharSequence replace = this.item.SIP_SAAT.replace(":00:00", ":00");
            if (replace.length() == 8) {
                replace = replace.substring(0, 5);
            }
            viewHolder.tvTime.setText(replace);
        }
        if (this.item.MIKTAR == null || this.item.MIKTAR.isEmpty()) {
            viewHolder.tvQuantity.setText("0 Adet");
        } else {
            viewHolder.tvQuantity.setText(this.item.MIKTAR + " Adet");
        }
        if (this.item.RESIM_ADRESI == null || this.item.RESIM_ADRESI.isEmpty()) {
            Picasso.with(viewGroup.getContext()).load((int) R.drawable.circle_white).into(viewHolder.imPhoto);
        } else {
            Picasso.with(viewGroup.getContext()).load(this.item.RESIM_ADRESI).error((int) R.drawable.circle_white).into(viewHolder.imPhoto);
        }
        viewHolder.imDelete.setTag(Integer.valueOf(i));
        if (this.item.IPTAL_EDILEBILIR == null || !this.item.IPTAL_EDILEBILIR.equals("X")) {
            viewHolder.imDelete.setVisibility(8);
        } else {
            viewHolder.imDelete.setVisibility(0);
        }
        viewHolder.imDelete.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                OrderSummaryBaseAdapter.this.delegate.onClickListener(((Integer) view.getTag()).intValue());
            }
        });
        return view;
    }
}
