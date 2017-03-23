package com.fodlam.yds;

import android.os.Bundle;
import android.support.v7.app.e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.Toolbar;
import com.fodlam.yds.a.i;
import com.fodlam.yds.c.b;

public class WordListActivity extends e {
    private RecyclerView m;
    private a n;
    private h o;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_word_list);
        a((Toolbar) findViewById(R.id.toolbar));
        setTitle(b.a().g().a + ": " + getString(R.string.mylearnedwords));
        this.m = (RecyclerView) findViewById(R.id.my_recycler_view);
        this.m.setHasFixedSize(true);
        this.m.setBackgroundResource(R.drawable.backalt);
        this.o = new LinearLayoutManager(this);
        this.m.setLayoutManager(this.o);
        this.n = new i(this);
        this.m.setAdapter(this.n);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m = null;
        this.n = null;
        this.o = null;
    }
}
