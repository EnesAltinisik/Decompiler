package com.fodlam.yds.a;

import android.preference.PreferenceManager;
import android.support.v7.widget.RecyclerView.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fodlam.yds.NewsMessagesActivity;
import com.fodlam.yds.R;
import com.fodlam.yds.c.b;
import com.fodlam.yds.f.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class e extends android.support.v7.widget.RecyclerView.a<a> {
    ArrayList<h> a = b.a().k();
    NewsMessagesActivity b;

    public static class a extends w {
        public View n;

        public a(View view) {
            super(view);
            this.n = view;
        }
    }

    public e(NewsMessagesActivity newsMessagesActivity) {
        this.b = newsMessagesActivity;
        Set stringSet = PreferenceManager.getDefaultSharedPreferences(newsMessagesActivity).getStringSet("news_messages", new HashSet());
        PreferenceManager.getDefaultSharedPreferences(newsMessagesActivity).edit().putStringSet("news_messages", new HashSet()).commit();
        b.a().a(stringSet);
        if (this.a.isEmpty()) {
            this.a.add(null);
        }
    }

    private void a(h hVar) {
        new com.afollestad.materialdialogs.f.a(this.b).a((int) R.string.examplesentence).b(hVar.c()).f(R.string.ok).a(com.afollestad.materialdialogs.h.LIGHT).i(R.color.colorPrimary).d(-12303292).c();
    }

    public int a() {
        return this.a.size();
    }

    public a a(ViewGroup viewGroup, int i) {
        View view;
        if (this.a.get(0) == null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_empty, viewGroup, false);
            ((TextView) inflate.findViewById(R.id.empty_text)).setText(R.string.nonewwordadded);
            view = inflate;
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listviewitem2, viewGroup, false);
            view.findViewById(R.id.img_delete).setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ e a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.a((h) ((View) view.getParent()).getTag());
                }
            });
            view.findViewById(R.id.img_microphone).setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ e a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    com.fodlam.yds.utility.b.a(this.a.b.getApplicationContext()).b(((h) ((View) view.getParent()).getTag()).h);
                }
            });
        }
        return new a(view);
    }

    public void a(a aVar, int i) {
        if (this.a.get(0) == null) {
            ((TextView) aVar.n.findViewById(R.id.empty_text)).setText(R.string.nonewwordadded);
            return;
        }
        aVar.n.findViewById(R.id.relativeLayoutId).setTag(this.a.get(i));
        ((TextView) aVar.n.findViewById(R.id.title_item)).setText(((h) this.a.get(i)).h);
        ((TextView) aVar.n.findViewById(R.id.txt_item)).setText(((h) this.a.get(i)).k);
        ((TextView) aVar.n.findViewById(R.id.type_item)).setText("(" + ((h) this.a.get(i)).i + ")");
    }

    public /* synthetic */ w b(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }
}
