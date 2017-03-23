package com.pinarsu.siparis.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.model.data.KAMPANYALAR;
import com.squareup.picasso.Picasso;
import java.util.List;

public class CampaignBaseAdapter extends BaseAdapter {
    private Activity activity;
    private List<KAMPANYALAR> list;

    public static class ViewHolder {
        public ImageView im;
        public TextView tvAddress;
        public TextView tvBarTitle;
        public TextView tvDetail;
    }

    public CampaignBaseAdapter(Activity activity, List<KAMPANYALAR> list) {
        this.activity = activity;
        this.list = list;
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

    @SuppressLint({"InflateParams", "DefaultLocale"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        LayoutInflater layoutInflater = this.activity.getLayoutInflater();
        if (view == null) {
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.row_campaigns, null);
            viewHolder.tvBarTitle = (TextView) view.findViewById(R.id.tvBarTitle);
            viewHolder.tvDetail = (TextView) view.findViewById(R.id.tvDetail);
            viewHolder.tvAddress = (TextView) view.findViewById(R.id.tvAddress);
            viewHolder.im = (ImageView) view.findViewById(R.id.im);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        KAMPANYALAR kampanyalar = (KAMPANYALAR) this.list.get(i);
        if (kampanyalar.KAMPANYA_ADI == null || kampanyalar.KAMPANYA_ADI.isEmpty()) {
            viewHolder.tvBarTitle.setText("");
        } else {
            viewHolder.tvBarTitle.setText("" + kampanyalar.KAMPANYA_ADI);
        }
        if (kampanyalar.KAMPANYA_TANIMI == null || kampanyalar.KAMPANYA_TANIMI.isEmpty()) {
            viewHolder.tvDetail.setText("");
            viewHolder.tvDetail.setVisibility(8);
        } else {
            viewHolder.tvDetail.setText("" + kampanyalar.KAMPANYA_TANIMI);
        }
        if (kampanyalar.GECERLI_ADRES == null || kampanyalar.GECERLI_ADRES.isEmpty()) {
            viewHolder.tvAddress.setText("");
        } else {
            viewHolder.tvAddress.setText("" + kampanyalar.GECERLI_ADRES);
        }
        if (kampanyalar.RESIM_ADRESI == null || kampanyalar.RESIM_ADRESI.isEmpty()) {
            Picasso.with(viewGroup.getContext()).load((int) R.drawable.circle_white).into(viewHolder.im);
        } else {
            Picasso.with(viewGroup.getContext()).load(kampanyalar.RESIM_ADRESI).error((int) R.drawable.circle_white).into(viewHolder.im);
        }
        return view;
    }
}
