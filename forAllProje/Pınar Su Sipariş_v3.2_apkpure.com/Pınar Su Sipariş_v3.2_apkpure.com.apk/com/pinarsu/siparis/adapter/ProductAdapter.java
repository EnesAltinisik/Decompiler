package com.pinarsu.siparis.adapter;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.model.data.MALZEMELER;
import com.pinarsu.siparis.view.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class ProductAdapter extends BaseAdapter {
    LayoutInflater inflater;
    private MALZEMELER item;
    private final List<MALZEMELER> list;

    public ProductAdapter(AppCompatActivity appCompatActivity, List<MALZEMELER> list) {
        this.list = list;
        this.inflater = appCompatActivity.getLayoutInflater();
    }

    public void clearAll() {
        this.list.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        if (this.list == null) {
            return 0;
        }
        return this.list.size();
    }

    public Object getItem(int i) {
        return this.list.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.inflater.inflate(R.layout.row_product_with_header, null);
        TextView textView = (TextView) inflate.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tvDetail);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.imPhoto);
        this.item = (MALZEMELER) this.list.get(i);
        if (this.item.MALZEME_TANIMI.isEmpty()) {
            textView.setText("");
        } else {
            textView.setText("" + this.item.MALZEME_TANIMI);
        }
        if (this.item.FIYAT == null || this.item.FIYAT.isEmpty() || this.item.FIYAT.equals("-1")) {
            textView2.setText("");
        } else {
            textView2.setText("" + this.item.FIYAT + " TL");
        }
        if (this.item.RESIM_ADRESI == null || this.item.RESIM_ADRESI.isEmpty()) {
            Picasso.with(viewGroup.getContext()).load((int) R.drawable.circle_white).into(imageView);
        } else {
            Picasso.with(viewGroup.getContext()).load(this.item.RESIM_ADRESI).error((int) R.drawable.circle_white).into(imageView);
        }
        return inflate;
    }
}
