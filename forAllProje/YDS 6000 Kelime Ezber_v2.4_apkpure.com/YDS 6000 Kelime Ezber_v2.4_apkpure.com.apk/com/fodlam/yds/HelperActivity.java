package com.fodlam.yds;

import android.os.Bundle;
import android.support.v7.app.e;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.afollestad.materialdialogs.f;
import com.afollestad.materialdialogs.h;
import com.fodlam.yds.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HelperActivity extends e {
    a m;
    ExpandableListView n;
    List<String> o;
    HashMap<String, List<a.a>> p;

    private void a(a.a aVar) {
        new f.a(this).a(aVar.a).b(aVar.b).f(R.string.ok).a(h.LIGHT).i(R.color.colorPrimary).d(-12303292).c();
    }

    public HashMap<String, List<a.a>> j() {
        HashMap<String, List<a.a>> hashMap = new HashMap();
        List arrayList = new ArrayList();
        arrayList.add(new a.a(getString(R.string.help1), getString(R.string.helpcontent1)));
        arrayList.add(new a.a(getString(R.string.help2), getString(R.string.helpcontent2)));
        arrayList.add(new a.a(getString(R.string.help3), getString(R.string.helpcontent3)));
        arrayList.add(new a.a(getString(R.string.help4), getString(R.string.helpcontent4)));
        arrayList.add(new a.a(getString(R.string.help5), getString(R.string.helpcontent5)));
        arrayList.add(new a.a(getString(R.string.help51), getString(R.string.helpcontent51)));
        List arrayList2 = new ArrayList();
        arrayList2.add(new a.a(getString(R.string.help60), getString(R.string.helpcontent60)));
        arrayList2.add(new a.a(getString(R.string.help6), getString(R.string.helpcontent6)));
        arrayList2.add(new a.a(getString(R.string.help7), getString(R.string.helpcontent7)));
        arrayList2.add(new a.a(getString(R.string.help8), getString(R.string.helpcontent8)));
        arrayList2.add(new a.a(getString(R.string.help9), getString(R.string.helpcontent9)));
        arrayList2.add(new a.a(getString(R.string.help10), getString(R.string.helpcontent10)));
        List arrayList3 = new ArrayList();
        arrayList3.add(new a.a(getString(R.string.help11), getString(R.string.helpcontent11)));
        arrayList3.add(new a.a(getString(R.string.help12), getString(R.string.helpcontent12)));
        arrayList3.add(new a.a(getString(R.string.help13), getString(R.string.helpcontent13)));
        arrayList3.add(new a.a(getString(R.string.help14), getString(R.string.helpcontent14)));
        arrayList3.add(new a.a(getString(R.string.help15), getString(R.string.helpcontent15)));
        arrayList3.add(new a.a(getString(R.string.help16), getString(R.string.helpcontent16)));
        arrayList3.add(new a.a(getString(R.string.help17), getString(R.string.helpcontent17)));
        hashMap.put(getString(R.string.statistic), arrayList3);
        hashMap.put(getString(R.string.sssquestion), arrayList2);
        hashMap.put(getString(R.string.startapp), arrayList);
        this.o.add(getString(R.string.startapp));
        this.o.add(getString(R.string.sssquestion));
        this.o.add(getString(R.string.statistic));
        return hashMap;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_helper);
        a((Toolbar) findViewById(R.id.toolbar));
        setTitle(getString(R.string.helpandsupport));
        this.n = (ExpandableListView) findViewById(R.id.lvExp);
        this.o = new ArrayList();
        this.p = j();
        this.m = new a(this, this.o, this.p);
        this.n.setAdapter(this.m);
        this.n.setOnChildClickListener(new OnChildClickListener(this) {
            final /* synthetic */ HelperActivity a;

            {
                this.a = r1;
            }

            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                this.a.a((a.a) this.a.m.getChild(i, i2));
                return false;
            }
        });
        this.n.expandGroup(0);
        this.n.expandGroup(1);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }
}
