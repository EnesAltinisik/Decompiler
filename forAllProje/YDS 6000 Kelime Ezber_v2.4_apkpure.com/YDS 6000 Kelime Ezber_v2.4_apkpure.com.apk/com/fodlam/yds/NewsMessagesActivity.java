package com.fodlam.yds;

import android.os.Bundle;
import android.support.v7.app.e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;

public class NewsMessagesActivity extends e {
    private RecyclerView m;
    private a n;
    private h o;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_news_messages);
        setTitle(getString(R.string.newsentenceusage));
        this.m = (RecyclerView) findViewById(R.id.my_recycler_view);
        this.m.setHasFixedSize(true);
        this.m.setBackgroundResource(R.drawable.backalt);
        this.o = new LinearLayoutManager(this);
        this.m.setLayoutManager(this.o);
        this.n = new com.fodlam.yds.a.e(this);
        this.m.setAdapter(this.n);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m = null;
        this.n = null;
        this.o = null;
    }
}
