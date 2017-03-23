package com.pinarsu.siparis.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.model.data.DUYURULAR;
import com.pinarsu.siparis.model.data.SERTIFIKALAR;
import com.squareup.picasso.Picasso;
import java.util.List;

public class AnnouncementsAndNewsBaseAdapter extends BaseAdapter {
    private Activity activity;
    private List<DUYURULAR> duyuruList;
    private List<SERTIFIKALAR> sertifikaList;

    public AnnouncementsAndNewsBaseAdapter(Activity activity, List<DUYURULAR> list, List<SERTIFIKALAR> list2) {
        this.activity = activity;
        this.duyuruList = list;
        this.sertifikaList = list2;
    }

    public int getCount() {
        return this.duyuruList.size() + this.sertifikaList.size();
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
        ImageView imageView;
        TextView textView;
        if (i < this.duyuruList.size()) {
            View inflate = layoutInflater.inflate(R.layout.row_announcements_and_news, null);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tvTitle);
            imageView = (ImageView) inflate.findViewById(R.id.imPhoto);
            textView = (TextView) inflate.findViewById(R.id.tvDate);
            TextView textView3 = (TextView) inflate.findViewById(R.id.tvDetail);
            DUYURULAR duyurular = (DUYURULAR) this.duyuruList.get(i);
            if (duyurular.DUYURU_BASLIK.isEmpty()) {
                textView2.setText("");
            } else {
                textView2.setText("" + duyurular.DUYURU_BASLIK);
            }
            if (duyurular.DUYURU_METNI.isEmpty()) {
                textView3.setText("");
            } else {
                textView3.setText("" + duyurular.DUYURU_METNI);
            }
            if (duyurular.DUYURU_TARIHI == null || duyurular.DUYURU_TARIHI.isEmpty()) {
                textView.setText("");
            } else {
                textView.setText(duyurular.DUYURU_TARIHI.replace(":", "."));
            }
            if (duyurular.RESIM_ADRESI == null || duyurular.RESIM_ADRESI.isEmpty()) {
                Picasso.with(viewGroup.getContext()).load((int) R.drawable.no_image).into(imageView);
            } else {
                Picasso.with(viewGroup.getContext()).load(duyurular.RESIM_ADRESI).into(imageView);
            }
            return inflate;
        }
        SERTIFIKALAR sertifikalar = (SERTIFIKALAR) this.sertifikaList.get(i - this.duyuruList.size());
        View inflate2 = layoutInflater.inflate(R.layout.row_certificate, null);
        imageView = (ImageView) inflate2.findViewById(R.id.im);
        textView = (TextView) inflate2.findViewById(R.id.tvTitle);
        if (sertifikalar.SERTIFIKA_ADI == null || sertifikalar.SERTIFIKA_ADI.isEmpty()) {
            textView.setText("");
        } else {
            textView.setText(sertifikalar.SERTIFIKA_ADI);
        }
        if (sertifikalar.SERTIFIKA_ADRESI == null || sertifikalar.SERTIFIKA_ADRESI.isEmpty()) {
            Picasso.with(viewGroup.getContext()).load((int) R.drawable.no_image).into(imageView);
        } else {
            sertifikalar.SERTIFIKA_ADRESI = sertifikalar.SERTIFIKA_ADRESI.replace(" ", "%20");
            Picasso.with(viewGroup.getContext()).load(sertifikalar.SERTIFIKA_ADRESI).into(imageView);
            Log.d("MNTTAG", "item.SERTIFIKA_ADRESI : " + sertifikalar.SERTIFIKA_ADRESI);
        }
        return inflate2;
    }
}
