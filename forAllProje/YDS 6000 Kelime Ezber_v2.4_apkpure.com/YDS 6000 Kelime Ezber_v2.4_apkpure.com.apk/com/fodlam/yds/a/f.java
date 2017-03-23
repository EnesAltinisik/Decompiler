package com.fodlam.yds.a;

import android.content.Intent;
import android.support.v7.widget.RecyclerView.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.afollestad.materialdialogs.f.j;
import com.fodlam.yds.FodlaBillingActivity;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.SearchResultsActivity;
import com.fodlam.yds.c.b;
import com.fodlam.yds.f.h;
import com.google.firebase.crash.FirebaseCrash;
import java.util.ArrayList;
import java.util.Iterator;

public class f extends android.support.v7.widget.RecyclerView.a<a> {
    ArrayList<h> a = b.a().c();
    SearchResultsActivity b;

    public static class a extends w {
        public View n;

        public a(View view) {
            super(view);
            this.n = view;
        }
    }

    public f(SearchResultsActivity searchResultsActivity) {
        this.b = searchResultsActivity;
    }

    private void a(h hVar) {
        try {
            b.a().a(hVar, false);
            Toast.makeText(this.b, hVar.h + this.b.getString(R.string.addtofavorite), 0).show();
        } catch (Exception e) {
            FirebaseCrash.a(e.getMessage());
        }
    }

    private void a(h hVar, ImageButton imageButton) {
        if (hVar.a()) {
            imageButton.setImageResource(R.drawable.ic_star_black_24dp);
            imageButton.setAlpha(1.0f);
            return;
        }
        imageButton.setImageResource(R.drawable.ic_star_48px);
        imageButton.setAlpha(0.6f);
    }

    private void b() {
        new com.afollestad.materialdialogs.f.a(this.b).a((int) R.string.alertfavoritetitle).c((int) R.string.alertcategorycontent2).f(R.string.ok).g(R.string.gotomarket).a(com.afollestad.materialdialogs.h.LIGHT).b((int) R.drawable.ic_alert).i(R.color.colorAccent).d(-12303292).b(new j(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
                this.a.b.startActivity(new Intent(this.a.b, FodlaBillingActivity.class));
                fVar.dismiss();
            }
        }).c();
    }

    private void b(h hVar) {
        try {
            b.a().a(hVar);
            Toast.makeText(this.b, hVar.h + this.b.getString(R.string.removedfromfavorite), 0).show();
        } catch (Exception e) {
            FirebaseCrash.a(e.getMessage());
        }
    }

    private void c(h hVar) {
        new com.afollestad.materialdialogs.f.a(this.b).a((int) R.string.examplesentence).b(hVar.c()).f(R.string.ok).a(com.afollestad.materialdialogs.h.LIGHT).i(R.color.colorPrimary).d(-12303292).c();
    }

    public int a() {
        return this.a.size();
    }

    public a a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitemforallwords, viewGroup, false);
        inflate.findViewById(R.id.img_info).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                h hVar = (h) view.getTag();
                b.a().c(hVar.d);
                this.a.c(hVar);
            }
        });
        inflate.findViewById(R.id.img_microphone).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                com.fodlam.yds.utility.b.a(this.a.b.getApplicationContext()).b(((h) view.getTag()).h);
            }
        });
        inflate.findViewById(R.id.img_favourite).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                h hVar = (h) view.getTag();
                b.a().c(hVar.d);
                if (OxfordApplication.b || h.a < 30) {
                    if (hVar.a()) {
                        this.a.b(hVar);
                    } else {
                        this.a.a(hVar);
                    }
                    this.a.e();
                } else if (hVar.a()) {
                    this.a.b(hVar);
                    this.a.e();
                } else {
                    this.a.b();
                }
            }
        });
        return new a(inflate);
    }

    public ArrayList<j> a(boolean z, String str) {
        ArrayList<j> arrayList = new ArrayList();
        Iterator it;
        h hVar;
        if (z) {
            it = this.a.iterator();
            while (it.hasNext()) {
                hVar = (h) it.next();
                if (hVar.h.startsWith(str)) {
                    arrayList.add(new j(hVar.h));
                }
            }
        } else {
            it = this.a.iterator();
            while (it.hasNext()) {
                hVar = (h) it.next();
                if (hVar.k.startsWith(str)) {
                    arrayList.add(new j(hVar.k));
                }
            }
        }
        return arrayList;
    }

    public void a(a aVar, int i) {
        h hVar = (h) this.a.get(i);
        aVar.n.findViewById(R.id.img_favourite).setTag(hVar);
        aVar.n.findViewById(R.id.img_microphone).setTag(hVar);
        aVar.n.findViewById(R.id.img_info).setTag(hVar);
        ((TextView) aVar.n.findViewById(R.id.title_item)).setText(hVar.h);
        ((TextView) aVar.n.findViewById(R.id.type_item)).setText("(" + hVar.i + ")");
        ((TextView) aVar.n.findViewById(R.id.txt_item)).setText(hVar.k);
        a(hVar, (ImageButton) aVar.n.findViewById(R.id.img_favourite));
    }

    public int b(boolean z, String str) {
        int i;
        if (z) {
            for (i = 0; i < this.a.size(); i++) {
                if (((h) this.a.get(i)).h.equals(str)) {
                    return i;
                }
            }
        } else {
            for (i = 0; i < this.a.size(); i++) {
                if (((h) this.a.get(i)).k.equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public /* synthetic */ w b(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }
}
