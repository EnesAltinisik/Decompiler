package com.pinarsu.siparis.adapter;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.model.data.MALZEMELER;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.activity.OrderActivity;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import java.util.List;

public class Order2BaseAdapter extends BaseAdapter {
    OrderActivity activity;
    private OnClickListener clickListener = new OnClickListener() {
        public void onClick(View view) {
            int intValue;
            MALZEMELER malzemeler;
            switch (view.getId()) {
                case R.id.tvDecrease:
                    intValue = ((Integer) view.getTag()).intValue();
                    malzemeler = (MALZEMELER) Order2BaseAdapter.this.list.get(intValue);
                    malzemeler.MIKTAR--;
                    if (((MALZEMELER) Order2BaseAdapter.this.list.get(intValue)).MIKTAR <= 0) {
                        Order2BaseAdapter.this.activity.addProductFromProductParentList((MALZEMELER) Order2BaseAdapter.this.list.get(intValue));
                        Order2BaseAdapter.this.list.remove(intValue);
                    }
                    Order2BaseAdapter.this.notifyDataSetChanged();
                    return;
                case R.id.tvIncrease:
                    intValue = ((MALZEMELER) Order2BaseAdapter.this.list.get(Integer.parseInt(view.getTag().toString()))).MIKTAR;
                    int i = ((MALZEMELER) Order2BaseAdapter.this.list.get(Integer.parseInt(view.getTag().toString()))).MAKSIMUM_URUN_SAYISI;
                    if (intValue == i) {
                        InfoCallAlertDialogFragment.show(Order2BaseAdapter.this.activity, "Tek siparişte " + i + " adetten fazla ürün satın alamazsınız.");
                        return;
                    }
                    malzemeler = (MALZEMELER) Order2BaseAdapter.this.list.get(Integer.parseInt(view.getTag().toString()));
                    malzemeler.MIKTAR++;
                    Order2BaseAdapter.this.notifyDataSetChanged();
                    return;
                default:
                    return;
            }
        }
    };
    MALZEMELER item;
    List<MALZEMELER> list;
    ViewHolder view;

    public static class ViewHolder {
        public TextView tvDecrease;
        public TextView tvDesc;
        public TextView tvIncrease;
        public TextView tvPrice;
        public TextView tvQuantity;
    }

    public Order2BaseAdapter(OrderActivity orderActivity, List<MALZEMELER> list) {
        this.activity = orderActivity;
        this.list = list;
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
        LayoutInflater layoutInflater = this.activity.getLayoutInflater();
        if (view == null) {
            this.view = new ViewHolder();
            view = layoutInflater.inflate(R.layout.row_order2, null);
            this.view.tvDesc = (TextView) view.findViewById(R.id.tvDesc);
            this.view.tvQuantity = (TextView) view.findViewById(R.id.tvQuantity);
            this.view.tvPrice = (TextView) view.findViewById(R.id.tvPrice);
            this.view.tvDecrease = (TextView) view.findViewById(R.id.tvDecrease);
            this.view.tvIncrease = (TextView) view.findViewById(R.id.tvIncrease);
            this.view.tvIncrease.setOnClickListener(this.clickListener);
            this.view.tvDecrease.setOnClickListener(this.clickListener);
            view.setTag(this.view);
        } else {
            this.view = (ViewHolder) view.getTag();
        }
        this.item = (MALZEMELER) this.list.get(i);
        if (this.item.MALZEME_TANIMI == null || this.item.MALZEME_TANIMI.isEmpty()) {
            this.view.tvDesc.setText("");
        } else {
            this.view.tvDesc.setText("" + this.item.MALZEME_TANIMI);
        }
        if (this.item.FIYAT == null || this.item.FIYAT.isEmpty() || this.item.FIYAT.equals("-1")) {
            this.view.tvPrice.setText("");
        } else {
            Log.d("MNTTAG", "item.price : " + this.item.FIYAT);
            this.view.tvPrice.setText(Tools.fFormat(this.item.FIYAT) + " TL");
        }
        this.view.tvQuantity.setText("" + this.item.MIKTAR);
        this.view.tvDecrease.setTag(Integer.valueOf(i));
        this.view.tvIncrease.setTag(Integer.valueOf(i));
        return view;
    }
}
