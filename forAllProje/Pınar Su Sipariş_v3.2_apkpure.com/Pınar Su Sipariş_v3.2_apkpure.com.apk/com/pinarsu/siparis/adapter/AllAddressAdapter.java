package com.pinarsu.siparis.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.tools.Tools;
import java.util.List;

public class AllAddressAdapter extends BaseAdapter {
    Activity activity;
    IDelegateOneObjectLister delegate;
    ADRES item;
    List<ADRES> list;

    public static class ViewHolder {
        public ImageView imDelete;
        public ImageView imEdit;
        public ImageView imRightArrow;
        public TextView tvDetail;
        public TextView tvTitle;
    }

    public AllAddressAdapter(Activity activity, List<ADRES> list, IDelegateOneObjectLister iDelegateOneObjectLister) {
        this.activity = activity;
        this.list = list;
        this.delegate = iDelegateOneObjectLister;
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
            view = layoutInflater.inflate(R.layout.row_my_registered_address, null);
            viewHolder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            viewHolder.tvDetail = (TextView) view.findViewById(R.id.tvDetail);
            viewHolder.imEdit = (ImageView) view.findViewById(R.id.imEdit);
            viewHolder.imDelete = (ImageView) view.findViewById(R.id.imDelete);
            viewHolder.imRightArrow = (ImageView) view.findViewById(R.id.imRightArrow);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        this.item = (ADRES) this.list.get(i);
        String str = this.item.ADRES_ETIKETI;
        if (str == null || str.isEmpty()) {
            viewHolder.tvTitle.setText(this.item.getAddressWithoutCityTown());
        } else {
            Tools.setTextViewUnderLine(viewHolder.tvTitle, str);
        }
        viewHolder.tvDetail.setText(this.item.ILCE_ADI + " / " + this.item.IL_ADI);
        viewHolder.imEdit.setTag(Integer.valueOf(i));
        viewHolder.imDelete.setTag(Integer.valueOf(i));
        viewHolder.imEdit.setImageResource(R.drawable.edit_white);
        viewHolder.imEdit.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                AllAddressAdapter.this.delegate.onObject(view, 0);
            }
        });
        viewHolder.imEdit.setVisibility(0);
        viewHolder.imDelete.setVisibility(0);
        viewHolder.imDelete.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                AllAddressAdapter.this.delegate.onObject(view, 0);
            }
        });
        return view;
    }
}
