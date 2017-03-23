package com.fodlam.yds.a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.b.l;
import android.support.v4.b.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.R;
import com.fodlam.yds.WriteWordActivity;
import com.fodlam.yds.f.f;
import com.fodlam.yds.f.h;
import com.fodlam.yds.utility.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

public class k extends w {
    public ArrayList<a> a;
    public b[] b;
    WriteWordActivity c;

    public static class a implements Serializable {
        public boolean a = false;
        char[] b;
        int c = -1;
        int d = 0;
        h e;

        public a(h hVar) {
            this.e = hVar;
        }
    }

    public static class b extends l implements OnClickListener {
        public a a;
        TextView b;

        private void X() {
            com.fodlam.yds.c.a a = com.fodlam.yds.c.a.a(null);
            f f = a.f();
            if (this.a.d <= this.a.b.length / 2) {
                String c = OxfordApplication.h.c();
                if (this.a.e.l.a(c) == 0) {
                    this.a.e.l.b(c, 1);
                    a.a(this.a.e.l);
                }
                f.d++;
            } else {
                f.e++;
            }
            a.b(f);
            ((WriteWordActivity) i()).j();
        }

        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.a = (a) g().getSerializable("writeWord");
            if (this.a.e.b) {
                ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.advertisementitem, viewGroup, false);
                c.a(h(), (LinearLayout) viewGroup2.findViewById(R.id.advertisement), 400, 400);
                ((TextView) viewGroup2.findViewById(R.id.title_item)).setText(R.string.adds);
                return viewGroup2;
            }
            int i;
            viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.writeworditem, viewGroup, false);
            View view = (TextView) viewGroup2.findViewById(R.id.word);
            if (OxfordApplication.h == com.fodlam.yds.OxfordApplication.a.WRITEWORD) {
                view.setText(this.a.e.k);
            } else {
                view.setText(this.a.e.j);
            }
            view.setTag(this.a.e);
            com.balysv.materialripple.a.a(view).a(Color.parseColor("#BBDEFB")).a(0.3f).b(true).a();
            this.b = (TextView) viewGroup2.findViewById(R.id.answer);
            Button[] buttonArr = new Button[]{(Button) viewGroup2.findViewById(R.id.button1), (Button) viewGroup2.findViewById(R.id.button2), (Button) viewGroup2.findViewById(R.id.button3), (Button) viewGroup2.findViewById(R.id.button4), (Button) viewGroup2.findViewById(R.id.button5), (Button) viewGroup2.findViewById(R.id.button6), (Button) viewGroup2.findViewById(R.id.button7), (Button) viewGroup2.findViewById(R.id.button8), (Button) viewGroup2.findViewById(R.id.button9), (Button) viewGroup2.findViewById(R.id.button10)};
            HashSet hashSet = new HashSet();
            String toLowerCase = this.a.e.h.toLowerCase(Locale.ENGLISH);
            int i2 = 0;
            while (i2 < toLowerCase.length()) {
                if (toLowerCase.charAt(i2) <= 'z' && toLowerCase.charAt(i2) >= 'a') {
                    hashSet.add("" + toLowerCase.charAt(i2));
                }
                i2++;
            }
            Random random = new Random();
            while (hashSet.size() < 10) {
                hashSet.add("" + ((char) (random.nextInt(26) + 97)));
            }
            Object[] toArray = hashSet.toArray();
            for (i = 0; i < 10; i++) {
                buttonArr[i].setText(((String) toArray[i]).toUpperCase(Locale.ENGLISH));
                buttonArr[i].setOnClickListener(this);
            }
            if (!this.a.a) {
                this.a.b = new char[toLowerCase.length()];
                for (i2 = 0; i2 < this.a.b.length; i2++) {
                    this.a.b[i2] = '_';
                }
                i2 = 0;
                while (i2 < toLowerCase.length()) {
                    if (toLowerCase.charAt(i2) > 'z' || toLowerCase.charAt(i2) < 'a') {
                        this.a.b[i2] = toLowerCase.charAt(i2);
                    }
                    i2++;
                }
                for (i = 10; i < toArray.length; i++) {
                    for (int i3 = 0; i3 < toLowerCase.length(); i3++) {
                        if (toLowerCase.charAt(i3) == ((String) toArray[i]).charAt(0)) {
                            this.a.b[i3] = ((String) toArray[i]).charAt(0);
                        }
                    }
                }
                this.a.c = 0;
                for (i2 = 0; i2 < toLowerCase.length(); i2++) {
                    if (this.a.b[i2] == '_') {
                        this.a.c = i2;
                        break;
                    }
                }
                this.a.a = true;
            }
            this.b.setText(new String(this.a.b).toUpperCase(Locale.ENGLISH));
            if (this.a.e.l.a(OxfordApplication.h.c()) == 1) {
                viewGroup2.findViewById(R.id.isdone).setVisibility(0);
                return viewGroup2;
            }
            viewGroup2.findViewById(R.id.isdone).setVisibility(4);
            return viewGroup2;
        }

        public void a() {
            if (!this.a.e.b && this.a.c < this.a.b.length) {
                a aVar = this.a;
                aVar.d++;
                com.fodlam.yds.utility.a.a(h().getApplicationContext()).d();
                this.a.b[this.a.c] = this.a.e.h.charAt(this.a.c);
                aVar = this.a;
                aVar.c++;
                for (int i = this.a.c; i < this.a.e.h.length(); i++) {
                    if (this.a.b[i] == '_') {
                        this.a.c = i;
                        break;
                    }
                }
                this.b.setText(new String(this.a.b).toUpperCase(Locale.ENGLISH));
                this.b.invalidate();
                if (this.a.c >= this.a.b.length) {
                    X();
                }
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            d(true);
        }

        public void onClick(View view) {
            if (!this.a.e.b && this.a.c < this.a.b.length) {
                char charAt = ((Button) view).getText().toString().toLowerCase(Locale.ENGLISH).charAt(0);
                if (this.a.e.h.charAt(this.a.c) == charAt) {
                    com.fodlam.yds.utility.a.a(h()).a();
                    char[] cArr = this.a.b;
                    a aVar = this.a;
                    int i = aVar.c;
                    aVar.c = i + 1;
                    cArr[i] = charAt;
                    for (int i2 = this.a.c; i2 < this.a.b.length; i2++) {
                        this.a.c = i2;
                        if (this.a.b[i2] == '_') {
                            break;
                        }
                        a aVar2 = this.a;
                        aVar2.c++;
                    }
                    this.b.setText(new String(this.a.b).toUpperCase(Locale.ENGLISH));
                    if (this.a.c >= this.a.b.length) {
                        X();
                        return;
                    }
                    return;
                }
                com.fodlam.yds.utility.a.a(h()).b();
            }
        }

        public void s() {
            super.s();
            this.b = null;
            this.a = null;
        }
    }

    public k(WriteWordActivity writeWordActivity, Bundle bundle) {
        super(writeWordActivity.e());
        this.c = writeWordActivity;
        if (bundle != null) {
            this.a = (ArrayList) bundle.getSerializable("writewordlist");
        } else {
            ArrayList f = com.fodlam.yds.c.b.a().b().f();
            Collections.shuffle(f);
            if (OxfordApplication.f) {
                f.add(f.size() / 2, new h());
            }
            this.a = new ArrayList();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                this.a.add(new a((h) it.next()));
            }
        }
        this.b = new b[this.a.size()];
    }

    public l a(int i) {
        if (this.b[i] == null) {
            Bundle bundle = new Bundle();
            this.b[i] = new b();
            bundle.putSerializable("writeWord", (Serializable) this.a.get(i));
            this.b[i].g(bundle);
        }
        return this.b[i];
    }

    public int b() {
        return this.a.size();
    }

    public void b(int i) {
        this.b[i].a();
    }

    public int c() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            i = !aVar.e.b ? aVar.e.l.a(OxfordApplication.h.c()) + i : i;
        }
        return i;
    }
}
