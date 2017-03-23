package com.fodlam.yds.a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.b.l;
import android.support.v4.b.u;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import com.fodlam.yds.R;
import com.fodlam.yds.TestLevelActivity;
import com.fodlam.yds.f.b;

public class g extends u {
    static b a;
    TestLevelActivity b;
    a[] c = new a[((int) Math.ceil((double) (((float) a.d()) / 12.0f)))];

    public static class a extends l {
        CardView[] a;
        int b;

        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.b = g().getInt("position");
            TableRow[] tableRowArr = new TableRow[]{(TableRow) r0.findViewById(R.id.row1), (TableRow) r0.findViewById(R.id.row2), (TableRow) r0.findViewById(R.id.row3), (TableRow) ((ViewGroup) layoutInflater.inflate(R.layout.levelpage, viewGroup, false)).findViewById(R.id.row4)};
            float f = (float) i().getResources().getDisplayMetrics().widthPixels;
            float f2 = i().getResources().getDisplayMetrics().density * 50.0f;
            this.a = new CardView[12];
            int i = 0;
            while (i < 12 && (this.b * 12) + i < g.a.d()) {
                CardView cardView = (CardView) layoutInflater.inflate(R.layout.levelitem, null);
                tableRowArr[i / 3].addView(cardView);
                ((TextView) cardView.findViewById(R.id.txt_item)).setText("" + (((this.b * 12) + i) + 1));
                cardView.getLayoutParams().width = (int) ((f - f2) / 3.0f);
                cardView.getLayoutParams().height = cardView.getLayoutParams().width;
                this.a[i] = cardView;
                com.balysv.materialripple.a.a(cardView.findViewById(R.id.relativeLayoutId)).a(Color.parseColor("#BBDEFB")).a(0.4f).a(true).b(true).a();
                i++;
            }
            a();
            return r0;
        }

        public void a() {
            ImageView[] imageViewArr = new ImageView[3];
            int i = 0;
            while (i < 12 && (this.b * 12) + i < g.a.d()) {
                com.fodlam.yds.f.g a = g.a.a((this.b * 12) + i);
                com.fodlam.yds.f.g a2 = g.a.a(((this.b * 12) + i) - 1);
                if (a.c() && a2 != null && a2.d()) {
                    a.a(false);
                }
                CardView cardView = this.a[i];
                if (cardView != null) {
                    int i2;
                    imageViewArr[0] = (ImageView) cardView.findViewById(R.id.star1);
                    imageViewArr[1] = (ImageView) cardView.findViewById(R.id.star2);
                    imageViewArr[2] = (ImageView) cardView.findViewById(R.id.star3);
                    for (i2 = 0; i2 < 3; i2++) {
                        imageViewArr[i2].getLayoutParams().height = (cardView.getLayoutParams().height * 11) / 60;
                        imageViewArr[i2].getLayoutParams().width = imageViewArr[i2].getLayoutParams().height;
                    }
                    i2 = a.b();
                    for (int i3 = 0; i3 < i2; i3++) {
                        imageViewArr[i3].setAlpha(1.0f);
                        imageViewArr[i3].setImageResource(R.drawable.ic_star_black_24dp);
                    }
                    while (i2 < 3) {
                        imageViewArr[i2].setAlpha(0.5f);
                        imageViewArr[i2].setImageResource(R.drawable.ic_star_48px);
                        i2++;
                    }
                    View findViewById = cardView.findViewById(R.id.relativeLayoutId);
                    findViewById.setTag(a);
                    if (a.c()) {
                        cardView.findViewById(R.id.locked).setVisibility(0);
                        findViewById.setVisibility(4);
                    } else {
                        cardView.findViewById(R.id.locked).setVisibility(4);
                        findViewById.setVisibility(0);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void e(Bundle bundle) {
            super.e(bundle);
        }

        public void i(Bundle bundle) {
            super.i(bundle);
        }

        public void s() {
            super.s();
            this.a = null;
        }
    }

    public g(TestLevelActivity testLevelActivity) {
        super(testLevelActivity.e());
        this.b = testLevelActivity;
        a = com.fodlam.yds.c.b.a().g();
    }

    public l a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        this.c[i] = new a();
        this.c[i].g(bundle);
        return this.c[i];
    }

    public int b() {
        return this.c.length;
    }

    public void c() {
        a = com.fodlam.yds.c.b.a().g();
        if (this.c != null) {
            for (a aVar : this.c) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }
}
